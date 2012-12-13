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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Walls'", "'Openings'", "'Pipes'", "'and'", "'Wall'", "'Placement'", "'Name'", "'Description'", "'Opening'", "','", "'Pipe'", "'{'", "'Axis2Placement3d'", "'}'", "'RelativeTo'", "'Cartesian'", "'('", "')'", "'Axis'", "'RefDirection'", "'-'", "'.'"
    };
    public static final int RULE_ID=6;
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
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:97:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:101:2: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( RULE_STRING )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:103:1: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString154); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
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
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_entryRuleWallRule180);
            ruleWallRule();

            state._fsp--;

             after(grammarAccess.getWallRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRule187); 

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
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__0_in_ruleWallRule213);
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
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening240);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getOpeningRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening247); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0_in_ruleOpening273);
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
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment300);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getFlowSegmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment307); 

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
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment333);
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
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement360);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement367); 

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
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement393);
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
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D420);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D427); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D453);
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
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble480);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble487); 

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
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble513);
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
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection540);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection547); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0_in_ruleDirection573);
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


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:312:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:316:1: ( ( 'E' ) | ( 'e' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( 'E' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:317:1: ( 'E' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:318:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0610); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:325:6: ( 'e' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:325:6: ( 'e' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:326:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0630); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:340:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:344:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:345:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0662);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0665);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:352:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:356:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:357:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:357:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:358:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:359:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:361:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:371:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:375:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:376:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1723);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1726);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:383:1: rule__Model__Group__1__Impl : ( 'Walls' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:387:1: ( ( 'Walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:388:1: ( 'Walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:388:1: ( 'Walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:389:1: 'Walls'
            {
             before(grammarAccess.getModelAccess().getWallsKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__1__Impl754); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:402:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:406:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:407:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2785);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2788);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:414:1: rule__Model__Group__2__Impl : ( ( rule__Model__ElementsAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:418:1: ( ( ( rule__Model__ElementsAssignment_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:419:1: ( ( rule__Model__ElementsAssignment_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:419:1: ( ( rule__Model__ElementsAssignment_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:420:1: ( rule__Model__ElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:421:1: ( rule__Model__ElementsAssignment_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:421:2: rule__Model__ElementsAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl815);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:431:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:435:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:436:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3845);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3848);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:443:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:447:1: ( ( ( rule__Model__Group_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:448:1: ( ( rule__Model__Group_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:448:1: ( ( rule__Model__Group_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:449:1: ( rule__Model__Group_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:450:1: ( rule__Model__Group_3__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:450:2: rule__Model__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl875);
            	    rule__Model__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:460:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:464:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:465:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4906);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4909);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:472:1: rule__Model__Group__4__Impl : ( 'Openings' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:476:1: ( ( 'Openings' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:477:1: ( 'Openings' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:477:1: ( 'Openings' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:478:1: 'Openings'
            {
             before(grammarAccess.getModelAccess().getOpeningsKeyword_4()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__4__Impl937); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:491:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:495:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:496:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5968);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5971);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:503:1: rule__Model__Group__5__Impl : ( ( rule__Model__ElementsAssignment_5 ) ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:507:1: ( ( ( rule__Model__ElementsAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:508:1: ( ( rule__Model__ElementsAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:508:1: ( ( rule__Model__ElementsAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:509:1: ( rule__Model__ElementsAssignment_5 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:510:1: ( rule__Model__ElementsAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:510:2: rule__Model__ElementsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_5_in_rule__Model__Group__5__Impl998);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:520:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:524:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:525:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61028);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61031);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:532:1: rule__Model__Group__6__Impl : ( ( rule__Model__Group_6__0 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:536:1: ( ( ( rule__Model__Group_6__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:537:1: ( ( rule__Model__Group_6__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:537:1: ( ( rule__Model__Group_6__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:538:1: ( rule__Model__Group_6__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:539:1: ( rule__Model__Group_6__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:539:2: rule__Model__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1058);
            	    rule__Model__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:549:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:553:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:554:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71089);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71092);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:561:1: rule__Model__Group__7__Impl : ( 'Pipes' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:565:1: ( ( 'Pipes' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:566:1: ( 'Pipes' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:566:1: ( 'Pipes' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:567:1: 'Pipes'
            {
             before(grammarAccess.getModelAccess().getPipesKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__7__Impl1120); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:580:1: rule__Model__Group__8 : rule__Model__Group__8__Impl rule__Model__Group__9 ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:584:1: ( rule__Model__Group__8__Impl rule__Model__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:585:2: rule__Model__Group__8__Impl rule__Model__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81151);
            rule__Model__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81154);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:592:1: rule__Model__Group__8__Impl : ( ( rule__Model__ElementsAssignment_8 ) ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:596:1: ( ( ( rule__Model__ElementsAssignment_8 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:597:1: ( ( rule__Model__ElementsAssignment_8 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:597:1: ( ( rule__Model__ElementsAssignment_8 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:598:1: ( rule__Model__ElementsAssignment_8 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:599:1: ( rule__Model__ElementsAssignment_8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:599:2: rule__Model__ElementsAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_8_in_rule__Model__Group__8__Impl1181);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:609:1: rule__Model__Group__9 : rule__Model__Group__9__Impl ;
    public final void rule__Model__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:613:1: ( rule__Model__Group__9__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:614:2: rule__Model__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91211);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:620:1: rule__Model__Group__9__Impl : ( ( rule__Model__Group_9__0 )* ) ;
    public final void rule__Model__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:624:1: ( ( ( rule__Model__Group_9__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:625:1: ( ( rule__Model__Group_9__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:625:1: ( ( rule__Model__Group_9__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:626:1: ( rule__Model__Group_9__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_9()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:627:1: ( rule__Model__Group_9__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:627:2: rule__Model__Group_9__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl1238);
            	    rule__Model__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:657:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:661:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:662:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01289);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01292);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:669:1: rule__Model__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:673:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:674:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:674:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:675:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_3__0__Impl1320); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:688:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:692:1: ( rule__Model__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:693:2: rule__Model__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11351);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:699:1: rule__Model__Group_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_1 ) ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:703:1: ( ( ( rule__Model__ElementsAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:704:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:704:1: ( ( rule__Model__ElementsAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:705:1: ( rule__Model__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:706:1: ( rule__Model__ElementsAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:706:2: rule__Model__ElementsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_1_in_rule__Model__Group_3__1__Impl1378);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:720:1: rule__Model__Group_6__0 : rule__Model__Group_6__0__Impl rule__Model__Group_6__1 ;
    public final void rule__Model__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:724:1: ( rule__Model__Group_6__0__Impl rule__Model__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:725:2: rule__Model__Group_6__0__Impl rule__Model__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01412);
            rule__Model__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01415);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:732:1: rule__Model__Group_6__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:736:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:737:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:737:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:738:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_6_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_6__0__Impl1443); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:751:1: rule__Model__Group_6__1 : rule__Model__Group_6__1__Impl ;
    public final void rule__Model__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:755:1: ( rule__Model__Group_6__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:756:2: rule__Model__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__11474);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:762:1: rule__Model__Group_6__1__Impl : ( ( rule__Model__ElementsAssignment_6_1 ) ) ;
    public final void rule__Model__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:766:1: ( ( ( rule__Model__ElementsAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:767:1: ( ( rule__Model__ElementsAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:767:1: ( ( rule__Model__ElementsAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:768:1: ( rule__Model__ElementsAssignment_6_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:769:1: ( rule__Model__ElementsAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:769:2: rule__Model__ElementsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_6_1_in_rule__Model__Group_6__1__Impl1501);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:783:1: rule__Model__Group_9__0 : rule__Model__Group_9__0__Impl rule__Model__Group_9__1 ;
    public final void rule__Model__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:787:1: ( rule__Model__Group_9__0__Impl rule__Model__Group_9__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:788:2: rule__Model__Group_9__0__Impl rule__Model__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01535);
            rule__Model__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01538);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:795:1: rule__Model__Group_9__0__Impl : ( 'and' ) ;
    public final void rule__Model__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:799:1: ( ( 'and' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:800:1: ( 'and' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:800:1: ( 'and' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:801:1: 'and'
            {
             before(grammarAccess.getModelAccess().getAndKeyword_9_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_9__0__Impl1566); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:814:1: rule__Model__Group_9__1 : rule__Model__Group_9__1__Impl ;
    public final void rule__Model__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:818:1: ( rule__Model__Group_9__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:819:2: rule__Model__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11597);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:825:1: rule__Model__Group_9__1__Impl : ( ( rule__Model__ElementsAssignment_9_1 ) ) ;
    public final void rule__Model__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:829:1: ( ( ( rule__Model__ElementsAssignment_9_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:830:1: ( ( rule__Model__ElementsAssignment_9_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:830:1: ( ( rule__Model__ElementsAssignment_9_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:831:1: ( rule__Model__ElementsAssignment_9_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_9_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:832:1: ( rule__Model__ElementsAssignment_9_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:832:2: rule__Model__ElementsAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1624);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:846:1: rule__WallRule__Group__0 : rule__WallRule__Group__0__Impl rule__WallRule__Group__1 ;
    public final void rule__WallRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:850:1: ( rule__WallRule__Group__0__Impl rule__WallRule__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:851:2: rule__WallRule__Group__0__Impl rule__WallRule__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01658);
            rule__WallRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01661);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:858:1: rule__WallRule__Group__0__Impl : ( 'Wall' ) ;
    public final void rule__WallRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:862:1: ( ( 'Wall' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:863:1: ( 'Wall' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:863:1: ( 'Wall' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:864:1: 'Wall'
            {
             before(grammarAccess.getWallRuleAccess().getWallKeyword_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__WallRule__Group__0__Impl1689); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:877:1: rule__WallRule__Group__1 : rule__WallRule__Group__1__Impl rule__WallRule__Group__2 ;
    public final void rule__WallRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:881:1: ( rule__WallRule__Group__1__Impl rule__WallRule__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:882:2: rule__WallRule__Group__1__Impl rule__WallRule__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11720);
            rule__WallRule__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11723);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:889:1: rule__WallRule__Group__1__Impl : ( ( rule__WallRule__NameAssignment_1 ) ) ;
    public final void rule__WallRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:893:1: ( ( ( rule__WallRule__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:894:1: ( ( rule__WallRule__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:894:1: ( ( rule__WallRule__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:895:1: ( rule__WallRule__NameAssignment_1 )
            {
             before(grammarAccess.getWallRuleAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:896:1: ( rule__WallRule__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:896:2: rule__WallRule__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1750);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:906:1: rule__WallRule__Group__2 : rule__WallRule__Group__2__Impl rule__WallRule__Group__3 ;
    public final void rule__WallRule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:910:1: ( rule__WallRule__Group__2__Impl rule__WallRule__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:911:2: rule__WallRule__Group__2__Impl rule__WallRule__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21780);
            rule__WallRule__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21783);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:918:1: rule__WallRule__Group__2__Impl : ( ( rule__WallRule__Group_2__0 )? ) ;
    public final void rule__WallRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:922:1: ( ( ( rule__WallRule__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:923:1: ( ( rule__WallRule__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:923:1: ( ( rule__WallRule__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:924:1: ( rule__WallRule__Group_2__0 )?
            {
             before(grammarAccess.getWallRuleAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:925:1: ( rule__WallRule__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:925:2: rule__WallRule__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__0_in_rule__WallRule__Group__2__Impl1810);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:935:1: rule__WallRule__Group__3 : rule__WallRule__Group__3__Impl rule__WallRule__Group__4 ;
    public final void rule__WallRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:939:1: ( rule__WallRule__Group__3__Impl rule__WallRule__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:940:2: rule__WallRule__Group__3__Impl rule__WallRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31841);
            rule__WallRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31844);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:947:1: rule__WallRule__Group__3__Impl : ( ( rule__WallRule__Group_3__0 )? ) ;
    public final void rule__WallRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:951:1: ( ( ( rule__WallRule__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:952:1: ( ( rule__WallRule__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:952:1: ( ( rule__WallRule__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:953:1: ( rule__WallRule__Group_3__0 )?
            {
             before(grammarAccess.getWallRuleAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:954:1: ( rule__WallRule__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:954:2: rule__WallRule__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__0_in_rule__WallRule__Group__3__Impl1871);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:964:1: rule__WallRule__Group__4 : rule__WallRule__Group__4__Impl rule__WallRule__Group__5 ;
    public final void rule__WallRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:968:1: ( rule__WallRule__Group__4__Impl rule__WallRule__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:969:2: rule__WallRule__Group__4__Impl rule__WallRule__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41902);
            rule__WallRule__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41905);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: rule__WallRule__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__WallRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:980:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:981:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:981:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:982:1: 'Placement'
            {
             before(grammarAccess.getWallRuleAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WallRule__Group__4__Impl1933); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:995:1: rule__WallRule__Group__5 : rule__WallRule__Group__5__Impl ;
    public final void rule__WallRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:999:1: ( rule__WallRule__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1000:2: rule__WallRule__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__51964);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1006:1: rule__WallRule__Group__5__Impl : ( ( rule__WallRule__PlacementAssignment_5 ) ) ;
    public final void rule__WallRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1010:1: ( ( ( rule__WallRule__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1011:1: ( ( rule__WallRule__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1011:1: ( ( rule__WallRule__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1012:1: ( rule__WallRule__PlacementAssignment_5 )
            {
             before(grammarAccess.getWallRuleAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1013:1: ( rule__WallRule__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1013:2: rule__WallRule__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__PlacementAssignment_5_in_rule__WallRule__Group__5__Impl1991);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1035:1: rule__WallRule__Group_2__0 : rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1 ;
    public final void rule__WallRule__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1039:1: ( rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1040:2: rule__WallRule__Group_2__0__Impl rule__WallRule__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__0__Impl_in_rule__WallRule__Group_2__02033);
            rule__WallRule__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__1_in_rule__WallRule__Group_2__02036);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1047:1: rule__WallRule__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__WallRule__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1051:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1052:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1052:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1053:1: 'Name'
            {
             before(grammarAccess.getWallRuleAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WallRule__Group_2__0__Impl2064); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1066:1: rule__WallRule__Group_2__1 : rule__WallRule__Group_2__1__Impl ;
    public final void rule__WallRule__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1070:1: ( rule__WallRule__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1071:2: rule__WallRule__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_2__1__Impl_in_rule__WallRule__Group_2__12095);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1077:1: rule__WallRule__Group_2__1__Impl : ( ( rule__WallRule__ElementNameAssignment_2_1 ) ) ;
    public final void rule__WallRule__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1081:1: ( ( ( rule__WallRule__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1082:1: ( ( rule__WallRule__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1082:1: ( ( rule__WallRule__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1083:1: ( rule__WallRule__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getWallRuleAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1084:1: ( rule__WallRule__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1084:2: rule__WallRule__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__ElementNameAssignment_2_1_in_rule__WallRule__Group_2__1__Impl2122);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1098:1: rule__WallRule__Group_3__0 : rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1 ;
    public final void rule__WallRule__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1102:1: ( rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1103:2: rule__WallRule__Group_3__0__Impl rule__WallRule__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__0__Impl_in_rule__WallRule__Group_3__02156);
            rule__WallRule__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__1_in_rule__WallRule__Group_3__02159);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1110:1: rule__WallRule__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__WallRule__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1114:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1115:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1115:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1116:1: 'Description'
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WallRule__Group_3__0__Impl2187); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1129:1: rule__WallRule__Group_3__1 : rule__WallRule__Group_3__1__Impl ;
    public final void rule__WallRule__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1133:1: ( rule__WallRule__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1134:2: rule__WallRule__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group_3__1__Impl_in_rule__WallRule__Group_3__12218);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1140:1: rule__WallRule__Group_3__1__Impl : ( ( rule__WallRule__DescriptionAssignment_3_1 ) ) ;
    public final void rule__WallRule__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1144:1: ( ( ( rule__WallRule__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1145:1: ( ( rule__WallRule__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1145:1: ( ( rule__WallRule__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1146:1: ( rule__WallRule__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1147:1: ( rule__WallRule__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1147:2: rule__WallRule__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__DescriptionAssignment_3_1_in_rule__WallRule__Group_3__1__Impl2245);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1161:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1165:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1166:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02279);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02282);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1177:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1178:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1178:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1179:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group__0__Impl2310); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1192:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1196:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1197:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12341);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12344);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1204:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1208:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1209:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1209:1: ( ( rule__Opening__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1210:1: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1211:1: ( rule__Opening__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1211:2: rule__Opening__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2371);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1221:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1225:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1226:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22401);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22404);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1233:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1237:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1238:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1238:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1239:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1240:1: ( rule__Opening__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1240:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2431);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1250:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1254:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1255:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32462);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32465);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1262:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1266:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1268:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1269:1: ( rule__Opening__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1269:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2492);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1279:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1283:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1284:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42523);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42526);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:1: rule__Opening__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1295:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1296:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1296:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1297:1: 'Placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Opening__Group__4__Impl2554); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1310:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1314:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1315:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52585);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52588);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1322:1: rule__Opening__Group__5__Impl : ( ( rule__Opening__PlacementAssignment_5 ) ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1326:1: ( ( ( rule__Opening__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1327:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1327:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1328:1: ( rule__Opening__PlacementAssignment_5 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:1: ( rule__Opening__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:2: rule__Opening__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2615);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1339:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1343:1: ( rule__Opening__Group__6__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:2: rule__Opening__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62645);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1350:1: rule__Opening__Group__6__Impl : ( ( rule__Opening__Group_6__0 )? ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1354:1: ( ( ( rule__Opening__Group_6__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1355:1: ( ( rule__Opening__Group_6__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1355:1: ( ( rule__Opening__Group_6__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1356:1: ( rule__Opening__Group_6__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1357:1: ( rule__Opening__Group_6__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1357:2: rule__Opening__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__0_in_rule__Opening__Group__6__Impl2672);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1381:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1385:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1386:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02717);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02720);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1393:1: rule__Opening__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1397:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1398:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1398:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1399:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_2__0__Impl2748); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1412:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1416:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1417:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12779);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1423:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__ElementNameAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1427:1: ( ( ( rule__Opening__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1428:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1428:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1429:1: ( rule__Opening__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1430:1: ( rule__Opening__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1430:2: rule__Opening__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2806);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1444:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1448:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02840);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02843);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1456:1: rule__Opening__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1460:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1461:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1461:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1462:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group_3__0__Impl2871); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1475:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1479:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1480:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12902);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1486:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1490:1: ( ( ( rule__Opening__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1491:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1491:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1492:1: ( rule__Opening__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1493:1: ( rule__Opening__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1493:2: rule__Opening__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2929);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1507:1: rule__Opening__Group_6__0 : rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1 ;
    public final void rule__Opening__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1511:1: ( rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1512:2: rule__Opening__Group_6__0__Impl rule__Opening__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__0__Impl_in_rule__Opening__Group_6__02963);
            rule__Opening__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__1_in_rule__Opening__Group_6__02966);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1519:1: rule__Opening__Group_6__0__Impl : ( 'Walls' ) ;
    public final void rule__Opening__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1523:1: ( ( 'Walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1524:1: ( 'Walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1524:1: ( 'Walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1525:1: 'Walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_6_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Opening__Group_6__0__Impl2994); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1538:1: rule__Opening__Group_6__1 : rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2 ;
    public final void rule__Opening__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1542:1: ( rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1543:2: rule__Opening__Group_6__1__Impl rule__Opening__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__1__Impl_in_rule__Opening__Group_6__13025);
            rule__Opening__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__2_in_rule__Opening__Group_6__13028);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1550:1: rule__Opening__Group_6__1__Impl : ( ( rule__Opening__WallsAssignment_6_1 ) ) ;
    public final void rule__Opening__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1554:1: ( ( ( rule__Opening__WallsAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1555:1: ( ( rule__Opening__WallsAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1555:1: ( ( rule__Opening__WallsAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1556:1: ( rule__Opening__WallsAssignment_6_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1557:1: ( rule__Opening__WallsAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1557:2: rule__Opening__WallsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_6_1_in_rule__Opening__Group_6__1__Impl3055);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1567:1: rule__Opening__Group_6__2 : rule__Opening__Group_6__2__Impl ;
    public final void rule__Opening__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1571:1: ( rule__Opening__Group_6__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1572:2: rule__Opening__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6__2__Impl_in_rule__Opening__Group_6__23085);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1578:1: rule__Opening__Group_6__2__Impl : ( ( rule__Opening__Group_6_2__0 )* ) ;
    public final void rule__Opening__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1582:1: ( ( ( rule__Opening__Group_6_2__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1583:1: ( ( rule__Opening__Group_6_2__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1583:1: ( ( rule__Opening__Group_6_2__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1584:1: ( rule__Opening__Group_6_2__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_6_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1585:1: ( rule__Opening__Group_6_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1585:2: rule__Opening__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__0_in_rule__Opening__Group_6__2__Impl3112);
            	    rule__Opening__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1601:1: rule__Opening__Group_6_2__0 : rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1 ;
    public final void rule__Opening__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1605:1: ( rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1606:2: rule__Opening__Group_6_2__0__Impl rule__Opening__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__0__Impl_in_rule__Opening__Group_6_2__03149);
            rule__Opening__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__1_in_rule__Opening__Group_6_2__03152);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1613:1: rule__Opening__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1617:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1618:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1618:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1619:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_6_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Opening__Group_6_2__0__Impl3180); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1632:1: rule__Opening__Group_6_2__1 : rule__Opening__Group_6_2__1__Impl ;
    public final void rule__Opening__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1636:1: ( rule__Opening__Group_6_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1637:2: rule__Opening__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_6_2__1__Impl_in_rule__Opening__Group_6_2__13211);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1643:1: rule__Opening__Group_6_2__1__Impl : ( ( rule__Opening__WallsAssignment_6_2_1 ) ) ;
    public final void rule__Opening__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1647:1: ( ( ( rule__Opening__WallsAssignment_6_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1648:1: ( ( rule__Opening__WallsAssignment_6_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1648:1: ( ( rule__Opening__WallsAssignment_6_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1649:1: ( rule__Opening__WallsAssignment_6_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_6_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1650:1: ( rule__Opening__WallsAssignment_6_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1650:2: rule__Opening__WallsAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_6_2_1_in_rule__Opening__Group_6_2__1__Impl3238);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1664:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1668:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1669:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03272);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03275);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1676:1: rule__FlowSegment__Group__0__Impl : ( 'Pipe' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:1: ( ( 'Pipe' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1681:1: ( 'Pipe' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1681:1: ( 'Pipe' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1682:1: 'Pipe'
            {
             before(grammarAccess.getFlowSegmentAccess().getPipeKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FlowSegment__Group__0__Impl3303); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1695:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1699:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1700:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13334);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13337);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1707:1: rule__FlowSegment__Group__1__Impl : ( ( rule__FlowSegment__NameAssignment_1 ) ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1711:1: ( ( ( rule__FlowSegment__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1712:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1712:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1713:1: ( rule__FlowSegment__NameAssignment_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1714:1: ( rule__FlowSegment__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1714:2: rule__FlowSegment__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3364);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1724:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1728:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1729:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23394);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23397);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1736:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1740:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1741:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1741:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1742:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1743:1: ( rule__FlowSegment__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1743:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3424);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1753:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1757:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1758:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33455);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33458);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1765:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1769:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1770:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1770:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1771:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1772:1: ( rule__FlowSegment__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1772:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3485);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1782:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1786:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1787:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43516);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43519);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1794:1: rule__FlowSegment__Group__4__Impl : ( 'Placement' ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1798:1: ( ( 'Placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1799:1: ( 'Placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1799:1: ( 'Placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1800:1: 'Placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FlowSegment__Group__4__Impl3547); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1813:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1817:1: ( rule__FlowSegment__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1818:2: rule__FlowSegment__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53578);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1824:1: rule__FlowSegment__Group__5__Impl : ( ( rule__FlowSegment__PlacementAssignment_5 ) ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1828:1: ( ( ( rule__FlowSegment__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1829:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1829:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1830:1: ( rule__FlowSegment__PlacementAssignment_5 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:1: ( rule__FlowSegment__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:2: rule__FlowSegment__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3605);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1853:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1857:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1858:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03647);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03650);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1865:1: rule__FlowSegment__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1869:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1870:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1870:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1871:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl3678); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1884:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1888:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1889:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13709);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1895:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1899:1: ( ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1900:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1900:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1901:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1902:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1902:2: rule__FlowSegment__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3736);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1916:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1920:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1921:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03770);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03773);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1928:1: rule__FlowSegment__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1932:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1933:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1933:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1934:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl3801); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1947:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1951:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1952:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13832);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1958:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1962:1: ( ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1963:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1963:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1964:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1965:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1965:2: rule__FlowSegment__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3859);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1979:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1983:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1984:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03893);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03896);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1991:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1995:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1996:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1996:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1997:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1998:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2000:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2010:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2014:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2015:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13954);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13957);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2022:1: rule__LocalPlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2026:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2027:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2027:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2028:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__LocalPlacement__Group__1__Impl3985); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2041:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2045:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2046:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__24016);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__24019);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2053:1: rule__LocalPlacement__Group__2__Impl : ( ( rule__LocalPlacement__Group_2__0 )? ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2057:1: ( ( ( rule__LocalPlacement__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2058:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2058:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2059:1: ( rule__LocalPlacement__Group_2__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2060:1: ( rule__LocalPlacement__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2060:2: rule__LocalPlacement__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl4046);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2070:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2074:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2075:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__34077);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__34080);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2082:1: rule__LocalPlacement__Group__3__Impl : ( 'Axis2Placement3d' ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2086:1: ( ( 'Axis2Placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2087:1: ( 'Axis2Placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2087:1: ( 'Axis2Placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2088:1: 'Axis2Placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2Placement3dKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__LocalPlacement__Group__3__Impl4108); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2101:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2105:1: ( rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2106:2: rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44139);
            rule__LocalPlacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__44142);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2113:1: rule__LocalPlacement__Group__4__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2117:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_4 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2119:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2120:1: ( rule__LocalPlacement__Axis2placement3dAssignment_4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2120:2: rule__LocalPlacement__Axis2placement3dAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_in_rule__LocalPlacement__Group__4__Impl4169);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2130:1: rule__LocalPlacement__Group__5 : rule__LocalPlacement__Group__5__Impl ;
    public final void rule__LocalPlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2134:1: ( rule__LocalPlacement__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2135:2: rule__LocalPlacement__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__54199);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2141:1: rule__LocalPlacement__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2145:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2146:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2146:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2147:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LocalPlacement__Group__5__Impl4227); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2172:1: rule__LocalPlacement__Group_2__0 : rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 ;
    public final void rule__LocalPlacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2176:1: ( rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2177:2: rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04270);
            rule__LocalPlacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04273);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2184:1: rule__LocalPlacement__Group_2__0__Impl : ( 'RelativeTo' ) ;
    public final void rule__LocalPlacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2188:1: ( ( 'RelativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2189:1: ( 'RelativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2189:1: ( 'RelativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2190:1: 'RelativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4301); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2203:1: rule__LocalPlacement__Group_2__1 : rule__LocalPlacement__Group_2__1__Impl ;
    public final void rule__LocalPlacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2207:1: ( rule__LocalPlacement__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2208:2: rule__LocalPlacement__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14332);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2214:1: rule__LocalPlacement__Group_2__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) ;
    public final void rule__LocalPlacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2218:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2219:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2219:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2220:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2221:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2221:2: rule__LocalPlacement__RelativeToAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4359);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2235:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2239:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2240:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04393);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04396);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2247:1: rule__Axis2Placement3D__Group__0__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2251:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2252:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2252:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2253:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Axis2Placement3D__Group__0__Impl4424); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2266:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2270:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2271:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14455);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14458);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2278:1: rule__Axis2Placement3D__Group__1__Impl : ( 'Cartesian' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2282:1: ( ( 'Cartesian' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2283:1: ( 'Cartesian' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2283:1: ( 'Cartesian' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2284:1: 'Cartesian'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Axis2Placement3D__Group__1__Impl4486); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2297:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2301:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2302:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24517);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24520);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2309:1: rule__Axis2Placement3D__Group__2__Impl : ( '(' ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2313:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2314:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2314:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2315:1: '('
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Axis2Placement3D__Group__2__Impl4548); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2328:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2332:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2333:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34579);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34582);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2340:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2344:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2345:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2345:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2346:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:2: rule__Axis2Placement3D__CartesianXAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4609);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2357:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2361:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2362:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44639);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44642);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:1: rule__Axis2Placement3D__Group__4__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2373:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2374:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2374:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2375:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Axis2Placement3D__Group__4__Impl4670); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2388:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2392:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2393:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54701);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54704);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2400:1: rule__Axis2Placement3D__Group__5__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2404:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2405:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2405:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2406:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2407:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2407:2: rule__Axis2Placement3D__CartesianYAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4731);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2417:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2421:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2422:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64761);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64764);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:1: rule__Axis2Placement3D__Group__6__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2433:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2434:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2434:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2435:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Axis2Placement3D__Group__6__Impl4792); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2448:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2452:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2453:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74823);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74826);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2460:1: rule__Axis2Placement3D__Group__7__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2464:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2465:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2465:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2466:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2467:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2467:2: rule__Axis2Placement3D__CartesianZAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4853);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2477:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2481:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2482:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84883);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84886);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2489:1: rule__Axis2Placement3D__Group__8__Impl : ( ')' ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2493:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2494:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2494:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2495:1: ')'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Axis2Placement3D__Group__8__Impl4914); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2508:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2512:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2513:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94945);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94948);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2520:1: rule__Axis2Placement3D__Group__9__Impl : ( 'Axis' ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2524:1: ( ( 'Axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2525:1: ( 'Axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2525:1: ( 'Axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2526:1: 'Axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Axis2Placement3D__Group__9__Impl4976); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2539:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2543:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2544:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__105007);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__105010);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2551:1: rule__Axis2Placement3D__Group__10__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2555:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2556:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2556:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2557:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_10()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:2: rule__Axis2Placement3D__AxisAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl5037);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2568:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2572:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2573:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__115067);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115070);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2580:1: rule__Axis2Placement3D__Group__11__Impl : ( 'RefDirection' ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2584:1: ( ( 'RefDirection' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2585:1: ( 'RefDirection' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2585:1: ( 'RefDirection' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2586:1: 'RefDirection'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_11()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Axis2Placement3D__Group__11__Impl5098); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2599:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2603:1: ( rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2604:2: rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125129);
            rule__Axis2Placement3D__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125132);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2611:1: rule__Axis2Placement3D__Group__12__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2615:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2616:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2616:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2617:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_12()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2618:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2618:2: rule__Axis2Placement3D__RefDirectionAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5159);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2628:1: rule__Axis2Placement3D__Group__13 : rule__Axis2Placement3D__Group__13__Impl ;
    public final void rule__Axis2Placement3D__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2632:1: ( rule__Axis2Placement3D__Group__13__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2633:2: rule__Axis2Placement3D__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135189);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2639:1: rule__Axis2Placement3D__Group__13__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2643:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2644:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2644:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2645:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5217); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2686:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2690:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2691:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05276);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05279);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2698:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2702:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2703:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2703:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2704:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2705:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2706:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group__0__Impl5308); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2717:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2721:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2722:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15341);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15344);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2729:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2733:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2734:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2734:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2735:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2736:1: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2736:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5372); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2746:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2750:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2751:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25403);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25406);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2758:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2762:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2763:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2763:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2764:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group__2__Impl5434); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2777:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2781:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2782:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35465);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35468);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2789:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2793:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2794:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2794:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2795:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5495); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2806:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2810:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2811:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45524);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2817:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2821:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2822:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2822:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2823:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2824:1: ( rule__EDouble__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=11 && LA16_0<=12)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2824:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5551);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2844:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2848:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2849:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05592);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05595);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2856:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2860:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2861:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2861:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2862:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2863:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2863:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5622);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2873:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2877:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2878:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15652);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15655);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2885:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2889:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2890:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2890:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2891:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2892:1: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2893:2: '-'
                    {
                    match(input,33,FollowSets000.FOLLOW_33_in_rule__EDouble__Group_4__1__Impl5684); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2904:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2908:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2909:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25717);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2915:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2919:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2920:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2920:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2921:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5744); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2938:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2942:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2943:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05779);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05782);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2950:1: rule__Direction__Group__0__Impl : ( '(' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2954:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2955:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2955:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2956:1: '('
            {
             before(grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Direction__Group__0__Impl5810); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2969:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2973:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2974:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15841);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15844);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2981:1: rule__Direction__Group__1__Impl : ( ( rule__Direction__XAssignment_1 ) ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2985:1: ( ( ( rule__Direction__XAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2986:1: ( ( rule__Direction__XAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2986:1: ( ( rule__Direction__XAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2987:1: ( rule__Direction__XAssignment_1 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2988:1: ( rule__Direction__XAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2988:2: rule__Direction__XAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5871);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2998:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3002:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25901);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25904);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:1: rule__Direction__Group__2__Impl : ( ',' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3014:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3015:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3015:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3016:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Direction__Group__2__Impl5932); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3029:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3033:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3034:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35963);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35966);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3041:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__YAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3045:1: ( ( ( rule__Direction__YAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3046:1: ( ( rule__Direction__YAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3046:1: ( ( rule__Direction__YAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3047:1: ( rule__Direction__YAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3048:1: ( rule__Direction__YAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3048:2: rule__Direction__YAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5993);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3058:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3062:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3063:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__46023);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__46026);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3070:1: rule__Direction__Group__4__Impl : ( ( rule__Direction__Group_4__0 )? ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3074:1: ( ( ( rule__Direction__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3075:1: ( ( rule__Direction__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3075:1: ( ( rule__Direction__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3076:1: ( rule__Direction__Group_4__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3077:1: ( rule__Direction__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3077:2: rule__Direction__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl6053);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3087:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3091:1: ( rule__Direction__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3092:2: rule__Direction__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56084);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3098:1: rule__Direction__Group__5__Impl : ( ')' ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3102:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3103:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3103:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3104:1: ')'
            {
             before(grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Direction__Group__5__Impl6112); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3129:1: rule__Direction__Group_4__0 : rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 ;
    public final void rule__Direction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3133:1: ( rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3134:2: rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06155);
            rule__Direction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06158);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3141:1: rule__Direction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Direction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3145:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3146:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3146:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3147:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_4_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Direction__Group_4__0__Impl6186); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3160:1: rule__Direction__Group_4__1 : rule__Direction__Group_4__1__Impl ;
    public final void rule__Direction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3164:1: ( rule__Direction__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3165:2: rule__Direction__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16217);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3171:1: rule__Direction__Group_4__1__Impl : ( ( rule__Direction__ZAssignment_4_1 ) ) ;
    public final void rule__Direction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3175:1: ( ( ( rule__Direction__ZAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3176:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3176:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3177:1: ( rule__Direction__ZAssignment_4_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3178:1: ( rule__Direction__ZAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3178:2: rule__Direction__ZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6244);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3193:1: rule__Model__ElementsAssignment_2 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3197:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3199:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26283);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3208:1: rule__Model__ElementsAssignment_3_1 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3212:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3213:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3213:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3214:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16314);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3223:1: rule__Model__ElementsAssignment_5 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3227:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3228:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3228:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3229:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56345);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3238:1: rule__Model__ElementsAssignment_6_1 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3242:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3243:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3243:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3244:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16376);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3253:1: rule__Model__ElementsAssignment_8 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3257:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3258:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3258:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3259:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86407);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3268:1: rule__Model__ElementsAssignment_9_1 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3272:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3273:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3273:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3274:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16438);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3283:1: rule__WallRule__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__WallRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3287:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3288:1: ( RULE_STRING )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3288:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3289:1: RULE_STRING
            {
             before(grammarAccess.getWallRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__WallRule__NameAssignment_16469); 
             after(grammarAccess.getWallRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3298:1: rule__WallRule__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__WallRule__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3302:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3303:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3303:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3304:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_2_16500);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3313:1: rule__WallRule__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__WallRule__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3317:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3318:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3318:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3319:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_3_16531);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3328:1: rule__WallRule__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__WallRule__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3332:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3333:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3333:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3334:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_56562);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3343:1: rule__Opening__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3347:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3348:1: ( RULE_STRING )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3348:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3349:1: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Opening__NameAssignment_16593); 
             after(grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3358:1: rule__Opening__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3362:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3363:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3363:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3364:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16624);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3373:1: rule__Opening__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3377:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3378:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3378:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3379:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16655);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3388:1: rule__Opening__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3392:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3393:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3393:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3394:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56686);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3403:1: rule__Opening__WallsAssignment_6_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Opening__WallsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3407:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3408:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3408:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3409:1: ( RULE_STRING )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3410:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3411:1: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_6_16721); 
             after(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_6_1_0_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3422:1: rule__Opening__WallsAssignment_6_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Opening__WallsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3426:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3427:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3427:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3428:1: ( RULE_STRING )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_2_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3429:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3430:1: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_6_2_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_6_2_16760); 
             after(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_6_2_1_0_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3441:1: rule__FlowSegment__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FlowSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3445:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3446:1: ( RULE_STRING )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3446:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3447:1: RULE_STRING
            {
             before(grammarAccess.getFlowSegmentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__FlowSegment__NameAssignment_16795); 
             after(grammarAccess.getFlowSegmentAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3456:1: rule__FlowSegment__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3460:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3461:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3461:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3462:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16826);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3471:1: rule__FlowSegment__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3475:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3476:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3476:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3477:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16857);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3486:1: rule__FlowSegment__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3490:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3491:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3491:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3492:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56888);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3501:1: rule__LocalPlacement__RelativeToAssignment_2_1 : ( ruleLocalPlacement ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3505:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3506:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3506:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3507:1: ruleLocalPlacement
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16919);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3516:1: rule__LocalPlacement__Axis2placement3dAssignment_4 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3520:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3521:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3521:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3522:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_46950);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3531:1: rule__Axis2Placement3D__CartesianXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3535:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3536:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3536:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3537:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36981);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3546:1: rule__Axis2Placement3D__CartesianYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3550:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3551:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3551:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3552:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_57012);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3561:1: rule__Axis2Placement3D__CartesianZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3565:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3566:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3566:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3567:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_77043);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3576:1: rule__Axis2Placement3D__AxisAssignment_10 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3580:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3581:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3581:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3582:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107074);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3591:1: rule__Axis2Placement3D__RefDirectionAssignment_12 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3595:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3596:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3596:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3597:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127105);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3606:1: rule__Direction__XAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3610:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3611:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3611:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3612:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17136);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3621:1: rule__Direction__YAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3625:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3626:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3626:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3627:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37167);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3636:1: rule__Direction__ZAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3640:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3641:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3641:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3642:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17198);
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
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_entryRuleWallRule180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRule187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0_in_ruleWallRule213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0_in_ruleOpening273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement360 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D420 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection540 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0_in_ruleDirection573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0662 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1723 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__2785 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_2_in_rule__Model__Group__2__Impl815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__3845 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl875 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__4906 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__4909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__4__Impl937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__5968 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__5971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_5_in_rule__Model__Group__5__Impl998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61028 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__0_in_rule__Model__Group__6__Impl1058 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71089 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Model__Group__8_in_rule__Model__Group__71092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__7__Impl1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__8__Impl_in_rule__Model__Group__81151 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Model__Group__9_in_rule__Model__Group__81154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_8_in_rule__Model__Group__8__Impl1181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__9__Impl_in_rule__Model__Group__91211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__0_in_rule__Model__Group__9__Impl1238 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01289 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_3__0__Impl1320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_1_in_rule__Model__Group_3__1__Impl1378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__0__Impl_in_rule__Model__Group_6__01412 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Model__Group_6__1_in_rule__Model__Group_6__01415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_6__0__Impl1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_6__1__Impl_in_rule__Model__Group_6__11474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_6_1_in_rule__Model__Group_6__1__Impl1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01535 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_9__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__WallRule__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11720 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21780 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__0_in_rule__WallRule__Group__2__Impl1810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31841 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__0_in_rule__WallRule__Group__3__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41902 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WallRule__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__51964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__PlacementAssignment_5_in_rule__WallRule__Group__5__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__0__Impl_in_rule__WallRule__Group_2__02033 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__1_in_rule__WallRule__Group_2__02036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WallRule__Group_2__0__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_2__1__Impl_in_rule__WallRule__Group_2__12095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__ElementNameAssignment_2_1_in_rule__WallRule__Group_2__1__Impl2122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__0__Impl_in_rule__WallRule__Group_3__02156 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__1_in_rule__WallRule__Group_3__02159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WallRule__Group_3__0__Impl2187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group_3__1__Impl_in_rule__WallRule__Group_3__12218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__DescriptionAssignment_3_1_in_rule__WallRule__Group_3__1__Impl2245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02279 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group__0__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12341 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22401 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32462 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42523 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Opening__Group__4__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52585 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__0_in_rule__Opening__Group__6__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02717 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_2__0__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2806 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02840 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group_3__0__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__0__Impl_in_rule__Opening__Group_6__02963 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__1_in_rule__Opening__Group_6__02966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Opening__Group_6__0__Impl2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__1__Impl_in_rule__Opening__Group_6__13025 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__2_in_rule__Opening__Group_6__13028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_6_1_in_rule__Opening__Group_6__1__Impl3055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6__2__Impl_in_rule__Opening__Group_6__23085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__0_in_rule__Opening__Group_6__2__Impl3112 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__0__Impl_in_rule__Opening__Group_6_2__03149 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__1_in_rule__Opening__Group_6_2__03152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Opening__Group_6_2__0__Impl3180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_6_2__1__Impl_in_rule__Opening__Group_6_2__13211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_6_2_1_in_rule__Opening__Group_6_2__1__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03272 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FlowSegment__Group__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13334 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23394 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33455 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43516 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FlowSegment__Group__4__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03647 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03770 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl3801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03893 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03896 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13954 = new BitSet(new long[]{0x000000000A000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__LocalPlacement__Group__1__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__24016 = new BitSet(new long[]{0x000000000A000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__24019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl4046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__34077 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__34080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__LocalPlacement__Group__3__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__44139 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__44142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_4_in_rule__LocalPlacement__Group__4__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__54199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LocalPlacement__Group__5__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04270 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04393 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Axis2Placement3D__Group__0__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14455 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Axis2Placement3D__Group__1__Impl4486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24517 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Axis2Placement3D__Group__2__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34579 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44639 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Axis2Placement3D__Group__4__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54701 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64761 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Axis2Placement3D__Group__6__Impl4792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74823 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84883 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Axis2Placement3D__Group__8__Impl4914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94945 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Axis2Placement3D__Group__9__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__105007 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__105010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__115067 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__115070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Axis2Placement3D__Group__11__Impl5098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125129 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135189 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05276 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group__0__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15341 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25403 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group__2__Impl5434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35465 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05592 = new BitSet(new long[]{0x0000000200000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15652 = new BitSet(new long[]{0x0000000200000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__EDouble__Group_4__1__Impl5684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05779 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Direction__Group__0__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15841 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25901 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Direction__Group__2__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35963 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__46023 = new BitSet(new long[]{0x0000000040400000L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__46026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__56084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Direction__Group__5__Impl6112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06155 = new BitSet(new long[]{0x0000000600000020L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Direction__Group_4__0__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__WallRule__NameAssignment_16469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_2_16500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_3_16531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_56562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Opening__NameAssignment_16593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_6_16721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_6_2_16760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__FlowSegment__NameAssignment_16795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_46950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_57012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_77043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_107074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_127105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17198 = new BitSet(new long[]{0x0000000000000002L});
    }


}