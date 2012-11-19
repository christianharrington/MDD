/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralConnection()
 * @model abstract="true"
 *        extendedMetaData="name='IfcStructuralConnection' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralConnection extends IfcStructuralItem {
	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' containment reference.
	 * @see #setAppliedCondition(AppliedConditionType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralConnection_AppliedCondition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AppliedCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliedConditionType1 getAppliedCondition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralConnection#getAppliedCondition <em>Applied Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' containment reference.
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(AppliedConditionType1 value);

} // IfcStructuralConnection
