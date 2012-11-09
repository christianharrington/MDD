/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleLighting()
 * @model
 * @generated
 */
public interface IfcSurfaceStyleLighting extends IfcSurfaceStyleElementSelect {
	/**
	 * Returns the value of the '<em><b>Diffuse Transmission Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Transmission Colour</em>' reference.
	 * @see #setDiffuseTransmissionColour(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleLighting_DiffuseTransmissionColour()
	 * @model
	 * @generated
	 */
	IfcColourRgb getDiffuseTransmissionColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Transmission Colour</em>' reference.
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 */
	void setDiffuseTransmissionColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Diffuse Reflection Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Reflection Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Reflection Colour</em>' reference.
	 * @see #setDiffuseReflectionColour(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleLighting_DiffuseReflectionColour()
	 * @model
	 * @generated
	 */
	IfcColourRgb getDiffuseReflectionColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Reflection Colour</em>' reference.
	 * @see #getDiffuseReflectionColour()
	 * @generated
	 */
	void setDiffuseReflectionColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Transmission Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Colour</em>' reference.
	 * @see #setTransmissionColour(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleLighting_TransmissionColour()
	 * @model
	 * @generated
	 */
	IfcColourRgb getTransmissionColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Colour</em>' reference.
	 * @see #getTransmissionColour()
	 * @generated
	 */
	void setTransmissionColour(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Reflectance Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectance Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflectance Colour</em>' reference.
	 * @see #setReflectanceColour(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSurfaceStyleLighting_ReflectanceColour()
	 * @model
	 * @generated
	 */
	IfcColourRgb getReflectanceColour();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflectance Colour</em>' reference.
	 * @see #getReflectanceColour()
	 * @generated
	 */
	void setReflectanceColour(IfcColourRgb value);

} // IfcSurfaceStyleLighting
