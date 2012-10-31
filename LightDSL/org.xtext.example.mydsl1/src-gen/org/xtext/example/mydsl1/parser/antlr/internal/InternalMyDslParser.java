package org.xtext.example.mydsl1.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Main'", "'{'", "'BIMServer'", "'Lamp'", "','", "'}'", "'BIMServerCredentials'", "'address'", "'port'", "'projectName'", "'userName'", "'password'", "'GlobalID'", "'PredefinedType'"
    };
    public static final int RULE_ID=5;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Main";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMain"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:67:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:68:2: (iv_ruleMain= ruleMain EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:69:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMain_in_entryRuleMain75);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMain85); 

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
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:76:1: ruleMain returns [EObject current=null] : ( () otherlv_1= 'Main' otherlv_2= '{' (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )? (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_BIMServer_4_0 = null;

        EObject lv_Lamp_7_0 = null;

        EObject lv_Lamp_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:79:28: ( ( () otherlv_1= 'Main' otherlv_2= '{' (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )? (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'Main' otherlv_2= '{' (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )? (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:1: ( () otherlv_1= 'Main' otherlv_2= '{' (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )? (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: () otherlv_1= 'Main' otherlv_2= '{' (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )? (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:80:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMainAccess().getMainAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMain131); 

                	newLeafNode(otherlv_1, grammarAccess.getMainAccess().getMainKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMain143); 

                	newLeafNode(otherlv_2, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:94:1: (otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:94:3: otherlv_3= 'BIMServer' ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) )
                    {
                    otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMain156); 

                        	newLeafNode(otherlv_3, grammarAccess.getMainAccess().getBIMServerKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( (lv_BIMServer_4_0= ruleBIMServerCredentials ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_BIMServer_4_0= ruleBIMServerCredentials )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_BIMServer_4_0= ruleBIMServerCredentials )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:3: lv_BIMServer_4_0= ruleBIMServerCredentials
                    {
                     
                    	        newCompositeNode(grammarAccess.getMainAccess().getBIMServerBIMServerCredentialsParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBIMServerCredentials_in_ruleMain177);
                    lv_BIMServer_4_0=ruleBIMServerCredentials();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMainRule());
                    	        }
                           		set(
                           			current, 
                           			"BIMServer",
                            		lv_BIMServer_4_0, 
                            		"BIMServerCredentials");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:116:4: (otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:116:6: otherlv_5= 'Lamp' otherlv_6= '{' ( (lv_Lamp_7_0= ruleLamp ) ) (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMain192); 

                        	newLeafNode(otherlv_5, grammarAccess.getMainAccess().getLampKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMain204); 

                        	newLeafNode(otherlv_6, grammarAccess.getMainAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:124:1: ( (lv_Lamp_7_0= ruleLamp ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_Lamp_7_0= ruleLamp )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:125:1: (lv_Lamp_7_0= ruleLamp )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:126:3: lv_Lamp_7_0= ruleLamp
                    {
                     
                    	        newCompositeNode(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLamp_in_ruleMain225);
                    lv_Lamp_7_0=ruleLamp();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMainRule());
                    	        }
                           		add(
                           			current, 
                           			"Lamp",
                            		lv_Lamp_7_0, 
                            		"Lamp");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:142:2: (otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:142:4: otherlv_8= ',' ( (lv_Lamp_9_0= ruleLamp ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMain238); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getMainAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:146:1: ( (lv_Lamp_9_0= ruleLamp ) )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:147:1: (lv_Lamp_9_0= ruleLamp )
                    	    {
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:147:1: (lv_Lamp_9_0= ruleLamp )
                    	    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:148:3: lv_Lamp_9_0= ruleLamp
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMainAccess().getLampLampParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleLamp_in_ruleMain259);
                    	    lv_Lamp_9_0=ruleLamp();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMainRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"Lamp",
                    	            		lv_Lamp_9_0, 
                    	            		"Lamp");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMain273); 

                        	newLeafNode(otherlv_10, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMain287); 

                	newLeafNode(otherlv_11, grammarAccess.getMainAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleBIMServerCredentials"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:180:1: entryRuleBIMServerCredentials returns [EObject current=null] : iv_ruleBIMServerCredentials= ruleBIMServerCredentials EOF ;
    public final EObject entryRuleBIMServerCredentials() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBIMServerCredentials = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:181:2: (iv_ruleBIMServerCredentials= ruleBIMServerCredentials EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:182:2: iv_ruleBIMServerCredentials= ruleBIMServerCredentials EOF
            {
             newCompositeNode(grammarAccess.getBIMServerCredentialsRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBIMServerCredentials_in_entryRuleBIMServerCredentials323);
            iv_ruleBIMServerCredentials=ruleBIMServerCredentials();

            state._fsp--;

             current =iv_ruleBIMServerCredentials; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBIMServerCredentials333); 

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
    // $ANTLR end "entryRuleBIMServerCredentials"


    // $ANTLR start "ruleBIMServerCredentials"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:189:1: ruleBIMServerCredentials returns [EObject current=null] : ( () otherlv_1= 'BIMServerCredentials' otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )? (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )? (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )? (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleBIMServerCredentials() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_address_4_0 = null;

        AntlrDatatypeRuleToken lv_port_6_0 = null;

        AntlrDatatypeRuleToken lv_projectName_8_0 = null;

        AntlrDatatypeRuleToken lv_userName_10_0 = null;

        AntlrDatatypeRuleToken lv_password_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:192:28: ( ( () otherlv_1= 'BIMServerCredentials' otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )? (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )? (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )? (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:1: ( () otherlv_1= 'BIMServerCredentials' otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )? (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )? (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )? (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:1: ( () otherlv_1= 'BIMServerCredentials' otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )? (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )? (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )? (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:2: () otherlv_1= 'BIMServerCredentials' otherlv_2= '{' (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )? (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )? (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )? (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )? (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:193:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:194:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleBIMServerCredentials379); 

                	newLeafNode(otherlv_1, grammarAccess.getBIMServerCredentialsAccess().getBIMServerCredentialsKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleBIMServerCredentials391); 

                	newLeafNode(otherlv_2, grammarAccess.getBIMServerCredentialsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:207:1: (otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:207:3: otherlv_3= 'address' ( (lv_address_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleBIMServerCredentials404); 

                        	newLeafNode(otherlv_3, grammarAccess.getBIMServerCredentialsAccess().getAddressKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:211:1: ( (lv_address_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_address_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_address_4_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:213:3: lv_address_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBIMServerCredentialsAccess().getAddressEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBIMServerCredentials425);
                    lv_address_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBIMServerCredentialsRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:229:4: (otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:229:6: otherlv_5= 'port' ( (lv_port_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleBIMServerCredentials440); 

                        	newLeafNode(otherlv_5, grammarAccess.getBIMServerCredentialsAccess().getPortKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:233:1: ( (lv_port_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_port_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:234:1: (lv_port_6_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:235:3: lv_port_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBIMServerCredentialsAccess().getPortEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBIMServerCredentials461);
                    lv_port_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBIMServerCredentialsRule());
                    	        }
                           		set(
                           			current, 
                           			"port",
                            		lv_port_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:251:4: (otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:251:6: otherlv_7= 'projectName' ( (lv_projectName_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleBIMServerCredentials476); 

                        	newLeafNode(otherlv_7, grammarAccess.getBIMServerCredentialsAccess().getProjectNameKeyword_5_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:255:1: ( (lv_projectName_8_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_projectName_8_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:256:1: (lv_projectName_8_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:257:3: lv_projectName_8_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBIMServerCredentialsAccess().getProjectNameEStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBIMServerCredentials497);
                    lv_projectName_8_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBIMServerCredentialsRule());
                    	        }
                           		set(
                           			current, 
                           			"projectName",
                            		lv_projectName_8_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:273:4: (otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:273:6: otherlv_9= 'userName' ( (lv_userName_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleBIMServerCredentials512); 

                        	newLeafNode(otherlv_9, grammarAccess.getBIMServerCredentialsAccess().getUserNameKeyword_6_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:277:1: ( (lv_userName_10_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_userName_10_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:278:1: (lv_userName_10_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:279:3: lv_userName_10_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBIMServerCredentialsAccess().getUserNameEStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBIMServerCredentials533);
                    lv_userName_10_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBIMServerCredentialsRule());
                    	        }
                           		set(
                           			current, 
                           			"userName",
                            		lv_userName_10_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:295:4: (otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:295:6: otherlv_11= 'password' ( (lv_password_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleBIMServerCredentials548); 

                        	newLeafNode(otherlv_11, grammarAccess.getBIMServerCredentialsAccess().getPasswordKeyword_7_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:299:1: ( (lv_password_12_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_password_12_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: (lv_password_12_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:3: lv_password_12_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getBIMServerCredentialsAccess().getPasswordEStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleBIMServerCredentials569);
                    lv_password_12_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBIMServerCredentialsRule());
                    	        }
                           		set(
                           			current, 
                           			"password",
                            		lv_password_12_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleBIMServerCredentials583); 

                	newLeafNode(otherlv_13, grammarAccess.getBIMServerCredentialsAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleBIMServerCredentials"


    // $ANTLR start "entryRuleLamp"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:329:1: entryRuleLamp returns [EObject current=null] : iv_ruleLamp= ruleLamp EOF ;
    public final EObject entryRuleLamp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLamp = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:330:2: (iv_ruleLamp= ruleLamp EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:331:2: iv_ruleLamp= ruleLamp EOF
            {
             newCompositeNode(grammarAccess.getLampRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLamp_in_entryRuleLamp619);
            iv_ruleLamp=ruleLamp();

            state._fsp--;

             current =iv_ruleLamp; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLamp629); 

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
    // $ANTLR end "entryRuleLamp"


    // $ANTLR start "ruleLamp"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:338:1: ruleLamp returns [EObject current=null] : ( () otherlv_1= 'Lamp' otherlv_2= '{' (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )? (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleLamp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_GlobalID_4_0 = null;

        AntlrDatatypeRuleToken lv_PredefinedType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:341:28: ( ( () otherlv_1= 'Lamp' otherlv_2= '{' (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )? (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:1: ( () otherlv_1= 'Lamp' otherlv_2= '{' (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )? (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:1: ( () otherlv_1= 'Lamp' otherlv_2= '{' (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )? (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:2: () otherlv_1= 'Lamp' otherlv_2= '{' (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )? (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:342:2: ()
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:343:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLampAccess().getLampAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLamp675); 

                	newLeafNode(otherlv_1, grammarAccess.getLampAccess().getLampKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLamp687); 

                	newLeafNode(otherlv_2, grammarAccess.getLampAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:356:1: (otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:356:3: otherlv_3= 'GlobalID' ( (lv_GlobalID_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleLamp700); 

                        	newLeafNode(otherlv_3, grammarAccess.getLampAccess().getGlobalIDKeyword_3_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:360:1: ( (lv_GlobalID_4_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_GlobalID_4_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:361:1: (lv_GlobalID_4_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:362:3: lv_GlobalID_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLampAccess().getGlobalIDEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLamp721);
                    lv_GlobalID_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLampRule());
                    	        }
                           		set(
                           			current, 
                           			"GlobalID",
                            		lv_GlobalID_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:378:4: (otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:378:6: otherlv_5= 'PredefinedType' ( (lv_PredefinedType_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLamp736); 

                        	newLeafNode(otherlv_5, grammarAccess.getLampAccess().getPredefinedTypeKeyword_4_0());
                        
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:382:1: ( (lv_PredefinedType_6_0= ruleEString ) )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:383:1: (lv_PredefinedType_6_0= ruleEString )
                    {
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:383:1: (lv_PredefinedType_6_0= ruleEString )
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:384:3: lv_PredefinedType_6_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getLampAccess().getPredefinedTypeEStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLamp757);
                    lv_PredefinedType_6_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLampRule());
                    	        }
                           		set(
                           			current, 
                           			"PredefinedType",
                            		lv_PredefinedType_6_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLamp771); 

                	newLeafNode(otherlv_7, grammarAccess.getLampAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLamp"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:412:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:413:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:414:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString808);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString819); 

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
    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:421:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:425:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString859); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl1/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:433:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString885); 

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMain_in_entryRuleMain75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMain85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMain131 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMain143 = new BitSet(new long[]{0x0000000000016000L});
        public static final BitSet FOLLOW_13_in_ruleMain156 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_ruleBIMServerCredentials_in_ruleMain177 = new BitSet(new long[]{0x0000000000014000L});
        public static final BitSet FOLLOW_14_in_ruleMain192 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMain204 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleLamp_in_ruleMain225 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMain238 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleLamp_in_ruleMain259 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMain273 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMain287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBIMServerCredentials_in_entryRuleBIMServerCredentials323 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBIMServerCredentials333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleBIMServerCredentials379 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleBIMServerCredentials391 = new BitSet(new long[]{0x00000000007D0000L});
        public static final BitSet FOLLOW_18_in_ruleBIMServerCredentials404 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBIMServerCredentials425 = new BitSet(new long[]{0x0000000000790000L});
        public static final BitSet FOLLOW_19_in_ruleBIMServerCredentials440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBIMServerCredentials461 = new BitSet(new long[]{0x0000000000710000L});
        public static final BitSet FOLLOW_20_in_ruleBIMServerCredentials476 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBIMServerCredentials497 = new BitSet(new long[]{0x0000000000610000L});
        public static final BitSet FOLLOW_21_in_ruleBIMServerCredentials512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBIMServerCredentials533 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_22_in_ruleBIMServerCredentials548 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleBIMServerCredentials569 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleBIMServerCredentials583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLamp_in_entryRuleLamp619 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLamp629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleLamp675 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLamp687 = new BitSet(new long[]{0x0000000001810000L});
        public static final BitSet FOLLOW_23_in_ruleLamp700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLamp721 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_24_in_ruleLamp736 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLamp757 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLamp771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString808 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString885 = new BitSet(new long[]{0x0000000000000002L});
    }


}