/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVirtualGridIntersection#getOffsetDistances <em>Offset Distances</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVirtualGridIntersection#getOffsetDistancesAsString <em>Offset Distances As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVirtualGridIntersection()
 * @model
 * @generated
 */
public interface IfcVirtualGridIntersection extends EObject {
	/**
	 * Returns the value of the '<em><b>Intersecting Axes</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcGridAxis}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcGridAxis#getHasIntersections <em>Has Intersections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersecting Axes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersecting Axes</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVirtualGridIntersection_IntersectingAxes()
	 * @see ifc2x3tc1.IfcGridAxis#getHasIntersections
	 * @model opposite="HasIntersections"
	 * @generated
	 */
	EList<IfcGridAxis> getIntersectingAxes();

	/**
	 * Returns the value of the '<em><b>Offset Distances</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Distances</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Distances</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVirtualGridIntersection_OffsetDistances()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getOffsetDistances();

	/**
	 * Returns the value of the '<em><b>Offset Distances As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Distances As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Distances As String</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVirtualGridIntersection_OffsetDistancesAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getOffsetDistancesAsString();

} // IfcVirtualGridIntersection
