package rc;

import java.util.ArrayList;
import java.util.Arrays;
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

    // Conversao dos tipos primitivos da linguagem fonte para a linguagem objeto
    public String converterTipoPrimitivo(String tipo) {
        String saida = "";

        switch(tipo) {
            case "integer":
                saida = "int";
                break;
            case "floating":
                saida = "double";
                break;
            case "literal":
                saida = "String";
                break;
            case "logical":
                saida = "boolean";
                break;
            // TODO: lista
        }

        return saida;
    }

    // Separacao do operador e dos argumentos de uma instrucao em uma lista
    // Entrada: chamada da instrucao, com membros (operador e argumentos) separados por espaco
    private List<String> separarInstrucao(String instrucao) {
        List<String> saida = new ArrayList<>();

        // Retorna caso a instrucao seja nula
        if (instrucao == null) { return saida; }

        // Espacos em strings nao devem ser considersgados
        // Variavel de estado que determina se o leitor esta dentro de uma string
        boolean dentroString = false;
        // Variavel de estado que determina o nivel atual de parenteses
        int nivelParenteses = 0;
        // Variavel que determina o inicio da string sendo escrita
        int inicio = 0;
        // Variavel que indica o fim da string
        boolean fimString = false;

        for (int i = 0; i < instrucao.length(); i++) {
            char atual = instrucao.charAt(i);

            // Altera a variavel de estado para cada delimitador de string encontrado
            if (atual == '\"') { dentroString = !dentroString; }
            // Incrementa nivel de parenteses para cada abertura e decrementa para cada fechamento
            else if (atual == '(') { nivelParenteses += 1; }
            else if (atual == ')') { nivelParenteses -= 1; }


            // Verifica se o final da string foi atingido
            fimString = (i == (instrucao.length() - 1));

            // Escreve a string atual na lista, caso encontre espaco ou o fim da instrucao
            if (atual == ' ' && !dentroString && nivelParenteses == 0) {
                saida.add(instrucao.substring(inicio, i));
                inicio = i + 1;
            }
            else if (fimString) { saida.add(instrucao.substring(inicio)); }
        }

        return saida;
    }

    // Conversao de operacao para chamada de metodo ou operacao basica
    // Operador e argumentos devem estar separados por espaco
    private String converterOperacao(String operacao, String argumentoAdicional) {
        StringBuilder saida = new StringBuilder();

        // Lista contendo operador e argumentos da operacao, separados por espaco
        List<String> args = new ArrayList<>(separarInstrucao(operacao));

        // Extracao do operador a partir da lista
        String operador = args.get(0);

        // Adicao do argumento adicional ao metodo, caso houver
        if (!argumentoAdicional.equals("")) {
            args.set(0, argumentoAdicional);
        }
        // Remocao do operador da lista de argumentos
        else { args.remove(0); }

        // Operadores binarios basicos, reescrever in-ordem
        if ((operador.equals("+") || operador.equals("-") || operador.equals("*") ||
                operador.equals("/") || operador.equals("%") || operador.equals("&&") ||
                operador.equals("||")) && args.size() == 2) {
            saida.append("(" + args.get(0) + " " + operador + " " + args.get(1) + ")");
        }

        // Operadores unarios basicos
        else if ((operador.equals("-") || operador.equals("!")) && args.size() == 1) {
            saida.append("(" + operador + args.get(0) + ")");
        }

        // Escrita da operacao como chamada de funcao
        else {
            saida.append(operador + "(");
            boolean removerVirgula = args.size() != 0;

            // Escrita dos argumentos da operacao na chamada
            for (String arg : args) { saida.append(arg + ", "); }
            // Remocao da virgula do ultimo parametro para fechamento dos parenteses
            if (removerVirgula) { saida.setLength(saida.length() - 2); }
            saida.append(")");
        }

        return saida.toString();
    }

    // Conversao de comando para chamada de metodo
    // Nome do comando e argumentos devem estar separados por espaco
    private String converterComando(String comando, String argumentoAdicional) {
        StringBuilder saida = new StringBuilder();

        // Lista contendo nome e argumentos da operacao, separados por espaco
        List<String> args = new ArrayList<>(separarInstrucao(comando));

        // Extracao do nome do comando a partir da lista
        String nomeComando = args.get(0);

        // Adicao do argumento adicional ao metodo, caso houver
        if (!argumentoAdicional.equals("")) {
            args.set(0, argumentoAdicional);
        }
        // Remocao do nome do comando da lista de argumentos
        else { args.remove(0); }

        if(nomeComando.equals("assign")) {
            saida.append(args.get(1) + " = " + args.get(0));
        }
        else if (nomeComando.equals("out")) {
            saida.append("return " + args.get(0));
        }
        else {
            if (nomeComando.equals("print")) { nomeComando = "out.println"; }
            // Escrita do comando como chamada de funcao
            saida.append(nomeComando + "(");
            boolean removerVirgula = args.size() != 0;

            // Escrita dos argumentos do comando na chamada
            for (String arg : args) {
                saida.append(arg + ", ");
            }
            // Remocao da virgula do ultimo parametro para fechamento dos parenteses
            if (removerVirgula) {
                saida.setLength(saida.length() - 2);
            }
            saida.append(")");
        }

        return saida.toString();
    }

    // Escrita de uma linha no codigo, dada a ordem de identacao
    private void adicionarLinha(String linha, int indent) {
        StringBuilder builder = new StringBuilder();

        if (!this.codigo.equals("")) { builder.append("\n"); }
        for (int i = 0; i < indent; i++) { builder.append("\t"); }
        builder.append(linha);
        this.codigo = this.codigo + builder.toString();
    }

    // Escrita de um conjunto de linhas no codigo, dado a ordem de identacao
    private void adicionarLinhas(List<String> linhas, int indent) {
        for (String linha : linhas) {
            adicionarLinha(linha, indent);
        }
    }

    // Escrita de um metodo, dada a ordem de identacao
    private void adicionarMetodo(String nome, Codigo.Metodo metodo, int ident) {
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
    private void gerarCodigoRobo(CodigoRobo codigoRobo) {
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

        for (rcParser.DefopContext contextoDefop : ctx.defop()) { visitDefop(contextoDefop); }
        for (rcParser.DefcomContext contextoDefcom : ctx.defcom()) { visitDefcom(contextoDefcom); }

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

    @Override
    public String visitDefop(rcParser.DefopContext ctx) {
        String nomeOperacao = ctx.ID_OPERADOR().getText();
        String tipoRetorno = this.converterTipoPrimitivo(ctx.TYPE().getText());

        VisitorsAuxiliares visitorsAuxiliares = new VisitorsAuxiliares();
        ArrayList<Map.Entry<String, String>> parametros = new ArrayList<>();
        ArrayList<Map.Entry<String, String>> instrucoes = new ArrayList<>();

        if (ctx.args() != null) { parametros = visitorsAuxiliares.visitArgs(ctx.args()); }
        if (ctx.retorno() != null) { instrucoes = visitorsAuxiliares.visitRetorno(ctx.retorno()); }

        // Determinacao das linhas a partir das instrucoes obtidas
        ArrayList<String> linhas = new ArrayList<>();
        for (Map.Entry<String, String> instrucao : instrucoes) { linhas.add(instrucao.getValue() + ";"); }

        this.codigoRobo.addOperacao(nomeOperacao, parametros, tipoRetorno, linhas);

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

        @Override
        public ArrayList<Map.Entry<String, String>> visitRetorno(rcParser.RetornoContext ctx) {
            // Armazenamento do retorno da operacao em linhas
            ArrayList<Map.Entry<String, String>> retorno = new ArrayList<>();

            // Casos mais basicos: armazena-se o retorno em apenas uma linha
            String instrucao = "";
            if (ctx.parametro() != null) {
                instrucao = "return " + GeradorCodigo.this.visitParametro(ctx.parametro());
            }
            else {
                instrucao = "return " + GeradorCodigo.this.visitComposicao_seta(ctx.composicao_seta());
            }
            retorno.add(new java.util.AbstractMap.SimpleEntry<>("instrucao", instrucao));

            return retorno;
        }
    }

    // ==========================================================================================================

    @Override
    public String visitInstrucao(rcParser.InstrucaoContext ctx) {
        String saida = "";

        if (ctx.declaracao() != null) { saida = visitDeclaracao(ctx.declaracao()); }
        else if (ctx.composicao() != null) { saida = visitComposicao(ctx.composicao()); }

        return saida;
    }

    @Override
    public String visitArg(rcParser.ArgContext ctx) {
        String saida = converterTipoPrimitivo(ctx.TYPE().getText());

        saida += " " + ctx.ID().getText();

        return saida;
    }

    @Override
    public String visitDeclaracao(rcParser.DeclaracaoContext ctx) {
        String saida;

        saida = converterTipoPrimitivo(ctx.TYPE().getText());
        saida += " " + ctx.ID().getText();

        return saida;
    }

    @Override
    public String visitComposicao(rcParser.ComposicaoContext ctx) {
        // Caso mais basico: chamada direta para um comando com parametros
        // TODO: composicao de seta para o comando
        String saida;

        String argumento = "";
        if (ctx.composicao_seta() != null) {
            argumento = visitComposicao_seta(ctx.composicao_seta());
        }
        saida = converterComando(visitComando(ctx.comando()), argumento);

        return saida;
    }

    @Override
    public String visitComando(rcParser.ComandoContext ctx) {
        StringBuilder saida = new StringBuilder();

        String nomeMetodo = (ctx.ID_COMANDO() != null) ? ctx.ID_COMANDO().getText() :
                                                         ctx.ID_COMANDO_RESERVADO().getText();

        nomeMetodo = Character.toLowerCase(nomeMetodo.charAt(0)) + nomeMetodo.substring(1);

        saida.append(nomeMetodo);
        for (rcParser.ParametroContext contextoParametro : ctx.parametro()) {
            saida.append(" " + visitParametro(contextoParametro));
        }

        return saida.toString();
    }

    @Override
    public String visitComposicao_seta(rcParser.Composicao_setaContext ctx) {
        return visitComposicao_seta_argumento(ctx.composicao_seta_argumento());
    }

    @Override
    public String visitComposicao_seta_argumento(rcParser.Composicao_seta_argumentoContext ctx) {
        String saida = "";
        String argumento;

        // Escrita da operacao inicial
        if (ctx.op_ini().valor() != null) { argumento = visitOp_ini(ctx.op_ini()); }
        else { argumento = this.converterOperacao(visitOp_ini(ctx.op_ini()), ""); }

        // Escrita das operacoes restantes
        // Passa-se a operacao do lado esquerdo da seta como argumento para a proxima
        StringBuilder operacao;
        for (rcParser.OpContext contextoOp : ctx.op()) {
            // Realocacao da operacao para a operacao nova
            String op = visitOp(contextoOp);

            // Conversao da operacao para ser passada como argumento para a proxima
            argumento = this.converterOperacao(op, argumento);
        }

        saida = argumento;
        return saida;
    }

    @Override
    public String visitParametro(rcParser.ParametroContext ctx) {
        // TODO: composicao_seta_argumento
        String saida = "";

        if (ctx.composicao_seta_argumento() != null) {
            saida = visitComposicao_seta_argumento(ctx.composicao_seta_argumento());
        }
        if (ctx.valor() != null) { saida = visitValor(ctx.valor()); }

        return saida;

    }

    @Override
    public String visitOp_ini(rcParser.Op_iniContext ctx) {
        String saida = "";

        if (ctx.valor() != null) { saida = visitValor(ctx.valor()); }
        else { saida = visitOp(ctx.op()); }

        return saida;
    }

    @Override
    public String visitOp(rcParser.OpContext ctx) {
        StringBuilder saida = new StringBuilder();

        if (ctx.if_statement() == null) {
            // Escrita do nome do operador
            if (ctx.ID_OPERADOR() != null) { saida.append(ctx.ID_OPERADOR().getText()); }

            // Escrita do nome do operador reservado
            else if (ctx.ID_OP_RESERVADO() != null) { saida.append(ctx.ID_OP_RESERVADO().getText()); }
            if (saida.toString().equals("mod")) { saida = new StringBuilder("%"); }
            else if (saida.toString().equals("sqrt")) { saida = new StringBuilder("Math.sqrt"); }
            else if (saida.toString().equals("pow")) { saida = new StringBuilder("Math.pow"); }
            else if (saida.toString().equals("and")) { saida = new StringBuilder("&&"); }
            else if (saida.toString().equals("or")) { saida = new StringBuilder("||"); }
            else if (saida.toString().equals("not")) { saida = new StringBuilder("!"); }

            // Escrita dos argumentos da operacao
            for (rcParser.ParametroContext contextoParametro : ctx.parametro()) {
                saida.append(" " + visitParametro(contextoParametro));
            }
        }

        return saida.toString();
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