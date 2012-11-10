/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefinesByType()
 * @model
 * @generated
 */
public interface IfcRelDefinesByType extends IfcRelDefines {
	/**
	 * Returns the value of the '<em><b>Relating Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcTypeObject#getObjectTypeOf <em>Object Type Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Type</em>' reference.
	 * @see #setRelatingType(IfcTypeObject)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefinesByType_RelatingType()
	 * @see ifc2x3tc1.IfcTypeObject#getObjectTypeOf
	 * @model opposite="ObjectTypeOf"
	 * @generated
	 */
	IfcTypeObject getRelatingType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelDefinesByType#getRelatingType <em>Relating Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Type</em>' reference.
	 * @see #getRelatingType()
	 * @generated
	 */
	void setRelatingType(IfcTypeObject value);

} // IfcRelDefinesByType
