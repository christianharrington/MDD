/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGloballyUniqueId;
import ifc2x3tc1.IfcRoot;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Globally Unique Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGloballyUniqueIdImpl#getWrappedValue <em>Wrapped Value</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGloballyUniqueIdImpl#getIfcRoot <em>Ifc Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGloballyUniqueIdImpl extends WrappedValueImpl implements IfcGloballyUniqueId {
	/**
	 * The default value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected static final String WRAPPED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrappedValue() <em>Wrapped Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrappedValue()
	 * @generated
	 * @ordered
	 */
	protected String wrappedValue = WRAPPED_VALUE_EDEFAULT;

	/**
	 * This is true if the Wrapped Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wrappedValueESet;

	/**
	 * The cached value of the '{@link #getIfcRoot() <em>Ifc Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcRoot()
	 * @generated
	 * @ordered
	 */
	protected IfcRoot ifcRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGloballyUniqueIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGloballyUniqueId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWrappedValue() {
		return wrappedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrappedValue(String newWrappedValue) {
		String oldWrappedValue = wrappedValue;
		wrappedValue = newWrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE, oldWrappedValue, wrappedValue, !oldWrappedValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrappedValue() {
		String oldWrappedValue = wrappedValue;
		boolean oldWrappedValueESet = wrappedValueESet;
		wrappedValue = WRAPPED_VALUE_EDEFAULT;
		wrappedValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE, oldWrappedValue, WRAPPED_VALUE_EDEFAULT, oldWrappedValueESet));
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
	public IfcRoot getIfcRoot() {
		if (ifcRoot != null && ifcRoot.eIsProxy()) {
			InternalEObject oldIfcRoot = (InternalEObject)ifcRoot;
			ifcRoot = (IfcRoot)eResolveProxy(oldIfcRoot);
			if (ifcRoot != oldIfcRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, oldIfcRoot, ifcRoot));
			}
		}
		return ifcRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRoot basicGetIfcRoot() {
		return ifcRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcRoot(IfcRoot newIfcRoot, NotificationChain msgs) {
		IfcRoot oldIfcRoot = ifcRoot;
		ifcRoot = newIfcRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, oldIfcRoot, newIfcRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcRoot(IfcRoot newIfcRoot) {
		if (newIfcRoot != ifcRoot) {
			NotificationChain msgs = null;
			if (ifcRoot != null)
				msgs = ((InternalEObject)ifcRoot).eInverseRemove(this, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, IfcRoot.class, msgs);
			if (newIfcRoot != null)
				msgs = ((InternalEObject)newIfcRoot).eInverseAdd(this, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, IfcRoot.class, msgs);
			msgs = basicSetIfcRoot(newIfcRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT, newIfcRoot, newIfcRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				if (ifcRoot != null)
					msgs = ((InternalEObject)ifcRoot).eInverseRemove(this, Ifc2x3tc1Package.IFC_ROOT__GLOBAL_ID, IfcRoot.class, msgs);
				return basicSetIfcRoot((IfcRoot)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				return basicSetIfcRoot(null, msgs);
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
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE:
				return getWrappedValue();
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				if (resolve) return getIfcRoot();
				return basicGetIfcRoot();
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
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE:
				setWrappedValue((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				setIfcRoot((IfcRoot)newValue);
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
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE:
				unsetWrappedValue();
				return;
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				setIfcRoot((IfcRoot)null);
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
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__WRAPPED_VALUE:
				return isSetWrappedValue();
			case Ifc2x3tc1Package.IFC_GLOBALLY_UNIQUE_ID__IFC_ROOT:
				return ifcRoot != null;
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

} //IfcGloballyUniqueIdImpl
