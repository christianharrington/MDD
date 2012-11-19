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
 * A representation of the model object '<em><b>Fill Styles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcFillStyleSelect <em>Ifc Fill Style Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getIfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType()
 * @model extendedMetaData="name='FillStyles_._type' kind='elementOnly'"
 * @generated
 */
public interface FillStylesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Fill Style Select</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Style Select</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Style Select</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcFillStyleSelect()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IfcFillStyleSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcFillStyleSelect();

	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Hatching</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Hatching</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Hatching</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcFillAreaStyleHatching()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcFillAreaStyleHatching' namespace='##targetNamespace' group='#IfcFillStyleSelect:0'"
	 * @generated
	 */
	EList<IfcFillAreaStyleHatching> getIfcFillAreaStyleHatching();

	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Tiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Tiles</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcFillAreaStyleTiles()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcFillAreaStyleTiles' namespace='##targetNamespace' group='#IfcFillStyleSelect:0'"
	 * @generated
	 */
	EList<IfcFillAreaStyleTiles> getIfcFillAreaStyleTiles();

	/**
	 * Returns the value of the '<em><b>Ifc Colour Specification Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Specification Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Specification Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcColourSpecificationGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='IfcColourSpecification:group' namespace='##targetNamespace' group='#IfcFillStyleSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcColourSpecificationGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Colour Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColourSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Specification</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcColourSpecification()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcColourSpecification' namespace='##targetNamespace' group='IfcColourSpecification:group'"
	 * @generated
	 */
	EList<IfcColourSpecification> getIfcColourSpecification();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Colour Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Colour Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Colour Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcPreDefinedColourGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='IfcPreDefinedColour:group' namespace='##targetNamespace' group='#IfcFillStyleSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcPreDefinedColourGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Colour</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedColour}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Colour</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Colour</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcPreDefinedColour()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedColour' namespace='##targetNamespace' group='IfcPreDefinedColour:group'"
	 * @generated
	 */
	EList<IfcPreDefinedColour> getIfcPreDefinedColour();

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Hatch Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExternallyDefinedHatchStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Hatch Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Hatch Style</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_IfcExternallyDefinedHatchStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedHatchStyle' namespace='##targetNamespace' group='#IfcFillStyleSelect:0'"
	 * @generated
	 */
	EList<IfcExternallyDefinedHatchStyle> getIfcExternallyDefinedHatchStyle();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getArraySize <em>Array Size</em>}' attribute.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_CType()
	 * @model default="set" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcFillStyleSelect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFillStylesType_ItemType()
	 * @model default="ifc:IfcFillStyleSelect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FillStylesType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // FillStylesType
