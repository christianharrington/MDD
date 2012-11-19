/**
 */
package pipes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipes.Opening;
import pipes.PipesPackage;
import pipes.Wall;
import pipes.WallRelation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wall Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.WallRelationImpl#getWall <em>Wall</em>}</li>
 *   <li>{@link pipes.impl.WallRelationImpl#getOpening <em>Opening</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WallRelationImpl extends GUIDElementImpl implements WallRelation {
	/**
	 * The cached value of the '{@link #getWall() <em>Wall</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWall()
	 * @generated
	 * @ordered
	 */
	protected Wall wall;

	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpening()
	 * @generated
	 * @ordered
	 */
	protected Opening opening;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WallRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.WALL_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wall getWall() {
		if (wall != null && wall.eIsProxy()) {
			InternalEObject oldWall = (InternalEObject)wall;
			wall = (Wall)eResolveProxy(oldWall);
			if (wall != oldWall) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.WALL_RELATION__WALL, oldWall, wall));
			}
		}
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wall basicGetWall() {
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWall(Wall newWall) {
		Wall oldWall = wall;
		wall = newWall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__WALL, oldWall, wall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opening getOpening() {
		if (opening != null && opening.eIsProxy()) {
			InternalEObject oldOpening = (InternalEObject)opening;
			opening = (Opening)eResolveProxy(oldOpening);
			if (opening != oldOpening) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.WALL_RELATION__OPENING, oldOpening, opening));
			}
		}
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opening basicGetOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpening(Opening newOpening) {
		Opening oldOpening = opening;
		opening = newOpening;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__OPENING, oldOpening, opening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipesPackage.WALL_RELATION__WALL:
				if (resolve) return getWall();
				return basicGetWall();
			case PipesPackage.WALL_RELATION__OPENING:
				if (resolve) return getOpening();
				return basicGetOpening();
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
			case PipesPackage.WALL_RELATION__WALL:
				setWall((Wall)newValue);
				return;
			case PipesPackage.WALL_RELATION__OPENING:
				setOpening((Opening)newValue);
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
			case PipesPackage.WALL_RELATION__WALL:
				setWall((Wall)null);
				return;
			case PipesPackage.WALL_RELATION__OPENING:
				setOpening((Opening)null);
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
			case PipesPackage.WALL_RELATION__WALL:
				return wall != null;
			case PipesPackage.WALL_RELATION__OPENING:
				return opening != null;
		}
		return super.eIsSet(featureID);
	}

} //WallRelationImpl
