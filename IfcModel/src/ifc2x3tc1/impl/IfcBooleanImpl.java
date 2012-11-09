/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoolean;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBooleanImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBooleanImpl extends WrappedValueImpl implements IfcBoolean {
	/**
	 * The default value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate WRAPPED_VALUE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected Tristate wrappedValue = WRAPPED_VALUE_EDEFAULT;

	/**
	 * This is true if the Wrapped Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrappedValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getWrappedValue() {
		return wrappedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValue(Tristate newWrappedValue) {
		Tristate oldWrappedValue = wrappedValue;
		wrappedValue = newWrappedValue == null ? WRAPPED_VALUE_EDEFAULT : newWrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE, oldWrappedValue, wrappedValue, !oldWrappedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValue() {
		Tristate oldWrappedValue = wrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValue = WRAPPED_VALUE_EDEFAULT;
		wrappedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE, oldWrappedValue, WRAPPED_VALUE_EDEFAULT, oldWrappedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrappedValue() {
		return wrappedValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE:
				return getWrappedValue();
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
			case Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE:
				setWrappedValue((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE:
				unsetWrappedValue();
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
			case Ifc2x3tc1Package.IFC_BOOLEAN__WRAPPED_VALUE:
				return isSetWrappedValue();
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
		result.append(" (wrappedValue: ");
		if (wrappedValueESet) result.append(wrappedValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBooleanImpl
