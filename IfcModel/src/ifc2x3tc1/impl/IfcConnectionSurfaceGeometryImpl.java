/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionSurfaceGeometry;
import ifc2x3tc1.IfcSurfaceOrFaceSurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionSurfaceGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionSurfaceGeometry {
	/**
	 * The cached value of the '{@link #getSurfaceOnRelatingElement() <em>Surface On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceOrFaceSurface surfaceOnRelatingElement;

	/**
	 * The cached value of the '{@link #getSurfaceOnRelatedElement() <em>Surface On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected IfcSurfaceOrFaceSurface surfaceOnRelatedElement;

	/**
	 * This is true if the Surface On Related Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean surfaceOnRelatedElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionSurfaceGeometryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConnectionSurfaceGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface getSurfaceOnRelatingElement() {
		if (surfaceOnRelatingElement != null && surfaceOnRelatingElement.eIsProxy()) {
			InternalEObject oldSurfaceOnRelatingElement = (InternalEObject)surfaceOnRelatingElement;
			surfaceOnRelatingElement = (IfcSurfaceOrFaceSurface)eResolveProxy(oldSurfaceOnRelatingElement);
			if (surfaceOnRelatingElement != oldSurfaceOnRelatingElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, oldSurfaceOnRelatingElement, surfaceOnRelatingElement));
			}
		}
		return surfaceOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface basicGetSurfaceOnRelatingElement() {
		return surfaceOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatingElement(IfcSurfaceOrFaceSurface newSurfaceOnRelatingElement) {
		IfcSurfaceOrFaceSurface oldSurfaceOnRelatingElement = surfaceOnRelatingElement;
		surfaceOnRelatingElement = newSurfaceOnRelatingElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, oldSurfaceOnRelatingElement, surfaceOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface getSurfaceOnRelatedElement() {
		if (surfaceOnRelatedElement != null && surfaceOnRelatedElement.eIsProxy()) {
			InternalEObject oldSurfaceOnRelatedElement = (InternalEObject)surfaceOnRelatedElement;
			surfaceOnRelatedElement = (IfcSurfaceOrFaceSurface)eResolveProxy(oldSurfaceOnRelatedElement);
			if (surfaceOnRelatedElement != oldSurfaceOnRelatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, oldSurfaceOnRelatedElement, surfaceOnRelatedElement));
			}
		}
		return surfaceOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSurfaceOrFaceSurface basicGetSurfaceOnRelatedElement() {
		return surfaceOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatedElement(IfcSurfaceOrFaceSurface newSurfaceOnRelatedElement) {
		IfcSurfaceOrFaceSurface oldSurfaceOnRelatedElement = surfaceOnRelatedElement;
		surfaceOnRelatedElement = newSurfaceOnRelatedElement;
		boolean oldSurfaceOnRelatedElementESet = surfaceOnRelatedElementESet;
		surfaceOnRelatedElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, oldSurfaceOnRelatedElement, surfaceOnRelatedElement, !oldSurfaceOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSurfaceOnRelatedElement() {
		IfcSurfaceOrFaceSurface oldSurfaceOnRelatedElement = surfaceOnRelatedElement;
		boolean oldSurfaceOnRelatedElementESet = surfaceOnRelatedElementESet;
		surfaceOnRelatedElement = null;
		surfaceOnRelatedElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, oldSurfaceOnRelatedElement, null, oldSurfaceOnRelatedElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSurfaceOnRelatedElement() {
		return surfaceOnRelatedElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				if (resolve) return getSurfaceOnRelatingElement();
				return basicGetSurfaceOnRelatingElement();
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				if (resolve) return getSurfaceOnRelatedElement();
				return basicGetSurfaceOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				setSurfaceOnRelatingElement((IfcSurfaceOrFaceSurface)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				setSurfaceOnRelatedElement((IfcSurfaceOrFaceSurface)newValue);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				setSurfaceOnRelatingElement((IfcSurfaceOrFaceSurface)null);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				unsetSurfaceOnRelatedElement();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				return surfaceOnRelatingElement != null;
			case Ifc2x3tc1Package.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				return isSetSurfaceOnRelatedElement();
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionSurfaceGeometryImpl
