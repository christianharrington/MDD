/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcClassificationItem#getNotation <em>Notation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcClassificationItem#getItemOf <em>Item Of</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcClassificationItem#getTitle <em>Title</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem()
 * @model
 * @generated
 */
public interface IfcClassificationItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Notation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation</em>' reference.
	 * @see #setNotation(IfcClassificationNotationFacet)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem_Notation()
	 * @model
	 * @generated
	 */
	IfcClassificationNotationFacet getNotation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getNotation <em>Notation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation</em>' reference.
	 * @see #getNotation()
	 * @generated
	 */
	void setNotation(IfcClassificationNotationFacet value);

	/**
	 * Returns the value of the '<em><b>Item Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcClassification#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Of</em>' reference.
	 * @see #isSetItemOf()
	 * @see #unsetItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem_ItemOf()
	 * @see ifc2x3tc1.IfcClassification#getContains
	 * @model opposite="Contains" unsettable="true"
	 * @generated
	 */
	IfcClassification getItemOf();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Of</em>' reference.
	 * @see #isSetItemOf()
	 * @see #unsetItemOf()
	 * @see #getItemOf()
	 * @generated
	 */
	void setItemOf(IfcClassification value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItemOf()
	 * @see #getItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @generated
	 */
	void unsetItemOf();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcClassificationItem#getItemOf <em>Item Of</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item Of</em>' reference is set.
	 * @see #unsetItemOf()
	 * @see #getItemOf()
	 * @see #setItemOf(IfcClassification)
	 * @generated
	 */
	boolean isSetItemOf();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is Classified Item In</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcClassificationItemRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classified Item In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classified Item In</em>' reference list.
	 * @see #isSetIsClassifiedItemIn()
	 * @see #unsetIsClassifiedItemIn()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem_IsClassifiedItemIn()
	 * @see ifc2x3tc1.IfcClassificationItemRelationship#getRelatedItems
	 * @model opposite="RelatedItems" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcClassificationItemRelationship> getIsClassifiedItemIn();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsClassifiedItemIn()
	 * @see #getIsClassifiedItemIn()
	 * @generated
	 */
	void unsetIsClassifiedItemIn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifiedItemIn <em>Is Classified Item In</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Classified Item In</em>' reference list is set.
	 * @see #unsetIsClassifiedItemIn()
	 * @see #getIsClassifiedItemIn()
	 * @generated
	 */
	boolean isSetIsClassifiedItemIn();

	/**
	 * Returns the value of the '<em><b>Is Classifying Item In</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcClassificationItemRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Classifying Item In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Classifying Item In</em>' reference list.
	 * @see #isSetIsClassifyingItemIn()
	 * @see #unsetIsClassifyingItemIn()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcClassificationItem_IsClassifyingItemIn()
	 * @see ifc2x3tc1.IfcClassificationItemRelationship#getRelatingItem
	 * @model opposite="RelatingItem" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcClassificationItemRelationship> getIsClassifyingItemIn();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsClassifyingItemIn()
	 * @see #getIsClassifyingItemIn()
	 * @generated
	 */
	void unsetIsClassifyingItemIn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcClassificationItem#getIsClassifyingItemIn <em>Is Classifying Item In</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Classifying Item In</em>' reference list is set.
	 * @see #unsetIsClassifyingItemIn()
	 * @see #getIsClassifyingItemIn()
	 * @generated
	 */
	boolean isSetIsClassifyingItemIn();

} // IfcClassificationItem
