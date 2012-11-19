/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FaceSurfaceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Face Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFaceSurfaceImpl#getFaceSurface <em>Face Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFaceSurfaceImpl#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFaceSurfaceImpl extends IfcFaceImpl implements IfcFaceSurface {
	/**
	 * The cached value of the '{@link #getFaceSurface() <em>Face Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceSurface()
	 * @generated
	 * @ordered
	 */
	protected FaceSurfaceType faceSurface;

	/**
	 * The default value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAME_SENSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSameSense()
	 * @generated
	 * @ordered
	 */
	protected boolean sameSense = SAME_SENSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFaceSurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFaceSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FaceSurfaceType getFaceSurface() {
		return faceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFaceSurface(FaceSurfaceType newFaceSurface, NotificationChain msgs) {
		FaceSurfaceType oldFaceSurface = faceSurface;
		faceSurface = newFaceSurface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE, oldFaceSurface, newFaceSurface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaceSurface(FaceSurfaceType newFaceSurface) {
		if (newFaceSurface != faceSurface) {
			NotificationChain msgs = null;
			if (faceSurface != null)
				msgs = ((InternalEObject)faceSurface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE, null, msgs);
			if (newFaceSurface != null)
				msgs = ((InternalEObject)newFaceSurface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE, null, msgs);
			msgs = basicSetFaceSurface(newFaceSurface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE, newFaceSurface, newFaceSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(boolean newSameSense) {
		boolean oldSameSense = sameSense;
		sameSense = newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FACE_SURFACE__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE:
				return basicSetFaceSurface(null, msgs);
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
			case FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE:
				return getFaceSurface();
			case FinalPackage.IFC_FACE_SURFACE__SAME_SENSE:
				return isSameSense();
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
			case FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE:
				setFaceSurface((FaceSurfaceType)newValue);
				return;
			case FinalPackage.IFC_FACE_SURFACE__SAME_SENSE:
				setSameSense((Boolean)newValue);
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
			case FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE:
				setFaceSurface((FaceSurfaceType)null);
				return;
			case FinalPackage.IFC_FACE_SURFACE__SAME_SENSE:
				setSameSense(SAME_SENSE_EDEFAULT);
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
			case FinalPackage.IFC_FACE_SURFACE__FACE_SURFACE:
				return faceSurface != null;
			case FinalPackage.IFC_FACE_SURFACE__SAME_SENSE:
				return sameSense != SAME_SENSE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcFaceSurfaceImpl
