/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColourRgb;
import ifc2x3tc1.IfcSurfaceStyleShading;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Style Shading</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSurfaceStyleShadingImpl#getSurfaceColour <em>Surface Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSurfaceStyleShadingImpl extends EObjectImpl implements IfcSurfaceStyleShading {
	/**
	 * The cached value of the '{@link #getSurfaceColour() <em>Surface Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb surfaceColour;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceStyleShadingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSurfaceStyleShading();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getSurfaceColour() {
		if (surfaceColour != null && surfaceColour.eIsProxy()) {
			InternalEObject oldSurfaceColour = (InternalEObject)surfaceColour;
			surfaceColour = (IfcColourRgb)eResolveProxy(oldSurfaceColour);
			if (surfaceColour != oldSurfaceColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR, oldSurfaceColour, surfaceColour));
			}
		}
		return surfaceColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetSurfaceColour() {
		return surfaceColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceColour(IfcColourRgb newSurfaceColour) {
		IfcColourRgb oldSurfaceColour = surfaceColour;
		surfaceColour = newSurfaceColour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR, oldSurfaceColour, surfaceColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR:
				if (resolve) return getSurfaceColour();
				return basicGetSurfaceColour();
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR:
				setSurfaceColour((IfcColourRgb)newValue);
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR:
				setSurfaceColour((IfcColourRgb)null);
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
			case Ifc2x3tc1Package.IFC_SURFACE_STYLE_SHADING__SURFACE_COLOUR:
				return surfaceColour != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcSurfaceStyleShadingImpl
