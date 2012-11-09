/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Definition Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMaterialDefinitionRepresentation#getRepresentedMaterial <em>Represented Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialDefinitionRepresentation()
 * @model
 * @generated
 */
public interface IfcMaterialDefinitionRepresentation extends IfcProductRepresentation {
	/**
	 * Returns the value of the '<em><b>Represented Material</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcMaterial#getHasRepresentation <em>Has Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Represented Material</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Represented Material</em>' reference.
	 * @see #setRepresentedMaterial(IfcMaterial)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialDefinitionRepresentation_RepresentedMaterial()
	 * @see ifc2x3tc1.IfcMaterial#getHasRepresentation
	 * @model opposite="HasRepresentation"
	 * @generated
	 */
	IfcMaterial getRepresentedMaterial();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialDefinitionRepresentation#getRepresentedMaterial <em>Represented Material</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Represented Material</em>' reference.
	 * @see #getRepresentedMaterial()
	 * @generated
	 */
	void setRepresentedMaterial(IfcMaterial value);

} // IfcMaterialDefinitionRepresentation
