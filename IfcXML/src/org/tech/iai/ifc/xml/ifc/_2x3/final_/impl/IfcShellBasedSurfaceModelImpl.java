/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShellBasedSurfaceModel;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SbsmBoundaryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shell Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShellBasedSurfaceModelImpl#getSbsmBoundary <em>Sbsm Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShellBasedSurfaceModelImpl extends IfcGeometricRepresentationItemImpl implements IfcShellBasedSurfaceModel {
	/**
	 * The cached value of the '{@link #getSbsmBoundary() <em>Sbsm Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSbsmBoundary()
	 * @generated
	 * @ordered
	 */
	protected SbsmBoundaryType sbsmBoundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShellBasedSurfaceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcShellBasedSurfaceModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SbsmBoundaryType getSbsmBoundary() {
		return sbsmBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSbsmBoundary(SbsmBoundaryType newSbsmBoundary, NotificationChain msgs) {
		SbsmBoundaryType oldSbsmBoundary = sbsmBoundary;
		sbsmBoundary = newSbsmBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY, oldSbsmBoundary, newSbsmBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSbsmBoundary(SbsmBoundaryType newSbsmBoundary) {
		if (newSbsmBoundary != sbsmBoundary) {
			NotificationChain msgs = null;
			if (sbsmBoundary != null)
				msgs = ((InternalEObject)sbsmBoundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY, null, msgs);
			if (newSbsmBoundary != null)
				msgs = ((InternalEObject)newSbsmBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY, null, msgs);
			msgs = basicSetSbsmBoundary(newSbsmBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY, newSbsmBoundary, newSbsmBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY:
				return basicSetSbsmBoundary(null, msgs);
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
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY:
				return getSbsmBoundary();
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
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY:
				setSbsmBoundary((SbsmBoundaryType)newValue);
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
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY:
				setSbsmBoundary((SbsmBoundaryType)null);
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
			case FinalPackage.IFC_SHELL_BASED_SURFACE_MODEL__SBSM_BOUNDARY:
				return sbsmBoundary != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcShellBasedSurfaceModelImpl
