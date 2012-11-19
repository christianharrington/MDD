/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RateDateTimeType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RateSourceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedMonetaryUnitType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingMonetaryUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurrencyRelationshipImpl#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurrencyRelationshipImpl#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurrencyRelationshipImpl#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurrencyRelationshipImpl#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurrencyRelationshipImpl#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurrencyRelationshipImpl extends EntityImpl implements IfcCurrencyRelationship {
	/**
	 * The cached value of the '{@link #getRelatingMonetaryUnit() <em>Relating Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected RelatingMonetaryUnitType relatingMonetaryUnit;

	/**
	 * The cached value of the '{@link #getRelatedMonetaryUnit() <em>Related Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedMonetaryUnit()
	 * @generated
	 * @ordered
	 */
	protected RelatedMonetaryUnitType relatedMonetaryUnit;

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
	 * The cached value of the '{@link #getRateDateTime() <em>Rate Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateDateTime()
	 * @generated
	 * @ordered
	 */
	protected RateDateTimeType rateDateTime;

	/**
	 * The cached value of the '{@link #getRateSource() <em>Rate Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateSource()
	 * @generated
	 * @ordered
	 */
	protected RateSourceType rateSource;

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
		return FinalPackage.eINSTANCE.getIfcCurrencyRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingMonetaryUnitType getRelatingMonetaryUnit() {
		return relatingMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingMonetaryUnit(RelatingMonetaryUnitType newRelatingMonetaryUnit, NotificationChain msgs) {
		RelatingMonetaryUnitType oldRelatingMonetaryUnit = relatingMonetaryUnit;
		relatingMonetaryUnit = newRelatingMonetaryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, oldRelatingMonetaryUnit, newRelatingMonetaryUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingMonetaryUnit(RelatingMonetaryUnitType newRelatingMonetaryUnit) {
		if (newRelatingMonetaryUnit != relatingMonetaryUnit) {
			NotificationChain msgs = null;
			if (relatingMonetaryUnit != null)
				msgs = ((InternalEObject)relatingMonetaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, null, msgs);
			if (newRelatingMonetaryUnit != null)
				msgs = ((InternalEObject)newRelatingMonetaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, null, msgs);
			msgs = basicSetRelatingMonetaryUnit(newRelatingMonetaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT, newRelatingMonetaryUnit, newRelatingMonetaryUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedMonetaryUnitType getRelatedMonetaryUnit() {
		return relatedMonetaryUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedMonetaryUnit(RelatedMonetaryUnitType newRelatedMonetaryUnit, NotificationChain msgs) {
		RelatedMonetaryUnitType oldRelatedMonetaryUnit = relatedMonetaryUnit;
		relatedMonetaryUnit = newRelatedMonetaryUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, oldRelatedMonetaryUnit, newRelatedMonetaryUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedMonetaryUnit(RelatedMonetaryUnitType newRelatedMonetaryUnit) {
		if (newRelatedMonetaryUnit != relatedMonetaryUnit) {
			NotificationChain msgs = null;
			if (relatedMonetaryUnit != null)
				msgs = ((InternalEObject)relatedMonetaryUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, null, msgs);
			if (newRelatedMonetaryUnit != null)
				msgs = ((InternalEObject)newRelatedMonetaryUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, null, msgs);
			msgs = basicSetRelatedMonetaryUnit(newRelatedMonetaryUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT, newRelatedMonetaryUnit, newRelatedMonetaryUnit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE, oldExchangeRate, exchangeRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateDateTimeType getRateDateTime() {
		return rateDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateDateTime(RateDateTimeType newRateDateTime, NotificationChain msgs) {
		RateDateTimeType oldRateDateTime = rateDateTime;
		rateDateTime = newRateDateTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, oldRateDateTime, newRateDateTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateDateTime(RateDateTimeType newRateDateTime) {
		if (newRateDateTime != rateDateTime) {
			NotificationChain msgs = null;
			if (rateDateTime != null)
				msgs = ((InternalEObject)rateDateTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, null, msgs);
			if (newRateDateTime != null)
				msgs = ((InternalEObject)newRateDateTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, null, msgs);
			msgs = basicSetRateDateTime(newRateDateTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME, newRateDateTime, newRateDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateSourceType getRateSource() {
		return rateSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRateSource(RateSourceType newRateSource, NotificationChain msgs) {
		RateSourceType oldRateSource = rateSource;
		rateSource = newRateSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, oldRateSource, newRateSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRateSource(RateSourceType newRateSource) {
		if (newRateSource != rateSource) {
			NotificationChain msgs = null;
			if (rateSource != null)
				msgs = ((InternalEObject)rateSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, null, msgs);
			if (newRateSource != null)
				msgs = ((InternalEObject)newRateSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, null, msgs);
			msgs = basicSetRateSource(newRateSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE, newRateSource, newRateSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				return basicSetRelatingMonetaryUnit(null, msgs);
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				return basicSetRelatedMonetaryUnit(null, msgs);
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				return basicSetRateDateTime(null, msgs);
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				return basicSetRateSource(null, msgs);
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
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				return getRelatingMonetaryUnit();
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				return getRelatedMonetaryUnit();
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				return getExchangeRate();
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				return getRateDateTime();
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				return getRateSource();
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
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				setRelatingMonetaryUnit((RelatingMonetaryUnitType)newValue);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				setRelatedMonetaryUnit((RelatedMonetaryUnitType)newValue);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				setExchangeRate((Double)newValue);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				setRateDateTime((RateDateTimeType)newValue);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				setRateSource((RateSourceType)newValue);
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
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				setRelatingMonetaryUnit((RelatingMonetaryUnitType)null);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				setRelatedMonetaryUnit((RelatedMonetaryUnitType)null);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				setExchangeRate(EXCHANGE_RATE_EDEFAULT);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				setRateDateTime((RateDateTimeType)null);
				return;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				setRateSource((RateSourceType)null);
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
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATING_MONETARY_UNIT:
				return relatingMonetaryUnit != null;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RELATED_MONETARY_UNIT:
				return relatedMonetaryUnit != null;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__EXCHANGE_RATE:
				return exchangeRate != EXCHANGE_RATE_EDEFAULT;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_DATE_TIME:
				return rateDateTime != null;
			case FinalPackage.IFC_CURRENCY_RELATIONSHIP__RATE_SOURCE:
				return rateSource != null;
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
		result.append(" (exchangeRate: ");
		result.append(exchangeRate);
		result.append(')');
		return result.toString();
	}

} //IfcCurrencyRelationshipImpl
