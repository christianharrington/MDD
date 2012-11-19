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
 * A representation of the model object '<em><b>Subsequent Applied Loads Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getIfcStructuralLoad <em>Ifc Structural Load</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getArraySize <em>Array Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getCType <em>CType</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType()
 * @model extendedMetaData="name='SubsequentAppliedLoads_._type' kind='elementOnly'"
 * @generated
 */
public interface SubsequentAppliedLoadsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Load Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Load Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Load Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType_IfcStructuralLoadGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" lower="2" many="true"
	 *        extendedMetaData="kind='group' name='IfcStructuralLoad:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcStructuralLoadGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Structural Load</b></em>' containment reference list.
	 * The list contents are of type {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoad}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Load</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Load</em>' containment reference list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType_IfcStructuralLoad()
	 * @model containment="true" lower="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralLoad' namespace='##targetNamespace' group='IfcStructuralLoad:group'"
	 * @generated
	 */
	EList<IfcStructuralLoad> getIfcStructuralLoad();

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType_ArraySize()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.ArraySizeType" many="false"
	 *        extendedMetaData="kind='attribute' name='arraySize' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<BigInteger> getArraySize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getArraySize <em>Array Size</em>}' attribute.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType_CType()
	 * @model default="list" unsettable="true" dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.CTypeType" many="false"
	 *        extendedMetaData="kind='attribute' name='cType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	List<AggregateType> getCType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getCType <em>CType</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CType</em>' attribute.
	 * @see #getCType()
	 * @generated
	 */
	void setCType(List<AggregateType> value);

	/**
	 * Returns the value of the '<em><b>Item Type</b></em>' attribute.
	 * The default value is <code>"ifc:IfcStructuralLoad"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Type</em>' attribute.
	 * @see #setItemType(QName)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSubsequentAppliedLoadsType_ItemType()
	 * @model default="ifc:IfcStructuralLoad" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='itemType' namespace='urn:iso.org:standard:10303:part(28):version(2):xmlschema:common'"
	 * @generated
	 */
	QName getItemType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SubsequentAppliedLoadsType#getItemType <em>Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Type</em>' attribute.
	 * @see #getItemType()
	 * @generated
	 */
	void setItemType(QName value);

} // SubsequentAppliedLoadsType
