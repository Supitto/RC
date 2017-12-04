package rc;

import java.util.ArrayList;
import java.util.HashMap;

public class tabelaDeComandos
{
    private HashMap<String,String[]> tabela = new HashMap<>();

    public tabelaDeComandos()
    {

    }

    public void InsereComando(String nome, String[] args)
    {
        if(tabela.containsKey(nome))
        {

        }

        tabela.put(nome,args);

    }

    public Boolean ChecaComando(String nome, String[] args)
    {
        if(tabela.containsKey(nome))
        {
            String [] copy = tabela.get(nome);
            if(copy.length == args.length)
            {
                for (int i = 0; i < copy.length; i++) {
                    if(copy[i] != args[i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

}
