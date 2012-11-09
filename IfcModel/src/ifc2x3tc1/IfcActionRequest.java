/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Action Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcActionRequest#getRequestID <em>Request ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcActionRequest()
 * @model
 * @generated
 */
public interface IfcActionRequest extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Request ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request ID</em>' attribute.
	 * @see #setRequestID(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcActionRequest_RequestID()
	 * @model
	 * @generated
	 */
	String getRequestID();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcActionRequest#getRequestID <em>Request ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request ID</em>' attribute.
	 * @see #getRequestID()
	 * @generated
	 */
	void setRequestID(String value);

} // IfcActionRequest
