/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcFaceSurface;
import ifc2x3tc1.IfcSurface;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Face Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFaceSurfaceImpl#getFaceSurface <em>Face Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFaceSurfaceImpl#getSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFaceSurfaceImpl extends IfcFaceImpl implements IfcFaceSurface {
	/**
	 * The cached value of the '{@link #getFaceSurface() <em>Face Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaceSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcSurface faceSurface;

	/**
	 * The default value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate SAME_SENSE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getSameSense() <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameSense()
	 * @generated
	 * @ordered
	 */
	protected Tristate sameSense = SAME_SENSE_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcFaceSurface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface getFaceSurface() {
		if (faceSurface != null && faceSurface.eIsProxy()) {
			InternalEObject oldFaceSurface = (InternalEObject)faceSurface;
			faceSurface = (IfcSurface)eResolveProxy(oldFaceSurface);
			if (faceSurface != oldFaceSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE, oldFaceSurface, faceSurface));
			}
		}
		return faceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurface basicGetFaceSurface() {
		return faceSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaceSurface(IfcSurface newFaceSurface) {
		IfcSurface oldFaceSurface = faceSurface;
		faceSurface = newFaceSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE, oldFaceSurface, faceSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getSameSense() {
		return sameSense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameSense(Tristate newSameSense) {
		Tristate oldSameSense = sameSense;
		sameSense = newSameSense == null ? SAME_SENSE_EDEFAULT : newSameSense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FACE_SURFACE__SAME_SENSE, oldSameSense, sameSense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE:
				if (resolve) return getFaceSurface();
				return basicGetFaceSurface();
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__SAME_SENSE:
				return getSameSense();
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
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE:
				setFaceSurface((IfcSurface)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__SAME_SENSE:
				setSameSense((Tristate)newValue);
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
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE:
				setFaceSurface((IfcSurface)null);
				return;
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__SAME_SENSE:
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
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__FACE_SURFACE:
				return faceSurface != null;
			case Ifc2x3tc1Package.IFC_FACE_SURFACE__SAME_SENSE:
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
		result.append(" (SameSense: ");
		result.append(sameSense);
		result.append(')');
		return result.toString();
	}

} //IfcFaceSurfaceImpl
