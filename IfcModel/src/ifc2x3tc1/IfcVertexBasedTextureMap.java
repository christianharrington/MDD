/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcVertexBasedTextureMap#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVertexBasedTextureMap#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVertexBasedTextureMap()
 * @model
 * @generated
 */
public interface IfcVertexBasedTextureMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Texture Vertices</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcTextureVertex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Vertices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Vertices</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVertexBasedTextureMap_TextureVertices()
	 * @model
	 * @generated
	 */
	EList<IfcTextureVertex> getTextureVertices();

	/**
	 * Returns the value of the '<em><b>Texture Points</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcCartesianPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Points</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Points</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVertexBasedTextureMap_TexturePoints()
	 * @model
	 * @generated
	 */
	EList<IfcCartesianPoint> getTexturePoints();

} // IfcVertexBasedTextureMap
