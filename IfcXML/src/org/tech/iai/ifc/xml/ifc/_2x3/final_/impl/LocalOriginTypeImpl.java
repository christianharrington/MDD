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
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocalOriginType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Origin Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.LocalOriginTypeImpl#getIfcCartesianPoint <em>Ifc Cartesian Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalOriginTypeImpl extends EObjectImpl implements LocalOriginType {
	/**
	 * The cached value of the '{@link #getIfcCartesianPoint() <em>Ifc Cartesian Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCartesianPoint()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint ifcCartesianPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalOriginTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getLocalOriginType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getIfcCartesianPoint() {
		return ifcCartesianPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCartesianPoint(IfcCartesianPoint newIfcCartesianPoint, NotificationChain msgs) {
		IfcCartesianPoint oldIfcCartesianPoint = ifcCartesianPoint;
		ifcCartesianPoint = newIfcCartesianPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT, oldIfcCartesianPoint, newIfcCartesianPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCartesianPoint(IfcCartesianPoint newIfcCartesianPoint) {
		if (newIfcCartesianPoint != ifcCartesianPoint) {
			NotificationChain msgs = null;
			if (ifcCartesianPoint != null)
				msgs = ((InternalEObject)ifcCartesianPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT, null, msgs);
			if (newIfcCartesianPoint != null)
				msgs = ((InternalEObject)newIfcCartesianPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT, null, msgs);
			msgs = basicSetIfcCartesianPoint(newIfcCartesianPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT, newIfcCartesianPoint, newIfcCartesianPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT:
				return basicSetIfcCartesianPoint(null, msgs);
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
			case FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT:
				return getIfcCartesianPoint();
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
			case FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT:
				setIfcCartesianPoint((IfcCartesianPoint)newValue);
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
			case FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT:
				setIfcCartesianPoint((IfcCartesianPoint)null);
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
			case FinalPackage.LOCAL_ORIGIN_TYPE__IFC_CARTESIAN_POINT:
				return ifcCartesianPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //LocalOriginTypeImpl
