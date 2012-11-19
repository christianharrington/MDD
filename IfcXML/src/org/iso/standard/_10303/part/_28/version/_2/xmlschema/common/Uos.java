/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uos</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getDescription <em>Description</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getEdo <em>Edo</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getExpress <em>Express</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getId <em>Id</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos()
 * @model extendedMetaData="name='uos' kind='empty'"
 * @generated
 */
public interface Uos extends EObject {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' attribute.
	 * @see #setConfiguration(List)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_Configuration()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.SeqAnyURI" many="false"
	 *        extendedMetaData="kind='attribute' name='configuration'"
	 * @generated
	 */
	List<String> getConfiguration();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getConfiguration <em>Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' attribute.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(List<String> value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Edo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edo</em>' attribute.
	 * @see #setEdo(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_Edo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='edo'"
	 * @generated
	 */
	String getEdo();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getEdo <em>Edo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edo</em>' attribute.
	 * @see #getEdo()
	 * @generated
	 */
	void setEdo(String value);

	/**
	 * Returns the value of the '<em><b>Express</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Express</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Express</em>' attribute.
	 * @see #setExpress(List)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_Express()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.SeqAnyURI" many="false"
	 *        extendedMetaData="kind='attribute' name='express'"
	 * @generated
	 */
	List<String> getExpress();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getExpress <em>Express</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Express</em>' attribute.
	 * @see #getExpress()
	 * @generated
	 */
	void setExpress(List<String> value);

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
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(List)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getUos_SchemaLocation()
	 * @model dataType="org.iso.standard._10303.part._28.version._2.xmlschema.common.SeqAnyURI" many="false"
	 *        extendedMetaData="kind='attribute' name='schemaLocation'"
	 * @generated
	 */
	List<String> getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(List<String> value);

} // Uos
