/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleFontPatternImpl#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCurveStyleFontPatternImpl#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleFontPatternImpl extends EntityImpl implements IfcCurveStyleFontPattern {
	/**
	 * The default value of the '{@link #getVisibleSegmentLength() <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double VISIBLE_SEGMENT_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleSegmentLength() <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected Double visibleSegmentLength = VISIBLE_SEGMENT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvisibleSegmentLength() <em>Invisible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final double INVISIBLE_SEGMENT_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInvisibleSegmentLength() <em>Invisible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected double invisibleSegmentLength = INVISIBLE_SEGMENT_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCurveStyleFontPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcCurveStyleFontPattern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getVisibleSegmentLength() {
		return visibleSegmentLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleSegmentLength(Double newVisibleSegmentLength) {
		Double oldVisibleSegmentLength = visibleSegmentLength;
		visibleSegmentLength = newVisibleSegmentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH, oldVisibleSegmentLength, visibleSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInvisibleSegmentLength() {
		return invisibleSegmentLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisibleSegmentLength(double newInvisibleSegmentLength) {
		double oldInvisibleSegmentLength = invisibleSegmentLength;
		invisibleSegmentLength = newInvisibleSegmentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH, oldInvisibleSegmentLength, invisibleSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				return getVisibleSegmentLength();
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				return getInvisibleSegmentLength();
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				setVisibleSegmentLength((Double)newValue);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				setInvisibleSegmentLength((Double)newValue);
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				setVisibleSegmentLength(VISIBLE_SEGMENT_LENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				setInvisibleSegmentLength(INVISIBLE_SEGMENT_LENGTH_EDEFAULT);
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
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				return VISIBLE_SEGMENT_LENGTH_EDEFAULT == null ? visibleSegmentLength != null : !VISIBLE_SEGMENT_LENGTH_EDEFAULT.equals(visibleSegmentLength);
			case FinalPackage.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				return invisibleSegmentLength != INVISIBLE_SEGMENT_LENGTH_EDEFAULT;
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
		result.append(" (visibleSegmentLength: ");
		result.append(visibleSegmentLength);
		result.append(", invisibleSegmentLength: ");
		result.append(invisibleSegmentLength);
		result.append(')');
		return result.toString();
	}

} //IfcCurveStyleFontPatternImpl
