grammar rc;

programa : (NOVO_JOGO | NOVO_ROBO ID) defop* defcom* FIM ;

defop: DEFOP ID_OPERADOR args? RETURNS TYPE composicao_seta OUT;
arg: ID AS TYPE;

defcom: DEFCOM ID_COMANDO args? corpo;

args: (arg (',' arg)*);

corpo : instrucao*;
instrucao : declaracao | composicao;

declaracao : LET ID BE TYPE;

composicao_seta_argumento returns [tipo] locals [tipo_atual] : op_ini {$tipo_atual = $op_ini.tipo;} (OP_SETA op[tipo_atual] {$tipo_atual = $op.tipo;})* {$tipo = $tipo_atual;};
composicao_seta returns [tipo]:  composicao_seta_argumento {$tipo = $composicao_seta_argumento.tipo;} OP_SETA;
composicao : composicao_seta? comando[$composicao_seta.tipo];

comando [primeiro_argumento] : (ID_COMANDO_RESERVADO | ID_COMANDO) parametro*;

parametro returns [tipo] : ABRE_PARENTESES composicao_seta_argumento {$tipo = $composicao_seta_argumento.tipo;} FECHA_PARENTESES | valor {%tipo = $valor.tipo;};

op_ini returns [tipo] : valor {$tipo = $valor.tipo;} | op[null] {$tipo = $op.tipo;};

op [tipo_herdado] returns [tipo]: (ID_OP_RESERVADO | ID_OPERADOR) parametro* | if_statement;
valor returns [tipo] :ID_OP_RESERVADO| numero {$tipo = $numero.tipo;} | LITERAL {$tipo = "literal"}  | logico {$tipo = "logico"} | ID {%tipo = "variavel"};

numero returns [tipo] : NUMBER {$tipo = "inteiro"}  | float_number {$tipo = "flutuante"};
float_number : NUMBER '.' NUMBER;
logico : TRUE|FALSE;

if_statement : IF parametro? RETURNS TYPE ('Is' parametro corpo OUT parametro?)+ 'Default' corpo OUT parametro?;

IF: 'If';
TYPE : 'integer'| 'literal'| 'floating'| 'logical'| 'list';
ABRE_PARENTESES : '(';
FECHA_PARENTESES : ')';
TRUE: 'true';
FALSE: 'false';
ID_OP_RESERVADO : '+' | '-' | '/' | '*' | 'mod';
LITERAL : '"' ~('\r' | '\n' | '"')* '"' ;
LET : 'Let';
BE : 'be';

NOVO_JOGO : 'new game';
NOVO_ROBO : 'new robot';

DEFCOM: 'defcom';
DEFOP: 'defop';
RETURNS: 'returns';
AS: 'as';

FIM : 'end';
OP_SETA : '→'|'->';
OUT: 'Out';
ID_COMANDO_RESERVADO : 'Assign' | OUT | 'Print';
ID_COMANDO : [A-Z]+ ([a-z] | [A-Z])*;

ID     : ([a-z] | [A-Z])+ ;
ID_OPERADOR : '_' ([a-z] | [A-Z])+;

NUMBER : [0-9]+ ;
WS     : [ \n\t]+ -> skip;
