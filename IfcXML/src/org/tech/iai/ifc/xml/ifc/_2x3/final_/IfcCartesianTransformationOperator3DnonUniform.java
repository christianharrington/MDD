/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cartesian Transformation Operator3 Dnon Uniform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator3DnonUniform()
 * @model extendedMetaData="name='IfcCartesianTransformationOperator3DnonUniform' kind='elementOnly'"
 * @generated
 */
public interface IfcCartesianTransformationOperator3DnonUniform extends IfcCartesianTransformationOperator3D {
	/**
	 * Returns the value of the '<em><b>Scale2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale2</em>' attribute.
	 * @see #setScale2(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator3DnonUniform_Scale2()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 *        extendedMetaData="kind='element' name='Scale2' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getScale2();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3DnonUniform#getScale2 <em>Scale2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale2</em>' attribute.
	 * @see #getScale2()
	 * @generated
	 */
	void setScale2(Double value);

	/**
	 * Returns the value of the '<em><b>Scale3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale3</em>' attribute.
	 * @see #setScale3(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCartesianTransformationOperator3DnonUniform_Scale3()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 *        extendedMetaData="kind='element' name='Scale3' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getScale3();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator3DnonUniform#getScale3 <em>Scale3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale3</em>' attribute.
	 * @see #getScale3()
	 * @generated
	 */
	void setScale3(Double value);

} // IfcCartesianTransformationOperator3DnonUniform
