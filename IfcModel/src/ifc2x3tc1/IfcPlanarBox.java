/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Planar Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPlanarBox#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPlanarBox()
 * @model
 * @generated
 */
public interface IfcPlanarBox extends IfcPlanarExtent {
	/**
	 * Returns the value of the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' reference.
	 * @see #setPlacement(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPlanarBox_Placement()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getPlacement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPlanarBox#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(IfcAxis2Placement value);

} // IfcPlanarBox
