/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCartesianPoint;
import ifc2x3tc1.IfcCurveStyle;
import ifc2x3tc1.IfcFillAreaStyleHatching;
import ifc2x3tc1.IfcHatchLineDistanceSelect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAngleAsString <em>Hatch Line Angle As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleHatchingImpl extends IfcGeometricRepresentationItemImpl implements IfcFillAreaStyleHatching {
	/**
	 * The cached value of the '{@link #getHatchLineAppearance() <em>Hatch Line Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAppearance()
	 * @generated
	 * @ordered
	 */
	protected IfcCurveStyle hatchLineAppearance;

	/**
	 * The cached value of the '{@link #getStartOfNextHatchLine() <em>Start Of Next Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfNextHatchLine()
	 * @generated
	 * @ordered
	 */
	protected IfcHatchLineDistanceSelect startOfNextHatchLine;

	/**
	 * The cached value of the '{@link #getPointOfReferenceHatchLine() <em>Point Of Reference Hatch Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfReferenceHatchLine()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint pointOfReferenceHatchLine;

	/**
	 * This is true if the Point Of Reference Hatch Line reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pointOfReferenceHatchLineESet;

	/**
	 * The cached value of the '{@link #getPatternStart() <em>Pattern Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternStart()
	 * @generated
	 * @ordered
	 */
	protected IfcCartesianPoint patternStart;

	/**
	 * This is true if the Pattern Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean patternStartESet;

	/**
	 * The default value of the '{@link #getHatchLineAngle() <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double HATCH_LINE_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHatchLineAngle() <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAngle()
	 * @generated
	 * @ordered
	 */
	protected double hatchLineAngle = HATCH_LINE_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHatchLineAngleAsString() <em>Hatch Line Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HATCH_LINE_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHatchLineAngleAsString() <em>Hatch Line Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String hatchLineAngleAsString = HATCH_LINE_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFillAreaStyleHatchingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcFillAreaStyleHatching();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle getHatchLineAppearance() {
		if (hatchLineAppearance != null && hatchLineAppearance.eIsProxy()) {
			InternalEObject oldHatchLineAppearance = (InternalEObject)hatchLineAppearance;
			hatchLineAppearance = (IfcCurveStyle)eResolveProxy(oldHatchLineAppearance);
			if (hatchLineAppearance != oldHatchLineAppearance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, oldHatchLineAppearance, hatchLineAppearance));
			}
		}
		return hatchLineAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurveStyle basicGetHatchLineAppearance() {
		return hatchLineAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAppearance(IfcCurveStyle newHatchLineAppearance) {
		IfcCurveStyle oldHatchLineAppearance = hatchLineAppearance;
		hatchLineAppearance = newHatchLineAppearance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, oldHatchLineAppearance, hatchLineAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
		if (startOfNextHatchLine != null && startOfNextHatchLine.eIsProxy()) {
			InternalEObject oldStartOfNextHatchLine = (InternalEObject)startOfNextHatchLine;
			startOfNextHatchLine = (IfcHatchLineDistanceSelect)eResolveProxy(oldStartOfNextHatchLine);
			if (startOfNextHatchLine != oldStartOfNextHatchLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, oldStartOfNextHatchLine, startOfNextHatchLine));
			}
		}
		return startOfNextHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcHatchLineDistanceSelect basicGetStartOfNextHatchLine() {
		return startOfNextHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect newStartOfNextHatchLine) {
		IfcHatchLineDistanceSelect oldStartOfNextHatchLine = startOfNextHatchLine;
		startOfNextHatchLine = newStartOfNextHatchLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, oldStartOfNextHatchLine, startOfNextHatchLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPointOfReferenceHatchLine() {
		if (pointOfReferenceHatchLine != null && pointOfReferenceHatchLine.eIsProxy()) {
			InternalEObject oldPointOfReferenceHatchLine = (InternalEObject)pointOfReferenceHatchLine;
			pointOfReferenceHatchLine = (IfcCartesianPoint)eResolveProxy(oldPointOfReferenceHatchLine);
			if (pointOfReferenceHatchLine != oldPointOfReferenceHatchLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, oldPointOfReferenceHatchLine, pointOfReferenceHatchLine));
			}
		}
		return pointOfReferenceHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetPointOfReferenceHatchLine() {
		return pointOfReferenceHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfReferenceHatchLine(IfcCartesianPoint newPointOfReferenceHatchLine) {
		IfcCartesianPoint oldPointOfReferenceHatchLine = pointOfReferenceHatchLine;
		pointOfReferenceHatchLine = newPointOfReferenceHatchLine;
		boolean oldPointOfReferenceHatchLineESet = pointOfReferenceHatchLineESet;
		pointOfReferenceHatchLineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, oldPointOfReferenceHatchLine, pointOfReferenceHatchLine, !oldPointOfReferenceHatchLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPointOfReferenceHatchLine() {
		IfcCartesianPoint oldPointOfReferenceHatchLine = pointOfReferenceHatchLine;
		boolean oldPointOfReferenceHatchLineESet = pointOfReferenceHatchLineESet;
		pointOfReferenceHatchLine = null;
		pointOfReferenceHatchLineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, oldPointOfReferenceHatchLine, null, oldPointOfReferenceHatchLineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPointOfReferenceHatchLine() {
		return pointOfReferenceHatchLineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint getPatternStart() {
		if (patternStart != null && patternStart.eIsProxy()) {
			InternalEObject oldPatternStart = (InternalEObject)patternStart;
			patternStart = (IfcCartesianPoint)eResolveProxy(oldPatternStart);
			if (patternStart != oldPatternStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, oldPatternStart, patternStart));
			}
		}
		return patternStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCartesianPoint basicGetPatternStart() {
		return patternStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternStart(IfcCartesianPoint newPatternStart) {
		IfcCartesianPoint oldPatternStart = patternStart;
		patternStart = newPatternStart;
		boolean oldPatternStartESet = patternStartESet;
		patternStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, oldPatternStart, patternStart, !oldPatternStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPatternStart() {
		IfcCartesianPoint oldPatternStart = patternStart;
		boolean oldPatternStartESet = patternStartESet;
		patternStart = null;
		patternStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, oldPatternStart, null, oldPatternStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPatternStart() {
		return patternStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHatchLineAngle() {
		return hatchLineAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAngle(double newHatchLineAngle) {
		double oldHatchLineAngle = hatchLineAngle;
		hatchLineAngle = newHatchLineAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE, oldHatchLineAngle, hatchLineAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHatchLineAngleAsString() {
		return hatchLineAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAngleAsString(String newHatchLineAngleAsString) {
		String oldHatchLineAngleAsString = hatchLineAngleAsString;
		hatchLineAngleAsString = newHatchLineAngleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING, oldHatchLineAngleAsString, hatchLineAngleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				if (resolve) return getHatchLineAppearance();
				return basicGetHatchLineAppearance();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				if (resolve) return getStartOfNextHatchLine();
				return basicGetStartOfNextHatchLine();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				if (resolve) return getPointOfReferenceHatchLine();
				return basicGetPointOfReferenceHatchLine();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				if (resolve) return getPatternStart();
				return basicGetPatternStart();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				return getHatchLineAngle();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING:
				return getHatchLineAngleAsString();
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				setHatchLineAppearance((IfcCurveStyle)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				setStartOfNextHatchLine((IfcHatchLineDistanceSelect)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				setPointOfReferenceHatchLine((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				setPatternStart((IfcCartesianPoint)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				setHatchLineAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING:
				setHatchLineAngleAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				setHatchLineAppearance((IfcCurveStyle)null);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				setStartOfNextHatchLine((IfcHatchLineDistanceSelect)null);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				unsetPointOfReferenceHatchLine();
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				unsetPatternStart();
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				setHatchLineAngle(HATCH_LINE_ANGLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING:
				setHatchLineAngleAsString(HATCH_LINE_ANGLE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				return hatchLineAppearance != null;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				return startOfNextHatchLine != null;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				return isSetPointOfReferenceHatchLine();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				return isSetPatternStart();
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				return hatchLineAngle != HATCH_LINE_ANGLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE_AS_STRING:
				return HATCH_LINE_ANGLE_AS_STRING_EDEFAULT == null ? hatchLineAngleAsString != null : !HATCH_LINE_ANGLE_AS_STRING_EDEFAULT.equals(hatchLineAngleAsString);
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
		result.append(" (HatchLineAngle: ");
		result.append(hatchLineAngle);
		result.append(", HatchLineAngleAsString: ");
		result.append(hatchLineAngleAsString);
		result.append(')');
		return result.toString();
	}

} //IfcFillAreaStyleHatchingImpl
