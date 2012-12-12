package org.xtext.pipes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipesLexer extends Lexer {
    public static final int RULE_PID=5;
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalPipesLexer() {;} 
    public InternalPipesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPipesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:11:7: ( 'Walls' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:11:9: 'Walls'
            {
            match("Walls"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:12:7: ( 'and' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:12:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:13:7: ( 'Openings' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:13:9: 'Openings'
            {
            match("Openings"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:14:7: ( 'Pipes' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:14:9: 'Pipes'
            {
            match("Pipes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:15:7: ( 'Wall' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:15:9: 'Wall'
            {
            match("Wall"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:16:7: ( 'Name' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:16:9: 'Name'
            {
            match("Name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:17:7: ( 'Description' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:17:9: 'Description'
            {
            match("Description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:18:7: ( 'Placement' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:18:9: 'Placement'
            {
            match("Placement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:19:7: ( 'Opening' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:19:9: 'Opening'
            {
            match("Opening"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:20:7: ( ',' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:21:7: ( 'Pipe' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:21:9: 'Pipe'
            {
            match("Pipe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:22:7: ( '{' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:23:7: ( 'RelativeTo' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:23:9: 'RelativeTo'
            {
            match("RelativeTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:24:7: ( 'Axis2Placement3d' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:24:9: 'Axis2Placement3d'
            {
            match("Axis2Placement3d"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:25:7: ( '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:26:7: ( 'Cartesian' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:26:9: 'Cartesian'
            {
            match("Cartesian"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:27:7: ( '(' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:27:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:28:7: ( ')' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:28:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:29:7: ( 'Axis' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:29:9: 'Axis'
            {
            match("Axis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:30:7: ( 'RefDirection' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:30:9: 'RefDirection'
            {
            match("RefDirection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:31:7: ( '-' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:31:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:32:7: ( '.' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:32:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:33:7: ( 'E' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:33:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:34:7: ( 'e' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:34:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_PID"
    public final void mRULE_PID() throws RecognitionException {
        try {
            int _type = RULE_PID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1004:10: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '$' | '0' .. '9' )* )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1004:12: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '$' | '0' .. '9' )*
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1004:12: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1004:12: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1004:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '$' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='$'||LA2_0=='-'||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:
            	    {
            	    if ( input.LA(1)=='$'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
        }
    }
    // $ANTLR end "RULE_PID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1008:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1008:12: ( '0' .. '9' )+
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1008:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1008:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1012:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1012:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1012:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1012:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1014:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1016:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1016:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1018:16: ( . )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1018:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=32;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:154: RULE_PID
                {
                mRULE_PID(); 

                }
                break;
            case 26 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:163: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:171: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:180: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:192: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:208: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:224: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1:232: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\7\25\2\uffff\2\25\1\uffff\1\25\2\uffff\1\55\1\uffff\1\57\1\60\2"+
        "\25\1\uffff\1\25\1\uffff\3\34\2\uffff\10\25\2\uffff\2\25\1\uffff"+
        "\1\25\6\uffff\2\25\4\uffff\1\25\1\103\11\25\1\116\1\uffff\1\25\1"+
        "\121\1\25\1\123\3\25\1\130\1\25\1\132\1\uffff\1\25\1\134\1\uffff"+
        "\1\25\1\uffff\4\25\1\uffff\1\25\1\uffff\1\25\1\uffff\6\25\1\153"+
        "\6\25\1\162\1\uffff\6\25\1\uffff\1\171\4\25\1\176\1\uffff\1\25\1"+
        "\u0080\2\25\1\uffff\1\u0083\1\uffff\2\25\1\uffff\1\u0086\1\25\1"+
        "\uffff\3\25\1\u008b\1\uffff";
    static final String DFA14_eofS =
        "\u008c\uffff";
    static final String DFA14_minS =
        "\1\0\6\60\2\uffff\2\60\1\uffff\1\60\2\uffff\1\44\1\uffff\2\44\1"+
        "\101\1\60\1\uffff\1\60\1\uffff\2\0\1\52\2\uffff\10\60\2\uffff\2"+
        "\60\1\uffff\1\60\6\uffff\2\60\4\uffff\1\60\1\44\11\60\1\44\1\uffff"+
        "\1\60\1\44\1\60\1\44\3\60\1\44\1\60\1\44\1\uffff\1\60\1\44\1\uffff"+
        "\1\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\uffff\6\60\1\44\6"+
        "\60\1\44\1\uffff\6\60\1\uffff\1\44\4\60\1\44\1\uffff\1\60\1\44\2"+
        "\60\1\uffff\1\44\1\uffff\2\60\1\uffff\1\44\1\60\1\uffff\3\60\1\44"+
        "\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\6\172\2\uffff\2\172\1\uffff\1\172\2\uffff\1\172\1\uffff"+
        "\4\172\1\uffff\1\71\1\uffff\2\uffff\1\57\2\uffff\10\172\2\uffff"+
        "\2\172\1\uffff\1\172\6\uffff\1\172\1\71\4\uffff\14\172\1\uffff\12"+
        "\172\1\uffff\2\172\1\uffff\1\172\1\uffff\4\172\1\uffff\1\172\1\uffff"+
        "\1\172\1\uffff\16\172\1\uffff\6\172\1\uffff\6\172\1\uffff\4\172"+
        "\1\uffff\1\172\1\uffff\2\172\1\uffff\2\172\1\uffff\4\172\1\uffff";
    static final String DFA14_acceptS =
        "\7\uffff\1\12\1\14\2\uffff\1\17\1\uffff\1\21\1\22\1\uffff\1\26\4"+
        "\uffff\1\31\1\uffff\1\31\3\uffff\1\37\1\40\10\uffff\1\12\1\14\2"+
        "\uffff\1\17\1\uffff\1\21\1\22\1\25\1\26\1\27\1\30\2\uffff\1\34\1"+
        "\35\1\36\1\37\14\uffff\1\2\12\uffff\1\5\2\uffff\1\13\1\uffff\1\6"+
        "\4\uffff\1\23\1\uffff\1\1\1\uffff\1\4\16\uffff\1\11\6\uffff\1\3"+
        "\6\uffff\1\10\4\uffff\1\20\1\uffff\1\15\2\uffff\1\7\2\uffff\1\24"+
        "\4\uffff\1\16";
    static final String DFA14_specialS =
        "\1\1\27\uffff\1\2\1\0\162\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\1\34\1\27\2\34\1"+
            "\31\1\15\1\16\2\34\1\7\1\17\1\20\1\32\12\26\7\34\1\12\1\24\1"+
            "\14\1\6\1\21\10\24\1\5\1\3\1\4\1\24\1\11\4\24\1\1\3\24\3\34"+
            "\1\23\1\24\1\34\1\2\3\24\1\22\25\24\1\10\1\34\1\13\uff82\34",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\35\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\37\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\40\12\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\41\2\36\1"+
            "\42\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\43\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\44\25\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\47\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\27\36\1\50\2\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\52\31\36",
            "",
            "",
            "\1\25\10\uffff\1\25\2\uffff\12\25\7\uffff\32\25\4\uffff\1\25"+
            "\1\uffff\32\25",
            "",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\62",
            "",
            "\0\63",
            "\0\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\67\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\70\26\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\71\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\72\12\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\73\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\74\15\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\75\7\36",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\5\36\1\77\5\36\1"+
            "\76\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\100\21\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\101\10\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\62",
            "",
            "",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\102\16\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\104\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\105\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\106\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\107\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\110\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\111\31\36",
            "\12\36\7\uffff\3\36\1\112\26\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\113\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\114\6\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\22\36\1\115\7\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\117\21\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\22\36\1\120\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\122\25\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\124\10\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\125\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\126\21\36",
            "\1\25\10\uffff\1\25\2\uffff\2\36\1\127\7\36\7\uffff\32\36\4"+
            "\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\131\25\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\133\14\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\135\15\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\136\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\137\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\21\36\1\140\10\36",
            "\12\36\7\uffff\17\36\1\141\12\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\22\36\1\142\7\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\6\36\1\143\23\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\144\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\17\36\1\145\12\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\25\36\1\146\4\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\147\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\13\36\1\150\16\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\151\21\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\22\36\1\152\7\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\154\14\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\155\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\156\25\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\157\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\160\31\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\1\161\31\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\163\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\164\21\36",
            "\12\36\7\uffff\23\36\1\165\6\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\166\6\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\167\27\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\170\14\36",
            "",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\172\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\173\13\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\10\36\1\174\21\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\175\25\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\177\14\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\16\36\1\u0081\13"+
            "\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\14\36\1\u0082\15"+
            "\36",
            "",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u0084\14"+
            "\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\4\36\1\u0085\25\36",
            "",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\15\36\1\u0087\14"+
            "\36",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\23\36\1\u0088\6\36",
            "\3\36\1\u0089\6\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\3\36\1\u008a\26\36",
            "\1\25\10\uffff\1\25\2\uffff\12\36\7\uffff\32\36\4\uffff\1\36"+
            "\1\uffff\32\36",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    static class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_PID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_25 = input.LA(1);

                        s = -1;
                        if ( ((LA14_25>='\u0000' && LA14_25<='\uFFFF')) ) {s = 51;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='W') ) {s = 1;}

                        else if ( (LA14_0=='a') ) {s = 2;}

                        else if ( (LA14_0=='O') ) {s = 3;}

                        else if ( (LA14_0=='P') ) {s = 4;}

                        else if ( (LA14_0=='N') ) {s = 5;}

                        else if ( (LA14_0=='D') ) {s = 6;}

                        else if ( (LA14_0==',') ) {s = 7;}

                        else if ( (LA14_0=='{') ) {s = 8;}

                        else if ( (LA14_0=='R') ) {s = 9;}

                        else if ( (LA14_0=='A') ) {s = 10;}

                        else if ( (LA14_0=='}') ) {s = 11;}

                        else if ( (LA14_0=='C') ) {s = 12;}

                        else if ( (LA14_0=='(') ) {s = 13;}

                        else if ( (LA14_0==')') ) {s = 14;}

                        else if ( (LA14_0=='-') ) {s = 15;}

                        else if ( (LA14_0=='.') ) {s = 16;}

                        else if ( (LA14_0=='E') ) {s = 17;}

                        else if ( (LA14_0=='e') ) {s = 18;}

                        else if ( (LA14_0=='^') ) {s = 19;}

                        else if ( (LA14_0=='B'||(LA14_0>='F' && LA14_0<='M')||LA14_0=='Q'||(LA14_0>='S' && LA14_0<='V')||(LA14_0>='X' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='d')||(LA14_0>='f' && LA14_0<='z')) ) {s = 20;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='$') ) {s = 23;}

                        else if ( (LA14_0=='\"') ) {s = 24;}

                        else if ( (LA14_0=='\'') ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 27;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='#'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 28;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( ((LA14_24>='\u0000' && LA14_24<='\uFFFF')) ) {s = 51;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}