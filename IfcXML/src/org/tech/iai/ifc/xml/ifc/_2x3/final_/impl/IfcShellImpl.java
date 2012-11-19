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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOpenShell;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Shell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShellImpl#getIfcClosedShell <em>Ifc Closed Shell</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcShellImpl#getIfcOpenShell <em>Ifc Open Shell</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcShellImpl extends EObjectImpl implements IfcShell {
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
	 * The cached value of the '{@link #getIfcOpenShell() <em>Ifc Open Shell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcOpenShell()
	 * @generated
	 * @ordered
	 */
	protected IfcOpenShell ifcOpenShell;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcShellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcShell();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL, oldIfcClosedShell, newIfcClosedShell);
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
				msgs = ((InternalEObject)ifcClosedShell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL, null, msgs);
			if (newIfcClosedShell != null)
				msgs = ((InternalEObject)newIfcClosedShell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL, null, msgs);
			msgs = basicSetIfcClosedShell(newIfcClosedShell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL, newIfcClosedShell, newIfcClosedShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcOpenShell getIfcOpenShell() {
		return ifcOpenShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcOpenShell(IfcOpenShell newIfcOpenShell, NotificationChain msgs) {
		IfcOpenShell oldIfcOpenShell = ifcOpenShell;
		ifcOpenShell = newIfcOpenShell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL__IFC_OPEN_SHELL, oldIfcOpenShell, newIfcOpenShell);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcOpenShell(IfcOpenShell newIfcOpenShell) {
		if (newIfcOpenShell != ifcOpenShell) {
			NotificationChain msgs = null;
			if (ifcOpenShell != null)
				msgs = ((InternalEObject)ifcOpenShell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL__IFC_OPEN_SHELL, null, msgs);
			if (newIfcOpenShell != null)
				msgs = ((InternalEObject)newIfcOpenShell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SHELL__IFC_OPEN_SHELL, null, msgs);
			msgs = basicSetIfcOpenShell(newIfcOpenShell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SHELL__IFC_OPEN_SHELL, newIfcOpenShell, newIfcOpenShell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL:
				return basicSetIfcClosedShell(null, msgs);
			case FinalPackage.IFC_SHELL__IFC_OPEN_SHELL:
				return basicSetIfcOpenShell(null, msgs);
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
			case FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL:
				return getIfcClosedShell();
			case FinalPackage.IFC_SHELL__IFC_OPEN_SHELL:
				return getIfcOpenShell();
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
			case FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL:
				setIfcClosedShell((IfcClosedShell)newValue);
				return;
			case FinalPackage.IFC_SHELL__IFC_OPEN_SHELL:
				setIfcOpenShell((IfcOpenShell)newValue);
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
			case FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL:
				setIfcClosedShell((IfcClosedShell)null);
				return;
			case FinalPackage.IFC_SHELL__IFC_OPEN_SHELL:
				setIfcOpenShell((IfcOpenShell)null);
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
			case FinalPackage.IFC_SHELL__IFC_CLOSED_SHELL:
				return ifcClosedShell != null;
			case FinalPackage.IFC_SHELL__IFC_OPEN_SHELL:
				return ifcOpenShell != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcShellImpl
