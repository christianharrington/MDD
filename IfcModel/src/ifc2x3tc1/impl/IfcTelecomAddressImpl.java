/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTelecomAddress;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Telecom Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTelecomAddressImpl#getTelephoneNumbers <em>Telephone Numbers</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTelecomAddressImpl#getFacsimileNumbers <em>Facsimile Numbers</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTelecomAddressImpl#getPagerNumber <em>Pager Number</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTelecomAddressImpl#getElectronicMailAddresses <em>Electronic Mail Addresses</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTelecomAddressImpl#getWWWHomePageURL <em>WWW Home Page URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTelecomAddressImpl extends IfcAddressImpl implements IfcTelecomAddress {
	/**
	 * The cached value of the '{@link #getTelephoneNumbers() <em>Telephone Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelephoneNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> telephoneNumbers;

	/**
	 * The cached value of the '{@link #getFacsimileNumbers() <em>Facsimile Numbers</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacsimileNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<String> facsimileNumbers;

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
	 * This is true if the Pager Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pagerNumberESet;

	/**
	 * The cached value of the '{@link #getElectronicMailAddresses() <em>Electronic Mail Addresses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectronicMailAddresses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> electronicMailAddresses;

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
	protected String wwwHomePageURL = WWW_HOME_PAGE_URL_EDEFAULT;

	/**
	 * This is true if the WWW Home Page URL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wwwHomePageURLESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcTelecomAddress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTelephoneNumbers() {
		if (telephoneNumbers == null) {
			telephoneNumbers = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS);
		}
		return telephoneNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTelephoneNumbers() {
		if (telephoneNumbers != null) ((InternalEList.Unsettable<?>)telephoneNumbers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTelephoneNumbers() {
		return telephoneNumbers != null && ((InternalEList.Unsettable<?>)telephoneNumbers).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFacsimileNumbers() {
		if (facsimileNumbers == null) {
			facsimileNumbers = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS);
		}
		return facsimileNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFacsimileNumbers() {
		if (facsimileNumbers != null) ((InternalEList.Unsettable<?>)facsimileNumbers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacsimileNumbers() {
		return facsimileNumbers != null && ((InternalEList.Unsettable<?>)facsimileNumbers).isSet();
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
		boolean oldPagerNumberESet = pagerNumberESet;
		pagerNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER, oldPagerNumber, pagerNumber, !oldPagerNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPagerNumber() {
		String oldPagerNumber = pagerNumber;
		boolean oldPagerNumberESet = pagerNumberESet;
		pagerNumber = PAGER_NUMBER_EDEFAULT;
		pagerNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER, oldPagerNumber, PAGER_NUMBER_EDEFAULT, oldPagerNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPagerNumber() {
		return pagerNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getElectronicMailAddresses() {
		if (electronicMailAddresses == null) {
			electronicMailAddresses = new EDataTypeEList.Unsettable<String>(String.class, this, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES);
		}
		return electronicMailAddresses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElectronicMailAddresses() {
		if (electronicMailAddresses != null) ((InternalEList.Unsettable<?>)electronicMailAddresses).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElectronicMailAddresses() {
		return electronicMailAddresses != null && ((InternalEList.Unsettable<?>)electronicMailAddresses).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWWWHomePageURL() {
		return wwwHomePageURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWWWHomePageURL(String newWWWHomePageURL) {
		String oldWWWHomePageURL = wwwHomePageURL;
		wwwHomePageURL = newWWWHomePageURL;
		boolean oldWWWHomePageURLESet = wwwHomePageURLESet;
		wwwHomePageURLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL, oldWWWHomePageURL, wwwHomePageURL, !oldWWWHomePageURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWWWHomePageURL() {
		String oldWWWHomePageURL = wwwHomePageURL;
		boolean oldWWWHomePageURLESet = wwwHomePageURLESet;
		wwwHomePageURL = WWW_HOME_PAGE_URL_EDEFAULT;
		wwwHomePageURLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL, oldWWWHomePageURL, WWW_HOME_PAGE_URL_EDEFAULT, oldWWWHomePageURLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWWWHomePageURL() {
		return wwwHomePageURLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				return getTelephoneNumbers();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				return getFacsimileNumbers();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				return getPagerNumber();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				return getElectronicMailAddresses();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				return getWWWHomePageURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				getTelephoneNumbers().clear();
				getTelephoneNumbers().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				getFacsimileNumbers().clear();
				getFacsimileNumbers().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				setPagerNumber((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				getElectronicMailAddresses().clear();
				getElectronicMailAddresses().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
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
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				unsetTelephoneNumbers();
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				unsetFacsimileNumbers();
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				unsetPagerNumber();
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				unsetElectronicMailAddresses();
				return;
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				unsetWWWHomePageURL();
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
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__TELEPHONE_NUMBERS:
				return isSetTelephoneNumbers();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__FACSIMILE_NUMBERS:
				return isSetFacsimileNumbers();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__PAGER_NUMBER:
				return isSetPagerNumber();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__ELECTRONIC_MAIL_ADDRESSES:
				return isSetElectronicMailAddresses();
			case Ifc2x3tc1Package.IFC_TELECOM_ADDRESS__WWW_HOME_PAGE_URL:
				return isSetWWWHomePageURL();
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
		result.append(" (TelephoneNumbers: ");
		result.append(telephoneNumbers);
		result.append(", FacsimileNumbers: ");
		result.append(facsimileNumbers);
		result.append(", PagerNumber: ");
		if (pagerNumberESet) result.append(pagerNumber); else result.append("<unset>");
		result.append(", ElectronicMailAddresses: ");
		result.append(electronicMailAddresses);
		result.append(", WWWHomePageURL: ");
		if (wwwHomePageURLESet) result.append(wwwHomePageURL); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTelecomAddressImpl
