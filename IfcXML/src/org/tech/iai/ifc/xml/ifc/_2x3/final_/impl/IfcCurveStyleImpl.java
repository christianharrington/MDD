/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveColourType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType1;
import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveWidthType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleImpl#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleImpl#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleImpl#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleImpl extends IfcPresentationStyleImpl implements IfcCurveStyle {
	/**
	 * The cached value of the '{@link #getCurveFont() <em>Curve Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveFont()
	 * @generated
	 * @ordered
	 */
	protected CurveFontType1 curveFont;

	/**
	 * The cached value of the '{@link #getCurveWidth() <em>Curve Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveWidth()
	 * @generated
	 * @ordered
	 */
	protected CurveWidthType curveWidth;

	/**
	 * The cached value of the '{@link #getCurveColour() <em>Curve Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveColour()
	 * @generated
	 * @ordered
	 */
	protected CurveColourType curveColour;

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
		return FinalPackage.eINSTANCE.getIfcCurveStyle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveFontType1 getCurveFont() {
		return curveFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveFont(CurveFontType1 newCurveFont, NotificationChain msgs) {
		CurveFontType1 oldCurveFont = curveFont;
		curveFont = newCurveFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_FONT, oldCurveFont, newCurveFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveFont(CurveFontType1 newCurveFont) {
		if (newCurveFont != curveFont) {
			NotificationChain msgs = null;
			if (curveFont != null)
				msgs = ((InternalEObject)curveFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_FONT, null, msgs);
			if (newCurveFont != null)
				msgs = ((InternalEObject)newCurveFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_FONT, null, msgs);
			msgs = basicSetCurveFont(newCurveFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_FONT, newCurveFont, newCurveFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveWidthType getCurveWidth() {
		return curveWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveWidth(CurveWidthType newCurveWidth, NotificationChain msgs) {
		CurveWidthType oldCurveWidth = curveWidth;
		curveWidth = newCurveWidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH, oldCurveWidth, newCurveWidth);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveWidth(CurveWidthType newCurveWidth) {
		if (newCurveWidth != curveWidth) {
			NotificationChain msgs = null;
			if (curveWidth != null)
				msgs = ((InternalEObject)curveWidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH, null, msgs);
			if (newCurveWidth != null)
				msgs = ((InternalEObject)newCurveWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH, null, msgs);
			msgs = basicSetCurveWidth(newCurveWidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH, newCurveWidth, newCurveWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveColourType getCurveColour() {
		return curveColour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurveColour(CurveColourType newCurveColour, NotificationChain msgs) {
		CurveColourType oldCurveColour = curveColour;
		curveColour = newCurveColour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR, oldCurveColour, newCurveColour);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurveColour(CurveColourType newCurveColour) {
		if (newCurveColour != curveColour) {
			NotificationChain msgs = null;
			if (curveColour != null)
				msgs = ((InternalEObject)curveColour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR, null, msgs);
			if (newCurveColour != null)
				msgs = ((InternalEObject)newCurveColour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR, null, msgs);
			msgs = basicSetCurveColour(newCurveColour, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR, newCurveColour, newCurveColour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_STYLE__CURVE_FONT:
				return basicSetCurveFont(null, msgs);
			case FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH:
				return basicSetCurveWidth(null, msgs);
			case FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR:
				return basicSetCurveColour(null, msgs);
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
			case FinalPackage.IFC_CURVE_STYLE__CURVE_FONT:
				return getCurveFont();
			case FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH:
				return getCurveWidth();
			case FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR:
				return getCurveColour();
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
			case FinalPackage.IFC_CURVE_STYLE__CURVE_FONT:
				setCurveFont((CurveFontType1)newValue);
				return;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH:
				setCurveWidth((CurveWidthType)newValue);
				return;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR:
				setCurveColour((CurveColourType)newValue);
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
			case FinalPackage.IFC_CURVE_STYLE__CURVE_FONT:
				setCurveFont((CurveFontType1)null);
				return;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH:
				setCurveWidth((CurveWidthType)null);
				return;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR:
				setCurveColour((CurveColourType)null);
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
			case FinalPackage.IFC_CURVE_STYLE__CURVE_FONT:
				return curveFont != null;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_WIDTH:
				return curveWidth != null;
			case FinalPackage.IFC_CURVE_STYLE__CURVE_COLOUR:
				return curveColour != null;
		}
		return super.eIsSet(featureID);
	}

} //IfcCurveStyleImpl
