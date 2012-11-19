/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleLighting()
 * @model extendedMetaData="name='IfcSurfaceStyleLighting' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleLighting extends Entity {
	/**
	 * Returns the value of the '<em><b>Diffuse Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Transmission Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #setDiffuseTransmissionColour(DiffuseTransmissionColourType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleLighting_DiffuseTransmissionColour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DiffuseTransmissionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	DiffuseTransmissionColourType1 getDiffuseTransmissionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Transmission Colour</em>' containment reference.
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 */
	void setDiffuseTransmissionColour(DiffuseTransmissionColourType1 value);

	/**
	 * Returns the value of the '<em><b>Diffuse Reflection Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffuse Reflection Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffuse Reflection Colour</em>' containment reference.
	 * @see #setDiffuseReflectionColour(DiffuseReflectionColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleLighting_DiffuseReflectionColour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DiffuseReflectionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	DiffuseReflectionColourType getDiffuseReflectionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diffuse Reflection Colour</em>' containment reference.
	 * @see #getDiffuseReflectionColour()
	 * @generated
	 */
	void setDiffuseReflectionColour(DiffuseReflectionColourType value);

	/**
	 * Returns the value of the '<em><b>Transmission Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transmission Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #setTransmissionColour(TransmissionColourType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleLighting_TransmissionColour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TransmissionColour' namespace='##targetNamespace'"
	 * @generated
	 */
	TransmissionColourType1 getTransmissionColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getTransmissionColour <em>Transmission Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmission Colour</em>' containment reference.
	 * @see #getTransmissionColour()
	 * @generated
	 */
	void setTransmissionColour(TransmissionColourType1 value);

	/**
	 * Returns the value of the '<em><b>Reflectance Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflectance Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflectance Colour</em>' containment reference.
	 * @see #setReflectanceColour(ReflectanceColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleLighting_ReflectanceColour()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReflectanceColour' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflectanceColourType getReflectanceColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting#getReflectanceColour <em>Reflectance Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflectance Colour</em>' containment reference.
	 * @see #getReflectanceColour()
	 * @generated
	 */
	void setReflectanceColour(ReflectanceColourType value);

} // IfcSurfaceStyleLighting
