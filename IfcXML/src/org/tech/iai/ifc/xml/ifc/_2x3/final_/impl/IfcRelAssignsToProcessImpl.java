/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProcess;
import org.tech.iai.ifc.xml.ifc._2x3.final_.QuantityInProcessType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingProcessType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToProcessImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRelAssignsToProcessImpl#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToProcessImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProcess {
	/**
	 * The cached value of the '{@link #getRelatingProcess() <em>Relating Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProcess()
	 * @generated
	 * @ordered
	 */
	protected RelatingProcessType1 relatingProcess;

	/**
	 * The cached value of the '{@link #getQuantityInProcess() <em>Quantity In Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityInProcess()
	 * @generated
	 * @ordered
	 */
	protected QuantityInProcessType quantityInProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRelAssignsToProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRelAssignsToProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatingProcessType1 getRelatingProcess() {
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProcess(RelatingProcessType1 newRelatingProcess, NotificationChain msgs) {
		RelatingProcessType1 oldRelatingProcess = relatingProcess;
		relatingProcess = newRelatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, oldRelatingProcess, newRelatingProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(RelatingProcessType1 newRelatingProcess) {
		if (newRelatingProcess != relatingProcess) {
			NotificationChain msgs = null;
			if (relatingProcess != null)
				msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, null, msgs);
			if (newRelatingProcess != null)
				msgs = ((InternalEObject)newRelatingProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, null, msgs);
			msgs = basicSetRelatingProcess(newRelatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, newRelatingProcess, newRelatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityInProcessType getQuantityInProcess() {
		return quantityInProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantityInProcess(QuantityInProcessType newQuantityInProcess, NotificationChain msgs) {
		QuantityInProcessType oldQuantityInProcess = quantityInProcess;
		quantityInProcess = newQuantityInProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, oldQuantityInProcess, newQuantityInProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityInProcess(QuantityInProcessType newQuantityInProcess) {
		if (newQuantityInProcess != quantityInProcess) {
			NotificationChain msgs = null;
			if (quantityInProcess != null)
				msgs = ((InternalEObject)quantityInProcess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, null, msgs);
			if (newQuantityInProcess != null)
				msgs = ((InternalEObject)newQuantityInProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, null, msgs);
			msgs = basicSetQuantityInProcess(newQuantityInProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, newQuantityInProcess, newQuantityInProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				return basicSetRelatingProcess(null, msgs);
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				return basicSetQuantityInProcess(null, msgs);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				return getRelatingProcess();
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				return getQuantityInProcess();
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				setRelatingProcess((RelatingProcessType1)newValue);
				return;
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				setQuantityInProcess((QuantityInProcessType)newValue);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				setRelatingProcess((RelatingProcessType1)null);
				return;
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				setQuantityInProcess((QuantityInProcessType)null);
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
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				return relatingProcess != null;
			case FinalPackage.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				return quantityInProcess != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToProcessImpl
