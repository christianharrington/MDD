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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClosedShell;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OuterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outer Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.OuterTypeImpl#getIfcClosedShell <em>Ifc Closed Shell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OuterTypeImpl extends EObjectImpl implements OuterType {
	/**
	 * The cached value of the '{@link #getIfcClosedShell() <em>Ifc Closed Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcClosedShell()
	 * @generated
	 * @ordered
	 */
	protected IfcClosedShell ifcClosedShell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OuterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getOuterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcClosedShell getIfcClosedShell() {
		return ifcClosedShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcClosedShell(IfcClosedShell newIfcClosedShell, NotificationChain msgs) {
		IfcClosedShell oldIfcClosedShell = ifcClosedShell;
		ifcClosedShell = newIfcClosedShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL, oldIfcClosedShell, newIfcClosedShell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcClosedShell(IfcClosedShell newIfcClosedShell) {
		if (newIfcClosedShell != ifcClosedShell) {
			NotificationChain msgs = null;
			if (ifcClosedShell != null)
				msgs = ((InternalEObject)ifcClosedShell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL, null, msgs);
			if (newIfcClosedShell != null)
				msgs = ((InternalEObject)newIfcClosedShell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL, null, msgs);
			msgs = basicSetIfcClosedShell(newIfcClosedShell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL, newIfcClosedShell, newIfcClosedShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL:
				return basicSetIfcClosedShell(null, msgs);
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
			case FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL:
				return getIfcClosedShell();
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
			case FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL:
				setIfcClosedShell((IfcClosedShell)newValue);
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
			case FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL:
				setIfcClosedShell((IfcClosedShell)null);
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
			case FinalPackage.OUTER_TYPE__IFC_CLOSED_SHELL:
				return ifcClosedShell != null;
		}
		return super.eIsSet(featureID);
	}

} //OuterTypeImpl
