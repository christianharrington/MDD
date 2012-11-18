/**
 */
package pipes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pipes.LocalPlacement;
import pipes.PipesPackage;
import pipes.Wall;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.WallImpl#getOpenings <em>Openings</em>}</li>
 *   <li>{@link pipes.impl.WallImpl#getPlacement <em>Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WallImpl extends GUIDElementImpl implements Wall {
	/**
	 * The cached value of the '{@link #getOpenings() <em>Openings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenings()
	 * @generated
	 * @ordered
	 */
	protected EList<WallRelation> openings;

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
	public EList<WallRelation> getOpenings() {
		if (openings == null) {
			openings = new EObjectResolvingEList<WallRelation>(WallRelation.class, this, PipesPackage.WALL__OPENINGS);
		}
		return openings;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.WALL__PLACEMENT, oldPlacement, placement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL__PLACEMENT, oldPlacement, placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipesPackage.WALL__OPENINGS:
				return getOpenings();
			case PipesPackage.WALL__PLACEMENT:
				if (resolve) return getPlacement();
				return basicGetPlacement();
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
			case PipesPackage.WALL__OPENINGS:
				getOpenings().clear();
				getOpenings().addAll((Collection<? extends WallRelation>)newValue);
				return;
			case PipesPackage.WALL__PLACEMENT:
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
			case PipesPackage.WALL__OPENINGS:
				getOpenings().clear();
				return;
			case PipesPackage.WALL__PLACEMENT:
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
			case PipesPackage.WALL__OPENINGS:
				return openings != null && !openings.isEmpty();
			case PipesPackage.WALL__PLACEMENT:
				return placement != null;
		}
		return super.eIsSet(featureID);
	}

} //WallImpl
