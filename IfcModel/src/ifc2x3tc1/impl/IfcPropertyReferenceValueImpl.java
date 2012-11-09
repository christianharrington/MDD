/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectReferenceSelect;
import ifc2x3tc1.IfcPropertyReferenceValue;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Property Reference Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyReferenceValueImpl#getUsageName <em>Usage Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcPropertyReferenceValueImpl#getPropertyReference <em>Property Reference</em>}</li>
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
	 * This is true if the Usage Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageNameESet;

	/**
	 * The cached value of the '{@link #getPropertyReference() <em>Property Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyReference()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectReferenceSelect propertyReference;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcPropertyReferenceValue();
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
		boolean oldUsageNameESet = usageNameESet;
		usageNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME, oldUsageName, usageName, !oldUsageNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsageName() {
		String oldUsageName = usageName;
		boolean oldUsageNameESet = usageNameESet;
		usageName = USAGE_NAME_EDEFAULT;
		usageNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME, oldUsageName, USAGE_NAME_EDEFAULT, oldUsageNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsageName() {
		return usageNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectReferenceSelect getPropertyReference() {
		if (propertyReference != null && propertyReference.eIsProxy()) {
			InternalEObject oldPropertyReference = (InternalEObject)propertyReference;
			propertyReference = (IfcObjectReferenceSelect)eResolveProxy(oldPropertyReference);
			if (propertyReference != oldPropertyReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, oldPropertyReference, propertyReference));
			}
		}
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectReferenceSelect basicGetPropertyReference() {
		return propertyReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyReference(IfcObjectReferenceSelect newPropertyReference) {
		IfcObjectReferenceSelect oldPropertyReference = propertyReference;
		propertyReference = newPropertyReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE, oldPropertyReference, propertyReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				return getUsageName();
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				if (resolve) return getPropertyReference();
				return basicGetPropertyReference();
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
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				setUsageName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				setPropertyReference((IfcObjectReferenceSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				unsetUsageName();
				return;
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
				setPropertyReference((IfcObjectReferenceSelect)null);
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
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__USAGE_NAME:
				return isSetUsageName();
			case Ifc2x3tc1Package.IFC_PROPERTY_REFERENCE_VALUE__PROPERTY_REFERENCE:
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
		result.append(" (UsageName: ");
		if (usageNameESet) result.append(usageName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcPropertyReferenceValueImpl
