/*
* generated by Xtext
*/

package org.xtext.example.light.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class LightGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Main");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMainAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMainKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cBIMServerKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cBIMServerAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cBIMServerBIMServerCredentialsParserRuleCall_3_1_0 = (RuleCall)cBIMServerAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLampKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cLampAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cLampLampParserRuleCall_4_2_0 = (RuleCall)cLampAssignment_4_2.eContents().get(0);
		private final Group cGroup_4_3 = (Group)cGroup_4.eContents().get(3);
		private final Keyword cCommaKeyword_4_3_0 = (Keyword)cGroup_4_3.eContents().get(0);
		private final Assignment cLampAssignment_4_3_1 = (Assignment)cGroup_4_3.eContents().get(1);
		private final RuleCall cLampLampParserRuleCall_4_3_1_0 = (RuleCall)cLampAssignment_4_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4_4 = (Keyword)cGroup_4.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Main:
		//	{Main} "Main" "{" ("BIMServer" BIMServer=BIMServerCredentials)? ("Lamp" "{" Lamp+=Lamp ("," Lamp+=Lamp)* "}")? "}";
		public ParserRule getRule() { return rule; }

		//{Main} "Main" "{" ("BIMServer" BIMServer=BIMServerCredentials)? ("Lamp" "{" Lamp+=Lamp ("," Lamp+=Lamp)* "}")? "}"
		public Group getGroup() { return cGroup; }

		//{Main}
		public Action getMainAction_0() { return cMainAction_0; }

		//"Main"
		public Keyword getMainKeyword_1() { return cMainKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("BIMServer" BIMServer=BIMServerCredentials)?
		public Group getGroup_3() { return cGroup_3; }

		//"BIMServer"
		public Keyword getBIMServerKeyword_3_0() { return cBIMServerKeyword_3_0; }

		//BIMServer=BIMServerCredentials
		public Assignment getBIMServerAssignment_3_1() { return cBIMServerAssignment_3_1; }

		//BIMServerCredentials
		public RuleCall getBIMServerBIMServerCredentialsParserRuleCall_3_1_0() { return cBIMServerBIMServerCredentialsParserRuleCall_3_1_0; }

		//("Lamp" "{" Lamp+=Lamp ("," Lamp+=Lamp)* "}")?
		public Group getGroup_4() { return cGroup_4; }

		//"Lamp"
		public Keyword getLampKeyword_4_0() { return cLampKeyword_4_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4_1() { return cLeftCurlyBracketKeyword_4_1; }

		//Lamp+=Lamp
		public Assignment getLampAssignment_4_2() { return cLampAssignment_4_2; }

		//Lamp
		public RuleCall getLampLampParserRuleCall_4_2_0() { return cLampLampParserRuleCall_4_2_0; }

		//("," Lamp+=Lamp)*
		public Group getGroup_4_3() { return cGroup_4_3; }

		//","
		public Keyword getCommaKeyword_4_3_0() { return cCommaKeyword_4_3_0; }

		//Lamp+=Lamp
		public Assignment getLampAssignment_4_3_1() { return cLampAssignment_4_3_1; }

		//Lamp
		public RuleCall getLampLampParserRuleCall_4_3_1_0() { return cLampLampParserRuleCall_4_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4_4() { return cRightCurlyBracketKeyword_4_4; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class BIMServerCredentialsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BIMServerCredentials");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cBIMServerCredentialsAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cBIMServerCredentialsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAddressKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAddressAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAddressEStringParserRuleCall_3_1_0 = (RuleCall)cAddressAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPortKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPortAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPortEStringParserRuleCall_4_1_0 = (RuleCall)cPortAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cProjectNameKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cProjectNameAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cProjectNameEStringParserRuleCall_5_1_0 = (RuleCall)cProjectNameAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cUserNameKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cUserNameAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cUserNameEStringParserRuleCall_6_1_0 = (RuleCall)cUserNameAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cPasswordKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cPasswordAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cPasswordEStringParserRuleCall_7_1_0 = (RuleCall)cPasswordAssignment_7_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//BIMServerCredentials:
		//	{BIMServerCredentials} "BIMServerCredentials" "{" ("address" address=EString)? ("port" port=EString)? ("projectName"
		//	projectName=EString)? ("userName" userName=EString)? ("password" password=EString)? "}";
		public ParserRule getRule() { return rule; }

		//{BIMServerCredentials} "BIMServerCredentials" "{" ("address" address=EString)? ("port" port=EString)? ("projectName"
		//projectName=EString)? ("userName" userName=EString)? ("password" password=EString)? "}"
		public Group getGroup() { return cGroup; }

		//{BIMServerCredentials}
		public Action getBIMServerCredentialsAction_0() { return cBIMServerCredentialsAction_0; }

		//"BIMServerCredentials"
		public Keyword getBIMServerCredentialsKeyword_1() { return cBIMServerCredentialsKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("address" address=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"address"
		public Keyword getAddressKeyword_3_0() { return cAddressKeyword_3_0; }

		//address=EString
		public Assignment getAddressAssignment_3_1() { return cAddressAssignment_3_1; }

		//EString
		public RuleCall getAddressEStringParserRuleCall_3_1_0() { return cAddressEStringParserRuleCall_3_1_0; }

		//("port" port=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"port"
		public Keyword getPortKeyword_4_0() { return cPortKeyword_4_0; }

		//port=EString
		public Assignment getPortAssignment_4_1() { return cPortAssignment_4_1; }

		//EString
		public RuleCall getPortEStringParserRuleCall_4_1_0() { return cPortEStringParserRuleCall_4_1_0; }

		//("projectName" projectName=EString)?
		public Group getGroup_5() { return cGroup_5; }

		//"projectName"
		public Keyword getProjectNameKeyword_5_0() { return cProjectNameKeyword_5_0; }

		//projectName=EString
		public Assignment getProjectNameAssignment_5_1() { return cProjectNameAssignment_5_1; }

		//EString
		public RuleCall getProjectNameEStringParserRuleCall_5_1_0() { return cProjectNameEStringParserRuleCall_5_1_0; }

		//("userName" userName=EString)?
		public Group getGroup_6() { return cGroup_6; }

		//"userName"
		public Keyword getUserNameKeyword_6_0() { return cUserNameKeyword_6_0; }

		//userName=EString
		public Assignment getUserNameAssignment_6_1() { return cUserNameAssignment_6_1; }

		//EString
		public RuleCall getUserNameEStringParserRuleCall_6_1_0() { return cUserNameEStringParserRuleCall_6_1_0; }

		//("password" password=EString)?
		public Group getGroup_7() { return cGroup_7; }

		//"password"
		public Keyword getPasswordKeyword_7_0() { return cPasswordKeyword_7_0; }

		//password=EString
		public Assignment getPasswordAssignment_7_1() { return cPasswordAssignment_7_1; }

		//EString
		public RuleCall getPasswordEStringParserRuleCall_7_1_0() { return cPasswordEStringParserRuleCall_7_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}

	public class LampElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Lamp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLampAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLampKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cGlobalIDKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cGlobalIDAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cGlobalIDEStringParserRuleCall_3_1_0 = (RuleCall)cGlobalIDAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPredefinedTypeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPredefinedTypeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cPredefinedTypeEStringParserRuleCall_4_1_0 = (RuleCall)cPredefinedTypeAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Lamp:
		//	{Lamp} "Lamp" "{" ("GlobalID" GlobalID=EString)? ("PredefinedType" PredefinedType=EString)? "}";
		public ParserRule getRule() { return rule; }

		//{Lamp} "Lamp" "{" ("GlobalID" GlobalID=EString)? ("PredefinedType" PredefinedType=EString)? "}"
		public Group getGroup() { return cGroup; }

		//{Lamp}
		public Action getLampAction_0() { return cLampAction_0; }

		//"Lamp"
		public Keyword getLampKeyword_1() { return cLampKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("GlobalID" GlobalID=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"GlobalID"
		public Keyword getGlobalIDKeyword_3_0() { return cGlobalIDKeyword_3_0; }

		//GlobalID=EString
		public Assignment getGlobalIDAssignment_3_1() { return cGlobalIDAssignment_3_1; }

		//EString
		public RuleCall getGlobalIDEStringParserRuleCall_3_1_0() { return cGlobalIDEStringParserRuleCall_3_1_0; }

		//("PredefinedType" PredefinedType=EString)?
		public Group getGroup_4() { return cGroup_4; }

		//"PredefinedType"
		public Keyword getPredefinedTypeKeyword_4_0() { return cPredefinedTypeKeyword_4_0; }

		//PredefinedType=EString
		public Assignment getPredefinedTypeAssignment_4_1() { return cPredefinedTypeAssignment_4_1; }

		//EString
		public RuleCall getPredefinedTypeEStringParserRuleCall_4_1_0() { return cPredefinedTypeEStringParserRuleCall_4_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private MainElements pMain;
	private BIMServerCredentialsElements pBIMServerCredentials;
	private LampElements pLamp;
	private EStringElements pEString;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public LightGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.light.Light".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Main:
	//	{Main} "Main" "{" ("BIMServer" BIMServer=BIMServerCredentials)? ("Lamp" "{" Lamp+=Lamp ("," Lamp+=Lamp)* "}")? "}";
	public MainElements getMainAccess() {
		return (pMain != null) ? pMain : (pMain = new MainElements());
	}
	
	public ParserRule getMainRule() {
		return getMainAccess().getRule();
	}

	//BIMServerCredentials:
	//	{BIMServerCredentials} "BIMServerCredentials" "{" ("address" address=EString)? ("port" port=EString)? ("projectName"
	//	projectName=EString)? ("userName" userName=EString)? ("password" password=EString)? "}";
	public BIMServerCredentialsElements getBIMServerCredentialsAccess() {
		return (pBIMServerCredentials != null) ? pBIMServerCredentials : (pBIMServerCredentials = new BIMServerCredentialsElements());
	}
	
	public ParserRule getBIMServerCredentialsRule() {
		return getBIMServerCredentialsAccess().getRule();
	}

	//Lamp:
	//	{Lamp} "Lamp" "{" ("GlobalID" GlobalID=EString)? ("PredefinedType" PredefinedType=EString)? "}";
	public LampElements getLampAccess() {
		return (pLamp != null) ? pLamp : (pLamp = new LampElements());
	}
	
	public ParserRule getLampRule() {
		return getLampAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
