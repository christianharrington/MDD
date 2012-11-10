/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextureMap#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureMap()
 * @model
 * @generated
 */
public interface IfcTextureMap extends IfcTextureCoordinate {
	/**
	 * Returns the value of the '<em><b>Texture Maps</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcVertexBasedTextureMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Maps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Maps</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureMap_TextureMaps()
	 * @model
	 * @generated
	 */
	EList<IfcVertexBasedTextureMap> getTextureMaps();

} // IfcTextureMap
