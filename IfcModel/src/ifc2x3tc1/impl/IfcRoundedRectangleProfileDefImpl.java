/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRoundedRectangleProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rounded Rectangle Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRoundedRectangleProfileDefImpl#getRoundingRadius <em>Rounding Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRoundedRectangleProfileDefImpl#getRoundingRadiusAsString <em>Rounding Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRoundedRectangleProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRoundedRectangleProfileDef {
	/**
	 * The default value of the '{@link #getRoundingRadius() <em>Rounding Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double ROUNDING_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRoundingRadius() <em>Rounding Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingRadius()
	 * @generated
	 * @ordered
	 */
	protected double roundingRadius = ROUNDING_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoundingRadiusAsString() <em>Rounding Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUNDING_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoundingRadiusAsString() <em>Rounding Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundingRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String roundingRadiusAsString = ROUNDING_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRoundedRectangleProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRoundedRectangleProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRoundingRadius() {
		return roundingRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundingRadius(double newRoundingRadius) {
		double oldRoundingRadius = roundingRadius;
		roundingRadius = newRoundingRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS, oldRoundingRadius, roundingRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoundingRadiusAsString() {
		return roundingRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundingRadiusAsString(String newRoundingRadiusAsString) {
		String oldRoundingRadiusAsString = roundingRadiusAsString;
		roundingRadiusAsString = newRoundingRadiusAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS_AS_STRING, oldRoundingRadiusAsString, roundingRadiusAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS:
				return getRoundingRadius();
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS_AS_STRING:
				return getRoundingRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS:
				setRoundingRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS_AS_STRING:
				setRoundingRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS:
				setRoundingRadius(ROUNDING_RADIUS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS_AS_STRING:
				setRoundingRadiusAsString(ROUNDING_RADIUS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS:
				return roundingRadius != ROUNDING_RADIUS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ROUNDED_RECTANGLE_PROFILE_DEF__ROUNDING_RADIUS_AS_STRING:
				return ROUNDING_RADIUS_AS_STRING_EDEFAULT == null ? roundingRadiusAsString != null : !ROUNDING_RADIUS_AS_STRING_EDEFAULT.equals(roundingRadiusAsString);
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
		result.append(" (RoundingRadius: ");
		result.append(roundingRadius);
		result.append(", RoundingRadiusAsString: ");
		result.append(roundingRadiusAsString);
		result.append(')');
		return result.toString();
	}

} //IfcRoundedRectangleProfileDefImpl
