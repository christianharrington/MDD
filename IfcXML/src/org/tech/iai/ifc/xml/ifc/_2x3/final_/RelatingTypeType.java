/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingTypeType#getIfcTypeObjectGroup <em>Ifc Type Object Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingTypeType#getIfcTypeObject <em>Ifc Type Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingTypeType()
 * @model extendedMetaData="name='RelatingType_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Type Object Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Type Object Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Type Object Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingTypeType_IfcTypeObjectGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcTypeObject:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcTypeObjectGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Type Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Type Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Type Object</em>' containment reference.
	 * @see #setIfcTypeObject(IfcTypeObject)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingTypeType_IfcTypeObject()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcTypeObject' namespace='##targetNamespace' group='IfcTypeObject:group'"
	 * @generated
	 */
	IfcTypeObject getIfcTypeObject();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingTypeType#getIfcTypeObject <em>Ifc Type Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Type Object</em>' containment reference.
	 * @see #getIfcTypeObject()
	 * @generated
	 */
	void setIfcTypeObject(IfcTypeObject value);

} // RelatingTypeType
