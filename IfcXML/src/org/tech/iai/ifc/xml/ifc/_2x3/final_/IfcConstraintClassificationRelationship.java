/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintClassificationRelationship#getRelatedClassifications <em>Related Classifications</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintClassificationRelationship()
 * @model extendedMetaData="name='IfcConstraintClassificationRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcConstraintClassificationRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Classified Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Constraint</em>' containment reference.
	 * @see #setClassifiedConstraint(ClassifiedConstraintType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintClassificationRelationship_ClassifiedConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ClassifiedConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassifiedConstraintType getClassifiedConstraint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintClassificationRelationship#getClassifiedConstraint <em>Classified Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Constraint</em>' containment reference.
	 * @see #getClassifiedConstraint()
	 * @generated
	 */
	void setClassifiedConstraint(ClassifiedConstraintType value);

	/**
	 * Returns the value of the '<em><b>Related Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Classifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Classifications</em>' containment reference.
	 * @see #setRelatedClassifications(RelatedClassificationsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintClassificationRelationship_RelatedClassifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedClassifications' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedClassificationsType getRelatedClassifications();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintClassificationRelationship#getRelatedClassifications <em>Related Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Classifications</em>' containment reference.
	 * @see #getRelatedClassifications()
	 * @generated
	 */
	void setRelatedClassifications(RelatedClassificationsType value);

} // IfcConstraintClassificationRelationship
