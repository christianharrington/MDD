/**
 */
package pipes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pipes.LocalPlacement;
import pipes.PipesPackage;
import pipes.Product;
import pipes.Wall;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.WallImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link pipes.impl.WallImpl#getOpenings <em>Openings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WallImpl extends GUIDElementImpl implements Wall {
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
	 * The cached value of the '{@link #getOpenings() <em>Openings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenings()
	 * @generated
	 * @ordered
	 */
	protected EList<WallRelation> openings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.WALL;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.WALL__PLACEMENT, oldPlacement, newPlacement);
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
				msgs = ((InternalEObject)placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL__PLACEMENT, null, msgs);
			if (newPlacement != null)
				msgs = ((InternalEObject)newPlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL__PLACEMENT, null, msgs);
			msgs = basicSetPlacement(newPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL__PLACEMENT, newPlacement, newPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WallRelation> getOpenings() {
		if (openings == null) {
			openings = new EObjectContainmentEList<WallRelation>(WallRelation.class, this, PipesPackage.WALL__OPENINGS);
		}
		return openings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipesPackage.WALL__PLACEMENT:
				return basicSetPlacement(null, msgs);
			case PipesPackage.WALL__OPENINGS:
				return ((InternalEList<?>)getOpenings()).basicRemove(otherEnd, msgs);
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
			case PipesPackage.WALL__PLACEMENT:
				return getPlacement();
			case PipesPackage.WALL__OPENINGS:
				return getOpenings();
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
			case PipesPackage.WALL__PLACEMENT:
				setPlacement((LocalPlacement)newValue);
				return;
			case PipesPackage.WALL__OPENINGS:
				getOpenings().clear();
				getOpenings().addAll((Collection<? extends WallRelation>)newValue);
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
			case PipesPackage.WALL__PLACEMENT:
				setPlacement((LocalPlacement)null);
				return;
			case PipesPackage.WALL__OPENINGS:
				getOpenings().clear();
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
			case PipesPackage.WALL__PLACEMENT:
				return placement != null;
			case PipesPackage.WALL__OPENINGS:
				return openings != null && !openings.isEmpty();
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
				case PipesPackage.WALL__PLACEMENT: return PipesPackage.PRODUCT__PLACEMENT;
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
				case PipesPackage.PRODUCT__PLACEMENT: return PipesPackage.WALL__PLACEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WallImpl
