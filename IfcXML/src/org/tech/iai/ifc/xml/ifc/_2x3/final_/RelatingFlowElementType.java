/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Flow Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingFlowElementType#getIfcDistributionFlowElementGroup <em>Ifc Distribution Flow Element Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingFlowElementType#getIfcDistributionFlowElement <em>Ifc Distribution Flow Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingFlowElementType()
 * @model extendedMetaData="name='RelatingFlowElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingFlowElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Distribution Flow Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Distribution Flow Element Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Distribution Flow Element Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingFlowElementType_IfcDistributionFlowElementGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcDistributionFlowElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcDistributionFlowElementGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Distribution Flow Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Distribution Flow Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Distribution Flow Element</em>' containment reference.
	 * @see #setIfcDistributionFlowElement(IfcDistributionFlowElement)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingFlowElementType_IfcDistributionFlowElement()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcDistributionFlowElement' namespace='##targetNamespace' group='IfcDistributionFlowElement:group'"
	 * @generated
	 */
	IfcDistributionFlowElement getIfcDistributionFlowElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingFlowElementType#getIfcDistributionFlowElement <em>Ifc Distribution Flow Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Distribution Flow Element</em>' containment reference.
	 * @see #getIfcDistributionFlowElement()
	 * @generated
	 */
	void setIfcDistributionFlowElement(IfcDistributionFlowElement value);

} // RelatingFlowElementType
