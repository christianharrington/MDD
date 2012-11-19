/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyReferenceValue;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PropertyReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyReferenceValueImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPropertyReferenceValueImpl#getPropertyReference <em>Property Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPropertyReferenceValueImpl extends IfcSimplePropertyImpl implements IfcPropertyReferenceValue {
	/**
	 * The default value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageName() <em>Usage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageName()
	 * @generated
	 * @ordered
	 */
	protected String usageName = USAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPropertyReference() <em>Property Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyReference()
	 * @generated
	 * @ordered
	 */
	protected PropertyReferenceType propertyReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPropertyReferenceValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPropertyReferenceValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsageName() {
		return usageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsageName(String newUsageName) {
		String oldUsageName = usageName;
		usageName = newUsageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME, oldUsageName, usageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyReferenceType getPropertyReference() {
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyReference(PropertyReferenceType newPropertyReference, NotificationChain msgs) {
		PropertyReferenceType oldPropertyReference = propertyReference;
		propertyReference = newPropertyReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, oldPropertyReference, newPropertyReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReference(PropertyReferenceType newPropertyReference) {
		if (newPropertyReference != propertyReference) {
			NotificationChain msgs = null;
			if (propertyReference != null)
				msgs = ((InternalEObject)propertyReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, null, msgs);
			if (newPropertyReference != null)
				msgs = ((InternalEObject)newPropertyReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, null, msgs);
			msgs = basicSetPropertyReference(newPropertyReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, newPropertyReference, newPropertyReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				return basicSetPropertyReference(null, msgs);
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
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				return getUsageName();
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				return getPropertyReference();
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
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				setUsageName((String)newValue);
				return;
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				setPropertyReference((PropertyReferenceType)newValue);
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
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				setUsageName(USAGE_NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				setPropertyReference((PropertyReferenceType)null);
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
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				return USAGE_NAME_EDEFAULT == null ? usageName != null : !USAGE_NAME_EDEFAULT.equals(usageName);
			case FinalPackage.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				return propertyReference != null;
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
		result.append(" (usageName: ");
		result.append(usageName);
		result.append(')');
		return result.toString();
	}

} //IfcPropertyReferenceValueImpl
