package rc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Codigo {
    public class Metodo {
        private List<Map.Entry<String, String>> parametros;
        private String tipoRetorno;
        private List<String> linhas;

        // Filas necessarias para processamentos dos ifs
        private boolean filaInt;
        private boolean filaDouble;
        private boolean filaBoolean;
        private boolean filaString;

        // Construtores parametrizados e nao parametrizados
        public Metodo() {
            this.parametros = new ArrayList<>();
            this.tipoRetorno = "void";
            this.linhas = new ArrayList<>();
            filaInt = filaDouble = filaBoolean = filaString = false;
        }

        public Metodo(List<Map.Entry<String, String>> parametros) {
            this.parametros = parametros;
            this.tipoRetorno = "void";
            this.linhas = new ArrayList<>();
            filaInt = filaDouble = filaBoolean = filaString = false;
        }

        public Metodo(List<Map.Entry<String, String>> parametros, String tipoRetorno) {
            this.parametros = parametros;
            this.tipoRetorno = tipoRetorno;
            if (this.tipoRetorno == "") { this.tipoRetorno = "void"; }
            this.linhas = new ArrayList<>();
            filaInt = filaDouble = filaBoolean = filaString = false;
        }

        // Getters e setters
        public List<Map.Entry<String, String>> getParametros() {  return this.parametros; }
        public void setParametros(List<Map.Entry<String, String>> parametros) { this.parametros = parametros; }
        public String getTipoRetorno() { return this.tipoRetorno; }
        public void setTipoRetorno(String tipoRetorno) { this.tipoRetorno = tipoRetorno; }
        public List<String> getLinhas() { return this.linhas; }
        public void setLinhas(List<String> linhas) { this.linhas = linhas; }

        public boolean isFilaInt() {  return this.filaInt; }
        public boolean isFilaDouble() { return this.filaDouble; }
        public boolean isFilaBoolean() { return this.filaBoolean; }
        public boolean isFilaString() { return this.filaString; }
        public void setFilaInt(boolean filaInt) { this.filaInt = filaInt; }
        public void setFilaDouble(boolean filaDouble) { this.filaDouble = filaDouble; }
        public void setFilaBoolean(boolean filaBoolean) { this.filaBoolean = filaBoolean; }
        public void setFilaString(boolean filaString) { this.filaString = filaString; }
    }
}
