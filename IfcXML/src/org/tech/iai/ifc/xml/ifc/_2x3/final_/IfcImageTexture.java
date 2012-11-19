/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Image Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcImageTexture#getUrlReference <em>Url Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcImageTexture()
 * @model extendedMetaData="name='IfcImageTexture' kind='elementOnly'"
 * @generated
 */
public interface IfcImageTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Url Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Reference</em>' attribute.
	 * @see #setUrlReference(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcImageTexture_UrlReference()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='UrlReference' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrlReference();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcImageTexture#getUrlReference <em>Url Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Reference</em>' attribute.
	 * @see #getUrlReference()
	 * @generated
	 */
	void setUrlReference(String value);

} // IfcImageTexture
