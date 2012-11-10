/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress()
 * @model
 * @generated
 */
public interface IfcTelecomAddress extends IfcAddress {
	/**
	 * Returns the value of the '<em><b>Telephone Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Telephone Numbers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone Numbers</em>' attribute list.
	 * @see #isSetTelephoneNumbers()
	 * @see #unsetTelephoneNumbers()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress_TelephoneNumbers()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getTelephoneNumbers();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTelephoneNumbers()
	 * @see #getTelephoneNumbers()
	 * @generated
	 */
	void unsetTelephoneNumbers();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getTelephoneNumbers <em>Telephone Numbers</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Telephone Numbers</em>' attribute list is set.
	 * @see #unsetTelephoneNumbers()
	 * @see #getTelephoneNumbers()
	 * @generated
	 */
	boolean isSetTelephoneNumbers();

	/**
	 * Returns the value of the '<em><b>Facsimile Numbers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facsimile Numbers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facsimile Numbers</em>' attribute list.
	 * @see #isSetFacsimileNumbers()
	 * @see #unsetFacsimileNumbers()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress_FacsimileNumbers()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getFacsimileNumbers();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFacsimileNumbers()
	 * @see #getFacsimileNumbers()
	 * @generated
	 */
	void unsetFacsimileNumbers();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getFacsimileNumbers <em>Facsimile Numbers</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Facsimile Numbers</em>' attribute list is set.
	 * @see #unsetFacsimileNumbers()
	 * @see #getFacsimileNumbers()
	 * @generated
	 */
	boolean isSetFacsimileNumbers();

	/**
	 * Returns the value of the '<em><b>Pager Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pager Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pager Number</em>' attribute.
	 * @see #isSetPagerNumber()
	 * @see #unsetPagerNumber()
	 * @see #setPagerNumber(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress_PagerNumber()
	 * @model unsettable="true"
	 * @generated
	 */
	String getPagerNumber();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pager Number</em>' attribute.
	 * @see #isSetPagerNumber()
	 * @see #unsetPagerNumber()
	 * @see #getPagerNumber()
	 * @generated
	 */
	void setPagerNumber(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPagerNumber()
	 * @see #getPagerNumber()
	 * @see #setPagerNumber(String)
	 * @generated
	 */
	void unsetPagerNumber();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getPagerNumber <em>Pager Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pager Number</em>' attribute is set.
	 * @see #unsetPagerNumber()
	 * @see #getPagerNumber()
	 * @see #setPagerNumber(String)
	 * @generated
	 */
	boolean isSetPagerNumber();

	/**
	 * Returns the value of the '<em><b>Electronic Mail Addresses</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Electronic Mail Addresses</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electronic Mail Addresses</em>' attribute list.
	 * @see #isSetElectronicMailAddresses()
	 * @see #unsetElectronicMailAddresses()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress_ElectronicMailAddresses()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getElectronicMailAddresses();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElectronicMailAddresses()
	 * @see #getElectronicMailAddresses()
	 * @generated
	 */
	void unsetElectronicMailAddresses();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Electronic Mail Addresses</em>' attribute list is set.
	 * @see #unsetElectronicMailAddresses()
	 * @see #getElectronicMailAddresses()
	 * @generated
	 */
	boolean isSetElectronicMailAddresses();

	/**
	 * Returns the value of the '<em><b>WWW Home Page URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WWW Home Page URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #isSetWWWHomePageURL()
	 * @see #unsetWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTelecomAddress_WWWHomePageURL()
	 * @model unsettable="true"
	 * @generated
	 */
	String getWWWHomePageURL();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WWW Home Page URL</em>' attribute.
	 * @see #isSetWWWHomePageURL()
	 * @see #unsetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @generated
	 */
	void setWWWHomePageURL(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @generated
	 */
	void unsetWWWHomePageURL();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcTelecomAddress#getWWWHomePageURL <em>WWW Home Page URL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>WWW Home Page URL</em>' attribute is set.
	 * @see #unsetWWWHomePageURL()
	 * @see #getWWWHomePageURL()
	 * @see #setWWWHomePageURL(String)
	 * @generated
	 */
	boolean isSetWWWHomePageURL();

} // IfcTelecomAddress
