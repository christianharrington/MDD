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
 * A representation of the model object '<em><b>Tiles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getIfcFillAreaStyleTileShapeSelect <em>Ifc Fill Area Style Tile Shape Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getIfcFillAreaStyleTileSymbolWithStyle <em>Ifc Fill Area Style Tile Symbol With Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType()
 * @model extendedMetaData="name='Tiles_._type' kind='elementOnly'"
 * @generated
 */
public interface TilesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Tile Shape Select</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Tile Shape Select</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Tile Shape Select</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType_IfcFillAreaStyleTileShapeSelect()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IfcFillAreaStyleTileShapeSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcFillAreaStyleTileShapeSelect();

	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Tile Symbol With Style</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTileSymbolWithStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Tile Symbol With Style</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Tile Symbol With Style</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType_IfcFillAreaStyleTileSymbolWithStyle()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcFillAreaStyleTileSymbolWithStyle' namespace='##targetNamespace' group='#IfcFillAreaStyleTileShapeSelect:0'"
	 * @generated
	 */
	EList<IfcFillAreaStyleTileSymbolWithStyle> getIfcFillAreaStyleTileSymbolWithStyle();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getArraySize <em>Array Size</em>}' attribute.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType_CType()
	 * @model default="set" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcFillAreaStyleTileShapeSelect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTilesType_ItemType()
	 * @model default="ifc:IfcFillAreaStyleTileShapeSelect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TilesType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // TilesType
