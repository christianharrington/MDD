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
 * A representation of the model object '<em><b>Applicable Dates Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getIfcDateTimeSelect <em>Ifc Date Time Select</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getIfcCalendarDate <em>Ifc Calendar Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getIfcLocalTime <em>Ifc Local Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getIfcDateAndTime <em>Ifc Date And Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType()
 * @model extendedMetaData="name='ApplicableDates_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicableDatesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Date Time Select</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Date Time Select</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Date Time Select</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_IfcDateTimeSelect()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='IfcDateTimeSelect:0'"
	 * @generated
	 */
	FeatureMap getIfcDateTimeSelect();

	/**
	 * Returns the value of the '<em><b>Ifc Calendar Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCalendarDate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Calendar Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Calendar Date</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_IfcCalendarDate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCalendarDate' namespace='##targetNamespace' group='#IfcDateTimeSelect:0'"
	 * @generated
	 */
	EList<IfcCalendarDate> getIfcCalendarDate();

	/**
	 * Returns the value of the '<em><b>Ifc Local Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Local Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Local Time</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_IfcLocalTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcLocalTime' namespace='##targetNamespace' group='#IfcDateTimeSelect:0'"
	 * @generated
	 */
	EList<IfcLocalTime> getIfcLocalTime();

	/**
	 * Returns the value of the '<em><b>Ifc Date And Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDateAndTime}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Date And Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Date And Time</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_IfcDateAndTime()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcDateAndTime' namespace='##targetNamespace' group='#IfcDateTimeSelect:0'"
	 * @generated
	 */
	EList<IfcDateAndTime> getIfcDateAndTime();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getArraySize <em>Array Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Size</em>' attribute.
	 * @see #getArraySize()
	 * @generated
	 */
	void setArraySize(List<BigInteger> value);

	/**
	 * Returns the value of the '<em><b>CType</b></em>' attribute.
	 * The default value is <code>"list"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CType</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CType</em>' attribute.
	 * @see #setCType(List)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_CType()
	 * @model default="list" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcDateTimeSelect"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getApplicableDatesType_ItemType()
	 * @model default="ifc:IfcDateTimeSelect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ApplicableDatesType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // ApplicableDatesType
