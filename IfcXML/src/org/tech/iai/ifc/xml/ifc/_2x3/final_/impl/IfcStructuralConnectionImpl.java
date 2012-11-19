/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AppliedConditionType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralConnectionImpl#getAppliedCondition <em>Applied Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcStructuralConnectionImpl extends IfcStructuralItemImpl implements IfcStructuralConnection {
	/**
	 * The cached value of the '{@link #getAppliedCondition() <em>Applied Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedCondition()
	 * @generated
	 * @ordered
	 */
	protected AppliedConditionType1 appliedCondition;

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
		return FinalPackage.eINSTANCE.getIfcStructuralConnection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppliedConditionType1 getAppliedCondition() {
		return appliedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliedCondition(AppliedConditionType1 newAppliedCondition, NotificationChain msgs) {
		AppliedConditionType1 oldAppliedCondition = appliedCondition;
		appliedCondition = newAppliedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, oldAppliedCondition, newAppliedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedCondition(AppliedConditionType1 newAppliedCondition) {
		if (newAppliedCondition != appliedCondition) {
			NotificationChain msgs = null;
			if (appliedCondition != null)
				msgs = ((InternalEObject)appliedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, null, msgs);
			if (newAppliedCondition != null)
				msgs = ((InternalEObject)newAppliedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, null, msgs);
			msgs = basicSetAppliedCondition(newAppliedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION, newAppliedCondition, newAppliedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				return basicSetAppliedCondition(null, msgs);
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
			case FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				return getAppliedCondition();
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
			case FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				setAppliedCondition((AppliedConditionType1)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				setAppliedCondition((AppliedConditionType1)null);
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
			case FinalPackage.IFC_STRUCTURAL_CONNECTION__APPLIED_CONDITION:
				return appliedCondition != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcStructuralConnectionImpl
