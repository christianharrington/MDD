/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OwnerHistoryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owner History Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OwnerHistoryTypeImpl#getIfcOwnerHistory <em>Ifc Owner History</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnerHistoryTypeImpl extends EObjectImpl implements OwnerHistoryType {
	/**
	 * The cached value of the '{@link #getIfcOwnerHistory() <em>Ifc Owner History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOwnerHistory()
	 * @generated
	 * @ordered
	 */
	protected IfcOwnerHistory ifcOwnerHistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerHistoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOwnerHistoryType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOwnerHistory getIfcOwnerHistory() {
		return ifcOwnerHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOwnerHistory(IfcOwnerHistory newIfcOwnerHistory, NotificationChain msgs) {
		IfcOwnerHistory oldIfcOwnerHistory = ifcOwnerHistory;
		ifcOwnerHistory = newIfcOwnerHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY, oldIfcOwnerHistory, newIfcOwnerHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOwnerHistory(IfcOwnerHistory newIfcOwnerHistory) {
		if (newIfcOwnerHistory != ifcOwnerHistory) {
			NotificationChain msgs = null;
			if (ifcOwnerHistory != null)
				msgs = ((InternalEObject)ifcOwnerHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY, null, msgs);
			if (newIfcOwnerHistory != null)
				msgs = ((InternalEObject)newIfcOwnerHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY, null, msgs);
			msgs = basicSetIfcOwnerHistory(newIfcOwnerHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY, newIfcOwnerHistory, newIfcOwnerHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY:
				return basicSetIfcOwnerHistory(null, msgs);
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
			case FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY:
				return getIfcOwnerHistory();
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
			case FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY:
				setIfcOwnerHistory((IfcOwnerHistory)newValue);
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
			case FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY:
				setIfcOwnerHistory((IfcOwnerHistory)null);
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
			case FinalPackage.OWNER_HISTORY_TYPE__IFC_OWNER_HISTORY:
				return ifcOwnerHistory != null;
		}
		return super.eIsSet(featureID);
	}

} //OwnerHistoryTypeImpl
