/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurrencyRelationship;
import ifc2x3tc1.IfcDateAndTime;
import ifc2x3tc1.IfcLibraryInformation;
import ifc2x3tc1.IfcMonetaryUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getExchangeRateAsString <em>Exchange Rate As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurrencyRelationshipImpl#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurrencyRelationshipImpl extends EObjectImpl implements IfcCurrencyRelationship {
	/**
	 * The cached value of the '{@link #getRelatingMonetaryUnit() <em>Relating Monetary Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMonetaryUnit relatingMonetaryUnit;

	/**
	 * The cached value of the '{@link #getRelatedMonetaryUnit() <em>Related Monetary Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected IfcMonetaryUnit relatedMonetaryUnit;

	/**
	 * The default value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected static final double EXCHANGE_RATE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getExchangeRate() <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRate()
	 * @generated
	 * @ordered
	 */
	protected double exchangeRate = EXCHANGE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExchangeRateAsString() <em>Exchange Rate As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRateAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_RATE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExchangeRateAsString() <em>Exchange Rate As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchangeRateAsString()
	 * @generated
	 * @ordered
	 */
	protected String exchangeRateAsString = EXCHANGE_RATE_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRateDateTime() <em>Rate Date Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDateTime()
	 * @generated
	 * @ordered
	 */
	protected IfcDateAndTime rateDateTime;

	/**
	 * The cached value of the '{@link #getRateSource() <em>Rate Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateSource()
	 * @generated
	 * @ordered
	 */
	protected IfcLibraryInformation rateSource;

	/**
	 * This is true if the Rate Source reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rateSourceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurrencyRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCurrencyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatingMonetaryUnit() {
		if (relatingMonetaryUnit != null && relatingMonetaryUnit.eIsProxy()) {
			InternalEObject oldRelatingMonetaryUnit = (InternalEObject)relatingMonetaryUnit;
			relatingMonetaryUnit = (IfcMonetaryUnit)eResolveProxy(oldRelatingMonetaryUnit);
			if (relatingMonetaryUnit != oldRelatingMonetaryUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, oldRelatingMonetaryUnit, relatingMonetaryUnit));
			}
		}
		return relatingMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit basicGetRelatingMonetaryUnit() {
		return relatingMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMonetaryUnit(IfcMonetaryUnit newRelatingMonetaryUnit) {
		IfcMonetaryUnit oldRelatingMonetaryUnit = relatingMonetaryUnit;
		relatingMonetaryUnit = newRelatingMonetaryUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, oldRelatingMonetaryUnit, relatingMonetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit getRelatedMonetaryUnit() {
		if (relatedMonetaryUnit != null && relatedMonetaryUnit.eIsProxy()) {
			InternalEObject oldRelatedMonetaryUnit = (InternalEObject)relatedMonetaryUnit;
			relatedMonetaryUnit = (IfcMonetaryUnit)eResolveProxy(oldRelatedMonetaryUnit);
			if (relatedMonetaryUnit != oldRelatedMonetaryUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, oldRelatedMonetaryUnit, relatedMonetaryUnit));
			}
		}
		return relatedMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMonetaryUnit basicGetRelatedMonetaryUnit() {
		return relatedMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedMonetaryUnit(IfcMonetaryUnit newRelatedMonetaryUnit) {
		IfcMonetaryUnit oldRelatedMonetaryUnit = relatedMonetaryUnit;
		relatedMonetaryUnit = newRelatedMonetaryUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, oldRelatedMonetaryUnit, relatedMonetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRate(double newExchangeRate) {
		double oldExchangeRate = exchangeRate;
		exchangeRate = newExchangeRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE, oldExchangeRate, exchangeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExchangeRateAsString() {
		return exchangeRateAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExchangeRateAsString(String newExchangeRateAsString) {
		String oldExchangeRateAsString = exchangeRateAsString;
		exchangeRateAsString = newExchangeRateAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE_AS_STRING, oldExchangeRateAsString, exchangeRateAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime getRateDateTime() {
		if (rateDateTime != null && rateDateTime.eIsProxy()) {
			InternalEObject oldRateDateTime = (InternalEObject)rateDateTime;
			rateDateTime = (IfcDateAndTime)eResolveProxy(oldRateDateTime);
			if (rateDateTime != oldRateDateTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, oldRateDateTime, rateDateTime));
			}
		}
		return rateDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateAndTime basicGetRateDateTime() {
		return rateDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDateTime(IfcDateAndTime newRateDateTime) {
		IfcDateAndTime oldRateDateTime = rateDateTime;
		rateDateTime = newRateDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, oldRateDateTime, rateDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryInformation getRateSource() {
		if (rateSource != null && rateSource.eIsProxy()) {
			InternalEObject oldRateSource = (InternalEObject)rateSource;
			rateSource = (IfcLibraryInformation)eResolveProxy(oldRateSource);
			if (rateSource != oldRateSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, oldRateSource, rateSource));
			}
		}
		return rateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLibraryInformation basicGetRateSource() {
		return rateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateSource(IfcLibraryInformation newRateSource) {
		IfcLibraryInformation oldRateSource = rateSource;
		rateSource = newRateSource;
		boolean oldRateSourceESet = rateSourceESet;
		rateSourceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, oldRateSource, rateSource, !oldRateSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRateSource() {
		IfcLibraryInformation oldRateSource = rateSource;
		boolean oldRateSourceESet = rateSourceESet;
		rateSource = null;
		rateSourceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, oldRateSource, null, oldRateSourceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRateSource() {
		return rateSourceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				if (resolve) return getRelatingMonetaryUnit();
				return basicGetRelatingMonetaryUnit();
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				if (resolve) return getRelatedMonetaryUnit();
				return basicGetRelatedMonetaryUnit();
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				return getExchangeRate();
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE_AS_STRING:
				return getExchangeRateAsString();
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				if (resolve) return getRateDateTime();
				return basicGetRateDateTime();
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				if (resolve) return getRateSource();
				return basicGetRateSource();
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
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				setRelatingMonetaryUnit((IfcMonetaryUnit)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				setRelatedMonetaryUnit((IfcMonetaryUnit)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				setExchangeRate((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE_AS_STRING:
				setExchangeRateAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				setRateDateTime((IfcDateAndTime)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				setRateSource((IfcLibraryInformation)newValue);
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
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				setRelatingMonetaryUnit((IfcMonetaryUnit)null);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				setRelatedMonetaryUnit((IfcMonetaryUnit)null);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				setExchangeRate(EXCHANGE_RATE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE_AS_STRING:
				setExchangeRateAsString(EXCHANGE_RATE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				setRateDateTime((IfcDateAndTime)null);
				return;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				unsetRateSource();
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
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				return relatingMonetaryUnit != null;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				return relatedMonetaryUnit != null;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				return exchangeRate != EXCHANGE_RATE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE_AS_STRING:
				return EXCHANGE_RATE_AS_STRING_EDEFAULT == null ? exchangeRateAsString != null : !EXCHANGE_RATE_AS_STRING_EDEFAULT.equals(exchangeRateAsString);
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				return rateDateTime != null;
			case Ifc2x3tc1Package.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				return isSetRateSource();
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
		result.append(" (ExchangeRate: ");
		result.append(exchangeRate);
		result.append(", ExchangeRateAsString: ");
		result.append(exchangeRateAsString);
		result.append(')');
		return result.toString();
	}

} //IfcCurrencyRelationshipImpl
