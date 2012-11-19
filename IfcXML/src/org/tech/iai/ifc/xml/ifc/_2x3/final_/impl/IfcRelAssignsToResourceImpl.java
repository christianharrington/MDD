/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToResource;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingResourceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToResourceImpl#getRelatingResource <em>Relating Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToResourceImpl extends IfcRelAssignsImpl implements IfcRelAssignsToResource {
	/**
	 * The cached value of the '{@link #getRelatingResource() <em>Relating Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingResource()
	 * @generated
	 * @ordered
	 */
	protected RelatingResourceType relatingResource;

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
		return FinalPackage.eINSTANCE.getIfcRelAssignsToResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingResourceType getRelatingResource() {
		return relatingResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingResource(RelatingResourceType newRelatingResource, NotificationChain msgs) {
		RelatingResourceType oldRelatingResource = relatingResource;
		relatingResource = newRelatingResource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, oldRelatingResource, newRelatingResource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingResource(RelatingResourceType newRelatingResource) {
		if (newRelatingResource != relatingResource) {
			NotificationChain msgs = null;
			if (relatingResource != null)
				msgs = ((InternalEObject)relatingResource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, null, msgs);
			if (newRelatingResource != null)
				msgs = ((InternalEObject)newRelatingResource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, null, msgs);
			msgs = basicSetRelatingResource(newRelatingResource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE, newRelatingResource, newRelatingResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				return getRelatingResource();
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				setRelatingResource((RelatingResourceType)newValue);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				setRelatingResource((RelatingResourceType)null);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_RESOURCE__RELATING_RESOURCE:
				return relatingResource != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToResourceImpl
