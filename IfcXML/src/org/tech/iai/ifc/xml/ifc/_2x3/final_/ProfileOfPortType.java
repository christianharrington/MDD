/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Of Port Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOfPortType#getIfcProfileDefGroup <em>Ifc Profile Def Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOfPortType#getIfcProfileDef <em>Ifc Profile Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOfPortType()
 * @model extendedMetaData="name='ProfileOfPort_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfileOfPortType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Profile Def Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Profile Def Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Profile Def Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOfPortType_IfcProfileDefGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcProfileDef:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcProfileDefGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Profile Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Profile Def</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Profile Def</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOfPortType_IfcProfileDef()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcProfileDef' namespace='##targetNamespace' group='IfcProfileDef:group'"
	 * @generated
	 */
	IfcProfileDef getIfcProfileDef();

} // ProfileOfPortType
