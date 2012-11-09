/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Window Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcWindowStyle#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcWindowStyle#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcWindowStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcWindowStyle#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcWindowStyle()
 * @model
 * @generated
 */
public interface IfcWindowStyle extends IfcTypeProduct {
	/**
	 * Returns the value of the '<em><b>Construction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcWindowStyleConstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Type</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowStyleConstructionEnum
	 * @see #setConstructionType(IfcWindowStyleConstructionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcWindowStyle_ConstructionType()
	 * @model
	 * @generated
	 */
	IfcWindowStyleConstructionEnum getConstructionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcWindowStyle#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Type</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowStyleConstructionEnum
	 * @see #getConstructionType()
	 * @generated
	 */
	void setConstructionType(IfcWindowStyleConstructionEnum value);

	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcWindowStyleOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowStyleOperationEnum
	 * @see #setOperationType(IfcWindowStyleOperationEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcWindowStyle_OperationType()
	 * @model
	 * @generated
	 */
	IfcWindowStyleOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcWindowStyle#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowStyleOperationEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcWindowStyleOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Parameter Takes Precedence</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Takes Precedence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Takes Precedence</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setParameterTakesPrecedence(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcWindowStyle_ParameterTakesPrecedence()
	 * @model
	 * @generated
	 */
	Tristate getParameterTakesPrecedence();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcWindowStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Takes Precedence</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getParameterTakesPrecedence()
	 * @generated
	 */
	void setParameterTakesPrecedence(Tristate value);

	/**
	 * Returns the value of the '<em><b>Sizeable</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sizeable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sizeable</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setSizeable(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcWindowStyle_Sizeable()
	 * @model
	 * @generated
	 */
	Tristate getSizeable();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcWindowStyle#getSizeable <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizeable</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getSizeable()
	 * @generated
	 */
	void setSizeable(Tristate value);

} // IfcWindowStyle
