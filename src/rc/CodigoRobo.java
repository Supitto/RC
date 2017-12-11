package rc;

import java.util.*;

public class CodigoRobo extends Codigo {

    // Nome do robo
    private String nome;
    // Bibliotecas importadas
    private List<String> imports;

    // Metodo run, executado apos o carregamento do robo
    private Metodo metodoRun;

    // Metodos init e loop executados dentro do metodo run
    private Metodo metodoInit;
    private Metodo metodoLoop;

    // Nomes das filas intermediarias
    private String nomeFilaInt;
    private String nomeFilaDouble;
    private String nomeFilaBoolean;
    private String nomeFilaString;

    // Outros metodos definidos pelo programa
    private List<Map.Entry<String, Metodo>> metodos;

    // Metodos getters e setters
    // ==========================================================================================================
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<String> getImports() { return this.imports; }
    public void setImports(List<String> imports) { this.imports = imports; }

    // Metodo run imutavel
    public Metodo getMetodoRun() { return this.metodoRun; }

    public Metodo getMetodoInit() { return this.metodoInit; }
    public void setMetodoInitLinhas(List<String> linhas) { this.metodoInit.setLinhas(linhas); }
    public void setMetodoInitFilas(List<String> tiposFila) { addFilas(this.metodoInit, tiposFila); }

    public Metodo getMetodoLoop() { return this.metodoLoop; }
    public void setMetodoLoopLinhas(List<String> linhas) { this.metodoLoop.setLinhas(linhas); }
    public void setMetodoLoopFilas(List<String> tiposFila) { addFilas(this.metodoLoop, tiposFila); }

    public List<Map.Entry<String, Metodo>> getMetodos() { return this.metodos; }
    public void setMetodos(List<Map.Entry<String, Metodo>> metodos) { this.metodos = metodos; }

    // Nomes das filas
    public String getNomeFilaInt() { return this.nomeFilaInt; }
    public String getNomeFilaDouble() { return this.nomeFilaDouble; }
    public String getNomeFilaBoolean() { return this.nomeFilaBoolean; }
    public String getNomeFilaString() { return this.nomeFilaString; }
    // Getter parametrizado para o nome da fila
    public String getNomeFila(String tipo) {
        if (tipo.equals("int")) { return this.getNomeFilaInt(); }
        else if (tipo.equals("double")) { return this.getNomeFilaDouble(); }
        else if (tipo.equals("String")) { return this.getNomeFilaString(); }
        else if (tipo.equals("boolean")) { return this.getNomeFilaBoolean(); }
        else { return ""; }
    }

    // ==========================================================================================================

    // Adicao de import definido pelo programa
    public void addImport(String newImport) {
        this.imports.add(newImport);
    }

    // Adiciona filas a um metodo
    public void addFilas(Metodo metodo, List<String> tiposFila) {
        // Escrita das filas que serao utilizadas
        for (String tipo : tiposFila) {
            switch(tipo) {
                case "int":
                    metodo.setFilaInt(true);
                    break;
                case "double":
                    metodo.setFilaDouble(true);
                    break;
                case "String":
                    metodo.setFilaString(true);
                    break;
                case "boolean":
                    metodo.setFilaBoolean(true);
                    break;
            }
        }
    }

    // Adicao de comando definido pelo programa
    public void addComando(String nome, ArrayList<Map.Entry<String, String>> parametros,
                          ArrayList<String> linhas, List<String> tiposFila) {
        Metodo metodo = new Metodo(parametros);
        addFilas(metodo, tiposFila);
        metodo.setLinhas(linhas);
        this.metodos.add(new AbstractMap.SimpleEntry<>(nome, metodo));
    }

    // Adicao de operacao definida pelo programa
    public void addOperacao(String nome, ArrayList<Map.Entry<String, String>> parametros,
                            String tipoRetorno, ArrayList<String> linhas, List<String> tiposFila) {
        Metodo metodo = new Metodo(parametros, tipoRetorno);
        metodo.setLinhas(linhas);
        addFilas(metodo, tiposFila);
        this.metodos.add(new AbstractMap.SimpleEntry<>(nome, metodo));
    }

    // Construtor do codigo do robo
    public CodigoRobo(String nome) {
        // Determina o nome do robo
        this.nome = nome;
        // Cria a lista de bibliotecas e importa a bibioteca Robot
        this.imports = new ArrayList<>();
        imports.add("import robocode.*;");

        // Inicializa metodos init e loop
        this.metodoInit = new Metodo();
        this.metodoLoop = new Metodo();
        this.metodoRun = new Metodo();

        // Inicializacao dos nomes das filas
        this.nomeFilaInt = "__qTempInt";
        this.nomeFilaDouble = "__qTempDouble";
        this.nomeFilaString = "__qTempString";
        this.nomeFilaBoolean = "__qTempBoolean";

        // Escreve o metodo run
        metodoRun.setLinhas(new ArrayList<>(Arrays.asList("init();", "while(true) { loop(); }")));

        // Inicializa metodos restantes
        this.metodos = new ArrayList<>();
    }

}
