/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCenterLineProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Center Line Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCenterLineProfileDefImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCenterLineProfileDefImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCenterLineProfileDefImpl extends IfcArbitraryOpenProfileDefImpl implements IfcCenterLineProfileDef {
	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected double thickness = THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String thicknessAsString = THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCenterLineProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCenterLineProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(double newThickness) {
		double oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS, oldThickness, thickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThicknessAsString() {
		return thicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThicknessAsString(String newThicknessAsString) {
		String oldThicknessAsString = thicknessAsString;
		thicknessAsString = newThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING, oldThicknessAsString, thicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS:
				return getThickness();
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING:
				return getThicknessAsString();
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
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS:
				setThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING:
				setThicknessAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING:
				setThicknessAsString(THICKNESS_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS:
				return thickness != THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CENTER_LINE_PROFILE_DEF__THICKNESS_AS_STRING:
				return THICKNESS_AS_STRING_EDEFAULT == null ? thicknessAsString != null : !THICKNESS_AS_STRING_EDEFAULT.equals(thicknessAsString);
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
		result.append(" (Thickness: ");
		result.append(thickness);
		result.append(", ThicknessAsString: ");
		result.append(thicknessAsString);
		result.append(')');
		return result.toString();
	}

} //IfcCenterLineProfileDefImpl
