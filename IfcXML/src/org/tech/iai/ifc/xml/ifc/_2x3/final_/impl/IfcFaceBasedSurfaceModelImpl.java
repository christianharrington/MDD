/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FbsmFacesType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceBasedSurfaceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Face Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFaceBasedSurfaceModelImpl#getFbsmFaces <em>Fbsm Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFaceBasedSurfaceModelImpl extends IfcGeometricRepresentationItemImpl implements IfcFaceBasedSurfaceModel {
	/**
	 * The cached value of the '{@link #getFbsmFaces() <em>Fbsm Faces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbsmFaces()
	 * @generated
	 * @ordered
	 */
	protected FbsmFacesType fbsmFaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFaceBasedSurfaceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFaceBasedSurfaceModel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FbsmFacesType getFbsmFaces() {
		return fbsmFaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFbsmFaces(FbsmFacesType newFbsmFaces, NotificationChain msgs) {
		FbsmFacesType oldFbsmFaces = fbsmFaces;
		fbsmFaces = newFbsmFaces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES, oldFbsmFaces, newFbsmFaces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbsmFaces(FbsmFacesType newFbsmFaces) {
		if (newFbsmFaces != fbsmFaces) {
			NotificationChain msgs = null;
			if (fbsmFaces != null)
				msgs = ((InternalEObject)fbsmFaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES, null, msgs);
			if (newFbsmFaces != null)
				msgs = ((InternalEObject)newFbsmFaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES, null, msgs);
			msgs = basicSetFbsmFaces(newFbsmFaces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES, newFbsmFaces, newFbsmFaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES:
				return basicSetFbsmFaces(null, msgs);
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
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES:
				return getFbsmFaces();
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
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES:
				setFbsmFaces((FbsmFacesType)newValue);
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
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES:
				setFbsmFaces((FbsmFacesType)null);
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
			case FinalPackage.IFC_FACE_BASED_SURFACE_MODEL__FBSM_FACES:
				return fbsmFaces != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcFaceBasedSurfaceModelImpl
