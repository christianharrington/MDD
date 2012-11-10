/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesMaterial()
 * @model
 * @generated
 */
public interface IfcRelAssociatesMaterial extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Material</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Material</em>' reference.
	 * @see #setRelatingMaterial(IfcMaterialSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesMaterial_RelatingMaterial()
	 * @model
	 * @generated
	 */
	IfcMaterialSelect getRelatingMaterial();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Material</em>' reference.
	 * @see #getRelatingMaterial()
	 * @generated
	 */
	void setRelatingMaterial(IfcMaterialSelect value);

} // IfcRelAssociatesMaterial
