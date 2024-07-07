// $ANTLR 3.4 /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g 2024-05-12 10:07:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniJavaLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniJavaLexer() {} 
    public MiniJavaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniJavaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g"; }

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:2:7: ( '!' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:3:7: ( '(' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:4:7: ( ')' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:5:7: ( '*' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:5:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:6:7: ( '+' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:6:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:7:7: ( '++' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:7:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:8:7: ( '+=' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:8:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:9:7: ( ',' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:10:7: ( '-' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:10:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:11:7: ( '--' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:11:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:12:7: ( '-=' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:12:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:13:7: ( '.' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:14:7: ( '/' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:14:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:15:7: ( '=' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:16:7: ( 'System.out.println' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:16:9: 'System.out.println'
            {
            match("System.out.println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:17:7: ( '[' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:18:7: ( ']' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:19:7: ( 'byte' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:19:9: 'byte'
            {
            match("byte"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:20:7: ( 'char' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:20:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:21:7: ( 'else' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:21:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:22:7: ( 'extends' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:22:9: 'extends'
            {
            match("extends"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:23:7: ( 'float' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:23:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:24:7: ( 'for' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:24:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:25:7: ( 'if' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:25:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:26:7: ( 'long' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:26:9: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:27:7: ( 'main' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:27:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:28:7: ( 'new' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:28:9: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:29:7: ( 'return' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:29:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:30:7: ( 'short' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:30:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:31:7: ( 'static' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:31:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:32:7: ( 'while' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:32:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:33:7: ( '{' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:34:7: ( '}' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:250:6: ( 'class' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:250:7: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Modifier"
    public final void mModifier() throws RecognitionException {
        try {
            int _type = Modifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:253:9: ( 'private' | 'public' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='p') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='r') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='u') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:253:11: 'private'
                    {
                    match("private"); 



                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:253:21: 'public'
                    {
                    match("public"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Modifier"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:255:5: ( 'int' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:255:7: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:256:8: ( 'double' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:256:10: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "VOID"
    public final void mVOID() throws RecognitionException {
        try {
            int _type = VOID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:257:6: ( 'void' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:257:8: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VOID"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:258:9: ( 'boolean' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:258:11: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:259:9: ( 'String' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:259:11: 'String'
            {
            match("String"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:260:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:260:7: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:260:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:261:5: ( ( '0' .. '9' )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:261:7: ( '0' .. '9' )*
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:261:7: ( '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "DNUM"
    public final void mDNUM() throws RecognitionException {
        try {
            int _type = DNUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:262:6: ( ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:262:8: ( '0' .. '9' )* '.' ( '0' .. '9' )*
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:262:8: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('.'); 

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:262:24: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DNUM"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:263:10: ( ';' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:263:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "Strings"
    public final void mStrings() throws RecognitionException {
        try {
            int _type = Strings;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:264:9: ( '\"' ( . )* '\"' )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:264:11: '\"' ( . )* '\"'
            {
            match('\"'); 

            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:264:15: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\"') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:264:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Strings"

    // $ANTLR start "RelationalOperators"
    public final void mRelationalOperators() throws RecognitionException {
        try {
            int _type = RelationalOperators;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:20: ( '==' | '!=' | '>' | '<' | '>=' | '<=' | '&&' | '||' )
            int alt7=8;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt7=1;
                }
                break;
            case '!':
                {
                alt7=2;
                }
                break;
            case '>':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='=') ) {
                    alt7=5;
                }
                else {
                    alt7=3;
                }
                }
                break;
            case '<':
                {
                int LA7_4 = input.LA(2);

                if ( (LA7_4=='=') ) {
                    alt7=6;
                }
                else {
                    alt7=4;
                }
                }
                break;
            case '&':
                {
                alt7=7;
                }
                break;
            case '|':
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:24: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:29: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:34: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:38: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 5 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:42: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 6 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:47: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 7 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:52: '&&'
                    {
                    match("&&"); 



                    }
                    break;
                case 8 :
                    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:265:57: '||'
                    {
                    match("||"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RelationalOperators"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:12: ( '/*' ( options {greedy=false; } : . )* ( '*/' )+ )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:14: '/*' ( options {greedy=false; } : . )* ( '*/' )+
            {
            match("/*"); 



            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:19: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:47: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:51: ( '*/' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:272:51: '*/'
            	    {
            	    match("*/"); 



            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:12: ( '//' ( . )* ( '\\n' )+ )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:14: '//' ( . )* ( '\\n' )+
            {
            match("//"); 



            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:19: ( . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\n') ) {
                    alt10=2;
                }
                else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:20: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:23: ( '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\n') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:273:23: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "WhiteSpace"
    public final void mWhiteSpace() throws RecognitionException {
        try {
            int _type = WhiteSpace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:274:11: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:274:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:274:13: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= '\t' && LA12_0 <= '\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WhiteSpace"

    public void mTokens() throws RecognitionException {
        // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:8: ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | Class | Modifier | INT | DOUBLE | VOID | BOOLEAN | STRING | VAR | NUM | DNUM | SEMICOLON | Strings | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace )
        int alt13=49;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:10: T__48
                {
                mT__48(); 


                }
                break;
            case 2 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:16: T__49
                {
                mT__49(); 


                }
                break;
            case 3 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:22: T__50
                {
                mT__50(); 


                }
                break;
            case 4 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:28: T__51
                {
                mT__51(); 


                }
                break;
            case 5 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:34: T__52
                {
                mT__52(); 


                }
                break;
            case 6 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:40: T__53
                {
                mT__53(); 


                }
                break;
            case 7 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:46: T__54
                {
                mT__54(); 


                }
                break;
            case 8 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:52: T__55
                {
                mT__55(); 


                }
                break;
            case 9 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:58: T__56
                {
                mT__56(); 


                }
                break;
            case 10 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:64: T__57
                {
                mT__57(); 


                }
                break;
            case 11 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:70: T__58
                {
                mT__58(); 


                }
                break;
            case 12 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:76: T__59
                {
                mT__59(); 


                }
                break;
            case 13 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:82: T__60
                {
                mT__60(); 


                }
                break;
            case 14 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:88: T__61
                {
                mT__61(); 


                }
                break;
            case 15 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:94: T__62
                {
                mT__62(); 


                }
                break;
            case 16 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:100: T__63
                {
                mT__63(); 


                }
                break;
            case 17 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:106: T__64
                {
                mT__64(); 


                }
                break;
            case 18 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:112: T__65
                {
                mT__65(); 


                }
                break;
            case 19 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:118: T__66
                {
                mT__66(); 


                }
                break;
            case 20 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:124: T__67
                {
                mT__67(); 


                }
                break;
            case 21 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:130: T__68
                {
                mT__68(); 


                }
                break;
            case 22 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:136: T__69
                {
                mT__69(); 


                }
                break;
            case 23 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:142: T__70
                {
                mT__70(); 


                }
                break;
            case 24 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:148: T__71
                {
                mT__71(); 


                }
                break;
            case 25 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:154: T__72
                {
                mT__72(); 


                }
                break;
            case 26 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:160: T__73
                {
                mT__73(); 


                }
                break;
            case 27 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:166: T__74
                {
                mT__74(); 


                }
                break;
            case 28 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:172: T__75
                {
                mT__75(); 


                }
                break;
            case 29 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:178: T__76
                {
                mT__76(); 


                }
                break;
            case 30 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:184: T__77
                {
                mT__77(); 


                }
                break;
            case 31 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:190: T__78
                {
                mT__78(); 


                }
                break;
            case 32 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:196: T__79
                {
                mT__79(); 


                }
                break;
            case 33 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:202: T__80
                {
                mT__80(); 


                }
                break;
            case 34 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:208: Class
                {
                mClass(); 


                }
                break;
            case 35 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:214: Modifier
                {
                mModifier(); 


                }
                break;
            case 36 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:223: INT
                {
                mINT(); 


                }
                break;
            case 37 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:227: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 38 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:234: VOID
                {
                mVOID(); 


                }
                break;
            case 39 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:239: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 40 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:247: STRING
                {
                mSTRING(); 


                }
                break;
            case 41 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:254: VAR
                {
                mVAR(); 


                }
                break;
            case 42 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:258: NUM
                {
                mNUM(); 


                }
                break;
            case 43 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:262: DNUM
                {
                mDNUM(); 


                }
                break;
            case 44 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:267: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 45 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:277: Strings
                {
                mStrings(); 


                }
                break;
            case 46 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:285: RelationalOperators
                {
                mRelationalOperators(); 


                }
                break;
            case 47 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:305: ML_COMMENT
                {
                mML_COMMENT(); 


                }
                break;
            case 48 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:316: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 49 :
                // /home/shehab/Documents/Projects/Mini-Java-Compiler/MiniJava.g:1:327: WhiteSpace
                {
                mWhiteSpace(); 


                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\40\1\45\3\uffff\1\50\1\uffff\1\53\1\54\1\60\1\61\1\36\2\uffff"+
        "\13\36\2\uffff\3\36\1\uffff\1\40\22\uffff\12\36\1\123\25\36\1\151"+
        "\1\uffff\1\152\2\36\1\155\12\36\1\170\1\36\1\172\1\36\1\174\2\36"+
        "\2\uffff\1\177\1\u0080\1\uffff\7\36\1\u0088\2\36\1\uffff\1\36\1"+
        "\uffff\1\u008c\1\uffff\1\36\1\u008e\2\uffff\1\36\1\u0090\1\36\1"+
        "\u0092\3\36\1\uffff\1\36\1\u0097\1\36\1\uffff\1\36\1\uffff\1\u009a"+
        "\1\uffff\1\u009b\1\uffff\1\36\1\u009d\1\u009e\2\uffff\1\u009f\1"+
        "\u00a0\2\uffff\1\u009d\4\uffff";
    static final String DFA13_eofS =
        "\u00a1\uffff";
    static final String DFA13_minS =
        "\1\11\1\75\3\uffff\1\53\1\uffff\1\55\1\60\1\52\1\75\1\164\2\uffff"+
        "\1\157\1\150\2\154\1\146\1\157\1\141\2\145\2\150\2\uffff\1\162\2"+
        "\157\1\uffff\1\56\22\uffff\1\163\1\162\1\164\1\157\2\141\1\163\1"+
        "\164\1\157\1\162\1\44\1\164\1\156\1\151\1\167\1\164\1\157\1\141"+
        "\2\151\1\142\1\165\1\151\1\164\1\151\1\145\1\154\1\162\1\163\2\145"+
        "\1\141\1\44\1\uffff\1\44\1\147\1\156\1\44\1\165\1\162\1\164\1\154"+
        "\1\166\1\154\1\142\1\144\1\145\1\156\1\44\1\145\1\44\1\163\1\44"+
        "\1\156\1\164\2\uffff\2\44\1\uffff\1\162\1\164\1\151\1\145\1\141"+
        "\1\151\1\154\1\44\1\155\1\147\1\uffff\1\141\1\uffff\1\44\1\uffff"+
        "\1\144\1\44\2\uffff\1\156\1\44\1\143\1\44\1\164\1\143\1\145\1\uffff"+
        "\1\56\1\44\1\156\1\uffff\1\163\1\uffff\1\44\1\uffff\1\44\1\uffff"+
        "\1\145\2\44\2\uffff\2\44\2\uffff\1\44\4\uffff";
    static final String DFA13_maxS =
        "\1\175\1\75\3\uffff\1\75\1\uffff\1\75\1\71\1\57\1\75\1\171\2\uffff"+
        "\1\171\1\154\1\170\1\157\1\156\1\157\1\141\2\145\1\164\1\150\2\uffff"+
        "\1\165\2\157\1\uffff\1\71\22\uffff\1\163\1\162\1\164\1\157\2\141"+
        "\1\163\1\164\1\157\1\162\1\172\1\164\1\156\1\151\1\167\1\164\1\157"+
        "\1\141\2\151\1\142\1\165\1\151\1\164\1\151\1\145\1\154\1\162\1\163"+
        "\2\145\1\141\1\172\1\uffff\1\172\1\147\1\156\1\172\1\165\1\162\1"+
        "\164\1\154\1\166\1\154\1\142\1\144\1\145\1\156\1\172\1\145\1\172"+
        "\1\163\1\172\1\156\1\164\2\uffff\2\172\1\uffff\1\162\1\164\1\151"+
        "\1\145\1\141\1\151\1\154\1\172\1\155\1\147\1\uffff\1\141\1\uffff"+
        "\1\172\1\uffff\1\144\1\172\2\uffff\1\156\1\172\1\143\1\172\1\164"+
        "\1\143\1\145\1\uffff\1\56\1\172\1\156\1\uffff\1\163\1\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\1\145\2\172\2\uffff\2\172\2\uffff\1\172\4"+
        "\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\uffff\1\10\5\uffff\1\20\1\21\13\uffff\1\40"+
        "\1\41\3\uffff\1\51\1\uffff\1\52\1\54\1\55\1\56\1\61\1\1\1\6\1\7"+
        "\1\5\1\12\1\13\1\11\1\14\1\53\1\57\1\60\1\15\1\16\41\uffff\1\30"+
        "\25\uffff\1\27\1\44\2\uffff\1\33\12\uffff\1\22\1\uffff\1\23\1\uffff"+
        "\1\24\2\uffff\1\31\1\32\7\uffff\1\46\3\uffff\1\42\1\uffff\1\26\1"+
        "\uffff\1\35\1\uffff\1\37\3\uffff\1\17\1\50\2\uffff\1\34\1\36\1\uffff"+
        "\1\43\1\45\1\47\1\25";
    static final String DFA13_specialS =
        "\u00a1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\1\1\42\1\uffff\1\36\1\uffff"+
            "\1\43\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\12\37\1\uffff"+
            "\1\41\1\43\1\12\1\43\2\uffff\22\36\1\13\7\36\1\14\1\uffff\1"+
            "\15\1\uffff\1\36\1\uffff\1\36\1\16\1\17\1\34\1\20\1\21\2\36"+
            "\1\22\2\36\1\23\1\24\1\25\1\36\1\33\1\36\1\26\1\27\2\36\1\35"+
            "\1\30\3\36\1\31\1\43\1\32",
            "\1\43",
            "",
            "",
            "",
            "\1\46\21\uffff\1\47",
            "",
            "\1\51\17\uffff\1\52",
            "\12\55",
            "\1\56\4\uffff\1\57",
            "\1\43",
            "\1\63\4\uffff\1\62",
            "",
            "",
            "\1\65\11\uffff\1\64",
            "\1\66\3\uffff\1\67",
            "\1\70\13\uffff\1\71",
            "\1\72\2\uffff\1\73",
            "\1\74\7\uffff\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102\13\uffff\1\103",
            "\1\104",
            "",
            "",
            "\1\105\2\uffff\1\106",
            "\1\107",
            "\1\110",
            "",
            "\1\55\1\uffff\12\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\153",
            "\1\154",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\171",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\173",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\175",
            "\1\176",
            "",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\u0089",
            "\1\u008a",
            "",
            "\1\u008b",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\u008d",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "\1\u008f",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\u0091",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\u0098",
            "",
            "\1\u0099",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "\1\u009c",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "\1\36\13\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | Class | Modifier | INT | DOUBLE | VOID | BOOLEAN | STRING | VAR | NUM | DNUM | SEMICOLON | Strings | RelationalOperators | ML_COMMENT | SL_COMMENT | WhiteSpace );";
        }
    }
 

}