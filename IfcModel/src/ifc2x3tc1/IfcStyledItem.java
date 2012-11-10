/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Styled Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStyledItem#getItem <em>Item</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStyledItem#getStyles <em>Styles</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStyledItem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStyledItem()
 * @model
 * @generated
 */
public interface IfcStyledItem extends IfcRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRepresentationItem#getStyledByItem <em>Styled By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #isSetItem()
	 * @see #unsetItem()
	 * @see #setItem(IfcRepresentationItem)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStyledItem_Item()
	 * @see ifc2x3tc1.IfcRepresentationItem#getStyledByItem
	 * @model opposite="StyledByItem" unsettable="true"
	 * @generated
	 */
	IfcRepresentationItem getItem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStyledItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #isSetItem()
	 * @see #unsetItem()
	 * @see #getItem()
	 * @generated
	 */
	void setItem(IfcRepresentationItem value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStyledItem#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItem()
	 * @see #getItem()
	 * @see #setItem(IfcRepresentationItem)
	 * @generated
	 */
	void unsetItem();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStyledItem#getItem <em>Item</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item</em>' reference is set.
	 * @see #unsetItem()
	 * @see #getItem()
	 * @see #setItem(IfcRepresentationItem)
	 * @generated
	 */
	boolean isSetItem();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPresentationStyleAssignment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStyledItem_Styles()
	 * @model
	 * @generated
	 */
	EList<IfcPresentationStyleAssignment> getStyles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStyledItem_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStyledItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStyledItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStyledItem#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcStyledItem
