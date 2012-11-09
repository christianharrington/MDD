/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColourRgb;
import ifc2x3tc1.IfcSurfaceStyleLighting;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Lighting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleLightingImpl#getDiffuseTransmissionColour <em>Diffuse Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleLightingImpl#getDiffuseReflectionColour <em>Diffuse Reflection Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleLightingImpl#getTransmissionColour <em>Transmission Colour</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleLightingImpl#getReflectanceColour <em>Reflectance Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleLightingImpl extends EObjectImpl implements IfcSurfaceStyleLighting {
	/**
	 * The cached value of the '{@link #getDiffuseTransmissionColour() <em>Diffuse Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb diffuseTransmissionColour;

	/**
	 * The cached value of the '{@link #getDiffuseReflectionColour() <em>Diffuse Reflection Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffuseReflectionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb diffuseReflectionColour;

	/**
	 * The cached value of the '{@link #getTransmissionColour() <em>Transmission Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmissionColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb transmissionColour;

	/**
	 * The cached value of the '{@link #getReflectanceColour() <em>Reflectance Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectanceColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb reflectanceColour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleLightingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleLighting();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getDiffuseTransmissionColour() {
		if (diffuseTransmissionColour != null && diffuseTransmissionColour.eIsProxy()) {
			InternalEObject oldDiffuseTransmissionColour = (InternalEObject)diffuseTransmissionColour;
			diffuseTransmissionColour = (IfcColourRgb)eResolveProxy(oldDiffuseTransmissionColour);
			if (diffuseTransmissionColour != oldDiffuseTransmissionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, diffuseTransmissionColour));
			}
		}
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetDiffuseTransmissionColour() {
		return diffuseTransmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseTransmissionColour(IfcColourRgb newDiffuseTransmissionColour) {
		IfcColourRgb oldDiffuseTransmissionColour = diffuseTransmissionColour;
		diffuseTransmissionColour = newDiffuseTransmissionColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR, oldDiffuseTransmissionColour, diffuseTransmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getDiffuseReflectionColour() {
		if (diffuseReflectionColour != null && diffuseReflectionColour.eIsProxy()) {
			InternalEObject oldDiffuseReflectionColour = (InternalEObject)diffuseReflectionColour;
			diffuseReflectionColour = (IfcColourRgb)eResolveProxy(oldDiffuseReflectionColour);
			if (diffuseReflectionColour != oldDiffuseReflectionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, oldDiffuseReflectionColour, diffuseReflectionColour));
			}
		}
		return diffuseReflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetDiffuseReflectionColour() {
		return diffuseReflectionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffuseReflectionColour(IfcColourRgb newDiffuseReflectionColour) {
		IfcColourRgb oldDiffuseReflectionColour = diffuseReflectionColour;
		diffuseReflectionColour = newDiffuseReflectionColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR, oldDiffuseReflectionColour, diffuseReflectionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getTransmissionColour() {
		if (transmissionColour != null && transmissionColour.eIsProxy()) {
			InternalEObject oldTransmissionColour = (InternalEObject)transmissionColour;
			transmissionColour = (IfcColourRgb)eResolveProxy(oldTransmissionColour);
			if (transmissionColour != oldTransmissionColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, oldTransmissionColour, transmissionColour));
			}
		}
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetTransmissionColour() {
		return transmissionColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmissionColour(IfcColourRgb newTransmissionColour) {
		IfcColourRgb oldTransmissionColour = transmissionColour;
		transmissionColour = newTransmissionColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR, oldTransmissionColour, transmissionColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getReflectanceColour() {
		if (reflectanceColour != null && reflectanceColour.eIsProxy()) {
			InternalEObject oldReflectanceColour = (InternalEObject)reflectanceColour;
			reflectanceColour = (IfcColourRgb)eResolveProxy(oldReflectanceColour);
			if (reflectanceColour != oldReflectanceColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, oldReflectanceColour, reflectanceColour));
			}
		}
		return reflectanceColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetReflectanceColour() {
		return reflectanceColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectanceColour(IfcColourRgb newReflectanceColour) {
		IfcColourRgb oldReflectanceColour = reflectanceColour;
		reflectanceColour = newReflectanceColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR, oldReflectanceColour, reflectanceColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				if (resolve) return getDiffuseTransmissionColour();
				return basicGetDiffuseTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				if (resolve) return getDiffuseReflectionColour();
				return basicGetDiffuseReflectionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				if (resolve) return getTransmissionColour();
				return basicGetTransmissionColour();
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				if (resolve) return getReflectanceColour();
				return basicGetReflectanceColour();
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((IfcColourRgb)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				setDiffuseReflectionColour((IfcColourRgb)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				setTransmissionColour((IfcColourRgb)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				setReflectanceColour((IfcColourRgb)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				setDiffuseTransmissionColour((IfcColourRgb)null);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				setDiffuseReflectionColour((IfcColourRgb)null);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				setTransmissionColour((IfcColourRgb)null);
				return;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				setReflectanceColour((IfcColourRgb)null);
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_TRANSMISSION_COLOUR:
				return diffuseTransmissionColour != null;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__DIFFUSE_REFLECTION_COLOUR:
				return diffuseReflectionColour != null;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__TRANSMISSION_COLOUR:
				return transmissionColour != null;
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_LIGHTING__REFLECTANCE_COLOUR:
				return reflectanceColour != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSurfaceStyleLightingImpl
