/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import java.math.BigInteger;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hex Binary Wrapper Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getId <em>Id</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPath <em>Path</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getHexBinaryWrapperType()
 * @model extendedMetaData="name='hexBinary-wrapper_._type' kind='simple'"
 * @generated
 */
public interface HexBinaryWrapperType extends HexBinary {
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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getHexBinaryWrapperType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getId <em>Id</em>}' attribute.
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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getHexBinaryWrapperType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	List<String> getPath();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPath <em>Path</em>}' attribute.
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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getHexBinaryWrapperType_Pos()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.PosType" many="false"
	 *        extendedMetaData="kind='attribute' name='pos'"
	 * @generated
	 */
	List<BigInteger> getPos();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.HexBinaryWrapperType#getPos <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos</em>' attribute.
	 * @see #getPos()
	 * @generated
	 */
	void setPos(List<BigInteger> value);

} // HexBinaryWrapperType
