/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.Axis1Type;
import org.tech.iai.ifc.xml.ifc._2x3.final_.Axis2Type;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCartesianTransformationOperator;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LocalOriginType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Cartesian Transformation Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperatorImpl#getAxis1 <em>Axis1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperatorImpl#getAxis2 <em>Axis2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperatorImpl#getLocalOrigin <em>Local Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCartesianTransformationOperatorImpl#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IfcCartesianTransformationOperatorImpl extends IfcGeometricRepresentationItemImpl implements IfcCartesianTransformationOperator {
	/**
	 * The cached value of the '{@link #getAxis1() <em>Axis1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis1()
	 * @generated
	 * @ordered
	 */
	protected Axis1Type axis1;

	/**
	 * The cached value of the '{@link #getAxis2() <em>Axis2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis2()
	 * @generated
	 * @ordered
	 */
	protected Axis2Type axis2;

	/**
	 * The cached value of the '{@link #getLocalOrigin() <em>Local Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOrigin()
	 * @generated
	 * @ordered
	 */
	protected LocalOriginType localOrigin;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final Double SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Double scale = SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCartesianTransformationOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCartesianTransformationOperator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis1Type getAxis1() {
		return axis1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis1(Axis1Type newAxis1, NotificationChain msgs) {
		Axis1Type oldAxis1 = axis1;
		axis1 = newAxis1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, oldAxis1, newAxis1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis1(Axis1Type newAxis1) {
		if (newAxis1 != axis1) {
			NotificationChain msgs = null;
			if (axis1 != null)
				msgs = ((InternalEObject)axis1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, null, msgs);
			if (newAxis1 != null)
				msgs = ((InternalEObject)newAxis1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, null, msgs);
			msgs = basicSetAxis1(newAxis1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1, newAxis1, newAxis1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axis2Type getAxis2() {
		return axis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxis2(Axis2Type newAxis2, NotificationChain msgs) {
		Axis2Type oldAxis2 = axis2;
		axis2 = newAxis2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, oldAxis2, newAxis2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis2(Axis2Type newAxis2) {
		if (newAxis2 != axis2) {
			NotificationChain msgs = null;
			if (axis2 != null)
				msgs = ((InternalEObject)axis2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, null, msgs);
			if (newAxis2 != null)
				msgs = ((InternalEObject)newAxis2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, null, msgs);
			msgs = basicSetAxis2(newAxis2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2, newAxis2, newAxis2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalOriginType getLocalOrigin() {
		return localOrigin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalOrigin(LocalOriginType newLocalOrigin, NotificationChain msgs) {
		LocalOriginType oldLocalOrigin = localOrigin;
		localOrigin = newLocalOrigin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, oldLocalOrigin, newLocalOrigin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOrigin(LocalOriginType newLocalOrigin) {
		if (newLocalOrigin != localOrigin) {
			NotificationChain msgs = null;
			if (localOrigin != null)
				msgs = ((InternalEObject)localOrigin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, null, msgs);
			if (newLocalOrigin != null)
				msgs = ((InternalEObject)newLocalOrigin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, null, msgs);
			msgs = basicSetLocalOrigin(newLocalOrigin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN, newLocalOrigin, newLocalOrigin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Double newScale) {
		Double oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				return basicSetAxis1(null, msgs);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				return basicSetAxis2(null, msgs);
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				return basicSetLocalOrigin(null, msgs);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				return getAxis1();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				return getAxis2();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				return getLocalOrigin();
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				return getScale();
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				setAxis1((Axis1Type)newValue);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				setAxis2((Axis2Type)newValue);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				setLocalOrigin((LocalOriginType)newValue);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				setScale((Double)newValue);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				setAxis1((Axis1Type)null);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				setAxis2((Axis2Type)null);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				setLocalOrigin((LocalOriginType)null);
				return;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				setScale(SCALE_EDEFAULT);
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
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS1:
				return axis1 != null;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__AXIS2:
				return axis2 != null;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__LOCAL_ORIGIN:
				return localOrigin != null;
			case FinalPackage.IFC_CARTESIAN_TRANSFORMATION_OPERATOR__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //IfcCartesianTransformationOperatorImpl
