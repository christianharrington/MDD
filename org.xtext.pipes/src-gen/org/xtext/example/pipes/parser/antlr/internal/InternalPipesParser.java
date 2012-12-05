package org.xtext.example.pipes.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.pipes.services.PipesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPipesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'elements'", "','", "'}'", "'GUIDElement'", "'GUID'", "'Name'", "'Description'", "'Wall'", "'placement'", "'openings'", "'Opening'", "'walls'", "'WallRelation'", "'wall'", "'opening'", "'FlowSegment'", "'LocalPlacement'", "'axis2placement3d'", "'relativeTo'", "'Axis2Placement3D'", "'cartesianX'", "'cartesianY'", "'cartesianZ'", "'axis'", "'refDirection'", "'-'", "'.'", "'E'", "'e'", "'Direction'", "'x'", "'y'", "'z'"
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
    public String getGrammarFileName() { return "../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g"; }



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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:69:2: iv_ruleModel= ruleModel EOF
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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:76:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:79:28: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:80:1: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:80:2: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:80:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelAccess().getModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:94:1: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:94:3: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleGUIDElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleModel156); 

                        	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getElementsKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleModel168); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:102:1: ( (lv_elements_5_0= ruleGUIDElement ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:103:1: (lv_elements_5_0= ruleGUIDElement )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:103:1: (lv_elements_5_0= ruleGUIDElement )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:104:3: lv_elements_5_0= ruleGUIDElement
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

                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:120:2: (otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:120:4: otherlv_6= ',' ( (lv_elements_7_0= ruleGUIDElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleModel202); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getModelAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:124:1: ( (lv_elements_7_0= ruleGUIDElement ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:125:1: (lv_elements_7_0= ruleGUIDElement )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:125:1: (lv_elements_7_0= ruleGUIDElement )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:126:3: lv_elements_7_0= ruleGUIDElement
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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:158:1: entryRuleGUIDElement returns [EObject current=null] : iv_ruleGUIDElement= ruleGUIDElement EOF ;
    public final EObject entryRuleGUIDElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIDElement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:159:2: (iv_ruleGUIDElement= ruleGUIDElement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:160:2: iv_ruleGUIDElement= ruleGUIDElement EOF
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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:167:1: ruleGUIDElement returns [EObject current=null] : (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_WallRelation_3= ruleWallRelation | this_FlowSegment_4= ruleFlowSegment | this_LocalPlacement_5= ruleLocalPlacement | this_Axis2Placement3D_6= ruleAxis2Placement3D ) ;
    public final EObject ruleGUIDElement() throws RecognitionException {
        EObject current = null;

        EObject this_GUIDElement_Impl_0 = null;

        EObject this_Wall_1 = null;

        EObject this_Opening_2 = null;

        EObject this_WallRelation_3 = null;

        EObject this_FlowSegment_4 = null;

        EObject this_LocalPlacement_5 = null;

        EObject this_Axis2Placement3D_6 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:170:28: ( (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_WallRelation_3= ruleWallRelation | this_FlowSegment_4= ruleFlowSegment | this_LocalPlacement_5= ruleLocalPlacement | this_Axis2Placement3D_6= ruleAxis2Placement3D ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:171:1: (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_WallRelation_3= ruleWallRelation | this_FlowSegment_4= ruleFlowSegment | this_LocalPlacement_5= ruleLocalPlacement | this_Axis2Placement3D_6= ruleAxis2Placement3D )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:171:1: (this_GUIDElement_Impl_0= ruleGUIDElement_Impl | this_Wall_1= ruleWall | this_Opening_2= ruleOpening | this_WallRelation_3= ruleWallRelation | this_FlowSegment_4= ruleFlowSegment | this_LocalPlacement_5= ruleLocalPlacement | this_Axis2Placement3D_6= ruleAxis2Placement3D )
            int alt3=7;
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
            case 23:
                {
                alt3=3;
                }
                break;
            case 25:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 29:
                {
                alt3=6;
                }
                break;
            case 32:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:172:5: this_GUIDElement_Impl_0= ruleGUIDElement_Impl
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
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:182:5: this_Wall_1= ruleWall
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
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:192:5: this_Opening_2= ruleOpening
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
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:202:5: this_WallRelation_3= ruleWallRelation
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getWallRelationParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_ruleGUIDElement425);
                    this_WallRelation_3=ruleWallRelation();

                    state._fsp--;

                     
                            current = this_WallRelation_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:212:5: this_FlowSegment_4= ruleFlowSegment
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getFlowSegmentParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_ruleGUIDElement452);
                    this_FlowSegment_4=ruleFlowSegment();

                    state._fsp--;

                     
                            current = this_FlowSegment_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:222:5: this_LocalPlacement_5= ruleLocalPlacement
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getLocalPlacementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleGUIDElement479);
                    this_LocalPlacement_5=ruleLocalPlacement();

                    state._fsp--;

                     
                            current = this_LocalPlacement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:232:5: this_Axis2Placement3D_6= ruleAxis2Placement3D
                    {
                     
                            newCompositeNode(grammarAccess.getGUIDElementAccess().getAxis2Placement3DParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_ruleGUIDElement506);
                    this_Axis2Placement3D_6=ruleAxis2Placement3D();

                    state._fsp--;

                     
                            current = this_Axis2Placement3D_6; 
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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:248:1: entryRuleGUIDElement_Impl returns [EObject current=null] : iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF ;
    public final EObject entryRuleGUIDElement_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGUIDElement_Impl = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:249:2: (iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:250:2: iv_ruleGUIDElement_Impl= ruleGUIDElement_Impl EOF
            {
             newCompositeNode(grammarAccess.getGUIDElement_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl541);
            iv_ruleGUIDElement_Impl=ruleGUIDElement_Impl();

            state._fsp--;

             current =iv_ruleGUIDElement_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGUIDElement_Impl551); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:257:1: ruleGUIDElement_Impl returns [EObject current=null] : ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:260:28: ( ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:261:1: ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:261:1: ( () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:261:2: () otherlv_1= 'GUIDElement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:261:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:262:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGUIDElement_ImplAccess().getGUIDElementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGUIDElement_Impl597); 

                	newLeafNode(otherlv_1, grammarAccess.getGUIDElement_ImplAccess().getGUIDElementKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGUIDElement_Impl609); 

                	newLeafNode(otherlv_2, grammarAccess.getGUIDElement_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:275:1: (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:275:3: otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGUIDElement_Impl622); 

                        	newLeafNode(otherlv_3, grammarAccess.getGUIDElement_ImplAccess().getGUIDKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:279:1: ( (lv_GUID_4_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:280:1: (lv_GUID_4_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:280:1: (lv_GUID_4_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:281:3: lv_GUID_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getGUIDEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl643);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:297:4: (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:297:6: otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGUIDElement_Impl658); 

                        	newLeafNode(otherlv_5, grammarAccess.getGUIDElement_ImplAccess().getNameKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:301:1: ( (lv_Name_6_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:302:1: (lv_Name_6_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:302:1: (lv_Name_6_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:303:3: lv_Name_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl679);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:319:4: (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:319:6: otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleGUIDElement_Impl694); 

                        	newLeafNode(otherlv_7, grammarAccess.getGUIDElement_ImplAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:323:1: ( (lv_Description_8_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:324:1: (lv_Description_8_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:324:1: (lv_Description_8_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:325:3: lv_Description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getGUIDElement_ImplAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGUIDElement_Impl715);
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGUIDElement_Impl729); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:353:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:354:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:355:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString766);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString777); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:362:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:365:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:366:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:366:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:366:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString817); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:374:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString843); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:389:1: entryRuleWall returns [EObject current=null] : iv_ruleWall= ruleWall EOF ;
    public final EObject entryRuleWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWall = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:390:2: (iv_ruleWall= ruleWall EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:391:2: iv_ruleWall= ruleWall EOF
            {
             newCompositeNode(grammarAccess.getWallRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_entryRuleWall888);
            iv_ruleWall=ruleWall();

            state._fsp--;

             current =iv_ruleWall; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWall898); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:398:1: ruleWall returns [EObject current=null] : (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleWall() throws RecognitionException {
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

        EObject lv_openings_12_0 = null;

        EObject lv_openings_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:401:28: ( (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:402:1: (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:402:1: (otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:402:3: otherlv_0= 'Wall' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleWall935); 

                	newLeafNode(otherlv_0, grammarAccess.getWallAccess().getWallKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWall947); 

                	newLeafNode(otherlv_1, grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:410:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:410:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWall960); 

                        	newLeafNode(otherlv_2, grammarAccess.getWallAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:414:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:415:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:415:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:416:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall981);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:432:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:432:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWall996); 

                        	newLeafNode(otherlv_4, grammarAccess.getWallAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:436:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:437:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:437:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:438:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall1017);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:454:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:454:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWall1032); 

                        	newLeafNode(otherlv_6, grammarAccess.getWallAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:458:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:459:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:459:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:460:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWall1053);
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

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleWall1067); 

                	newLeafNode(otherlv_8, grammarAccess.getWallAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:480:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:481:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:481:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:482:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getWallAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleWall1088);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:498:2: (otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:498:4: otherlv_10= 'openings' otherlv_11= '{' ( (lv_openings_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWall1101); 

                        	newLeafNode(otherlv_10, grammarAccess.getWallAccess().getOpeningsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWall1113); 

                        	newLeafNode(otherlv_11, grammarAccess.getWallAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:506:1: ( (lv_openings_12_0= ruleWallRelation ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:507:1: (lv_openings_12_0= ruleWallRelation )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:507:1: (lv_openings_12_0= ruleWallRelation )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:508:3: lv_openings_12_0= ruleWallRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_ruleWall1134);
                    lv_openings_12_0=ruleWallRelation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRule());
                    	        }
                           		add(
                           			current, 
                           			"openings",
                            		lv_openings_12_0, 
                            		"WallRelation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:524:2: (otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:524:4: otherlv_13= ',' ( (lv_openings_14_0= ruleWallRelation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWall1147); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getWallAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:528:1: ( (lv_openings_14_0= ruleWallRelation ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:529:1: (lv_openings_14_0= ruleWallRelation )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:529:1: (lv_openings_14_0= ruleWallRelation )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:530:3: lv_openings_14_0= ruleWallRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getWallAccess().getOpeningsWallRelationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_ruleWall1168);
                    	    lv_openings_14_0=ruleWallRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getWallRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"openings",
                    	            		lv_openings_14_0, 
                    	            		"WallRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWall1182); 

                        	newLeafNode(otherlv_15, grammarAccess.getWallAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWall1196); 

                	newLeafNode(otherlv_16, grammarAccess.getWallAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:562:1: entryRuleOpening returns [EObject current=null] : iv_ruleOpening= ruleOpening EOF ;
    public final EObject entryRuleOpening() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpening = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:563:2: (iv_ruleOpening= ruleOpening EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:564:2: iv_ruleOpening= ruleOpening EOF
            {
             newCompositeNode(grammarAccess.getOpeningRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_entryRuleOpening1232);
            iv_ruleOpening=ruleOpening();

            state._fsp--;

             current =iv_ruleOpening; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpening1242); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:571:1: ruleOpening returns [EObject current=null] : (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:574:28: ( (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:575:1: (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:575:1: (otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:575:3: otherlv_0= 'Opening' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleOpening1279); 

                	newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpening1291); 

                	newLeafNode(otherlv_1, grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:583:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:583:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleOpening1304); 

                        	newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:587:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:588:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:588:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:589:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1325);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:605:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:605:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleOpening1340); 

                        	newLeafNode(otherlv_4, grammarAccess.getOpeningAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:609:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:610:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:610:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:611:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1361);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:627:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:627:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOpening1376); 

                        	newLeafNode(otherlv_6, grammarAccess.getOpeningAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:631:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:632:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:632:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:633:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpening1397);
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

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOpening1411); 

                	newLeafNode(otherlv_8, grammarAccess.getOpeningAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:653:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:654:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:654:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:655:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleOpening1432);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:671:2: (otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:671:4: otherlv_10= 'walls' otherlv_11= '{' ( (lv_walls_12_0= ruleWallRelation ) ) (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOpening1445); 

                        	newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getWallsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpening1457); 

                        	newLeafNode(otherlv_11, grammarAccess.getOpeningAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:679:1: ( (lv_walls_12_0= ruleWallRelation ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:680:1: (lv_walls_12_0= ruleWallRelation )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:680:1: (lv_walls_12_0= ruleWallRelation )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:681:3: lv_walls_12_0= ruleWallRelation
                    {
                     
                    	        newCompositeNode(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_ruleOpening1478);
                    lv_walls_12_0=ruleWallRelation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	        }
                           		add(
                           			current, 
                           			"walls",
                            		lv_walls_12_0, 
                            		"WallRelation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:697:2: (otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:697:4: otherlv_13= ',' ( (lv_walls_14_0= ruleWallRelation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleOpening1491); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getOpeningAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:701:1: ( (lv_walls_14_0= ruleWallRelation ) )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:702:1: (lv_walls_14_0= ruleWallRelation )
                    	    {
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:702:1: (lv_walls_14_0= ruleWallRelation )
                    	    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:703:3: lv_walls_14_0= ruleWallRelation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOpeningAccess().getWallsWallRelationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_ruleOpening1512);
                    	    lv_walls_14_0=ruleWallRelation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOpeningRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"walls",
                    	            		lv_walls_14_0, 
                    	            		"WallRelation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpening1526); 

                        	newLeafNode(otherlv_15, grammarAccess.getOpeningAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOpening1540); 

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


    // $ANTLR start "entryRuleWallRelation"
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:735:1: entryRuleWallRelation returns [EObject current=null] : iv_ruleWallRelation= ruleWallRelation EOF ;
    public final EObject entryRuleWallRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWallRelation = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:736:2: (iv_ruleWallRelation= ruleWallRelation EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:737:2: iv_ruleWallRelation= ruleWallRelation EOF
            {
             newCompositeNode(grammarAccess.getWallRelationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWallRelation_in_entryRuleWallRelation1576);
            iv_ruleWallRelation=ruleWallRelation();

            state._fsp--;

             current =iv_ruleWallRelation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWallRelation1586); 

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
    // $ANTLR end "entryRuleWallRelation"


    // $ANTLR start "ruleWallRelation"
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:744:1: ruleWallRelation returns [EObject current=null] : (otherlv_0= 'WallRelation' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'wall' ( (lv_wall_9_0= ruleWall ) ) otherlv_10= 'opening' ( (lv_opening_11_0= ruleOpening ) ) otherlv_12= '}' ) ;
    public final EObject ruleWallRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_GUID_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        AntlrDatatypeRuleToken lv_Description_7_0 = null;

        EObject lv_wall_9_0 = null;

        EObject lv_opening_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:747:28: ( (otherlv_0= 'WallRelation' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'wall' ( (lv_wall_9_0= ruleWall ) ) otherlv_10= 'opening' ( (lv_opening_11_0= ruleOpening ) ) otherlv_12= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:748:1: (otherlv_0= 'WallRelation' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'wall' ( (lv_wall_9_0= ruleWall ) ) otherlv_10= 'opening' ( (lv_opening_11_0= ruleOpening ) ) otherlv_12= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:748:1: (otherlv_0= 'WallRelation' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'wall' ( (lv_wall_9_0= ruleWall ) ) otherlv_10= 'opening' ( (lv_opening_11_0= ruleOpening ) ) otherlv_12= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:748:3: otherlv_0= 'WallRelation' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'wall' ( (lv_wall_9_0= ruleWall ) ) otherlv_10= 'opening' ( (lv_opening_11_0= ruleOpening ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleWallRelation1623); 

                	newLeafNode(otherlv_0, grammarAccess.getWallRelationAccess().getWallRelationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWallRelation1635); 

                	newLeafNode(otherlv_1, grammarAccess.getWallRelationAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:756:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:756:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWallRelation1648); 

                        	newLeafNode(otherlv_2, grammarAccess.getWallRelationAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:760:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:761:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:761:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:762:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallRelationAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRelation1669);
                    lv_GUID_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRelationRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:778:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:778:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWallRelation1684); 

                        	newLeafNode(otherlv_4, grammarAccess.getWallRelationAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:782:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:783:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:783:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:784:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallRelationAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRelation1705);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRelationRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:800:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:800:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWallRelation1720); 

                        	newLeafNode(otherlv_6, grammarAccess.getWallRelationAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:804:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:805:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:805:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:806:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getWallRelationAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWallRelation1741);
                    lv_Description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWallRelationRule());
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

            otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleWallRelation1755); 

                	newLeafNode(otherlv_8, grammarAccess.getWallRelationAccess().getWallKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:826:1: ( (lv_wall_9_0= ruleWall ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:827:1: (lv_wall_9_0= ruleWall )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:827:1: (lv_wall_9_0= ruleWall )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:828:3: lv_wall_9_0= ruleWall
            {
             
            	        newCompositeNode(grammarAccess.getWallRelationAccess().getWallWallParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWall_in_ruleWallRelation1776);
            lv_wall_9_0=ruleWall();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWallRelationRule());
            	        }
                   		set(
                   			current, 
                   			"wall",
                    		lv_wall_9_0, 
                    		"Wall");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleWallRelation1788); 

                	newLeafNode(otherlv_10, grammarAccess.getWallRelationAccess().getOpeningKeyword_7());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:848:1: ( (lv_opening_11_0= ruleOpening ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:849:1: (lv_opening_11_0= ruleOpening )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:849:1: (lv_opening_11_0= ruleOpening )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:850:3: lv_opening_11_0= ruleOpening
            {
             
            	        newCompositeNode(grammarAccess.getWallRelationAccess().getOpeningOpeningParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOpening_in_ruleWallRelation1809);
            lv_opening_11_0=ruleOpening();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWallRelationRule());
            	        }
                   		set(
                   			current, 
                   			"opening",
                    		lv_opening_11_0, 
                    		"Opening");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWallRelation1821); 

                	newLeafNode(otherlv_12, grammarAccess.getWallRelationAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleWallRelation"


    // $ANTLR start "entryRuleFlowSegment"
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:878:1: entryRuleFlowSegment returns [EObject current=null] : iv_ruleFlowSegment= ruleFlowSegment EOF ;
    public final EObject entryRuleFlowSegment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowSegment = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:879:2: (iv_ruleFlowSegment= ruleFlowSegment EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:880:2: iv_ruleFlowSegment= ruleFlowSegment EOF
            {
             newCompositeNode(grammarAccess.getFlowSegmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment1857);
            iv_ruleFlowSegment=ruleFlowSegment();

            state._fsp--;

             current =iv_ruleFlowSegment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFlowSegment1867); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:887:1: ruleFlowSegment returns [EObject current=null] : (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:890:28: ( (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:891:1: (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:891:1: (otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:891:3: otherlv_0= 'FlowSegment' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'placement' ( (lv_placement_9_0= ruleLocalPlacement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleFlowSegment1904); 

                	newLeafNode(otherlv_0, grammarAccess.getFlowSegmentAccess().getFlowSegmentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleFlowSegment1916); 

                	newLeafNode(otherlv_1, grammarAccess.getFlowSegmentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:899:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:899:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleFlowSegment1929); 

                        	newLeafNode(otherlv_2, grammarAccess.getFlowSegmentAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:903:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:904:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:904:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:905:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1950);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:921:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:921:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleFlowSegment1965); 

                        	newLeafNode(otherlv_4, grammarAccess.getFlowSegmentAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:925:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:926:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:926:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:927:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment1986);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:943:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:943:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFlowSegment2001); 

                        	newLeafNode(otherlv_6, grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:947:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:948:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:948:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:949:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleFlowSegment2022);
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

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleFlowSegment2036); 

                	newLeafNode(otherlv_8, grammarAccess.getFlowSegmentAccess().getPlacementKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:969:1: ( (lv_placement_9_0= ruleLocalPlacement ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:970:1: (lv_placement_9_0= ruleLocalPlacement )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:970:1: (lv_placement_9_0= ruleLocalPlacement )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:971:3: lv_placement_9_0= ruleLocalPlacement
            {
             
            	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleFlowSegment2057);
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

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFlowSegment2069); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:999:1: entryRuleLocalPlacement returns [EObject current=null] : iv_ruleLocalPlacement= ruleLocalPlacement EOF ;
    public final EObject entryRuleLocalPlacement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalPlacement = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1000:2: (iv_ruleLocalPlacement= ruleLocalPlacement EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1001:2: iv_ruleLocalPlacement= ruleLocalPlacement EOF
            {
             newCompositeNode(grammarAccess.getLocalPlacementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement2105);
            iv_ruleLocalPlacement=ruleLocalPlacement();

            state._fsp--;

             current =iv_ruleLocalPlacement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalPlacement2115); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1008:1: ruleLocalPlacement returns [EObject current=null] : ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )? (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleLocalPlacement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_GUID_4_0 = null;

        AntlrDatatypeRuleToken lv_Name_6_0 = null;

        AntlrDatatypeRuleToken lv_Description_8_0 = null;

        EObject lv_axis2placement3d_10_0 = null;

        EObject lv_relativeTo_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1011:28: ( ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )? (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1012:1: ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )? (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1012:1: ( () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )? (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )? otherlv_13= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1012:2: () otherlv_1= 'LocalPlacement' otherlv_2= '{' (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )? (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )? (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )? (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )? (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1012:2: ()
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1013:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLocalPlacement2161); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalPlacementAccess().getLocalPlacementKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLocalPlacement2173); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1026:1: (otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1026:3: otherlv_3= 'GUID' ( (lv_GUID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleLocalPlacement2186); 

                        	newLeafNode(otherlv_3, grammarAccess.getLocalPlacementAccess().getGUIDKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1030:1: ( (lv_GUID_4_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1031:1: (lv_GUID_4_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1031:1: (lv_GUID_4_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1032:3: lv_GUID_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getGUIDEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLocalPlacement2207);
                    lv_GUID_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1048:4: (otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1048:6: otherlv_5= 'Name' ( (lv_Name_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLocalPlacement2222); 

                        	newLeafNode(otherlv_5, grammarAccess.getLocalPlacementAccess().getNameKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1052:1: ( (lv_Name_6_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1053:1: (lv_Name_6_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1053:1: (lv_Name_6_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1054:3: lv_Name_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getNameEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLocalPlacement2243);
                    lv_Name_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1070:4: (otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1070:6: otherlv_7= 'Description' ( (lv_Description_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLocalPlacement2258); 

                        	newLeafNode(otherlv_7, grammarAccess.getLocalPlacementAccess().getDescriptionKeyword_5_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1074:1: ( (lv_Description_8_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1075:1: (lv_Description_8_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1075:1: (lv_Description_8_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1076:3: lv_Description_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLocalPlacement2279);
                    lv_Description_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1092:4: (otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1092:6: otherlv_9= 'axis2placement3d' ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) )
                    {
                    otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleLocalPlacement2294); 

                        	newLeafNode(otherlv_9, grammarAccess.getLocalPlacementAccess().getAxis2placement3dKeyword_6_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1096:1: ( (lv_axis2placement3d_10_0= ruleAxis2Placement3D ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1097:1: (lv_axis2placement3d_10_0= ruleAxis2Placement3D )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1097:1: (lv_axis2placement3d_10_0= ruleAxis2Placement3D )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1098:3: lv_axis2placement3d_10_0= ruleAxis2Placement3D
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement2315);
                    lv_axis2placement3d_10_0=ruleAxis2Placement3D();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
                    	        }
                           		set(
                           			current, 
                           			"axis2placement3d",
                            		lv_axis2placement3d_10_0, 
                            		"Axis2Placement3D");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1114:4: (otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1114:6: otherlv_11= 'relativeTo' ( (lv_relativeTo_12_0= ruleLocalPlacement ) )
                    {
                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleLocalPlacement2330); 

                        	newLeafNode(otherlv_11, grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_7_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1118:1: ( (lv_relativeTo_12_0= ruleLocalPlacement ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1119:1: (lv_relativeTo_12_0= ruleLocalPlacement )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1119:1: (lv_relativeTo_12_0= ruleLocalPlacement )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1120:3: lv_relativeTo_12_0= ruleLocalPlacement
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement2351);
                    lv_relativeTo_12_0=ruleLocalPlacement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
                    	        }
                           		set(
                           			current, 
                           			"relativeTo",
                            		lv_relativeTo_12_0, 
                            		"LocalPlacement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLocalPlacement2365); 

                	newLeafNode(otherlv_13, grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1148:1: entryRuleAxis2Placement3D returns [EObject current=null] : iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF ;
    public final EObject entryRuleAxis2Placement3D() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis2Placement3D = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1149:2: (iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1150:2: iv_ruleAxis2Placement3D= ruleAxis2Placement3D EOF
            {
             newCompositeNode(grammarAccess.getAxis2Placement3DRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D2401);
            iv_ruleAxis2Placement3D=ruleAxis2Placement3D();

            state._fsp--;

             current =iv_ruleAxis2Placement3D; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAxis2Placement3D2411); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1157:1: ruleAxis2Placement3D returns [EObject current=null] : (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'cartesianX' ( (lv_cartesianX_9_0= ruleEDouble ) ) otherlv_10= 'cartesianY' ( (lv_cartesianY_11_0= ruleEDouble ) ) otherlv_12= 'cartesianZ' ( (lv_cartesianZ_13_0= ruleEDouble ) ) otherlv_14= 'axis' ( (lv_axis_15_0= ruleDirection ) ) otherlv_16= 'refDirection' ( (lv_refDirection_17_0= ruleDirection ) ) otherlv_18= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_GUID_3_0 = null;

        AntlrDatatypeRuleToken lv_Name_5_0 = null;

        AntlrDatatypeRuleToken lv_Description_7_0 = null;

        AntlrDatatypeRuleToken lv_cartesianX_9_0 = null;

        AntlrDatatypeRuleToken lv_cartesianY_11_0 = null;

        AntlrDatatypeRuleToken lv_cartesianZ_13_0 = null;

        EObject lv_axis_15_0 = null;

        EObject lv_refDirection_17_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1160:28: ( (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'cartesianX' ( (lv_cartesianX_9_0= ruleEDouble ) ) otherlv_10= 'cartesianY' ( (lv_cartesianY_11_0= ruleEDouble ) ) otherlv_12= 'cartesianZ' ( (lv_cartesianZ_13_0= ruleEDouble ) ) otherlv_14= 'axis' ( (lv_axis_15_0= ruleDirection ) ) otherlv_16= 'refDirection' ( (lv_refDirection_17_0= ruleDirection ) ) otherlv_18= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1161:1: (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'cartesianX' ( (lv_cartesianX_9_0= ruleEDouble ) ) otherlv_10= 'cartesianY' ( (lv_cartesianY_11_0= ruleEDouble ) ) otherlv_12= 'cartesianZ' ( (lv_cartesianZ_13_0= ruleEDouble ) ) otherlv_14= 'axis' ( (lv_axis_15_0= ruleDirection ) ) otherlv_16= 'refDirection' ( (lv_refDirection_17_0= ruleDirection ) ) otherlv_18= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1161:1: (otherlv_0= 'Axis2Placement3D' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'cartesianX' ( (lv_cartesianX_9_0= ruleEDouble ) ) otherlv_10= 'cartesianY' ( (lv_cartesianY_11_0= ruleEDouble ) ) otherlv_12= 'cartesianZ' ( (lv_cartesianZ_13_0= ruleEDouble ) ) otherlv_14= 'axis' ( (lv_axis_15_0= ruleDirection ) ) otherlv_16= 'refDirection' ( (lv_refDirection_17_0= ruleDirection ) ) otherlv_18= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1161:3: otherlv_0= 'Axis2Placement3D' otherlv_1= '{' (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )? (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )? (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )? otherlv_8= 'cartesianX' ( (lv_cartesianX_9_0= ruleEDouble ) ) otherlv_10= 'cartesianY' ( (lv_cartesianY_11_0= ruleEDouble ) ) otherlv_12= 'cartesianZ' ( (lv_cartesianZ_13_0= ruleEDouble ) ) otherlv_14= 'axis' ( (lv_axis_15_0= ruleDirection ) ) otherlv_16= 'refDirection' ( (lv_refDirection_17_0= ruleDirection ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAxis2Placement3D2448); 

                	newLeafNode(otherlv_0, grammarAccess.getAxis2Placement3DAccess().getAxis2Placement3DKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAxis2Placement3D2460); 

                	newLeafNode(otherlv_1, grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1169:1: (otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1169:3: otherlv_2= 'GUID' ( (lv_GUID_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAxis2Placement3D2473); 

                        	newLeafNode(otherlv_2, grammarAccess.getAxis2Placement3DAccess().getGUIDKeyword_2_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1173:1: ( (lv_GUID_3_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1174:1: (lv_GUID_3_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1174:1: (lv_GUID_3_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1175:3: lv_GUID_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getGUIDEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxis2Placement3D2494);
                    lv_GUID_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1191:4: (otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1191:6: otherlv_4= 'Name' ( (lv_Name_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAxis2Placement3D2509); 

                        	newLeafNode(otherlv_4, grammarAccess.getAxis2Placement3DAccess().getNameKeyword_3_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1195:1: ( (lv_Name_5_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1196:1: (lv_Name_5_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1196:1: (lv_Name_5_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1197:3: lv_Name_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getNameEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxis2Placement3D2530);
                    lv_Name_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1213:4: (otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1213:6: otherlv_6= 'Description' ( (lv_Description_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAxis2Placement3D2545); 

                        	newLeafNode(otherlv_6, grammarAccess.getAxis2Placement3DAccess().getDescriptionKeyword_4_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1217:1: ( (lv_Description_7_0= ruleEString ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1218:1: (lv_Description_7_0= ruleEString )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1218:1: (lv_Description_7_0= ruleEString )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1219:3: lv_Description_7_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getDescriptionEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAxis2Placement3D2566);
                    lv_Description_7_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
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

            otherlv_8=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAxis2Placement3D2580); 

                	newLeafNode(otherlv_8, grammarAccess.getAxis2Placement3DAccess().getCartesianXKeyword_5());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1239:1: ( (lv_cartesianX_9_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1240:1: (lv_cartesianX_9_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1240:1: (lv_cartesianX_9_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1241:3: lv_cartesianX_9_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2601);
            lv_cartesianX_9_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianX",
                    		lv_cartesianX_9_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAxis2Placement3D2613); 

                	newLeafNode(otherlv_10, grammarAccess.getAxis2Placement3DAccess().getCartesianYKeyword_7());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1261:1: ( (lv_cartesianY_11_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1262:1: (lv_cartesianY_11_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1262:1: (lv_cartesianY_11_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1263:3: lv_cartesianY_11_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2634);
            lv_cartesianY_11_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianY",
                    		lv_cartesianY_11_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAxis2Placement3D2646); 

                	newLeafNode(otherlv_12, grammarAccess.getAxis2Placement3DAccess().getCartesianZKeyword_9());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1283:1: ( (lv_cartesianZ_13_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1284:1: (lv_cartesianZ_13_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1284:1: (lv_cartesianZ_13_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1285:3: lv_cartesianZ_13_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2667);
            lv_cartesianZ_13_0=ruleEDouble();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"cartesianZ",
                    		lv_cartesianZ_13_0, 
                    		"EDouble");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAxis2Placement3D2679); 

                	newLeafNode(otherlv_14, grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_11());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1305:1: ( (lv_axis_15_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1306:1: (lv_axis_15_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1306:1: (lv_axis_15_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1307:3: lv_axis_15_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_12_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D2700);
            lv_axis_15_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"axis",
                    		lv_axis_15_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_16=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAxis2Placement3D2712); 

                	newLeafNode(otherlv_16, grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_13());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1327:1: ( (lv_refDirection_17_0= ruleDirection ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1328:1: (lv_refDirection_17_0= ruleDirection )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1328:1: (lv_refDirection_17_0= ruleDirection )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1329:3: lv_refDirection_17_0= ruleDirection
            {
             
            	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_ruleAxis2Placement3D2733);
            lv_refDirection_17_0=ruleDirection();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
            	        }
                   		set(
                   			current, 
                   			"refDirection",
                    		lv_refDirection_17_0, 
                    		"Direction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAxis2Placement3D2745); 

                	newLeafNode(otherlv_18, grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_15());
                

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1357:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1358:2: (iv_ruleEDouble= ruleEDouble EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1359:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_entryRuleEDouble2782);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEDouble2793); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1366:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1369:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1370:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1370:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1370:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1370:2: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1371:2: kw= '-'
                    {
                    kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEDouble2832); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1376:3: (this_INT_1= RULE_INT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1376:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2850); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleEDouble2870); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2885); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1396:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=40 && LA36_0<=41)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1396:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1396:2: (kw= 'E' | kw= 'e' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==40) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==41) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1397:2: kw= 'E'
                            {
                            kw=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleEDouble2905); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1404:2: kw= 'e'
                            {
                            kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleEDouble2924); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1409:2: (kw= '-' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==38) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1410:2: kw= '-'
                            {
                            kw=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleEDouble2939); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEDouble2956); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1430:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1431:2: (iv_ruleDirection= ruleDirection EOF )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1432:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDirection_in_entryRuleDirection3003);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirection3013); 

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
    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1439:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) ;
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
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1442:28: ( (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1443:1: (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1443:1: (otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}' )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1443:3: otherlv_0= 'Direction' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEDouble ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEDouble ) ) (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleDirection3050); 

                	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDirection3062); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleDirection3074); 

                	newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getXKeyword_2());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1455:1: ( (lv_x_3_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1456:1: (lv_x_3_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1456:1: (lv_x_3_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1457:3: lv_x_3_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection3095);
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

            otherlv_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleDirection3107); 

                	newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getYKeyword_4());
                
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1477:1: ( (lv_y_5_0= ruleEDouble ) )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1478:1: (lv_y_5_0= ruleEDouble )
            {
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1478:1: (lv_y_5_0= ruleEDouble )
            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1479:3: lv_y_5_0= ruleEDouble
            {
             
            	        newCompositeNode(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection3128);
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

            // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1495:2: (otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1495:4: otherlv_6= 'z' ( (lv_z_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleDirection3141); 

                        	newLeafNode(otherlv_6, grammarAccess.getDirectionAccess().getZKeyword_6_0());
                        
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1499:1: ( (lv_z_7_0= ruleEDouble ) )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1500:1: (lv_z_7_0= ruleEDouble )
                    {
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1500:1: (lv_z_7_0= ruleEDouble )
                    // ../org.xtext.pipes/src-gen/org/xtext/example/pipes/parser/antlr/internal/InternalPipes.g:1501:3: lv_z_7_0= ruleEDouble
                    {
                     
                    	        newCompositeNode(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEDouble_in_ruleDirection3162);
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

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDirection3176); 

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
        public static final BitSet FOLLOW_12_in_ruleModel168 = new BitSet(new long[]{0x0000000132910000L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_ruleModel189 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleModel202 = new BitSet(new long[]{0x0000000132910000L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_ruleModel223 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleModel237 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleModel251 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_in_entryRuleGUIDElement287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_ruleGUIDElement344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_ruleGUIDElement371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_ruleGUIDElement398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_ruleGUIDElement425 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_ruleGUIDElement452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleGUIDElement479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_ruleGUIDElement506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGUIDElement_Impl_in_entryRuleGUIDElement_Impl541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGUIDElement_Impl551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleGUIDElement_Impl597 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGUIDElement_Impl609 = new BitSet(new long[]{0x00000000000E8000L});
        public static final BitSet FOLLOW_17_in_ruleGUIDElement_Impl622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl643 = new BitSet(new long[]{0x00000000000C8000L});
        public static final BitSet FOLLOW_18_in_ruleGUIDElement_Impl658 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl679 = new BitSet(new long[]{0x0000000000088000L});
        public static final BitSet FOLLOW_19_in_ruleGUIDElement_Impl694 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGUIDElement_Impl715 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGUIDElement_Impl729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWall_in_entryRuleWall888 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWall898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleWall935 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWall947 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleWall960 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall981 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleWall996 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall1017 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleWall1032 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWall1053 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleWall1067 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleWall1088 = new BitSet(new long[]{0x0000000000408000L});
        public static final BitSet FOLLOW_22_in_ruleWall1101 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWall1113 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleWallRelation_in_ruleWall1134 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleWall1147 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleWallRelation_in_ruleWall1168 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleWall1182 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWall1196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpening_in_entryRuleOpening1232 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpening1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleOpening1279 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpening1291 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleOpening1304 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1325 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleOpening1340 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1361 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleOpening1376 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpening1397 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleOpening1411 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleOpening1432 = new BitSet(new long[]{0x0000000001008000L});
        public static final BitSet FOLLOW_24_in_ruleOpening1445 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpening1457 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleWallRelation_in_ruleOpening1478 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleOpening1491 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleWallRelation_in_ruleOpening1512 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleOpening1526 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleOpening1540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWallRelation_in_entryRuleWallRelation1576 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWallRelation1586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleWallRelation1623 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWallRelation1635 = new BitSet(new long[]{0x00000000040E0000L});
        public static final BitSet FOLLOW_17_in_ruleWallRelation1648 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRelation1669 = new BitSet(new long[]{0x00000000040C0000L});
        public static final BitSet FOLLOW_18_in_ruleWallRelation1684 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRelation1705 = new BitSet(new long[]{0x0000000004080000L});
        public static final BitSet FOLLOW_19_in_ruleWallRelation1720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWallRelation1741 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleWallRelation1755 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleWall_in_ruleWallRelation1776 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleWallRelation1788 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_ruleOpening_in_ruleWallRelation1809 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWallRelation1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFlowSegment_in_entryRuleFlowSegment1857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFlowSegment1867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleFlowSegment1904 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleFlowSegment1916 = new BitSet(new long[]{0x00000000002E0000L});
        public static final BitSet FOLLOW_17_in_ruleFlowSegment1929 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1950 = new BitSet(new long[]{0x00000000002C0000L});
        public static final BitSet FOLLOW_18_in_ruleFlowSegment1965 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment1986 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_19_in_ruleFlowSegment2001 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleFlowSegment2022 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleFlowSegment2036 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleFlowSegment2057 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleFlowSegment2069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_entryRuleLocalPlacement2105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalPlacement2115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleLocalPlacement2161 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLocalPlacement2173 = new BitSet(new long[]{0x00000000C00E8000L});
        public static final BitSet FOLLOW_17_in_ruleLocalPlacement2186 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLocalPlacement2207 = new BitSet(new long[]{0x00000000C00C8000L});
        public static final BitSet FOLLOW_18_in_ruleLocalPlacement2222 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLocalPlacement2243 = new BitSet(new long[]{0x00000000C0088000L});
        public static final BitSet FOLLOW_19_in_ruleLocalPlacement2258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLocalPlacement2279 = new BitSet(new long[]{0x00000000C0008000L});
        public static final BitSet FOLLOW_30_in_ruleLocalPlacement2294 = new BitSet(new long[]{0x0000000132910000L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_ruleLocalPlacement2315 = new BitSet(new long[]{0x0000000080008000L});
        public static final BitSet FOLLOW_31_in_ruleLocalPlacement2330 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_ruleLocalPlacement_in_ruleLocalPlacement2351 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleLocalPlacement2365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAxis2Placement3D_in_entryRuleAxis2Placement3D2401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAxis2Placement3D2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAxis2Placement3D2448 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAxis2Placement3D2460 = new BitSet(new long[]{0x00000002000E0000L});
        public static final BitSet FOLLOW_17_in_ruleAxis2Placement3D2473 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxis2Placement3D2494 = new BitSet(new long[]{0x00000002000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAxis2Placement3D2509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxis2Placement3D2530 = new BitSet(new long[]{0x0000000200080000L});
        public static final BitSet FOLLOW_19_in_ruleAxis2Placement3D2545 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAxis2Placement3D2566 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleAxis2Placement3D2580 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2601 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAxis2Placement3D2613 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2634 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAxis2Placement3D2646 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleAxis2Placement3D2667 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleAxis2Placement3D2679 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D2700 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleAxis2Placement3D2712 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleDirection_in_ruleAxis2Placement3D2733 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAxis2Placement3D2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEDouble_in_entryRuleEDouble2782 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEDouble2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleEDouble2832 = new BitSet(new long[]{0x0000008000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2850 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleEDouble2870 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2885 = new BitSet(new long[]{0x0000030000000002L});
        public static final BitSet FOLLOW_40_in_ruleEDouble2905 = new BitSet(new long[]{0x0000004000000040L});
        public static final BitSet FOLLOW_41_in_ruleEDouble2924 = new BitSet(new long[]{0x0000004000000040L});
        public static final BitSet FOLLOW_38_in_ruleEDouble2939 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEDouble2956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirection_in_entryRuleDirection3003 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirection3013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleDirection3050 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDirection3062 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_43_in_ruleDirection3074 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection3095 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleDirection3107 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection3128 = new BitSet(new long[]{0x0000200000008000L});
        public static final BitSet FOLLOW_45_in_ruleDirection3141 = new BitSet(new long[]{0x000000C000000040L});
        public static final BitSet FOLLOW_ruleEDouble_in_ruleDirection3162 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleDirection3176 = new BitSet(new long[]{0x0000000000000002L});
    }


}