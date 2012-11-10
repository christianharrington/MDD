/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcProcedure#getProcedureID <em>Procedure ID</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProcedure#getProcedureType <em>Procedure Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcedure()
 * @model
 * @generated
 */
public interface IfcProcedure extends IfcProcess {
	/**
	 * Returns the value of the '<em><b>Procedure ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure ID</em>' attribute.
	 * @see #setProcedureID(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcedure_ProcedureID()
	 * @model
	 * @generated
	 */
	String getProcedureID();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProcedure#getProcedureID <em>Procedure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure ID</em>' attribute.
	 * @see #getProcedureID()
	 * @generated
	 */
	void setProcedureID(String value);

	/**
	 * Returns the value of the '<em><b>Procedure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcProcedureTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProcedureTypeEnum
	 * @see #setProcedureType(IfcProcedureTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcedure_ProcedureType()
	 * @model
	 * @generated
	 */
	IfcProcedureTypeEnum getProcedureType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProcedure#getProcedureType <em>Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Type</em>' attribute.
	 * @see ifc2x3tc1.IfcProcedureTypeEnum
	 * @see #getProcedureType()
	 * @generated
	 */
	void setProcedureType(IfcProcedureTypeEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Procedure Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Procedure Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Procedure Type</em>' attribute.
	 * @see #isSetUserDefinedProcedureType()
	 * @see #unsetUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcProcedure_UserDefinedProcedureType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedProcedureType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Procedure Type</em>' attribute.
	 * @see #isSetUserDefinedProcedureType()
	 * @see #unsetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @generated
	 */
	void setUserDefinedProcedureType(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @generated
	 */
	void unsetUserDefinedProcedureType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcProcedure#getUserDefinedProcedureType <em>User Defined Procedure Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Procedure Type</em>' attribute is set.
	 * @see #unsetUserDefinedProcedureType()
	 * @see #getUserDefinedProcedureType()
	 * @see #setUserDefinedProcedureType(String)
	 * @generated
	 */
	boolean isSetUserDefinedProcedureType();

} // IfcProcedure
