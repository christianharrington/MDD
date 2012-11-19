/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMappedItem;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappingSourceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.MappingTargetType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMappedItemImpl#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMappedItemImpl#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMappedItemImpl extends IfcRepresentationItemImpl implements IfcMappedItem {
	/**
	 * The cached value of the '{@link #getMappingSource() <em>Mapping Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingSource()
	 * @generated
	 * @ordered
	 */
	protected MappingSourceType mappingSource;

	/**
	 * The cached value of the '{@link #getMappingTarget() <em>Mapping Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingTarget()
	 * @generated
	 * @ordered
	 */
	protected MappingTargetType mappingTarget;

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
		return FinalPackage.eINSTANCE.getIfcMappedItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingSourceType getMappingSource() {
		return mappingSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingSource(MappingSourceType newMappingSource, NotificationChain msgs) {
		MappingSourceType oldMappingSource = mappingSource;
		mappingSource = newMappingSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE, oldMappingSource, newMappingSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingSource(MappingSourceType newMappingSource) {
		if (newMappingSource != mappingSource) {
			NotificationChain msgs = null;
			if (mappingSource != null)
				msgs = ((InternalEObject)mappingSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE, null, msgs);
			if (newMappingSource != null)
				msgs = ((InternalEObject)newMappingSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE, null, msgs);
			msgs = basicSetMappingSource(newMappingSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE, newMappingSource, newMappingSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingTargetType getMappingTarget() {
		return mappingTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingTarget(MappingTargetType newMappingTarget, NotificationChain msgs) {
		MappingTargetType oldMappingTarget = mappingTarget;
		mappingTarget = newMappingTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET, oldMappingTarget, newMappingTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingTarget(MappingTargetType newMappingTarget) {
		if (newMappingTarget != mappingTarget) {
			NotificationChain msgs = null;
			if (mappingTarget != null)
				msgs = ((InternalEObject)mappingTarget).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET, null, msgs);
			if (newMappingTarget != null)
				msgs = ((InternalEObject)newMappingTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET, null, msgs);
			msgs = basicSetMappingTarget(newMappingTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET, newMappingTarget, newMappingTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				return basicSetMappingSource(null, msgs);
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET:
				return basicSetMappingTarget(null, msgs);
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
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				return getMappingSource();
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET:
				return getMappingTarget();
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
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				setMappingSource((MappingSourceType)newValue);
				return;
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET:
				setMappingTarget((MappingTargetType)newValue);
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
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				setMappingSource((MappingSourceType)null);
				return;
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET:
				setMappingTarget((MappingTargetType)null);
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
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_SOURCE:
				return mappingSource != null;
			case FinalPackage.IFC_MAPPED_ITEM__MAPPING_TARGET:
				return mappingTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcMappedItemImpl
