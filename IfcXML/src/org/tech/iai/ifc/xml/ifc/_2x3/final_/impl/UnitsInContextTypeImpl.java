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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcUnitAssignment;
import org.tech.iai.ifc.xml.ifc._2x3.final_.UnitsInContextType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Units In Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.UnitsInContextTypeImpl#getIfcUnitAssignment <em>Ifc Unit Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnitsInContextTypeImpl extends EObjectImpl implements UnitsInContextType {
	/**
	 * The cached value of the '{@link #getIfcUnitAssignment() <em>Ifc Unit Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcUnitAssignment()
	 * @generated
	 * @ordered
	 */
	protected IfcUnitAssignment ifcUnitAssignment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitsInContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getUnitsInContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitAssignment getIfcUnitAssignment() {
		return ifcUnitAssignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcUnitAssignment(IfcUnitAssignment newIfcUnitAssignment, NotificationChain msgs) {
		IfcUnitAssignment oldIfcUnitAssignment = ifcUnitAssignment;
		ifcUnitAssignment = newIfcUnitAssignment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT, oldIfcUnitAssignment, newIfcUnitAssignment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcUnitAssignment(IfcUnitAssignment newIfcUnitAssignment) {
		if (newIfcUnitAssignment != ifcUnitAssignment) {
			NotificationChain msgs = null;
			if (ifcUnitAssignment != null)
				msgs = ((InternalEObject)ifcUnitAssignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT, null, msgs);
			if (newIfcUnitAssignment != null)
				msgs = ((InternalEObject)newIfcUnitAssignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT, null, msgs);
			msgs = basicSetIfcUnitAssignment(newIfcUnitAssignment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT, newIfcUnitAssignment, newIfcUnitAssignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT:
				return basicSetIfcUnitAssignment(null, msgs);
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
			case FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT:
				return getIfcUnitAssignment();
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
			case FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT:
				setIfcUnitAssignment((IfcUnitAssignment)newValue);
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
			case FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT:
				setIfcUnitAssignment((IfcUnitAssignment)null);
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
			case FinalPackage.UNITS_IN_CONTEXT_TYPE__IFC_UNIT_ASSIGNMENT:
				return ifcUnitAssignment != null;
		}
		return super.eIsSet(featureID);
	}

} //UnitsInContextTypeImpl
