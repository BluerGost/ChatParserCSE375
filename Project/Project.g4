// Define a grammar called Project
grammar Project;
//Parser Rules
chat                : (line)+ EOF ;
 
line                : name command message NEWLINE;
 
message             : ( NEWLINE| mention  | WORD | WHITESPACE | emotion | math )+ ;
 
name                : (NEWLINE)? WORD WHITESPACE;
 
command             : (SAYS | SHOUTS) ':' WHITESPACE ;
                                        
mention             : '@' WORD ;//mention someone

emotion               : EMOJI;

math: DIGIT OPERAND DIGIT;

//Laxer Rules
fragment A          : ('A'|'a') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment O          : ('O'|'o') ;
fragment U          : ('U'|'u') ;
fragment T          : ('T'|'t') ;
 
 
SAYS                : S A Y S ;//fragments used here
 
SHOUTS              : S H O U T S;//fragments used here
 
WORD                : ('a'..'z' | 'A'..'Z' )+ ;//1 or more 
 
WHITESPACE          : (' ' | '\t') ;//empty space or tab
 
NEWLINE             : (('\r')? '\n' | '\r')+ ;

fragment SMILE    : ':' ')';
fragment WELLDONE  : '(' 'y' ')';
fragment SAD    : ':' '(';
fragment JOKING : ':' 'p';

EMOJI : (SMILE | WELLDONE | SAD | JOKING)+;

fragment PLUS: '+';
fragment MINUS: '-';
fragment MULTIPLY: '*';
fragment DIVIDE: '/';

OPERAND:(PLUS | MINUS | MULTIPLY | DIVIDE)+;

fragment NUMBER: '0'..'9'; 
//DIGIT : (NUMBER (.(NUMBER)?)* )+;
DIGIT : (NUMBER)+;
