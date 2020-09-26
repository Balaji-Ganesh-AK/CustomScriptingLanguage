grammar MegaScrypt;

/* Parser Rules */

program: (statement|block )*;

statement:
		(declaration |
		assignment| increment | bincrement| invocation| returnStmt|Break|Continue) ';' |ifStmt|forLoop |whileLoop|forEachLoop|doWhileLoop 
;
compoundId: objectGet | Id;
declaration: 'var' (Id|objectGet)('=' (expression | object| array))?;

assignment: compoundId '=' (expression|object|array)|
			compoundId '=' expression |
			compoundId  '/=' expression |
			compoundId '*=' expression |
			compoundId '+=' expression |
			compoundId '-=' expression
;


increment: 	    Id ('++' | '--');
bincrement:		('++' | '--') Id;

block: '{' statement* '}' | statement;



ifStmt: 'if' '(' expression')'block elseifStmt* (elseStmt)?;
elseifStmt: 'else' 'if' '(' expression ')' block;
elseStmt: 'else' block;



expression:
		Number | Id| 'true'|'false'|
		'(' expression ')'| funcDeclearation|
		'-' expression |
		'!' expression|
		invocation|
		array|
		expression ('*' |'/'|'%')expression |
		expression ('+' |'-')expression |
		expression ('<'|'>'|'=='|'!='|'<=' |'>=') expression|
		expression ('*='|'/=') expression|
		expression '&&' expression|
		expression '||' expression |
		bincrement | 
		Id ('++' |'--')|
		Null|
		String|
		objectGet|
		compoundId
		
		 
;


funcDeclearation: 'function' '(' varList? ')' '{' statement*'}' ;
varList:'var' Id ( ',' 'var' Id)*;
returnStmt: 'return' expression?;

invocation: compoundId '(' paramList? ')' ;
paramList: expression (',' expression )* ;


object: '{' (objectPair ','?)* '}';
objectPair: Id ':' (expression | object | array);
objectGet: (objectValidEntry) ('.' objectValidEntry)*;
objectValidEntry: Id arrayIndex?;

array: '[' paramList? ']';
arrayIndex: '[' expression ']';

forLoop: 'for' '(' 'var' Id '=' expression ';'  Id('<' | '>' | '<=' | '>=') expression ';'(increment | bincrement) ')' block;
whileLoop: 'while' '(' expression ')' block;
forEachLoop: 'foreach' '(' 'var' Id 'in' compoundId ')' block;
doWhileLoop: 'do' block 'while' '(' expression ')';

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
Decrement:           '--';
Break:				'break';
Continue:			'continue';
Multiply:           '*';
Divide:             '/';
LeftParenthesis:    '(';  
RightParenthesis:   ')'; 
Dot:                '.';
And:			    '&&';
Modulus:            '%';
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
LeftBracket:		'[';
RightBracket:		']';
Null:				'null';
Id:					('_'| Letter)('_'|Letter|Digit)* ;
Number:				Digit+('.' Digit*)?; 
String:             '"' ('\\"' | ~('\r' | '\n'))*? '"';
WhiteSpace:       [ \t\r\n]+ -> skip;
		