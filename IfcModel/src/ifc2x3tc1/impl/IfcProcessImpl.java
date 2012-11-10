/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcProcess;
import ifc2x3tc1.IfcRelAssignsToProcess;
import ifc2x3tc1.IfcRelSequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProcessImpl#getOperatesOn <em>Operates On</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProcessImpl#getIsSuccessorFrom <em>Is Successor From</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProcessImpl#getIsPredecessorTo <em>Is Predecessor To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProcessImpl extends IfcObjectImpl implements IfcProcess {
	/**
	 * The cached value of the '{@link #getOperatesOn() <em>Operates On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatesOn()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelAssignsToProcess> operatesOn;

	/**
	 * The cached value of the '{@link #getIsSuccessorFrom() <em>Is Successor From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSuccessorFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelSequence> isSuccessorFrom;

	/**
	 * The cached value of the '{@link #getIsPredecessorTo() <em>Is Predecessor To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPredecessorTo()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelSequence> isPredecessorTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelAssignsToProcess> getOperatesOn() {
		if (operatesOn == null) {
			operatesOn = new EObjectWithInverseResolvingEList.Unsettable<IfcRelAssignsToProcess>(IfcRelAssignsToProcess.class, this, Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON, Ifc2x3tc1Package.IFC_REL_ASSIGNS_TO_PROCESS__RELATING_PROCESS);
		}
		return operatesOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperatesOn() {
		if (operatesOn != null) ((InternalEList.Unsettable<?>)operatesOn).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperatesOn() {
		return operatesOn != null && ((InternalEList.Unsettable<?>)operatesOn).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelSequence> getIsSuccessorFrom() {
		if (isSuccessorFrom == null) {
			isSuccessorFrom = new EObjectWithInverseResolvingEList.Unsettable<IfcRelSequence>(IfcRelSequence.class, this, Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATED_PROCESS);
		}
		return isSuccessorFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSuccessorFrom() {
		if (isSuccessorFrom != null) ((InternalEList.Unsettable<?>)isSuccessorFrom).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSuccessorFrom() {
		return isSuccessorFrom != null && ((InternalEList.Unsettable<?>)isSuccessorFrom).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelSequence> getIsPredecessorTo() {
		if (isPredecessorTo == null) {
			isPredecessorTo = new EObjectWithInverseResolvingEList.Unsettable<IfcRelSequence>(IfcRelSequence.class, this, Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO, Ifc2x3tc1Package.IFC_REL_SEQUENCE__RELATING_PROCESS);
		}
		return isPredecessorTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPredecessorTo() {
		if (isPredecessorTo != null) ((InternalEList.Unsettable<?>)isPredecessorTo).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPredecessorTo() {
		return isPredecessorTo != null && ((InternalEList.Unsettable<?>)isPredecessorTo).isSet();
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperatesOn()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsSuccessorFrom()).basicAdd(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsPredecessorTo()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				return ((InternalEList<?>)getOperatesOn()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				return ((InternalEList<?>)getIsSuccessorFrom()).basicRemove(otherEnd, msgs);
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				return ((InternalEList<?>)getIsPredecessorTo()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				return getOperatesOn();
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				return getIsSuccessorFrom();
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				return getIsPredecessorTo();
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				getOperatesOn().clear();
				getOperatesOn().addAll((Collection<? extends IfcRelAssignsToProcess>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				getIsSuccessorFrom().clear();
				getIsSuccessorFrom().addAll((Collection<? extends IfcRelSequence>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				getIsPredecessorTo().clear();
				getIsPredecessorTo().addAll((Collection<? extends IfcRelSequence>)newValue);
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				unsetOperatesOn();
				return;
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				unsetIsSuccessorFrom();
				return;
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				unsetIsPredecessorTo();
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
			case Ifc2x3tc1Package.IFC_PROCESS__OPERATES_ON:
				return isSetOperatesOn();
			case Ifc2x3tc1Package.IFC_PROCESS__IS_SUCCESSOR_FROM:
				return isSetIsSuccessorFrom();
			case Ifc2x3tc1Package.IFC_PROCESS__IS_PREDECESSOR_TO:
				return isSetIsPredecessorTo();
		}
		return super.eIsSet(featureID);
	}

} //IfcProcessImpl
