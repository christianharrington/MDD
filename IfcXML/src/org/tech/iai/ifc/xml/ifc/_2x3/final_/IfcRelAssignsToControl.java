/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToControl()
 * @model extendedMetaData="name='IfcRelAssignsToControl' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToControl extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Control</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Control</em>' containment reference.
	 * @see #setRelatingControl(RelatingControlType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToControl_RelatingControl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingControl' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingControlType getRelatingControl();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Control</em>' containment reference.
	 * @see #getRelatingControl()
	 * @generated
	 */
	void setRelatingControl(RelatingControlType value);

} // IfcRelAssignsToControl
