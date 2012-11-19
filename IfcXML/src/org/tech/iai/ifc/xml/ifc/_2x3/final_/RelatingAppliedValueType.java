/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Applied Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingAppliedValueType#getIfcAppliedValueGroup <em>Ifc Applied Value Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingAppliedValueType#getIfcAppliedValue <em>Ifc Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingAppliedValueType()
 * @model extendedMetaData="name='RelatingAppliedValue_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingAppliedValueType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Applied Value Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Applied Value Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Applied Value Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingAppliedValueType_IfcAppliedValueGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcAppliedValue:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcAppliedValueGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Applied Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Applied Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Applied Value</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingAppliedValueType_IfcAppliedValue()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcAppliedValue' namespace='##targetNamespace' group='IfcAppliedValue:group'"
	 * @generated
	 */
	IfcAppliedValue getIfcAppliedValue();

} // RelatingAppliedValueType
