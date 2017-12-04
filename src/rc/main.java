package rc;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;


public class main {

    static String output = "";
    static String code = "";
    static tabelaDeVariaveis tv =  new tabelaDeVariaveis();
    static tabelaDeComandos tc = new tabelaDeComandos();
    static tabelaDeOperacoes to = new tabelaDeOperacoes();
    public static void main(String[] args)
    {
        try
        {
            ANTLRInputStream input = new ANTLRInputStream(
                    new FileInputStream(args[0]));

            rcLexer lexer = new rcLexer(input);
            rcParser parser = new rcParser(new CommonTokenStream(lexer));
            parser.addErrorListener(new BaseErrorListener()
            {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                {
                    if (output.isEmpty()) {
                        String token = ((CommonToken) offendingSymbol).getText();
                        if (token.matches("<EOF>")) {
                            token = new String("EOF");
                        }
                        throw new  ParseCancellationException( "Linha " + line + ": erro sintatico proximo a " + token + "\n");
                    }
                }
            });

            try {
                rcParser.ProgramaContext programa = parser.programa();

                // Geracao de codigo
                GeradorCodigo geradorCodigo = new GeradorCodigo();
                code = geradorCodigo.visitPrograma(programa);
            }
            catch (ParseCancellationException pce) {
                if (pce.getMessage() != null) {
                    main.output = main.output.concat(pce.getMessage());
                }
            }


            System.out.println("Salvando em "+args[1]);
            FileWriter fileWriter = new FileWriter(args[1]);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            if(main.output!="") {
                // Compilacao com erros - escrita dos erros no arquivo
                printWriter.print(main.output);
                printWriter.println("Fim da compilacao");
            }
            else
            {
                // Compilacao sem erros - escrita do codigo gerado no arquivo
                printWriter.print(main.code);
            }
            System.out.println(main.code);
            printWriter.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}