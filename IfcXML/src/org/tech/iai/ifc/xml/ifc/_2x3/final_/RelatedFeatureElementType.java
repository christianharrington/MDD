/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Feature Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedFeatureElementType#getIfcFeatureElementAdditionGroup <em>Ifc Feature Element Addition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedFeatureElementType#getIfcFeatureElementAddition <em>Ifc Feature Element Addition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedFeatureElementType()
 * @model extendedMetaData="name='RelatedFeatureElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedFeatureElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Feature Element Addition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Feature Element Addition Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Feature Element Addition Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedFeatureElementType_IfcFeatureElementAdditionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcFeatureElementAddition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcFeatureElementAdditionGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Feature Element Addition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Feature Element Addition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Feature Element Addition</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedFeatureElementType_IfcFeatureElementAddition()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcFeatureElementAddition' namespace='##targetNamespace' group='IfcFeatureElementAddition:group'"
	 * @generated
	 */
	IfcFeatureElementAddition getIfcFeatureElementAddition();

} // RelatedFeatureElementType
