/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc SI Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSIUnit#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSIUnit#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSIUnit()
 * @model
 * @generated
 */
public interface IfcSIUnit extends IfcNamedUnit {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcSIPrefix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see ifc2x3tc1.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSIUnit_Prefix()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcSIPrefix getPrefix();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see ifc2x3tc1.IfcSIPrefix
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(IfcSIPrefix value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcSIUnit#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(IfcSIPrefix)
	 * @generated
	 */
	boolean isSetPrefix();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcSIUnitName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see ifc2x3tc1.IfcSIUnitName
	 * @see #setName(IfcSIUnitName)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSIUnit_Name()
	 * @model
	 * @generated
	 */
	IfcSIUnitName getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSIUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see ifc2x3tc1.IfcSIUnitName
	 * @see #getName()
	 * @generated
	 */
	void setName(IfcSIUnitName value);

} // IfcSIUnit
