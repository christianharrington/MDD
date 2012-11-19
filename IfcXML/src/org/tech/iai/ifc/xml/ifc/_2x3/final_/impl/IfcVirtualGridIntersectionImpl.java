/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IntersectingAxesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OffsetDistancesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVirtualGridIntersectionImpl#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcVirtualGridIntersectionImpl#getOffsetDistances <em>Offset Distances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcVirtualGridIntersectionImpl extends EntityImpl implements IfcVirtualGridIntersection {
	/**
	 * The cached value of the '{@link #getIntersectingAxes() <em>Intersecting Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntersectingAxes()
	 * @generated
	 * @ordered
	 */
	protected IntersectingAxesType intersectingAxes;

	/**
	 * The cached value of the '{@link #getOffsetDistances() <em>Offset Distances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetDistances()
	 * @generated
	 * @ordered
	 */
	protected OffsetDistancesType offsetDistances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcVirtualGridIntersectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcVirtualGridIntersection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntersectingAxesType getIntersectingAxes() {
		return intersectingAxes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntersectingAxes(IntersectingAxesType newIntersectingAxes, NotificationChain msgs) {
		IntersectingAxesType oldIntersectingAxes = intersectingAxes;
		intersectingAxes = newIntersectingAxes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES, oldIntersectingAxes, newIntersectingAxes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntersectingAxes(IntersectingAxesType newIntersectingAxes) {
		if (newIntersectingAxes != intersectingAxes) {
			NotificationChain msgs = null;
			if (intersectingAxes != null)
				msgs = ((InternalEObject)intersectingAxes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES, null, msgs);
			if (newIntersectingAxes != null)
				msgs = ((InternalEObject)newIntersectingAxes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES, null, msgs);
			msgs = basicSetIntersectingAxes(newIntersectingAxes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES, newIntersectingAxes, newIntersectingAxes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDistancesType getOffsetDistances() {
		return offsetDistances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetDistances(OffsetDistancesType newOffsetDistances, NotificationChain msgs) {
		OffsetDistancesType oldOffsetDistances = offsetDistances;
		offsetDistances = newOffsetDistances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES, oldOffsetDistances, newOffsetDistances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetDistances(OffsetDistancesType newOffsetDistances) {
		if (newOffsetDistances != offsetDistances) {
			NotificationChain msgs = null;
			if (offsetDistances != null)
				msgs = ((InternalEObject)offsetDistances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES, null, msgs);
			if (newOffsetDistances != null)
				msgs = ((InternalEObject)newOffsetDistances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES, null, msgs);
			msgs = basicSetOffsetDistances(newOffsetDistances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES, newOffsetDistances, newOffsetDistances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return basicSetIntersectingAxes(null, msgs);
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				return basicSetOffsetDistances(null, msgs);
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
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return getIntersectingAxes();
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				return getOffsetDistances();
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
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				setIntersectingAxes((IntersectingAxesType)newValue);
				return;
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				setOffsetDistances((OffsetDistancesType)newValue);
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
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				setIntersectingAxes((IntersectingAxesType)null);
				return;
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				setOffsetDistances((OffsetDistancesType)null);
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
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__INTERSECTING_AXES:
				return intersectingAxes != null;
			case FinalPackage.IFC_VIRTUAL_GRID_INTERSECTION__OFFSET_DISTANCES:
				return offsetDistances != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcVirtualGridIntersectionImpl
