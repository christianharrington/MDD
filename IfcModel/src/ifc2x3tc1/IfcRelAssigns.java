/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjects <em>Related Objects</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssigns()
 * @model
 * @generated
 */
public interface IfcRelAssigns extends IfcRelationship {
	/**
	 * Returns the value of the '<em><b>Related Objects</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcObjectDefinition}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcObjectDefinition#getHasAssignments <em>Has Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssigns_RelatedObjects()
	 * @see ifc2x3tc1.IfcObjectDefinition#getHasAssignments
	 * @model opposite="HasAssignments"
	 * @generated
	 */
	EList<IfcObjectDefinition> getRelatedObjects();

	/**
	 * Returns the value of the '<em><b>Related Objects Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcObjectTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Objects Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Objects Type</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectTypeEnum
	 * @see #isSetRelatedObjectsType()
	 * @see #unsetRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssigns_RelatedObjectsType()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcObjectTypeEnum getRelatedObjectsType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Objects Type</em>' attribute.
	 * @see ifc2x3tc1.IfcObjectTypeEnum
	 * @see #isSetRelatedObjectsType()
	 * @see #unsetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @generated
	 */
	void setRelatedObjectsType(IfcObjectTypeEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @generated
	 */
	void unsetRelatedObjectsType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelAssigns#getRelatedObjectsType <em>Related Objects Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Objects Type</em>' attribute is set.
	 * @see #unsetRelatedObjectsType()
	 * @see #getRelatedObjectsType()
	 * @see #setRelatedObjectsType(IfcObjectTypeEnum)
	 * @generated
	 */
	boolean isSetRelatedObjectsType();

} // IfcRelAssigns
