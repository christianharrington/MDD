/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelServicesBuildings;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedBuildingsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingSystemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelServicesBuildingsImpl#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelServicesBuildingsImpl#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelServicesBuildingsImpl extends IfcRelConnectsImpl implements IfcRelServicesBuildings {
	/**
	 * The cached value of the '{@link #getRelatingSystem() <em>Relating System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSystem()
	 * @generated
	 * @ordered
	 */
	protected RelatingSystemType relatingSystem;

	/**
	 * The cached value of the '{@link #getRelatedBuildings() <em>Related Buildings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildings()
	 * @generated
	 * @ordered
	 */
	protected RelatedBuildingsType relatedBuildings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelServicesBuildingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelServicesBuildings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingSystemType getRelatingSystem() {
		return relatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSystem(RelatingSystemType newRelatingSystem, NotificationChain msgs) {
		RelatingSystemType oldRelatingSystem = relatingSystem;
		relatingSystem = newRelatingSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, oldRelatingSystem, newRelatingSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSystem(RelatingSystemType newRelatingSystem) {
		if (newRelatingSystem != relatingSystem) {
			NotificationChain msgs = null;
			if (relatingSystem != null)
				msgs = ((InternalEObject)relatingSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, null, msgs);
			if (newRelatingSystem != null)
				msgs = ((InternalEObject)newRelatingSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, null, msgs);
			msgs = basicSetRelatingSystem(newRelatingSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, newRelatingSystem, newRelatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedBuildingsType getRelatedBuildings() {
		return relatedBuildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedBuildings(RelatedBuildingsType newRelatedBuildings, NotificationChain msgs) {
		RelatedBuildingsType oldRelatedBuildings = relatedBuildings;
		relatedBuildings = newRelatedBuildings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS, oldRelatedBuildings, newRelatedBuildings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedBuildings(RelatedBuildingsType newRelatedBuildings) {
		if (newRelatedBuildings != relatedBuildings) {
			NotificationChain msgs = null;
			if (relatedBuildings != null)
				msgs = ((InternalEObject)relatedBuildings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS, null, msgs);
			if (newRelatedBuildings != null)
				msgs = ((InternalEObject)newRelatedBuildings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS, null, msgs);
			msgs = basicSetRelatedBuildings(newRelatedBuildings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS, newRelatedBuildings, newRelatedBuildings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				return basicSetRelatingSystem(null, msgs);
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return basicSetRelatedBuildings(null, msgs);
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
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				return getRelatingSystem();
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return getRelatedBuildings();
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
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				setRelatingSystem((RelatingSystemType)newValue);
				return;
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				setRelatedBuildings((RelatedBuildingsType)newValue);
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
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				setRelatingSystem((RelatingSystemType)null);
				return;
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				setRelatedBuildings((RelatedBuildingsType)null);
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
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				return relatingSystem != null;
			case FinalPackage.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return relatedBuildings != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelServicesBuildingsImpl
