/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRefDirectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Placement Ref Direction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PlacementRefDirectionTypeImpl#getIfcVirtualGridIntersection <em>Ifc Virtual Grid Intersection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlacementRefDirectionTypeImpl extends EObjectImpl implements PlacementRefDirectionType {
	/**
	 * The cached value of the '{@link #getIfcVirtualGridIntersection() <em>Ifc Virtual Grid Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcVirtualGridIntersection()
	 * @generated
	 * @ordered
	 */
	protected IfcVirtualGridIntersection ifcVirtualGridIntersection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementRefDirectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPlacementRefDirectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcVirtualGridIntersection getIfcVirtualGridIntersection() {
		return ifcVirtualGridIntersection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcVirtualGridIntersection(IfcVirtualGridIntersection newIfcVirtualGridIntersection, NotificationChain msgs) {
		IfcVirtualGridIntersection oldIfcVirtualGridIntersection = ifcVirtualGridIntersection;
		ifcVirtualGridIntersection = newIfcVirtualGridIntersection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION, oldIfcVirtualGridIntersection, newIfcVirtualGridIntersection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcVirtualGridIntersection(IfcVirtualGridIntersection newIfcVirtualGridIntersection) {
		if (newIfcVirtualGridIntersection != ifcVirtualGridIntersection) {
			NotificationChain msgs = null;
			if (ifcVirtualGridIntersection != null)
				msgs = ((InternalEObject)ifcVirtualGridIntersection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION, null, msgs);
			if (newIfcVirtualGridIntersection != null)
				msgs = ((InternalEObject)newIfcVirtualGridIntersection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION, null, msgs);
			msgs = basicSetIfcVirtualGridIntersection(newIfcVirtualGridIntersection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION, newIfcVirtualGridIntersection, newIfcVirtualGridIntersection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION:
				return basicSetIfcVirtualGridIntersection(null, msgs);
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
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION:
				return getIfcVirtualGridIntersection();
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
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION:
				setIfcVirtualGridIntersection((IfcVirtualGridIntersection)newValue);
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
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION:
				setIfcVirtualGridIntersection((IfcVirtualGridIntersection)null);
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
			case FinalPackage.PLACEMENT_REF_DIRECTION_TYPE__IFC_VIRTUAL_GRID_INTERSECTION:
				return ifcVirtualGridIntersection != null;
		}
		return super.eIsSet(featureID);
	}

} //PlacementRefDirectionTypeImpl
