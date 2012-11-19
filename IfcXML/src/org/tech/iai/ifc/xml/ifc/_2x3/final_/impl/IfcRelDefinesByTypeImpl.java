/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelDefinesByType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Defines By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelDefinesByTypeImpl#getRelatingType <em>Relating Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelDefinesByTypeImpl extends IfcRelDefinesImpl implements IfcRelDefinesByType {
	/**
	 * The cached value of the '{@link #getRelatingType() <em>Relating Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingType()
	 * @generated
	 * @ordered
	 */
	protected RelatingTypeType relatingType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelDefinesByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelDefinesByType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingTypeType getRelatingType() {
		return relatingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingType(RelatingTypeType newRelatingType, NotificationChain msgs) {
		RelatingTypeType oldRelatingType = relatingType;
		relatingType = newRelatingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, oldRelatingType, newRelatingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingType(RelatingTypeType newRelatingType) {
		if (newRelatingType != relatingType) {
			NotificationChain msgs = null;
			if (relatingType != null)
				msgs = ((InternalEObject)relatingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, null, msgs);
			if (newRelatingType != null)
				msgs = ((InternalEObject)newRelatingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, null, msgs);
			msgs = basicSetRelatingType(newRelatingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE, newRelatingType, newRelatingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				return basicSetRelatingType(null, msgs);
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
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				return getRelatingType();
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
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				setRelatingType((RelatingTypeType)newValue);
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
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				setRelatingType((RelatingTypeType)null);
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
			case FinalPackage.IFC_REL_DEFINES_BY_TYPE__RELATING_TYPE:
				return relatingType != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelDefinesByTypeImpl
