/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Structural Activity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralActivityType#getIfcStructuralActivityGroup <em>Ifc Structural Activity Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedStructuralActivityType#getIfcStructuralActivity <em>Ifc Structural Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedStructuralActivityType()
 * @model extendedMetaData="name='RelatedStructuralActivity_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedStructuralActivityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Activity Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Activity Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Activity Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedStructuralActivityType_IfcStructuralActivityGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcStructuralActivity:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcStructuralActivityGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Structural Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Activity</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedStructuralActivityType_IfcStructuralActivity()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralActivity' namespace='##targetNamespace' group='IfcStructuralActivity:group'"
	 * @generated
	 */
	IfcStructuralActivity getIfcStructuralActivity();

} // RelatedStructuralActivityType
