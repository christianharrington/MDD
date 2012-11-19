/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionSurfaceGeometry;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatedElementType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SurfaceOnRelatingElementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionSurfaceGeometryImpl#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionSurfaceGeometryImpl extends IfcConnectionGeometryImpl implements IfcConnectionSurfaceGeometry {
	/**
	 * The cached value of the '{@link #getSurfaceOnRelatingElement() <em>Surface On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceOnRelatingElement()
	 * @generated
	 * @ordered
	 */
	protected SurfaceOnRelatingElementType surfaceOnRelatingElement;

	/**
	 * The cached value of the '{@link #getSurfaceOnRelatedElement() <em>Surface On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceOnRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected SurfaceOnRelatedElementType surfaceOnRelatedElement;

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
		return FinalPackage.eINSTANCE.getIfcConnectionSurfaceGeometry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceOnRelatingElementType getSurfaceOnRelatingElement() {
		return surfaceOnRelatingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceOnRelatingElement(SurfaceOnRelatingElementType newSurfaceOnRelatingElement, NotificationChain msgs) {
		SurfaceOnRelatingElementType oldSurfaceOnRelatingElement = surfaceOnRelatingElement;
		surfaceOnRelatingElement = newSurfaceOnRelatingElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, oldSurfaceOnRelatingElement, newSurfaceOnRelatingElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatingElement(SurfaceOnRelatingElementType newSurfaceOnRelatingElement) {
		if (newSurfaceOnRelatingElement != surfaceOnRelatingElement) {
			NotificationChain msgs = null;
			if (surfaceOnRelatingElement != null)
				msgs = ((InternalEObject)surfaceOnRelatingElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, null, msgs);
			if (newSurfaceOnRelatingElement != null)
				msgs = ((InternalEObject)newSurfaceOnRelatingElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, null, msgs);
			msgs = basicSetSurfaceOnRelatingElement(newSurfaceOnRelatingElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT, newSurfaceOnRelatingElement, newSurfaceOnRelatingElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceOnRelatedElementType getSurfaceOnRelatedElement() {
		return surfaceOnRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurfaceOnRelatedElement(SurfaceOnRelatedElementType newSurfaceOnRelatedElement, NotificationChain msgs) {
		SurfaceOnRelatedElementType oldSurfaceOnRelatedElement = surfaceOnRelatedElement;
		surfaceOnRelatedElement = newSurfaceOnRelatedElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, oldSurfaceOnRelatedElement, newSurfaceOnRelatedElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceOnRelatedElement(SurfaceOnRelatedElementType newSurfaceOnRelatedElement) {
		if (newSurfaceOnRelatedElement != surfaceOnRelatedElement) {
			NotificationChain msgs = null;
			if (surfaceOnRelatedElement != null)
				msgs = ((InternalEObject)surfaceOnRelatedElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, null, msgs);
			if (newSurfaceOnRelatedElement != null)
				msgs = ((InternalEObject)newSurfaceOnRelatedElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, null, msgs);
			msgs = basicSetSurfaceOnRelatedElement(newSurfaceOnRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT, newSurfaceOnRelatedElement, newSurfaceOnRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				return basicSetSurfaceOnRelatingElement(null, msgs);
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				return basicSetSurfaceOnRelatedElement(null, msgs);
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
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				return getSurfaceOnRelatingElement();
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				return getSurfaceOnRelatedElement();
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
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				setSurfaceOnRelatingElement((SurfaceOnRelatingElementType)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				setSurfaceOnRelatedElement((SurfaceOnRelatedElementType)newValue);
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
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				setSurfaceOnRelatingElement((SurfaceOnRelatingElementType)null);
				return;
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				setSurfaceOnRelatedElement((SurfaceOnRelatedElementType)null);
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
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATING_ELEMENT:
				return surfaceOnRelatingElement != null;
			case FinalPackage.IFC_CONNECTION_SURFACE_GEOMETRY__SURFACE_ON_RELATED_ELEMENT:
				return surfaceOnRelatedElement != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcConnectionSurfaceGeometryImpl
