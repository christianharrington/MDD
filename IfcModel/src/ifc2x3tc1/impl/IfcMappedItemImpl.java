/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianTransformationOperator;
import ifc2x3tc1.IfcMappedItem;
import ifc2x3tc1.IfcRepresentationMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMappedItemImpl#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMappedItemImpl#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMappedItemImpl extends IfcRepresentationItemImpl implements IfcMappedItem {
	/**
	 * The cached value of the '{@link #getMappingSource() <em>Mapping Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingSource()
	 * @generated
	 * @ordered
	 */
	protected IfcRepresentationMap mappingSource;

	/**
	 * The cached value of the '{@link #getMappingTarget() <em>Mapping Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingTarget()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianTransformationOperator mappingTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMappedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMappedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationMap getMappingSource() {
		if (mappingSource != null && mappingSource.eIsProxy()) {
			InternalEObject oldMappingSource = (InternalEObject)mappingSource;
			mappingSource = (IfcRepresentationMap)eResolveProxy(oldMappingSource);
			if (mappingSource != oldMappingSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE, oldMappingSource, mappingSource));
			}
		}
		return mappingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRepresentationMap basicGetMappingSource() {
		return mappingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingSource(IfcRepresentationMap newMappingSource, NotificationChain msgs) {
		IfcRepresentationMap oldMappingSource = mappingSource;
		mappingSource = newMappingSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE, oldMappingSource, newMappingSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingSource(IfcRepresentationMap newMappingSource) {
		if (newMappingSource != mappingSource) {
			NotificationChain msgs = null;
			if (mappingSource != null)
				msgs = ((InternalEObject)mappingSource).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE, IfcRepresentationMap.class, msgs);
			if (newMappingSource != null)
				msgs = ((InternalEObject)newMappingSource).eInverseAdd(this, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE, IfcRepresentationMap.class, msgs);
			msgs = basicSetMappingSource(newMappingSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE, newMappingSource, newMappingSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator getMappingTarget() {
		if (mappingTarget != null && mappingTarget.eIsProxy()) {
			InternalEObject oldMappingTarget = (InternalEObject)mappingTarget;
			mappingTarget = (IfcCartesianTransformationOperator)eResolveProxy(oldMappingTarget);
			if (mappingTarget != oldMappingTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET, oldMappingTarget, mappingTarget));
			}
		}
		return mappingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianTransformationOperator basicGetMappingTarget() {
		return mappingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingTarget(IfcCartesianTransformationOperator newMappingTarget) {
		IfcCartesianTransformationOperator oldMappingTarget = mappingTarget;
		mappingTarget = newMappingTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET, oldMappingTarget, mappingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				if (mappingSource != null)
					msgs = ((InternalEObject)mappingSource).eInverseRemove(this, Ifc2x3tc1Package.IFC_REPRESENTATION_MAP__MAP_USAGE, IfcRepresentationMap.class, msgs);
				return basicSetMappingSource((IfcRepresentationMap)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				return basicSetMappingSource(null, msgs);
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
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				if (resolve) return getMappingSource();
				return basicGetMappingSource();
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET:
				if (resolve) return getMappingTarget();
				return basicGetMappingTarget();
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
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				setMappingSource((IfcRepresentationMap)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET:
				setMappingTarget((IfcCartesianTransformationOperator)newValue);
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
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				setMappingSource((IfcRepresentationMap)null);
				return;
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET:
				setMappingTarget((IfcCartesianTransformationOperator)null);
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
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				return mappingSource != null;
			case Ifc2x3tc1Package.IFC_MAPPED_ITEM__MAPPING_TARGET:
				return mappingTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMappedItemImpl
