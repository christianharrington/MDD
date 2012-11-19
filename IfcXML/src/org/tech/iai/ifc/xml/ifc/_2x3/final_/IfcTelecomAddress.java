/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress()
 * @model extendedMetaData="name='IfcTelecomAddress' kind='elementOnly'"
 * @generated
 */
public interface IfcTelecomAddress extends IfcAddress {
	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Numbers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' containment reference.
	 * @see #setTelephoneNumbers(TelephoneNumbersType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress_TelephoneNumbers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TelephoneNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	TelephoneNumbersType getTelephoneNumbers();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone Numbers</em>' containment reference.
	 * @see #getTelephoneNumbers()
	 * @generated
	 */
	void setTelephoneNumbers(TelephoneNumbersType value);

	/**
	 * Returns the value of the '<em><b>Facsimile Numbers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facsimile Numbers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facsimile Numbers</em>' containment reference.
	 * @see #setFacsimileNumbers(FacsimileNumbersType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress_FacsimileNumbers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FacsimileNumbers' namespace='##targetNamespace'"
	 * @generated
	 */
	FacsimileNumbersType getFacsimileNumbers();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facsimile Numbers</em>' containment reference.
	 * @see #getFacsimileNumbers()
	 * @generated
	 */
	void setFacsimileNumbers(FacsimileNumbersType value);

	/**
	 * Returns the value of the '<em><b>Pager Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pager Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pager Number</em>' attribute.
	 * @see #setPagerNumber(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress_PagerNumber()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='PagerNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPagerNumber();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pager Number</em>' attribute.
	 * @see #getPagerNumber()
	 * @generated
	 */
	void setPagerNumber(String value);

	/**
	 * Returns the value of the '<em><b>Electronic Mail Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Mail Addresses</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Mail Addresses</em>' containment reference.
	 * @see #setElectronicMailAddresses(ElectronicMailAddressesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress_ElectronicMailAddresses()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ElectronicMailAddresses' namespace='##targetNamespace'"
	 * @generated
	 */
	ElectronicMailAddressesType getElectronicMailAddresses();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electronic Mail Addresses</em>' containment reference.
	 * @see #getElectronicMailAddresses()
	 * @generated
	 */
	void setElectronicMailAddresses(ElectronicMailAddressesType value);

	/**
	 * Returns the value of the '<em><b>WWW Home Page URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WWW Home Page URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #setWWWHomePageURL(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTelecomAddress_WWWHomePageURL()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='WWWHomePageURL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWWWHomePageURL();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #getWWWHomePageURL()
	 * @generated
	 */
	void setWWWHomePageURL(String value);

} // IfcTelecomAddress
