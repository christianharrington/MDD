/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElectricDistributionPoint()
 * @model
 * @generated
 */
public interface IfcElectricDistributionPoint extends IfcFlowController {
	/**
	 * Returns the value of the '<em><b>Distribution Point Function</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcElectricDistributionPointFunctionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Point Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Point Function</em>' attribute.
	 * @see ifc2x3tc1.IfcElectricDistributionPointFunctionEnum
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElectricDistributionPoint_DistributionPointFunction()
	 * @model
	 * @generated
	 */
	IfcElectricDistributionPointFunctionEnum getDistributionPointFunction();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Point Function</em>' attribute.
	 * @see ifc2x3tc1.IfcElectricDistributionPointFunctionEnum
	 * @see #getDistributionPointFunction()
	 * @generated
	 */
	void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElectricDistributionPoint_UserDefinedFunction()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedFunction();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Function</em>' attribute.
	 * @see #isSetUserDefinedFunction()
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @generated
	 */
	void setUserDefinedFunction(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	void unsetUserDefinedFunction();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Function</em>' attribute is set.
	 * @see #unsetUserDefinedFunction()
	 * @see #getUserDefinedFunction()
	 * @see #setUserDefinedFunction(String)
	 * @generated
	 */
	boolean isSetUserDefinedFunction();

} // IfcElectricDistributionPoint
