/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import java.math.BigInteger;

import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.AggregateType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleElementSelect <em>Ifc Surface Style Element Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleShadingGroup <em>Ifc Surface Style Shading Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleShading <em>Ifc Surface Style Shading</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleLighting <em>Ifc Surface Style Lighting</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleWithTextures <em>Ifc Surface Style With Textures</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcExternallyDefinedSurfaceStyle <em>Ifc Externally Defined Surface Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getIfcSurfaceStyleRefraction <em>Ifc Surface Style Refraction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType()
 * @model extendedMetaData="name='Styles_._type' kind='elementOnly'"
 * @generated
 */
public interface StylesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Element Select</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Element Select</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Element Select</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleElementSelect()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcSurfaceStyleElementSelect();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleShadingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='IfcSurfaceStyleShading:group' namespace='##targetNamespace' group='#IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcSurfaceStyleShadingGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Shading</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleShading}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Shading</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Shading</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleShading()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleShading' namespace='##targetNamespace' group='IfcSurfaceStyleShading:group'"
	 * @generated
	 */
	EList<IfcSurfaceStyleShading> getIfcSurfaceStyleShading();

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Lighting</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleLighting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Lighting</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Lighting</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleLighting()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleLighting' namespace='##targetNamespace' group='#IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	EList<IfcSurfaceStyleLighting> getIfcSurfaceStyleLighting();

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style With Textures</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleWithTextures}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style With Textures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style With Textures</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleWithTextures()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleWithTextures' namespace='##targetNamespace' group='#IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	EList<IfcSurfaceStyleWithTextures> getIfcSurfaceStyleWithTextures();

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Surface Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedSurfaceStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Surface Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Surface Style</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcExternallyDefinedSurfaceStyle()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedSurfaceStyle' namespace='##targetNamespace' group='#IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	EList<IfcExternallyDefinedSurfaceStyle> getIfcExternallyDefinedSurfaceStyle();

	/**
	 * Returns the value of the '<em><b>Ifc Surface Style Refraction</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceStyleRefraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Surface Style Refraction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Surface Style Refraction</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_IfcSurfaceStyleRefraction()
	 * @model containment="true" upper="5" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSurfaceStyleRefraction' namespace='##targetNamespace' group='#IfcSurfaceStyleElementSelect:0'"
	 * @generated
	 */
	EList<IfcSurfaceStyleRefraction> getIfcSurfaceStyleRefraction();

	/**
	 * Returns the value of the '<em><b>Array Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Size</em>' attribute.
	 * @see #setArraySize(List)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getArraySize <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Size</em>' attribute.
	 * @see #getArraySize()
	 * @generated
	 */
	void setArraySize(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>CType</b></em>' attribute.
	 * The default value is <code>"set"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CType</em>' attribute.
	 * @see #setCType(List)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_CType()
	 * @model default="set" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcSurfaceStyleElementSelect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getStylesType_ItemType()
	 * @model default="ifc:IfcSurfaceStyleElementSelect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.StylesType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // StylesType
