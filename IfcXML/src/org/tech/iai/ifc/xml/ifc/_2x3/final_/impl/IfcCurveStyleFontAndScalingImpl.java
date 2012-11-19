/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontAndScaling;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font And Scaling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleFontAndScalingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleFontAndScalingImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleFontAndScalingImpl#getCurveFontScaling <em>Curve Font Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleFontAndScalingImpl extends EntityImpl implements IfcCurveStyleFontAndScaling {
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
	 * The cached value of the '{@link #getCurveFont() <em>Curve Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFont()
	 * @generated
	 * @ordered
	 */
	protected CurveFontType curveFont;

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
		return FinalPackage.eINSTANCE.getIfcCurveStyleFontAndScaling();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveFontType getCurveFont() {
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveFont(CurveFontType newCurveFont, NotificationChain msgs) {
		CurveFontType oldCurveFont = curveFont;
		curveFont = newCurveFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, oldCurveFont, newCurveFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(CurveFontType newCurveFont) {
		if (newCurveFont != curveFont) {
			NotificationChain msgs = null;
			if (curveFont != null)
				msgs = ((InternalEObject)curveFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, null, msgs);
			if (newCurveFont != null)
				msgs = ((InternalEObject)newCurveFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, null, msgs);
			msgs = basicSetCurveFont(newCurveFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT, newCurveFont, newCurveFont));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING, oldCurveFontScaling, curveFontScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				return basicSetCurveFont(null, msgs);
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				return getName();
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				return getCurveFont();
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				return getCurveFontScaling();
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				setName((String)newValue);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				setCurveFont((CurveFontType)newValue);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				setCurveFontScaling((Double)newValue);
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				setCurveFont((CurveFontType)null);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				setCurveFontScaling(CURVE_FONT_SCALING_EDEFAULT);
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT:
				return curveFont != null;
			case FinalPackage.IFC_CURVE_STYLE_FONT_AND_SCALING__CURVE_FONT_SCALING:
				return curveFontScaling != CURVE_FONT_SCALING_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", curveFontScaling: ");
		result.append(curveFontScaling);
		result.append(')');
		return result.toString();
	}

} //IfcCurveStyleFontAndScalingImpl
