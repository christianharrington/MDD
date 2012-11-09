/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCurveStyleFontPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontPatternImpl#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontPatternImpl#getVisibleSegmentLengthAsString <em>Visible Segment Length As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontPatternImpl#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCurveStyleFontPatternImpl#getInvisibleSegmentLengthAsString <em>Invisible Segment Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCurveStyleFontPatternImpl extends EObjectImpl implements IfcCurveStyleFontPattern {
	/**
	 * The default value of the '{@link #getVisibleSegmentLength() <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected static final double VISIBLE_SEGMENT_LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVisibleSegmentLength() <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLength()
	 * @generated
	 * @ordered
	 */
	protected double visibleSegmentLength = VISIBLE_SEGMENT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibleSegmentLengthAsString() <em>Visible Segment Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleSegmentLengthAsString() <em>Visible Segment Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleSegmentLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String visibleSegmentLengthAsString = VISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getInvisibleSegmentLengthAsString() <em>Invisible Segment Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvisibleSegmentLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INVISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvisibleSegmentLengthAsString() <em>Invisible Segment Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvisibleSegmentLengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String invisibleSegmentLengthAsString = INVISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcCurveStyleFontPattern();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVisibleSegmentLength() {
		return visibleSegmentLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleSegmentLength(double newVisibleSegmentLength) {
		double oldVisibleSegmentLength = visibleSegmentLength;
		visibleSegmentLength = newVisibleSegmentLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH, oldVisibleSegmentLength, visibleSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleSegmentLengthAsString() {
		return visibleSegmentLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleSegmentLengthAsString(String newVisibleSegmentLengthAsString) {
		String oldVisibleSegmentLengthAsString = visibleSegmentLengthAsString;
		visibleSegmentLengthAsString = newVisibleSegmentLengthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING, oldVisibleSegmentLengthAsString, visibleSegmentLengthAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH, oldInvisibleSegmentLength, invisibleSegmentLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvisibleSegmentLengthAsString() {
		return invisibleSegmentLengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvisibleSegmentLengthAsString(String newInvisibleSegmentLengthAsString) {
		String oldInvisibleSegmentLengthAsString = invisibleSegmentLengthAsString;
		invisibleSegmentLengthAsString = newInvisibleSegmentLengthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING, oldInvisibleSegmentLengthAsString, invisibleSegmentLengthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				return getVisibleSegmentLength();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING:
				return getVisibleSegmentLengthAsString();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				return getInvisibleSegmentLength();
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING:
				return getInvisibleSegmentLengthAsString();
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				setVisibleSegmentLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING:
				setVisibleSegmentLengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				setInvisibleSegmentLength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING:
				setInvisibleSegmentLengthAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				setVisibleSegmentLength(VISIBLE_SEGMENT_LENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING:
				setVisibleSegmentLengthAsString(VISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				setInvisibleSegmentLength(INVISIBLE_SEGMENT_LENGTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING:
				setInvisibleSegmentLengthAsString(INVISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH:
				return visibleSegmentLength != VISIBLE_SEGMENT_LENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__VISIBLE_SEGMENT_LENGTH_AS_STRING:
				return VISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT == null ? visibleSegmentLengthAsString != null : !VISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT.equals(visibleSegmentLengthAsString);
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH:
				return invisibleSegmentLength != INVISIBLE_SEGMENT_LENGTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CURVE_STYLE_FONT_PATTERN__INVISIBLE_SEGMENT_LENGTH_AS_STRING:
				return INVISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT == null ? invisibleSegmentLengthAsString != null : !INVISIBLE_SEGMENT_LENGTH_AS_STRING_EDEFAULT.equals(invisibleSegmentLengthAsString);
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
		result.append(" (VisibleSegmentLength: ");
		result.append(visibleSegmentLength);
		result.append(", VisibleSegmentLengthAsString: ");
		result.append(visibleSegmentLengthAsString);
		result.append(", InvisibleSegmentLength: ");
		result.append(invisibleSegmentLength);
		result.append(", InvisibleSegmentLengthAsString: ");
		result.append(invisibleSegmentLengthAsString);
		result.append(')');
		return result.toString();
	}

} //IfcCurveStyleFontPatternImpl
