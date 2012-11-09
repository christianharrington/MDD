/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Permit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPermit#getPermitID <em>Permit ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermit()
 * @model
 * @generated
 */
public interface IfcPermit extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Permit ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Permit ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permit ID</em>' attribute.
	 * @see #setPermitID(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermit_PermitID()
	 * @model
	 * @generated
	 */
	String getPermitID();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermit#getPermitID <em>Permit ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permit ID</em>' attribute.
	 * @see #getPermitID()
	 * @generated
	 */
	void setPermitID(String value);

} // IfcPermit
