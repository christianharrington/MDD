/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Relaxation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelaxation#getRelaxationValueAsString <em>Relaxation Value As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelaxation#getInitialStress <em>Initial Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelaxation#getInitialStressAsString <em>Initial Stress As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelaxation()
 * @model
 * @generated
 */
public interface IfcRelaxation extends EObject {
	/**
	 * Returns the value of the '<em><b>Relaxation Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxation Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxation Value</em>' attribute.
	 * @see #setRelaxationValue(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelaxation_RelaxationValue()
	 * @model
	 * @generated
	 */
	double getRelaxationValue();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelaxation#getRelaxationValue <em>Relaxation Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxation Value</em>' attribute.
	 * @see #getRelaxationValue()
	 * @generated
	 */
	void setRelaxationValue(double value);

	/**
	 * Returns the value of the '<em><b>Relaxation Value As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxation Value As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxation Value As String</em>' attribute.
	 * @see #setRelaxationValueAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelaxation_RelaxationValueAsString()
	 * @model
	 * @generated
	 */
	String getRelaxationValueAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelaxation#getRelaxationValueAsString <em>Relaxation Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxation Value As String</em>' attribute.
	 * @see #getRelaxationValueAsString()
	 * @generated
	 */
	void setRelaxationValueAsString(String value);

	/**
	 * Returns the value of the '<em><b>Initial Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Stress</em>' attribute.
	 * @see #setInitialStress(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelaxation_InitialStress()
	 * @model
	 * @generated
	 */
	double getInitialStress();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelaxation#getInitialStress <em>Initial Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Stress</em>' attribute.
	 * @see #getInitialStress()
	 * @generated
	 */
	void setInitialStress(double value);

	/**
	 * Returns the value of the '<em><b>Initial Stress As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Stress As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Stress As String</em>' attribute.
	 * @see #setInitialStressAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelaxation_InitialStressAsString()
	 * @model
	 * @generated
	 */
	String getInitialStressAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelaxation#getInitialStressAsString <em>Initial Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Stress As String</em>' attribute.
	 * @see #getInitialStressAsString()
	 * @generated
	 */
	void setInitialStressAsString(String value);

} // IfcRelaxation
