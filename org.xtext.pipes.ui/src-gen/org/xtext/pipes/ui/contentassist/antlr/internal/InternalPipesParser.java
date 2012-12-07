package org.xtext.pipes.ui.contentassist.antlr.internal; 

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
import org.xtext.pipes.services.PipesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Model'", "'{'", "'}'", "'elements'", "','", "'GUIDElement'", "'GUID'", "'Name'", "'Description'", "'Wall'", "'placement'", "'Opening'", "'walls'", "'FlowSegment'", "'LocalPlacement'", "'relativeTo'", "'axis2placement3d'", "'Axis2Placement3D'", "'cartesianX'", "'cartesianY'", "'cartesianZ'", "'axis'", "'refDirection'", "'-'", "'.'", "'Direction'", "'x'", "'y'", "'z'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPipesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPipesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPipesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g"; }


     
     	private PipesGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PipesGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:61:1: ( ruleModel EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:76:2: rule__Model__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGUIDElement"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:88:1: entryRuleGUIDElement : ruleGUIDElement EOF ;
    public final void entryRuleGUIDElement() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:89:1: ( ruleGUIDElement EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:90:1: ruleGUIDElement EOF
            {
             before(grammarAccess.getGUIDElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_entryRuleGUIDElement121);
            ruleGUIDElement();

            state._fsp--;

             after(grammarAccess.getGUIDElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGUIDElement128); 

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
    // $ANTLR end "entryRuleGUIDElement"


    // $ANTLR start "ruleGUIDElement"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:97:1: ruleGUIDElement : ( ( rule__GUIDElement__Alternatives ) ) ;
    public final void ruleGUIDElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:101:2: ( ( ( rule__GUIDElement__Alternatives ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__GUIDElement__Alternatives ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__GUIDElement__Alternatives ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:103:1: ( rule__GUIDElement__Alternatives )
            {
             before(grammarAccess.getGUIDElementAccess().getAlternatives()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:1: ( rule__GUIDElement__Alternatives )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:2: rule__GUIDElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement__Alternatives_in_ruleGUIDElement154);
            rule__GUIDElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGUIDElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGUIDElement"


    // $ANTLR start "entryRuleGUIDElement_Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:116:1: entryRuleGUIDElement_Impl : ruleGUIDElement_Impl EOF ;
    public final void entryRuleGUIDElement_Impl() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:117:1: ( ruleGUIDElement_Impl EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:118:1: ruleGUIDElement_Impl EOF
            {
             before(grammarAccess.getGUIDElement_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl181);
            ruleGUIDElement_Impl();

            state._fsp--;

             after(grammarAccess.getGUIDElement_ImplRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGUIDElement_Impl188); 

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
    // $ANTLR end "entryRuleGUIDElement_Impl"


    // $ANTLR start "ruleGUIDElement_Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:125:1: ruleGUIDElement_Impl : ( ( rule__GUIDElement_Impl__Group__0 ) ) ;
    public final void ruleGUIDElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:129:2: ( ( ( rule__GUIDElement_Impl__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__GUIDElement_Impl__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__GUIDElement_Impl__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:131:1: ( rule__GUIDElement_Impl__Group__0 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:1: ( rule__GUIDElement_Impl__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:2: rule__GUIDElement_Impl__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__0_in_ruleGUIDElement_Impl214);
            rule__GUIDElement_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleGUIDElement_Impl"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:145:1: ( ruleEString EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:146:1: ruleEString EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleWall"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:172:1: entryRuleWall : ruleWall EOF ;
    public final void entryRuleWall() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:173:1: ( ruleWall EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:174:1: ruleWall EOF
            {
             before(grammarAccess.getWallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_entryRuleWall301);
            ruleWall();

            state._fsp--;

             after(grammarAccess.getWallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWall308); 

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
    // $ANTLR end "entryRuleWall"


    // $ANTLR start "ruleWall"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:181:1: ruleWall : ( ( rule__Wall__Group__0 ) ) ;
    public final void ruleWall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:185:2: ( ( ( rule__Wall__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__Wall__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__Wall__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:187:1: ( rule__Wall__Group__0 )
            {
             before(grammarAccess.getWallAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:1: ( rule__Wall__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:2: rule__Wall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__0_in_ruleWall334);
            rule__Wall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getGroup()); 

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
    // $ANTLR end "ruleWall"


    // $ANTLR start "entryRuleOpening"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:200:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:201:1: ( ruleOpening EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:202:1: ruleOpening EOF
            {
             before(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening361);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpeningRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening368); 

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
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:209:1: ruleOpening : ( ( rule__Opening__Group__0 ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:213:2: ( ( ( rule__Opening__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__Opening__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__Opening__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:215:1: ( rule__Opening__Group__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:1: ( rule__Opening__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:2: rule__Opening__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0_in_ruleOpening394);
            rule__Opening__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGroup()); 

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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRuleFlowSegment"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:228:1: entryRuleFlowSegment : ruleFlowSegment EOF ;
    public final void entryRuleFlowSegment() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:229:1: ( ruleFlowSegment EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:230:1: ruleFlowSegment EOF
            {
             before(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment421);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getFlowSegmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment428); 

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
    // $ANTLR end "entryRuleFlowSegment"


    // $ANTLR start "ruleFlowSegment"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:237:1: ruleFlowSegment : ( ( rule__FlowSegment__Group__0 ) ) ;
    public final void ruleFlowSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:241:2: ( ( ( rule__FlowSegment__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__FlowSegment__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__FlowSegment__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:243:1: ( rule__FlowSegment__Group__0 )
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:1: ( rule__FlowSegment__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:2: rule__FlowSegment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment454);
            rule__FlowSegment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getGroup()); 

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
    // $ANTLR end "ruleFlowSegment"


    // $ANTLR start "entryRuleLocalPlacement"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:256:1: entryRuleLocalPlacement : ruleLocalPlacement EOF ;
    public final void entryRuleLocalPlacement() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:257:1: ( ruleLocalPlacement EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:258:1: ruleLocalPlacement EOF
            {
             before(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement481);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement488); 

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
    // $ANTLR end "entryRuleLocalPlacement"


    // $ANTLR start "ruleLocalPlacement"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:265:1: ruleLocalPlacement : ( ( rule__LocalPlacement__Group__0 ) ) ;
    public final void ruleLocalPlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:269:2: ( ( ( rule__LocalPlacement__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__LocalPlacement__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__LocalPlacement__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:271:1: ( rule__LocalPlacement__Group__0 )
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:1: ( rule__LocalPlacement__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:2: rule__LocalPlacement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement514);
            rule__LocalPlacement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getGroup()); 

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
    // $ANTLR end "ruleLocalPlacement"


    // $ANTLR start "entryRuleAxis2Placement3D"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:284:1: entryRuleAxis2Placement3D : ruleAxis2Placement3D EOF ;
    public final void entryRuleAxis2Placement3D() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:285:1: ( ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:286:1: ruleAxis2Placement3D EOF
            {
             before(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D541);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D548); 

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
    // $ANTLR end "entryRuleAxis2Placement3D"


    // $ANTLR start "ruleAxis2Placement3D"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:293:1: ruleAxis2Placement3D : ( ( rule__Axis2Placement3D__Group__0 ) ) ;
    public final void ruleAxis2Placement3D() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:297:2: ( ( ( rule__Axis2Placement3D__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:299:1: ( rule__Axis2Placement3D__Group__0 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:1: ( rule__Axis2Placement3D__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:2: rule__Axis2Placement3D__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D574);
            rule__Axis2Placement3D__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getGroup()); 

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
    // $ANTLR end "ruleAxis2Placement3D"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:312:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:313:1: ( ruleEDouble EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:314:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble601);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble608); 

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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:321:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:325:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:326:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:326:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:327:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:328:1: ( rule__EDouble__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:328:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble634);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleDirection"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:340:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:341:1: ( ruleDirection EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:342:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection661);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection668); 

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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:349:1: ruleDirection : ( ( rule__Direction__Group__0 ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:353:2: ( ( ( rule__Direction__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:354:1: ( ( rule__Direction__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:354:1: ( ( rule__Direction__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:355:1: ( rule__Direction__Group__0 )
            {
             before(grammarAccess.getDirectionAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:356:1: ( rule__Direction__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:356:2: rule__Direction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0_in_ruleDirection694);
            rule__Direction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getGroup()); 

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__GUIDElement__Alternatives"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:368:1: rule__GUIDElement__Alternatives : ( ( ruleGUIDElement_Impl ) | ( ruleWall ) | ( ruleOpening ) | ( ruleFlowSegment ) );
    public final void rule__GUIDElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:372:1: ( ( ruleGUIDElement_Impl ) | ( ruleWall ) | ( ruleOpening ) | ( ruleFlowSegment ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:373:1: ( ruleGUIDElement_Impl )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:373:1: ( ruleGUIDElement_Impl )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:374:1: ruleGUIDElement_Impl
                    {
                     before(grammarAccess.getGUIDElementAccess().getGUIDElement_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_rule__GUIDElement__Alternatives730);
                    ruleGUIDElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getGUIDElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:379:6: ( ruleWall )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:379:6: ( ruleWall )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:380:1: ruleWall
                    {
                     before(grammarAccess.getGUIDElementAccess().getWallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWall_in_rule__GUIDElement__Alternatives747);
                    ruleWall();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getWallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:385:6: ( ruleOpening )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:385:6: ( ruleOpening )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:386:1: ruleOpening
                    {
                     before(grammarAccess.getGUIDElementAccess().getOpeningParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__GUIDElement__Alternatives764);
                    ruleOpening();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getOpeningParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:391:6: ( ruleFlowSegment )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:391:6: ( ruleFlowSegment )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:392:1: ruleFlowSegment
                    {
                     before(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__GUIDElement__Alternatives781);
                    ruleFlowSegment();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_3()); 

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
    // $ANTLR end "rule__GUIDElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:402:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:406:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:407:1: ( RULE_STRING )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:407:1: ( RULE_STRING )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:408:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives813); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:413:6: ( RULE_ID )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:413:6: ( RULE_ID )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:414:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives830); 
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:424:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:428:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:429:1: ( 'E' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:429:1: ( 'E' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:430:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0863); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:437:6: ( 'e' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:437:6: ( 'e' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:438:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0883); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:452:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:456:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:457:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0915);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0918);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:464:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:468:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:469:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:469:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:470:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:471:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:473:1: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:483:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:487:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:488:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1976);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1979);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:495:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:499:1: ( ( 'Model' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:500:1: ( 'Model' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:500:1: ( 'Model' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:501:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__1__Impl1007); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:514:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:518:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:519:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21038);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21041);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:526:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:530:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:531:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:531:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:532:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__2__Impl1069); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:545:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:549:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:550:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31100);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31103);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:557:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:561:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:562:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:562:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:563:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:564:1: ( rule__Model__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:564:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1130);
                    rule__Model__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:574:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:578:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:579:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41161);
            rule__Model__Group__4__Impl();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:585:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:589:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:590:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:590:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:591:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__4__Impl1189); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:614:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:618:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:619:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01230);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01233);
            rule__Model__Group_3__1();

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
    // $ANTLR end "rule__Model__Group_3__0"


    // $ANTLR start "rule__Model__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:626:1: rule__Model__Group_3__0__Impl : ( 'elements' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:630:1: ( ( 'elements' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:631:1: ( 'elements' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:631:1: ( 'elements' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:632:1: 'elements'
            {
             before(grammarAccess.getModelAccess().getElementsKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_3__0__Impl1261); 
             after(grammarAccess.getModelAccess().getElementsKeyword_3_0()); 

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
    // $ANTLR end "rule__Model__Group_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:645:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:649:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:650:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11292);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11295);
            rule__Model__Group_3__2();

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
    // $ANTLR end "rule__Model__Group_3__1"


    // $ANTLR start "rule__Model__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:657:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:661:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:662:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:662:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:663:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group_3__1__Impl1323); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__Model__Group_3__1__Impl"


    // $ANTLR start "rule__Model__Group_3__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:676:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:680:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:681:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21354);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__21357);
            rule__Model__Group_3__3();

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
    // $ANTLR end "rule__Model__Group_3__2"


    // $ANTLR start "rule__Model__Group_3__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:688:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__ElementsAssignment_3_2 ) ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:692:1: ( ( ( rule__Model__ElementsAssignment_3_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:693:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:693:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:694:1: ( rule__Model__ElementsAssignment_3_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:695:1: ( rule__Model__ElementsAssignment_3_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:695:2: rule__Model__ElementsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_2_in_rule__Model__Group_3__2__Impl1384);
            rule__Model__ElementsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_2()); 

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
    // $ANTLR end "rule__Model__Group_3__2__Impl"


    // $ANTLR start "rule__Model__Group_3__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:705:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl rule__Model__Group_3__4 ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:709:1: ( rule__Model__Group_3__3__Impl rule__Model__Group_3__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:710:2: rule__Model__Group_3__3__Impl rule__Model__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__31414);
            rule__Model__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__31417);
            rule__Model__Group_3__4();

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
    // $ANTLR end "rule__Model__Group_3__3"


    // $ANTLR start "rule__Model__Group_3__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:717:1: rule__Model__Group_3__3__Impl : ( ( rule__Model__Group_3_3__0 )* ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:721:1: ( ( ( rule__Model__Group_3_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:722:1: ( ( rule__Model__Group_3_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:722:1: ( ( rule__Model__Group_3_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:723:1: ( rule__Model__Group_3_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:724:1: ( rule__Model__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:724:2: rule__Model__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl1444);
            	    rule__Model__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__Model__Group_3__3__Impl"


    // $ANTLR start "rule__Model__Group_3__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:734:1: rule__Model__Group_3__4 : rule__Model__Group_3__4__Impl ;
    public final void rule__Model__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:738:1: ( rule__Model__Group_3__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:739:2: rule__Model__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__41475);
            rule__Model__Group_3__4__Impl();

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
    // $ANTLR end "rule__Model__Group_3__4"


    // $ANTLR start "rule__Model__Group_3__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:745:1: rule__Model__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:749:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:750:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:750:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:751:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group_3__4__Impl1503); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__Model__Group_3__4__Impl"


    // $ANTLR start "rule__Model__Group_3_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:774:1: rule__Model__Group_3_3__0 : rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 ;
    public final void rule__Model__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:778:1: ( rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:779:2: rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__01544);
            rule__Model__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__01547);
            rule__Model__Group_3_3__1();

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
    // $ANTLR end "rule__Model__Group_3_3__0"


    // $ANTLR start "rule__Model__Group_3_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:786:1: rule__Model__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:790:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:791:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:791:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:792:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Model__Group_3_3__0__Impl1575); 
             after(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Model__Group_3_3__0__Impl"


    // $ANTLR start "rule__Model__Group_3_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:805:1: rule__Model__Group_3_3__1 : rule__Model__Group_3_3__1__Impl ;
    public final void rule__Model__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:809:1: ( rule__Model__Group_3_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:810:2: rule__Model__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__11606);
            rule__Model__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__Model__Group_3_3__1"


    // $ANTLR start "rule__Model__Group_3_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:816:1: rule__Model__Group_3_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_3_1 ) ) ;
    public final void rule__Model__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:820:1: ( ( ( rule__Model__ElementsAssignment_3_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:821:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:821:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:822:1: ( rule__Model__ElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:823:1: ( rule__Model__ElementsAssignment_3_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:823:2: rule__Model__ElementsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl1633);
            rule__Model__ElementsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_3_1()); 

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
    // $ANTLR end "rule__Model__Group_3_3__1__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:837:1: rule__GUIDElement_Impl__Group__0 : rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1 ;
    public final void rule__GUIDElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:841:1: ( rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:842:2: rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__0__Impl_in_rule__GUIDElement_Impl__Group__01667);
            rule__GUIDElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__1_in_rule__GUIDElement_Impl__Group__01670);
            rule__GUIDElement_Impl__Group__1();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__0"


    // $ANTLR start "rule__GUIDElement_Impl__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:849:1: rule__GUIDElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__GUIDElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:853:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:854:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:854:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:855:1: ()
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:856:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:858:1: 
            {
            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GUIDElement_Impl__Group__0__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:868:1: rule__GUIDElement_Impl__Group__1 : rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2 ;
    public final void rule__GUIDElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:872:1: ( rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:873:2: rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__1__Impl_in_rule__GUIDElement_Impl__Group__11728);
            rule__GUIDElement_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__2_in_rule__GUIDElement_Impl__Group__11731);
            rule__GUIDElement_Impl__Group__2();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__1"


    // $ANTLR start "rule__GUIDElement_Impl__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:880:1: rule__GUIDElement_Impl__Group__1__Impl : ( 'GUIDElement' ) ;
    public final void rule__GUIDElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:884:1: ( ( 'GUIDElement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:885:1: ( 'GUIDElement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:885:1: ( 'GUIDElement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:886:1: 'GUIDElement'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GUIDElement_Impl__Group__1__Impl1759); 
             after(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementKeyword_1()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__1__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:899:1: rule__GUIDElement_Impl__Group__2 : rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3 ;
    public final void rule__GUIDElement_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:903:1: ( rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:904:2: rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__2__Impl_in_rule__GUIDElement_Impl__Group__21790);
            rule__GUIDElement_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__3_in_rule__GUIDElement_Impl__Group__21793);
            rule__GUIDElement_Impl__Group__3();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__2"


    // $ANTLR start "rule__GUIDElement_Impl__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:911:1: rule__GUIDElement_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__GUIDElement_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:915:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:916:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:916:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:917:1: '{'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GUIDElement_Impl__Group__2__Impl1821); 
             after(grammarAccess.getGUIDElement_ImplAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__2__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:930:1: rule__GUIDElement_Impl__Group__3 : rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4 ;
    public final void rule__GUIDElement_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:934:1: ( rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:935:2: rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__3__Impl_in_rule__GUIDElement_Impl__Group__31852);
            rule__GUIDElement_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__4_in_rule__GUIDElement_Impl__Group__31855);
            rule__GUIDElement_Impl__Group__4();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__3"


    // $ANTLR start "rule__GUIDElement_Impl__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:942:1: rule__GUIDElement_Impl__Group__3__Impl : ( ( rule__GUIDElement_Impl__Group_3__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:946:1: ( ( ( rule__GUIDElement_Impl__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:947:1: ( ( rule__GUIDElement_Impl__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:947:1: ( ( rule__GUIDElement_Impl__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:948:1: ( rule__GUIDElement_Impl__Group_3__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:949:1: ( rule__GUIDElement_Impl__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:949:2: rule__GUIDElement_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__0_in_rule__GUIDElement_Impl__Group__3__Impl1882);
                    rule__GUIDElement_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGroup_3()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__3__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:959:1: rule__GUIDElement_Impl__Group__4 : rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5 ;
    public final void rule__GUIDElement_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:963:1: ( rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:964:2: rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__4__Impl_in_rule__GUIDElement_Impl__Group__41913);
            rule__GUIDElement_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__5_in_rule__GUIDElement_Impl__Group__41916);
            rule__GUIDElement_Impl__Group__5();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__4"


    // $ANTLR start "rule__GUIDElement_Impl__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:971:1: rule__GUIDElement_Impl__Group__4__Impl : ( ( rule__GUIDElement_Impl__Group_4__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:975:1: ( ( ( rule__GUIDElement_Impl__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: ( ( rule__GUIDElement_Impl__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: ( ( rule__GUIDElement_Impl__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:977:1: ( rule__GUIDElement_Impl__Group_4__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:978:1: ( rule__GUIDElement_Impl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:978:2: rule__GUIDElement_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__0_in_rule__GUIDElement_Impl__Group__4__Impl1943);
                    rule__GUIDElement_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGroup_4()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__4__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:988:1: rule__GUIDElement_Impl__Group__5 : rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6 ;
    public final void rule__GUIDElement_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:992:1: ( rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:993:2: rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__5__Impl_in_rule__GUIDElement_Impl__Group__51974);
            rule__GUIDElement_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__6_in_rule__GUIDElement_Impl__Group__51977);
            rule__GUIDElement_Impl__Group__6();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__5"


    // $ANTLR start "rule__GUIDElement_Impl__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1000:1: rule__GUIDElement_Impl__Group__5__Impl : ( ( rule__GUIDElement_Impl__Group_5__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1004:1: ( ( ( rule__GUIDElement_Impl__Group_5__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1005:1: ( ( rule__GUIDElement_Impl__Group_5__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1005:1: ( ( rule__GUIDElement_Impl__Group_5__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1006:1: ( rule__GUIDElement_Impl__Group_5__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1007:1: ( rule__GUIDElement_Impl__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1007:2: rule__GUIDElement_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__0_in_rule__GUIDElement_Impl__Group__5__Impl2004);
                    rule__GUIDElement_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGroup_5()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__5__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1017:1: rule__GUIDElement_Impl__Group__6 : rule__GUIDElement_Impl__Group__6__Impl ;
    public final void rule__GUIDElement_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1021:1: ( rule__GUIDElement_Impl__Group__6__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1022:2: rule__GUIDElement_Impl__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__6__Impl_in_rule__GUIDElement_Impl__Group__62035);
            rule__GUIDElement_Impl__Group__6__Impl();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__6"


    // $ANTLR start "rule__GUIDElement_Impl__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1028:1: rule__GUIDElement_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__GUIDElement_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1032:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1033:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1033:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1034:1: '}'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GUIDElement_Impl__Group__6__Impl2063); 
             after(grammarAccess.getGUIDElement_ImplAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group__6__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1061:1: rule__GUIDElement_Impl__Group_3__0 : rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1 ;
    public final void rule__GUIDElement_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1065:1: ( rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1066:2: rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__0__Impl_in_rule__GUIDElement_Impl__Group_3__02108);
            rule__GUIDElement_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__1_in_rule__GUIDElement_Impl__Group_3__02111);
            rule__GUIDElement_Impl__Group_3__1();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_3__0"


    // $ANTLR start "rule__GUIDElement_Impl__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1073:1: rule__GUIDElement_Impl__Group_3__0__Impl : ( 'GUID' ) ;
    public final void rule__GUIDElement_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1077:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1078:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1078:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1079:1: 'GUID'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GUIDElement_Impl__Group_3__0__Impl2139); 
             after(grammarAccess.getGUIDElement_ImplAccess().getGUIDKeyword_3_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1092:1: rule__GUIDElement_Impl__Group_3__1 : rule__GUIDElement_Impl__Group_3__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1096:1: ( rule__GUIDElement_Impl__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1097:2: rule__GUIDElement_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__1__Impl_in_rule__GUIDElement_Impl__Group_3__12170);
            rule__GUIDElement_Impl__Group_3__1__Impl();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_3__1"


    // $ANTLR start "rule__GUIDElement_Impl__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1103:1: rule__GUIDElement_Impl__Group_3__1__Impl : ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1107:1: ( ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1108:1: ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1108:1: ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1109:1: ( rule__GUIDElement_Impl__GUIDAssignment_3_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1110:1: ( rule__GUIDElement_Impl__GUIDAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1110:2: rule__GUIDElement_Impl__GUIDAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__GUIDAssignment_3_1_in_rule__GUIDElement_Impl__Group_3__1__Impl2197);
            rule__GUIDElement_Impl__GUIDAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGUIDElement_ImplAccess().getGUIDAssignment_3_1()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1124:1: rule__GUIDElement_Impl__Group_4__0 : rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1 ;
    public final void rule__GUIDElement_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1128:1: ( rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1129:2: rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__0__Impl_in_rule__GUIDElement_Impl__Group_4__02231);
            rule__GUIDElement_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__1_in_rule__GUIDElement_Impl__Group_4__02234);
            rule__GUIDElement_Impl__Group_4__1();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_4__0"


    // $ANTLR start "rule__GUIDElement_Impl__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1136:1: rule__GUIDElement_Impl__Group_4__0__Impl : ( 'Name' ) ;
    public final void rule__GUIDElement_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1140:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1141:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1141:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1142:1: 'Name'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__GUIDElement_Impl__Group_4__0__Impl2262); 
             after(grammarAccess.getGUIDElement_ImplAccess().getNameKeyword_4_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1155:1: rule__GUIDElement_Impl__Group_4__1 : rule__GUIDElement_Impl__Group_4__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1159:1: ( rule__GUIDElement_Impl__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1160:2: rule__GUIDElement_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__1__Impl_in_rule__GUIDElement_Impl__Group_4__12293);
            rule__GUIDElement_Impl__Group_4__1__Impl();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_4__1"


    // $ANTLR start "rule__GUIDElement_Impl__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1166:1: rule__GUIDElement_Impl__Group_4__1__Impl : ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1170:1: ( ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1171:1: ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1171:1: ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1172:1: ( rule__GUIDElement_Impl__NameAssignment_4_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:1: ( rule__GUIDElement_Impl__NameAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:2: rule__GUIDElement_Impl__NameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__NameAssignment_4_1_in_rule__GUIDElement_Impl__Group_4__1__Impl2320);
            rule__GUIDElement_Impl__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGUIDElement_ImplAccess().getNameAssignment_4_1()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_5__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1187:1: rule__GUIDElement_Impl__Group_5__0 : rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1 ;
    public final void rule__GUIDElement_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1191:1: ( rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1192:2: rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__0__Impl_in_rule__GUIDElement_Impl__Group_5__02354);
            rule__GUIDElement_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__1_in_rule__GUIDElement_Impl__Group_5__02357);
            rule__GUIDElement_Impl__Group_5__1();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_5__0"


    // $ANTLR start "rule__GUIDElement_Impl__Group_5__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1199:1: rule__GUIDElement_Impl__Group_5__0__Impl : ( 'Description' ) ;
    public final void rule__GUIDElement_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1203:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1204:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1204:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1205:1: 'Description'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__GUIDElement_Impl__Group_5__0__Impl2385); 
             after(grammarAccess.getGUIDElement_ImplAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__GUIDElement_Impl__Group_5__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1218:1: rule__GUIDElement_Impl__Group_5__1 : rule__GUIDElement_Impl__Group_5__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1222:1: ( rule__GUIDElement_Impl__Group_5__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1223:2: rule__GUIDElement_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__1__Impl_in_rule__GUIDElement_Impl__Group_5__12416);
            rule__GUIDElement_Impl__Group_5__1__Impl();

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_5__1"


    // $ANTLR start "rule__GUIDElement_Impl__Group_5__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1229:1: rule__GUIDElement_Impl__Group_5__1__Impl : ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1233:1: ( ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1234:1: ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1234:1: ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1235:1: ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionAssignment_5_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1236:1: ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1236:2: rule__GUIDElement_Impl__DescriptionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__DescriptionAssignment_5_1_in_rule__GUIDElement_Impl__Group_5__1__Impl2443);
            rule__GUIDElement_Impl__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getGUIDElement_ImplAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__Wall__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1250:1: rule__Wall__Group__0 : rule__Wall__Group__0__Impl rule__Wall__Group__1 ;
    public final void rule__Wall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1254:1: ( rule__Wall__Group__0__Impl rule__Wall__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1255:2: rule__Wall__Group__0__Impl rule__Wall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__0__Impl_in_rule__Wall__Group__02477);
            rule__Wall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__1_in_rule__Wall__Group__02480);
            rule__Wall__Group__1();

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
    // $ANTLR end "rule__Wall__Group__0"


    // $ANTLR start "rule__Wall__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1262:1: rule__Wall__Group__0__Impl : ( 'Wall' ) ;
    public final void rule__Wall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1266:1: ( ( 'Wall' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( 'Wall' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( 'Wall' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1268:1: 'Wall'
            {
             before(grammarAccess.getWallAccess().getWallKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Wall__Group__0__Impl2508); 
             after(grammarAccess.getWallAccess().getWallKeyword_0()); 

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
    // $ANTLR end "rule__Wall__Group__0__Impl"


    // $ANTLR start "rule__Wall__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1281:1: rule__Wall__Group__1 : rule__Wall__Group__1__Impl rule__Wall__Group__2 ;
    public final void rule__Wall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1285:1: ( rule__Wall__Group__1__Impl rule__Wall__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1286:2: rule__Wall__Group__1__Impl rule__Wall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__1__Impl_in_rule__Wall__Group__12539);
            rule__Wall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__2_in_rule__Wall__Group__12542);
            rule__Wall__Group__2();

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
    // $ANTLR end "rule__Wall__Group__1"


    // $ANTLR start "rule__Wall__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1293:1: rule__Wall__Group__1__Impl : ( '{' ) ;
    public final void rule__Wall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1297:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1298:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1298:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1299:1: '{'
            {
             before(grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wall__Group__1__Impl2570); 
             after(grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Wall__Group__1__Impl"


    // $ANTLR start "rule__Wall__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1312:1: rule__Wall__Group__2 : rule__Wall__Group__2__Impl rule__Wall__Group__3 ;
    public final void rule__Wall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1316:1: ( rule__Wall__Group__2__Impl rule__Wall__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1317:2: rule__Wall__Group__2__Impl rule__Wall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__2__Impl_in_rule__Wall__Group__22601);
            rule__Wall__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__3_in_rule__Wall__Group__22604);
            rule__Wall__Group__3();

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
    // $ANTLR end "rule__Wall__Group__2"


    // $ANTLR start "rule__Wall__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1324:1: rule__Wall__Group__2__Impl : ( ( rule__Wall__Group_2__0 )? ) ;
    public final void rule__Wall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1328:1: ( ( ( rule__Wall__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:1: ( ( rule__Wall__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:1: ( ( rule__Wall__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1330:1: ( rule__Wall__Group_2__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1331:1: ( rule__Wall__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1331:2: rule__Wall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__0_in_rule__Wall__Group__2__Impl2631);
                    rule__Wall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Wall__Group__2__Impl"


    // $ANTLR start "rule__Wall__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1341:1: rule__Wall__Group__3 : rule__Wall__Group__3__Impl rule__Wall__Group__4 ;
    public final void rule__Wall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1345:1: ( rule__Wall__Group__3__Impl rule__Wall__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1346:2: rule__Wall__Group__3__Impl rule__Wall__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__3__Impl_in_rule__Wall__Group__32662);
            rule__Wall__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__4_in_rule__Wall__Group__32665);
            rule__Wall__Group__4();

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
    // $ANTLR end "rule__Wall__Group__3"


    // $ANTLR start "rule__Wall__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1353:1: rule__Wall__Group__3__Impl : ( ( rule__Wall__Group_3__0 )? ) ;
    public final void rule__Wall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1357:1: ( ( ( rule__Wall__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1358:1: ( ( rule__Wall__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1358:1: ( ( rule__Wall__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1359:1: ( rule__Wall__Group_3__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1360:1: ( rule__Wall__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1360:2: rule__Wall__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__0_in_rule__Wall__Group__3__Impl2692);
                    rule__Wall__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Wall__Group__3__Impl"


    // $ANTLR start "rule__Wall__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1370:1: rule__Wall__Group__4 : rule__Wall__Group__4__Impl rule__Wall__Group__5 ;
    public final void rule__Wall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1374:1: ( rule__Wall__Group__4__Impl rule__Wall__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1375:2: rule__Wall__Group__4__Impl rule__Wall__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__4__Impl_in_rule__Wall__Group__42723);
            rule__Wall__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__5_in_rule__Wall__Group__42726);
            rule__Wall__Group__5();

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
    // $ANTLR end "rule__Wall__Group__4"


    // $ANTLR start "rule__Wall__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1382:1: rule__Wall__Group__4__Impl : ( ( rule__Wall__Group_4__0 )? ) ;
    public final void rule__Wall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1386:1: ( ( ( rule__Wall__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1387:1: ( ( rule__Wall__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1387:1: ( ( rule__Wall__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1388:1: ( rule__Wall__Group_4__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1389:1: ( rule__Wall__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1389:2: rule__Wall__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__0_in_rule__Wall__Group__4__Impl2753);
                    rule__Wall__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Wall__Group__4__Impl"


    // $ANTLR start "rule__Wall__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1399:1: rule__Wall__Group__5 : rule__Wall__Group__5__Impl rule__Wall__Group__6 ;
    public final void rule__Wall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1403:1: ( rule__Wall__Group__5__Impl rule__Wall__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1404:2: rule__Wall__Group__5__Impl rule__Wall__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__5__Impl_in_rule__Wall__Group__52784);
            rule__Wall__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__6_in_rule__Wall__Group__52787);
            rule__Wall__Group__6();

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
    // $ANTLR end "rule__Wall__Group__5"


    // $ANTLR start "rule__Wall__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1411:1: rule__Wall__Group__5__Impl : ( 'placement' ) ;
    public final void rule__Wall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1415:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1416:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1416:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1417:1: 'placement'
            {
             before(grammarAccess.getWallAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Wall__Group__5__Impl2815); 
             after(grammarAccess.getWallAccess().getPlacementKeyword_5()); 

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
    // $ANTLR end "rule__Wall__Group__5__Impl"


    // $ANTLR start "rule__Wall__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1430:1: rule__Wall__Group__6 : rule__Wall__Group__6__Impl rule__Wall__Group__7 ;
    public final void rule__Wall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1434:1: ( rule__Wall__Group__6__Impl rule__Wall__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1435:2: rule__Wall__Group__6__Impl rule__Wall__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__6__Impl_in_rule__Wall__Group__62846);
            rule__Wall__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__7_in_rule__Wall__Group__62849);
            rule__Wall__Group__7();

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
    // $ANTLR end "rule__Wall__Group__6"


    // $ANTLR start "rule__Wall__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1442:1: rule__Wall__Group__6__Impl : ( ( rule__Wall__PlacementAssignment_6 ) ) ;
    public final void rule__Wall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1446:1: ( ( ( rule__Wall__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1447:1: ( ( rule__Wall__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1447:1: ( ( rule__Wall__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1448:1: ( rule__Wall__PlacementAssignment_6 )
            {
             before(grammarAccess.getWallAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:1: ( rule__Wall__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:2: rule__Wall__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__PlacementAssignment_6_in_rule__Wall__Group__6__Impl2876);
            rule__Wall__PlacementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getPlacementAssignment_6()); 

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
    // $ANTLR end "rule__Wall__Group__6__Impl"


    // $ANTLR start "rule__Wall__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1459:1: rule__Wall__Group__7 : rule__Wall__Group__7__Impl ;
    public final void rule__Wall__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1463:1: ( rule__Wall__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1464:2: rule__Wall__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__7__Impl_in_rule__Wall__Group__72906);
            rule__Wall__Group__7__Impl();

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
    // $ANTLR end "rule__Wall__Group__7"


    // $ANTLR start "rule__Wall__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1470:1: rule__Wall__Group__7__Impl : ( '}' ) ;
    public final void rule__Wall__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1474:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1475:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1475:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1476:1: '}'
            {
             before(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Wall__Group__7__Impl2934); 
             after(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Wall__Group__7__Impl"


    // $ANTLR start "rule__Wall__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1505:1: rule__Wall__Group_2__0 : rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1 ;
    public final void rule__Wall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1509:1: ( rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1510:2: rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__0__Impl_in_rule__Wall__Group_2__02981);
            rule__Wall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__1_in_rule__Wall__Group_2__02984);
            rule__Wall__Group_2__1();

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
    // $ANTLR end "rule__Wall__Group_2__0"


    // $ANTLR start "rule__Wall__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1517:1: rule__Wall__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__Wall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1521:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1522:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1522:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1523:1: 'GUID'
            {
             before(grammarAccess.getWallAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Wall__Group_2__0__Impl3012); 
             after(grammarAccess.getWallAccess().getGUIDKeyword_2_0()); 

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
    // $ANTLR end "rule__Wall__Group_2__0__Impl"


    // $ANTLR start "rule__Wall__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1536:1: rule__Wall__Group_2__1 : rule__Wall__Group_2__1__Impl ;
    public final void rule__Wall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1540:1: ( rule__Wall__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1541:2: rule__Wall__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__1__Impl_in_rule__Wall__Group_2__13043);
            rule__Wall__Group_2__1__Impl();

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
    // $ANTLR end "rule__Wall__Group_2__1"


    // $ANTLR start "rule__Wall__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1547:1: rule__Wall__Group_2__1__Impl : ( ( rule__Wall__GUIDAssignment_2_1 ) ) ;
    public final void rule__Wall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1551:1: ( ( ( rule__Wall__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1552:1: ( ( rule__Wall__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1552:1: ( ( rule__Wall__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1553:1: ( rule__Wall__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getWallAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1554:1: ( rule__Wall__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1554:2: rule__Wall__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__GUIDAssignment_2_1_in_rule__Wall__Group_2__1__Impl3070);
            rule__Wall__GUIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getGUIDAssignment_2_1()); 

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
    // $ANTLR end "rule__Wall__Group_2__1__Impl"


    // $ANTLR start "rule__Wall__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1568:1: rule__Wall__Group_3__0 : rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1 ;
    public final void rule__Wall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1572:1: ( rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1573:2: rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__0__Impl_in_rule__Wall__Group_3__03104);
            rule__Wall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__1_in_rule__Wall__Group_3__03107);
            rule__Wall__Group_3__1();

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
    // $ANTLR end "rule__Wall__Group_3__0"


    // $ANTLR start "rule__Wall__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1580:1: rule__Wall__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Wall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1584:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1585:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1585:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1586:1: 'Name'
            {
             before(grammarAccess.getWallAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Wall__Group_3__0__Impl3135); 
             after(grammarAccess.getWallAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Wall__Group_3__0__Impl"


    // $ANTLR start "rule__Wall__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1599:1: rule__Wall__Group_3__1 : rule__Wall__Group_3__1__Impl ;
    public final void rule__Wall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1603:1: ( rule__Wall__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1604:2: rule__Wall__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__1__Impl_in_rule__Wall__Group_3__13166);
            rule__Wall__Group_3__1__Impl();

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
    // $ANTLR end "rule__Wall__Group_3__1"


    // $ANTLR start "rule__Wall__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1610:1: rule__Wall__Group_3__1__Impl : ( ( rule__Wall__NameAssignment_3_1 ) ) ;
    public final void rule__Wall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1614:1: ( ( ( rule__Wall__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1615:1: ( ( rule__Wall__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1615:1: ( ( rule__Wall__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1616:1: ( rule__Wall__NameAssignment_3_1 )
            {
             before(grammarAccess.getWallAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1617:1: ( rule__Wall__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1617:2: rule__Wall__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__NameAssignment_3_1_in_rule__Wall__Group_3__1__Impl3193);
            rule__Wall__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Wall__Group_3__1__Impl"


    // $ANTLR start "rule__Wall__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1631:1: rule__Wall__Group_4__0 : rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1 ;
    public final void rule__Wall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1635:1: ( rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1636:2: rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__0__Impl_in_rule__Wall__Group_4__03227);
            rule__Wall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__1_in_rule__Wall__Group_4__03230);
            rule__Wall__Group_4__1();

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
    // $ANTLR end "rule__Wall__Group_4__0"


    // $ANTLR start "rule__Wall__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1643:1: rule__Wall__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Wall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1647:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1648:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1648:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1649:1: 'Description'
            {
             before(grammarAccess.getWallAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Wall__Group_4__0__Impl3258); 
             after(grammarAccess.getWallAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Wall__Group_4__0__Impl"


    // $ANTLR start "rule__Wall__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1662:1: rule__Wall__Group_4__1 : rule__Wall__Group_4__1__Impl ;
    public final void rule__Wall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1666:1: ( rule__Wall__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1667:2: rule__Wall__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__1__Impl_in_rule__Wall__Group_4__13289);
            rule__Wall__Group_4__1__Impl();

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
    // $ANTLR end "rule__Wall__Group_4__1"


    // $ANTLR start "rule__Wall__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1673:1: rule__Wall__Group_4__1__Impl : ( ( rule__Wall__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Wall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1677:1: ( ( ( rule__Wall__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1678:1: ( ( rule__Wall__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1678:1: ( ( rule__Wall__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1679:1: ( rule__Wall__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getWallAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:1: ( rule__Wall__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:2: rule__Wall__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__DescriptionAssignment_4_1_in_rule__Wall__Group_4__1__Impl3316);
            rule__Wall__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getDescriptionAssignment_4_1()); 

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
    // $ANTLR end "rule__Wall__Group_4__1__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1694:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1698:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1699:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__03350);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__03353);
            rule__Opening__Group__1();

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
    // $ANTLR end "rule__Opening__Group__0"


    // $ANTLR start "rule__Opening__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1706:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1710:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1711:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1711:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1712:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Opening__Group__0__Impl3381); 
             after(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 

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
    // $ANTLR end "rule__Opening__Group__0__Impl"


    // $ANTLR start "rule__Opening__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1725:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1729:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1730:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__13412);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__13415);
            rule__Opening__Group__2();

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
    // $ANTLR end "rule__Opening__Group__1"


    // $ANTLR start "rule__Opening__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1737:1: rule__Opening__Group__1__Impl : ( '{' ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1741:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1742:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1742:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1743:1: '{'
            {
             before(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Opening__Group__1__Impl3443); 
             after(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Opening__Group__1__Impl"


    // $ANTLR start "rule__Opening__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1756:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1760:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1761:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__23474);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__23477);
            rule__Opening__Group__3();

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
    // $ANTLR end "rule__Opening__Group__2"


    // $ANTLR start "rule__Opening__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1768:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1772:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1773:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1773:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1774:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1775:1: ( rule__Opening__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1775:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl3504);
                    rule__Opening__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Opening__Group__2__Impl"


    // $ANTLR start "rule__Opening__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1785:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1789:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1790:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__33535);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__33538);
            rule__Opening__Group__4();

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
    // $ANTLR end "rule__Opening__Group__3"


    // $ANTLR start "rule__Opening__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1797:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1801:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1802:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1802:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1803:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1804:1: ( rule__Opening__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1804:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl3565);
                    rule__Opening__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Opening__Group__3__Impl"


    // $ANTLR start "rule__Opening__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1814:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1818:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1819:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__43596);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__43599);
            rule__Opening__Group__5();

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
    // $ANTLR end "rule__Opening__Group__4"


    // $ANTLR start "rule__Opening__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1826:1: rule__Opening__Group__4__Impl : ( ( rule__Opening__Group_4__0 )? ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1830:1: ( ( ( rule__Opening__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:1: ( ( rule__Opening__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:1: ( ( rule__Opening__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1832:1: ( rule__Opening__Group_4__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1833:1: ( rule__Opening__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1833:2: rule__Opening__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__0_in_rule__Opening__Group__4__Impl3626);
                    rule__Opening__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Opening__Group__4__Impl"


    // $ANTLR start "rule__Opening__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1843:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1847:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1848:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__53657);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__53660);
            rule__Opening__Group__6();

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
    // $ANTLR end "rule__Opening__Group__5"


    // $ANTLR start "rule__Opening__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1855:1: rule__Opening__Group__5__Impl : ( 'placement' ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1859:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1860:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1860:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1861:1: 'placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Opening__Group__5__Impl3688); 
             after(grammarAccess.getOpeningAccess().getPlacementKeyword_5()); 

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
    // $ANTLR end "rule__Opening__Group__5__Impl"


    // $ANTLR start "rule__Opening__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1874:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl rule__Opening__Group__7 ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1878:1: ( rule__Opening__Group__6__Impl rule__Opening__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1879:2: rule__Opening__Group__6__Impl rule__Opening__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__63719);
            rule__Opening__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__63722);
            rule__Opening__Group__7();

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
    // $ANTLR end "rule__Opening__Group__6"


    // $ANTLR start "rule__Opening__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1886:1: rule__Opening__Group__6__Impl : ( ( rule__Opening__PlacementAssignment_6 ) ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1890:1: ( ( ( rule__Opening__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1891:1: ( ( rule__Opening__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1891:1: ( ( rule__Opening__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1892:1: ( rule__Opening__PlacementAssignment_6 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1893:1: ( rule__Opening__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1893:2: rule__Opening__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_6_in_rule__Opening__Group__6__Impl3749);
            rule__Opening__PlacementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getPlacementAssignment_6()); 

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
    // $ANTLR end "rule__Opening__Group__6__Impl"


    // $ANTLR start "rule__Opening__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1903:1: rule__Opening__Group__7 : rule__Opening__Group__7__Impl rule__Opening__Group__8 ;
    public final void rule__Opening__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1907:1: ( rule__Opening__Group__7__Impl rule__Opening__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1908:2: rule__Opening__Group__7__Impl rule__Opening__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__73779);
            rule__Opening__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__73782);
            rule__Opening__Group__8();

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
    // $ANTLR end "rule__Opening__Group__7"


    // $ANTLR start "rule__Opening__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1915:1: rule__Opening__Group__7__Impl : ( ( rule__Opening__Group_7__0 )? ) ;
    public final void rule__Opening__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1919:1: ( ( ( rule__Opening__Group_7__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1920:1: ( ( rule__Opening__Group_7__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1920:1: ( ( rule__Opening__Group_7__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1921:1: ( rule__Opening__Group_7__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1922:1: ( rule__Opening__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1922:2: rule__Opening__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__0_in_rule__Opening__Group__7__Impl3809);
                    rule__Opening__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Opening__Group__7__Impl"


    // $ANTLR start "rule__Opening__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1932:1: rule__Opening__Group__8 : rule__Opening__Group__8__Impl ;
    public final void rule__Opening__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1936:1: ( rule__Opening__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1937:2: rule__Opening__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__83840);
            rule__Opening__Group__8__Impl();

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
    // $ANTLR end "rule__Opening__Group__8"


    // $ANTLR start "rule__Opening__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1943:1: rule__Opening__Group__8__Impl : ( '}' ) ;
    public final void rule__Opening__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1947:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1948:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1948:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1949:1: '}'
            {
             before(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Opening__Group__8__Impl3868); 
             after(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Opening__Group__8__Impl"


    // $ANTLR start "rule__Opening__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1980:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1984:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1985:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__03917);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__03920);
            rule__Opening__Group_2__1();

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
    // $ANTLR end "rule__Opening__Group_2__0"


    // $ANTLR start "rule__Opening__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1992:1: rule__Opening__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1996:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1997:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1997:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1998:1: 'GUID'
            {
             before(grammarAccess.getOpeningAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_2__0__Impl3948); 
             after(grammarAccess.getOpeningAccess().getGUIDKeyword_2_0()); 

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
    // $ANTLR end "rule__Opening__Group_2__0__Impl"


    // $ANTLR start "rule__Opening__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2011:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2015:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2016:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__13979);
            rule__Opening__Group_2__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_2__1"


    // $ANTLR start "rule__Opening__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2022:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__GUIDAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2026:1: ( ( ( rule__Opening__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2027:1: ( ( rule__Opening__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2027:1: ( ( rule__Opening__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2028:1: ( rule__Opening__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2029:1: ( rule__Opening__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2029:2: rule__Opening__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__GUIDAssignment_2_1_in_rule__Opening__Group_2__1__Impl4006);
            rule__Opening__GUIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getGUIDAssignment_2_1()); 

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
    // $ANTLR end "rule__Opening__Group_2__1__Impl"


    // $ANTLR start "rule__Opening__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2043:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2047:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2048:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__04040);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__04043);
            rule__Opening__Group_3__1();

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
    // $ANTLR end "rule__Opening__Group_3__0"


    // $ANTLR start "rule__Opening__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2055:1: rule__Opening__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2059:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2060:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2060:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2061:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group_3__0__Impl4071); 
             after(grammarAccess.getOpeningAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__Opening__Group_3__0__Impl"


    // $ANTLR start "rule__Opening__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2074:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2078:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2079:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__14102);
            rule__Opening__Group_3__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_3__1"


    // $ANTLR start "rule__Opening__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2085:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__NameAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2089:1: ( ( ( rule__Opening__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2090:1: ( ( rule__Opening__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2090:1: ( ( rule__Opening__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2091:1: ( rule__Opening__NameAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2092:1: ( rule__Opening__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2092:2: rule__Opening__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_3_1_in_rule__Opening__Group_3__1__Impl4129);
            rule__Opening__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__Opening__Group_3__1__Impl"


    // $ANTLR start "rule__Opening__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2106:1: rule__Opening__Group_4__0 : rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1 ;
    public final void rule__Opening__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2110:1: ( rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2111:2: rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__0__Impl_in_rule__Opening__Group_4__04163);
            rule__Opening__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__1_in_rule__Opening__Group_4__04166);
            rule__Opening__Group_4__1();

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
    // $ANTLR end "rule__Opening__Group_4__0"


    // $ANTLR start "rule__Opening__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: rule__Opening__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2122:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2123:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2123:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2124:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group_4__0__Impl4194); 
             after(grammarAccess.getOpeningAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__Opening__Group_4__0__Impl"


    // $ANTLR start "rule__Opening__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2137:1: rule__Opening__Group_4__1 : rule__Opening__Group_4__1__Impl ;
    public final void rule__Opening__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2141:1: ( rule__Opening__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2142:2: rule__Opening__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__1__Impl_in_rule__Opening__Group_4__14225);
            rule__Opening__Group_4__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_4__1"


    // $ANTLR start "rule__Opening__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2148:1: rule__Opening__Group_4__1__Impl : ( ( rule__Opening__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Opening__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2152:1: ( ( ( rule__Opening__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2153:1: ( ( rule__Opening__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2153:1: ( ( rule__Opening__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2154:1: ( rule__Opening__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2155:1: ( rule__Opening__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2155:2: rule__Opening__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_4_1_in_rule__Opening__Group_4__1__Impl4252);
            rule__Opening__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getDescriptionAssignment_4_1()); 

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
    // $ANTLR end "rule__Opening__Group_4__1__Impl"


    // $ANTLR start "rule__Opening__Group_7__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2169:1: rule__Opening__Group_7__0 : rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1 ;
    public final void rule__Opening__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2173:1: ( rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2174:2: rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__0__Impl_in_rule__Opening__Group_7__04286);
            rule__Opening__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__1_in_rule__Opening__Group_7__04289);
            rule__Opening__Group_7__1();

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
    // $ANTLR end "rule__Opening__Group_7__0"


    // $ANTLR start "rule__Opening__Group_7__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2181:1: rule__Opening__Group_7__0__Impl : ( 'walls' ) ;
    public final void rule__Opening__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2185:1: ( ( 'walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2186:1: ( 'walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2186:1: ( 'walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2187:1: 'walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_7_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Opening__Group_7__0__Impl4317); 
             after(grammarAccess.getOpeningAccess().getWallsKeyword_7_0()); 

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
    // $ANTLR end "rule__Opening__Group_7__0__Impl"


    // $ANTLR start "rule__Opening__Group_7__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2200:1: rule__Opening__Group_7__1 : rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2 ;
    public final void rule__Opening__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2204:1: ( rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2205:2: rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__1__Impl_in_rule__Opening__Group_7__14348);
            rule__Opening__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__2_in_rule__Opening__Group_7__14351);
            rule__Opening__Group_7__2();

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
    // $ANTLR end "rule__Opening__Group_7__1"


    // $ANTLR start "rule__Opening__Group_7__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2212:1: rule__Opening__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Opening__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2216:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2217:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2217:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2218:1: '{'
            {
             before(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Opening__Group_7__1__Impl4379); 
             after(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Opening__Group_7__1__Impl"


    // $ANTLR start "rule__Opening__Group_7__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2231:1: rule__Opening__Group_7__2 : rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3 ;
    public final void rule__Opening__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2235:1: ( rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2236:2: rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__2__Impl_in_rule__Opening__Group_7__24410);
            rule__Opening__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__3_in_rule__Opening__Group_7__24413);
            rule__Opening__Group_7__3();

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
    // $ANTLR end "rule__Opening__Group_7__2"


    // $ANTLR start "rule__Opening__Group_7__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2243:1: rule__Opening__Group_7__2__Impl : ( ( rule__Opening__WallsAssignment_7_2 ) ) ;
    public final void rule__Opening__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2247:1: ( ( ( rule__Opening__WallsAssignment_7_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2248:1: ( ( rule__Opening__WallsAssignment_7_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2248:1: ( ( rule__Opening__WallsAssignment_7_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2249:1: ( rule__Opening__WallsAssignment_7_2 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2250:1: ( rule__Opening__WallsAssignment_7_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2250:2: rule__Opening__WallsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_2_in_rule__Opening__Group_7__2__Impl4440);
            rule__Opening__WallsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_7_2()); 

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
    // $ANTLR end "rule__Opening__Group_7__2__Impl"


    // $ANTLR start "rule__Opening__Group_7__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2260:1: rule__Opening__Group_7__3 : rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4 ;
    public final void rule__Opening__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2264:1: ( rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2265:2: rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__3__Impl_in_rule__Opening__Group_7__34470);
            rule__Opening__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__4_in_rule__Opening__Group_7__34473);
            rule__Opening__Group_7__4();

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
    // $ANTLR end "rule__Opening__Group_7__3"


    // $ANTLR start "rule__Opening__Group_7__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2272:1: rule__Opening__Group_7__3__Impl : ( ( rule__Opening__Group_7_3__0 )* ) ;
    public final void rule__Opening__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2276:1: ( ( ( rule__Opening__Group_7_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2277:1: ( ( rule__Opening__Group_7_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2277:1: ( ( rule__Opening__Group_7_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2278:1: ( rule__Opening__Group_7_3__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_7_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2279:1: ( rule__Opening__Group_7_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2279:2: rule__Opening__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__0_in_rule__Opening__Group_7__3__Impl4500);
            	    rule__Opening__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_7_3()); 

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
    // $ANTLR end "rule__Opening__Group_7__3__Impl"


    // $ANTLR start "rule__Opening__Group_7__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2289:1: rule__Opening__Group_7__4 : rule__Opening__Group_7__4__Impl ;
    public final void rule__Opening__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2293:1: ( rule__Opening__Group_7__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2294:2: rule__Opening__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__4__Impl_in_rule__Opening__Group_7__44531);
            rule__Opening__Group_7__4__Impl();

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
    // $ANTLR end "rule__Opening__Group_7__4"


    // $ANTLR start "rule__Opening__Group_7__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2300:1: rule__Opening__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Opening__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2304:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2305:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2305:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2306:1: '}'
            {
             before(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Opening__Group_7__4__Impl4559); 
             after(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_7_4()); 

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
    // $ANTLR end "rule__Opening__Group_7__4__Impl"


    // $ANTLR start "rule__Opening__Group_7_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2329:1: rule__Opening__Group_7_3__0 : rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1 ;
    public final void rule__Opening__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2333:1: ( rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2334:2: rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__0__Impl_in_rule__Opening__Group_7_3__04600);
            rule__Opening__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__1_in_rule__Opening__Group_7_3__04603);
            rule__Opening__Group_7_3__1();

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
    // $ANTLR end "rule__Opening__Group_7_3__0"


    // $ANTLR start "rule__Opening__Group_7_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2341:1: rule__Opening__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2345:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2346:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2346:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Opening__Group_7_3__0__Impl4631); 
             after(grammarAccess.getOpeningAccess().getCommaKeyword_7_3_0()); 

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
    // $ANTLR end "rule__Opening__Group_7_3__0__Impl"


    // $ANTLR start "rule__Opening__Group_7_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2360:1: rule__Opening__Group_7_3__1 : rule__Opening__Group_7_3__1__Impl ;
    public final void rule__Opening__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2364:1: ( rule__Opening__Group_7_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2365:2: rule__Opening__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__1__Impl_in_rule__Opening__Group_7_3__14662);
            rule__Opening__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_7_3__1"


    // $ANTLR start "rule__Opening__Group_7_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2371:1: rule__Opening__Group_7_3__1__Impl : ( ( rule__Opening__WallsAssignment_7_3_1 ) ) ;
    public final void rule__Opening__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2375:1: ( ( ( rule__Opening__WallsAssignment_7_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2376:1: ( ( rule__Opening__WallsAssignment_7_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2376:1: ( ( rule__Opening__WallsAssignment_7_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2377:1: ( rule__Opening__WallsAssignment_7_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2378:1: ( rule__Opening__WallsAssignment_7_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2378:2: rule__Opening__WallsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_3_1_in_rule__Opening__Group_7_3__1__Impl4689);
            rule__Opening__WallsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_7_3_1()); 

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
    // $ANTLR end "rule__Opening__Group_7_3__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2392:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2396:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2397:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__04723);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__04726);
            rule__FlowSegment__Group__1();

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
    // $ANTLR end "rule__FlowSegment__Group__0"


    // $ANTLR start "rule__FlowSegment__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2404:1: rule__FlowSegment__Group__0__Impl : ( 'FlowSegment' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2408:1: ( ( 'FlowSegment' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2409:1: ( 'FlowSegment' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2409:1: ( 'FlowSegment' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2410:1: 'FlowSegment'
            {
             before(grammarAccess.getFlowSegmentAccess().getFlowSegmentKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__FlowSegment__Group__0__Impl4754); 
             after(grammarAccess.getFlowSegmentAccess().getFlowSegmentKeyword_0()); 

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
    // $ANTLR end "rule__FlowSegment__Group__0__Impl"


    // $ANTLR start "rule__FlowSegment__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2423:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2427:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2428:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__14785);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__14788);
            rule__FlowSegment__Group__2();

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
    // $ANTLR end "rule__FlowSegment__Group__1"


    // $ANTLR start "rule__FlowSegment__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2435:1: rule__FlowSegment__Group__1__Impl : ( '{' ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2439:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2440:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2440:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2441:1: '{'
            {
             before(grammarAccess.getFlowSegmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FlowSegment__Group__1__Impl4816); 
             after(grammarAccess.getFlowSegmentAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__FlowSegment__Group__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2454:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2458:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2459:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__24847);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__24850);
            rule__FlowSegment__Group__3();

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
    // $ANTLR end "rule__FlowSegment__Group__2"


    // $ANTLR start "rule__FlowSegment__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2466:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2470:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2471:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2471:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2472:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2473:1: ( rule__FlowSegment__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2473:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl4877);
                    rule__FlowSegment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFlowSegmentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FlowSegment__Group__2__Impl"


    // $ANTLR start "rule__FlowSegment__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2483:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2488:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__34908);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__34911);
            rule__FlowSegment__Group__4();

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
    // $ANTLR end "rule__FlowSegment__Group__3"


    // $ANTLR start "rule__FlowSegment__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2495:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2499:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2500:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2500:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2501:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2502:1: ( rule__FlowSegment__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2502:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl4938);
                    rule__FlowSegment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFlowSegmentAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FlowSegment__Group__3__Impl"


    // $ANTLR start "rule__FlowSegment__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2512:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2516:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2517:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__44969);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__44972);
            rule__FlowSegment__Group__5();

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
    // $ANTLR end "rule__FlowSegment__Group__4"


    // $ANTLR start "rule__FlowSegment__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2524:1: rule__FlowSegment__Group__4__Impl : ( ( rule__FlowSegment__Group_4__0 )? ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2528:1: ( ( ( rule__FlowSegment__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2529:1: ( ( rule__FlowSegment__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2529:1: ( ( rule__FlowSegment__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2530:1: ( rule__FlowSegment__Group_4__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2531:1: ( rule__FlowSegment__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2531:2: rule__FlowSegment__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__0_in_rule__FlowSegment__Group__4__Impl4999);
                    rule__FlowSegment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFlowSegmentAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FlowSegment__Group__4__Impl"


    // $ANTLR start "rule__FlowSegment__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2541:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6 ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2545:1: ( rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2546:2: rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__55030);
            rule__FlowSegment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__6_in_rule__FlowSegment__Group__55033);
            rule__FlowSegment__Group__6();

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
    // $ANTLR end "rule__FlowSegment__Group__5"


    // $ANTLR start "rule__FlowSegment__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2553:1: rule__FlowSegment__Group__5__Impl : ( 'placement' ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2557:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2559:1: 'placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FlowSegment__Group__5__Impl5061); 
             after(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_5()); 

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
    // $ANTLR end "rule__FlowSegment__Group__5__Impl"


    // $ANTLR start "rule__FlowSegment__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2572:1: rule__FlowSegment__Group__6 : rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7 ;
    public final void rule__FlowSegment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2576:1: ( rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2577:2: rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__6__Impl_in_rule__FlowSegment__Group__65092);
            rule__FlowSegment__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__7_in_rule__FlowSegment__Group__65095);
            rule__FlowSegment__Group__7();

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
    // $ANTLR end "rule__FlowSegment__Group__6"


    // $ANTLR start "rule__FlowSegment__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2584:1: rule__FlowSegment__Group__6__Impl : ( ( rule__FlowSegment__PlacementAssignment_6 ) ) ;
    public final void rule__FlowSegment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2588:1: ( ( ( rule__FlowSegment__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2589:1: ( ( rule__FlowSegment__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2589:1: ( ( rule__FlowSegment__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2590:1: ( rule__FlowSegment__PlacementAssignment_6 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2591:1: ( rule__FlowSegment__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2591:2: rule__FlowSegment__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_6_in_rule__FlowSegment__Group__6__Impl5122);
            rule__FlowSegment__PlacementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_6()); 

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
    // $ANTLR end "rule__FlowSegment__Group__6__Impl"


    // $ANTLR start "rule__FlowSegment__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2601:1: rule__FlowSegment__Group__7 : rule__FlowSegment__Group__7__Impl ;
    public final void rule__FlowSegment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2605:1: ( rule__FlowSegment__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2606:2: rule__FlowSegment__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__7__Impl_in_rule__FlowSegment__Group__75152);
            rule__FlowSegment__Group__7__Impl();

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
    // $ANTLR end "rule__FlowSegment__Group__7"


    // $ANTLR start "rule__FlowSegment__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2612:1: rule__FlowSegment__Group__7__Impl : ( '}' ) ;
    public final void rule__FlowSegment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2616:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2617:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2617:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2618:1: '}'
            {
             before(grammarAccess.getFlowSegmentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FlowSegment__Group__7__Impl5180); 
             after(grammarAccess.getFlowSegmentAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__FlowSegment__Group__7__Impl"


    // $ANTLR start "rule__FlowSegment__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2647:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2651:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2652:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__05227);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__05230);
            rule__FlowSegment__Group_2__1();

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
    // $ANTLR end "rule__FlowSegment__Group_2__0"


    // $ANTLR start "rule__FlowSegment__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2659:1: rule__FlowSegment__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2663:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2664:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2664:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2665:1: 'GUID'
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl5258); 
             after(grammarAccess.getFlowSegmentAccess().getGUIDKeyword_2_0()); 

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
    // $ANTLR end "rule__FlowSegment__Group_2__0__Impl"


    // $ANTLR start "rule__FlowSegment__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2678:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2682:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2683:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__15289);
            rule__FlowSegment__Group_2__1__Impl();

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
    // $ANTLR end "rule__FlowSegment__Group_2__1"


    // $ANTLR start "rule__FlowSegment__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2689:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__GUIDAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2693:1: ( ( ( rule__FlowSegment__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2694:1: ( ( rule__FlowSegment__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2694:1: ( ( rule__FlowSegment__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2695:1: ( rule__FlowSegment__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2696:1: ( rule__FlowSegment__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2696:2: rule__FlowSegment__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__GUIDAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl5316);
            rule__FlowSegment__GUIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getGUIDAssignment_2_1()); 

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
    // $ANTLR end "rule__FlowSegment__Group_2__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2710:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2714:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2715:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__05350);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__05353);
            rule__FlowSegment__Group_3__1();

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
    // $ANTLR end "rule__FlowSegment__Group_3__0"


    // $ANTLR start "rule__FlowSegment__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2722:1: rule__FlowSegment__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2726:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2727:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2727:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2728:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl5381); 
             after(grammarAccess.getFlowSegmentAccess().getNameKeyword_3_0()); 

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
    // $ANTLR end "rule__FlowSegment__Group_3__0__Impl"


    // $ANTLR start "rule__FlowSegment__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2741:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2745:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2746:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__15412);
            rule__FlowSegment__Group_3__1__Impl();

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
    // $ANTLR end "rule__FlowSegment__Group_3__1"


    // $ANTLR start "rule__FlowSegment__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2752:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__NameAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2756:1: ( ( ( rule__FlowSegment__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2757:1: ( ( rule__FlowSegment__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2757:1: ( ( rule__FlowSegment__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2758:1: ( rule__FlowSegment__NameAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2759:1: ( rule__FlowSegment__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2759:2: rule__FlowSegment__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl5439);
            rule__FlowSegment__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getNameAssignment_3_1()); 

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
    // $ANTLR end "rule__FlowSegment__Group_3__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2773:1: rule__FlowSegment__Group_4__0 : rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1 ;
    public final void rule__FlowSegment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2777:1: ( rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2778:2: rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__0__Impl_in_rule__FlowSegment__Group_4__05473);
            rule__FlowSegment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__1_in_rule__FlowSegment__Group_4__05476);
            rule__FlowSegment__Group_4__1();

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
    // $ANTLR end "rule__FlowSegment__Group_4__0"


    // $ANTLR start "rule__FlowSegment__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2785:1: rule__FlowSegment__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2789:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2790:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2790:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2791:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FlowSegment__Group_4__0__Impl5504); 
             after(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_4_0()); 

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
    // $ANTLR end "rule__FlowSegment__Group_4__0__Impl"


    // $ANTLR start "rule__FlowSegment__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2804:1: rule__FlowSegment__Group_4__1 : rule__FlowSegment__Group_4__1__Impl ;
    public final void rule__FlowSegment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2808:1: ( rule__FlowSegment__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2809:2: rule__FlowSegment__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__1__Impl_in_rule__FlowSegment__Group_4__15535);
            rule__FlowSegment__Group_4__1__Impl();

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
    // $ANTLR end "rule__FlowSegment__Group_4__1"


    // $ANTLR start "rule__FlowSegment__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2815:1: rule__FlowSegment__Group_4__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) ) ;
    public final void rule__FlowSegment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2819:1: ( ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2820:1: ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2820:1: ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2821:1: ( rule__FlowSegment__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2822:1: ( rule__FlowSegment__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2822:2: rule__FlowSegment__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_4_1_in_rule__FlowSegment__Group_4__1__Impl5562);
            rule__FlowSegment__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_4_1()); 

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
    // $ANTLR end "rule__FlowSegment__Group_4__1__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2836:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2840:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2841:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__05596);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__05599);
            rule__LocalPlacement__Group__1();

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
    // $ANTLR end "rule__LocalPlacement__Group__0"


    // $ANTLR start "rule__LocalPlacement__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2848:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2852:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2853:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2853:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2854:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2855:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2857:1: 
            {
            }

             after(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2867:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2871:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2872:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__15657);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__15660);
            rule__LocalPlacement__Group__2();

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
    // $ANTLR end "rule__LocalPlacement__Group__1"


    // $ANTLR start "rule__LocalPlacement__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2879:1: rule__LocalPlacement__Group__1__Impl : ( 'LocalPlacement' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2883:1: ( ( 'LocalPlacement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2884:1: ( 'LocalPlacement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2884:1: ( 'LocalPlacement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2885:1: 'LocalPlacement'
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__LocalPlacement__Group__1__Impl5688); 
             after(grammarAccess.getLocalPlacementAccess().getLocalPlacementKeyword_1()); 

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
    // $ANTLR end "rule__LocalPlacement__Group__1__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2898:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2902:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2903:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__25719);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__25722);
            rule__LocalPlacement__Group__3();

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
    // $ANTLR end "rule__LocalPlacement__Group__2"


    // $ANTLR start "rule__LocalPlacement__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2910:1: rule__LocalPlacement__Group__2__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2914:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2915:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2915:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2916:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LocalPlacement__Group__2__Impl5750); 
             after(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__LocalPlacement__Group__2__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2929:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2933:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2934:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__35781);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__35784);
            rule__LocalPlacement__Group__4();

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
    // $ANTLR end "rule__LocalPlacement__Group__3"


    // $ANTLR start "rule__LocalPlacement__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2941:1: rule__LocalPlacement__Group__3__Impl : ( ( rule__LocalPlacement__Group_3__0 )? ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2945:1: ( ( ( rule__LocalPlacement__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2946:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2946:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2947:1: ( rule__LocalPlacement__Group_3__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2948:1: ( rule__LocalPlacement__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2948:2: rule__LocalPlacement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl5811);
                    rule__LocalPlacement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__LocalPlacement__Group__3__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2958:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2962:1: ( rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2963:2: rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__45842);
            rule__LocalPlacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__45845);
            rule__LocalPlacement__Group__5();

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
    // $ANTLR end "rule__LocalPlacement__Group__4"


    // $ANTLR start "rule__LocalPlacement__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2970:1: rule__LocalPlacement__Group__4__Impl : ( ( rule__LocalPlacement__Group_4__0 )? ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2974:1: ( ( ( rule__LocalPlacement__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2975:1: ( ( rule__LocalPlacement__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2975:1: ( ( rule__LocalPlacement__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2976:1: ( rule__LocalPlacement__Group_4__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( rule__LocalPlacement__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:2: rule__LocalPlacement__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__0_in_rule__LocalPlacement__Group__4__Impl5872);
                    rule__LocalPlacement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__LocalPlacement__Group__4__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2987:1: rule__LocalPlacement__Group__5 : rule__LocalPlacement__Group__5__Impl ;
    public final void rule__LocalPlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2991:1: ( rule__LocalPlacement__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2992:2: rule__LocalPlacement__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__55903);
            rule__LocalPlacement__Group__5__Impl();

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
    // $ANTLR end "rule__LocalPlacement__Group__5"


    // $ANTLR start "rule__LocalPlacement__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2998:1: rule__LocalPlacement__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3002:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3004:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LocalPlacement__Group__5__Impl5931); 
             after(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__LocalPlacement__Group__5__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3029:1: rule__LocalPlacement__Group_3__0 : rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 ;
    public final void rule__LocalPlacement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3033:1: ( rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3034:2: rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__05974);
            rule__LocalPlacement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__05977);
            rule__LocalPlacement__Group_3__1();

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
    // $ANTLR end "rule__LocalPlacement__Group_3__0"


    // $ANTLR start "rule__LocalPlacement__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3041:1: rule__LocalPlacement__Group_3__0__Impl : ( 'relativeTo' ) ;
    public final void rule__LocalPlacement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3045:1: ( ( 'relativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3046:1: ( 'relativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3046:1: ( 'relativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3047:1: 'relativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl6005); 
             after(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_3_0()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_3__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3060:1: rule__LocalPlacement__Group_3__1 : rule__LocalPlacement__Group_3__1__Impl ;
    public final void rule__LocalPlacement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3064:1: ( rule__LocalPlacement__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3065:2: rule__LocalPlacement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__16036);
            rule__LocalPlacement__Group_3__1__Impl();

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
    // $ANTLR end "rule__LocalPlacement__Group_3__1"


    // $ANTLR start "rule__LocalPlacement__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3071:1: rule__LocalPlacement__Group_3__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_3_1 ) ) ;
    public final void rule__LocalPlacement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3075:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3076:1: ( ( rule__LocalPlacement__RelativeToAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3076:1: ( ( rule__LocalPlacement__RelativeToAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3077:1: ( rule__LocalPlacement__RelativeToAssignment_3_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3078:1: ( rule__LocalPlacement__RelativeToAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3078:2: rule__LocalPlacement__RelativeToAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl6063);
            rule__LocalPlacement__RelativeToAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_3_1()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_3__1__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3092:1: rule__LocalPlacement__Group_4__0 : rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1 ;
    public final void rule__LocalPlacement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3096:1: ( rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3097:2: rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__0__Impl_in_rule__LocalPlacement__Group_4__06097);
            rule__LocalPlacement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__1_in_rule__LocalPlacement__Group_4__06100);
            rule__LocalPlacement__Group_4__1();

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
    // $ANTLR end "rule__LocalPlacement__Group_4__0"


    // $ANTLR start "rule__LocalPlacement__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3104:1: rule__LocalPlacement__Group_4__0__Impl : ( 'axis2placement3d' ) ;
    public final void rule__LocalPlacement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3108:1: ( ( 'axis2placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3109:1: ( 'axis2placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3109:1: ( 'axis2placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3110:1: 'axis2placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_4_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__LocalPlacement__Group_4__0__Impl6128); 
             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_4_0()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_4__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3123:1: rule__LocalPlacement__Group_4__1 : rule__LocalPlacement__Group_4__1__Impl ;
    public final void rule__LocalPlacement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3127:1: ( rule__LocalPlacement__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3128:2: rule__LocalPlacement__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__1__Impl_in_rule__LocalPlacement__Group_4__16159);
            rule__LocalPlacement__Group_4__1__Impl();

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
    // $ANTLR end "rule__LocalPlacement__Group_4__1"


    // $ANTLR start "rule__LocalPlacement__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3134:1: rule__LocalPlacement__Group_4__1__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 ) ) ;
    public final void rule__LocalPlacement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3138:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3139:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3139:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3140:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3141:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3141:2: rule__LocalPlacement__Axis2placement3dAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_1_in_rule__LocalPlacement__Group_4__1__Impl6186);
            rule__LocalPlacement__Axis2placement3dAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_4_1()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_4__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3155:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3159:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3160:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__06220);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__06223);
            rule__Axis2Placement3D__Group__1();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__0"


    // $ANTLR start "rule__Axis2Placement3D__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3167:1: rule__Axis2Placement3D__Group__0__Impl : ( 'Axis2Placement3D' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3171:1: ( ( 'Axis2Placement3D' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3172:1: ( 'Axis2Placement3D' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3172:1: ( 'Axis2Placement3D' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3173:1: 'Axis2Placement3D'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxis2Placement3DKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Axis2Placement3D__Group__0__Impl6251); 
             after(grammarAccess.getAxis2Placement3DAccess().getAxis2Placement3DKeyword_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__0__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3186:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3190:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3191:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__16282);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__16285);
            rule__Axis2Placement3D__Group__2();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__1"


    // $ANTLR start "rule__Axis2Placement3D__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: rule__Axis2Placement3D__Group__1__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3202:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3203:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3203:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3204:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Axis2Placement3D__Group__1__Impl6313); 
             after(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3217:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3221:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3222:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__26344);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__26347);
            rule__Axis2Placement3D__Group__3();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__2"


    // $ANTLR start "rule__Axis2Placement3D__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3229:1: rule__Axis2Placement3D__Group__2__Impl : ( 'cartesianX' ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3233:1: ( ( 'cartesianX' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3234:1: ( 'cartesianX' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3234:1: ( 'cartesianX' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: 'cartesianX'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Axis2Placement3D__Group__2__Impl6375); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_2()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__2__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3248:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3252:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3253:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__36406);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__36409);
            rule__Axis2Placement3D__Group__4();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__3"


    // $ANTLR start "rule__Axis2Placement3D__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3260:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3264:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3266:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3267:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3267:2: rule__Axis2Placement3D__CartesianXAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl6436);
            rule__Axis2Placement3D__CartesianXAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__3__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3277:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3281:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3282:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__46466);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__46469);
            rule__Axis2Placement3D__Group__5();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__4"


    // $ANTLR start "rule__Axis2Placement3D__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3289:1: rule__Axis2Placement3D__Group__4__Impl : ( 'cartesianY' ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3293:1: ( ( 'cartesianY' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3294:1: ( 'cartesianY' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3294:1: ( 'cartesianY' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: 'cartesianY'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_4()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Axis2Placement3D__Group__4__Impl6497); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_4()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__4__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3308:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3312:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3313:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__56528);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__56531);
            rule__Axis2Placement3D__Group__6();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__5"


    // $ANTLR start "rule__Axis2Placement3D__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3320:1: rule__Axis2Placement3D__Group__5__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3324:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3326:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3327:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3327:2: rule__Axis2Placement3D__CartesianYAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl6558);
            rule__Axis2Placement3D__CartesianYAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__5__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3337:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3341:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3342:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__66588);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__66591);
            rule__Axis2Placement3D__Group__7();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__6"


    // $ANTLR start "rule__Axis2Placement3D__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3349:1: rule__Axis2Placement3D__Group__6__Impl : ( 'cartesianZ' ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3353:1: ( ( 'cartesianZ' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3354:1: ( 'cartesianZ' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3354:1: ( 'cartesianZ' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3355:1: 'cartesianZ'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_6()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Axis2Placement3D__Group__6__Impl6619); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_6()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__6__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3368:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3372:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3373:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__76650);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__76653);
            rule__Axis2Placement3D__Group__8();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__7"


    // $ANTLR start "rule__Axis2Placement3D__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3380:1: rule__Axis2Placement3D__Group__7__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3384:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3386:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3387:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3387:2: rule__Axis2Placement3D__CartesianZAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl6680);
            rule__Axis2Placement3D__CartesianZAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__7__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3397:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3401:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3402:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__86710);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__86713);
            rule__Axis2Placement3D__Group__9();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__8"


    // $ANTLR start "rule__Axis2Placement3D__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3409:1: rule__Axis2Placement3D__Group__8__Impl : ( 'axis' ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3413:1: ( ( 'axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3414:1: ( 'axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3414:1: ( 'axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3415:1: 'axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_8()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Axis2Placement3D__Group__8__Impl6741); 
             after(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_8()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__8__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__9"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3428:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3432:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3433:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__96772);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__96775);
            rule__Axis2Placement3D__Group__10();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__9"


    // $ANTLR start "rule__Axis2Placement3D__Group__9__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3440:1: rule__Axis2Placement3D__Group__9__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_9 ) ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3444:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_9 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3445:1: ( ( rule__Axis2Placement3D__AxisAssignment_9 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3445:1: ( ( rule__Axis2Placement3D__AxisAssignment_9 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3446:1: ( rule__Axis2Placement3D__AxisAssignment_9 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_9()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3447:1: ( rule__Axis2Placement3D__AxisAssignment_9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3447:2: rule__Axis2Placement3D__AxisAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_9_in_rule__Axis2Placement3D__Group__9__Impl6802);
            rule__Axis2Placement3D__AxisAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_9()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__9__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__10"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3457:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3461:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3462:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__106832);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__106835);
            rule__Axis2Placement3D__Group__11();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__10"


    // $ANTLR start "rule__Axis2Placement3D__Group__10__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3469:1: rule__Axis2Placement3D__Group__10__Impl : ( 'refDirection' ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3473:1: ( ( 'refDirection' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3474:1: ( 'refDirection' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3474:1: ( 'refDirection' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3475:1: 'refDirection'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_10()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Axis2Placement3D__Group__10__Impl6863); 
             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_10()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__10__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__11"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3488:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3492:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3493:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__116894);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__116897);
            rule__Axis2Placement3D__Group__12();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__11"


    // $ANTLR start "rule__Axis2Placement3D__Group__11__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3500:1: rule__Axis2Placement3D__Group__11__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_11 ) ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3504:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_11 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3505:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_11 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3505:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_11 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3506:1: ( rule__Axis2Placement3D__RefDirectionAssignment_11 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_11()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3507:1: ( rule__Axis2Placement3D__RefDirectionAssignment_11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3507:2: rule__Axis2Placement3D__RefDirectionAssignment_11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_11_in_rule__Axis2Placement3D__Group__11__Impl6924);
            rule__Axis2Placement3D__RefDirectionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_11()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__11__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__12"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3517:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3521:1: ( rule__Axis2Placement3D__Group__12__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3522:2: rule__Axis2Placement3D__Group__12__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__126954);
            rule__Axis2Placement3D__Group__12__Impl();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__12"


    // $ANTLR start "rule__Axis2Placement3D__Group__12__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3528:1: rule__Axis2Placement3D__Group__12__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3532:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3533:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3533:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3534:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Axis2Placement3D__Group__12__Impl6982); 
             after(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_12()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__12__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3573:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3577:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3578:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__07039);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__07042);
            rule__EDouble__Group__1();

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3585:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3589:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3590:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3590:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3591:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3592:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3593:2: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__EDouble__Group__0__Impl7071); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3604:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3608:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3609:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__17104);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__17107);
            rule__EDouble__Group__2();

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3616:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3620:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3621:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3621:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3622:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3623:1: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3623:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl7135); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3633:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3637:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3638:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__27166);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__27169);
            rule__EDouble__Group__3();

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3645:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3649:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3650:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3650:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3651:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__EDouble__Group__2__Impl7197); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3664:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3668:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3669:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__37228);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__37231);
            rule__EDouble__Group__4();

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3676:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3680:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3681:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3681:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3682:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl7258); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3693:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3697:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3698:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__47287);
            rule__EDouble__Group__4__Impl();

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3704:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3708:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3709:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3709:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3710:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3711:1: ( rule__EDouble__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=11 && LA24_0<=12)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3711:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl7314);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3731:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3735:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3736:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__07355);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__07358);
            rule__EDouble__Group_4__1();

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3743:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3747:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3748:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3748:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3749:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3750:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3750:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl7385);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3760:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3764:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3765:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__17415);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__17418);
            rule__EDouble__Group_4__2();

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3772:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3776:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3777:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3777:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3778:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3779:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3780:2: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__EDouble__Group_4__1__Impl7447); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3791:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3795:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3796:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__27480);
            rule__EDouble__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3802:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3806:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3807:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3807:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3808:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl7507); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Direction__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3825:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3829:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3830:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__07542);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__07545);
            rule__Direction__Group__1();

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
    // $ANTLR end "rule__Direction__Group__0"


    // $ANTLR start "rule__Direction__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3837:1: rule__Direction__Group__0__Impl : ( 'Direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3841:1: ( ( 'Direction' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3842:1: ( 'Direction' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3842:1: ( 'Direction' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3843:1: 'Direction'
            {
             before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Direction__Group__0__Impl7573); 
             after(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 

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
    // $ANTLR end "rule__Direction__Group__0__Impl"


    // $ANTLR start "rule__Direction__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3856:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3860:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3861:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__17604);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__17607);
            rule__Direction__Group__2();

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
    // $ANTLR end "rule__Direction__Group__1"


    // $ANTLR start "rule__Direction__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3868:1: rule__Direction__Group__1__Impl : ( '{' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3872:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3873:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3873:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3874:1: '{'
            {
             before(grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Direction__Group__1__Impl7635); 
             after(grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Direction__Group__1__Impl"


    // $ANTLR start "rule__Direction__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3887:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3891:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3892:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__27666);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__27669);
            rule__Direction__Group__3();

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
    // $ANTLR end "rule__Direction__Group__2"


    // $ANTLR start "rule__Direction__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3899:1: rule__Direction__Group__2__Impl : ( 'x' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3903:1: ( ( 'x' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3904:1: ( 'x' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3904:1: ( 'x' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3905:1: 'x'
            {
             before(grammarAccess.getDirectionAccess().getXKeyword_2()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Direction__Group__2__Impl7697); 
             after(grammarAccess.getDirectionAccess().getXKeyword_2()); 

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
    // $ANTLR end "rule__Direction__Group__2__Impl"


    // $ANTLR start "rule__Direction__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3918:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3922:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3923:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__37728);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__37731);
            rule__Direction__Group__4();

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
    // $ANTLR end "rule__Direction__Group__3"


    // $ANTLR start "rule__Direction__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3930:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__XAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3934:1: ( ( ( rule__Direction__XAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3935:1: ( ( rule__Direction__XAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3935:1: ( ( rule__Direction__XAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3936:1: ( rule__Direction__XAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3937:1: ( rule__Direction__XAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3937:2: rule__Direction__XAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_3_in_rule__Direction__Group__3__Impl7758);
            rule__Direction__XAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getXAssignment_3()); 

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
    // $ANTLR end "rule__Direction__Group__3__Impl"


    // $ANTLR start "rule__Direction__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3947:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3951:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3952:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__47788);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__47791);
            rule__Direction__Group__5();

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
    // $ANTLR end "rule__Direction__Group__4"


    // $ANTLR start "rule__Direction__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3959:1: rule__Direction__Group__4__Impl : ( 'y' ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3963:1: ( ( 'y' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3964:1: ( 'y' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3964:1: ( 'y' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3965:1: 'y'
            {
             before(grammarAccess.getDirectionAccess().getYKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Direction__Group__4__Impl7819); 
             after(grammarAccess.getDirectionAccess().getYKeyword_4()); 

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
    // $ANTLR end "rule__Direction__Group__4__Impl"


    // $ANTLR start "rule__Direction__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3978:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl rule__Direction__Group__6 ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3982:1: ( rule__Direction__Group__5__Impl rule__Direction__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3983:2: rule__Direction__Group__5__Impl rule__Direction__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__57850);
            rule__Direction__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__6_in_rule__Direction__Group__57853);
            rule__Direction__Group__6();

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
    // $ANTLR end "rule__Direction__Group__5"


    // $ANTLR start "rule__Direction__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3990:1: rule__Direction__Group__5__Impl : ( ( rule__Direction__YAssignment_5 ) ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3994:1: ( ( ( rule__Direction__YAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3995:1: ( ( rule__Direction__YAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3995:1: ( ( rule__Direction__YAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3996:1: ( rule__Direction__YAssignment_5 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3997:1: ( rule__Direction__YAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3997:2: rule__Direction__YAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_5_in_rule__Direction__Group__5__Impl7880);
            rule__Direction__YAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getYAssignment_5()); 

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
    // $ANTLR end "rule__Direction__Group__5__Impl"


    // $ANTLR start "rule__Direction__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4007:1: rule__Direction__Group__6 : rule__Direction__Group__6__Impl rule__Direction__Group__7 ;
    public final void rule__Direction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4011:1: ( rule__Direction__Group__6__Impl rule__Direction__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4012:2: rule__Direction__Group__6__Impl rule__Direction__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__6__Impl_in_rule__Direction__Group__67910);
            rule__Direction__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__7_in_rule__Direction__Group__67913);
            rule__Direction__Group__7();

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
    // $ANTLR end "rule__Direction__Group__6"


    // $ANTLR start "rule__Direction__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4019:1: rule__Direction__Group__6__Impl : ( ( rule__Direction__Group_6__0 )? ) ;
    public final void rule__Direction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4023:1: ( ( ( rule__Direction__Group_6__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4024:1: ( ( rule__Direction__Group_6__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4024:1: ( ( rule__Direction__Group_6__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4025:1: ( rule__Direction__Group_6__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4026:1: ( rule__Direction__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4026:2: rule__Direction__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__0_in_rule__Direction__Group__6__Impl7940);
                    rule__Direction__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Direction__Group__6__Impl"


    // $ANTLR start "rule__Direction__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4036:1: rule__Direction__Group__7 : rule__Direction__Group__7__Impl ;
    public final void rule__Direction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4040:1: ( rule__Direction__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4041:2: rule__Direction__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__7__Impl_in_rule__Direction__Group__77971);
            rule__Direction__Group__7__Impl();

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
    // $ANTLR end "rule__Direction__Group__7"


    // $ANTLR start "rule__Direction__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4047:1: rule__Direction__Group__7__Impl : ( '}' ) ;
    public final void rule__Direction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4051:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4052:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4052:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4053:1: '}'
            {
             before(grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Direction__Group__7__Impl7999); 
             after(grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Direction__Group__7__Impl"


    // $ANTLR start "rule__Direction__Group_6__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4082:1: rule__Direction__Group_6__0 : rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1 ;
    public final void rule__Direction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4086:1: ( rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4087:2: rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__0__Impl_in_rule__Direction__Group_6__08046);
            rule__Direction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__1_in_rule__Direction__Group_6__08049);
            rule__Direction__Group_6__1();

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
    // $ANTLR end "rule__Direction__Group_6__0"


    // $ANTLR start "rule__Direction__Group_6__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4094:1: rule__Direction__Group_6__0__Impl : ( 'z' ) ;
    public final void rule__Direction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4098:1: ( ( 'z' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4099:1: ( 'z' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4099:1: ( 'z' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4100:1: 'z'
            {
             before(grammarAccess.getDirectionAccess().getZKeyword_6_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__Direction__Group_6__0__Impl8077); 
             after(grammarAccess.getDirectionAccess().getZKeyword_6_0()); 

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
    // $ANTLR end "rule__Direction__Group_6__0__Impl"


    // $ANTLR start "rule__Direction__Group_6__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4113:1: rule__Direction__Group_6__1 : rule__Direction__Group_6__1__Impl ;
    public final void rule__Direction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4117:1: ( rule__Direction__Group_6__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4118:2: rule__Direction__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__1__Impl_in_rule__Direction__Group_6__18108);
            rule__Direction__Group_6__1__Impl();

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
    // $ANTLR end "rule__Direction__Group_6__1"


    // $ANTLR start "rule__Direction__Group_6__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4124:1: rule__Direction__Group_6__1__Impl : ( ( rule__Direction__ZAssignment_6_1 ) ) ;
    public final void rule__Direction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4128:1: ( ( ( rule__Direction__ZAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4129:1: ( ( rule__Direction__ZAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4129:1: ( ( rule__Direction__ZAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4130:1: ( rule__Direction__ZAssignment_6_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4131:1: ( rule__Direction__ZAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4131:2: rule__Direction__ZAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_6_1_in_rule__Direction__Group_6__1__Impl8135);
            rule__Direction__ZAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getZAssignment_6_1()); 

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
    // $ANTLR end "rule__Direction__Group_6__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_3_2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4146:1: rule__Model__ElementsAssignment_3_2 : ( ruleGUIDElement ) ;
    public final void rule__Model__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4150:1: ( ( ruleGUIDElement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4151:1: ( ruleGUIDElement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4151:1: ( ruleGUIDElement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4152:1: ruleGUIDElement
            {
             before(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_28174);
            ruleGUIDElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_3_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4161:1: rule__Model__ElementsAssignment_3_3_1 : ( ruleGUIDElement ) ;
    public final void rule__Model__ElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4165:1: ( ( ruleGUIDElement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4166:1: ( ruleGUIDElement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4166:1: ( ruleGUIDElement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4167:1: ruleGUIDElement
            {
             before(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_3_18205);
            ruleGUIDElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_3_3_1"


    // $ANTLR start "rule__GUIDElement_Impl__GUIDAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4176:1: rule__GUIDElement_Impl__GUIDAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__GUIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4180:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4181:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4181:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4182:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__GUIDAssignment_3_18236);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGUIDElement_ImplAccess().getGUIDEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__GUIDAssignment_3_1"


    // $ANTLR start "rule__GUIDElement_Impl__NameAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4191:1: rule__GUIDElement_Impl__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4195:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4196:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4196:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4197:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__NameAssignment_4_18267);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGUIDElement_ImplAccess().getNameEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__NameAssignment_4_1"


    // $ANTLR start "rule__GUIDElement_Impl__DescriptionAssignment_5_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4206:1: rule__GUIDElement_Impl__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4210:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4211:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4211:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4212:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__DescriptionAssignment_5_18298);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGUIDElement_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__GUIDElement_Impl__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Wall__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4221:1: rule__Wall__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Wall__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4225:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4226:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4226:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4227:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__GUIDAssignment_2_18329);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallAccess().getGUIDEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Wall__GUIDAssignment_2_1"


    // $ANTLR start "rule__Wall__NameAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4236:1: rule__Wall__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Wall__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4240:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4241:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4241:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4242:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__NameAssignment_3_18360);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Wall__NameAssignment_3_1"


    // $ANTLR start "rule__Wall__DescriptionAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4251:1: rule__Wall__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Wall__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4255:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4256:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4256:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4257:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__DescriptionAssignment_4_18391);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Wall__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Wall__PlacementAssignment_6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4266:1: rule__Wall__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__Wall__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4270:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4271:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4271:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4272:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Wall__PlacementAssignment_68422);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getWallAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Wall__PlacementAssignment_6"


    // $ANTLR start "rule__Opening__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4281:1: rule__Opening__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4285:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4286:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4286:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4287:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__GUIDAssignment_2_18453);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getGUIDEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Opening__GUIDAssignment_2_1"


    // $ANTLR start "rule__Opening__NameAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4296:1: rule__Opening__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4300:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4301:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4301:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4302:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__NameAssignment_3_18484);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Opening__NameAssignment_3_1"


    // $ANTLR start "rule__Opening__DescriptionAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4311:1: rule__Opening__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4315:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4316:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4316:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4317:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_4_18515);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Opening__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Opening__PlacementAssignment_6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4326:1: rule__Opening__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4330:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4331:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4331:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4332:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_68546);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Opening__PlacementAssignment_6"


    // $ANTLR start "rule__Opening__WallsAssignment_7_2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4341:1: rule__Opening__WallsAssignment_7_2 : ( ruleWall ) ;
    public final void rule__Opening__WallsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4345:1: ( ( ruleWall ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4346:1: ( ruleWall )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4346:1: ( ruleWall )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4347:1: ruleWall
            {
             before(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_rule__Opening__WallsAssignment_7_28577);
            ruleWall();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Opening__WallsAssignment_7_2"


    // $ANTLR start "rule__Opening__WallsAssignment_7_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4356:1: rule__Opening__WallsAssignment_7_3_1 : ( ruleWall ) ;
    public final void rule__Opening__WallsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4360:1: ( ( ruleWall ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4361:1: ( ruleWall )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4361:1: ( ruleWall )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4362:1: ruleWall
            {
             before(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_rule__Opening__WallsAssignment_7_3_18608);
            ruleWall();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_3_1_0()); 

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
    // $ANTLR end "rule__Opening__WallsAssignment_7_3_1"


    // $ANTLR start "rule__FlowSegment__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4371:1: rule__FlowSegment__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4375:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4376:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4376:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4377:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__GUIDAssignment_2_18639);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getGUIDEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__GUIDAssignment_2_1"


    // $ANTLR start "rule__FlowSegment__NameAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4386:1: rule__FlowSegment__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4390:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4391:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4391:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4392:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_3_18670);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__NameAssignment_3_1"


    // $ANTLR start "rule__FlowSegment__DescriptionAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4401:1: rule__FlowSegment__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4405:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4406:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4406:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4407:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_4_18701);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__DescriptionAssignment_4_1"


    // $ANTLR start "rule__FlowSegment__PlacementAssignment_6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4416:1: rule__FlowSegment__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4420:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4421:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4421:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4422:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_68732);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FlowSegment__PlacementAssignment_6"


    // $ANTLR start "rule__LocalPlacement__RelativeToAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4431:1: rule__LocalPlacement__RelativeToAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4435:1: ( ( ( ruleEString ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4436:1: ( ( ruleEString ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4436:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4437:1: ( ruleEString )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementCrossReference_3_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4438:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4439:1: ruleEString
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LocalPlacement__RelativeToAssignment_3_18767);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__LocalPlacement__RelativeToAssignment_3_1"


    // $ANTLR start "rule__LocalPlacement__Axis2placement3dAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4450:1: rule__LocalPlacement__Axis2placement3dAssignment_4_1 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4454:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4455:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4455:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4456:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_4_18802);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__LocalPlacement__Axis2placement3dAssignment_4_1"


    // $ANTLR start "rule__Axis2Placement3D__CartesianXAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4465:1: rule__Axis2Placement3D__CartesianXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4469:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4470:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4470:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4471:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_38833);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__CartesianXAssignment_3"


    // $ANTLR start "rule__Axis2Placement3D__CartesianYAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4480:1: rule__Axis2Placement3D__CartesianYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4484:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4485:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4485:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4486:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_58864);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__CartesianYAssignment_5"


    // $ANTLR start "rule__Axis2Placement3D__CartesianZAssignment_7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4495:1: rule__Axis2Placement3D__CartesianZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4499:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4500:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4500:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4501:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_78895);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__CartesianZAssignment_7"


    // $ANTLR start "rule__Axis2Placement3D__AxisAssignment_9"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4510:1: rule__Axis2Placement3D__AxisAssignment_9 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4514:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4515:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4515:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4516:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_9_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_98926);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_9_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__AxisAssignment_9"


    // $ANTLR start "rule__Axis2Placement3D__RefDirectionAssignment_11"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4525:1: rule__Axis2Placement3D__RefDirectionAssignment_11 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4529:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4530:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4530:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4531:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_11_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_118957);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_11_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__RefDirectionAssignment_11"


    // $ANTLR start "rule__Direction__XAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4540:1: rule__Direction__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4544:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4545:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4545:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4546:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_38988);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Direction__XAssignment_3"


    // $ANTLR start "rule__Direction__YAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4555:1: rule__Direction__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4559:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4560:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4560:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4561:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_59019);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Direction__YAssignment_5"


    // $ANTLR start "rule__Direction__ZAssignment_6_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4570:1: rule__Direction__ZAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4574:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4575:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4575:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4576:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_6_19050);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Direction__ZAssignment_6_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_entryRuleGUIDElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement__Alternatives_in_ruleGUIDElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement_Impl188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__0_in_ruleGUIDElement_Impl214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_entryRuleWall301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWall308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__0_in_ruleWall334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0_in_ruleOpening394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0_in_ruleDirection694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_rule__GUIDElement__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_rule__GUIDElement__Alternatives747 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__GUIDElement__Alternatives764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__GUIDElement__Alternatives781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0915 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1976 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21038 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__2__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31100 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__4__Impl1189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01230 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_3__0__Impl1261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11292 = new BitSet(new long[]{0x0000000005440000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group_3__1__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21354 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__21357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_2_in_rule__Model__Group_3__2__Impl1384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__31414 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__31417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl1444 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__41475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group_3__4__Impl1503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__01544 = new BitSet(new long[]{0x0000000005440000L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__01547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Model__Group_3_3__0__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__11606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl1633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__0__Impl_in_rule__GUIDElement_Impl__Group__01667 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__1_in_rule__GUIDElement_Impl__Group__01670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__1__Impl_in_rule__GUIDElement_Impl__Group__11728 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__2_in_rule__GUIDElement_Impl__Group__11731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GUIDElement_Impl__Group__1__Impl1759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__2__Impl_in_rule__GUIDElement_Impl__Group__21790 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__3_in_rule__GUIDElement_Impl__Group__21793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GUIDElement_Impl__Group__2__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__3__Impl_in_rule__GUIDElement_Impl__Group__31852 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__4_in_rule__GUIDElement_Impl__Group__31855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__0_in_rule__GUIDElement_Impl__Group__3__Impl1882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__4__Impl_in_rule__GUIDElement_Impl__Group__41913 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__5_in_rule__GUIDElement_Impl__Group__41916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__0_in_rule__GUIDElement_Impl__Group__4__Impl1943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__5__Impl_in_rule__GUIDElement_Impl__Group__51974 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__6_in_rule__GUIDElement_Impl__Group__51977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__0_in_rule__GUIDElement_Impl__Group__5__Impl2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__6__Impl_in_rule__GUIDElement_Impl__Group__62035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GUIDElement_Impl__Group__6__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__0__Impl_in_rule__GUIDElement_Impl__Group_3__02108 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__1_in_rule__GUIDElement_Impl__Group_3__02111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GUIDElement_Impl__Group_3__0__Impl2139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__1__Impl_in_rule__GUIDElement_Impl__Group_3__12170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__GUIDAssignment_3_1_in_rule__GUIDElement_Impl__Group_3__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__0__Impl_in_rule__GUIDElement_Impl__Group_4__02231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__1_in_rule__GUIDElement_Impl__Group_4__02234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__GUIDElement_Impl__Group_4__0__Impl2262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__1__Impl_in_rule__GUIDElement_Impl__Group_4__12293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__NameAssignment_4_1_in_rule__GUIDElement_Impl__Group_4__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__0__Impl_in_rule__GUIDElement_Impl__Group_5__02354 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__1_in_rule__GUIDElement_Impl__Group_5__02357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__GUIDElement_Impl__Group_5__0__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__1__Impl_in_rule__GUIDElement_Impl__Group_5__12416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__DescriptionAssignment_5_1_in_rule__GUIDElement_Impl__Group_5__1__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__0__Impl_in_rule__Wall__Group__02477 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wall__Group__1_in_rule__Wall__Group__02480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Wall__Group__0__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__1__Impl_in_rule__Wall__Group__12539 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__2_in_rule__Wall__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wall__Group__1__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__2__Impl_in_rule__Wall__Group__22601 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__3_in_rule__Wall__Group__22604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__0_in_rule__Wall__Group__2__Impl2631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__3__Impl_in_rule__Wall__Group__32662 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__4_in_rule__Wall__Group__32665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__0_in_rule__Wall__Group__3__Impl2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__4__Impl_in_rule__Wall__Group__42723 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__5_in_rule__Wall__Group__42726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__0_in_rule__Wall__Group__4__Impl2753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__5__Impl_in_rule__Wall__Group__52784 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Wall__Group__6_in_rule__Wall__Group__52787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Wall__Group__5__Impl2815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__6__Impl_in_rule__Wall__Group__62846 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Wall__Group__7_in_rule__Wall__Group__62849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__PlacementAssignment_6_in_rule__Wall__Group__6__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__7__Impl_in_rule__Wall__Group__72906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Wall__Group__7__Impl2934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__0__Impl_in_rule__Wall__Group_2__02981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__1_in_rule__Wall__Group_2__02984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Wall__Group_2__0__Impl3012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__1__Impl_in_rule__Wall__Group_2__13043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__GUIDAssignment_2_1_in_rule__Wall__Group_2__1__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__0__Impl_in_rule__Wall__Group_3__03104 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__1_in_rule__Wall__Group_3__03107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Wall__Group_3__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__1__Impl_in_rule__Wall__Group_3__13166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__NameAssignment_3_1_in_rule__Wall__Group_3__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__0__Impl_in_rule__Wall__Group_4__03227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__1_in_rule__Wall__Group_4__03230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Wall__Group_4__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__1__Impl_in_rule__Wall__Group_4__13289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__DescriptionAssignment_4_1_in_rule__Wall__Group_4__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__03350 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__03353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Opening__Group__0__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__13412 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__13415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Opening__Group__1__Impl3443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__23474 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__23477 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl3504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__33535 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__33538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__43596 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__43599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__0_in_rule__Opening__Group__4__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__53657 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__53660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Opening__Group__5__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__63719 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__63722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_6_in_rule__Opening__Group__6__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__73779 = new BitSet(new long[]{0x0000000002008000L});
        public static final BitSet FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__73782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__0_in_rule__Opening__Group__7__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__83840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Opening__Group__8__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__03917 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__03920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_2__0__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__13979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__GUIDAssignment_2_1_in_rule__Opening__Group_2__1__Impl4006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__04040 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__04043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group_3__0__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__14102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_3_1_in_rule__Opening__Group_3__1__Impl4129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__0__Impl_in_rule__Opening__Group_4__04163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__1_in_rule__Opening__Group_4__04166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group_4__0__Impl4194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__1__Impl_in_rule__Opening__Group_4__14225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_4_1_in_rule__Opening__Group_4__1__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__0__Impl_in_rule__Opening__Group_7__04286 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__1_in_rule__Opening__Group_7__04289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Opening__Group_7__0__Impl4317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__1__Impl_in_rule__Opening__Group_7__14348 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__2_in_rule__Opening__Group_7__14351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Opening__Group_7__1__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__2__Impl_in_rule__Opening__Group_7__24410 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__3_in_rule__Opening__Group_7__24413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_2_in_rule__Opening__Group_7__2__Impl4440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__3__Impl_in_rule__Opening__Group_7__34470 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__4_in_rule__Opening__Group_7__34473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__0_in_rule__Opening__Group_7__3__Impl4500 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__4__Impl_in_rule__Opening__Group_7__44531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Opening__Group_7__4__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__0__Impl_in_rule__Opening__Group_7_3__04600 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__1_in_rule__Opening__Group_7_3__04603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Opening__Group_7_3__0__Impl4631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__1__Impl_in_rule__Opening__Group_7_3__14662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_3_1_in_rule__Opening__Group_7_3__1__Impl4689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__04723 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__04726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__FlowSegment__Group__0__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__14785 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__14788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FlowSegment__Group__1__Impl4816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__24847 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__24850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__34908 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__34911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__44969 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__44972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__0_in_rule__FlowSegment__Group__4__Impl4999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__55030 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__6_in_rule__FlowSegment__Group__55033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FlowSegment__Group__5__Impl5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__6__Impl_in_rule__FlowSegment__Group__65092 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__7_in_rule__FlowSegment__Group__65095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_6_in_rule__FlowSegment__Group__6__Impl5122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__7__Impl_in_rule__FlowSegment__Group__75152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FlowSegment__Group__7__Impl5180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__05227 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__05230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__15289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__GUIDAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl5316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__05350 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__05353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl5381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__15412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl5439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__0__Impl_in_rule__FlowSegment__Group_4__05473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__1_in_rule__FlowSegment__Group_4__05476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FlowSegment__Group_4__0__Impl5504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__1__Impl_in_rule__FlowSegment__Group_4__15535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_4_1_in_rule__FlowSegment__Group_4__1__Impl5562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__05596 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__05599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__15657 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__15660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__LocalPlacement__Group__1__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__25719 = new BitSet(new long[]{0x0000000030008000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__25722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LocalPlacement__Group__2__Impl5750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__35781 = new BitSet(new long[]{0x0000000030008000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__35784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl5811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__45842 = new BitSet(new long[]{0x0000000030008000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__45845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__0_in_rule__LocalPlacement__Group__4__Impl5872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__55903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LocalPlacement__Group__5__Impl5931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__05974 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__05977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__16036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl6063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__0__Impl_in_rule__LocalPlacement__Group_4__06097 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__1_in_rule__LocalPlacement__Group_4__06100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__LocalPlacement__Group_4__0__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__1__Impl_in_rule__LocalPlacement__Group_4__16159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_1_in_rule__LocalPlacement__Group_4__1__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__06220 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__06223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Axis2Placement3D__Group__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__16282 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__16285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Axis2Placement3D__Group__1__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__26344 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__26347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Axis2Placement3D__Group__2__Impl6375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__36406 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__36409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl6436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__46466 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__46469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Axis2Placement3D__Group__4__Impl6497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__56528 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__56531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl6558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__66588 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__66591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Axis2Placement3D__Group__6__Impl6619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__76650 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__76653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl6680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__86710 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__86713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Axis2Placement3D__Group__8__Impl6741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__96772 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__96775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_9_in_rule__Axis2Placement3D__Group__9__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__106832 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__106835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Axis2Placement3D__Group__10__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__116894 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__116897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_11_in_rule__Axis2Placement3D__Group__11__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__126954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Axis2Placement3D__Group__12__Impl6982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__07039 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__07042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EDouble__Group__0__Impl7071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__17104 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__17107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl7135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__27166 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__27169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EDouble__Group__2__Impl7197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__37228 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__37231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__47287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl7314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__07355 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__07358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl7385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__17415 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__17418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EDouble__Group_4__1__Impl7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__27480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl7507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__07542 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__07545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Direction__Group__0__Impl7573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__17604 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__17607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Direction__Group__1__Impl7635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__27666 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__27669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Direction__Group__2__Impl7697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__37728 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__37731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_3_in_rule__Direction__Group__3__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__47788 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__47791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Direction__Group__4__Impl7819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__57850 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_rule__Direction__Group__6_in_rule__Direction__Group__57853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_5_in_rule__Direction__Group__5__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__6__Impl_in_rule__Direction__Group__67910 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_rule__Direction__Group__7_in_rule__Direction__Group__67913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__0_in_rule__Direction__Group__6__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__7__Impl_in_rule__Direction__Group__77971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Direction__Group__7__Impl7999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__0__Impl_in_rule__Direction__Group_6__08046 = new BitSet(new long[]{0x0000003000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__1_in_rule__Direction__Group_6__08049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__Direction__Group_6__0__Impl8077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__1__Impl_in_rule__Direction__Group_6__18108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_6_1_in_rule__Direction__Group_6__1__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_28174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_3_18205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__GUIDAssignment_3_18236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__NameAssignment_4_18267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__DescriptionAssignment_5_18298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__GUIDAssignment_2_18329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__NameAssignment_3_18360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__DescriptionAssignment_4_18391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Wall__PlacementAssignment_68422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__GUIDAssignment_2_18453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__NameAssignment_3_18484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_4_18515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_68546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_rule__Opening__WallsAssignment_7_28577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_rule__Opening__WallsAssignment_7_3_18608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__GUIDAssignment_2_18639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_3_18670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_4_18701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_68732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LocalPlacement__RelativeToAssignment_3_18767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_4_18802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_38833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_58864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_78895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_98926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_118957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_38988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_59019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_6_19050 = new BitSet(new long[]{0x0000000000000002L});
    }


}