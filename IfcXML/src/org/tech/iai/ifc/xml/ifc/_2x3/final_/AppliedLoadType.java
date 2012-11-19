/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Load Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedLoadType#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedLoadType#getIfcStructuralLoad <em>Ifc Structural Load</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedLoadType()
 * @model extendedMetaData="name='AppliedLoad_._type' kind='elementOnly'"
 * @generated
 */
public interface AppliedLoadType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Load Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Load Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Load Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedLoadType_IfcStructuralLoadGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcStructuralLoad:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcStructuralLoadGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Structural Load</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Load</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Load</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedLoadType_IfcStructuralLoad()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralLoad' namespace='##targetNamespace' group='IfcStructuralLoad:group'"
	 * @generated
	 */
	IfcStructuralLoad getIfcStructuralLoad();

} // AppliedLoadType
