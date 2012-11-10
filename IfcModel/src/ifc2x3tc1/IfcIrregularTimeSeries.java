/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Irregular Time Series</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcIrregularTimeSeries#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcIrregularTimeSeries()
 * @model
 * @generated
 */
public interface IfcIrregularTimeSeries extends IfcTimeSeries {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcIrregularTimeSeriesValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcIrregularTimeSeries_Values()
	 * @model
	 * @generated
	 */
	EList<IfcIrregularTimeSeriesValue> getValues();

} // IfcIrregularTimeSeries
