/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ConditionCoordinateSystemType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Coordinate System Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ConditionCoordinateSystemTypeImpl#getIfcAxis2Placement3D <em>Ifc Axis2 Placement3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionCoordinateSystemTypeImpl extends EObjectImpl implements ConditionCoordinateSystemType {
	/**
	 * The cached value of the '{@link #getIfcAxis2Placement3D() <em>Ifc Axis2 Placement3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcAxis2Placement3D()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D ifcAxis2Placement3D;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionCoordinateSystemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getConditionCoordinateSystemType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getIfcAxis2Placement3D() {
		return ifcAxis2Placement3D;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcAxis2Placement3D(IfcAxis2Placement3D newIfcAxis2Placement3D, NotificationChain msgs) {
		IfcAxis2Placement3D oldIfcAxis2Placement3D = ifcAxis2Placement3D;
		ifcAxis2Placement3D = newIfcAxis2Placement3D;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D, oldIfcAxis2Placement3D, newIfcAxis2Placement3D);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcAxis2Placement3D(IfcAxis2Placement3D newIfcAxis2Placement3D) {
		if (newIfcAxis2Placement3D != ifcAxis2Placement3D) {
			NotificationChain msgs = null;
			if (ifcAxis2Placement3D != null)
				msgs = ((InternalEObject)ifcAxis2Placement3D).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D, null, msgs);
			if (newIfcAxis2Placement3D != null)
				msgs = ((InternalEObject)newIfcAxis2Placement3D).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D, null, msgs);
			msgs = basicSetIfcAxis2Placement3D(newIfcAxis2Placement3D, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D, newIfcAxis2Placement3D, newIfcAxis2Placement3D));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D:
				return basicSetIfcAxis2Placement3D(null, msgs);
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
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D:
				return getIfcAxis2Placement3D();
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
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D:
				setIfcAxis2Placement3D((IfcAxis2Placement3D)newValue);
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
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D:
				setIfcAxis2Placement3D((IfcAxis2Placement3D)null);
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
			case FinalPackage.CONDITION_COORDINATE_SYSTEM_TYPE__IFC_AXIS2_PLACEMENT3_D:
				return ifcAxis2Placement3D != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionCoordinateSystemTypeImpl
