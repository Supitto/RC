package rc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Codigo {
    public class Metodo {
        private List<Map.Entry<String, String>> parametros;
        private String tipoRetorno;
        private List<String> linhas;

        // Construtores parametrizados e nao parametrizados
        public Metodo() {
            this.parametros = new ArrayList<>();
            this.tipoRetorno = "void";
            this.linhas = new ArrayList<>();
        }

        public Metodo(ArrayList<Map.Entry<String, String>> parametros) {
            this.parametros = parametros;
            this.tipoRetorno = "void";
            this.linhas = new ArrayList<>();
        }

        public Metodo(ArrayList<Map.Entry<String, String>> parametros, String tipoRetorno) {
            this.parametros = parametros;
            this.tipoRetorno = tipoRetorno;
            if (this.tipoRetorno == "") { this.tipoRetorno = "void"; }
            this.linhas = new ArrayList<>();
        }

        // Getters e setters
        public List<Map.Entry<String, String>> getParametros() {  return this.parametros; }
        public void setParametros(List<Map.Entry<String, String>> parametros) { this.parametros = parametros; }
        public String getTipoRetorno() { return this.tipoRetorno; }
        public void setTipoRetorno(String tipoRetorno) { this.tipoRetorno = tipoRetorno; }
        public List<String> getLinhas() { return this.linhas; }
        public void setLinhas(ArrayList<String> linhas) { this.linhas = linhas; }
    }
}
