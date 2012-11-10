/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Object Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectPlacement()
 * @model
 * @generated
 */
public interface IfcObjectPlacement extends EObject {
	/**
	 * Returns the value of the '<em><b>Places Object</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcProduct}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcProduct#getObjectPlacement <em>Object Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places Object</em>' reference list.
	 * @see #isSetPlacesObject()
	 * @see #unsetPlacesObject()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectPlacement_PlacesObject()
	 * @see ifc2x3tc1.IfcProduct#getObjectPlacement
	 * @model opposite="ObjectPlacement" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcProduct> getPlacesObject();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacesObject()
	 * @see #getPlacesObject()
	 * @generated
	 */
	void unsetPlacesObject();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectPlacement#getPlacesObject <em>Places Object</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Places Object</em>' reference list is set.
	 * @see #unsetPlacesObject()
	 * @see #getPlacesObject()
	 * @generated
	 */
	boolean isSetPlacesObject();

	/**
	 * Returns the value of the '<em><b>Referenced By Placements</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcLocalPlacement}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By Placements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By Placements</em>' reference list.
	 * @see #isSetReferencedByPlacements()
	 * @see #unsetReferencedByPlacements()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcObjectPlacement_ReferencedByPlacements()
	 * @see ifc2x3tc1.IfcLocalPlacement#getPlacementRelTo
	 * @model opposite="PlacementRelTo" unsettable="true"
	 * @generated
	 */
	EList<IfcLocalPlacement> getReferencedByPlacements();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferencedByPlacements()
	 * @see #getReferencedByPlacements()
	 * @generated
	 */
	void unsetReferencedByPlacements();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcObjectPlacement#getReferencedByPlacements <em>Referenced By Placements</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Referenced By Placements</em>' reference list is set.
	 * @see #unsetReferencedByPlacements()
	 * @see #getReferencedByPlacements()
	 * @generated
	 */
	boolean isSetReferencedByPlacements();

} // IfcObjectPlacement
