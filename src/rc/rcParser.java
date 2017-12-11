// Generated from rc.g4 by ANTLR 4.7

package rc;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NUMERO=4, FLOAT_NUMBER=5, LOGICO=6, IF=7, TYPE=8, 
		ABRE_PARENTESES=9, FECHA_PARENTESES=10, TRUE=11, FALSE=12, ID_OP_RELACIONAL=13, 
		ID_OP_RESERVADO=14, LITERAL=15, LET=16, BE=17, NOVO_JOGO=18, NOVO_ROBO=19, 
		DEFCOM=20, DEFOP=21, RETURNS=22, AS=23, FIM=24, OP_SETA=25, OUT=26, ID_COMANDO_RESERVADO=27, 
		ID_COMANDO=28, ID=29, ID_OPERADOR=30, NUMBER=31, WS=32;
	public static final int
		RULE_programa = 0, RULE_decl_jogo = 1, RULE_decl_robo = 2, RULE_defop = 3, 
		RULE_defcom = 4, RULE_arg = 5, RULE_args = 6, RULE_retorno = 7, RULE_corpo = 8, 
		RULE_instrucao = 9, RULE_declaracao = 10, RULE_composicao_seta_argumento = 11, 
		RULE_composicao_seta = 12, RULE_composicao = 13, RULE_comando = 14, RULE_parametro = 15, 
		RULE_op_ini = 16, RULE_op = 17, RULE_op_if = 18, RULE_valor = 19, RULE_if_statement = 20;
	public static final String[] ruleNames = {
		"programa", "decl_jogo", "decl_robo", "defop", "defcom", "arg", "args", 
		"retorno", "corpo", "instrucao", "declaracao", "composicao_seta_argumento", 
		"composicao_seta", "composicao", "comando", "parametro", "op_ini", "op", 
		"op_if", "valor", "if_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'Is'", "'Default'", null, null, null, "'If'", null, "'('", 
		"')'", "'true'", "'false'", null, null, null, "'Let'", "'be'", "'new game'", 
		"'new robot'", "'defcom'", "'defop'", "'returns'", "'as'", "'end'", null, 
		"'Out'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "NUMERO", "FLOAT_NUMBER", "LOGICO", "IF", "TYPE", 
		"ABRE_PARENTESES", "FECHA_PARENTESES", "TRUE", "FALSE", "ID_OP_RELACIONAL", 
		"ID_OP_RESERVADO", "LITERAL", "LET", "BE", "NOVO_JOGO", "NOVO_ROBO", "DEFCOM", 
		"DEFOP", "RETURNS", "AS", "FIM", "OP_SETA", "OUT", "ID_COMANDO_RESERVADO", 
		"ID_COMANDO", "ID", "ID_OPERADOR", "NUMBER", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "rc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public Decl_jogoContext decl_jogo() {
			return getRuleContext(Decl_jogoContext.class,0);
		}
		public Decl_roboContext decl_robo() {
			return getRuleContext(Decl_roboContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOVO_JOGO:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				decl_jogo();
				}
				break;
			case NOVO_ROBO:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				decl_robo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_jogoContext extends ParserRuleContext {
		public TerminalNode NOVO_JOGO() { return getToken(rcParser.NOVO_JOGO, 0); }
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
		public TerminalNode FIM() { return getToken(rcParser.FIM, 0); }
		public List<DefopContext> defop() {
			return getRuleContexts(DefopContext.class);
		}
		public DefopContext defop(int i) {
			return getRuleContext(DefopContext.class,i);
		}
		public List<DefcomContext> defcom() {
			return getRuleContexts(DefcomContext.class);
		}
		public DefcomContext defcom(int i) {
			return getRuleContext(DefcomContext.class,i);
		}
		public Decl_jogoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_jogo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterDecl_jogo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitDecl_jogo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitDecl_jogo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_jogoContext decl_jogo() throws RecognitionException {
		Decl_jogoContext _localctx = new Decl_jogoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_jogo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(NOVO_JOGO);
			setState(47);
			match(ID);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFOP) {
				{
				{
				setState(48);
				defop();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFCOM) {
				{
				{
				setState(54);
				defcom();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_roboContext extends ParserRuleContext {
		public TerminalNode NOVO_ROBO() { return getToken(rcParser.NOVO_ROBO, 0); }
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
		public TerminalNode FIM() { return getToken(rcParser.FIM, 0); }
		public List<DefopContext> defop() {
			return getRuleContexts(DefopContext.class);
		}
		public DefopContext defop(int i) {
			return getRuleContext(DefopContext.class,i);
		}
		public List<DefcomContext> defcom() {
			return getRuleContexts(DefcomContext.class);
		}
		public DefcomContext defcom(int i) {
			return getRuleContext(DefcomContext.class,i);
		}
		public Decl_roboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_robo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterDecl_robo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitDecl_robo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitDecl_robo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_roboContext decl_robo() throws RecognitionException {
		Decl_roboContext _localctx = new Decl_roboContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_robo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(NOVO_ROBO);
			setState(63);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFOP) {
				{
				{
				setState(64);
				defop();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFCOM) {
				{
				{
				setState(70);
				defcom();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(FIM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefopContext extends ParserRuleContext {
		public TerminalNode DEFOP() { return getToken(rcParser.DEFOP, 0); }
		public TerminalNode ID_OPERADOR() { return getToken(rcParser.ID_OPERADOR, 0); }
		public TerminalNode RETURNS() { return getToken(rcParser.RETURNS, 0); }
		public TerminalNode TYPE() { return getToken(rcParser.TYPE, 0); }
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public DefopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterDefop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitDefop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitDefop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefopContext defop() throws RecognitionException {
		DefopContext _localctx = new DefopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DEFOP);
			setState(79);
			match(ID_OPERADOR);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(80);
				args();
				}
			}

			setState(83);
			match(RETURNS);
			setState(84);
			match(TYPE);
			setState(85);
			retorno();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefcomContext extends ParserRuleContext {
		public TerminalNode DEFCOM() { return getToken(rcParser.DEFCOM, 0); }
		public TerminalNode ID_COMANDO() { return getToken(rcParser.ID_COMANDO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public DefcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterDefcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitDefcom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitDefcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcomContext defcom() throws RecognitionException {
		DefcomContext _localctx = new DefcomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_defcom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(DEFCOM);
			setState(88);
			match(ID_COMANDO);
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(89);
				args();
				}
				break;
			}
			setState(92);
			corpo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
		public TerminalNode AS() { return getToken(rcParser.AS, 0); }
		public TerminalNode TYPE() { return getToken(rcParser.TYPE, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			setState(95);
			match(AS);
			setState(96);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(98);
			arg();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(99);
				match(T__0);
				setState(100);
				arg();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornoContext extends ParserRuleContext {
		public Composicao_setaContext composicao_seta() {
			return getRuleContext(Composicao_setaContext.class,0);
		}
		public TerminalNode OUT() { return getToken(rcParser.OUT, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_retorno);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case LOGICO:
			case IF:
			case ID_OP_RESERVADO:
			case LITERAL:
			case ID:
			case ID_OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				composicao_seta();
				setState(107);
				match(OUT);
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(OUT);
				setState(110);
				parametro();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << LOGICO) | (1L << IF) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << LET) | (1L << ID_COMANDO_RESERVADO) | (1L << ID_COMANDO) | (1L << ID) | (1L << ID_OPERADOR))) != 0)) {
				{
				{
				setState(113);
				instrucao();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ComposicaoContext composicao() {
			return getRuleContext(ComposicaoContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucao);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				declaracao();
				}
				break;
			case NUMERO:
			case LOGICO:
			case IF:
			case ID_OP_RESERVADO:
			case LITERAL:
			case ID_COMANDO_RESERVADO:
			case ID_COMANDO:
			case ID:
			case ID_OPERADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				composicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(rcParser.LET, 0); }
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
		public TerminalNode BE() { return getToken(rcParser.BE, 0); }
		public TerminalNode TYPE() { return getToken(rcParser.TYPE, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(LET);
			setState(124);
			match(ID);
			setState(125);
			match(BE);
			setState(126);
			match(TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composicao_seta_argumentoContext extends ParserRuleContext {
		public Op_iniContext op_ini() {
			return getRuleContext(Op_iniContext.class,0);
		}
		public List<TerminalNode> OP_SETA() { return getTokens(rcParser.OP_SETA); }
		public TerminalNode OP_SETA(int i) {
			return getToken(rcParser.OP_SETA, i);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public Composicao_seta_argumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composicao_seta_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterComposicao_seta_argumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitComposicao_seta_argumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitComposicao_seta_argumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composicao_seta_argumentoContext composicao_seta_argumento() throws RecognitionException {
		Composicao_seta_argumentoContext _localctx = new Composicao_seta_argumentoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_composicao_seta_argumento);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			op_ini();
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(129);
					match(OP_SETA);
					setState(130);
					op();
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composicao_setaContext extends ParserRuleContext {
		public Composicao_seta_argumentoContext composicao_seta_argumento() {
			return getRuleContext(Composicao_seta_argumentoContext.class,0);
		}
		public TerminalNode OP_SETA() { return getToken(rcParser.OP_SETA, 0); }
		public Composicao_setaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composicao_seta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterComposicao_seta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitComposicao_seta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitComposicao_seta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Composicao_setaContext composicao_seta() throws RecognitionException {
		Composicao_setaContext _localctx = new Composicao_setaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_composicao_seta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			composicao_seta_argumento();
			setState(137);
			match(OP_SETA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComposicaoContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Composicao_setaContext composicao_seta() {
			return getRuleContext(Composicao_setaContext.class,0);
		}
		public ComposicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterComposicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitComposicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitComposicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComposicaoContext composicao() throws RecognitionException {
		ComposicaoContext _localctx = new ComposicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_composicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << LOGICO) | (1L << IF) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << ID_OPERADOR))) != 0)) {
				{
				setState(139);
				composicao_seta();
				}
			}

			setState(142);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public TerminalNode ID_COMANDO_RESERVADO() { return getToken(rcParser.ID_COMANDO_RESERVADO, 0); }
		public TerminalNode ID_COMANDO() { return getToken(rcParser.ID_COMANDO, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==ID_COMANDO_RESERVADO || _la==ID_COMANDO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					parametro();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ABRE_PARENTESES() { return getToken(rcParser.ABRE_PARENTESES, 0); }
		public Composicao_seta_argumentoContext composicao_seta_argumento() {
			return getRuleContext(Composicao_seta_argumentoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(rcParser.FECHA_PARENTESES, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametro);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(ABRE_PARENTESES);
				setState(152);
				composicao_seta_argumento();
				setState(153);
				match(FECHA_PARENTESES);
				}
				break;
			case NUMERO:
			case LOGICO:
			case LITERAL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_iniContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Op_iniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_ini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterOp_ini(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitOp_ini(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitOp_ini(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_iniContext op_ini() throws RecognitionException {
		Op_iniContext _localctx = new Op_iniContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_op_ini);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case LOGICO:
			case LITERAL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				valor();
				}
				break;
			case IF:
			case ID_OP_RESERVADO:
			case ID_OPERADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode ID_OP_RESERVADO() { return getToken(rcParser.ID_OP_RESERVADO, 0); }
		public TerminalNode ID_OPERADOR() { return getToken(rcParser.ID_OPERADOR, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_op);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_OP_RESERVADO:
			case ID_OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==ID_OP_RESERVADO || _la==ID_OPERADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << LOGICO) | (1L << ABRE_PARENTESES) | (1L << LITERAL) | (1L << ID))) != 0)) {
					{
					{
					setState(163);
					parametro();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				if_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_ifContext extends ParserRuleContext {
		public TerminalNode ID_OP_RELACIONAL() { return getToken(rcParser.ID_OP_RELACIONAL, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public Op_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterOp_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitOp_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitOp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_ifContext op_if() throws RecognitionException {
		Op_ifContext _localctx = new Op_ifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_op_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID_OP_RELACIONAL);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					parametro();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(rcParser.NUMERO, 0); }
		public TerminalNode LITERAL() { return getToken(rcParser.LITERAL, 0); }
		public TerminalNode LOGICO() { return getToken(rcParser.LOGICO, 0); }
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << LOGICO) | (1L << LITERAL) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(rcParser.IF, 0); }
		public TerminalNode RETURNS() { return getToken(rcParser.RETURNS, 0); }
		public TerminalNode TYPE() { return getToken(rcParser.TYPE, 0); }
		public List<RetornoContext> retorno() {
			return getRuleContexts(RetornoContext.class);
		}
		public RetornoContext retorno(int i) {
			return getRuleContext(RetornoContext.class,i);
		}
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public List<Op_ifContext> op_if() {
			return getRuleContexts(Op_ifContext.class);
		}
		public Op_ifContext op_if(int i) {
			return getRuleContext(Op_ifContext.class,i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rcVisitor ) return ((rcVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IF);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << LOGICO) | (1L << ABRE_PARENTESES) | (1L << LITERAL) | (1L << ID))) != 0)) {
				{
				setState(182);
				parametro();
				}
			}

			setState(185);
			match(RETURNS);
			setState(186);
			match(TYPE);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(187);
				match(T__1);
				setState(188);
				op_if();
				setState(189);
				retorno();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(195);
			match(T__2);
			setState(196);
			retorno();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\5\2/\n\2\3\3\3\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\5\5T\n\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6]\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\5\tr"+
		"\n\t\3\n\7\nu\n\n\f\n\16\nx\13\n\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\3\16\3\16\3\16\3\17"+
		"\5\17\u008f\n\17\3\17\3\17\3\20\3\20\7\20\u0095\n\20\f\20\16\20\u0098"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\5\21\u009f\n\21\3\22\3\22\5\22\u00a3\n"+
		"\22\3\23\3\23\7\23\u00a7\n\23\f\23\16\23\u00aa\13\23\3\23\5\23\u00ad\n"+
		"\23\3\24\3\24\7\24\u00b1\n\24\f\24\16\24\u00b4\13\24\3\25\3\25\3\26\3"+
		"\26\5\26\u00ba\n\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00c2\n\26\r\26"+
		"\16\26\u00c3\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\5\3\2\35\36\4\2\20\20  \6\2\6\6\b\b\21\21\37\37\2\u00c8"+
		"\2.\3\2\2\2\4\60\3\2\2\2\6@\3\2\2\2\bP\3\2\2\2\nY\3\2\2\2\f`\3\2\2\2\16"+
		"d\3\2\2\2\20q\3\2\2\2\22v\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0082\3\2"+
		"\2\2\32\u008a\3\2\2\2\34\u008e\3\2\2\2\36\u0092\3\2\2\2 \u009e\3\2\2\2"+
		"\"\u00a2\3\2\2\2$\u00ac\3\2\2\2&\u00ae\3\2\2\2(\u00b5\3\2\2\2*\u00b7\3"+
		"\2\2\2,/\5\4\3\2-/\5\6\4\2.,\3\2\2\2.-\3\2\2\2/\3\3\2\2\2\60\61\7\24\2"+
		"\2\61\65\7\37\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2"+
		"\2\2\65\66\3\2\2\2\66;\3\2\2\2\67\65\3\2\2\28:\5\n\6\298\3\2\2\2:=\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\32\2\2?\5\3\2\2\2@A\7"+
		"\25\2\2AE\7\37\2\2BD\5\b\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F"+
		"K\3\2\2\2GE\3\2\2\2HJ\5\n\6\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2"+
		"LN\3\2\2\2MK\3\2\2\2NO\7\32\2\2O\7\3\2\2\2PQ\7\27\2\2QS\7 \2\2RT\5\16"+
		"\b\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\30\2\2VW\7\n\2\2WX\5\20\t\2X\t"+
		"\3\2\2\2YZ\7\26\2\2Z\\\7\36\2\2[]\5\16\b\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^_\5\22\n\2_\13\3\2\2\2`a\7\37\2\2ab\7\31\2\2bc\7\n\2\2c\r\3\2\2\2"+
		"di\5\f\7\2ef\7\3\2\2fh\5\f\7\2ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"j\17\3\2\2\2ki\3\2\2\2lm\5\32\16\2mn\7\34\2\2nr\3\2\2\2op\7\34\2\2pr\5"+
		" \21\2ql\3\2\2\2qo\3\2\2\2r\21\3\2\2\2su\5\24\13\2ts\3\2\2\2ux\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w\23\3\2\2\2xv\3\2\2\2y|\5\26\f\2z|\5\34\17\2{y\3"+
		"\2\2\2{z\3\2\2\2|\25\3\2\2\2}~\7\22\2\2~\177\7\37\2\2\177\u0080\7\23\2"+
		"\2\u0080\u0081\7\n\2\2\u0081\27\3\2\2\2\u0082\u0087\5\"\22\2\u0083\u0084"+
		"\7\33\2\2\u0084\u0086\5$\23\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\31\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u008b\5\30\r\2\u008b\u008c\7\33\2\2\u008c\33\3\2\2\2\u008d"+
		"\u008f\5\32\16\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\5\36\20\2\u0091\35\3\2\2\2\u0092\u0096\t\2\2\2\u0093"+
		"\u0095\5 \21\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\37\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009a"+
		"\7\13\2\2\u009a\u009b\5\30\r\2\u009b\u009c\7\f\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009f\5(\25\2\u009e\u0099\3\2\2\2\u009e\u009d\3\2\2\2\u009f!\3"+
		"\2\2\2\u00a0\u00a3\5(\25\2\u00a1\u00a3\5$\23\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3#\3\2\2\2\u00a4\u00a8\t\3\2\2\u00a5\u00a7\5 \21\2"+
		"\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\5*\26\2\u00ac"+
		"\u00a4\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad%\3\2\2\2\u00ae\u00b2\7\17\2\2"+
		"\u00af\u00b1\5 \21\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\'\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\t\4\2\2\u00b6)\3\2\2\2\u00b7\u00b9\7\t\2\2\u00b8\u00ba\5 \21\2"+
		"\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\7\30\2\2\u00bc\u00c1\7\n\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\5&\24\2"+
		"\u00bf\u00c0\5\20\t\2\u00c0\u00c2\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\7\5\2\2\u00c6\u00c7\5\20\t\2\u00c7+\3\2\2\2\27.\65;EKS\\iqv{\u0087"+
		"\u008e\u0096\u009e\u00a2\u00a8\u00ac\u00b2\u00b9\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}