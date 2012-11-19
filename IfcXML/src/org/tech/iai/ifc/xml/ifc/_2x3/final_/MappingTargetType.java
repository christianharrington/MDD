/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingTargetType#getIfcCartesianTransformationOperatorGroup <em>Ifc Cartesian Transformation Operator Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingTargetType#getIfcCartesianTransformationOperator <em>Ifc Cartesian Transformation Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingTargetType()
 * @model extendedMetaData="name='MappingTarget_._type' kind='elementOnly'"
 * @generated
 */
public interface MappingTargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Transformation Operator Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Transformation Operator Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Transformation Operator Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingTargetType_IfcCartesianTransformationOperatorGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcCartesianTransformationOperator:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcCartesianTransformationOperatorGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Transformation Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Transformation Operator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Transformation Operator</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingTargetType_IfcCartesianTransformationOperator()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCartesianTransformationOperator' namespace='##targetNamespace' group='IfcCartesianTransformationOperator:group'"
	 * @generated
	 */
	IfcCartesianTransformationOperator getIfcCartesianTransformationOperator();

} // MappingTargetType
