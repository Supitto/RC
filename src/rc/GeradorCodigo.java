package rc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeradorCodigo extends rcBaseVisitor<String> {

    // Especificacao dos codigos de jogo e de robo
    // TODO: Codigo de jogo
    private CodigoRobo codigoRobo;

    // Codigo gerado pelos visitors
    public String codigo = "";

    // Metodos auxiliares
    // ==========================================================================================================

    // Escrita de uma linha no codigo, dada a ordem de identacao
    public void adicionarLinha(String linha, int indent) {
        StringBuilder builder = new StringBuilder();

        if (!this.codigo.equals("")) { builder.append("\n"); }
        for (int i = 0; i < indent; i++) { builder.append("\t"); }
        builder.append(linha);
        this.codigo = this.codigo + builder.toString();
    }

    // Escrita de um conjunto de linhas no codigo, dado a ordem de identacao
    public void adicionarLinhas(List<String> linhas, int indent) {
        for (String linha : linhas) {
            adicionarLinha(linha, indent);
        }
    }

    // Escrita de um metodo, dada a ordem de identacao
    public void adicionarMetodo(String nome, Codigo.Metodo metodo, int ident) {
        StringBuilder linhaDeclaracao = new StringBuilder();
        linhaDeclaracao.append("public " + metodo.getTipoRetorno() + " " + nome + "(");

        boolean removerVirgula = metodo.getParametros().size() != 0;
        // Parametros do metodo
        for (Map.Entry<String, String> parametro : metodo.getParametros()) {
            linhaDeclaracao.append(parametro.getValue() + " " + parametro.getKey() + ", ");
        }
        // Remocao da ultima virgula para fechamento dos parenteses
        if (removerVirgula) { linhaDeclaracao.setLength(linhaDeclaracao.length() - 2); }
        linhaDeclaracao.append(") {");

        // Escrita do metodo, com a identacao da classe
        adicionarLinha(linhaDeclaracao.toString(), ident);
        adicionarLinhas(metodo.getLinhas(), ident + 1);
        adicionarLinha("}", ident);
        this.codigo += "\n";
    }

    // Geracao do codigo do robo, dado a especificacao do codigo
    public void gerarCodigoRobo(CodigoRobo codigoRobo) {
        // Geracao dos imports
        adicionarLinhas(codigoRobo.getImports(), 0);
        this.codigo += "\n";

        // Declaracao da classe do robo
        adicionarLinha("public class " + codigoRobo.getNome() + " extends Robot {", 0);
        this.codigo += "\n";

        // Declaracao dos metodos adicionais
        for (Map.Entry<String, Codigo.Metodo> metodo : codigoRobo.getMetodos()) {
            adicionarMetodo(metodo.getKey(), metodo.getValue(), 1);
        }

        // Declaracao dos metodos init, loop e run
        adicionarMetodo("init", codigoRobo.getMetodoInit(), 1);
        adicionarMetodo("loop", codigoRobo.getMetodoLoop(), 1);
        adicionarMetodo("run", codigoRobo.getMetodoRun(), 1);

        // Fim da declaracao da classe do robo
        adicionarLinha("}", 0);
    }

    // ==========================================================================================================

    // Sobrecarga dos visitors
    // ==========================================================================================================

    @Override
    public String visitPrograma(rcParser.ProgramaContext ctx) {
        if (ctx.decl_robo() != null) { visitDecl_robo(ctx.decl_robo()); }
        return codigo;
    }

    @Override
    public String visitDecl_robo(rcParser.Decl_roboContext ctx) {
        this.codigoRobo = new CodigoRobo(ctx.ID().getText());

        for (rcParser.DefcomContext contextoDefcom : ctx.defcom()) { visitDefcom(contextoDefcom); }
        // TODO: defop

        this.gerarCodigoRobo(this.codigoRobo);
        return null;
    }

    @Override
    public String visitDefcom(rcParser.DefcomContext ctx) {
        String nomeComando = ctx.ID_COMANDO().getText();

        // Obtencao dos parametros e dos parametros e das instrucoes do comando
        VisitorsAuxiliares visitorsAuxiliares = new VisitorsAuxiliares();
        ArrayList<Map.Entry<String, String>> parametros = new ArrayList<>();
        ArrayList<Map.Entry<String, String>> instrucoes = new ArrayList<>();

        if (ctx.args() != null) { parametros = visitorsAuxiliares.visitArgs(ctx.args()); }
        if (ctx.corpo() != null) { instrucoes = visitorsAuxiliares.visitCorpo(ctx.corpo()); }

        // Determinacao das linhas a partir das instrucoes obtidas
        ArrayList<String> linhas = new ArrayList<>();
        for (Map.Entry<String, String> instrucao : instrucoes) { linhas.add(instrucao.getValue() + ";"); }

        // Nome do metodo com primeira letra minuscula
        nomeComando = Character.toLowerCase(nomeComando.charAt(0)) + nomeComando.substring(1);

        // Criacao do metodo para o comando no codigo do robo
        if (!nomeComando.equals("init") && !nomeComando.equals("loop") && !nomeComando.equals("run")) {
            this.codigoRobo.addComando(nomeComando, parametros, linhas);
        }
        // Sobrescrita do metodo init
        else if (nomeComando.equals("init")) { this.codigoRobo.setMetodoInit(linhas); }
        // Sobrescrita do metodo loop
        else if (nomeComando.equals("loop")) { this.codigoRobo.setMetodoLoop(linhas); }

        return null;
    }

    // Classe interna contendo visitors auxiliares que retornam tipos diferentes de String
    // ==========================================================================================================
    private class VisitorsAuxiliares extends rcBaseVisitor<ArrayList<Map.Entry<String, String>>> {
        @Override
        public ArrayList<Map.Entry<String, String>> visitArgs(rcParser.ArgsContext ctx) {

            ArrayList<Map.Entry<String, String>> argumentos = new ArrayList<>();
            String arg;
            String nomeArg;
            String tipoArg;

            // Escrita dos argumentos na lista
            for (rcParser.ArgContext contextoArg : ctx.arg()) {
                arg = GeradorCodigo.this.visit(contextoArg);
                tipoArg = arg.split(" ")[0];
                nomeArg = arg.split(" ")[1];
                argumentos.add(new java.util.AbstractMap.SimpleEntry<>(nomeArg, tipoArg));
            }

            return argumentos;
        }

        @Override
        public ArrayList<Map.Entry<String, String>> visitCorpo(rcParser.CorpoContext ctx) {
            // Armazenamento das instrucoes contidas no corpo em linhas
            ArrayList<Map.Entry<String, String>> instrucoes = new ArrayList<>();

            for (rcParser.InstrucaoContext contextoInstrucao : ctx.instrucao()) {
                String instrucao = GeradorCodigo.this.visitInstrucao(contextoInstrucao);
                instrucoes.add(new java.util.AbstractMap.SimpleEntry<>("instrucao", instrucao));
            }

            return instrucoes;
        }
    }

    // ==========================================================================================================

    @Override
    public String visitInstrucao(rcParser.InstrucaoContext ctx) {
        String saida = "";

        if (ctx.composicao() != null) { saida = visitComposicao(ctx.composicao()); }

        return saida;
    }

    @Override
    public String visitArg(rcParser.ArgContext ctx) {
        String saida = "";

        switch (ctx.TYPE().toString()) {
            // 'integer'| 'literal'| 'floating'| 'logical'
            // TODO: lista
            case "integer":
                saida = "int";
                break;
            case "literal":
                saida = "String";
                break;
            case "floating":
                saida = "double";
                break;
            case "logical":
                saida = "boolean";
                break;
        }
        saida += " " + ctx.ID().getText();

        return saida;
    }

    @Override
    public String visitComposicao(rcParser.ComposicaoContext ctx) {
        // Caso mais basico: chamada direta para um comando com parametros
        // TODO: composicao de seta para o comando
        String saida = "";

        if (ctx.comando() != null) { saida = visitComando(ctx.comando()); }

        return saida;
    }

    @Override
    public String visitComando(rcParser.ComandoContext ctx) {
        StringBuilder saida = new StringBuilder();

        // Caso mais basico: Chamada direta para um comando com parametros
        // TODO: comando contendo composicao_seta_argumento
        String nomeMetodo = (ctx.ID_COMANDO() != null) ? ctx.ID_COMANDO().getText() :
                                                         ctx.ID_COMANDO_RESERVADO().getText();
        // Escrita do nome do metodo comecando com letra minuscula
        nomeMetodo = Character.toLowerCase(nomeMetodo.charAt(0)) + nomeMetodo.substring(1);

        // Comando de atribuicao
        if (nomeMetodo.equals("assign")) {
            // Escreve a atribuicao
            saida.append(visitParametro(ctx.parametro(1)) + " = " + visitParametro(ctx.parametro(0)));
        }
        // Comando de retorno
        else if (nomeMetodo.equals("out")) {
            saida.append("return " + visitParametro(ctx.parametro(0)));
        }
        // Comandos parametrizados
        else {
            // Comando print
            if (nomeMetodo.equals("print")) { nomeMetodo = "out.println"; }

            saida.append(nomeMetodo);

            saida.append("(");
            boolean removerVirgula = (ctx.parametro().size() != 0);
            // Escrita dos parametros separados por virgula
            for (rcParser.ParametroContext contextoParametro : ctx.parametro()) {
                saida.append(visitParametro(contextoParametro) + ", ");
            }
            // Remocao da virgula do ultimo parametro para fechamento dos parenteses
            if (removerVirgula) {
                saida.setLength(saida.length() - 2);
            }
            saida.append(")");
        }

        return saida.toString();
    }

    @Override
    public String visitParametro(rcParser.ParametroContext ctx) {
        // TODO: composicao_seta_argumento
        String saida = "";

        if (ctx.valor() != null) { saida = visitValor(ctx.valor()); }

        return saida;

    }

    @Override
    public String visitValor(rcParser.ValorContext ctx) {
        String saida = "";

        // Escrita do valor da saida
        if (ctx.NUMERO() != null) { saida = ctx.NUMERO().getText(); }
        else if (ctx.LITERAL() != null) { saida =  ctx.LITERAL().getText(); }
        else if (ctx.LOGICO() != null) { saida = ctx.LOGICO().getText(); }
        else if (ctx.ID() != null) { saida =  ctx.ID().getText(); }

        return saida;
    }

    // ==========================================================================================================

}
