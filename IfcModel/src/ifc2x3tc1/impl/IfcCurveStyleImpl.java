/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcColour;
import ifc2x3tc1.IfcCurveFontOrScaledCurveFontSelect;
import ifc2x3tc1.IfcCurveStyle;
import ifc2x3tc1.IfcSizeSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleImpl#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleImpl#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleImpl extends IfcPresentationStyleImpl implements IfcCurveStyle {
	/**
	 * The cached value of the '{@link #getCurveFont() <em>Curve Font</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFont()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveFontOrScaledCurveFontSelect curveFont;

	/**
	 * This is true if the Curve Font reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curveFontESet;

	/**
	 * The cached value of the '{@link #getCurveWidth() <em>Curve Width</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveWidth()
	 * @generated
	 * @ordered
	 */
	protected IfcSizeSelect curveWidth;

	/**
	 * This is true if the Curve Width reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curveWidthESet;

	/**
	 * The cached value of the '{@link #getCurveColour() <em>Curve Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveColour()
	 * @generated
	 * @ordered
	 */
	protected IfcColour curveColour;

	/**
	 * This is true if the Curve Colour reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean curveColourESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
		if (curveFont != null && curveFont.eIsProxy()) {
			InternalEObject oldCurveFont = (InternalEObject)curveFont;
			curveFont = (IfcCurveFontOrScaledCurveFontSelect)eResolveProxy(oldCurveFont);
			if (curveFont != oldCurveFont) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT, oldCurveFont, curveFont));
			}
		}
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveFontOrScaledCurveFontSelect basicGetCurveFont() {
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect newCurveFont) {
		IfcCurveFontOrScaledCurveFontSelect oldCurveFont = curveFont;
		curveFont = newCurveFont;
		boolean oldCurveFontESet = curveFontESet;
		curveFontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT, oldCurveFont, curveFont, !oldCurveFontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveFont() {
		IfcCurveFontOrScaledCurveFontSelect oldCurveFont = curveFont;
		boolean oldCurveFontESet = curveFontESet;
		curveFont = null;
		curveFontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT, oldCurveFont, null, oldCurveFontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveFont() {
		return curveFontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect getCurveWidth() {
		if (curveWidth != null && curveWidth.eIsProxy()) {
			InternalEObject oldCurveWidth = (InternalEObject)curveWidth;
			curveWidth = (IfcSizeSelect)eResolveProxy(oldCurveWidth);
			if (curveWidth != oldCurveWidth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH, oldCurveWidth, curveWidth));
			}
		}
		return curveWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSizeSelect basicGetCurveWidth() {
		return curveWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveWidth(IfcSizeSelect newCurveWidth) {
		IfcSizeSelect oldCurveWidth = curveWidth;
		curveWidth = newCurveWidth;
		boolean oldCurveWidthESet = curveWidthESet;
		curveWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH, oldCurveWidth, curveWidth, !oldCurveWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveWidth() {
		IfcSizeSelect oldCurveWidth = curveWidth;
		boolean oldCurveWidthESet = curveWidthESet;
		curveWidth = null;
		curveWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH, oldCurveWidth, null, oldCurveWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveWidth() {
		return curveWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour getCurveColour() {
		if (curveColour != null && curveColour.eIsProxy()) {
			InternalEObject oldCurveColour = (InternalEObject)curveColour;
			curveColour = (IfcColour)eResolveProxy(oldCurveColour);
			if (curveColour != oldCurveColour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR, oldCurveColour, curveColour));
			}
		}
		return curveColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColour basicGetCurveColour() {
		return curveColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveColour(IfcColour newCurveColour) {
		IfcColour oldCurveColour = curveColour;
		curveColour = newCurveColour;
		boolean oldCurveColourESet = curveColourESet;
		curveColourESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR, oldCurveColour, curveColour, !oldCurveColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCurveColour() {
		IfcColour oldCurveColour = curveColour;
		boolean oldCurveColourESet = curveColourESet;
		curveColour = null;
		curveColourESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR, oldCurveColour, null, oldCurveColourESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCurveColour() {
		return curveColourESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT:
				if (resolve) return getCurveFont();
				return basicGetCurveFont();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH:
				if (resolve) return getCurveWidth();
				return basicGetCurveWidth();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR:
				if (resolve) return getCurveColour();
				return basicGetCurveColour();
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT:
				setCurveFont((IfcCurveFontOrScaledCurveFontSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH:
				setCurveWidth((IfcSizeSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR:
				setCurveColour((IfcColour)newValue);
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT:
				unsetCurveFont();
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH:
				unsetCurveWidth();
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR:
				unsetCurveColour();
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_FONT:
				return isSetCurveFont();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_WIDTH:
				return isSetCurveWidth();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE__CURVE_COLOUR:
				return isSetCurveColour();
		}
		return super.eIsSet(featureID);
	}

} //IfcCurveStyleImpl
