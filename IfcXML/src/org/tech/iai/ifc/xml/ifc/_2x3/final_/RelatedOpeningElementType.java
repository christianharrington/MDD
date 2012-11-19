/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Opening Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedOpeningElementType#getIfcFeatureElementSubtractionGroup <em>Ifc Feature Element Subtraction Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedOpeningElementType#getIfcFeatureElementSubtraction <em>Ifc Feature Element Subtraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedOpeningElementType()
 * @model extendedMetaData="name='RelatedOpeningElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedOpeningElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Feature Element Subtraction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Feature Element Subtraction Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Feature Element Subtraction Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedOpeningElementType_IfcFeatureElementSubtractionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcFeatureElementSubtraction:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcFeatureElementSubtractionGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Feature Element Subtraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Feature Element Subtraction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Feature Element Subtraction</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedOpeningElementType_IfcFeatureElementSubtraction()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcFeatureElementSubtraction' namespace='##targetNamespace' group='IfcFeatureElementSubtraction:group'"
	 * @generated
	 */
	IfcFeatureElementSubtraction getIfcFeatureElementSubtraction();

} // RelatedOpeningElementType
