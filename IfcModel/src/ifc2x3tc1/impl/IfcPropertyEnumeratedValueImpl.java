/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcPropertyEnumeratedValue;
import ifc2x3tc1.IfcPropertyEnumeration;
import ifc2x3tc1.IfcValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyEnumeratedValueImpl#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyEnumeratedValueImpl#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyEnumeratedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyEnumeratedValue {
	/**
	 * The cached value of the '{@link #getEnumerationValues() <em>Enumeration Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcValue> enumerationValues;

	/**
	 * The cached value of the '{@link #getEnumerationReference() <em>Enumeration Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationReference()
	 * @generated
	 * @ordered
	 */
	protected IfcPropertyEnumeration enumerationReference;

	/**
	 * This is true if the Enumeration Reference reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enumerationReferenceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyEnumeratedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyEnumeratedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcValue> getEnumerationValues() {
		if (enumerationValues == null) {
			enumerationValues = new EObjectResolvingEList<IfcValue>(IfcValue.class, this, Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES);
		}
		return enumerationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeration getEnumerationReference() {
		if (enumerationReference != null && enumerationReference.eIsProxy()) {
			InternalEObject oldEnumerationReference = (InternalEObject)enumerationReference;
			enumerationReference = (IfcPropertyEnumeration)eResolveProxy(oldEnumerationReference);
			if (enumerationReference != oldEnumerationReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, oldEnumerationReference, enumerationReference));
			}
		}
		return enumerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPropertyEnumeration basicGetEnumerationReference() {
		return enumerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationReference(IfcPropertyEnumeration newEnumerationReference) {
		IfcPropertyEnumeration oldEnumerationReference = enumerationReference;
		enumerationReference = newEnumerationReference;
		boolean oldEnumerationReferenceESet = enumerationReferenceESet;
		enumerationReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, oldEnumerationReference, enumerationReference, !oldEnumerationReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnumerationReference() {
		IfcPropertyEnumeration oldEnumerationReference = enumerationReference;
		boolean oldEnumerationReferenceESet = enumerationReferenceESet;
		enumerationReference = null;
		enumerationReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, oldEnumerationReference, null, oldEnumerationReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnumerationReference() {
		return enumerationReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				return getEnumerationValues();
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				if (resolve) return getEnumerationReference();
				return basicGetEnumerationReference();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				getEnumerationValues().clear();
				getEnumerationValues().addAll((Collection<? extends IfcValue>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				setEnumerationReference((IfcPropertyEnumeration)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				getEnumerationValues().clear();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				unsetEnumerationReference();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				return enumerationValues != null && !enumerationValues.isEmpty();
			case Ifc2x3tc1Package.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				return isSetEnumerationReference();
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertyEnumeratedValueImpl
