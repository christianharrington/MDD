/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Stair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStair#getShapeType <em>Shape Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStair()
 * @model
 * @generated
 */
public interface IfcStair extends IfcBuildingElement {
	/**
	 * Returns the value of the '<em><b>Shape Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcStairTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Type</em>' attribute.
	 * @see ifc2x3tc1.IfcStairTypeEnum
	 * @see #setShapeType(IfcStairTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStair_ShapeType()
	 * @model
	 * @generated
	 */
	IfcStairTypeEnum getShapeType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStair#getShapeType <em>Shape Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Type</em>' attribute.
	 * @see ifc2x3tc1.IfcStairTypeEnum
	 * @see #getShapeType()
	 * @generated
	 */
	void setShapeType(IfcStairTypeEnum value);

} // IfcStair
