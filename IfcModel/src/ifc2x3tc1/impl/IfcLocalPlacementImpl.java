/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement;
import ifc2x3tc1.IfcLocalPlacement;
import ifc2x3tc1.IfcObjectPlacement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalPlacementImpl#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLocalPlacementImpl#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLocalPlacementImpl extends IfcObjectPlacementImpl implements IfcLocalPlacement {
	/**
	 * The cached value of the '{@link #getPlacementRelTo() <em>Placement Rel To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementRelTo()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectPlacement placementRelTo;

	/**
	 * This is true if the Placement Rel To reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean placementRelToESet;

	/**
	 * The cached value of the '{@link #getRelativePlacement() <em>Relative Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePlacement()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement relativePlacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLocalPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLocalPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement getPlacementRelTo() {
		if (placementRelTo != null && placementRelTo.eIsProxy()) {
			InternalEObject oldPlacementRelTo = (InternalEObject)placementRelTo;
			placementRelTo = (IfcObjectPlacement)eResolveProxy(oldPlacementRelTo);
			if (placementRelTo != oldPlacementRelTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, oldPlacementRelTo, placementRelTo));
			}
		}
		return placementRelTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectPlacement basicGetPlacementRelTo() {
		return placementRelTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementRelTo(IfcObjectPlacement newPlacementRelTo, NotificationChain msgs) {
		IfcObjectPlacement oldPlacementRelTo = placementRelTo;
		placementRelTo = newPlacementRelTo;
		boolean oldPlacementRelToESet = placementRelToESet;
		placementRelToESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, oldPlacementRelTo, newPlacementRelTo, !oldPlacementRelToESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRelTo(IfcObjectPlacement newPlacementRelTo) {
		if (newPlacementRelTo != placementRelTo) {
			NotificationChain msgs = null;
			if (placementRelTo != null)
				msgs = ((InternalEObject)placementRelTo).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS, IfcObjectPlacement.class, msgs);
			if (newPlacementRelTo != null)
				msgs = ((InternalEObject)newPlacementRelTo).eInverseAdd(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS, IfcObjectPlacement.class, msgs);
			msgs = basicSetPlacementRelTo(newPlacementRelTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPlacementRelToESet = placementRelToESet;
			placementRelToESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, newPlacementRelTo, newPlacementRelTo, !oldPlacementRelToESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetPlacementRelTo(NotificationChain msgs) {
		IfcObjectPlacement oldPlacementRelTo = placementRelTo;
		placementRelTo = null;
		boolean oldPlacementRelToESet = placementRelToESet;
		placementRelToESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, oldPlacementRelTo, null, oldPlacementRelToESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlacementRelTo() {
		if (placementRelTo != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)placementRelTo).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS, IfcObjectPlacement.class, msgs);
			msgs = basicUnsetPlacementRelTo(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldPlacementRelToESet = placementRelToESet;
			placementRelToESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, null, null, oldPlacementRelToESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlacementRelTo() {
		return placementRelToESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getRelativePlacement() {
		if (relativePlacement != null && relativePlacement.eIsProxy()) {
			InternalEObject oldRelativePlacement = (InternalEObject)relativePlacement;
			relativePlacement = (IfcAxis2Placement)eResolveProxy(oldRelativePlacement);
			if (relativePlacement != oldRelativePlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, oldRelativePlacement, relativePlacement));
			}
		}
		return relativePlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement basicGetRelativePlacement() {
		return relativePlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePlacement(IfcAxis2Placement newRelativePlacement) {
		IfcAxis2Placement oldRelativePlacement = relativePlacement;
		relativePlacement = newRelativePlacement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, oldRelativePlacement, relativePlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				if (placementRelTo != null)
					msgs = ((InternalEObject)placementRelTo).eInverseRemove(this, Ifc2x3tc1Package.IFC_OBJECT_PLACEMENT__REFERENCED_BY_PLACEMENTS, IfcObjectPlacement.class, msgs);
				return basicSetPlacementRelTo((IfcObjectPlacement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				return basicUnsetPlacementRelTo(msgs);
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
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				if (resolve) return getPlacementRelTo();
				return basicGetPlacementRelTo();
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				if (resolve) return getRelativePlacement();
				return basicGetRelativePlacement();
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
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				setPlacementRelTo((IfcObjectPlacement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				setRelativePlacement((IfcAxis2Placement)newValue);
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
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				unsetPlacementRelTo();
				return;
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				setRelativePlacement((IfcAxis2Placement)null);
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
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				return isSetPlacementRelTo();
			case Ifc2x3tc1Package.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				return relativePlacement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcLocalPlacementImpl
