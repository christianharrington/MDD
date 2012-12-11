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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Walls'", "'and'", "'Openings'", "'Pipes'", "'Wall'", "'Name'", "'Description'", "'placement'", "'Opening'", "'walls'", "','", "'Pipe'", "'{'", "'relativeTo'", "'axis2placement3d'", "'}'", "'cartesian'", "'('", "')'", "'axis'", "'refDir'", "'-'", "'.'", "'E'", "'e'"
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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:235:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:238:28: (this_STRING_0= RULE_STRING )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:239:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString413); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:254:1: entryRuleWallRule returns [EObject current=null] : iv_ruleWallRule= ruleWallRule EOF ;
    public final EObject entryRuleWallRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallRule = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:255:2: (iv_ruleWallRule= ruleWallRule EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:256:2: iv_ruleWallRule= ruleWallRule EOF
            {
             newCompositeNode(grammarAccess.getWallRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRule_in_entryRuleWallRule457);
            iv_ruleWallRule=ruleWallRule();

            state._fsp--;

             current =iv_ruleWallRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRule467); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:263:1: ruleWallRule returns [EObject current=null] : (otherlv_0= 'Wall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) ;
    public final EObject ruleWallRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:266:28: ( (otherlv_0= 'Wall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:267:1: (otherlv_0= 'Wall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:267:1: (otherlv_0= 'Wall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:267:3: otherlv_0= 'Wall' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) )
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWallRule504); 

                	newLeafNode(otherlv_0, grammarAccess.getWallRuleAccess().getWallKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:271:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:272:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:272:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:273:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWallRuleAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRule525);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWallRuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWallRule537); 

                	newLeafNode(otherlv_2, grammarAccess.getWallRuleAccess().getNameKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:293:1: ( (lv_elementName_3_0= ruleEString ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:294:1: (lv_elementName_3_0= ruleEString )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:294:1: (lv_elementName_3_0= ruleEString )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:295:3: lv_elementName_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRule558);
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

            otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWallRule570); 

                	newLeafNode(otherlv_4, grammarAccess.getWallRuleAccess().getDescriptionKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:315:1: ( (lv_description_5_0= ruleEString ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:316:1: (lv_description_5_0= ruleEString )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:316:1: (lv_description_5_0= ruleEString )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:317:3: lv_description_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRule591);
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

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWallRule603); 

                	newLeafNode(otherlv_6, grammarAccess.getWallRuleAccess().getPlacementKeyword_6());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:337:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:338:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:338:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:339:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleWallRule624);
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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:363:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:364:2: (iv_ruleOpening= ruleOpening EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:365:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening660);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening670); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:372:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) otherlv_8= 'walls' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:375:28: ( (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) otherlv_8= 'walls' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:376:1: (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) otherlv_8= 'walls' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:376:1: (otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) otherlv_8= 'walls' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )* )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:376:3: otherlv_0= 'Opening' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) otherlv_8= 'walls' ( (otherlv_9= RULE_STRING ) ) (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpening707); 

                	newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:380:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:381:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:381:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:382:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening728);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpeningRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:398:2: (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:398:4: otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpening741); 

                        	newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:402:1: ( (lv_elementName_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:403:1: (lv_elementName_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:403:1: (lv_elementName_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:404:3: lv_elementName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening762);
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

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:420:4: (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:420:6: otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpening777); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:424:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:425:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:425:1: (lv_description_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:426:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening798);
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

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpening812); 

                	newLeafNode(otherlv_6, grammarAccess.getOpeningAccess().getPlacementKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:446:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:447:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:447:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:448:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleOpening833);
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

            otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOpening845); 

                	newLeafNode(otherlv_8, grammarAccess.getOpeningAccess().getWallsKeyword_6());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:468:1: ( (otherlv_9= RULE_STRING ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:469:1: (otherlv_9= RULE_STRING )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:469:1: (otherlv_9= RULE_STRING )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:470:3: otherlv_9= RULE_STRING
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOpeningRule());
            	        }
                    
            otherlv_9=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOpening865); 

            		newLeafNode(otherlv_9, grammarAccess.getOpeningAccess().getWallsWallCrossReference_7_0()); 
            	

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:481:2: (otherlv_10= ',' ( (otherlv_11= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:481:4: otherlv_10= ',' ( (otherlv_11= RULE_STRING ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOpening878); 

            	        	newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getCommaKeyword_8_0());
            	        
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:485:1: ( (otherlv_11= RULE_STRING ) )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:486:1: (otherlv_11= RULE_STRING )
            	    {
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:486:1: (otherlv_11= RULE_STRING )
            	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:487:3: otherlv_11= RULE_STRING
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOpeningRule());
            	    	        }
            	            
            	    otherlv_11=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleOpening898); 

            	    		newLeafNode(otherlv_11, grammarAccess.getOpeningAccess().getWallsWallCrossReference_8_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleOpening"


    // $ANTLR start "entryRuleFlowSegment"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:506:1: entryRuleFlowSegment returns [EObject current=null] : iv_ruleFlowSegment= ruleFlowSegment EOF ;
    public final EObject entryRuleFlowSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSegment = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:507:2: (iv_ruleFlowSegment= ruleFlowSegment EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:508:2: iv_ruleFlowSegment= ruleFlowSegment EOF
            {
             newCompositeNode(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment936);
            iv_ruleFlowSegment=ruleFlowSegment();

            state._fsp--;

             current =iv_ruleFlowSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment946); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:515:1: ruleFlowSegment returns [EObject current=null] : (otherlv_0= 'Pipe' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) ;
    public final EObject ruleFlowSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_elementName_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_placement_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:518:28: ( (otherlv_0= 'Pipe' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:519:1: (otherlv_0= 'Pipe' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:519:1: (otherlv_0= 'Pipe' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:519:3: otherlv_0= 'Pipe' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )? (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )? otherlv_6= 'placement' ( (lv_placement_7_0= ruleLocalPlacement ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFlowSegment983); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowSegmentAccess().getPipeKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:523:1: ( (lv_name_1_0= ruleEString ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:524:1: (lv_name_1_0= ruleEString )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:524:1: (lv_name_1_0= ruleEString )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:525:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1004);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:541:2: (otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:541:4: otherlv_2= 'Name' ( (lv_elementName_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFlowSegment1017); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:545:1: ( (lv_elementName_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:546:1: (lv_elementName_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:546:1: (lv_elementName_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:547:3: lv_elementName_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1038);
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

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:563:4: (otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:563:6: otherlv_4= 'Description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlowSegment1053); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:567:1: ( (lv_description_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:568:1: (lv_description_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:568:1: (lv_description_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:569:3: lv_description_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1074);
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

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFlowSegment1088); 

                	newLeafNode(otherlv_6, grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:589:1: ( (lv_placement_7_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:590:1: (lv_placement_7_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:590:1: (lv_placement_7_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:591:3: lv_placement_7_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1109);
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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:615:1: entryRuleLocalPlacement returns [EObject current=null] : iv_ruleLocalPlacement= ruleLocalPlacement EOF ;
    public final EObject entryRuleLocalPlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPlacement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:616:2: (iv_ruleLocalPlacement= ruleLocalPlacement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:617:2: iv_ruleLocalPlacement= ruleLocalPlacement EOF
            {
             newCompositeNode(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1145);
            iv_ruleLocalPlacement=ruleLocalPlacement();

            state._fsp--;

             current =iv_ruleLocalPlacement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement1155); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:624:1: ruleLocalPlacement returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )? otherlv_6= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:627:28: ( ( () otherlv_1= '{' (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )? otherlv_6= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:628:1: ( () otherlv_1= '{' (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )? otherlv_6= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:628:1: ( () otherlv_1= '{' (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )? otherlv_6= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:628:2: () otherlv_1= '{' (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )? (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )? otherlv_6= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:628:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLocalPlacement1201); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:638:1: (otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:638:3: otherlv_2= 'relativeTo' ( (lv_relativeTo_3_0= ruleLocalPlacement ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocalPlacement1214); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:642:1: ( (lv_relativeTo_3_0= ruleLocalPlacement ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:643:1: (lv_relativeTo_3_0= ruleLocalPlacement )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:643:1: (lv_relativeTo_3_0= ruleLocalPlacement )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:644:3: lv_relativeTo_3_0= ruleLocalPlacement
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement1235);
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

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:660:4: (otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:660:6: otherlv_4= 'axis2placement3d' ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) )
                    {
                    otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocalPlacement1250); 

                        	newLeafNode(otherlv_4, grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:664:1: ( (lv_axis2placement3d_5_0= ruleAxis2Placement3D ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:665:1: (lv_axis2placement3d_5_0= ruleAxis2Placement3D )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:665:1: (lv_axis2placement3d_5_0= ruleAxis2Placement3D )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:666:3: lv_axis2placement3d_5_0= ruleAxis2Placement3D
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1271);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalPlacement1285); 

                	newLeafNode(otherlv_6, grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:694:1: entryRuleAxis2Placement3D returns [EObject current=null] : iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF ;
    public final EObject entryRuleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis2Placement3D = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:695:2: (iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:696:2: iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF
            {
             newCompositeNode(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1321);
            iv_ruleAxis2Placement3D=ruleAxis2Placement3D();

            state._fsp--;

             current =iv_ruleAxis2Placement3D; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D1331); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:703:1: ruleAxis2Placement3D returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'refDir' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:706:28: ( (otherlv_0= '{' otherlv_1= 'cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'refDir' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:707:1: (otherlv_0= '{' otherlv_1= 'cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'refDir' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:707:1: (otherlv_0= '{' otherlv_1= 'cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'refDir' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:707:3: otherlv_0= '{' otherlv_1= 'cartesian' otherlv_2= '(' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= ',' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= ',' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= ')' otherlv_9= 'axis' ( (lv_axis_10_0= ruleDirection ) ) otherlv_11= 'refDir' ( (lv_refDirection_12_0= ruleDirection ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAxis2Placement3D1368); 

                	newLeafNode(otherlv_0, grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0());
                
            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAxis2Placement3D1380); 

                	newLeafNode(otherlv_1, grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1());
                
            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAxis2Placement3D1392); 

                	newLeafNode(otherlv_2, grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:719:1: ( (lv_cartesianX_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:720:1: (lv_cartesianX_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:720:1: (lv_cartesianX_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:721:3: lv_cartesianX_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1413);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxis2Placement3D1425); 

                	newLeafNode(otherlv_4, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:741:1: ( (lv_cartesianY_5_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:742:1: (lv_cartesianY_5_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:742:1: (lv_cartesianY_5_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:743:3: lv_cartesianY_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1446);
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

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAxis2Placement3D1458); 

                	newLeafNode(otherlv_6, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:763:1: ( (lv_cartesianZ_7_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:764:1: (lv_cartesianZ_7_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:764:1: (lv_cartesianZ_7_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:765:3: lv_cartesianZ_7_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1479);
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

            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAxis2Placement3D1491); 

                	newLeafNode(otherlv_8, grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8());
                
            otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAxis2Placement3D1503); 

                	newLeafNode(otherlv_9, grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:789:1: ( (lv_axis_10_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:790:1: (lv_axis_10_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:790:1: (lv_axis_10_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:791:3: lv_axis_10_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D1524);
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

            otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAxis2Placement3D1536); 

                	newLeafNode(otherlv_11, grammarAccess.getAxis2Placement3DAccess().getRefDirKeyword_11());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:811:1: ( (lv_refDirection_12_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:812:1: (lv_refDirection_12_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:812:1: (lv_refDirection_12_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:813:3: lv_refDirection_12_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D1557);
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

            otherlv_13=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAxis2Placement3D1569); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:841:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:842:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:843:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble1606);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble1617); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:850:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:853:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:854:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:854:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:854:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:854:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:855:2: kw= '-'
                    {
                    kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble1656); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:860:3: (this_INT_1= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:860:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1674); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEDouble1694); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1709); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:880:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=34 && LA15_0<=35)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:880:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:880:2: (kw= 'E' | kw= 'e' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==34) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==35) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:881:2: kw= 'E'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble1729); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:888:2: kw= 'e'
                            {
                            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDouble1748); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:893:2: (kw= '-' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==32) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:894:2: kw= '-'
                            {
                            kw=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleEDouble1763); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble1780); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:914:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:915:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:916:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection1827);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection1837); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:923:1: ruleDirection returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:926:28: ( (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:927:1: (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:927:1: (otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:927:3: otherlv_0= '(' ( (lv_x_1_0= ruleEDouble ) ) otherlv_2= ',' ( (lv_y_3_0= ruleEDouble ) ) (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDirection1874); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:931:1: ( (lv_x_1_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:932:1: (lv_x_1_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:932:1: (lv_x_1_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:933:3: lv_x_1_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1895);
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

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDirection1907); 

                	newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getCommaKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:953:1: ( (lv_y_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:954:1: (lv_y_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:954:1: (lv_y_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:955:3: lv_y_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1928);
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

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:971:2: (otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:971:4: otherlv_4= ',' ( (lv_z_5_0= ruleEDouble ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleDirection1941); 

                        	newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getCommaKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:975:1: ( (lv_z_5_0= ruleEDouble ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:976:1: (lv_z_5_0= ruleEDouble )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:976:1: (lv_z_5_0= ruleEDouble )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:977:3: lv_z_5_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection1962);
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

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDirection1976); 

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
        public static final BitSet FOLLOW_14_in_ruleModel269 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleModel290 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleModel303 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleModel324 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRule_in_entryRuleWallRule457 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRule467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleWallRule504 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRule525 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWallRule537 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRule558 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleWallRule570 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRule591 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWallRule603 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleWallRule624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleOpening707 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening728 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_ruleOpening741 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening762 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleOpening777 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening798 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleOpening812 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleOpening833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleOpening845 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOpening865 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleOpening878 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleOpening898 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment936 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFlowSegment983 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1004 = new BitSet(new long[]{0x0000000000070000L});
        public static final BitSet FOLLOW_16_in_ruleFlowSegment1017 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1038 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleFlowSegment1053 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1074 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleFlowSegment1088 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1145 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement1155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleLocalPlacement1201 = new BitSet(new long[]{0x0000000007000000L});
        public static final BitSet FOLLOW_24_in_ruleLocalPlacement1214 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement1235 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_25_in_ruleLocalPlacement1250 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1271 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLocalPlacement1285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleAxis2Placement3D1368 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAxis2Placement3D1380 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleAxis2Placement3D1392 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1413 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxis2Placement3D1425 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1446 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAxis2Placement3D1458 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1479 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAxis2Placement3D1491 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAxis2Placement3D1503 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D1524 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleAxis2Placement3D1536 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D1557 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAxis2Placement3D1569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble1606 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble1617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleEDouble1656 = new BitSet(new long[]{0x0000000200000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1674 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleEDouble1694 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1709 = new BitSet(new long[]{0x0000000C00000002L});
        public static final BitSet FOLLOW_34_in_ruleEDouble1729 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_35_in_ruleEDouble1748 = new BitSet(new long[]{0x0000000100000020L});
        public static final BitSet FOLLOW_32_in_ruleEDouble1763 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection1827 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection1837 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDirection1874 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1895 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleDirection1907 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1928 = new BitSet(new long[]{0x0000000020200000L});
        public static final BitSet FOLLOW_21_in_ruleDirection1941 = new BitSet(new long[]{0x0000000300000020L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection1962 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDirection1976 = new BitSet(new long[]{0x0000000000000002L});
    }


}