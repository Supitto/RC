package rc;

import java.util.HashMap;

public class tabelaDeOperacoes
{
    private HashMap<String,String[]> tabela = new HashMap<>();

    public tabelaDeOperacoes()
    {

    }

    public void InsereOperacao(String nome, String ret, String[] args) throws OperationAlreadyExistsException {
        if(tabela.containsKey(nome))
        {
            throw new OperationAlreadyExistsException(nome);
        }

        String[] newargs = new String[args.length+1];
        newargs[0] = ret;
        for (int i = 0; i < args.length; i++) {
            newargs[i+1]=args[i];
        }
        tabela.put(nome,args);

    }

    public String ChecaOperacao(String nome, String[] args) throws OperationNotFoundException, MismatchingArgCountException, MismatchingArgException {
        if(!tabela.containsKey(nome)) {
        throw new OperationNotFoundException(nome);
        }
        String [] copy = tabela.get(nome);
        if(copy.length+1 != args.length) {
            throw new MismatchingArgCountException();
        }
        for (int i = 0; i < copy.length; i++) {
            if(copy[i+1] != args[i]) {
                throw new MismatchingArgException(copy[i+1],args[i],i);
            }
        }
        return copy[0];
    }

    class OperationAlreadyExistsException extends Exception {
        public OperationAlreadyExistsException(String nome) {
            super("The operation "+nome+" is already defined");
        }
    }
    class OperationNotFoundException extends Exception {
        public OperationNotFoundException(String nome)
        {
            super("The operation "+nome+" could not be found");
        }
    }
    class MismatchingArgCountException extends Throwable {
    }
    class MismatchingArgException extends Throwable {
        public MismatchingArgException(String s, String arg, int i) {
            super("There is a mismatching in the arg number "+i+", where is a "+arg+" it should be "+s );
        }
    }
}
