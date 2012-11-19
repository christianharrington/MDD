/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HatchLineAppearanceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hatch Line Appearance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.HatchLineAppearanceTypeImpl#getIfcCurveStyle <em>Ifc Curve Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HatchLineAppearanceTypeImpl extends EObjectImpl implements HatchLineAppearanceType {
	/**
	 * The cached value of the '{@link #getIfcCurveStyle() <em>Ifc Curve Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfcCurveStyle()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyle ifcCurveStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HatchLineAppearanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getHatchLineAppearanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle getIfcCurveStyle() {
		return ifcCurveStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfcCurveStyle(IfcCurveStyle newIfcCurveStyle, NotificationChain msgs) {
		IfcCurveStyle oldIfcCurveStyle = ifcCurveStyle;
		ifcCurveStyle = newIfcCurveStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE, oldIfcCurveStyle, newIfcCurveStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfcCurveStyle(IfcCurveStyle newIfcCurveStyle) {
		if (newIfcCurveStyle != ifcCurveStyle) {
			NotificationChain msgs = null;
			if (ifcCurveStyle != null)
				msgs = ((InternalEObject)ifcCurveStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE, null, msgs);
			if (newIfcCurveStyle != null)
				msgs = ((InternalEObject)newIfcCurveStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE, null, msgs);
			msgs = basicSetIfcCurveStyle(newIfcCurveStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE, newIfcCurveStyle, newIfcCurveStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE:
				return basicSetIfcCurveStyle(null, msgs);
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
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE:
				return getIfcCurveStyle();
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
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE:
				setIfcCurveStyle((IfcCurveStyle)newValue);
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
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE:
				setIfcCurveStyle((IfcCurveStyle)null);
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
			case FinalPackage.HATCH_LINE_APPEARANCE_TYPE__IFC_CURVE_STYLE:
				return ifcCurveStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //HatchLineAppearanceTypeImpl
