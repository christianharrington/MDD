/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vertex Based Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexBasedTextureMap#getTextureVertices <em>Texture Vertices</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexBasedTextureMap#getTexturePoints <em>Texture Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexBasedTextureMap()
 * @model extendedMetaData="name='IfcVertexBasedTextureMap' kind='elementOnly'"
 * @generated
 */
public interface IfcVertexBasedTextureMap extends Entity {
	/**
	 * Returns the value of the '<em><b>Texture Vertices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Vertices</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Vertices</em>' containment reference.
	 * @see #setTextureVertices(TextureVerticesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexBasedTextureMap_TextureVertices()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TextureVertices' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureVerticesType getTextureVertices();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexBasedTextureMap#getTextureVertices <em>Texture Vertices</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Vertices</em>' containment reference.
	 * @see #getTextureVertices()
	 * @generated
	 */
	void setTextureVertices(TextureVerticesType value);

	/**
	 * Returns the value of the '<em><b>Texture Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Points</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Points</em>' containment reference.
	 * @see #setTexturePoints(TexturePointsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVertexBasedTextureMap_TexturePoints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TexturePoints' namespace='##targetNamespace'"
	 * @generated
	 */
	TexturePointsType getTexturePoints();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVertexBasedTextureMap#getTexturePoints <em>Texture Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Points</em>' containment reference.
	 * @see #getTexturePoints()
	 * @generated
	 */
	void setTexturePoints(TexturePointsType value);

} // IfcVertexBasedTextureMap
