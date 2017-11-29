grammar rc;

programa : (NOVO_JOGO | NOVO_ROBO ID) defop* defcom* FIM ;

defop: DEFOP ID_OPERADOR args? RETURNS TYPE composicao_seta OUT;
arg: ID AS TYPE;

defcom: DEFCOM ID_COMANDO args? corpo;

args: (arg (',' arg)*);

corpo : instrucao*;
instrucao : declaracao | composicao;

declaracao : LET ID BE TYPE;

composicao_seta_argumento : op_ini (OP_SETA op)*;
composicao_seta:  composicao_seta_argumento OP_SETA;
composicao : composicao_seta? comando;

comando : (ID_COMANDO_RESERVADO | ID_COMANDO) parametro*;

parametro : ABRE_PARENTESES composicao_seta_argumento FECHA_PARENTESES | valor;

op_ini : valor | op;

op : (ID_OP_RESERVADO | ID_OPERADOR) parametro* | if_statement;
valor : ID_OP_RESERVADO| numero | LITERAL | logico | ID ;

numero : NUMBER | float_number;
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
