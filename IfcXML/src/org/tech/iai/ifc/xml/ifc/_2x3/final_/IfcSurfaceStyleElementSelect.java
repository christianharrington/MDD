/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Style Element Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleShadingGroup <em>Ifc Surface Style Shading Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect()
 * @model extendedMetaData="name='IfcSurfaceStyleElementSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceStyleElementSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Shading Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Shading Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Shading Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcSurfaceStyleShadingGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcSurfaceStyleShading:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcSurfaceStyleShadingGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Shading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Shading</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Shading</em>' containment reference.
	 * @see #setIfcSurfaceStyleShading(IfcSurfaceStyleShading)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcSurfaceStyleShading()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleShading' namespace='##targetNamespace' group='IfcSurfaceStyleShading:group'"
	 * @generated
	 */
	IfcSurfaceStyleShading getIfcSurfaceStyleShading();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Surface Style Shading</em>' containment reference.
	 * @see #getIfcSurfaceStyleShading()
	 * @generated
	 */
	void setIfcSurfaceStyleShading(IfcSurfaceStyleShading value);

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Lighting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Lighting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Lighting</em>' containment reference.
	 * @see #setIfcSurfaceStyleLighting(IfcSurfaceStyleLighting)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcSurfaceStyleLighting()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleLighting' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSurfaceStyleLighting getIfcSurfaceStyleLighting();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Surface Style Lighting</em>' containment reference.
	 * @see #getIfcSurfaceStyleLighting()
	 * @generated
	 */
	void setIfcSurfaceStyleLighting(IfcSurfaceStyleLighting value);

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style With Textures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style With Textures</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style With Textures</em>' containment reference.
	 * @see #setIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcSurfaceStyleWithTextures()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleWithTextures' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSurfaceStyleWithTextures getIfcSurfaceStyleWithTextures();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Surface Style With Textures</em>' containment reference.
	 * @see #getIfcSurfaceStyleWithTextures()
	 * @generated
	 */
	void setIfcSurfaceStyleWithTextures(IfcSurfaceStyleWithTextures value);

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Surface Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Surface Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Surface Style</em>' containment reference.
	 * @see #setIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcExternallyDefinedSurfaceStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedSurfaceStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcExternallyDefinedSurfaceStyle getIfcExternallyDefinedSurfaceStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Externally Defined Surface Style</em>' containment reference.
	 * @see #getIfcExternallyDefinedSurfaceStyle()
	 * @generated
	 */
	void setIfcExternallyDefinedSurfaceStyle(IfcExternallyDefinedSurfaceStyle value);

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Refraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Refraction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Refraction</em>' containment reference.
	 * @see #setIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceStyleElementSelect_IfcSurfaceStyleRefraction()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleRefraction' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSurfaceStyleRefraction getIfcSurfaceStyleRefraction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleElementSelect#getIfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Surface Style Refraction</em>' containment reference.
	 * @see #getIfcSurfaceStyleRefraction()
	 * @generated
	 */
	void setIfcSurfaceStyleRefraction(IfcSurfaceStyleRefraction value);

} // IfcSurfaceStyleElementSelect
