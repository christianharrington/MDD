/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator3D()
 * @model extendedMetaData="name='IfcCartesianTransformationOperator3D' kind='elementOnly'"
 * @generated
 */
public interface IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator {
	/**
	 * Returns the value of the '<em><b>Axis3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis3</em>' containment reference.
	 * @see #setAxis3(Axis3Type)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator3D_Axis3()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Axis3' namespace='##targetNamespace'"
	 * @generated
	 */
	Axis3Type getAxis3();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3D#getAxis3 <em>Axis3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis3</em>' containment reference.
	 * @see #getAxis3()
	 * @generated
	 */
	void setAxis3(Axis3Type value);

} // IfcCartesianTransformationOperator3D
