/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Profile Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProfilePropertiesType#getIfcProfilePropertiesGroup <em>Ifc Profile Properties Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProfilePropertiesType#getIfcProfileProperties <em>Ifc Profile Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingProfilePropertiesType()
 * @model extendedMetaData="name='RelatingProfileProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingProfilePropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Profile Properties Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Profile Properties Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Profile Properties Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingProfilePropertiesType_IfcProfilePropertiesGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcProfileProperties:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcProfilePropertiesGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Profile Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Profile Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Profile Properties</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingProfilePropertiesType_IfcProfileProperties()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcProfileProperties' namespace='##targetNamespace' group='IfcProfileProperties:group'"
	 * @generated
	 */
	IfcProfileProperties getIfcProfileProperties();

} // RelatingProfilePropertiesType
