/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Time Control Type Enum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getValue <em>Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getId <em>Id</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getPath <em>Path</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricTimeControlTypeEnumType()
 * @model extendedMetaData="name='IfcElectricTimeControlTypeEnum_._type' kind='simple'"
 * @generated
 */
public interface IfcElectricTimeControlTypeEnumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnum
	 * @see #setValue(IfcElectricTimeControlTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricTimeControlTypeEnumType_Value()
	 * @model unsettable="true"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	IfcElectricTimeControlTypeEnum getValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnum
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IfcElectricTimeControlTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricTimeControlTypeEnumType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(List)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricTimeControlTypeEnumType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	List<String> getPath();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(List<String> value);

	/**
	 * Returns the value of the '<em><b>Pos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos</em>' attribute.
	 * @see #setPos(List)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricTimeControlTypeEnumType_Pos()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.PosType" many="false"
	 *        extendedMetaData="kind='attribute' name='pos'"
	 * @generated
	 */
	List<BigInteger> getPos();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricTimeControlTypeEnumType#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(List<BigInteger> value);

} // IfcElectricTimeControlTypeEnumType
