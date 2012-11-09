/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextureVertex#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTextureVertex#getCoordinatesAsString <em>Coordinates As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureVertex()
 * @model
 * @generated
 */
public interface IfcTextureVertex extends EObject {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureVertex_Coordinates()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getCoordinates();

	/**
	 * Returns the value of the '<em><b>Coordinates As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates As String</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureVertex_CoordinatesAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getCoordinatesAsString();

} // IfcTextureVertex
