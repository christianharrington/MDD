/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applied Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedConditionType#getIfcBoundaryConditionGroup <em>Ifc Boundary Condition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedConditionType#getIfcBoundaryCondition <em>Ifc Boundary Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedConditionType()
 * @model extendedMetaData="name='AppliedCondition_._type' kind='elementOnly'"
 * @generated
 */
public interface AppliedConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Boundary Condition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Boundary Condition Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Boundary Condition Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedConditionType_IfcBoundaryConditionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcBoundaryCondition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcBoundaryConditionGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Boundary Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Boundary Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Boundary Condition</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAppliedConditionType_IfcBoundaryCondition()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcBoundaryCondition' namespace='##targetNamespace' group='IfcBoundaryCondition:group'"
	 * @generated
	 */
	IfcBoundaryCondition getIfcBoundaryCondition();

} // AppliedConditionType
