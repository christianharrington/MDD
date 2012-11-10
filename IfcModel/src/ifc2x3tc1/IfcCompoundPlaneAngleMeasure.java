/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Compound Plane Angle Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcCompoundPlaneAngleMeasure#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCompoundPlaneAngleMeasure()
 * @model
 * @generated
 */
public interface IfcCompoundPlaneAngleMeasure extends WrappedValue, IfcDerivedMeasureValue {
	/**
	 * Returns the value of the '<em><b>Wrapped Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped Value</em>' attribute list.
	 * @see #isSetWrappedValue()
	 * @see #unsetWrappedValue()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcCompoundPlaneAngleMeasure_WrappedValue()
	 * @model unsettable="true" upper="4"
	 * @generated
	 */
	EList<Integer> getWrappedValue();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcCompoundPlaneAngleMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	void unsetWrappedValue();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcCompoundPlaneAngleMeasure#getWrappedValue <em>Wrapped Value</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wrapped Value</em>' attribute list is set.
	 * @see #unsetWrappedValue()
	 * @see #getWrappedValue()
	 * @generated
	 */
	boolean isSetWrappedValue();

} // IfcCompoundPlaneAngleMeasure
