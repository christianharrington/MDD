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

import org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFont;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedCurveFont;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Font Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CurveFontTypeImpl#getIfcPreDefinedCurveFontGroup <em>Ifc Pre Defined Curve Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CurveFontTypeImpl#getIfcPreDefinedCurveFont <em>Ifc Pre Defined Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.CurveFontTypeImpl#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CurveFontTypeImpl extends EObjectImpl implements CurveFontType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveFontTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getCurveFontType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getIfcPreDefinedCurveFontGroup() {
		if (ifcPreDefinedCurveFontGroup == null) {
			ifcPreDefinedCurveFontGroup = new BasicFeatureMap(this, FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP);
		}
		return ifcPreDefinedCurveFontGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreDefinedCurveFont getIfcPreDefinedCurveFont() {
		return (IfcPreDefinedCurveFont)getIfcPreDefinedCurveFontGroup().get(FinalPackage.eINSTANCE.getCurveFontType_IfcPreDefinedCurveFont(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcPreDefinedCurveFont(IfcPreDefinedCurveFont newIfcPreDefinedCurveFont, NotificationChain msgs) {
		return ((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).basicAdd(FinalPackage.eINSTANCE.getCurveFontType_IfcPreDefinedCurveFont(), newIfcPreDefinedCurveFont, msgs);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT, oldIfcCurveStyleFont, newIfcCurveStyleFont);
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
				msgs = ((InternalEObject)ifcCurveStyleFont).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT, null, msgs);
			if (newIfcCurveStyleFont != null)
				msgs = ((InternalEObject)newIfcCurveStyleFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT, null, msgs);
			msgs = basicSetIfcCurveStyleFont(newIfcCurveStyleFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT, newIfcCurveStyleFont, newIfcCurveStyleFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				return ((InternalEList<?>)getIfcPreDefinedCurveFontGroup()).basicRemove(otherEnd, msgs);
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT:
				return basicSetIfcPreDefinedCurveFont(null, msgs);
			case FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT:
				return basicSetIfcCurveStyleFont(null, msgs);
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
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				if (coreType) return getIfcPreDefinedCurveFontGroup();
				return ((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).getWrapper();
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT:
				return getIfcPreDefinedCurveFont();
			case FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT:
				return getIfcCurveStyleFont();
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
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				((FeatureMap.Internal)getIfcPreDefinedCurveFontGroup()).set(newValue);
				return;
			case FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT:
				setIfcCurveStyleFont((IfcCurveStyleFont)newValue);
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
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				getIfcPreDefinedCurveFontGroup().clear();
				return;
			case FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT:
				setIfcCurveStyleFont((IfcCurveStyleFont)null);
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
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT_GROUP:
				return ifcPreDefinedCurveFontGroup != null && !ifcPreDefinedCurveFontGroup.isEmpty();
			case FinalPackage.CURVE_FONT_TYPE__IFC_PRE_DEFINED_CURVE_FONT:
				return getIfcPreDefinedCurveFont() != null;
			case FinalPackage.CURVE_FONT_TYPE__IFC_CURVE_STYLE_FONT:
				return ifcCurveStyleFont != null;
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

} //CurveFontTypeImpl
