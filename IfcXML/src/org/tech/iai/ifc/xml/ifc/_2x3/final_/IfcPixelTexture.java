/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pixel Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getHeight <em>Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getColourComponents <em>Colour Components</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getPixel <em>Pixel</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPixelTexture()
 * @model extendedMetaData="name='IfcPixelTexture' kind='elementOnly'"
 * @generated
 */
public interface IfcPixelTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPixelTexture_Width()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInteger" required="true"
	 *        extendedMetaData="kind='element' name='Width' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getWidth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Long value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPixelTexture_Height()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInteger" required="true"
	 *        extendedMetaData="kind='element' name='Height' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getHeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Long value);

	/**
	 * Returns the value of the '<em><b>Colour Components</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Components</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Components</em>' attribute.
	 * @see #setColourComponents(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPixelTexture_ColourComponents()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInteger" required="true"
	 *        extendedMetaData="kind='element' name='ColourComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getColourComponents();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getColourComponents <em>Colour Components</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Components</em>' attribute.
	 * @see #getColourComponents()
	 * @generated
	 */
	void setColourComponents(Long value);

	/**
	 * Returns the value of the '<em><b>Pixel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pixel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pixel</em>' containment reference.
	 * @see #setPixel(PixelType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPixelTexture_Pixel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pixel' namespace='##targetNamespace'"
	 * @generated
	 */
	PixelType getPixel();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPixelTexture#getPixel <em>Pixel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pixel</em>' containment reference.
	 * @see #getPixel()
	 * @generated
	 */
	void setPixel(PixelType value);

} // IfcPixelTexture
