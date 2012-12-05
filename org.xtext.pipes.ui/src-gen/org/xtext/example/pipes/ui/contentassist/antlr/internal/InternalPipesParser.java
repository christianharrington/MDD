package org.xtext.example.pipes.ui.contentassist.antlr.internal; 

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
import org.xtext.example.pipes.services.PipesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Model'", "'{'", "'}'", "'elements'", "','", "'GUIDElement'", "'GUID'", "'Name'", "'Description'", "'Wall'", "'placement'", "'openings'", "'Opening'", "'walls'", "'WallRelation'", "'wall'", "'opening'", "'FlowSegment'", "'LocalPlacement'", "'axis2placement3d'", "'relativeTo'", "'Axis2Placement3D'", "'cartesianX'", "'cartesianY'", "'cartesianZ'", "'axis'", "'refDirection'", "'-'", "'.'", "'Direction'", "'x'", "'y'", "'z'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    public String getGrammarFileName() { return "../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g"; }


     
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:61:1: ( ruleModel EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:62:1: ruleModel EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:76:2: rule__Model__Group__0
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:88:1: entryRuleGUIDElement : ruleGUIDElement EOF ;
    public final void entryRuleGUIDElement() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:89:1: ( ruleGUIDElement EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:90:1: ruleGUIDElement EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:97:1: ruleGUIDElement : ( ( rule__GUIDElement__Alternatives ) ) ;
    public final void ruleGUIDElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:101:2: ( ( ( rule__GUIDElement__Alternatives ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__GUIDElement__Alternatives ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:102:1: ( ( rule__GUIDElement__Alternatives ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:103:1: ( rule__GUIDElement__Alternatives )
            {
             before(grammarAccess.getGUIDElementAccess().getAlternatives()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:1: ( rule__GUIDElement__Alternatives )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:104:2: rule__GUIDElement__Alternatives
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:116:1: entryRuleGUIDElement_Impl : ruleGUIDElement_Impl EOF ;
    public final void entryRuleGUIDElement_Impl() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:117:1: ( ruleGUIDElement_Impl EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:118:1: ruleGUIDElement_Impl EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:125:1: ruleGUIDElement_Impl : ( ( rule__GUIDElement_Impl__Group__0 ) ) ;
    public final void ruleGUIDElement_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:129:2: ( ( ( rule__GUIDElement_Impl__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__GUIDElement_Impl__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:130:1: ( ( rule__GUIDElement_Impl__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:131:1: ( rule__GUIDElement_Impl__Group__0 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:1: ( rule__GUIDElement_Impl__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:132:2: rule__GUIDElement_Impl__Group__0
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:145:1: ( ruleEString EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:146:1: ruleEString EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:1: ( rule__EString__Alternatives )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:160:2: rule__EString__Alternatives
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:172:1: entryRuleWall : ruleWall EOF ;
    public final void entryRuleWall() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:173:1: ( ruleWall EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:174:1: ruleWall EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:181:1: ruleWall : ( ( rule__Wall__Group__0 ) ) ;
    public final void ruleWall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:185:2: ( ( ( rule__Wall__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__Wall__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:186:1: ( ( rule__Wall__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:187:1: ( rule__Wall__Group__0 )
            {
             before(grammarAccess.getWallAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:1: ( rule__Wall__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:188:2: rule__Wall__Group__0
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:200:1: entryRuleOpening : ruleOpening EOF ;
    public final void entryRuleOpening() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:201:1: ( ruleOpening EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:202:1: ruleOpening EOF
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:209:1: ruleOpening : ( ( rule__Opening__Group__0 ) ) ;
    public final void ruleOpening() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:213:2: ( ( ( rule__Opening__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__Opening__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:214:1: ( ( rule__Opening__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:215:1: ( rule__Opening__Group__0 )
            {
             before(grammarAccess.getOpeningAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:1: ( rule__Opening__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:216:2: rule__Opening__Group__0
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


    // $ANTLR start "entryRuleWallRelation"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:228:1: entryRuleWallRelation : ruleWallRelation EOF ;
    public final void entryRuleWallRelation() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:229:1: ( ruleWallRelation EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:230:1: ruleWallRelation EOF
            {
             before(grammarAccess.getWallRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_entryRuleWallRelation421);
            ruleWallRelation();

            state._fsp--;

             after(grammarAccess.getWallRelationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRelation428); 

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
    // $ANTLR end "entryRuleWallRelation"


    // $ANTLR start "ruleWallRelation"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:237:1: ruleWallRelation : ( ( rule__WallRelation__Group__0 ) ) ;
    public final void ruleWallRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:241:2: ( ( ( rule__WallRelation__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__WallRelation__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:242:1: ( ( rule__WallRelation__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:243:1: ( rule__WallRelation__Group__0 )
            {
             before(grammarAccess.getWallRelationAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:1: ( rule__WallRelation__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:244:2: rule__WallRelation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__0_in_ruleWallRelation454);
            rule__WallRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWallRelation"


    // $ANTLR start "entryRuleFlowSegment"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:256:1: entryRuleFlowSegment : ruleFlowSegment EOF ;
    public final void entryRuleFlowSegment() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:257:1: ( ruleFlowSegment EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:258:1: ruleFlowSegment EOF
            {
             before(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment481);
            ruleFlowSegment();

            state._fsp--;

             after(grammarAccess.getFlowSegmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment488); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:265:1: ruleFlowSegment : ( ( rule__FlowSegment__Group__0 ) ) ;
    public final void ruleFlowSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:269:2: ( ( ( rule__FlowSegment__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__FlowSegment__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:270:1: ( ( rule__FlowSegment__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:271:1: ( rule__FlowSegment__Group__0 )
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:1: ( rule__FlowSegment__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:272:2: rule__FlowSegment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment514);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:284:1: entryRuleLocalPlacement : ruleLocalPlacement EOF ;
    public final void entryRuleLocalPlacement() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:285:1: ( ruleLocalPlacement EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:286:1: ruleLocalPlacement EOF
            {
             before(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement541);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement548); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:293:1: ruleLocalPlacement : ( ( rule__LocalPlacement__Group__0 ) ) ;
    public final void ruleLocalPlacement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:297:2: ( ( ( rule__LocalPlacement__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__LocalPlacement__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:298:1: ( ( rule__LocalPlacement__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:299:1: ( rule__LocalPlacement__Group__0 )
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:1: ( rule__LocalPlacement__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:300:2: rule__LocalPlacement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement574);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:312:1: entryRuleAxis2Placement3D : ruleAxis2Placement3D EOF ;
    public final void entryRuleAxis2Placement3D() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:313:1: ( ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:314:1: ruleAxis2Placement3D EOF
            {
             before(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D601);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D608); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:321:1: ruleAxis2Placement3D : ( ( rule__Axis2Placement3D__Group__0 ) ) ;
    public final void ruleAxis2Placement3D() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:325:2: ( ( ( rule__Axis2Placement3D__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:326:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:326:1: ( ( rule__Axis2Placement3D__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:327:1: ( rule__Axis2Placement3D__Group__0 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:328:1: ( rule__Axis2Placement3D__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:328:2: rule__Axis2Placement3D__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D634);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:340:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:341:1: ( ruleEDouble EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:342:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble661);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble668); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:349:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:353:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:354:1: ( ( rule__EDouble__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:354:1: ( ( rule__EDouble__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:355:1: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:356:1: ( rule__EDouble__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:356:2: rule__EDouble__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0_in_ruleEDouble694);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:368:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:369:1: ( ruleDirection EOF )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:370:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection721);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection728); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:377:1: ruleDirection : ( ( rule__Direction__Group__0 ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:381:2: ( ( ( rule__Direction__Group__0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:382:1: ( ( rule__Direction__Group__0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:382:1: ( ( rule__Direction__Group__0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:383:1: ( rule__Direction__Group__0 )
            {
             before(grammarAccess.getDirectionAccess().getGroup()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:384:1: ( rule__Direction__Group__0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:384:2: rule__Direction__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0_in_ruleDirection754);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:396:1: rule__GUIDElement__Alternatives : ( ( ruleGUIDElement_Impl ) | ( ruleWall ) | ( ruleOpening ) | ( ruleWallRelation ) | ( ruleFlowSegment ) | ( ruleLocalPlacement ) | ( ruleAxis2Placement3D ) );
    public final void rule__GUIDElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:400:1: ( ( ruleGUIDElement_Impl ) | ( ruleWall ) | ( ruleOpening ) | ( ruleWallRelation ) | ( ruleFlowSegment ) | ( ruleLocalPlacement ) | ( ruleAxis2Placement3D ) )
            int alt1=7;
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
            case 25:
                {
                alt1=3;
                }
                break;
            case 27:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            case 31:
                {
                alt1=6;
                }
                break;
            case 34:
                {
                alt1=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:401:1: ( ruleGUIDElement_Impl )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:401:1: ( ruleGUIDElement_Impl )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:402:1: ruleGUIDElement_Impl
                    {
                     before(grammarAccess.getGUIDElementAccess().getGUIDElement_ImplParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_rule__GUIDElement__Alternatives790);
                    ruleGUIDElement_Impl();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getGUIDElement_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:407:6: ( ruleWall )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:407:6: ( ruleWall )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:408:1: ruleWall
                    {
                     before(grammarAccess.getGUIDElementAccess().getWallParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWall_in_rule__GUIDElement__Alternatives807);
                    ruleWall();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getWallParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:413:6: ( ruleOpening )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:413:6: ( ruleOpening )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:414:1: ruleOpening
                    {
                     before(grammarAccess.getGUIDElementAccess().getOpeningParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__GUIDElement__Alternatives824);
                    ruleOpening();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getOpeningParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:419:6: ( ruleWallRelation )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:419:6: ( ruleWallRelation )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:420:1: ruleWallRelation
                    {
                     before(grammarAccess.getGUIDElementAccess().getWallRelationParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_rule__GUIDElement__Alternatives841);
                    ruleWallRelation();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getWallRelationParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:425:6: ( ruleFlowSegment )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:425:6: ( ruleFlowSegment )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:426:1: ruleFlowSegment
                    {
                     before(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_rule__GUIDElement__Alternatives858);
                    ruleFlowSegment();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:431:6: ( ruleLocalPlacement )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:431:6: ( ruleLocalPlacement )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:432:1: ruleLocalPlacement
                    {
                     before(grammarAccess.getGUIDElementAccess().getLocalPlacementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__GUIDElement__Alternatives875);
                    ruleLocalPlacement();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getLocalPlacementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:437:6: ( ruleAxis2Placement3D )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:437:6: ( ruleAxis2Placement3D )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:438:1: ruleAxis2Placement3D
                    {
                     before(grammarAccess.getGUIDElementAccess().getAxis2Placement3DParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__GUIDElement__Alternatives892);
                    ruleAxis2Placement3D();

                    state._fsp--;

                     after(grammarAccess.getGUIDElementAccess().getAxis2Placement3DParserRuleCall_6()); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:448:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:452:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:453:1: ( RULE_STRING )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:453:1: ( RULE_STRING )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:454:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives924); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:459:6: ( RULE_ID )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:459:6: ( RULE_ID )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:460:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives941); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:470:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:474:1: ( ( 'E' ) | ( 'e' ) )
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
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:475:1: ( 'E' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:475:1: ( 'E' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:476:1: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__EDouble__Alternatives_4_0974); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:483:6: ( 'e' )
                    {
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:483:6: ( 'e' )
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:484:1: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__EDouble__Alternatives_4_0994); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:498:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:502:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:503:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01026);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01029);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:510:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:514:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:515:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:515:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:516:1: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:517:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:519:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:529:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:533:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:534:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11087);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11090);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:541:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:545:1: ( ( 'Model' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:546:1: ( 'Model' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:546:1: ( 'Model' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:547:1: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Model__Group__1__Impl1118); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:560:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:564:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:565:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21149);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21152);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:572:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:576:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:577:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:577:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:578:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group__2__Impl1180); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:591:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:595:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:596:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31211);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31214);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:603:1: rule__Model__Group__3__Impl : ( ( rule__Model__Group_3__0 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:607:1: ( ( ( rule__Model__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:608:1: ( ( rule__Model__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:608:1: ( ( rule__Model__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:609:1: ( rule__Model__Group_3__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:610:1: ( rule__Model__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:610:2: rule__Model__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1241);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:620:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:624:1: ( rule__Model__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:625:2: rule__Model__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41272);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:631:1: rule__Model__Group__4__Impl : ( '}' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:635:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:636:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:636:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:637:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group__4__Impl1300); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:660:1: rule__Model__Group_3__0 : rule__Model__Group_3__0__Impl rule__Model__Group_3__1 ;
    public final void rule__Model__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:664:1: ( rule__Model__Group_3__0__Impl rule__Model__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:665:2: rule__Model__Group_3__0__Impl rule__Model__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01341);
            rule__Model__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01344);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:672:1: rule__Model__Group_3__0__Impl : ( 'elements' ) ;
    public final void rule__Model__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:676:1: ( ( 'elements' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:677:1: ( 'elements' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:677:1: ( 'elements' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:678:1: 'elements'
            {
             before(grammarAccess.getModelAccess().getElementsKeyword_3_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Model__Group_3__0__Impl1372); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:691:1: rule__Model__Group_3__1 : rule__Model__Group_3__1__Impl rule__Model__Group_3__2 ;
    public final void rule__Model__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:695:1: ( rule__Model__Group_3__1__Impl rule__Model__Group_3__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:696:2: rule__Model__Group_3__1__Impl rule__Model__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11403);
            rule__Model__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11406);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:703:1: rule__Model__Group_3__1__Impl : ( '{' ) ;
    public final void rule__Model__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:707:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:708:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:708:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:709:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Model__Group_3__1__Impl1434); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:722:1: rule__Model__Group_3__2 : rule__Model__Group_3__2__Impl rule__Model__Group_3__3 ;
    public final void rule__Model__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:726:1: ( rule__Model__Group_3__2__Impl rule__Model__Group_3__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:727:2: rule__Model__Group_3__2__Impl rule__Model__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21465);
            rule__Model__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__21468);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:734:1: rule__Model__Group_3__2__Impl : ( ( rule__Model__ElementsAssignment_3_2 ) ) ;
    public final void rule__Model__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:738:1: ( ( ( rule__Model__ElementsAssignment_3_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:739:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:739:1: ( ( rule__Model__ElementsAssignment_3_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:740:1: ( rule__Model__ElementsAssignment_3_2 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:741:1: ( rule__Model__ElementsAssignment_3_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:741:2: rule__Model__ElementsAssignment_3_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_2_in_rule__Model__Group_3__2__Impl1495);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:751:1: rule__Model__Group_3__3 : rule__Model__Group_3__3__Impl rule__Model__Group_3__4 ;
    public final void rule__Model__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:755:1: ( rule__Model__Group_3__3__Impl rule__Model__Group_3__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:756:2: rule__Model__Group_3__3__Impl rule__Model__Group_3__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__31525);
            rule__Model__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__31528);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:763:1: rule__Model__Group_3__3__Impl : ( ( rule__Model__Group_3_3__0 )* ) ;
    public final void rule__Model__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:767:1: ( ( ( rule__Model__Group_3_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:768:1: ( ( rule__Model__Group_3_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:768:1: ( ( rule__Model__Group_3_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:769:1: ( rule__Model__Group_3_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_3_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:770:1: ( rule__Model__Group_3_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:770:2: rule__Model__Group_3_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl1555);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:780:1: rule__Model__Group_3__4 : rule__Model__Group_3__4__Impl ;
    public final void rule__Model__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:784:1: ( rule__Model__Group_3__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:785:2: rule__Model__Group_3__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__41586);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:791:1: rule__Model__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Model__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:795:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:796:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:796:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:797:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Model__Group_3__4__Impl1614); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:820:1: rule__Model__Group_3_3__0 : rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 ;
    public final void rule__Model__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:824:1: ( rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:825:2: rule__Model__Group_3_3__0__Impl rule__Model__Group_3_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__01655);
            rule__Model__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__01658);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:832:1: rule__Model__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:836:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:837:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:837:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:838:1: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_3_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Model__Group_3_3__0__Impl1686); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:851:1: rule__Model__Group_3_3__1 : rule__Model__Group_3_3__1__Impl ;
    public final void rule__Model__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:855:1: ( rule__Model__Group_3_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:856:2: rule__Model__Group_3_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__11717);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:862:1: rule__Model__Group_3_3__1__Impl : ( ( rule__Model__ElementsAssignment_3_3_1 ) ) ;
    public final void rule__Model__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:866:1: ( ( ( rule__Model__ElementsAssignment_3_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:867:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:867:1: ( ( rule__Model__ElementsAssignment_3_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:868:1: ( rule__Model__ElementsAssignment_3_3_1 )
            {
             before(grammarAccess.getModelAccess().getElementsAssignment_3_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:869:1: ( rule__Model__ElementsAssignment_3_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:869:2: rule__Model__ElementsAssignment_3_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Model__ElementsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl1744);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:883:1: rule__GUIDElement_Impl__Group__0 : rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1 ;
    public final void rule__GUIDElement_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:887:1: ( rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:888:2: rule__GUIDElement_Impl__Group__0__Impl rule__GUIDElement_Impl__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__0__Impl_in_rule__GUIDElement_Impl__Group__01778);
            rule__GUIDElement_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__1_in_rule__GUIDElement_Impl__Group__01781);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:895:1: rule__GUIDElement_Impl__Group__0__Impl : ( () ) ;
    public final void rule__GUIDElement_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:899:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:900:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:900:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:901:1: ()
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:902:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:904:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:914:1: rule__GUIDElement_Impl__Group__1 : rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2 ;
    public final void rule__GUIDElement_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:918:1: ( rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:919:2: rule__GUIDElement_Impl__Group__1__Impl rule__GUIDElement_Impl__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__1__Impl_in_rule__GUIDElement_Impl__Group__11839);
            rule__GUIDElement_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__2_in_rule__GUIDElement_Impl__Group__11842);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:926:1: rule__GUIDElement_Impl__Group__1__Impl : ( 'GUIDElement' ) ;
    public final void rule__GUIDElement_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:930:1: ( ( 'GUIDElement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:931:1: ( 'GUIDElement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:931:1: ( 'GUIDElement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:932:1: 'GUIDElement'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDElementKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__GUIDElement_Impl__Group__1__Impl1870); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:945:1: rule__GUIDElement_Impl__Group__2 : rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3 ;
    public final void rule__GUIDElement_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:949:1: ( rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:950:2: rule__GUIDElement_Impl__Group__2__Impl rule__GUIDElement_Impl__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__2__Impl_in_rule__GUIDElement_Impl__Group__21901);
            rule__GUIDElement_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__3_in_rule__GUIDElement_Impl__Group__21904);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:957:1: rule__GUIDElement_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__GUIDElement_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:961:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:962:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:962:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:963:1: '{'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__GUIDElement_Impl__Group__2__Impl1932); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:976:1: rule__GUIDElement_Impl__Group__3 : rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4 ;
    public final void rule__GUIDElement_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:980:1: ( rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:981:2: rule__GUIDElement_Impl__Group__3__Impl rule__GUIDElement_Impl__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__3__Impl_in_rule__GUIDElement_Impl__Group__31963);
            rule__GUIDElement_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__4_in_rule__GUIDElement_Impl__Group__31966);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:988:1: rule__GUIDElement_Impl__Group__3__Impl : ( ( rule__GUIDElement_Impl__Group_3__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:992:1: ( ( ( rule__GUIDElement_Impl__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:993:1: ( ( rule__GUIDElement_Impl__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:993:1: ( ( rule__GUIDElement_Impl__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:994:1: ( rule__GUIDElement_Impl__Group_3__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:995:1: ( rule__GUIDElement_Impl__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:995:2: rule__GUIDElement_Impl__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__0_in_rule__GUIDElement_Impl__Group__3__Impl1993);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1005:1: rule__GUIDElement_Impl__Group__4 : rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5 ;
    public final void rule__GUIDElement_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1009:1: ( rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1010:2: rule__GUIDElement_Impl__Group__4__Impl rule__GUIDElement_Impl__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__4__Impl_in_rule__GUIDElement_Impl__Group__42024);
            rule__GUIDElement_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__5_in_rule__GUIDElement_Impl__Group__42027);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1017:1: rule__GUIDElement_Impl__Group__4__Impl : ( ( rule__GUIDElement_Impl__Group_4__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1021:1: ( ( ( rule__GUIDElement_Impl__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1022:1: ( ( rule__GUIDElement_Impl__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1022:1: ( ( rule__GUIDElement_Impl__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1023:1: ( rule__GUIDElement_Impl__Group_4__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1024:1: ( rule__GUIDElement_Impl__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1024:2: rule__GUIDElement_Impl__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__0_in_rule__GUIDElement_Impl__Group__4__Impl2054);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1034:1: rule__GUIDElement_Impl__Group__5 : rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6 ;
    public final void rule__GUIDElement_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1038:1: ( rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1039:2: rule__GUIDElement_Impl__Group__5__Impl rule__GUIDElement_Impl__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__5__Impl_in_rule__GUIDElement_Impl__Group__52085);
            rule__GUIDElement_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__6_in_rule__GUIDElement_Impl__Group__52088);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1046:1: rule__GUIDElement_Impl__Group__5__Impl : ( ( rule__GUIDElement_Impl__Group_5__0 )? ) ;
    public final void rule__GUIDElement_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1050:1: ( ( ( rule__GUIDElement_Impl__Group_5__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1051:1: ( ( rule__GUIDElement_Impl__Group_5__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1051:1: ( ( rule__GUIDElement_Impl__Group_5__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1052:1: ( rule__GUIDElement_Impl__Group_5__0 )?
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGroup_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1053:1: ( rule__GUIDElement_Impl__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1053:2: rule__GUIDElement_Impl__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__0_in_rule__GUIDElement_Impl__Group__5__Impl2115);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1063:1: rule__GUIDElement_Impl__Group__6 : rule__GUIDElement_Impl__Group__6__Impl ;
    public final void rule__GUIDElement_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1067:1: ( rule__GUIDElement_Impl__Group__6__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1068:2: rule__GUIDElement_Impl__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group__6__Impl_in_rule__GUIDElement_Impl__Group__62146);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1074:1: rule__GUIDElement_Impl__Group__6__Impl : ( '}' ) ;
    public final void rule__GUIDElement_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1078:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1079:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1079:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1080:1: '}'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__GUIDElement_Impl__Group__6__Impl2174); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1107:1: rule__GUIDElement_Impl__Group_3__0 : rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1 ;
    public final void rule__GUIDElement_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1111:1: ( rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1112:2: rule__GUIDElement_Impl__Group_3__0__Impl rule__GUIDElement_Impl__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__0__Impl_in_rule__GUIDElement_Impl__Group_3__02219);
            rule__GUIDElement_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__1_in_rule__GUIDElement_Impl__Group_3__02222);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1119:1: rule__GUIDElement_Impl__Group_3__0__Impl : ( 'GUID' ) ;
    public final void rule__GUIDElement_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1123:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1124:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1124:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1125:1: 'GUID'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__GUIDElement_Impl__Group_3__0__Impl2250); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1138:1: rule__GUIDElement_Impl__Group_3__1 : rule__GUIDElement_Impl__Group_3__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1142:1: ( rule__GUIDElement_Impl__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1143:2: rule__GUIDElement_Impl__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_3__1__Impl_in_rule__GUIDElement_Impl__Group_3__12281);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1149:1: rule__GUIDElement_Impl__Group_3__1__Impl : ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1153:1: ( ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1154:1: ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1154:1: ( ( rule__GUIDElement_Impl__GUIDAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1155:1: ( rule__GUIDElement_Impl__GUIDAssignment_3_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1156:1: ( rule__GUIDElement_Impl__GUIDAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1156:2: rule__GUIDElement_Impl__GUIDAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__GUIDAssignment_3_1_in_rule__GUIDElement_Impl__Group_3__1__Impl2308);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1170:1: rule__GUIDElement_Impl__Group_4__0 : rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1 ;
    public final void rule__GUIDElement_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1174:1: ( rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1175:2: rule__GUIDElement_Impl__Group_4__0__Impl rule__GUIDElement_Impl__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__0__Impl_in_rule__GUIDElement_Impl__Group_4__02342);
            rule__GUIDElement_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__1_in_rule__GUIDElement_Impl__Group_4__02345);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1182:1: rule__GUIDElement_Impl__Group_4__0__Impl : ( 'Name' ) ;
    public final void rule__GUIDElement_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1186:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1187:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1187:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1188:1: 'Name'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__GUIDElement_Impl__Group_4__0__Impl2373); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1201:1: rule__GUIDElement_Impl__Group_4__1 : rule__GUIDElement_Impl__Group_4__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1205:1: ( rule__GUIDElement_Impl__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1206:2: rule__GUIDElement_Impl__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_4__1__Impl_in_rule__GUIDElement_Impl__Group_4__12404);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1212:1: rule__GUIDElement_Impl__Group_4__1__Impl : ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1216:1: ( ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1217:1: ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1217:1: ( ( rule__GUIDElement_Impl__NameAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1218:1: ( rule__GUIDElement_Impl__NameAssignment_4_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1219:1: ( rule__GUIDElement_Impl__NameAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1219:2: rule__GUIDElement_Impl__NameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__NameAssignment_4_1_in_rule__GUIDElement_Impl__Group_4__1__Impl2431);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1233:1: rule__GUIDElement_Impl__Group_5__0 : rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1 ;
    public final void rule__GUIDElement_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1237:1: ( rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1238:2: rule__GUIDElement_Impl__Group_5__0__Impl rule__GUIDElement_Impl__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__0__Impl_in_rule__GUIDElement_Impl__Group_5__02465);
            rule__GUIDElement_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__1_in_rule__GUIDElement_Impl__Group_5__02468);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1245:1: rule__GUIDElement_Impl__Group_5__0__Impl : ( 'Description' ) ;
    public final void rule__GUIDElement_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1249:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1250:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1250:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1251:1: 'Description'
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__GUIDElement_Impl__Group_5__0__Impl2496); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1264:1: rule__GUIDElement_Impl__Group_5__1 : rule__GUIDElement_Impl__Group_5__1__Impl ;
    public final void rule__GUIDElement_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1268:1: ( rule__GUIDElement_Impl__Group_5__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1269:2: rule__GUIDElement_Impl__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__Group_5__1__Impl_in_rule__GUIDElement_Impl__Group_5__12527);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1275:1: rule__GUIDElement_Impl__Group_5__1__Impl : ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) ) ;
    public final void rule__GUIDElement_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1279:1: ( ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1280:1: ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1280:1: ( ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1281:1: ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionAssignment_5_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1282:1: ( rule__GUIDElement_Impl__DescriptionAssignment_5_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1282:2: rule__GUIDElement_Impl__DescriptionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__GUIDElement_Impl__DescriptionAssignment_5_1_in_rule__GUIDElement_Impl__Group_5__1__Impl2554);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1296:1: rule__Wall__Group__0 : rule__Wall__Group__0__Impl rule__Wall__Group__1 ;
    public final void rule__Wall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1300:1: ( rule__Wall__Group__0__Impl rule__Wall__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1301:2: rule__Wall__Group__0__Impl rule__Wall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__0__Impl_in_rule__Wall__Group__02588);
            rule__Wall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__1_in_rule__Wall__Group__02591);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1308:1: rule__Wall__Group__0__Impl : ( 'Wall' ) ;
    public final void rule__Wall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1312:1: ( ( 'Wall' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1313:1: ( 'Wall' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1313:1: ( 'Wall' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1314:1: 'Wall'
            {
             before(grammarAccess.getWallAccess().getWallKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Wall__Group__0__Impl2619); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1327:1: rule__Wall__Group__1 : rule__Wall__Group__1__Impl rule__Wall__Group__2 ;
    public final void rule__Wall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1331:1: ( rule__Wall__Group__1__Impl rule__Wall__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1332:2: rule__Wall__Group__1__Impl rule__Wall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__1__Impl_in_rule__Wall__Group__12650);
            rule__Wall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__2_in_rule__Wall__Group__12653);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1339:1: rule__Wall__Group__1__Impl : ( '{' ) ;
    public final void rule__Wall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1343:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1344:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1345:1: '{'
            {
             before(grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wall__Group__1__Impl2681); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1358:1: rule__Wall__Group__2 : rule__Wall__Group__2__Impl rule__Wall__Group__3 ;
    public final void rule__Wall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1362:1: ( rule__Wall__Group__2__Impl rule__Wall__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1363:2: rule__Wall__Group__2__Impl rule__Wall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__2__Impl_in_rule__Wall__Group__22712);
            rule__Wall__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__3_in_rule__Wall__Group__22715);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1370:1: rule__Wall__Group__2__Impl : ( ( rule__Wall__Group_2__0 )? ) ;
    public final void rule__Wall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1374:1: ( ( ( rule__Wall__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1375:1: ( ( rule__Wall__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1375:1: ( ( rule__Wall__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1376:1: ( rule__Wall__Group_2__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:1: ( rule__Wall__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1377:2: rule__Wall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__0_in_rule__Wall__Group__2__Impl2742);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1387:1: rule__Wall__Group__3 : rule__Wall__Group__3__Impl rule__Wall__Group__4 ;
    public final void rule__Wall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1391:1: ( rule__Wall__Group__3__Impl rule__Wall__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1392:2: rule__Wall__Group__3__Impl rule__Wall__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__3__Impl_in_rule__Wall__Group__32773);
            rule__Wall__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__4_in_rule__Wall__Group__32776);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1399:1: rule__Wall__Group__3__Impl : ( ( rule__Wall__Group_3__0 )? ) ;
    public final void rule__Wall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1403:1: ( ( ( rule__Wall__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1404:1: ( ( rule__Wall__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1404:1: ( ( rule__Wall__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1405:1: ( rule__Wall__Group_3__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1406:1: ( rule__Wall__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1406:2: rule__Wall__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__0_in_rule__Wall__Group__3__Impl2803);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1416:1: rule__Wall__Group__4 : rule__Wall__Group__4__Impl rule__Wall__Group__5 ;
    public final void rule__Wall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1420:1: ( rule__Wall__Group__4__Impl rule__Wall__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1421:2: rule__Wall__Group__4__Impl rule__Wall__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__4__Impl_in_rule__Wall__Group__42834);
            rule__Wall__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__5_in_rule__Wall__Group__42837);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1428:1: rule__Wall__Group__4__Impl : ( ( rule__Wall__Group_4__0 )? ) ;
    public final void rule__Wall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1432:1: ( ( ( rule__Wall__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1433:1: ( ( rule__Wall__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1433:1: ( ( rule__Wall__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1434:1: ( rule__Wall__Group_4__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1435:1: ( rule__Wall__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1435:2: rule__Wall__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__0_in_rule__Wall__Group__4__Impl2864);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1445:1: rule__Wall__Group__5 : rule__Wall__Group__5__Impl rule__Wall__Group__6 ;
    public final void rule__Wall__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1449:1: ( rule__Wall__Group__5__Impl rule__Wall__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1450:2: rule__Wall__Group__5__Impl rule__Wall__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__5__Impl_in_rule__Wall__Group__52895);
            rule__Wall__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__6_in_rule__Wall__Group__52898);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1457:1: rule__Wall__Group__5__Impl : ( 'placement' ) ;
    public final void rule__Wall__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1461:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1462:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1462:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1463:1: 'placement'
            {
             before(grammarAccess.getWallAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Wall__Group__5__Impl2926); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1476:1: rule__Wall__Group__6 : rule__Wall__Group__6__Impl rule__Wall__Group__7 ;
    public final void rule__Wall__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1480:1: ( rule__Wall__Group__6__Impl rule__Wall__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1481:2: rule__Wall__Group__6__Impl rule__Wall__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__6__Impl_in_rule__Wall__Group__62957);
            rule__Wall__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__7_in_rule__Wall__Group__62960);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1488:1: rule__Wall__Group__6__Impl : ( ( rule__Wall__PlacementAssignment_6 ) ) ;
    public final void rule__Wall__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1492:1: ( ( ( rule__Wall__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1493:1: ( ( rule__Wall__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1493:1: ( ( rule__Wall__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1494:1: ( rule__Wall__PlacementAssignment_6 )
            {
             before(grammarAccess.getWallAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1495:1: ( rule__Wall__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1495:2: rule__Wall__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__PlacementAssignment_6_in_rule__Wall__Group__6__Impl2987);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1505:1: rule__Wall__Group__7 : rule__Wall__Group__7__Impl rule__Wall__Group__8 ;
    public final void rule__Wall__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1509:1: ( rule__Wall__Group__7__Impl rule__Wall__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1510:2: rule__Wall__Group__7__Impl rule__Wall__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__7__Impl_in_rule__Wall__Group__73017);
            rule__Wall__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__8_in_rule__Wall__Group__73020);
            rule__Wall__Group__8();

            state._fsp--;


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1517:1: rule__Wall__Group__7__Impl : ( ( rule__Wall__Group_7__0 )? ) ;
    public final void rule__Wall__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1521:1: ( ( ( rule__Wall__Group_7__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1522:1: ( ( rule__Wall__Group_7__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1522:1: ( ( rule__Wall__Group_7__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1523:1: ( rule__Wall__Group_7__0 )?
            {
             before(grammarAccess.getWallAccess().getGroup_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1524:1: ( rule__Wall__Group_7__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1524:2: rule__Wall__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__0_in_rule__Wall__Group__7__Impl3047);
                    rule__Wall__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Wall__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1534:1: rule__Wall__Group__8 : rule__Wall__Group__8__Impl ;
    public final void rule__Wall__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1538:1: ( rule__Wall__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1539:2: rule__Wall__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group__8__Impl_in_rule__Wall__Group__83078);
            rule__Wall__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group__8"


    // $ANTLR start "rule__Wall__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1545:1: rule__Wall__Group__8__Impl : ( '}' ) ;
    public final void rule__Wall__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1549:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1550:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1550:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1551:1: '}'
            {
             before(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Wall__Group__8__Impl3106); 
             after(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group__8__Impl"


    // $ANTLR start "rule__Wall__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1582:1: rule__Wall__Group_2__0 : rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1 ;
    public final void rule__Wall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1586:1: ( rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1587:2: rule__Wall__Group_2__0__Impl rule__Wall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__0__Impl_in_rule__Wall__Group_2__03155);
            rule__Wall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__1_in_rule__Wall__Group_2__03158);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1594:1: rule__Wall__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__Wall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1598:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1599:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1599:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1600:1: 'GUID'
            {
             before(grammarAccess.getWallAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Wall__Group_2__0__Impl3186); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1613:1: rule__Wall__Group_2__1 : rule__Wall__Group_2__1__Impl ;
    public final void rule__Wall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1617:1: ( rule__Wall__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1618:2: rule__Wall__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_2__1__Impl_in_rule__Wall__Group_2__13217);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1624:1: rule__Wall__Group_2__1__Impl : ( ( rule__Wall__GUIDAssignment_2_1 ) ) ;
    public final void rule__Wall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1628:1: ( ( ( rule__Wall__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1629:1: ( ( rule__Wall__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1629:1: ( ( rule__Wall__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1630:1: ( rule__Wall__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getWallAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1631:1: ( rule__Wall__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1631:2: rule__Wall__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__GUIDAssignment_2_1_in_rule__Wall__Group_2__1__Impl3244);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1645:1: rule__Wall__Group_3__0 : rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1 ;
    public final void rule__Wall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1649:1: ( rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1650:2: rule__Wall__Group_3__0__Impl rule__Wall__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__0__Impl_in_rule__Wall__Group_3__03278);
            rule__Wall__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__1_in_rule__Wall__Group_3__03281);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1657:1: rule__Wall__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Wall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1661:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1662:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1662:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1663:1: 'Name'
            {
             before(grammarAccess.getWallAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Wall__Group_3__0__Impl3309); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1676:1: rule__Wall__Group_3__1 : rule__Wall__Group_3__1__Impl ;
    public final void rule__Wall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1680:1: ( rule__Wall__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1681:2: rule__Wall__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_3__1__Impl_in_rule__Wall__Group_3__13340);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1687:1: rule__Wall__Group_3__1__Impl : ( ( rule__Wall__NameAssignment_3_1 ) ) ;
    public final void rule__Wall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1691:1: ( ( ( rule__Wall__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1692:1: ( ( rule__Wall__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1692:1: ( ( rule__Wall__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1693:1: ( rule__Wall__NameAssignment_3_1 )
            {
             before(grammarAccess.getWallAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1694:1: ( rule__Wall__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1694:2: rule__Wall__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__NameAssignment_3_1_in_rule__Wall__Group_3__1__Impl3367);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1708:1: rule__Wall__Group_4__0 : rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1 ;
    public final void rule__Wall__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1712:1: ( rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1713:2: rule__Wall__Group_4__0__Impl rule__Wall__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__0__Impl_in_rule__Wall__Group_4__03401);
            rule__Wall__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__1_in_rule__Wall__Group_4__03404);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1720:1: rule__Wall__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Wall__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1724:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1725:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1725:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1726:1: 'Description'
            {
             before(grammarAccess.getWallAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Wall__Group_4__0__Impl3432); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1739:1: rule__Wall__Group_4__1 : rule__Wall__Group_4__1__Impl ;
    public final void rule__Wall__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1743:1: ( rule__Wall__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1744:2: rule__Wall__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_4__1__Impl_in_rule__Wall__Group_4__13463);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1750:1: rule__Wall__Group_4__1__Impl : ( ( rule__Wall__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Wall__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1754:1: ( ( ( rule__Wall__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1755:1: ( ( rule__Wall__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1755:1: ( ( rule__Wall__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1756:1: ( rule__Wall__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getWallAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1757:1: ( rule__Wall__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1757:2: rule__Wall__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__DescriptionAssignment_4_1_in_rule__Wall__Group_4__1__Impl3490);
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


    // $ANTLR start "rule__Wall__Group_7__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1771:1: rule__Wall__Group_7__0 : rule__Wall__Group_7__0__Impl rule__Wall__Group_7__1 ;
    public final void rule__Wall__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1775:1: ( rule__Wall__Group_7__0__Impl rule__Wall__Group_7__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1776:2: rule__Wall__Group_7__0__Impl rule__Wall__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__0__Impl_in_rule__Wall__Group_7__03524);
            rule__Wall__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__1_in_rule__Wall__Group_7__03527);
            rule__Wall__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__0"


    // $ANTLR start "rule__Wall__Group_7__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1783:1: rule__Wall__Group_7__0__Impl : ( 'openings' ) ;
    public final void rule__Wall__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1787:1: ( ( 'openings' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1788:1: ( 'openings' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1788:1: ( 'openings' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1789:1: 'openings'
            {
             before(grammarAccess.getWallAccess().getOpeningsKeyword_7_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Wall__Group_7__0__Impl3555); 
             after(grammarAccess.getWallAccess().getOpeningsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__0__Impl"


    // $ANTLR start "rule__Wall__Group_7__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1802:1: rule__Wall__Group_7__1 : rule__Wall__Group_7__1__Impl rule__Wall__Group_7__2 ;
    public final void rule__Wall__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1806:1: ( rule__Wall__Group_7__1__Impl rule__Wall__Group_7__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1807:2: rule__Wall__Group_7__1__Impl rule__Wall__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__1__Impl_in_rule__Wall__Group_7__13586);
            rule__Wall__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__2_in_rule__Wall__Group_7__13589);
            rule__Wall__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__1"


    // $ANTLR start "rule__Wall__Group_7__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1814:1: rule__Wall__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Wall__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1818:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1819:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1819:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1820:1: '{'
            {
             before(grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Wall__Group_7__1__Impl3617); 
             after(grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__1__Impl"


    // $ANTLR start "rule__Wall__Group_7__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1833:1: rule__Wall__Group_7__2 : rule__Wall__Group_7__2__Impl rule__Wall__Group_7__3 ;
    public final void rule__Wall__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1837:1: ( rule__Wall__Group_7__2__Impl rule__Wall__Group_7__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1838:2: rule__Wall__Group_7__2__Impl rule__Wall__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__2__Impl_in_rule__Wall__Group_7__23648);
            rule__Wall__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__3_in_rule__Wall__Group_7__23651);
            rule__Wall__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__2"


    // $ANTLR start "rule__Wall__Group_7__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1845:1: rule__Wall__Group_7__2__Impl : ( ( rule__Wall__OpeningsAssignment_7_2 ) ) ;
    public final void rule__Wall__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1849:1: ( ( ( rule__Wall__OpeningsAssignment_7_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1850:1: ( ( rule__Wall__OpeningsAssignment_7_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1850:1: ( ( rule__Wall__OpeningsAssignment_7_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1851:1: ( rule__Wall__OpeningsAssignment_7_2 )
            {
             before(grammarAccess.getWallAccess().getOpeningsAssignment_7_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1852:1: ( rule__Wall__OpeningsAssignment_7_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1852:2: rule__Wall__OpeningsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__OpeningsAssignment_7_2_in_rule__Wall__Group_7__2__Impl3678);
            rule__Wall__OpeningsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getOpeningsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__2__Impl"


    // $ANTLR start "rule__Wall__Group_7__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1862:1: rule__Wall__Group_7__3 : rule__Wall__Group_7__3__Impl rule__Wall__Group_7__4 ;
    public final void rule__Wall__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1866:1: ( rule__Wall__Group_7__3__Impl rule__Wall__Group_7__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1867:2: rule__Wall__Group_7__3__Impl rule__Wall__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__3__Impl_in_rule__Wall__Group_7__33708);
            rule__Wall__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__4_in_rule__Wall__Group_7__33711);
            rule__Wall__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__3"


    // $ANTLR start "rule__Wall__Group_7__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1874:1: rule__Wall__Group_7__3__Impl : ( ( rule__Wall__Group_7_3__0 )* ) ;
    public final void rule__Wall__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1878:1: ( ( ( rule__Wall__Group_7_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1879:1: ( ( rule__Wall__Group_7_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1879:1: ( ( rule__Wall__Group_7_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1880:1: ( rule__Wall__Group_7_3__0 )*
            {
             before(grammarAccess.getWallAccess().getGroup_7_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1881:1: ( rule__Wall__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1881:2: rule__Wall__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7_3__0_in_rule__Wall__Group_7__3__Impl3738);
            	    rule__Wall__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWallAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__3__Impl"


    // $ANTLR start "rule__Wall__Group_7__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1891:1: rule__Wall__Group_7__4 : rule__Wall__Group_7__4__Impl ;
    public final void rule__Wall__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1895:1: ( rule__Wall__Group_7__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1896:2: rule__Wall__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7__4__Impl_in_rule__Wall__Group_7__43769);
            rule__Wall__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__4"


    // $ANTLR start "rule__Wall__Group_7__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1902:1: rule__Wall__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Wall__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1906:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1907:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1907:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1908:1: '}'
            {
             before(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Wall__Group_7__4__Impl3797); 
             after(grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7__4__Impl"


    // $ANTLR start "rule__Wall__Group_7_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1931:1: rule__Wall__Group_7_3__0 : rule__Wall__Group_7_3__0__Impl rule__Wall__Group_7_3__1 ;
    public final void rule__Wall__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1935:1: ( rule__Wall__Group_7_3__0__Impl rule__Wall__Group_7_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1936:2: rule__Wall__Group_7_3__0__Impl rule__Wall__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7_3__0__Impl_in_rule__Wall__Group_7_3__03838);
            rule__Wall__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7_3__1_in_rule__Wall__Group_7_3__03841);
            rule__Wall__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7_3__0"


    // $ANTLR start "rule__Wall__Group_7_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1943:1: rule__Wall__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Wall__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1947:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1948:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1948:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1949:1: ','
            {
             before(grammarAccess.getWallAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Wall__Group_7_3__0__Impl3869); 
             after(grammarAccess.getWallAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7_3__0__Impl"


    // $ANTLR start "rule__Wall__Group_7_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1962:1: rule__Wall__Group_7_3__1 : rule__Wall__Group_7_3__1__Impl ;
    public final void rule__Wall__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1966:1: ( rule__Wall__Group_7_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1967:2: rule__Wall__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__Group_7_3__1__Impl_in_rule__Wall__Group_7_3__13900);
            rule__Wall__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7_3__1"


    // $ANTLR start "rule__Wall__Group_7_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1973:1: rule__Wall__Group_7_3__1__Impl : ( ( rule__Wall__OpeningsAssignment_7_3_1 ) ) ;
    public final void rule__Wall__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1977:1: ( ( ( rule__Wall__OpeningsAssignment_7_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1978:1: ( ( rule__Wall__OpeningsAssignment_7_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1978:1: ( ( rule__Wall__OpeningsAssignment_7_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1979:1: ( rule__Wall__OpeningsAssignment_7_3_1 )
            {
             before(grammarAccess.getWallAccess().getOpeningsAssignment_7_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1980:1: ( rule__Wall__OpeningsAssignment_7_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1980:2: rule__Wall__OpeningsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Wall__OpeningsAssignment_7_3_1_in_rule__Wall__Group_7_3__1__Impl3927);
            rule__Wall__OpeningsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWallAccess().getOpeningsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__Group_7_3__1__Impl"


    // $ANTLR start "rule__Opening__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1994:1: rule__Opening__Group__0 : rule__Opening__Group__0__Impl rule__Opening__Group__1 ;
    public final void rule__Opening__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1998:1: ( rule__Opening__Group__0__Impl rule__Opening__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:1999:2: rule__Opening__Group__0__Impl rule__Opening__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__03961);
            rule__Opening__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__03964);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2006:1: rule__Opening__Group__0__Impl : ( 'Opening' ) ;
    public final void rule__Opening__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2010:1: ( ( 'Opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2011:1: ( 'Opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2011:1: ( 'Opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2012:1: 'Opening'
            {
             before(grammarAccess.getOpeningAccess().getOpeningKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Opening__Group__0__Impl3992); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2025:1: rule__Opening__Group__1 : rule__Opening__Group__1__Impl rule__Opening__Group__2 ;
    public final void rule__Opening__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2029:1: ( rule__Opening__Group__1__Impl rule__Opening__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2030:2: rule__Opening__Group__1__Impl rule__Opening__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__14023);
            rule__Opening__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__14026);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2037:1: rule__Opening__Group__1__Impl : ( '{' ) ;
    public final void rule__Opening__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2041:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2042:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2042:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2043:1: '{'
            {
             before(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Opening__Group__1__Impl4054); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2056:1: rule__Opening__Group__2 : rule__Opening__Group__2__Impl rule__Opening__Group__3 ;
    public final void rule__Opening__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2060:1: ( rule__Opening__Group__2__Impl rule__Opening__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2061:2: rule__Opening__Group__2__Impl rule__Opening__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__24085);
            rule__Opening__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__24088);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2068:1: rule__Opening__Group__2__Impl : ( ( rule__Opening__Group_2__0 )? ) ;
    public final void rule__Opening__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2072:1: ( ( ( rule__Opening__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2073:1: ( ( rule__Opening__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2073:1: ( ( rule__Opening__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2074:1: ( rule__Opening__Group_2__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2075:1: ( rule__Opening__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2075:2: rule__Opening__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl4115);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2085:1: rule__Opening__Group__3 : rule__Opening__Group__3__Impl rule__Opening__Group__4 ;
    public final void rule__Opening__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2089:1: ( rule__Opening__Group__3__Impl rule__Opening__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2090:2: rule__Opening__Group__3__Impl rule__Opening__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__34146);
            rule__Opening__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__34149);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2097:1: rule__Opening__Group__3__Impl : ( ( rule__Opening__Group_3__0 )? ) ;
    public final void rule__Opening__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2101:1: ( ( ( rule__Opening__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2102:1: ( ( rule__Opening__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2102:1: ( ( rule__Opening__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2103:1: ( rule__Opening__Group_3__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2104:1: ( rule__Opening__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2104:2: rule__Opening__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl4176);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2114:1: rule__Opening__Group__4 : rule__Opening__Group__4__Impl rule__Opening__Group__5 ;
    public final void rule__Opening__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2118:1: ( rule__Opening__Group__4__Impl rule__Opening__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2119:2: rule__Opening__Group__4__Impl rule__Opening__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__44207);
            rule__Opening__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__44210);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2126:1: rule__Opening__Group__4__Impl : ( ( rule__Opening__Group_4__0 )? ) ;
    public final void rule__Opening__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2130:1: ( ( ( rule__Opening__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2131:1: ( ( rule__Opening__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2131:1: ( ( rule__Opening__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2132:1: ( rule__Opening__Group_4__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2133:1: ( rule__Opening__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2133:2: rule__Opening__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__0_in_rule__Opening__Group__4__Impl4237);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2143:1: rule__Opening__Group__5 : rule__Opening__Group__5__Impl rule__Opening__Group__6 ;
    public final void rule__Opening__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2147:1: ( rule__Opening__Group__5__Impl rule__Opening__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2148:2: rule__Opening__Group__5__Impl rule__Opening__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__54268);
            rule__Opening__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__54271);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2155:1: rule__Opening__Group__5__Impl : ( 'placement' ) ;
    public final void rule__Opening__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2159:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2160:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2160:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2161:1: 'placement'
            {
             before(grammarAccess.getOpeningAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Opening__Group__5__Impl4299); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2174:1: rule__Opening__Group__6 : rule__Opening__Group__6__Impl rule__Opening__Group__7 ;
    public final void rule__Opening__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2178:1: ( rule__Opening__Group__6__Impl rule__Opening__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2179:2: rule__Opening__Group__6__Impl rule__Opening__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__64330);
            rule__Opening__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__64333);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2186:1: rule__Opening__Group__6__Impl : ( ( rule__Opening__PlacementAssignment_6 ) ) ;
    public final void rule__Opening__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2190:1: ( ( ( rule__Opening__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2191:1: ( ( rule__Opening__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2191:1: ( ( rule__Opening__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2192:1: ( rule__Opening__PlacementAssignment_6 )
            {
             before(grammarAccess.getOpeningAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2193:1: ( rule__Opening__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2193:2: rule__Opening__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__PlacementAssignment_6_in_rule__Opening__Group__6__Impl4360);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2203:1: rule__Opening__Group__7 : rule__Opening__Group__7__Impl rule__Opening__Group__8 ;
    public final void rule__Opening__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2207:1: ( rule__Opening__Group__7__Impl rule__Opening__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2208:2: rule__Opening__Group__7__Impl rule__Opening__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__74390);
            rule__Opening__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__74393);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2215:1: rule__Opening__Group__7__Impl : ( ( rule__Opening__Group_7__0 )? ) ;
    public final void rule__Opening__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2219:1: ( ( ( rule__Opening__Group_7__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2220:1: ( ( rule__Opening__Group_7__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2220:1: ( ( rule__Opening__Group_7__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2221:1: ( rule__Opening__Group_7__0 )?
            {
             before(grammarAccess.getOpeningAccess().getGroup_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2222:1: ( rule__Opening__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2222:2: rule__Opening__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__0_in_rule__Opening__Group__7__Impl4420);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2232:1: rule__Opening__Group__8 : rule__Opening__Group__8__Impl ;
    public final void rule__Opening__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2236:1: ( rule__Opening__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2237:2: rule__Opening__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__84451);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2243:1: rule__Opening__Group__8__Impl : ( '}' ) ;
    public final void rule__Opening__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2247:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2248:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2248:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2249:1: '}'
            {
             before(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Opening__Group__8__Impl4479); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2280:1: rule__Opening__Group_2__0 : rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 ;
    public final void rule__Opening__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2284:1: ( rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2285:2: rule__Opening__Group_2__0__Impl rule__Opening__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__04528);
            rule__Opening__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__04531);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2292:1: rule__Opening__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__Opening__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2296:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2297:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2297:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2298:1: 'GUID'
            {
             before(grammarAccess.getOpeningAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Opening__Group_2__0__Impl4559); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2311:1: rule__Opening__Group_2__1 : rule__Opening__Group_2__1__Impl ;
    public final void rule__Opening__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2315:1: ( rule__Opening__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2316:2: rule__Opening__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__14590);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2322:1: rule__Opening__Group_2__1__Impl : ( ( rule__Opening__GUIDAssignment_2_1 ) ) ;
    public final void rule__Opening__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2326:1: ( ( ( rule__Opening__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2327:1: ( ( rule__Opening__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2327:1: ( ( rule__Opening__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2328:1: ( rule__Opening__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getOpeningAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2329:1: ( rule__Opening__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2329:2: rule__Opening__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__GUIDAssignment_2_1_in_rule__Opening__Group_2__1__Impl4617);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2343:1: rule__Opening__Group_3__0 : rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 ;
    public final void rule__Opening__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2347:1: ( rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2348:2: rule__Opening__Group_3__0__Impl rule__Opening__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__04651);
            rule__Opening__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__04654);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2355:1: rule__Opening__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Opening__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2359:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2360:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2360:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2361:1: 'Name'
            {
             before(grammarAccess.getOpeningAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Opening__Group_3__0__Impl4682); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2374:1: rule__Opening__Group_3__1 : rule__Opening__Group_3__1__Impl ;
    public final void rule__Opening__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2378:1: ( rule__Opening__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2379:2: rule__Opening__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__14713);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2385:1: rule__Opening__Group_3__1__Impl : ( ( rule__Opening__NameAssignment_3_1 ) ) ;
    public final void rule__Opening__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2389:1: ( ( ( rule__Opening__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2390:1: ( ( rule__Opening__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2390:1: ( ( rule__Opening__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2391:1: ( rule__Opening__NameAssignment_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2392:1: ( rule__Opening__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2392:2: rule__Opening__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__NameAssignment_3_1_in_rule__Opening__Group_3__1__Impl4740);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2406:1: rule__Opening__Group_4__0 : rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1 ;
    public final void rule__Opening__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2410:1: ( rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2411:2: rule__Opening__Group_4__0__Impl rule__Opening__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__0__Impl_in_rule__Opening__Group_4__04774);
            rule__Opening__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__1_in_rule__Opening__Group_4__04777);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2418:1: rule__Opening__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Opening__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2422:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2423:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2423:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2424:1: 'Description'
            {
             before(grammarAccess.getOpeningAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Opening__Group_4__0__Impl4805); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2437:1: rule__Opening__Group_4__1 : rule__Opening__Group_4__1__Impl ;
    public final void rule__Opening__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2441:1: ( rule__Opening__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2442:2: rule__Opening__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_4__1__Impl_in_rule__Opening__Group_4__14836);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2448:1: rule__Opening__Group_4__1__Impl : ( ( rule__Opening__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Opening__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2452:1: ( ( ( rule__Opening__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2453:1: ( ( rule__Opening__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2453:1: ( ( rule__Opening__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2454:1: ( rule__Opening__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getOpeningAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2455:1: ( rule__Opening__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2455:2: rule__Opening__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__DescriptionAssignment_4_1_in_rule__Opening__Group_4__1__Impl4863);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2469:1: rule__Opening__Group_7__0 : rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1 ;
    public final void rule__Opening__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2473:1: ( rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2474:2: rule__Opening__Group_7__0__Impl rule__Opening__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__0__Impl_in_rule__Opening__Group_7__04897);
            rule__Opening__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__1_in_rule__Opening__Group_7__04900);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2481:1: rule__Opening__Group_7__0__Impl : ( 'walls' ) ;
    public final void rule__Opening__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2485:1: ( ( 'walls' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2486:1: ( 'walls' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2486:1: ( 'walls' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2487:1: 'walls'
            {
             before(grammarAccess.getOpeningAccess().getWallsKeyword_7_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Opening__Group_7__0__Impl4928); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2500:1: rule__Opening__Group_7__1 : rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2 ;
    public final void rule__Opening__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2504:1: ( rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2505:2: rule__Opening__Group_7__1__Impl rule__Opening__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__1__Impl_in_rule__Opening__Group_7__14959);
            rule__Opening__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__2_in_rule__Opening__Group_7__14962);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2512:1: rule__Opening__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Opening__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2516:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2517:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2517:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2518:1: '{'
            {
             before(grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Opening__Group_7__1__Impl4990); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2531:1: rule__Opening__Group_7__2 : rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3 ;
    public final void rule__Opening__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2535:1: ( rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2536:2: rule__Opening__Group_7__2__Impl rule__Opening__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__2__Impl_in_rule__Opening__Group_7__25021);
            rule__Opening__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__3_in_rule__Opening__Group_7__25024);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2543:1: rule__Opening__Group_7__2__Impl : ( ( rule__Opening__WallsAssignment_7_2 ) ) ;
    public final void rule__Opening__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2547:1: ( ( ( rule__Opening__WallsAssignment_7_2 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2548:1: ( ( rule__Opening__WallsAssignment_7_2 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2548:1: ( ( rule__Opening__WallsAssignment_7_2 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2549:1: ( rule__Opening__WallsAssignment_7_2 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2550:1: ( rule__Opening__WallsAssignment_7_2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2550:2: rule__Opening__WallsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_2_in_rule__Opening__Group_7__2__Impl5051);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2560:1: rule__Opening__Group_7__3 : rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4 ;
    public final void rule__Opening__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2564:1: ( rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2565:2: rule__Opening__Group_7__3__Impl rule__Opening__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__3__Impl_in_rule__Opening__Group_7__35081);
            rule__Opening__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__4_in_rule__Opening__Group_7__35084);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2572:1: rule__Opening__Group_7__3__Impl : ( ( rule__Opening__Group_7_3__0 )* ) ;
    public final void rule__Opening__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2576:1: ( ( ( rule__Opening__Group_7_3__0 )* ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2577:1: ( ( rule__Opening__Group_7_3__0 )* )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2577:1: ( ( rule__Opening__Group_7_3__0 )* )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2578:1: ( rule__Opening__Group_7_3__0 )*
            {
             before(grammarAccess.getOpeningAccess().getGroup_7_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2579:1: ( rule__Opening__Group_7_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==17) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2579:2: rule__Opening__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__0_in_rule__Opening__Group_7__3__Impl5111);
            	    rule__Opening__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2589:1: rule__Opening__Group_7__4 : rule__Opening__Group_7__4__Impl ;
    public final void rule__Opening__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2593:1: ( rule__Opening__Group_7__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2594:2: rule__Opening__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7__4__Impl_in_rule__Opening__Group_7__45142);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2600:1: rule__Opening__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Opening__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2604:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2605:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2605:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2606:1: '}'
            {
             before(grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Opening__Group_7__4__Impl5170); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2629:1: rule__Opening__Group_7_3__0 : rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1 ;
    public final void rule__Opening__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2633:1: ( rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2634:2: rule__Opening__Group_7_3__0__Impl rule__Opening__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__0__Impl_in_rule__Opening__Group_7_3__05211);
            rule__Opening__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__1_in_rule__Opening__Group_7_3__05214);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2641:1: rule__Opening__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Opening__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2645:1: ( ( ',' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2646:1: ( ',' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2646:1: ( ',' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2647:1: ','
            {
             before(grammarAccess.getOpeningAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Opening__Group_7_3__0__Impl5242); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2660:1: rule__Opening__Group_7_3__1 : rule__Opening__Group_7_3__1__Impl ;
    public final void rule__Opening__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2664:1: ( rule__Opening__Group_7_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2665:2: rule__Opening__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__Group_7_3__1__Impl_in_rule__Opening__Group_7_3__15273);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2671:1: rule__Opening__Group_7_3__1__Impl : ( ( rule__Opening__WallsAssignment_7_3_1 ) ) ;
    public final void rule__Opening__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2675:1: ( ( ( rule__Opening__WallsAssignment_7_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2676:1: ( ( rule__Opening__WallsAssignment_7_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2676:1: ( ( rule__Opening__WallsAssignment_7_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2677:1: ( rule__Opening__WallsAssignment_7_3_1 )
            {
             before(grammarAccess.getOpeningAccess().getWallsAssignment_7_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2678:1: ( rule__Opening__WallsAssignment_7_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2678:2: rule__Opening__WallsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Opening__WallsAssignment_7_3_1_in_rule__Opening__Group_7_3__1__Impl5300);
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


    // $ANTLR start "rule__WallRelation__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2692:1: rule__WallRelation__Group__0 : rule__WallRelation__Group__0__Impl rule__WallRelation__Group__1 ;
    public final void rule__WallRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2696:1: ( rule__WallRelation__Group__0__Impl rule__WallRelation__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2697:2: rule__WallRelation__Group__0__Impl rule__WallRelation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__0__Impl_in_rule__WallRelation__Group__05334);
            rule__WallRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__1_in_rule__WallRelation__Group__05337);
            rule__WallRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__0"


    // $ANTLR start "rule__WallRelation__Group__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2704:1: rule__WallRelation__Group__0__Impl : ( 'WallRelation' ) ;
    public final void rule__WallRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2708:1: ( ( 'WallRelation' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2709:1: ( 'WallRelation' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2709:1: ( 'WallRelation' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2710:1: 'WallRelation'
            {
             before(grammarAccess.getWallRelationAccess().getWallRelationKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__WallRelation__Group__0__Impl5365); 
             after(grammarAccess.getWallRelationAccess().getWallRelationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__0__Impl"


    // $ANTLR start "rule__WallRelation__Group__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2723:1: rule__WallRelation__Group__1 : rule__WallRelation__Group__1__Impl rule__WallRelation__Group__2 ;
    public final void rule__WallRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2727:1: ( rule__WallRelation__Group__1__Impl rule__WallRelation__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2728:2: rule__WallRelation__Group__1__Impl rule__WallRelation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__1__Impl_in_rule__WallRelation__Group__15396);
            rule__WallRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__2_in_rule__WallRelation__Group__15399);
            rule__WallRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__1"


    // $ANTLR start "rule__WallRelation__Group__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2735:1: rule__WallRelation__Group__1__Impl : ( '{' ) ;
    public final void rule__WallRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2739:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2740:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2740:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2741:1: '{'
            {
             before(grammarAccess.getWallRelationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__WallRelation__Group__1__Impl5427); 
             after(grammarAccess.getWallRelationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__1__Impl"


    // $ANTLR start "rule__WallRelation__Group__2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2754:1: rule__WallRelation__Group__2 : rule__WallRelation__Group__2__Impl rule__WallRelation__Group__3 ;
    public final void rule__WallRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2758:1: ( rule__WallRelation__Group__2__Impl rule__WallRelation__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2759:2: rule__WallRelation__Group__2__Impl rule__WallRelation__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__2__Impl_in_rule__WallRelation__Group__25458);
            rule__WallRelation__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__3_in_rule__WallRelation__Group__25461);
            rule__WallRelation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__2"


    // $ANTLR start "rule__WallRelation__Group__2__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2766:1: rule__WallRelation__Group__2__Impl : ( ( rule__WallRelation__Group_2__0 )? ) ;
    public final void rule__WallRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2770:1: ( ( ( rule__WallRelation__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2771:1: ( ( rule__WallRelation__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2771:1: ( ( rule__WallRelation__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2772:1: ( rule__WallRelation__Group_2__0 )?
            {
             before(grammarAccess.getWallRelationAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2773:1: ( rule__WallRelation__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2773:2: rule__WallRelation__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_2__0_in_rule__WallRelation__Group__2__Impl5488);
                    rule__WallRelation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallRelationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__2__Impl"


    // $ANTLR start "rule__WallRelation__Group__3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2783:1: rule__WallRelation__Group__3 : rule__WallRelation__Group__3__Impl rule__WallRelation__Group__4 ;
    public final void rule__WallRelation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2787:1: ( rule__WallRelation__Group__3__Impl rule__WallRelation__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2788:2: rule__WallRelation__Group__3__Impl rule__WallRelation__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__3__Impl_in_rule__WallRelation__Group__35519);
            rule__WallRelation__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__4_in_rule__WallRelation__Group__35522);
            rule__WallRelation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__3"


    // $ANTLR start "rule__WallRelation__Group__3__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2795:1: rule__WallRelation__Group__3__Impl : ( ( rule__WallRelation__Group_3__0 )? ) ;
    public final void rule__WallRelation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2799:1: ( ( ( rule__WallRelation__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2800:1: ( ( rule__WallRelation__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2800:1: ( ( rule__WallRelation__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2801:1: ( rule__WallRelation__Group_3__0 )?
            {
             before(grammarAccess.getWallRelationAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2802:1: ( rule__WallRelation__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2802:2: rule__WallRelation__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_3__0_in_rule__WallRelation__Group__3__Impl5549);
                    rule__WallRelation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallRelationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__3__Impl"


    // $ANTLR start "rule__WallRelation__Group__4"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2812:1: rule__WallRelation__Group__4 : rule__WallRelation__Group__4__Impl rule__WallRelation__Group__5 ;
    public final void rule__WallRelation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2816:1: ( rule__WallRelation__Group__4__Impl rule__WallRelation__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2817:2: rule__WallRelation__Group__4__Impl rule__WallRelation__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__4__Impl_in_rule__WallRelation__Group__45580);
            rule__WallRelation__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__5_in_rule__WallRelation__Group__45583);
            rule__WallRelation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__4"


    // $ANTLR start "rule__WallRelation__Group__4__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2824:1: rule__WallRelation__Group__4__Impl : ( ( rule__WallRelation__Group_4__0 )? ) ;
    public final void rule__WallRelation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2828:1: ( ( ( rule__WallRelation__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2829:1: ( ( rule__WallRelation__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2829:1: ( ( rule__WallRelation__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2830:1: ( rule__WallRelation__Group_4__0 )?
            {
             before(grammarAccess.getWallRelationAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2831:1: ( rule__WallRelation__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2831:2: rule__WallRelation__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_4__0_in_rule__WallRelation__Group__4__Impl5610);
                    rule__WallRelation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWallRelationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__4__Impl"


    // $ANTLR start "rule__WallRelation__Group__5"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2841:1: rule__WallRelation__Group__5 : rule__WallRelation__Group__5__Impl rule__WallRelation__Group__6 ;
    public final void rule__WallRelation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2845:1: ( rule__WallRelation__Group__5__Impl rule__WallRelation__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2846:2: rule__WallRelation__Group__5__Impl rule__WallRelation__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__5__Impl_in_rule__WallRelation__Group__55641);
            rule__WallRelation__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__6_in_rule__WallRelation__Group__55644);
            rule__WallRelation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__5"


    // $ANTLR start "rule__WallRelation__Group__5__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2853:1: rule__WallRelation__Group__5__Impl : ( 'wall' ) ;
    public final void rule__WallRelation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2857:1: ( ( 'wall' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2858:1: ( 'wall' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2858:1: ( 'wall' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2859:1: 'wall'
            {
             before(grammarAccess.getWallRelationAccess().getWallKeyword_5()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__WallRelation__Group__5__Impl5672); 
             after(grammarAccess.getWallRelationAccess().getWallKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__5__Impl"


    // $ANTLR start "rule__WallRelation__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2872:1: rule__WallRelation__Group__6 : rule__WallRelation__Group__6__Impl rule__WallRelation__Group__7 ;
    public final void rule__WallRelation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2876:1: ( rule__WallRelation__Group__6__Impl rule__WallRelation__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2877:2: rule__WallRelation__Group__6__Impl rule__WallRelation__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__6__Impl_in_rule__WallRelation__Group__65703);
            rule__WallRelation__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__7_in_rule__WallRelation__Group__65706);
            rule__WallRelation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__6"


    // $ANTLR start "rule__WallRelation__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2884:1: rule__WallRelation__Group__6__Impl : ( ( rule__WallRelation__WallAssignment_6 ) ) ;
    public final void rule__WallRelation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2888:1: ( ( ( rule__WallRelation__WallAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2889:1: ( ( rule__WallRelation__WallAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2889:1: ( ( rule__WallRelation__WallAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2890:1: ( rule__WallRelation__WallAssignment_6 )
            {
             before(grammarAccess.getWallRelationAccess().getWallAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2891:1: ( rule__WallRelation__WallAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2891:2: rule__WallRelation__WallAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__WallAssignment_6_in_rule__WallRelation__Group__6__Impl5733);
            rule__WallRelation__WallAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getWallAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__6__Impl"


    // $ANTLR start "rule__WallRelation__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2901:1: rule__WallRelation__Group__7 : rule__WallRelation__Group__7__Impl rule__WallRelation__Group__8 ;
    public final void rule__WallRelation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2905:1: ( rule__WallRelation__Group__7__Impl rule__WallRelation__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2906:2: rule__WallRelation__Group__7__Impl rule__WallRelation__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__7__Impl_in_rule__WallRelation__Group__75763);
            rule__WallRelation__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__8_in_rule__WallRelation__Group__75766);
            rule__WallRelation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__7"


    // $ANTLR start "rule__WallRelation__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2913:1: rule__WallRelation__Group__7__Impl : ( 'opening' ) ;
    public final void rule__WallRelation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2917:1: ( ( 'opening' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2918:1: ( 'opening' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2918:1: ( 'opening' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2919:1: 'opening'
            {
             before(grammarAccess.getWallRelationAccess().getOpeningKeyword_7()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__WallRelation__Group__7__Impl5794); 
             after(grammarAccess.getWallRelationAccess().getOpeningKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__7__Impl"


    // $ANTLR start "rule__WallRelation__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2932:1: rule__WallRelation__Group__8 : rule__WallRelation__Group__8__Impl rule__WallRelation__Group__9 ;
    public final void rule__WallRelation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2936:1: ( rule__WallRelation__Group__8__Impl rule__WallRelation__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2937:2: rule__WallRelation__Group__8__Impl rule__WallRelation__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__8__Impl_in_rule__WallRelation__Group__85825);
            rule__WallRelation__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__9_in_rule__WallRelation__Group__85828);
            rule__WallRelation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__8"


    // $ANTLR start "rule__WallRelation__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2944:1: rule__WallRelation__Group__8__Impl : ( ( rule__WallRelation__OpeningAssignment_8 ) ) ;
    public final void rule__WallRelation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2948:1: ( ( ( rule__WallRelation__OpeningAssignment_8 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2949:1: ( ( rule__WallRelation__OpeningAssignment_8 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2949:1: ( ( rule__WallRelation__OpeningAssignment_8 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2950:1: ( rule__WallRelation__OpeningAssignment_8 )
            {
             before(grammarAccess.getWallRelationAccess().getOpeningAssignment_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2951:1: ( rule__WallRelation__OpeningAssignment_8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2951:2: rule__WallRelation__OpeningAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__OpeningAssignment_8_in_rule__WallRelation__Group__8__Impl5855);
            rule__WallRelation__OpeningAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getOpeningAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__8__Impl"


    // $ANTLR start "rule__WallRelation__Group__9"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2961:1: rule__WallRelation__Group__9 : rule__WallRelation__Group__9__Impl ;
    public final void rule__WallRelation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2965:1: ( rule__WallRelation__Group__9__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2966:2: rule__WallRelation__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group__9__Impl_in_rule__WallRelation__Group__95885);
            rule__WallRelation__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__9"


    // $ANTLR start "rule__WallRelation__Group__9__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2972:1: rule__WallRelation__Group__9__Impl : ( '}' ) ;
    public final void rule__WallRelation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2976:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2977:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:2978:1: '}'
            {
             before(grammarAccess.getWallRelationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__WallRelation__Group__9__Impl5913); 
             after(grammarAccess.getWallRelationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group__9__Impl"


    // $ANTLR start "rule__WallRelation__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3011:1: rule__WallRelation__Group_2__0 : rule__WallRelation__Group_2__0__Impl rule__WallRelation__Group_2__1 ;
    public final void rule__WallRelation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3015:1: ( rule__WallRelation__Group_2__0__Impl rule__WallRelation__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3016:2: rule__WallRelation__Group_2__0__Impl rule__WallRelation__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_2__0__Impl_in_rule__WallRelation__Group_2__05964);
            rule__WallRelation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_2__1_in_rule__WallRelation__Group_2__05967);
            rule__WallRelation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_2__0"


    // $ANTLR start "rule__WallRelation__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3023:1: rule__WallRelation__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__WallRelation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3027:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3028:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3028:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3029:1: 'GUID'
            {
             before(grammarAccess.getWallRelationAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WallRelation__Group_2__0__Impl5995); 
             after(grammarAccess.getWallRelationAccess().getGUIDKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_2__0__Impl"


    // $ANTLR start "rule__WallRelation__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3042:1: rule__WallRelation__Group_2__1 : rule__WallRelation__Group_2__1__Impl ;
    public final void rule__WallRelation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3046:1: ( rule__WallRelation__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3047:2: rule__WallRelation__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_2__1__Impl_in_rule__WallRelation__Group_2__16026);
            rule__WallRelation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_2__1"


    // $ANTLR start "rule__WallRelation__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3053:1: rule__WallRelation__Group_2__1__Impl : ( ( rule__WallRelation__GUIDAssignment_2_1 ) ) ;
    public final void rule__WallRelation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3057:1: ( ( ( rule__WallRelation__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3058:1: ( ( rule__WallRelation__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3058:1: ( ( rule__WallRelation__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3059:1: ( rule__WallRelation__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getWallRelationAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3060:1: ( rule__WallRelation__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3060:2: rule__WallRelation__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__GUIDAssignment_2_1_in_rule__WallRelation__Group_2__1__Impl6053);
            rule__WallRelation__GUIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getGUIDAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_2__1__Impl"


    // $ANTLR start "rule__WallRelation__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3074:1: rule__WallRelation__Group_3__0 : rule__WallRelation__Group_3__0__Impl rule__WallRelation__Group_3__1 ;
    public final void rule__WallRelation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3078:1: ( rule__WallRelation__Group_3__0__Impl rule__WallRelation__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3079:2: rule__WallRelation__Group_3__0__Impl rule__WallRelation__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_3__0__Impl_in_rule__WallRelation__Group_3__06087);
            rule__WallRelation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_3__1_in_rule__WallRelation__Group_3__06090);
            rule__WallRelation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_3__0"


    // $ANTLR start "rule__WallRelation__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3086:1: rule__WallRelation__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__WallRelation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3090:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3091:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3091:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3092:1: 'Name'
            {
             before(grammarAccess.getWallRelationAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WallRelation__Group_3__0__Impl6118); 
             after(grammarAccess.getWallRelationAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_3__0__Impl"


    // $ANTLR start "rule__WallRelation__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3105:1: rule__WallRelation__Group_3__1 : rule__WallRelation__Group_3__1__Impl ;
    public final void rule__WallRelation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3109:1: ( rule__WallRelation__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3110:2: rule__WallRelation__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_3__1__Impl_in_rule__WallRelation__Group_3__16149);
            rule__WallRelation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_3__1"


    // $ANTLR start "rule__WallRelation__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3116:1: rule__WallRelation__Group_3__1__Impl : ( ( rule__WallRelation__NameAssignment_3_1 ) ) ;
    public final void rule__WallRelation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3120:1: ( ( ( rule__WallRelation__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3121:1: ( ( rule__WallRelation__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3121:1: ( ( rule__WallRelation__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3122:1: ( rule__WallRelation__NameAssignment_3_1 )
            {
             before(grammarAccess.getWallRelationAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3123:1: ( rule__WallRelation__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3123:2: rule__WallRelation__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__NameAssignment_3_1_in_rule__WallRelation__Group_3__1__Impl6176);
            rule__WallRelation__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_3__1__Impl"


    // $ANTLR start "rule__WallRelation__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3137:1: rule__WallRelation__Group_4__0 : rule__WallRelation__Group_4__0__Impl rule__WallRelation__Group_4__1 ;
    public final void rule__WallRelation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3141:1: ( rule__WallRelation__Group_4__0__Impl rule__WallRelation__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3142:2: rule__WallRelation__Group_4__0__Impl rule__WallRelation__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_4__0__Impl_in_rule__WallRelation__Group_4__06210);
            rule__WallRelation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_4__1_in_rule__WallRelation__Group_4__06213);
            rule__WallRelation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_4__0"


    // $ANTLR start "rule__WallRelation__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3149:1: rule__WallRelation__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__WallRelation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3153:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3154:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3154:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3155:1: 'Description'
            {
             before(grammarAccess.getWallRelationAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__WallRelation__Group_4__0__Impl6241); 
             after(grammarAccess.getWallRelationAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_4__0__Impl"


    // $ANTLR start "rule__WallRelation__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3168:1: rule__WallRelation__Group_4__1 : rule__WallRelation__Group_4__1__Impl ;
    public final void rule__WallRelation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3172:1: ( rule__WallRelation__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3173:2: rule__WallRelation__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__Group_4__1__Impl_in_rule__WallRelation__Group_4__16272);
            rule__WallRelation__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_4__1"


    // $ANTLR start "rule__WallRelation__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3179:1: rule__WallRelation__Group_4__1__Impl : ( ( rule__WallRelation__DescriptionAssignment_4_1 ) ) ;
    public final void rule__WallRelation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3183:1: ( ( ( rule__WallRelation__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3184:1: ( ( rule__WallRelation__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3184:1: ( ( rule__WallRelation__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3185:1: ( rule__WallRelation__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getWallRelationAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3186:1: ( rule__WallRelation__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3186:2: rule__WallRelation__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WallRelation__DescriptionAssignment_4_1_in_rule__WallRelation__Group_4__1__Impl6299);
            rule__WallRelation__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWallRelationAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__Group_4__1__Impl"


    // $ANTLR start "rule__FlowSegment__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3200:1: rule__FlowSegment__Group__0 : rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 ;
    public final void rule__FlowSegment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3204:1: ( rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3205:2: rule__FlowSegment__Group__0__Impl rule__FlowSegment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__06333);
            rule__FlowSegment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__06336);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3212:1: rule__FlowSegment__Group__0__Impl : ( 'FlowSegment' ) ;
    public final void rule__FlowSegment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3216:1: ( ( 'FlowSegment' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3217:1: ( 'FlowSegment' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3217:1: ( 'FlowSegment' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3218:1: 'FlowSegment'
            {
             before(grammarAccess.getFlowSegmentAccess().getFlowSegmentKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__FlowSegment__Group__0__Impl6364); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3231:1: rule__FlowSegment__Group__1 : rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 ;
    public final void rule__FlowSegment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3235:1: ( rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3236:2: rule__FlowSegment__Group__1__Impl rule__FlowSegment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__16395);
            rule__FlowSegment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__16398);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3243:1: rule__FlowSegment__Group__1__Impl : ( '{' ) ;
    public final void rule__FlowSegment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3247:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3248:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3248:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3249:1: '{'
            {
             before(grammarAccess.getFlowSegmentAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__FlowSegment__Group__1__Impl6426); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3262:1: rule__FlowSegment__Group__2 : rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 ;
    public final void rule__FlowSegment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3266:1: ( rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3267:2: rule__FlowSegment__Group__2__Impl rule__FlowSegment__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__26457);
            rule__FlowSegment__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__26460);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3274:1: rule__FlowSegment__Group__2__Impl : ( ( rule__FlowSegment__Group_2__0 )? ) ;
    public final void rule__FlowSegment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3278:1: ( ( ( rule__FlowSegment__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3279:1: ( ( rule__FlowSegment__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3279:1: ( ( rule__FlowSegment__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3280:1: ( rule__FlowSegment__Group_2__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3281:1: ( rule__FlowSegment__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3281:2: rule__FlowSegment__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl6487);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3291:1: rule__FlowSegment__Group__3 : rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 ;
    public final void rule__FlowSegment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3295:1: ( rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3296:2: rule__FlowSegment__Group__3__Impl rule__FlowSegment__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__36518);
            rule__FlowSegment__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__36521);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3303:1: rule__FlowSegment__Group__3__Impl : ( ( rule__FlowSegment__Group_3__0 )? ) ;
    public final void rule__FlowSegment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3307:1: ( ( ( rule__FlowSegment__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3308:1: ( ( rule__FlowSegment__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3308:1: ( ( rule__FlowSegment__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3309:1: ( rule__FlowSegment__Group_3__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:1: ( rule__FlowSegment__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3310:2: rule__FlowSegment__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl6548);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3320:1: rule__FlowSegment__Group__4 : rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 ;
    public final void rule__FlowSegment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3324:1: ( rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3325:2: rule__FlowSegment__Group__4__Impl rule__FlowSegment__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__46579);
            rule__FlowSegment__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__46582);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3332:1: rule__FlowSegment__Group__4__Impl : ( ( rule__FlowSegment__Group_4__0 )? ) ;
    public final void rule__FlowSegment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3336:1: ( ( ( rule__FlowSegment__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3337:1: ( ( rule__FlowSegment__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3337:1: ( ( rule__FlowSegment__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3338:1: ( rule__FlowSegment__Group_4__0 )?
            {
             before(grammarAccess.getFlowSegmentAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3339:1: ( rule__FlowSegment__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3339:2: rule__FlowSegment__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__0_in_rule__FlowSegment__Group__4__Impl6609);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3349:1: rule__FlowSegment__Group__5 : rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6 ;
    public final void rule__FlowSegment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3353:1: ( rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3354:2: rule__FlowSegment__Group__5__Impl rule__FlowSegment__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__56640);
            rule__FlowSegment__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__6_in_rule__FlowSegment__Group__56643);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3361:1: rule__FlowSegment__Group__5__Impl : ( 'placement' ) ;
    public final void rule__FlowSegment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3365:1: ( ( 'placement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3366:1: ( 'placement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3366:1: ( 'placement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3367:1: 'placement'
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FlowSegment__Group__5__Impl6671); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3380:1: rule__FlowSegment__Group__6 : rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7 ;
    public final void rule__FlowSegment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3384:1: ( rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3385:2: rule__FlowSegment__Group__6__Impl rule__FlowSegment__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__6__Impl_in_rule__FlowSegment__Group__66702);
            rule__FlowSegment__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__7_in_rule__FlowSegment__Group__66705);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3392:1: rule__FlowSegment__Group__6__Impl : ( ( rule__FlowSegment__PlacementAssignment_6 ) ) ;
    public final void rule__FlowSegment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3396:1: ( ( ( rule__FlowSegment__PlacementAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3397:1: ( ( rule__FlowSegment__PlacementAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3397:1: ( ( rule__FlowSegment__PlacementAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3398:1: ( rule__FlowSegment__PlacementAssignment_6 )
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3399:1: ( rule__FlowSegment__PlacementAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3399:2: rule__FlowSegment__PlacementAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__PlacementAssignment_6_in_rule__FlowSegment__Group__6__Impl6732);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3409:1: rule__FlowSegment__Group__7 : rule__FlowSegment__Group__7__Impl ;
    public final void rule__FlowSegment__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3413:1: ( rule__FlowSegment__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3414:2: rule__FlowSegment__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group__7__Impl_in_rule__FlowSegment__Group__76762);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3420:1: rule__FlowSegment__Group__7__Impl : ( '}' ) ;
    public final void rule__FlowSegment__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3424:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3425:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3425:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3426:1: '}'
            {
             before(grammarAccess.getFlowSegmentAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__FlowSegment__Group__7__Impl6790); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3455:1: rule__FlowSegment__Group_2__0 : rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 ;
    public final void rule__FlowSegment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3459:1: ( rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3460:2: rule__FlowSegment__Group_2__0__Impl rule__FlowSegment__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__06837);
            rule__FlowSegment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__06840);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3467:1: rule__FlowSegment__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__FlowSegment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3471:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3472:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3472:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3473:1: 'GUID'
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl6868); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3486:1: rule__FlowSegment__Group_2__1 : rule__FlowSegment__Group_2__1__Impl ;
    public final void rule__FlowSegment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3490:1: ( rule__FlowSegment__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3491:2: rule__FlowSegment__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__16899);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3497:1: rule__FlowSegment__Group_2__1__Impl : ( ( rule__FlowSegment__GUIDAssignment_2_1 ) ) ;
    public final void rule__FlowSegment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3501:1: ( ( ( rule__FlowSegment__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3502:1: ( ( rule__FlowSegment__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3502:1: ( ( rule__FlowSegment__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3503:1: ( rule__FlowSegment__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3504:1: ( rule__FlowSegment__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3504:2: rule__FlowSegment__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__GUIDAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl6926);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3518:1: rule__FlowSegment__Group_3__0 : rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 ;
    public final void rule__FlowSegment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3522:1: ( rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3523:2: rule__FlowSegment__Group_3__0__Impl rule__FlowSegment__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__06960);
            rule__FlowSegment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__06963);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3530:1: rule__FlowSegment__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__FlowSegment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3534:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3535:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3535:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3536:1: 'Name'
            {
             before(grammarAccess.getFlowSegmentAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl6991); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3549:1: rule__FlowSegment__Group_3__1 : rule__FlowSegment__Group_3__1__Impl ;
    public final void rule__FlowSegment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3553:1: ( rule__FlowSegment__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3554:2: rule__FlowSegment__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__17022);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3560:1: rule__FlowSegment__Group_3__1__Impl : ( ( rule__FlowSegment__NameAssignment_3_1 ) ) ;
    public final void rule__FlowSegment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3564:1: ( ( ( rule__FlowSegment__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3565:1: ( ( rule__FlowSegment__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3565:1: ( ( rule__FlowSegment__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3566:1: ( rule__FlowSegment__NameAssignment_3_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3567:1: ( rule__FlowSegment__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3567:2: rule__FlowSegment__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__NameAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl7049);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3581:1: rule__FlowSegment__Group_4__0 : rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1 ;
    public final void rule__FlowSegment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3585:1: ( rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3586:2: rule__FlowSegment__Group_4__0__Impl rule__FlowSegment__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__0__Impl_in_rule__FlowSegment__Group_4__07083);
            rule__FlowSegment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__1_in_rule__FlowSegment__Group_4__07086);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3593:1: rule__FlowSegment__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__FlowSegment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3597:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3598:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3598:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3599:1: 'Description'
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FlowSegment__Group_4__0__Impl7114); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3612:1: rule__FlowSegment__Group_4__1 : rule__FlowSegment__Group_4__1__Impl ;
    public final void rule__FlowSegment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3616:1: ( rule__FlowSegment__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3617:2: rule__FlowSegment__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__Group_4__1__Impl_in_rule__FlowSegment__Group_4__17145);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3623:1: rule__FlowSegment__Group_4__1__Impl : ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) ) ;
    public final void rule__FlowSegment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3627:1: ( ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3628:1: ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3628:1: ( ( rule__FlowSegment__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3629:1: ( rule__FlowSegment__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3630:1: ( rule__FlowSegment__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3630:2: rule__FlowSegment__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FlowSegment__DescriptionAssignment_4_1_in_rule__FlowSegment__Group_4__1__Impl7172);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3644:1: rule__LocalPlacement__Group__0 : rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 ;
    public final void rule__LocalPlacement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3648:1: ( rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3649:2: rule__LocalPlacement__Group__0__Impl rule__LocalPlacement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__07206);
            rule__LocalPlacement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__07209);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3656:1: rule__LocalPlacement__Group__0__Impl : ( () ) ;
    public final void rule__LocalPlacement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3660:1: ( ( () ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3661:1: ( () )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3661:1: ( () )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3662:1: ()
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3663:1: ()
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3665:1: 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3675:1: rule__LocalPlacement__Group__1 : rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 ;
    public final void rule__LocalPlacement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3679:1: ( rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3680:2: rule__LocalPlacement__Group__1__Impl rule__LocalPlacement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__17267);
            rule__LocalPlacement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__17270);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3687:1: rule__LocalPlacement__Group__1__Impl : ( 'LocalPlacement' ) ;
    public final void rule__LocalPlacement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3691:1: ( ( 'LocalPlacement' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3692:1: ( 'LocalPlacement' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3692:1: ( 'LocalPlacement' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3693:1: 'LocalPlacement'
            {
             before(grammarAccess.getLocalPlacementAccess().getLocalPlacementKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__LocalPlacement__Group__1__Impl7298); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3706:1: rule__LocalPlacement__Group__2 : rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 ;
    public final void rule__LocalPlacement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3710:1: ( rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3711:2: rule__LocalPlacement__Group__2__Impl rule__LocalPlacement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__27329);
            rule__LocalPlacement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__27332);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3718:1: rule__LocalPlacement__Group__2__Impl : ( '{' ) ;
    public final void rule__LocalPlacement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3722:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3723:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3723:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3724:1: '{'
            {
             before(grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__LocalPlacement__Group__2__Impl7360); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3737:1: rule__LocalPlacement__Group__3 : rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 ;
    public final void rule__LocalPlacement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3741:1: ( rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3742:2: rule__LocalPlacement__Group__3__Impl rule__LocalPlacement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__37391);
            rule__LocalPlacement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__37394);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3749:1: rule__LocalPlacement__Group__3__Impl : ( ( rule__LocalPlacement__Group_3__0 )? ) ;
    public final void rule__LocalPlacement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3753:1: ( ( ( rule__LocalPlacement__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3754:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3754:1: ( ( rule__LocalPlacement__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3755:1: ( rule__LocalPlacement__Group_3__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3756:1: ( rule__LocalPlacement__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3756:2: rule__LocalPlacement__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl7421);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3766:1: rule__LocalPlacement__Group__4 : rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 ;
    public final void rule__LocalPlacement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3770:1: ( rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3771:2: rule__LocalPlacement__Group__4__Impl rule__LocalPlacement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__47452);
            rule__LocalPlacement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__47455);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3778:1: rule__LocalPlacement__Group__4__Impl : ( ( rule__LocalPlacement__Group_4__0 )? ) ;
    public final void rule__LocalPlacement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3782:1: ( ( ( rule__LocalPlacement__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3783:1: ( ( rule__LocalPlacement__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3783:1: ( ( rule__LocalPlacement__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3784:1: ( rule__LocalPlacement__Group_4__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3785:1: ( rule__LocalPlacement__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3785:2: rule__LocalPlacement__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__0_in_rule__LocalPlacement__Group__4__Impl7482);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3795:1: rule__LocalPlacement__Group__5 : rule__LocalPlacement__Group__5__Impl rule__LocalPlacement__Group__6 ;
    public final void rule__LocalPlacement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3799:1: ( rule__LocalPlacement__Group__5__Impl rule__LocalPlacement__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3800:2: rule__LocalPlacement__Group__5__Impl rule__LocalPlacement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__57513);
            rule__LocalPlacement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__6_in_rule__LocalPlacement__Group__57516);
            rule__LocalPlacement__Group__6();

            state._fsp--;


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3807:1: rule__LocalPlacement__Group__5__Impl : ( ( rule__LocalPlacement__Group_5__0 )? ) ;
    public final void rule__LocalPlacement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3811:1: ( ( ( rule__LocalPlacement__Group_5__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3812:1: ( ( rule__LocalPlacement__Group_5__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3812:1: ( ( rule__LocalPlacement__Group_5__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3813:1: ( rule__LocalPlacement__Group_5__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3814:1: ( rule__LocalPlacement__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==21) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3814:2: rule__LocalPlacement__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_5__0_in_rule__LocalPlacement__Group__5__Impl7543);
                    rule__LocalPlacement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__LocalPlacement__Group__6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3824:1: rule__LocalPlacement__Group__6 : rule__LocalPlacement__Group__6__Impl rule__LocalPlacement__Group__7 ;
    public final void rule__LocalPlacement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3828:1: ( rule__LocalPlacement__Group__6__Impl rule__LocalPlacement__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3829:2: rule__LocalPlacement__Group__6__Impl rule__LocalPlacement__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__6__Impl_in_rule__LocalPlacement__Group__67574);
            rule__LocalPlacement__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__7_in_rule__LocalPlacement__Group__67577);
            rule__LocalPlacement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__6"


    // $ANTLR start "rule__LocalPlacement__Group__6__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3836:1: rule__LocalPlacement__Group__6__Impl : ( ( rule__LocalPlacement__Group_6__0 )? ) ;
    public final void rule__LocalPlacement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3840:1: ( ( ( rule__LocalPlacement__Group_6__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3841:1: ( ( rule__LocalPlacement__Group_6__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3841:1: ( ( rule__LocalPlacement__Group_6__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3842:1: ( rule__LocalPlacement__Group_6__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3843:1: ( rule__LocalPlacement__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3843:2: rule__LocalPlacement__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_6__0_in_rule__LocalPlacement__Group__6__Impl7604);
                    rule__LocalPlacement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__6__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__7"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3853:1: rule__LocalPlacement__Group__7 : rule__LocalPlacement__Group__7__Impl rule__LocalPlacement__Group__8 ;
    public final void rule__LocalPlacement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3857:1: ( rule__LocalPlacement__Group__7__Impl rule__LocalPlacement__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3858:2: rule__LocalPlacement__Group__7__Impl rule__LocalPlacement__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__7__Impl_in_rule__LocalPlacement__Group__77635);
            rule__LocalPlacement__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__8_in_rule__LocalPlacement__Group__77638);
            rule__LocalPlacement__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__7"


    // $ANTLR start "rule__LocalPlacement__Group__7__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3865:1: rule__LocalPlacement__Group__7__Impl : ( ( rule__LocalPlacement__Group_7__0 )? ) ;
    public final void rule__LocalPlacement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3869:1: ( ( ( rule__LocalPlacement__Group_7__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3870:1: ( ( rule__LocalPlacement__Group_7__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3870:1: ( ( rule__LocalPlacement__Group_7__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3871:1: ( rule__LocalPlacement__Group_7__0 )?
            {
             before(grammarAccess.getLocalPlacementAccess().getGroup_7()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3872:1: ( rule__LocalPlacement__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3872:2: rule__LocalPlacement__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_7__0_in_rule__LocalPlacement__Group__7__Impl7665);
                    rule__LocalPlacement__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalPlacementAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__7__Impl"


    // $ANTLR start "rule__LocalPlacement__Group__8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3882:1: rule__LocalPlacement__Group__8 : rule__LocalPlacement__Group__8__Impl ;
    public final void rule__LocalPlacement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3886:1: ( rule__LocalPlacement__Group__8__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3887:2: rule__LocalPlacement__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group__8__Impl_in_rule__LocalPlacement__Group__87696);
            rule__LocalPlacement__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__8"


    // $ANTLR start "rule__LocalPlacement__Group__8__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3893:1: rule__LocalPlacement__Group__8__Impl : ( '}' ) ;
    public final void rule__LocalPlacement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3897:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3898:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3898:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3899:1: '}'
            {
             before(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_8()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__LocalPlacement__Group__8__Impl7724); 
             after(grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group__8__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3930:1: rule__LocalPlacement__Group_3__0 : rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 ;
    public final void rule__LocalPlacement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3934:1: ( rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3935:2: rule__LocalPlacement__Group_3__0__Impl rule__LocalPlacement__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__07773);
            rule__LocalPlacement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__07776);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3942:1: rule__LocalPlacement__Group_3__0__Impl : ( 'GUID' ) ;
    public final void rule__LocalPlacement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3946:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3947:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3947:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3948:1: 'GUID'
            {
             before(grammarAccess.getLocalPlacementAccess().getGUIDKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__LocalPlacement__Group_3__0__Impl7804); 
             after(grammarAccess.getLocalPlacementAccess().getGUIDKeyword_3_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3961:1: rule__LocalPlacement__Group_3__1 : rule__LocalPlacement__Group_3__1__Impl ;
    public final void rule__LocalPlacement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3965:1: ( rule__LocalPlacement__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3966:2: rule__LocalPlacement__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__17835);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3972:1: rule__LocalPlacement__Group_3__1__Impl : ( ( rule__LocalPlacement__GUIDAssignment_3_1 ) ) ;
    public final void rule__LocalPlacement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3976:1: ( ( ( rule__LocalPlacement__GUIDAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3977:1: ( ( rule__LocalPlacement__GUIDAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3977:1: ( ( rule__LocalPlacement__GUIDAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3978:1: ( rule__LocalPlacement__GUIDAssignment_3_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getGUIDAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3979:1: ( rule__LocalPlacement__GUIDAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3979:2: rule__LocalPlacement__GUIDAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__GUIDAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl7862);
            rule__LocalPlacement__GUIDAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getGUIDAssignment_3_1()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3993:1: rule__LocalPlacement__Group_4__0 : rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1 ;
    public final void rule__LocalPlacement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3997:1: ( rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:3998:2: rule__LocalPlacement__Group_4__0__Impl rule__LocalPlacement__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__0__Impl_in_rule__LocalPlacement__Group_4__07896);
            rule__LocalPlacement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__1_in_rule__LocalPlacement__Group_4__07899);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4005:1: rule__LocalPlacement__Group_4__0__Impl : ( 'Name' ) ;
    public final void rule__LocalPlacement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4009:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4010:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4010:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4011:1: 'Name'
            {
             before(grammarAccess.getLocalPlacementAccess().getNameKeyword_4_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__LocalPlacement__Group_4__0__Impl7927); 
             after(grammarAccess.getLocalPlacementAccess().getNameKeyword_4_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4024:1: rule__LocalPlacement__Group_4__1 : rule__LocalPlacement__Group_4__1__Impl ;
    public final void rule__LocalPlacement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4028:1: ( rule__LocalPlacement__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4029:2: rule__LocalPlacement__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_4__1__Impl_in_rule__LocalPlacement__Group_4__17958);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4035:1: rule__LocalPlacement__Group_4__1__Impl : ( ( rule__LocalPlacement__NameAssignment_4_1 ) ) ;
    public final void rule__LocalPlacement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4039:1: ( ( ( rule__LocalPlacement__NameAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4040:1: ( ( rule__LocalPlacement__NameAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4040:1: ( ( rule__LocalPlacement__NameAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4041:1: ( rule__LocalPlacement__NameAssignment_4_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getNameAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4042:1: ( rule__LocalPlacement__NameAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4042:2: rule__LocalPlacement__NameAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__NameAssignment_4_1_in_rule__LocalPlacement__Group_4__1__Impl7985);
            rule__LocalPlacement__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getNameAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__LocalPlacement__Group_5__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4056:1: rule__LocalPlacement__Group_5__0 : rule__LocalPlacement__Group_5__0__Impl rule__LocalPlacement__Group_5__1 ;
    public final void rule__LocalPlacement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4060:1: ( rule__LocalPlacement__Group_5__0__Impl rule__LocalPlacement__Group_5__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4061:2: rule__LocalPlacement__Group_5__0__Impl rule__LocalPlacement__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_5__0__Impl_in_rule__LocalPlacement__Group_5__08019);
            rule__LocalPlacement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_5__1_in_rule__LocalPlacement__Group_5__08022);
            rule__LocalPlacement__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_5__0"


    // $ANTLR start "rule__LocalPlacement__Group_5__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4068:1: rule__LocalPlacement__Group_5__0__Impl : ( 'Description' ) ;
    public final void rule__LocalPlacement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4072:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4073:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4073:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4074:1: 'Description'
            {
             before(grammarAccess.getLocalPlacementAccess().getDescriptionKeyword_5_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__LocalPlacement__Group_5__0__Impl8050); 
             after(grammarAccess.getLocalPlacementAccess().getDescriptionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_5__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_5__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4087:1: rule__LocalPlacement__Group_5__1 : rule__LocalPlacement__Group_5__1__Impl ;
    public final void rule__LocalPlacement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4091:1: ( rule__LocalPlacement__Group_5__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4092:2: rule__LocalPlacement__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_5__1__Impl_in_rule__LocalPlacement__Group_5__18081);
            rule__LocalPlacement__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_5__1"


    // $ANTLR start "rule__LocalPlacement__Group_5__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4098:1: rule__LocalPlacement__Group_5__1__Impl : ( ( rule__LocalPlacement__DescriptionAssignment_5_1 ) ) ;
    public final void rule__LocalPlacement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4102:1: ( ( ( rule__LocalPlacement__DescriptionAssignment_5_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4103:1: ( ( rule__LocalPlacement__DescriptionAssignment_5_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4103:1: ( ( rule__LocalPlacement__DescriptionAssignment_5_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4104:1: ( rule__LocalPlacement__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getDescriptionAssignment_5_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4105:1: ( rule__LocalPlacement__DescriptionAssignment_5_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4105:2: rule__LocalPlacement__DescriptionAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__DescriptionAssignment_5_1_in_rule__LocalPlacement__Group_5__1__Impl8108);
            rule__LocalPlacement__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getDescriptionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_5__1__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_6__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4119:1: rule__LocalPlacement__Group_6__0 : rule__LocalPlacement__Group_6__0__Impl rule__LocalPlacement__Group_6__1 ;
    public final void rule__LocalPlacement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4123:1: ( rule__LocalPlacement__Group_6__0__Impl rule__LocalPlacement__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4124:2: rule__LocalPlacement__Group_6__0__Impl rule__LocalPlacement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_6__0__Impl_in_rule__LocalPlacement__Group_6__08142);
            rule__LocalPlacement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_6__1_in_rule__LocalPlacement__Group_6__08145);
            rule__LocalPlacement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_6__0"


    // $ANTLR start "rule__LocalPlacement__Group_6__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4131:1: rule__LocalPlacement__Group_6__0__Impl : ( 'axis2placement3d' ) ;
    public final void rule__LocalPlacement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4135:1: ( ( 'axis2placement3d' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4136:1: ( 'axis2placement3d' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4136:1: ( 'axis2placement3d' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4137:1: 'axis2placement3d'
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_6_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__LocalPlacement__Group_6__0__Impl8173); 
             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_6__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_6__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4150:1: rule__LocalPlacement__Group_6__1 : rule__LocalPlacement__Group_6__1__Impl ;
    public final void rule__LocalPlacement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4154:1: ( rule__LocalPlacement__Group_6__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4155:2: rule__LocalPlacement__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_6__1__Impl_in_rule__LocalPlacement__Group_6__18204);
            rule__LocalPlacement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_6__1"


    // $ANTLR start "rule__LocalPlacement__Group_6__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4161:1: rule__LocalPlacement__Group_6__1__Impl : ( ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 ) ) ;
    public final void rule__LocalPlacement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4165:1: ( ( ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4166:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4166:1: ( ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4167:1: ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4168:1: ( rule__LocalPlacement__Axis2placement3dAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4168:2: rule__LocalPlacement__Axis2placement3dAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_6_1_in_rule__LocalPlacement__Group_6__1__Impl8231);
            rule__LocalPlacement__Axis2placement3dAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_6__1__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_7__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4182:1: rule__LocalPlacement__Group_7__0 : rule__LocalPlacement__Group_7__0__Impl rule__LocalPlacement__Group_7__1 ;
    public final void rule__LocalPlacement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4186:1: ( rule__LocalPlacement__Group_7__0__Impl rule__LocalPlacement__Group_7__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4187:2: rule__LocalPlacement__Group_7__0__Impl rule__LocalPlacement__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_7__0__Impl_in_rule__LocalPlacement__Group_7__08265);
            rule__LocalPlacement__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_7__1_in_rule__LocalPlacement__Group_7__08268);
            rule__LocalPlacement__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_7__0"


    // $ANTLR start "rule__LocalPlacement__Group_7__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4194:1: rule__LocalPlacement__Group_7__0__Impl : ( 'relativeTo' ) ;
    public final void rule__LocalPlacement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4198:1: ( ( 'relativeTo' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4199:1: ( 'relativeTo' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4199:1: ( 'relativeTo' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4200:1: 'relativeTo'
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_7_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__LocalPlacement__Group_7__0__Impl8296); 
             after(grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_7__0__Impl"


    // $ANTLR start "rule__LocalPlacement__Group_7__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4213:1: rule__LocalPlacement__Group_7__1 : rule__LocalPlacement__Group_7__1__Impl ;
    public final void rule__LocalPlacement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4217:1: ( rule__LocalPlacement__Group_7__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4218:2: rule__LocalPlacement__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__Group_7__1__Impl_in_rule__LocalPlacement__Group_7__18327);
            rule__LocalPlacement__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_7__1"


    // $ANTLR start "rule__LocalPlacement__Group_7__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4224:1: rule__LocalPlacement__Group_7__1__Impl : ( ( rule__LocalPlacement__RelativeToAssignment_7_1 ) ) ;
    public final void rule__LocalPlacement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4228:1: ( ( ( rule__LocalPlacement__RelativeToAssignment_7_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4229:1: ( ( rule__LocalPlacement__RelativeToAssignment_7_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4229:1: ( ( rule__LocalPlacement__RelativeToAssignment_7_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4230:1: ( rule__LocalPlacement__RelativeToAssignment_7_1 )
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_7_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4231:1: ( rule__LocalPlacement__RelativeToAssignment_7_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4231:2: rule__LocalPlacement__RelativeToAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__LocalPlacement__RelativeToAssignment_7_1_in_rule__LocalPlacement__Group_7__1__Impl8354);
            rule__LocalPlacement__RelativeToAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Group_7__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4245:1: rule__Axis2Placement3D__Group__0 : rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 ;
    public final void rule__Axis2Placement3D__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4249:1: ( rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4250:2: rule__Axis2Placement3D__Group__0__Impl rule__Axis2Placement3D__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__08388);
            rule__Axis2Placement3D__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__08391);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4257:1: rule__Axis2Placement3D__Group__0__Impl : ( 'Axis2Placement3D' ) ;
    public final void rule__Axis2Placement3D__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4261:1: ( ( 'Axis2Placement3D' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4262:1: ( 'Axis2Placement3D' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4262:1: ( 'Axis2Placement3D' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4263:1: 'Axis2Placement3D'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxis2Placement3DKeyword_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Axis2Placement3D__Group__0__Impl8419); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4276:1: rule__Axis2Placement3D__Group__1 : rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 ;
    public final void rule__Axis2Placement3D__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4280:1: ( rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4281:2: rule__Axis2Placement3D__Group__1__Impl rule__Axis2Placement3D__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__18450);
            rule__Axis2Placement3D__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__18453);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4288:1: rule__Axis2Placement3D__Group__1__Impl : ( '{' ) ;
    public final void rule__Axis2Placement3D__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4292:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4293:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4293:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4294:1: '{'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Axis2Placement3D__Group__1__Impl8481); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4307:1: rule__Axis2Placement3D__Group__2 : rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 ;
    public final void rule__Axis2Placement3D__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4311:1: ( rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4312:2: rule__Axis2Placement3D__Group__2__Impl rule__Axis2Placement3D__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__28512);
            rule__Axis2Placement3D__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__28515);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4319:1: rule__Axis2Placement3D__Group__2__Impl : ( ( rule__Axis2Placement3D__Group_2__0 )? ) ;
    public final void rule__Axis2Placement3D__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4323:1: ( ( ( rule__Axis2Placement3D__Group_2__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4324:1: ( ( rule__Axis2Placement3D__Group_2__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4324:1: ( ( rule__Axis2Placement3D__Group_2__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4325:1: ( rule__Axis2Placement3D__Group_2__0 )?
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup_2()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4326:1: ( rule__Axis2Placement3D__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4326:2: rule__Axis2Placement3D__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_2__0_in_rule__Axis2Placement3D__Group__2__Impl8542);
                    rule__Axis2Placement3D__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxis2Placement3DAccess().getGroup_2()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4336:1: rule__Axis2Placement3D__Group__3 : rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 ;
    public final void rule__Axis2Placement3D__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4340:1: ( rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4341:2: rule__Axis2Placement3D__Group__3__Impl rule__Axis2Placement3D__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__38573);
            rule__Axis2Placement3D__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__38576);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4348:1: rule__Axis2Placement3D__Group__3__Impl : ( ( rule__Axis2Placement3D__Group_3__0 )? ) ;
    public final void rule__Axis2Placement3D__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4352:1: ( ( ( rule__Axis2Placement3D__Group_3__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4353:1: ( ( rule__Axis2Placement3D__Group_3__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4353:1: ( ( rule__Axis2Placement3D__Group_3__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4354:1: ( rule__Axis2Placement3D__Group_3__0 )?
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4355:1: ( rule__Axis2Placement3D__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4355:2: rule__Axis2Placement3D__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_3__0_in_rule__Axis2Placement3D__Group__3__Impl8603);
                    rule__Axis2Placement3D__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxis2Placement3DAccess().getGroup_3()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4365:1: rule__Axis2Placement3D__Group__4 : rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 ;
    public final void rule__Axis2Placement3D__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4369:1: ( rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4370:2: rule__Axis2Placement3D__Group__4__Impl rule__Axis2Placement3D__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__48634);
            rule__Axis2Placement3D__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__48637);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4377:1: rule__Axis2Placement3D__Group__4__Impl : ( ( rule__Axis2Placement3D__Group_4__0 )? ) ;
    public final void rule__Axis2Placement3D__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4381:1: ( ( ( rule__Axis2Placement3D__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4382:1: ( ( rule__Axis2Placement3D__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4382:1: ( ( rule__Axis2Placement3D__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4383:1: ( rule__Axis2Placement3D__Group_4__0 )?
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4384:1: ( rule__Axis2Placement3D__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4384:2: rule__Axis2Placement3D__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_4__0_in_rule__Axis2Placement3D__Group__4__Impl8664);
                    rule__Axis2Placement3D__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAxis2Placement3DAccess().getGroup_4()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4394:1: rule__Axis2Placement3D__Group__5 : rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 ;
    public final void rule__Axis2Placement3D__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4398:1: ( rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4399:2: rule__Axis2Placement3D__Group__5__Impl rule__Axis2Placement3D__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__58695);
            rule__Axis2Placement3D__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__58698);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4406:1: rule__Axis2Placement3D__Group__5__Impl : ( 'cartesianX' ) ;
    public final void rule__Axis2Placement3D__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4410:1: ( ( 'cartesianX' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4411:1: ( 'cartesianX' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4411:1: ( 'cartesianX' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4412:1: 'cartesianX'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_5()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Axis2Placement3D__Group__5__Impl8726); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_5()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4425:1: rule__Axis2Placement3D__Group__6 : rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 ;
    public final void rule__Axis2Placement3D__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4429:1: ( rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4430:2: rule__Axis2Placement3D__Group__6__Impl rule__Axis2Placement3D__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__68757);
            rule__Axis2Placement3D__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__68760);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4437:1: rule__Axis2Placement3D__Group__6__Impl : ( ( rule__Axis2Placement3D__CartesianXAssignment_6 ) ) ;
    public final void rule__Axis2Placement3D__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4441:1: ( ( ( rule__Axis2Placement3D__CartesianXAssignment_6 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4442:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_6 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4442:1: ( ( rule__Axis2Placement3D__CartesianXAssignment_6 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4443:1: ( rule__Axis2Placement3D__CartesianXAssignment_6 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4444:1: ( rule__Axis2Placement3D__CartesianXAssignment_6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4444:2: rule__Axis2Placement3D__CartesianXAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_6_in_rule__Axis2Placement3D__Group__6__Impl8787);
            rule__Axis2Placement3D__CartesianXAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_6()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4454:1: rule__Axis2Placement3D__Group__7 : rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 ;
    public final void rule__Axis2Placement3D__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4458:1: ( rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4459:2: rule__Axis2Placement3D__Group__7__Impl rule__Axis2Placement3D__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__78817);
            rule__Axis2Placement3D__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__78820);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4466:1: rule__Axis2Placement3D__Group__7__Impl : ( 'cartesianY' ) ;
    public final void rule__Axis2Placement3D__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4470:1: ( ( 'cartesianY' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4471:1: ( 'cartesianY' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4471:1: ( 'cartesianY' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4472:1: 'cartesianY'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_7()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Axis2Placement3D__Group__7__Impl8848); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_7()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4485:1: rule__Axis2Placement3D__Group__8 : rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 ;
    public final void rule__Axis2Placement3D__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4489:1: ( rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4490:2: rule__Axis2Placement3D__Group__8__Impl rule__Axis2Placement3D__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__88879);
            rule__Axis2Placement3D__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__88882);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4497:1: rule__Axis2Placement3D__Group__8__Impl : ( ( rule__Axis2Placement3D__CartesianYAssignment_8 ) ) ;
    public final void rule__Axis2Placement3D__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4501:1: ( ( ( rule__Axis2Placement3D__CartesianYAssignment_8 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4502:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_8 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4502:1: ( ( rule__Axis2Placement3D__CartesianYAssignment_8 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4503:1: ( rule__Axis2Placement3D__CartesianYAssignment_8 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_8()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4504:1: ( rule__Axis2Placement3D__CartesianYAssignment_8 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4504:2: rule__Axis2Placement3D__CartesianYAssignment_8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_8_in_rule__Axis2Placement3D__Group__8__Impl8909);
            rule__Axis2Placement3D__CartesianYAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_8()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4514:1: rule__Axis2Placement3D__Group__9 : rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 ;
    public final void rule__Axis2Placement3D__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4518:1: ( rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4519:2: rule__Axis2Placement3D__Group__9__Impl rule__Axis2Placement3D__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__98939);
            rule__Axis2Placement3D__Group__9__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__98942);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4526:1: rule__Axis2Placement3D__Group__9__Impl : ( 'cartesianZ' ) ;
    public final void rule__Axis2Placement3D__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4530:1: ( ( 'cartesianZ' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4531:1: ( 'cartesianZ' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4531:1: ( 'cartesianZ' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4532:1: 'cartesianZ'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_9()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Axis2Placement3D__Group__9__Impl8970); 
             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_9()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4545:1: rule__Axis2Placement3D__Group__10 : rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 ;
    public final void rule__Axis2Placement3D__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4549:1: ( rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4550:2: rule__Axis2Placement3D__Group__10__Impl rule__Axis2Placement3D__Group__11
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__109001);
            rule__Axis2Placement3D__Group__10__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__109004);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4557:1: rule__Axis2Placement3D__Group__10__Impl : ( ( rule__Axis2Placement3D__CartesianZAssignment_10 ) ) ;
    public final void rule__Axis2Placement3D__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4561:1: ( ( ( rule__Axis2Placement3D__CartesianZAssignment_10 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4562:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_10 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4562:1: ( ( rule__Axis2Placement3D__CartesianZAssignment_10 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4563:1: ( rule__Axis2Placement3D__CartesianZAssignment_10 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_10()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4564:1: ( rule__Axis2Placement3D__CartesianZAssignment_10 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4564:2: rule__Axis2Placement3D__CartesianZAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl9031);
            rule__Axis2Placement3D__CartesianZAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_10()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4574:1: rule__Axis2Placement3D__Group__11 : rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 ;
    public final void rule__Axis2Placement3D__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4578:1: ( rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4579:2: rule__Axis2Placement3D__Group__11__Impl rule__Axis2Placement3D__Group__12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__119061);
            rule__Axis2Placement3D__Group__11__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__119064);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4586:1: rule__Axis2Placement3D__Group__11__Impl : ( 'axis' ) ;
    public final void rule__Axis2Placement3D__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4590:1: ( ( 'axis' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4591:1: ( 'axis' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4591:1: ( 'axis' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4592:1: 'axis'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_11()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Axis2Placement3D__Group__11__Impl9092); 
             after(grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_11()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4605:1: rule__Axis2Placement3D__Group__12 : rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 ;
    public final void rule__Axis2Placement3D__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4609:1: ( rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4610:2: rule__Axis2Placement3D__Group__12__Impl rule__Axis2Placement3D__Group__13
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__129123);
            rule__Axis2Placement3D__Group__12__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__129126);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4617:1: rule__Axis2Placement3D__Group__12__Impl : ( ( rule__Axis2Placement3D__AxisAssignment_12 ) ) ;
    public final void rule__Axis2Placement3D__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4621:1: ( ( ( rule__Axis2Placement3D__AxisAssignment_12 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4622:1: ( ( rule__Axis2Placement3D__AxisAssignment_12 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4622:1: ( ( rule__Axis2Placement3D__AxisAssignment_12 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4623:1: ( rule__Axis2Placement3D__AxisAssignment_12 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_12()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4624:1: ( rule__Axis2Placement3D__AxisAssignment_12 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4624:2: rule__Axis2Placement3D__AxisAssignment_12
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__AxisAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl9153);
            rule__Axis2Placement3D__AxisAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_12()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4634:1: rule__Axis2Placement3D__Group__13 : rule__Axis2Placement3D__Group__13__Impl rule__Axis2Placement3D__Group__14 ;
    public final void rule__Axis2Placement3D__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4638:1: ( rule__Axis2Placement3D__Group__13__Impl rule__Axis2Placement3D__Group__14 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4639:2: rule__Axis2Placement3D__Group__13__Impl rule__Axis2Placement3D__Group__14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__139183);
            rule__Axis2Placement3D__Group__13__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__14_in_rule__Axis2Placement3D__Group__139186);
            rule__Axis2Placement3D__Group__14();

            state._fsp--;


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4646:1: rule__Axis2Placement3D__Group__13__Impl : ( 'refDirection' ) ;
    public final void rule__Axis2Placement3D__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4650:1: ( ( 'refDirection' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4651:1: ( 'refDirection' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4651:1: ( 'refDirection' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4652:1: 'refDirection'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_13()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Axis2Placement3D__Group__13__Impl9214); 
             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Axis2Placement3D__Group__14"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4665:1: rule__Axis2Placement3D__Group__14 : rule__Axis2Placement3D__Group__14__Impl rule__Axis2Placement3D__Group__15 ;
    public final void rule__Axis2Placement3D__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4669:1: ( rule__Axis2Placement3D__Group__14__Impl rule__Axis2Placement3D__Group__15 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4670:2: rule__Axis2Placement3D__Group__14__Impl rule__Axis2Placement3D__Group__15
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__14__Impl_in_rule__Axis2Placement3D__Group__149245);
            rule__Axis2Placement3D__Group__14__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__15_in_rule__Axis2Placement3D__Group__149248);
            rule__Axis2Placement3D__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group__14"


    // $ANTLR start "rule__Axis2Placement3D__Group__14__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4677:1: rule__Axis2Placement3D__Group__14__Impl : ( ( rule__Axis2Placement3D__RefDirectionAssignment_14 ) ) ;
    public final void rule__Axis2Placement3D__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4681:1: ( ( ( rule__Axis2Placement3D__RefDirectionAssignment_14 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4682:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_14 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4682:1: ( ( rule__Axis2Placement3D__RefDirectionAssignment_14 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4683:1: ( rule__Axis2Placement3D__RefDirectionAssignment_14 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_14()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4684:1: ( rule__Axis2Placement3D__RefDirectionAssignment_14 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4684:2: rule__Axis2Placement3D__RefDirectionAssignment_14
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_14_in_rule__Axis2Placement3D__Group__14__Impl9275);
            rule__Axis2Placement3D__RefDirectionAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group__14__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group__15"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4694:1: rule__Axis2Placement3D__Group__15 : rule__Axis2Placement3D__Group__15__Impl ;
    public final void rule__Axis2Placement3D__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4698:1: ( rule__Axis2Placement3D__Group__15__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4699:2: rule__Axis2Placement3D__Group__15__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group__15__Impl_in_rule__Axis2Placement3D__Group__159305);
            rule__Axis2Placement3D__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group__15"


    // $ANTLR start "rule__Axis2Placement3D__Group__15__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4705:1: rule__Axis2Placement3D__Group__15__Impl : ( '}' ) ;
    public final void rule__Axis2Placement3D__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4709:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4710:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4710:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4711:1: '}'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_15()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Axis2Placement3D__Group__15__Impl9333); 
             after(grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group__15__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_2__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4756:1: rule__Axis2Placement3D__Group_2__0 : rule__Axis2Placement3D__Group_2__0__Impl rule__Axis2Placement3D__Group_2__1 ;
    public final void rule__Axis2Placement3D__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4760:1: ( rule__Axis2Placement3D__Group_2__0__Impl rule__Axis2Placement3D__Group_2__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4761:2: rule__Axis2Placement3D__Group_2__0__Impl rule__Axis2Placement3D__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_2__0__Impl_in_rule__Axis2Placement3D__Group_2__09396);
            rule__Axis2Placement3D__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_2__1_in_rule__Axis2Placement3D__Group_2__09399);
            rule__Axis2Placement3D__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_2__0"


    // $ANTLR start "rule__Axis2Placement3D__Group_2__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4768:1: rule__Axis2Placement3D__Group_2__0__Impl : ( 'GUID' ) ;
    public final void rule__Axis2Placement3D__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4772:1: ( ( 'GUID' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4773:1: ( 'GUID' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4773:1: ( 'GUID' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4774:1: 'GUID'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGUIDKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Axis2Placement3D__Group_2__0__Impl9427); 
             after(grammarAccess.getAxis2Placement3DAccess().getGUIDKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_2__0__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_2__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4787:1: rule__Axis2Placement3D__Group_2__1 : rule__Axis2Placement3D__Group_2__1__Impl ;
    public final void rule__Axis2Placement3D__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4791:1: ( rule__Axis2Placement3D__Group_2__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4792:2: rule__Axis2Placement3D__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_2__1__Impl_in_rule__Axis2Placement3D__Group_2__19458);
            rule__Axis2Placement3D__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_2__1"


    // $ANTLR start "rule__Axis2Placement3D__Group_2__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4798:1: rule__Axis2Placement3D__Group_2__1__Impl : ( ( rule__Axis2Placement3D__GUIDAssignment_2_1 ) ) ;
    public final void rule__Axis2Placement3D__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4802:1: ( ( ( rule__Axis2Placement3D__GUIDAssignment_2_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4803:1: ( ( rule__Axis2Placement3D__GUIDAssignment_2_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4803:1: ( ( rule__Axis2Placement3D__GUIDAssignment_2_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4804:1: ( rule__Axis2Placement3D__GUIDAssignment_2_1 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGUIDAssignment_2_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4805:1: ( rule__Axis2Placement3D__GUIDAssignment_2_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4805:2: rule__Axis2Placement3D__GUIDAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__GUIDAssignment_2_1_in_rule__Axis2Placement3D__Group_2__1__Impl9485);
            rule__Axis2Placement3D__GUIDAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getGUIDAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_2__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_3__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4819:1: rule__Axis2Placement3D__Group_3__0 : rule__Axis2Placement3D__Group_3__0__Impl rule__Axis2Placement3D__Group_3__1 ;
    public final void rule__Axis2Placement3D__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4823:1: ( rule__Axis2Placement3D__Group_3__0__Impl rule__Axis2Placement3D__Group_3__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4824:2: rule__Axis2Placement3D__Group_3__0__Impl rule__Axis2Placement3D__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_3__0__Impl_in_rule__Axis2Placement3D__Group_3__09519);
            rule__Axis2Placement3D__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_3__1_in_rule__Axis2Placement3D__Group_3__09522);
            rule__Axis2Placement3D__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_3__0"


    // $ANTLR start "rule__Axis2Placement3D__Group_3__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4831:1: rule__Axis2Placement3D__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__Axis2Placement3D__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4835:1: ( ( 'Name' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4836:1: ( 'Name' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4836:1: ( 'Name' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4837:1: 'Name'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getNameKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Axis2Placement3D__Group_3__0__Impl9550); 
             after(grammarAccess.getAxis2Placement3DAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_3__0__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_3__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4850:1: rule__Axis2Placement3D__Group_3__1 : rule__Axis2Placement3D__Group_3__1__Impl ;
    public final void rule__Axis2Placement3D__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4854:1: ( rule__Axis2Placement3D__Group_3__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4855:2: rule__Axis2Placement3D__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_3__1__Impl_in_rule__Axis2Placement3D__Group_3__19581);
            rule__Axis2Placement3D__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_3__1"


    // $ANTLR start "rule__Axis2Placement3D__Group_3__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4861:1: rule__Axis2Placement3D__Group_3__1__Impl : ( ( rule__Axis2Placement3D__NameAssignment_3_1 ) ) ;
    public final void rule__Axis2Placement3D__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4865:1: ( ( ( rule__Axis2Placement3D__NameAssignment_3_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4866:1: ( ( rule__Axis2Placement3D__NameAssignment_3_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4866:1: ( ( rule__Axis2Placement3D__NameAssignment_3_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4867:1: ( rule__Axis2Placement3D__NameAssignment_3_1 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getNameAssignment_3_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4868:1: ( rule__Axis2Placement3D__NameAssignment_3_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4868:2: rule__Axis2Placement3D__NameAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__NameAssignment_3_1_in_rule__Axis2Placement3D__Group_3__1__Impl9608);
            rule__Axis2Placement3D__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_3__1__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_4__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4882:1: rule__Axis2Placement3D__Group_4__0 : rule__Axis2Placement3D__Group_4__0__Impl rule__Axis2Placement3D__Group_4__1 ;
    public final void rule__Axis2Placement3D__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4886:1: ( rule__Axis2Placement3D__Group_4__0__Impl rule__Axis2Placement3D__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4887:2: rule__Axis2Placement3D__Group_4__0__Impl rule__Axis2Placement3D__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_4__0__Impl_in_rule__Axis2Placement3D__Group_4__09642);
            rule__Axis2Placement3D__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_4__1_in_rule__Axis2Placement3D__Group_4__09645);
            rule__Axis2Placement3D__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_4__0"


    // $ANTLR start "rule__Axis2Placement3D__Group_4__0__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4894:1: rule__Axis2Placement3D__Group_4__0__Impl : ( 'Description' ) ;
    public final void rule__Axis2Placement3D__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4898:1: ( ( 'Description' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4899:1: ( 'Description' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4899:1: ( 'Description' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4900:1: 'Description'
            {
             before(grammarAccess.getAxis2Placement3DAccess().getDescriptionKeyword_4_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Axis2Placement3D__Group_4__0__Impl9673); 
             after(grammarAccess.getAxis2Placement3DAccess().getDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_4__0__Impl"


    // $ANTLR start "rule__Axis2Placement3D__Group_4__1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4913:1: rule__Axis2Placement3D__Group_4__1 : rule__Axis2Placement3D__Group_4__1__Impl ;
    public final void rule__Axis2Placement3D__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4917:1: ( rule__Axis2Placement3D__Group_4__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4918:2: rule__Axis2Placement3D__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__Group_4__1__Impl_in_rule__Axis2Placement3D__Group_4__19704);
            rule__Axis2Placement3D__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_4__1"


    // $ANTLR start "rule__Axis2Placement3D__Group_4__1__Impl"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4924:1: rule__Axis2Placement3D__Group_4__1__Impl : ( ( rule__Axis2Placement3D__DescriptionAssignment_4_1 ) ) ;
    public final void rule__Axis2Placement3D__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4928:1: ( ( ( rule__Axis2Placement3D__DescriptionAssignment_4_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4929:1: ( ( rule__Axis2Placement3D__DescriptionAssignment_4_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4929:1: ( ( rule__Axis2Placement3D__DescriptionAssignment_4_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4930:1: ( rule__Axis2Placement3D__DescriptionAssignment_4_1 )
            {
             before(grammarAccess.getAxis2Placement3DAccess().getDescriptionAssignment_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4931:1: ( rule__Axis2Placement3D__DescriptionAssignment_4_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4931:2: rule__Axis2Placement3D__DescriptionAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Axis2Placement3D__DescriptionAssignment_4_1_in_rule__Axis2Placement3D__Group_4__1__Impl9731);
            rule__Axis2Placement3D__DescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAxis2Placement3DAccess().getDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4945:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4949:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4950:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09765);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09768);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4957:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4961:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4962:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4962:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4963:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4964:1: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4965:2: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__EDouble__Group__0__Impl9797); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4976:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4980:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4981:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19830);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19833);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4988:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4992:1: ( ( ( RULE_INT )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4993:1: ( ( RULE_INT )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4993:1: ( ( RULE_INT )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4994:1: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4995:1: ( RULE_INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:4995:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl9861); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5005:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5009:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5010:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29892);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29895);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5017:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5021:1: ( ( '.' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5022:1: ( '.' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5022:1: ( '.' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5023:1: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__EDouble__Group__2__Impl9923); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5036:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5040:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5041:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39954);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__39957);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5048:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5052:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5053:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5053:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5054:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl9984); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5065:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5069:1: ( rule__EDouble__Group__4__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5070:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__410013);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5076:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5080:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5081:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5081:1: ( ( rule__EDouble__Group_4__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5082:1: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5083:1: ( rule__EDouble__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=11 && LA35_0<=12)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5083:2: rule__EDouble__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl10040);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5103:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5107:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5108:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__010081);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__010084);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5115:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5119:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5120:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5120:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5121:1: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5122:1: ( rule__EDouble__Alternatives_4_0 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5122:2: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl10111);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5132:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5136:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5137:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__110141);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__110144);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5144:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5148:1: ( ( ( '-' )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5149:1: ( ( '-' )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5149:1: ( ( '-' )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5150:1: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5151:1: ( '-' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5152:2: '-'
                    {
                    match(input,40,FollowSets000.FOLLOW_40_in_rule__EDouble__Group_4__1__Impl10173); 

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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5163:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5167:1: ( rule__EDouble__Group_4__2__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5168:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__210206);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5174:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5178:1: ( ( RULE_INT ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5179:1: ( RULE_INT )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5179:1: ( RULE_INT )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5180:1: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl10233); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5197:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5201:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5202:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__010268);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__010271);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5209:1: rule__Direction__Group__0__Impl : ( 'Direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5213:1: ( ( 'Direction' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5214:1: ( 'Direction' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5214:1: ( 'Direction' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5215:1: 'Direction'
            {
             before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__Direction__Group__0__Impl10299); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5228:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5232:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5233:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__110330);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__110333);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5240:1: rule__Direction__Group__1__Impl : ( '{' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5244:1: ( ( '{' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5245:1: ( '{' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5245:1: ( '{' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5246:1: '{'
            {
             before(grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Direction__Group__1__Impl10361); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5259:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5263:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5264:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__210392);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__210395);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5271:1: rule__Direction__Group__2__Impl : ( 'x' ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5275:1: ( ( 'x' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5276:1: ( 'x' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5276:1: ( 'x' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5277:1: 'x'
            {
             before(grammarAccess.getDirectionAccess().getXKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Direction__Group__2__Impl10423); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5290:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5294:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5295:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__310454);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__310457);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5302:1: rule__Direction__Group__3__Impl : ( ( rule__Direction__XAssignment_3 ) ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5306:1: ( ( ( rule__Direction__XAssignment_3 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5307:1: ( ( rule__Direction__XAssignment_3 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5307:1: ( ( rule__Direction__XAssignment_3 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5308:1: ( rule__Direction__XAssignment_3 )
            {
             before(grammarAccess.getDirectionAccess().getXAssignment_3()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5309:1: ( rule__Direction__XAssignment_3 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5309:2: rule__Direction__XAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__XAssignment_3_in_rule__Direction__Group__3__Impl10484);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5319:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5323:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5324:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__410514);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__410517);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5331:1: rule__Direction__Group__4__Impl : ( 'y' ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5335:1: ( ( 'y' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5336:1: ( 'y' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5336:1: ( 'y' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5337:1: 'y'
            {
             before(grammarAccess.getDirectionAccess().getYKeyword_4()); 
            match(input,44,FollowSets000.FOLLOW_44_in_rule__Direction__Group__4__Impl10545); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5350:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl rule__Direction__Group__6 ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5354:1: ( rule__Direction__Group__5__Impl rule__Direction__Group__6 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5355:2: rule__Direction__Group__5__Impl rule__Direction__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__510576);
            rule__Direction__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__6_in_rule__Direction__Group__510579);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5362:1: rule__Direction__Group__5__Impl : ( ( rule__Direction__YAssignment_5 ) ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5366:1: ( ( ( rule__Direction__YAssignment_5 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5367:1: ( ( rule__Direction__YAssignment_5 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5367:1: ( ( rule__Direction__YAssignment_5 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5368:1: ( rule__Direction__YAssignment_5 )
            {
             before(grammarAccess.getDirectionAccess().getYAssignment_5()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5369:1: ( rule__Direction__YAssignment_5 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5369:2: rule__Direction__YAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__YAssignment_5_in_rule__Direction__Group__5__Impl10606);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5379:1: rule__Direction__Group__6 : rule__Direction__Group__6__Impl rule__Direction__Group__7 ;
    public final void rule__Direction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5383:1: ( rule__Direction__Group__6__Impl rule__Direction__Group__7 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5384:2: rule__Direction__Group__6__Impl rule__Direction__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__6__Impl_in_rule__Direction__Group__610636);
            rule__Direction__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__7_in_rule__Direction__Group__610639);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5391:1: rule__Direction__Group__6__Impl : ( ( rule__Direction__Group_6__0 )? ) ;
    public final void rule__Direction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5395:1: ( ( ( rule__Direction__Group_6__0 )? ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5396:1: ( ( rule__Direction__Group_6__0 )? )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5396:1: ( ( rule__Direction__Group_6__0 )? )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5397:1: ( rule__Direction__Group_6__0 )?
            {
             before(grammarAccess.getDirectionAccess().getGroup_6()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5398:1: ( rule__Direction__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5398:2: rule__Direction__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__0_in_rule__Direction__Group__6__Impl10666);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5408:1: rule__Direction__Group__7 : rule__Direction__Group__7__Impl ;
    public final void rule__Direction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5412:1: ( rule__Direction__Group__7__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5413:2: rule__Direction__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group__7__Impl_in_rule__Direction__Group__710697);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5419:1: rule__Direction__Group__7__Impl : ( '}' ) ;
    public final void rule__Direction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5423:1: ( ( '}' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5424:1: ( '}' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5424:1: ( '}' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5425:1: '}'
            {
             before(grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Direction__Group__7__Impl10725); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5454:1: rule__Direction__Group_6__0 : rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1 ;
    public final void rule__Direction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5458:1: ( rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5459:2: rule__Direction__Group_6__0__Impl rule__Direction__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__0__Impl_in_rule__Direction__Group_6__010772);
            rule__Direction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__1_in_rule__Direction__Group_6__010775);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5466:1: rule__Direction__Group_6__0__Impl : ( 'z' ) ;
    public final void rule__Direction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5470:1: ( ( 'z' ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5471:1: ( 'z' )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5471:1: ( 'z' )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5472:1: 'z'
            {
             before(grammarAccess.getDirectionAccess().getZKeyword_6_0()); 
            match(input,45,FollowSets000.FOLLOW_45_in_rule__Direction__Group_6__0__Impl10803); 
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5485:1: rule__Direction__Group_6__1 : rule__Direction__Group_6__1__Impl ;
    public final void rule__Direction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5489:1: ( rule__Direction__Group_6__1__Impl )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5490:2: rule__Direction__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__Group_6__1__Impl_in_rule__Direction__Group_6__110834);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5496:1: rule__Direction__Group_6__1__Impl : ( ( rule__Direction__ZAssignment_6_1 ) ) ;
    public final void rule__Direction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5500:1: ( ( ( rule__Direction__ZAssignment_6_1 ) ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5501:1: ( ( rule__Direction__ZAssignment_6_1 ) )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5501:1: ( ( rule__Direction__ZAssignment_6_1 ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5502:1: ( rule__Direction__ZAssignment_6_1 )
            {
             before(grammarAccess.getDirectionAccess().getZAssignment_6_1()); 
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5503:1: ( rule__Direction__ZAssignment_6_1 )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5503:2: rule__Direction__ZAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Direction__ZAssignment_6_1_in_rule__Direction__Group_6__1__Impl10861);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5518:1: rule__Model__ElementsAssignment_3_2 : ( ruleGUIDElement ) ;
    public final void rule__Model__ElementsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5522:1: ( ( ruleGUIDElement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5523:1: ( ruleGUIDElement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5523:1: ( ruleGUIDElement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5524:1: ruleGUIDElement
            {
             before(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_210900);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5533:1: rule__Model__ElementsAssignment_3_3_1 : ( ruleGUIDElement ) ;
    public final void rule__Model__ElementsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5537:1: ( ( ruleGUIDElement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5538:1: ( ruleGUIDElement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5538:1: ( ruleGUIDElement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5539:1: ruleGUIDElement
            {
             before(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_3_110931);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5548:1: rule__GUIDElement_Impl__GUIDAssignment_3_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__GUIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5552:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5553:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5553:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5554:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getGUIDEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__GUIDAssignment_3_110962);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5563:1: rule__GUIDElement_Impl__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5567:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5568:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5568:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5569:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__NameAssignment_4_110993);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5578:1: rule__GUIDElement_Impl__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__GUIDElement_Impl__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5582:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5583:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5583:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5584:1: ruleEString
            {
             before(grammarAccess.getGUIDElement_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__GUIDElement_Impl__DescriptionAssignment_5_111024);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5593:1: rule__Wall__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Wall__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5597:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5598:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5598:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5599:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__GUIDAssignment_2_111055);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5608:1: rule__Wall__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Wall__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5612:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5613:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5613:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5614:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__NameAssignment_3_111086);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5623:1: rule__Wall__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Wall__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5627:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5628:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5628:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5629:1: ruleEString
            {
             before(grammarAccess.getWallAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Wall__DescriptionAssignment_4_111117);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5638:1: rule__Wall__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__Wall__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5642:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5643:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5643:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5644:1: ruleLocalPlacement
            {
             before(grammarAccess.getWallAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Wall__PlacementAssignment_611148);
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


    // $ANTLR start "rule__Wall__OpeningsAssignment_7_2"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5653:1: rule__Wall__OpeningsAssignment_7_2 : ( ruleWallRelation ) ;
    public final void rule__Wall__OpeningsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5657:1: ( ( ruleWallRelation ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5658:1: ( ruleWallRelation )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5658:1: ( ruleWallRelation )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5659:1: ruleWallRelation
            {
             before(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_rule__Wall__OpeningsAssignment_7_211179);
            ruleWallRelation();

            state._fsp--;

             after(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__OpeningsAssignment_7_2"


    // $ANTLR start "rule__Wall__OpeningsAssignment_7_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5668:1: rule__Wall__OpeningsAssignment_7_3_1 : ( ruleWallRelation ) ;
    public final void rule__Wall__OpeningsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5672:1: ( ( ruleWallRelation ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5673:1: ( ruleWallRelation )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5673:1: ( ruleWallRelation )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5674:1: ruleWallRelation
            {
             before(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_rule__Wall__OpeningsAssignment_7_3_111210);
            ruleWallRelation();

            state._fsp--;

             after(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wall__OpeningsAssignment_7_3_1"


    // $ANTLR start "rule__Opening__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5683:1: rule__Opening__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Opening__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5687:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5688:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5688:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5689:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__GUIDAssignment_2_111241);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5698:1: rule__Opening__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Opening__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5702:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5703:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5703:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5704:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__NameAssignment_3_111272);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5713:1: rule__Opening__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Opening__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5717:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5718:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5718:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5719:1: ruleEString
            {
             before(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_4_111303);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5728:1: rule__Opening__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__Opening__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5732:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5733:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5733:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5734:1: ruleLocalPlacement
            {
             before(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_611334);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5743:1: rule__Opening__WallsAssignment_7_2 : ( ruleWallRelation ) ;
    public final void rule__Opening__WallsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5747:1: ( ( ruleWallRelation ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5748:1: ( ruleWallRelation )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5748:1: ( ruleWallRelation )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5749:1: ruleWallRelation
            {
             before(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_rule__Opening__WallsAssignment_7_211365);
            ruleWallRelation();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_2_0()); 

            }


            }

        }
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5758:1: rule__Opening__WallsAssignment_7_3_1 : ( ruleWallRelation ) ;
    public final void rule__Opening__WallsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5762:1: ( ( ruleWallRelation ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5763:1: ( ruleWallRelation )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5763:1: ( ruleWallRelation )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5764:1: ruleWallRelation
            {
             before(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_rule__Opening__WallsAssignment_7_3_111396);
            ruleWallRelation();

            state._fsp--;

             after(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__WallRelation__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5773:1: rule__WallRelation__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__WallRelation__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5777:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5778:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5778:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5779:1: ruleEString
            {
             before(grammarAccess.getWallRelationAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRelation__GUIDAssignment_2_111427);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRelationAccess().getGUIDEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__GUIDAssignment_2_1"


    // $ANTLR start "rule__WallRelation__NameAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5788:1: rule__WallRelation__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__WallRelation__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5792:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5793:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5793:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5794:1: ruleEString
            {
             before(grammarAccess.getWallRelationAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRelation__NameAssignment_3_111458);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRelationAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__NameAssignment_3_1"


    // $ANTLR start "rule__WallRelation__DescriptionAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5803:1: rule__WallRelation__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__WallRelation__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5807:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5808:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5808:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5809:1: ruleEString
            {
             before(grammarAccess.getWallRelationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WallRelation__DescriptionAssignment_4_111489);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWallRelationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__DescriptionAssignment_4_1"


    // $ANTLR start "rule__WallRelation__WallAssignment_6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5818:1: rule__WallRelation__WallAssignment_6 : ( ruleWall ) ;
    public final void rule__WallRelation__WallAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5822:1: ( ( ruleWall ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5823:1: ( ruleWall )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5823:1: ( ruleWall )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5824:1: ruleWall
            {
             before(grammarAccess.getWallRelationAccess().getWallWallParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_rule__WallRelation__WallAssignment_611520);
            ruleWall();

            state._fsp--;

             after(grammarAccess.getWallRelationAccess().getWallWallParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__WallAssignment_6"


    // $ANTLR start "rule__WallRelation__OpeningAssignment_8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5833:1: rule__WallRelation__OpeningAssignment_8 : ( ruleOpening ) ;
    public final void rule__WallRelation__OpeningAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5837:1: ( ( ruleOpening ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5838:1: ( ruleOpening )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5838:1: ( ruleOpening )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5839:1: ruleOpening
            {
             before(grammarAccess.getWallRelationAccess().getOpeningOpeningParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_rule__WallRelation__OpeningAssignment_811551);
            ruleOpening();

            state._fsp--;

             after(grammarAccess.getWallRelationAccess().getOpeningOpeningParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WallRelation__OpeningAssignment_8"


    // $ANTLR start "rule__FlowSegment__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5848:1: rule__FlowSegment__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5852:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5853:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5853:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5854:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__GUIDAssignment_2_111582);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5863:1: rule__FlowSegment__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5867:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5868:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5868:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5869:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_3_111613);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5878:1: rule__FlowSegment__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__FlowSegment__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5882:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5883:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5883:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5884:1: ruleEString
            {
             before(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_4_111644);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5893:1: rule__FlowSegment__PlacementAssignment_6 : ( ruleLocalPlacement ) ;
    public final void rule__FlowSegment__PlacementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5897:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5898:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5898:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5899:1: ruleLocalPlacement
            {
             before(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_611675);
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


    // $ANTLR start "rule__LocalPlacement__GUIDAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5908:1: rule__LocalPlacement__GUIDAssignment_3_1 : ( ruleEString ) ;
    public final void rule__LocalPlacement__GUIDAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5912:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5913:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5913:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5914:1: ruleEString
            {
             before(grammarAccess.getLocalPlacementAccess().getGUIDEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LocalPlacement__GUIDAssignment_3_111706);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getGUIDEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__GUIDAssignment_3_1"


    // $ANTLR start "rule__LocalPlacement__NameAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5923:1: rule__LocalPlacement__NameAssignment_4_1 : ( ruleEString ) ;
    public final void rule__LocalPlacement__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5927:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5928:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5928:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5929:1: ruleEString
            {
             before(grammarAccess.getLocalPlacementAccess().getNameEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LocalPlacement__NameAssignment_4_111737);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getNameEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__NameAssignment_4_1"


    // $ANTLR start "rule__LocalPlacement__DescriptionAssignment_5_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5938:1: rule__LocalPlacement__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__LocalPlacement__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5942:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5943:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5943:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5944:1: ruleEString
            {
             before(grammarAccess.getLocalPlacementAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__LocalPlacement__DescriptionAssignment_5_111768);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__DescriptionAssignment_5_1"


    // $ANTLR start "rule__LocalPlacement__Axis2placement3dAssignment_6_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5953:1: rule__LocalPlacement__Axis2placement3dAssignment_6_1 : ( ruleAxis2Placement3D ) ;
    public final void rule__LocalPlacement__Axis2placement3dAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5957:1: ( ( ruleAxis2Placement3D ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5958:1: ( ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5958:1: ( ruleAxis2Placement3D )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5959:1: ruleAxis2Placement3D
            {
             before(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_6_111799);
            ruleAxis2Placement3D();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__Axis2placement3dAssignment_6_1"


    // $ANTLR start "rule__LocalPlacement__RelativeToAssignment_7_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5968:1: rule__LocalPlacement__RelativeToAssignment_7_1 : ( ruleLocalPlacement ) ;
    public final void rule__LocalPlacement__RelativeToAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5972:1: ( ( ruleLocalPlacement ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5973:1: ( ruleLocalPlacement )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5973:1: ( ruleLocalPlacement )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5974:1: ruleLocalPlacement
            {
             before(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_7_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_7_111830);
            ruleLocalPlacement();

            state._fsp--;

             after(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalPlacement__RelativeToAssignment_7_1"


    // $ANTLR start "rule__Axis2Placement3D__GUIDAssignment_2_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5983:1: rule__Axis2Placement3D__GUIDAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Axis2Placement3D__GUIDAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5987:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5988:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5988:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5989:1: ruleEString
            {
             before(grammarAccess.getAxis2Placement3DAccess().getGUIDEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axis2Placement3D__GUIDAssignment_2_111861);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getGUIDEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__GUIDAssignment_2_1"


    // $ANTLR start "rule__Axis2Placement3D__NameAssignment_3_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:5998:1: rule__Axis2Placement3D__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Axis2Placement3D__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6002:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6003:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6003:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6004:1: ruleEString
            {
             before(grammarAccess.getAxis2Placement3DAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axis2Placement3D__NameAssignment_3_111892);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__NameAssignment_3_1"


    // $ANTLR start "rule__Axis2Placement3D__DescriptionAssignment_4_1"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6013:1: rule__Axis2Placement3D__DescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Axis2Placement3D__DescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6017:1: ( ( ruleEString ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6018:1: ( ruleEString )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6018:1: ( ruleEString )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6019:1: ruleEString
            {
             before(grammarAccess.getAxis2Placement3DAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Axis2Placement3D__DescriptionAssignment_4_111923);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__DescriptionAssignment_4_1"


    // $ANTLR start "rule__Axis2Placement3D__CartesianXAssignment_6"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6028:1: rule__Axis2Placement3D__CartesianXAssignment_6 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianXAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6032:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6033:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6033:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6034:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_611954);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__CartesianXAssignment_6"


    // $ANTLR start "rule__Axis2Placement3D__CartesianYAssignment_8"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6043:1: rule__Axis2Placement3D__CartesianYAssignment_8 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianYAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6047:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6048:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6048:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6049:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_811985);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__CartesianYAssignment_8"


    // $ANTLR start "rule__Axis2Placement3D__CartesianZAssignment_10"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6058:1: rule__Axis2Placement3D__CartesianZAssignment_10 : ( ruleEDouble ) ;
    public final void rule__Axis2Placement3D__CartesianZAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6062:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6063:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6063:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6064:1: ruleEDouble
            {
             before(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_10_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_1012016);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__CartesianZAssignment_10"


    // $ANTLR start "rule__Axis2Placement3D__AxisAssignment_12"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6073:1: rule__Axis2Placement3D__AxisAssignment_12 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__AxisAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6077:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6078:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6078:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6079:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_12_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_1212047);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__AxisAssignment_12"


    // $ANTLR start "rule__Axis2Placement3D__RefDirectionAssignment_14"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6088:1: rule__Axis2Placement3D__RefDirectionAssignment_14 : ( ruleDirection ) ;
    public final void rule__Axis2Placement3D__RefDirectionAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6092:1: ( ( ruleDirection ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6093:1: ( ruleDirection )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6093:1: ( ruleDirection )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6094:1: ruleDirection
            {
             before(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_14_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_1412078);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Axis2Placement3D__RefDirectionAssignment_14"


    // $ANTLR start "rule__Direction__XAssignment_3"
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6103:1: rule__Direction__XAssignment_3 : ( ruleEDouble ) ;
    public final void rule__Direction__XAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6107:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6108:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6108:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6109:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_312109);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6118:1: rule__Direction__YAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Direction__YAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6122:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6123:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6123:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6124:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_512140);
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
    // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6133:1: rule__Direction__ZAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Direction__ZAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6137:1: ( ( ruleEDouble ) )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6138:1: ( ruleEDouble )
            {
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6138:1: ( ruleEDouble )
            // ../org.xtext.pipes.ui/src-gen/org/xtext/example/pipes/ui/contentassist/antlr/internal/InternalPipes.g:6139:1: ruleEDouble
            {
             before(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_6_112171);
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
        public static final BitSet FOLLOW_ruleWallRelation_in_entryRuleWallRelation421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRelation428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__0_in_ruleWallRelation454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0_in_ruleFlowSegment514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0_in_ruleLocalPlacement574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0_in_ruleAxis2Placement3D634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0_in_ruleEDouble694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection721 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0_in_ruleDirection754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_rule__GUIDElement__Alternatives790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_rule__GUIDElement__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__GUIDElement__Alternatives824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_rule__GUIDElement__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_rule__GUIDElement__Alternatives858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__GUIDElement__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__GUIDElement__Alternatives892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__EDouble__Alternatives_4_0974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__EDouble__Alternatives_4_0994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01026 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11087 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Model__Group__1__Impl1118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21149 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group__2__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31211 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0_in_rule__Model__Group__3__Impl1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group__4__Impl1300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__0__Impl_in_rule__Model__Group_3__01341 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1_in_rule__Model__Group_3__01344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Model__Group_3__0__Impl1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__1__Impl_in_rule__Model__Group_3__11403 = new BitSet(new long[]{0x00000004CA440000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2_in_rule__Model__Group_3__11406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Model__Group_3__1__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__2__Impl_in_rule__Model__Group_3__21465 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3_in_rule__Model__Group_3__21468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_2_in_rule__Model__Group_3__2__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__3__Impl_in_rule__Model__Group_3__31525 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4_in_rule__Model__Group_3__31528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0_in_rule__Model__Group_3__3__Impl1555 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Model__Group_3__4__Impl_in_rule__Model__Group_3__41586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Model__Group_3__4__Impl1614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__0__Impl_in_rule__Model__Group_3_3__01655 = new BitSet(new long[]{0x00000004CA440000L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1_in_rule__Model__Group_3_3__01658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Model__Group_3_3__0__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__Group_3_3__1__Impl_in_rule__Model__Group_3_3__11717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Model__ElementsAssignment_3_3_1_in_rule__Model__Group_3_3__1__Impl1744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__0__Impl_in_rule__GUIDElement_Impl__Group__01778 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__1_in_rule__GUIDElement_Impl__Group__01781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__1__Impl_in_rule__GUIDElement_Impl__Group__11839 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__2_in_rule__GUIDElement_Impl__Group__11842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__GUIDElement_Impl__Group__1__Impl1870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__2__Impl_in_rule__GUIDElement_Impl__Group__21901 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__3_in_rule__GUIDElement_Impl__Group__21904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__GUIDElement_Impl__Group__2__Impl1932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__3__Impl_in_rule__GUIDElement_Impl__Group__31963 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__4_in_rule__GUIDElement_Impl__Group__31966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__0_in_rule__GUIDElement_Impl__Group__3__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__4__Impl_in_rule__GUIDElement_Impl__Group__42024 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__5_in_rule__GUIDElement_Impl__Group__42027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__0_in_rule__GUIDElement_Impl__Group__4__Impl2054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__5__Impl_in_rule__GUIDElement_Impl__Group__52085 = new BitSet(new long[]{0x0000000000388000L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__6_in_rule__GUIDElement_Impl__Group__52088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__0_in_rule__GUIDElement_Impl__Group__5__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group__6__Impl_in_rule__GUIDElement_Impl__Group__62146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__GUIDElement_Impl__Group__6__Impl2174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__0__Impl_in_rule__GUIDElement_Impl__Group_3__02219 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__1_in_rule__GUIDElement_Impl__Group_3__02222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__GUIDElement_Impl__Group_3__0__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_3__1__Impl_in_rule__GUIDElement_Impl__Group_3__12281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__GUIDAssignment_3_1_in_rule__GUIDElement_Impl__Group_3__1__Impl2308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__0__Impl_in_rule__GUIDElement_Impl__Group_4__02342 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__1_in_rule__GUIDElement_Impl__Group_4__02345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__GUIDElement_Impl__Group_4__0__Impl2373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_4__1__Impl_in_rule__GUIDElement_Impl__Group_4__12404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__NameAssignment_4_1_in_rule__GUIDElement_Impl__Group_4__1__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__0__Impl_in_rule__GUIDElement_Impl__Group_5__02465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__1_in_rule__GUIDElement_Impl__Group_5__02468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__GUIDElement_Impl__Group_5__0__Impl2496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__Group_5__1__Impl_in_rule__GUIDElement_Impl__Group_5__12527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__GUIDElement_Impl__DescriptionAssignment_5_1_in_rule__GUIDElement_Impl__Group_5__1__Impl2554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__0__Impl_in_rule__Wall__Group__02588 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wall__Group__1_in_rule__Wall__Group__02591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Wall__Group__0__Impl2619 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__1__Impl_in_rule__Wall__Group__12650 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__2_in_rule__Wall__Group__12653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wall__Group__1__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__2__Impl_in_rule__Wall__Group__22712 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__3_in_rule__Wall__Group__22715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__0_in_rule__Wall__Group__2__Impl2742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__3__Impl_in_rule__Wall__Group__32773 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__4_in_rule__Wall__Group__32776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__0_in_rule__Wall__Group__3__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__4__Impl_in_rule__Wall__Group__42834 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Wall__Group__5_in_rule__Wall__Group__42837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__0_in_rule__Wall__Group__4__Impl2864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__5__Impl_in_rule__Wall__Group__52895 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Wall__Group__6_in_rule__Wall__Group__52898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Wall__Group__5__Impl2926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__6__Impl_in_rule__Wall__Group__62957 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__Wall__Group__7_in_rule__Wall__Group__62960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__PlacementAssignment_6_in_rule__Wall__Group__6__Impl2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__7__Impl_in_rule__Wall__Group__73017 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_rule__Wall__Group__8_in_rule__Wall__Group__73020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__0_in_rule__Wall__Group__7__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group__8__Impl_in_rule__Wall__Group__83078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Wall__Group__8__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__0__Impl_in_rule__Wall__Group_2__03155 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__1_in_rule__Wall__Group_2__03158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Wall__Group_2__0__Impl3186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_2__1__Impl_in_rule__Wall__Group_2__13217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__GUIDAssignment_2_1_in_rule__Wall__Group_2__1__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__0__Impl_in_rule__Wall__Group_3__03278 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__1_in_rule__Wall__Group_3__03281 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Wall__Group_3__0__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_3__1__Impl_in_rule__Wall__Group_3__13340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__NameAssignment_3_1_in_rule__Wall__Group_3__1__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__0__Impl_in_rule__Wall__Group_4__03401 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__1_in_rule__Wall__Group_4__03404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Wall__Group_4__0__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_4__1__Impl_in_rule__Wall__Group_4__13463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__DescriptionAssignment_4_1_in_rule__Wall__Group_4__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__0__Impl_in_rule__Wall__Group_7__03524 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__1_in_rule__Wall__Group_7__03527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Wall__Group_7__0__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__1__Impl_in_rule__Wall__Group_7__13586 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__2_in_rule__Wall__Group_7__13589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Wall__Group_7__1__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__2__Impl_in_rule__Wall__Group_7__23648 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__3_in_rule__Wall__Group_7__23651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__OpeningsAssignment_7_2_in_rule__Wall__Group_7__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__3__Impl_in_rule__Wall__Group_7__33708 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__4_in_rule__Wall__Group_7__33711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7_3__0_in_rule__Wall__Group_7__3__Impl3738 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7__4__Impl_in_rule__Wall__Group_7__43769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Wall__Group_7__4__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7_3__0__Impl_in_rule__Wall__Group_7_3__03838 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Wall__Group_7_3__1_in_rule__Wall__Group_7_3__03841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Wall__Group_7_3__0__Impl3869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__Group_7_3__1__Impl_in_rule__Wall__Group_7_3__13900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Wall__OpeningsAssignment_7_3_1_in_rule__Wall__Group_7_3__1__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__0__Impl_in_rule__Opening__Group__03961 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Opening__Group__1_in_rule__Opening__Group__03964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Opening__Group__0__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__1__Impl_in_rule__Opening__Group__14023 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__2_in_rule__Opening__Group__14026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Opening__Group__1__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__2__Impl_in_rule__Opening__Group__24085 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__3_in_rule__Opening__Group__24088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0_in_rule__Opening__Group__2__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__3__Impl_in_rule__Opening__Group__34146 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__4_in_rule__Opening__Group__34149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0_in_rule__Opening__Group__3__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__4__Impl_in_rule__Opening__Group__44207 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__Opening__Group__5_in_rule__Opening__Group__44210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__0_in_rule__Opening__Group__4__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__5__Impl_in_rule__Opening__Group__54268 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Opening__Group__6_in_rule__Opening__Group__54271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Opening__Group__5__Impl4299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__6__Impl_in_rule__Opening__Group__64330 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__Opening__Group__7_in_rule__Opening__Group__64333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__PlacementAssignment_6_in_rule__Opening__Group__6__Impl4360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__7__Impl_in_rule__Opening__Group__74390 = new BitSet(new long[]{0x0000000004008000L});
        public static final BitSet FOLLOW_rule__Opening__Group__8_in_rule__Opening__Group__74393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__0_in_rule__Opening__Group__7__Impl4420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group__8__Impl_in_rule__Opening__Group__84451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Opening__Group__8__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__0__Impl_in_rule__Opening__Group_2__04528 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1_in_rule__Opening__Group_2__04531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Opening__Group_2__0__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_2__1__Impl_in_rule__Opening__Group_2__14590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__GUIDAssignment_2_1_in_rule__Opening__Group_2__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__0__Impl_in_rule__Opening__Group_3__04651 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1_in_rule__Opening__Group_3__04654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Opening__Group_3__0__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_3__1__Impl_in_rule__Opening__Group_3__14713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__NameAssignment_3_1_in_rule__Opening__Group_3__1__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__0__Impl_in_rule__Opening__Group_4__04774 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__1_in_rule__Opening__Group_4__04777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Opening__Group_4__0__Impl4805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_4__1__Impl_in_rule__Opening__Group_4__14836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__DescriptionAssignment_4_1_in_rule__Opening__Group_4__1__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__0__Impl_in_rule__Opening__Group_7__04897 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__1_in_rule__Opening__Group_7__04900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Opening__Group_7__0__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__1__Impl_in_rule__Opening__Group_7__14959 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__2_in_rule__Opening__Group_7__14962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Opening__Group_7__1__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__2__Impl_in_rule__Opening__Group_7__25021 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__3_in_rule__Opening__Group_7__25024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_2_in_rule__Opening__Group_7__2__Impl5051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__3__Impl_in_rule__Opening__Group_7__35081 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__4_in_rule__Opening__Group_7__35084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__0_in_rule__Opening__Group_7__3__Impl5111 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7__4__Impl_in_rule__Opening__Group_7__45142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Opening__Group_7__4__Impl5170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__0__Impl_in_rule__Opening__Group_7_3__05211 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__1_in_rule__Opening__Group_7_3__05214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Opening__Group_7_3__0__Impl5242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__Group_7_3__1__Impl_in_rule__Opening__Group_7_3__15273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Opening__WallsAssignment_7_3_1_in_rule__Opening__Group_7_3__1__Impl5300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__0__Impl_in_rule__WallRelation__Group__05334 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__1_in_rule__WallRelation__Group__05337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__WallRelation__Group__0__Impl5365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__1__Impl_in_rule__WallRelation__Group__15396 = new BitSet(new long[]{0x0000000010380000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__2_in_rule__WallRelation__Group__15399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WallRelation__Group__1__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__2__Impl_in_rule__WallRelation__Group__25458 = new BitSet(new long[]{0x0000000010380000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__3_in_rule__WallRelation__Group__25461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_2__0_in_rule__WallRelation__Group__2__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__3__Impl_in_rule__WallRelation__Group__35519 = new BitSet(new long[]{0x0000000010380000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__4_in_rule__WallRelation__Group__35522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_3__0_in_rule__WallRelation__Group__3__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__4__Impl_in_rule__WallRelation__Group__45580 = new BitSet(new long[]{0x0000000010380000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__5_in_rule__WallRelation__Group__45583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_4__0_in_rule__WallRelation__Group__4__Impl5610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__5__Impl_in_rule__WallRelation__Group__55641 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__6_in_rule__WallRelation__Group__55644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__WallRelation__Group__5__Impl5672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__6__Impl_in_rule__WallRelation__Group__65703 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__7_in_rule__WallRelation__Group__65706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__WallAssignment_6_in_rule__WallRelation__Group__6__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__7__Impl_in_rule__WallRelation__Group__75763 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__8_in_rule__WallRelation__Group__75766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__WallRelation__Group__7__Impl5794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__8__Impl_in_rule__WallRelation__Group__85825 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__9_in_rule__WallRelation__Group__85828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__OpeningAssignment_8_in_rule__WallRelation__Group__8__Impl5855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group__9__Impl_in_rule__WallRelation__Group__95885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__WallRelation__Group__9__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_2__0__Impl_in_rule__WallRelation__Group_2__05964 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_2__1_in_rule__WallRelation__Group_2__05967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WallRelation__Group_2__0__Impl5995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_2__1__Impl_in_rule__WallRelation__Group_2__16026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__GUIDAssignment_2_1_in_rule__WallRelation__Group_2__1__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_3__0__Impl_in_rule__WallRelation__Group_3__06087 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_3__1_in_rule__WallRelation__Group_3__06090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WallRelation__Group_3__0__Impl6118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_3__1__Impl_in_rule__WallRelation__Group_3__16149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__NameAssignment_3_1_in_rule__WallRelation__Group_3__1__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_4__0__Impl_in_rule__WallRelation__Group_4__06210 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_4__1_in_rule__WallRelation__Group_4__06213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__WallRelation__Group_4__0__Impl6241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__Group_4__1__Impl_in_rule__WallRelation__Group_4__16272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WallRelation__DescriptionAssignment_4_1_in_rule__WallRelation__Group_4__1__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__0__Impl_in_rule__FlowSegment__Group__06333 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1_in_rule__FlowSegment__Group__06336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__FlowSegment__Group__0__Impl6364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__1__Impl_in_rule__FlowSegment__Group__16395 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2_in_rule__FlowSegment__Group__16398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__FlowSegment__Group__1__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__2__Impl_in_rule__FlowSegment__Group__26457 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3_in_rule__FlowSegment__Group__26460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0_in_rule__FlowSegment__Group__2__Impl6487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__3__Impl_in_rule__FlowSegment__Group__36518 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4_in_rule__FlowSegment__Group__36521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0_in_rule__FlowSegment__Group__3__Impl6548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__4__Impl_in_rule__FlowSegment__Group__46579 = new BitSet(new long[]{0x0000000000B80000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5_in_rule__FlowSegment__Group__46582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__0_in_rule__FlowSegment__Group__4__Impl6609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__5__Impl_in_rule__FlowSegment__Group__56640 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__6_in_rule__FlowSegment__Group__56643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FlowSegment__Group__5__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__6__Impl_in_rule__FlowSegment__Group__66702 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__7_in_rule__FlowSegment__Group__66705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__PlacementAssignment_6_in_rule__FlowSegment__Group__6__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group__7__Impl_in_rule__FlowSegment__Group__76762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__FlowSegment__Group__7__Impl6790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__0__Impl_in_rule__FlowSegment__Group_2__06837 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1_in_rule__FlowSegment__Group_2__06840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__FlowSegment__Group_2__0__Impl6868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_2__1__Impl_in_rule__FlowSegment__Group_2__16899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__GUIDAssignment_2_1_in_rule__FlowSegment__Group_2__1__Impl6926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__0__Impl_in_rule__FlowSegment__Group_3__06960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1_in_rule__FlowSegment__Group_3__06963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FlowSegment__Group_3__0__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_3__1__Impl_in_rule__FlowSegment__Group_3__17022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__NameAssignment_3_1_in_rule__FlowSegment__Group_3__1__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__0__Impl_in_rule__FlowSegment__Group_4__07083 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__1_in_rule__FlowSegment__Group_4__07086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FlowSegment__Group_4__0__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__Group_4__1__Impl_in_rule__FlowSegment__Group_4__17145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FlowSegment__DescriptionAssignment_4_1_in_rule__FlowSegment__Group_4__1__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__0__Impl_in_rule__LocalPlacement__Group__07206 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1_in_rule__LocalPlacement__Group__07209 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__1__Impl_in_rule__LocalPlacement__Group__17267 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2_in_rule__LocalPlacement__Group__17270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__LocalPlacement__Group__1__Impl7298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__2__Impl_in_rule__LocalPlacement__Group__27329 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3_in_rule__LocalPlacement__Group__27332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__LocalPlacement__Group__2__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__3__Impl_in_rule__LocalPlacement__Group__37391 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4_in_rule__LocalPlacement__Group__37394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0_in_rule__LocalPlacement__Group__3__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__4__Impl_in_rule__LocalPlacement__Group__47452 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5_in_rule__LocalPlacement__Group__47455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__0_in_rule__LocalPlacement__Group__4__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__5__Impl_in_rule__LocalPlacement__Group__57513 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__6_in_rule__LocalPlacement__Group__57516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_5__0_in_rule__LocalPlacement__Group__5__Impl7543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__6__Impl_in_rule__LocalPlacement__Group__67574 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__7_in_rule__LocalPlacement__Group__67577 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_6__0_in_rule__LocalPlacement__Group__6__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__7__Impl_in_rule__LocalPlacement__Group__77635 = new BitSet(new long[]{0x0000000300388000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__8_in_rule__LocalPlacement__Group__77638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_7__0_in_rule__LocalPlacement__Group__7__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group__8__Impl_in_rule__LocalPlacement__Group__87696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__LocalPlacement__Group__8__Impl7724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__0__Impl_in_rule__LocalPlacement__Group_3__07773 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1_in_rule__LocalPlacement__Group_3__07776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__LocalPlacement__Group_3__0__Impl7804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_3__1__Impl_in_rule__LocalPlacement__Group_3__17835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__GUIDAssignment_3_1_in_rule__LocalPlacement__Group_3__1__Impl7862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__0__Impl_in_rule__LocalPlacement__Group_4__07896 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__1_in_rule__LocalPlacement__Group_4__07899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__LocalPlacement__Group_4__0__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_4__1__Impl_in_rule__LocalPlacement__Group_4__17958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__NameAssignment_4_1_in_rule__LocalPlacement__Group_4__1__Impl7985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_5__0__Impl_in_rule__LocalPlacement__Group_5__08019 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_5__1_in_rule__LocalPlacement__Group_5__08022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__LocalPlacement__Group_5__0__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_5__1__Impl_in_rule__LocalPlacement__Group_5__18081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__DescriptionAssignment_5_1_in_rule__LocalPlacement__Group_5__1__Impl8108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_6__0__Impl_in_rule__LocalPlacement__Group_6__08142 = new BitSet(new long[]{0x00000004CA440000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_6__1_in_rule__LocalPlacement__Group_6__08145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__LocalPlacement__Group_6__0__Impl8173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_6__1__Impl_in_rule__LocalPlacement__Group_6__18204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Axis2placement3dAssignment_6_1_in_rule__LocalPlacement__Group_6__1__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_7__0__Impl_in_rule__LocalPlacement__Group_7__08265 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_7__1_in_rule__LocalPlacement__Group_7__08268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__LocalPlacement__Group_7__0__Impl8296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__Group_7__1__Impl_in_rule__LocalPlacement__Group_7__18327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__LocalPlacement__RelativeToAssignment_7_1_in_rule__LocalPlacement__Group_7__1__Impl8354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__0__Impl_in_rule__Axis2Placement3D__Group__08388 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1_in_rule__Axis2Placement3D__Group__08391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Axis2Placement3D__Group__0__Impl8419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__1__Impl_in_rule__Axis2Placement3D__Group__18450 = new BitSet(new long[]{0x0000000800380000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2_in_rule__Axis2Placement3D__Group__18453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Axis2Placement3D__Group__1__Impl8481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__2__Impl_in_rule__Axis2Placement3D__Group__28512 = new BitSet(new long[]{0x0000000800380000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3_in_rule__Axis2Placement3D__Group__28515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_2__0_in_rule__Axis2Placement3D__Group__2__Impl8542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__3__Impl_in_rule__Axis2Placement3D__Group__38573 = new BitSet(new long[]{0x0000000800380000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4_in_rule__Axis2Placement3D__Group__38576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_3__0_in_rule__Axis2Placement3D__Group__3__Impl8603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__4__Impl_in_rule__Axis2Placement3D__Group__48634 = new BitSet(new long[]{0x0000000800380000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5_in_rule__Axis2Placement3D__Group__48637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_4__0_in_rule__Axis2Placement3D__Group__4__Impl8664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__5__Impl_in_rule__Axis2Placement3D__Group__58695 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6_in_rule__Axis2Placement3D__Group__58698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Axis2Placement3D__Group__5__Impl8726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__6__Impl_in_rule__Axis2Placement3D__Group__68757 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7_in_rule__Axis2Placement3D__Group__68760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianXAssignment_6_in_rule__Axis2Placement3D__Group__6__Impl8787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__7__Impl_in_rule__Axis2Placement3D__Group__78817 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8_in_rule__Axis2Placement3D__Group__78820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Axis2Placement3D__Group__7__Impl8848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__8__Impl_in_rule__Axis2Placement3D__Group__88879 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9_in_rule__Axis2Placement3D__Group__88882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianYAssignment_8_in_rule__Axis2Placement3D__Group__8__Impl8909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__9__Impl_in_rule__Axis2Placement3D__Group__98939 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10_in_rule__Axis2Placement3D__Group__98942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Axis2Placement3D__Group__9__Impl8970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__10__Impl_in_rule__Axis2Placement3D__Group__109001 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11_in_rule__Axis2Placement3D__Group__109004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__CartesianZAssignment_10_in_rule__Axis2Placement3D__Group__10__Impl9031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__11__Impl_in_rule__Axis2Placement3D__Group__119061 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12_in_rule__Axis2Placement3D__Group__119064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Axis2Placement3D__Group__11__Impl9092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__12__Impl_in_rule__Axis2Placement3D__Group__129123 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13_in_rule__Axis2Placement3D__Group__129126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__AxisAssignment_12_in_rule__Axis2Placement3D__Group__12__Impl9153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__13__Impl_in_rule__Axis2Placement3D__Group__139183 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__14_in_rule__Axis2Placement3D__Group__139186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Axis2Placement3D__Group__13__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__14__Impl_in_rule__Axis2Placement3D__Group__149245 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__15_in_rule__Axis2Placement3D__Group__149248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__RefDirectionAssignment_14_in_rule__Axis2Placement3D__Group__14__Impl9275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group__15__Impl_in_rule__Axis2Placement3D__Group__159305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Axis2Placement3D__Group__15__Impl9333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_2__0__Impl_in_rule__Axis2Placement3D__Group_2__09396 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_2__1_in_rule__Axis2Placement3D__Group_2__09399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Axis2Placement3D__Group_2__0__Impl9427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_2__1__Impl_in_rule__Axis2Placement3D__Group_2__19458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__GUIDAssignment_2_1_in_rule__Axis2Placement3D__Group_2__1__Impl9485 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_3__0__Impl_in_rule__Axis2Placement3D__Group_3__09519 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_3__1_in_rule__Axis2Placement3D__Group_3__09522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Axis2Placement3D__Group_3__0__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_3__1__Impl_in_rule__Axis2Placement3D__Group_3__19581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__NameAssignment_3_1_in_rule__Axis2Placement3D__Group_3__1__Impl9608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_4__0__Impl_in_rule__Axis2Placement3D__Group_4__09642 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_4__1_in_rule__Axis2Placement3D__Group_4__09645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Axis2Placement3D__Group_4__0__Impl9673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__Group_4__1__Impl_in_rule__Axis2Placement3D__Group_4__19704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Axis2Placement3D__DescriptionAssignment_4_1_in_rule__Axis2Placement3D__Group_4__1__Impl9731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__0__Impl_in_rule__EDouble__Group__09765 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1_in_rule__EDouble__Group__09768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__EDouble__Group__0__Impl9797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__1__Impl_in_rule__EDouble__Group__19830 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2_in_rule__EDouble__Group__19833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__1__Impl9861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__2__Impl_in_rule__EDouble__Group__29892 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3_in_rule__EDouble__Group__29895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__EDouble__Group__2__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__3__Impl_in_rule__EDouble__Group__39954 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4_in_rule__EDouble__Group__39957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group__3__Impl9984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group__4__Impl_in_rule__EDouble__Group__410013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0_in_rule__EDouble__Group__4__Impl10040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__0__Impl_in_rule__EDouble__Group_4__010081 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1_in_rule__EDouble__Group_4__010084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Alternatives_4_0_in_rule__EDouble__Group_4__0__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__1__Impl_in_rule__EDouble__Group_4__110141 = new BitSet(new long[]{0x0000010000000040L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2_in_rule__EDouble__Group_4__110144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__EDouble__Group_4__1__Impl10173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EDouble__Group_4__2__Impl_in_rule__EDouble__Group_4__210206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EDouble__Group_4__2__Impl10233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__0__Impl_in_rule__Direction__Group__010268 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__Direction__Group__1_in_rule__Direction__Group__010271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__Direction__Group__0__Impl10299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__1__Impl_in_rule__Direction__Group__110330 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_rule__Direction__Group__2_in_rule__Direction__Group__110333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Direction__Group__1__Impl10361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__2__Impl_in_rule__Direction__Group__210392 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__3_in_rule__Direction__Group__210395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Direction__Group__2__Impl10423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__3__Impl_in_rule__Direction__Group__310454 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_rule__Direction__Group__4_in_rule__Direction__Group__310457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__XAssignment_3_in_rule__Direction__Group__3__Impl10484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__4__Impl_in_rule__Direction__Group__410514 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group__5_in_rule__Direction__Group__410517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_rule__Direction__Group__4__Impl10545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__5__Impl_in_rule__Direction__Group__510576 = new BitSet(new long[]{0x0000200000008000L});
        public static final BitSet FOLLOW_rule__Direction__Group__6_in_rule__Direction__Group__510579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__YAssignment_5_in_rule__Direction__Group__5__Impl10606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__6__Impl_in_rule__Direction__Group__610636 = new BitSet(new long[]{0x0000200000008000L});
        public static final BitSet FOLLOW_rule__Direction__Group__7_in_rule__Direction__Group__610639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__0_in_rule__Direction__Group__6__Impl10666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group__7__Impl_in_rule__Direction__Group__710697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Direction__Group__7__Impl10725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__0__Impl_in_rule__Direction__Group_6__010772 = new BitSet(new long[]{0x0000030000000040L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__1_in_rule__Direction__Group_6__010775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_rule__Direction__Group_6__0__Impl10803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__Group_6__1__Impl_in_rule__Direction__Group_6__110834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Direction__ZAssignment_6_1_in_rule__Direction__Group_6__1__Impl10861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_210900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_rule__Model__ElementsAssignment_3_3_110931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__GUIDAssignment_3_110962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__NameAssignment_4_110993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__GUIDElement_Impl__DescriptionAssignment_5_111024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__GUIDAssignment_2_111055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__NameAssignment_3_111086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Wall__DescriptionAssignment_4_111117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Wall__PlacementAssignment_611148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_rule__Wall__OpeningsAssignment_7_211179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_rule__Wall__OpeningsAssignment_7_3_111210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__GUIDAssignment_2_111241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__NameAssignment_3_111272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Opening__DescriptionAssignment_4_111303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__Opening__PlacementAssignment_611334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_rule__Opening__WallsAssignment_7_211365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_rule__Opening__WallsAssignment_7_3_111396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRelation__GUIDAssignment_2_111427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRelation__NameAssignment_3_111458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WallRelation__DescriptionAssignment_4_111489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_rule__WallRelation__WallAssignment_611520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_rule__WallRelation__OpeningAssignment_811551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__GUIDAssignment_2_111582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__NameAssignment_3_111613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FlowSegment__DescriptionAssignment_4_111644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__FlowSegment__PlacementAssignment_611675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LocalPlacement__GUIDAssignment_3_111706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LocalPlacement__NameAssignment_4_111737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__LocalPlacement__DescriptionAssignment_5_111768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_rule__LocalPlacement__Axis2placement3dAssignment_6_111799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_rule__LocalPlacement__RelativeToAssignment_7_111830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axis2Placement3D__GUIDAssignment_2_111861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axis2Placement3D__NameAssignment_3_111892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Axis2Placement3D__DescriptionAssignment_4_111923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianXAssignment_611954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianYAssignment_811985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Axis2Placement3D__CartesianZAssignment_1012016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__AxisAssignment_1212047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_rule__Axis2Placement3D__RefDirectionAssignment_1412078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__XAssignment_312109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__YAssignment_512140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_rule__Direction__ZAssignment_6_112171 = new BitSet(new long[]{0x0000000000000002L});
    }


}