/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDirection;
import ifc2x3tc1.IfcLightSourceSpot;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Spot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getConcentrationExponent <em>Concentration Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getConcentrationExponentAsString <em>Concentration Exponent As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getSpreadAngleAsString <em>Spread Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getBeamWidthAngle <em>Beam Width Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceSpotImpl#getBeamWidthAngleAsString <em>Beam Width Angle As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourceSpotImpl extends IfcLightSourcePositionalImpl implements IfcLightSourceSpot {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected IfcDirection orientation;

	/**
	 * The default value of the '{@link #getConcentrationExponent() <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponent()
	 * @generated
	 * @ordered
	 */
	protected static final double CONCENTRATION_EXPONENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConcentrationExponent() <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponent()
	 * @generated
	 * @ordered
	 */
	protected double concentrationExponent = CONCENTRATION_EXPONENT_EDEFAULT;

	/**
	 * This is true if the Concentration Exponent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concentrationExponentESet;

	/**
	 * The default value of the '{@link #getConcentrationExponentAsString() <em>Concentration Exponent As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCENTRATION_EXPONENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcentrationExponentAsString() <em>Concentration Exponent As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponentAsString()
	 * @generated
	 * @ordered
	 */
	protected String concentrationExponentAsString = CONCENTRATION_EXPONENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Concentration Exponent As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean concentrationExponentAsStringESet;

	/**
	 * The default value of the '{@link #getSpreadAngle() <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SPREAD_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpreadAngle() <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngle()
	 * @generated
	 * @ordered
	 */
	protected double spreadAngle = SPREAD_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpreadAngleAsString() <em>Spread Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SPREAD_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpreadAngleAsString() <em>Spread Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpreadAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String spreadAngleAsString = SPREAD_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeamWidthAngle() <em>Beam Width Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamWidthAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double BEAM_WIDTH_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBeamWidthAngle() <em>Beam Width Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamWidthAngle()
	 * @generated
	 * @ordered
	 */
	protected double beamWidthAngle = BEAM_WIDTH_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBeamWidthAngleAsString() <em>Beam Width Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamWidthAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAM_WIDTH_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeamWidthAngleAsString() <em>Beam Width Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeamWidthAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String beamWidthAngleAsString = BEAM_WIDTH_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceSpotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceSpot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection getOrientation() {
		if (orientation != null && orientation.eIsProxy()) {
			InternalEObject oldOrientation = (InternalEObject)orientation;
			orientation = (IfcDirection)eResolveProxy(oldOrientation);
			if (orientation != oldOrientation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, oldOrientation, orientation));
			}
		}
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDirection basicGetOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(IfcDirection newOrientation) {
		IfcDirection oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, oldOrientation, orientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConcentrationExponent() {
		return concentrationExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentrationExponent(double newConcentrationExponent) {
		double oldConcentrationExponent = concentrationExponent;
		concentrationExponent = newConcentrationExponent;
		boolean oldConcentrationExponentESet = concentrationExponentESet;
		concentrationExponentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT, oldConcentrationExponent, concentrationExponent, !oldConcentrationExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcentrationExponent() {
		double oldConcentrationExponent = concentrationExponent;
		boolean oldConcentrationExponentESet = concentrationExponentESet;
		concentrationExponent = CONCENTRATION_EXPONENT_EDEFAULT;
		concentrationExponentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT, oldConcentrationExponent, CONCENTRATION_EXPONENT_EDEFAULT, oldConcentrationExponentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcentrationExponent() {
		return concentrationExponentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcentrationExponentAsString() {
		return concentrationExponentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentrationExponentAsString(String newConcentrationExponentAsString) {
		String oldConcentrationExponentAsString = concentrationExponentAsString;
		concentrationExponentAsString = newConcentrationExponentAsString;
		boolean oldConcentrationExponentAsStringESet = concentrationExponentAsStringESet;
		concentrationExponentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING, oldConcentrationExponentAsString, concentrationExponentAsString, !oldConcentrationExponentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConcentrationExponentAsString() {
		String oldConcentrationExponentAsString = concentrationExponentAsString;
		boolean oldConcentrationExponentAsStringESet = concentrationExponentAsStringESet;
		concentrationExponentAsString = CONCENTRATION_EXPONENT_AS_STRING_EDEFAULT;
		concentrationExponentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING, oldConcentrationExponentAsString, CONCENTRATION_EXPONENT_AS_STRING_EDEFAULT, oldConcentrationExponentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConcentrationExponentAsString() {
		return concentrationExponentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpreadAngle() {
		return spreadAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadAngle(double newSpreadAngle) {
		double oldSpreadAngle = spreadAngle;
		spreadAngle = newSpreadAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE, oldSpreadAngle, spreadAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpreadAngleAsString() {
		return spreadAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpreadAngleAsString(String newSpreadAngleAsString) {
		String oldSpreadAngleAsString = spreadAngleAsString;
		spreadAngleAsString = newSpreadAngleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING, oldSpreadAngleAsString, spreadAngleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBeamWidthAngle() {
		return beamWidthAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeamWidthAngle(double newBeamWidthAngle) {
		double oldBeamWidthAngle = beamWidthAngle;
		beamWidthAngle = newBeamWidthAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE, oldBeamWidthAngle, beamWidthAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBeamWidthAngleAsString() {
		return beamWidthAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeamWidthAngleAsString(String newBeamWidthAngleAsString) {
		String oldBeamWidthAngleAsString = beamWidthAngleAsString;
		beamWidthAngleAsString = newBeamWidthAngleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING, oldBeamWidthAngleAsString, beamWidthAngleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				if (resolve) return getOrientation();
				return basicGetOrientation();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				return getConcentrationExponent();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING:
				return getConcentrationExponentAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				return getSpreadAngle();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING:
				return getSpreadAngleAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				return getBeamWidthAngle();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING:
				return getBeamWidthAngleAsString();
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				setOrientation((IfcDirection)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				setConcentrationExponent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING:
				setConcentrationExponentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				setSpreadAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING:
				setSpreadAngleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				setBeamWidthAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING:
				setBeamWidthAngleAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				setOrientation((IfcDirection)null);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				unsetConcentrationExponent();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING:
				unsetConcentrationExponentAsString();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				setSpreadAngle(SPREAD_ANGLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING:
				setSpreadAngleAsString(SPREAD_ANGLE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				setBeamWidthAngle(BEAM_WIDTH_ANGLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING:
				setBeamWidthAngleAsString(BEAM_WIDTH_ANGLE_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				return orientation != null;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				return isSetConcentrationExponent();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT_AS_STRING:
				return isSetConcentrationExponentAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				return spreadAngle != SPREAD_ANGLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE_AS_STRING:
				return SPREAD_ANGLE_AS_STRING_EDEFAULT == null ? spreadAngleAsString != null : !SPREAD_ANGLE_AS_STRING_EDEFAULT.equals(spreadAngleAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				return beamWidthAngle != BEAM_WIDTH_ANGLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE_AS_STRING:
				return BEAM_WIDTH_ANGLE_AS_STRING_EDEFAULT == null ? beamWidthAngleAsString != null : !BEAM_WIDTH_ANGLE_AS_STRING_EDEFAULT.equals(beamWidthAngleAsString);
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
		result.append(" (ConcentrationExponent: ");
		if (concentrationExponentESet) result.append(concentrationExponent); else result.append("<unset>");
		result.append(", ConcentrationExponentAsString: ");
		if (concentrationExponentAsStringESet) result.append(concentrationExponentAsString); else result.append("<unset>");
		result.append(", SpreadAngle: ");
		result.append(spreadAngle);
		result.append(", SpreadAngleAsString: ");
		result.append(spreadAngleAsString);
		result.append(", BeamWidthAngle: ");
		result.append(beamWidthAngle);
		result.append(", BeamWidthAngleAsString: ");
		result.append(beamWidthAngleAsString);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceSpotImpl
