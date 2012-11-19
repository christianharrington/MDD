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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipes.LocalPlacement;
import pipes.Opening;
import pipes.PipesPackage;
import pipes.Product;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opening</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.OpeningImpl#getPlacement <em>Placement</em>}</li>
 *   <li>{@link pipes.impl.OpeningImpl#getWalls <em>Walls</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpeningImpl extends GUIDElementImpl implements Opening {
	/**
	 * The cached value of the '{@link #getPlacement() <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacement()
	 * @generated
	 * @ordered
	 */
	protected LocalPlacement placement;

	/**
	 * The cached value of the '{@link #getWalls() <em>Walls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWalls()
	 * @generated
	 * @ordered
	 */
	protected EList<WallRelation> walls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpeningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.OPENING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement getPlacement() {
		if (placement != null && placement.eIsProxy()) {
			InternalEObject oldPlacement = (InternalEObject)placement;
			placement = (LocalPlacement)eResolveProxy(oldPlacement);
			if (placement != oldPlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.OPENING__PLACEMENT, oldPlacement, placement));
			}
		}
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement basicGetPlacement() {
		return placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacement(LocalPlacement newPlacement) {
		LocalPlacement oldPlacement = placement;
		placement = newPlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.OPENING__PLACEMENT, oldPlacement, placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WallRelation> getWalls() {
		if (walls == null) {
			walls = new EObjectResolvingEList<WallRelation>(WallRelation.class, this, PipesPackage.OPENING__WALLS);
		}
		return walls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipesPackage.OPENING__PLACEMENT:
				if (resolve) return getPlacement();
				return basicGetPlacement();
			case PipesPackage.OPENING__WALLS:
				return getWalls();
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
			case PipesPackage.OPENING__PLACEMENT:
				setPlacement((LocalPlacement)newValue);
				return;
			case PipesPackage.OPENING__WALLS:
				getWalls().clear();
				getWalls().addAll((Collection<? extends WallRelation>)newValue);
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
			case PipesPackage.OPENING__PLACEMENT:
				setPlacement((LocalPlacement)null);
				return;
			case PipesPackage.OPENING__WALLS:
				getWalls().clear();
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
			case PipesPackage.OPENING__PLACEMENT:
				return placement != null;
			case PipesPackage.OPENING__WALLS:
				return walls != null && !walls.isEmpty();
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
				case PipesPackage.OPENING__PLACEMENT: return PipesPackage.PRODUCT__PLACEMENT;
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
				case PipesPackage.PRODUCT__PLACEMENT: return PipesPackage.OPENING__PLACEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OpeningImpl
