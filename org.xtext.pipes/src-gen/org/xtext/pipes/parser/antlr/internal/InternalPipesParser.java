package org.xtext.pipes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.pipes.services.PipesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Walls'", "'and'", "'Openings'", "'Pipes'", "'Wall'", "'Name'", "'Description'", "'Placement'", "'Opening'", "','", "'Pipe'", "'{'", "'RelativeTo'", "'Axis2Placement3d'", "'}'", "'Cartesian'", "'('", "')'", "'Axis'", "'RefDirection'", "'-'", "'.'", "'E'", "'e'"
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
    public String getGrammarFileName() { return "../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g"; }



     	private PipesGrammarAccess grammarAccess;
     	
        public InternalPipesParser(TokenStream input, PipesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected PipesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Walls' ( (lv_elements_2_0= ruleWallRule ) ) (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )* otherlv_5= 'Openings' ( (lv_elements_6_0= ruleOpening ) ) (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )* otherlv_9= 'Pipes' ( (lv_elements_10_0= ruleFlowSegment ) ) (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;

        EObject lv_elements_8_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:79:28: ( ( () otherlv_1= 'Walls' ( (lv_elements_2_0= ruleWallRule ) ) (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )* otherlv_5= 'Openings' ( (lv_elements_6_0= ruleOpening ) ) (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )* otherlv_9= 'Pipes' ( (lv_elements_10_0= ruleFlowSegment ) ) (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )* ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Walls' ( (lv_elements_2_0= ruleWallRule ) ) (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )* otherlv_5= 'Openings' ( (lv_elements_6_0= ruleOpening ) ) (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )* otherlv_9= 'Pipes' ( (lv_elements_10_0= ruleFlowSegment ) ) (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )* )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Walls' ( (lv_elements_2_0= ruleWallRule ) ) (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )* otherlv_5= 'Openings' ( (lv_elements_6_0= ruleOpening ) ) (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )* otherlv_9= 'Pipes' ( (lv_elements_10_0= ruleFlowSegment ) ) (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )* )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:2: () otherlv_1= 'Walls' ( (lv_elements_2_0= ruleWallRule ) ) (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )* otherlv_5= 'Openings' ( (lv_elements_6_0= ruleOpening ) ) (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )* otherlv_9= 'Pipes' ( (lv_elements_10_0= ruleFlowSegment ) ) (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )*
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getWallsKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:90:1: ( (lv_elements_2_0= ruleWallRule ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:91:1: (lv_elements_2_0= ruleWallRule )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:91:1: (lv_elements_2_0= ruleWallRule )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:92:3: lv_elements_2_0= ruleWallRule
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_ruleModel152);
            lv_elements_2_0=ruleWallRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"WallRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:108:2: (otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:108:4: otherlv_3= 'and' ( (lv_elements_4_0= ruleWallRule ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel165); 

            	        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getAndKeyword_3_0());
            	        
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:112:1: ( (lv_elements_4_0= ruleWallRule ) )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:113:1: (lv_elements_4_0= ruleWallRule )
            	    {
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:113:1: (lv_elements_4_0= ruleWallRule )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:114:3: lv_elements_4_0= ruleWallRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_ruleModel186);
            	    lv_elements_4_0=ruleWallRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"WallRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel200); 

                	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getOpeningsKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:134:1: ( (lv_elements_6_0= ruleOpening ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:135:1: (lv_elements_6_0= ruleOpening )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:135:1: (lv_elements_6_0= ruleOpening )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:136:3: lv_elements_6_0= ruleOpening
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_ruleModel221);
            lv_elements_6_0=ruleOpening();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_6_0, 
                    		"Opening");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:152:2: (otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:152:4: otherlv_7= 'and' ( (lv_elements_8_0= ruleOpening ) )
            	    {
            	    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel234); 

            	        	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getAndKeyword_6_0());
            	        
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:156:1: ( (lv_elements_8_0= ruleOpening ) )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:157:1: (lv_elements_8_0= ruleOpening )
            	    {
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:157:1: (lv_elements_8_0= ruleOpening )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:158:3: lv_elements_8_0= ruleOpening
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOpening_in_ruleModel255);
            	    lv_elements_8_0=ruleOpening();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_8_0, 
            	            		"Opening");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel269); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getPipesKeyword_7());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:178:1: ( (lv_elements_10_0= ruleFlowSegment ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:179:1: (lv_elements_10_0= ruleFlowSegment )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:179:1: (lv_elements_10_0= ruleFlowSegment )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:180:3: lv_elements_10_0= ruleFlowSegment
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_ruleModel290);
            lv_elements_10_0=ruleFlowSegment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_10_0, 
                    		"FlowSegment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:196:2: (otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:196:4: otherlv_11= 'and' ( (lv_elements_12_0= ruleFlowSegment ) )
            	    {
            	    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel303); 

            	        	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getAndKeyword_9_0());
            	        
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:200:1: ( (lv_elements_12_0= ruleFlowSegment ) )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:201:1: (lv_elements_12_0= ruleFlowSegment )
            	    {
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:201:1: (lv_elements_12_0= ruleFlowSegment )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:202:3: lv_elements_12_0= ruleFlowSegment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_ruleModel324);
            	    lv_elements_12_0=ruleFlowSegment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_12_0, 
            	            		"FlowSegment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:226:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:227:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:228:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString363);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString374); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:235:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:238:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:239:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:239:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:239:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString414); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:247:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString440); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWallRule"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:262:1: entryRuleWallRule returns [EObject current=null] : iv_ruleWallRule= ruleWallRule EOF ;
    public final EObject entryRuleWallRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallRule = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:263:2: (iv_ruleWallRule= ruleWallRule EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:264:2: iv_ruleWallRule= ruleWallRule EOF
            {
             newCompositeNode(grammarAccess.getWallRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_entryRuleWallRule485);
            iv_ruleWallRule=ruleWallRule();

            state._fsp--;

             current =iv_ruleWallRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRule495); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWallRule"


    // $ANTLR start "ruleWallRule"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:271:1: ruleWallRule returns [EObject current=null] : (otherlv_0= 'Wall' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) ;
    public final EObject ruleWallRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:274:28: ( (otherlv_0= 'Wall' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:275:1: (otherlv_0= 'Wall' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:275:1: (otherlv_0= 'Wall' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:275:3: otherlv_0= 'Wall' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWallRule532); 

                	newLeafNode(otherlv_0, grammarAccess.getWallRuleAccess().getWallKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:279:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:280:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:280:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:281:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleWallRule549); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWallRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWallRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:297:2: (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:297:4: otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWallRule567); 

                        	newLeafNode(otherlv_2, grammarAccess.getWallRuleAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:301:1: ( (lv_elementName_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:302:1: (lv_elementName_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:302:1: (lv_elementName_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:303:3: lv_elementName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRule588);
                    lv_elementName_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"elementName",
                            		lv_elementName_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:319:4: (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:319:6: otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWallRule603); 

                        	newLeafNode(otherlv_4, grammarAccess.getWallRuleAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:323:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:324:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:324:1: (lv_description_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:325:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRule624);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWallRule638); 

                	newLeafNode(otherlv_6, grammarAccess.getWallRuleAccess().getPlacementKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:345:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:346:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:346:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:347:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleWallRule659);
            lv_placement_7_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWallRuleRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_7_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWallRule"


    // $ANTLR start "entryRuleOpening"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:371:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:372:2: (iv_ruleOpening= ruleOpening EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:373:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening695);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening705); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOpening"


    // $ANTLR start "ruleOpening"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:380:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:383:28: ( (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:384:1: (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:384:1: (otherlv_0= 'Opening' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )? )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:384:3: otherlv_0= 'Opening' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpening742); 

                	newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:388:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:389:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:389:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:390:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpening759); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOpeningAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOpeningRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:406:2: (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:406:4: otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpening777); 

                        	newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:410:1: ( (lv_elementName_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:411:1: (lv_elementName_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:411:1: (lv_elementName_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:412:3: lv_elementName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening798);
                    lv_elementName_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		set(
                           			current, 
                           			"elementName",
                            		lv_elementName_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:428:4: (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:428:6: otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpening813); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:432:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:433:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:433:1: (lv_description_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:434:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening834);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpening848); 

                	newLeafNode(otherlv_6, grammarAccess.getOpeningAccess().getPlacementKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:454:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:455:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:455:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:456:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleOpening869);
            lv_placement_7_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpeningRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_7_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:472:2: (otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:472:4: otherlv_8= 'Walls' ( (otherlv_9= RULE_ID ) ) (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    {
                    otherlv_8=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleOpening882); 

                        	newLeafNode(otherlv_8, grammarAccess.getOpeningAccess().getWallsKeyword_6_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:476:1: ( (otherlv_9= RULE_ID ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:477:1: (otherlv_9= RULE_ID )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:477:1: (otherlv_9= RULE_ID )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:478:3: otherlv_9= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOpeningRule());
                    	        }
                            
                    otherlv_9=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpening902); 

                    		newLeafNode(otherlv_9, grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_1_0()); 
                    	

                    }


                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:489:2: (otherlv_10= ',' ( (otherlv_11= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:489:4: otherlv_10= ',' ( (otherlv_11= RULE_ID ) )
                    	    {
                    	    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOpening915); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:493:1: ( (otherlv_11= RULE_ID ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:494:1: (otherlv_11= RULE_ID )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:494:1: (otherlv_11= RULE_ID )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:495:3: otherlv_11= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOpeningRule());
                    	    	        }
                    	            
                    	    otherlv_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOpening935); 

                    	    		newLeafNode(otherlv_11, grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRuleFlowSegment"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:514:1: entryRuleFlowSegment returns [EObject current=null] : iv_ruleFlowSegment= ruleFlowSegment EOF ;
    public final EObject entryRuleFlowSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSegment = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:515:2: (iv_ruleFlowSegment= ruleFlowSegment EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:516:2: iv_ruleFlowSegment= ruleFlowSegment EOF
            {
             newCompositeNode(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment975);
            iv_ruleFlowSegment=ruleFlowSegment();

            state._fsp--;

             current =iv_ruleFlowSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlowSegment"


    // $ANTLR start "ruleFlowSegment"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:523:1: ruleFlowSegment returns [EObject current=null] : (otherlv_0= 'Pipe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) ;
    public final EObject ruleFlowSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:526:28: ( (otherlv_0= 'Pipe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:527:1: (otherlv_0= 'Pipe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:527:1: (otherlv_0= 'Pipe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:527:3: otherlv_0= 'Pipe' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'Placement' ( (lv_placement_7_0= ruleLocalPlacement ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFlowSegment1022); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowSegmentAccess().getPipeKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:531:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:532:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:532:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:533:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFlowSegment1039); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFlowSegmentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFlowSegmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:549:2: (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:549:4: otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlowSegment1057); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:553:1: ( (lv_elementName_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:554:1: (lv_elementName_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:554:1: (lv_elementName_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:555:3: lv_elementName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1078);
                    lv_elementName_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"elementName",
                            		lv_elementName_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:571:4: (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:571:6: otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlowSegment1093); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:575:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:576:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:576:1: (lv_description_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:577:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1114);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFlowSegment1128); 

                	newLeafNode(otherlv_6, grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:597:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:598:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:598:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:599:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1149);
            lv_placement_7_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_7_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlowSegment"


    // $ANTLR start "entryRuleLocalPlacement"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:623:1: entryRuleLocalPlacement returns [EObject current=null] : iv_ruleLocalPlacement= ruleLocalPlacement EOF ;
    public final EObject entryRuleLocalPlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPlacement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:624:2: (iv_ruleLocalPlacement= ruleLocalPlacement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:625:2: iv_ruleLocalPlacement= ruleLocalPlacement EOF
            {
             newCompositeNode(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1185);
            iv_ruleLocalPlacement=ruleLocalPlacement();

            state._fsp--;

             current =iv_ruleLocalPlacement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement1195); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalPlacement"


    // $ANTLR start "ruleLocalPlacement"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:632:1: ruleLocalPlacement returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? otherlv_4= 'Axis2Placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) otherlv_6= '}' ) ;
    public final EObject ruleLocalPlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_relativeTo_3_0 = null;

        EObject lv_axis2placement3d_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:635:28: ( ( () otherlv_1= '{' (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? otherlv_4= 'Axis2Placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) otherlv_6= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:636:1: ( () otherlv_1= '{' (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? otherlv_4= 'Axis2Placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) otherlv_6= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:636:1: ( () otherlv_1= '{' (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? otherlv_4= 'Axis2Placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) otherlv_6= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:636:2: () otherlv_1= '{' (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? otherlv_4= 'Axis2Placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) otherlv_6= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:636:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:637:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleLocalPlacement1241); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:646:1: (otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:646:3: otherlv_2= 'RelativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) )
                    {
                    otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocalPlacement1254); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:650:1: ( (lv_relativeTo_3_0= ruleLocalPlacement ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:651:1: (lv_relativeTo_3_0= ruleLocalPlacement )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:651:1: (lv_relativeTo_3_0= ruleLocalPlacement )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:652:3: lv_relativeTo_3_0= ruleLocalPlacement
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement1275);
                    lv_relativeTo_3_0=ruleLocalPlacement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
                    	        }
                           		set(
                           			current, 
                           			"relativeTo",
                            		lv_relativeTo_3_0, 
                            		"LocalPlacement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocalPlacement1289); 

                	newLeafNode(otherlv_4, grammarAccess.getLocalPlacementAccess().getAxis2Placement3dKeyword_3());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:672:1: ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:673:1: (lv_axis2placement3d_5_0= ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:673:1: (lv_axis2placement3d_5_0= ruleAxis2Placement3D )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:674:3: lv_axis2placement3d_5_0= ruleAxis2Placement3D
            {
             
            	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1310);
            lv_axis2placement3d_5_0=ruleAxis2Placement3D();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
            	        }
                   		set(
                   			current, 
                   			"axis2placement3d",
                    		lv_axis2placement3d_5_0, 
                    		"Axis2Placement3D");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocalPlacement1322); 

                	newLeafNode(otherlv_6, grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalPlacement"


    // $ANTLR start "entryRuleAxis2Placement3D"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:702:1: entryRuleAxis2Placement3D returns [EObject current=null] : iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF ;
    public final EObject entryRuleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis2Placement3D = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:703:2: (iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:704:2: iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF
            {
             newCompositeNode(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1358);
            iv_ruleAxis2Placement3D=ruleAxis2Placement3D();

            state._fsp--;

             current =iv_ruleAxis2Placement3D; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D1368); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxis2Placement3D"


    // $ANTLR start "ruleAxis2Placement3D"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:711:1: ruleAxis2Placement3D returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'Cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'Axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'RefDirection' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' ) ;
    public final EObject ruleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_cartesianX_3_0 = null;

        AntlrDatatypeRuleToken lv_cartesianY_5_0 = null;

        AntlrDatatypeRuleToken lv_cartesianZ_7_0 = null;

        EObject lv_axis_10_0 = null;

        EObject lv_refDirection_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:714:28: ( (otherlv_0= '{' otherlv_1= 'Cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'Axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'RefDirection' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:715:1: (otherlv_0= '{' otherlv_1= 'Cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'Axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'RefDirection' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:715:1: (otherlv_0= '{' otherlv_1= 'Cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'Axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'RefDirection' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:715:3: otherlv_0= '{' otherlv_1= 'Cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'Axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'RefDirection' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAxis2Placement3D1405); 

                	newLeafNode(otherlv_0, grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAxis2Placement3D1417); 

                	newLeafNode(otherlv_1, grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1());
                
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAxis2Placement3D1429); 

                	newLeafNode(otherlv_2, grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:727:1: ( (lv_cartesianX_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:728:1: (lv_cartesianX_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:728:1: (lv_cartesianX_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:729:3: lv_cartesianX_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1450);
            lv_cartesianX_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianX",
                    		lv_cartesianX_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAxis2Placement3D1462); 

                	newLeafNode(otherlv_4, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:749:1: ( (lv_cartesianY_5_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:750:1: (lv_cartesianY_5_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:750:1: (lv_cartesianY_5_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:751:3: lv_cartesianY_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1483);
            lv_cartesianY_5_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianY",
                    		lv_cartesianY_5_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAxis2Placement3D1495); 

                	newLeafNode(otherlv_6, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:771:1: ( (lv_cartesianZ_7_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:772:1: (lv_cartesianZ_7_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:772:1: (lv_cartesianZ_7_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:773:3: lv_cartesianZ_7_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1516);
            lv_cartesianZ_7_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianZ",
                    		lv_cartesianZ_7_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAxis2Placement3D1528); 

                	newLeafNode(otherlv_8, grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8());
                
            otherlv_9=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAxis2Placement3D1540); 

                	newLeafNode(otherlv_9, grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:797:1: ( (lv_axis_10_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:798:1: (lv_axis_10_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:798:1: (lv_axis_10_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:799:3: lv_axis_10_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D1561);
            lv_axis_10_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_10_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAxis2Placement3D1573); 

                	newLeafNode(otherlv_11, grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_11());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:819:1: ( (lv_refDirection_12_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:820:1: (lv_refDirection_12_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:820:1: (lv_refDirection_12_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:821:3: lv_refDirection_12_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D1594);
            lv_refDirection_12_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"refDirection",
                    		lv_refDirection_12_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAxis2Placement3D1606); 

                	newLeafNode(otherlv_13, grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxis2Placement3D"


    // $ANTLR start "entryRuleEDouble"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:849:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:850:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:851:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1643);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:858:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:861:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:862:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:862:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:862:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:862:2: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:863:2: kw= '-'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDouble1693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:868:3: (this_INT_1= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:868:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1711); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble1731); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1746); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:888:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=33 && LA18_0<=34)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:888:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:888:2: (kw= 'E' | kw= 'e' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==33) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==34) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:889:2: kw= 'E'
                            {
                            kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEDouble1766); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:896:2: kw= 'e'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble1785); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:901:2: (kw= '-' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:902:2: kw= '-'
                            {
                            kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleEDouble1800); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1817); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleDirection"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:922:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:923:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:924:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection1864);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection1874); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:931:1: ruleDirection returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:934:28: ( (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:935:1: (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:935:1: (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:935:3: otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDirection1911); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:939:1: ( (lv_x_1_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:940:1: (lv_x_1_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:940:1: (lv_x_1_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:941:3: lv_x_1_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1932);
            lv_x_1_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"x",
                    		lv_x_1_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDirection1944); 

                	newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getCommaKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:961:1: ( (lv_y_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:962:1: (lv_y_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:962:1: (lv_y_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:963:3: lv_y_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1965);
            lv_y_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:979:2: (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:979:4: otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDirection1978); 

                        	newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getCommaKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:983:1: ( (lv_z_5_0= ruleEDouble ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:984:1: (lv_z_5_0= ruleEDouble )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:984:1: (lv_z_5_0= ruleEDouble )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:985:3: lv_z_5_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1999);
                    lv_z_5_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDirectionRule());
                    	        }
                           		set(
                           			current, 
                           			"z",
                            		lv_z_5_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDirection2013); 

                	newLeafNode(otherlv_6, grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleWallRule_in_ruleModel152 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleModel165 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleWallRule_in_ruleModel186 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_13_in_ruleModel200 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleOpening_in_ruleModel221 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_12_in_ruleModel234 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleOpening_in_ruleModel255 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_14_in_ruleModel269 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleModel290 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleModel303 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleModel324 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_entryRuleWallRule485 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRule495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleWallRule532 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleWallRule549 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_ruleWallRule567 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRule588 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleWallRule603 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRule624 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWallRule638 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleWallRule659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening695 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleOpening742 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpening759 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_ruleOpening777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening798 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleOpening813 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening834 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOpening848 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleOpening869 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_11_in_ruleOpening882 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpening902 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleOpening915 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOpening935 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment975 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleFlowSegment1022 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFlowSegment1039 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_ruleFlowSegment1057 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1078 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFlowSegment1093 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1114 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFlowSegment1128 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleLocalPlacement1241 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_23_in_ruleLocalPlacement1254 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement1275 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocalPlacement1289 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1310 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleLocalPlacement1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1358 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAxis2Placement3D1405 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAxis2Placement3D1417 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAxis2Placement3D1429 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1450 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAxis2Placement3D1462 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1483 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAxis2Placement3D1495 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1516 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAxis2Placement3D1528 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAxis2Placement3D1540 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D1561 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAxis2Placement3D1573 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D1594 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAxis2Placement3D1606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleEDouble1693 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1711 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleEDouble1731 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1746 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_33_in_ruleEDouble1766 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_34_in_ruleEDouble1785 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_31_in_ruleEDouble1800 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection1864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection1874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDirection1911 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1932 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDirection1944 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1965 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_20_in_ruleDirection1978 = new BitSet(new long[]{0x0000000180000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1999 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleDirection2013 = new BitSet(new long[]{0x0000000000000002L});
    }


}