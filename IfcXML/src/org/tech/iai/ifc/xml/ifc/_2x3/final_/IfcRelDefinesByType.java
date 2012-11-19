/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDefinesByType()
 * @model extendedMetaData="name='IfcRelDefinesByType' kind='elementOnly'"
 * @generated
 */
public interface IfcRelDefinesByType extends IfcRelDefines {
	/**
	 * Returns the value of the '<em><b>Relating Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Type</em>' containment reference.
	 * @see #setRelatingType(RelatingTypeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelDefinesByType_RelatingType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingType' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingTypeType getRelatingType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Type</em>' containment reference.
	 * @see #getRelatingType()
	 * @generated
	 */
	void setRelatingType(RelatingTypeType value);

} // IfcRelDefinesByType
