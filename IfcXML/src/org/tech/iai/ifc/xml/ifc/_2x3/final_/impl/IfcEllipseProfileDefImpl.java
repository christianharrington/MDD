/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEllipseProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Ellipse Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEllipseProfileDefImpl#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEllipseProfileDefImpl#getSemiAxis2 <em>Semi Axis2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEllipseProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcEllipseProfileDef {
	/**
	 * The default value of the '{@link #getSemiAxis1() <em>Semi Axis1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis1()
	 * @generated
	 * @ordered
	 */
	protected static final double SEMI_AXIS1_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSemiAxis1() <em>Semi Axis1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis1()
	 * @generated
	 * @ordered
	 */
	protected double semiAxis1 = SEMI_AXIS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemiAxis2() <em>Semi Axis2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis2()
	 * @generated
	 * @ordered
	 */
	protected static final double SEMI_AXIS2_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSemiAxis2() <em>Semi Axis2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis2()
	 * @generated
	 * @ordered
	 */
	protected double semiAxis2 = SEMI_AXIS2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEllipseProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcEllipseProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSemiAxis1() {
		return semiAxis1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis1(double newSemiAxis1) {
		double oldSemiAxis1 = semiAxis1;
		semiAxis1 = newSemiAxis1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1, oldSemiAxis1, semiAxis1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSemiAxis2() {
		return semiAxis2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis2(double newSemiAxis2) {
		double oldSemiAxis2 = semiAxis2;
		semiAxis2 = newSemiAxis2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2, oldSemiAxis2, semiAxis2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				return getSemiAxis1();
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				return getSemiAxis2();
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
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				setSemiAxis1((Double)newValue);
				return;
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				setSemiAxis2((Double)newValue);
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
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				setSemiAxis1(SEMI_AXIS1_EDEFAULT);
				return;
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				setSemiAxis2(SEMI_AXIS2_EDEFAULT);
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
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				return semiAxis1 != SEMI_AXIS1_EDEFAULT;
			case FinalPackage.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				return semiAxis2 != SEMI_AXIS2_EDEFAULT;
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
		result.append(" (semiAxis1: ");
		result.append(semiAxis1);
		result.append(", semiAxis2: ");
		result.append(semiAxis2);
		result.append(')');
		return result.toString();
	}

} //IfcEllipseProfileDefImpl
