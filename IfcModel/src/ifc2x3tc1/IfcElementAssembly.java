/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementAssembly()
 * @model
 * @generated
 */
public interface IfcElementAssembly extends IfcElement {
	/**
	 * Returns the value of the '<em><b>Assembly Place</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcAssemblyPlaceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assembly Place</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assembly Place</em>' attribute.
	 * @see ifc2x3tc1.IfcAssemblyPlaceEnum
	 * @see #isSetAssemblyPlace()
	 * @see #unsetAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementAssembly_AssemblyPlace()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAssemblyPlaceEnum getAssemblyPlace();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assembly Place</em>' attribute.
	 * @see ifc2x3tc1.IfcAssemblyPlaceEnum
	 * @see #isSetAssemblyPlace()
	 * @see #unsetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @generated
	 */
	void setAssemblyPlace(IfcAssemblyPlaceEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	void unsetAssemblyPlace();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcElementAssembly#getAssemblyPlace <em>Assembly Place</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Assembly Place</em>' attribute is set.
	 * @see #unsetAssemblyPlace()
	 * @see #getAssemblyPlace()
	 * @see #setAssemblyPlace(IfcAssemblyPlaceEnum)
	 * @generated
	 */
	boolean isSetAssemblyPlace();

	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcElementAssemblyTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElementAssemblyTypeEnum
	 * @see #setPredefinedType(IfcElementAssemblyTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementAssembly_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcElementAssemblyTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElementAssembly#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElementAssemblyTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcElementAssemblyTypeEnum value);

} // IfcElementAssembly
