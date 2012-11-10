/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCircleHollowProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Circle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCircleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCircleHollowProfileDefImpl#getWallThicknessAsString <em>Wall Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCircleHollowProfileDefImpl extends IfcCircleProfileDefImpl implements IfcCircleHollowProfileDef {
	/**
	 * The default value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double WALL_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected double wallThickness = WALL_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WALL_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String wallThicknessAsString = WALL_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCircleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCircleHollowProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWallThickness() {
		return wallThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(double newWallThickness) {
		double oldWallThickness = wallThickness;
		wallThickness = newWallThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS, oldWallThickness, wallThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWallThicknessAsString() {
		return wallThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThicknessAsString(String newWallThicknessAsString) {
		String oldWallThicknessAsString = wallThicknessAsString;
		wallThicknessAsString = newWallThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING, oldWallThicknessAsString, wallThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return getWallThickness();
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return getWallThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness(WALL_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString(WALL_THICKNESS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return wallThickness != WALL_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CIRCLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return WALL_THICKNESS_AS_STRING_EDEFAULT == null ? wallThicknessAsString != null : !WALL_THICKNESS_AS_STRING_EDEFAULT.equals(wallThicknessAsString);
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
		result.append(" (WallThickness: ");
		result.append(wallThickness);
		result.append(", WallThicknessAsString: ");
		result.append(wallThicknessAsString);
		result.append(')');
		return result.toString();
	}

} //IfcCircleHollowProfileDefImpl
