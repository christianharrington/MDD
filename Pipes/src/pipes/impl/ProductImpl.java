/**
 */
package Pipes.impl;

import Pipes.LocalPlacement;
import Pipes.PipesPackage;
import Pipes.Product;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Pipes.impl.ProductImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ProductImpl extends GUIDElementImpl implements Product {
	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected LocalPlacement placement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement getPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacement(LocalPlacement newPlacement, NotificationChain msgs) {
		LocalPlacement oldPlacement = placement;
		placement = newPlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.PRODUCT__PLACEMENT, oldPlacement, newPlacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(LocalPlacement newPlacement) {
		if (newPlacement != placement) {
			NotificationChain msgs = null;
			if (placement != null)
				msgs = ((InternalEObject)placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.PRODUCT__PLACEMENT, null, msgs);
			if (newPlacement != null)
				msgs = ((InternalEObject)newPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.PRODUCT__PLACEMENT, null, msgs);
			msgs = basicSetPlacement(newPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.PRODUCT__PLACEMENT, newPlacement, newPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipesPackage.PRODUCT__PLACEMENT:
				return basicSetPlacement(null, msgs);
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
			case PipesPackage.PRODUCT__PLACEMENT:
				return getPlacement();
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
			case PipesPackage.PRODUCT__PLACEMENT:
				setPlacement((LocalPlacement)newValue);
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
			case PipesPackage.PRODUCT__PLACEMENT:
				setPlacement((LocalPlacement)null);
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
			case PipesPackage.PRODUCT__PLACEMENT:
				return placement != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductImpl
