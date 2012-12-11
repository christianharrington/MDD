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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Walls'", "'Openings'", "'Pipes'", "'and'", "'Wall'", "'Placement'", "'Name'", "'Description'", "'Opening'", "','", "'Pipe'", "'{'", "'Axis2Placement3d'", "'}'", "'RelativeTo'", "'Cartesian'", "'('", "')'", "'Axis'", "'RefDirection'", "'-'", "'.'"
    };
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:89:1: ( ruleEString EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:1: ( rule__EString__Alternatives )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
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


    // $ANTLR start "entryRuleWallRule"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:116:1: entryRuleWallRule : ruleWallRule EOF ;
    public final void entryRuleWallRule() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:117:1: ( ruleWallRule EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:118:1: ruleWallRule EOF
            {
             before(grammarAccess.getWallRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_entryRuleWallRule181);
            ruleWallRule();

            state._fsp--;

             after(grammarAccess.getWallRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRule188); 

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
    // $ANTLR end "entryRuleWallRule"


    // $ANTLR start "ruleWallRule"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:125:1: ruleWallRule : ( ( rule__WallRule__Group__0 ) ) ;
    public final void ruleWallRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:129:2: ( ( ( rule__WallRule__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__WallRule__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__WallRule__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:131:1: ( rule__WallRule__Group__0 )
            {
             before(grammarAccess.getWallRuleAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:1: ( rule__WallRule__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:2: rule__WallRule__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__0_in_ruleWallRule214);
            rule__WallRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleWallRule"


    // $ANTLR start "entryRuleOpening"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:144:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:145:1: ( ruleOpening EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:146:1: ruleOpening EOF
            {
             before(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening241);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpeningRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening248); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:153:1: ruleOpening : ( ( rule__Opening__Group__0 ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:157:2: ( ( ( rule__Opening__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__Opening__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__Opening__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:159:1: ( rule__Opening__Group__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:1: ( rule__Opening__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:2: rule__Opening__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0_in_ruleOpening274);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:172:1: entryRuleFlowSegment : ruleFlowSegment EOF ;
    public final void entryRuleFlowSegment() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:173:1: ( ruleFlowSegment EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:174:1: ruleFlowSegment EOF
            {
             before(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment301);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getFlowSegmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment308); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:181:1: ruleFlowSegment : ( ( rule__FlowSegment__Group__0 ) ) ;
    public final void ruleFlowSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:185:2: ( ( ( rule__FlowSegment__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__FlowSegment__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__FlowSegment__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:187:1: ( rule__FlowSegment__Group__0 )
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:1: ( rule__FlowSegment__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:2: rule__FlowSegment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment334);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:200:1: entryRuleLocalPlacement : ruleLocalPlacement EOF ;
    public final void entryRuleLocalPlacement() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:201:1: ( ruleLocalPlacement EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:202:1: ruleLocalPlacement EOF
            {
             before(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement361);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement368); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:209:1: ruleLocalPlacement : ( ( rule__LocalPlacement__Group__0 ) ) ;
    public final void ruleLocalPlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:213:2: ( ( ( rule__LocalPlacement__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__LocalPlacement__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__LocalPlacement__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:215:1: ( rule__LocalPlacement__Group__0 )
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:1: ( rule__LocalPlacement__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:2: rule__LocalPlacement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement394);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:228:1: entryRuleAxis2Placement3D : ruleAxis2Placement3D EOF ;
    public final void entryRuleAxis2Placement3D() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:229:1: ( ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:230:1: ruleAxis2Placement3D EOF
            {
             before(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D421);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D428); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:237:1: ruleAxis2Placement3D : ( ( rule__Axis2Placement3D__Group__0 ) ) ;
    public final void ruleAxis2Placement3D() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:241:2: ( ( ( rule__Axis2Placement3D__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:243:1: ( rule__Axis2Placement3D__Group__0 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:1: ( rule__Axis2Placement3D__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:2: rule__Axis2Placement3D__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D454);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:256:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:257:1: ( ruleEDouble EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:258:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble481);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble488); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:265:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:269:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:271:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:1: ( rule__EDouble__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble514);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:284:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:285:1: ( ruleDirection EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:286:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection541);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection548); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:293:1: ruleDirection : ( ( rule__Direction__Group__0 ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:297:2: ( ( ( rule__Direction__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__Direction__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__Direction__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:299:1: ( rule__Direction__Group__0 )
            {
             before(grammarAccess.getDirectionAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:1: ( rule__Direction__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:2: rule__Direction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0_in_ruleDirection574);
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


    // $ANTLR start "rule__EString__Alternatives"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:312:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:316:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( RULE_ID )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( RULE_ID )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:318:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives610); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:323:6: ( RULE_STRING )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:323:6: ( RULE_STRING )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:324:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives627); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:334:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:338:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:339:1: ( 'E' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:339:1: ( 'E' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:340:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0660); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:347:6: ( 'e' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:347:6: ( 'e' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:348:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0680); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:362:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:366:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:367:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0712);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0715);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:374:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:378:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:379:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:379:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:380:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:381:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:383:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:393:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:397:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:398:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1773);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1776);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:405:1: rule__Model__Group__1__Impl : ( 'Walls' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:409:1: ( ( 'Walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:410:1: ( 'Walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:410:1: ( 'Walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:411:1: 'Walls'
            {
             before(grammarAccess.getModelAccess().getWallsKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__1__Impl804); 
             after(grammarAccess.getModelAccess().getWallsKeyword_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:424:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:428:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:429:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2835);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2838);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:436:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:440:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:441:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:441:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:442:1: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:443:1: ( rule__Model__ElementsAssignment_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:443:2: rule__Model__ElementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl865);
            rule__Model__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_2()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:453:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:457:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:458:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3895);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3898);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:465:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:469:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:470:1: ( ( rule__Model__Group_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:470:1: ( ( rule__Model__Group_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:471:1: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:472:1: ( rule__Model__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:472:2: rule__Model__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl925);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:482:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:486:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:487:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4956);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4959);
            rule__Model__Group__5();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:494:1: rule__Model__Group__4__Impl : ( 'Openings' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:498:1: ( ( 'Openings' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:499:1: ( 'Openings' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:499:1: ( 'Openings' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:500:1: 'Openings'
            {
             before(grammarAccess.getModelAccess().getOpeningsKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__4__Impl987); 
             after(grammarAccess.getModelAccess().getOpeningsKeyword_4()); 

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


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:513:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:517:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:518:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51018);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51021);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:525:1: rule__Model__Group__5__Impl : ( ( rule__Model__ElementsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:529:1: ( ( ( rule__Model__ElementsAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:530:1: ( ( rule__Model__ElementsAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:530:1: ( ( rule__Model__ElementsAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:531:1: ( rule__Model__ElementsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:532:1: ( rule__Model__ElementsAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:532:2: rule__Model__ElementsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_5_in_rule__Model__Group__5__Impl1048);
            rule__Model__ElementsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:542:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:546:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:547:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61078);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61081);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:554:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:558:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:559:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:559:1: ( ( rule__Model__Group_6__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:560:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:561:1: ( rule__Model__Group_6__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:561:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1108);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:571:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:575:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:576:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71139);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71142);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:583:1: rule__Model__Group__7__Impl : ( 'Pipes' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:587:1: ( ( 'Pipes' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:588:1: ( 'Pipes' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:588:1: ( 'Pipes' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:589:1: 'Pipes'
            {
             before(grammarAccess.getModelAccess().getPipesKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__7__Impl1170); 
             after(grammarAccess.getModelAccess().getPipesKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:602:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:606:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:607:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81201);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81204);
            rule__Model__Group__9();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:614:1: rule__Model__Group__8__Impl : ( ( rule__Model__ElementsAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:618:1: ( ( ( rule__Model__ElementsAssignment_8 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:619:1: ( ( rule__Model__ElementsAssignment_8 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:619:1: ( ( rule__Model__ElementsAssignment_8 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:620:1: ( rule__Model__ElementsAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:621:1: ( rule__Model__ElementsAssignment_8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:621:2: rule__Model__ElementsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_8_in_rule__Model__Group__8__Impl1231);
            rule__Model__ElementsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_8()); 

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
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group__9"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:631:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:635:1: ( rule__Model__Group__9__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:636:2: rule__Model__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91261);
            rule__Model__Group__9__Impl();

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
    // $ANTLR end "rule__Model__Group__9"


    // $ANTLR start "rule__Model__Group__9__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:642:1: rule__Model__Group__9__Impl : ( ( rule__Model__Group_9__0 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:646:1: ( ( ( rule__Model__Group_9__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:647:1: ( ( rule__Model__Group_9__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:647:1: ( ( rule__Model__Group_9__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:648:1: ( rule__Model__Group_9__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_9()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:649:1: ( rule__Model__Group_9__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:649:2: rule__Model__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl1288);
            	    rule__Model__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Model__Group__9__Impl"


    // $ANTLR start "rule__Model__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:679:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:683:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:684:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01339);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01342);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:691:1: rule__Model__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:695:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:696:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:696:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:697:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_3__0__Impl1370); 
             after(grammarAccess.getModelAccess().getAndKeyword_3_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:710:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:714:1: ( rule__Model__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:715:2: rule__Model__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11401);
            rule__Model__Group_3__1__Impl();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:721:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:725:1: ( ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:726:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:726:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:727:1: ( rule__Model__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:728:1: ( rule__Model__ElementsAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:728:2: rule__Model__ElementsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_1_in_rule__Model__Group_3__1__Impl1428);
            rule__Model__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 

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


    // $ANTLR start "rule__Model__Group_6__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:742:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:746:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:747:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01462);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01465);
            rule__Model__Group_6__1();

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
    // $ANTLR end "rule__Model__Group_6__0"


    // $ANTLR start "rule__Model__Group_6__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:754:1: rule__Model__Group_6__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:758:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:759:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:759:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:760:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_6__0__Impl1493); 
             after(grammarAccess.getModelAccess().getAndKeyword_6_0()); 

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
    // $ANTLR end "rule__Model__Group_6__0__Impl"


    // $ANTLR start "rule__Model__Group_6__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:773:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:777:1: ( rule__Model__Group_6__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:778:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__11524);
            rule__Model__Group_6__1__Impl();

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
    // $ANTLR end "rule__Model__Group_6__1"


    // $ANTLR start "rule__Model__Group_6__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:784:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__ElementsAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:788:1: ( ( ( rule__Model__ElementsAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:789:1: ( ( rule__Model__ElementsAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:789:1: ( ( rule__Model__ElementsAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:790:1: ( rule__Model__ElementsAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:791:1: ( rule__Model__ElementsAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:791:2: rule__Model__ElementsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_6_1_in_rule__Model__Group_6__1__Impl1551);
            rule__Model__ElementsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_6_1()); 

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
    // $ANTLR end "rule__Model__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group_9__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:805:1: rule__Model__Group_9__0 : rule__Model__Group_9__0__Impl rule__Model__Group_9__1 ;
    public final void rule__Model__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:809:1: ( rule__Model__Group_9__0__Impl rule__Model__Group_9__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:810:2: rule__Model__Group_9__0__Impl rule__Model__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01585);
            rule__Model__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01588);
            rule__Model__Group_9__1();

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
    // $ANTLR end "rule__Model__Group_9__0"


    // $ANTLR start "rule__Model__Group_9__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:817:1: rule__Model__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:821:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:822:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:822:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:823:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_9_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_9__0__Impl1616); 
             after(grammarAccess.getModelAccess().getAndKeyword_9_0()); 

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
    // $ANTLR end "rule__Model__Group_9__0__Impl"


    // $ANTLR start "rule__Model__Group_9__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:836:1: rule__Model__Group_9__1 : rule__Model__Group_9__1__Impl ;
    public final void rule__Model__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:840:1: ( rule__Model__Group_9__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:841:2: rule__Model__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11647);
            rule__Model__Group_9__1__Impl();

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
    // $ANTLR end "rule__Model__Group_9__1"


    // $ANTLR start "rule__Model__Group_9__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:847:1: rule__Model__Group_9__1__Impl : ( ( rule__Model__ElementsAssignment_9_1 ) ) ;
    public final void rule__Model__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:851:1: ( ( ( rule__Model__ElementsAssignment_9_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:852:1: ( ( rule__Model__ElementsAssignment_9_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:852:1: ( ( rule__Model__ElementsAssignment_9_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:853:1: ( rule__Model__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_9_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:854:1: ( rule__Model__ElementsAssignment_9_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:854:2: rule__Model__ElementsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1674);
            rule__Model__ElementsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getElementsAssignment_9_1()); 

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
    // $ANTLR end "rule__Model__Group_9__1__Impl"


    // $ANTLR start "rule__WallRule__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:868:1: rule__WallRule__Group__0 : rule__WallRule__Group__0__Impl rule__WallRule__Group__1 ;
    public final void rule__WallRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:872:1: ( rule__WallRule__Group__0__Impl rule__WallRule__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:873:2: rule__WallRule__Group__0__Impl rule__WallRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01708);
            rule__WallRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01711);
            rule__WallRule__Group__1();

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
    // $ANTLR end "rule__WallRule__Group__0"


    // $ANTLR start "rule__WallRule__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:880:1: rule__WallRule__Group__0__Impl : ( 'Wall' ) ;
    public final void rule__WallRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:884:1: ( ( 'Wall' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:885:1: ( 'Wall' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:885:1: ( 'Wall' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:886:1: 'Wall'
            {
             before(grammarAccess.getWallRuleAccess().getWallKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__WallRule__Group__0__Impl1739); 
             after(grammarAccess.getWallRuleAccess().getWallKeyword_0()); 

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
    // $ANTLR end "rule__WallRule__Group__0__Impl"


    // $ANTLR start "rule__WallRule__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:899:1: rule__WallRule__Group__1 : rule__WallRule__Group__1__Impl rule__WallRule__Group__2 ;
    public final void rule__WallRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:903:1: ( rule__WallRule__Group__1__Impl rule__WallRule__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:904:2: rule__WallRule__Group__1__Impl rule__WallRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11770);
            rule__WallRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11773);
            rule__WallRule__Group__2();

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
    // $ANTLR end "rule__WallRule__Group__1"


    // $ANTLR start "rule__WallRule__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:911:1: rule__WallRule__Group__1__Impl : ( ( rule__WallRule__NameAssignment_1 ) ) ;
    public final void rule__WallRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:915:1: ( ( ( rule__WallRule__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:916:1: ( ( rule__WallRule__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:916:1: ( ( rule__WallRule__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:917:1: ( rule__WallRule__NameAssignment_1 )
            {
             before(grammarAccess.getWallRuleAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:918:1: ( rule__WallRule__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:918:2: rule__WallRule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1800);
            rule__WallRule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WallRule__Group__1__Impl"


    // $ANTLR start "rule__WallRule__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:928:1: rule__WallRule__Group__2 : rule__WallRule__Group__2__Impl rule__WallRule__Group__3 ;
    public final void rule__WallRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:932:1: ( rule__WallRule__Group__2__Impl rule__WallRule__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:933:2: rule__WallRule__Group__2__Impl rule__WallRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21830);
            rule__WallRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21833);
            rule__WallRule__Group__3();

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
    // $ANTLR end "rule__WallRule__Group__2"


    // $ANTLR start "rule__WallRule__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:940:1: rule__WallRule__Group__2__Impl : ( ( rule__WallRule__Group_2__0 )? ) ;
    public final void rule__WallRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:944:1: ( ( ( rule__WallRule__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:945:1: ( ( rule__WallRule__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:945:1: ( ( rule__WallRule__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:946:1: ( rule__WallRule__Group_2__0 )?
            {
             before(grammarAccess.getWallRuleAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:947:1: ( rule__WallRule__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:947:2: rule__WallRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__0_in_rule__WallRule__Group__2__Impl1860);
                    rule__WallRule__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallRuleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__WallRule__Group__2__Impl"


    // $ANTLR start "rule__WallRule__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:957:1: rule__WallRule__Group__3 : rule__WallRule__Group__3__Impl rule__WallRule__Group__4 ;
    public final void rule__WallRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:961:1: ( rule__WallRule__Group__3__Impl rule__WallRule__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:962:2: rule__WallRule__Group__3__Impl rule__WallRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31891);
            rule__WallRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31894);
            rule__WallRule__Group__4();

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
    // $ANTLR end "rule__WallRule__Group__3"


    // $ANTLR start "rule__WallRule__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:969:1: rule__WallRule__Group__3__Impl : ( ( rule__WallRule__Group_3__0 )? ) ;
    public final void rule__WallRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:973:1: ( ( ( rule__WallRule__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:974:1: ( ( rule__WallRule__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:974:1: ( ( rule__WallRule__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:975:1: ( rule__WallRule__Group_3__0 )?
            {
             before(grammarAccess.getWallRuleAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: ( rule__WallRule__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:2: rule__WallRule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__0_in_rule__WallRule__Group__3__Impl1921);
                    rule__WallRule__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallRuleAccess().getGroup_3()); 

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
    // $ANTLR end "rule__WallRule__Group__3__Impl"


    // $ANTLR start "rule__WallRule__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:986:1: rule__WallRule__Group__4 : rule__WallRule__Group__4__Impl rule__WallRule__Group__5 ;
    public final void rule__WallRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:990:1: ( rule__WallRule__Group__4__Impl rule__WallRule__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:991:2: rule__WallRule__Group__4__Impl rule__WallRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41952);
            rule__WallRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41955);
            rule__WallRule__Group__5();

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
    // $ANTLR end "rule__WallRule__Group__4"


    // $ANTLR start "rule__WallRule__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:998:1: rule__WallRule__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__WallRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1002:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1003:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1003:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1004:1: 'Placement'
            {
             before(grammarAccess.getWallRuleAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WallRule__Group__4__Impl1983); 
             after(grammarAccess.getWallRuleAccess().getPlacementKeyword_4()); 

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
    // $ANTLR end "rule__WallRule__Group__4__Impl"


    // $ANTLR start "rule__WallRule__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1017:1: rule__WallRule__Group__5 : rule__WallRule__Group__5__Impl ;
    public final void rule__WallRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1021:1: ( rule__WallRule__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1022:2: rule__WallRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__52014);
            rule__WallRule__Group__5__Impl();

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
    // $ANTLR end "rule__WallRule__Group__5"


    // $ANTLR start "rule__WallRule__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1028:1: rule__WallRule__Group__5__Impl : ( ( rule__WallRule__PlacementAssignment_5 ) ) ;
    public final void rule__WallRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1032:1: ( ( ( rule__WallRule__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1033:1: ( ( rule__WallRule__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1033:1: ( ( rule__WallRule__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1034:1: ( rule__WallRule__PlacementAssignment_5 )
            {
             before(grammarAccess.getWallRuleAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1035:1: ( rule__WallRule__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1035:2: rule__WallRule__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__PlacementAssignment_5_in_rule__WallRule__Group__5__Impl2041);
            rule__WallRule__PlacementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getPlacementAssignment_5()); 

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
    // $ANTLR end "rule__WallRule__Group__5__Impl"


    // $ANTLR start "rule__WallRule__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1057:1: rule__WallRule__Group_2__0 : rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1 ;
    public final void rule__WallRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1061:1: ( rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1062:2: rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__0__Impl_in_rule__WallRule__Group_2__02083);
            rule__WallRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__1_in_rule__WallRule__Group_2__02086);
            rule__WallRule__Group_2__1();

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
    // $ANTLR end "rule__WallRule__Group_2__0"


    // $ANTLR start "rule__WallRule__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1069:1: rule__WallRule__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__WallRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1073:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1074:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1074:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1075:1: 'Name'
            {
             before(grammarAccess.getWallRuleAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WallRule__Group_2__0__Impl2114); 
             after(grammarAccess.getWallRuleAccess().getNameKeyword_2_0()); 

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
    // $ANTLR end "rule__WallRule__Group_2__0__Impl"


    // $ANTLR start "rule__WallRule__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1088:1: rule__WallRule__Group_2__1 : rule__WallRule__Group_2__1__Impl ;
    public final void rule__WallRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1092:1: ( rule__WallRule__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1093:2: rule__WallRule__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__1__Impl_in_rule__WallRule__Group_2__12145);
            rule__WallRule__Group_2__1__Impl();

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
    // $ANTLR end "rule__WallRule__Group_2__1"


    // $ANTLR start "rule__WallRule__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1099:1: rule__WallRule__Group_2__1__Impl : ( ( rule__WallRule__ElementNameAssignment_2_1 ) ) ;
    public final void rule__WallRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1103:1: ( ( ( rule__WallRule__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1104:1: ( ( rule__WallRule__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1104:1: ( ( rule__WallRule__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1105:1: ( rule__WallRule__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getWallRuleAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1106:1: ( rule__WallRule__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1106:2: rule__WallRule__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__ElementNameAssignment_2_1_in_rule__WallRule__Group_2__1__Impl2172);
            rule__WallRule__ElementNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getElementNameAssignment_2_1()); 

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
    // $ANTLR end "rule__WallRule__Group_2__1__Impl"


    // $ANTLR start "rule__WallRule__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1120:1: rule__WallRule__Group_3__0 : rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1 ;
    public final void rule__WallRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1124:1: ( rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1125:2: rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__0__Impl_in_rule__WallRule__Group_3__02206);
            rule__WallRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__1_in_rule__WallRule__Group_3__02209);
            rule__WallRule__Group_3__1();

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
    // $ANTLR end "rule__WallRule__Group_3__0"


    // $ANTLR start "rule__WallRule__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1132:1: rule__WallRule__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__WallRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1136:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1137:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1137:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1138:1: 'Description'
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WallRule__Group_3__0__Impl2237); 
             after(grammarAccess.getWallRuleAccess().getDescriptionKeyword_3_0()); 

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
    // $ANTLR end "rule__WallRule__Group_3__0__Impl"


    // $ANTLR start "rule__WallRule__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1151:1: rule__WallRule__Group_3__1 : rule__WallRule__Group_3__1__Impl ;
    public final void rule__WallRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1155:1: ( rule__WallRule__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1156:2: rule__WallRule__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__1__Impl_in_rule__WallRule__Group_3__12268);
            rule__WallRule__Group_3__1__Impl();

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
    // $ANTLR end "rule__WallRule__Group_3__1"


    // $ANTLR start "rule__WallRule__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1162:1: rule__WallRule__Group_3__1__Impl : ( ( rule__WallRule__DescriptionAssignment_3_1 ) ) ;
    public final void rule__WallRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1166:1: ( ( ( rule__WallRule__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1167:1: ( ( rule__WallRule__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1167:1: ( ( rule__WallRule__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1168:1: ( rule__WallRule__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1169:1: ( rule__WallRule__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1169:2: rule__WallRule__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__DescriptionAssignment_3_1_in_rule__WallRule__Group_3__1__Impl2295);
            rule__WallRule__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getDescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__WallRule__Group_3__1__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1183:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1187:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1188:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02329);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02332);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1195:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1199:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1200:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1200:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1201:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group__0__Impl2360); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1214:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1218:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1219:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12391);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12394);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1226:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1230:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1231:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1231:1: ( ( rule__Opening__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1232:1: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1233:1: ( rule__Opening__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1233:2: rule__Opening__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2421);
            rule__Opening__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getNameAssignment_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1243:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1247:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1248:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22451);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22454);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1255:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1259:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1260:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1260:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1261:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1262:1: ( rule__Opening__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1262:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2481);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1272:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1276:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1277:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32512);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32515);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1284:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1288:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1289:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1289:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1290:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:1: ( rule__Opening__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2542);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1301:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1305:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1306:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42573);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42576);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1313:1: rule__Opening__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1317:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1318:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1318:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1319:1: 'Placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Opening__Group__4__Impl2604); 
             after(grammarAccess.getOpeningAccess().getPlacementKeyword_4()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1332:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1336:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1337:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52635);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52638);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:1: rule__Opening__Group__5__Impl : ( ( rule__Opening__PlacementAssignment_5 ) ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1348:1: ( ( ( rule__Opening__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1349:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1349:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1350:1: ( rule__Opening__PlacementAssignment_5 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1351:1: ( rule__Opening__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1351:2: rule__Opening__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2665);
            rule__Opening__PlacementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getPlacementAssignment_5()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1361:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1365:1: ( rule__Opening__Group__6__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1366:2: rule__Opening__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62695);
            rule__Opening__Group__6__Impl();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1372:1: rule__Opening__Group__6__Impl : ( ( rule__Opening__Group_6__0 )? ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1376:1: ( ( ( rule__Opening__Group_6__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:1: ( ( rule__Opening__Group_6__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:1: ( ( rule__Opening__Group_6__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1378:1: ( rule__Opening__Group_6__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1379:1: ( rule__Opening__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1379:2: rule__Opening__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__0_in_rule__Opening__Group__6__Impl2722);
                    rule__Opening__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpeningAccess().getGroup_6()); 

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


    // $ANTLR start "rule__Opening__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1403:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1407:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1408:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02767);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02770);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1415:1: rule__Opening__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1419:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1420:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1420:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1421:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_2__0__Impl2798); 
             after(grammarAccess.getOpeningAccess().getNameKeyword_2_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1434:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1438:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1439:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12829);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1445:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__ElementNameAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:1: ( ( ( rule__Opening__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1450:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1450:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1451:1: ( rule__Opening__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1452:1: ( rule__Opening__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1452:2: rule__Opening__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2856);
            rule__Opening__ElementNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getElementNameAssignment_2_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1466:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1470:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1471:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02890);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02893);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1478:1: rule__Opening__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1482:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1483:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1483:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1484:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group_3__0__Impl2921); 
             after(grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1497:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1501:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1502:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12952);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1508:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1512:1: ( ( ( rule__Opening__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1513:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1513:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1514:1: ( rule__Opening__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1515:1: ( rule__Opening__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1515:2: rule__Opening__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2979);
            rule__Opening__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getDescriptionAssignment_3_1()); 

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


    // $ANTLR start "rule__Opening__Group_6__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1529:1: rule__Opening__Group_6__0 : rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1 ;
    public final void rule__Opening__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1533:1: ( rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1534:2: rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__0__Impl_in_rule__Opening__Group_6__03013);
            rule__Opening__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__1_in_rule__Opening__Group_6__03016);
            rule__Opening__Group_6__1();

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
    // $ANTLR end "rule__Opening__Group_6__0"


    // $ANTLR start "rule__Opening__Group_6__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1541:1: rule__Opening__Group_6__0__Impl : ( 'Walls' ) ;
    public final void rule__Opening__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1545:1: ( ( 'Walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1546:1: ( 'Walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1546:1: ( 'Walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1547:1: 'Walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_6_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Opening__Group_6__0__Impl3044); 
             after(grammarAccess.getOpeningAccess().getWallsKeyword_6_0()); 

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
    // $ANTLR end "rule__Opening__Group_6__0__Impl"


    // $ANTLR start "rule__Opening__Group_6__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1560:1: rule__Opening__Group_6__1 : rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2 ;
    public final void rule__Opening__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1564:1: ( rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1565:2: rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__1__Impl_in_rule__Opening__Group_6__13075);
            rule__Opening__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__2_in_rule__Opening__Group_6__13078);
            rule__Opening__Group_6__2();

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
    // $ANTLR end "rule__Opening__Group_6__1"


    // $ANTLR start "rule__Opening__Group_6__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1572:1: rule__Opening__Group_6__1__Impl : ( ( rule__Opening__WallsAssignment_6_1 ) ) ;
    public final void rule__Opening__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1576:1: ( ( ( rule__Opening__WallsAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1577:1: ( ( rule__Opening__WallsAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1577:1: ( ( rule__Opening__WallsAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1578:1: ( rule__Opening__WallsAssignment_6_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1579:1: ( rule__Opening__WallsAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1579:2: rule__Opening__WallsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_6_1_in_rule__Opening__Group_6__1__Impl3105);
            rule__Opening__WallsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_6_1()); 

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
    // $ANTLR end "rule__Opening__Group_6__1__Impl"


    // $ANTLR start "rule__Opening__Group_6__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1589:1: rule__Opening__Group_6__2 : rule__Opening__Group_6__2__Impl ;
    public final void rule__Opening__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1593:1: ( rule__Opening__Group_6__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1594:2: rule__Opening__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__2__Impl_in_rule__Opening__Group_6__23135);
            rule__Opening__Group_6__2__Impl();

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
    // $ANTLR end "rule__Opening__Group_6__2"


    // $ANTLR start "rule__Opening__Group_6__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1600:1: rule__Opening__Group_6__2__Impl : ( ( rule__Opening__Group_6_2__0 )* ) ;
    public final void rule__Opening__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1604:1: ( ( ( rule__Opening__Group_6_2__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1605:1: ( ( rule__Opening__Group_6_2__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1605:1: ( ( rule__Opening__Group_6_2__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1606:1: ( rule__Opening__Group_6_2__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_6_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1607:1: ( rule__Opening__Group_6_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1607:2: rule__Opening__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__0_in_rule__Opening__Group_6__2__Impl3162);
            	    rule__Opening__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__Opening__Group_6__2__Impl"


    // $ANTLR start "rule__Opening__Group_6_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1623:1: rule__Opening__Group_6_2__0 : rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1 ;
    public final void rule__Opening__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1627:1: ( rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1628:2: rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__0__Impl_in_rule__Opening__Group_6_2__03199);
            rule__Opening__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__1_in_rule__Opening__Group_6_2__03202);
            rule__Opening__Group_6_2__1();

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
    // $ANTLR end "rule__Opening__Group_6_2__0"


    // $ANTLR start "rule__Opening__Group_6_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1635:1: rule__Opening__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1639:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1640:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1640:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1641:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_6_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Opening__Group_6_2__0__Impl3230); 
             after(grammarAccess.getOpeningAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__Opening__Group_6_2__0__Impl"


    // $ANTLR start "rule__Opening__Group_6_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1654:1: rule__Opening__Group_6_2__1 : rule__Opening__Group_6_2__1__Impl ;
    public final void rule__Opening__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1658:1: ( rule__Opening__Group_6_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1659:2: rule__Opening__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__1__Impl_in_rule__Opening__Group_6_2__13261);
            rule__Opening__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_6_2__1"


    // $ANTLR start "rule__Opening__Group_6_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1665:1: rule__Opening__Group_6_2__1__Impl : ( ( rule__Opening__WallsAssignment_6_2_1 ) ) ;
    public final void rule__Opening__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1669:1: ( ( ( rule__Opening__WallsAssignment_6_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1670:1: ( ( rule__Opening__WallsAssignment_6_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1670:1: ( ( rule__Opening__WallsAssignment_6_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1671:1: ( rule__Opening__WallsAssignment_6_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_6_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1672:1: ( rule__Opening__WallsAssignment_6_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1672:2: rule__Opening__WallsAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_6_2_1_in_rule__Opening__Group_6_2__1__Impl3288);
            rule__Opening__WallsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_6_2_1()); 

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
    // $ANTLR end "rule__Opening__Group_6_2__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1686:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1690:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1691:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03322);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03325);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1698:1: rule__FlowSegment__Group__0__Impl : ( 'Pipe' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1702:1: ( ( 'Pipe' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1703:1: ( 'Pipe' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1703:1: ( 'Pipe' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1704:1: 'Pipe'
            {
             before(grammarAccess.getFlowSegmentAccess().getPipeKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FlowSegment__Group__0__Impl3353); 
             after(grammarAccess.getFlowSegmentAccess().getPipeKeyword_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1717:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1721:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1722:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13384);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13387);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1729:1: rule__FlowSegment__Group__1__Impl : ( ( rule__FlowSegment__NameAssignment_1 ) ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1733:1: ( ( ( rule__FlowSegment__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1734:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1734:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1735:1: ( rule__FlowSegment__NameAssignment_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1736:1: ( rule__FlowSegment__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1736:2: rule__FlowSegment__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3414);
            rule__FlowSegment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getNameAssignment_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1746:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1750:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1751:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23444);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23447);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1758:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1762:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1763:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1763:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1764:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1765:1: ( rule__FlowSegment__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1765:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3474);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1775:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1779:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1780:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33505);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33508);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1787:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1791:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1792:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1792:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1793:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1794:1: ( rule__FlowSegment__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1794:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3535);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1804:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1808:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1809:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43566);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43569);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1816:1: rule__FlowSegment__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1820:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1821:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1821:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1822:1: 'Placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FlowSegment__Group__4__Impl3597); 
             after(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1835:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1839:1: ( rule__FlowSegment__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1840:2: rule__FlowSegment__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53628);
            rule__FlowSegment__Group__5__Impl();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1846:1: rule__FlowSegment__Group__5__Impl : ( ( rule__FlowSegment__PlacementAssignment_5 ) ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1850:1: ( ( ( rule__FlowSegment__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1851:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1851:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1852:1: ( rule__FlowSegment__PlacementAssignment_5 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1853:1: ( rule__FlowSegment__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1853:2: rule__FlowSegment__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3655);
            rule__FlowSegment__PlacementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_5()); 

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


    // $ANTLR start "rule__FlowSegment__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1875:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1879:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1880:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03697);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03700);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1887:1: rule__FlowSegment__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1891:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1892:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1892:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1893:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl3728); 
             after(grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1906:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1910:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1911:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13759);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1917:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1921:1: ( ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1922:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1922:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1923:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1924:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1924:2: rule__FlowSegment__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3786);
            rule__FlowSegment__ElementNameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getElementNameAssignment_2_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1938:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1942:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1943:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03820);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03823);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1950:1: rule__FlowSegment__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1954:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1955:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1955:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1956:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl3851); 
             after(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1969:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1973:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1974:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13882);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1980:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1984:1: ( ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1985:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1985:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1986:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1987:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1987:2: rule__FlowSegment__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3909);
            rule__FlowSegment__DescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_3_1()); 

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


    // $ANTLR start "rule__LocalPlacement__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2001:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2005:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2006:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03943);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03946);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2013:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2017:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2018:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2018:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2019:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2020:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2022:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2032:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2036:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2037:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__14004);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__14007);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2044:1: rule__LocalPlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2048:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2049:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2049:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2050:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__LocalPlacement__Group__1__Impl4035); 
             after(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2063:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2067:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2068:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__24066);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__24069);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2075:1: rule__LocalPlacement__Group__2__Impl : ( ( rule__LocalPlacement__Group_2__0 )? ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2079:1: ( ( ( rule__LocalPlacement__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2080:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2080:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2081:1: ( rule__LocalPlacement__Group_2__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2082:1: ( rule__LocalPlacement__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2082:2: rule__LocalPlacement__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl4096);
                    rule__LocalPlacement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_2()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2092:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2096:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2097:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__34127);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__34130);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2104:1: rule__LocalPlacement__Group__3__Impl : ( 'Axis2Placement3d' ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2108:1: ( ( 'Axis2Placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2109:1: ( 'Axis2Placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2109:1: ( 'Axis2Placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2110:1: 'Axis2Placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2Placement3dKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__LocalPlacement__Group__3__Impl4158); 
             after(grammarAccess.getLocalPlacementAccess().getAxis2Placement3dKeyword_3()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2123:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2127:1: ( rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2128:2: rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44189);
            rule__LocalPlacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__44192);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2135:1: rule__LocalPlacement__Group__4__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2139:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2140:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2140:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2141:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2142:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2142:2: rule__LocalPlacement__Axis2placement3dAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_in_rule__LocalPlacement__Group__4__Impl4219);
            rule__LocalPlacement__Axis2placement3dAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_4()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2152:1: rule__LocalPlacement__Group__5 : rule__LocalPlacement__Group__5__Impl ;
    public final void rule__LocalPlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2156:1: ( rule__LocalPlacement__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2157:2: rule__LocalPlacement__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__54249);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2163:1: rule__LocalPlacement__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2167:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2168:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2168:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2169:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LocalPlacement__Group__5__Impl4277); 
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


    // $ANTLR start "rule__LocalPlacement__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2194:1: rule__LocalPlacement__Group_2__0 : rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 ;
    public final void rule__LocalPlacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2198:1: ( rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2199:2: rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04320);
            rule__LocalPlacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04323);
            rule__LocalPlacement__Group_2__1();

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
    // $ANTLR end "rule__LocalPlacement__Group_2__0"


    // $ANTLR start "rule__LocalPlacement__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2206:1: rule__LocalPlacement__Group_2__0__Impl : ( 'RelativeTo' ) ;
    public final void rule__LocalPlacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2210:1: ( ( 'RelativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2211:1: ( 'RelativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2211:1: ( 'RelativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2212:1: 'RelativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4351); 
             after(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_2__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2225:1: rule__LocalPlacement__Group_2__1 : rule__LocalPlacement__Group_2__1__Impl ;
    public final void rule__LocalPlacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2229:1: ( rule__LocalPlacement__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2230:2: rule__LocalPlacement__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14382);
            rule__LocalPlacement__Group_2__1__Impl();

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
    // $ANTLR end "rule__LocalPlacement__Group_2__1"


    // $ANTLR start "rule__LocalPlacement__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2236:1: rule__LocalPlacement__Group_2__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) ;
    public final void rule__LocalPlacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2240:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2241:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2241:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2242:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2243:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2243:2: rule__LocalPlacement__RelativeToAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4409);
            rule__LocalPlacement__RelativeToAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_2_1()); 

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
    // $ANTLR end "rule__LocalPlacement__Group_2__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2257:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2261:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2262:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04443);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04446);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2269:1: rule__Axis2Placement3D__Group__0__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2273:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2274:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2274:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2275:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Axis2Placement3D__Group__0__Impl4474); 
             after(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2288:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2292:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2293:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14505);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14508);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2300:1: rule__Axis2Placement3D__Group__1__Impl : ( 'Cartesian' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2304:1: ( ( 'Cartesian' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2305:1: ( 'Cartesian' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2305:1: ( 'Cartesian' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2306:1: 'Cartesian'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Axis2Placement3D__Group__1__Impl4536); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2319:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2323:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2324:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24567);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24570);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2331:1: rule__Axis2Placement3D__Group__2__Impl : ( '(' ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2335:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2336:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2336:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2337:1: '('
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Axis2Placement3D__Group__2__Impl4598); 
             after(grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2350:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2354:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2355:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34629);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34632);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2362:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2366:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2367:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2367:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2368:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:2: rule__Axis2Placement3D__CartesianXAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4659);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2379:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2383:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2384:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44689);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44692);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2391:1: rule__Axis2Placement3D__Group__4__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2395:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2396:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2396:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2397:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Axis2Placement3D__Group__4__Impl4720); 
             after(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2410:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2414:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2415:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54751);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54754);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2422:1: rule__Axis2Placement3D__Group__5__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2426:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2427:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2427:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2428:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:2: rule__Axis2Placement3D__CartesianYAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4781);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2439:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2443:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2444:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64811);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64814);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2451:1: rule__Axis2Placement3D__Group__6__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2455:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2456:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2456:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2457:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Axis2Placement3D__Group__6__Impl4842); 
             after(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2470:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2474:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2475:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74873);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74876);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2482:1: rule__Axis2Placement3D__Group__7__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2486:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2488:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2489:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2489:2: rule__Axis2Placement3D__CartesianZAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4903);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2499:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2503:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2504:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84933);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84936);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2511:1: rule__Axis2Placement3D__Group__8__Impl : ( ')' ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2515:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2516:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2516:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2517:1: ')'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Axis2Placement3D__Group__8__Impl4964); 
             after(grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2530:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2534:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2535:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94995);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94998);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2542:1: rule__Axis2Placement3D__Group__9__Impl : ( 'Axis' ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2546:1: ( ( 'Axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2547:1: ( 'Axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2547:1: ( 'Axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2548:1: 'Axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Axis2Placement3D__Group__9__Impl5026); 
             after(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2561:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2565:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2566:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__105057);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__105060);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2573:1: rule__Axis2Placement3D__Group__10__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2577:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2578:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2578:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2579:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_10()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2580:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2580:2: rule__Axis2Placement3D__AxisAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl5087);
            rule__Axis2Placement3D__AxisAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_10()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2590:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2594:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2595:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__115117);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115120);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2602:1: rule__Axis2Placement3D__Group__11__Impl : ( 'RefDirection' ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2606:1: ( ( 'RefDirection' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2607:1: ( 'RefDirection' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2607:1: ( 'RefDirection' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2608:1: 'RefDirection'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_11()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Axis2Placement3D__Group__11__Impl5148); 
             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_11()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2621:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2625:1: ( rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2626:2: rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125179);
            rule__Axis2Placement3D__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125182);
            rule__Axis2Placement3D__Group__13();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2633:1: rule__Axis2Placement3D__Group__12__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2637:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2638:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2638:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2639:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_12()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2640:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2640:2: rule__Axis2Placement3D__RefDirectionAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5209);
            rule__Axis2Placement3D__RefDirectionAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_12()); 

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


    // $ANTLR start "rule__Axis2Placement3D__Group__13"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2650:1: rule__Axis2Placement3D__Group__13 : rule__Axis2Placement3D__Group__13__Impl ;
    public final void rule__Axis2Placement3D__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2654:1: ( rule__Axis2Placement3D__Group__13__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2655:2: rule__Axis2Placement3D__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135239);
            rule__Axis2Placement3D__Group__13__Impl();

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
    // $ANTLR end "rule__Axis2Placement3D__Group__13"


    // $ANTLR start "rule__Axis2Placement3D__Group__13__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2661:1: rule__Axis2Placement3D__Group__13__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2665:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2666:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2666:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2667:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5267); 
             after(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__Axis2Placement3D__Group__13__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2708:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2712:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2713:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05326);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05329);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2720:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2724:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2725:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2725:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2726:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2727:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2728:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group__0__Impl5358); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2739:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2743:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2744:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15391);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15394);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2751:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2755:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2756:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2756:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2757:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2758:1: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2758:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5422); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2768:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2772:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2773:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25453);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25456);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2780:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2784:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2785:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2785:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2786:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group__2__Impl5484); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2799:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2803:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2804:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35515);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35518);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2811:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2815:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2816:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2816:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2817:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5545); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2828:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2832:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2833:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45574);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2839:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2843:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2844:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2844:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2845:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2846:1: ( rule__EDouble__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=11 && LA17_0<=12)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2846:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5601);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2866:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2870:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2871:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05642);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05645);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2878:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2882:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2883:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2883:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2884:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2885:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2885:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5672);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2895:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2899:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2900:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15702);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15705);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2907:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2911:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2912:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2912:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2913:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2914:1: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2915:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group_4__1__Impl5734); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2926:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2930:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2931:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25767);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2937:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2941:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2942:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2942:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2943:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5794); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2960:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2964:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2965:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05829);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05832);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2972:1: rule__Direction__Group__0__Impl : ( '(' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2976:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2978:1: '('
            {
             before(grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Direction__Group__0__Impl5860); 
             after(grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2991:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2995:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2996:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15891);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15894);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:1: rule__Direction__Group__1__Impl : ( ( rule__Direction__XAssignment_1 ) ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3007:1: ( ( ( rule__Direction__XAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3008:1: ( ( rule__Direction__XAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3008:1: ( ( rule__Direction__XAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3009:1: ( rule__Direction__XAssignment_1 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:1: ( rule__Direction__XAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:2: rule__Direction__XAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5921);
            rule__Direction__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getXAssignment_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3020:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3024:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3025:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25951);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25954);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3032:1: rule__Direction__Group__2__Impl : ( ',' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3036:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3037:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3037:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3038:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Direction__Group__2__Impl5982); 
             after(grammarAccess.getDirectionAccess().getCommaKeyword_2()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3051:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3055:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3056:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__36013);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__36016);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3063:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__YAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3067:1: ( ( ( rule__Direction__YAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3068:1: ( ( rule__Direction__YAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3068:1: ( ( rule__Direction__YAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3069:1: ( rule__Direction__YAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3070:1: ( rule__Direction__YAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3070:2: rule__Direction__YAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl6043);
            rule__Direction__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getYAssignment_3()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3080:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3084:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3085:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__46073);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__46076);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3092:1: rule__Direction__Group__4__Impl : ( ( rule__Direction__Group_4__0 )? ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3096:1: ( ( ( rule__Direction__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3097:1: ( ( rule__Direction__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3097:1: ( ( rule__Direction__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3098:1: ( rule__Direction__Group_4__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3099:1: ( rule__Direction__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3099:2: rule__Direction__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl6103);
                    rule__Direction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectionAccess().getGroup_4()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3109:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3113:1: ( rule__Direction__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3114:2: rule__Direction__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56134);
            rule__Direction__Group__5__Impl();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3120:1: rule__Direction__Group__5__Impl : ( ')' ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3124:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3125:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3125:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3126:1: ')'
            {
             before(grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Direction__Group__5__Impl6162); 
             after(grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5()); 

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


    // $ANTLR start "rule__Direction__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3151:1: rule__Direction__Group_4__0 : rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 ;
    public final void rule__Direction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3155:1: ( rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3156:2: rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06205);
            rule__Direction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06208);
            rule__Direction__Group_4__1();

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
    // $ANTLR end "rule__Direction__Group_4__0"


    // $ANTLR start "rule__Direction__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3163:1: rule__Direction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Direction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3167:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3168:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3168:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3169:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Direction__Group_4__0__Impl6236); 
             after(grammarAccess.getDirectionAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__Direction__Group_4__0__Impl"


    // $ANTLR start "rule__Direction__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3182:1: rule__Direction__Group_4__1 : rule__Direction__Group_4__1__Impl ;
    public final void rule__Direction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3186:1: ( rule__Direction__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3187:2: rule__Direction__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16267);
            rule__Direction__Group_4__1__Impl();

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
    // $ANTLR end "rule__Direction__Group_4__1"


    // $ANTLR start "rule__Direction__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3193:1: rule__Direction__Group_4__1__Impl : ( ( rule__Direction__ZAssignment_4_1 ) ) ;
    public final void rule__Direction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3197:1: ( ( ( rule__Direction__ZAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3199:1: ( rule__Direction__ZAssignment_4_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3200:1: ( rule__Direction__ZAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3200:2: rule__Direction__ZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6294);
            rule__Direction__ZAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getZAssignment_4_1()); 

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
    // $ANTLR end "rule__Direction__Group_4__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment_2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3215:1: rule__Model__ElementsAssignment_2 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3219:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3220:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3220:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3221:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26333);
            ruleWallRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_2"


    // $ANTLR start "rule__Model__ElementsAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3230:1: rule__Model__ElementsAssignment_3_1 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3234:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3236:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16364);
            ruleWallRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_3_1"


    // $ANTLR start "rule__Model__ElementsAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3245:1: rule__Model__ElementsAssignment_5 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3249:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3250:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3250:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3251:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56395);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_5"


    // $ANTLR start "rule__Model__ElementsAssignment_6_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3260:1: rule__Model__ElementsAssignment_6_1 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3264:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3266:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16426);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_6_1"


    // $ANTLR start "rule__Model__ElementsAssignment_8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3275:1: rule__Model__ElementsAssignment_8 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3279:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3280:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3280:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3281:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86457);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_8"


    // $ANTLR start "rule__Model__ElementsAssignment_9_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3290:1: rule__Model__ElementsAssignment_9_1 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3294:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3296:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16488);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment_9_1"


    // $ANTLR start "rule__WallRule__NameAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3305:1: rule__WallRule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WallRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3309:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:1: ( RULE_ID )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3311:1: RULE_ID
            {
             before(grammarAccess.getWallRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__WallRule__NameAssignment_16519); 
             after(grammarAccess.getWallRuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WallRule__NameAssignment_1"


    // $ANTLR start "rule__WallRule__ElementNameAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3320:1: rule__WallRule__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__WallRule__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3324:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3326:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_2_16550);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__WallRule__ElementNameAssignment_2_1"


    // $ANTLR start "rule__WallRule__DescriptionAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3335:1: rule__WallRule__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__WallRule__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3339:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3340:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3340:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3341:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_3_16581);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__WallRule__DescriptionAssignment_3_1"


    // $ANTLR start "rule__WallRule__PlacementAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3350:1: rule__WallRule__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__WallRule__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3354:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3355:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3355:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3356:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_56612);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__WallRule__PlacementAssignment_5"


    // $ANTLR start "rule__Opening__NameAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3365:1: rule__Opening__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3369:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3370:1: ( RULE_ID )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3370:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3371:1: RULE_ID
            {
             before(grammarAccess.getOpeningAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Opening__NameAssignment_16643); 
             after(grammarAccess.getOpeningAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Opening__NameAssignment_1"


    // $ANTLR start "rule__Opening__ElementNameAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3380:1: rule__Opening__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3384:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3386:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16674);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Opening__ElementNameAssignment_2_1"


    // $ANTLR start "rule__Opening__DescriptionAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3395:1: rule__Opening__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3399:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3400:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3400:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3401:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16705);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Opening__DescriptionAssignment_3_1"


    // $ANTLR start "rule__Opening__PlacementAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3410:1: rule__Opening__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3414:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3415:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3415:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3416:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56736);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Opening__PlacementAssignment_5"


    // $ANTLR start "rule__Opening__WallsAssignment_6_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3425:1: rule__Opening__WallsAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Opening__WallsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3429:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3430:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3430:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3431:1: ( RULE_ID )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3432:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3433:1: RULE_ID
            {
             before(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_6_16771); 
             after(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Opening__WallsAssignment_6_1"


    // $ANTLR start "rule__Opening__WallsAssignment_6_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3444:1: rule__Opening__WallsAssignment_6_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Opening__WallsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3448:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3449:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3449:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3450:1: ( RULE_ID )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_2_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3451:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3452:1: RULE_ID
            {
             before(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_6_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_6_2_16810); 
             after(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_6_2_1_0_1()); 

            }

             after(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_2_1_0()); 

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
    // $ANTLR end "rule__Opening__WallsAssignment_6_2_1"


    // $ANTLR start "rule__FlowSegment__NameAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3463:1: rule__FlowSegment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FlowSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3467:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3468:1: ( RULE_ID )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3468:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3469:1: RULE_ID
            {
             before(grammarAccess.getFlowSegmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FlowSegment__NameAssignment_16845); 
             after(grammarAccess.getFlowSegmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__NameAssignment_1"


    // $ANTLR start "rule__FlowSegment__ElementNameAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3478:1: rule__FlowSegment__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3482:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3483:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3483:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3484:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16876);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__ElementNameAssignment_2_1"


    // $ANTLR start "rule__FlowSegment__DescriptionAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3493:1: rule__FlowSegment__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3497:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3498:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3498:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3499:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16907);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FlowSegment__DescriptionAssignment_3_1"


    // $ANTLR start "rule__FlowSegment__PlacementAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3508:1: rule__FlowSegment__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3512:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3513:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3513:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3514:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56938);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__FlowSegment__PlacementAssignment_5"


    // $ANTLR start "rule__LocalPlacement__RelativeToAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3523:1: rule__LocalPlacement__RelativeToAssignment_2_1 : ( ruleLocalPlacement ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3527:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3528:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3528:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3529:1: ruleLocalPlacement
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16969);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__LocalPlacement__RelativeToAssignment_2_1"


    // $ANTLR start "rule__LocalPlacement__Axis2placement3dAssignment_4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3538:1: rule__LocalPlacement__Axis2placement3dAssignment_4 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3542:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3543:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3543:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3544:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_47000);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__LocalPlacement__Axis2placement3dAssignment_4"


    // $ANTLR start "rule__Axis2Placement3D__CartesianXAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3553:1: rule__Axis2Placement3D__CartesianXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3557:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3558:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3558:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3559:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_37031);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3568:1: rule__Axis2Placement3D__CartesianYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3572:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3573:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3573:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3574:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_57062);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3583:1: rule__Axis2Placement3D__CartesianZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3587:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3588:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3588:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3589:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_77093);
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


    // $ANTLR start "rule__Axis2Placement3D__AxisAssignment_10"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3598:1: rule__Axis2Placement3D__AxisAssignment_10 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3602:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3603:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3603:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3604:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107124);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__AxisAssignment_10"


    // $ANTLR start "rule__Axis2Placement3D__RefDirectionAssignment_12"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3613:1: rule__Axis2Placement3D__RefDirectionAssignment_12 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3617:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3618:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3618:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3619:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127155);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 

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
    // $ANTLR end "rule__Axis2Placement3D__RefDirectionAssignment_12"


    // $ANTLR start "rule__Direction__XAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3628:1: rule__Direction__XAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3632:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3633:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3633:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3634:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17186);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Direction__XAssignment_1"


    // $ANTLR start "rule__Direction__YAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3643:1: rule__Direction__YAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3647:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3648:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3648:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3649:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37217);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Direction__YAssignment_3"


    // $ANTLR start "rule__Direction__ZAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3658:1: rule__Direction__ZAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3662:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3663:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3663:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3664:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17248);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Direction__ZAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_entryRuleWallRule181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRule188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0_in_ruleWallRule214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0_in_ruleOpening274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0_in_ruleDirection574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0712 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1773 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2835 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl865 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3895 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl925 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4956 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__4__Impl987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51018 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_5_in_rule__Model__Group__5__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61078 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1108 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71139 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__7__Impl1170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81201 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_8_in_rule__Model__Group__8__Impl1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl1288 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01339 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_3__0__Impl1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_1_in_rule__Model__Group_3__1__Impl1428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01462 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_6__0__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__11524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_6_1_in_rule__Model__Group_6__1__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01585 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_9__0__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01708 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__WallRule__Group__0__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11770 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21830 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__0_in_rule__WallRule__Group__2__Impl1860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31891 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__0_in_rule__WallRule__Group__3__Impl1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41952 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WallRule__Group__4__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__52014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__PlacementAssignment_5_in_rule__WallRule__Group__5__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__0__Impl_in_rule__WallRule__Group_2__02083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__1_in_rule__WallRule__Group_2__02086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WallRule__Group_2__0__Impl2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__1__Impl_in_rule__WallRule__Group_2__12145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__ElementNameAssignment_2_1_in_rule__WallRule__Group_2__1__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__0__Impl_in_rule__WallRule__Group_3__02206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__1_in_rule__WallRule__Group_3__02209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WallRule__Group_3__0__Impl2237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__1__Impl_in_rule__WallRule__Group_3__12268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__DescriptionAssignment_3_1_in_rule__WallRule__Group_3__1__Impl2295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02329 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group__0__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12391 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22451 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32512 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42573 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Opening__Group__4__Impl2604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52635 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__0_in_rule__Opening__Group__6__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02767 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_2__0__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02890 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group_3__0__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__0__Impl_in_rule__Opening__Group_6__03013 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__1_in_rule__Opening__Group_6__03016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Opening__Group_6__0__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__1__Impl_in_rule__Opening__Group_6__13075 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__2_in_rule__Opening__Group_6__13078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_6_1_in_rule__Opening__Group_6__1__Impl3105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__2__Impl_in_rule__Opening__Group_6__23135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__0_in_rule__Opening__Group_6__2__Impl3162 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__0__Impl_in_rule__Opening__Group_6_2__03199 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__1_in_rule__Opening__Group_6_2__03202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Opening__Group_6_2__0__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__1__Impl_in_rule__Opening__Group_6_2__13261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_6_2_1_in_rule__Opening__Group_6_2__1__Impl3288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03322 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FlowSegment__Group__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13384 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23444 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33505 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43566 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FlowSegment__Group__4__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03697 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03820 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl3851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03943 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__14004 = new BitSet(new long[]{0x000000000A000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__14007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__LocalPlacement__Group__1__Impl4035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__24066 = new BitSet(new long[]{0x000000000A000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__24069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__34127 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__34130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__LocalPlacement__Group__3__Impl4158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44189 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__44192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_in_rule__LocalPlacement__Group__4__Impl4219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__54249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LocalPlacement__Group__5__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04320 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04443 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Axis2Placement3D__Group__0__Impl4474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14505 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Axis2Placement3D__Group__1__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24567 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Axis2Placement3D__Group__2__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34629 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44689 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Axis2Placement3D__Group__4__Impl4720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54751 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64811 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Axis2Placement3D__Group__6__Impl4842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74873 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84933 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Axis2Placement3D__Group__8__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94995 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Axis2Placement3D__Group__9__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__105057 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__105060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__115117 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Axis2Placement3D__Group__11__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125179 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05326 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group__0__Impl5358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15391 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25453 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group__2__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35515 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05642 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15702 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group_4__1__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05829 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Direction__Group__0__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15891 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25951 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Direction__Group__2__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__36013 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__36016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__46073 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__46076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl6103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Direction__Group__5__Impl6162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06205 = new BitSet(new long[]{0x0000000600000040L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Direction__Group_4__0__Impl6236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__WallRule__NameAssignment_16519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_2_16550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_3_16581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_56612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Opening__NameAssignment_16643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_6_16771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_6_2_16810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FlowSegment__NameAssignment_16845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_47000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_37031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_57062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_77093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17248 = new BitSet(new long[]{0x0000000000000002L});
    }


}