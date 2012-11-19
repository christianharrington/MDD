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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasureType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ProfileOrientationTypeImpl#getIfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.ProfileOrientationTypeImpl#getIfcDirection <em>Ifc Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProfileOrientationTypeImpl extends EObjectImpl implements ProfileOrientationType {
	/**
	 * The cached value of the '{@link #getIfcPlaneAngleMeasure() <em>Ifc Plane Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPlaneAngleMeasure()
	 * @generated
	 * @ordered
	 */
	protected IfcPlaneAngleMeasureType ifcPlaneAngleMeasure;

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
	protected ProfileOrientationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getProfileOrientationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPlaneAngleMeasureType getIfcPlaneAngleMeasure() {
		return ifcPlaneAngleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType newIfcPlaneAngleMeasure, NotificationChain msgs) {
		IfcPlaneAngleMeasureType oldIfcPlaneAngleMeasure = ifcPlaneAngleMeasure;
		ifcPlaneAngleMeasure = newIfcPlaneAngleMeasure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE, oldIfcPlaneAngleMeasure, newIfcPlaneAngleMeasure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType newIfcPlaneAngleMeasure) {
		if (newIfcPlaneAngleMeasure != ifcPlaneAngleMeasure) {
			NotificationChain msgs = null;
			if (ifcPlaneAngleMeasure != null)
				msgs = ((InternalEObject)ifcPlaneAngleMeasure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE, null, msgs);
			if (newIfcPlaneAngleMeasure != null)
				msgs = ((InternalEObject)newIfcPlaneAngleMeasure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE, null, msgs);
			msgs = basicSetIfcPlaneAngleMeasure(newIfcPlaneAngleMeasure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE, newIfcPlaneAngleMeasure, newIfcPlaneAngleMeasure));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION, oldIfcDirection, newIfcDirection);
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
				msgs = ((InternalEObject)ifcDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION, null, msgs);
			if (newIfcDirection != null)
				msgs = ((InternalEObject)newIfcDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION, null, msgs);
			msgs = basicSetIfcDirection(newIfcDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION, newIfcDirection, newIfcDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return basicSetIfcPlaneAngleMeasure(null, msgs);
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION:
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
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return getIfcPlaneAngleMeasure();
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION:
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
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE:
				setIfcPlaneAngleMeasure((IfcPlaneAngleMeasureType)newValue);
				return;
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION:
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
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE:
				setIfcPlaneAngleMeasure((IfcPlaneAngleMeasureType)null);
				return;
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION:
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
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_PLANE_ANGLE_MEASURE:
				return ifcPlaneAngleMeasure != null;
			case FinalPackage.PROFILE_ORIENTATION_TYPE__IFC_DIRECTION:
				return ifcDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileOrientationTypeImpl
