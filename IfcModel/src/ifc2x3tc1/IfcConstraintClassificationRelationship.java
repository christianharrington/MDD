/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConstraintClassificationRelationship#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstraintClassificationRelationship()
 * @model
 * @generated
 */
public interface IfcConstraintClassificationRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Classified Constraint</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcConstraint#getClassifiedAs <em>Classified As</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Constraint</em>' reference.
	 * @see #setClassifiedConstraint(IfcConstraint)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstraintClassificationRelationship_ClassifiedConstraint()
	 * @see ifc2x3tc1.IfcConstraint#getClassifiedAs
	 * @model opposite="ClassifiedAs"
	 * @generated
	 */
	IfcConstraint getClassifiedConstraint();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Constraint</em>' reference.
	 * @see #getClassifiedConstraint()
	 * @generated
	 */
	void setClassifiedConstraint(IfcConstraint value);

	/**
	 * Returns the value of the '<em><b>Related Classifications</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcClassificationNotationSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Classifications</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Classifications</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConstraintClassificationRelationship_RelatedClassifications()
	 * @model
	 * @generated
	 */
	EList<IfcClassificationNotationSelect> getRelatedClassifications();

} // IfcConstraintClassificationRelationship
