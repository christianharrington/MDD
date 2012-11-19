/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Structural Member Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructuralMemberType#getIfcStructuralMemberGroup <em>Ifc Structural Member Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingStructuralMemberType#getIfcStructuralMember <em>Ifc Structural Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingStructuralMemberType()
 * @model extendedMetaData="name='RelatingStructuralMember_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingStructuralMemberType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Member Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Member Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Member Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingStructuralMemberType_IfcStructuralMemberGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcStructuralMember:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcStructuralMemberGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Structural Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Member</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingStructuralMemberType_IfcStructuralMember()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralMember' namespace='##targetNamespace' group='IfcStructuralMember:group'"
	 * @generated
	 */
	IfcStructuralMember getIfcStructuralMember();

} // RelatingStructuralMemberType
