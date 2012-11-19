/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.AxisType2;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RefDirectionType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAxis2Placement3DImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAxis2Placement3DImpl#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAxis2Placement3DImpl extends IfcPlacementImpl implements IfcAxis2Placement3D {
	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected AxisType2 axis;

	/**
	 * The cached value of the '{@link #getRefDirection() <em>Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDirection()
	 * @generated
	 * @ordered
	 */
	protected RefDirectionType1 refDirection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAxis2Placement3DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcAxis2Placement3D();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisType2 getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis(AxisType2 newAxis, NotificationChain msgs) {
		AxisType2 oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS, oldAxis, newAxis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(AxisType2 newAxis) {
		if (newAxis != axis) {
			NotificationChain msgs = null;
			if (axis != null)
				msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS, null, msgs);
			if (newAxis != null)
				msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS, null, msgs);
			msgs = basicSetAxis(newAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS, newAxis, newAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDirectionType1 getRefDirection() {
		return refDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefDirection(RefDirectionType1 newRefDirection, NotificationChain msgs) {
		RefDirectionType1 oldRefDirection = refDirection;
		refDirection = newRefDirection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, oldRefDirection, newRefDirection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDirection(RefDirectionType1 newRefDirection) {
		if (newRefDirection != refDirection) {
			NotificationChain msgs = null;
			if (refDirection != null)
				msgs = ((InternalEObject)refDirection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, null, msgs);
			if (newRefDirection != null)
				msgs = ((InternalEObject)newRefDirection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, null, msgs);
			msgs = basicSetRefDirection(newRefDirection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION, newRefDirection, newRefDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS:
				return basicSetAxis(null, msgs);
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return basicSetRefDirection(null, msgs);
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
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS:
				return getAxis();
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return getRefDirection();
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
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS:
				setAxis((AxisType2)newValue);
				return;
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				setRefDirection((RefDirectionType1)newValue);
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
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS:
				setAxis((AxisType2)null);
				return;
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				setRefDirection((RefDirectionType1)null);
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
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__AXIS:
				return axis != null;
			case FinalPackage.IFC_AXIS2_PLACEMENT3_D__REF_DIRECTION:
				return refDirection != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcAxis2Placement3DImpl
