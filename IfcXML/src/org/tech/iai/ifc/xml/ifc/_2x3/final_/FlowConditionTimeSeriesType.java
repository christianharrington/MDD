/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Condition Time Series Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FlowConditionTimeSeriesType#getIfcTimeSeriesGroup <em>Ifc Time Series Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FlowConditionTimeSeriesType#getIfcTimeSeries <em>Ifc Time Series</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFlowConditionTimeSeriesType()
 * @model extendedMetaData="name='FlowConditionTimeSeries_._type' kind='elementOnly'"
 * @generated
 */
public interface FlowConditionTimeSeriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Time Series Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Time Series Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Time Series Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFlowConditionTimeSeriesType_IfcTimeSeriesGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcTimeSeries:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcTimeSeriesGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Time Series</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFlowConditionTimeSeriesType_IfcTimeSeries()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcTimeSeries' namespace='##targetNamespace' group='IfcTimeSeries:group'"
	 * @generated
	 */
	IfcTimeSeries getIfcTimeSeries();

} // FlowConditionTimeSeriesType
