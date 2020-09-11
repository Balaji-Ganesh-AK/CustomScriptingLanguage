grammar DNEScrypt;

/* Parser Rules */

program: (statement|block )*;

statement:
		(declaration |
		assignment| increment | bincrement) ';' |ifStmt 
;
declaration: 'var' (Id|objectGet)('=' (expression|object))?;
assignment: (Id  | objectGet) '=' (expression|object)|
			Id '=' expression |
			Id  '/=' expression |
			Id '*=' expression |
			Id '+=' expression |
			Id '-=' expression
;
increment: 	    Id ('++' | '--');
bincrement:		('++' | '--') Id;

block: '{' statement* '}' | statement;

ifStmt: 'if' '(' expression')'block elseifStmt* (elseStmt)?;
elseifStmt: 'else' '(' expression ')' block;
elseStmt: 'else' block;
expression:
		Number | Id| 'true'|'false'|
		'(' expression ')'|
		'-' expression |
		'!' expression|
		expression ('*' |'/')expression |
		expression ('+' |'-')expression |
		expression ('<'|'>'|'=='|'!='|'<=' |'>=') expression|
		expression ('*='|'/=') expression|
		expression '&&' expression|
		expression '||' expression |
		bincrement | 
		Id ('++' |'--')|
		Null|
		String|
		objectGet
		
		 
;

object: '{' (objectPair ','?)* '}';
objectPair: Id ':' (expression|object);
objectGet: Id ('.' Id)+;

/* Lexer Rules */

True:               'true';
False:				'false';
Var: 				'var';
Equals: 			'=';
fragment Digit:     [0-9];
fragment Letter: 	[a-zA-Z];
Underscore: 		'_';
Add:                '+';
Increment:          '++';
Minus:              '-';
Decrement:            '--';
Multiply:           '*';
Divide:             '/';
LeftParenthesis:    '(';  
RightParenthesis:   ')'; 
Dot:                '.';
And:			    '&&';
Or:			        '||';
Not:				'!';
DivideEquals:		'/=';
SubEquals:		    '-=';
MultiplyEquals:		'*=';
AddEquals:		    '+=';
DoubleEquals:		'==';
NotEquals:			'!=';
LessOrEqual:        '<=';
GreaterOrEqual:		'>=';
GreaterThan:        '>';
LessThan:			'<';
Null:				'null';
Id:					('_'| Letter)('_'|Letter|Digit)* ;
Number:				Digit+('.' Digit*)?; 
String:             '"' ('\\"' | ~('\r' | '\n'))*? '"';
WhiteSpace:       [ \t\r\n]+ -> skip;
		