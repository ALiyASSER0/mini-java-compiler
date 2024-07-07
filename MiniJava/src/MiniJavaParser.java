// $ANTLR 3.4 /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g 2024-05-12 10:07:02

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arr_decl", "ArrayAccess", "ArrayDeclaration", "ArrayInitialize", "Assigment", "BOOLEAN", "Bool_decl", "COMMENT", "Class", "ClassDec", "Condition", "Conditions", "DNUM", "DOUBLE", "Decl", "Double_dec", "Factor", "Forloop", "GeneralArithExpr", "INT", "Ifstmt", "Int_dec", "ML_COMMENT", "MainMethod", "Method", "MiniMethod", "Modifier", "NUM", "Normal_decl", "Other_decl", "PrintStmt", "RelationalOperators", "SEMICOLON", "SL_COMMENT", "STRING", "Start", "String_Dec", "Strings", "TYPE", "Term", "VAR", "VOID", "Whilestmt", "WhiteSpace", "'!'", "'('", "')'", "'*'", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'.'", "'/'", "'='", "'System.out.println'", "'['", "']'", "'byte'", "'char'", "'else'", "'extends'", "'float'", "'for'", "'if'", "'long'", "'main'", "'new'", "'return'", "'short'", "'static'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int Arr_decl=4;
    public static final int ArrayAccess=5;
    public static final int ArrayDeclaration=6;
    public static final int ArrayInitialize=7;
    public static final int Assigment=8;
    public static final int BOOLEAN=9;
    public static final int Bool_decl=10;
    public static final int COMMENT=11;
    public static final int Class=12;
    public static final int ClassDec=13;
    public static final int Condition=14;
    public static final int Conditions=15;
    public static final int DNUM=16;
    public static final int DOUBLE=17;
    public static final int Decl=18;
    public static final int Double_dec=19;
    public static final int Factor=20;
    public static final int Forloop=21;
    public static final int GeneralArithExpr=22;
    public static final int INT=23;
    public static final int Ifstmt=24;
    public static final int Int_dec=25;
    public static final int ML_COMMENT=26;
    public static final int MainMethod=27;
    public static final int Method=28;
    public static final int MiniMethod=29;
    public static final int Modifier=30;
    public static final int NUM=31;
    public static final int Normal_decl=32;
    public static final int Other_decl=33;
    public static final int PrintStmt=34;
    public static final int RelationalOperators=35;
    public static final int SEMICOLON=36;
    public static final int SL_COMMENT=37;
    public static final int STRING=38;
    public static final int Start=39;
    public static final int String_Dec=40;
    public static final int Strings=41;
    public static final int TYPE=42;
    public static final int Term=43;
    public static final int VAR=44;
    public static final int VOID=45;
    public static final int Whilestmt=46;
    public static final int WhiteSpace=47;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MiniJavaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "/home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g"; }


    String s="";


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:1: start : ( classDec )+ -> ^( Start ( classDec )+ ) ;
    public final MiniJavaParser.start_return start() throws RecognitionException {
        MiniJavaParser.start_return retval = new MiniJavaParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.classDec_return classDec1 =null;


        RewriteRuleSubtreeStream stream_classDec=new RewriteRuleSubtreeStream(adaptor,"rule classDec");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:7: ( ( classDec )+ -> ^( Start ( classDec )+ ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:9: ( classDec )+
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:9: ( classDec )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Class||LA1_0==Modifier) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:9: classDec
            	    {
            	    pushFollow(FOLLOW_classDec_in_start112);
            	    classDec1=classDec();

            	    state._fsp--;

            	    stream_classDec.add(classDec1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: classDec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 39:19: -> ^( Start ( classDec )+ )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:39:22: ^( Start ( classDec )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Start, "Start")
                , root_1);

                if ( !(stream_classDec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_classDec.hasNext() ) {
                    adaptor.addChild(root_1, stream_classDec.nextTree());

                }
                stream_classDec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class classDec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classDec"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:1: classDec : ( Modifier )? Class VAR ( 'extends' VAR )? '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) ;
    public final MiniJavaParser.classDec_return classDec() throws RecognitionException {
        MiniJavaParser.classDec_return retval = new MiniJavaParser.classDec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier2=null;
        Token Class3=null;
        Token VAR4=null;
        Token string_literal5=null;
        Token VAR6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        MiniJavaParser.stmt_return stmt8 =null;


        Object Modifier2_tree=null;
        Object Class3_tree=null;
        Object VAR4_tree=null;
        Object string_literal5_tree=null;
        Object VAR6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_Class=new RewriteRuleTokenStream(adaptor,"token Class");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:9: ( ( Modifier )? Class VAR ( 'extends' VAR )? '{' ( stmt )* '}' -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:11: ( Modifier )? Class VAR ( 'extends' VAR )? '{' ( stmt )* '}'
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:11: ( Modifier )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==Modifier) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:11: Modifier
                    {
                    Modifier2=(Token)match(input,Modifier,FOLLOW_Modifier_in_classDec157);  
                    stream_Modifier.add(Modifier2);


                    }
                    break;

            }


            Class3=(Token)match(input,Class,FOLLOW_Class_in_classDec160);  
            stream_Class.add(Class3);


            VAR4=(Token)match(input,VAR,FOLLOW_VAR_in_classDec162);  
            stream_VAR.add(VAR4);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:31: ( 'extends' VAR )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==68) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:32: 'extends' VAR
                    {
                    string_literal5=(Token)match(input,68,FOLLOW_68_in_classDec165);  
                    stream_68.add(string_literal5);


                    VAR6=(Token)match(input,VAR,FOLLOW_VAR_in_classDec167);  
                    stream_VAR.add(VAR6);


                    }
                    break;

            }


            char_literal7=(Token)match(input,79,FOLLOW_79_in_classDec171);  
            stream_79.add(char_literal7);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:52: ( stmt )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BOOLEAN||LA4_0==DOUBLE||LA4_0==INT||LA4_0==Modifier||LA4_0==STRING||LA4_0==VAR||LA4_0==62||(LA4_0 >= 65 && LA4_0 <= 66)||(LA4_0 >= 69 && LA4_0 <= 72)||LA4_0==76||LA4_0==78) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:52: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_classDec173);
            	    stmt8=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt8.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            char_literal9=(Token)match(input,80,FOLLOW_80_in_classDec177);  
            stream_80.add(char_literal9);


            // AST REWRITE
            // elements: 79, stmt, 80, Class, VAR, Modifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 48:63: -> ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:65: ^( ClassDec ( Modifier )? Class VAR '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ClassDec, "ClassDec")
                , root_1);

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:76: ( Modifier )?
                if ( stream_Modifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Modifier.nextNode()
                    );

                }
                stream_Modifier.reset();

                adaptor.addChild(root_1, 
                stream_Class.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:48:100: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_80.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classDec"


    public static class ifstmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifstmt"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:53:1: ifstmt : 'if' '(' cond ')' ifContent ( 'else' ifContent )? -> ^( Ifstmt 'if' '(' cond ')' ifContent ( 'else' ifContent )? ) ;
    public final MiniJavaParser.ifstmt_return ifstmt() throws RecognitionException {
        MiniJavaParser.ifstmt_return retval = new MiniJavaParser.ifstmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        Token string_literal15=null;
        MiniJavaParser.cond_return cond12 =null;

        MiniJavaParser.ifContent_return ifContent14 =null;

        MiniJavaParser.ifContent_return ifContent16 =null;


        Object string_literal10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;
        Object string_literal15_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_ifContent=new RewriteRuleSubtreeStream(adaptor,"rule ifContent");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:53:9: ( 'if' '(' cond ')' ifContent ( 'else' ifContent )? -> ^( Ifstmt 'if' '(' cond ')' ifContent ( 'else' ifContent )? ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:54:2: 'if' '(' cond ')' ifContent ( 'else' ifContent )?
            {
            string_literal10=(Token)match(input,71,FOLLOW_71_in_ifstmt232);  
            stream_71.add(string_literal10);


            char_literal11=(Token)match(input,49,FOLLOW_49_in_ifstmt234);  
            stream_49.add(char_literal11);


            pushFollow(FOLLOW_cond_in_ifstmt236);
            cond12=cond();

            state._fsp--;

            stream_cond.add(cond12.getTree());

            char_literal13=(Token)match(input,50,FOLLOW_50_in_ifstmt238);  
            stream_50.add(char_literal13);


            pushFollow(FOLLOW_ifContent_in_ifstmt240);
            ifContent14=ifContent();

            state._fsp--;

            stream_ifContent.add(ifContent14.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:54:30: ( 'else' ifContent )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==67) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:54:31: 'else' ifContent
                    {
                    string_literal15=(Token)match(input,67,FOLLOW_67_in_ifstmt243);  
                    stream_67.add(string_literal15);


                    pushFollow(FOLLOW_ifContent_in_ifstmt245);
                    ifContent16=ifContent();

                    state._fsp--;

                    stream_ifContent.add(ifContent16.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: cond, 50, ifContent, 71, 67, 49, ifContent
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:3: -> ^( Ifstmt 'if' '(' cond ')' ifContent ( 'else' ifContent )? )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:55:6: ^( Ifstmt 'if' '(' cond ')' ifContent ( 'else' ifContent )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Ifstmt, "Ifstmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_71.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_49.nextNode()
                );

                adaptor.addChild(root_1, stream_cond.nextTree());

                adaptor.addChild(root_1, 
                stream_50.nextNode()
                );

                adaptor.addChild(root_1, stream_ifContent.nextTree());

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:55:43: ( 'else' ifContent )?
                if ( stream_67.hasNext()||stream_ifContent.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_67.nextNode()
                    );

                    adaptor.addChild(root_1, stream_ifContent.nextTree());

                }
                stream_67.reset();
                stream_ifContent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifstmt"


    public static class cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:57:2: cond : test ( ( RelationalOperators | '+' | '*' | '-' | '/' ) test )* ;
    public final MiniJavaParser.cond_return cond() throws RecognitionException {
        MiniJavaParser.cond_return retval = new MiniJavaParser.cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set18=null;
        MiniJavaParser.test_return test17 =null;

        MiniJavaParser.test_return test19 =null;


        Object set18_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:57:7: ( test ( ( RelationalOperators | '+' | '*' | '-' | '/' ) test )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:57:8: test ( ( RelationalOperators | '+' | '*' | '-' | '/' ) test )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_test_in_cond282);
            test17=test();

            state._fsp--;

            adaptor.addChild(root_0, test17.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:57:13: ( ( RelationalOperators | '+' | '*' | '-' | '/' ) test )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RelationalOperators||(LA6_0 >= 51 && LA6_0 <= 52)||LA6_0==56||LA6_0==60) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:57:14: ( RelationalOperators | '+' | '*' | '-' | '/' ) test
            	    {
            	    set18=(Token)input.LT(1);

            	    if ( input.LA(1)==RelationalOperators||(input.LA(1) >= 51 && input.LA(1) <= 52)||input.LA(1)==56||input.LA(1)==60 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set18)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_test_in_cond297);
            	    test19=test();

            	    state._fsp--;

            	    adaptor.addChild(root_0, test19.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cond"


    public static class test_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "test"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:1: test : ( argument | '!' test | '(' cond ')' | mthds );
    public final MiniJavaParser.test_return test() throws RecognitionException {
        MiniJavaParser.test_return retval = new MiniJavaParser.test_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        MiniJavaParser.argument_return argument20 =null;

        MiniJavaParser.test_return test22 =null;

        MiniJavaParser.cond_return cond24 =null;

        MiniJavaParser.mthds_return mthds26 =null;


        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:6: ( argument | '!' test | '(' cond ')' | mthds )
            int alt7=4;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RelationalOperators||(LA7_1 >= 50 && LA7_1 <= 52)||LA7_1==56||LA7_1==60) ) {
                    alt7=1;
                }
                else if ( (LA7_1==VAR||LA7_1==49||LA7_1==59) ) {
                    alt7=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
                }
                break;
            case 48:
                {
                alt7=2;
                }
                break;
            case 49:
                {
                alt7=3;
                }
                break;
            case NUM:
                {
                alt7=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:7: argument
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_argument_in_test306);
                    argument20=argument();

                    state._fsp--;

                    adaptor.addChild(root_0, argument20.getTree());

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:17: '!' test
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal21=(Token)match(input,48,FOLLOW_48_in_test309); 
                    char_literal21_tree = 
                    (Object)adaptor.create(char_literal21)
                    ;
                    adaptor.addChild(root_0, char_literal21_tree);


                    pushFollow(FOLLOW_test_in_test311);
                    test22=test();

                    state._fsp--;

                    adaptor.addChild(root_0, test22.getTree());

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:26: '(' cond ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal23=(Token)match(input,49,FOLLOW_49_in_test313); 
                    char_literal23_tree = 
                    (Object)adaptor.create(char_literal23)
                    ;
                    adaptor.addChild(root_0, char_literal23_tree);


                    pushFollow(FOLLOW_cond_in_test314);
                    cond24=cond();

                    state._fsp--;

                    adaptor.addChild(root_0, cond24.getTree());

                    char_literal25=(Token)match(input,50,FOLLOW_50_in_test316); 
                    char_literal25_tree = 
                    (Object)adaptor.create(char_literal25)
                    ;
                    adaptor.addChild(root_0, char_literal25_tree);


                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:59:38: mthds
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_mthds_in_test318);
                    mthds26=mthds();

                    state._fsp--;

                    adaptor.addChild(root_0, mthds26.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "test"


    public static class mthds_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mthds"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:61:1: mthds : ( miniMethod | miniMethodNoParams | callMeth );
    public final MiniJavaParser.mthds_return mthds() throws RecognitionException {
        MiniJavaParser.mthds_return retval = new MiniJavaParser.mthds_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.miniMethod_return miniMethod27 =null;

        MiniJavaParser.miniMethodNoParams_return miniMethodNoParams28 =null;

        MiniJavaParser.callMeth_return callMeth29 =null;



        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:61:7: ( miniMethod | miniMethodNoParams | callMeth )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==VAR) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt8=1;
                    }
                    break;
                case 59:
                    {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==VAR) ) {
                        int LA8_5 = input.LA(4);

                        if ( (LA8_5==RelationalOperators||(LA8_5 >= 50 && LA8_5 <= 52)||LA8_5==56||LA8_5==60) ) {
                            alt8=3;
                        }
                        else if ( (LA8_5==49) ) {
                            alt8=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;

                    }
                    }
                    break;
                case VAR:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:61:8: miniMethod
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_miniMethod_in_mthds325);
                    miniMethod27=miniMethod();

                    state._fsp--;

                    adaptor.addChild(root_0, miniMethod27.getTree());

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:61:19: miniMethodNoParams
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_miniMethodNoParams_in_mthds327);
                    miniMethodNoParams28=miniMethodNoParams();

                    state._fsp--;

                    adaptor.addChild(root_0, miniMethodNoParams28.getTree());

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:61:38: callMeth
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_callMeth_in_mthds329);
                    callMeth29=callMeth();

                    state._fsp--;

                    adaptor.addChild(root_0, callMeth29.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mthds"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:63:1: stmt : ( decl -> ^( Decl decl ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | nodeMiniMethodNoParams -> ^( Factor nodeMiniMethodNoParams ) | printStatement -> ^( PrintStmt printStatement ) | main -> ^( MainMethod main ) | arrayAccess -> ^( ArrayAccess arrayAccess ) | arrayDeclaration -> ^( ArrayDeclaration arrayDeclaration ) | arrayInitialize -> ^( ArrayInitialize arrayInitialize ) ) ;
    public final MiniJavaParser.stmt_return stmt() throws RecognitionException {
        MiniJavaParser.stmt_return retval = new MiniJavaParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.decl_return decl30 =null;

        MiniJavaParser.ifstmt_return ifstmt31 =null;

        MiniJavaParser.whilestmt_return whilestmt32 =null;

        MiniJavaParser.forloop_return forloop33 =null;

        MiniJavaParser.assigment_return assigment34 =null;

        MiniJavaParser.method_return method35 =null;

        MiniJavaParser.string_dec_return string_dec36 =null;

        MiniJavaParser.nodeMiniMethod_return nodeMiniMethod37 =null;

        MiniJavaParser.nodeMiniMethodNoParams_return nodeMiniMethodNoParams38 =null;

        MiniJavaParser.printStatement_return printStatement39 =null;

        MiniJavaParser.main_return main40 =null;

        MiniJavaParser.arrayAccess_return arrayAccess41 =null;

        MiniJavaParser.arrayDeclaration_return arrayDeclaration42 =null;

        MiniJavaParser.arrayInitialize_return arrayInitialize43 =null;


        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        RewriteRuleSubtreeStream stream_method=new RewriteRuleSubtreeStream(adaptor,"rule method");
        RewriteRuleSubtreeStream stream_nodeMiniMethod=new RewriteRuleSubtreeStream(adaptor,"rule nodeMiniMethod");
        RewriteRuleSubtreeStream stream_ifstmt=new RewriteRuleSubtreeStream(adaptor,"rule ifstmt");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        RewriteRuleSubtreeStream stream_arrayInitialize=new RewriteRuleSubtreeStream(adaptor,"rule arrayInitialize");
        RewriteRuleSubtreeStream stream_assigment=new RewriteRuleSubtreeStream(adaptor,"rule assigment");
        RewriteRuleSubtreeStream stream_whilestmt=new RewriteRuleSubtreeStream(adaptor,"rule whilestmt");
        RewriteRuleSubtreeStream stream_printStatement=new RewriteRuleSubtreeStream(adaptor,"rule printStatement");
        RewriteRuleSubtreeStream stream_nodeMiniMethodNoParams=new RewriteRuleSubtreeStream(adaptor,"rule nodeMiniMethodNoParams");
        RewriteRuleSubtreeStream stream_forloop=new RewriteRuleSubtreeStream(adaptor,"rule forloop");
        RewriteRuleSubtreeStream stream_string_dec=new RewriteRuleSubtreeStream(adaptor,"rule string_dec");
        RewriteRuleSubtreeStream stream_arrayDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule arrayDeclaration");
        RewriteRuleSubtreeStream stream_arrayAccess=new RewriteRuleSubtreeStream(adaptor,"rule arrayAccess");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:63:9: ( ( decl -> ^( Decl decl ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | nodeMiniMethodNoParams -> ^( Factor nodeMiniMethodNoParams ) | printStatement -> ^( PrintStmt printStatement ) | main -> ^( MainMethod main ) | arrayAccess -> ^( ArrayAccess arrayAccess ) | arrayDeclaration -> ^( ArrayDeclaration arrayDeclaration ) | arrayInitialize -> ^( ArrayInitialize arrayInitialize ) ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:63:13: ( decl -> ^( Decl decl ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | nodeMiniMethodNoParams -> ^( Factor nodeMiniMethodNoParams ) | printStatement -> ^( PrintStmt printStatement ) | main -> ^( MainMethod main ) | arrayAccess -> ^( ArrayAccess arrayAccess ) | arrayDeclaration -> ^( ArrayDeclaration arrayDeclaration ) | arrayInitialize -> ^( ArrayInitialize arrayInitialize ) )
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:63:13: ( decl -> ^( Decl decl ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | nodeMiniMethodNoParams -> ^( Factor nodeMiniMethodNoParams ) | printStatement -> ^( PrintStmt printStatement ) | main -> ^( MainMethod main ) | arrayAccess -> ^( ArrayAccess arrayAccess ) | arrayDeclaration -> ^( ArrayDeclaration arrayDeclaration ) | arrayInitialize -> ^( ArrayInitialize arrayInitialize ) )
            int alt9=14;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:64:2: decl
                    {
                    pushFollow(FOLLOW_decl_in_stmt345);
                    decl30=decl();

                    state._fsp--;

                    stream_decl.add(decl30.getTree());

                    // AST REWRITE
                    // elements: decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 64:7: -> ^( Decl decl )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:64:10: ^( Decl decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Decl, "Decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:65:3: ifstmt
                    {
                    pushFollow(FOLLOW_ifstmt_in_stmt357);
                    ifstmt31=ifstmt();

                    state._fsp--;

                    stream_ifstmt.add(ifstmt31.getTree());

                    // AST REWRITE
                    // elements: ifstmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 65:10: -> ^( Ifstmt ifstmt )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:65:13: ^( Ifstmt ifstmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Ifstmt, "Ifstmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_ifstmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:66:3: whilestmt
                    {
                    pushFollow(FOLLOW_whilestmt_in_stmt369);
                    whilestmt32=whilestmt();

                    state._fsp--;

                    stream_whilestmt.add(whilestmt32.getTree());

                    // AST REWRITE
                    // elements: whilestmt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 66:13: -> ^( Whilestmt whilestmt )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:66:16: ^( Whilestmt whilestmt )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Whilestmt, "Whilestmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_whilestmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:67:3: forloop
                    {
                    pushFollow(FOLLOW_forloop_in_stmt381);
                    forloop33=forloop();

                    state._fsp--;

                    stream_forloop.add(forloop33.getTree());

                    // AST REWRITE
                    // elements: forloop
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 67:11: -> ^( Forloop forloop )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:67:14: ^( Forloop forloop )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Forloop, "Forloop")
                        , root_1);

                        adaptor.addChild(root_1, stream_forloop.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:68:3: assigment
                    {
                    pushFollow(FOLLOW_assigment_in_stmt393);
                    assigment34=assigment();

                    state._fsp--;

                    stream_assigment.add(assigment34.getTree());

                    // AST REWRITE
                    // elements: assigment
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 68:13: -> ^( Assigment assigment )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:68:16: ^( Assigment assigment )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Assigment, "Assigment")
                        , root_1);

                        adaptor.addChild(root_1, stream_assigment.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:69:3: method
                    {
                    pushFollow(FOLLOW_method_in_stmt405);
                    method35=method();

                    state._fsp--;

                    stream_method.add(method35.getTree());

                    // AST REWRITE
                    // elements: method
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 69:10: -> ^( Method method )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:69:13: ^( Method method )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Method, "Method")
                        , root_1);

                        adaptor.addChild(root_1, stream_method.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:70:3: string_dec
                    {
                    pushFollow(FOLLOW_string_dec_in_stmt417);
                    string_dec36=string_dec();

                    state._fsp--;

                    stream_string_dec.add(string_dec36.getTree());

                    // AST REWRITE
                    // elements: string_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 70:14: -> ^( String_Dec string_dec )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:70:17: ^( String_Dec string_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(String_Dec, "String_Dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_string_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:71:3: nodeMiniMethod
                    {
                    pushFollow(FOLLOW_nodeMiniMethod_in_stmt429);
                    nodeMiniMethod37=nodeMiniMethod();

                    state._fsp--;

                    stream_nodeMiniMethod.add(nodeMiniMethod37.getTree());

                    // AST REWRITE
                    // elements: nodeMiniMethod
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 71:18: -> ^( Factor nodeMiniMethod )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:71:21: ^( Factor nodeMiniMethod )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_nodeMiniMethod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:72:3: nodeMiniMethodNoParams
                    {
                    pushFollow(FOLLOW_nodeMiniMethodNoParams_in_stmt441);
                    nodeMiniMethodNoParams38=nodeMiniMethodNoParams();

                    state._fsp--;

                    stream_nodeMiniMethodNoParams.add(nodeMiniMethodNoParams38.getTree());

                    // AST REWRITE
                    // elements: nodeMiniMethodNoParams
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 72:26: -> ^( Factor nodeMiniMethodNoParams )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:72:29: ^( Factor nodeMiniMethodNoParams )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_nodeMiniMethodNoParams.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:73:3: printStatement
                    {
                    pushFollow(FOLLOW_printStatement_in_stmt453);
                    printStatement39=printStatement();

                    state._fsp--;

                    stream_printStatement.add(printStatement39.getTree());

                    // AST REWRITE
                    // elements: printStatement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 73:18: -> ^( PrintStmt printStatement )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:73:21: ^( PrintStmt printStatement )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(PrintStmt, "PrintStmt")
                        , root_1);

                        adaptor.addChild(root_1, stream_printStatement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 11 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:74:3: main
                    {
                    pushFollow(FOLLOW_main_in_stmt465);
                    main40=main();

                    state._fsp--;

                    stream_main.add(main40.getTree());

                    // AST REWRITE
                    // elements: main
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 74:8: -> ^( MainMethod main )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:74:11: ^( MainMethod main )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(MainMethod, "MainMethod")
                        , root_1);

                        adaptor.addChild(root_1, stream_main.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 12 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:75:3: arrayAccess
                    {
                    pushFollow(FOLLOW_arrayAccess_in_stmt477);
                    arrayAccess41=arrayAccess();

                    state._fsp--;

                    stream_arrayAccess.add(arrayAccess41.getTree());

                    // AST REWRITE
                    // elements: arrayAccess
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 75:15: -> ^( ArrayAccess arrayAccess )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:75:18: ^( ArrayAccess arrayAccess )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayAccess, "ArrayAccess")
                        , root_1);

                        adaptor.addChild(root_1, stream_arrayAccess.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 13 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:76:3: arrayDeclaration
                    {
                    pushFollow(FOLLOW_arrayDeclaration_in_stmt489);
                    arrayDeclaration42=arrayDeclaration();

                    state._fsp--;

                    stream_arrayDeclaration.add(arrayDeclaration42.getTree());

                    // AST REWRITE
                    // elements: arrayDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 76:20: -> ^( ArrayDeclaration arrayDeclaration )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:76:23: ^( ArrayDeclaration arrayDeclaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayDeclaration, "ArrayDeclaration")
                        , root_1);

                        adaptor.addChild(root_1, stream_arrayDeclaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 14 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:77:3: arrayInitialize
                    {
                    pushFollow(FOLLOW_arrayInitialize_in_stmt501);
                    arrayInitialize43=arrayInitialize();

                    state._fsp--;

                    stream_arrayInitialize.add(arrayInitialize43.getTree());

                    // AST REWRITE
                    // elements: arrayInitialize
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 77:19: -> ^( ArrayInitialize arrayInitialize )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:77:22: ^( ArrayInitialize arrayInitialize )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(ArrayInitialize, "ArrayInitialize")
                        , root_1);

                        adaptor.addChild(root_1, stream_arrayInitialize.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "method"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:87:1: method : Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' -> ^( Method Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' ) ;
    public final MiniJavaParser.method_return method() throws RecognitionException {
        MiniJavaParser.method_return retval = new MiniJavaParser.method_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier44=null;
        Token VAR46=null;
        Token char_literal48=null;
        Token SEMICOLON51=null;
        Token char_literal52=null;
        MiniJavaParser.types_return types45 =null;

        MiniJavaParser.params_return params47 =null;

        MiniJavaParser.stmt_return stmt49 =null;

        MiniJavaParser.return_stmt_return return_stmt50 =null;


        Object Modifier44_tree=null;
        Object VAR46_tree=null;
        Object char_literal48_tree=null;
        Object SEMICOLON51_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleSubtreeStream stream_types=new RewriteRuleSubtreeStream(adaptor,"rule types");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        RewriteRuleSubtreeStream stream_return_stmt=new RewriteRuleSubtreeStream(adaptor,"rule return_stmt");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:87:8: ( Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' -> ^( Method Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:88:2: Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}'
            {
            Modifier44=(Token)match(input,Modifier,FOLLOW_Modifier_in_method548);  
            stream_Modifier.add(Modifier44);


            pushFollow(FOLLOW_types_in_method550);
            types45=types();

            state._fsp--;

            stream_types.add(types45.getTree());

            VAR46=(Token)match(input,VAR,FOLLOW_VAR_in_method552);  
            stream_VAR.add(VAR46);


            pushFollow(FOLLOW_params_in_method554);
            params47=params();

            state._fsp--;

            stream_params.add(params47.getTree());

            char_literal48=(Token)match(input,79,FOLLOW_79_in_method556);  
            stream_79.add(char_literal48);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:88:32: ( stmt )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==BOOLEAN||LA10_0==DOUBLE||LA10_0==INT||LA10_0==Modifier||LA10_0==STRING||LA10_0==VAR||LA10_0==62||(LA10_0 >= 65 && LA10_0 <= 66)||(LA10_0 >= 69 && LA10_0 <= 72)||LA10_0==76||LA10_0==78) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:88:32: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_method558);
            	    stmt49=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt49.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            pushFollow(FOLLOW_return_stmt_in_method561);
            return_stmt50=return_stmt();

            state._fsp--;

            stream_return_stmt.add(return_stmt50.getTree());

            SEMICOLON51=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_method563);  
            stream_SEMICOLON.add(SEMICOLON51);


            char_literal52=(Token)match(input,80,FOLLOW_80_in_method564);  
            stream_80.add(char_literal52);


            // AST REWRITE
            // elements: stmt, types, VAR, params, return_stmt, 79, SEMICOLON, Modifier, 80
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:3: -> ^( Method Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:89:6: ^( Method Modifier types VAR params '{' ( stmt )* return_stmt SEMICOLON '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Method, "Method")
                , root_1);

                adaptor.addChild(root_1, 
                stream_Modifier.nextNode()
                );

                adaptor.addChild(root_1, stream_types.nextTree());

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                adaptor.addChild(root_1, stream_params.nextTree());

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:89:45: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, stream_return_stmt.nextTree());

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_80.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "method"


    public static class main_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:92:1: main : Modifier 'static' 'void' 'main' '(' 'String' '[' ']' VAR ')' '{' ( stmt )* '}' ;
    public final MiniJavaParser.main_return main() throws RecognitionException {
        MiniJavaParser.main_return retval = new MiniJavaParser.main_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token VAR61=null;
        Token char_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        MiniJavaParser.stmt_return stmt64 =null;


        Object Modifier53_tree=null;
        Object string_literal54_tree=null;
        Object string_literal55_tree=null;
        Object string_literal56_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object VAR61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal63_tree=null;
        Object char_literal65_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:92:7: ( Modifier 'static' 'void' 'main' '(' 'String' '[' ']' VAR ')' '{' ( stmt )* '}' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:92:8: Modifier 'static' 'void' 'main' '(' 'String' '[' ']' VAR ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            Modifier53=(Token)match(input,Modifier,FOLLOW_Modifier_in_main601); 
            Modifier53_tree = 
            (Object)adaptor.create(Modifier53)
            ;
            adaptor.addChild(root_0, Modifier53_tree);


            string_literal54=(Token)match(input,77,FOLLOW_77_in_main603); 
            string_literal54_tree = 
            (Object)adaptor.create(string_literal54)
            ;
            adaptor.addChild(root_0, string_literal54_tree);


            string_literal55=(Token)match(input,VOID,FOLLOW_VOID_in_main605); 
            string_literal55_tree = 
            (Object)adaptor.create(string_literal55)
            ;
            adaptor.addChild(root_0, string_literal55_tree);


            string_literal56=(Token)match(input,73,FOLLOW_73_in_main607); 
            string_literal56_tree = 
            (Object)adaptor.create(string_literal56)
            ;
            adaptor.addChild(root_0, string_literal56_tree);


            char_literal57=(Token)match(input,49,FOLLOW_49_in_main609); 
            char_literal57_tree = 
            (Object)adaptor.create(char_literal57)
            ;
            adaptor.addChild(root_0, char_literal57_tree);


            string_literal58=(Token)match(input,STRING,FOLLOW_STRING_in_main611); 
            string_literal58_tree = 
            (Object)adaptor.create(string_literal58)
            ;
            adaptor.addChild(root_0, string_literal58_tree);


            char_literal59=(Token)match(input,63,FOLLOW_63_in_main613); 
            char_literal59_tree = 
            (Object)adaptor.create(char_literal59)
            ;
            adaptor.addChild(root_0, char_literal59_tree);


            char_literal60=(Token)match(input,64,FOLLOW_64_in_main615); 
            char_literal60_tree = 
            (Object)adaptor.create(char_literal60)
            ;
            adaptor.addChild(root_0, char_literal60_tree);


            VAR61=(Token)match(input,VAR,FOLLOW_VAR_in_main617); 
            VAR61_tree = 
            (Object)adaptor.create(VAR61)
            ;
            adaptor.addChild(root_0, VAR61_tree);


            char_literal62=(Token)match(input,50,FOLLOW_50_in_main619); 
            char_literal62_tree = 
            (Object)adaptor.create(char_literal62)
            ;
            adaptor.addChild(root_0, char_literal62_tree);


            char_literal63=(Token)match(input,79,FOLLOW_79_in_main621); 
            char_literal63_tree = 
            (Object)adaptor.create(char_literal63)
            ;
            adaptor.addChild(root_0, char_literal63_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:92:73: ( stmt )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==BOOLEAN||LA11_0==DOUBLE||LA11_0==INT||LA11_0==Modifier||LA11_0==STRING||LA11_0==VAR||LA11_0==62||(LA11_0 >= 65 && LA11_0 <= 66)||(LA11_0 >= 69 && LA11_0 <= 72)||LA11_0==76||LA11_0==78) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:92:73: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_main623);
            	    stmt64=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt64.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            char_literal65=(Token)match(input,80,FOLLOW_80_in_main626); 
            char_literal65_tree = 
            (Object)adaptor.create(char_literal65)
            ;
            adaptor.addChild(root_0, char_literal65_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main"


    public static class params_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:1: params : '(' ( ( types VAR ) ( ',' types VAR )* )? ')' ;
    public final MiniJavaParser.params_return params() throws RecognitionException {
        MiniJavaParser.params_return retval = new MiniJavaParser.params_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal66=null;
        Token VAR68=null;
        Token char_literal69=null;
        Token VAR71=null;
        Token char_literal72=null;
        MiniJavaParser.types_return types67 =null;

        MiniJavaParser.types_return types70 =null;


        Object char_literal66_tree=null;
        Object VAR68_tree=null;
        Object char_literal69_tree=null;
        Object VAR71_tree=null;
        Object char_literal72_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:8: ( '(' ( ( types VAR ) ( ',' types VAR )* )? ')' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:10: '(' ( ( types VAR ) ( ',' types VAR )* )? ')'
            {
            root_0 = (Object)adaptor.nil();


            char_literal66=(Token)match(input,49,FOLLOW_49_in_params635); 
            char_literal66_tree = 
            (Object)adaptor.create(char_literal66)
            ;
            adaptor.addChild(root_0, char_literal66_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:13: ( ( types VAR ) ( ',' types VAR )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==BOOLEAN||LA13_0==DOUBLE||LA13_0==INT||LA13_0==STRING||LA13_0==VAR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:14: ( types VAR ) ( ',' types VAR )*
                    {
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:14: ( types VAR )
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:15: types VAR
                    {
                    pushFollow(FOLLOW_types_in_params638);
                    types67=types();

                    state._fsp--;

                    adaptor.addChild(root_0, types67.getTree());

                    VAR68=(Token)match(input,VAR,FOLLOW_VAR_in_params640); 
                    VAR68_tree = 
                    (Object)adaptor.create(VAR68)
                    ;
                    adaptor.addChild(root_0, VAR68_tree);


                    }


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:26: ( ',' types VAR )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==55) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:94:27: ',' types VAR
                    	    {
                    	    char_literal69=(Token)match(input,55,FOLLOW_55_in_params644); 
                    	    char_literal69_tree = 
                    	    (Object)adaptor.create(char_literal69)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal69_tree);


                    	    pushFollow(FOLLOW_types_in_params646);
                    	    types70=types();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, types70.getTree());

                    	    VAR71=(Token)match(input,VAR,FOLLOW_VAR_in_params648); 
                    	    VAR71_tree = 
                    	    (Object)adaptor.create(VAR71)
                    	    ;
                    	    adaptor.addChild(root_0, VAR71_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal72=(Token)match(input,50,FOLLOW_50_in_params654); 
            char_literal72_tree = 
            (Object)adaptor.create(char_literal72)
            ;
            adaptor.addChild(root_0, char_literal72_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:95:1: decl : ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) | bool_decl -> ^( Bool_decl bool_decl ) | other_decl -> ^( Other_decl other_decl ) | arr_decl -> ^( Arr_decl arr_decl ) );
    public final MiniJavaParser.decl_return decl() throws RecognitionException {
        MiniJavaParser.decl_return retval = new MiniJavaParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.int_dec_return int_dec73 =null;

        MiniJavaParser.double_dec_return double_dec74 =null;

        MiniJavaParser.bool_decl_return bool_decl75 =null;

        MiniJavaParser.other_decl_return other_decl76 =null;

        MiniJavaParser.arr_decl_return arr_decl77 =null;


        RewriteRuleSubtreeStream stream_int_dec=new RewriteRuleSubtreeStream(adaptor,"rule int_dec");
        RewriteRuleSubtreeStream stream_bool_decl=new RewriteRuleSubtreeStream(adaptor,"rule bool_decl");
        RewriteRuleSubtreeStream stream_arr_decl=new RewriteRuleSubtreeStream(adaptor,"rule arr_decl");
        RewriteRuleSubtreeStream stream_other_decl=new RewriteRuleSubtreeStream(adaptor,"rule other_decl");
        RewriteRuleSubtreeStream stream_double_dec=new RewriteRuleSubtreeStream(adaptor,"rule double_dec");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:95:9: ( int_dec -> ^( Int_dec int_dec ) | double_dec -> ^( Double_dec double_dec ) | bool_decl -> ^( Bool_decl bool_decl ) | other_decl -> ^( Other_decl other_decl ) | arr_decl -> ^( Arr_decl arr_decl ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case Modifier:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==INT) ) {
                    alt14=1;
                }
                else if ( (LA14_1==DOUBLE) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==VAR) ) {
                    int LA14_10 = input.LA(3);

                    if ( (LA14_10==SEMICOLON||LA14_10==55||LA14_10==61) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 10, input);

                        throw nvae;

                    }
                }
                else if ( (LA14_2==63) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;

                }
                }
                break;
            case DOUBLE:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==VAR) ) {
                    int LA14_11 = input.LA(3);

                    if ( (LA14_11==SEMICOLON||LA14_11==55||LA14_11==61) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 11, input);

                        throw nvae;

                    }
                }
                else if ( (LA14_3==63) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
                {
                int LA14_4 = input.LA(2);

                if ( (LA14_4==VAR) ) {
                    int LA14_12 = input.LA(3);

                    if ( (LA14_12==SEMICOLON) ) {
                        alt14=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 12, input);

                        throw nvae;

                    }
                }
                else if ( (LA14_4==63) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 4, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                int LA14_5 = input.LA(2);

                if ( (LA14_5==61||LA14_5==63) ) {
                    alt14=5;
                }
                else if ( (LA14_5==VAR) ) {
                    alt14=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 5, input);

                    throw nvae;

                }
                }
                break;
            case STRING:
                {
                int LA14_6 = input.LA(2);

                if ( (LA14_6==VAR) ) {
                    alt14=4;
                }
                else if ( (LA14_6==63) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 6, input);

                    throw nvae;

                }
                }
                break;
            case 65:
            case 66:
            case 69:
            case 72:
            case 76:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:96:2: int_dec
                    {
                    pushFollow(FOLLOW_int_dec_in_decl668);
                    int_dec73=int_dec();

                    state._fsp--;

                    stream_int_dec.add(int_dec73.getTree());

                    // AST REWRITE
                    // elements: int_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:10: -> ^( Int_dec int_dec )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:96:13: ^( Int_dec int_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Int_dec, "Int_dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_int_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:97:3: double_dec
                    {
                    pushFollow(FOLLOW_double_dec_in_decl680);
                    double_dec74=double_dec();

                    state._fsp--;

                    stream_double_dec.add(double_dec74.getTree());

                    // AST REWRITE
                    // elements: double_dec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:14: -> ^( Double_dec double_dec )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:97:17: ^( Double_dec double_dec )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Double_dec, "Double_dec")
                        , root_1);

                        adaptor.addChild(root_1, stream_double_dec.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:98:3: bool_decl
                    {
                    pushFollow(FOLLOW_bool_decl_in_decl692);
                    bool_decl75=bool_decl();

                    state._fsp--;

                    stream_bool_decl.add(bool_decl75.getTree());

                    // AST REWRITE
                    // elements: bool_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:13: -> ^( Bool_decl bool_decl )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:98:16: ^( Bool_decl bool_decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Bool_decl, "Bool_decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_bool_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:100:4: other_decl
                    {
                    pushFollow(FOLLOW_other_decl_in_decl707);
                    other_decl76=other_decl();

                    state._fsp--;

                    stream_other_decl.add(other_decl76.getTree());

                    // AST REWRITE
                    // elements: other_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 100:15: -> ^( Other_decl other_decl )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:100:18: ^( Other_decl other_decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Other_decl, "Other_decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_other_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:101:3: arr_decl
                    {
                    pushFollow(FOLLOW_arr_decl_in_decl719);
                    arr_decl77=arr_decl();

                    state._fsp--;

                    stream_arr_decl.add(arr_decl77.getTree());

                    // AST REWRITE
                    // elements: arr_decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 101:12: -> ^( Arr_decl arr_decl )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:101:15: ^( Arr_decl arr_decl )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Arr_decl, "Arr_decl")
                        , root_1);

                        adaptor.addChild(root_1, stream_arr_decl.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "decl"


    public static class whilestmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whilestmt"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:104:1: whilestmt : 'while' '(' cond ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' cond ')' '{' ( stmt )* '}' ) ;
    public final MiniJavaParser.whilestmt_return whilestmt() throws RecognitionException {
        MiniJavaParser.whilestmt_return retval = new MiniJavaParser.whilestmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        MiniJavaParser.cond_return cond80 =null;

        MiniJavaParser.stmt_return stmt83 =null;


        Object string_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:104:11: ( 'while' '(' cond ')' '{' ( stmt )* '}' -> ^( Whilestmt 'while' '(' cond ')' '{' ( stmt )* '}' ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:105:2: 'while' '(' cond ')' '{' ( stmt )* '}'
            {
            string_literal78=(Token)match(input,78,FOLLOW_78_in_whilestmt740);  
            stream_78.add(string_literal78);


            char_literal79=(Token)match(input,49,FOLLOW_49_in_whilestmt742);  
            stream_49.add(char_literal79);


            pushFollow(FOLLOW_cond_in_whilestmt744);
            cond80=cond();

            state._fsp--;

            stream_cond.add(cond80.getTree());

            char_literal81=(Token)match(input,50,FOLLOW_50_in_whilestmt746);  
            stream_50.add(char_literal81);


            char_literal82=(Token)match(input,79,FOLLOW_79_in_whilestmt748);  
            stream_79.add(char_literal82);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:105:27: ( stmt )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==BOOLEAN||LA15_0==DOUBLE||LA15_0==INT||LA15_0==Modifier||LA15_0==STRING||LA15_0==VAR||LA15_0==62||(LA15_0 >= 65 && LA15_0 <= 66)||(LA15_0 >= 69 && LA15_0 <= 72)||LA15_0==76||LA15_0==78) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:105:27: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_whilestmt750);
            	    stmt83=stmt();

            	    state._fsp--;

            	    stream_stmt.add(stmt83.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            char_literal84=(Token)match(input,80,FOLLOW_80_in_whilestmt753);  
            stream_80.add(char_literal84);


            // AST REWRITE
            // elements: 78, stmt, 49, 79, 80, 50, cond
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 106:3: -> ^( Whilestmt 'while' '(' cond ')' '{' ( stmt )* '}' )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:106:6: ^( Whilestmt 'while' '(' cond ')' '{' ( stmt )* '}' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Whilestmt, "Whilestmt")
                , root_1);

                adaptor.addChild(root_1, 
                stream_78.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_49.nextNode()
                );

                adaptor.addChild(root_1, stream_cond.nextTree());

                adaptor.addChild(root_1, 
                stream_50.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_79.nextNode()
                );

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:106:43: ( stmt )*
                while ( stream_stmt.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt.nextTree());

                }
                stream_stmt.reset();

                adaptor.addChild(root_1, 
                stream_80.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whilestmt"


    public static class ifContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifContent"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:1: ifContent : ( '{' ( stmt )* '}' | stmt ) ;
    public final MiniJavaParser.ifContent_return ifContent() throws RecognitionException {
        MiniJavaParser.ifContent_return retval = new MiniJavaParser.ifContent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal85=null;
        Token char_literal87=null;
        MiniJavaParser.stmt_return stmt86 =null;

        MiniJavaParser.stmt_return stmt88 =null;


        Object char_literal85_tree=null;
        Object char_literal87_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:10: ( ( '{' ( stmt )* '}' | stmt ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:11: ( '{' ( stmt )* '}' | stmt )
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:11: ( '{' ( stmt )* '}' | stmt )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==79) ) {
                alt17=1;
            }
            else if ( (LA17_0==BOOLEAN||LA17_0==DOUBLE||LA17_0==INT||LA17_0==Modifier||LA17_0==STRING||LA17_0==VAR||LA17_0==62||(LA17_0 >= 65 && LA17_0 <= 66)||(LA17_0 >= 69 && LA17_0 <= 72)||LA17_0==76||LA17_0==78) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:12: '{' ( stmt )* '}'
                    {
                    char_literal85=(Token)match(input,79,FOLLOW_79_in_ifContent790); 
                    char_literal85_tree = 
                    (Object)adaptor.create(char_literal85)
                    ;
                    adaptor.addChild(root_0, char_literal85_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:16: ( stmt )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==BOOLEAN||LA16_0==DOUBLE||LA16_0==INT||LA16_0==Modifier||LA16_0==STRING||LA16_0==VAR||LA16_0==62||(LA16_0 >= 65 && LA16_0 <= 66)||(LA16_0 >= 69 && LA16_0 <= 72)||LA16_0==76||LA16_0==78) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:16: stmt
                    	    {
                    	    pushFollow(FOLLOW_stmt_in_ifContent792);
                    	    stmt86=stmt();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, stmt86.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    char_literal87=(Token)match(input,80,FOLLOW_80_in_ifContent795); 
                    char_literal87_tree = 
                    (Object)adaptor.create(char_literal87)
                    ;
                    adaptor.addChild(root_0, char_literal87_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:110:26: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_ifContent797);
                    stmt88=stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt88.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifContent"


    public static class forloop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forloop"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:111:1: forloop : 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' ;
    public final MiniJavaParser.forloop_return forloop() throws RecognitionException {
        MiniJavaParser.forloop_return retval = new MiniJavaParser.forloop_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal89=null;
        Token char_literal90=null;
        Token SEMICOLON93=null;
        Token VAR94=null;
        Token char_literal96=null;
        Token char_literal97=null;
        Token char_literal99=null;
        MiniJavaParser.decl_return decl91 =null;

        MiniJavaParser.condition_return condition92 =null;

        MiniJavaParser.change_return change95 =null;

        MiniJavaParser.stmt_return stmt98 =null;


        Object string_literal89_tree=null;
        Object char_literal90_tree=null;
        Object SEMICOLON93_tree=null;
        Object VAR94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal97_tree=null;
        Object char_literal99_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:111:9: ( 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:2: 'for' '(' ( decl ) ( condition ) SEMICOLON ( VAR change ) ')' '{' ( stmt )* '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal89=(Token)match(input,70,FOLLOW_70_in_forloop809); 
            string_literal89_tree = 
            (Object)adaptor.create(string_literal89)
            ;
            adaptor.addChild(root_0, string_literal89_tree);


            char_literal90=(Token)match(input,49,FOLLOW_49_in_forloop811); 
            char_literal90_tree = 
            (Object)adaptor.create(char_literal90)
            ;
            adaptor.addChild(root_0, char_literal90_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:12: ( decl )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:13: decl
            {
            pushFollow(FOLLOW_decl_in_forloop814);
            decl91=decl();

            state._fsp--;

            adaptor.addChild(root_0, decl91.getTree());

            }


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:19: ( condition )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:20: condition
            {
            pushFollow(FOLLOW_condition_in_forloop818);
            condition92=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition92.getTree());

            }


            SEMICOLON93=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forloop821); 
            SEMICOLON93_tree = 
            (Object)adaptor.create(SEMICOLON93)
            ;
            adaptor.addChild(root_0, SEMICOLON93_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:41: ( VAR change )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:42: VAR change
            {
            VAR94=(Token)match(input,VAR,FOLLOW_VAR_in_forloop824); 
            VAR94_tree = 
            (Object)adaptor.create(VAR94)
            ;
            adaptor.addChild(root_0, VAR94_tree);


            pushFollow(FOLLOW_change_in_forloop826);
            change95=change();

            state._fsp--;

            adaptor.addChild(root_0, change95.getTree());

            }


            char_literal96=(Token)match(input,50,FOLLOW_50_in_forloop829); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            char_literal97=(Token)match(input,79,FOLLOW_79_in_forloop831); 
            char_literal97_tree = 
            (Object)adaptor.create(char_literal97)
            ;
            adaptor.addChild(root_0, char_literal97_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:62: ( stmt )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==BOOLEAN||LA18_0==DOUBLE||LA18_0==INT||LA18_0==Modifier||LA18_0==STRING||LA18_0==VAR||LA18_0==62||(LA18_0 >= 65 && LA18_0 <= 66)||(LA18_0 >= 69 && LA18_0 <= 72)||LA18_0==76||LA18_0==78) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:112:62: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_forloop833);
            	    stmt98=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt98.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            char_literal99=(Token)match(input,80,FOLLOW_80_in_forloop836); 
            char_literal99_tree = 
            (Object)adaptor.create(char_literal99)
            ;
            adaptor.addChild(root_0, char_literal99_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forloop"


    public static class assigment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assigment"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:114:1: assigment : assign -> ^( Assigment assign ) ;
    public final MiniJavaParser.assigment_return assigment() throws RecognitionException {
        MiniJavaParser.assigment_return retval = new MiniJavaParser.assigment_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.assign_return assign100 =null;


        RewriteRuleSubtreeStream stream_assign=new RewriteRuleSubtreeStream(adaptor,"rule assign");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:114:10: ( assign -> ^( Assigment assign ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:115:2: assign
            {
            pushFollow(FOLLOW_assign_in_assigment848);
            assign100=assign();

            state._fsp--;

            stream_assign.add(assign100.getTree());

            // AST REWRITE
            // elements: assign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:2: -> ^( Assigment assign )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:116:5: ^( Assigment assign )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Assigment, "Assigment")
                , root_1);

                adaptor.addChild(root_1, stream_assign.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assigment"


    public static class assign_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:124:1: assign : VAR ( change | '=' generalArithExpr | '=' printNew ) SEMICOLON ;
    public final MiniJavaParser.assign_return assign() throws RecognitionException {
        MiniJavaParser.assign_return retval = new MiniJavaParser.assign_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR101=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token SEMICOLON107=null;
        MiniJavaParser.change_return change102 =null;

        MiniJavaParser.generalArithExpr_return generalArithExpr104 =null;

        MiniJavaParser.printNew_return printNew106 =null;


        Object VAR101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object SEMICOLON107_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:124:8: ( VAR ( change | '=' generalArithExpr | '=' printNew ) SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:125:2: VAR ( change | '=' generalArithExpr | '=' printNew ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR101=(Token)match(input,VAR,FOLLOW_VAR_in_assign894); 
            VAR101_tree = 
            (Object)adaptor.create(VAR101)
            ;
            adaptor.addChild(root_0, VAR101_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:125:6: ( change | '=' generalArithExpr | '=' printNew )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0 >= 53 && LA19_0 <= 54)||(LA19_0 >= 57 && LA19_0 <= 58)) ) {
                alt19=1;
            }
            else if ( (LA19_0==61) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==DNUM||LA19_2==NUM||LA19_2==VAR||LA19_2==49||LA19_2==56) ) {
                    alt19=2;
                }
                else if ( (LA19_2==74) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:125:7: change
                    {
                    pushFollow(FOLLOW_change_in_assign897);
                    change102=change();

                    state._fsp--;

                    adaptor.addChild(root_0, change102.getTree());

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:125:14: '=' generalArithExpr
                    {
                    char_literal103=(Token)match(input,61,FOLLOW_61_in_assign899); 
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);


                    pushFollow(FOLLOW_generalArithExpr_in_assign901);
                    generalArithExpr104=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr104.getTree());

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:125:36: '=' printNew
                    {
                    char_literal105=(Token)match(input,61,FOLLOW_61_in_assign904); 
                    char_literal105_tree = 
                    (Object)adaptor.create(char_literal105)
                    ;
                    adaptor.addChild(root_0, char_literal105_tree);


                    pushFollow(FOLLOW_printNew_in_assign906);
                    printNew106=printNew();

                    state._fsp--;

                    adaptor.addChild(root_0, printNew106.getTree());

                    }
                    break;

            }


            SEMICOLON107=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assign909); 
            SEMICOLON107_tree = 
            (Object)adaptor.create(SEMICOLON107)
            ;
            adaptor.addChild(root_0, SEMICOLON107_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign"


    public static class change_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "change"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:127:1: change : ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) ;
    public final MiniJavaParser.change_return change() throws RecognitionException {
        MiniJavaParser.change_return retval = new MiniJavaParser.change_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal108=null;
        Token string_literal109=null;
        Token set110=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr111 =null;


        Object string_literal108_tree=null;
        Object string_literal109_tree=null;
        Object set110_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:127:8: ( ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:128:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:128:2: ( '++' | '--' | ( '+=' | '-=' ) generalArithExpr )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 57:
                {
                alt20=2;
                }
                break;
            case 54:
            case 58:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:128:3: '++'
                    {
                    string_literal108=(Token)match(input,53,FOLLOW_53_in_change920); 
                    string_literal108_tree = 
                    (Object)adaptor.create(string_literal108)
                    ;
                    adaptor.addChild(root_0, string_literal108_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:128:8: '--'
                    {
                    string_literal109=(Token)match(input,57,FOLLOW_57_in_change922); 
                    string_literal109_tree = 
                    (Object)adaptor.create(string_literal109)
                    ;
                    adaptor.addChild(root_0, string_literal109_tree);


                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:128:13: ( '+=' | '-=' ) generalArithExpr
                    {
                    set110=(Token)input.LT(1);

                    if ( input.LA(1)==54||input.LA(1)==58 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set110)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_generalArithExpr_in_change929);
                    generalArithExpr111=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr111.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "change"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:138:1: condition : generalArithExpr ( RelationalOperators generalArithExpr ( RelationalOperators condition )? )? -> ^( Condition ( generalArithExpr RelationalOperators generalArithExpr ( RelationalOperators condition )? )? ) ;
    public final MiniJavaParser.condition_return condition() throws RecognitionException {
        MiniJavaParser.condition_return retval = new MiniJavaParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RelationalOperators113=null;
        Token RelationalOperators115=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr112 =null;

        MiniJavaParser.generalArithExpr_return generalArithExpr114 =null;

        MiniJavaParser.condition_return condition116 =null;


        Object RelationalOperators113_tree=null;
        Object RelationalOperators115_tree=null;
        RewriteRuleTokenStream stream_RelationalOperators=new RewriteRuleTokenStream(adaptor,"token RelationalOperators");
        RewriteRuleSubtreeStream stream_condition=new RewriteRuleSubtreeStream(adaptor,"rule condition");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:138:10: ( generalArithExpr ( RelationalOperators generalArithExpr ( RelationalOperators condition )? )? -> ^( Condition ( generalArithExpr RelationalOperators generalArithExpr ( RelationalOperators condition )? )? ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:139:2: generalArithExpr ( RelationalOperators generalArithExpr ( RelationalOperators condition )? )?
            {
            pushFollow(FOLLOW_generalArithExpr_in_condition969);
            generalArithExpr112=generalArithExpr();

            state._fsp--;

            stream_generalArithExpr.add(generalArithExpr112.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:139:19: ( RelationalOperators generalArithExpr ( RelationalOperators condition )? )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RelationalOperators) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:139:20: RelationalOperators generalArithExpr ( RelationalOperators condition )?
                    {
                    RelationalOperators113=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition972);  
                    stream_RelationalOperators.add(RelationalOperators113);


                    pushFollow(FOLLOW_generalArithExpr_in_condition974);
                    generalArithExpr114=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr114.getTree());

                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:139:57: ( RelationalOperators condition )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RelationalOperators) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:139:58: RelationalOperators condition
                            {
                            RelationalOperators115=(Token)match(input,RelationalOperators,FOLLOW_RelationalOperators_in_condition977);  
                            stream_RelationalOperators.add(RelationalOperators115);


                            pushFollow(FOLLOW_condition_in_condition979);
                            condition116=condition();

                            state._fsp--;

                            stream_condition.add(condition116.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: RelationalOperators, generalArithExpr, generalArithExpr, RelationalOperators, condition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:2: -> ^( Condition ( generalArithExpr RelationalOperators generalArithExpr ( RelationalOperators condition )? )? )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:140:4: ^( Condition ( generalArithExpr RelationalOperators generalArithExpr ( RelationalOperators condition )? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Condition, "Condition")
                , root_1);

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:140:16: ( generalArithExpr RelationalOperators generalArithExpr ( RelationalOperators condition )? )?
                if ( stream_RelationalOperators.hasNext()||stream_generalArithExpr.hasNext()||stream_generalArithExpr.hasNext()||stream_RelationalOperators.hasNext()||stream_condition.hasNext() ) {
                    adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                    adaptor.addChild(root_1, 
                    stream_RelationalOperators.nextNode()
                    );

                    adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:140:71: ( RelationalOperators condition )?
                    if ( stream_RelationalOperators.hasNext()||stream_condition.hasNext() ) {
                        adaptor.addChild(root_1, 
                        stream_RelationalOperators.nextNode()
                        );

                        adaptor.addChild(root_1, stream_condition.nextTree());

                    }
                    stream_RelationalOperators.reset();
                    stream_condition.reset();

                }
                stream_RelationalOperators.reset();
                stream_generalArithExpr.reset();
                stream_generalArithExpr.reset();
                stream_RelationalOperators.reset();
                stream_condition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class int_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "int_dec"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:147:1: int_dec : ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final MiniJavaParser.int_dec_return int_dec() throws RecognitionException {
        MiniJavaParser.int_dec_return retval = new MiniJavaParser.int_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier117=null;
        Token INT118=null;
        Token VAR119=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token VAR123=null;
        Token SEMICOLON124=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr121 =null;


        Object Modifier117_tree=null;
        Object INT118_tree=null;
        Object VAR119_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object VAR123_tree=null;
        Object SEMICOLON124_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:147:9: ( ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:2: ( Modifier )? INT VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:2: ( Modifier )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Modifier) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:2: Modifier
                    {
                    Modifier117=(Token)match(input,Modifier,FOLLOW_Modifier_in_int_dec1043); 
                    Modifier117_tree = 
                    (Object)adaptor.create(Modifier117)
                    ;
                    adaptor.addChild(root_0, Modifier117_tree);


                    }
                    break;

            }


            INT118=(Token)match(input,INT,FOLLOW_INT_in_int_dec1046); 
            INT118_tree = 
            (Object)adaptor.create(INT118)
            ;
            adaptor.addChild(root_0, INT118_tree);


            VAR119=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1048); 
            VAR119_tree = 
            (Object)adaptor.create(VAR119)
            ;
            adaptor.addChild(root_0, VAR119_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:20: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt26=2;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt26=1;
                }
                break;
            case SEMICOLON:
                {
                alt26=1;
                }
                break;
            case 55:
                {
                alt26=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:21: ( '=' generalArithExpr )?
                    {
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:21: ( '=' generalArithExpr )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==61) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:22: '=' generalArithExpr
                            {
                            char_literal120=(Token)match(input,61,FOLLOW_61_in_int_dec1052); 
                            char_literal120_tree = 
                            (Object)adaptor.create(char_literal120)
                            ;
                            adaptor.addChild(root_0, char_literal120_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_int_dec1054);
                            generalArithExpr121=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr121.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:45: ( ',' VAR )*
                    {
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:45: ( ',' VAR )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==55) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:149:46: ',' VAR
                    	    {
                    	    char_literal122=(Token)match(input,55,FOLLOW_55_in_int_dec1059); 
                    	    char_literal122_tree = 
                    	    (Object)adaptor.create(char_literal122)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal122_tree);


                    	    VAR123=(Token)match(input,VAR,FOLLOW_VAR_in_int_dec1061); 
                    	    VAR123_tree = 
                    	    (Object)adaptor.create(VAR123)
                    	    ;
                    	    adaptor.addChild(root_0, VAR123_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON124=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_int_dec1066); 
            SEMICOLON124_tree = 
            (Object)adaptor.create(SEMICOLON124)
            ;
            adaptor.addChild(root_0, SEMICOLON124_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "int_dec"


    public static class double_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "double_dec"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:152:1: double_dec : ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON ;
    public final MiniJavaParser.double_dec_return double_dec() throws RecognitionException {
        MiniJavaParser.double_dec_return retval = new MiniJavaParser.double_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier125=null;
        Token DOUBLE126=null;
        Token VAR127=null;
        Token char_literal128=null;
        Token char_literal130=null;
        Token VAR131=null;
        Token SEMICOLON132=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr129 =null;


        Object Modifier125_tree=null;
        Object DOUBLE126_tree=null;
        Object VAR127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal130_tree=null;
        Object VAR131_tree=null;
        Object SEMICOLON132_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:152:11: ( ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:2: ( Modifier )? DOUBLE VAR ( ( '=' generalArithExpr )? | ( ',' VAR )* ) SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:2: ( Modifier )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Modifier) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:2: Modifier
                    {
                    Modifier125=(Token)match(input,Modifier,FOLLOW_Modifier_in_double_dec1081); 
                    Modifier125_tree = 
                    (Object)adaptor.create(Modifier125)
                    ;
                    adaptor.addChild(root_0, Modifier125_tree);


                    }
                    break;

            }


            DOUBLE126=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_double_dec1084); 
            DOUBLE126_tree = 
            (Object)adaptor.create(DOUBLE126)
            ;
            adaptor.addChild(root_0, DOUBLE126_tree);


            VAR127=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1086); 
            VAR127_tree = 
            (Object)adaptor.create(VAR127)
            ;
            adaptor.addChild(root_0, VAR127_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:23: ( ( '=' generalArithExpr )? | ( ',' VAR )* )
            int alt30=2;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt30=1;
                }
                break;
            case SEMICOLON:
                {
                alt30=1;
                }
                break;
            case 55:
                {
                alt30=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:24: ( '=' generalArithExpr )?
                    {
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:24: ( '=' generalArithExpr )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==61) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:25: '=' generalArithExpr
                            {
                            char_literal128=(Token)match(input,61,FOLLOW_61_in_double_dec1090); 
                            char_literal128_tree = 
                            (Object)adaptor.create(char_literal128)
                            ;
                            adaptor.addChild(root_0, char_literal128_tree);


                            pushFollow(FOLLOW_generalArithExpr_in_double_dec1092);
                            generalArithExpr129=generalArithExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, generalArithExpr129.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:48: ( ',' VAR )*
                    {
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:48: ( ',' VAR )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==55) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:154:49: ',' VAR
                    	    {
                    	    char_literal130=(Token)match(input,55,FOLLOW_55_in_double_dec1097); 
                    	    char_literal130_tree = 
                    	    (Object)adaptor.create(char_literal130)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal130_tree);


                    	    VAR131=(Token)match(input,VAR,FOLLOW_VAR_in_double_dec1099); 
                    	    VAR131_tree = 
                    	    (Object)adaptor.create(VAR131)
                    	    ;
                    	    adaptor.addChild(root_0, VAR131_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;

            }


            SEMICOLON132=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_double_dec1104); 
            SEMICOLON132_tree = 
            (Object)adaptor.create(SEMICOLON132)
            ;
            adaptor.addChild(root_0, SEMICOLON132_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "double_dec"


    public static class normal_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "normal_decl"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:156:1: normal_decl : VAR ( '=' generalArithExpr )? SEMICOLON ;
    public final MiniJavaParser.normal_decl_return normal_decl() throws RecognitionException {
        MiniJavaParser.normal_decl_return retval = new MiniJavaParser.normal_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR133=null;
        Token char_literal134=null;
        Token SEMICOLON136=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr135 =null;


        Object VAR133_tree=null;
        Object char_literal134_tree=null;
        Object SEMICOLON136_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:156:12: ( VAR ( '=' generalArithExpr )? SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:156:14: VAR ( '=' generalArithExpr )? SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            VAR133=(Token)match(input,VAR,FOLLOW_VAR_in_normal_decl1112); 
            VAR133_tree = 
            (Object)adaptor.create(VAR133)
            ;
            adaptor.addChild(root_0, VAR133_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:156:19: ( '=' generalArithExpr )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:156:20: '=' generalArithExpr
                    {
                    char_literal134=(Token)match(input,61,FOLLOW_61_in_normal_decl1116); 
                    char_literal134_tree = 
                    (Object)adaptor.create(char_literal134)
                    ;
                    adaptor.addChild(root_0, char_literal134_tree);


                    pushFollow(FOLLOW_generalArithExpr_in_normal_decl1118);
                    generalArithExpr135=generalArithExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, generalArithExpr135.getTree());

                    }
                    break;

            }


            SEMICOLON136=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_normal_decl1122); 
            SEMICOLON136_tree = 
            (Object)adaptor.create(SEMICOLON136)
            ;
            adaptor.addChild(root_0, SEMICOLON136_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "normal_decl"


    public static class bool_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "bool_decl"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:158:1: bool_decl : 'boolean' VAR SEMICOLON ;
    public final MiniJavaParser.bool_decl_return bool_decl() throws RecognitionException {
        MiniJavaParser.bool_decl_return retval = new MiniJavaParser.bool_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal137=null;
        Token VAR138=null;
        Token SEMICOLON139=null;

        Object string_literal137_tree=null;
        Object VAR138_tree=null;
        Object SEMICOLON139_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:158:10: ( 'boolean' VAR SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:158:11: 'boolean' VAR SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            string_literal137=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_bool_decl1128); 
            string_literal137_tree = 
            (Object)adaptor.create(string_literal137)
            ;
            adaptor.addChild(root_0, string_literal137_tree);


            VAR138=(Token)match(input,VAR,FOLLOW_VAR_in_bool_decl1130); 
            VAR138_tree = 
            (Object)adaptor.create(VAR138)
            ;
            adaptor.addChild(root_0, VAR138_tree);


            SEMICOLON139=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_bool_decl1132); 
            SEMICOLON139_tree = 
            (Object)adaptor.create(SEMICOLON139)
            ;
            adaptor.addChild(root_0, SEMICOLON139_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "bool_decl"


    public static class other_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "other_decl"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:160:1: other_decl : types VAR SEMICOLON ;
    public final MiniJavaParser.other_decl_return other_decl() throws RecognitionException {
        MiniJavaParser.other_decl_return retval = new MiniJavaParser.other_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR141=null;
        Token SEMICOLON142=null;
        MiniJavaParser.types_return types140 =null;


        Object VAR141_tree=null;
        Object SEMICOLON142_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:160:11: ( types VAR SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:160:13: types VAR SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_types_in_other_decl1139);
            types140=types();

            state._fsp--;

            adaptor.addChild(root_0, types140.getTree());

            VAR141=(Token)match(input,VAR,FOLLOW_VAR_in_other_decl1141); 
            VAR141_tree = 
            (Object)adaptor.create(VAR141)
            ;
            adaptor.addChild(root_0, VAR141_tree);


            SEMICOLON142=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_other_decl1143); 
            SEMICOLON142_tree = 
            (Object)adaptor.create(SEMICOLON142)
            ;
            adaptor.addChild(root_0, SEMICOLON142_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "other_decl"


    public static class arr_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arr_decl"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:162:1: arr_decl : ( VAR '=' arrayDeclaration SEMICOLON | arrayDeclaration '=' arrayDeclaration SEMICOLON );
    public final MiniJavaParser.arr_decl_return arr_decl() throws RecognitionException {
        MiniJavaParser.arr_decl_return retval = new MiniJavaParser.arr_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR143=null;
        Token char_literal144=null;
        Token SEMICOLON146=null;
        Token char_literal148=null;
        Token SEMICOLON150=null;
        MiniJavaParser.arrayDeclaration_return arrayDeclaration145 =null;

        MiniJavaParser.arrayDeclaration_return arrayDeclaration147 =null;

        MiniJavaParser.arrayDeclaration_return arrayDeclaration149 =null;


        Object VAR143_tree=null;
        Object char_literal144_tree=null;
        Object SEMICOLON146_tree=null;
        Object char_literal148_tree=null;
        Object SEMICOLON150_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:162:9: ( VAR '=' arrayDeclaration SEMICOLON | arrayDeclaration '=' arrayDeclaration SEMICOLON )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==VAR) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==61) ) {
                    alt32=1;
                }
                else if ( (LA32_1==63) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA32_0==BOOLEAN||LA32_0==DOUBLE||LA32_0==INT||LA32_0==STRING||(LA32_0 >= 65 && LA32_0 <= 66)||LA32_0==69||LA32_0==72||LA32_0==76) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:162:10: VAR '=' arrayDeclaration SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR143=(Token)match(input,VAR,FOLLOW_VAR_in_arr_decl1150); 
                    VAR143_tree = 
                    (Object)adaptor.create(VAR143)
                    ;
                    adaptor.addChild(root_0, VAR143_tree);


                    char_literal144=(Token)match(input,61,FOLLOW_61_in_arr_decl1152); 
                    char_literal144_tree = 
                    (Object)adaptor.create(char_literal144)
                    ;
                    adaptor.addChild(root_0, char_literal144_tree);


                    pushFollow(FOLLOW_arrayDeclaration_in_arr_decl1154);
                    arrayDeclaration145=arrayDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayDeclaration145.getTree());

                    SEMICOLON146=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arr_decl1156); 
                    SEMICOLON146_tree = 
                    (Object)adaptor.create(SEMICOLON146)
                    ;
                    adaptor.addChild(root_0, SEMICOLON146_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:163:3: arrayDeclaration '=' arrayDeclaration SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayDeclaration_in_arr_decl1160);
                    arrayDeclaration147=arrayDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayDeclaration147.getTree());

                    char_literal148=(Token)match(input,61,FOLLOW_61_in_arr_decl1162); 
                    char_literal148_tree = 
                    (Object)adaptor.create(char_literal148)
                    ;
                    adaptor.addChild(root_0, char_literal148_tree);


                    pushFollow(FOLLOW_arrayDeclaration_in_arr_decl1164);
                    arrayDeclaration149=arrayDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayDeclaration149.getTree());

                    SEMICOLON150=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arr_decl1166); 
                    SEMICOLON150_tree = 
                    (Object)adaptor.create(SEMICOLON150)
                    ;
                    adaptor.addChild(root_0, SEMICOLON150_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arr_decl"


    public static class string_dec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_dec"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:166:1: string_dec : ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) ;
    public final MiniJavaParser.string_dec_return string_dec() throws RecognitionException {
        MiniJavaParser.string_dec_return retval = new MiniJavaParser.string_dec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Modifier151=null;
        Token STRING152=null;
        Token VAR153=null;
        Token char_literal154=null;
        Token Strings155=null;
        Token SEMICOLON156=null;

        Object Modifier151_tree=null;
        Object STRING152_tree=null;
        Object VAR153_tree=null;
        Object char_literal154_tree=null;
        Object Strings155_tree=null;
        Object SEMICOLON156_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_Modifier=new RewriteRuleTokenStream(adaptor,"token Modifier");
        RewriteRuleTokenStream stream_Strings=new RewriteRuleTokenStream(adaptor,"token Strings");

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:166:11: ( ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:168:2: ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:168:2: ( Modifier )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Modifier) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:168:2: Modifier
                    {
                    Modifier151=(Token)match(input,Modifier,FOLLOW_Modifier_in_string_dec1178);  
                    stream_Modifier.add(Modifier151);


                    }
                    break;

            }


            STRING152=(Token)match(input,STRING,FOLLOW_STRING_in_string_dec1181);  
            stream_STRING.add(STRING152);


            VAR153=(Token)match(input,VAR,FOLLOW_VAR_in_string_dec1183);  
            stream_VAR.add(VAR153);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:168:23: ( '=' Strings )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==61) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:168:24: '=' Strings
                    {
                    char_literal154=(Token)match(input,61,FOLLOW_61_in_string_dec1186);  
                    stream_61.add(char_literal154);


                    Strings155=(Token)match(input,Strings,FOLLOW_Strings_in_string_dec1188);  
                    stream_Strings.add(Strings155);


                    }
                    break;

            }


            SEMICOLON156=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_string_dec1192);  
            stream_SEMICOLON.add(SEMICOLON156);


            // AST REWRITE
            // elements: VAR, Strings, SEMICOLON, Modifier, STRING, 61
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:3: -> ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:169:6: ^( String_Dec ( Modifier )? STRING VAR ( '=' Strings )? SEMICOLON )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(String_Dec, "String_Dec")
                , root_1);

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:169:19: ( Modifier )?
                if ( stream_Modifier.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_Modifier.nextNode()
                    );

                }
                stream_Modifier.reset();

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_VAR.nextNode()
                );

                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:169:40: ( '=' Strings )?
                if ( stream_Strings.hasNext()||stream_61.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_61.nextNode()
                    );

                    adaptor.addChild(root_1, 
                    stream_Strings.nextNode()
                    );

                }
                stream_Strings.reset();
                stream_61.reset();

                adaptor.addChild(root_1, 
                stream_SEMICOLON.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "string_dec"


    public static class generalArithExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generalArithExpr"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:172:1: generalArithExpr : term ( ( '+' | '-' ) ^ term )* ;
    public final MiniJavaParser.generalArithExpr_return generalArithExpr() throws RecognitionException {
        MiniJavaParser.generalArithExpr_return retval = new MiniJavaParser.generalArithExpr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set158=null;
        MiniJavaParser.term_return term157 =null;

        MiniJavaParser.term_return term159 =null;


        Object set158_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:172:17: ( term ( ( '+' | '-' ) ^ term )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:172:19: term ( ( '+' | '-' ) ^ term )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_generalArithExpr1225);
            term157=term();

            state._fsp--;

            adaptor.addChild(root_0, term157.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:172:24: ( ( '+' | '-' ) ^ term )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52||LA35_0==56) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:172:25: ( '+' | '-' ) ^ term
            	    {
            	    set158=(Token)input.LT(1);

            	    set158=(Token)input.LT(1);

            	    if ( input.LA(1)==52||input.LA(1)==56 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set158)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_term_in_generalArithExpr1238);
            	    term159=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term159.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generalArithExpr"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:180:1: term : factor ( ( '*' | '/' ) ^ factor )* ;
    public final MiniJavaParser.term_return term() throws RecognitionException {
        MiniJavaParser.term_return retval = new MiniJavaParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set161=null;
        MiniJavaParser.factor_return factor160 =null;

        MiniJavaParser.factor_return factor162 =null;


        Object set161_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:180:6: ( factor ( ( '*' | '/' ) ^ factor )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:180:8: factor ( ( '*' | '/' ) ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1276);
            factor160=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor160.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:180:15: ( ( '*' | '/' ) ^ factor )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51||LA36_0==60) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:180:17: ( '*' | '/' ) ^ factor
            	    {
            	    set161=(Token)input.LT(1);

            	    set161=(Token)input.LT(1);

            	    if ( input.LA(1)==51||input.LA(1)==60 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set161)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_factor_in_term1291);
            	    factor162=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor162.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:188:1: factor : ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' ( '.' miniMethod )? -> ^( Factor '(' generalArithExpr ')' ( '.' miniMethod )? ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | miniMethodNoParams -> ^( Factor miniMethodNoParams ) | nodeCallMeth -> ^( Factor nodeCallMeth ) );
    public final MiniJavaParser.factor_return factor() throws RecognitionException {
        MiniJavaParser.factor_return retval = new MiniJavaParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR163=null;
        Token NUM164=null;
        Token DNUM165=null;
        Token char_literal166=null;
        Token VAR167=null;
        Token char_literal168=null;
        Token INT169=null;
        Token char_literal170=null;
        Token DNUM171=null;
        Token char_literal172=null;
        Token char_literal174=null;
        Token char_literal175=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr173 =null;

        MiniJavaParser.miniMethod_return miniMethod176 =null;

        MiniJavaParser.nodeMiniMethod_return nodeMiniMethod177 =null;

        MiniJavaParser.miniMethodNoParams_return miniMethodNoParams178 =null;

        MiniJavaParser.nodeCallMeth_return nodeCallMeth179 =null;


        Object VAR163_tree=null;
        Object NUM164_tree=null;
        Object DNUM165_tree=null;
        Object char_literal166_tree=null;
        Object VAR167_tree=null;
        Object char_literal168_tree=null;
        Object INT169_tree=null;
        Object char_literal170_tree=null;
        Object DNUM171_tree=null;
        Object char_literal172_tree=null;
        Object char_literal174_tree=null;
        Object char_literal175_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_DNUM=new RewriteRuleTokenStream(adaptor,"token DNUM");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_NUM=new RewriteRuleTokenStream(adaptor,"token NUM");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_nodeMiniMethod=new RewriteRuleSubtreeStream(adaptor,"rule nodeMiniMethod");
        RewriteRuleSubtreeStream stream_generalArithExpr=new RewriteRuleSubtreeStream(adaptor,"rule generalArithExpr");
        RewriteRuleSubtreeStream stream_nodeCallMeth=new RewriteRuleSubtreeStream(adaptor,"rule nodeCallMeth");
        RewriteRuleSubtreeStream stream_miniMethod=new RewriteRuleSubtreeStream(adaptor,"rule miniMethod");
        RewriteRuleSubtreeStream stream_miniMethodNoParams=new RewriteRuleSubtreeStream(adaptor,"rule miniMethodNoParams");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:188:8: ( VAR -> ^( Factor VAR ) | NUM -> ^( Factor NUM ) | DNUM -> ^( Factor DOUBLE ) | '-' VAR -> ^( Factor '-' VAR ) | '-' INT -> ^( Factor '-' INT ) | '-' DNUM -> ^( Factor '-' DOUBLE ) | '(' generalArithExpr ')' ( '.' miniMethod )? -> ^( Factor '(' generalArithExpr ')' ( '.' miniMethod )? ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | miniMethodNoParams -> ^( Factor miniMethodNoParams ) | nodeCallMeth -> ^( Factor nodeCallMeth ) )
            int alt38=10;
            switch ( input.LA(1) ) {
            case VAR:
                {
                switch ( input.LA(2) ) {
                case RelationalOperators:
                case SEMICOLON:
                case 50:
                case 51:
                case 52:
                case 55:
                case 56:
                case 60:
                    {
                    alt38=1;
                    }
                    break;
                case 49:
                    {
                    alt38=8;
                    }
                    break;
                case 59:
                    {
                    int LA38_8 = input.LA(3);

                    if ( (LA38_8==VAR) ) {
                        int LA38_13 = input.LA(4);

                        if ( ((LA38_13 >= RelationalOperators && LA38_13 <= SEMICOLON)||(LA38_13 >= 50 && LA38_13 <= 52)||(LA38_13 >= 55 && LA38_13 <= 56)||LA38_13==60) ) {
                            alt38=10;
                        }
                        else if ( (LA38_13==49) ) {
                            alt38=9;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 13, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 8, input);

                        throw nvae;

                    }
                    }
                    break;
                case VAR:
                    {
                    alt38=9;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }

                }
                break;
            case NUM:
                {
                alt38=2;
                }
                break;
            case DNUM:
                {
                alt38=3;
                }
                break;
            case 56:
                {
                switch ( input.LA(2) ) {
                case VAR:
                    {
                    alt38=4;
                    }
                    break;
                case INT:
                    {
                    alt38=5;
                    }
                    break;
                case DNUM:
                    {
                    alt38=6;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 4, input);

                    throw nvae;

                }

                }
                break;
            case 49:
                {
                alt38=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:189:2: VAR
                    {
                    VAR163=(Token)match(input,VAR,FOLLOW_VAR_in_factor1331);  
                    stream_VAR.add(VAR163);


                    // AST REWRITE
                    // elements: VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:6: -> ^( Factor VAR )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:189:9: ^( Factor VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:190:3: NUM
                    {
                    NUM164=(Token)match(input,NUM,FOLLOW_NUM_in_factor1343);  
                    stream_NUM.add(NUM164);


                    // AST REWRITE
                    // elements: NUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 190:7: -> ^( Factor NUM )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:190:10: ^( Factor NUM )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NUM.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:191:3: DNUM
                    {
                    DNUM165=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1355);  
                    stream_DNUM.add(DNUM165);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:8: -> ^( Factor DOUBLE )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:191:11: ^( Factor DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:192:3: '-' VAR
                    {
                    char_literal166=(Token)match(input,56,FOLLOW_56_in_factor1367);  
                    stream_56.add(char_literal166);


                    VAR167=(Token)match(input,VAR,FOLLOW_VAR_in_factor1370);  
                    stream_VAR.add(VAR167);


                    // AST REWRITE
                    // elements: 56, VAR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 192:12: -> ^( Factor '-' VAR )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:192:15: ^( Factor '-' VAR )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_VAR.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:193:3: '-' INT
                    {
                    char_literal168=(Token)match(input,56,FOLLOW_56_in_factor1385);  
                    stream_56.add(char_literal168);


                    INT169=(Token)match(input,INT,FOLLOW_INT_in_factor1388);  
                    stream_INT.add(INT169);


                    // AST REWRITE
                    // elements: 56, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:12: -> ^( Factor '-' INT )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:193:15: ^( Factor '-' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_INT.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:194:3: '-' DNUM
                    {
                    char_literal170=(Token)match(input,56,FOLLOW_56_in_factor1403);  
                    stream_56.add(char_literal170);


                    DNUM171=(Token)match(input,DNUM,FOLLOW_DNUM_in_factor1406);  
                    stream_DNUM.add(DNUM171);


                    // AST REWRITE
                    // elements: 56
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 194:14: -> ^( Factor '-' DOUBLE )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:194:17: ^( Factor '-' DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_56.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        (Object)adaptor.create(DOUBLE, "DOUBLE")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:195:3: '(' generalArithExpr ')' ( '.' miniMethod )?
                    {
                    char_literal172=(Token)match(input,49,FOLLOW_49_in_factor1422);  
                    stream_49.add(char_literal172);


                    pushFollow(FOLLOW_generalArithExpr_in_factor1424);
                    generalArithExpr173=generalArithExpr();

                    state._fsp--;

                    stream_generalArithExpr.add(generalArithExpr173.getTree());

                    char_literal174=(Token)match(input,50,FOLLOW_50_in_factor1426);  
                    stream_50.add(char_literal174);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:195:27: ( '.' miniMethod )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==59) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:195:28: '.' miniMethod
                            {
                            char_literal175=(Token)match(input,59,FOLLOW_59_in_factor1428);  
                            stream_59.add(char_literal175);


                            pushFollow(FOLLOW_miniMethod_in_factor1429);
                            miniMethod176=miniMethod();

                            state._fsp--;

                            stream_miniMethod.add(miniMethod176.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: 49, 59, generalArithExpr, 50, miniMethod
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:44: -> ^( Factor '(' generalArithExpr ')' ( '.' miniMethod )? )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:195:47: ^( Factor '(' generalArithExpr ')' ( '.' miniMethod )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_49.nextNode()
                        );

                        adaptor.addChild(root_1, stream_generalArithExpr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_50.nextNode()
                        );

                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:195:82: ( '.' miniMethod )?
                        if ( stream_59.hasNext()||stream_miniMethod.hasNext() ) {
                            adaptor.addChild(root_1, 
                            stream_59.nextNode()
                            );

                            adaptor.addChild(root_1, stream_miniMethod.nextTree());

                        }
                        stream_59.reset();
                        stream_miniMethod.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 8 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:197:3: nodeMiniMethod
                    {
                    pushFollow(FOLLOW_nodeMiniMethod_in_factor1456);
                    nodeMiniMethod177=nodeMiniMethod();

                    state._fsp--;

                    stream_nodeMiniMethod.add(nodeMiniMethod177.getTree());

                    // AST REWRITE
                    // elements: nodeMiniMethod
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:18: -> ^( Factor nodeMiniMethod )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:197:21: ^( Factor nodeMiniMethod )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_nodeMiniMethod.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:198:3: miniMethodNoParams
                    {
                    pushFollow(FOLLOW_miniMethodNoParams_in_factor1468);
                    miniMethodNoParams178=miniMethodNoParams();

                    state._fsp--;

                    stream_miniMethodNoParams.add(miniMethodNoParams178.getTree());

                    // AST REWRITE
                    // elements: miniMethodNoParams
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 198:22: -> ^( Factor miniMethodNoParams )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:198:25: ^( Factor miniMethodNoParams )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_miniMethodNoParams.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:199:3: nodeCallMeth
                    {
                    pushFollow(FOLLOW_nodeCallMeth_in_factor1480);
                    nodeCallMeth179=nodeCallMeth();

                    state._fsp--;

                    stream_nodeCallMeth.add(nodeCallMeth179.getTree());

                    // AST REWRITE
                    // elements: nodeCallMeth
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:16: -> ^( Factor nodeCallMeth )
                    {
                        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:199:19: ^( Factor nodeCallMeth )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(Factor, "Factor")
                        , root_1);

                        adaptor.addChild(root_1, stream_nodeCallMeth.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class specialCond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "specialCond"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:2: specialCond : ( '!' () ) ;
    public final MiniJavaParser.specialCond_return specialCond() throws RecognitionException {
        MiniJavaParser.specialCond_return retval = new MiniJavaParser.specialCond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal180=null;

        Object char_literal180_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:13: ( ( '!' () ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:14: ( '!' () )
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:14: ( '!' () )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:15: '!' ()
            {
            char_literal180=(Token)match(input,48,FOLLOW_48_in_specialCond1503); 
            char_literal180_tree = 
            (Object)adaptor.create(char_literal180)
            ;
            adaptor.addChild(root_0, char_literal180_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:19: ()
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:204:20: 
            {
            }


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "specialCond"


    public static class printStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printStatement"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:211:3: printStatement : 'System.out.println' '(' ( printContent )? ')' SEMICOLON ;
    public final MiniJavaParser.printStatement_return printStatement() throws RecognitionException {
        MiniJavaParser.printStatement_return retval = new MiniJavaParser.printStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal181=null;
        Token char_literal182=null;
        Token char_literal184=null;
        Token SEMICOLON185=null;
        MiniJavaParser.printContent_return printContent183 =null;


        Object string_literal181_tree=null;
        Object char_literal182_tree=null;
        Object char_literal184_tree=null;
        Object SEMICOLON185_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:211:18: ( 'System.out.println' '(' ( printContent )? ')' SEMICOLON )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:211:20: 'System.out.println' '(' ( printContent )? ')' SEMICOLON
            {
            root_0 = (Object)adaptor.nil();


            string_literal181=(Token)match(input,62,FOLLOW_62_in_printStatement1543); 
            string_literal181_tree = 
            (Object)adaptor.create(string_literal181)
            ;
            adaptor.addChild(root_0, string_literal181_tree);


            char_literal182=(Token)match(input,49,FOLLOW_49_in_printStatement1545); 
            char_literal182_tree = 
            (Object)adaptor.create(char_literal182)
            ;
            adaptor.addChild(root_0, char_literal182_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:211:45: ( printContent )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==BOOLEAN||LA39_0==DOUBLE||LA39_0==INT||LA39_0==NUM||LA39_0==STRING||LA39_0==Strings||LA39_0==VAR||(LA39_0 >= 65 && LA39_0 <= 66)||LA39_0==69||LA39_0==72||LA39_0==74||LA39_0==76) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:211:45: printContent
                    {
                    pushFollow(FOLLOW_printContent_in_printStatement1547);
                    printContent183=printContent();

                    state._fsp--;

                    adaptor.addChild(root_0, printContent183.getTree());

                    }
                    break;

            }


            char_literal184=(Token)match(input,50,FOLLOW_50_in_printStatement1551); 
            char_literal184_tree = 
            (Object)adaptor.create(char_literal184)
            ;
            adaptor.addChild(root_0, char_literal184_tree);


            SEMICOLON185=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_printStatement1553); 
            SEMICOLON185_tree = 
            (Object)adaptor.create(SEMICOLON185)
            ;
            adaptor.addChild(root_0, SEMICOLON185_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printStatement"


    public static class printNew_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printNew"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:213:1: printNew : 'new' nodeMiniMethod ;
    public final MiniJavaParser.printNew_return printNew() throws RecognitionException {
        MiniJavaParser.printNew_return retval = new MiniJavaParser.printNew_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal186=null;
        MiniJavaParser.nodeMiniMethod_return nodeMiniMethod187 =null;


        Object string_literal186_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:213:9: ( 'new' nodeMiniMethod )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:213:10: 'new' nodeMiniMethod
            {
            root_0 = (Object)adaptor.nil();


            string_literal186=(Token)match(input,74,FOLLOW_74_in_printNew1559); 
            string_literal186_tree = 
            (Object)adaptor.create(string_literal186)
            ;
            adaptor.addChild(root_0, string_literal186_tree);


            pushFollow(FOLLOW_nodeMiniMethod_in_printNew1561);
            nodeMiniMethod187=nodeMiniMethod();

            state._fsp--;

            adaptor.addChild(root_0, nodeMiniMethod187.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printNew"


    public static class nodeMiniMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nodeMiniMethod"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:216:3: nodeMiniMethod : miniMethod -> ^( Factor miniMethod ) ;
    public final MiniJavaParser.nodeMiniMethod_return nodeMiniMethod() throws RecognitionException {
        MiniJavaParser.nodeMiniMethod_return retval = new MiniJavaParser.nodeMiniMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.miniMethod_return miniMethod188 =null;


        RewriteRuleSubtreeStream stream_miniMethod=new RewriteRuleSubtreeStream(adaptor,"rule miniMethod");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:216:17: ( miniMethod -> ^( Factor miniMethod ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:216:19: miniMethod
            {
            pushFollow(FOLLOW_miniMethod_in_nodeMiniMethod1573);
            miniMethod188=miniMethod();

            state._fsp--;

            stream_miniMethod.add(miniMethod188.getTree());

            // AST REWRITE
            // elements: miniMethod
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:31: -> ^( Factor miniMethod )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:216:34: ^( Factor miniMethod )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Factor, "Factor")
                , root_1);

                adaptor.addChild(root_1, stream_miniMethod.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nodeMiniMethod"


    public static class nodeMiniMethodNoParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nodeMiniMethodNoParams"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:217:3: nodeMiniMethodNoParams : miniMethodNoParams -> ^( Factor miniMethodNoParams ) ;
    public final MiniJavaParser.nodeMiniMethodNoParams_return nodeMiniMethodNoParams() throws RecognitionException {
        MiniJavaParser.nodeMiniMethodNoParams_return retval = new MiniJavaParser.nodeMiniMethodNoParams_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.miniMethodNoParams_return miniMethodNoParams189 =null;


        RewriteRuleSubtreeStream stream_miniMethodNoParams=new RewriteRuleSubtreeStream(adaptor,"rule miniMethodNoParams");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:217:25: ( miniMethodNoParams -> ^( Factor miniMethodNoParams ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:217:26: miniMethodNoParams
            {
            pushFollow(FOLLOW_miniMethodNoParams_in_nodeMiniMethodNoParams1590);
            miniMethodNoParams189=miniMethodNoParams();

            state._fsp--;

            stream_miniMethodNoParams.add(miniMethodNoParams189.getTree());

            // AST REWRITE
            // elements: miniMethodNoParams
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 217:45: -> ^( Factor miniMethodNoParams )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:217:48: ^( Factor miniMethodNoParams )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Factor, "Factor")
                , root_1);

                adaptor.addChild(root_1, stream_miniMethodNoParams.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nodeMiniMethodNoParams"


    public static class nodeCallMeth_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nodeCallMeth"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:218:3: nodeCallMeth : callMeth -> ^( Factor callMeth ) ;
    public final MiniJavaParser.nodeCallMeth_return nodeCallMeth() throws RecognitionException {
        MiniJavaParser.nodeCallMeth_return retval = new MiniJavaParser.nodeCallMeth_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.callMeth_return callMeth190 =null;


        RewriteRuleSubtreeStream stream_callMeth=new RewriteRuleSubtreeStream(adaptor,"rule callMeth");
        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:218:15: ( callMeth -> ^( Factor callMeth ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:218:16: callMeth
            {
            pushFollow(FOLLOW_callMeth_in_nodeCallMeth1605);
            callMeth190=callMeth();

            state._fsp--;

            stream_callMeth.add(callMeth190.getTree());

            // AST REWRITE
            // elements: callMeth
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:25: -> ^( Factor callMeth )
            {
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:218:28: ^( Factor callMeth )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(Factor, "Factor")
                , root_1);

                adaptor.addChild(root_1, stream_callMeth.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nodeCallMeth"


    public static class miniMethod_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "miniMethod"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:220:1: miniMethod : miniMethodExtention ( '.' miniMethodExtention )* ;
    public final MiniJavaParser.miniMethod_return miniMethod() throws RecognitionException {
        MiniJavaParser.miniMethod_return retval = new MiniJavaParser.miniMethod_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal192=null;
        MiniJavaParser.miniMethodExtention_return miniMethodExtention191 =null;

        MiniJavaParser.miniMethodExtention_return miniMethodExtention193 =null;


        Object char_literal192_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:220:12: ( miniMethodExtention ( '.' miniMethodExtention )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:220:14: miniMethodExtention ( '.' miniMethodExtention )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_miniMethodExtention_in_miniMethod1623);
            miniMethodExtention191=miniMethodExtention();

            state._fsp--;

            adaptor.addChild(root_0, miniMethodExtention191.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:220:34: ( '.' miniMethodExtention )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==59) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:220:35: '.' miniMethodExtention
            	    {
            	    char_literal192=(Token)match(input,59,FOLLOW_59_in_miniMethod1626); 
            	    char_literal192_tree = 
            	    (Object)adaptor.create(char_literal192)
            	    ;
            	    adaptor.addChild(root_0, char_literal192_tree);


            	    pushFollow(FOLLOW_miniMethodExtention_in_miniMethod1628);
            	    miniMethodExtention193=miniMethodExtention();

            	    state._fsp--;

            	    adaptor.addChild(root_0, miniMethodExtention193.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "miniMethod"


    public static class miniMethodExtention_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "miniMethodExtention"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:1: miniMethodExtention : VAR ( '(' ( miniMethodparams )? ')' ) ;
    public final MiniJavaParser.miniMethodExtention_return miniMethodExtention() throws RecognitionException {
        MiniJavaParser.miniMethodExtention_return retval = new MiniJavaParser.miniMethodExtention_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR194=null;
        Token char_literal195=null;
        Token char_literal197=null;
        MiniJavaParser.miniMethodparams_return miniMethodparams196 =null;


        Object VAR194_tree=null;
        Object char_literal195_tree=null;
        Object char_literal197_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:20: ( VAR ( '(' ( miniMethodparams )? ')' ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:23: VAR ( '(' ( miniMethodparams )? ')' )
            {
            root_0 = (Object)adaptor.nil();


            VAR194=(Token)match(input,VAR,FOLLOW_VAR_in_miniMethodExtention1640); 
            VAR194_tree = 
            (Object)adaptor.create(VAR194)
            ;
            adaptor.addChild(root_0, VAR194_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:27: ( '(' ( miniMethodparams )? ')' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:28: '(' ( miniMethodparams )? ')'
            {
            char_literal195=(Token)match(input,49,FOLLOW_49_in_miniMethodExtention1643); 
            char_literal195_tree = 
            (Object)adaptor.create(char_literal195)
            ;
            adaptor.addChild(root_0, char_literal195_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:32: ( miniMethodparams )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DNUM||LA41_0==NUM||LA41_0==VAR||LA41_0==49||LA41_0==56) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:222:32: miniMethodparams
                    {
                    pushFollow(FOLLOW_miniMethodparams_in_miniMethodExtention1645);
                    miniMethodparams196=miniMethodparams();

                    state._fsp--;

                    adaptor.addChild(root_0, miniMethodparams196.getTree());

                    }
                    break;

            }


            char_literal197=(Token)match(input,50,FOLLOW_50_in_miniMethodExtention1648); 
            char_literal197_tree = 
            (Object)adaptor.create(char_literal197)
            ;
            adaptor.addChild(root_0, char_literal197_tree);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "miniMethodExtention"


    public static class miniMethodparams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "miniMethodparams"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:1: miniMethodparams : ( generalArithExpr ( ',' generalArithExpr )* ) ;
    public final MiniJavaParser.miniMethodparams_return miniMethodparams() throws RecognitionException {
        MiniJavaParser.miniMethodparams_return retval = new MiniJavaParser.miniMethodparams_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal199=null;
        MiniJavaParser.generalArithExpr_return generalArithExpr198 =null;

        MiniJavaParser.generalArithExpr_return generalArithExpr200 =null;


        Object char_literal199_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:17: ( ( generalArithExpr ( ',' generalArithExpr )* ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:18: ( generalArithExpr ( ',' generalArithExpr )* )
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:18: ( generalArithExpr ( ',' generalArithExpr )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:19: generalArithExpr ( ',' generalArithExpr )*
            {
            pushFollow(FOLLOW_generalArithExpr_in_miniMethodparams1656);
            generalArithExpr198=generalArithExpr();

            state._fsp--;

            adaptor.addChild(root_0, generalArithExpr198.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:36: ( ',' generalArithExpr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==55) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:224:37: ',' generalArithExpr
            	    {
            	    char_literal199=(Token)match(input,55,FOLLOW_55_in_miniMethodparams1659); 
            	    char_literal199_tree = 
            	    (Object)adaptor.create(char_literal199)
            	    ;
            	    adaptor.addChild(root_0, char_literal199_tree);


            	    pushFollow(FOLLOW_generalArithExpr_in_miniMethodparams1661);
            	    generalArithExpr200=generalArithExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, generalArithExpr200.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "miniMethodparams"


    public static class miniMethodNoParams_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "miniMethodNoParams"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:1: miniMethodNoParams : ( VAR )+ ( '.' miniMethodExtention )+ ;
    public final MiniJavaParser.miniMethodNoParams_return miniMethodNoParams() throws RecognitionException {
        MiniJavaParser.miniMethodNoParams_return retval = new MiniJavaParser.miniMethodNoParams_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR201=null;
        Token char_literal202=null;
        MiniJavaParser.miniMethodExtention_return miniMethodExtention203 =null;


        Object VAR201_tree=null;
        Object char_literal202_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:19: ( ( VAR )+ ( '.' miniMethodExtention )+ )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:21: ( VAR )+ ( '.' miniMethodExtention )+
            {
            root_0 = (Object)adaptor.nil();


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:21: ( VAR )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==VAR) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:21: VAR
            	    {
            	    VAR201=(Token)match(input,VAR,FOLLOW_VAR_in_miniMethodNoParams1673); 
            	    VAR201_tree = 
            	    (Object)adaptor.create(VAR201)
            	    ;
            	    adaptor.addChild(root_0, VAR201_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:26: ( '.' miniMethodExtention )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:226:27: '.' miniMethodExtention
            	    {
            	    char_literal202=(Token)match(input,59,FOLLOW_59_in_miniMethodNoParams1677); 
            	    char_literal202_tree = 
            	    (Object)adaptor.create(char_literal202)
            	    ;
            	    adaptor.addChild(root_0, char_literal202_tree);


            	    pushFollow(FOLLOW_miniMethodExtention_in_miniMethodNoParams1679);
            	    miniMethodExtention203=miniMethodExtention();

            	    state._fsp--;

            	    adaptor.addChild(root_0, miniMethodExtention203.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "miniMethodNoParams"


    public static class callMeth_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "callMeth"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:227:1: callMeth : VAR ( '.' VAR ) ;
    public final MiniJavaParser.callMeth_return callMeth() throws RecognitionException {
        MiniJavaParser.callMeth_return retval = new MiniJavaParser.callMeth_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR204=null;
        Token char_literal205=null;
        Token VAR206=null;

        Object VAR204_tree=null;
        Object char_literal205_tree=null;
        Object VAR206_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:227:9: ( VAR ( '.' VAR ) )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:227:10: VAR ( '.' VAR )
            {
            root_0 = (Object)adaptor.nil();


            VAR204=(Token)match(input,VAR,FOLLOW_VAR_in_callMeth1686); 
            VAR204_tree = 
            (Object)adaptor.create(VAR204)
            ;
            adaptor.addChild(root_0, VAR204_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:227:14: ( '.' VAR )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:227:15: '.' VAR
            {
            char_literal205=(Token)match(input,59,FOLLOW_59_in_callMeth1689); 
            char_literal205_tree = 
            (Object)adaptor.create(char_literal205)
            ;
            adaptor.addChild(root_0, char_literal205_tree);


            VAR206=(Token)match(input,VAR,FOLLOW_VAR_in_callMeth1691); 
            VAR206_tree = 
            (Object)adaptor.create(VAR206)
            ;
            adaptor.addChild(root_0, VAR206_tree);


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "callMeth"


    public static class array_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:229:1: array : arrayDeclaration ;
    public final MiniJavaParser.array_return array() throws RecognitionException {
        MiniJavaParser.array_return retval = new MiniJavaParser.array_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniJavaParser.arrayDeclaration_return arrayDeclaration207 =null;



        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:229:7: ( arrayDeclaration )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:229:10: arrayDeclaration
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_arrayDeclaration_in_array1701);
            arrayDeclaration207=arrayDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, arrayDeclaration207.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array"


    public static class arrayAccess_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayAccess"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:231:1: arrayAccess : ( VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) SEMICOLON | VAR '[' ( numbers | VAR ) ']' SEMICOLON | VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) ( '+' | '-' | '*' | '/' ) ( numbers | VAR ) SEMICOLON );
    public final MiniJavaParser.arrayAccess_return arrayAccess() throws RecognitionException {
        MiniJavaParser.arrayAccess_return retval = new MiniJavaParser.arrayAccess_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR208=null;
        Token char_literal209=null;
        Token VAR211=null;
        Token char_literal212=null;
        Token char_literal213=null;
        Token VAR215=null;
        Token SEMICOLON216=null;
        Token VAR217=null;
        Token char_literal218=null;
        Token VAR220=null;
        Token char_literal221=null;
        Token SEMICOLON222=null;
        Token VAR223=null;
        Token char_literal224=null;
        Token VAR226=null;
        Token char_literal227=null;
        Token char_literal228=null;
        Token VAR230=null;
        Token set231=null;
        Token VAR233=null;
        Token SEMICOLON234=null;
        MiniJavaParser.numbers_return numbers210 =null;

        MiniJavaParser.numbers_return numbers214 =null;

        MiniJavaParser.numbers_return numbers219 =null;

        MiniJavaParser.numbers_return numbers225 =null;

        MiniJavaParser.numbers_return numbers229 =null;

        MiniJavaParser.numbers_return numbers232 =null;


        Object VAR208_tree=null;
        Object char_literal209_tree=null;
        Object VAR211_tree=null;
        Object char_literal212_tree=null;
        Object char_literal213_tree=null;
        Object VAR215_tree=null;
        Object SEMICOLON216_tree=null;
        Object VAR217_tree=null;
        Object char_literal218_tree=null;
        Object VAR220_tree=null;
        Object char_literal221_tree=null;
        Object SEMICOLON222_tree=null;
        Object VAR223_tree=null;
        Object char_literal224_tree=null;
        Object VAR226_tree=null;
        Object char_literal227_tree=null;
        Object char_literal228_tree=null;
        Object VAR230_tree=null;
        Object set231_tree=null;
        Object VAR233_tree=null;
        Object SEMICOLON234_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:2: ( VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) SEMICOLON | VAR '[' ( numbers | VAR ) ']' SEMICOLON | VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) ( '+' | '-' | '*' | '/' ) ( numbers | VAR ) SEMICOLON )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:4: VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR208=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1711); 
                    VAR208_tree = 
                    (Object)adaptor.create(VAR208)
                    ;
                    adaptor.addChild(root_0, VAR208_tree);


                    char_literal209=(Token)match(input,63,FOLLOW_63_in_arrayAccess1713); 
                    char_literal209_tree = 
                    (Object)adaptor.create(char_literal209)
                    ;
                    adaptor.addChild(root_0, char_literal209_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:12: ( numbers | VAR )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==NUM) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==VAR) ) {
                        alt45=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }
                    switch (alt45) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:13: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1716);
                            numbers210=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers210.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:21: VAR
                            {
                            VAR211=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1718); 
                            VAR211_tree = 
                            (Object)adaptor.create(VAR211)
                            ;
                            adaptor.addChild(root_0, VAR211_tree);


                            }
                            break;

                    }


                    char_literal212=(Token)match(input,64,FOLLOW_64_in_arrayAccess1721); 
                    char_literal212_tree = 
                    (Object)adaptor.create(char_literal212)
                    ;
                    adaptor.addChild(root_0, char_literal212_tree);


                    char_literal213=(Token)match(input,61,FOLLOW_61_in_arrayAccess1723); 
                    char_literal213_tree = 
                    (Object)adaptor.create(char_literal213)
                    ;
                    adaptor.addChild(root_0, char_literal213_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:34: ( numbers | VAR )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==NUM) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==VAR) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }
                    switch (alt46) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:35: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1726);
                            numbers214=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers214.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:232:43: VAR
                            {
                            VAR215=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1728); 
                            VAR215_tree = 
                            (Object)adaptor.create(VAR215)
                            ;
                            adaptor.addChild(root_0, VAR215_tree);


                            }
                            break;

                    }


                    SEMICOLON216=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayAccess1731); 
                    SEMICOLON216_tree = 
                    (Object)adaptor.create(SEMICOLON216)
                    ;
                    adaptor.addChild(root_0, SEMICOLON216_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:233:4: VAR '[' ( numbers | VAR ) ']' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR217=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1736); 
                    VAR217_tree = 
                    (Object)adaptor.create(VAR217)
                    ;
                    adaptor.addChild(root_0, VAR217_tree);


                    char_literal218=(Token)match(input,63,FOLLOW_63_in_arrayAccess1738); 
                    char_literal218_tree = 
                    (Object)adaptor.create(char_literal218)
                    ;
                    adaptor.addChild(root_0, char_literal218_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:233:12: ( numbers | VAR )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==NUM) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==VAR) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:233:13: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1741);
                            numbers219=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers219.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:233:21: VAR
                            {
                            VAR220=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1743); 
                            VAR220_tree = 
                            (Object)adaptor.create(VAR220)
                            ;
                            adaptor.addChild(root_0, VAR220_tree);


                            }
                            break;

                    }


                    char_literal221=(Token)match(input,64,FOLLOW_64_in_arrayAccess1746); 
                    char_literal221_tree = 
                    (Object)adaptor.create(char_literal221)
                    ;
                    adaptor.addChild(root_0, char_literal221_tree);


                    SEMICOLON222=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayAccess1749); 
                    SEMICOLON222_tree = 
                    (Object)adaptor.create(SEMICOLON222)
                    ;
                    adaptor.addChild(root_0, SEMICOLON222_tree);


                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:4: VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) ( '+' | '-' | '*' | '/' ) ( numbers | VAR ) SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR223=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1755); 
                    VAR223_tree = 
                    (Object)adaptor.create(VAR223)
                    ;
                    adaptor.addChild(root_0, VAR223_tree);


                    char_literal224=(Token)match(input,63,FOLLOW_63_in_arrayAccess1757); 
                    char_literal224_tree = 
                    (Object)adaptor.create(char_literal224)
                    ;
                    adaptor.addChild(root_0, char_literal224_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:12: ( numbers | VAR )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==NUM) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==VAR) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;

                    }
                    switch (alt48) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:13: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1760);
                            numbers225=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers225.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:21: VAR
                            {
                            VAR226=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1762); 
                            VAR226_tree = 
                            (Object)adaptor.create(VAR226)
                            ;
                            adaptor.addChild(root_0, VAR226_tree);


                            }
                            break;

                    }


                    char_literal227=(Token)match(input,64,FOLLOW_64_in_arrayAccess1765); 
                    char_literal227_tree = 
                    (Object)adaptor.create(char_literal227)
                    ;
                    adaptor.addChild(root_0, char_literal227_tree);


                    char_literal228=(Token)match(input,61,FOLLOW_61_in_arrayAccess1767); 
                    char_literal228_tree = 
                    (Object)adaptor.create(char_literal228)
                    ;
                    adaptor.addChild(root_0, char_literal228_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:34: ( numbers | VAR )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==NUM) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==VAR) ) {
                        alt49=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;

                    }
                    switch (alt49) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:35: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1770);
                            numbers229=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers229.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:43: VAR
                            {
                            VAR230=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1772); 
                            VAR230_tree = 
                            (Object)adaptor.create(VAR230)
                            ;
                            adaptor.addChild(root_0, VAR230_tree);


                            }
                            break;

                    }


                    set231=(Token)input.LT(1);

                    if ( (input.LA(1) >= 51 && input.LA(1) <= 52)||input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set231)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:72: ( numbers | VAR )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==NUM) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==VAR) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;

                    }
                    switch (alt50) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:73: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayAccess1792);
                            numbers232=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers232.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:234:81: VAR
                            {
                            VAR233=(Token)match(input,VAR,FOLLOW_VAR_in_arrayAccess1794); 
                            VAR233_tree = 
                            (Object)adaptor.create(VAR233)
                            ;
                            adaptor.addChild(root_0, VAR233_tree);


                            }
                            break;

                    }


                    SEMICOLON234=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayAccess1797); 
                    SEMICOLON234_tree = 
                    (Object)adaptor.create(SEMICOLON234)
                    ;
                    adaptor.addChild(root_0, SEMICOLON234_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayAccess"


    public static class arrayDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayDeclaration"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:237:1: arrayDeclaration : ( datatype '[' ']' VAR SEMICOLON | datatype '[' ']' VAR '=' 'new' datatype '[' ( numbers | Strings )? ']' SEMICOLON | VAR '[' VAR ']' );
    public final MiniJavaParser.arrayDeclaration_return arrayDeclaration() throws RecognitionException {
        MiniJavaParser.arrayDeclaration_return retval = new MiniJavaParser.arrayDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal236=null;
        Token char_literal237=null;
        Token VAR238=null;
        Token SEMICOLON239=null;
        Token char_literal241=null;
        Token char_literal242=null;
        Token VAR243=null;
        Token char_literal244=null;
        Token string_literal245=null;
        Token char_literal247=null;
        Token Strings249=null;
        Token char_literal250=null;
        Token SEMICOLON251=null;
        Token VAR252=null;
        Token char_literal253=null;
        Token VAR254=null;
        Token char_literal255=null;
        MiniJavaParser.datatype_return datatype235 =null;

        MiniJavaParser.datatype_return datatype240 =null;

        MiniJavaParser.datatype_return datatype246 =null;

        MiniJavaParser.numbers_return numbers248 =null;


        Object char_literal236_tree=null;
        Object char_literal237_tree=null;
        Object VAR238_tree=null;
        Object SEMICOLON239_tree=null;
        Object char_literal241_tree=null;
        Object char_literal242_tree=null;
        Object VAR243_tree=null;
        Object char_literal244_tree=null;
        Object string_literal245_tree=null;
        Object char_literal247_tree=null;
        Object Strings249_tree=null;
        Object char_literal250_tree=null;
        Object SEMICOLON251_tree=null;
        Object VAR252_tree=null;
        Object char_literal253_tree=null;
        Object VAR254_tree=null;
        Object char_literal255_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:237:17: ( datatype '[' ']' VAR SEMICOLON | datatype '[' ']' VAR '=' 'new' datatype '[' ( numbers | Strings )? ']' SEMICOLON | VAR '[' VAR ']' )
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==BOOLEAN||LA53_0==DOUBLE||LA53_0==INT||LA53_0==STRING||(LA53_0 >= 65 && LA53_0 <= 66)||LA53_0==69||LA53_0==72||LA53_0==76) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==63) ) {
                    int LA53_3 = input.LA(3);

                    if ( (LA53_3==64) ) {
                        int LA53_4 = input.LA(4);

                        if ( (LA53_4==VAR) ) {
                            int LA53_5 = input.LA(5);

                            if ( (LA53_5==SEMICOLON) ) {
                                alt53=1;
                            }
                            else if ( (LA53_5==61) ) {
                                alt53=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 53, 5, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 4, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA53_0==VAR) ) {
                alt53=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:237:19: datatype '[' ']' VAR SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_datatype_in_arrayDeclaration1807);
                    datatype235=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype235.getTree());

                    char_literal236=(Token)match(input,63,FOLLOW_63_in_arrayDeclaration1809); 
                    char_literal236_tree = 
                    (Object)adaptor.create(char_literal236)
                    ;
                    adaptor.addChild(root_0, char_literal236_tree);


                    char_literal237=(Token)match(input,64,FOLLOW_64_in_arrayDeclaration1810); 
                    char_literal237_tree = 
                    (Object)adaptor.create(char_literal237)
                    ;
                    adaptor.addChild(root_0, char_literal237_tree);


                    VAR238=(Token)match(input,VAR,FOLLOW_VAR_in_arrayDeclaration1812); 
                    VAR238_tree = 
                    (Object)adaptor.create(VAR238)
                    ;
                    adaptor.addChild(root_0, VAR238_tree);


                    SEMICOLON239=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayDeclaration1814); 
                    SEMICOLON239_tree = 
                    (Object)adaptor.create(SEMICOLON239)
                    ;
                    adaptor.addChild(root_0, SEMICOLON239_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:238:5: datatype '[' ']' VAR '=' 'new' datatype '[' ( numbers | Strings )? ']' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_datatype_in_arrayDeclaration1820);
                    datatype240=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype240.getTree());

                    char_literal241=(Token)match(input,63,FOLLOW_63_in_arrayDeclaration1822); 
                    char_literal241_tree = 
                    (Object)adaptor.create(char_literal241)
                    ;
                    adaptor.addChild(root_0, char_literal241_tree);


                    char_literal242=(Token)match(input,64,FOLLOW_64_in_arrayDeclaration1823); 
                    char_literal242_tree = 
                    (Object)adaptor.create(char_literal242)
                    ;
                    adaptor.addChild(root_0, char_literal242_tree);


                    VAR243=(Token)match(input,VAR,FOLLOW_VAR_in_arrayDeclaration1825); 
                    VAR243_tree = 
                    (Object)adaptor.create(VAR243)
                    ;
                    adaptor.addChild(root_0, VAR243_tree);


                    char_literal244=(Token)match(input,61,FOLLOW_61_in_arrayDeclaration1827); 
                    char_literal244_tree = 
                    (Object)adaptor.create(char_literal244)
                    ;
                    adaptor.addChild(root_0, char_literal244_tree);


                    string_literal245=(Token)match(input,74,FOLLOW_74_in_arrayDeclaration1829); 
                    string_literal245_tree = 
                    (Object)adaptor.create(string_literal245)
                    ;
                    adaptor.addChild(root_0, string_literal245_tree);


                    pushFollow(FOLLOW_datatype_in_arrayDeclaration1831);
                    datatype246=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype246.getTree());

                    char_literal247=(Token)match(input,63,FOLLOW_63_in_arrayDeclaration1833); 
                    char_literal247_tree = 
                    (Object)adaptor.create(char_literal247)
                    ;
                    adaptor.addChild(root_0, char_literal247_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:238:47: ( numbers | Strings )?
                    int alt52=3;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==NUM) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==Strings) ) {
                        alt52=2;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:238:48: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayDeclaration1835);
                            numbers248=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers248.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:238:56: Strings
                            {
                            Strings249=(Token)match(input,Strings,FOLLOW_Strings_in_arrayDeclaration1837); 
                            Strings249_tree = 
                            (Object)adaptor.create(Strings249)
                            ;
                            adaptor.addChild(root_0, Strings249_tree);


                            }
                            break;

                    }


                    char_literal250=(Token)match(input,64,FOLLOW_64_in_arrayDeclaration1840); 
                    char_literal250_tree = 
                    (Object)adaptor.create(char_literal250)
                    ;
                    adaptor.addChild(root_0, char_literal250_tree);


                    SEMICOLON251=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayDeclaration1841); 
                    SEMICOLON251_tree = 
                    (Object)adaptor.create(SEMICOLON251)
                    ;
                    adaptor.addChild(root_0, SEMICOLON251_tree);


                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:239:4: VAR '[' VAR ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR252=(Token)match(input,VAR,FOLLOW_VAR_in_arrayDeclaration1846); 
                    VAR252_tree = 
                    (Object)adaptor.create(VAR252)
                    ;
                    adaptor.addChild(root_0, VAR252_tree);


                    char_literal253=(Token)match(input,63,FOLLOW_63_in_arrayDeclaration1848); 
                    char_literal253_tree = 
                    (Object)adaptor.create(char_literal253)
                    ;
                    adaptor.addChild(root_0, char_literal253_tree);


                    VAR254=(Token)match(input,VAR,FOLLOW_VAR_in_arrayDeclaration1849); 
                    VAR254_tree = 
                    (Object)adaptor.create(VAR254)
                    ;
                    adaptor.addChild(root_0, VAR254_tree);


                    char_literal255=(Token)match(input,64,FOLLOW_64_in_arrayDeclaration1850); 
                    char_literal255_tree = 
                    (Object)adaptor.create(char_literal255)
                    ;
                    adaptor.addChild(root_0, char_literal255_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaration"


    public static class arrayInitialize_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayInitialize"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:241:1: arrayInitialize : ( datatype '[' ']' VAR '=' '{' ( numbers | Strings ) '}' SEMICOLON | VAR '=' '{' ( numbers )? '}' SEMICOLON | VAR '=' '{' ( Strings )? '}' SEMICOLON | VAR '=' 'new' datatype '[' ( numbers | VAR )? ']' ( '{' ( numbers | Strings ) '}' )? SEMICOLON | datatype '[' ']' VAR '=' 'new' datatype '[' ']' '{' ( numbers | Strings )? '}' SEMICOLON );
    public final MiniJavaParser.arrayInitialize_return arrayInitialize() throws RecognitionException {
        MiniJavaParser.arrayInitialize_return retval = new MiniJavaParser.arrayInitialize_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal257=null;
        Token char_literal258=null;
        Token VAR259=null;
        Token char_literal260=null;
        Token char_literal261=null;
        Token Strings263=null;
        Token char_literal264=null;
        Token SEMICOLON265=null;
        Token VAR266=null;
        Token char_literal267=null;
        Token char_literal268=null;
        Token char_literal270=null;
        Token SEMICOLON271=null;
        Token VAR272=null;
        Token char_literal273=null;
        Token char_literal274=null;
        Token Strings275=null;
        Token char_literal276=null;
        Token SEMICOLON277=null;
        Token VAR278=null;
        Token char_literal279=null;
        Token string_literal280=null;
        Token char_literal282=null;
        Token VAR284=null;
        Token char_literal285=null;
        Token char_literal286=null;
        Token Strings288=null;
        Token char_literal289=null;
        Token SEMICOLON290=null;
        Token char_literal292=null;
        Token char_literal293=null;
        Token VAR294=null;
        Token char_literal295=null;
        Token string_literal296=null;
        Token char_literal298=null;
        Token char_literal299=null;
        Token char_literal300=null;
        Token Strings302=null;
        Token char_literal303=null;
        Token SEMICOLON304=null;
        MiniJavaParser.datatype_return datatype256 =null;

        MiniJavaParser.numbers_return numbers262 =null;

        MiniJavaParser.numbers_return numbers269 =null;

        MiniJavaParser.datatype_return datatype281 =null;

        MiniJavaParser.numbers_return numbers283 =null;

        MiniJavaParser.numbers_return numbers287 =null;

        MiniJavaParser.datatype_return datatype291 =null;

        MiniJavaParser.datatype_return datatype297 =null;

        MiniJavaParser.numbers_return numbers301 =null;


        Object char_literal257_tree=null;
        Object char_literal258_tree=null;
        Object VAR259_tree=null;
        Object char_literal260_tree=null;
        Object char_literal261_tree=null;
        Object Strings263_tree=null;
        Object char_literal264_tree=null;
        Object SEMICOLON265_tree=null;
        Object VAR266_tree=null;
        Object char_literal267_tree=null;
        Object char_literal268_tree=null;
        Object char_literal270_tree=null;
        Object SEMICOLON271_tree=null;
        Object VAR272_tree=null;
        Object char_literal273_tree=null;
        Object char_literal274_tree=null;
        Object Strings275_tree=null;
        Object char_literal276_tree=null;
        Object SEMICOLON277_tree=null;
        Object VAR278_tree=null;
        Object char_literal279_tree=null;
        Object string_literal280_tree=null;
        Object char_literal282_tree=null;
        Object VAR284_tree=null;
        Object char_literal285_tree=null;
        Object char_literal286_tree=null;
        Object Strings288_tree=null;
        Object char_literal289_tree=null;
        Object SEMICOLON290_tree=null;
        Object char_literal292_tree=null;
        Object char_literal293_tree=null;
        Object VAR294_tree=null;
        Object char_literal295_tree=null;
        Object string_literal296_tree=null;
        Object char_literal298_tree=null;
        Object char_literal299_tree=null;
        Object char_literal300_tree=null;
        Object Strings302_tree=null;
        Object char_literal303_tree=null;
        Object SEMICOLON304_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:242:2: ( datatype '[' ']' VAR '=' '{' ( numbers | Strings ) '}' SEMICOLON | VAR '=' '{' ( numbers )? '}' SEMICOLON | VAR '=' '{' ( Strings )? '}' SEMICOLON | VAR '=' 'new' datatype '[' ( numbers | VAR )? ']' ( '{' ( numbers | Strings ) '}' )? SEMICOLON | datatype '[' ']' VAR '=' 'new' datatype '[' ']' '{' ( numbers | Strings )? '}' SEMICOLON )
            int alt61=5;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==BOOLEAN||LA61_0==DOUBLE||LA61_0==INT||LA61_0==STRING||(LA61_0 >= 65 && LA61_0 <= 66)||LA61_0==69||LA61_0==72||LA61_0==76) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==63) ) {
                    int LA61_3 = input.LA(3);

                    if ( (LA61_3==64) ) {
                        int LA61_5 = input.LA(4);

                        if ( (LA61_5==VAR) ) {
                            int LA61_8 = input.LA(5);

                            if ( (LA61_8==61) ) {
                                int LA61_12 = input.LA(6);

                                if ( (LA61_12==79) ) {
                                    alt61=1;
                                }
                                else if ( (LA61_12==74) ) {
                                    alt61=5;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 61, 12, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 8, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 5, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA61_0==VAR) ) {
                int LA61_2 = input.LA(2);

                if ( (LA61_2==61) ) {
                    int LA61_4 = input.LA(3);

                    if ( (LA61_4==79) ) {
                        switch ( input.LA(4) ) {
                        case NUM:
                            {
                            alt61=2;
                            }
                            break;
                        case 80:
                            {
                            int LA61_10 = input.LA(5);

                            if ( (LA61_10==SEMICOLON) ) {
                                alt61=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 61, 10, input);

                                throw nvae;

                            }
                            }
                            break;
                        case Strings:
                            {
                            alt61=3;
                            }
                            break;
                        default:
                            NoViableAltException nvae =
                                new NoViableAltException("", 61, 6, input);

                            throw nvae;

                        }

                    }
                    else if ( (LA61_4==74) ) {
                        alt61=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:242:4: datatype '[' ']' VAR '=' '{' ( numbers | Strings ) '}' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_datatype_in_arrayInitialize1861);
                    datatype256=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype256.getTree());

                    char_literal257=(Token)match(input,63,FOLLOW_63_in_arrayInitialize1863); 
                    char_literal257_tree = 
                    (Object)adaptor.create(char_literal257)
                    ;
                    adaptor.addChild(root_0, char_literal257_tree);


                    char_literal258=(Token)match(input,64,FOLLOW_64_in_arrayInitialize1864); 
                    char_literal258_tree = 
                    (Object)adaptor.create(char_literal258)
                    ;
                    adaptor.addChild(root_0, char_literal258_tree);


                    VAR259=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1866); 
                    VAR259_tree = 
                    (Object)adaptor.create(VAR259)
                    ;
                    adaptor.addChild(root_0, VAR259_tree);


                    char_literal260=(Token)match(input,61,FOLLOW_61_in_arrayInitialize1868); 
                    char_literal260_tree = 
                    (Object)adaptor.create(char_literal260)
                    ;
                    adaptor.addChild(root_0, char_literal260_tree);


                    char_literal261=(Token)match(input,79,FOLLOW_79_in_arrayInitialize1870); 
                    char_literal261_tree = 
                    (Object)adaptor.create(char_literal261)
                    ;
                    adaptor.addChild(root_0, char_literal261_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:242:32: ( numbers | Strings )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==NUM) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==Strings) ) {
                        alt54=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;

                    }
                    switch (alt54) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:242:33: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayInitialize1873);
                            numbers262=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers262.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:242:43: Strings
                            {
                            Strings263=(Token)match(input,Strings,FOLLOW_Strings_in_arrayInitialize1877); 
                            Strings263_tree = 
                            (Object)adaptor.create(Strings263)
                            ;
                            adaptor.addChild(root_0, Strings263_tree);


                            }
                            break;

                    }


                    char_literal264=(Token)match(input,80,FOLLOW_80_in_arrayInitialize1880); 
                    char_literal264_tree = 
                    (Object)adaptor.create(char_literal264)
                    ;
                    adaptor.addChild(root_0, char_literal264_tree);


                    SEMICOLON265=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayInitialize1882); 
                    SEMICOLON265_tree = 
                    (Object)adaptor.create(SEMICOLON265)
                    ;
                    adaptor.addChild(root_0, SEMICOLON265_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:243:4: VAR '=' '{' ( numbers )? '}' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR266=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1887); 
                    VAR266_tree = 
                    (Object)adaptor.create(VAR266)
                    ;
                    adaptor.addChild(root_0, VAR266_tree);


                    char_literal267=(Token)match(input,61,FOLLOW_61_in_arrayInitialize1889); 
                    char_literal267_tree = 
                    (Object)adaptor.create(char_literal267)
                    ;
                    adaptor.addChild(root_0, char_literal267_tree);


                    char_literal268=(Token)match(input,79,FOLLOW_79_in_arrayInitialize1891); 
                    char_literal268_tree = 
                    (Object)adaptor.create(char_literal268)
                    ;
                    adaptor.addChild(root_0, char_literal268_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:243:16: ( numbers )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==NUM) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:243:17: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayInitialize1894);
                            numbers269=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers269.getTree());

                            }
                            break;

                    }


                    char_literal270=(Token)match(input,80,FOLLOW_80_in_arrayInitialize1898); 
                    char_literal270_tree = 
                    (Object)adaptor.create(char_literal270)
                    ;
                    adaptor.addChild(root_0, char_literal270_tree);


                    SEMICOLON271=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayInitialize1900); 
                    SEMICOLON271_tree = 
                    (Object)adaptor.create(SEMICOLON271)
                    ;
                    adaptor.addChild(root_0, SEMICOLON271_tree);


                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:244:4: VAR '=' '{' ( Strings )? '}' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR272=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1905); 
                    VAR272_tree = 
                    (Object)adaptor.create(VAR272)
                    ;
                    adaptor.addChild(root_0, VAR272_tree);


                    char_literal273=(Token)match(input,61,FOLLOW_61_in_arrayInitialize1907); 
                    char_literal273_tree = 
                    (Object)adaptor.create(char_literal273)
                    ;
                    adaptor.addChild(root_0, char_literal273_tree);


                    char_literal274=(Token)match(input,79,FOLLOW_79_in_arrayInitialize1909); 
                    char_literal274_tree = 
                    (Object)adaptor.create(char_literal274)
                    ;
                    adaptor.addChild(root_0, char_literal274_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:244:16: ( Strings )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==Strings) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:244:17: Strings
                            {
                            Strings275=(Token)match(input,Strings,FOLLOW_Strings_in_arrayInitialize1912); 
                            Strings275_tree = 
                            (Object)adaptor.create(Strings275)
                            ;
                            adaptor.addChild(root_0, Strings275_tree);


                            }
                            break;

                    }


                    char_literal276=(Token)match(input,80,FOLLOW_80_in_arrayInitialize1916); 
                    char_literal276_tree = 
                    (Object)adaptor.create(char_literal276)
                    ;
                    adaptor.addChild(root_0, char_literal276_tree);


                    SEMICOLON277=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayInitialize1918); 
                    SEMICOLON277_tree = 
                    (Object)adaptor.create(SEMICOLON277)
                    ;
                    adaptor.addChild(root_0, SEMICOLON277_tree);


                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:4: VAR '=' 'new' datatype '[' ( numbers | VAR )? ']' ( '{' ( numbers | Strings ) '}' )? SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    VAR278=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1923); 
                    VAR278_tree = 
                    (Object)adaptor.create(VAR278)
                    ;
                    adaptor.addChild(root_0, VAR278_tree);


                    char_literal279=(Token)match(input,61,FOLLOW_61_in_arrayInitialize1925); 
                    char_literal279_tree = 
                    (Object)adaptor.create(char_literal279)
                    ;
                    adaptor.addChild(root_0, char_literal279_tree);


                    string_literal280=(Token)match(input,74,FOLLOW_74_in_arrayInitialize1927); 
                    string_literal280_tree = 
                    (Object)adaptor.create(string_literal280)
                    ;
                    adaptor.addChild(root_0, string_literal280_tree);


                    pushFollow(FOLLOW_datatype_in_arrayInitialize1929);
                    datatype281=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype281.getTree());

                    char_literal282=(Token)match(input,63,FOLLOW_63_in_arrayInitialize1931); 
                    char_literal282_tree = 
                    (Object)adaptor.create(char_literal282)
                    ;
                    adaptor.addChild(root_0, char_literal282_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:31: ( numbers | VAR )?
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==NUM) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==VAR) ) {
                        alt57=2;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:32: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayInitialize1934);
                            numbers283=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers283.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:42: VAR
                            {
                            VAR284=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1938); 
                            VAR284_tree = 
                            (Object)adaptor.create(VAR284)
                            ;
                            adaptor.addChild(root_0, VAR284_tree);


                            }
                            break;

                    }


                    char_literal285=(Token)match(input,64,FOLLOW_64_in_arrayInitialize1942); 
                    char_literal285_tree = 
                    (Object)adaptor.create(char_literal285)
                    ;
                    adaptor.addChild(root_0, char_literal285_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:52: ( '{' ( numbers | Strings ) '}' )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==79) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:54: '{' ( numbers | Strings ) '}'
                            {
                            char_literal286=(Token)match(input,79,FOLLOW_79_in_arrayInitialize1946); 
                            char_literal286_tree = 
                            (Object)adaptor.create(char_literal286)
                            ;
                            adaptor.addChild(root_0, char_literal286_tree);


                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:58: ( numbers | Strings )
                            int alt58=2;
                            int LA58_0 = input.LA(1);

                            if ( (LA58_0==NUM) ) {
                                alt58=1;
                            }
                            else if ( (LA58_0==Strings) ) {
                                alt58=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 58, 0, input);

                                throw nvae;

                            }
                            switch (alt58) {
                                case 1 :
                                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:59: numbers
                                    {
                                    pushFollow(FOLLOW_numbers_in_arrayInitialize1949);
                                    numbers287=numbers();

                                    state._fsp--;

                                    adaptor.addChild(root_0, numbers287.getTree());

                                    }
                                    break;
                                case 2 :
                                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:245:69: Strings
                                    {
                                    Strings288=(Token)match(input,Strings,FOLLOW_Strings_in_arrayInitialize1953); 
                                    Strings288_tree = 
                                    (Object)adaptor.create(Strings288)
                                    ;
                                    adaptor.addChild(root_0, Strings288_tree);


                                    }
                                    break;

                            }


                            char_literal289=(Token)match(input,80,FOLLOW_80_in_arrayInitialize1956); 
                            char_literal289_tree = 
                            (Object)adaptor.create(char_literal289)
                            ;
                            adaptor.addChild(root_0, char_literal289_tree);


                            }
                            break;

                    }


                    SEMICOLON290=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayInitialize1960); 
                    SEMICOLON290_tree = 
                    (Object)adaptor.create(SEMICOLON290)
                    ;
                    adaptor.addChild(root_0, SEMICOLON290_tree);


                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:246:4: datatype '[' ']' VAR '=' 'new' datatype '[' ']' '{' ( numbers | Strings )? '}' SEMICOLON
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_datatype_in_arrayInitialize1965);
                    datatype291=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype291.getTree());

                    char_literal292=(Token)match(input,63,FOLLOW_63_in_arrayInitialize1967); 
                    char_literal292_tree = 
                    (Object)adaptor.create(char_literal292)
                    ;
                    adaptor.addChild(root_0, char_literal292_tree);


                    char_literal293=(Token)match(input,64,FOLLOW_64_in_arrayInitialize1968); 
                    char_literal293_tree = 
                    (Object)adaptor.create(char_literal293)
                    ;
                    adaptor.addChild(root_0, char_literal293_tree);


                    VAR294=(Token)match(input,VAR,FOLLOW_VAR_in_arrayInitialize1970); 
                    VAR294_tree = 
                    (Object)adaptor.create(VAR294)
                    ;
                    adaptor.addChild(root_0, VAR294_tree);


                    char_literal295=(Token)match(input,61,FOLLOW_61_in_arrayInitialize1972); 
                    char_literal295_tree = 
                    (Object)adaptor.create(char_literal295)
                    ;
                    adaptor.addChild(root_0, char_literal295_tree);


                    string_literal296=(Token)match(input,74,FOLLOW_74_in_arrayInitialize1974); 
                    string_literal296_tree = 
                    (Object)adaptor.create(string_literal296)
                    ;
                    adaptor.addChild(root_0, string_literal296_tree);


                    pushFollow(FOLLOW_datatype_in_arrayInitialize1976);
                    datatype297=datatype();

                    state._fsp--;

                    adaptor.addChild(root_0, datatype297.getTree());

                    char_literal298=(Token)match(input,63,FOLLOW_63_in_arrayInitialize1978); 
                    char_literal298_tree = 
                    (Object)adaptor.create(char_literal298)
                    ;
                    adaptor.addChild(root_0, char_literal298_tree);


                    char_literal299=(Token)match(input,64,FOLLOW_64_in_arrayInitialize1979); 
                    char_literal299_tree = 
                    (Object)adaptor.create(char_literal299)
                    ;
                    adaptor.addChild(root_0, char_literal299_tree);


                    char_literal300=(Token)match(input,79,FOLLOW_79_in_arrayInitialize1981); 
                    char_literal300_tree = 
                    (Object)adaptor.create(char_literal300)
                    ;
                    adaptor.addChild(root_0, char_literal300_tree);


                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:246:54: ( numbers | Strings )?
                    int alt60=3;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==NUM) ) {
                        alt60=1;
                    }
                    else if ( (LA60_0==Strings) ) {
                        alt60=2;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:246:55: numbers
                            {
                            pushFollow(FOLLOW_numbers_in_arrayInitialize1984);
                            numbers301=numbers();

                            state._fsp--;

                            adaptor.addChild(root_0, numbers301.getTree());

                            }
                            break;
                        case 2 :
                            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:246:65: Strings
                            {
                            Strings302=(Token)match(input,Strings,FOLLOW_Strings_in_arrayInitialize1988); 
                            Strings302_tree = 
                            (Object)adaptor.create(Strings302)
                            ;
                            adaptor.addChild(root_0, Strings302_tree);


                            }
                            break;

                    }


                    char_literal303=(Token)match(input,80,FOLLOW_80_in_arrayInitialize1992); 
                    char_literal303_tree = 
                    (Object)adaptor.create(char_literal303)
                    ;
                    adaptor.addChild(root_0, char_literal303_tree);


                    SEMICOLON304=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_arrayInitialize1994); 
                    SEMICOLON304_tree = 
                    (Object)adaptor.create(SEMICOLON304)
                    ;
                    adaptor.addChild(root_0, SEMICOLON304_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayInitialize"


    public static class types_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "types"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:251:1: types : ( STRING | BOOLEAN | DOUBLE | INT | VAR );
    public final MiniJavaParser.types_return types() throws RecognitionException {
        MiniJavaParser.types_return retval = new MiniJavaParser.types_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set305=null;

        Object set305_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:251:7: ( STRING | BOOLEAN | DOUBLE | INT | VAR )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set305=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set305)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "types"


    public static class return_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:266:1: return_stmt : 'return' argument ;
    public final MiniJavaParser.return_stmt_return return_stmt() throws RecognitionException {
        MiniJavaParser.return_stmt_return retval = new MiniJavaParser.return_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal306=null;
        MiniJavaParser.argument_return argument307 =null;


        Object string_literal306_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:266:12: ( 'return' argument )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:266:14: 'return' argument
            {
            root_0 = (Object)adaptor.nil();


            string_literal306=(Token)match(input,75,FOLLOW_75_in_return_stmt2187); 
            string_literal306_tree = 
            (Object)adaptor.create(string_literal306)
            ;
            adaptor.addChild(root_0, string_literal306_tree);


            pushFollow(FOLLOW_argument_in_return_stmt2189);
            argument307=argument();

            state._fsp--;

            adaptor.addChild(root_0, argument307.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class argument_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argument"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:267:1: argument : ( NUM | VAR );
    public final MiniJavaParser.argument_return argument() throws RecognitionException {
        MiniJavaParser.argument_return retval = new MiniJavaParser.argument_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set308=null;

        Object set308_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:267:9: ( NUM | VAR )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set308=(Token)input.LT(1);

            if ( input.LA(1)==NUM||input.LA(1)==VAR ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set308)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argument"


    public static class numbers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numbers"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:268:1: numbers : NUM ( ',' NUM )* ;
    public final MiniJavaParser.numbers_return numbers() throws RecognitionException {
        MiniJavaParser.numbers_return retval = new MiniJavaParser.numbers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token NUM309=null;
        Token char_literal310=null;
        Token NUM311=null;

        Object NUM309_tree=null;
        Object char_literal310_tree=null;
        Object NUM311_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:268:9: ( NUM ( ',' NUM )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:268:11: NUM ( ',' NUM )*
            {
            root_0 = (Object)adaptor.nil();


            NUM309=(Token)match(input,NUM,FOLLOW_NUM_in_numbers2205); 
            NUM309_tree = 
            (Object)adaptor.create(NUM309)
            ;
            adaptor.addChild(root_0, NUM309_tree);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:268:15: ( ',' NUM )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==55) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:268:16: ',' NUM
            	    {
            	    char_literal310=(Token)match(input,55,FOLLOW_55_in_numbers2208); 
            	    char_literal310_tree = 
            	    (Object)adaptor.create(char_literal310)
            	    ;
            	    adaptor.addChild(root_0, char_literal310_tree);


            	    NUM311=(Token)match(input,NUM,FOLLOW_NUM_in_numbers2210); 
            	    NUM311_tree = 
            	    (Object)adaptor.create(NUM311)
            	    ;
            	    adaptor.addChild(root_0, NUM311_tree);


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numbers"


    public static class opration_argu_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "opration_argu"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:269:1: opration_argu : argument ( ( '/' | '*' | '+' | '-' ) argument )? ;
    public final MiniJavaParser.opration_argu_return opration_argu() throws RecognitionException {
        MiniJavaParser.opration_argu_return retval = new MiniJavaParser.opration_argu_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set313=null;
        MiniJavaParser.argument_return argument312 =null;

        MiniJavaParser.argument_return argument314 =null;


        Object set313_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:269:14: ( argument ( ( '/' | '*' | '+' | '-' ) argument )? )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:269:16: argument ( ( '/' | '*' | '+' | '-' ) argument )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_argument_in_opration_argu2218);
            argument312=argument();

            state._fsp--;

            adaptor.addChild(root_0, argument312.getTree());

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:269:25: ( ( '/' | '*' | '+' | '-' ) argument )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0 >= 51 && LA63_0 <= 52)||LA63_0==56||LA63_0==60) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:269:27: ( '/' | '*' | '+' | '-' ) argument
                    {
                    set313=(Token)input.LT(1);

                    if ( (input.LA(1) >= 51 && input.LA(1) <= 52)||input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set313)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    pushFollow(FOLLOW_argument_in_opration_argu2232);
                    argument314=argument();

                    state._fsp--;

                    adaptor.addChild(root_0, argument314.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "opration_argu"


    public static class printContent_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printContent"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:1: printContent : ( Strings | NUM | miniMethod | printNew | miniMethodNoParams | NUM ( '/' | '*' | '+' | '-' ) NUM | arrayDeclaration );
    public final MiniJavaParser.printContent_return printContent() throws RecognitionException {
        MiniJavaParser.printContent_return retval = new MiniJavaParser.printContent_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Strings315=null;
        Token NUM316=null;
        Token NUM320=null;
        Token set321=null;
        Token NUM322=null;
        MiniJavaParser.miniMethod_return miniMethod317 =null;

        MiniJavaParser.printNew_return printNew318 =null;

        MiniJavaParser.miniMethodNoParams_return miniMethodNoParams319 =null;

        MiniJavaParser.arrayDeclaration_return arrayDeclaration323 =null;


        Object Strings315_tree=null;
        Object NUM316_tree=null;
        Object NUM320_tree=null;
        Object set321_tree=null;
        Object NUM322_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:13: ( Strings | NUM | miniMethod | printNew | miniMethodNoParams | NUM ( '/' | '*' | '+' | '-' ) NUM | arrayDeclaration )
            int alt64=7;
            switch ( input.LA(1) ) {
            case Strings:
                {
                alt64=1;
                }
                break;
            case NUM:
                {
                int LA64_2 = input.LA(2);

                if ( ((LA64_2 >= 51 && LA64_2 <= 52)||LA64_2==56||LA64_2==60) ) {
                    alt64=6;
                }
                else if ( (LA64_2==50) ) {
                    alt64=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                switch ( input.LA(2) ) {
                case 63:
                    {
                    alt64=7;
                    }
                    break;
                case 49:
                    {
                    alt64=3;
                    }
                    break;
                case VAR:
                case 59:
                    {
                    alt64=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 64, 3, input);

                    throw nvae;

                }

                }
                break;
            case 74:
                {
                alt64=4;
                }
                break;
            case BOOLEAN:
            case DOUBLE:
            case INT:
            case STRING:
            case 65:
            case 66:
            case 69:
            case 72:
            case 76:
                {
                alt64=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:14: Strings
                    {
                    root_0 = (Object)adaptor.nil();


                    Strings315=(Token)match(input,Strings,FOLLOW_Strings_in_printContent2239); 
                    Strings315_tree = 
                    (Object)adaptor.create(Strings315)
                    ;
                    adaptor.addChild(root_0, Strings315_tree);


                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:22: NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM316=(Token)match(input,NUM,FOLLOW_NUM_in_printContent2241); 
                    NUM316_tree = 
                    (Object)adaptor.create(NUM316)
                    ;
                    adaptor.addChild(root_0, NUM316_tree);


                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:26: miniMethod
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_miniMethod_in_printContent2243);
                    miniMethod317=miniMethod();

                    state._fsp--;

                    adaptor.addChild(root_0, miniMethod317.getTree());

                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:37: printNew
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_printNew_in_printContent2245);
                    printNew318=printNew();

                    state._fsp--;

                    adaptor.addChild(root_0, printNew318.getTree());

                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:46: miniMethodNoParams
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_miniMethodNoParams_in_printContent2247);
                    miniMethodNoParams319=miniMethodNoParams();

                    state._fsp--;

                    adaptor.addChild(root_0, miniMethodNoParams319.getTree());

                    }
                    break;
                case 6 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:65: NUM ( '/' | '*' | '+' | '-' ) NUM
                    {
                    root_0 = (Object)adaptor.nil();


                    NUM320=(Token)match(input,NUM,FOLLOW_NUM_in_printContent2249); 
                    NUM320_tree = 
                    (Object)adaptor.create(NUM320)
                    ;
                    adaptor.addChild(root_0, NUM320_tree);


                    set321=(Token)input.LT(1);

                    if ( (input.LA(1) >= 51 && input.LA(1) <= 52)||input.LA(1)==56||input.LA(1)==60 ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set321)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    NUM322=(Token)match(input,NUM,FOLLOW_NUM_in_printContent2261); 
                    NUM322_tree = 
                    (Object)adaptor.create(NUM322)
                    ;
                    adaptor.addChild(root_0, NUM322_tree);


                    }
                    break;
                case 7 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:270:91: arrayDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayDeclaration_in_printContent2263);
                    arrayDeclaration323=arrayDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayDeclaration323.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printContent"


    public static class datatype_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "datatype"
    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:271:1: datatype : ( 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char' | 'String' );
    public final MiniJavaParser.datatype_return datatype() throws RecognitionException {
        MiniJavaParser.datatype_return retval = new MiniJavaParser.datatype_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set324=null;

        Object set324_tree=null;

        try {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:271:9: ( 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char' | 'String' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            {
            root_0 = (Object)adaptor.nil();


            set324=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==DOUBLE||input.LA(1)==INT||input.LA(1)==STRING||(input.LA(1) >= 65 && input.LA(1) <= 66)||input.LA(1)==69||input.LA(1)==72||input.LA(1)==76 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set324)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "datatype"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA9_eotS =
        "\66\uffff";
    static final String DFA9_eofS =
        "\66\uffff";
    static final String DFA9_minS =
        "\2\11\5\54\1\77\5\uffff\3\54\2\uffff\1\100\1\11\1\37\1\44\3\uffff"+
        "\4\44\1\54\1\uffff\1\11\1\44\1\100\3\uffff\1\44\2\11\1\112\1\11"+
        "\1\uffff\1\11\1\44\1\77\1\37\1\44\1\67\1\100\1\11\1\37\1\44\1\67";
    static final String DFA9_maxS =
        "\1\116\1\115\6\77\5\uffff\3\54\2\uffff\1\100\1\117\1\54\1\73\3\uffff"+
        "\4\75\1\54\1\uffff\1\114\1\77\1\100\3\uffff\1\75\2\120\1\117\1\114"+
        "\1\uffff\1\114\2\77\1\100\1\117\2\100\1\120\1\37\1\44\1\100";
    static final String DFA9_acceptS =
        "\10\uffff\1\2\1\3\1\4\1\12\1\13\3\uffff\1\6\1\1\4\uffff\1\5\1\10"+
        "\1\11\5\uffff\1\16\3\uffff\1\14\1\1\1\7\5\uffff\1\15\13\uffff";
    static final String DFA9_specialS =
        "\66\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\4\7\uffff\1\3\5\uffff\1\2\6\uffff\1\1\7\uffff\1\6\5\uffff"+
            "\1\5\21\uffff\1\13\2\uffff\2\7\2\uffff\1\7\1\12\1\10\1\7\3\uffff"+
            "\1\7\1\uffff\1\11",
            "\1\20\7\uffff\1\16\5\uffff\1\15\16\uffff\1\17\5\uffff\1\20"+
            "\40\uffff\1\14",
            "\1\21\22\uffff\1\22",
            "\1\21\22\uffff\1\22",
            "\1\21\22\uffff\1\22",
            "\1\25\4\uffff\1\27\3\uffff\2\26\2\uffff\2\26\1\30\1\uffff\1"+
            "\23\1\uffff\1\24",
            "\1\31\22\uffff\1\22",
            "\1\22",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\35",
            "\1\21\6\uffff\1\26\1\21\5\uffff\1\21\7\uffff\1\26\6\uffff\1"+
            "\21\5\uffff\1\40\4\uffff\1\26\6\uffff\1\26\10\uffff\2\21\2\uffff"+
            "\1\21\2\uffff\1\21\1\uffff\1\37\1\uffff\1\21\2\uffff\1\36",
            "\1\42\14\uffff\1\41",
            "\1\21\7\uffff\1\30\16\uffff\1\30",
            "",
            "",
            "",
            "\1\43\30\uffff\1\44",
            "\1\43\14\uffff\1\20\5\uffff\1\43\5\uffff\1\43",
            "\1\43\14\uffff\1\20\5\uffff\1\43\5\uffff\1\43",
            "\1\44\14\uffff\1\20\13\uffff\1\44",
            "\1\45",
            "",
            "\1\36\7\uffff\1\36\5\uffff\1\36\16\uffff\1\36\5\uffff\1\26"+
            "\24\uffff\2\36\2\uffff\1\36\2\uffff\1\36\3\uffff\1\36",
            "\1\26\7\uffff\1\26\4\uffff\1\26\1\uffff\2\26\3\uffff\1\26\2"+
            "\uffff\2\26\2\uffff\1\43",
            "\1\46",
            "",
            "",
            "",
            "\1\47\30\uffff\1\50",
            "\1\52\7\uffff\1\52\5\uffff\1\52\6\uffff\1\52\5\uffff\1\42\1"+
            "\uffff\1\52\5\uffff\1\52\20\uffff\1\51\1\52\2\uffff\3\52\1\uffff"+
            "\4\52\2\uffff\2\52\1\uffff\1\52\1\uffff\1\52",
            "\1\52\7\uffff\1\52\5\uffff\1\52\6\uffff\1\52\7\uffff\1\52\5"+
            "\uffff\1\52\20\uffff\1\43\1\52\2\uffff\3\52\1\uffff\4\52\2\uffff"+
            "\2\52\1\uffff\1\52\1\uffff\1\52",
            "\1\53\4\uffff\1\36",
            "\1\43\7\uffff\1\43\5\uffff\1\43\7\uffff\1\42\6\uffff\1\43\5"+
            "\uffff\1\54\24\uffff\2\43\2\uffff\1\43\2\uffff\1\43\3\uffff"+
            "\1\43",
            "",
            "\1\55\7\uffff\1\55\5\uffff\1\55\16\uffff\1\55\32\uffff\2\55"+
            "\2\uffff\1\55\2\uffff\1\55\3\uffff\1\55",
            "\1\42\16\uffff\2\42\3\uffff\1\42\3\uffff\1\42\2\uffff\1\43",
            "\1\56",
            "\1\60\11\uffff\1\61\26\uffff\1\57",
            "\1\62\52\uffff\1\36",
            "\1\63\10\uffff\1\64",
            "\1\64",
            "\1\52\7\uffff\1\52\5\uffff\1\52\6\uffff\1\52\7\uffff\1\52\5"+
            "\uffff\1\52\20\uffff\1\43\1\52\2\uffff\3\52\1\uffff\4\52\2\uffff"+
            "\2\52\1\uffff\1\52\1\uffff\1\52",
            "\1\65",
            "\1\62",
            "\1\63\10\uffff\1\64"
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "63:13: ( decl -> ^( Decl decl ) | ifstmt -> ^( Ifstmt ifstmt ) | whilestmt -> ^( Whilestmt whilestmt ) | forloop -> ^( Forloop forloop ) | assigment -> ^( Assigment assigment ) | method -> ^( Method method ) | string_dec -> ^( String_Dec string_dec ) | nodeMiniMethod -> ^( Factor nodeMiniMethod ) | nodeMiniMethodNoParams -> ^( Factor nodeMiniMethodNoParams ) | printStatement -> ^( PrintStmt printStatement ) | main -> ^( MainMethod main ) | arrayAccess -> ^( ArrayAccess arrayAccess ) | arrayDeclaration -> ^( ArrayDeclaration arrayDeclaration ) | arrayInitialize -> ^( ArrayInitialize arrayInitialize ) )";
        }
    }
    static final String DFA51_eotS =
        "\20\uffff";
    static final String DFA51_eofS =
        "\20\uffff";
    static final String DFA51_minS =
        "\1\54\1\77\1\37\1\67\1\100\1\37\1\44\1\67\1\37\1\uffff\2\44\1\37"+
        "\2\uffff\1\44";
    static final String DFA51_maxS =
        "\1\54\1\77\1\54\2\100\1\37\1\75\1\100\1\54\1\uffff\2\74\1\37\2\uffff"+
        "\1\74";
    static final String DFA51_acceptS =
        "\11\uffff\1\2\3\uffff\1\1\1\3\1\uffff";
    static final String DFA51_specialS =
        "\20\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\14\uffff\1\4",
            "\1\5\10\uffff\1\6",
            "\1\6",
            "\1\7",
            "\1\11\30\uffff\1\10",
            "\1\5\10\uffff\1\6",
            "\1\12\14\uffff\1\13",
            "",
            "\1\15\16\uffff\2\16\2\uffff\1\14\1\16\3\uffff\1\16",
            "\1\15\16\uffff\2\16\3\uffff\1\16\3\uffff\1\16",
            "\1\17",
            "",
            "",
            "\1\15\16\uffff\2\16\2\uffff\1\14\1\16\3\uffff\1\16"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "231:1: arrayAccess : ( VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) SEMICOLON | VAR '[' ( numbers | VAR ) ']' SEMICOLON | VAR '[' ( numbers | VAR ) ']' '=' ( numbers | VAR ) ( '+' | '-' | '*' | '/' ) ( numbers | VAR ) SEMICOLON );";
        }
    }
 

    public static final BitSet FOLLOW_classDec_in_start112 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_Modifier_in_classDec157 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_Class_in_classDec160 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_classDec162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008010L});
    public static final BitSet FOLLOW_68_in_classDec165 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_classDec167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_classDec171 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_stmt_in_classDec173 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_80_in_classDec177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ifstmt232 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ifstmt234 = new BitSet(new long[]{0x0003100080000000L});
    public static final BitSet FOLLOW_cond_in_ifstmt236 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ifstmt238 = new BitSet(new long[]{0x4000104040820200L,0x000000000000D1E6L});
    public static final BitSet FOLLOW_ifContent_in_ifstmt240 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifstmt243 = new BitSet(new long[]{0x4000104040820200L,0x000000000000D1E6L});
    public static final BitSet FOLLOW_ifContent_in_ifstmt245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_test_in_cond282 = new BitSet(new long[]{0x1118000800000002L});
    public static final BitSet FOLLOW_set_in_cond285 = new BitSet(new long[]{0x0003100080000000L});
    public static final BitSet FOLLOW_test_in_cond297 = new BitSet(new long[]{0x1118000800000002L});
    public static final BitSet FOLLOW_argument_in_test306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_test309 = new BitSet(new long[]{0x0003100080000000L});
    public static final BitSet FOLLOW_test_in_test311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_test313 = new BitSet(new long[]{0x0003100080000000L});
    public static final BitSet FOLLOW_cond_in_test314 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_test316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mthds_in_test318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethod_in_mthds325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethodNoParams_in_mthds327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callMeth_in_mthds329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_stmt345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifstmt_in_stmt357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whilestmt_in_stmt369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forloop_in_stmt381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assigment_in_stmt393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_method_in_stmt405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_dec_in_stmt417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeMiniMethod_in_stmt429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeMiniMethodNoParams_in_stmt441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_stmt453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_main_in_stmt465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayAccess_in_stmt477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_stmt489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitialize_in_stmt501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_method548 = new BitSet(new long[]{0x0000104000820200L});
    public static final BitSet FOLLOW_types_in_method550 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_method552 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_params_in_method554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_method556 = new BitSet(new long[]{0x4000104040820200L,0x00000000000059E6L});
    public static final BitSet FOLLOW_stmt_in_method558 = new BitSet(new long[]{0x4000104040820200L,0x00000000000059E6L});
    public static final BitSet FOLLOW_return_stmt_in_method561 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_method563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_method564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_main601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_main603 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_VOID_in_main605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_main607 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_main609 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_in_main611 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_main613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_main615 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_main617 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_main619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_main621 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_stmt_in_main623 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_80_in_main626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_params635 = new BitSet(new long[]{0x0004104000820200L});
    public static final BitSet FOLLOW_types_in_params638 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_params640 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_55_in_params644 = new BitSet(new long[]{0x0000104000820200L});
    public static final BitSet FOLLOW_types_in_params646 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_params648 = new BitSet(new long[]{0x0084000000000000L});
    public static final BitSet FOLLOW_50_in_params654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_int_dec_in_decl668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_double_dec_in_decl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_decl_in_decl692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_other_decl_in_decl707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arr_decl_in_decl719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_whilestmt740 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_whilestmt742 = new BitSet(new long[]{0x0003100080000000L});
    public static final BitSet FOLLOW_cond_in_whilestmt744 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_whilestmt746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_whilestmt748 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_stmt_in_whilestmt750 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_80_in_whilestmt753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ifContent790 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_stmt_in_ifContent792 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_80_in_ifContent795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_ifContent797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_forloop809 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_forloop811 = new BitSet(new long[]{0x0000104040820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_decl_in_forloop814 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_condition_in_forloop818 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_forloop821 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_forloop824 = new BitSet(new long[]{0x0660000000000000L});
    public static final BitSet FOLLOW_change_in_forloop826 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_forloop829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_forloop831 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_stmt_in_forloop833 = new BitSet(new long[]{0x4000104040820200L,0x00000000000151E6L});
    public static final BitSet FOLLOW_80_in_forloop836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_in_assigment848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_assign894 = new BitSet(new long[]{0x2660000000000000L});
    public static final BitSet FOLLOW_change_in_assign897 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_assign899 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_assign901 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_61_in_assign904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_printNew_in_assign906 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_assign909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_change920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_change922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_change924 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_change929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition969 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition972 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_condition974 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_RelationalOperators_in_condition977 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_condition_in_condition979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_int_dec1043 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INT_in_int_dec1046 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1048 = new BitSet(new long[]{0x2080001000000000L});
    public static final BitSet FOLLOW_61_in_int_dec1052 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_int_dec1054 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_55_in_int_dec1059 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_int_dec1061 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_int_dec1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_double_dec1081 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLE_in_double_dec1084 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1086 = new BitSet(new long[]{0x2080001000000000L});
    public static final BitSet FOLLOW_61_in_double_dec1090 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_double_dec1092 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_55_in_double_dec1097 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_double_dec1099 = new BitSet(new long[]{0x0080001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_double_dec1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_normal_decl1112 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_61_in_normal_decl1116 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_normal_decl1118 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_normal_decl1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_bool_decl1128 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_bool_decl1130 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_bool_decl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_other_decl1139 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_other_decl1141 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_other_decl1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arr_decl1150 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arr_decl1152 = new BitSet(new long[]{0x0000104000820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_arrayDeclaration_in_arr_decl1154 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arr_decl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_arr_decl1160 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arr_decl1162 = new BitSet(new long[]{0x0000104000820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_arrayDeclaration_in_arr_decl1164 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arr_decl1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Modifier_in_string_dec1178 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_STRING_in_string_dec1181 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_string_dec1183 = new BitSet(new long[]{0x2000001000000000L});
    public static final BitSet FOLLOW_61_in_string_dec1186 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_Strings_in_string_dec1188 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_string_dec1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1225 = new BitSet(new long[]{0x0110000000000002L});
    public static final BitSet FOLLOW_set_in_generalArithExpr1228 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_term_in_generalArithExpr1238 = new BitSet(new long[]{0x0110000000000002L});
    public static final BitSet FOLLOW_factor_in_term1276 = new BitSet(new long[]{0x1008000000000002L});
    public static final BitSet FOLLOW_set_in_term1280 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_factor_in_term1291 = new BitSet(new long[]{0x1008000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_factor1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DNUM_in_factor1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_factor1367 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_factor1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_factor1385 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_INT_in_factor1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_factor1403 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DNUM_in_factor1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_factor1422 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_factor1424 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_factor1426 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_factor1428 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_miniMethod_in_factor1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeMiniMethod_in_factor1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethodNoParams_in_factor1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nodeCallMeth_in_factor1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_specialCond1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_printStatement1543 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_printStatement1545 = new BitSet(new long[]{0x0004124080820200L,0x0000000000001526L});
    public static final BitSet FOLLOW_printContent_in_printStatement1547 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_printStatement1551 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_printStatement1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_printNew1559 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_nodeMiniMethod_in_printNew1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethod_in_nodeMiniMethod1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethodNoParams_in_nodeMiniMethodNoParams1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callMeth_in_nodeCallMeth1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethodExtention_in_miniMethod1623 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_miniMethod1626 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_miniMethodExtention_in_miniMethod1628 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_VAR_in_miniMethodExtention1640 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_miniMethodExtention1643 = new BitSet(new long[]{0x0106100080010000L});
    public static final BitSet FOLLOW_miniMethodparams_in_miniMethodExtention1645 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_miniMethodExtention1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_generalArithExpr_in_miniMethodparams1656 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_miniMethodparams1659 = new BitSet(new long[]{0x0102100080010000L});
    public static final BitSet FOLLOW_generalArithExpr_in_miniMethodparams1661 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_VAR_in_miniMethodNoParams1673 = new BitSet(new long[]{0x0800100000000000L});
    public static final BitSet FOLLOW_59_in_miniMethodNoParams1677 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_miniMethodExtention_in_miniMethodNoParams1679 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_VAR_in_callMeth1686 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_callMeth1689 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_callMeth1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_array1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1711 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayAccess1713 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayAccess1721 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayAccess1723 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1726 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1728 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayAccess1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1736 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayAccess1738 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayAccess1746 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayAccess1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1755 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayAccess1757 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayAccess1765 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayAccess1767 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1770 = new BitSet(new long[]{0x1118000000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1772 = new BitSet(new long[]{0x1118000000000000L});
    public static final BitSet FOLLOW_set_in_arrayAccess1775 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayAccess1792 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayAccess1794 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayAccess1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_arrayDeclaration1807 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayDeclaration1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayDeclaration1810 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayDeclaration1812 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayDeclaration1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_arrayDeclaration1820 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayDeclaration1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayDeclaration1823 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayDeclaration1825 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayDeclaration1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arrayDeclaration1829 = new BitSet(new long[]{0x0000004000820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_datatype_in_arrayDeclaration1831 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayDeclaration1833 = new BitSet(new long[]{0x0000020080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_numbers_in_arrayDeclaration1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_Strings_in_arrayDeclaration1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayDeclaration1840 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayDeclaration1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayDeclaration1846 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayDeclaration1848 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayDeclaration1849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayDeclaration1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_arrayInitialize1861 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayInitialize1863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayInitialize1864 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1866 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayInitialize1868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayInitialize1870 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayInitialize1873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Strings_in_arrayInitialize1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayInitialize1880 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayInitialize1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1887 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayInitialize1889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayInitialize1891 = new BitSet(new long[]{0x0000000080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_numbers_in_arrayInitialize1894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayInitialize1898 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayInitialize1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1905 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayInitialize1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayInitialize1909 = new BitSet(new long[]{0x0000020000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Strings_in_arrayInitialize1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayInitialize1916 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayInitialize1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1923 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayInitialize1925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arrayInitialize1927 = new BitSet(new long[]{0x0000004000820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_datatype_in_arrayInitialize1929 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayInitialize1931 = new BitSet(new long[]{0x0000100080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_numbers_in_arrayInitialize1934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayInitialize1942 = new BitSet(new long[]{0x0000001000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayInitialize1946 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_numbers_in_arrayInitialize1949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Strings_in_arrayInitialize1953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayInitialize1956 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayInitialize1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatype_in_arrayInitialize1965 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayInitialize1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayInitialize1968 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_VAR_in_arrayInitialize1970 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_arrayInitialize1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arrayInitialize1974 = new BitSet(new long[]{0x0000004000820200L,0x0000000000001126L});
    public static final BitSet FOLLOW_datatype_in_arrayInitialize1976 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_arrayInitialize1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_arrayInitialize1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_arrayInitialize1981 = new BitSet(new long[]{0x0000020080000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_numbers_in_arrayInitialize1984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_Strings_in_arrayInitialize1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_arrayInitialize1992 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_arrayInitialize1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_return_stmt2187 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_argument_in_return_stmt2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_numbers2205 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_numbers2208 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NUM_in_numbers2210 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_argument_in_opration_argu2218 = new BitSet(new long[]{0x1118000000000002L});
    public static final BitSet FOLLOW_set_in_opration_argu2222 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_argument_in_opration_argu2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Strings_in_printContent2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_printContent2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethod_in_printContent2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printNew_in_printContent2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_miniMethodNoParams_in_printContent2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_printContent2249 = new BitSet(new long[]{0x1118000000000000L});
    public static final BitSet FOLLOW_set_in_printContent2251 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NUM_in_printContent2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayDeclaration_in_printContent2263 = new BitSet(new long[]{0x0000000000000002L});

}