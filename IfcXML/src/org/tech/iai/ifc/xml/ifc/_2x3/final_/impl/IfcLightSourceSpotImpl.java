/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceSpot;
import org.tech.iai.ifc.xml.ifc._2x3.final_.OrientationType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Spot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceSpotImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceSpotImpl#getConcentrationExponent <em>Concentration Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceSpotImpl#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceSpotImpl#getBeamWidthAngle <em>Beam Width Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourceSpotImpl extends IfcLightSourcePositionalImpl implements IfcLightSourceSpot {
	/**
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected OrientationType1 orientation;

	/**
	 * The default value of the '{@link #getConcentrationExponent() <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponent()
	 * @generated
	 * @ordered
	 */
	protected static final Double CONCENTRATION_EXPONENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConcentrationExponent() <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentrationExponent()
	 * @generated
	 * @ordered
	 */
	protected Double concentrationExponent = CONCENTRATION_EXPONENT_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcLightSourceSpot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrientationType1 getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(OrientationType1 newOrientation, NotificationChain msgs) {
		OrientationType1 oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(OrientationType1 newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getConcentrationExponent() {
		return concentrationExponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentrationExponent(Double newConcentrationExponent) {
		Double oldConcentrationExponent = concentrationExponent;
		concentrationExponent = newConcentrationExponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT, oldConcentrationExponent, concentrationExponent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE, oldSpreadAngle, spreadAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE, oldBeamWidthAngle, beamWidthAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				return basicSetOrientation(null, msgs);
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
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				return getOrientation();
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				return getConcentrationExponent();
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				return getSpreadAngle();
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				return getBeamWidthAngle();
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
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				setOrientation((OrientationType1)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				setConcentrationExponent((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				setSpreadAngle((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				setBeamWidthAngle((Double)newValue);
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
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				setOrientation((OrientationType1)null);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				setConcentrationExponent(CONCENTRATION_EXPONENT_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				setSpreadAngle(SPREAD_ANGLE_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				setBeamWidthAngle(BEAM_WIDTH_ANGLE_EDEFAULT);
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
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__ORIENTATION:
				return orientation != null;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__CONCENTRATION_EXPONENT:
				return CONCENTRATION_EXPONENT_EDEFAULT == null ? concentrationExponent != null : !CONCENTRATION_EXPONENT_EDEFAULT.equals(concentrationExponent);
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__SPREAD_ANGLE:
				return spreadAngle != SPREAD_ANGLE_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_SPOT__BEAM_WIDTH_ANGLE:
				return beamWidthAngle != BEAM_WIDTH_ANGLE_EDEFAULT;
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
		result.append(" (concentrationExponent: ");
		result.append(concentrationExponent);
		result.append(", spreadAngle: ");
		result.append(spreadAngle);
		result.append(", beamWidthAngle: ");
		result.append(beamWidthAngle);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceSpotImpl
