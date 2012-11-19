/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iso1030328 Header Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getName <em>Name</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getPreprocessorVersion <em>Preprocessor Version</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOriginatingSystem <em>Originating System</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType()
 * @model extendedMetaData="name='iso_10303_28_header_._type' kind='elementOnly'"
 * @generated
 */
public interface Iso1030328HeaderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stamp</em>' attribute.
	 * @see #setTimeStamp(XMLGregorianCalendar)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_TimeStamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='time_stamp' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getTimeStamp();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getTimeStamp <em>Time Stamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stamp</em>' attribute.
	 * @see #getTimeStamp()
	 * @generated
	 */
	void setTimeStamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_Author()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_Organization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Preprocessor Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preprocessor Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessor Version</em>' attribute.
	 * @see #setPreprocessorVersion(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_PreprocessorVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='preprocessor_version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPreprocessorVersion();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getPreprocessorVersion <em>Preprocessor Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preprocessor Version</em>' attribute.
	 * @see #getPreprocessorVersion()
	 * @generated
	 */
	void setPreprocessorVersion(String value);

	/**
	 * Returns the value of the '<em><b>Originating System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating System</em>' attribute.
	 * @see #setOriginatingSystem(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_OriginatingSystem()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='originating_system' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOriginatingSystem();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getOriginatingSystem <em>Originating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating System</em>' attribute.
	 * @see #getOriginatingSystem()
	 * @generated
	 */
	void setOriginatingSystem(String value);

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' attribute.
	 * @see #setAuthorization(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_Authorization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='authorization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthorization();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getAuthorization <em>Authorization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization</em>' attribute.
	 * @see #getAuthorization()
	 * @generated
	 */
	void setAuthorization(String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' attribute.
	 * @see #setDocumentation(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328HeaderType_Documentation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='documentation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDocumentation();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType#getDocumentation <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' attribute.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(String value);

} // Iso1030328HeaderType
