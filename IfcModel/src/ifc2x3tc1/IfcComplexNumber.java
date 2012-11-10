/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Complex Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcComplexNumber#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcComplexNumber#getWrappedValueAsString <em>Wrapped Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcComplexNumber()
 * @model
 * @generated
 */
public interface IfcComplexNumber extends WrappedValue, IfcMeasureValue {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute list.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcComplexNumber_WrappedValue()
	 * @model unsettable="true" upper="2"
	 * @generated
	 */
	EList<Double> getWrappedValue();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcComplexNumber#getWrappedValue <em>Wrapped Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcComplexNumber#getWrappedValue <em>Wrapped Value</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute list is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	boolean isSetWrappedValue();

	/**
	 * Returns the value of the '<em><b>Wrapped Value As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value As String</em>' attribute list.
	 * @see #isSetWrappedValueAsString()
	 * @see #unsetWrappedValueAsString()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcComplexNumber_WrappedValueAsString()
	 * @model unsettable="true" upper="2"
	 * @generated
	 */
	EList<String> getWrappedValueAsString();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcComplexNumber#getWrappedValueAsString <em>Wrapped Value As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValueAsString()
	 * @see #getWrappedValueAsString()
	 * @generated
	 */
	void unsetWrappedValueAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcComplexNumber#getWrappedValueAsString <em>Wrapped Value As String</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value As String</em>' attribute list is set.
	 * @see #unsetWrappedValueAsString()
	 * @see #getWrappedValueAsString()
	 * @generated
	 */
	boolean isSetWrappedValueAsString();

} // IfcComplexNumber
