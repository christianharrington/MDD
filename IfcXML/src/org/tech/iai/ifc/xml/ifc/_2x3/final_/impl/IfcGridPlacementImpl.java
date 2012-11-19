/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridPlacement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementLocationType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRefDirectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridPlacementImpl#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGridPlacementImpl#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGridPlacementImpl extends IfcObjectPlacementImpl implements IfcGridPlacement {
	/**
	 * The cached value of the '{@link #getPlacementLocation() <em>Placement Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementLocation()
	 * @generated
	 * @ordered
	 */
	protected PlacementLocationType placementLocation;

	/**
	 * The cached value of the '{@link #getPlacementRefDirection() <em>Placement Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementRefDirection()
	 * @generated
	 * @ordered
	 */
	protected PlacementRefDirectionType placementRefDirection;

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
		return FinalPackage.eINSTANCE.getIfcGridPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementLocationType getPlacementLocation() {
		return placementLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementLocation(PlacementLocationType newPlacementLocation, NotificationChain msgs) {
		PlacementLocationType oldPlacementLocation = placementLocation;
		placementLocation = newPlacementLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, oldPlacementLocation, newPlacementLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementLocation(PlacementLocationType newPlacementLocation) {
		if (newPlacementLocation != placementLocation) {
			NotificationChain msgs = null;
			if (placementLocation != null)
				msgs = ((InternalEObject)placementLocation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, null, msgs);
			if (newPlacementLocation != null)
				msgs = ((InternalEObject)newPlacementLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, null, msgs);
			msgs = basicSetPlacementLocation(newPlacementLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION, newPlacementLocation, newPlacementLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementRefDirectionType getPlacementRefDirection() {
		return placementRefDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementRefDirection(PlacementRefDirectionType newPlacementRefDirection, NotificationChain msgs) {
		PlacementRefDirectionType oldPlacementRefDirection = placementRefDirection;
		placementRefDirection = newPlacementRefDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, oldPlacementRefDirection, newPlacementRefDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRefDirection(PlacementRefDirectionType newPlacementRefDirection) {
		if (newPlacementRefDirection != placementRefDirection) {
			NotificationChain msgs = null;
			if (placementRefDirection != null)
				msgs = ((InternalEObject)placementRefDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, null, msgs);
			if (newPlacementRefDirection != null)
				msgs = ((InternalEObject)newPlacementRefDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, null, msgs);
			msgs = basicSetPlacementRefDirection(newPlacementRefDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION, newPlacementRefDirection, newPlacementRefDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				return basicSetPlacementLocation(null, msgs);
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				return basicSetPlacementRefDirection(null, msgs);
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
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				return getPlacementLocation();
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				return getPlacementRefDirection();
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
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				setPlacementLocation((PlacementLocationType)newValue);
				return;
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				setPlacementRefDirection((PlacementRefDirectionType)newValue);
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
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				setPlacementLocation((PlacementLocationType)null);
				return;
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				setPlacementRefDirection((PlacementRefDirectionType)null);
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
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_LOCATION:
				return placementLocation != null;
			case FinalPackage.IFC_GRID_PLACEMENT__PLACEMENT_REF_DIRECTION:
				return placementRefDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcGridPlacementImpl
