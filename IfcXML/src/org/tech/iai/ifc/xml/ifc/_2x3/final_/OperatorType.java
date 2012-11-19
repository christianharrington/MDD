/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OperatorType#getIfcCartesianTransformationOperator2DGroup <em>Ifc Cartesian Transformation Operator2 DGroup</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OperatorType#getIfcCartesianTransformationOperator2D <em>Ifc Cartesian Transformation Operator2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOperatorType()
 * @model extendedMetaData="name='Operator_._type' kind='elementOnly'"
 * @generated
 */
public interface OperatorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Transformation Operator2 DGroup</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Transformation Operator2 DGroup</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Transformation Operator2 DGroup</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOperatorType_IfcCartesianTransformationOperator2DGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcCartesianTransformationOperator2D:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcCartesianTransformationOperator2DGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Transformation Operator2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Transformation Operator2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Transformation Operator2 D</em>' containment reference.
	 * @see #setIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOperatorType_IfcCartesianTransformationOperator2D()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCartesianTransformationOperator2D' namespace='##targetNamespace' group='IfcCartesianTransformationOperator2D:group'"
	 * @generated
	 */
	IfcCartesianTransformationOperator2D getIfcCartesianTransformationOperator2D();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OperatorType#getIfcCartesianTransformationOperator2D <em>Ifc Cartesian Transformation Operator2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cartesian Transformation Operator2 D</em>' containment reference.
	 * @see #getIfcCartesianTransformationOperator2D()
	 * @generated
	 */
	void setIfcCartesianTransformationOperator2D(IfcCartesianTransformationOperator2D value);

} // OperatorType
