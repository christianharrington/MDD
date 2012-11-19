/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator()
 * @model abstract="true"
 *        extendedMetaData="name='IfcCartesianTransformationOperator' kind='elementOnly'"
 * @generated
 */
public interface IfcCartesianTransformationOperator extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Axis1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis1</em>' containment reference.
	 * @see #setAxis1(Axis1Type)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator_Axis1()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Axis1' namespace='##targetNamespace'"
	 * @generated
	 */
	Axis1Type getAxis1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getAxis1 <em>Axis1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis1</em>' containment reference.
	 * @see #getAxis1()
	 * @generated
	 */
	void setAxis1(Axis1Type value);

	/**
	 * Returns the value of the '<em><b>Axis2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis2</em>' containment reference.
	 * @see #setAxis2(Axis2Type)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator_Axis2()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Axis2' namespace='##targetNamespace'"
	 * @generated
	 */
	Axis2Type getAxis2();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getAxis2 <em>Axis2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis2</em>' containment reference.
	 * @see #getAxis2()
	 * @generated
	 */
	void setAxis2(Axis2Type value);

	/**
	 * Returns the value of the '<em><b>Local Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Origin</em>' containment reference.
	 * @see #setLocalOrigin(LocalOriginType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator_LocalOrigin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LocalOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalOriginType getLocalOrigin();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getLocalOrigin <em>Local Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Origin</em>' containment reference.
	 * @see #getLocalOrigin()
	 * @generated
	 */
	void setLocalOrigin(LocalOriginType value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator_Scale()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 *        extendedMetaData="kind='element' name='Scale' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getScale();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(Double value);

} // IfcCartesianTransformationOperator
