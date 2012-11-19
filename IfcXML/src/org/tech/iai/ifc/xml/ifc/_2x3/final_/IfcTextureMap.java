/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextureMap#getTextureMaps <em>Texture Maps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextureMap()
 * @model extendedMetaData="name='IfcTextureMap' kind='elementOnly'"
 * @generated
 */
public interface IfcTextureMap extends IfcTextureCoordinate {
	/**
	 * Returns the value of the '<em><b>Texture Maps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Maps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Maps</em>' containment reference.
	 * @see #setTextureMaps(TextureMapsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextureMap_TextureMaps()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TextureMaps' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureMapsType getTextureMaps();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextureMap#getTextureMaps <em>Texture Maps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Maps</em>' containment reference.
	 * @see #getTextureMaps()
	 * @generated
	 */
	void setTextureMaps(TextureMapsType value);

} // IfcTextureMap
