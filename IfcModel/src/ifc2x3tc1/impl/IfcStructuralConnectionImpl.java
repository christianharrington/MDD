/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundaryCondition;
import ifc2x3tc1.IfcRelConnectsStructuralMember;
import ifc2x3tc1.IfcStructuralConnection;

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
 * An implementation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralConnectionImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralConnectionImpl#getConnectsStructuralMembers <em>Connects Structural Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralConnectionImpl extends IfcStructuralItemImpl implements IfcStructuralConnection {
	/**
	 * The cached value of the '{@link #getAppliedCondition() <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedCondition()
	 * @generated
	 * @ordered
	 */
	protected IfcBoundaryCondition appliedCondition;

	/**
	 * This is true if the Applied Condition reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean appliedConditionESet;

	/**
	 * The cached value of the '{@link #getConnectsStructuralMembers() <em>Connects Structural Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectsStructuralMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcRelConnectsStructuralMember> connectsStructuralMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition getAppliedCondition() {
		if (appliedCondition != null && appliedCondition.eIsProxy()) {
			InternalEObject oldAppliedCondition = (InternalEObject)appliedCondition;
			appliedCondition = (IfcBoundaryCondition)eResolveProxy(oldAppliedCondition);
			if (appliedCondition != oldAppliedCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, oldAppliedCondition, appliedCondition));
			}
		}
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcBoundaryCondition basicGetAppliedCondition() {
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(IfcBoundaryCondition newAppliedCondition) {
		IfcBoundaryCondition oldAppliedCondition = appliedCondition;
		appliedCondition = newAppliedCondition;
		boolean oldAppliedConditionESet = appliedConditionESet;
		appliedConditionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, oldAppliedCondition, appliedCondition, !oldAppliedConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAppliedCondition() {
		IfcBoundaryCondition oldAppliedCondition = appliedCondition;
		boolean oldAppliedConditionESet = appliedConditionESet;
		appliedCondition = null;
		appliedConditionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, oldAppliedCondition, null, oldAppliedConditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAppliedCondition() {
		return appliedConditionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcRelConnectsStructuralMember> getConnectsStructuralMembers() {
		if (connectsStructuralMembers == null) {
			connectsStructuralMembers = new EObjectWithInverseResolvingEList.Unsettable<IfcRelConnectsStructuralMember>(IfcRelConnectsStructuralMember.class, this, Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS, Ifc2x3tc1Package.IFC_REL_CONNECTS_STRUCTURAL_MEMBER__RELATED_STRUCTURAL_CONNECTION);
		}
		return connectsStructuralMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectsStructuralMembers() {
		if (connectsStructuralMembers != null) ((InternalEList.Unsettable<?>)connectsStructuralMembers).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectsStructuralMembers() {
		return connectsStructuralMembers != null && ((InternalEList.Unsettable<?>)connectsStructuralMembers).isSet();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectsStructuralMembers()).basicAdd(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				return ((InternalEList<?>)getConnectsStructuralMembers()).basicRemove(otherEnd, msgs);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				if (resolve) return getAppliedCondition();
				return basicGetAppliedCondition();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				return getConnectsStructuralMembers();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				setAppliedCondition((IfcBoundaryCondition)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				getConnectsStructuralMembers().clear();
				getConnectsStructuralMembers().addAll((Collection<? extends IfcRelConnectsStructuralMember>)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				unsetAppliedCondition();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				unsetConnectsStructuralMembers();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				return isSetAppliedCondition();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_CONNECTION__CONNECTS_STRUCTURAL_MEMBERS:
				return isSetConnectsStructuralMembers();
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralConnectionImpl
