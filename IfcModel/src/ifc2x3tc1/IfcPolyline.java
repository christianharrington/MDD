/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Polyline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPolyline#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPolyline()
 * @model
 * @generated
 */
public interface IfcPolyline extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPolyline_Points()
	 * @model
	 * @generated
	 */
	EList<IfcCartesianPoint> getPoints();

} // IfcPolyline
