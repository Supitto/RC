package rc;

import java.util.ArrayList;
import java.util.List;

public class Comando
{
    private ArrayList<String> _argumentos;
    private String _nome;

    public Comando(String nome, List<String> args)
    {
        _nome = nome;
        _argumentos = new ArrayList<String>();
        for (int i = 0; i < args.size(); i++)
        {
            _argumentos.add(args.get(i));
        }
    }
}
