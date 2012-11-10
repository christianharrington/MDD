/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDoorStyle#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDoorStyle#getConstructionType <em>Construction Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDoorStyle#getSizeable <em>Sizeable</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDoorStyle()
 * @model
 * @generated
 */
public interface IfcDoorStyle extends IfcTypeProduct {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcDoorStyleOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcDoorStyleOperationEnum
	 * @see #setOperationType(IfcDoorStyleOperationEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDoorStyle_OperationType()
	 * @model
	 * @generated
	 */
	IfcDoorStyleOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDoorStyle#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcDoorStyleOperationEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcDoorStyleOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Construction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcDoorStyleConstructionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Construction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Construction Type</em>' attribute.
	 * @see ifc2x3tc1.IfcDoorStyleConstructionEnum
	 * @see #setConstructionType(IfcDoorStyleConstructionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDoorStyle_ConstructionType()
	 * @model
	 * @generated
	 */
	IfcDoorStyleConstructionEnum getConstructionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDoorStyle#getConstructionType <em>Construction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Construction Type</em>' attribute.
	 * @see ifc2x3tc1.IfcDoorStyleConstructionEnum
	 * @see #getConstructionType()
	 * @generated
	 */
	void setConstructionType(IfcDoorStyleConstructionEnum value);

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDoorStyle_ParameterTakesPrecedence()
	 * @model
	 * @generated
	 */
	Tristate getParameterTakesPrecedence();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDoorStyle#getParameterTakesPrecedence <em>Parameter Takes Precedence</em>}' attribute.
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDoorStyle_Sizeable()
	 * @model
	 * @generated
	 */
	Tristate getSizeable();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDoorStyle#getSizeable <em>Sizeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sizeable</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getSizeable()
	 * @generated
	 */
	void setSizeable(Tristate value);

} // IfcDoorStyle
