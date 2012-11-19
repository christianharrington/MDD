/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AxisPositionType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis1Placement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis Position Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.AxisPositionTypeImpl#getIfcAxis1Placement <em>Ifc Axis1 Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisPositionTypeImpl extends EObjectImpl implements AxisPositionType {
	/**
	 * The cached value of the '{@link #getIfcAxis1Placement() <em>Ifc Axis1 Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAxis1Placement()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis1Placement ifcAxis1Placement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisPositionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getAxisPositionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis1Placement getIfcAxis1Placement() {
		return ifcAxis1Placement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAxis1Placement(IfcAxis1Placement newIfcAxis1Placement, NotificationChain msgs) {
		IfcAxis1Placement oldIfcAxis1Placement = ifcAxis1Placement;
		ifcAxis1Placement = newIfcAxis1Placement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT, oldIfcAxis1Placement, newIfcAxis1Placement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAxis1Placement(IfcAxis1Placement newIfcAxis1Placement) {
		if (newIfcAxis1Placement != ifcAxis1Placement) {
			NotificationChain msgs = null;
			if (ifcAxis1Placement != null)
				msgs = ((InternalEObject)ifcAxis1Placement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT, null, msgs);
			if (newIfcAxis1Placement != null)
				msgs = ((InternalEObject)newIfcAxis1Placement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT, null, msgs);
			msgs = basicSetIfcAxis1Placement(newIfcAxis1Placement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT, newIfcAxis1Placement, newIfcAxis1Placement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT:
				return basicSetIfcAxis1Placement(null, msgs);
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
			case FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT:
				return getIfcAxis1Placement();
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
			case FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT:
				setIfcAxis1Placement((IfcAxis1Placement)newValue);
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
			case FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT:
				setIfcAxis1Placement((IfcAxis1Placement)null);
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
			case FinalPackage.AXIS_POSITION_TYPE__IFC_AXIS1_PLACEMENT:
				return ifcAxis1Placement != null;
		}
		return super.eIsSet(featureID);
	}

} //AxisPositionTypeImpl
