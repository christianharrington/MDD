/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurveStyleFontAndScaling;
import ifc2x3tc1.IfcCurveStyleFontSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font And Scaling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontAndScalingImpl#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontAndScalingImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontAndScalingImpl#getCurveFontScaling <em>Curve Font Scaling</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontAndScalingImpl#getCurveFontScalingAsString <em>Curve Font Scaling As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleFontAndScalingImpl extends EObjectImpl implements IfcCurveStyleFontAndScaling {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

	/**
	 * The cached value of the '{@link #getCurveFont() <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFont()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyleFontSelect curveFont;

	/**
	 * The default value of the '{@link #getCurveFontScaling() <em>Curve Font Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFontScaling()
	 * @generated
	 * @ordered
	 */
	protected static final double CURVE_FONT_SCALING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurveFontScaling() <em>Curve Font Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFontScaling()
	 * @generated
	 * @ordered
	 */
	protected double curveFontScaling = CURVE_FONT_SCALING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurveFontScalingAsString() <em>Curve Font Scaling As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFontScalingAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CURVE_FONT_SCALING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurveFontScalingAsString() <em>Curve Font Scaling As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFontScalingAsString()
	 * @generated
	 * @ordered
	 */
	protected String curveFontScalingAsString = CURVE_FONT_SCALING_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleFontAndScalingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontAndScaling();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontSelect getCurveFont() {
		if (curveFont != null && curveFont.eIsProxy()) {
			InternalEObject oldCurveFont = (InternalEObject)curveFont;
			curveFont = (IfcCurveStyleFontSelect)eResolveProxy(oldCurveFont);
			if (curveFont != oldCurveFont) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, oldCurveFont, curveFont));
			}
		}
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontSelect basicGetCurveFont() {
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(IfcCurveStyleFontSelect newCurveFont) {
		IfcCurveStyleFontSelect oldCurveFont = curveFont;
		curveFont = newCurveFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, oldCurveFont, curveFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurveFontScaling() {
		return curveFontScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFontScaling(double newCurveFontScaling) {
		double oldCurveFontScaling = curveFontScaling;
		curveFontScaling = newCurveFontScaling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING, oldCurveFontScaling, curveFontScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurveFontScalingAsString() {
		return curveFontScalingAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFontScalingAsString(String newCurveFontScalingAsString) {
		String oldCurveFontScalingAsString = curveFontScalingAsString;
		curveFontScalingAsString = newCurveFontScalingAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING_AS_STRING, oldCurveFontScalingAsString, curveFontScalingAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				return getName();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				if (resolve) return getCurveFont();
				return basicGetCurveFont();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				return getCurveFontScaling();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING_AS_STRING:
				return getCurveFontScalingAsString();
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				setName((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				setCurveFont((IfcCurveStyleFontSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				setCurveFontScaling((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING_AS_STRING:
				setCurveFontScalingAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				unsetName();
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				setCurveFont((IfcCurveStyleFontSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				setCurveFontScaling(CURVE_FONT_SCALING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING_AS_STRING:
				setCurveFontScalingAsString(CURVE_FONT_SCALING_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				return isSetName();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				return curveFont != null;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				return curveFontScaling != CURVE_FONT_SCALING_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING_AS_STRING:
				return CURVE_FONT_SCALING_AS_STRING_EDEFAULT == null ? curveFontScalingAsString != null : !CURVE_FONT_SCALING_AS_STRING_EDEFAULT.equals(curveFontScalingAsString);
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
		result.append(" (Name: ");
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", CurveFontScaling: ");
		result.append(curveFontScaling);
		result.append(", CurveFontScalingAsString: ");
		result.append(curveFontScalingAsString);
		result.append(')');
		return result.toString();
	}

} //IfcCurveStyleFontAndScalingImpl
