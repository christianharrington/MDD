/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Long Wrapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getValue <em>Value</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getId <em>Id</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPath <em>Path</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getLongWrapperType()
 * @model extendedMetaData="name='long-wrapper_._type' kind='simple'"
 * @generated
 */
public interface LongWrapperType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Long)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getLongWrapperType_Value()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.LongObject"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	Long getValue();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Long value);

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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getLongWrapperType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getId <em>Id</em>}' attribute.
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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getLongWrapperType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	List<String> getPath();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPath <em>Path</em>}' attribute.
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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getLongWrapperType_Pos()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.PosType" many="false"
	 *        extendedMetaData="kind='attribute' name='pos'"
	 * @generated
	 */
	List<BigInteger> getPos();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.LongWrapperType#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(List<BigInteger> value);

} // LongWrapperType
