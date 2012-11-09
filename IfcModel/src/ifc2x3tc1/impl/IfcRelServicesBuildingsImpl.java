/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRelServicesBuildings;
import ifc2x3tc1.IfcSpatialStructureElement;
import ifc2x3tc1.IfcSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelServicesBuildingsImpl#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelServicesBuildingsImpl#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelServicesBuildingsImpl extends IfcRelConnectsImpl implements IfcRelServicesBuildings {
	/**
	 * The cached value of the '{@link #getRelatingSystem() <em>Relating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingSystem()
	 * @generated
	 * @ordered
	 */
	protected IfcSystem relatingSystem;

	/**
	 * The cached value of the '{@link #getRelatedBuildings() <em>Related Buildings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBuildings()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcSpatialStructureElement> relatedBuildings;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelServicesBuildings();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystem getRelatingSystem() {
		if (relatingSystem != null && relatingSystem.eIsProxy()) {
			InternalEObject oldRelatingSystem = (InternalEObject)relatingSystem;
			relatingSystem = (IfcSystem)eResolveProxy(oldRelatingSystem);
			if (relatingSystem != oldRelatingSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, oldRelatingSystem, relatingSystem));
			}
		}
		return relatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSystem basicGetRelatingSystem() {
		return relatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingSystem(IfcSystem newRelatingSystem, NotificationChain msgs) {
		IfcSystem oldRelatingSystem = relatingSystem;
		relatingSystem = newRelatingSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, oldRelatingSystem, newRelatingSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingSystem(IfcSystem newRelatingSystem) {
		if (newRelatingSystem != relatingSystem) {
			NotificationChain msgs = null;
			if (relatingSystem != null)
				msgs = ((InternalEObject)relatingSystem).eInverseRemove(this, Ifc2x3tc1Package.IFC_SYSTEM__SERVICES_BUILDINGS, IfcSystem.class, msgs);
			if (newRelatingSystem != null)
				msgs = ((InternalEObject)newRelatingSystem).eInverseAdd(this, Ifc2x3tc1Package.IFC_SYSTEM__SERVICES_BUILDINGS, IfcSystem.class, msgs);
			msgs = basicSetRelatingSystem(newRelatingSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM, newRelatingSystem, newRelatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSpatialStructureElement> getRelatedBuildings() {
		if (relatedBuildings == null) {
			relatedBuildings = new EObjectWithInverseResolvingEList.ManyInverse<IfcSpatialStructureElement>(IfcSpatialStructureElement.class, this, Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS, Ifc2x3tc1Package.IFC_SPATIAL_STRUCTURE_ELEMENT__SERVICED_BY_SYSTEMS);
		}
		return relatedBuildings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				if (relatingSystem != null)
					msgs = ((InternalEObject)relatingSystem).eInverseRemove(this, Ifc2x3tc1Package.IFC_SYSTEM__SERVICES_BUILDINGS, IfcSystem.class, msgs);
				return basicSetRelatingSystem((IfcSystem)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelatedBuildings()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				return basicSetRelatingSystem(null, msgs);
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return ((InternalEList<?>)getRelatedBuildings()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				if (resolve) return getRelatingSystem();
				return basicGetRelatingSystem();
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return getRelatedBuildings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				setRelatingSystem((IfcSystem)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				getRelatedBuildings().clear();
				getRelatedBuildings().addAll((Collection<? extends IfcSpatialStructureElement>)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				setRelatingSystem((IfcSystem)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				getRelatedBuildings().clear();
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
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATING_SYSTEM:
				return relatingSystem != null;
			case Ifc2x3tc1Package.IFC_REL_SERVICES_BUILDINGS__RELATED_BUILDINGS:
				return relatedBuildings != null && !relatedBuildings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelServicesBuildingsImpl
