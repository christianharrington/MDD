/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSoundProperties;
import ifc2x3tc1.IfcSoundScaleEnum;
import ifc2x3tc1.IfcSoundValue;
import ifc2x3tc1.Tristate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundPropertiesImpl#getIsAttenuating <em>Is Attenuating</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundPropertiesImpl#getSoundScale <em>Sound Scale</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSoundPropertiesImpl#getSoundValues <em>Sound Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSoundPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcSoundProperties {
	/**
	 * The default value of the '{@link #getIsAttenuating() <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttenuating()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_ATTENUATING_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsAttenuating() <em>Is Attenuating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttenuating()
	 * @generated
	 * @ordered
	 */
	protected Tristate isAttenuating = IS_ATTENUATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoundScale() <em>Sound Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundScale()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSoundScaleEnum SOUND_SCALE_EDEFAULT = IfcSoundScaleEnum.NULL;

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
	 * This is true if the Sound Scale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean soundScaleESet;

	/**
	 * The cached value of the '{@link #getSoundValues() <em>Sound Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoundValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcSoundValue> soundValues;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcSoundProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsAttenuating() {
		return isAttenuating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttenuating(Tristate newIsAttenuating) {
		Tristate oldIsAttenuating = isAttenuating;
		isAttenuating = newIsAttenuating == null ? IS_ATTENUATING_EDEFAULT : newIsAttenuating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__IS_ATTENUATING, oldIsAttenuating, isAttenuating));
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
		soundScale = newSoundScale == null ? SOUND_SCALE_EDEFAULT : newSoundScale;
		boolean oldSoundScaleESet = soundScaleESet;
		soundScaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE, oldSoundScale, soundScale, !oldSoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundScale() {
		IfcSoundScaleEnum oldSoundScale = soundScale;
		boolean oldSoundScaleESet = soundScaleESet;
		soundScale = SOUND_SCALE_EDEFAULT;
		soundScaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE, oldSoundScale, SOUND_SCALE_EDEFAULT, oldSoundScaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundScale() {
		return soundScaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSoundValue> getSoundValues() {
		if (soundValues == null) {
			soundValues = new EObjectResolvingEList<IfcSoundValue>(IfcSoundValue.class, this, Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_VALUES);
		}
		return soundValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				return getIsAttenuating();
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				return getSoundScale();
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				return getSoundValues();
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
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				setIsAttenuating((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				setSoundScale((IfcSoundScaleEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				getSoundValues().clear();
				getSoundValues().addAll((Collection<? extends IfcSoundValue>)newValue);
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
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				setIsAttenuating(IS_ATTENUATING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				unsetSoundScale();
				return;
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				getSoundValues().clear();
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
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__IS_ATTENUATING:
				return isAttenuating != IS_ATTENUATING_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_SCALE:
				return isSetSoundScale();
			case Ifc2x3tc1Package.IFC_SOUND_PROPERTIES__SOUND_VALUES:
				return soundValues != null && !soundValues.isEmpty();
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
		result.append(" (IsAttenuating: ");
		result.append(isAttenuating);
		result.append(", SoundScale: ");
		if (soundScaleESet) result.append(soundScale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSoundPropertiesImpl
