/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement;
import ifc2x3tc1.IfcMappedItem;
import ifc2x3tc1.IfcRepresentation;
import ifc2x3tc1.IfcRepresentationMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationMapImpl#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationMapImpl#getMappedRepresentation <em>Mapped Representation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRepresentationMapImpl#getMapUsage <em>Map Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRepresentationMapImpl extends EObjectImpl implements IfcRepresentationMap {
	/**
	 * The cached value of the '{@link #getMappingOrigin() <em>Mapping Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingOrigin()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement mappingOrigin;

	/**
	 * The cached value of the '{@link #getMappedRepresentation() <em>Mapped Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappedRepresentation()
	 * @generated
	 * @ordered
	 */
	protected IfcRepresentation mappedRepresentation;

	/**
	 * The cached value of the '{@link #getMapUsage() <em>Map Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcMappedItem> mapUsage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRepresentationMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRepresentationMap();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement getMappingOrigin() {
		if (mappingOrigin != null && mappingOrigin.eIsProxy()) {
			InternalEObject oldMappingOrigin = (InternalEObject)mappingOrigin;
			mappingOrigin = (IfcAxis2Placement)eResolveProxy(oldMappingOrigin);
			if (mappingOrigin != oldMappingOrigin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, oldMappingOrigin, mappingOrigin));
			}
		}
		return mappingOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement basicGetMappingOrigin() {
		return mappingOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingOrigin(IfcAxis2Placement newMappingOrigin) {
		IfcAxis2Placement oldMappingOrigin = mappingOrigin;
		mappingOrigin = newMappingOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN, oldMappingOrigin, mappingOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation getMappedRepresentation() {
		if (mappedRepresentation != null && mappedRepresentation.eIsProxy()) {
			InternalEObject oldMappedRepresentation = (InternalEObject)mappedRepresentation;
			mappedRepresentation = (IfcRepresentation)eResolveProxy(oldMappedRepresentation);
			if (mappedRepresentation != oldMappedRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, oldMappedRepresentation, mappedRepresentation));
			}
		}
		return mappedRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentation basicGetMappedRepresentation() {
		return mappedRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappedRepresentation(IfcRepresentation newMappedRepresentation, NotificationChain msgs) {
		IfcRepresentation oldMappedRepresentation = mappedRepresentation;
		mappedRepresentation = newMappedRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, oldMappedRepresentation, newMappedRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappedRepresentation(IfcRepresentation newMappedRepresentation) {
		if (newMappedRepresentation != mappedRepresentation) {
			NotificationChain msgs = null;
			if (mappedRepresentation != null)
				msgs = ((InternalEObject)mappedRepresentation).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP, IfcRepresentation.class, msgs);
			if (newMappedRepresentation != null)
				msgs = ((InternalEObject)newMappedRepresentation).eInverseAdd(this, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP, IfcRepresentation.class, msgs);
			msgs = basicSetMappedRepresentation(newMappedRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION, newMappedRepresentation, newMappedRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcMappedItem> getMapUsage() {
		if (mapUsage == null) {
			mapUsage = new EObjectWithInverseResolvingEList.Unsettable<IfcMappedItem>(IfcMappedItem.class, this, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE);
		}
		return mapUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMapUsage() {
		if (mapUsage != null) ((InternalEList.Unsettable<?>)mapUsage).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMapUsage() {
		return mapUsage != null && ((InternalEList.Unsettable<?>)mapUsage).isSet();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				if (mappedRepresentation != null)
					msgs = ((InternalEObject)mappedRepresentation).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION__REPRESENTATION_MAP, IfcRepresentation.class, msgs);
				return basicSetMappedRepresentation((IfcRepresentation)otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMapUsage()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				return basicSetMappedRepresentation(null, msgs);
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				return ((InternalEList<?>)getMapUsage()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				if (resolve) return getMappingOrigin();
				return basicGetMappingOrigin();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				if (resolve) return getMappedRepresentation();
				return basicGetMappedRepresentation();
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				return getMapUsage();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				setMappingOrigin((IfcAxis2Placement)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				setMappedRepresentation((IfcRepresentation)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				getMapUsage().clear();
				getMapUsage().addAll((Collection<? extends IfcMappedItem>)newValue);
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				setMappingOrigin((IfcAxis2Placement)null);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				setMappedRepresentation((IfcRepresentation)null);
				return;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				unsetMapUsage();
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
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPING_ORIGIN:
				return mappingOrigin != null;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAPPED_REPRESENTATION:
				return mappedRepresentation != null;
			case Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE:
				return isSetMapUsage();
		}
		return super.eIsSet(featureID);
	}

} //IfcRepresentationMapImpl
