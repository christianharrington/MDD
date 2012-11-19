/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Original Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OriginalValueType#getIfcCostValue <em>Ifc Cost Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOriginalValueType()
 * @model extendedMetaData="name='OriginalValue_._type' kind='elementOnly'"
 * @generated
 */
public interface OriginalValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Cost Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cost Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cost Value</em>' containment reference.
	 * @see #setIfcCostValue(IfcCostValue)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOriginalValueType_IfcCostValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCostValue' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCostValue getIfcCostValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OriginalValueType#getIfcCostValue <em>Ifc Cost Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cost Value</em>' containment reference.
	 * @see #getIfcCostValue()
	 * @generated
	 */
	void setIfcCostValue(IfcCostValue value);

} // OriginalValueType
