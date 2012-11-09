/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRepresentationItem#getLayerAssignments <em>Layer Assignments</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationItem()
 * @model
 * @generated
 */
public interface IfcRepresentationItem extends IfcLayeredItem {
	/**
	 * Returns the value of the '<em><b>Layer Assignments</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPresentationLayerAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Assignments</em>' reference list.
	 * @see #isSetLayerAssignments()
	 * @see #unsetLayerAssignments()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationItem_LayerAssignments()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcPresentationLayerAssignment> getLayerAssignments();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationItem#getLayerAssignments <em>Layer Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLayerAssignments()
	 * @see #getLayerAssignments()
	 * @generated
	 */
	void unsetLayerAssignments();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationItem#getLayerAssignments <em>Layer Assignments</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Layer Assignments</em>' reference list is set.
	 * @see #unsetLayerAssignments()
	 * @see #getLayerAssignments()
	 * @generated
	 */
	boolean isSetLayerAssignments();

	/**
	 * Returns the value of the '<em><b>Styled By Item</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcStyledItem}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcStyledItem#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styled By Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styled By Item</em>' reference list.
	 * @see #isSetStyledByItem()
	 * @see #unsetStyledByItem()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationItem_StyledByItem()
	 * @see ifc2x3tc1.IfcStyledItem#getItem
	 * @model opposite="Item" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcStyledItem> getStyledByItem();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyledByItem()
	 * @see #getStyledByItem()
	 * @generated
	 */
	void unsetStyledByItem();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Styled By Item</em>' reference list is set.
	 * @see #unsetStyledByItem()
	 * @see #getStyledByItem()
	 * @generated
	 */
	boolean isSetStyledByItem();

} // IfcRepresentationItem
