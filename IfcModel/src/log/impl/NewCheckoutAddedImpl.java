/**
 */
package log.impl;

import log.LogPackage;
import log.NewCheckoutAdded;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import store.Checkout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Checkout Added</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link log.impl.NewCheckoutAddedImpl#getCheckout <em>Checkout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewCheckoutAddedImpl extends LogActionImpl implements NewCheckoutAdded {
	/**
	 * The cached value of the '{@link #getCheckout() <em>Checkout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckout()
	 * @generated
	 * @ordered
	 */
	protected Checkout checkout;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewCheckoutAddedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.NEW_CHECKOUT_ADDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkout getCheckout() {
		if (checkout != null && checkout.eIsProxy()) {
			InternalEObject oldCheckout = (InternalEObject)checkout;
			checkout = (Checkout)eResolveProxy(oldCheckout);
			if (checkout != oldCheckout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT, oldCheckout, checkout));
			}
		}
		return checkout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Checkout basicGetCheckout() {
		return checkout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckout(Checkout newCheckout) {
		Checkout oldCheckout = checkout;
		checkout = newCheckout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT, oldCheckout, checkout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT:
				if (resolve) return getCheckout();
				return basicGetCheckout();
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
			case LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT:
				setCheckout((Checkout)newValue);
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
			case LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT:
				setCheckout((Checkout)null);
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
			case LogPackage.NEW_CHECKOUT_ADDED__CHECKOUT:
				return checkout != null;
		}
		return super.eIsSet(featureID);
	}

} //NewCheckoutAddedImpl
