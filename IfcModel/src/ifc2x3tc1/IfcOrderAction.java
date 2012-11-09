/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Order Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcOrderAction#getActionID <em>Action ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrderAction()
 * @model
 * @generated
 */
public interface IfcOrderAction extends IfcTask {
	/**
	 * Returns the value of the '<em><b>Action ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action ID</em>' attribute.
	 * @see #setActionID(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrderAction_ActionID()
	 * @model
	 * @generated
	 */
	String getActionID();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrderAction#getActionID <em>Action ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action ID</em>' attribute.
	 * @see #getActionID()
	 * @generated
	 */
	void setActionID(String value);

} // IfcOrderAction
