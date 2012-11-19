/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rational Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRationalBezierCurve#getWeightsData <em>Weights Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRationalBezierCurve()
 * @model extendedMetaData="name='IfcRationalBezierCurve' kind='elementOnly'"
 * @generated
 */
public interface IfcRationalBezierCurve extends IfcBezierCurve {
	/**
	 * Returns the value of the '<em><b>Weights Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weights Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights Data</em>' containment reference.
	 * @see #setWeightsData(WeightsDataType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRationalBezierCurve_WeightsData()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='WeightsData' namespace='##targetNamespace'"
	 * @generated
	 */
	WeightsDataType getWeightsData();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRationalBezierCurve#getWeightsData <em>Weights Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weights Data</em>' containment reference.
	 * @see #getWeightsData()
	 * @generated
	 */
	void setWeightsData(WeightsDataType value);

} // IfcRationalBezierCurve
