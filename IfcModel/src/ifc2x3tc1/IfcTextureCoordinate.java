/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Coordinate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureCoordinate()
 * @model
 * @generated
 */
public interface IfcTextureCoordinate extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotated Surface</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcAnnotationSurface}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates <em>Texture Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Surface</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Surface</em>' reference list.
	 * @see #isSetAnnotatedSurface()
	 * @see #unsetAnnotatedSurface()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureCoordinate_AnnotatedSurface()
	 * @see ifc2x3tc1.IfcAnnotationSurface#getTextureCoordinates
	 * @model opposite="TextureCoordinates" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcAnnotationSurface> getAnnotatedSurface();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAnnotatedSurface()
	 * @see #getAnnotatedSurface()
	 * @generated
	 */
	void unsetAnnotatedSurface();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTextureCoordinate#getAnnotatedSurface <em>Annotated Surface</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Annotated Surface</em>' reference list is set.
	 * @see #unsetAnnotatedSurface()
	 * @see #getAnnotatedSurface()
	 * @generated
	 */
	boolean isSetAnnotatedSurface();

} // IfcTextureCoordinate
