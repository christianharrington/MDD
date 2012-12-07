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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'elements'", "','", "'}'", "'GUIDElement'", "'GUID'", "'Name'", "'Description'", "'Wall'", "'placement'", "'Opening'", "'walls'", "'FlowSegment'", "'LocalPlacement'", "'relativeTo'", "'axis2placement3d'", "'Axis2Placement3D'", "'cartesianX'", "'cartesianY'", "'cartesianZ'", "'axis'", "'refDirection'", "'-'", "'.'", "'E'", "'e'", "'Direction'", "'x'", "'y'", "'z'"
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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:79:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:80:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:94:1: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:94:3: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getElementsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:102:1: ( (lv_elements_5_0= ruleGUIDElement ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:103:1: (lv_elements_5_0= ruleGUIDElement )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:103:1: (lv_elements_5_0= ruleGUIDElement )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:104:3: lv_elements_5_0= ruleGUIDElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_ruleModel189);
                    lv_elements_5_0=ruleGUIDElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_5_0, 
                            		"GUIDElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:120:2: (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:120:4: otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:124:1: ( (lv_elements_7_0= ruleGUIDElement ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:125:1: (lv_elements_7_0= ruleGUIDElement )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:125:1: (lv_elements_7_0= ruleGUIDElement )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:126:3: lv_elements_7_0= ruleGUIDElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsGUIDElementParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_ruleModel223);
                    	    lv_elements_7_0=ruleGUIDElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_7_0, 
                    	            		"GUIDElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel237); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleModel251); 

                	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleGUIDElement"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:158:1: entryRuleGUIDElement returns [EObject current=null] : iv_ruleGUIDElement= ruleGUIDElement EOF ;
    public final EObject entryRuleGUIDElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIDElement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:159:2: (iv_ruleGUIDElement= ruleGUIDElement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:160:2: iv_ruleGUIDElement= ruleGUIDElement EOF
            {
             newCompositeNode(grammarAccess.getGUIDElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_in_entryRuleGUIDElement287);
            iv_ruleGUIDElement=ruleGUIDElement();

            state._fsp--;

             current =iv_ruleGUIDElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGUIDElement297); 

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
    // $ANTLR end "entryRuleGUIDElement"


    // $ANTLR start "ruleGUIDElement"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:167:1: ruleGUIDElement returns [EObject current=null] : (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_FlowSegment_3= ruleFlowSegment ) ;
    public final EObject ruleGUIDElement() throws RecognitionException {
        EObject current = null;

        EObject this_GUIDElement_Impl_0 = null;

        EObject this_Wall_1 = null;

        EObject this_Opening_2 = null;

        EObject this_FlowSegment_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:170:28: ( (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_FlowSegment_3= ruleFlowSegment ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:171:1: (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_FlowSegment_3= ruleFlowSegment )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:171:1: (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_FlowSegment_3= ruleFlowSegment )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:172:5: this_GUIDElement_Impl_0= ruleGUIDElement_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getGUIDElement_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_ruleGUIDElement344);
                    this_GUIDElement_Impl_0=ruleGUIDElement_Impl();

                    state._fsp--;

                     
                            current = this_GUIDElement_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:182:5: this_Wall_1= ruleWall
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getWallParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWall_in_ruleGUIDElement371);
                    this_Wall_1=ruleWall();

                    state._fsp--;

                     
                            current = this_Wall_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:192:5: this_Opening_2= ruleOpening
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getOpeningParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpening_in_ruleGUIDElement398);
                    this_Opening_2=ruleOpening();

                    state._fsp--;

                     
                            current = this_Opening_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:202:5: this_FlowSegment_3= ruleFlowSegment
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_ruleGUIDElement425);
                    this_FlowSegment_3=ruleFlowSegment();

                    state._fsp--;

                     
                            current = this_FlowSegment_3; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleGUIDElement"


    // $ANTLR start "entryRuleGUIDElement_Impl"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:218:1: entryRuleGUIDElement_Impl returns [EObject current=null] : iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF ;
    public final EObject entryRuleGUIDElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIDElement_Impl = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:219:2: (iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:220:2: iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getGUIDElement_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl460);
            iv_ruleGUIDElement_Impl=ruleGUIDElement_Impl();

            state._fsp--;

             current =iv_ruleGUIDElement_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGUIDElement_Impl470); 

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
    // $ANTLR end "entryRuleGUIDElement_Impl"


    // $ANTLR start "ruleGUIDElement_Impl"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:227:1: ruleGUIDElement_Impl returns [EObject current=null] : ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleGUIDElement_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_GUID_4_0 = null;

        AntlrDatatypeRuleToken lv_Name_6_0 = null;

        AntlrDatatypeRuleToken lv_Description_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:230:28: ( ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:231:1: ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:231:1: ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:231:2: () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:231:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:232:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGUIDElement_ImplAccess().getGUIDElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGUIDElement_Impl516); 

                	newLeafNode(otherlv_1, grammarAccess.getGUIDElement_ImplAccess().getGUIDElementKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGUIDElement_Impl528); 

                	newLeafNode(otherlv_2, grammarAccess.getGUIDElement_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:245:1: (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:245:3: otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGUIDElement_Impl541); 

                        	newLeafNode(otherlv_3, grammarAccess.getGUIDElement_ImplAccess().getGUIDKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:249:1: ( (lv_GUID_4_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:250:1: (lv_GUID_4_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:250:1: (lv_GUID_4_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:251:3: lv_GUID_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getGUIDEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl562);
                    lv_GUID_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGUIDElement_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"GUID",
                            		lv_GUID_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:267:4: (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:267:6: otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGUIDElement_Impl577); 

                        	newLeafNode(otherlv_5, grammarAccess.getGUIDElement_ImplAccess().getNameKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:271:1: ( (lv_Name_6_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:272:1: (lv_Name_6_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:272:1: (lv_Name_6_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:273:3: lv_Name_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl598);
                    lv_Name_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGUIDElement_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:289:4: (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:289:6: otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGUIDElement_Impl613); 

                        	newLeafNode(otherlv_7, grammarAccess.getGUIDElement_ImplAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:293:1: ( (lv_Description_8_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:294:1: (lv_Description_8_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:294:1: (lv_Description_8_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:295:3: lv_Description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl634);
                    lv_Description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGUIDElement_ImplRule());
                    	        }
                           		set(
                           			current, 
                           			"Description",
                            		lv_Description_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGUIDElement_Impl648); 

                	newLeafNode(otherlv_9, grammarAccess.getGUIDElement_ImplAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleGUIDElement_Impl"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:323:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:324:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:325:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString685);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString696); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:332:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:335:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:336:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:336:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:336:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString736); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:344:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString762); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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


    // $ANTLR start "entryRuleWall"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:359:1: entryRuleWall returns [EObject current=null] : iv_ruleWall= ruleWall EOF ;
    public final EObject entryRuleWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWall = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:360:2: (iv_ruleWall= ruleWall EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:361:2: iv_ruleWall= ruleWall EOF
            {
             newCompositeNode(grammarAccess.getWallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_entryRuleWall807);
            iv_ruleWall=ruleWall();

            state._fsp--;

             current =iv_ruleWall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWall817); 

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
    // $ANTLR end "entryRuleWall"


    // $ANTLR start "ruleWall"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:368:1: ruleWall returns [EObject current=null] : (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) ;
    public final EObject ruleWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_GUID_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        AntlrDatatypeRuleToken lv_Description_7_0 = null;

        EObject lv_placement_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:371:28: ( (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:372:1: (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:372:1: (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:372:3: otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleWall854); 

                	newLeafNode(otherlv_0, grammarAccess.getWallAccess().getWallKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWall866); 

                	newLeafNode(otherlv_1, grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:380:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:380:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWall879); 

                        	newLeafNode(otherlv_2, grammarAccess.getWallAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:384:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:385:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:385:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:386:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall900);
                    lv_GUID_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRule());
                    	        }
                           		set(
                           			current, 
                           			"GUID",
                            		lv_GUID_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:402:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:402:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWall915); 

                        	newLeafNode(otherlv_4, grammarAccess.getWallAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:406:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:407:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:407:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:408:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall936);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:424:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:424:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWall951); 

                        	newLeafNode(otherlv_6, grammarAccess.getWallAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:428:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:429:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:429:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:430:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall972);
                    lv_Description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRule());
                    	        }
                           		set(
                           			current, 
                           			"Description",
                            		lv_Description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWall986); 

                	newLeafNode(otherlv_8, grammarAccess.getWallAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:450:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:451:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:451:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:452:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getWallAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleWall1007);
            lv_placement_9_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWallRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_9_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWall1019); 

                	newLeafNode(otherlv_10, grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleWall"


    // $ANTLR start "entryRuleOpening"
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:480:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:481:2: (iv_ruleOpening= ruleOpening EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:482:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening1055);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening1065); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:489:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOpening() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_GUID_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        AntlrDatatypeRuleToken lv_Description_7_0 = null;

        EObject lv_placement_9_0 = null;

        EObject lv_walls_12_0 = null;

        EObject lv_walls_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:492:28: ( (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:493:1: (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:493:1: (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:493:3: otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleOpening1102); 

                	newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpening1114); 

                	newLeafNode(otherlv_1, grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:501:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:501:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpening1127); 

                        	newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:505:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:506:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:506:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:507:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1148);
                    lv_GUID_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		set(
                           			current, 
                           			"GUID",
                            		lv_GUID_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:523:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:523:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpening1163); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpeningAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:527:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:528:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:528:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:529:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1184);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:545:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:545:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpening1199); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpeningAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:549:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:550:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:550:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:551:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1220);
                    lv_Description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		set(
                           			current, 
                           			"Description",
                            		lv_Description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOpening1234); 

                	newLeafNode(otherlv_8, grammarAccess.getOpeningAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:571:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:572:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:572:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:573:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleOpening1255);
            lv_placement_9_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpeningRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_9_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:589:2: (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:589:4: otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWall ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOpening1268); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getWallsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpening1280); 

                        	newLeafNode(otherlv_11, grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:597:1: ( (lv_walls_12_0= ruleWall ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:598:1: (lv_walls_12_0= ruleWall )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:598:1: (lv_walls_12_0= ruleWall )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:599:3: lv_walls_12_0= ruleWall
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWall_in_ruleOpening1301);
                    lv_walls_12_0=ruleWall();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		add(
                           			current, 
                           			"walls",
                            		lv_walls_12_0, 
                            		"Wall");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:615:2: (otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:615:4: otherlv_13= ',' ( (lv_walls_14_0= ruleWall ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpening1314); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getOpeningAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:619:1: ( (lv_walls_14_0= ruleWall ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:620:1: (lv_walls_14_0= ruleWall )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:620:1: (lv_walls_14_0= ruleWall )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:621:3: lv_walls_14_0= ruleWall
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpeningAccess().getWallsWallParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWall_in_ruleOpening1335);
                    	    lv_walls_14_0=ruleWall();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"walls",
                    	            		lv_walls_14_0, 
                    	            		"Wall");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpening1349); 

                        	newLeafNode(otherlv_15, grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpening1363); 

                	newLeafNode(otherlv_16, grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:653:1: entryRuleFlowSegment returns [EObject current=null] : iv_ruleFlowSegment= ruleFlowSegment EOF ;
    public final EObject entryRuleFlowSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSegment = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:654:2: (iv_ruleFlowSegment= ruleFlowSegment EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:655:2: iv_ruleFlowSegment= ruleFlowSegment EOF
            {
             newCompositeNode(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment1399);
            iv_ruleFlowSegment=ruleFlowSegment();

            state._fsp--;

             current =iv_ruleFlowSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment1409); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:662:1: ruleFlowSegment returns [EObject current=null] : (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) ;
    public final EObject ruleFlowSegment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_GUID_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        AntlrDatatypeRuleToken lv_Description_7_0 = null;

        EObject lv_placement_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:665:28: ( (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:666:1: (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:666:1: (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:666:3: otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFlowSegment1446); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowSegmentAccess().getFlowSegmentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlowSegment1458); 

                	newLeafNode(otherlv_1, grammarAccess.getFlowSegmentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:674:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:674:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlowSegment1471); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlowSegmentAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:678:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:679:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:679:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:680:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1492);
                    lv_GUID_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"GUID",
                            		lv_GUID_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:696:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:696:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFlowSegment1507); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlowSegmentAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:700:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:701:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:701:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:702:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1528);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"Name",
                            		lv_Name_5_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:718:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:718:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFlowSegment1543); 

                        	newLeafNode(otherlv_6, grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:722:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:723:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:723:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:724:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1564);
                    lv_Description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
                    	        }
                           		set(
                           			current, 
                           			"Description",
                            		lv_Description_7_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFlowSegment1578); 

                	newLeafNode(otherlv_8, grammarAccess.getFlowSegmentAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:744:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:745:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:745:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:746:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1599);
            lv_placement_9_0=ruleLocalPlacement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
            	        }
                   		set(
                   			current, 
                   			"placement",
                    		lv_placement_9_0, 
                    		"LocalPlacement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlowSegment1611); 

                	newLeafNode(otherlv_10, grammarAccess.getFlowSegmentAccess().getRightCurlyBracketKeyword_7());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:774:1: entryRuleLocalPlacement returns [EObject current=null] : iv_ruleLocalPlacement= ruleLocalPlacement EOF ;
    public final EObject entryRuleLocalPlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPlacement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:775:2: (iv_ruleLocalPlacement= ruleLocalPlacement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:776:2: iv_ruleLocalPlacement= ruleLocalPlacement EOF
            {
             newCompositeNode(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1647);
            iv_ruleLocalPlacement=ruleLocalPlacement();

            state._fsp--;

             current =iv_ruleLocalPlacement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement1657); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:783:1: ruleLocalPlacement returns [EObject current=null] : ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )? (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLocalPlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_axis2placement3d_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:786:28: ( ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )? (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:787:1: ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )? (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:787:1: ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )? (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )? otherlv_7= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:787:2: () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )? (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:787:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:788:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleLocalPlacement1703); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalPlacementAccess().getLocalPlacementKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLocalPlacement1715); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:801:1: (otherlv_3= 'relativeTo' ( ( ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:801:3: otherlv_3= 'relativeTo' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLocalPlacement1728); 

                        	newLeafNode(otherlv_3, grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:805:1: ( ( ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:806:1: ( ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:806:1: ( ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:807:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getLocalPlacementRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLocalPlacement1751);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:820:4: (otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:820:6: otherlv_5= 'axis2placement3d' ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) )
                    {
                    otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLocalPlacement1766); 

                        	newLeafNode(otherlv_5, grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:824:1: ( (lv_axis2placement3d_6_0= ruleAxis2Placement3D ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:825:1: (lv_axis2placement3d_6_0= ruleAxis2Placement3D )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:825:1: (lv_axis2placement3d_6_0= ruleAxis2Placement3D )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:826:3: lv_axis2placement3d_6_0= ruleAxis2Placement3D
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1787);
                    lv_axis2placement3d_6_0=ruleAxis2Placement3D();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
                    	        }
                           		set(
                           			current, 
                           			"axis2placement3d",
                            		lv_axis2placement3d_6_0, 
                            		"Axis2Placement3D");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLocalPlacement1801); 

                	newLeafNode(otherlv_7, grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:854:1: entryRuleAxis2Placement3D returns [EObject current=null] : iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF ;
    public final EObject entryRuleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis2Placement3D = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:855:2: (iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:856:2: iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF
            {
             newCompositeNode(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1837);
            iv_ruleAxis2Placement3D=ruleAxis2Placement3D();

            state._fsp--;

             current =iv_ruleAxis2Placement3D; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D1847); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:863:1: ruleAxis2Placement3D returns [EObject current=null] : (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' otherlv_2= 'cartesianX' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= 'cartesianY' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= 'cartesianZ' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= 'axis' ( (lv_axis_9_0= ruleDirection ) ) otherlv_10= 'refDirection' ( (lv_refDirection_11_0= ruleDirection ) ) otherlv_12= '}' ) ;
    public final EObject ruleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_cartesianX_3_0 = null;

        AntlrDatatypeRuleToken lv_cartesianY_5_0 = null;

        AntlrDatatypeRuleToken lv_cartesianZ_7_0 = null;

        EObject lv_axis_9_0 = null;

        EObject lv_refDirection_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:866:28: ( (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' otherlv_2= 'cartesianX' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= 'cartesianY' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= 'cartesianZ' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= 'axis' ( (lv_axis_9_0= ruleDirection ) ) otherlv_10= 'refDirection' ( (lv_refDirection_11_0= ruleDirection ) ) otherlv_12= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:867:1: (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' otherlv_2= 'cartesianX' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= 'cartesianY' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= 'cartesianZ' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= 'axis' ( (lv_axis_9_0= ruleDirection ) ) otherlv_10= 'refDirection' ( (lv_refDirection_11_0= ruleDirection ) ) otherlv_12= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:867:1: (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' otherlv_2= 'cartesianX' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= 'cartesianY' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= 'cartesianZ' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= 'axis' ( (lv_axis_9_0= ruleDirection ) ) otherlv_10= 'refDirection' ( (lv_refDirection_11_0= ruleDirection ) ) otherlv_12= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:867:3: otherlv_0= 'Axis2Placement3D' otherlv_1= '{' otherlv_2= 'cartesianX' ( (lv_cartesianX_3_0= ruleEDouble ) ) otherlv_4= 'cartesianY' ( (lv_cartesianY_5_0= ruleEDouble ) ) otherlv_6= 'cartesianZ' ( (lv_cartesianZ_7_0= ruleEDouble ) ) otherlv_8= 'axis' ( (lv_axis_9_0= ruleDirection ) ) otherlv_10= 'refDirection' ( (lv_refDirection_11_0= ruleDirection ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAxis2Placement3D1884); 

                	newLeafNode(otherlv_0, grammarAccess.getAxis2Placement3DAccess().getAxis2Placement3DKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAxis2Placement3D1896); 

                	newLeafNode(otherlv_1, grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAxis2Placement3D1908); 

                	newLeafNode(otherlv_2, grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:879:1: ( (lv_cartesianX_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:880:1: (lv_cartesianX_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:880:1: (lv_cartesianX_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:881:3: lv_cartesianX_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1929);
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

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAxis2Placement3D1941); 

                	newLeafNode(otherlv_4, grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:901:1: ( (lv_cartesianY_5_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:902:1: (lv_cartesianY_5_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:902:1: (lv_cartesianY_5_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:903:3: lv_cartesianY_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1962);
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

            otherlv_6=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAxis2Placement3D1974); 

                	newLeafNode(otherlv_6, grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_6());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:923:1: ( (lv_cartesianZ_7_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:924:1: (lv_cartesianZ_7_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:924:1: (lv_cartesianZ_7_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:925:3: lv_cartesianZ_7_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1995);
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

            otherlv_8=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAxis2Placement3D2007); 

                	newLeafNode(otherlv_8, grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_8());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:945:1: ( (lv_axis_9_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:946:1: (lv_axis_9_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:946:1: (lv_axis_9_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:947:3: lv_axis_9_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D2028);
            lv_axis_9_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_9_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAxis2Placement3D2040); 

                	newLeafNode(otherlv_10, grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_10());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:967:1: ( (lv_refDirection_11_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:968:1: (lv_refDirection_11_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:968:1: (lv_refDirection_11_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:969:3: lv_refDirection_11_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D2061);
            lv_refDirection_11_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"refDirection",
                    		lv_refDirection_11_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAxis2Placement3D2073); 

                	newLeafNode(otherlv_12, grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_12());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:997:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:998:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:999:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2110);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2121); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1006:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1009:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1010:2: (kw= '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1011:2: kw= '-'
                    {
                    kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble2160); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1016:3: (this_INT_1= RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1016:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2178); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEDouble2198); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2213); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1036:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=36 && LA25_0<=37)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1036:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1036:2: (kw= 'E' | kw= 'e' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==36) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==37) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1037:2: kw= 'E'
                            {
                            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleEDouble2233); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1044:2: kw= 'e'
                            {
                            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleEDouble2252); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1049:2: (kw= '-' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==34) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1050:2: kw= '-'
                            {
                            kw=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleEDouble2267); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2284); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1070:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1071:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1072:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection2331);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection2341); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1079:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_z_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1082:28: ( (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1083:1: (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1083:1: (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1083:3: otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDirection2378); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDirection2390); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDirection2402); 

                	newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getXKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1095:1: ( (lv_x_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1096:1: (lv_x_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1096:1: (lv_x_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1097:3: lv_x_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection2423);
            lv_x_3_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"x",
                    		lv_x_3_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleDirection2435); 

                	newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getYKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1117:1: ( (lv_y_5_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1118:1: (lv_y_5_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1118:1: (lv_y_5_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1119:3: lv_y_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection2456);
            lv_y_5_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_5_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1135:2: (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1135:4: otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleDirection2469); 

                        	newLeafNode(otherlv_6, grammarAccess.getDirectionAccess().getZKeyword_6_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1139:1: ( (lv_z_7_0= ruleEDouble ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1140:1: (lv_z_7_0= ruleEDouble )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1140:1: (lv_z_7_0= ruleEDouble )
                    // ../org.xtext.pipes/src-gen/org/xtext/pipes/parser/antlr/internal/InternalPipes.g:1141:3: lv_z_7_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection2490);
                    lv_z_7_0=ruleEDouble();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDirectionRule());
                    	        }
                           		set(
                           			current, 
                           			"z",
                            		lv_z_7_0, 
                            		"EDouble");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDirection2504); 

                	newLeafNode(otherlv_8, grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_7());
                

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
        public static final BitSet FOLLOW_11_in_ruleModel131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel143 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleModel156 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleModel168 = new BitSet(new long[]{0x0000000001510000L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_ruleModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel202 = new BitSet(new long[]{0x0000000001510000L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_ruleModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_entryRuleGUIDElement287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_ruleGUIDElement344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_ruleGUIDElement371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_ruleGUIDElement398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleGUIDElement425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl460 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement_Impl470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleGUIDElement_Impl516 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGUIDElement_Impl528 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleGUIDElement_Impl541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl562 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleGUIDElement_Impl577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl598 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleGUIDElement_Impl613 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl634 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGUIDElement_Impl648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString685 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_entryRuleWall807 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWall817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleWall854 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWall866 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleWall879 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall900 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleWall915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall936 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleWall951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall972 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleWall986 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleWall1007 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWall1019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening1055 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening1065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleOpening1102 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpening1114 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleOpening1127 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1148 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleOpening1163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1184 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleOpening1199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1220 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleOpening1234 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleOpening1255 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleOpening1268 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpening1280 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleWall_in_ruleOpening1301 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOpening1314 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleWall_in_ruleOpening1335 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOpening1349 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOpening1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment1399 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleFlowSegment1446 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlowSegment1458 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleFlowSegment1471 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1492 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleFlowSegment1507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1528 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleFlowSegment1543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1564 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFlowSegment1578 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleFlowSegment1599 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFlowSegment1611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement1647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement1657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleLocalPlacement1703 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLocalPlacement1715 = new BitSet(new long[]{0x000000000C008000L});
        public static final BitSet FOLLOW_26_in_ruleLocalPlacement1728 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLocalPlacement1751 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleLocalPlacement1766 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement1787 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLocalPlacement1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAxis2Placement3D1884 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAxis2Placement3D1896 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAxis2Placement3D1908 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1929 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleAxis2Placement3D1941 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1962 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleAxis2Placement3D1974 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D1995 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleAxis2Placement3D2007 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D2028 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAxis2Placement3D2040 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D2061 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAxis2Placement3D2073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2110 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleEDouble2160 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2178 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleEDouble2198 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2213 = new BitSet(new long[]{0x0000003000000002L});
        public static final BitSet FOLLOW_36_in_ruleEDouble2233 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_37_in_ruleEDouble2252 = new BitSet(new long[]{0x0000000400000040L});
        public static final BitSet FOLLOW_34_in_ruleEDouble2267 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection2331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection2341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDirection2378 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDirection2390 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleDirection2402 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection2423 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleDirection2435 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection2456 = new BitSet(new long[]{0x0000020000008000L});
        public static final BitSet FOLLOW_41_in_ruleDirection2469 = new BitSet(new long[]{0x0000000C00000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection2490 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDirection2504 = new BitSet(new long[]{0x0000000000000002L});
    }


}