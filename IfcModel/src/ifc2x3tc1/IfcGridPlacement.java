/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGridPlacement()
 * @model
 * @generated
 */
public interface IfcGridPlacement extends IfcObjectPlacement {
	/**
	 * Returns the value of the '<em><b>Placement Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Location</em>' reference.
	 * @see #setPlacementLocation(IfcVirtualGridIntersection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGridPlacement_PlacementLocation()
	 * @model
	 * @generated
	 */
	IfcVirtualGridIntersection getPlacementLocation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Location</em>' reference.
	 * @see #getPlacementLocation()
	 * @generated
	 */
	void setPlacementLocation(IfcVirtualGridIntersection value);

	/**
	 * Returns the value of the '<em><b>Placement Ref Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Ref Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Ref Direction</em>' reference.
	 * @see #isSetPlacementRefDirection()
	 * @see #unsetPlacementRefDirection()
	 * @see #setPlacementRefDirection(IfcVirtualGridIntersection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcGridPlacement_PlacementRefDirection()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcVirtualGridIntersection getPlacementRefDirection();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Ref Direction</em>' reference.
	 * @see #isSetPlacementRefDirection()
	 * @see #unsetPlacementRefDirection()
	 * @see #getPlacementRefDirection()
	 * @generated
	 */
	void setPlacementRefDirection(IfcVirtualGridIntersection value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPlacementRefDirection()
	 * @see #getPlacementRefDirection()
	 * @see #setPlacementRefDirection(IfcVirtualGridIntersection)
	 * @generated
	 */
	void unsetPlacementRefDirection();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Placement Ref Direction</em>' reference is set.
	 * @see #unsetPlacementRefDirection()
	 * @see #getPlacementRefDirection()
	 * @see #setPlacementRefDirection(IfcVirtualGridIntersection)
	 * @generated
	 */
	boolean isSetPlacementRefDirection();

} // IfcGridPlacement
