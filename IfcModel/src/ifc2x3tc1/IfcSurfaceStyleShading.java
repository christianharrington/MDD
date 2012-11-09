/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Shading</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleShading()
 * @model
 * @generated
 */
public interface IfcSurfaceStyleShading extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Surface Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Colour</em>' reference.
	 * @see #setSurfaceColour(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleShading_SurfaceColour()
	 * @model
	 * @generated
	 */
	IfcColourRgb getSurfaceColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceStyleShading#getSurfaceColour <em>Surface Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface Colour</em>' reference.
	 * @see #getSurfaceColour()
	 * @generated
	 */
	void setSurfaceColour(IfcColourRgb value);

} // IfcSurfaceStyleShading
