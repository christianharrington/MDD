/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Element Quantity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcElementQuantity#getQuantities <em>Quantities</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementQuantity()
 * @model
 * @generated
 */
public interface IfcElementQuantity extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Method Of Measurement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Of Measurement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Of Measurement</em>' attribute.
	 * @see #isSetMethodOfMeasurement()
	 * @see #unsetMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementQuantity_MethodOfMeasurement()
	 * @model unsettable="true"
	 * @generated
	 */
	String getMethodOfMeasurement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Of Measurement</em>' attribute.
	 * @see #isSetMethodOfMeasurement()
	 * @see #unsetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @generated
	 */
	void setMethodOfMeasurement(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @generated
	 */
	void unsetMethodOfMeasurement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcElementQuantity#getMethodOfMeasurement <em>Method Of Measurement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method Of Measurement</em>' attribute is set.
	 * @see #unsetMethodOfMeasurement()
	 * @see #getMethodOfMeasurement()
	 * @see #setMethodOfMeasurement(String)
	 * @generated
	 */
	boolean isSetMethodOfMeasurement();

	/**
	 * Returns the value of the '<em><b>Quantities</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPhysicalQuantity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantities</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcElementQuantity_Quantities()
	 * @model
	 * @generated
	 */
	EList<IfcPhysicalQuantity> getQuantities();

} // IfcElementQuantity
