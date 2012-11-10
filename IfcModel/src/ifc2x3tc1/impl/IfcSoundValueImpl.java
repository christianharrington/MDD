/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDerivedMeasureValue;
import ifc2x3tc1.IfcSoundValue;
import ifc2x3tc1.IfcTimeSeries;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundValueImpl#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundValueImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundValueImpl#getFrequencyAsString <em>Frequency As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundValueImpl#getSoundLevelSingleValue <em>Sound Level Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSoundValueImpl extends IfcPropertySetDefinitionImpl implements IfcSoundValue {
	/**
	 * The cached value of the '{@link #getSoundLevelTimeSeries() <em>Sound Level Time Series</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundLevelTimeSeries()
	 * @generated
	 * @ordered
	 */
	protected IfcTimeSeries soundLevelTimeSeries;

	/**
	 * This is true if the Sound Level Time Series reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soundLevelTimeSeriesESet;

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
	 * The default value of the '{@link #getFrequencyAsString() <em>Frequency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FREQUENCY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequencyAsString() <em>Frequency As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyAsString()
	 * @generated
	 * @ordered
	 */
	protected String frequencyAsString = FREQUENCY_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoundLevelSingleValue() <em>Sound Level Single Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundLevelSingleValue()
	 * @generated
	 * @ordered
	 */
	protected IfcDerivedMeasureValue soundLevelSingleValue;

	/**
	 * This is true if the Sound Level Single Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soundLevelSingleValueESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSoundValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getSoundLevelTimeSeries() {
		if (soundLevelTimeSeries != null && soundLevelTimeSeries.eIsProxy()) {
			InternalEObject oldSoundLevelTimeSeries = (InternalEObject)soundLevelTimeSeries;
			soundLevelTimeSeries = (IfcTimeSeries)eResolveProxy(oldSoundLevelTimeSeries);
			if (soundLevelTimeSeries != oldSoundLevelTimeSeries) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, oldSoundLevelTimeSeries, soundLevelTimeSeries));
			}
		}
		return soundLevelTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries basicGetSoundLevelTimeSeries() {
		return soundLevelTimeSeries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelTimeSeries(IfcTimeSeries newSoundLevelTimeSeries) {
		IfcTimeSeries oldSoundLevelTimeSeries = soundLevelTimeSeries;
		soundLevelTimeSeries = newSoundLevelTimeSeries;
		boolean oldSoundLevelTimeSeriesESet = soundLevelTimeSeriesESet;
		soundLevelTimeSeriesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, oldSoundLevelTimeSeries, soundLevelTimeSeries, !oldSoundLevelTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundLevelTimeSeries() {
		IfcTimeSeries oldSoundLevelTimeSeries = soundLevelTimeSeries;
		boolean oldSoundLevelTimeSeriesESet = soundLevelTimeSeriesESet;
		soundLevelTimeSeries = null;
		soundLevelTimeSeriesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES, oldSoundLevelTimeSeries, null, oldSoundLevelTimeSeriesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundLevelTimeSeries() {
		return soundLevelTimeSeriesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequencyAsString() {
		return frequencyAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyAsString(String newFrequencyAsString) {
		String oldFrequencyAsString = frequencyAsString;
		frequencyAsString = newFrequencyAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY_AS_STRING, oldFrequencyAsString, frequencyAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getSoundLevelSingleValue() {
		if (soundLevelSingleValue != null && soundLevelSingleValue.eIsProxy()) {
			InternalEObject oldSoundLevelSingleValue = (InternalEObject)soundLevelSingleValue;
			soundLevelSingleValue = (IfcDerivedMeasureValue)eResolveProxy(oldSoundLevelSingleValue);
			if (soundLevelSingleValue != oldSoundLevelSingleValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, oldSoundLevelSingleValue, soundLevelSingleValue));
			}
		}
		return soundLevelSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue basicGetSoundLevelSingleValue() {
		return soundLevelSingleValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelSingleValue(IfcDerivedMeasureValue newSoundLevelSingleValue) {
		IfcDerivedMeasureValue oldSoundLevelSingleValue = soundLevelSingleValue;
		soundLevelSingleValue = newSoundLevelSingleValue;
		boolean oldSoundLevelSingleValueESet = soundLevelSingleValueESet;
		soundLevelSingleValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, oldSoundLevelSingleValue, soundLevelSingleValue, !oldSoundLevelSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundLevelSingleValue() {
		IfcDerivedMeasureValue oldSoundLevelSingleValue = soundLevelSingleValue;
		boolean oldSoundLevelSingleValueESet = soundLevelSingleValueESet;
		soundLevelSingleValue = null;
		soundLevelSingleValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE, oldSoundLevelSingleValue, null, oldSoundLevelSingleValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundLevelSingleValue() {
		return soundLevelSingleValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				if (resolve) return getSoundLevelTimeSeries();
				return basicGetSoundLevelTimeSeries();
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY:
				return getFrequency();
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY_AS_STRING:
				return getFrequencyAsString();
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				if (resolve) return getSoundLevelSingleValue();
				return basicGetSoundLevelSingleValue();
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
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				setSoundLevelTimeSeries((IfcTimeSeries)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY:
				setFrequency((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY_AS_STRING:
				setFrequencyAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				setSoundLevelSingleValue((IfcDerivedMeasureValue)newValue);
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
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				unsetSoundLevelTimeSeries();
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY_AS_STRING:
				setFrequencyAsString(FREQUENCY_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				unsetSoundLevelSingleValue();
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
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_TIME_SERIES:
				return isSetSoundLevelTimeSeries();
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__FREQUENCY_AS_STRING:
				return FREQUENCY_AS_STRING_EDEFAULT == null ? frequencyAsString != null : !FREQUENCY_AS_STRING_EDEFAULT.equals(frequencyAsString);
			case Ifc2x3tc1Package.IFC_SOUND_VALUE__SOUND_LEVEL_SINGLE_VALUE:
				return isSetSoundLevelSingleValue();
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
		result.append(" (Frequency: ");
		result.append(frequency);
		result.append(", FrequencyAsString: ");
		result.append(frequencyAsString);
		result.append(')');
		return result.toString();
	}

} //IfcSoundValueImpl
