/**
 */
package Pipes.impl;

import Pipes.FlowSegment;
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
 * An implementation of the model object '<em><b>Flow Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Pipes.impl.FlowSegmentImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowSegmentImpl extends GUIDElementImpl implements FlowSegment {
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
	protected FlowSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.FLOW_SEGMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.FLOW_SEGMENT__PLACEMENT, oldPlacement, newPlacement);
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
				msgs = ((InternalEObject)placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.FLOW_SEGMENT__PLACEMENT, null, msgs);
			if (newPlacement != null)
				msgs = ((InternalEObject)newPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.FLOW_SEGMENT__PLACEMENT, null, msgs);
			msgs = basicSetPlacement(newPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.FLOW_SEGMENT__PLACEMENT, newPlacement, newPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipesPackage.FLOW_SEGMENT__PLACEMENT:
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
			case PipesPackage.FLOW_SEGMENT__PLACEMENT:
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
			case PipesPackage.FLOW_SEGMENT__PLACEMENT:
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
			case PipesPackage.FLOW_SEGMENT__PLACEMENT:
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
			case PipesPackage.FLOW_SEGMENT__PLACEMENT:
				return placement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Product.class) {
			switch (derivedFeatureID) {
				case PipesPackage.FLOW_SEGMENT__PLACEMENT: return PipesPackage.PRODUCT__PLACEMENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Product.class) {
			switch (baseFeatureID) {
				case PipesPackage.PRODUCT__PLACEMENT: return PipesPackage.FLOW_SEGMENT__PLACEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FlowSegmentImpl
