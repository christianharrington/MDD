/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rational Bezier Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRationalBezierCurve#getWeightsData <em>Weights Data</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRationalBezierCurve#getWeightsDataAsString <em>Weights Data As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRationalBezierCurve()
 * @model
 * @generated
 */
public interface IfcRationalBezierCurve extends IfcBezierCurve {
	/**
	 * Returns the value of the '<em><b>Weights Data</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weights Data</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights Data</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRationalBezierCurve_WeightsData()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getWeightsData();

	/**
	 * Returns the value of the '<em><b>Weights Data As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weights Data As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weights Data As String</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRationalBezierCurve_WeightsDataAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getWeightsDataAsString();

} // IfcRationalBezierCurve
