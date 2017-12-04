package rc;

public class analisadorSemantico extends rcBaseVisitor<String>
{
    public analisadorSemantico()
    {
        super();
    }

    @Override
    public String visitPrograma(rcParser.ProgramaContext ctx)
    {
        return super.visitPrograma(ctx);
    }

    @Override
    public String visitDeclaracao(rcParser.DeclaracaoContext ctx)
    {
        try {
            main.tv.InsereVariavel(ctx.ID().getText(),ctx.TYPE().getText());
        } catch (noTableException e) {
            e.printStackTrace();
        }
        return super.visitDeclaracao(ctx);
    }

    @Override
    public String visitComposicao(rcParser.ComposicaoContext ctx) {
        String backArg = null;
        String[] args;
        if(ctx.composicao_seta() != null)
        {
            args = new String[ctx.comando().parametro().size()+1];
            args[0] = visitComposicao_seta(ctx.composicao_seta());
            for (int i = 0; i < ctx.comando().parametro().size(); i++) {
                args[i+1] = visitParametro(ctx.comando().parametro(i));
            }

        }
        else
        {
            args = new String[ctx.comando().parametro().size()];
            for (int i = 0; i < ctx.comando().parametro().size(); i++) {
                args[i] = visitParametro(ctx.comando().parametro(i));
            }

        }
        String nome = visitComando(ctx.comando());

        main.tc.ChecaComando(nome,args);

        return super.visitComposicao(ctx);
    }

    @Override
    public String visitComposicao_seta(rcParser.Composicao_setaContext ctx)
    {
        return visitComposicao_seta_argumento(ctx.composicao_seta_argumento());
    }

    @Override
    public String visitComposicao_seta_argumento(rcParser.Composicao_seta_argumentoContext ctx) {
        String tipo_atual = visitOp_ini(ctx.op_ini());
        for (int i = 0; i < ctx.op().size(); i++) {
            if(ctx.op(i).if_statement()!= null)
            {
               tipo_atual = ctx.op(i).if_statement().TYPE().getText();
            }
            else if(ctx.op(i).ID_OPERADOR() != null)
            {
               String[] args = new String[ctx.op(i).parametro().size()+1];
                for (int j = 0; j < ctx.op(i).parametro().size(); j++) {
                    args[j] = visitParametro(ctx.op(i).parametro(j));
                }
                try {
                    tipo_atual = main.to.ChecaOperacao(ctx.op(i).ID_OPERADOR().getText(),args);
                } catch (tabelaDeOperacoes.OperationNotFoundException e) {
                    e.printStackTrace();
                } catch (tabelaDeOperacoes.MismatchingArgCountException e) {
                    e.printStackTrace();
                } catch (tabelaDeOperacoes.MismatchingArgException e) {
                    e.printStackTrace();
                }
            }

        }
        return tipo_atual;
    }

    @Override
    public String visitParametro(rcParser.ParametroContext ctx)
    {
        if(ctx.valor()!=null)
            return visitValor(ctx.valor());
        return visitComposicao_seta_argumento(ctx.composicao_seta_argumento());
    }

    @Override
    public String visitValor(rcParser.ValorContext ctx) {
        if(ctx.numero() != null)
            return "integer";
        if(ctx.logico() != null)
            return "logical";
        if(ctx.float_number() != null)
            return "floating";
        if(ctx.ID() != null)
            try {
                return main.tv.RetornaTipo(ctx.ID().getText());
            } catch (noTableException e) {
                e.printStackTrace();
            } catch (nonExistentVariableException e) {
                e.printStackTrace();
            }
        return "literal";

    }

    @Override
    public String visitDefcom(rcParser.DefcomContext ctx) {
        String [] args = new String[ctx.args().arg().size()+1];
        for (int i = 0; i < args.length; i++) {
            args[i] = visitArg(ctx.args().arg(i));
        }
        main.tc.InsereComando(ctx.ID_COMANDO().getText(),args);
        return super.visitDefcom(ctx);
    }

    @Override
    public String visitArg(rcParser.ArgContext ctx) {
        return ctx.TYPE().getText();
    }

    @Override
    public String visitDefop(rcParser.DefopContext ctx) {
        String [] args = new String[ctx.args().arg().size()];
        for (int i = 0; i < args.length; i++) {
            args[i] = visitArg(ctx.args().arg(i));
        }
        try {
            main.to.InsereOperacao(ctx.ID_OPERADOR().getText(),ctx.TYPE().getText(),args);
        } catch (tabelaDeOperacoes.OperationAlreadyExistsException e) {
            e.printStackTrace();
        }
        return super.visitDefop(ctx);
    }
}
