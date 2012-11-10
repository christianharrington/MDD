/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Irregular Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcIrregularTimeSeriesValue#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcIrregularTimeSeriesValue#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcIrregularTimeSeriesValue()
 * @model
 * @generated
 */
public interface IfcIrregularTimeSeriesValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' reference.
	 * @see #setTimeStamp(IfcDateTimeSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcIrregularTimeSeriesValue_TimeStamp()
	 * @model
	 * @generated
	 */
	IfcDateTimeSelect getTimeStamp();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcIrregularTimeSeriesValue#getTimeStamp <em>Time Stamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' reference.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(IfcDateTimeSelect value);

	/**
	 * Returns the value of the '<em><b>List Values</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Values</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcIrregularTimeSeriesValue_ListValues()
	 * @model
	 * @generated
	 */
	EList<IfcValue> getListValues();

} // IfcIrregularTimeSeriesValue
