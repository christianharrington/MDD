/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFont;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontAndScaling;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedCurveFont;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Font Or Scaled Curve Font Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveFontOrScaledCurveFontSelectImpl#getIfcPreDefinedCurveFontGroup <em>Ifc Pre Defined Curve Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveFontOrScaledCurveFontSelectImpl#getIfcPreDefinedCurveFont <em>Ifc Pre Defined Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveFontOrScaledCurveFontSelectImpl#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveFontOrScaledCurveFontSelectImpl#getIfcCurveStyleFontAndScaling <em>Ifc Curve Style Font And Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveFontOrScaledCurveFontSelectImpl extends EObjectImpl implements IfcCurveFontOrScaledCurveFontSelect {
	/**
	 * The cached value of the '{@link #getIfcPreDefinedCurveFontGroup() <em>Ifc Pre Defined Curve Font Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcPreDefinedCurveFontGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap ifcPreDefinedCurveFontGroup;

	/**
	 * The cached value of the '{@link #getIfcCurveStyleFont() <em>Ifc Curve Style Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveStyleFont()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyleFont ifcCurveStyleFont;

	/**
	 * The cached value of the '{@link #getIfcCurveStyleFontAndScaling() <em>Ifc Curve Style Font And Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveStyleFontAndScaling()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyleFontAndScaling ifcCurveStyleFontAndScaling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveFontOrScaledCurveFontSelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCurveFontOrScaledCurveFontSelect();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedCurveFontGroup() {
		if (ifcPreDefinedCurveFontGroup == null) {
			ifcPreDefinedCurveFontGroup = new BasicFeatureMap(this, FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP);
		}
		return ifcPreDefinedCurveFontGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedCurveFont getIfcPreDefinedCurveFont() {
		return (IfcPreDefinedCurveFont)getIfcPreDefinedCurveFontGroup().get(FinalPackage.eINSTANCE.getIfcCurveFontOrScaledCurveFontSelect_IfcPreDefinedCurveFont(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedCurveFont(IfcPreDefinedCurveFont newIfcPreDefinedCurveFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).basicAdd(FinalPackage.eINSTANCE.getIfcCurveFontOrScaledCurveFontSelect_IfcPreDefinedCurveFont(), newIfcPreDefinedCurveFont, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFont getIfcCurveStyleFont() {
		return ifcCurveStyleFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurveStyleFont(IfcCurveStyleFont newIfcCurveStyleFont, NotificationChain msgs) {
		IfcCurveStyleFont oldIfcCurveStyleFont = ifcCurveStyleFont;
		ifcCurveStyleFont = newIfcCurveStyleFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT, oldIfcCurveStyleFont, newIfcCurveStyleFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurveStyleFont(IfcCurveStyleFont newIfcCurveStyleFont) {
		if (newIfcCurveStyleFont != ifcCurveStyleFont) {
			NotificationChain msgs = null;
			if (ifcCurveStyleFont != null)
				msgs = ((InternalEObject)ifcCurveStyleFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT, null, msgs);
			if (newIfcCurveStyleFont != null)
				msgs = ((InternalEObject)newIfcCurveStyleFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT, null, msgs);
			msgs = basicSetIfcCurveStyleFont(newIfcCurveStyleFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT, newIfcCurveStyleFont, newIfcCurveStyleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyleFontAndScaling getIfcCurveStyleFontAndScaling() {
		return ifcCurveStyleFontAndScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling newIfcCurveStyleFontAndScaling, NotificationChain msgs) {
		IfcCurveStyleFontAndScaling oldIfcCurveStyleFontAndScaling = ifcCurveStyleFontAndScaling;
		ifcCurveStyleFontAndScaling = newIfcCurveStyleFontAndScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING, oldIfcCurveStyleFontAndScaling, newIfcCurveStyleFontAndScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling newIfcCurveStyleFontAndScaling) {
		if (newIfcCurveStyleFontAndScaling != ifcCurveStyleFontAndScaling) {
			NotificationChain msgs = null;
			if (ifcCurveStyleFontAndScaling != null)
				msgs = ((InternalEObject)ifcCurveStyleFontAndScaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING, null, msgs);
			if (newIfcCurveStyleFontAndScaling != null)
				msgs = ((InternalEObject)newIfcCurveStyleFontAndScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING, null, msgs);
			msgs = basicSetIfcCurveStyleFontAndScaling(newIfcCurveStyleFontAndScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING, newIfcCurveStyleFontAndScaling, newIfcCurveStyleFontAndScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedCurveFontGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT:
				return basicSetIfcPreDefinedCurveFont(null, msgs);
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT:
				return basicSetIfcCurveStyleFont(null, msgs);
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING:
				return basicSetIfcCurveStyleFontAndScaling(null, msgs);
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
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				if (coreType) return getIfcPreDefinedCurveFontGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).getWrapper();
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT:
				return getIfcPreDefinedCurveFont();
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT:
				return getIfcCurveStyleFont();
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING:
				return getIfcCurveStyleFontAndScaling();
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
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).set(newValue);
				return;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT:
				setIfcCurveStyleFont((IfcCurveStyleFont)newValue);
				return;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING:
				setIfcCurveStyleFontAndScaling((IfcCurveStyleFontAndScaling)newValue);
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
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				getIfcPreDefinedCurveFontGroup().clear();
				return;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT:
				setIfcCurveStyleFont((IfcCurveStyleFont)null);
				return;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING:
				setIfcCurveStyleFontAndScaling((IfcCurveStyleFontAndScaling)null);
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
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				return ifcPreDefinedCurveFontGroup != null && !ifcPreDefinedCurveFontGroup.isEmpty();
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_PRE_DEFINED_CURVE_FONT:
				return getIfcPreDefinedCurveFont() != null;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT:
				return ifcCurveStyleFont != null;
			case FinalPackage.IFC_CURVE_FONT_OR_SCALED_CURVE_FONT_SELECT__IFC_CURVE_STYLE_FONT_AND_SCALING:
				return ifcCurveStyleFontAndScaling != null;
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
		result.append(" (ifcPreDefinedCurveFontGroup: ");
		result.append(ifcPreDefinedCurveFontGroup);
		result.append(')');
		return result.toString();
	}

} //IfcCurveFontOrScaledCurveFontSelectImpl
