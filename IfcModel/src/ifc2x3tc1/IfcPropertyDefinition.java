/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPropertyDefinition#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertyDefinition()
 * @model
 * @generated
 */
public interface IfcPropertyDefinition extends IfcRoot {
	/**
	 * Returns the value of the '<em><b>Has Associations</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssociates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associations</em>' reference list.
	 * @see #isSetHasAssociations()
	 * @see #unsetHasAssociations()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertyDefinition_HasAssociations()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssociates> getHasAssociations();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPropertyDefinition#getHasAssociations <em>Has Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasAssociations()
	 * @see #getHasAssociations()
	 * @generated
	 */
	void unsetHasAssociations();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPropertyDefinition#getHasAssociations <em>Has Associations</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Associations</em>' reference list is set.
	 * @see #unsetHasAssociations()
	 * @see #getHasAssociations()
	 * @generated
	 */
	boolean isSetHasAssociations();

} // IfcPropertyDefinition
