/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SoundLevelSingleValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SoundLevelTimeSeriesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundValueImpl#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundValueImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundValueImpl#getSoundLevelSingleValue <em>Sound Level Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSoundValueImpl extends IfcPropertySetDefinitionImpl implements IfcSoundValue {
	/**
	 * The cached value of the '{@link #getSoundLevelTimeSeries() <em>Sound Level Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundLevelTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected SoundLevelTimeSeriesType soundLevelTimeSeries;

	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected double frequency = FREQUENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoundLevelSingleValue() <em>Sound Level Single Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundLevelSingleValue()
	 * @generated
	 * @ordered
	 */
	protected SoundLevelSingleValueType soundLevelSingleValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSoundValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSoundValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundLevelTimeSeriesType getSoundLevelTimeSeries() {
		return soundLevelTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoundLevelTimeSeries(SoundLevelTimeSeriesType newSoundLevelTimeSeries, NotificationChain msgs) {
		SoundLevelTimeSeriesType oldSoundLevelTimeSeries = soundLevelTimeSeries;
		soundLevelTimeSeries = newSoundLevelTimeSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, oldSoundLevelTimeSeries, newSoundLevelTimeSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelTimeSeries(SoundLevelTimeSeriesType newSoundLevelTimeSeries) {
		if (newSoundLevelTimeSeries != soundLevelTimeSeries) {
			NotificationChain msgs = null;
			if (soundLevelTimeSeries != null)
				msgs = ((InternalEObject)soundLevelTimeSeries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, null, msgs);
			if (newSoundLevelTimeSeries != null)
				msgs = ((InternalEObject)newSoundLevelTimeSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, null, msgs);
			msgs = basicSetSoundLevelTimeSeries(newSoundLevelTimeSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, newSoundLevelTimeSeries, newSoundLevelTimeSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(double newFrequency) {
		double oldFrequency = frequency;
		frequency = newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_VALUE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundLevelSingleValueType getSoundLevelSingleValue() {
		return soundLevelSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoundLevelSingleValue(SoundLevelSingleValueType newSoundLevelSingleValue, NotificationChain msgs) {
		SoundLevelSingleValueType oldSoundLevelSingleValue = soundLevelSingleValue;
		soundLevelSingleValue = newSoundLevelSingleValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, oldSoundLevelSingleValue, newSoundLevelSingleValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelSingleValue(SoundLevelSingleValueType newSoundLevelSingleValue) {
		if (newSoundLevelSingleValue != soundLevelSingleValue) {
			NotificationChain msgs = null;
			if (soundLevelSingleValue != null)
				msgs = ((InternalEObject)soundLevelSingleValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, null, msgs);
			if (newSoundLevelSingleValue != null)
				msgs = ((InternalEObject)newSoundLevelSingleValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, null, msgs);
			msgs = basicSetSoundLevelSingleValue(newSoundLevelSingleValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, newSoundLevelSingleValue, newSoundLevelSingleValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				return basicSetSoundLevelTimeSeries(null, msgs);
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				return basicSetSoundLevelSingleValue(null, msgs);
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
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				return getSoundLevelTimeSeries();
			case FinalPackage.IFC_SOUND_VALUE__FREQUENCY:
				return getFrequency();
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				return getSoundLevelSingleValue();
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
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				setSoundLevelTimeSeries((SoundLevelTimeSeriesType)newValue);
				return;
			case FinalPackage.IFC_SOUND_VALUE__FREQUENCY:
				setFrequency((Double)newValue);
				return;
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				setSoundLevelSingleValue((SoundLevelSingleValueType)newValue);
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
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				setSoundLevelTimeSeries((SoundLevelTimeSeriesType)null);
				return;
			case FinalPackage.IFC_SOUND_VALUE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				setSoundLevelSingleValue((SoundLevelSingleValueType)null);
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
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				return soundLevelTimeSeries != null;
			case FinalPackage.IFC_SOUND_VALUE__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case FinalPackage.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				return soundLevelSingleValue != null;
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
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(')');
		return result.toString();
	}

} //IfcSoundValueImpl
