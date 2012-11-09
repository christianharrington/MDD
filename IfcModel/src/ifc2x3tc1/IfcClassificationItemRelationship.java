/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItemRelationship()
 * @model
 * @generated
 */
public interface IfcClassificationItemRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Relating Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Item</em>' reference.
	 * @see #setRelatingItem(IfcClassificationItem)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItemRelationship_RelatingItem()
	 * @see ifc2x3tc1.IfcClassificationItem#getIsClassifyingItemIn
	 * @model opposite="IsClassifyingItemIn"
	 * @generated
	 */
	IfcClassificationItem getRelatingItem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Item</em>' reference.
	 * @see #getRelatingItem()
	 * @generated
	 */
	void setRelatingItem(IfcClassificationItem value);

	/**
	 * Returns the value of the '<em><b>Related Items</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcClassificationItem}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Items</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Items</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItemRelationship_RelatedItems()
	 * @see ifc2x3tc1.IfcClassificationItem#getIsClassifiedItemIn
	 * @model opposite="IsClassifiedItemIn"
	 * @generated
	 */
	EList<IfcClassificationItem> getRelatedItems();

} // IfcClassificationItemRelationship
