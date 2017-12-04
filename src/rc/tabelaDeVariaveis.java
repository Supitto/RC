package rc;

import java.util.HashMap;
import java.util.Stack;

public class tabelaDeVariaveis
{
    private Stack<HashMap<String,String>> pilha = new Stack<HashMap<String,String>>();

    public tabelaDeVariaveis()
    {
    }

    public void InsereVariavel(String nome, String tipo) throws noTableException {
        if(pilha.size()<0)
            throw new noTableException();
        pilha.peek().put(nome,tipo);
    }

    public Boolean ChecaTipoTopo(String nome,String tipo) throws nonExistentVariableException {
        if(!pilha.peek().containsKey(nome))
            throw new nonExistentVariableException();
        return pilha.peek().get(nome).equals(tipo);
    }

    public String RetornaTipo(String nome) throws noTableException, nonExistentVariableException {
        if(pilha.size()<0)
            throw new noTableException();
        if(!pilha.peek().containsKey(nome))
            throw new nonExistentVariableException();
        return pilha.peek().get(nome);
    }

    public void EmpilhaEscopo()
    {
        pilha.push(new HashMap<>());
    }

    public void DesempilhaEscopo() throws noTableException {
        if(pilha.size() > 0) {
            pilha.pop();
        }
        else
        {
            throw new noTableException();
        }
    }
}

class noTableException extends Exception
{
    public noTableException()
    {
        super("Você não pode interagir com um escopo quando não ha um escopo =( ");
    }
}

class nonExistentVariableException extends Exception
{
    public nonExistentVariableException()
    {
        super("A variavel que você procura não existe neste escopo");
    }
}
