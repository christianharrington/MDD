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
 * A representation of the model object '<em><b>Time Series References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getIfcDocumentSelect <em>Ifc Document Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getIfcDocumentReference <em>Ifc Document Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getIfcDocumentInformation <em>Ifc Document Information</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType()
 * @model extendedMetaData="name='TimeSeriesReferences_._type' kind='elementOnly'"
 * @generated
 */
public interface TimeSeriesReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Document Select</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Select</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Select</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_IfcDocumentSelect()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IfcDocumentSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcDocumentSelect();

	/**
	 * Returns the value of the '<em><b>Ifc Document Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Reference</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_IfcDocumentReference()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentReference' namespace='##targetNamespace' group='#IfcDocumentSelect:0'"
	 * @generated
	 */
	EList<IfcDocumentReference> getIfcDocumentReference();

	/**
	 * Returns the value of the '<em><b>Ifc Document Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDocumentInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Document Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Document Information</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_IfcDocumentInformation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcDocumentInformation' namespace='##targetNamespace' group='#IfcDocumentSelect:0'"
	 * @generated
	 */
	EList<IfcDocumentInformation> getIfcDocumentInformation();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getArraySize <em>Array Size</em>}' attribute.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_CType()
	 * @model default="set" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcDocumentSelect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTimeSeriesReferencesType_ItemType()
	 * @model default="ifc:IfcDocumentSelect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TimeSeriesReferencesType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // TimeSeriesReferencesType
