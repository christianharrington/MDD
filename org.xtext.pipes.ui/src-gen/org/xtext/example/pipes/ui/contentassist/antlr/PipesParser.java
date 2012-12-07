/*
* generated by Xtext
*/
package org.xtext.example.pipes.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.pipes.services.PipesGrammarAccess;

public class PipesParser extends AbstractContentAssistParser {
	
	@Inject
	private PipesGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.pipes.ui.contentassist.antlr.internal.InternalPipesParser createParser() {
		org.xtext.example.pipes.ui.contentassist.antlr.internal.InternalPipesParser result = new org.xtext.example.pipes.ui.contentassist.antlr.internal.InternalPipesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getGUIDElementAccess().getAlternatives(), "rule__GUIDElement__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_3(), "rule__Model__Group_3__0");
					put(grammarAccess.getModelAccess().getGroup_3_3(), "rule__Model__Group_3_3__0");
					put(grammarAccess.getGUIDElement_ImplAccess().getGroup(), "rule__GUIDElement_Impl__Group__0");
					put(grammarAccess.getGUIDElement_ImplAccess().getGroup_3(), "rule__GUIDElement_Impl__Group_3__0");
					put(grammarAccess.getGUIDElement_ImplAccess().getGroup_4(), "rule__GUIDElement_Impl__Group_4__0");
					put(grammarAccess.getGUIDElement_ImplAccess().getGroup_5(), "rule__GUIDElement_Impl__Group_5__0");
					put(grammarAccess.getWallAccess().getGroup(), "rule__Wall__Group__0");
					put(grammarAccess.getWallAccess().getGroup_2(), "rule__Wall__Group_2__0");
					put(grammarAccess.getWallAccess().getGroup_3(), "rule__Wall__Group_3__0");
					put(grammarAccess.getWallAccess().getGroup_4(), "rule__Wall__Group_4__0");
					put(grammarAccess.getWallAccess().getGroup_7(), "rule__Wall__Group_7__0");
					put(grammarAccess.getWallAccess().getGroup_7_3(), "rule__Wall__Group_7_3__0");
					put(grammarAccess.getOpeningAccess().getGroup(), "rule__Opening__Group__0");
					put(grammarAccess.getOpeningAccess().getGroup_2(), "rule__Opening__Group_2__0");
					put(grammarAccess.getOpeningAccess().getGroup_3(), "rule__Opening__Group_3__0");
					put(grammarAccess.getOpeningAccess().getGroup_4(), "rule__Opening__Group_4__0");
					put(grammarAccess.getOpeningAccess().getGroup_7(), "rule__Opening__Group_7__0");
					put(grammarAccess.getOpeningAccess().getGroup_7_3(), "rule__Opening__Group_7_3__0");
					put(grammarAccess.getWallRelationAccess().getGroup(), "rule__WallRelation__Group__0");
					put(grammarAccess.getWallRelationAccess().getGroup_2(), "rule__WallRelation__Group_2__0");
					put(grammarAccess.getWallRelationAccess().getGroup_3(), "rule__WallRelation__Group_3__0");
					put(grammarAccess.getWallRelationAccess().getGroup_4(), "rule__WallRelation__Group_4__0");
					put(grammarAccess.getFlowSegmentAccess().getGroup(), "rule__FlowSegment__Group__0");
					put(grammarAccess.getFlowSegmentAccess().getGroup_2(), "rule__FlowSegment__Group_2__0");
					put(grammarAccess.getFlowSegmentAccess().getGroup_3(), "rule__FlowSegment__Group_3__0");
					put(grammarAccess.getFlowSegmentAccess().getGroup_4(), "rule__FlowSegment__Group_4__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup(), "rule__LocalPlacement__Group__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup_3(), "rule__LocalPlacement__Group_3__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup_4(), "rule__LocalPlacement__Group_4__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup_5(), "rule__LocalPlacement__Group_5__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup_6(), "rule__LocalPlacement__Group_6__0");
					put(grammarAccess.getLocalPlacementAccess().getGroup_7(), "rule__LocalPlacement__Group_7__0");
					put(grammarAccess.getAxis2Placement3DAccess().getGroup(), "rule__Axis2Placement3D__Group__0");
					put(grammarAccess.getAxis2Placement3DAccess().getGroup_2(), "rule__Axis2Placement3D__Group_2__0");
					put(grammarAccess.getAxis2Placement3DAccess().getGroup_3(), "rule__Axis2Placement3D__Group_3__0");
					put(grammarAccess.getAxis2Placement3DAccess().getGroup_4(), "rule__Axis2Placement3D__Group_4__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getDirectionAccess().getGroup(), "rule__Direction__Group__0");
					put(grammarAccess.getDirectionAccess().getGroup_6(), "rule__Direction__Group_6__0");
					put(grammarAccess.getModelAccess().getElementsAssignment_3_2(), "rule__Model__ElementsAssignment_3_2");
					put(grammarAccess.getModelAccess().getElementsAssignment_3_3_1(), "rule__Model__ElementsAssignment_3_3_1");
					put(grammarAccess.getGUIDElement_ImplAccess().getGUIDAssignment_3_1(), "rule__GUIDElement_Impl__GUIDAssignment_3_1");
					put(grammarAccess.getGUIDElement_ImplAccess().getNameAssignment_4_1(), "rule__GUIDElement_Impl__NameAssignment_4_1");
					put(grammarAccess.getGUIDElement_ImplAccess().getDescriptionAssignment_5_1(), "rule__GUIDElement_Impl__DescriptionAssignment_5_1");
					put(grammarAccess.getWallAccess().getGUIDAssignment_2_1(), "rule__Wall__GUIDAssignment_2_1");
					put(grammarAccess.getWallAccess().getNameAssignment_3_1(), "rule__Wall__NameAssignment_3_1");
					put(grammarAccess.getWallAccess().getDescriptionAssignment_4_1(), "rule__Wall__DescriptionAssignment_4_1");
					put(grammarAccess.getWallAccess().getPlacementAssignment_6(), "rule__Wall__PlacementAssignment_6");
					put(grammarAccess.getWallAccess().getOpeningsAssignment_7_2(), "rule__Wall__OpeningsAssignment_7_2");
					put(grammarAccess.getWallAccess().getOpeningsAssignment_7_3_1(), "rule__Wall__OpeningsAssignment_7_3_1");
					put(grammarAccess.getOpeningAccess().getGUIDAssignment_2_1(), "rule__Opening__GUIDAssignment_2_1");
					put(grammarAccess.getOpeningAccess().getNameAssignment_3_1(), "rule__Opening__NameAssignment_3_1");
					put(grammarAccess.getOpeningAccess().getDescriptionAssignment_4_1(), "rule__Opening__DescriptionAssignment_4_1");
					put(grammarAccess.getOpeningAccess().getPlacementAssignment_6(), "rule__Opening__PlacementAssignment_6");
					put(grammarAccess.getOpeningAccess().getWallsAssignment_7_2(), "rule__Opening__WallsAssignment_7_2");
					put(grammarAccess.getOpeningAccess().getWallsAssignment_7_3_1(), "rule__Opening__WallsAssignment_7_3_1");
					put(grammarAccess.getWallRelationAccess().getGUIDAssignment_2_1(), "rule__WallRelation__GUIDAssignment_2_1");
					put(grammarAccess.getWallRelationAccess().getNameAssignment_3_1(), "rule__WallRelation__NameAssignment_3_1");
					put(grammarAccess.getWallRelationAccess().getDescriptionAssignment_4_1(), "rule__WallRelation__DescriptionAssignment_4_1");
					put(grammarAccess.getWallRelationAccess().getWallAssignment_6(), "rule__WallRelation__WallAssignment_6");
					put(grammarAccess.getWallRelationAccess().getOpeningAssignment_8(), "rule__WallRelation__OpeningAssignment_8");
					put(grammarAccess.getFlowSegmentAccess().getGUIDAssignment_2_1(), "rule__FlowSegment__GUIDAssignment_2_1");
					put(grammarAccess.getFlowSegmentAccess().getNameAssignment_3_1(), "rule__FlowSegment__NameAssignment_3_1");
					put(grammarAccess.getFlowSegmentAccess().getDescriptionAssignment_4_1(), "rule__FlowSegment__DescriptionAssignment_4_1");
					put(grammarAccess.getFlowSegmentAccess().getPlacementAssignment_6(), "rule__FlowSegment__PlacementAssignment_6");
					put(grammarAccess.getLocalPlacementAccess().getGUIDAssignment_3_1(), "rule__LocalPlacement__GUIDAssignment_3_1");
					put(grammarAccess.getLocalPlacementAccess().getNameAssignment_4_1(), "rule__LocalPlacement__NameAssignment_4_1");
					put(grammarAccess.getLocalPlacementAccess().getDescriptionAssignment_5_1(), "rule__LocalPlacement__DescriptionAssignment_5_1");
					put(grammarAccess.getLocalPlacementAccess().getAxis2placement3dAssignment_6_1(), "rule__LocalPlacement__Axis2placement3dAssignment_6_1");
					put(grammarAccess.getLocalPlacementAccess().getRelativeToAssignment_7_1(), "rule__LocalPlacement__RelativeToAssignment_7_1");
					put(grammarAccess.getAxis2Placement3DAccess().getGUIDAssignment_2_1(), "rule__Axis2Placement3D__GUIDAssignment_2_1");
					put(grammarAccess.getAxis2Placement3DAccess().getNameAssignment_3_1(), "rule__Axis2Placement3D__NameAssignment_3_1");
					put(grammarAccess.getAxis2Placement3DAccess().getDescriptionAssignment_4_1(), "rule__Axis2Placement3D__DescriptionAssignment_4_1");
					put(grammarAccess.getAxis2Placement3DAccess().getCartesianXAssignment_6(), "rule__Axis2Placement3D__CartesianXAssignment_6");
					put(grammarAccess.getAxis2Placement3DAccess().getCartesianYAssignment_8(), "rule__Axis2Placement3D__CartesianYAssignment_8");
					put(grammarAccess.getAxis2Placement3DAccess().getCartesianZAssignment_10(), "rule__Axis2Placement3D__CartesianZAssignment_10");
					put(grammarAccess.getAxis2Placement3DAccess().getAxisAssignment_12(), "rule__Axis2Placement3D__AxisAssignment_12");
					put(grammarAccess.getAxis2Placement3DAccess().getRefDirectionAssignment_14(), "rule__Axis2Placement3D__RefDirectionAssignment_14");
					put(grammarAccess.getDirectionAccess().getXAssignment_3(), "rule__Direction__XAssignment_3");
					put(grammarAccess.getDirectionAccess().getYAssignment_5(), "rule__Direction__YAssignment_5");
					put(grammarAccess.getDirectionAccess().getZAssignment_6_1(), "rule__Direction__ZAssignment_6_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.pipes.ui.contentassist.antlr.internal.InternalPipesParser typedParser = (org.xtext.example.pipes.ui.contentassist.antlr.internal.InternalPipesParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PipesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PipesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}