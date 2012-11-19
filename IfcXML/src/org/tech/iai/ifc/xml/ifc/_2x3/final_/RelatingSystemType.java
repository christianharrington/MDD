/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating System Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSystemType#getIfcSystemGroup <em>Ifc System Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSystemType#getIfcSystem <em>Ifc System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingSystemType()
 * @model extendedMetaData="name='RelatingSystem_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingSystemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc System Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc System Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc System Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingSystemType_IfcSystemGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcSystem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcSystemGroup();

	/**
	 * Returns the value of the '<em><b>Ifc System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc System</em>' containment reference.
	 * @see #setIfcSystem(IfcSystem)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingSystemType_IfcSystem()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSystem' namespace='##targetNamespace' group='IfcSystem:group'"
	 * @generated
	 */
	IfcSystem getIfcSystem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSystemType#getIfcSystem <em>Ifc System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc System</em>' containment reference.
	 * @see #getIfcSystem()
	 * @generated
	 */
	void setIfcSystem(IfcSystem value);

} // RelatingSystemType
