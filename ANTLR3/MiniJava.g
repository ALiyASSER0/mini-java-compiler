grammar ArithmeticExpressions;

options {output=AST;}
tokens{
Start;
GeneralArithExpr;
Term;
Factor;
Method;
MainMethod;
COMMENT;
Assigment;
Forloop;
Whilestmt;
Decl;
Ifstmt;
Double_dec;
Int_dec;
Bool_decl;
Normal_decl;
Other_decl;
Arr_decl;
ClassDec;
TYPE;
String_Dec;
Condition;
Conditions;
MiniMethod;
PrintStmt;
ArrayInitialize;
ArrayAccess;
ArrayDeclaration;
}
@members {
String s="";
}


start	:	(classDec+) -> ^(Start classDec+);
// catch blocks go first
catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
    
// The finally clause is the last part a rule executes before returning.
finally { s = s + "Exit..."+"\n"; }
  
classDec:	(Modifier? Class VAR ('extends' VAR)? '{' stmt*  '}') ->^(ClassDec Modifier? Class VAR '{' stmt* '}');
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }

ifstmt  :    
	('if' '(' cond ')' ifContent ('else' ifContent)? )
	 -> ^(Ifstmt 'if' '(' cond ')' ifContent ('else' ifContent)?)
	;
	cond	:test ((RelationalOperators|'+'|'*'|'-'|'/') test)*;

test	:argument |'!' test|'('cond ')'|mthds;

mthds	:miniMethod|miniMethodNoParams|callMeth;

stmt    :   (
	(decl) -> ^(Decl decl)
	|(ifstmt) -> ^(Ifstmt ifstmt)
	|(whilestmt) -> ^(Whilestmt whilestmt)
	|(forloop) -> ^(Forloop forloop)
	|(assigment) -> ^(Assigment assigment)
	|(method) -> ^(Method method)
	|(string_dec) -> ^(String_Dec string_dec)
	|(nodeMiniMethod) -> ^(Factor nodeMiniMethod)
	|(nodeMiniMethodNoParams) -> ^(Factor nodeMiniMethodNoParams)
	|(printStatement) -> ^(PrintStmt printStatement)
	|(main) -> ^(MainMethod main)
	|(arrayAccess) -> ^(ArrayAccess arrayAccess)
	|(arrayDeclaration) -> ^(ArrayDeclaration arrayDeclaration)
	|(arrayInitialize) -> ^(ArrayInitialize arrayInitialize)
	

	);
	// catch blocks go first
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }

method	:
	(Modifier types VAR params '{' stmt* return_stmt SEMICOLON'}')
	 -> ^(Method Modifier types VAR params '{' stmt* return_stmt SEMICOLON'}')
	;
	  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }


main 	:Modifier 'static' 'void' 'main' '(' 'String' '[' ']' VAR ')' '{' stmt* '}';
	
params	:	'('((types VAR) (',' types VAR)*)? ')';
decl    :   
	(int_dec)	-> ^(Int_dec int_dec)
	|(double_dec) -> ^(Double_dec double_dec)
	|(bool_decl) -> ^(Bool_decl bool_decl)
	//|normal_decl -> ^(Normal_decl normal_decl)
	| (other_decl) -> ^(Other_decl other_decl)
	|(arr_decl) -> ^(Arr_decl arr_decl)
	;
	  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
	
	
whilestmt	:	
	('while' '(' cond ')' '{' stmt* '}')
	 -> ^(Whilestmt 'while' '(' cond ')' '{' stmt* '}')
	; 
   catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; } 
	
ifContent:('{' stmt* '}'|stmt);
forloop	:   
	'for' '(' (decl) (condition) SEMICOLON (VAR change) ')' '{' stmt* '}'
	;
assigment:   
	(assign)
	-> ^(Assigment assign)
	;
	
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }

assign	:	
	VAR (change|'=' generalArithExpr |'=' printNew) SEMICOLON
	;
change	:
	('++'|'--'|('+='|'-=')generalArithExpr)
	;
//conditionIf
	//:(( condition |'!' '(' condition ')')|  '!' condition |('!' VAR) )(AndOr  '!' '(' condition ')' )?;
	
	


//if ((!current_node.GetHas_Right()) && (!current_node.GetHas_Left()) )
                
condition:   
	(generalArithExpr (RelationalOperators generalArithExpr (RelationalOperators condition)?)?)
	->^(Condition (generalArithExpr RelationalOperators generalArithExpr (RelationalOperators condition)?)?)
	;
  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
int_dec	:	
	//(Modifier? INT VAR '=' (NUM|VAR) (Operation (NUM|VAR))* SEMICOLON)
	Modifier? INT VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;
  
double_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	Modifier? DOUBLE VAR (('=' generalArithExpr)?|(',' VAR)*) SEMICOLON
	;
normal_decl: VAR  ('=' generalArithExpr)? SEMICOLON;

bool_decl:'boolean' VAR SEMICOLON;

other_decl: types VAR SEMICOLON ;

arr_decl:VAR '=' arrayDeclaration SEMICOLON
	|arrayDeclaration '=' arrayDeclaration SEMICOLON
;

string_dec:	
	//(Modifier? DOUBLE VAR '=' (DNUM|NUM|VAR) (Operation (DNUM|NUM|VAR))* SEMICOLON)
	(Modifier? STRING VAR ('=' Strings)? SEMICOLON)
	 -> ^(String_Dec Modifier? STRING VAR ('=' Strings)? SEMICOLON)
	;
	
	  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }

generalArithExpr: term (('+' | '-')^  term)*
	//-> ^(GeneralArithExpr term (('+' | '-')  term)*)	
	;

term	: factor ( ( '*' | '/' )^ factor)* 
	//-> ^(Term factor ( ( '*' | '/' ) factor)*)
	;


printStatement : 'System.out.println' '(' printContent?  ')' SEMICOLON;factor	:  
	(VAR) -> ^(Factor VAR)
	|(NUM) -> ^(Factor NUM)
	|(DNUM) -> ^(Factor DOUBLE)
	|('-'  VAR) -> ^(Factor  '-' VAR)
	|('-'  INT) -> ^(Factor  '-' INT)
	|('-'  DNUM)  -> ^(Factor  '-' DOUBLE)
	|('(' generalArithExpr ')'('.'miniMethod)?) -> ^(Factor  '(' generalArithExpr ')' ('.'miniMethod)?)
	//| Fun '(' generalArithExpr ')' -> ^(Factor Fun '(' generalArithExpr ')')
	|(nodeMiniMethod) -> ^(Factor nodeMiniMethod)
	|(miniMethodNoParams) -> ^(Factor miniMethodNoParams)
	|(nodeCallMeth) -> ^(Factor nodeCallMeth)
	
	;
	  catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
	
	
	
///////////
  

printNew:'new' nodeMiniMethod;
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  nodeMiniMethod: (miniMethod)  -> ^(Factor miniMethod );
    catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
  nodeMiniMethodNoParams:(miniMethodNoParams) -> ^(Factor miniMethodNoParams);
    catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
  nodeCallMeth:(callMeth) -> ^(Factor callMeth);
    catch[MismatchedTokenException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[NoViableAltException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
  catch[RecognitionException e] { s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";}
finally { s = s + "Exit..."+"\n"; }
  
miniMethod : miniMethodExtention ('.' miniMethodExtention)*;
  
miniMethodExtention:  VAR ('(' miniMethodparams? ')');

miniMethodparams:(generalArithExpr (',' generalArithExpr )*) ;

miniMethodNoParams: VAR+ ('.' miniMethodExtention)+;
callMeth:VAR ('.' VAR);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
array	:	 arrayDeclaration ;

arrayAccess
	:	VAR '[' (numbers|VAR) ']' '=' (numbers|VAR) SEMICOLON
		|VAR '[' (numbers|VAR) ']'  SEMICOLON 
		|VAR '[' (numbers|VAR) ']' '=' (numbers|VAR) ('+' | '-' | '*' | '/') (numbers|VAR) SEMICOLON
		;

arrayDeclaration: datatype '['']' VAR SEMICOLON
		| datatype '['']' VAR '=' 'new' datatype '['(numbers|Strings)?']'SEMICOLON
		|VAR '['VAR']'
		;
arrayInitialize
	:	datatype '['']' VAR '=' '{' (numbers | Strings) '}' SEMICOLON
	|	VAR '=' '{' (numbers)? '}' SEMICOLON
	|	VAR '=' '{' (Strings)? '}' SEMICOLON
	|	VAR '=' 'new' datatype '[' (numbers | VAR)? ']' ( '{' (numbers | Strings) '}')? SEMICOLON
	|	datatype '['']' VAR '=' 'new' datatype '['']' '{' (numbers | Strings)? '}' SEMICOLON
	;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
Class:'class';
types	:	STRING|BOOLEAN|DOUBLE|INT|VAR;

Modifier:	'private'|'public';   
//Fun	: 'sin' | 'cos'| 'tan' ;
INT	:	'int';
DOUBLE	:	'double';
VOID	:	'void';
BOOLEAN	:	'boolean';
STRING  :	'String';
VAR	:	('a'..'z'|'A'..'Z'|'$'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'$')*;
NUM	:	('0'..'9')*;
DNUM	:	('0'..'9')* '.' ('0'..'9')*;
SEMICOLON:	';' ;
Strings	:	'"' (.)* '"';
RelationalOperators:   '=='|'!='|'>'|'<'|'>='|'<='|'&&'|'||';
return_stmt:	'return' argument;
argument: NUM|VAR ;
numbers : NUM (',' NUM)*;
opration_argu: argument ( ('/'|'*'|'+'|'-') argument)?;
printContent:Strings|NUM|miniMethod|printNew|miniMethodNoParams|NUM ('/'|'*'|'+'|'-') NUM|arrayDeclaration ;
datatype:'byte'|'short'| 'int'| 'long'| 'float'| 'double'| 'boolean' |'char'|'String';
ML_COMMENT	:	'/*' ( options {greedy=false;} : .)* '*/'+{skip();};
SL_COMMENT	:	'//' (.)*'\n'+{skip();};
WhiteSpace:	(' '|'\n'|'\r'|'\t')+{skip();};

//auxkey2 = (p_node.GetLeft()).GetKey() ;





