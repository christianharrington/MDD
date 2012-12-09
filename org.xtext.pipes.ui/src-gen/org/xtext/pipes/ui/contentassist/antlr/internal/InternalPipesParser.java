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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Walls'", "'Openings'", "'Pipes'", "'and'", "'Wall'", "'Name'", "'Description'", "'placement'", "'Opening'", "'walls'", "','", "'Pipe'", "'{'", "'}'", "'relativeTo'", "'axis2placement3d'", "'cartesian'", "'('", "')'", "'axis'", "'refDir'", "'-'", "'.'"
    };
    public static final int RULE_ID=5;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:312:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:316:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( RULE_STRING )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( RULE_STRING )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:318:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives610); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:323:6: ( RULE_ID )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:323:6: ( RULE_ID )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:324:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives627); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:940:1: rule__WallRule__Group__2__Impl : ( 'Name' ) ;
    public final void rule__WallRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:944:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:945:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:945:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:946:1: 'Name'
            {
             before(grammarAccess.getWallRuleAccess().getNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WallRule__Group__2__Impl1861); 
             after(grammarAccess.getWallRuleAccess().getNameKeyword_2()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:959:1: rule__WallRule__Group__3 : rule__WallRule__Group__3__Impl rule__WallRule__Group__4 ;
    public final void rule__WallRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:963:1: ( rule__WallRule__Group__3__Impl rule__WallRule__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:964:2: rule__WallRule__Group__3__Impl rule__WallRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31892);
            rule__WallRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31895);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:971:1: rule__WallRule__Group__3__Impl : ( ( rule__WallRule__ElementNameAssignment_3 ) ) ;
    public final void rule__WallRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:975:1: ( ( ( rule__WallRule__ElementNameAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: ( ( rule__WallRule__ElementNameAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: ( ( rule__WallRule__ElementNameAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:977:1: ( rule__WallRule__ElementNameAssignment_3 )
            {
             before(grammarAccess.getWallRuleAccess().getElementNameAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:978:1: ( rule__WallRule__ElementNameAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:978:2: rule__WallRule__ElementNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__ElementNameAssignment_3_in_rule__WallRule__Group__3__Impl1922);
            rule__WallRule__ElementNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getElementNameAssignment_3()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:988:1: rule__WallRule__Group__4 : rule__WallRule__Group__4__Impl rule__WallRule__Group__5 ;
    public final void rule__WallRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:992:1: ( rule__WallRule__Group__4__Impl rule__WallRule__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:993:2: rule__WallRule__Group__4__Impl rule__WallRule__Group__5
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1000:1: rule__WallRule__Group__4__Impl : ( 'Description' ) ;
    public final void rule__WallRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1004:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1005:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1005:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1006:1: 'Description'
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WallRule__Group__4__Impl1983); 
             after(grammarAccess.getWallRuleAccess().getDescriptionKeyword_4()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1019:1: rule__WallRule__Group__5 : rule__WallRule__Group__5__Impl rule__WallRule__Group__6 ;
    public final void rule__WallRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1023:1: ( rule__WallRule__Group__5__Impl rule__WallRule__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1024:2: rule__WallRule__Group__5__Impl rule__WallRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__52014);
            rule__WallRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__6_in_rule__WallRule__Group__52017);
            rule__WallRule__Group__6();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1031:1: rule__WallRule__Group__5__Impl : ( ( rule__WallRule__DescriptionAssignment_5 ) ) ;
    public final void rule__WallRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1035:1: ( ( ( rule__WallRule__DescriptionAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1036:1: ( ( rule__WallRule__DescriptionAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1036:1: ( ( rule__WallRule__DescriptionAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1037:1: ( rule__WallRule__DescriptionAssignment_5 )
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1038:1: ( rule__WallRule__DescriptionAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1038:2: rule__WallRule__DescriptionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__DescriptionAssignment_5_in_rule__WallRule__Group__5__Impl2044);
            rule__WallRule__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getDescriptionAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__WallRule__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1048:1: rule__WallRule__Group__6 : rule__WallRule__Group__6__Impl rule__WallRule__Group__7 ;
    public final void rule__WallRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1052:1: ( rule__WallRule__Group__6__Impl rule__WallRule__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1053:2: rule__WallRule__Group__6__Impl rule__WallRule__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__6__Impl_in_rule__WallRule__Group__62074);
            rule__WallRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__7_in_rule__WallRule__Group__62077);
            rule__WallRule__Group__7();

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
    // $ANTLR end "rule__WallRule__Group__6"


    // $ANTLR start "rule__WallRule__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1060:1: rule__WallRule__Group__6__Impl : ( 'placement' ) ;
    public final void rule__WallRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1064:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1065:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1065:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1066:1: 'placement'
            {
             before(grammarAccess.getWallRuleAccess().getPlacementKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WallRule__Group__6__Impl2105); 
             after(grammarAccess.getWallRuleAccess().getPlacementKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRule__Group__6__Impl"


    // $ANTLR start "rule__WallRule__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1079:1: rule__WallRule__Group__7 : rule__WallRule__Group__7__Impl ;
    public final void rule__WallRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1083:1: ( rule__WallRule__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1084:2: rule__WallRule__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__7__Impl_in_rule__WallRule__Group__72136);
            rule__WallRule__Group__7__Impl();

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
    // $ANTLR end "rule__WallRule__Group__7"


    // $ANTLR start "rule__WallRule__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1090:1: rule__WallRule__Group__7__Impl : ( ( rule__WallRule__PlacementAssignment_7 ) ) ;
    public final void rule__WallRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1094:1: ( ( ( rule__WallRule__PlacementAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1095:1: ( ( rule__WallRule__PlacementAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1095:1: ( ( rule__WallRule__PlacementAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1096:1: ( rule__WallRule__PlacementAssignment_7 )
            {
             before(grammarAccess.getWallRuleAccess().getPlacementAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1097:1: ( rule__WallRule__PlacementAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1097:2: rule__WallRule__PlacementAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__PlacementAssignment_7_in_rule__WallRule__Group__7__Impl2163);
            rule__WallRule__PlacementAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getWallRuleAccess().getPlacementAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRule__Group__7__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1123:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1127:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1128:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02209);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02212);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1135:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1139:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1140:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1140:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1141:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group__0__Impl2240); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1154:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1158:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1159:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12271);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12274);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1166:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1170:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1171:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1171:1: ( ( rule__Opening__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1172:1: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:1: ( rule__Opening__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:2: rule__Opening__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2301);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1183:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1187:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1188:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22331);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22334);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1195:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1199:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1200:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1200:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1201:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1202:1: ( rule__Opening__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1202:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2361);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1212:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1216:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1217:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32392);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32395);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1224:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1228:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1229:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1229:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1230:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1231:1: ( rule__Opening__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1231:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2422);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1241:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1245:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1246:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42453);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42456);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1253:1: rule__Opening__Group__4__Impl : ( 'placement' ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1257:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1258:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1258:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1259:1: 'placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group__4__Impl2484); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1272:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1276:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1277:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52515);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52518);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1284:1: rule__Opening__Group__5__Impl : ( ( rule__Opening__PlacementAssignment_5 ) ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1288:1: ( ( ( rule__Opening__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1289:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1289:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1290:1: ( rule__Opening__PlacementAssignment_5 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:1: ( rule__Opening__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:2: rule__Opening__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2545);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1301:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl rule__Opening__Group__7 ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1305:1: ( rule__Opening__Group__6__Impl rule__Opening__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1306:2: rule__Opening__Group__6__Impl rule__Opening__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62575);
            rule__Opening__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__62578);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1313:1: rule__Opening__Group__6__Impl : ( 'walls' ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1317:1: ( ( 'walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1318:1: ( 'walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1318:1: ( 'walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1319:1: 'walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Opening__Group__6__Impl2606); 
             after(grammarAccess.getOpeningAccess().getWallsKeyword_6()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1332:1: rule__Opening__Group__7 : rule__Opening__Group__7__Impl rule__Opening__Group__8 ;
    public final void rule__Opening__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1336:1: ( rule__Opening__Group__7__Impl rule__Opening__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1337:2: rule__Opening__Group__7__Impl rule__Opening__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__72637);
            rule__Opening__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__72640);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:1: rule__Opening__Group__7__Impl : ( ( rule__Opening__WallsAssignment_7 ) ) ;
    public final void rule__Opening__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1348:1: ( ( ( rule__Opening__WallsAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1349:1: ( ( rule__Opening__WallsAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1349:1: ( ( rule__Opening__WallsAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1350:1: ( rule__Opening__WallsAssignment_7 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1351:1: ( rule__Opening__WallsAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1351:2: rule__Opening__WallsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_in_rule__Opening__Group__7__Impl2667);
            rule__Opening__WallsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_7()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1361:1: rule__Opening__Group__8 : rule__Opening__Group__8__Impl ;
    public final void rule__Opening__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1365:1: ( rule__Opening__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1366:2: rule__Opening__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__82697);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1372:1: rule__Opening__Group__8__Impl : ( ( rule__Opening__Group_8__0 )* ) ;
    public final void rule__Opening__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1376:1: ( ( ( rule__Opening__Group_8__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:1: ( ( rule__Opening__Group_8__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:1: ( ( rule__Opening__Group_8__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1378:1: ( rule__Opening__Group_8__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1379:1: ( rule__Opening__Group_8__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1379:2: rule__Opening__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__0_in_rule__Opening__Group__8__Impl2724);
            	    rule__Opening__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getOpeningAccess().getGroup_8()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1407:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1411:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1412:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02773);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02776);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1419:1: rule__Opening__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1423:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1424:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1424:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1425:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Opening__Group_2__0__Impl2804); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1438:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1442:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1443:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12835);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__ElementNameAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1453:1: ( ( ( rule__Opening__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1454:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1454:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1455:1: ( rule__Opening__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1456:1: ( rule__Opening__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1456:2: rule__Opening__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2862);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1470:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1474:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1475:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02896);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02899);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1482:1: rule__Opening__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1486:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1487:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1487:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1488:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_3__0__Impl2927); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1501:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1505:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1506:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12958);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1512:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1516:1: ( ( ( rule__Opening__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1517:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1517:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1518:1: ( rule__Opening__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1519:1: ( rule__Opening__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1519:2: rule__Opening__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2985);
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


    // $ANTLR start "rule__Opening__Group_8__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1533:1: rule__Opening__Group_8__0 : rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1 ;
    public final void rule__Opening__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1537:1: ( rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1538:2: rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__0__Impl_in_rule__Opening__Group_8__03019);
            rule__Opening__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__1_in_rule__Opening__Group_8__03022);
            rule__Opening__Group_8__1();

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
    // $ANTLR end "rule__Opening__Group_8__0"


    // $ANTLR start "rule__Opening__Group_8__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1545:1: rule__Opening__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1549:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1550:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1550:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1551:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_8_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Opening__Group_8__0__Impl3050); 
             after(grammarAccess.getOpeningAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_8__0__Impl"


    // $ANTLR start "rule__Opening__Group_8__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1564:1: rule__Opening__Group_8__1 : rule__Opening__Group_8__1__Impl ;
    public final void rule__Opening__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1568:1: ( rule__Opening__Group_8__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1569:2: rule__Opening__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__1__Impl_in_rule__Opening__Group_8__13081);
            rule__Opening__Group_8__1__Impl();

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
    // $ANTLR end "rule__Opening__Group_8__1"


    // $ANTLR start "rule__Opening__Group_8__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1575:1: rule__Opening__Group_8__1__Impl : ( ( rule__Opening__WallsAssignment_8_1 ) ) ;
    public final void rule__Opening__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1579:1: ( ( ( rule__Opening__WallsAssignment_8_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1580:1: ( ( rule__Opening__WallsAssignment_8_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1580:1: ( ( rule__Opening__WallsAssignment_8_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1581:1: ( rule__Opening__WallsAssignment_8_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_8_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1582:1: ( rule__Opening__WallsAssignment_8_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1582:2: rule__Opening__WallsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_8_1_in_rule__Opening__Group_8__1__Impl3108);
            rule__Opening__WallsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getOpeningAccess().getWallsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__Group_8__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1596:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1600:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1601:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03142);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03145);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1608:1: rule__FlowSegment__Group__0__Impl : ( 'Pipe' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1612:1: ( ( 'Pipe' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1613:1: ( 'Pipe' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1613:1: ( 'Pipe' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1614:1: 'Pipe'
            {
             before(grammarAccess.getFlowSegmentAccess().getPipeKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__FlowSegment__Group__0__Impl3173); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1627:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1631:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1632:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13204);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13207);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1639:1: rule__FlowSegment__Group__1__Impl : ( ( rule__FlowSegment__NameAssignment_1 ) ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1643:1: ( ( ( rule__FlowSegment__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1644:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1644:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1645:1: ( rule__FlowSegment__NameAssignment_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1646:1: ( rule__FlowSegment__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1646:2: rule__FlowSegment__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3234);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1656:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1660:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1661:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23264);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23267);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1668:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1672:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1673:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1673:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1674:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1675:1: ( rule__FlowSegment__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1675:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3294);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1685:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1689:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1690:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33325);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33328);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1697:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1701:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1702:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1702:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1703:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1704:1: ( rule__FlowSegment__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1704:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3355);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1714:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1718:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1719:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43386);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43389);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1726:1: rule__FlowSegment__Group__4__Impl : ( 'placement' ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1730:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1731:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1731:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1732:1: 'placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group__4__Impl3417); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1745:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1749:1: ( rule__FlowSegment__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1750:2: rule__FlowSegment__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53448);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1756:1: rule__FlowSegment__Group__5__Impl : ( ( rule__FlowSegment__PlacementAssignment_5 ) ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1760:1: ( ( ( rule__FlowSegment__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1761:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1761:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1762:1: ( rule__FlowSegment__PlacementAssignment_5 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1763:1: ( rule__FlowSegment__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1763:2: rule__FlowSegment__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3475);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1785:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1789:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1790:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03517);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03520);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1797:1: rule__FlowSegment__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1801:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1802:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1802:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1803:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FlowSegment__Group_2__0__Impl3548); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1816:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1820:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1821:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13579);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1827:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:1: ( ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1832:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1832:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1833:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1834:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1834:2: rule__FlowSegment__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3606);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1848:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1852:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1853:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03640);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03643);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1860:1: rule__FlowSegment__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1864:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1865:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1865:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1866:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_3__0__Impl3671); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1879:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1883:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1884:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13702);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1890:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1894:1: ( ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1895:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1895:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1896:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1897:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1897:2: rule__FlowSegment__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3729);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1911:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1915:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1916:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03763);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03766);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1923:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1927:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1928:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1928:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1929:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1930:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1932:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1942:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1946:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1947:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13824);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13827);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1954:1: rule__LocalPlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1958:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1959:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1959:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1960:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__LocalPlacement__Group__1__Impl3855); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1973:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1977:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1978:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__23886);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__23889);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1985:1: rule__LocalPlacement__Group__2__Impl : ( ( rule__LocalPlacement__Group_2__0 )? ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1989:1: ( ( ( rule__LocalPlacement__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1990:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1990:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1991:1: ( rule__LocalPlacement__Group_2__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1992:1: ( rule__LocalPlacement__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1992:2: rule__LocalPlacement__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl3916);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2002:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2006:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2007:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__33947);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__33950);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2014:1: rule__LocalPlacement__Group__3__Impl : ( ( rule__LocalPlacement__Group_3__0 )? ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2018:1: ( ( ( rule__LocalPlacement__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2019:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2019:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2020:1: ( rule__LocalPlacement__Group_3__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2021:1: ( rule__LocalPlacement__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2021:2: rule__LocalPlacement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl3977);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2031:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2035:1: ( rule__LocalPlacement__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2036:2: rule__LocalPlacement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44008);
            rule__LocalPlacement__Group__4__Impl();

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2042:1: rule__LocalPlacement__Group__4__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2046:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2047:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2047:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2048:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LocalPlacement__Group__4__Impl4036); 
             after(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__LocalPlacement__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2071:1: rule__LocalPlacement__Group_2__0 : rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 ;
    public final void rule__LocalPlacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2075:1: ( rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2076:2: rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04077);
            rule__LocalPlacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04080);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2083:1: rule__LocalPlacement__Group_2__0__Impl : ( 'relativeTo' ) ;
    public final void rule__LocalPlacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2087:1: ( ( 'relativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2088:1: ( 'relativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2088:1: ( 'relativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2089:1: 'relativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4108); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2102:1: rule__LocalPlacement__Group_2__1 : rule__LocalPlacement__Group_2__1__Impl ;
    public final void rule__LocalPlacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2106:1: ( rule__LocalPlacement__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2107:2: rule__LocalPlacement__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14139);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2113:1: rule__LocalPlacement__Group_2__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) ;
    public final void rule__LocalPlacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2117:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2119:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2120:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2120:2: rule__LocalPlacement__RelativeToAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4166);
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


    // $ANTLR start "rule__LocalPlacement__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2134:1: rule__LocalPlacement__Group_3__0 : rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 ;
    public final void rule__LocalPlacement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2138:1: ( rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2139:2: rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__04200);
            rule__LocalPlacement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__04203);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2146:1: rule__LocalPlacement__Group_3__0__Impl : ( 'axis2placement3d' ) ;
    public final void rule__LocalPlacement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2150:1: ( ( 'axis2placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2151:1: ( 'axis2placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2151:1: ( 'axis2placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2152:1: 'axis2placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl4231); 
             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2165:1: rule__LocalPlacement__Group_3__1 : rule__LocalPlacement__Group_3__1__Impl ;
    public final void rule__LocalPlacement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2169:1: ( rule__LocalPlacement__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2170:2: rule__LocalPlacement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__14262);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2176:1: rule__LocalPlacement__Group_3__1__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) ) ;
    public final void rule__LocalPlacement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2180:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2181:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2181:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2182:1: ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2183:1: ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2183:2: rule__LocalPlacement__Axis2placement3dAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl4289);
            rule__LocalPlacement__Axis2placement3dAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis2Placement3D__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2197:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2201:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2202:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04323);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04326);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2209:1: rule__Axis2Placement3D__Group__0__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2213:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2214:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2214:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2215:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Axis2Placement3D__Group__0__Impl4354); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2228:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2232:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2233:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14385);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14388);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2240:1: rule__Axis2Placement3D__Group__1__Impl : ( 'cartesian' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2244:1: ( ( 'cartesian' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2245:1: ( 'cartesian' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2245:1: ( 'cartesian' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2246:1: 'cartesian'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Axis2Placement3D__Group__1__Impl4416); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2259:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2263:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2264:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24447);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24450);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2271:1: rule__Axis2Placement3D__Group__2__Impl : ( '(' ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2275:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2276:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2276:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2277:1: '('
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Axis2Placement3D__Group__2__Impl4478); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2290:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2294:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2295:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34509);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34512);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2302:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2306:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2307:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2307:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2308:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2309:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2309:2: rule__Axis2Placement3D__CartesianXAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4539);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2319:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2323:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2324:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44569);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44572);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2331:1: rule__Axis2Placement3D__Group__4__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2335:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2336:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2336:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2337:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Axis2Placement3D__Group__4__Impl4600); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2350:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2354:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2355:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54631);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54634);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2362:1: rule__Axis2Placement3D__Group__5__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2366:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2367:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2367:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2368:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:2: rule__Axis2Placement3D__CartesianYAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4661);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2379:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2383:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2384:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64691);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64694);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2391:1: rule__Axis2Placement3D__Group__6__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2395:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2396:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2396:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2397:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Axis2Placement3D__Group__6__Impl4722); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2410:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2414:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2415:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74753);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74756);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2422:1: rule__Axis2Placement3D__Group__7__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2426:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2427:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2427:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2428:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:2: rule__Axis2Placement3D__CartesianZAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4783);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2439:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2443:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2444:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84813);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84816);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2451:1: rule__Axis2Placement3D__Group__8__Impl : ( ')' ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2455:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2456:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2456:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2457:1: ')'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Axis2Placement3D__Group__8__Impl4844); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2470:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2474:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2475:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94875);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94878);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2482:1: rule__Axis2Placement3D__Group__9__Impl : ( 'axis' ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2486:1: ( ( 'axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: ( 'axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: ( 'axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2488:1: 'axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Axis2Placement3D__Group__9__Impl4906); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2501:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2505:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2506:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__104937);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__104940);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2513:1: rule__Axis2Placement3D__Group__10__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2517:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2518:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2518:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2519:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_10()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2520:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2520:2: rule__Axis2Placement3D__AxisAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl4967);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2530:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2534:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2535:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__114997);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115000);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2542:1: rule__Axis2Placement3D__Group__11__Impl : ( 'refDir' ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2546:1: ( ( 'refDir' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2547:1: ( 'refDir' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2547:1: ( 'refDir' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2548:1: 'refDir'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirKeyword_11()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Axis2Placement3D__Group__11__Impl5028); 
             after(grammarAccess.getAxis2Placement3DAccess().getRefDirKeyword_11()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2561:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2565:1: ( rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2566:2: rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125059);
            rule__Axis2Placement3D__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125062);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2573:1: rule__Axis2Placement3D__Group__12__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2577:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2578:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2578:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2579:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_12()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2580:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2580:2: rule__Axis2Placement3D__RefDirectionAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5089);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2590:1: rule__Axis2Placement3D__Group__13 : rule__Axis2Placement3D__Group__13__Impl ;
    public final void rule__Axis2Placement3D__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2594:1: ( rule__Axis2Placement3D__Group__13__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2595:2: rule__Axis2Placement3D__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135119);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2601:1: rule__Axis2Placement3D__Group__13__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2605:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2606:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2606:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2607:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5147); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2648:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2652:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2653:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05206);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05209);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2660:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2664:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2665:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2665:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2666:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2667:1: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2668:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group__0__Impl5238); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2679:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2683:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2684:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15271);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15274);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2691:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2695:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2696:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2696:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2697:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2698:1: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2698:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5302); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2708:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2712:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2713:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25333);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25336);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2720:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2724:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2725:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2725:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2726:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EDouble__Group__2__Impl5364); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2739:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2743:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2744:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35395);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35398);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2751:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2755:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2756:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2756:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2757:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5425); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2768:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2772:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2773:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45454);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2779:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2783:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2784:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2784:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2785:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2786:1: ( rule__EDouble__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=12)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2786:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5481);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2806:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2810:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2811:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05522);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05525);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2818:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2822:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2823:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2823:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2824:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2825:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2825:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5552);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2835:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2839:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2840:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15582);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15585);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2847:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2851:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2852:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2852:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2853:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2854:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2855:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group_4__1__Impl5614); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2866:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2870:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2871:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25647);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2877:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2881:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2882:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2882:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2883:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5674); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2900:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2904:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2905:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05709);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05712);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2912:1: rule__Direction__Group__0__Impl : ( '(' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2916:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2917:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2917:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2918:1: '('
            {
             before(grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Direction__Group__0__Impl5740); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2931:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2935:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2936:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15771);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15774);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2943:1: rule__Direction__Group__1__Impl : ( ( rule__Direction__XAssignment_1 ) ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2947:1: ( ( ( rule__Direction__XAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2948:1: ( ( rule__Direction__XAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2948:1: ( ( rule__Direction__XAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2949:1: ( rule__Direction__XAssignment_1 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2950:1: ( rule__Direction__XAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2950:2: rule__Direction__XAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5801);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2960:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2964:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2965:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25831);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25834);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2972:1: rule__Direction__Group__2__Impl : ( ',' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2976:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2978:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Direction__Group__2__Impl5862); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2991:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2995:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2996:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35893);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35896);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__YAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3007:1: ( ( ( rule__Direction__YAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3008:1: ( ( rule__Direction__YAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3008:1: ( ( rule__Direction__YAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3009:1: ( rule__Direction__YAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:1: ( rule__Direction__YAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:2: rule__Direction__YAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5923);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3020:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3024:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3025:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__45953);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__45956);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3032:1: rule__Direction__Group__4__Impl : ( ( rule__Direction__Group_4__0 )? ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3036:1: ( ( ( rule__Direction__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3037:1: ( ( rule__Direction__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3037:1: ( ( rule__Direction__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3038:1: ( rule__Direction__Group_4__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3039:1: ( rule__Direction__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3039:2: rule__Direction__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl5983);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3049:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3053:1: ( rule__Direction__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3054:2: rule__Direction__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56014);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3060:1: rule__Direction__Group__5__Impl : ( ')' ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3064:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3065:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3065:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3066:1: ')'
            {
             before(grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Direction__Group__5__Impl6042); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3091:1: rule__Direction__Group_4__0 : rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 ;
    public final void rule__Direction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3095:1: ( rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3096:2: rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06085);
            rule__Direction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06088);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3103:1: rule__Direction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Direction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3107:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3108:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3108:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3109:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Direction__Group_4__0__Impl6116); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3122:1: rule__Direction__Group_4__1 : rule__Direction__Group_4__1__Impl ;
    public final void rule__Direction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3126:1: ( rule__Direction__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3127:2: rule__Direction__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16147);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3133:1: rule__Direction__Group_4__1__Impl : ( ( rule__Direction__ZAssignment_4_1 ) ) ;
    public final void rule__Direction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3137:1: ( ( ( rule__Direction__ZAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3138:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3138:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3139:1: ( rule__Direction__ZAssignment_4_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3140:1: ( rule__Direction__ZAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3140:2: rule__Direction__ZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6174);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3155:1: rule__Model__ElementsAssignment_2 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3159:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3160:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3160:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3161:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26213);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3170:1: rule__Model__ElementsAssignment_3_1 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3174:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3175:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3175:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3176:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16244);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3185:1: rule__Model__ElementsAssignment_5 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3189:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3190:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3190:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3191:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56275);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3200:1: rule__Model__ElementsAssignment_6_1 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3204:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3205:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3205:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3206:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16306);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3215:1: rule__Model__ElementsAssignment_8 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3219:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3220:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3220:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3221:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86337);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3230:1: rule__Model__ElementsAssignment_9_1 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3234:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3236:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16368);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3245:1: rule__WallRule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WallRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3249:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3250:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3250:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3251:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__NameAssignment_16399);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__WallRule__ElementNameAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3260:1: rule__WallRule__ElementNameAssignment_3 : ( ruleEString ) ;
    public final void rule__WallRule__ElementNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3264:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3265:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3266:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_36430);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRule__ElementNameAssignment_3"


    // $ANTLR start "rule__WallRule__DescriptionAssignment_5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3275:1: rule__WallRule__DescriptionAssignment_5 : ( ruleEString ) ;
    public final void rule__WallRule__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3279:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3280:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3280:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3281:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_56461);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRule__DescriptionAssignment_5"


    // $ANTLR start "rule__WallRule__PlacementAssignment_7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3290:1: rule__WallRule__PlacementAssignment_7 : ( ruleLocalPlacement ) ;
    public final void rule__WallRule__PlacementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3294:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3296:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_76492);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRule__PlacementAssignment_7"


    // $ANTLR start "rule__Opening__NameAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3305:1: rule__Opening__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3309:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3311:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__NameAssignment_16523);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3320:1: rule__Opening__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3324:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3326:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16554);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3335:1: rule__Opening__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3339:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3340:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3340:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3341:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16585);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3350:1: rule__Opening__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3354:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3355:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3355:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3356:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56616);
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


    // $ANTLR start "rule__Opening__WallsAssignment_7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3365:1: rule__Opening__WallsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Opening__WallsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3369:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3370:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3370:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3371:1: ( RULE_ID )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_7_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3372:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3373:1: RULE_ID
            {
             before(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_76651); 
             after(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getOpeningAccess().getWallsWallCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__WallsAssignment_7"


    // $ANTLR start "rule__Opening__WallsAssignment_8_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3384:1: rule__Opening__WallsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__Opening__WallsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3388:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3389:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3389:1: ( ( RULE_ID ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3390:1: ( RULE_ID )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_8_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3391:1: ( RULE_ID )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3392:1: RULE_ID
            {
             before(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_8_16690); 
             after(grammarAccess.getOpeningAccess().getWallsWallIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getOpeningAccess().getWallsWallCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Opening__WallsAssignment_8_1"


    // $ANTLR start "rule__FlowSegment__NameAssignment_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3403:1: rule__FlowSegment__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3407:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3408:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3408:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3409:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_16725);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3418:1: rule__FlowSegment__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3422:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3423:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3423:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3424:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16756);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3433:1: rule__FlowSegment__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3437:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3438:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3438:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3439:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16787);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3448:1: rule__FlowSegment__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3452:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3453:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3453:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3454:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56818);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3463:1: rule__LocalPlacement__RelativeToAssignment_2_1 : ( ruleLocalPlacement ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3467:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3468:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3468:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3469:1: ruleLocalPlacement
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16849);
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


    // $ANTLR start "rule__LocalPlacement__Axis2placement3dAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3478:1: rule__LocalPlacement__Axis2placement3dAssignment_3_1 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3482:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3483:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3483:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3484:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_3_16880);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Axis2placement3dAssignment_3_1"


    // $ANTLR start "rule__Axis2Placement3D__CartesianXAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3493:1: rule__Axis2Placement3D__CartesianXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3497:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3498:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3498:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3499:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36911);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3508:1: rule__Axis2Placement3D__CartesianYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3512:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3513:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3513:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3514:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_56942);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3523:1: rule__Axis2Placement3D__CartesianZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3527:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3528:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3528:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3529:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_76973);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3538:1: rule__Axis2Placement3D__AxisAssignment_10 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3542:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3543:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3543:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3544:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107004);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3553:1: rule__Axis2Placement3D__RefDirectionAssignment_12 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3557:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3558:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3558:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3559:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127035);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3568:1: rule__Direction__XAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3572:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3573:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3573:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3574:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17066);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3583:1: rule__Direction__YAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3587:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3588:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3588:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3589:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37097);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3598:1: rule__Direction__ZAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3602:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3603:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3603:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3604:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17128);
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
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives627 = new BitSet(new long[]{0x0000000000000002L});
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
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71139 = new BitSet(new long[]{0x0000000001000000L});
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
        public static final BitSet FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01585 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_9__0__Impl1616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01708 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__WallRule__Group__0__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11770 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21830 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WallRule__Group__2__Impl1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31892 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__ElementNameAssignment_3_in_rule__WallRule__Group__3__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WallRule__Group__4__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__52014 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__6_in_rule__WallRule__Group__52017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__DescriptionAssignment_5_in_rule__WallRule__Group__5__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__6__Impl_in_rule__WallRule__Group__62074 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__7_in_rule__WallRule__Group__62077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WallRule__Group__6__Impl2105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__7__Impl_in_rule__WallRule__Group__72136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__PlacementAssignment_7_in_rule__WallRule__Group__7__Impl2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02209 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12271 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22331 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32392 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42453 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group__4__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52515 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62575 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__62578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Opening__Group__6__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__72637 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__72640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_in_rule__Opening__Group__7__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__82697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__0_in_rule__Opening__Group__8__Impl2724 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02773 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Opening__Group_2__0__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_3__0__Impl2927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__0__Impl_in_rule__Opening__Group_8__03019 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__1_in_rule__Opening__Group_8__03022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Opening__Group_8__0__Impl3050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__1__Impl_in_rule__Opening__Group_8__13081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_8_1_in_rule__Opening__Group_8__1__Impl3108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03142 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__FlowSegment__Group__0__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13204 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23264 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33325 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43386 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group__4__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03517 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FlowSegment__Group_2__0__Impl3548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_3__0__Impl3671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03763 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13824 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__LocalPlacement__Group__1__Impl3855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__23886 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__23889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__33947 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__33950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LocalPlacement__Group__4__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04077 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14139 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__04200 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__04203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__14262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl4289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04323 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Axis2Placement3D__Group__0__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14385 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Axis2Placement3D__Group__1__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24447 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Axis2Placement3D__Group__2__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34509 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44569 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Axis2Placement3D__Group__4__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54631 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64691 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Axis2Placement3D__Group__6__Impl4722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74753 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84813 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Axis2Placement3D__Group__8__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94875 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Axis2Placement3D__Group__9__Impl4906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__104937 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__104940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__114997 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Axis2Placement3D__Group__11__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125059 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135119 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05206 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group__0__Impl5238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15271 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25333 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EDouble__Group__2__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35395 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05522 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15582 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group_4__1__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05709 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Direction__Group__0__Impl5740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15771 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25831 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Direction__Group__2__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35893 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__45953 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__45956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Direction__Group__5__Impl6042 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06085 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Direction__Group_4__0__Impl6116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__NameAssignment_16399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_36430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_56461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_76492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__NameAssignment_16523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_76651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Opening__WallsAssignment_8_16690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_16725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_3_16880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_56942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_76973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17128 = new BitSet(new long[]{0x0000000000000002L});
    }


}