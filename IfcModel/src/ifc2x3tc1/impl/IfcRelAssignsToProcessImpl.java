/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMeasureWithUnit;
import ifc2x3tc1.IfcProcess;
import ifc2x3tc1.IfcRelAssignsToProcess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rel Assigns To Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToProcessImpl#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRelAssignsToProcessImpl#getQuantityInProcess <em>Quantity In Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRelAssignsToProcessImpl extends IfcRelAssignsImpl implements IfcRelAssignsToProcess {
	/**
	 * The cached value of the '{@link #getRelatingProcess() <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatingProcess()
	 * @generated
	 * @ordered
	 */
	protected IfcProcess relatingProcess;

	/**
	 * The cached value of the '{@link #getQuantityInProcess() <em>Quantity In Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityInProcess()
	 * @generated
	 * @ordered
	 */
	protected IfcMeasureWithUnit quantityInProcess;

	/**
	 * This is true if the Quantity In Process reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantityInProcessESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcRelAssignsToProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess getRelatingProcess() {
		if (relatingProcess != null && relatingProcess.eIsProxy()) {
			InternalEObject oldRelatingProcess = (InternalEObject)relatingProcess;
			relatingProcess = (IfcProcess)eResolveProxy(oldRelatingProcess);
			if (relatingProcess != oldRelatingProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, oldRelatingProcess, relatingProcess));
			}
		}
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcProcess basicGetRelatingProcess() {
		return relatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatingProcess(IfcProcess newRelatingProcess, NotificationChain msgs) {
		IfcProcess oldRelatingProcess = relatingProcess;
		relatingProcess = newRelatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, oldRelatingProcess, newRelatingProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatingProcess(IfcProcess newRelatingProcess) {
		if (newRelatingProcess != relatingProcess) {
			NotificationChain msgs = null;
			if (relatingProcess != null)
				msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON, IfcProcess.class, msgs);
			if (newRelatingProcess != null)
				msgs = ((InternalEObject)newRelatingProcess).eInverseAdd(this, Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON, IfcProcess.class, msgs);
			msgs = basicSetRelatingProcess(newRelatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS, newRelatingProcess, newRelatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getQuantityInProcess() {
		if (quantityInProcess != null && quantityInProcess.eIsProxy()) {
			InternalEObject oldQuantityInProcess = (InternalEObject)quantityInProcess;
			quantityInProcess = (IfcMeasureWithUnit)eResolveProxy(oldQuantityInProcess);
			if (quantityInProcess != oldQuantityInProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, oldQuantityInProcess, quantityInProcess));
			}
		}
		return quantityInProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit basicGetQuantityInProcess() {
		return quantityInProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantityInProcess(IfcMeasureWithUnit newQuantityInProcess) {
		IfcMeasureWithUnit oldQuantityInProcess = quantityInProcess;
		quantityInProcess = newQuantityInProcess;
		boolean oldQuantityInProcessESet = quantityInProcessESet;
		quantityInProcessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, oldQuantityInProcess, quantityInProcess, !oldQuantityInProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantityInProcess() {
		IfcMeasureWithUnit oldQuantityInProcess = quantityInProcess;
		boolean oldQuantityInProcessESet = quantityInProcessESet;
		quantityInProcess = null;
		quantityInProcessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS, oldQuantityInProcess, null, oldQuantityInProcessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantityInProcess() {
		return quantityInProcessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				if (relatingProcess != null)
					msgs = ((InternalEObject)relatingProcess).eInverseRemove(this, Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON, IfcProcess.class, msgs);
				return basicSetRelatingProcess((IfcProcess)otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				return basicSetRelatingProcess(null, msgs);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				if (resolve) return getRelatingProcess();
				return basicGetRelatingProcess();
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				if (resolve) return getQuantityInProcess();
				return basicGetQuantityInProcess();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				setRelatingProcess((IfcProcess)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				setQuantityInProcess((IfcMeasureWithUnit)newValue);
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				setRelatingProcess((IfcProcess)null);
				return;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				unsetQuantityInProcess();
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
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS:
				return relatingProcess != null;
			case Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__QUANTITY_IN_PROCESS:
				return isSetQuantityInProcess();
		}
		return super.eIsSet(featureID);
	}

} //IfcRelAssignsToProcessImpl
