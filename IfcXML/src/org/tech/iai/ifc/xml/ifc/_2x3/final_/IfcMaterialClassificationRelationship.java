/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Classification Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialClassificationRelationship#getMaterialClassifications <em>Material Classifications</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialClassificationRelationship#getClassifiedMaterial <em>Classified Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialClassificationRelationship()
 * @model extendedMetaData="name='IfcMaterialClassificationRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcMaterialClassificationRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Material Classifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Classifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Classifications</em>' containment reference.
	 * @see #setMaterialClassifications(MaterialClassificationsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialClassificationRelationship_MaterialClassifications()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MaterialClassifications' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialClassificationsType getMaterialClassifications();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialClassificationRelationship#getMaterialClassifications <em>Material Classifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Classifications</em>' containment reference.
	 * @see #getMaterialClassifications()
	 * @generated
	 */
	void setMaterialClassifications(MaterialClassificationsType value);

	/**
	 * Returns the value of the '<em><b>Classified Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classified Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Material</em>' containment reference.
	 * @see #setClassifiedMaterial(ClassifiedMaterialType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialClassificationRelationship_ClassifiedMaterial()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ClassifiedMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassifiedMaterialType getClassifiedMaterial();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialClassificationRelationship#getClassifiedMaterial <em>Classified Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Material</em>' containment reference.
	 * @see #getClassifiedMaterial()
	 * @generated
	 */
	void setClassifiedMaterial(ClassifiedMaterialType value);

} // IfcMaterialClassificationRelationship
