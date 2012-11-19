/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ExtrudedDirectionType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extruded Direction Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ExtrudedDirectionType1Impl#getIfcDirection <em>Ifc Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtrudedDirectionType1Impl extends EObjectImpl implements ExtrudedDirectionType1 {
	/**
	 * The cached value of the '{@link #getIfcDirection() <em>Ifc Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection ifcDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtrudedDirectionType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getExtrudedDirectionType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getIfcDirection() {
		return ifcDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcDirection(IfcDirection newIfcDirection, NotificationChain msgs) {
		IfcDirection oldIfcDirection = ifcDirection;
		ifcDirection = newIfcDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION, oldIfcDirection, newIfcDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcDirection(IfcDirection newIfcDirection) {
		if (newIfcDirection != ifcDirection) {
			NotificationChain msgs = null;
			if (ifcDirection != null)
				msgs = ((InternalEObject)ifcDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION, null, msgs);
			if (newIfcDirection != null)
				msgs = ((InternalEObject)newIfcDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION, null, msgs);
			msgs = basicSetIfcDirection(newIfcDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION, newIfcDirection, newIfcDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION:
				return basicSetIfcDirection(null, msgs);
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
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION:
				return getIfcDirection();
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
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION:
				setIfcDirection((IfcDirection)newValue);
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
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION:
				setIfcDirection((IfcDirection)null);
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
			case FinalPackage.EXTRUDED_DIRECTION_TYPE1__IFC_DIRECTION:
				return ifcDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtrudedDirectionType1Impl
