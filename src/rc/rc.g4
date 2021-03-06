grammar rc;

@header {
package rc;
}
programa : decl_jogo | decl_robo ;
decl_jogo : NOVO_JOGO ID defop* defcom* FIM ;
decl_robo : NOVO_ROBO ID defop* defcom* FIM ;
defop: DEFOP ID_OPERADOR args? RETURNS TYPE retorno;
defcom: DEFCOM ID_COMANDO args? corpo;
defev : DEFEVE ID_EV corpo;
arg: ID AS TYPE;
args: (arg (',' arg)*);
retorno: composicao_seta OUT | OUT parametro;
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

op_if : ID_OP_RELACIONAL parametro*;

valor : NUMERO | LITERAL | LOGICO | ID ;
NUMERO : NUMBER | FLOAT_NUMBER;
FLOAT_NUMBER : NUMBER '.' NUMBER;
LOGICO : TRUE|FALSE;
// if_statement : IF parametro? RETURNS TYPE ('Is' parametro corpo OUT parametro?)+ 'Default' corpo OUT parametro?;
if_statement : IF parametro? RETURNS TYPE ('Is' op_if retorno)+ 'Default' retorno;
IF: 'If';
TYPE : 'integer'| 'literal'| 'floating'| 'logical';
ABRE_PARENTESES : '(';
FECHA_PARENTESES : ')';
TRUE: 'true';
FALSE: 'false';


DEFEVE: 'defev';
ID_EV : '@'ID;
ID_OP_RELACIONAL : 'equal' | 'lesser' | 'greater' ;
ID_OP_RESERVADO : '+' | '-' | '/' | '*' | 'mod' | 'pow' | 'sqrt' | 'and' | 'or' | 'not';

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
ID_COMANDO : [A-Z]+ ([a-z] | [A-Z] | [0-9])*;
ID     : [a-z] ([a-z] | [A-Z] | [0-9])* ;
ID_OPERADOR : '_' ([a-z] | [A-Z] | [0-9])+;
NUMBER : [0-9]+ ;
WS     : [ \n\t]+ -> skip;
