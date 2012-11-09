/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcQuantityVolume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Quantity Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityVolumeImpl#getVolumeValue <em>Volume Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcQuantityVolumeImpl#getVolumeValueAsString <em>Volume Value As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcQuantityVolumeImpl extends IfcPhysicalSimpleQuantityImpl implements IfcQuantityVolume {
	/**
	 * The default value of the '{@link #getVolumeValue() <em>Volume Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolumeValue() <em>Volume Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeValue()
	 * @generated
	 * @ordered
	 */
	protected double volumeValue = VOLUME_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolumeValueAsString() <em>Volume Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeValueAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_VALUE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolumeValueAsString() <em>Volume Value As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumeValueAsString()
	 * @generated
	 * @ordered
	 */
	protected String volumeValueAsString = VOLUME_VALUE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcQuantityVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcQuantityVolume();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolumeValue() {
		return volumeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeValue(double newVolumeValue) {
		double oldVolumeValue = volumeValue;
		volumeValue = newVolumeValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE, oldVolumeValue, volumeValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolumeValueAsString() {
		return volumeValueAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolumeValueAsString(String newVolumeValueAsString) {
		String oldVolumeValueAsString = volumeValueAsString;
		volumeValueAsString = newVolumeValueAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING, oldVolumeValueAsString, volumeValueAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE:
				return getVolumeValue();
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING:
				return getVolumeValueAsString();
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
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE:
				setVolumeValue((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING:
				setVolumeValueAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE:
				setVolumeValue(VOLUME_VALUE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING:
				setVolumeValueAsString(VOLUME_VALUE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE:
				return volumeValue != VOLUME_VALUE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_QUANTITY_VOLUME__VOLUME_VALUE_AS_STRING:
				return VOLUME_VALUE_AS_STRING_EDEFAULT == null ? volumeValueAsString != null : !VOLUME_VALUE_AS_STRING_EDEFAULT.equals(volumeValueAsString);
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
		result.append(" (VolumeValue: ");
		result.append(volumeValue);
		result.append(", VolumeValueAsString: ");
		result.append(volumeValueAsString);
		result.append(')');
		return result.toString();
	}

} //IfcQuantityVolumeImpl
