/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEllipseProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Ellipse Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEllipseProfileDefImpl#getSemiAxis1 <em>Semi Axis1</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEllipseProfileDefImpl#getSemiAxis1AsString <em>Semi Axis1 As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEllipseProfileDefImpl#getSemiAxis2 <em>Semi Axis2</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEllipseProfileDefImpl#getSemiAxis2AsString <em>Semi Axis2 As String</em>}</li>
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
	 * The default value of the '{@link #getSemiAxis1AsString() <em>Semi Axis1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis1AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMI_AXIS1_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemiAxis1AsString() <em>Semi Axis1 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis1AsString()
	 * @generated
	 * @ordered
	 */
	protected String semiAxis1AsString = SEMI_AXIS1_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getSemiAxis2AsString() <em>Semi Axis2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis2AsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMI_AXIS2_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemiAxis2AsString() <em>Semi Axis2 As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiAxis2AsString()
	 * @generated
	 * @ordered
	 */
	protected String semiAxis2AsString = SEMI_AXIS2_AS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcEllipseProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1, oldSemiAxis1, semiAxis1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemiAxis1AsString() {
		return semiAxis1AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis1AsString(String newSemiAxis1AsString) {
		String oldSemiAxis1AsString = semiAxis1AsString;
		semiAxis1AsString = newSemiAxis1AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1_AS_STRING, oldSemiAxis1AsString, semiAxis1AsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2, oldSemiAxis2, semiAxis2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSemiAxis2AsString() {
		return semiAxis2AsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemiAxis2AsString(String newSemiAxis2AsString) {
		String oldSemiAxis2AsString = semiAxis2AsString;
		semiAxis2AsString = newSemiAxis2AsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2_AS_STRING, oldSemiAxis2AsString, semiAxis2AsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				return getSemiAxis1();
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1_AS_STRING:
				return getSemiAxis1AsString();
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				return getSemiAxis2();
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2_AS_STRING:
				return getSemiAxis2AsString();
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
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				setSemiAxis1((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1_AS_STRING:
				setSemiAxis1AsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				setSemiAxis2((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2_AS_STRING:
				setSemiAxis2AsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				setSemiAxis1(SEMI_AXIS1_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1_AS_STRING:
				setSemiAxis1AsString(SEMI_AXIS1_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				setSemiAxis2(SEMI_AXIS2_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2_AS_STRING:
				setSemiAxis2AsString(SEMI_AXIS2_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1:
				return semiAxis1 != SEMI_AXIS1_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS1_AS_STRING:
				return SEMI_AXIS1_AS_STRING_EDEFAULT == null ? semiAxis1AsString != null : !SEMI_AXIS1_AS_STRING_EDEFAULT.equals(semiAxis1AsString);
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2:
				return semiAxis2 != SEMI_AXIS2_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ELLIPSE_PROFILE_DEF__SEMI_AXIS2_AS_STRING:
				return SEMI_AXIS2_AS_STRING_EDEFAULT == null ? semiAxis2AsString != null : !SEMI_AXIS2_AS_STRING_EDEFAULT.equals(semiAxis2AsString);
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
		result.append(" (SemiAxis1: ");
		result.append(semiAxis1);
		result.append(", SemiAxis1AsString: ");
		result.append(semiAxis1AsString);
		result.append(", SemiAxis2: ");
		result.append(semiAxis2);
		result.append(", SemiAxis2AsString: ");
		result.append(semiAxis2AsString);
		result.append(')');
		return result.toString();
	}

} //IfcEllipseProfileDefImpl
