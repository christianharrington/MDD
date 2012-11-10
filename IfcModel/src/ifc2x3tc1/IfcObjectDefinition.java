/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjectDefinition#getHasAssociations <em>Has Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectDefinition()
 * @model
 * @generated
 */
public interface IfcObjectDefinition extends IfcRoot {
	/**
	 * Returns the value of the '<em><b>Has Assignments</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelAssigns}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Assignments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Assignments</em>' reference list.
	 * @see #isSetHasAssignments()
	 * @see #unsetHasAssignments()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectDefinition_HasAssignments()
	 * @see ifc2x3tc1.IfcRelAssigns#getRelatedObjects
	 * @model opposite="RelatedObjects" unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssigns> getHasAssignments();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasAssignments()
	 * @see #getHasAssignments()
	 * @generated
	 */
	void unsetHasAssignments();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Assignments</em>' reference list is set.
	 * @see #unsetHasAssignments()
	 * @see #getHasAssignments()
	 * @generated
	 */
	boolean isSetHasAssignments();

	/**
	 * Returns the value of the '<em><b>Is Decomposed By</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelDecomposes}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelDecomposes#getRelatingObject <em>Relating Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Decomposed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Decomposed By</em>' reference list.
	 * @see #isSetIsDecomposedBy()
	 * @see #unsetIsDecomposedBy()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectDefinition_IsDecomposedBy()
	 * @see ifc2x3tc1.IfcRelDecomposes#getRelatingObject
	 * @model opposite="RelatingObject" unsettable="true"
	 * @generated
	 */
	EList<IfcRelDecomposes> getIsDecomposedBy();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDecomposedBy()
	 * @see #getIsDecomposedBy()
	 * @generated
	 */
	void unsetIsDecomposedBy();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getIsDecomposedBy <em>Is Decomposed By</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Decomposed By</em>' reference list is set.
	 * @see #unsetIsDecomposedBy()
	 * @see #getIsDecomposedBy()
	 * @generated
	 */
	boolean isSetIsDecomposedBy();

	/**
	 * Returns the value of the '<em><b>Decomposes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelDecomposes}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelDecomposes#getRelatedObjects <em>Related Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposes</em>' reference list.
	 * @see #isSetDecomposes()
	 * @see #unsetDecomposes()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectDefinition_Decomposes()
	 * @see ifc2x3tc1.IfcRelDecomposes#getRelatedObjects
	 * @model opposite="RelatedObjects" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelDecomposes> getDecomposes();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDecomposes()
	 * @see #getDecomposes()
	 * @generated
	 */
	void unsetDecomposes();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getDecomposes <em>Decomposes</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Decomposes</em>' reference list is set.
	 * @see #unsetDecomposes()
	 * @see #getDecomposes()
	 * @generated
	 */
	boolean isSetDecomposes();

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectDefinition_HasAssociations()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcRelAssociates> getHasAssociations();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getHasAssociations <em>Has Associations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHasAssociations()
	 * @see #getHasAssociations()
	 * @generated
	 */
	void unsetHasAssociations();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectDefinition#getHasAssociations <em>Has Associations</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Has Associations</em>' reference list is set.
	 * @see #unsetHasAssociations()
	 * @see #getHasAssociations()
	 * @generated
	 */
	boolean isSetHasAssociations();

} // IfcObjectDefinition
