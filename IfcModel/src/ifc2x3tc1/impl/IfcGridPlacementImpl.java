/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGridPlacement;
import ifc2x3tc1.IfcVirtualGridIntersection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGridPlacementImpl#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGridPlacementImpl#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridPlacementImpl extends IfcObjectPlacementImpl implements IfcGridPlacement {
	/**
	 * The cached value of the '{@link #getPlacementLocation() <em>Placement Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementLocation()
	 * @generated
	 * @ordered
	 */
	protected IfcVirtualGridIntersection placementLocation;

	/**
	 * The cached value of the '{@link #getPlacementRefDirection() <em>Placement Ref Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementRefDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcVirtualGridIntersection placementRefDirection;

	/**
	 * This is true if the Placement Ref Direction reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placementRefDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGridPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGridPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection getPlacementLocation() {
		if (placementLocation != null && placementLocation.eIsProxy()) {
			InternalEObject oldPlacementLocation = (InternalEObject)placementLocation;
			placementLocation = (IfcVirtualGridIntersection)eResolveProxy(oldPlacementLocation);
			if (placementLocation != oldPlacementLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, oldPlacementLocation, placementLocation));
			}
		}
		return placementLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection basicGetPlacementLocation() {
		return placementLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementLocation(IfcVirtualGridIntersection newPlacementLocation) {
		IfcVirtualGridIntersection oldPlacementLocation = placementLocation;
		placementLocation = newPlacementLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, oldPlacementLocation, placementLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection getPlacementRefDirection() {
		if (placementRefDirection != null && placementRefDirection.eIsProxy()) {
			InternalEObject oldPlacementRefDirection = (InternalEObject)placementRefDirection;
			placementRefDirection = (IfcVirtualGridIntersection)eResolveProxy(oldPlacementRefDirection);
			if (placementRefDirection != oldPlacementRefDirection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, oldPlacementRefDirection, placementRefDirection));
			}
		}
		return placementRefDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection basicGetPlacementRefDirection() {
		return placementRefDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRefDirection(IfcVirtualGridIntersection newPlacementRefDirection) {
		IfcVirtualGridIntersection oldPlacementRefDirection = placementRefDirection;
		placementRefDirection = newPlacementRefDirection;
		boolean oldPlacementRefDirectionESet = placementRefDirectionESet;
		placementRefDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, oldPlacementRefDirection, placementRefDirection, !oldPlacementRefDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacementRefDirection() {
		IfcVirtualGridIntersection oldPlacementRefDirection = placementRefDirection;
		boolean oldPlacementRefDirectionESet = placementRefDirectionESet;
		placementRefDirection = null;
		placementRefDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, oldPlacementRefDirection, null, oldPlacementRefDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacementRefDirection() {
		return placementRefDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				if (resolve) return getPlacementLocation();
				return basicGetPlacementLocation();
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				if (resolve) return getPlacementRefDirection();
				return basicGetPlacementRefDirection();
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
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				setPlacementLocation((IfcVirtualGridIntersection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				setPlacementRefDirection((IfcVirtualGridIntersection)newValue);
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
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				setPlacementLocation((IfcVirtualGridIntersection)null);
				return;
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				unsetPlacementRefDirection();
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
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				return placementLocation != null;
			case Ifc2x3tc1Package.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				return isSetPlacementRefDirection();
		}
		return super.eIsSet(featureID);
	}

} //IfcGridPlacementImpl
