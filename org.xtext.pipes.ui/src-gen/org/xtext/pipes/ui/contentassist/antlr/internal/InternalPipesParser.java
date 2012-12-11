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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Walls'", "'Openings'", "'Pipes'", "'and'", "'Wall'", "'Name'", "'Description'", "'placement'", "'Opening'", "'walls'", "','", "'Pipe'", "'{'", "'}'", "'relativeTo'", "'axis2placement3d'", "'cartesian'", "'('", "')'", "'axis'", "'refDir'", "'-'", "'.'"
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
    public static final int T__35=35;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:918:1: rule__WallRule__Group__2__Impl : ( 'Name' ) ;
    public final void rule__WallRule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:922:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:923:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:923:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:924:1: 'Name'
            {
             before(grammarAccess.getWallRuleAccess().getNameKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WallRule__Group__2__Impl1811); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:937:1: rule__WallRule__Group__3 : rule__WallRule__Group__3__Impl rule__WallRule__Group__4 ;
    public final void rule__WallRule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:941:1: ( rule__WallRule__Group__3__Impl rule__WallRule__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:942:2: rule__WallRule__Group__3__Impl rule__WallRule__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31842);
            rule__WallRule__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31845);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:949:1: rule__WallRule__Group__3__Impl : ( ( rule__WallRule__ElementNameAssignment_3 ) ) ;
    public final void rule__WallRule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:953:1: ( ( ( rule__WallRule__ElementNameAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:954:1: ( ( rule__WallRule__ElementNameAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:954:1: ( ( rule__WallRule__ElementNameAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:955:1: ( rule__WallRule__ElementNameAssignment_3 )
            {
             before(grammarAccess.getWallRuleAccess().getElementNameAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:956:1: ( rule__WallRule__ElementNameAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:956:2: rule__WallRule__ElementNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__ElementNameAssignment_3_in_rule__WallRule__Group__3__Impl1872);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:966:1: rule__WallRule__Group__4 : rule__WallRule__Group__4__Impl rule__WallRule__Group__5 ;
    public final void rule__WallRule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:970:1: ( rule__WallRule__Group__4__Impl rule__WallRule__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:971:2: rule__WallRule__Group__4__Impl rule__WallRule__Group__5
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:978:1: rule__WallRule__Group__4__Impl : ( 'Description' ) ;
    public final void rule__WallRule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:982:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:983:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:983:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:984:1: 'Description'
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionKeyword_4()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WallRule__Group__4__Impl1933); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:997:1: rule__WallRule__Group__5 : rule__WallRule__Group__5__Impl rule__WallRule__Group__6 ;
    public final void rule__WallRule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1001:1: ( rule__WallRule__Group__5__Impl rule__WallRule__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1002:2: rule__WallRule__Group__5__Impl rule__WallRule__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__51964);
            rule__WallRule__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__6_in_rule__WallRule__Group__51967);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1009:1: rule__WallRule__Group__5__Impl : ( ( rule__WallRule__DescriptionAssignment_5 ) ) ;
    public final void rule__WallRule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1013:1: ( ( ( rule__WallRule__DescriptionAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1014:1: ( ( rule__WallRule__DescriptionAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1014:1: ( ( rule__WallRule__DescriptionAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1015:1: ( rule__WallRule__DescriptionAssignment_5 )
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1016:1: ( rule__WallRule__DescriptionAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1016:2: rule__WallRule__DescriptionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__DescriptionAssignment_5_in_rule__WallRule__Group__5__Impl1994);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1026:1: rule__WallRule__Group__6 : rule__WallRule__Group__6__Impl rule__WallRule__Group__7 ;
    public final void rule__WallRule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1030:1: ( rule__WallRule__Group__6__Impl rule__WallRule__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1031:2: rule__WallRule__Group__6__Impl rule__WallRule__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__6__Impl_in_rule__WallRule__Group__62024);
            rule__WallRule__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__7_in_rule__WallRule__Group__62027);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1038:1: rule__WallRule__Group__6__Impl : ( 'placement' ) ;
    public final void rule__WallRule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1042:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1043:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1043:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1044:1: 'placement'
            {
             before(grammarAccess.getWallRuleAccess().getPlacementKeyword_6()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WallRule__Group__6__Impl2055); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1057:1: rule__WallRule__Group__7 : rule__WallRule__Group__7__Impl ;
    public final void rule__WallRule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1061:1: ( rule__WallRule__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1062:2: rule__WallRule__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__Group__7__Impl_in_rule__WallRule__Group__72086);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1068:1: rule__WallRule__Group__7__Impl : ( ( rule__WallRule__PlacementAssignment_7 ) ) ;
    public final void rule__WallRule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1072:1: ( ( ( rule__WallRule__PlacementAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1073:1: ( ( rule__WallRule__PlacementAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1073:1: ( ( rule__WallRule__PlacementAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1074:1: ( rule__WallRule__PlacementAssignment_7 )
            {
             before(grammarAccess.getWallRuleAccess().getPlacementAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1075:1: ( rule__WallRule__PlacementAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1075:2: rule__WallRule__PlacementAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRule__PlacementAssignment_7_in_rule__WallRule__Group__7__Impl2113);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1101:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1105:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1106:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02159);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02162);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1113:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1117:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1118:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1118:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1119:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group__0__Impl2190); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1132:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1136:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1137:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12221);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12224);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1144:1: rule__Opening__Group__1__Impl : ( ( rule__Opening__NameAssignment_1 ) ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1148:1: ( ( ( rule__Opening__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1149:1: ( ( rule__Opening__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1149:1: ( ( rule__Opening__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1150:1: ( rule__Opening__NameAssignment_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1151:1: ( rule__Opening__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1151:2: rule__Opening__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2251);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1161:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1165:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1166:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22281);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22284);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1173:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1177:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1178:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1178:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1179:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1180:1: ( rule__Opening__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1180:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2311);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1190:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1194:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1195:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32342);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32345);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1202:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1206:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1207:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1207:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1208:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1209:1: ( rule__Opening__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1209:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2372);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1219:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1223:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1224:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42403);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42406);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1231:1: rule__Opening__Group__4__Impl : ( 'placement' ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1235:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1236:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1236:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1237:1: 'placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group__4__Impl2434); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1250:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1254:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1255:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52465);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52468);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1262:1: rule__Opening__Group__5__Impl : ( ( rule__Opening__PlacementAssignment_5 ) ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1266:1: ( ( ( rule__Opening__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1267:1: ( ( rule__Opening__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1268:1: ( rule__Opening__PlacementAssignment_5 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1269:1: ( rule__Opening__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1269:2: rule__Opening__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2495);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1279:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl rule__Opening__Group__7 ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1283:1: ( rule__Opening__Group__6__Impl rule__Opening__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1284:2: rule__Opening__Group__6__Impl rule__Opening__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62525);
            rule__Opening__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__62528);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1291:1: rule__Opening__Group__6__Impl : ( 'walls' ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1295:1: ( ( 'walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1296:1: ( 'walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1296:1: ( 'walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1297:1: 'walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Opening__Group__6__Impl2556); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1310:1: rule__Opening__Group__7 : rule__Opening__Group__7__Impl rule__Opening__Group__8 ;
    public final void rule__Opening__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1314:1: ( rule__Opening__Group__7__Impl rule__Opening__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1315:2: rule__Opening__Group__7__Impl rule__Opening__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__72587);
            rule__Opening__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__72590);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1322:1: rule__Opening__Group__7__Impl : ( ( rule__Opening__WallsAssignment_7 ) ) ;
    public final void rule__Opening__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1326:1: ( ( ( rule__Opening__WallsAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1327:1: ( ( rule__Opening__WallsAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1327:1: ( ( rule__Opening__WallsAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1328:1: ( rule__Opening__WallsAssignment_7 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:1: ( rule__Opening__WallsAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1329:2: rule__Opening__WallsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_in_rule__Opening__Group__7__Impl2617);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1339:1: rule__Opening__Group__8 : rule__Opening__Group__8__Impl ;
    public final void rule__Opening__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1343:1: ( rule__Opening__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:2: rule__Opening__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__82647);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1350:1: rule__Opening__Group__8__Impl : ( ( rule__Opening__Group_8__0 )* ) ;
    public final void rule__Opening__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1354:1: ( ( ( rule__Opening__Group_8__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1355:1: ( ( rule__Opening__Group_8__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1355:1: ( ( rule__Opening__Group_8__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1356:1: ( rule__Opening__Group_8__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1357:1: ( rule__Opening__Group_8__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1357:2: rule__Opening__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__0_in_rule__Opening__Group__8__Impl2674);
            	    rule__Opening__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1385:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1389:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1390:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02723);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02726);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1397:1: rule__Opening__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1401:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1402:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1402:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1403:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Opening__Group_2__0__Impl2754); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1416:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1420:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1421:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12785);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1427:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__ElementNameAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1431:1: ( ( ( rule__Opening__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1432:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1432:1: ( ( rule__Opening__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1433:1: ( rule__Opening__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1434:1: ( rule__Opening__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1434:2: rule__Opening__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2812);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1448:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1452:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1453:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02846);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02849);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1460:1: rule__Opening__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1464:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1465:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1465:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1466:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_3__0__Impl2877); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1479:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1483:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1484:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12908);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1490:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__DescriptionAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1494:1: ( ( ( rule__Opening__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1495:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1495:1: ( ( rule__Opening__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1496:1: ( rule__Opening__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1497:1: ( rule__Opening__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1497:2: rule__Opening__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2935);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1511:1: rule__Opening__Group_8__0 : rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1 ;
    public final void rule__Opening__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1515:1: ( rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1516:2: rule__Opening__Group_8__0__Impl rule__Opening__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__0__Impl_in_rule__Opening__Group_8__02969);
            rule__Opening__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__1_in_rule__Opening__Group_8__02972);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1523:1: rule__Opening__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1527:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1528:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1528:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1529:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_8_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Opening__Group_8__0__Impl3000); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1542:1: rule__Opening__Group_8__1 : rule__Opening__Group_8__1__Impl ;
    public final void rule__Opening__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1546:1: ( rule__Opening__Group_8__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1547:2: rule__Opening__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_8__1__Impl_in_rule__Opening__Group_8__13031);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1553:1: rule__Opening__Group_8__1__Impl : ( ( rule__Opening__WallsAssignment_8_1 ) ) ;
    public final void rule__Opening__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1557:1: ( ( ( rule__Opening__WallsAssignment_8_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1558:1: ( ( rule__Opening__WallsAssignment_8_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1558:1: ( ( rule__Opening__WallsAssignment_8_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1559:1: ( rule__Opening__WallsAssignment_8_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_8_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1560:1: ( rule__Opening__WallsAssignment_8_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1560:2: rule__Opening__WallsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_8_1_in_rule__Opening__Group_8__1__Impl3058);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1574:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1578:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1579:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03092);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03095);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1586:1: rule__FlowSegment__Group__0__Impl : ( 'Pipe' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1590:1: ( ( 'Pipe' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1591:1: ( 'Pipe' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1591:1: ( 'Pipe' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1592:1: 'Pipe'
            {
             before(grammarAccess.getFlowSegmentAccess().getPipeKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__FlowSegment__Group__0__Impl3123); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1605:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1609:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1610:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13154);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13157);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1617:1: rule__FlowSegment__Group__1__Impl : ( ( rule__FlowSegment__NameAssignment_1 ) ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1621:1: ( ( ( rule__FlowSegment__NameAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1622:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1622:1: ( ( rule__FlowSegment__NameAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1623:1: ( rule__FlowSegment__NameAssignment_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1624:1: ( rule__FlowSegment__NameAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1624:2: rule__FlowSegment__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3184);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1634:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1638:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1639:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23214);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23217);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1646:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1650:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1651:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1651:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1652:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1653:1: ( rule__FlowSegment__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1653:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3244);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1663:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1667:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1668:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33275);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33278);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1675:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1679:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1681:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1682:1: ( rule__FlowSegment__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1682:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3305);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1692:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1696:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1697:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43336);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43339);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1704:1: rule__FlowSegment__Group__4__Impl : ( 'placement' ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1708:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1709:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1709:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1710:1: 'placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group__4__Impl3367); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1723:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1727:1: ( rule__FlowSegment__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1728:2: rule__FlowSegment__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53398);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1734:1: rule__FlowSegment__Group__5__Impl : ( ( rule__FlowSegment__PlacementAssignment_5 ) ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1738:1: ( ( ( rule__FlowSegment__PlacementAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1739:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1739:1: ( ( rule__FlowSegment__PlacementAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1740:1: ( rule__FlowSegment__PlacementAssignment_5 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1741:1: ( rule__FlowSegment__PlacementAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1741:2: rule__FlowSegment__PlacementAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3425);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1763:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1767:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1768:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03467);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03470);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1775:1: rule__FlowSegment__Group_2__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1779:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1780:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1780:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1781:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FlowSegment__Group_2__0__Impl3498); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1794:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1798:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1799:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13529);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1805:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1809:1: ( ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1810:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1810:1: ( ( rule__FlowSegment__ElementNameAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1811:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1812:1: ( rule__FlowSegment__ElementNameAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1812:2: rule__FlowSegment__ElementNameAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3556);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1826:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1830:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1831:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03590);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03593);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1838:1: rule__FlowSegment__Group_3__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1842:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1843:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1843:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1844:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_3__0__Impl3621); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1857:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1861:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1862:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13652);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1868:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1872:1: ( ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1873:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1873:1: ( ( rule__FlowSegment__DescriptionAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1874:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1875:1: ( rule__FlowSegment__DescriptionAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1875:2: rule__FlowSegment__DescriptionAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3679);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1889:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1893:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1894:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03713);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03716);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1901:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1905:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1906:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1906:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1907:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1908:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1910:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1920:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1924:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1925:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13774);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13777);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1932:1: rule__LocalPlacement__Group__1__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1936:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1937:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1937:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1938:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__LocalPlacement__Group__1__Impl3805); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1951:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1955:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1956:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__23836);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__23839);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1963:1: rule__LocalPlacement__Group__2__Impl : ( ( rule__LocalPlacement__Group_2__0 )? ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1967:1: ( ( ( rule__LocalPlacement__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1968:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1968:1: ( ( rule__LocalPlacement__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1969:1: ( rule__LocalPlacement__Group_2__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1970:1: ( rule__LocalPlacement__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1970:2: rule__LocalPlacement__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl3866);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1980:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1984:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1985:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__33897);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__33900);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1992:1: rule__LocalPlacement__Group__3__Impl : ( ( rule__LocalPlacement__Group_3__0 )? ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1996:1: ( ( ( rule__LocalPlacement__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1997:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1997:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1998:1: ( rule__LocalPlacement__Group_3__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1999:1: ( rule__LocalPlacement__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1999:2: rule__LocalPlacement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl3927);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2009:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2013:1: ( rule__LocalPlacement__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2014:2: rule__LocalPlacement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__43958);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2020:1: rule__LocalPlacement__Group__4__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2024:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2025:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2025:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2026:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__LocalPlacement__Group__4__Impl3986); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2049:1: rule__LocalPlacement__Group_2__0 : rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 ;
    public final void rule__LocalPlacement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2053:1: ( rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2054:2: rule__LocalPlacement__Group_2__0__Impl rule__LocalPlacement__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04027);
            rule__LocalPlacement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04030);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2061:1: rule__LocalPlacement__Group_2__0__Impl : ( 'relativeTo' ) ;
    public final void rule__LocalPlacement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2065:1: ( ( 'relativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2066:1: ( 'relativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2066:1: ( 'relativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2067:1: 'relativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4058); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2080:1: rule__LocalPlacement__Group_2__1 : rule__LocalPlacement__Group_2__1__Impl ;
    public final void rule__LocalPlacement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2084:1: ( rule__LocalPlacement__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2085:2: rule__LocalPlacement__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14089);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2091:1: rule__LocalPlacement__Group_2__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) ;
    public final void rule__LocalPlacement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2095:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2096:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2096:1: ( ( rule__LocalPlacement__RelativeToAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2097:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2098:1: ( rule__LocalPlacement__RelativeToAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2098:2: rule__LocalPlacement__RelativeToAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4116);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2112:1: rule__LocalPlacement__Group_3__0 : rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 ;
    public final void rule__LocalPlacement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2116:1: ( rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2117:2: rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__04150);
            rule__LocalPlacement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__04153);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2124:1: rule__LocalPlacement__Group_3__0__Impl : ( 'axis2placement3d' ) ;
    public final void rule__LocalPlacement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2128:1: ( ( 'axis2placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2129:1: ( 'axis2placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2129:1: ( 'axis2placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2130:1: 'axis2placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl4181); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2143:1: rule__LocalPlacement__Group_3__1 : rule__LocalPlacement__Group_3__1__Impl ;
    public final void rule__LocalPlacement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2147:1: ( rule__LocalPlacement__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2148:2: rule__LocalPlacement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__14212);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2154:1: rule__LocalPlacement__Group_3__1__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) ) ;
    public final void rule__LocalPlacement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2158:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2159:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2159:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2160:1: ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2161:1: ( rule__LocalPlacement__Axis2placement3dAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2161:2: rule__LocalPlacement__Axis2placement3dAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl4239);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2175:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2179:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2180:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04273);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04276);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2187:1: rule__Axis2Placement3D__Group__0__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2191:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2192:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2192:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2193:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Axis2Placement3D__Group__0__Impl4304); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2206:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2210:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2211:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14335);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14338);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2218:1: rule__Axis2Placement3D__Group__1__Impl : ( 'cartesian' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2222:1: ( ( 'cartesian' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2223:1: ( 'cartesian' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2223:1: ( 'cartesian' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2224:1: 'cartesian'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Axis2Placement3D__Group__1__Impl4366); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2237:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2241:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2242:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24397);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24400);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2249:1: rule__Axis2Placement3D__Group__2__Impl : ( '(' ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2253:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2254:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2254:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2255:1: '('
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Axis2Placement3D__Group__2__Impl4428); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2268:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2272:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2273:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34459);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34462);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2280:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2284:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2285:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2285:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2286:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2287:1: ( rule__Axis2Placement3D__CartesianXAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2287:2: rule__Axis2Placement3D__CartesianXAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4489);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2297:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2301:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2302:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44519);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44522);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2309:1: rule__Axis2Placement3D__Group__4__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2313:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2314:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2314:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2315:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Axis2Placement3D__Group__4__Impl4550); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2328:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2332:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2333:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54581);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54584);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2340:1: rule__Axis2Placement3D__Group__5__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2344:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2345:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2345:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2346:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:1: ( rule__Axis2Placement3D__CartesianYAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:2: rule__Axis2Placement3D__CartesianYAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4611);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2357:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2361:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2362:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64641);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64644);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2369:1: rule__Axis2Placement3D__Group__6__Impl : ( ',' ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2373:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2374:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2374:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2375:1: ','
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Axis2Placement3D__Group__6__Impl4672); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2388:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2392:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2393:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74703);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74706);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2400:1: rule__Axis2Placement3D__Group__7__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2404:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2405:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2405:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_7 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2406:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2407:1: ( rule__Axis2Placement3D__CartesianZAssignment_7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2407:2: rule__Axis2Placement3D__CartesianZAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4733);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2417:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2421:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2422:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84763);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84766);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2429:1: rule__Axis2Placement3D__Group__8__Impl : ( ')' ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2433:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2434:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2434:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2435:1: ')'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Axis2Placement3D__Group__8__Impl4794); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2448:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2452:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2453:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94825);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94828);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2460:1: rule__Axis2Placement3D__Group__9__Impl : ( 'axis' ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2464:1: ( ( 'axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2465:1: ( 'axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2465:1: ( 'axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2466:1: 'axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Axis2Placement3D__Group__9__Impl4856); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2479:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2483:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2484:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__104887);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__104890);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2491:1: rule__Axis2Placement3D__Group__10__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2495:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_10 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2496:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2496:1: ( ( rule__Axis2Placement3D__AxisAssignment_10 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2497:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_10()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2498:1: ( rule__Axis2Placement3D__AxisAssignment_10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2498:2: rule__Axis2Placement3D__AxisAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl4917);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2508:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2512:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2513:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__114947);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__114950);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2520:1: rule__Axis2Placement3D__Group__11__Impl : ( 'refDir' ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2524:1: ( ( 'refDir' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2525:1: ( 'refDir' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2525:1: ( 'refDir' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2526:1: 'refDir'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirKeyword_11()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Axis2Placement3D__Group__11__Impl4978); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2539:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2543:1: ( rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2544:2: rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125009);
            rule__Axis2Placement3D__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125012);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2551:1: rule__Axis2Placement3D__Group__12__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2555:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2556:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2556:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_12 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2557:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_12()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:1: ( rule__Axis2Placement3D__RefDirectionAssignment_12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2558:2: rule__Axis2Placement3D__RefDirectionAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5039);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2568:1: rule__Axis2Placement3D__Group__13 : rule__Axis2Placement3D__Group__13__Impl ;
    public final void rule__Axis2Placement3D__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2572:1: ( rule__Axis2Placement3D__Group__13__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2573:2: rule__Axis2Placement3D__Group__13__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135069);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2579:1: rule__Axis2Placement3D__Group__13__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2583:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2584:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2584:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2585:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5097); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2626:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2630:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2631:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05156);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05159);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2638:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2642:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2643:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2643:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2644:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2645:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2646:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group__0__Impl5188); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2657:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2661:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2662:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15221);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15224);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2669:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2673:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2674:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2674:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2675:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2676:1: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2676:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5252); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2686:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2690:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2691:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25283);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25286);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2698:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2702:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2703:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2703:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2704:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EDouble__Group__2__Impl5314); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2717:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2721:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2722:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35345);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35348);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2729:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2733:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2734:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2734:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2735:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5375); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2746:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2750:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2751:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45404);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2757:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2761:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2762:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2762:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2763:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2764:1: ( rule__EDouble__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=11 && LA14_0<=12)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2764:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5431);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2784:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2788:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2789:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05472);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05475);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2796:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2800:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2801:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2801:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2802:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2803:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2803:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5502);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2813:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2817:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2818:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15532);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15535);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2825:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2829:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2830:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2830:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2831:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2832:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2833:2: '-'
                    {
                    match(input,34,FollowSets000.FOLLOW_34_in_rule__EDouble__Group_4__1__Impl5564); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2844:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2848:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2849:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25597);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2855:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2859:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2860:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2860:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2861:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5624); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2878:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2882:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2883:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05659);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05662);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2890:1: rule__Direction__Group__0__Impl : ( '(' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2894:1: ( ( '(' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2895:1: ( '(' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2895:1: ( '(' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2896:1: '('
            {
             before(grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Direction__Group__0__Impl5690); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2909:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2913:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2914:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15721);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15724);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2921:1: rule__Direction__Group__1__Impl : ( ( rule__Direction__XAssignment_1 ) ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2925:1: ( ( ( rule__Direction__XAssignment_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2926:1: ( ( rule__Direction__XAssignment_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2926:1: ( ( rule__Direction__XAssignment_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2927:1: ( rule__Direction__XAssignment_1 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2928:1: ( rule__Direction__XAssignment_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2928:2: rule__Direction__XAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5751);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2938:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2942:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2943:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25781);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25784);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2950:1: rule__Direction__Group__2__Impl : ( ',' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2954:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2955:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2955:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2956:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_2()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Direction__Group__2__Impl5812); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2969:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2973:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2974:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35843);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35846);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2981:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__YAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2985:1: ( ( ( rule__Direction__YAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2986:1: ( ( rule__Direction__YAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2986:1: ( ( rule__Direction__YAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2987:1: ( rule__Direction__YAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2988:1: ( rule__Direction__YAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2988:2: rule__Direction__YAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5873);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2998:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3002:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3003:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__45903);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__45906);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3010:1: rule__Direction__Group__4__Impl : ( ( rule__Direction__Group_4__0 )? ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3014:1: ( ( ( rule__Direction__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3015:1: ( ( rule__Direction__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3015:1: ( ( rule__Direction__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3016:1: ( rule__Direction__Group_4__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3017:1: ( rule__Direction__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3017:2: rule__Direction__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl5933);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3027:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3031:1: ( rule__Direction__Group__5__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3032:2: rule__Direction__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__55964);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3038:1: rule__Direction__Group__5__Impl : ( ')' ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3042:1: ( ( ')' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3043:1: ( ')' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3043:1: ( ')' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3044:1: ')'
            {
             before(grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Direction__Group__5__Impl5992); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3069:1: rule__Direction__Group_4__0 : rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 ;
    public final void rule__Direction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3073:1: ( rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3074:2: rule__Direction__Group_4__0__Impl rule__Direction__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06035);
            rule__Direction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06038);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3081:1: rule__Direction__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Direction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3085:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3086:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3086:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3087:1: ','
            {
             before(grammarAccess.getDirectionAccess().getCommaKeyword_4_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Direction__Group_4__0__Impl6066); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3100:1: rule__Direction__Group_4__1 : rule__Direction__Group_4__1__Impl ;
    public final void rule__Direction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3104:1: ( rule__Direction__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3105:2: rule__Direction__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16097);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3111:1: rule__Direction__Group_4__1__Impl : ( ( rule__Direction__ZAssignment_4_1 ) ) ;
    public final void rule__Direction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3115:1: ( ( ( rule__Direction__ZAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3116:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3116:1: ( ( rule__Direction__ZAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3117:1: ( rule__Direction__ZAssignment_4_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3118:1: ( rule__Direction__ZAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3118:2: rule__Direction__ZAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6124);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3133:1: rule__Model__ElementsAssignment_2 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3137:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3138:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3138:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3139:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26163);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3148:1: rule__Model__ElementsAssignment_3_1 : ( ruleWallRule ) ;
    public final void rule__Model__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3152:1: ( ( ruleWallRule ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3153:1: ( ruleWallRule )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3153:1: ( ruleWallRule )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3154:1: ruleWallRule
            {
             before(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16194);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3163:1: rule__Model__ElementsAssignment_5 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3167:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3168:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3168:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3169:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56225);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3178:1: rule__Model__ElementsAssignment_6_1 : ( ruleOpening ) ;
    public final void rule__Model__ElementsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3182:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3183:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3183:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3184:1: ruleOpening
            {
             before(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16256);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3193:1: rule__Model__ElementsAssignment_8 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3197:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3198:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3199:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86287);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3208:1: rule__Model__ElementsAssignment_9_1 : ( ruleFlowSegment ) ;
    public final void rule__Model__ElementsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3212:1: ( ( ruleFlowSegment ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3213:1: ( ruleFlowSegment )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3213:1: ( ruleFlowSegment )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3214:1: ruleFlowSegment
            {
             before(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16318);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3223:1: rule__WallRule__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WallRule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3227:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3228:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3228:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3229:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__NameAssignment_16349);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3238:1: rule__WallRule__ElementNameAssignment_3 : ( ruleEString ) ;
    public final void rule__WallRule__ElementNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3242:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3243:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3243:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3244:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_36380);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3253:1: rule__WallRule__DescriptionAssignment_5 : ( ruleEString ) ;
    public final void rule__WallRule__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3257:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3258:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3258:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3259:1: ruleEString
            {
             before(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_56411);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3268:1: rule__WallRule__PlacementAssignment_7 : ( ruleLocalPlacement ) ;
    public final void rule__WallRule__PlacementAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3272:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3273:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3273:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3274:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_76442);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3283:1: rule__Opening__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Opening__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3287:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3288:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3288:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3289:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__NameAssignment_16473);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3298:1: rule__Opening__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3302:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3303:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3303:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3304:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16504);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3313:1: rule__Opening__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3317:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3318:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3318:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3319:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16535);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3328:1: rule__Opening__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3332:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3333:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3333:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3334:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56566);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3343:1: rule__Opening__WallsAssignment_7 : ( ( RULE_STRING ) ) ;
    public final void rule__Opening__WallsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3347:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3348:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3348:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3349:1: ( RULE_STRING )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_7_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3350:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3351:1: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_7_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_76601); 
             after(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_7_0_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3362:1: rule__Opening__WallsAssignment_8_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Opening__WallsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3366:1: ( ( ( RULE_STRING ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3367:1: ( ( RULE_STRING ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3367:1: ( ( RULE_STRING ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3368:1: ( RULE_STRING )
            {
             before(grammarAccess.getOpeningAccess().getWallsWallCrossReference_8_1_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3369:1: ( RULE_STRING )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3370:1: RULE_STRING
            {
             before(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_8_16640); 
             after(grammarAccess.getOpeningAccess().getWallsWallSTRINGTerminalRuleCall_8_1_0_1()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3381:1: rule__FlowSegment__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3386:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3386:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3387:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_16675);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3396:1: rule__FlowSegment__ElementNameAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__ElementNameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3400:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3401:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3401:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3402:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16706);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3411:1: rule__FlowSegment__DescriptionAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3415:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3416:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3416:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3417:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16737);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3426:1: rule__FlowSegment__PlacementAssignment_5 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3430:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3431:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3431:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3432:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56768);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3441:1: rule__LocalPlacement__RelativeToAssignment_2_1 : ( ruleLocalPlacement ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3445:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3446:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3446:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3447:1: ruleLocalPlacement
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16799);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3456:1: rule__LocalPlacement__Axis2placement3dAssignment_3_1 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3460:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3461:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3461:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3462:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_3_16830);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3471:1: rule__Axis2Placement3D__CartesianXAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3475:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3476:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3476:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3477:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36861);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3486:1: rule__Axis2Placement3D__CartesianYAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3490:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3491:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3491:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3492:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_56892);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3501:1: rule__Axis2Placement3D__CartesianZAssignment_7 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3505:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3506:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3506:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3507:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_76923);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3516:1: rule__Axis2Placement3D__AxisAssignment_10 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3520:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3521:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3521:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3522:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_106954);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3531:1: rule__Axis2Placement3D__RefDirectionAssignment_12 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3535:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3536:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3536:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3537:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_126985);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3546:1: rule__Direction__XAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3550:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3551:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3551:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3552:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17016);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3561:1: rule__Direction__YAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3565:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3566:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3566:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3567:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37047);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3576:1: rule__Direction__ZAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3580:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3581:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3581:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3582:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17078);
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
        public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71089 = new BitSet(new long[]{0x0000000001000000L});
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
        public static final BitSet FOLLOW_rule__Model__Group_9__0__Impl_in_rule__Model__Group_9__01535 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1_in_rule__Model__Group_9__01538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_9__0__Impl1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_9__1__Impl_in_rule__Model__Group_9__11597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_9_1_in_rule__Model__Group_9__1__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__0__Impl_in_rule__WallRule__Group__01658 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1_in_rule__WallRule__Group__01661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__WallRule__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__1__Impl_in_rule__WallRule__Group__11720 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2_in_rule__WallRule__Group__11723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__NameAssignment_1_in_rule__WallRule__Group__1__Impl1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__2__Impl_in_rule__WallRule__Group__21780 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3_in_rule__WallRule__Group__21783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WallRule__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__3__Impl_in_rule__WallRule__Group__31842 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4_in_rule__WallRule__Group__31845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__ElementNameAssignment_3_in_rule__WallRule__Group__3__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__4__Impl_in_rule__WallRule__Group__41902 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5_in_rule__WallRule__Group__41905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WallRule__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__5__Impl_in_rule__WallRule__Group__51964 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__6_in_rule__WallRule__Group__51967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__DescriptionAssignment_5_in_rule__WallRule__Group__5__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__6__Impl_in_rule__WallRule__Group__62024 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WallRule__Group__7_in_rule__WallRule__Group__62027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WallRule__Group__6__Impl2055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__Group__7__Impl_in_rule__WallRule__Group__72086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRule__PlacementAssignment_7_in_rule__WallRule__Group__7__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__02159 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__02162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group__0__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__12221 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__12224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_1_in_rule__Opening__Group__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__22281 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__22284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl2311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__32342 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__32345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__42403 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__42406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group__4__Impl2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__52465 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__52468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_5_in_rule__Opening__Group__5__Impl2495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__62525 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__62528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Opening__Group__6__Impl2556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__72587 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__72590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_in_rule__Opening__Group__7__Impl2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__82647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__0_in_rule__Opening__Group__8__Impl2674 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__02723 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__02726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Opening__Group_2__0__Impl2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__12785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__ElementNameAssignment_2_1_in_rule__Opening__Group_2__1__Impl2812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__02846 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__02849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_3__0__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__12908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_3_1_in_rule__Opening__Group_3__1__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__0__Impl_in_rule__Opening__Group_8__02969 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__1_in_rule__Opening__Group_8__02972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Opening__Group_8__0__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_8__1__Impl_in_rule__Opening__Group_8__13031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_8_1_in_rule__Opening__Group_8__1__Impl3058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__03092 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__03095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__FlowSegment__Group__0__Impl3123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__13154 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__13157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_1_in_rule__FlowSegment__Group__1__Impl3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__23214 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__23217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__33275 = new BitSet(new long[]{0x00000000001C0000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__33278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__43336 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__43339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group__4__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__53398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_5_in_rule__FlowSegment__Group__5__Impl3425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__03467 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__03470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FlowSegment__Group_2__0__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__13529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__ElementNameAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__03590 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__03593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_3__0__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__13652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__03713 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__03716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__13774 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__13777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__LocalPlacement__Group__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__23836 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__23839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0_in_rule__LocalPlacement__Group__2__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__33897 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__33900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__43958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__LocalPlacement__Group__4__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__0__Impl_in_rule__LocalPlacement__Group_2__04027 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1_in_rule__LocalPlacement__Group_2__04030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__LocalPlacement__Group_2__0__Impl4058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_2__1__Impl_in_rule__LocalPlacement__Group_2__14089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_2_1_in_rule__LocalPlacement__Group_2__1__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__04150 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__04153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__LocalPlacement__Group_3__0__Impl4181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__14212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__04273 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__04276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Axis2Placement3D__Group__0__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__14335 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__14338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Axis2Placement3D__Group__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__24397 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__24400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Axis2Placement3D__Group__2__Impl4428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__34459 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__34462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_3_in_rule__Axis2Placement3D__Group__3__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__44519 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__44522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Axis2Placement3D__Group__4__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__54581 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__54584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_5_in_rule__Axis2Placement3D__Group__5__Impl4611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__64641 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__64644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Axis2Placement3D__Group__6__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__74703 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__74706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_7_in_rule__Axis2Placement3D__Group__7__Impl4733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__84763 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__84766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Axis2Placement3D__Group__8__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__94825 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__94828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Axis2Placement3D__Group__9__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__104887 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__104890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__114947 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__114950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Axis2Placement3D__Group__11__Impl4978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__125009 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__125012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__135069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Axis2Placement3D__Group__13__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__05156 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__05159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__15221 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__15224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl5252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__25283 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__25286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EDouble__Group__2__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__35345 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__35348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl5375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__45404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl5431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__05472 = new BitSet(new long[]{0x0000000400000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__05475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl5502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__15532 = new BitSet(new long[]{0x0000000400000020L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__15535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__EDouble__Group_4__1__Impl5564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__25597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl5624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__05659 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__05662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Direction__Group__0__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__15721 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__15724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_1_in_rule__Direction__Group__1__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__25781 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__25784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Direction__Group__2__Impl5812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__35843 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__35846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_3_in_rule__Direction__Group__3__Impl5873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__45903 = new BitSet(new long[]{0x0000000080800000L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__45906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0_in_rule__Direction__Group__4__Impl5933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__55964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Direction__Group__5__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__0__Impl_in_rule__Direction__Group_4__06035 = new BitSet(new long[]{0x0000000C00000020L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1_in_rule__Direction__Group_4__06038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Direction__Group_4__0__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_4__1__Impl_in_rule__Direction__Group_4__16097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_4_1_in_rule__Direction__Group_4__1__Impl6124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_26163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_rule__Model__ElementsAssignment_3_16194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_56225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__Model__ElementsAssignment_6_16256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_86287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__Model__ElementsAssignment_9_16318 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__NameAssignment_16349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__ElementNameAssignment_36380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRule__DescriptionAssignment_56411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__WallRule__PlacementAssignment_76442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__NameAssignment_16473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__ElementNameAssignment_2_16504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_3_16535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_56566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_76601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Opening__WallsAssignment_8_16640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_16675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__ElementNameAssignment_2_16706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_3_16737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_56768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_2_16799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_3_16830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_36861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_56892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_76923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_106954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_126985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_17016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_37047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_4_17078 = new BitSet(new long[]{0x0000000000000002L});
    }


}