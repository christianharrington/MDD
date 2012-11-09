/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcFaceSurface#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFaceSurface()
 * @model
 * @generated
 */
public interface IfcFaceSurface extends IfcFace, IfcSurfaceOrFaceSurface {
	/**
	 * Returns the value of the '<em><b>Face Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Surface</em>' reference.
	 * @see #setFaceSurface(IfcSurface)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFaceSurface_FaceSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getFaceSurface();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Surface</em>' reference.
	 * @see #getFaceSurface()
	 * @generated
	 */
	void setFaceSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setSameSense(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFaceSurface_SameSense()
	 * @model
	 * @generated
	 */
	Tristate getSameSense();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcFaceSurface#getSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getSameSense()
	 * @generated
	 */
	void setSameSense(Tristate value);

} // IfcFaceSurface
