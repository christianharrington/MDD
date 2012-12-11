/*
* generated by Xtext
*/

package org.xtext.pipes.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PipesGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWallsKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cElementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cElementsWallRuleParserRuleCall_2_0 = (RuleCall)cElementsAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cAndKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cElementsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cElementsWallRuleParserRuleCall_3_1_0 = (RuleCall)cElementsAssignment_3_1.eContents().get(0);
		private final Keyword cOpeningsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsOpeningParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cAndKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cElementsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cElementsOpeningParserRuleCall_6_1_0 = (RuleCall)cElementsAssignment_6_1.eContents().get(0);
		private final Keyword cPipesKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cElementsAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cElementsFlowSegmentParserRuleCall_8_0 = (RuleCall)cElementsAssignment_8.eContents().get(0);
		private final Group cGroup_9 = (Group)cGroup.eContents().get(9);
		private final Keyword cAndKeyword_9_0 = (Keyword)cGroup_9.eContents().get(0);
		private final Assignment cElementsAssignment_9_1 = (Assignment)cGroup_9.eContents().get(1);
		private final RuleCall cElementsFlowSegmentParserRuleCall_9_1_0 = (RuleCall)cElementsAssignment_9_1.eContents().get(0);
		
		//Model:
		//	{Model} "Walls" elements+=WallRule ("and" elements+=WallRule)* "Openings" elements+=Opening ("and" elements+=Opening)*
		//	"Pipes" elements+=FlowSegment ("and" elements+=FlowSegment)*;
		public ParserRule getRule() { return rule; }

		//{Model} "Walls" elements+=WallRule ("and" elements+=WallRule)* "Openings" elements+=Opening ("and" elements+=Opening)*
		//"Pipes" elements+=FlowSegment ("and" elements+=FlowSegment)*
		public Group getGroup() { return cGroup; }

		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }

		//"Walls"
		public Keyword getWallsKeyword_1() { return cWallsKeyword_1; }

		//elements+=WallRule
		public Assignment getElementsAssignment_2() { return cElementsAssignment_2; }

		//WallRule
		public RuleCall getElementsWallRuleParserRuleCall_2_0() { return cElementsWallRuleParserRuleCall_2_0; }

		//("and" elements+=WallRule)*
		public Group getGroup_3() { return cGroup_3; }

		//"and"
		public Keyword getAndKeyword_3_0() { return cAndKeyword_3_0; }

		//elements+=WallRule
		public Assignment getElementsAssignment_3_1() { return cElementsAssignment_3_1; }

		//WallRule
		public RuleCall getElementsWallRuleParserRuleCall_3_1_0() { return cElementsWallRuleParserRuleCall_3_1_0; }

		//"Openings"
		public Keyword getOpeningsKeyword_4() { return cOpeningsKeyword_4; }

		//elements+=Opening
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//Opening
		public RuleCall getElementsOpeningParserRuleCall_5_0() { return cElementsOpeningParserRuleCall_5_0; }

		//("and" elements+=Opening)*
		public Group getGroup_6() { return cGroup_6; }

		//"and"
		public Keyword getAndKeyword_6_0() { return cAndKeyword_6_0; }

		//elements+=Opening
		public Assignment getElementsAssignment_6_1() { return cElementsAssignment_6_1; }

		//Opening
		public RuleCall getElementsOpeningParserRuleCall_6_1_0() { return cElementsOpeningParserRuleCall_6_1_0; }

		//"Pipes"
		public Keyword getPipesKeyword_7() { return cPipesKeyword_7; }

		//elements+=FlowSegment
		public Assignment getElementsAssignment_8() { return cElementsAssignment_8; }

		//FlowSegment
		public RuleCall getElementsFlowSegmentParserRuleCall_8_0() { return cElementsFlowSegmentParserRuleCall_8_0; }

		//("and" elements+=FlowSegment)*
		public Group getGroup_9() { return cGroup_9; }

		//"and"
		public Keyword getAndKeyword_9_0() { return cAndKeyword_9_0; }

		//elements+=FlowSegment
		public Assignment getElementsAssignment_9_1() { return cElementsAssignment_9_1; }

		//FlowSegment
		public RuleCall getElementsFlowSegmentParserRuleCall_9_1_0() { return cElementsFlowSegmentParserRuleCall_9_1_0; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////terminal PID: ( !('\\'|'"') )*;
		//EString returns ecore::EString:
		//	ID | STRING;
		public ParserRule getRule() { return rule; }

		//ID | STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}

	public class WallRuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "WallRule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWallKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNameKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cElementNameEStringParserRuleCall_2_1_0 = (RuleCall)cElementNameAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cPlacementKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPlacementAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPlacementLocalPlacementParserRuleCall_5_0 = (RuleCall)cPlacementAssignment_5.eContents().get(0);
		
		//WallRule returns Wall:
		//	"Wall" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
		//	placement=LocalPlacement;
		public ParserRule getRule() { return rule; }

		//"Wall" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement" placement=LocalPlacement
		public Group getGroup() { return cGroup; }

		//"Wall"
		public Keyword getWallKeyword_0() { return cWallKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("Name" elementName=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//"Name"
		public Keyword getNameKeyword_2_0() { return cNameKeyword_2_0; }

		//elementName=EString
		public Assignment getElementNameAssignment_2_1() { return cElementNameAssignment_2_1; }

		//EString
		public RuleCall getElementNameEStringParserRuleCall_2_1_0() { return cElementNameEStringParserRuleCall_2_1_0; }

		//("Description" Description=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"Description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//Description=EString
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_1_0() { return cDescriptionEStringParserRuleCall_3_1_0; }

		//"Placement"
		public Keyword getPlacementKeyword_4() { return cPlacementKeyword_4; }

		//placement=LocalPlacement
		public Assignment getPlacementAssignment_5() { return cPlacementAssignment_5; }

		//LocalPlacement
		public RuleCall getPlacementLocalPlacementParserRuleCall_5_0() { return cPlacementLocalPlacementParserRuleCall_5_0; }
	}

	public class OpeningElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Opening");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOpeningKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNameKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cElementNameEStringParserRuleCall_2_1_0 = (RuleCall)cElementNameAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cPlacementKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPlacementAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPlacementLocalPlacementParserRuleCall_5_0 = (RuleCall)cPlacementAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cWallsKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cWallsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cWallsWallCrossReference_6_1_0 = (CrossReference)cWallsAssignment_6_1.eContents().get(0);
		private final RuleCall cWallsWallIDTerminalRuleCall_6_1_0_1 = (RuleCall)cWallsWallCrossReference_6_1_0.eContents().get(1);
		private final Group cGroup_6_2 = (Group)cGroup_6.eContents().get(2);
		private final Keyword cCommaKeyword_6_2_0 = (Keyword)cGroup_6_2.eContents().get(0);
		private final Assignment cWallsAssignment_6_2_1 = (Assignment)cGroup_6_2.eContents().get(1);
		private final CrossReference cWallsWallCrossReference_6_2_1_0 = (CrossReference)cWallsAssignment_6_2_1.eContents().get(0);
		private final RuleCall cWallsWallIDTerminalRuleCall_6_2_1_0_1 = (RuleCall)cWallsWallCrossReference_6_2_1_0.eContents().get(1);
		
		//Opening:
		//	"Opening" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
		//	placement=LocalPlacement ("Walls" walls+=[Wall] ("," walls+=[Wall])*)?;
		public ParserRule getRule() { return rule; }

		//"Opening" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
		//placement=LocalPlacement ("Walls" walls+=[Wall] ("," walls+=[Wall])*)?
		public Group getGroup() { return cGroup; }

		//"Opening"
		public Keyword getOpeningKeyword_0() { return cOpeningKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("Name" elementName=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//"Name"
		public Keyword getNameKeyword_2_0() { return cNameKeyword_2_0; }

		//elementName=EString
		public Assignment getElementNameAssignment_2_1() { return cElementNameAssignment_2_1; }

		//EString
		public RuleCall getElementNameEStringParserRuleCall_2_1_0() { return cElementNameEStringParserRuleCall_2_1_0; }

		//("Description" Description=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"Description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//Description=EString
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_1_0() { return cDescriptionEStringParserRuleCall_3_1_0; }

		//"Placement"
		public Keyword getPlacementKeyword_4() { return cPlacementKeyword_4; }

		//placement=LocalPlacement
		public Assignment getPlacementAssignment_5() { return cPlacementAssignment_5; }

		//LocalPlacement
		public RuleCall getPlacementLocalPlacementParserRuleCall_5_0() { return cPlacementLocalPlacementParserRuleCall_5_0; }

		//("Walls" walls+=[Wall] ("," walls+=[Wall])*)?
		public Group getGroup_6() { return cGroup_6; }

		//"Walls"
		public Keyword getWallsKeyword_6_0() { return cWallsKeyword_6_0; }

		//walls+=[Wall]
		public Assignment getWallsAssignment_6_1() { return cWallsAssignment_6_1; }

		//[Wall]
		public CrossReference getWallsWallCrossReference_6_1_0() { return cWallsWallCrossReference_6_1_0; }

		//ID
		public RuleCall getWallsWallIDTerminalRuleCall_6_1_0_1() { return cWallsWallIDTerminalRuleCall_6_1_0_1; }

		//("," walls+=[Wall])*
		public Group getGroup_6_2() { return cGroup_6_2; }

		//","
		public Keyword getCommaKeyword_6_2_0() { return cCommaKeyword_6_2_0; }

		//walls+=[Wall]
		public Assignment getWallsAssignment_6_2_1() { return cWallsAssignment_6_2_1; }

		//[Wall]
		public CrossReference getWallsWallCrossReference_6_2_1_0() { return cWallsWallCrossReference_6_2_1_0; }

		//ID
		public RuleCall getWallsWallIDTerminalRuleCall_6_2_1_0_1() { return cWallsWallIDTerminalRuleCall_6_2_1_0_1; }
	}

	public class FlowSegmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FlowSegment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPipeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNameKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cElementNameAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cElementNameEStringParserRuleCall_2_1_0 = (RuleCall)cElementNameAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionEStringParserRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cPlacementKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cPlacementAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cPlacementLocalPlacementParserRuleCall_5_0 = (RuleCall)cPlacementAssignment_5.eContents().get(0);
		
		//FlowSegment:
		//	"Pipe" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
		//	placement=LocalPlacement;
		public ParserRule getRule() { return rule; }

		//"Pipe" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement" placement=LocalPlacement
		public Group getGroup() { return cGroup; }

		//"Pipe"
		public Keyword getPipeKeyword_0() { return cPipeKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("Name" elementName=EString)?
		public Group getGroup_2() { return cGroup_2; }

		//"Name"
		public Keyword getNameKeyword_2_0() { return cNameKeyword_2_0; }

		//elementName=EString
		public Assignment getElementNameAssignment_2_1() { return cElementNameAssignment_2_1; }

		//EString
		public RuleCall getElementNameEStringParserRuleCall_2_1_0() { return cElementNameEStringParserRuleCall_2_1_0; }

		//("Description" Description=EString)?
		public Group getGroup_3() { return cGroup_3; }

		//"Description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//Description=EString
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//EString
		public RuleCall getDescriptionEStringParserRuleCall_3_1_0() { return cDescriptionEStringParserRuleCall_3_1_0; }

		//"Placement"
		public Keyword getPlacementKeyword_4() { return cPlacementKeyword_4; }

		//placement=LocalPlacement
		public Assignment getPlacementAssignment_5() { return cPlacementAssignment_5; }

		//LocalPlacement
		public RuleCall getPlacementLocalPlacementParserRuleCall_5_0() { return cPlacementLocalPlacementParserRuleCall_5_0; }
	}

	public class LocalPlacementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LocalPlacement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cLocalPlacementAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRelativeToKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRelativeToAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRelativeToLocalPlacementParserRuleCall_2_1_0 = (RuleCall)cRelativeToAssignment_2_1.eContents().get(0);
		private final Keyword cAxis2Placement3dKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAxis2placement3dAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAxis2placement3dAxis2Placement3DParserRuleCall_4_0 = (RuleCall)cAxis2placement3dAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//LocalPlacement:
		//	{LocalPlacement} "{" ("RelativeTo" relativeTo=LocalPlacement)? "Axis2Placement3d" axis2placement3d=Axis2Placement3D
		//	"}";
		public ParserRule getRule() { return rule; }

		//{LocalPlacement} "{" ("RelativeTo" relativeTo=LocalPlacement)? "Axis2Placement3d" axis2placement3d=Axis2Placement3D "}"
		public Group getGroup() { return cGroup; }

		//{LocalPlacement}
		public Action getLocalPlacementAction_0() { return cLocalPlacementAction_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//("RelativeTo" relativeTo=LocalPlacement)?
		public Group getGroup_2() { return cGroup_2; }

		//"RelativeTo"
		public Keyword getRelativeToKeyword_2_0() { return cRelativeToKeyword_2_0; }

		//relativeTo=LocalPlacement
		public Assignment getRelativeToAssignment_2_1() { return cRelativeToAssignment_2_1; }

		//LocalPlacement
		public RuleCall getRelativeToLocalPlacementParserRuleCall_2_1_0() { return cRelativeToLocalPlacementParserRuleCall_2_1_0; }

		//"Axis2Placement3d"
		public Keyword getAxis2Placement3dKeyword_3() { return cAxis2Placement3dKeyword_3; }

		//axis2placement3d=Axis2Placement3D
		public Assignment getAxis2placement3dAssignment_4() { return cAxis2placement3dAssignment_4; }

		//Axis2Placement3D
		public RuleCall getAxis2placement3dAxis2Placement3DParserRuleCall_4_0() { return cAxis2placement3dAxis2Placement3DParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class Axis2Placement3DElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Axis2Placement3D");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cCartesianKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCartesianXAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCartesianXEDoubleParserRuleCall_3_0 = (RuleCall)cCartesianXAssignment_3.eContents().get(0);
		private final Keyword cCommaKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCartesianYAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCartesianYEDoubleParserRuleCall_5_0 = (RuleCall)cCartesianYAssignment_5.eContents().get(0);
		private final Keyword cCommaKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cCartesianZAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cCartesianZEDoubleParserRuleCall_7_0 = (RuleCall)cCartesianZAssignment_7.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cAxisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cAxisAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cAxisDirectionParserRuleCall_10_0 = (RuleCall)cAxisAssignment_10.eContents().get(0);
		private final Keyword cRefDirectionKeyword_11 = (Keyword)cGroup.eContents().get(11);
		private final Assignment cRefDirectionAssignment_12 = (Assignment)cGroup.eContents().get(12);
		private final RuleCall cRefDirectionDirectionParserRuleCall_12_0 = (RuleCall)cRefDirectionAssignment_12.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_13 = (Keyword)cGroup.eContents().get(13);
		
		//Axis2Placement3D:
		//	"{" "Cartesian" "(" cartesianX=EDouble "," cartesianY=EDouble "," cartesianZ=EDouble ")" "Axis" axis=Direction
		//	"RefDirection" refDirection=Direction "}";
		public ParserRule getRule() { return rule; }

		//"{" "Cartesian" "(" cartesianX=EDouble "," cartesianY=EDouble "," cartesianZ=EDouble ")" "Axis" axis=Direction
		//"RefDirection" refDirection=Direction "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//"Cartesian"
		public Keyword getCartesianKeyword_1() { return cCartesianKeyword_1; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//cartesianX=EDouble
		public Assignment getCartesianXAssignment_3() { return cCartesianXAssignment_3; }

		//EDouble
		public RuleCall getCartesianXEDoubleParserRuleCall_3_0() { return cCartesianXEDoubleParserRuleCall_3_0; }

		//","
		public Keyword getCommaKeyword_4() { return cCommaKeyword_4; }

		//cartesianY=EDouble
		public Assignment getCartesianYAssignment_5() { return cCartesianYAssignment_5; }

		//EDouble
		public RuleCall getCartesianYEDoubleParserRuleCall_5_0() { return cCartesianYEDoubleParserRuleCall_5_0; }

		//","
		public Keyword getCommaKeyword_6() { return cCommaKeyword_6; }

		//cartesianZ=EDouble
		public Assignment getCartesianZAssignment_7() { return cCartesianZAssignment_7; }

		//EDouble
		public RuleCall getCartesianZEDoubleParserRuleCall_7_0() { return cCartesianZEDoubleParserRuleCall_7_0; }

		//")"
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }

		//"Axis"
		public Keyword getAxisKeyword_9() { return cAxisKeyword_9; }

		//axis=Direction
		public Assignment getAxisAssignment_10() { return cAxisAssignment_10; }

		//Direction
		public RuleCall getAxisDirectionParserRuleCall_10_0() { return cAxisDirectionParserRuleCall_10_0; }

		//"RefDirection"
		public Keyword getRefDirectionKeyword_11() { return cRefDirectionKeyword_11; }

		//refDirection=Direction
		public Assignment getRefDirectionAssignment_12() { return cRefDirectionAssignment_12; }

		//Direction
		public RuleCall getRefDirectionDirectionParserRuleCall_12_0() { return cRefDirectionDirectionParserRuleCall_12_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_13() { return cRightCurlyBracketKeyword_13; }
	}

	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble returns ecore::EDouble:
		//	"-"? INT? "." INT (("E" | "e") "-"? INT)?;
		public ParserRule getRule() { return rule; }

		//"-"? INT? "." INT (("E" | "e") "-"? INT)?
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }

		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }

		//(("E" | "e") "-"? INT)?
		public Group getGroup_4() { return cGroup_4; }

		//"E" | "e"
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }

		//"E"
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }

		//"e"
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }

		//"-"?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}

	public class DirectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Direction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cXAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cXEDoubleParserRuleCall_1_0 = (RuleCall)cXAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cYAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cYEDoubleParserRuleCall_3_0 = (RuleCall)cYAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cZAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cZEDoubleParserRuleCall_4_1_0 = (RuleCall)cZAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Direction:
		//	"(" x=EDouble "," y=EDouble ("," z=EDouble)? ")";
		public ParserRule getRule() { return rule; }

		//"(" x=EDouble "," y=EDouble ("," z=EDouble)? ")"
		public Group getGroup() { return cGroup; }

		//"("
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }

		//x=EDouble
		public Assignment getXAssignment_1() { return cXAssignment_1; }

		//EDouble
		public RuleCall getXEDoubleParserRuleCall_1_0() { return cXEDoubleParserRuleCall_1_0; }

		//","
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }

		//y=EDouble
		public Assignment getYAssignment_3() { return cYAssignment_3; }

		//EDouble
		public RuleCall getYEDoubleParserRuleCall_3_0() { return cYEDoubleParserRuleCall_3_0; }

		//("," z=EDouble)?
		public Group getGroup_4() { return cGroup_4; }

		//","
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }

		//z=EDouble
		public Assignment getZAssignment_4_1() { return cZAssignment_4_1; }

		//EDouble
		public RuleCall getZEDoubleParserRuleCall_4_1_0() { return cZEDoubleParserRuleCall_4_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	
	
	private ModelElements pModel;
	private EStringElements pEString;
	private WallRuleElements pWallRule;
	private OpeningElements pOpening;
	private FlowSegmentElements pFlowSegment;
	private LocalPlacementElements pLocalPlacement;
	private Axis2Placement3DElements pAxis2Placement3D;
	private EDoubleElements pEDouble;
	private DirectionElements pDirection;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public PipesGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.pipes.Pipes".equals(grammar.getName())) {
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

	
	//Model:
	//	{Model} "Walls" elements+=WallRule ("and" elements+=WallRule)* "Openings" elements+=Opening ("and" elements+=Opening)*
	//	"Pipes" elements+=FlowSegment ("and" elements+=FlowSegment)*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	////terminal PID: ( !('\\'|'"') )*;
	//EString returns ecore::EString:
	//	ID | STRING;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//WallRule returns Wall:
	//	"Wall" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
	//	placement=LocalPlacement;
	public WallRuleElements getWallRuleAccess() {
		return (pWallRule != null) ? pWallRule : (pWallRule = new WallRuleElements());
	}
	
	public ParserRule getWallRuleRule() {
		return getWallRuleAccess().getRule();
	}

	//Opening:
	//	"Opening" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
	//	placement=LocalPlacement ("Walls" walls+=[Wall] ("," walls+=[Wall])*)?;
	public OpeningElements getOpeningAccess() {
		return (pOpening != null) ? pOpening : (pOpening = new OpeningElements());
	}
	
	public ParserRule getOpeningRule() {
		return getOpeningAccess().getRule();
	}

	//FlowSegment:
	//	"Pipe" name=ID ("Name" elementName=EString)? ("Description" Description=EString)? "Placement"
	//	placement=LocalPlacement;
	public FlowSegmentElements getFlowSegmentAccess() {
		return (pFlowSegment != null) ? pFlowSegment : (pFlowSegment = new FlowSegmentElements());
	}
	
	public ParserRule getFlowSegmentRule() {
		return getFlowSegmentAccess().getRule();
	}

	//LocalPlacement:
	//	{LocalPlacement} "{" ("RelativeTo" relativeTo=LocalPlacement)? "Axis2Placement3d" axis2placement3d=Axis2Placement3D
	//	"}";
	public LocalPlacementElements getLocalPlacementAccess() {
		return (pLocalPlacement != null) ? pLocalPlacement : (pLocalPlacement = new LocalPlacementElements());
	}
	
	public ParserRule getLocalPlacementRule() {
		return getLocalPlacementAccess().getRule();
	}

	//Axis2Placement3D:
	//	"{" "Cartesian" "(" cartesianX=EDouble "," cartesianY=EDouble "," cartesianZ=EDouble ")" "Axis" axis=Direction
	//	"RefDirection" refDirection=Direction "}";
	public Axis2Placement3DElements getAxis2Placement3DAccess() {
		return (pAxis2Placement3D != null) ? pAxis2Placement3D : (pAxis2Placement3D = new Axis2Placement3DElements());
	}
	
	public ParserRule getAxis2Placement3DRule() {
		return getAxis2Placement3DAccess().getRule();
	}

	//EDouble returns ecore::EDouble:
	//	"-"? INT? "." INT (("E" | "e") "-"? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return (pEDouble != null) ? pEDouble : (pEDouble = new EDoubleElements());
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}

	//Direction:
	//	"(" x=EDouble "," y=EDouble ("," z=EDouble)? ")";
	public DirectionElements getDirectionAccess() {
		return (pDirection != null) ? pDirection : (pDirection = new DirectionElements());
	}
	
	public ParserRule getDirectionRule() {
		return getDirectionAccess().getRule();
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
