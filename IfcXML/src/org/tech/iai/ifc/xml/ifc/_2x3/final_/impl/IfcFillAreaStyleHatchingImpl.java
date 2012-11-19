/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.HatchLineAppearanceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PatternStartType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PointOfReferenceHatchLineType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.StartOfNextHatchLineType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleHatchingImpl#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleHatchingImpl#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleHatchingImpl#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFillAreaStyleHatchingImpl#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFillAreaStyleHatchingImpl extends IfcGeometricRepresentationItemImpl implements IfcFillAreaStyleHatching {
	/**
	 * The cached value of the '{@link #getHatchLineAppearance() <em>Hatch Line Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHatchLineAppearance()
	 * @generated
	 * @ordered
	 */
	protected HatchLineAppearanceType hatchLineAppearance;

	/**
	 * The cached value of the '{@link #getStartOfNextHatchLine() <em>Start Of Next Hatch Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartOfNextHatchLine()
	 * @generated
	 * @ordered
	 */
	protected StartOfNextHatchLineType startOfNextHatchLine;

	/**
	 * The cached value of the '{@link #getPointOfReferenceHatchLine() <em>Point Of Reference Hatch Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointOfReferenceHatchLine()
	 * @generated
	 * @ordered
	 */
	protected PointOfReferenceHatchLineType pointOfReferenceHatchLine;

	/**
	 * The cached value of the '{@link #getPatternStart() <em>Pattern Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternStart()
	 * @generated
	 * @ordered
	 */
	protected PatternStartType patternStart;

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
		return FinalPackage.eINSTANCE.getIfcFillAreaStyleHatching();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HatchLineAppearanceType getHatchLineAppearance() {
		return hatchLineAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHatchLineAppearance(HatchLineAppearanceType newHatchLineAppearance, NotificationChain msgs) {
		HatchLineAppearanceType oldHatchLineAppearance = hatchLineAppearance;
		hatchLineAppearance = newHatchLineAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, oldHatchLineAppearance, newHatchLineAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHatchLineAppearance(HatchLineAppearanceType newHatchLineAppearance) {
		if (newHatchLineAppearance != hatchLineAppearance) {
			NotificationChain msgs = null;
			if (hatchLineAppearance != null)
				msgs = ((InternalEObject)hatchLineAppearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, null, msgs);
			if (newHatchLineAppearance != null)
				msgs = ((InternalEObject)newHatchLineAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, null, msgs);
			msgs = basicSetHatchLineAppearance(newHatchLineAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE, newHatchLineAppearance, newHatchLineAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartOfNextHatchLineType getStartOfNextHatchLine() {
		return startOfNextHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartOfNextHatchLine(StartOfNextHatchLineType newStartOfNextHatchLine, NotificationChain msgs) {
		StartOfNextHatchLineType oldStartOfNextHatchLine = startOfNextHatchLine;
		startOfNextHatchLine = newStartOfNextHatchLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, oldStartOfNextHatchLine, newStartOfNextHatchLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartOfNextHatchLine(StartOfNextHatchLineType newStartOfNextHatchLine) {
		if (newStartOfNextHatchLine != startOfNextHatchLine) {
			NotificationChain msgs = null;
			if (startOfNextHatchLine != null)
				msgs = ((InternalEObject)startOfNextHatchLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, null, msgs);
			if (newStartOfNextHatchLine != null)
				msgs = ((InternalEObject)newStartOfNextHatchLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, null, msgs);
			msgs = basicSetStartOfNextHatchLine(newStartOfNextHatchLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE, newStartOfNextHatchLine, newStartOfNextHatchLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfReferenceHatchLineType getPointOfReferenceHatchLine() {
		return pointOfReferenceHatchLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfReferenceHatchLine(PointOfReferenceHatchLineType newPointOfReferenceHatchLine, NotificationChain msgs) {
		PointOfReferenceHatchLineType oldPointOfReferenceHatchLine = pointOfReferenceHatchLine;
		pointOfReferenceHatchLine = newPointOfReferenceHatchLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, oldPointOfReferenceHatchLine, newPointOfReferenceHatchLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfReferenceHatchLine(PointOfReferenceHatchLineType newPointOfReferenceHatchLine) {
		if (newPointOfReferenceHatchLine != pointOfReferenceHatchLine) {
			NotificationChain msgs = null;
			if (pointOfReferenceHatchLine != null)
				msgs = ((InternalEObject)pointOfReferenceHatchLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, null, msgs);
			if (newPointOfReferenceHatchLine != null)
				msgs = ((InternalEObject)newPointOfReferenceHatchLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, null, msgs);
			msgs = basicSetPointOfReferenceHatchLine(newPointOfReferenceHatchLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE, newPointOfReferenceHatchLine, newPointOfReferenceHatchLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternStartType getPatternStart() {
		return patternStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternStart(PatternStartType newPatternStart, NotificationChain msgs) {
		PatternStartType oldPatternStart = patternStart;
		patternStart = newPatternStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, oldPatternStart, newPatternStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternStart(PatternStartType newPatternStart) {
		if (newPatternStart != patternStart) {
			NotificationChain msgs = null;
			if (patternStart != null)
				msgs = ((InternalEObject)patternStart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, null, msgs);
			if (newPatternStart != null)
				msgs = ((InternalEObject)newPatternStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, null, msgs);
			msgs = basicSetPatternStart(newPatternStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START, newPatternStart, newPatternStart));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE, oldHatchLineAngle, hatchLineAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				return basicSetHatchLineAppearance(null, msgs);
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				return basicSetStartOfNextHatchLine(null, msgs);
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				return basicSetPointOfReferenceHatchLine(null, msgs);
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				return basicSetPatternStart(null, msgs);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				return getHatchLineAppearance();
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				return getStartOfNextHatchLine();
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				return getPointOfReferenceHatchLine();
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				return getPatternStart();
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				return getHatchLineAngle();
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
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				setHatchLineAppearance((HatchLineAppearanceType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				setStartOfNextHatchLine((StartOfNextHatchLineType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				setPointOfReferenceHatchLine((PointOfReferenceHatchLineType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				setPatternStart((PatternStartType)newValue);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				setHatchLineAngle((Double)newValue);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				setHatchLineAppearance((HatchLineAppearanceType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				setStartOfNextHatchLine((StartOfNextHatchLineType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				setPointOfReferenceHatchLine((PointOfReferenceHatchLineType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				setPatternStart((PatternStartType)null);
				return;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				setHatchLineAngle(HATCH_LINE_ANGLE_EDEFAULT);
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
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_APPEARANCE:
				return hatchLineAppearance != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__START_OF_NEXT_HATCH_LINE:
				return startOfNextHatchLine != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__POINT_OF_REFERENCE_HATCH_LINE:
				return pointOfReferenceHatchLine != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__PATTERN_START:
				return patternStart != null;
			case FinalPackage.IFC_FILL_AREA_STYLE_HATCHING__HATCH_LINE_ANGLE:
				return hatchLineAngle != HATCH_LINE_ANGLE_EDEFAULT;
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
		result.append(" (hatchLineAngle: ");
		result.append(hatchLineAngle);
		result.append(')');
		return result.toString();
	}

} //IfcFillAreaStyleHatchingImpl
