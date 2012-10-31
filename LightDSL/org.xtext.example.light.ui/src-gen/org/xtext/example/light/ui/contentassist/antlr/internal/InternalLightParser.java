package org.xtext.example.light.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.light.services.LightGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLightParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Main'", "'{'", "'}'", "'BIMServer'", "'Lamp'", "','", "'BIMServerCredentials'", "'address'", "'port'", "'projectName'", "'userName'", "'password'", "'GlobalID'", "'PredefinedType'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalLightParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLightParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLightParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g"; }


     
     	private LightGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LightGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMain"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:60:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:61:1: ( ruleMain EOF )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:62:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMain_in_entryRuleMain61);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMain68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:69:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:73:2: ( ( ( rule__Main__Group__0 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:74:1: ( ( rule__Main__Group__0 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:74:1: ( ( rule__Main__Group__0 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:75:1: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:76:1: ( rule__Main__Group__0 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:76:2: rule__Main__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__0_in_ruleMain94);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleBIMServerCredentials"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:88:1: entryRuleBIMServerCredentials : ruleBIMServerCredentials EOF ;
    public final void entryRuleBIMServerCredentials() throws RecognitionException {
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:89:1: ( ruleBIMServerCredentials EOF )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:90:1: ruleBIMServerCredentials EOF
            {
             before(grammarAccess.getBIMServerCredentialsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBIMServerCredentials_in_entryRuleBIMServerCredentials121);
            ruleBIMServerCredentials();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBIMServerCredentials128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBIMServerCredentials"


    // $ANTLR start "ruleBIMServerCredentials"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:97:1: ruleBIMServerCredentials : ( ( rule__BIMServerCredentials__Group__0 ) ) ;
    public final void ruleBIMServerCredentials() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:101:2: ( ( ( rule__BIMServerCredentials__Group__0 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:102:1: ( ( rule__BIMServerCredentials__Group__0 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:102:1: ( ( rule__BIMServerCredentials__Group__0 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:103:1: ( rule__BIMServerCredentials__Group__0 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:104:1: ( rule__BIMServerCredentials__Group__0 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:104:2: rule__BIMServerCredentials__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__0_in_ruleBIMServerCredentials154);
            rule__BIMServerCredentials__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBIMServerCredentials"


    // $ANTLR start "entryRuleLamp"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:116:1: entryRuleLamp : ruleLamp EOF ;
    public final void entryRuleLamp() throws RecognitionException {
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:117:1: ( ruleLamp EOF )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:118:1: ruleLamp EOF
            {
             before(grammarAccess.getLampRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLamp_in_entryRuleLamp181);
            ruleLamp();

            state._fsp--;

             after(grammarAccess.getLampRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLamp188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLamp"


    // $ANTLR start "ruleLamp"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:125:1: ruleLamp : ( ( rule__Lamp__Group__0 ) ) ;
    public final void ruleLamp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:129:2: ( ( ( rule__Lamp__Group__0 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:130:1: ( ( rule__Lamp__Group__0 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:130:1: ( ( rule__Lamp__Group__0 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:131:1: ( rule__Lamp__Group__0 )
            {
             before(grammarAccess.getLampAccess().getGroup()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:132:1: ( rule__Lamp__Group__0 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:132:2: rule__Lamp__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__0_in_ruleLamp214);
            rule__Lamp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLampAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLamp"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:145:1: ( ruleEString EOF )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:172:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:176:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:177:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:177:1: ( RULE_STRING )
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:178:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives310); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:183:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:183:6: ( RULE_ID )
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:184:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives327); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Main__Group__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:196:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:200:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:201:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0357);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0360);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:208:1: rule__Main__Group__0__Impl : ( () ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:212:1: ( ( () ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:213:1: ( () )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:213:1: ( () )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:214:1: ()
            {
             before(grammarAccess.getMainAccess().getMainAction_0()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:215:1: ()
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:217:1: 
            {
            }

             after(grammarAccess.getMainAccess().getMainAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:227:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:231:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:232:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1418);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1421);
            rule__Main__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:239:1: rule__Main__Group__1__Impl : ( 'Main' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:243:1: ( ( 'Main' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:244:1: ( 'Main' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:244:1: ( 'Main' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:245:1: 'Main'
            {
             before(grammarAccess.getMainAccess().getMainKeyword_1()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Main__Group__1__Impl449); 
             after(grammarAccess.getMainAccess().getMainKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:258:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:262:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:263:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2480);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__3_in_rule__Main__Group__2483);
            rule__Main__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:270:1: rule__Main__Group__2__Impl : ( '{' ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:274:1: ( ( '{' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:275:1: ( '{' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:275:1: ( '{' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:276:1: '{'
            {
             before(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Main__Group__2__Impl511); 
             after(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:289:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:293:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:294:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__3542);
            rule__Main__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__4_in_rule__Main__Group__3545);
            rule__Main__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:301:1: rule__Main__Group__3__Impl : ( ( rule__Main__Group_3__0 )? ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:305:1: ( ( ( rule__Main__Group_3__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:306:1: ( ( rule__Main__Group_3__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:306:1: ( ( rule__Main__Group_3__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:307:1: ( rule__Main__Group_3__0 )?
            {
             before(grammarAccess.getMainAccess().getGroup_3()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:308:1: ( rule__Main__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:308:2: rule__Main__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Main__Group_3__0_in_rule__Main__Group__3__Impl572);
                    rule__Main__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:318:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:322:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:323:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__4__Impl_in_rule__Main__Group__4603);
            rule__Main__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__5_in_rule__Main__Group__4606);
            rule__Main__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:330:1: rule__Main__Group__4__Impl : ( ( rule__Main__Group_4__0 )? ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:334:1: ( ( ( rule__Main__Group_4__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:335:1: ( ( rule__Main__Group_4__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:335:1: ( ( rule__Main__Group_4__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:336:1: ( rule__Main__Group_4__0 )?
            {
             before(grammarAccess.getMainAccess().getGroup_4()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:337:1: ( rule__Main__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:337:2: rule__Main__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__0_in_rule__Main__Group__4__Impl633);
                    rule__Main__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Main__Group__5"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:347:1: rule__Main__Group__5 : rule__Main__Group__5__Impl ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:351:1: ( rule__Main__Group__5__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:352:2: rule__Main__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group__5__Impl_in_rule__Main__Group__5664);
            rule__Main__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5"


    // $ANTLR start "rule__Main__Group__5__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:358:1: rule__Main__Group__5__Impl : ( '}' ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:362:1: ( ( '}' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:363:1: ( '}' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:363:1: ( '}' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:364:1: '}'
            {
             before(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Main__Group__5__Impl692); 
             after(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5__Impl"


    // $ANTLR start "rule__Main__Group_3__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:389:1: rule__Main__Group_3__0 : rule__Main__Group_3__0__Impl rule__Main__Group_3__1 ;
    public final void rule__Main__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:393:1: ( rule__Main__Group_3__0__Impl rule__Main__Group_3__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:394:2: rule__Main__Group_3__0__Impl rule__Main__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_3__0__Impl_in_rule__Main__Group_3__0735);
            rule__Main__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_3__1_in_rule__Main__Group_3__0738);
            rule__Main__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_3__0"


    // $ANTLR start "rule__Main__Group_3__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:401:1: rule__Main__Group_3__0__Impl : ( 'BIMServer' ) ;
    public final void rule__Main__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:405:1: ( ( 'BIMServer' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:406:1: ( 'BIMServer' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:406:1: ( 'BIMServer' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:407:1: 'BIMServer'
            {
             before(grammarAccess.getMainAccess().getBIMServerKeyword_3_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Main__Group_3__0__Impl766); 
             after(grammarAccess.getMainAccess().getBIMServerKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_3__0__Impl"


    // $ANTLR start "rule__Main__Group_3__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:420:1: rule__Main__Group_3__1 : rule__Main__Group_3__1__Impl ;
    public final void rule__Main__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:424:1: ( rule__Main__Group_3__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:425:2: rule__Main__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_3__1__Impl_in_rule__Main__Group_3__1797);
            rule__Main__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_3__1"


    // $ANTLR start "rule__Main__Group_3__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:431:1: rule__Main__Group_3__1__Impl : ( ( rule__Main__BIMServerAssignment_3_1 ) ) ;
    public final void rule__Main__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:435:1: ( ( ( rule__Main__BIMServerAssignment_3_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:436:1: ( ( rule__Main__BIMServerAssignment_3_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:436:1: ( ( rule__Main__BIMServerAssignment_3_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:437:1: ( rule__Main__BIMServerAssignment_3_1 )
            {
             before(grammarAccess.getMainAccess().getBIMServerAssignment_3_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:438:1: ( rule__Main__BIMServerAssignment_3_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:438:2: rule__Main__BIMServerAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__BIMServerAssignment_3_1_in_rule__Main__Group_3__1__Impl824);
            rule__Main__BIMServerAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getBIMServerAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_3__1__Impl"


    // $ANTLR start "rule__Main__Group_4__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:452:1: rule__Main__Group_4__0 : rule__Main__Group_4__0__Impl rule__Main__Group_4__1 ;
    public final void rule__Main__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:456:1: ( rule__Main__Group_4__0__Impl rule__Main__Group_4__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:457:2: rule__Main__Group_4__0__Impl rule__Main__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__0__Impl_in_rule__Main__Group_4__0858);
            rule__Main__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__1_in_rule__Main__Group_4__0861);
            rule__Main__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__0"


    // $ANTLR start "rule__Main__Group_4__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:464:1: rule__Main__Group_4__0__Impl : ( 'Lamp' ) ;
    public final void rule__Main__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:468:1: ( ( 'Lamp' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:469:1: ( 'Lamp' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:469:1: ( 'Lamp' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:470:1: 'Lamp'
            {
             before(grammarAccess.getMainAccess().getLampKeyword_4_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Main__Group_4__0__Impl889); 
             after(grammarAccess.getMainAccess().getLampKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__0__Impl"


    // $ANTLR start "rule__Main__Group_4__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:483:1: rule__Main__Group_4__1 : rule__Main__Group_4__1__Impl rule__Main__Group_4__2 ;
    public final void rule__Main__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:487:1: ( rule__Main__Group_4__1__Impl rule__Main__Group_4__2 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:488:2: rule__Main__Group_4__1__Impl rule__Main__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__1__Impl_in_rule__Main__Group_4__1920);
            rule__Main__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__2_in_rule__Main__Group_4__1923);
            rule__Main__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__1"


    // $ANTLR start "rule__Main__Group_4__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:495:1: rule__Main__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Main__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:499:1: ( ( '{' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:500:1: ( '{' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:500:1: ( '{' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:501:1: '{'
            {
             before(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Main__Group_4__1__Impl951); 
             after(grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__1__Impl"


    // $ANTLR start "rule__Main__Group_4__2"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:514:1: rule__Main__Group_4__2 : rule__Main__Group_4__2__Impl rule__Main__Group_4__3 ;
    public final void rule__Main__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:518:1: ( rule__Main__Group_4__2__Impl rule__Main__Group_4__3 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:519:2: rule__Main__Group_4__2__Impl rule__Main__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__2__Impl_in_rule__Main__Group_4__2982);
            rule__Main__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__3_in_rule__Main__Group_4__2985);
            rule__Main__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__2"


    // $ANTLR start "rule__Main__Group_4__2__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:526:1: rule__Main__Group_4__2__Impl : ( ( rule__Main__LampAssignment_4_2 ) ) ;
    public final void rule__Main__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:530:1: ( ( ( rule__Main__LampAssignment_4_2 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:531:1: ( ( rule__Main__LampAssignment_4_2 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:531:1: ( ( rule__Main__LampAssignment_4_2 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:532:1: ( rule__Main__LampAssignment_4_2 )
            {
             before(grammarAccess.getMainAccess().getLampAssignment_4_2()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:533:1: ( rule__Main__LampAssignment_4_2 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:533:2: rule__Main__LampAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__LampAssignment_4_2_in_rule__Main__Group_4__2__Impl1012);
            rule__Main__LampAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getLampAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__2__Impl"


    // $ANTLR start "rule__Main__Group_4__3"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:543:1: rule__Main__Group_4__3 : rule__Main__Group_4__3__Impl rule__Main__Group_4__4 ;
    public final void rule__Main__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:547:1: ( rule__Main__Group_4__3__Impl rule__Main__Group_4__4 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:548:2: rule__Main__Group_4__3__Impl rule__Main__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__3__Impl_in_rule__Main__Group_4__31042);
            rule__Main__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__4_in_rule__Main__Group_4__31045);
            rule__Main__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__3"


    // $ANTLR start "rule__Main__Group_4__3__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:555:1: rule__Main__Group_4__3__Impl : ( ( rule__Main__Group_4_3__0 )* ) ;
    public final void rule__Main__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:559:1: ( ( ( rule__Main__Group_4_3__0 )* ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:560:1: ( ( rule__Main__Group_4_3__0 )* )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:560:1: ( ( rule__Main__Group_4_3__0 )* )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:561:1: ( rule__Main__Group_4_3__0 )*
            {
             before(grammarAccess.getMainAccess().getGroup_4_3()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:562:1: ( rule__Main__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:562:2: rule__Main__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4_3__0_in_rule__Main__Group_4__3__Impl1072);
            	    rule__Main__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMainAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__3__Impl"


    // $ANTLR start "rule__Main__Group_4__4"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:572:1: rule__Main__Group_4__4 : rule__Main__Group_4__4__Impl ;
    public final void rule__Main__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:576:1: ( rule__Main__Group_4__4__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:577:2: rule__Main__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4__4__Impl_in_rule__Main__Group_4__41103);
            rule__Main__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__4"


    // $ANTLR start "rule__Main__Group_4__4__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:583:1: rule__Main__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Main__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:587:1: ( ( '}' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:588:1: ( '}' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:588:1: ( '}' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:589:1: '}'
            {
             before(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Main__Group_4__4__Impl1131); 
             after(grammarAccess.getMainAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4__4__Impl"


    // $ANTLR start "rule__Main__Group_4_3__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:612:1: rule__Main__Group_4_3__0 : rule__Main__Group_4_3__0__Impl rule__Main__Group_4_3__1 ;
    public final void rule__Main__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:616:1: ( rule__Main__Group_4_3__0__Impl rule__Main__Group_4_3__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:617:2: rule__Main__Group_4_3__0__Impl rule__Main__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4_3__0__Impl_in_rule__Main__Group_4_3__01172);
            rule__Main__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4_3__1_in_rule__Main__Group_4_3__01175);
            rule__Main__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4_3__0"


    // $ANTLR start "rule__Main__Group_4_3__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:624:1: rule__Main__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Main__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:628:1: ( ( ',' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:629:1: ( ',' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:629:1: ( ',' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:630:1: ','
            {
             before(grammarAccess.getMainAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Main__Group_4_3__0__Impl1203); 
             after(grammarAccess.getMainAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4_3__0__Impl"


    // $ANTLR start "rule__Main__Group_4_3__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:643:1: rule__Main__Group_4_3__1 : rule__Main__Group_4_3__1__Impl ;
    public final void rule__Main__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:647:1: ( rule__Main__Group_4_3__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:648:2: rule__Main__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__Group_4_3__1__Impl_in_rule__Main__Group_4_3__11234);
            rule__Main__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4_3__1"


    // $ANTLR start "rule__Main__Group_4_3__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:654:1: rule__Main__Group_4_3__1__Impl : ( ( rule__Main__LampAssignment_4_3_1 ) ) ;
    public final void rule__Main__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:658:1: ( ( ( rule__Main__LampAssignment_4_3_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:659:1: ( ( rule__Main__LampAssignment_4_3_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:659:1: ( ( rule__Main__LampAssignment_4_3_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:660:1: ( rule__Main__LampAssignment_4_3_1 )
            {
             before(grammarAccess.getMainAccess().getLampAssignment_4_3_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:661:1: ( rule__Main__LampAssignment_4_3_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:661:2: rule__Main__LampAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Main__LampAssignment_4_3_1_in_rule__Main__Group_4_3__1__Impl1261);
            rule__Main__LampAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getLampAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group_4_3__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:675:1: rule__BIMServerCredentials__Group__0 : rule__BIMServerCredentials__Group__0__Impl rule__BIMServerCredentials__Group__1 ;
    public final void rule__BIMServerCredentials__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:679:1: ( rule__BIMServerCredentials__Group__0__Impl rule__BIMServerCredentials__Group__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:680:2: rule__BIMServerCredentials__Group__0__Impl rule__BIMServerCredentials__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__0__Impl_in_rule__BIMServerCredentials__Group__01295);
            rule__BIMServerCredentials__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__1_in_rule__BIMServerCredentials__Group__01298);
            rule__BIMServerCredentials__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__0"


    // $ANTLR start "rule__BIMServerCredentials__Group__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:687:1: rule__BIMServerCredentials__Group__0__Impl : ( () ) ;
    public final void rule__BIMServerCredentials__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:691:1: ( ( () ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:692:1: ( () )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:692:1: ( () )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:693:1: ()
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsAction_0()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:694:1: ()
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:696:1: 
            {
            }

             after(grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:706:1: rule__BIMServerCredentials__Group__1 : rule__BIMServerCredentials__Group__1__Impl rule__BIMServerCredentials__Group__2 ;
    public final void rule__BIMServerCredentials__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:710:1: ( rule__BIMServerCredentials__Group__1__Impl rule__BIMServerCredentials__Group__2 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:711:2: rule__BIMServerCredentials__Group__1__Impl rule__BIMServerCredentials__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__1__Impl_in_rule__BIMServerCredentials__Group__11356);
            rule__BIMServerCredentials__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__2_in_rule__BIMServerCredentials__Group__11359);
            rule__BIMServerCredentials__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__1"


    // $ANTLR start "rule__BIMServerCredentials__Group__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:718:1: rule__BIMServerCredentials__Group__1__Impl : ( 'BIMServerCredentials' ) ;
    public final void rule__BIMServerCredentials__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:722:1: ( ( 'BIMServerCredentials' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:723:1: ( 'BIMServerCredentials' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:723:1: ( 'BIMServerCredentials' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:724:1: 'BIMServerCredentials'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsKeyword_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__BIMServerCredentials__Group__1__Impl1387); 
             after(grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__2"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:737:1: rule__BIMServerCredentials__Group__2 : rule__BIMServerCredentials__Group__2__Impl rule__BIMServerCredentials__Group__3 ;
    public final void rule__BIMServerCredentials__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:741:1: ( rule__BIMServerCredentials__Group__2__Impl rule__BIMServerCredentials__Group__3 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:742:2: rule__BIMServerCredentials__Group__2__Impl rule__BIMServerCredentials__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__2__Impl_in_rule__BIMServerCredentials__Group__21418);
            rule__BIMServerCredentials__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__3_in_rule__BIMServerCredentials__Group__21421);
            rule__BIMServerCredentials__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__2"


    // $ANTLR start "rule__BIMServerCredentials__Group__2__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:749:1: rule__BIMServerCredentials__Group__2__Impl : ( '{' ) ;
    public final void rule__BIMServerCredentials__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:753:1: ( ( '{' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:754:1: ( '{' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:754:1: ( '{' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:755:1: '{'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__BIMServerCredentials__Group__2__Impl1449); 
             after(grammarAccess.getBIMServerCredentialsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__2__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__3"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:768:1: rule__BIMServerCredentials__Group__3 : rule__BIMServerCredentials__Group__3__Impl rule__BIMServerCredentials__Group__4 ;
    public final void rule__BIMServerCredentials__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:772:1: ( rule__BIMServerCredentials__Group__3__Impl rule__BIMServerCredentials__Group__4 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:773:2: rule__BIMServerCredentials__Group__3__Impl rule__BIMServerCredentials__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__3__Impl_in_rule__BIMServerCredentials__Group__31480);
            rule__BIMServerCredentials__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__4_in_rule__BIMServerCredentials__Group__31483);
            rule__BIMServerCredentials__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__3"


    // $ANTLR start "rule__BIMServerCredentials__Group__3__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:780:1: rule__BIMServerCredentials__Group__3__Impl : ( ( rule__BIMServerCredentials__Group_3__0 )? ) ;
    public final void rule__BIMServerCredentials__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:784:1: ( ( ( rule__BIMServerCredentials__Group_3__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:785:1: ( ( rule__BIMServerCredentials__Group_3__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:785:1: ( ( rule__BIMServerCredentials__Group_3__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:786:1: ( rule__BIMServerCredentials__Group_3__0 )?
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup_3()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:787:1: ( rule__BIMServerCredentials__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:787:2: rule__BIMServerCredentials__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_3__0_in_rule__BIMServerCredentials__Group__3__Impl1510);
                    rule__BIMServerCredentials__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__3__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__4"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:797:1: rule__BIMServerCredentials__Group__4 : rule__BIMServerCredentials__Group__4__Impl rule__BIMServerCredentials__Group__5 ;
    public final void rule__BIMServerCredentials__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:801:1: ( rule__BIMServerCredentials__Group__4__Impl rule__BIMServerCredentials__Group__5 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:802:2: rule__BIMServerCredentials__Group__4__Impl rule__BIMServerCredentials__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__4__Impl_in_rule__BIMServerCredentials__Group__41541);
            rule__BIMServerCredentials__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__5_in_rule__BIMServerCredentials__Group__41544);
            rule__BIMServerCredentials__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__4"


    // $ANTLR start "rule__BIMServerCredentials__Group__4__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:809:1: rule__BIMServerCredentials__Group__4__Impl : ( ( rule__BIMServerCredentials__Group_4__0 )? ) ;
    public final void rule__BIMServerCredentials__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:813:1: ( ( ( rule__BIMServerCredentials__Group_4__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:814:1: ( ( rule__BIMServerCredentials__Group_4__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:814:1: ( ( rule__BIMServerCredentials__Group_4__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:815:1: ( rule__BIMServerCredentials__Group_4__0 )?
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup_4()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:816:1: ( rule__BIMServerCredentials__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:816:2: rule__BIMServerCredentials__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_4__0_in_rule__BIMServerCredentials__Group__4__Impl1571);
                    rule__BIMServerCredentials__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__4__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__5"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:826:1: rule__BIMServerCredentials__Group__5 : rule__BIMServerCredentials__Group__5__Impl rule__BIMServerCredentials__Group__6 ;
    public final void rule__BIMServerCredentials__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:830:1: ( rule__BIMServerCredentials__Group__5__Impl rule__BIMServerCredentials__Group__6 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:831:2: rule__BIMServerCredentials__Group__5__Impl rule__BIMServerCredentials__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__5__Impl_in_rule__BIMServerCredentials__Group__51602);
            rule__BIMServerCredentials__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__6_in_rule__BIMServerCredentials__Group__51605);
            rule__BIMServerCredentials__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__5"


    // $ANTLR start "rule__BIMServerCredentials__Group__5__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:838:1: rule__BIMServerCredentials__Group__5__Impl : ( ( rule__BIMServerCredentials__Group_5__0 )? ) ;
    public final void rule__BIMServerCredentials__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:842:1: ( ( ( rule__BIMServerCredentials__Group_5__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:843:1: ( ( rule__BIMServerCredentials__Group_5__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:843:1: ( ( rule__BIMServerCredentials__Group_5__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:844:1: ( rule__BIMServerCredentials__Group_5__0 )?
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup_5()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:845:1: ( rule__BIMServerCredentials__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:845:2: rule__BIMServerCredentials__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_5__0_in_rule__BIMServerCredentials__Group__5__Impl1632);
                    rule__BIMServerCredentials__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__5__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__6"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:855:1: rule__BIMServerCredentials__Group__6 : rule__BIMServerCredentials__Group__6__Impl rule__BIMServerCredentials__Group__7 ;
    public final void rule__BIMServerCredentials__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:859:1: ( rule__BIMServerCredentials__Group__6__Impl rule__BIMServerCredentials__Group__7 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:860:2: rule__BIMServerCredentials__Group__6__Impl rule__BIMServerCredentials__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__6__Impl_in_rule__BIMServerCredentials__Group__61663);
            rule__BIMServerCredentials__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__7_in_rule__BIMServerCredentials__Group__61666);
            rule__BIMServerCredentials__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__6"


    // $ANTLR start "rule__BIMServerCredentials__Group__6__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:867:1: rule__BIMServerCredentials__Group__6__Impl : ( ( rule__BIMServerCredentials__Group_6__0 )? ) ;
    public final void rule__BIMServerCredentials__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:871:1: ( ( ( rule__BIMServerCredentials__Group_6__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:872:1: ( ( rule__BIMServerCredentials__Group_6__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:872:1: ( ( rule__BIMServerCredentials__Group_6__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:873:1: ( rule__BIMServerCredentials__Group_6__0 )?
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup_6()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:874:1: ( rule__BIMServerCredentials__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:874:2: rule__BIMServerCredentials__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_6__0_in_rule__BIMServerCredentials__Group__6__Impl1693);
                    rule__BIMServerCredentials__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__6__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__7"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:884:1: rule__BIMServerCredentials__Group__7 : rule__BIMServerCredentials__Group__7__Impl rule__BIMServerCredentials__Group__8 ;
    public final void rule__BIMServerCredentials__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:888:1: ( rule__BIMServerCredentials__Group__7__Impl rule__BIMServerCredentials__Group__8 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:889:2: rule__BIMServerCredentials__Group__7__Impl rule__BIMServerCredentials__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__7__Impl_in_rule__BIMServerCredentials__Group__71724);
            rule__BIMServerCredentials__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__8_in_rule__BIMServerCredentials__Group__71727);
            rule__BIMServerCredentials__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__7"


    // $ANTLR start "rule__BIMServerCredentials__Group__7__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:896:1: rule__BIMServerCredentials__Group__7__Impl : ( ( rule__BIMServerCredentials__Group_7__0 )? ) ;
    public final void rule__BIMServerCredentials__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:900:1: ( ( ( rule__BIMServerCredentials__Group_7__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:901:1: ( ( rule__BIMServerCredentials__Group_7__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:901:1: ( ( rule__BIMServerCredentials__Group_7__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:902:1: ( rule__BIMServerCredentials__Group_7__0 )?
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getGroup_7()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:903:1: ( rule__BIMServerCredentials__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:903:2: rule__BIMServerCredentials__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_7__0_in_rule__BIMServerCredentials__Group__7__Impl1754);
                    rule__BIMServerCredentials__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBIMServerCredentialsAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__7__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group__8"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:913:1: rule__BIMServerCredentials__Group__8 : rule__BIMServerCredentials__Group__8__Impl ;
    public final void rule__BIMServerCredentials__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:917:1: ( rule__BIMServerCredentials__Group__8__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:918:2: rule__BIMServerCredentials__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group__8__Impl_in_rule__BIMServerCredentials__Group__81785);
            rule__BIMServerCredentials__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__8"


    // $ANTLR start "rule__BIMServerCredentials__Group__8__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:924:1: rule__BIMServerCredentials__Group__8__Impl : ( '}' ) ;
    public final void rule__BIMServerCredentials__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:928:1: ( ( '}' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:929:1: ( '}' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:929:1: ( '}' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:930:1: '}'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__BIMServerCredentials__Group__8__Impl1813); 
             after(grammarAccess.getBIMServerCredentialsAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group__8__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_3__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:961:1: rule__BIMServerCredentials__Group_3__0 : rule__BIMServerCredentials__Group_3__0__Impl rule__BIMServerCredentials__Group_3__1 ;
    public final void rule__BIMServerCredentials__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:965:1: ( rule__BIMServerCredentials__Group_3__0__Impl rule__BIMServerCredentials__Group_3__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:966:2: rule__BIMServerCredentials__Group_3__0__Impl rule__BIMServerCredentials__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_3__0__Impl_in_rule__BIMServerCredentials__Group_3__01862);
            rule__BIMServerCredentials__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_3__1_in_rule__BIMServerCredentials__Group_3__01865);
            rule__BIMServerCredentials__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_3__0"


    // $ANTLR start "rule__BIMServerCredentials__Group_3__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:973:1: rule__BIMServerCredentials__Group_3__0__Impl : ( 'address' ) ;
    public final void rule__BIMServerCredentials__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:977:1: ( ( 'address' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:978:1: ( 'address' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:978:1: ( 'address' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:979:1: 'address'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getAddressKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__BIMServerCredentials__Group_3__0__Impl1893); 
             after(grammarAccess.getBIMServerCredentialsAccess().getAddressKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_3__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_3__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:992:1: rule__BIMServerCredentials__Group_3__1 : rule__BIMServerCredentials__Group_3__1__Impl ;
    public final void rule__BIMServerCredentials__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:996:1: ( rule__BIMServerCredentials__Group_3__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:997:2: rule__BIMServerCredentials__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_3__1__Impl_in_rule__BIMServerCredentials__Group_3__11924);
            rule__BIMServerCredentials__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_3__1"


    // $ANTLR start "rule__BIMServerCredentials__Group_3__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1003:1: rule__BIMServerCredentials__Group_3__1__Impl : ( ( rule__BIMServerCredentials__AddressAssignment_3_1 ) ) ;
    public final void rule__BIMServerCredentials__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1007:1: ( ( ( rule__BIMServerCredentials__AddressAssignment_3_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1008:1: ( ( rule__BIMServerCredentials__AddressAssignment_3_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1008:1: ( ( rule__BIMServerCredentials__AddressAssignment_3_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1009:1: ( rule__BIMServerCredentials__AddressAssignment_3_1 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getAddressAssignment_3_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1010:1: ( rule__BIMServerCredentials__AddressAssignment_3_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1010:2: rule__BIMServerCredentials__AddressAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__AddressAssignment_3_1_in_rule__BIMServerCredentials__Group_3__1__Impl1951);
            rule__BIMServerCredentials__AddressAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getAddressAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_3__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_4__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1024:1: rule__BIMServerCredentials__Group_4__0 : rule__BIMServerCredentials__Group_4__0__Impl rule__BIMServerCredentials__Group_4__1 ;
    public final void rule__BIMServerCredentials__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1028:1: ( rule__BIMServerCredentials__Group_4__0__Impl rule__BIMServerCredentials__Group_4__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1029:2: rule__BIMServerCredentials__Group_4__0__Impl rule__BIMServerCredentials__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_4__0__Impl_in_rule__BIMServerCredentials__Group_4__01985);
            rule__BIMServerCredentials__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_4__1_in_rule__BIMServerCredentials__Group_4__01988);
            rule__BIMServerCredentials__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_4__0"


    // $ANTLR start "rule__BIMServerCredentials__Group_4__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1036:1: rule__BIMServerCredentials__Group_4__0__Impl : ( 'port' ) ;
    public final void rule__BIMServerCredentials__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1040:1: ( ( 'port' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1041:1: ( 'port' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1041:1: ( 'port' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1042:1: 'port'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPortKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__BIMServerCredentials__Group_4__0__Impl2016); 
             after(grammarAccess.getBIMServerCredentialsAccess().getPortKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_4__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_4__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1055:1: rule__BIMServerCredentials__Group_4__1 : rule__BIMServerCredentials__Group_4__1__Impl ;
    public final void rule__BIMServerCredentials__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1059:1: ( rule__BIMServerCredentials__Group_4__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1060:2: rule__BIMServerCredentials__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_4__1__Impl_in_rule__BIMServerCredentials__Group_4__12047);
            rule__BIMServerCredentials__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_4__1"


    // $ANTLR start "rule__BIMServerCredentials__Group_4__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1066:1: rule__BIMServerCredentials__Group_4__1__Impl : ( ( rule__BIMServerCredentials__PortAssignment_4_1 ) ) ;
    public final void rule__BIMServerCredentials__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1070:1: ( ( ( rule__BIMServerCredentials__PortAssignment_4_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1071:1: ( ( rule__BIMServerCredentials__PortAssignment_4_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1071:1: ( ( rule__BIMServerCredentials__PortAssignment_4_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1072:1: ( rule__BIMServerCredentials__PortAssignment_4_1 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPortAssignment_4_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1073:1: ( rule__BIMServerCredentials__PortAssignment_4_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1073:2: rule__BIMServerCredentials__PortAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__PortAssignment_4_1_in_rule__BIMServerCredentials__Group_4__1__Impl2074);
            rule__BIMServerCredentials__PortAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getPortAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_4__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_5__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1087:1: rule__BIMServerCredentials__Group_5__0 : rule__BIMServerCredentials__Group_5__0__Impl rule__BIMServerCredentials__Group_5__1 ;
    public final void rule__BIMServerCredentials__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1091:1: ( rule__BIMServerCredentials__Group_5__0__Impl rule__BIMServerCredentials__Group_5__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1092:2: rule__BIMServerCredentials__Group_5__0__Impl rule__BIMServerCredentials__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_5__0__Impl_in_rule__BIMServerCredentials__Group_5__02108);
            rule__BIMServerCredentials__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_5__1_in_rule__BIMServerCredentials__Group_5__02111);
            rule__BIMServerCredentials__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_5__0"


    // $ANTLR start "rule__BIMServerCredentials__Group_5__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1099:1: rule__BIMServerCredentials__Group_5__0__Impl : ( 'projectName' ) ;
    public final void rule__BIMServerCredentials__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1103:1: ( ( 'projectName' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1104:1: ( 'projectName' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1104:1: ( 'projectName' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1105:1: 'projectName'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getProjectNameKeyword_5_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__BIMServerCredentials__Group_5__0__Impl2139); 
             after(grammarAccess.getBIMServerCredentialsAccess().getProjectNameKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_5__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_5__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1118:1: rule__BIMServerCredentials__Group_5__1 : rule__BIMServerCredentials__Group_5__1__Impl ;
    public final void rule__BIMServerCredentials__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1122:1: ( rule__BIMServerCredentials__Group_5__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1123:2: rule__BIMServerCredentials__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_5__1__Impl_in_rule__BIMServerCredentials__Group_5__12170);
            rule__BIMServerCredentials__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_5__1"


    // $ANTLR start "rule__BIMServerCredentials__Group_5__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1129:1: rule__BIMServerCredentials__Group_5__1__Impl : ( ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 ) ) ;
    public final void rule__BIMServerCredentials__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1133:1: ( ( ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1134:1: ( ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1134:1: ( ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1135:1: ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getProjectNameAssignment_5_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1136:1: ( rule__BIMServerCredentials__ProjectNameAssignment_5_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1136:2: rule__BIMServerCredentials__ProjectNameAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__ProjectNameAssignment_5_1_in_rule__BIMServerCredentials__Group_5__1__Impl2197);
            rule__BIMServerCredentials__ProjectNameAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getProjectNameAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_5__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_6__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1150:1: rule__BIMServerCredentials__Group_6__0 : rule__BIMServerCredentials__Group_6__0__Impl rule__BIMServerCredentials__Group_6__1 ;
    public final void rule__BIMServerCredentials__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1154:1: ( rule__BIMServerCredentials__Group_6__0__Impl rule__BIMServerCredentials__Group_6__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1155:2: rule__BIMServerCredentials__Group_6__0__Impl rule__BIMServerCredentials__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_6__0__Impl_in_rule__BIMServerCredentials__Group_6__02231);
            rule__BIMServerCredentials__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_6__1_in_rule__BIMServerCredentials__Group_6__02234);
            rule__BIMServerCredentials__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_6__0"


    // $ANTLR start "rule__BIMServerCredentials__Group_6__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1162:1: rule__BIMServerCredentials__Group_6__0__Impl : ( 'userName' ) ;
    public final void rule__BIMServerCredentials__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1166:1: ( ( 'userName' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1167:1: ( 'userName' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1167:1: ( 'userName' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1168:1: 'userName'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getUserNameKeyword_6_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__BIMServerCredentials__Group_6__0__Impl2262); 
             after(grammarAccess.getBIMServerCredentialsAccess().getUserNameKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_6__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_6__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1181:1: rule__BIMServerCredentials__Group_6__1 : rule__BIMServerCredentials__Group_6__1__Impl ;
    public final void rule__BIMServerCredentials__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1185:1: ( rule__BIMServerCredentials__Group_6__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1186:2: rule__BIMServerCredentials__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_6__1__Impl_in_rule__BIMServerCredentials__Group_6__12293);
            rule__BIMServerCredentials__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_6__1"


    // $ANTLR start "rule__BIMServerCredentials__Group_6__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1192:1: rule__BIMServerCredentials__Group_6__1__Impl : ( ( rule__BIMServerCredentials__UserNameAssignment_6_1 ) ) ;
    public final void rule__BIMServerCredentials__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1196:1: ( ( ( rule__BIMServerCredentials__UserNameAssignment_6_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1197:1: ( ( rule__BIMServerCredentials__UserNameAssignment_6_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1197:1: ( ( rule__BIMServerCredentials__UserNameAssignment_6_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1198:1: ( rule__BIMServerCredentials__UserNameAssignment_6_1 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getUserNameAssignment_6_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1199:1: ( rule__BIMServerCredentials__UserNameAssignment_6_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1199:2: rule__BIMServerCredentials__UserNameAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__UserNameAssignment_6_1_in_rule__BIMServerCredentials__Group_6__1__Impl2320);
            rule__BIMServerCredentials__UserNameAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getUserNameAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_6__1__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_7__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1213:1: rule__BIMServerCredentials__Group_7__0 : rule__BIMServerCredentials__Group_7__0__Impl rule__BIMServerCredentials__Group_7__1 ;
    public final void rule__BIMServerCredentials__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1217:1: ( rule__BIMServerCredentials__Group_7__0__Impl rule__BIMServerCredentials__Group_7__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1218:2: rule__BIMServerCredentials__Group_7__0__Impl rule__BIMServerCredentials__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_7__0__Impl_in_rule__BIMServerCredentials__Group_7__02354);
            rule__BIMServerCredentials__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_7__1_in_rule__BIMServerCredentials__Group_7__02357);
            rule__BIMServerCredentials__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_7__0"


    // $ANTLR start "rule__BIMServerCredentials__Group_7__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1225:1: rule__BIMServerCredentials__Group_7__0__Impl : ( 'password' ) ;
    public final void rule__BIMServerCredentials__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1229:1: ( ( 'password' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1230:1: ( 'password' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1230:1: ( 'password' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1231:1: 'password'
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPasswordKeyword_7_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__BIMServerCredentials__Group_7__0__Impl2385); 
             after(grammarAccess.getBIMServerCredentialsAccess().getPasswordKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_7__0__Impl"


    // $ANTLR start "rule__BIMServerCredentials__Group_7__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1244:1: rule__BIMServerCredentials__Group_7__1 : rule__BIMServerCredentials__Group_7__1__Impl ;
    public final void rule__BIMServerCredentials__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1248:1: ( rule__BIMServerCredentials__Group_7__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1249:2: rule__BIMServerCredentials__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__Group_7__1__Impl_in_rule__BIMServerCredentials__Group_7__12416);
            rule__BIMServerCredentials__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_7__1"


    // $ANTLR start "rule__BIMServerCredentials__Group_7__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1255:1: rule__BIMServerCredentials__Group_7__1__Impl : ( ( rule__BIMServerCredentials__PasswordAssignment_7_1 ) ) ;
    public final void rule__BIMServerCredentials__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1259:1: ( ( ( rule__BIMServerCredentials__PasswordAssignment_7_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1260:1: ( ( rule__BIMServerCredentials__PasswordAssignment_7_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1260:1: ( ( rule__BIMServerCredentials__PasswordAssignment_7_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1261:1: ( rule__BIMServerCredentials__PasswordAssignment_7_1 )
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPasswordAssignment_7_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1262:1: ( rule__BIMServerCredentials__PasswordAssignment_7_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1262:2: rule__BIMServerCredentials__PasswordAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__BIMServerCredentials__PasswordAssignment_7_1_in_rule__BIMServerCredentials__Group_7__1__Impl2443);
            rule__BIMServerCredentials__PasswordAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBIMServerCredentialsAccess().getPasswordAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__Group_7__1__Impl"


    // $ANTLR start "rule__Lamp__Group__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1276:1: rule__Lamp__Group__0 : rule__Lamp__Group__0__Impl rule__Lamp__Group__1 ;
    public final void rule__Lamp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1280:1: ( rule__Lamp__Group__0__Impl rule__Lamp__Group__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1281:2: rule__Lamp__Group__0__Impl rule__Lamp__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__0__Impl_in_rule__Lamp__Group__02477);
            rule__Lamp__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__1_in_rule__Lamp__Group__02480);
            rule__Lamp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__0"


    // $ANTLR start "rule__Lamp__Group__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1288:1: rule__Lamp__Group__0__Impl : ( () ) ;
    public final void rule__Lamp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1292:1: ( ( () ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1293:1: ( () )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1293:1: ( () )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1294:1: ()
            {
             before(grammarAccess.getLampAccess().getLampAction_0()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1295:1: ()
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1297:1: 
            {
            }

             after(grammarAccess.getLampAccess().getLampAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__0__Impl"


    // $ANTLR start "rule__Lamp__Group__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1307:1: rule__Lamp__Group__1 : rule__Lamp__Group__1__Impl rule__Lamp__Group__2 ;
    public final void rule__Lamp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1311:1: ( rule__Lamp__Group__1__Impl rule__Lamp__Group__2 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1312:2: rule__Lamp__Group__1__Impl rule__Lamp__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__1__Impl_in_rule__Lamp__Group__12538);
            rule__Lamp__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__2_in_rule__Lamp__Group__12541);
            rule__Lamp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__1"


    // $ANTLR start "rule__Lamp__Group__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1319:1: rule__Lamp__Group__1__Impl : ( 'Lamp' ) ;
    public final void rule__Lamp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1323:1: ( ( 'Lamp' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1324:1: ( 'Lamp' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1324:1: ( 'Lamp' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1325:1: 'Lamp'
            {
             before(grammarAccess.getLampAccess().getLampKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Lamp__Group__1__Impl2569); 
             after(grammarAccess.getLampAccess().getLampKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__1__Impl"


    // $ANTLR start "rule__Lamp__Group__2"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1338:1: rule__Lamp__Group__2 : rule__Lamp__Group__2__Impl rule__Lamp__Group__3 ;
    public final void rule__Lamp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1342:1: ( rule__Lamp__Group__2__Impl rule__Lamp__Group__3 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1343:2: rule__Lamp__Group__2__Impl rule__Lamp__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__2__Impl_in_rule__Lamp__Group__22600);
            rule__Lamp__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__3_in_rule__Lamp__Group__22603);
            rule__Lamp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__2"


    // $ANTLR start "rule__Lamp__Group__2__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1350:1: rule__Lamp__Group__2__Impl : ( '{' ) ;
    public final void rule__Lamp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1354:1: ( ( '{' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1355:1: ( '{' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1355:1: ( '{' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1356:1: '{'
            {
             before(grammarAccess.getLampAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Lamp__Group__2__Impl2631); 
             after(grammarAccess.getLampAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__2__Impl"


    // $ANTLR start "rule__Lamp__Group__3"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1369:1: rule__Lamp__Group__3 : rule__Lamp__Group__3__Impl rule__Lamp__Group__4 ;
    public final void rule__Lamp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1373:1: ( rule__Lamp__Group__3__Impl rule__Lamp__Group__4 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1374:2: rule__Lamp__Group__3__Impl rule__Lamp__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__3__Impl_in_rule__Lamp__Group__32662);
            rule__Lamp__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__4_in_rule__Lamp__Group__32665);
            rule__Lamp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__3"


    // $ANTLR start "rule__Lamp__Group__3__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1381:1: rule__Lamp__Group__3__Impl : ( ( rule__Lamp__Group_3__0 )? ) ;
    public final void rule__Lamp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1385:1: ( ( ( rule__Lamp__Group_3__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1386:1: ( ( rule__Lamp__Group_3__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1386:1: ( ( rule__Lamp__Group_3__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1387:1: ( rule__Lamp__Group_3__0 )?
            {
             before(grammarAccess.getLampAccess().getGroup_3()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1388:1: ( rule__Lamp__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1388:2: rule__Lamp__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_3__0_in_rule__Lamp__Group__3__Impl2692);
                    rule__Lamp__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLampAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__3__Impl"


    // $ANTLR start "rule__Lamp__Group__4"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1398:1: rule__Lamp__Group__4 : rule__Lamp__Group__4__Impl rule__Lamp__Group__5 ;
    public final void rule__Lamp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1402:1: ( rule__Lamp__Group__4__Impl rule__Lamp__Group__5 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1403:2: rule__Lamp__Group__4__Impl rule__Lamp__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__4__Impl_in_rule__Lamp__Group__42723);
            rule__Lamp__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__5_in_rule__Lamp__Group__42726);
            rule__Lamp__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__4"


    // $ANTLR start "rule__Lamp__Group__4__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1410:1: rule__Lamp__Group__4__Impl : ( ( rule__Lamp__Group_4__0 )? ) ;
    public final void rule__Lamp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1414:1: ( ( ( rule__Lamp__Group_4__0 )? ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1415:1: ( ( rule__Lamp__Group_4__0 )? )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1415:1: ( ( rule__Lamp__Group_4__0 )? )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1416:1: ( rule__Lamp__Group_4__0 )?
            {
             before(grammarAccess.getLampAccess().getGroup_4()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1417:1: ( rule__Lamp__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1417:2: rule__Lamp__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_4__0_in_rule__Lamp__Group__4__Impl2753);
                    rule__Lamp__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLampAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__4__Impl"


    // $ANTLR start "rule__Lamp__Group__5"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1427:1: rule__Lamp__Group__5 : rule__Lamp__Group__5__Impl ;
    public final void rule__Lamp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1431:1: ( rule__Lamp__Group__5__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1432:2: rule__Lamp__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group__5__Impl_in_rule__Lamp__Group__52784);
            rule__Lamp__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__5"


    // $ANTLR start "rule__Lamp__Group__5__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1438:1: rule__Lamp__Group__5__Impl : ( '}' ) ;
    public final void rule__Lamp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1442:1: ( ( '}' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1443:1: ( '}' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1443:1: ( '}' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1444:1: '}'
            {
             before(grammarAccess.getLampAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Lamp__Group__5__Impl2812); 
             after(grammarAccess.getLampAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group__5__Impl"


    // $ANTLR start "rule__Lamp__Group_3__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1469:1: rule__Lamp__Group_3__0 : rule__Lamp__Group_3__0__Impl rule__Lamp__Group_3__1 ;
    public final void rule__Lamp__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1473:1: ( rule__Lamp__Group_3__0__Impl rule__Lamp__Group_3__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1474:2: rule__Lamp__Group_3__0__Impl rule__Lamp__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_3__0__Impl_in_rule__Lamp__Group_3__02855);
            rule__Lamp__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_3__1_in_rule__Lamp__Group_3__02858);
            rule__Lamp__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_3__0"


    // $ANTLR start "rule__Lamp__Group_3__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1481:1: rule__Lamp__Group_3__0__Impl : ( 'GlobalID' ) ;
    public final void rule__Lamp__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1485:1: ( ( 'GlobalID' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1486:1: ( 'GlobalID' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1486:1: ( 'GlobalID' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1487:1: 'GlobalID'
            {
             before(grammarAccess.getLampAccess().getGlobalIDKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Lamp__Group_3__0__Impl2886); 
             after(grammarAccess.getLampAccess().getGlobalIDKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_3__0__Impl"


    // $ANTLR start "rule__Lamp__Group_3__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1500:1: rule__Lamp__Group_3__1 : rule__Lamp__Group_3__1__Impl ;
    public final void rule__Lamp__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1504:1: ( rule__Lamp__Group_3__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1505:2: rule__Lamp__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_3__1__Impl_in_rule__Lamp__Group_3__12917);
            rule__Lamp__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_3__1"


    // $ANTLR start "rule__Lamp__Group_3__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1511:1: rule__Lamp__Group_3__1__Impl : ( ( rule__Lamp__GlobalIDAssignment_3_1 ) ) ;
    public final void rule__Lamp__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1515:1: ( ( ( rule__Lamp__GlobalIDAssignment_3_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1516:1: ( ( rule__Lamp__GlobalIDAssignment_3_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1516:1: ( ( rule__Lamp__GlobalIDAssignment_3_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1517:1: ( rule__Lamp__GlobalIDAssignment_3_1 )
            {
             before(grammarAccess.getLampAccess().getGlobalIDAssignment_3_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1518:1: ( rule__Lamp__GlobalIDAssignment_3_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1518:2: rule__Lamp__GlobalIDAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__GlobalIDAssignment_3_1_in_rule__Lamp__Group_3__1__Impl2944);
            rule__Lamp__GlobalIDAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLampAccess().getGlobalIDAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_3__1__Impl"


    // $ANTLR start "rule__Lamp__Group_4__0"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1532:1: rule__Lamp__Group_4__0 : rule__Lamp__Group_4__0__Impl rule__Lamp__Group_4__1 ;
    public final void rule__Lamp__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1536:1: ( rule__Lamp__Group_4__0__Impl rule__Lamp__Group_4__1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1537:2: rule__Lamp__Group_4__0__Impl rule__Lamp__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_4__0__Impl_in_rule__Lamp__Group_4__02978);
            rule__Lamp__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_4__1_in_rule__Lamp__Group_4__02981);
            rule__Lamp__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_4__0"


    // $ANTLR start "rule__Lamp__Group_4__0__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1544:1: rule__Lamp__Group_4__0__Impl : ( 'PredefinedType' ) ;
    public final void rule__Lamp__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1548:1: ( ( 'PredefinedType' ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1549:1: ( 'PredefinedType' )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1549:1: ( 'PredefinedType' )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1550:1: 'PredefinedType'
            {
             before(grammarAccess.getLampAccess().getPredefinedTypeKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Lamp__Group_4__0__Impl3009); 
             after(grammarAccess.getLampAccess().getPredefinedTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_4__0__Impl"


    // $ANTLR start "rule__Lamp__Group_4__1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1563:1: rule__Lamp__Group_4__1 : rule__Lamp__Group_4__1__Impl ;
    public final void rule__Lamp__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1567:1: ( rule__Lamp__Group_4__1__Impl )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1568:2: rule__Lamp__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__Group_4__1__Impl_in_rule__Lamp__Group_4__13040);
            rule__Lamp__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_4__1"


    // $ANTLR start "rule__Lamp__Group_4__1__Impl"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1574:1: rule__Lamp__Group_4__1__Impl : ( ( rule__Lamp__PredefinedTypeAssignment_4_1 ) ) ;
    public final void rule__Lamp__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1578:1: ( ( ( rule__Lamp__PredefinedTypeAssignment_4_1 ) ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1579:1: ( ( rule__Lamp__PredefinedTypeAssignment_4_1 ) )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1579:1: ( ( rule__Lamp__PredefinedTypeAssignment_4_1 ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1580:1: ( rule__Lamp__PredefinedTypeAssignment_4_1 )
            {
             before(grammarAccess.getLampAccess().getPredefinedTypeAssignment_4_1()); 
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1581:1: ( rule__Lamp__PredefinedTypeAssignment_4_1 )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1581:2: rule__Lamp__PredefinedTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Lamp__PredefinedTypeAssignment_4_1_in_rule__Lamp__Group_4__1__Impl3067);
            rule__Lamp__PredefinedTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLampAccess().getPredefinedTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__Group_4__1__Impl"


    // $ANTLR start "rule__Main__BIMServerAssignment_3_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1596:1: rule__Main__BIMServerAssignment_3_1 : ( ruleBIMServerCredentials ) ;
    public final void rule__Main__BIMServerAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1600:1: ( ( ruleBIMServerCredentials ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1601:1: ( ruleBIMServerCredentials )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1601:1: ( ruleBIMServerCredentials )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1602:1: ruleBIMServerCredentials
            {
             before(grammarAccess.getMainAccess().getBIMServerBIMServerCredentialsParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleBIMServerCredentials_in_rule__Main__BIMServerAssignment_3_13106);
            ruleBIMServerCredentials();

            state._fsp--;

             after(grammarAccess.getMainAccess().getBIMServerBIMServerCredentialsParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__BIMServerAssignment_3_1"


    // $ANTLR start "rule__Main__LampAssignment_4_2"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1611:1: rule__Main__LampAssignment_4_2 : ( ruleLamp ) ;
    public final void rule__Main__LampAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1615:1: ( ( ruleLamp ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1616:1: ( ruleLamp )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1616:1: ( ruleLamp )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1617:1: ruleLamp
            {
             before(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLamp_in_rule__Main__LampAssignment_4_23137);
            ruleLamp();

            state._fsp--;

             after(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__LampAssignment_4_2"


    // $ANTLR start "rule__Main__LampAssignment_4_3_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1626:1: rule__Main__LampAssignment_4_3_1 : ( ruleLamp ) ;
    public final void rule__Main__LampAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1630:1: ( ( ruleLamp ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1631:1: ( ruleLamp )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1631:1: ( ruleLamp )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1632:1: ruleLamp
            {
             before(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLamp_in_rule__Main__LampAssignment_4_3_13168);
            ruleLamp();

            state._fsp--;

             after(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__LampAssignment_4_3_1"


    // $ANTLR start "rule__BIMServerCredentials__AddressAssignment_3_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1641:1: rule__BIMServerCredentials__AddressAssignment_3_1 : ( ruleEString ) ;
    public final void rule__BIMServerCredentials__AddressAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1645:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1646:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1646:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1647:1: ruleEString
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getAddressEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BIMServerCredentials__AddressAssignment_3_13199);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsAccess().getAddressEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__AddressAssignment_3_1"


    // $ANTLR start "rule__BIMServerCredentials__PortAssignment_4_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1656:1: rule__BIMServerCredentials__PortAssignment_4_1 : ( ruleEString ) ;
    public final void rule__BIMServerCredentials__PortAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1660:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1661:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1661:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1662:1: ruleEString
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPortEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BIMServerCredentials__PortAssignment_4_13230);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsAccess().getPortEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__PortAssignment_4_1"


    // $ANTLR start "rule__BIMServerCredentials__ProjectNameAssignment_5_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1671:1: rule__BIMServerCredentials__ProjectNameAssignment_5_1 : ( ruleEString ) ;
    public final void rule__BIMServerCredentials__ProjectNameAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1675:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1676:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1676:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1677:1: ruleEString
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getProjectNameEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BIMServerCredentials__ProjectNameAssignment_5_13261);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsAccess().getProjectNameEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__ProjectNameAssignment_5_1"


    // $ANTLR start "rule__BIMServerCredentials__UserNameAssignment_6_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1686:1: rule__BIMServerCredentials__UserNameAssignment_6_1 : ( ruleEString ) ;
    public final void rule__BIMServerCredentials__UserNameAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1690:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1691:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1691:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1692:1: ruleEString
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getUserNameEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BIMServerCredentials__UserNameAssignment_6_13292);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsAccess().getUserNameEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__UserNameAssignment_6_1"


    // $ANTLR start "rule__BIMServerCredentials__PasswordAssignment_7_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1701:1: rule__BIMServerCredentials__PasswordAssignment_7_1 : ( ruleEString ) ;
    public final void rule__BIMServerCredentials__PasswordAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1705:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1706:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1706:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1707:1: ruleEString
            {
             before(grammarAccess.getBIMServerCredentialsAccess().getPasswordEStringParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__BIMServerCredentials__PasswordAssignment_7_13323);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBIMServerCredentialsAccess().getPasswordEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BIMServerCredentials__PasswordAssignment_7_1"


    // $ANTLR start "rule__Lamp__GlobalIDAssignment_3_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1716:1: rule__Lamp__GlobalIDAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Lamp__GlobalIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1720:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1721:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1721:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1722:1: ruleEString
            {
             before(grammarAccess.getLampAccess().getGlobalIDEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Lamp__GlobalIDAssignment_3_13354);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLampAccess().getGlobalIDEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__GlobalIDAssignment_3_1"


    // $ANTLR start "rule__Lamp__PredefinedTypeAssignment_4_1"
    // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1731:1: rule__Lamp__PredefinedTypeAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Lamp__PredefinedTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1735:1: ( ( ruleEString ) )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1736:1: ( ruleEString )
            {
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1736:1: ( ruleEString )
            // ../org.xtext.example.light.ui/src-gen/org/xtext/example/light/ui/contentassist/antlr/internal/InternalLight.g:1737:1: ruleEString
            {
             before(grammarAccess.getLampAccess().getPredefinedTypeEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Lamp__PredefinedTypeAssignment_4_13385);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLampAccess().getPredefinedTypeEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lamp__PredefinedTypeAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMain_in_entryRuleMain61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMain68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__0_in_ruleMain94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBIMServerCredentials_in_entryRuleBIMServerCredentials121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBIMServerCredentials128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__0_in_ruleBIMServerCredentials154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLamp_in_entryRuleLamp181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLamp188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__0_in_ruleLamp214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__0__Impl_in_rule__Main__Group__0357 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_rule__Main__Group__1_in_rule__Main__Group__0360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__1__Impl_in_rule__Main__Group__1418 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Main__Group__2_in_rule__Main__Group__1421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Main__Group__1__Impl449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__2__Impl_in_rule__Main__Group__2480 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Main__Group__3_in_rule__Main__Group__2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Main__Group__2__Impl511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__3__Impl_in_rule__Main__Group__3542 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Main__Group__4_in_rule__Main__Group__3545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_3__0_in_rule__Main__Group__3__Impl572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__4__Impl_in_rule__Main__Group__4603 = new BitSet(new long[]{0x000000000000E000L});
        public static final BitSet FOLLOW_rule__Main__Group__5_in_rule__Main__Group__4606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__0_in_rule__Main__Group__4__Impl633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group__5__Impl_in_rule__Main__Group__5664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Main__Group__5__Impl692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_3__0__Impl_in_rule__Main__Group_3__0735 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Main__Group_3__1_in_rule__Main__Group_3__0738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Main__Group_3__0__Impl766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_3__1__Impl_in_rule__Main__Group_3__1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__BIMServerAssignment_3_1_in_rule__Main__Group_3__1__Impl824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__0__Impl_in_rule__Main__Group_4__0858 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Main__Group_4__1_in_rule__Main__Group_4__0861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Main__Group_4__0__Impl889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__1__Impl_in_rule__Main__Group_4__1920 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Main__Group_4__2_in_rule__Main__Group_4__1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Main__Group_4__1__Impl951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__2__Impl_in_rule__Main__Group_4__2982 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Main__Group_4__3_in_rule__Main__Group_4__2985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__LampAssignment_4_2_in_rule__Main__Group_4__2__Impl1012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__3__Impl_in_rule__Main__Group_4__31042 = new BitSet(new long[]{0x0000000000012000L});
        public static final BitSet FOLLOW_rule__Main__Group_4__4_in_rule__Main__Group_4__31045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4_3__0_in_rule__Main__Group_4__3__Impl1072 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Main__Group_4__4__Impl_in_rule__Main__Group_4__41103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Main__Group_4__4__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4_3__0__Impl_in_rule__Main__Group_4_3__01172 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Main__Group_4_3__1_in_rule__Main__Group_4_3__01175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Main__Group_4_3__0__Impl1203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__Group_4_3__1__Impl_in_rule__Main__Group_4_3__11234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Main__LampAssignment_4_3_1_in_rule__Main__Group_4_3__1__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__0__Impl_in_rule__BIMServerCredentials__Group__01295 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__1_in_rule__BIMServerCredentials__Group__01298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__1__Impl_in_rule__BIMServerCredentials__Group__11356 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__2_in_rule__BIMServerCredentials__Group__11359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__BIMServerCredentials__Group__1__Impl1387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__2__Impl_in_rule__BIMServerCredentials__Group__21418 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__3_in_rule__BIMServerCredentials__Group__21421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__BIMServerCredentials__Group__2__Impl1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__3__Impl_in_rule__BIMServerCredentials__Group__31480 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__4_in_rule__BIMServerCredentials__Group__31483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_3__0_in_rule__BIMServerCredentials__Group__3__Impl1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__4__Impl_in_rule__BIMServerCredentials__Group__41541 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__5_in_rule__BIMServerCredentials__Group__41544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_4__0_in_rule__BIMServerCredentials__Group__4__Impl1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__5__Impl_in_rule__BIMServerCredentials__Group__51602 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__6_in_rule__BIMServerCredentials__Group__51605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_5__0_in_rule__BIMServerCredentials__Group__5__Impl1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__6__Impl_in_rule__BIMServerCredentials__Group__61663 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__7_in_rule__BIMServerCredentials__Group__61666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_6__0_in_rule__BIMServerCredentials__Group__6__Impl1693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__7__Impl_in_rule__BIMServerCredentials__Group__71724 = new BitSet(new long[]{0x00000000007C2000L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__8_in_rule__BIMServerCredentials__Group__71727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_7__0_in_rule__BIMServerCredentials__Group__7__Impl1754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group__8__Impl_in_rule__BIMServerCredentials__Group__81785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__BIMServerCredentials__Group__8__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_3__0__Impl_in_rule__BIMServerCredentials__Group_3__01862 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_3__1_in_rule__BIMServerCredentials__Group_3__01865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__BIMServerCredentials__Group_3__0__Impl1893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_3__1__Impl_in_rule__BIMServerCredentials__Group_3__11924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__AddressAssignment_3_1_in_rule__BIMServerCredentials__Group_3__1__Impl1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_4__0__Impl_in_rule__BIMServerCredentials__Group_4__01985 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_4__1_in_rule__BIMServerCredentials__Group_4__01988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__BIMServerCredentials__Group_4__0__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_4__1__Impl_in_rule__BIMServerCredentials__Group_4__12047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__PortAssignment_4_1_in_rule__BIMServerCredentials__Group_4__1__Impl2074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_5__0__Impl_in_rule__BIMServerCredentials__Group_5__02108 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_5__1_in_rule__BIMServerCredentials__Group_5__02111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__BIMServerCredentials__Group_5__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_5__1__Impl_in_rule__BIMServerCredentials__Group_5__12170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__ProjectNameAssignment_5_1_in_rule__BIMServerCredentials__Group_5__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_6__0__Impl_in_rule__BIMServerCredentials__Group_6__02231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_6__1_in_rule__BIMServerCredentials__Group_6__02234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__BIMServerCredentials__Group_6__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_6__1__Impl_in_rule__BIMServerCredentials__Group_6__12293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__UserNameAssignment_6_1_in_rule__BIMServerCredentials__Group_6__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_7__0__Impl_in_rule__BIMServerCredentials__Group_7__02354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_7__1_in_rule__BIMServerCredentials__Group_7__02357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__BIMServerCredentials__Group_7__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__Group_7__1__Impl_in_rule__BIMServerCredentials__Group_7__12416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__BIMServerCredentials__PasswordAssignment_7_1_in_rule__BIMServerCredentials__Group_7__1__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__0__Impl_in_rule__Lamp__Group__02477 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Lamp__Group__1_in_rule__Lamp__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__1__Impl_in_rule__Lamp__Group__12538 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Lamp__Group__2_in_rule__Lamp__Group__12541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Lamp__Group__1__Impl2569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__2__Impl_in_rule__Lamp__Group__22600 = new BitSet(new long[]{0x0000000001802000L});
        public static final BitSet FOLLOW_rule__Lamp__Group__3_in_rule__Lamp__Group__22603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Lamp__Group__2__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__3__Impl_in_rule__Lamp__Group__32662 = new BitSet(new long[]{0x0000000001802000L});
        public static final BitSet FOLLOW_rule__Lamp__Group__4_in_rule__Lamp__Group__32665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_3__0_in_rule__Lamp__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__4__Impl_in_rule__Lamp__Group__42723 = new BitSet(new long[]{0x0000000001802000L});
        public static final BitSet FOLLOW_rule__Lamp__Group__5_in_rule__Lamp__Group__42726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_4__0_in_rule__Lamp__Group__4__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group__5__Impl_in_rule__Lamp__Group__52784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Lamp__Group__5__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_3__0__Impl_in_rule__Lamp__Group_3__02855 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Lamp__Group_3__1_in_rule__Lamp__Group_3__02858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Lamp__Group_3__0__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_3__1__Impl_in_rule__Lamp__Group_3__12917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__GlobalIDAssignment_3_1_in_rule__Lamp__Group_3__1__Impl2944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_4__0__Impl_in_rule__Lamp__Group_4__02978 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Lamp__Group_4__1_in_rule__Lamp__Group_4__02981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Lamp__Group_4__0__Impl3009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__Group_4__1__Impl_in_rule__Lamp__Group_4__13040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Lamp__PredefinedTypeAssignment_4_1_in_rule__Lamp__Group_4__1__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBIMServerCredentials_in_rule__Main__BIMServerAssignment_3_13106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLamp_in_rule__Main__LampAssignment_4_23137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLamp_in_rule__Main__LampAssignment_4_3_13168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BIMServerCredentials__AddressAssignment_3_13199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BIMServerCredentials__PortAssignment_4_13230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BIMServerCredentials__ProjectNameAssignment_5_13261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BIMServerCredentials__UserNameAssignment_6_13292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__BIMServerCredentials__PasswordAssignment_7_13323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Lamp__GlobalIDAssignment_3_13354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Lamp__PredefinedTypeAssignment_4_13385 = new BitSet(new long[]{0x0000000000000002L});
    }


}