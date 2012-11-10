/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Named Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcNamedUnit#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcNamedUnit#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcNamedUnit()
 * @model
 * @generated
 */
public interface IfcNamedUnit extends IfcUnit {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' reference.
	 * @see #setDimensions(IfcDimensionalExponents)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcNamedUnit_Dimensions()
	 * @model
	 * @generated
	 */
	IfcDimensionalExponents getDimensions();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcNamedUnit#getDimensions <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(IfcDimensionalExponents value);

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcUnitEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see ifc2x3tc1.IfcUnitEnum
	 * @see #setUnitType(IfcUnitEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcNamedUnit_UnitType()
	 * @model
	 * @generated
	 */
	IfcUnitEnum getUnitType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcNamedUnit#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see ifc2x3tc1.IfcUnitEnum
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(IfcUnitEnum value);

} // IfcNamedUnit
