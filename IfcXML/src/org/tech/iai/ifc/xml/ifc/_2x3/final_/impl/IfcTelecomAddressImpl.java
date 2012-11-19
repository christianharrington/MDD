/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ElectronicMailAddressesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FacsimileNumbersType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTelecomAddress;
import org.tech.iai.ifc.xml.ifc._2x3.final_.TelephoneNumbersType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTelecomAddressImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTelecomAddressImpl#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTelecomAddressImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTelecomAddressImpl#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTelecomAddressImpl#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTelecomAddressImpl extends IfcAddressImpl implements IfcTelecomAddress {
	/**
	 * The cached value of the '{@link #getTelephoneNumbers() <em>Telephone Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected TelephoneNumbersType telephoneNumbers;

	/**
	 * The cached value of the '{@link #getFacsimileNumbers() <em>Facsimile Numbers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileNumbers()
	 * @generated
	 * @ordered
	 */
	protected FacsimileNumbersType facsimileNumbers;

	/**
	 * The default value of the '{@link #getPagerNumber() <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagerNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGER_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPagerNumber() <em>Pager Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagerNumber()
	 * @generated
	 * @ordered
	 */
	protected String pagerNumber = PAGER_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectronicMailAddresses() <em>Electronic Mail Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMailAddresses()
	 * @generated
	 * @ordered
	 */
	protected ElectronicMailAddressesType electronicMailAddresses;

	/**
	 * The default value of the '{@link #getWWWHomePageURL() <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWWHomePageURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WWW_HOME_PAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWWWHomePageURL() <em>WWW Home Page URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWWWHomePageURL()
	 * @generated
	 * @ordered
	 */
	protected String wWWHomePageURL = WWW_HOME_PAGE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTelecomAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTelecomAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumbersType getTelephoneNumbers() {
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelephoneNumbers(TelephoneNumbersType newTelephoneNumbers, NotificationChain msgs) {
		TelephoneNumbersType oldTelephoneNumbers = telephoneNumbers;
		telephoneNumbers = newTelephoneNumbers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS, oldTelephoneNumbers, newTelephoneNumbers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTelephoneNumbers(TelephoneNumbersType newTelephoneNumbers) {
		if (newTelephoneNumbers != telephoneNumbers) {
			NotificationChain msgs = null;
			if (telephoneNumbers != null)
				msgs = ((InternalEObject)telephoneNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS, null, msgs);
			if (newTelephoneNumbers != null)
				msgs = ((InternalEObject)newTelephoneNumbers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS, null, msgs);
			msgs = basicSetTelephoneNumbers(newTelephoneNumbers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS, newTelephoneNumbers, newTelephoneNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacsimileNumbersType getFacsimileNumbers() {
		return facsimileNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacsimileNumbers(FacsimileNumbersType newFacsimileNumbers, NotificationChain msgs) {
		FacsimileNumbersType oldFacsimileNumbers = facsimileNumbers;
		facsimileNumbers = newFacsimileNumbers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS, oldFacsimileNumbers, newFacsimileNumbers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacsimileNumbers(FacsimileNumbersType newFacsimileNumbers) {
		if (newFacsimileNumbers != facsimileNumbers) {
			NotificationChain msgs = null;
			if (facsimileNumbers != null)
				msgs = ((InternalEObject)facsimileNumbers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS, null, msgs);
			if (newFacsimileNumbers != null)
				msgs = ((InternalEObject)newFacsimileNumbers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS, null, msgs);
			msgs = basicSetFacsimileNumbers(newFacsimileNumbers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS, newFacsimileNumbers, newFacsimileNumbers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPagerNumber() {
		return pagerNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagerNumber(String newPagerNumber) {
		String oldPagerNumber = pagerNumber;
		pagerNumber = newPagerNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__PAGER_NUMBER, oldPagerNumber, pagerNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectronicMailAddressesType getElectronicMailAddresses() {
		return electronicMailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElectronicMailAddresses(ElectronicMailAddressesType newElectronicMailAddresses, NotificationChain msgs) {
		ElectronicMailAddressesType oldElectronicMailAddresses = electronicMailAddresses;
		electronicMailAddresses = newElectronicMailAddresses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES, oldElectronicMailAddresses, newElectronicMailAddresses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElectronicMailAddresses(ElectronicMailAddressesType newElectronicMailAddresses) {
		if (newElectronicMailAddresses != electronicMailAddresses) {
			NotificationChain msgs = null;
			if (electronicMailAddresses != null)
				msgs = ((InternalEObject)electronicMailAddresses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES, null, msgs);
			if (newElectronicMailAddresses != null)
				msgs = ((InternalEObject)newElectronicMailAddresses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES, null, msgs);
			msgs = basicSetElectronicMailAddresses(newElectronicMailAddresses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES, newElectronicMailAddresses, newElectronicMailAddresses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWWWHomePageURL() {
		return wWWHomePageURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWWWHomePageURL(String newWWWHomePageURL) {
		String oldWWWHomePageURL = wWWHomePageURL;
		wWWHomePageURL = newWWWHomePageURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL, oldWWWHomePageURL, wWWHomePageURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				return basicSetTelephoneNumbers(null, msgs);
			case FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				return basicSetFacsimileNumbers(null, msgs);
			case FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				return basicSetElectronicMailAddresses(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				return getTelephoneNumbers();
			case FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				return getFacsimileNumbers();
			case FinalPackage.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				return getPagerNumber();
			case FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				return getElectronicMailAddresses();
			case FinalPackage.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				return getWWWHomePageURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				setTelephoneNumbers((TelephoneNumbersType)newValue);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				setFacsimileNumbers((FacsimileNumbersType)newValue);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				setPagerNumber((String)newValue);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				setElectronicMailAddresses((ElectronicMailAddressesType)newValue);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				setWWWHomePageURL((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				setTelephoneNumbers((TelephoneNumbersType)null);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				setFacsimileNumbers((FacsimileNumbersType)null);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				setPagerNumber(PAGER_NUMBER_EDEFAULT);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				setElectronicMailAddresses((ElectronicMailAddressesType)null);
				return;
			case FinalPackage.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				setWWWHomePageURL(WWW_HOME_PAGE_URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FinalPackage.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				return telephoneNumbers != null;
			case FinalPackage.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				return facsimileNumbers != null;
			case FinalPackage.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				return PAGER_NUMBER_EDEFAULT == null ? pagerNumber != null : !PAGER_NUMBER_EDEFAULT.equals(pagerNumber);
			case FinalPackage.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				return electronicMailAddresses != null;
			case FinalPackage.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				return WWW_HOME_PAGE_URL_EDEFAULT == null ? wWWHomePageURL != null : !WWW_HOME_PAGE_URL_EDEFAULT.equals(wWWHomePageURL);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pagerNumber: ");
		result.append(pagerNumber);
		result.append(", wWWHomePageURL: ");
		result.append(wWWHomePageURL);
		result.append(')');
		return result.toString();
	}

} //IfcTelecomAddressImpl
