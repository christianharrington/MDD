/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#isRepeatS <em>Repeat S</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#isRepeatT <em>Repeat T</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceTexture()
 * @model abstract="true"
 *        extendedMetaData="name='IfcSurfaceTexture' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceTexture extends Entity {
	/**
	 * Returns the value of the '<em><b>Repeat S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat S</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat S</em>' attribute.
	 * @see #setRepeatS(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceTexture_RepeatS()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='RepeatS' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRepeatS();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#isRepeatS <em>Repeat S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat S</em>' attribute.
	 * @see #isRepeatS()
	 * @generated
	 */
	void setRepeatS(boolean value);

	/**
	 * Returns the value of the '<em><b>Repeat T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat T</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat T</em>' attribute.
	 * @see #setRepeatT(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceTexture_RepeatT()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='RepeatT' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isRepeatT();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#isRepeatT <em>Repeat T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat T</em>' attribute.
	 * @see #isRepeatT()
	 * @generated
	 */
	void setRepeatT(boolean value);

	/**
	 * Returns the value of the '<em><b>Texture Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTextureEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTextureEnum
	 * @see #setTextureType(IfcSurfaceTextureEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceTexture_TextureType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TextureType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSurfaceTextureEnum getTextureType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#getTextureType <em>Texture Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTextureEnum
	 * @see #getTextureType()
	 * @generated
	 */
	void setTextureType(IfcSurfaceTextureEnum value);

	/**
	 * Returns the value of the '<em><b>Texture Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture Transform</em>' containment reference.
	 * @see #setTextureTransform(TextureTransformType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceTexture_TextureTransform()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TextureTransform' namespace='##targetNamespace'"
	 * @generated
	 */
	TextureTransformType getTextureTransform();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceTexture#getTextureTransform <em>Texture Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture Transform</em>' containment reference.
	 * @see #getTextureTransform()
	 * @generated
	 */
	void setTextureTransform(TextureTransformType value);

} // IfcSurfaceTexture
