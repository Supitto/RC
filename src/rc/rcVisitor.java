// Generated from rc.g4 by ANTLR 4.7

package rc;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rcParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(rcParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#decl_jogo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_jogo(rcParser.Decl_jogoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#decl_robo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_robo(rcParser.Decl_roboContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#defop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefop(rcParser.DefopContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#defcom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcom(rcParser.DefcomContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(rcParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(rcParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(rcParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(rcParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(rcParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(rcParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#composicao_seta_argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposicao_seta_argumento(rcParser.Composicao_seta_argumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#composicao_seta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposicao_seta(rcParser.Composicao_setaContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#composicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposicao(rcParser.ComposicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(rcParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(rcParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#op_ini}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_ini(rcParser.Op_iniContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(rcParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#op_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_if(rcParser.Op_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(rcParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link rcParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(rcParser.If_statementContext ctx);
}