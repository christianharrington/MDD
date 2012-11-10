/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Element Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcBuildingElementProxy#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingElementProxy()
 * @model
 * @generated
 */
public interface IfcBuildingElementProxy extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Composition Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcElementCompositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElementCompositionEnum
	 * @see #isSetCompositionType()
	 * @see #unsetCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingElementProxy_CompositionType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcElementCompositionEnum getCompositionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBuildingElementProxy#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Type</em>' attribute.
	 * @see ifc2x3tc1.IfcElementCompositionEnum
	 * @see #isSetCompositionType()
	 * @see #unsetCompositionType()
	 * @see #getCompositionType()
	 * @generated
	 */
	void setCompositionType(IfcElementCompositionEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcBuildingElementProxy#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCompositionType()
	 * @see #getCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @generated
	 */
	void unsetCompositionType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcBuildingElementProxy#getCompositionType <em>Composition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Composition Type</em>' attribute is set.
	 * @see #unsetCompositionType()
	 * @see #getCompositionType()
	 * @see #setCompositionType(IfcElementCompositionEnum)
	 * @generated
	 */
	boolean isSetCompositionType();

} // IfcBuildingElementProxy
