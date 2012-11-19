/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.ColourAppearanceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightEmissionSourceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LightDistributionDataSourceType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.PositionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightSourceGoniometricImpl#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourceGoniometricImpl extends IfcLightSourceImpl implements IfcLightSourceGoniometric {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected PositionType position;

	/**
	 * The cached value of the '{@link #getColourAppearance() <em>Colour Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourAppearance()
	 * @generated
	 * @ordered
	 */
	protected ColourAppearanceType colourAppearance;

	/**
	 * The default value of the '{@link #getColourTemperature() <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final double COLOUR_TEMPERATURE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getColourTemperature() <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperature()
	 * @generated
	 * @ordered
	 */
	protected double colourTemperature = COLOUR_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminousFlux() <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousFlux()
	 * @generated
	 * @ordered
	 */
	protected static final double LUMINOUS_FLUX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLuminousFlux() <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousFlux()
	 * @generated
	 * @ordered
	 */
	protected double luminousFlux = LUMINOUS_FLUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getLightEmissionSource() <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightEmissionSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLightEmissionSourceEnum LIGHT_EMISSION_SOURCE_EDEFAULT = IfcLightEmissionSourceEnum.COMPACTFLUORESCENT;

	/**
	 * The cached value of the '{@link #getLightEmissionSource() <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightEmissionSource()
	 * @generated
	 * @ordered
	 */
	protected IfcLightEmissionSourceEnum lightEmissionSource = LIGHT_EMISSION_SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLightDistributionDataSource() <em>Light Distribution Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightDistributionDataSource()
	 * @generated
	 * @ordered
	 */
	protected LightDistributionDataSourceType lightDistributionDataSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightSourceGoniometricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcLightSourceGoniometric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionType getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(PositionType newPosition, NotificationChain msgs) {
		PositionType oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, oldPosition, newPosition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(PositionType newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColourAppearanceType getColourAppearance() {
		return colourAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColourAppearance(ColourAppearanceType newColourAppearance, NotificationChain msgs) {
		ColourAppearanceType oldColourAppearance = colourAppearance;
		colourAppearance = newColourAppearance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, oldColourAppearance, newColourAppearance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourAppearance(ColourAppearanceType newColourAppearance) {
		if (newColourAppearance != colourAppearance) {
			NotificationChain msgs = null;
			if (colourAppearance != null)
				msgs = ((InternalEObject)colourAppearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, null, msgs);
			if (newColourAppearance != null)
				msgs = ((InternalEObject)newColourAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, null, msgs);
			msgs = basicSetColourAppearance(newColourAppearance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, newColourAppearance, newColourAppearance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getColourTemperature() {
		return colourTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourTemperature(double newColourTemperature) {
		double oldColourTemperature = colourTemperature;
		colourTemperature = newColourTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE, oldColourTemperature, colourTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLuminousFlux() {
		return luminousFlux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousFlux(double newLuminousFlux) {
		double oldLuminousFlux = luminousFlux;
		luminousFlux = newLuminousFlux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX, oldLuminousFlux, luminousFlux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightEmissionSourceEnum getLightEmissionSource() {
		return lightEmissionSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightEmissionSource(IfcLightEmissionSourceEnum newLightEmissionSource) {
		IfcLightEmissionSourceEnum oldLightEmissionSource = lightEmissionSource;
		lightEmissionSource = newLightEmissionSource == null ? LIGHT_EMISSION_SOURCE_EDEFAULT : newLightEmissionSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE, oldLightEmissionSource, lightEmissionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightDistributionDataSourceType getLightDistributionDataSource() {
		return lightDistributionDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLightDistributionDataSource(LightDistributionDataSourceType newLightDistributionDataSource, NotificationChain msgs) {
		LightDistributionDataSourceType oldLightDistributionDataSource = lightDistributionDataSource;
		lightDistributionDataSource = newLightDistributionDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, oldLightDistributionDataSource, newLightDistributionDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionDataSource(LightDistributionDataSourceType newLightDistributionDataSource) {
		if (newLightDistributionDataSource != lightDistributionDataSource) {
			NotificationChain msgs = null;
			if (lightDistributionDataSource != null)
				msgs = ((InternalEObject)lightDistributionDataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, null, msgs);
			if (newLightDistributionDataSource != null)
				msgs = ((InternalEObject)newLightDistributionDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, null, msgs);
			msgs = basicSetLightDistributionDataSource(newLightDistributionDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, newLightDistributionDataSource, newLightDistributionDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				return basicSetPosition(null, msgs);
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				return basicSetColourAppearance(null, msgs);
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				return basicSetLightDistributionDataSource(null, msgs);
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
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				return getPosition();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				return getColourAppearance();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				return getColourTemperature();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				return getLuminousFlux();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				return getLightEmissionSource();
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				return getLightDistributionDataSource();
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
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				setPosition((PositionType)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				setColourAppearance((ColourAppearanceType)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				setColourTemperature((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				setLuminousFlux((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				setLightEmissionSource((IfcLightEmissionSourceEnum)newValue);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				setLightDistributionDataSource((LightDistributionDataSourceType)newValue);
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
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				setPosition((PositionType)null);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				setColourAppearance((ColourAppearanceType)null);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				setColourTemperature(COLOUR_TEMPERATURE_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				setLuminousFlux(LUMINOUS_FLUX_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				setLightEmissionSource(LIGHT_EMISSION_SOURCE_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				setLightDistributionDataSource((LightDistributionDataSourceType)null);
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
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				return position != null;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				return colourAppearance != null;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				return colourTemperature != COLOUR_TEMPERATURE_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				return luminousFlux != LUMINOUS_FLUX_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				return lightEmissionSource != LIGHT_EMISSION_SOURCE_EDEFAULT;
			case FinalPackage.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				return lightDistributionDataSource != null;
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
		result.append(" (colourTemperature: ");
		result.append(colourTemperature);
		result.append(", luminousFlux: ");
		result.append(luminousFlux);
		result.append(", lightEmissionSource: ");
		result.append(lightEmissionSource);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceGoniometricImpl
