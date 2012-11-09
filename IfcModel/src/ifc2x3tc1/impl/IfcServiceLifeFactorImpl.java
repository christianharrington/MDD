/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMeasureValue;
import ifc2x3tc1.IfcServiceLifeFactor;
import ifc2x3tc1.IfcServiceLifeFactorTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeFactorImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeFactorImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeFactorImpl#getMostUsedValue <em>Most Used Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeFactorImpl#getLowerValue <em>Lower Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcServiceLifeFactorImpl extends IfcPropertySetDefinitionImpl implements IfcServiceLifeFactor {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcServiceLifeFactorTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcServiceLifeFactorTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcServiceLifeFactorTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureValue upperValue;

	/**
	 * This is true if the Upper Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upperValueESet;

	/**
	 * The cached value of the '{@link #getMostUsedValue() <em>Most Used Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostUsedValue()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureValue mostUsedValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureValue lowerValue;

	/**
	 * This is true if the Lower Value reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lowerValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcServiceLifeFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcServiceLifeFactor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeFactorTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcServiceLifeFactorTypeEnum newPredefinedType) {
		IfcServiceLifeFactorTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getUpperValue() {
		if (upperValue != null && upperValue.eIsProxy()) {
			InternalEObject oldUpperValue = (InternalEObject)upperValue;
			upperValue = (IfcMeasureValue)eResolveProxy(oldUpperValue);
			if (upperValue != oldUpperValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, oldUpperValue, upperValue));
			}
		}
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue basicGetUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(IfcMeasureValue newUpperValue) {
		IfcMeasureValue oldUpperValue = upperValue;
		upperValue = newUpperValue;
		boolean oldUpperValueESet = upperValueESet;
		upperValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, oldUpperValue, upperValue, !oldUpperValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpperValue() {
		IfcMeasureValue oldUpperValue = upperValue;
		boolean oldUpperValueESet = upperValueESet;
		upperValue = null;
		upperValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, oldUpperValue, null, oldUpperValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpperValue() {
		return upperValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getMostUsedValue() {
		if (mostUsedValue != null && mostUsedValue.eIsProxy()) {
			InternalEObject oldMostUsedValue = (InternalEObject)mostUsedValue;
			mostUsedValue = (IfcMeasureValue)eResolveProxy(oldMostUsedValue);
			if (mostUsedValue != oldMostUsedValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, oldMostUsedValue, mostUsedValue));
			}
		}
		return mostUsedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue basicGetMostUsedValue() {
		return mostUsedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMostUsedValue(IfcMeasureValue newMostUsedValue) {
		IfcMeasureValue oldMostUsedValue = mostUsedValue;
		mostUsedValue = newMostUsedValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, oldMostUsedValue, mostUsedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue getLowerValue() {
		if (lowerValue != null && lowerValue.eIsProxy()) {
			InternalEObject oldLowerValue = (InternalEObject)lowerValue;
			lowerValue = (IfcMeasureValue)eResolveProxy(oldLowerValue);
			if (lowerValue != oldLowerValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, oldLowerValue, lowerValue));
			}
		}
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureValue basicGetLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(IfcMeasureValue newLowerValue) {
		IfcMeasureValue oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		boolean oldLowerValueESet = lowerValueESet;
		lowerValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, oldLowerValue, lowerValue, !oldLowerValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLowerValue() {
		IfcMeasureValue oldLowerValue = lowerValue;
		boolean oldLowerValueESet = lowerValueESet;
		lowerValue = null;
		lowerValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, oldLowerValue, null, oldLowerValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLowerValue() {
		return lowerValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				if (resolve) return getUpperValue();
				return basicGetUpperValue();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				if (resolve) return getMostUsedValue();
				return basicGetMostUsedValue();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				if (resolve) return getLowerValue();
				return basicGetLowerValue();
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				setPredefinedType((IfcServiceLifeFactorTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				setUpperValue((IfcMeasureValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				setMostUsedValue((IfcMeasureValue)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				setLowerValue((IfcMeasureValue)newValue);
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				unsetUpperValue();
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				setMostUsedValue((IfcMeasureValue)null);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				unsetLowerValue();
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				return isSetUpperValue();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				return mostUsedValue != null;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				return isSetLowerValue();
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
		result.append(" (PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcServiceLifeFactorImpl
