/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Rendering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getDiffuseColour <em>Diffuse Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getReflectionColour <em>Reflection Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getSpecularColour <em>Specular Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getSpecularHighlight <em>Specular Highlight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering()
 * @model extendedMetaData="name='IfcSurfaceStyleRendering' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleRendering extends IfcSurfaceStyleShading {
	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_Transparency()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='Transparency' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTransparency();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(Double value);

	/**
	 * Returns the value of the '<em><b>Diffuse Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Colour</em>' containment reference.
	 * @see #setDiffuseColour(DiffuseColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_DiffuseColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiffuseColour' namespace='##targetNamespace'"
	 * @generated
	 */
	DiffuseColourType getDiffuseColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getDiffuseColour <em>Diffuse Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Colour</em>' containment reference.
	 * @see #getDiffuseColour()
	 * @generated
	 */
	void setDiffuseColour(DiffuseColourType value);

	/**
	 * Returns the value of the '<em><b>Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #setTransmissionColour(TransmissionColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_TransmissionColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TransmissionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionColourType getTransmissionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getTransmissionColour <em>Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #getTransmissionColour()
	 * @generated
	 */
	void setTransmissionColour(TransmissionColourType value);

	/**
	 * Returns the value of the '<em><b>Diffuse Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Transmission Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #setDiffuseTransmissionColour(DiffuseTransmissionColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_DiffuseTransmissionColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='DiffuseTransmissionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	DiffuseTransmissionColourType getDiffuseTransmissionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 */
	void setDiffuseTransmissionColour(DiffuseTransmissionColourType value);

	/**
	 * Returns the value of the '<em><b>Reflection Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflection Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflection Colour</em>' containment reference.
	 * @see #setReflectionColour(ReflectionColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_ReflectionColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReflectionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflectionColourType getReflectionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getReflectionColour <em>Reflection Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflection Colour</em>' containment reference.
	 * @see #getReflectionColour()
	 * @generated
	 */
	void setReflectionColour(ReflectionColourType value);

	/**
	 * Returns the value of the '<em><b>Specular Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Colour</em>' containment reference.
	 * @see #setSpecularColour(SpecularColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_SpecularColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SpecularColour' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecularColourType getSpecularColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getSpecularColour <em>Specular Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Colour</em>' containment reference.
	 * @see #getSpecularColour()
	 * @generated
	 */
	void setSpecularColour(SpecularColourType value);

	/**
	 * Returns the value of the '<em><b>Specular Highlight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specular Highlight</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specular Highlight</em>' containment reference.
	 * @see #setSpecularHighlight(SpecularHighlightType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_SpecularHighlight()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SpecularHighlight' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecularHighlightType getSpecularHighlight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getSpecularHighlight <em>Specular Highlight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specular Highlight</em>' containment reference.
	 * @see #getSpecularHighlight()
	 * @generated
	 */
	void setSpecularHighlight(SpecularHighlightType value);

	/**
	 * Returns the value of the '<em><b>Reflectance Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReflectanceMethodEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectance Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflectance Method</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReflectanceMethodEnum
	 * @see #setReflectanceMethod(IfcReflectanceMethodEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleRendering_ReflectanceMethod()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ReflectanceMethod' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcReflectanceMethodEnum getReflectanceMethod();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRendering#getReflectanceMethod <em>Reflectance Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflectance Method</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReflectanceMethodEnum
	 * @see #getReflectanceMethod()
	 * @generated
	 */
	void setReflectanceMethod(IfcReflectanceMethodEnum value);

} // IfcSurfaceStyleRendering
