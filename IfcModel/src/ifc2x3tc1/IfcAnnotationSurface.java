/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcAnnotationSurface#getItem <em>Item</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAnnotationSurface()
 * @model
 * @generated
 */
public interface IfcAnnotationSurface extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' reference.
	 * @see #setItem(IfcGeometricRepresentationItem)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAnnotationSurface_Item()
	 * @model
	 * @generated
	 */
	IfcGeometricRepresentationItem getItem();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAnnotationSurface#getItem <em>Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(IfcGeometricRepresentationItem value);

	/**
	 * Returns the value of the '<em><b>Texture Coordinates</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Coordinates</em>' reference.
	 * @see #isSetTextureCoordinates()
	 * @see #unsetTextureCoordinates()
	 * @see #setTextureCoordinates(IfcTextureCoordinate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAnnotationSurface_TextureCoordinates()
	 * @see ifc2x3tc1.IfcTextureCoordinate#getAnnotatedSurface
	 * @model opposite="AnnotatedSurface" unsettable="true"
	 * @generated
	 */
	IfcTextureCoordinate getTextureCoordinates();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Coordinates</em>' reference.
	 * @see #isSetTextureCoordinates()
	 * @see #unsetTextureCoordinates()
	 * @see #getTextureCoordinates()
	 * @generated
	 */
	void setTextureCoordinates(IfcTextureCoordinate value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextureCoordinates()
	 * @see #getTextureCoordinates()
	 * @see #setTextureCoordinates(IfcTextureCoordinate)
	 * @generated
	 */
	void unsetTextureCoordinates();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Texture Coordinates</em>' reference is set.
	 * @see #unsetTextureCoordinates()
	 * @see #getTextureCoordinates()
	 * @see #setTextureCoordinates(IfcTextureCoordinate)
	 * @generated
	 */
	boolean isSetTextureCoordinates();

} // IfcAnnotationSurface
