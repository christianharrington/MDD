/**
 */
package pipes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pipes.Axis2Placement3D;
import pipes.LocalPlacement;
import pipes.PipesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pipes.impl.LocalPlacementImpl#getAxis2placement3d <em>Axis2placement3d</em>}</li>
 *   <li>{@link pipes.impl.LocalPlacementImpl#getRelativeTo <em>Relative To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalPlacementImpl extends GUIDElementImpl implements LocalPlacement {
	/**
	 * The cached value of the '{@link #getAxis2placement3d() <em>Axis2placement3d</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis2placement3d()
	 * @generated
	 * @ordered
	 */
	protected Axis2Placement3D axis2placement3d;

	/**
	 * The cached value of the '{@link #getRelativeTo() <em>Relative To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeTo()
	 * @generated
	 * @ordered
	 */
	protected LocalPlacement relativeTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipesPackage.Literals.LOCAL_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis2Placement3D getAxis2placement3d() {
		if (axis2placement3d != null && axis2placement3d.eIsProxy()) {
			InternalEObject oldAxis2placement3d = (InternalEObject)axis2placement3d;
			axis2placement3d = (Axis2Placement3D)eResolveProxy(oldAxis2placement3d);
			if (axis2placement3d != oldAxis2placement3d) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D, oldAxis2placement3d, axis2placement3d));
			}
		}
		return axis2placement3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis2Placement3D basicGetAxis2placement3d() {
		return axis2placement3d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis2placement3d(Axis2Placement3D newAxis2placement3d) {
		Axis2Placement3D oldAxis2placement3d = axis2placement3d;
		axis2placement3d = newAxis2placement3d;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D, oldAxis2placement3d, axis2placement3d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement getRelativeTo() {
		if (relativeTo != null && relativeTo.eIsProxy()) {
			InternalEObject oldRelativeTo = (InternalEObject)relativeTo;
			relativeTo = (LocalPlacement)eResolveProxy(oldRelativeTo);
			if (relativeTo != oldRelativeTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO, oldRelativeTo, relativeTo));
			}
		}
		return relativeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalPlacement basicGetRelativeTo() {
		return relativeTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeTo(LocalPlacement newRelativeTo) {
		LocalPlacement oldRelativeTo = relativeTo;
		relativeTo = newRelativeTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO, oldRelativeTo, relativeTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D:
				if (resolve) return getAxis2placement3d();
				return basicGetAxis2placement3d();
			case PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO:
				if (resolve) return getRelativeTo();
				return basicGetRelativeTo();
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
			case PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D:
				setAxis2placement3d((Axis2Placement3D)newValue);
				return;
			case PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO:
				setRelativeTo((LocalPlacement)newValue);
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
			case PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D:
				setAxis2placement3d((Axis2Placement3D)null);
				return;
			case PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO:
				setRelativeTo((LocalPlacement)null);
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
			case PipesPackage.LOCAL_PLACEMENT__AXIS2PLACEMENT3D:
				return axis2placement3d != null;
			case PipesPackage.LOCAL_PLACEMENT__RELATIVE_TO:
				return relativeTo != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalPlacementImpl