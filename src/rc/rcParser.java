// Generated from rc.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, IF=5, TYPE=6, ABRE_PARENTESES=7, FECHA_PARENTESES=8, 
		TRUE=9, FALSE=10, ID_OP_RESERVADO=11, LITERAL=12, LET=13, BE=14, NOVO_JOGO=15, 
		NOVO_ROBO=16, DEFCOM=17, DEFOP=18, RETURNS=19, AS=20, FIM=21, OP_SETA=22, 
		OUT=23, ID_COMANDO_RESERVADO=24, ID_COMANDO=25, ID=26, ID_OPERADOR=27, 
		NUMBER=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_defop = 1, RULE_arg = 2, RULE_defcom = 3, RULE_args = 4, 
		RULE_corpo = 5, RULE_instrucao = 6, RULE_declaracao = 7, RULE_composicao_seta_argumento = 8, 
		RULE_composicao_seta = 9, RULE_composicao = 10, RULE_comando = 11, RULE_parametro = 12, 
		RULE_op_ini = 13, RULE_op = 14, RULE_valor = 15, RULE_numero = 16, RULE_float_number = 17, 
		RULE_logico = 18, RULE_if_statement = 19;
	public static final String[] ruleNames = {
		"programa", "defop", "arg", "defcom", "args", "corpo", "instrucao", "declaracao", 
		"composicao_seta_argumento", "composicao_seta", "composicao", "comando", 
		"parametro", "op_ini", "op", "valor", "numero", "float_number", "logico", 
		"if_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", "'Is'", "'Default'", "'If'", null, "'('", "')'", "'true'", 
		"'false'", null, null, "'Let'", "'be'", "'new game'", "'new robot'", "'defcom'", 
		"'defop'", "'returns'", "'as'", "'end'", null, "'Out'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "IF", "TYPE", "ABRE_PARENTESES", "FECHA_PARENTESES", 
		"TRUE", "FALSE", "ID_OP_RESERVADO", "LITERAL", "LET", "BE", "NOVO_JOGO", 
		"NOVO_ROBO", "DEFCOM", "DEFOP", "RETURNS", "AS", "FIM", "OP_SETA", "OUT", 
		"ID_COMANDO_RESERVADO", "ID_COMANDO", "ID", "ID_OPERADOR", "NUMBER", "WS"
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
		public TerminalNode FIM() { return getToken(rcParser.FIM, 0); }
		public TerminalNode NOVO_JOGO() { return getToken(rcParser.NOVO_JOGO, 0); }
		public TerminalNode NOVO_ROBO() { return getToken(rcParser.NOVO_ROBO, 0); }
		public TerminalNode ID() { return getToken(rcParser.ID, 0); }
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOVO_JOGO:
				{
				setState(40);
				match(NOVO_JOGO);
				}
				break;
			case NOVO_ROBO:
				{
				setState(41);
				match(NOVO_ROBO);
				setState(42);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFOP) {
				{
				{
				setState(45);
				defop();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFCOM) {
				{
				{
				setState(51);
				defcom();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
		public Composicao_setaContext composicao_seta() {
			return getRuleContext(Composicao_setaContext.class,0);
		}
		public TerminalNode OUT() { return getToken(rcParser.OUT, 0); }
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
	}

	public final DefopContext defop() throws RecognitionException {
		DefopContext _localctx = new DefopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_defop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(DEFOP);
			setState(60);
			match(ID_OPERADOR);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(61);
				args();
				}
			}

			setState(64);
			match(RETURNS);
			setState(65);
			match(TYPE);
			setState(66);
			composicao_seta();
			setState(67);
			match(OUT);
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
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ID);
			setState(70);
			match(AS);
			setState(71);
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
	}

	public final DefcomContext defcom() throws RecognitionException {
		DefcomContext _localctx = new DefcomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_defcom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(DEFCOM);
			setState(74);
			match(ID_COMANDO);
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(75);
				args();
				}
				break;
			}
			setState(78);
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
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			arg();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(81);
				match(T__0);
				setState(82);
				arg();
				}
				}
				setState(87);
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
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << LET) | (1L << ID_COMANDO_RESERVADO) | (1L << ID_COMANDO) | (1L << ID) | (1L << ID_OPERADOR) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(88);
				instrucao();
				}
				}
				setState(93);
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
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrucao);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				declaracao();
				}
				break;
			case IF:
			case TRUE:
			case FALSE:
			case ID_OP_RESERVADO:
			case LITERAL:
			case ID_COMANDO_RESERVADO:
			case ID_COMANDO:
			case ID:
			case ID_OPERADOR:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
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
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(LET);
			setState(99);
			match(ID);
			setState(100);
			match(BE);
			setState(101);
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
		public  tipo;
		public  tipo_atual;
		public Op_iniContext op_ini;
		public OpContext op;
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
	}

	public final Composicao_seta_argumentoContext composicao_seta_argumento() throws RecognitionException {
		Composicao_seta_argumentoContext _localctx = new Composicao_seta_argumentoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_composicao_seta_argumento);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((Composicao_seta_argumentoContext)_localctx).op_ini = op_ini();
			((Composicao_seta_argumentoContext)_localctx).tipo_atual =  ((Composicao_seta_argumentoContext)_localctx).op_ini.tipo;
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(OP_SETA);
					setState(106);
					((Composicao_seta_argumentoContext)_localctx).op = op(tipo_atual);
					((Composicao_seta_argumentoContext)_localctx).tipo_atual =  ((Composicao_seta_argumentoContext)_localctx).op.tipo;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			((Composicao_seta_argumentoContext)_localctx).tipo =  _localctx.tipo_atual;
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
		public  tipo;
		public Composicao_seta_argumentoContext composicao_seta_argumento;
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
	}

	public final Composicao_setaContext composicao_seta() throws RecognitionException {
		Composicao_setaContext _localctx = new Composicao_setaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_composicao_seta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((Composicao_setaContext)_localctx).composicao_seta_argumento = composicao_seta_argumento();
			((Composicao_setaContext)_localctx).tipo =  ((Composicao_setaContext)_localctx).composicao_seta_argumento.tipo;
			setState(118);
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
		public Composicao_setaContext composicao_seta;
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
	}

	public final ComposicaoContext composicao() throws RecognitionException {
		ComposicaoContext _localctx = new ComposicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_composicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << ID_OPERADOR) | (1L << NUMBER))) != 0)) {
				{
				setState(120);
				((ComposicaoContext)_localctx).composicao_seta = composicao_seta();
				}
			}

			setState(123);
			comando(((ComposicaoContext)_localctx).composicao_seta.tipo);
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
		public  primeiro_argumento;
		public TerminalNode ID_COMANDO_RESERVADO() { return getToken(rcParser.ID_COMANDO_RESERVADO, 0); }
		public TerminalNode ID_COMANDO() { return getToken(rcParser.ID_COMANDO, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ComandoContext(ParserRuleContext parent, int invokingState,  primeiro_argumento) {
			super(parent, invokingState);
			this.primeiro_argumento = primeiro_argumento;
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
	}

	public final ComandoContext comando( primeiro_argumento) throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState(), primeiro_argumento);
		enterRule(_localctx, 22, RULE_comando);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==ID_COMANDO_RESERVADO || _la==ID_COMANDO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					parametro();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public  tipo;
		public Composicao_seta_argumentoContext composicao_seta_argumento;
		public ValorContext valor;
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
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parametro);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABRE_PARENTESES:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ABRE_PARENTESES);
				setState(133);
				((ParametroContext)_localctx).composicao_seta_argumento = composicao_seta_argumento();
				((ParametroContext)_localctx).tipo =  ((ParametroContext)_localctx).composicao_seta_argumento.tipo;
				setState(135);
				match(FECHA_PARENTESES);
				}
				break;
			case TRUE:
			case FALSE:
			case ID_OP_RESERVADO:
			case LITERAL:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				((ParametroContext)_localctx).valor = valor();
				%tipo = ((ParametroContext)_localctx).valor.tipo;
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
		public  tipo;
		public ValorContext valor;
		public OpContext op;
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
	}

	public final Op_iniContext op_ini() throws RecognitionException {
		Op_iniContext _localctx = new Op_iniContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_op_ini);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((Op_iniContext)_localctx).valor = valor();
				((Op_iniContext)_localctx).tipo =  ((Op_iniContext)_localctx).valor.tipo;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((Op_iniContext)_localctx).op = op(null);
				((Op_iniContext)_localctx).tipo =  ((Op_iniContext)_localctx).op.tipo;
				}
				break;
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
		public  tipo_herdado;
		public  tipo;
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
		public OpContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public OpContext(ParserRuleContext parent, int invokingState,  tipo_herdado) {
			super(parent, invokingState);
			this.tipo_herdado = tipo_herdado;
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
	}

	public final OpContext op( tipo_herdado) throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState(), tipo_herdado);
		enterRule(_localctx, 28, RULE_op);
		int _la;
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_OP_RESERVADO:
			case ID_OPERADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==ID_OP_RESERVADO || _la==ID_OPERADOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(151);
					parametro();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
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

	public static class ValorContext extends ParserRuleContext {
		public  tipo;
		public NumeroContext numero;
		public TerminalNode ID_OP_RESERVADO() { return getToken(rcParser.ID_OP_RESERVADO, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(rcParser.LITERAL, 0); }
		public LogicoContext logico() {
			return getRuleContext(LogicoContext.class,0);
		}
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
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_valor);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_OP_RESERVADO:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(ID_OP_RESERVADO);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				((ValorContext)_localctx).numero = numero();
				((ValorContext)_localctx).tipo =  ((ValorContext)_localctx).numero.tipo;
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(LITERAL);
				_localctx.tipo = "literal"
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				logico();
				_localctx.tipo = "logico"
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(ID);
				%tipo = "variavel"
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

	public static class NumeroContext extends ParserRuleContext {
		public  tipo;
		public TerminalNode NUMBER() { return getToken(rcParser.NUMBER, 0); }
		public Float_numberContext float_number() {
			return getRuleContext(Float_numberContext.class,0);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_numero);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(NUMBER);
				_localctx.tipo = "inteiro"
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				float_number();
				_localctx.tipo = "flutuante"
				}
				break;
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

	public static class Float_numberContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(rcParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(rcParser.NUMBER, i);
		}
		public Float_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterFloat_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitFloat_number(this);
		}
	}

	public final Float_numberContext float_number() throws RecognitionException {
		Float_numberContext _localctx = new Float_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_float_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(NUMBER);
			setState(181);
			match(T__1);
			setState(182);
			match(NUMBER);
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

	public static class LogicoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(rcParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(rcParser.FALSE, 0); }
		public LogicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).enterLogico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rcListener ) ((rcListener)listener).exitLogico(this);
		}
	}

	public final LogicoContext logico() throws RecognitionException {
		LogicoContext _localctx = new LogicoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
		public List<CorpoContext> corpo() {
			return getRuleContexts(CorpoContext.class);
		}
		public CorpoContext corpo(int i) {
			return getRuleContext(CorpoContext.class,i);
		}
		public List<TerminalNode> OUT() { return getTokens(rcParser.OUT); }
		public TerminalNode OUT(int i) {
			return getToken(rcParser.OUT, i);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
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
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(IF);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(187);
				parametro();
				}
			}

			setState(190);
			match(RETURNS);
			setState(191);
			match(TYPE);
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(192);
				match(T__2);
				setState(193);
				parametro();
				setState(194);
				corpo();
				setState(195);
				match(OUT);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(196);
					parametro();
					}
				}

				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			setState(203);
			match(T__3);
			setState(204);
			corpo();
			setState(205);
			match(OUT);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABRE_PARENTESES) | (1L << TRUE) | (1L << FALSE) | (1L << ID_OP_RESERVADO) | (1L << LITERAL) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(206);
				parametro();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00d4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\5\2.\n\2\3\2\7\2\61\n\2\f\2"+
		"\16\2\64\13\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\5\3A\n"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5O\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\b\3"+
		"\b\5\bc\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\np\n\n\f\n\16"+
		"\ns\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\5\f|\n\f\3\f\3\f\3\r\3\r\7\r"+
		"\u0082\n\r\f\r\16\r\u0085\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u008f\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0097\n\17\3\20\3"+
		"\20\7\20\u009b\n\20\f\20\16\20\u009e\13\20\3\20\5\20\u00a1\n\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00b5\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\5\25\u00bf\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00c8\n"+
		"\25\6\25\u00ca\n\25\r\25\16\25\u00cb\3\25\3\25\3\25\3\25\5\25\u00d2\n"+
		"\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\32"+
		"\33\4\2\r\r\35\35\3\2\13\f\2\u00d7\2-\3\2\2\2\4=\3\2\2\2\6G\3\2\2\2\b"+
		"K\3\2\2\2\nR\3\2\2\2\f]\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22i\3\2\2\2\24"+
		"v\3\2\2\2\26{\3\2\2\2\30\177\3\2\2\2\32\u008e\3\2\2\2\34\u0096\3\2\2\2"+
		"\36\u00a0\3\2\2\2 \u00ad\3\2\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2&\u00ba"+
		"\3\2\2\2(\u00bc\3\2\2\2*.\7\21\2\2+,\7\22\2\2,.\7\34\2\2-*\3\2\2\2-+\3"+
		"\2\2\2.\62\3\2\2\2/\61\5\4\3\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\638\3\2\2\2\64\62\3\2\2\2\65\67\5\b\5\2\66\65\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\27\2\2<\3\3\2"+
		"\2\2=>\7\24\2\2>@\7\35\2\2?A\5\n\6\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7"+
		"\25\2\2CD\7\b\2\2DE\5\24\13\2EF\7\31\2\2F\5\3\2\2\2GH\7\34\2\2HI\7\26"+
		"\2\2IJ\7\b\2\2J\7\3\2\2\2KL\7\23\2\2LN\7\33\2\2MO\5\n\6\2NM\3\2\2\2NO"+
		"\3\2\2\2OP\3\2\2\2PQ\5\f\7\2Q\t\3\2\2\2RW\5\6\4\2ST\7\3\2\2TV\5\6\4\2"+
		"US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\13\3\2\2\2YW\3\2\2\2Z\\\5\16"+
		"\b\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_]\3\2\2\2`c\5"+
		"\20\t\2ac\5\26\f\2b`\3\2\2\2ba\3\2\2\2c\17\3\2\2\2de\7\17\2\2ef\7\34\2"+
		"\2fg\7\20\2\2gh\7\b\2\2h\21\3\2\2\2ij\5\34\17\2jq\b\n\1\2kl\7\30\2\2l"+
		"m\5\36\20\2mn\b\n\1\2np\3\2\2\2ok\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2rt\3\2\2\2sq\3\2\2\2tu\b\n\1\2u\23\3\2\2\2vw\5\22\n\2wx\b\13\1\2xy\7"+
		"\30\2\2y\25\3\2\2\2z|\5\24\13\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\30\r"+
		"\2~\27\3\2\2\2\177\u0083\t\2\2\2\u0080\u0082\5\32\16\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\31\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\t\2\2\u0087\u0088\5\22\n"+
		"\2\u0088\u0089\b\16\1\2\u0089\u008a\7\n\2\2\u008a\u008f\3\2\2\2\u008b"+
		"\u008c\5 \21\2\u008c\u008d\b\16\1\2\u008d\u008f\3\2\2\2\u008e\u0086\3"+
		"\2\2\2\u008e\u008b\3\2\2\2\u008f\33\3\2\2\2\u0090\u0091\5 \21\2\u0091"+
		"\u0092\b\17\1\2\u0092\u0097\3\2\2\2\u0093\u0094\5\36\20\2\u0094\u0095"+
		"\b\17\1\2\u0095\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2"+
		"\u0097\35\3\2\2\2\u0098\u009c\t\3\2\2\u0099\u009b\5\32\16\2\u009a\u0099"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a1\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\5(\25\2\u00a0\u0098\3\2"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\37\3\2\2\2\u00a2\u00ae\7\r\2\2\u00a3\u00a4"+
		"\5\"\22\2\u00a4\u00a5\b\21\1\2\u00a5\u00ae\3\2\2\2\u00a6\u00a7\7\16\2"+
		"\2\u00a7\u00ae\b\21\1\2\u00a8\u00a9\5&\24\2\u00a9\u00aa\b\21\1\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00ac\7\34\2\2\u00ac\u00ae\b\21\1\2\u00ad\u00a2\3"+
		"\2\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae!\3\2\2\2\u00af\u00b0\7\36\2\2\u00b0\u00b5\b\22\1"+
		"\2\u00b1\u00b2\5$\23\2\u00b2\u00b3\b\22\1\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00af\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\7\36\2\2"+
		"\u00b7\u00b8\7\4\2\2\u00b8\u00b9\7\36\2\2\u00b9%\3\2\2\2\u00ba\u00bb\t"+
		"\4\2\2\u00bb\'\3\2\2\2\u00bc\u00be\7\7\2\2\u00bd\u00bf\5\32\16\2\u00be"+
		"\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7\25"+
		"\2\2\u00c1\u00c9\7\b\2\2\u00c2\u00c3\7\5\2\2\u00c3\u00c4\5\32\16\2\u00c4"+
		"\u00c5\5\f\7\2\u00c5\u00c7\7\31\2\2\u00c6\u00c8\5\32\16\2\u00c7\u00c6"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c2\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d1\7\31\2\2\u00d0"+
		"\u00d2\5\32\16\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2)\3\2\2"+
		"\2\27-\628@NW]bq{\u0083\u008e\u0096\u009c\u00a0\u00ad\u00b4\u00be\u00c7"+
		"\u00cb\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}