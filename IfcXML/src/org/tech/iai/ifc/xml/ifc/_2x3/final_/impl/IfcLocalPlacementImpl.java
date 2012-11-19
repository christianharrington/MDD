/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelativePlacementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalPlacementImpl#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLocalPlacementImpl#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLocalPlacementImpl extends IfcObjectPlacementImpl implements IfcLocalPlacement {
	/**
	 * The cached value of the '{@link #getPlacementRelTo() <em>Placement Rel To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementRelTo()
	 * @generated
	 * @ordered
	 */
	protected PlacementRelToType placementRelTo;

	/**
	 * The cached value of the '{@link #getRelativePlacement() <em>Relative Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePlacement()
	 * @generated
	 * @ordered
	 */
	protected RelativePlacementType relativePlacement;

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
		return FinalPackage.eINSTANCE.getIfcLocalPlacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementRelToType getPlacementRelTo() {
		return placementRelTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementRelTo(PlacementRelToType newPlacementRelTo, NotificationChain msgs) {
		PlacementRelToType oldPlacementRelTo = placementRelTo;
		placementRelTo = newPlacementRelTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, oldPlacementRelTo, newPlacementRelTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementRelTo(PlacementRelToType newPlacementRelTo) {
		if (newPlacementRelTo != placementRelTo) {
			NotificationChain msgs = null;
			if (placementRelTo != null)
				msgs = ((InternalEObject)placementRelTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, null, msgs);
			if (newPlacementRelTo != null)
				msgs = ((InternalEObject)newPlacementRelTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, null, msgs);
			msgs = basicSetPlacementRelTo(newPlacementRelTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO, newPlacementRelTo, newPlacementRelTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePlacementType getRelativePlacement() {
		return relativePlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativePlacement(RelativePlacementType newRelativePlacement, NotificationChain msgs) {
		RelativePlacementType oldRelativePlacement = relativePlacement;
		relativePlacement = newRelativePlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, oldRelativePlacement, newRelativePlacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativePlacement(RelativePlacementType newRelativePlacement) {
		if (newRelativePlacement != relativePlacement) {
			NotificationChain msgs = null;
			if (relativePlacement != null)
				msgs = ((InternalEObject)relativePlacement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, null, msgs);
			if (newRelativePlacement != null)
				msgs = ((InternalEObject)newRelativePlacement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, null, msgs);
			msgs = basicSetRelativePlacement(newRelativePlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT, newRelativePlacement, newRelativePlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				return basicSetPlacementRelTo(null, msgs);
			case FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				return basicSetRelativePlacement(null, msgs);
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
			case FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				return getPlacementRelTo();
			case FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				return getRelativePlacement();
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
			case FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				setPlacementRelTo((PlacementRelToType)newValue);
				return;
			case FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				setRelativePlacement((RelativePlacementType)newValue);
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
			case FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				setPlacementRelTo((PlacementRelToType)null);
				return;
			case FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				setRelativePlacement((RelativePlacementType)null);
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
			case FinalPackage.IFC_LOCAL_PLACEMENT__PLACEMENT_REL_TO:
				return placementRelTo != null;
			case FinalPackage.IFC_LOCAL_PLACEMENT__RELATIVE_PLACEMENT:
				return relativePlacement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcLocalPlacementImpl
