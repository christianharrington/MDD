/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeFactor;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeFactorTypeEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LowerValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MostUsedValueType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UpperValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeFactorImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeFactorImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeFactorImpl#getMostUsedValue <em>Most Used Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeFactorImpl#getLowerValue <em>Lower Value</em>}</li>
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
	protected static final IfcServiceLifeFactorTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcServiceLifeFactorTypeEnum.AQUALITYOFCOMPONENTS;

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
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected UpperValueType upperValue;

	/**
	 * The cached value of the '{@link #getMostUsedValue() <em>Most Used Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMostUsedValue()
	 * @generated
	 * @ordered
	 */
	protected MostUsedValueType mostUsedValue;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected LowerValueType lowerValue;

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
		return FinalPackage.eINSTANCE.getIfcServiceLifeFactor();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperValueType getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(UpperValueType newUpperValue, NotificationChain msgs) {
		UpperValueType oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(UpperValueType newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MostUsedValueType getMostUsedValue() {
		return mostUsedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMostUsedValue(MostUsedValueType newMostUsedValue, NotificationChain msgs) {
		MostUsedValueType oldMostUsedValue = mostUsedValue;
		mostUsedValue = newMostUsedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, oldMostUsedValue, newMostUsedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMostUsedValue(MostUsedValueType newMostUsedValue) {
		if (newMostUsedValue != mostUsedValue) {
			NotificationChain msgs = null;
			if (mostUsedValue != null)
				msgs = ((InternalEObject)mostUsedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, null, msgs);
			if (newMostUsedValue != null)
				msgs = ((InternalEObject)newMostUsedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, null, msgs);
			msgs = basicSetMostUsedValue(newMostUsedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE, newMostUsedValue, newMostUsedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerValueType getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(LowerValueType newLowerValue, NotificationChain msgs) {
		LowerValueType oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(LowerValueType newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				return basicSetMostUsedValue(null, msgs);
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
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
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				return getPredefinedType();
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				return getUpperValue();
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				return getMostUsedValue();
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				return getLowerValue();
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
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				setPredefinedType((IfcServiceLifeFactorTypeEnum)newValue);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				setUpperValue((UpperValueType)newValue);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				setMostUsedValue((MostUsedValueType)newValue);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				setLowerValue((LowerValueType)newValue);
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
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				setUpperValue((UpperValueType)null);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				setMostUsedValue((MostUsedValueType)null);
				return;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				setLowerValue((LowerValueType)null);
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
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__UPPER_VALUE:
				return upperValue != null;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__MOST_USED_VALUE:
				return mostUsedValue != null;
			case FinalPackage.IFC_SERVICE_LIFE_FACTOR__LOWER_VALUE:
				return lowerValue != null;
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
		result.append(" (predefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcServiceLifeFactorImpl
