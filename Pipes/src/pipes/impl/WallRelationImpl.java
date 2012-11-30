/**
 */
package pipes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getWall() <em>Wall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWall()
	 * @generated
	 * @ordered
	 */
	protected Wall wall;

	/**
	 * The cached value of the '{@link #getOpening() <em>Opening</em>}' containment reference.
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
		return wall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWall(Wall newWall, NotificationChain msgs) {
		Wall oldWall = wall;
		wall = newWall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__WALL, oldWall, newWall);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWall(Wall newWall) {
		if (newWall != wall) {
			NotificationChain msgs = null;
			if (wall != null)
				msgs = ((InternalEObject)wall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL_RELATION__WALL, null, msgs);
			if (newWall != null)
				msgs = ((InternalEObject)newWall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL_RELATION__WALL, null, msgs);
			msgs = basicSetWall(newWall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__WALL, newWall, newWall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Opening getOpening() {
		return opening;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOpening(Opening newOpening, NotificationChain msgs) {
		Opening oldOpening = opening;
		opening = newOpening;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__OPENING, oldOpening, newOpening);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpening(Opening newOpening) {
		if (newOpening != opening) {
			NotificationChain msgs = null;
			if (opening != null)
				msgs = ((InternalEObject)opening).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL_RELATION__OPENING, null, msgs);
			if (newOpening != null)
				msgs = ((InternalEObject)newOpening).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PipesPackage.WALL_RELATION__OPENING, null, msgs);
			msgs = basicSetOpening(newOpening, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.WALL_RELATION__OPENING, newOpening, newOpening));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipesPackage.WALL_RELATION__WALL:
				return basicSetWall(null, msgs);
			case PipesPackage.WALL_RELATION__OPENING:
				return basicSetOpening(null, msgs);
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
			case PipesPackage.WALL_RELATION__WALL:
				return getWall();
			case PipesPackage.WALL_RELATION__OPENING:
				return getOpening();
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
