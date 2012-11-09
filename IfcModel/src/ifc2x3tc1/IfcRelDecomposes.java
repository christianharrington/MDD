/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Decomposes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDecomposes()
 * @model
 * @generated
 */
public interface IfcRelDecomposes extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Relating Object</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Object</em>' reference.
	 * @see #setRelatingObject(IfcObjectDefinition)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDecomposes_RelatingObject()
	 * @see ifc2x3tc1.IfcObjectDefinition#getIsDecomposedBy
	 * @model opposite="IsDecomposedBy"
	 * @generated
	 */
	IfcObjectDefinition getRelatingObject();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Object</em>' reference.
	 * @see #getRelatingObject()
	 * @generated
	 */
	void setRelatingObject(IfcObjectDefinition value);

	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcObjectDefinition}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDecomposes_RelatedObjects()
	 * @see ifc2x3tc1.IfcObjectDefinition#getDecomposes
	 * @model opposite="Decomposes"
	 * @generated
	 */
	EList<IfcObjectDefinition> getRelatedObjects();

} // IfcRelDecomposes
