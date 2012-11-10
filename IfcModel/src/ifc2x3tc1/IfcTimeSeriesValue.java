/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTimeSeriesValue#getListValues <em>List Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesValue()
 * @model
 * @generated
 */
public interface IfcTimeSeriesValue extends EObject {
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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTimeSeriesValue_ListValues()
	 * @model
	 * @generated
	 */
	EList<IfcValue> getListValues();

} // IfcTimeSeriesValue
