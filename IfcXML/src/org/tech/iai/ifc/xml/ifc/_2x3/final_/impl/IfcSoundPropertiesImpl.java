/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSoundScaleEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SoundValuesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundPropertiesImpl#isIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundPropertiesImpl#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSoundPropertiesImpl#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSoundPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSoundProperties {
	/**
	 * The default value of the '{@link #isIsAttenuating() <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttenuating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ATTENUATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAttenuating() <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAttenuating()
	 * @generated
	 * @ordered
	 */
	protected boolean isAttenuating = IS_ATTENUATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoundScale() <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSoundScaleEnum SOUND_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoundScale() <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundScale()
	 * @generated
	 * @ordered
	 */
	protected IfcSoundScaleEnum soundScale = SOUND_SCALE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoundValues() <em>Sound Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundValues()
	 * @generated
	 * @ordered
	 */
	protected SoundValuesType soundValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSoundPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSoundProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAttenuating() {
		return isAttenuating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttenuating(boolean newIsAttenuating) {
		boolean oldIsAttenuating = isAttenuating;
		isAttenuating = newIsAttenuating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_PROPERTIES__IS_ATTENUATING, oldIsAttenuating, isAttenuating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSoundScaleEnum getSoundScale() {
		return soundScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundScale(IfcSoundScaleEnum newSoundScale) {
		IfcSoundScaleEnum oldSoundScale = soundScale;
		soundScale = newSoundScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_PROPERTIES__SOUND_SCALE, oldSoundScale, soundScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundValuesType getSoundValues() {
		return soundValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoundValues(SoundValuesType newSoundValues, NotificationChain msgs) {
		SoundValuesType oldSoundValues = soundValues;
		soundValues = newSoundValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES, oldSoundValues, newSoundValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundValues(SoundValuesType newSoundValues) {
		if (newSoundValues != soundValues) {
			NotificationChain msgs = null;
			if (soundValues != null)
				msgs = ((InternalEObject)soundValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES, null, msgs);
			if (newSoundValues != null)
				msgs = ((InternalEObject)newSoundValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES, null, msgs);
			msgs = basicSetSoundValues(newSoundValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES, newSoundValues, newSoundValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				return basicSetSoundValues(null, msgs);
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
			case FinalPackage.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				return isIsAttenuating();
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				return getSoundScale();
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				return getSoundValues();
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
			case FinalPackage.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				setIsAttenuating((Boolean)newValue);
				return;
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				setSoundScale((IfcSoundScaleEnum)newValue);
				return;
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				setSoundValues((SoundValuesType)newValue);
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
			case FinalPackage.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				setIsAttenuating(IS_ATTENUATING_EDEFAULT);
				return;
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				setSoundScale(SOUND_SCALE_EDEFAULT);
				return;
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				setSoundValues((SoundValuesType)null);
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
			case FinalPackage.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				return isAttenuating != IS_ATTENUATING_EDEFAULT;
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				return SOUND_SCALE_EDEFAULT == null ? soundScale != null : !SOUND_SCALE_EDEFAULT.equals(soundScale);
			case FinalPackage.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				return soundValues != null;
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
		result.append(" (isAttenuating: ");
		result.append(isAttenuating);
		result.append(", soundScale: ");
		result.append(soundScale);
		result.append(')');
		return result.toString();
	}

} //IfcSoundPropertiesImpl
