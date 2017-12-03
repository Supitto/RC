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
    public void setMetodoInit(ArrayList<String> linhas) { this.metodoInit.setLinhas(linhas); }

    public Metodo getMetodoLoop() { return this.metodoLoop; }
    public void setMetodoLoop(ArrayList<String> linhas) { this.metodoLoop.setLinhas(linhas); }

    public List<Map.Entry<String, Metodo>> getMetodos() { return this.metodos; }
    public void setMetodos(List<Map.Entry<String, Metodo>> metodos) { this.metodos = metodos; }

    // ==========================================================================================================

    // Adicao de comando definido pelo programa
    public void addComando(String nome, ArrayList<Map.Entry<String, String>> parametros,
                          ArrayList<String> linhas) {
        Metodo metodo = new Metodo(parametros);
        metodo.setLinhas(linhas);
        this.metodos.add(new AbstractMap.SimpleEntry<>(nome, metodo));
    }

    // Adicao de operacao definida pelo programa
    public void addOperacao(String nome, ArrayList<Map.Entry<String, String>> parametros,
                            String tipoRetorno, ArrayList<String> linhas) {
        Metodo metodo = new Metodo(parametros, tipoRetorno);
        metodo.setLinhas(linhas);
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

        // Escreve o metodo run
        metodoRun.setLinhas(new ArrayList<>(Arrays.asList("init();", "while(true) { loop(); }")));

        // Inicializa metodos restantes
        this.metodos = new ArrayList<>();
    }

}
