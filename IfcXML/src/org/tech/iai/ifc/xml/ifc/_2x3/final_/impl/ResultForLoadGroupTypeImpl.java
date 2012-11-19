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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadGroup;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ResultForLoadGroupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result For Load Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ResultForLoadGroupTypeImpl#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultForLoadGroupTypeImpl extends EObjectImpl implements ResultForLoadGroupType {
	/**
	 * The cached value of the '{@link #getIfcStructuralLoadGroup() <em>Ifc Structural Load Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcStructuralLoadGroup()
	 * @generated
	 * @ordered
	 */
	protected IfcStructuralLoadGroup ifcStructuralLoadGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultForLoadGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getResultForLoadGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcStructuralLoadGroup getIfcStructuralLoadGroup() {
		return ifcStructuralLoadGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcStructuralLoadGroup(IfcStructuralLoadGroup newIfcStructuralLoadGroup, NotificationChain msgs) {
		IfcStructuralLoadGroup oldIfcStructuralLoadGroup = ifcStructuralLoadGroup;
		ifcStructuralLoadGroup = newIfcStructuralLoadGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP, oldIfcStructuralLoadGroup, newIfcStructuralLoadGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcStructuralLoadGroup(IfcStructuralLoadGroup newIfcStructuralLoadGroup) {
		if (newIfcStructuralLoadGroup != ifcStructuralLoadGroup) {
			NotificationChain msgs = null;
			if (ifcStructuralLoadGroup != null)
				msgs = ((InternalEObject)ifcStructuralLoadGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP, null, msgs);
			if (newIfcStructuralLoadGroup != null)
				msgs = ((InternalEObject)newIfcStructuralLoadGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP, null, msgs);
			msgs = basicSetIfcStructuralLoadGroup(newIfcStructuralLoadGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP, newIfcStructuralLoadGroup, newIfcStructuralLoadGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				return basicSetIfcStructuralLoadGroup(null, msgs);
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
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				return getIfcStructuralLoadGroup();
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
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				setIfcStructuralLoadGroup((IfcStructuralLoadGroup)newValue);
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
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				setIfcStructuralLoadGroup((IfcStructuralLoadGroup)null);
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
			case FinalPackage.RESULT_FOR_LOAD_GROUP_TYPE__IFC_STRUCTURAL_LOAD_GROUP:
				return ifcStructuralLoadGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //ResultForLoadGroupTypeImpl
