/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlane;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Surface Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.BasisSurfaceType2Impl#getIfcPlane <em>Ifc Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasisSurfaceType2Impl extends EObjectImpl implements BasisSurfaceType2 {
	/**
	 * The cached value of the '{@link #getIfcPlane() <em>Ifc Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPlane()
	 * @generated
	 * @ordered
	 */
	protected IfcPlane ifcPlane;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisSurfaceType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getBasisSurfaceType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlane getIfcPlane() {
		return ifcPlane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPlane(IfcPlane newIfcPlane, NotificationChain msgs) {
		IfcPlane oldIfcPlane = ifcPlane;
		ifcPlane = newIfcPlane;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE, oldIfcPlane, newIfcPlane);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlane(IfcPlane newIfcPlane) {
		if (newIfcPlane != ifcPlane) {
			NotificationChain msgs = null;
			if (ifcPlane != null)
				msgs = ((InternalEObject)ifcPlane).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE, null, msgs);
			if (newIfcPlane != null)
				msgs = ((InternalEObject)newIfcPlane).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE, null, msgs);
			msgs = basicSetIfcPlane(newIfcPlane, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE, newIfcPlane, newIfcPlane));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE:
				return basicSetIfcPlane(null, msgs);
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
			case FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE:
				return getIfcPlane();
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
			case FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE:
				setIfcPlane((IfcPlane)newValue);
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
			case FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE:
				setIfcPlane((IfcPlane)null);
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
			case FinalPackage.BASIS_SURFACE_TYPE2__IFC_PLANE:
				return ifcPlane != null;
		}
		return super.eIsSet(featureID);
	}

} //BasisSurfaceType2Impl
