/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.EnumerationReferenceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.EnumerationValuesType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeratedValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyEnumeratedValueImpl#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyEnumeratedValueImpl#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyEnumeratedValueImpl extends IfcSimplePropertyImpl implements IfcPropertyEnumeratedValue {
	/**
	 * The cached value of the '{@link #getEnumerationValues() <em>Enumeration Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationValues()
	 * @generated
	 * @ordered
	 */
	protected EnumerationValuesType1 enumerationValues;

	/**
	 * The cached value of the '{@link #getEnumerationReference() <em>Enumeration Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationReference()
	 * @generated
	 * @ordered
	 */
	protected EnumerationReferenceType enumerationReference;

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
		return FinalPackage.eINSTANCE.getIfcPropertyEnumeratedValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationValuesType1 getEnumerationValues() {
		return enumerationValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationValues(EnumerationValuesType1 newEnumerationValues, NotificationChain msgs) {
		EnumerationValuesType1 oldEnumerationValues = enumerationValues;
		enumerationValues = newEnumerationValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES, oldEnumerationValues, newEnumerationValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationValues(EnumerationValuesType1 newEnumerationValues) {
		if (newEnumerationValues != enumerationValues) {
			NotificationChain msgs = null;
			if (enumerationValues != null)
				msgs = ((InternalEObject)enumerationValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES, null, msgs);
			if (newEnumerationValues != null)
				msgs = ((InternalEObject)newEnumerationValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES, null, msgs);
			msgs = basicSetEnumerationValues(newEnumerationValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES, newEnumerationValues, newEnumerationValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationReferenceType getEnumerationReference() {
		return enumerationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumerationReference(EnumerationReferenceType newEnumerationReference, NotificationChain msgs) {
		EnumerationReferenceType oldEnumerationReference = enumerationReference;
		enumerationReference = newEnumerationReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, oldEnumerationReference, newEnumerationReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerationReference(EnumerationReferenceType newEnumerationReference) {
		if (newEnumerationReference != enumerationReference) {
			NotificationChain msgs = null;
			if (enumerationReference != null)
				msgs = ((InternalEObject)enumerationReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, null, msgs);
			if (newEnumerationReference != null)
				msgs = ((InternalEObject)newEnumerationReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, null, msgs);
			msgs = basicSetEnumerationReference(newEnumerationReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE, newEnumerationReference, newEnumerationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				return basicSetEnumerationValues(null, msgs);
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				return basicSetEnumerationReference(null, msgs);
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
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				return getEnumerationValues();
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				return getEnumerationReference();
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
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				setEnumerationValues((EnumerationValuesType1)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				setEnumerationReference((EnumerationReferenceType)newValue);
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
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				setEnumerationValues((EnumerationValuesType1)null);
				return;
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				setEnumerationReference((EnumerationReferenceType)null);
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
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_VALUES:
				return enumerationValues != null;
			case FinalPackage.IFC_PROPERTY_ENUMERATED_VALUE__ENUMERATION_REFERENCE:
				return enumerationReference != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcPropertyEnumeratedValueImpl
