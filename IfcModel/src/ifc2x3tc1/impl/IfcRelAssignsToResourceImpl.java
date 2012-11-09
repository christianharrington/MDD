/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelAssignsToResource;
import ifc2x3tc1.IfcResource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToResourceImpl#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToResourceImpl extends IfcRelAssignsImpl implements IfcRelAssignsToResource {
	/**
	 * The cached value of the '{@link #getRelatingResource() <em>Relating Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingResource()
	 * @generated
	 * @ordered
	 */
	protected IfcResource relatingResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResource getRelatingResource() {
		if (relatingResource != null && relatingResource.eIsProxy()) {
			InternalEObject oldRelatingResource = (InternalEObject)relatingResource;
			relatingResource = (IfcResource)eResolveProxy(oldRelatingResource);
			if (relatingResource != oldRelatingResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, oldRelatingResource, relatingResource));
			}
		}
		return relatingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResource basicGetRelatingResource() {
		return relatingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingResource(IfcResource newRelatingResource, NotificationChain msgs) {
		IfcResource oldRelatingResource = relatingResource;
		relatingResource = newRelatingResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, oldRelatingResource, newRelatingResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingResource(IfcResource newRelatingResource) {
		if (newRelatingResource != relatingResource) {
			NotificationChain msgs = null;
			if (relatingResource != null)
				msgs = ((InternalEObject)relatingResource).eInverseRemove(this, Ifc2x3tc1Package.IFC_RESOURCE__RESOURCE_OF, IfcResource.class, msgs);
			if (newRelatingResource != null)
				msgs = ((InternalEObject)newRelatingResource).eInverseAdd(this, Ifc2x3tc1Package.IFC_RESOURCE__RESOURCE_OF, IfcResource.class, msgs);
			msgs = basicSetRelatingResource(newRelatingResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, newRelatingResource, newRelatingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				if (relatingResource != null)
					msgs = ((InternalEObject)relatingResource).eInverseRemove(this, Ifc2x3tc1Package.IFC_RESOURCE__RESOURCE_OF, IfcResource.class, msgs);
				return basicSetRelatingResource((IfcResource)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				return basicSetRelatingResource(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				if (resolve) return getRelatingResource();
				return basicGetRelatingResource();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				setRelatingResource((IfcResource)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				setRelatingResource((IfcResource)null);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				return relatingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToResourceImpl
