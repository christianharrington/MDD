/*
* generated by Xtext
*/
grammar InternalPipes;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.pipes.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getModelAccess().getModelAction_0(),
            $current);
    }
)	otherlv_1='Walls' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getWallsKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_2_0()); 
	    }
		lv_elements_2_0=ruleWallRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_2_0, 
        		"WallRule");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_3='and' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getModelAccess().getAndKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsWallRuleParserRuleCall_3_1_0()); 
	    }
		lv_elements_4_0=ruleWallRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_4_0, 
        		"WallRule");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_5='Openings' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getModelAccess().getOpeningsKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_5_0()); 
	    }
		lv_elements_6_0=ruleOpening		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_6_0, 
        		"Opening");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_7='and' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModelAccess().getAndKeyword_6_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsOpeningParserRuleCall_6_1_0()); 
	    }
		lv_elements_8_0=ruleOpening		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_8_0, 
        		"Opening");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_9='Pipes' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getModelAccess().getPipesKeyword_7());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_8_0()); 
	    }
		lv_elements_10_0=ruleFlowSegment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_10_0, 
        		"FlowSegment");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_11='and' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getModelAccess().getAndKeyword_9_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getElementsFlowSegmentParserRuleCall_9_1_0()); 
	    }
		lv_elements_12_0=ruleFlowSegment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_12_0, 
        		"FlowSegment");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleWallRule
entryRuleWallRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWallRuleRule()); }
	 iv_ruleWallRule=ruleWallRule 
	 { $current=$iv_ruleWallRule.current; } 
	 EOF 
;

// Rule WallRule
ruleWallRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Wall' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWallRuleAccess().getWallKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getWallRuleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getWallRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='Name' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getWallRuleAccess().getNameKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWallRuleAccess().getElementNameEStringParserRuleCall_2_1_0()); 
	    }
		lv_elementName_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWallRuleRule());
	        }
       		set(
       			$current, 
       			"elementName",
        		lv_elementName_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='Description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getWallRuleAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWallRuleAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWallRuleRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='Placement' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getWallRuleAccess().getPlacementKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWallRuleAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
	    }
		lv_placement_7_0=ruleLocalPlacement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWallRuleRule());
	        }
       		set(
       			$current, 
       			"placement",
        		lv_placement_7_0, 
        		"LocalPlacement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleOpening
entryRuleOpening returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOpeningRule()); }
	 iv_ruleOpening=ruleOpening 
	 { $current=$iv_ruleOpening.current; } 
	 EOF 
;

// Rule Opening
ruleOpening returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Opening' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOpeningAccess().getOpeningKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getOpeningAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpeningRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='Name' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOpeningAccess().getNameKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOpeningAccess().getElementNameEStringParserRuleCall_2_1_0()); 
	    }
		lv_elementName_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOpeningRule());
	        }
       		set(
       			$current, 
       			"elementName",
        		lv_elementName_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='Description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOpeningAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOpeningAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOpeningRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='Placement' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOpeningAccess().getPlacementKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOpeningAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
	    }
		lv_placement_7_0=ruleLocalPlacement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOpeningRule());
	        }
       		set(
       			$current, 
       			"placement",
        		lv_placement_7_0, 
        		"LocalPlacement");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8='Walls' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getOpeningAccess().getWallsKeyword_6_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpeningRule());
	        }
        }
	otherlv_9=RULE_STRING
	{
		newLeafNode(otherlv_9, grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_1_0()); 
	}

)
)(	otherlv_10=',' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getOpeningAccess().getCommaKeyword_6_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getOpeningRule());
	        }
        }
	otherlv_11=RULE_STRING
	{
		newLeafNode(otherlv_11, grammarAccess.getOpeningAccess().getWallsWallCrossReference_6_2_1_0()); 
	}

)
))*)?)
;





// Entry rule entryRuleFlowSegment
entryRuleFlowSegment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFlowSegmentRule()); }
	 iv_ruleFlowSegment=ruleFlowSegment 
	 { $current=$iv_ruleFlowSegment.current; } 
	 EOF 
;

// Rule FlowSegment
ruleFlowSegment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Pipe' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFlowSegmentAccess().getPipeKeyword_0());
    }
(
(
		lv_name_1_0=RULE_STRING
		{
			newLeafNode(lv_name_1_0, grammarAccess.getFlowSegmentAccess().getNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFlowSegmentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='Name' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getFlowSegmentAccess().getNameKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getElementNameEStringParserRuleCall_2_1_0()); 
	    }
		lv_elementName_3_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
	        }
       		set(
       			$current, 
       			"elementName",
        		lv_elementName_3_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?(	otherlv_4='Description' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getFlowSegmentAccess().getDescriptionKeyword_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getDescriptionEStringParserRuleCall_3_1_0()); 
	    }
		lv_description_5_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
	        }
       		set(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6='Placement' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getFlowSegmentAccess().getPlacementKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFlowSegmentAccess().getPlacementLocalPlacementParserRuleCall_5_0()); 
	    }
		lv_placement_7_0=ruleLocalPlacement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFlowSegmentRule());
	        }
       		set(
       			$current, 
       			"placement",
        		lv_placement_7_0, 
        		"LocalPlacement");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleLocalPlacement
entryRuleLocalPlacement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLocalPlacementRule()); }
	 iv_ruleLocalPlacement=ruleLocalPlacement 
	 { $current=$iv_ruleLocalPlacement.current; } 
	 EOF 
;

// Rule LocalPlacement
ruleLocalPlacement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getLocalPlacementAccess().getLocalPlacementAction_0(),
            $current);
    }
)	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getLocalPlacementAccess().getLeftCurlyBracketKeyword_1());
    }
(	otherlv_2='RelativeTo' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getLocalPlacementAccess().getRelativeToKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getRelativeToLocalPlacementParserRuleCall_2_1_0()); 
	    }
		lv_relativeTo_3_0=ruleLocalPlacement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
	        }
       		set(
       			$current, 
       			"relativeTo",
        		lv_relativeTo_3_0, 
        		"LocalPlacement");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_4='Axis2Placement3d' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getLocalPlacementAccess().getAxis2Placement3dKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAxis2Placement3DParserRuleCall_4_0()); 
	    }
		lv_axis2placement3d_5_0=ruleAxis2Placement3D		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getLocalPlacementRule());
	        }
       		set(
       			$current, 
       			"axis2placement3d",
        		lv_axis2placement3d_5_0, 
        		"Axis2Placement3D");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getLocalPlacementAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleAxis2Placement3D
entryRuleAxis2Placement3D returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAxis2Placement3DRule()); }
	 iv_ruleAxis2Placement3D=ruleAxis2Placement3D 
	 { $current=$iv_ruleAxis2Placement3D.current; } 
	 EOF 
;

// Rule Axis2Placement3D
ruleAxis2Placement3D returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='{' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAxis2Placement3DAccess().getLeftCurlyBracketKeyword_0());
    }
	otherlv_1='Cartesian' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAxis2Placement3DAccess().getCartesianKeyword_1());
    }
	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAxis2Placement3DAccess().getLeftParenthesisKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianXEDoubleParserRuleCall_3_0()); 
	    }
		lv_cartesianX_3_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
	        }
       		set(
       			$current, 
       			"cartesianX",
        		lv_cartesianX_3_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianYEDoubleParserRuleCall_5_0()); 
	    }
		lv_cartesianY_5_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
	        }
       		set(
       			$current, 
       			"cartesianY",
        		lv_cartesianY_5_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAxis2Placement3DAccess().getCommaKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getCartesianZEDoubleParserRuleCall_7_0()); 
	    }
		lv_cartesianZ_7_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
	        }
       		set(
       			$current, 
       			"cartesianZ",
        		lv_cartesianZ_7_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAxis2Placement3DAccess().getRightParenthesisKeyword_8());
    }
	otherlv_9='Axis' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getAxis2Placement3DAccess().getAxisKeyword_9());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getAxisDirectionParserRuleCall_10_0()); 
	    }
		lv_axis_10_0=ruleDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
	        }
       		set(
       			$current, 
       			"axis",
        		lv_axis_10_0, 
        		"Direction");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_11='RefDirection' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getAxis2Placement3DAccess().getRefDirectionKeyword_11());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAxis2Placement3DAccess().getRefDirectionDirectionParserRuleCall_12_0()); 
	    }
		lv_refDirection_12_0=ruleDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAxis2Placement3DRule());
	        }
       		set(
       			$current, 
       			"refDirection",
        		lv_refDirection_12_0, 
        		"Direction");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_13='}' 
    {
    	newLeafNode(otherlv_13, grammarAccess.getAxis2Placement3DAccess().getRightCurlyBracketKeyword_13());
    }
)
;





// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); } 
	 iv_ruleEDouble=ruleEDouble 
	 { $current=$iv_ruleEDouble.current.getText(); }  
	 EOF 
;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
    }
)?(    this_INT_1=RULE_INT    {
		$current.merge(this_INT_1);
    }

    { 
    newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
    }
)?
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
    }
    this_INT_3=RULE_INT    {
		$current.merge(this_INT_3);
    }

    { 
    newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
    }
((
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
    }

    |
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
    }
)(
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
    }
)?    this_INT_7=RULE_INT    {
		$current.merge(this_INT_7);
    }

    { 
    newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
    }
)?)
    ;





// Entry rule entryRuleDirection
entryRuleDirection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDirectionRule()); }
	 iv_ruleDirection=ruleDirection 
	 { $current=$iv_ruleDirection.current; } 
	 EOF 
;

// Rule Direction
ruleDirection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getLeftParenthesisKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDirectionAccess().getXEDoubleParserRuleCall_1_0()); 
	    }
		lv_x_1_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDirectionRule());
	        }
       		set(
       			$current, 
       			"x",
        		lv_x_1_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2=',' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getCommaKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDirectionAccess().getYEDoubleParserRuleCall_3_0()); 
	    }
		lv_y_3_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDirectionRule());
	        }
       		set(
       			$current, 
       			"y",
        		lv_y_3_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getCommaKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDirectionAccess().getZEDoubleParserRuleCall_4_1_0()); 
	    }
		lv_z_5_0=ruleEDouble		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDirectionRule());
	        }
       		set(
       			$current, 
       			"z",
        		lv_z_5_0, 
        		"EDouble");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getDirectionAccess().getRightParenthesisKeyword_5());
    }
)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


