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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement2D;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PositionType8;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Type8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.PositionType8Impl#getIfcAxis2Placement2D <em>Ifc Axis2 Placement2 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionType8Impl extends EObjectImpl implements PositionType8 {
	/**
	 * The cached value of the '{@link #getIfcAxis2Placement2D() <em>Ifc Axis2 Placement2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAxis2Placement2D()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement2D ifcAxis2Placement2D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionType8Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getPositionType8();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement2D getIfcAxis2Placement2D() {
		return ifcAxis2Placement2D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAxis2Placement2D(IfcAxis2Placement2D newIfcAxis2Placement2D, NotificationChain msgs) {
		IfcAxis2Placement2D oldIfcAxis2Placement2D = ifcAxis2Placement2D;
		ifcAxis2Placement2D = newIfcAxis2Placement2D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D, oldIfcAxis2Placement2D, newIfcAxis2Placement2D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAxis2Placement2D(IfcAxis2Placement2D newIfcAxis2Placement2D) {
		if (newIfcAxis2Placement2D != ifcAxis2Placement2D) {
			NotificationChain msgs = null;
			if (ifcAxis2Placement2D != null)
				msgs = ((InternalEObject)ifcAxis2Placement2D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D, null, msgs);
			if (newIfcAxis2Placement2D != null)
				msgs = ((InternalEObject)newIfcAxis2Placement2D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D, null, msgs);
			msgs = basicSetIfcAxis2Placement2D(newIfcAxis2Placement2D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D, newIfcAxis2Placement2D, newIfcAxis2Placement2D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D:
				return basicSetIfcAxis2Placement2D(null, msgs);
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
			case FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D:
				return getIfcAxis2Placement2D();
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
			case FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D:
				setIfcAxis2Placement2D((IfcAxis2Placement2D)newValue);
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
			case FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D:
				setIfcAxis2Placement2D((IfcAxis2Placement2D)null);
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
			case FinalPackage.POSITION_TYPE8__IFC_AXIS2_PLACEMENT2_D:
				return ifcAxis2Placement2D != null;
		}
		return super.eIsSet(featureID);
	}

} //PositionType8Impl
