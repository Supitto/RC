// Generated from rc.g4 by ANTLR 4.7

package rc;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rcParser}.
 */
public interface rcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rcParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(rcParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(rcParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#decl_jogo}.
	 * @param ctx the parse tree
	 */
	void enterDecl_jogo(rcParser.Decl_jogoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#decl_jogo}.
	 * @param ctx the parse tree
	 */
	void exitDecl_jogo(rcParser.Decl_jogoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#decl_robo}.
	 * @param ctx the parse tree
	 */
	void enterDecl_robo(rcParser.Decl_roboContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#decl_robo}.
	 * @param ctx the parse tree
	 */
	void exitDecl_robo(rcParser.Decl_roboContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#defop}.
	 * @param ctx the parse tree
	 */
	void enterDefop(rcParser.DefopContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#defop}.
	 * @param ctx the parse tree
	 */
	void exitDefop(rcParser.DefopContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#defcom}.
	 * @param ctx the parse tree
	 */
	void enterDefcom(rcParser.DefcomContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#defcom}.
	 * @param ctx the parse tree
	 */
	void exitDefcom(rcParser.DefcomContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(rcParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(rcParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(rcParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(rcParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(rcParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(rcParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(rcParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(rcParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(rcParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(rcParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(rcParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(rcParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#composicao_seta_argumento}.
	 * @param ctx the parse tree
	 */
	void enterComposicao_seta_argumento(rcParser.Composicao_seta_argumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#composicao_seta_argumento}.
	 * @param ctx the parse tree
	 */
	void exitComposicao_seta_argumento(rcParser.Composicao_seta_argumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#composicao_seta}.
	 * @param ctx the parse tree
	 */
	void enterComposicao_seta(rcParser.Composicao_setaContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#composicao_seta}.
	 * @param ctx the parse tree
	 */
	void exitComposicao_seta(rcParser.Composicao_setaContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#composicao}.
	 * @param ctx the parse tree
	 */
	void enterComposicao(rcParser.ComposicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#composicao}.
	 * @param ctx the parse tree
	 */
	void exitComposicao(rcParser.ComposicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(rcParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(rcParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(rcParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(rcParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#op_ini}.
	 * @param ctx the parse tree
	 */
	void enterOp_ini(rcParser.Op_iniContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#op_ini}.
	 * @param ctx the parse tree
	 */
	void exitOp_ini(rcParser.Op_iniContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(rcParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(rcParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(rcParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(rcParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link rcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(rcParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rcParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(rcParser.If_statementContext ctx);
}