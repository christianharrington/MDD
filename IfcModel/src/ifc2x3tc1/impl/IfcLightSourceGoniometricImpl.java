/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAxis2Placement3D;
import ifc2x3tc1.IfcColourRgb;
import ifc2x3tc1.IfcLightDistributionDataSourceSelect;
import ifc2x3tc1.IfcLightEmissionSourceEnum;
import ifc2x3tc1.IfcLightSourceGoniometric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getColourTemperatureAsString <em>Colour Temperature As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getLuminousFluxAsString <em>Luminous Flux As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightSourceGoniometricImpl#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightSourceGoniometricImpl extends IfcLightSourceImpl implements IfcLightSourceGoniometric {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected IfcAxis2Placement3D position;

	/**
	 * The cached value of the '{@link #getColourAppearance() <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourAppearance()
	 * @generated
	 * @ordered
	 */
	protected IfcColourRgb colourAppearance;

	/**
	 * This is true if the Colour Appearance reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colourAppearanceESet;

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
	 * The default value of the '{@link #getColourTemperatureAsString() <em>Colour Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperatureAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOUR_TEMPERATURE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColourTemperatureAsString() <em>Colour Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColourTemperatureAsString()
	 * @generated
	 * @ordered
	 */
	protected String colourTemperatureAsString = COLOUR_TEMPERATURE_AS_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getLuminousFluxAsString() <em>Luminous Flux As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousFluxAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LUMINOUS_FLUX_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLuminousFluxAsString() <em>Luminous Flux As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousFluxAsString()
	 * @generated
	 * @ordered
	 */
	protected String luminousFluxAsString = LUMINOUS_FLUX_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getLightEmissionSource() <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightEmissionSource()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLightEmissionSourceEnum LIGHT_EMISSION_SOURCE_EDEFAULT = IfcLightEmissionSourceEnum.NULL;

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
	 * The cached value of the '{@link #getLightDistributionDataSource() <em>Light Distribution Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightDistributionDataSource()
	 * @generated
	 * @ordered
	 */
	protected IfcLightDistributionDataSourceSelect lightDistributionDataSource;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightSourceGoniometric();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D getPosition() {
		if (position != null && position.eIsProxy()) {
			InternalEObject oldPosition = (InternalEObject)position;
			position = (IfcAxis2Placement3D)eResolveProxy(oldPosition);
			if (position != oldPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, oldPosition, position));
			}
		}
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAxis2Placement3D basicGetPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(IfcAxis2Placement3D newPosition) {
		IfcAxis2Placement3D oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb getColourAppearance() {
		if (colourAppearance != null && colourAppearance.eIsProxy()) {
			InternalEObject oldColourAppearance = (InternalEObject)colourAppearance;
			colourAppearance = (IfcColourRgb)eResolveProxy(oldColourAppearance);
			if (colourAppearance != oldColourAppearance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, oldColourAppearance, colourAppearance));
			}
		}
		return colourAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcColourRgb basicGetColourAppearance() {
		return colourAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourAppearance(IfcColourRgb newColourAppearance) {
		IfcColourRgb oldColourAppearance = colourAppearance;
		colourAppearance = newColourAppearance;
		boolean oldColourAppearanceESet = colourAppearanceESet;
		colourAppearanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, oldColourAppearance, colourAppearance, !oldColourAppearanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColourAppearance() {
		IfcColourRgb oldColourAppearance = colourAppearance;
		boolean oldColourAppearanceESet = colourAppearanceESet;
		colourAppearance = null;
		colourAppearanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE, oldColourAppearance, null, oldColourAppearanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColourAppearance() {
		return colourAppearanceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE, oldColourTemperature, colourTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColourTemperatureAsString() {
		return colourTemperatureAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColourTemperatureAsString(String newColourTemperatureAsString) {
		String oldColourTemperatureAsString = colourTemperatureAsString;
		colourTemperatureAsString = newColourTemperatureAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING, oldColourTemperatureAsString, colourTemperatureAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX, oldLuminousFlux, luminousFlux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLuminousFluxAsString() {
		return luminousFluxAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousFluxAsString(String newLuminousFluxAsString) {
		String oldLuminousFluxAsString = luminousFluxAsString;
		luminousFluxAsString = newLuminousFluxAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING, oldLuminousFluxAsString, luminousFluxAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE, oldLightEmissionSource, lightEmissionSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionDataSourceSelect getLightDistributionDataSource() {
		if (lightDistributionDataSource != null && lightDistributionDataSource.eIsProxy()) {
			InternalEObject oldLightDistributionDataSource = (InternalEObject)lightDistributionDataSource;
			lightDistributionDataSource = (IfcLightDistributionDataSourceSelect)eResolveProxy(oldLightDistributionDataSource);
			if (lightDistributionDataSource != oldLightDistributionDataSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, oldLightDistributionDataSource, lightDistributionDataSource));
			}
		}
		return lightDistributionDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionDataSourceSelect basicGetLightDistributionDataSource() {
		return lightDistributionDataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect newLightDistributionDataSource) {
		IfcLightDistributionDataSourceSelect oldLightDistributionDataSource = lightDistributionDataSource;
		lightDistributionDataSource = newLightDistributionDataSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE, oldLightDistributionDataSource, lightDistributionDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				if (resolve) return getPosition();
				return basicGetPosition();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				if (resolve) return getColourAppearance();
				return basicGetColourAppearance();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				return getColourTemperature();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING:
				return getColourTemperatureAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				return getLuminousFlux();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING:
				return getLuminousFluxAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				return getLightEmissionSource();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				if (resolve) return getLightDistributionDataSource();
				return basicGetLightDistributionDataSource();
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				setPosition((IfcAxis2Placement3D)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				setColourAppearance((IfcColourRgb)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				setColourTemperature((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING:
				setColourTemperatureAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				setLuminousFlux((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING:
				setLuminousFluxAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				setLightEmissionSource((IfcLightEmissionSourceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				setLightDistributionDataSource((IfcLightDistributionDataSourceSelect)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				setPosition((IfcAxis2Placement3D)null);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				unsetColourAppearance();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				setColourTemperature(COLOUR_TEMPERATURE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING:
				setColourTemperatureAsString(COLOUR_TEMPERATURE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				setLuminousFlux(LUMINOUS_FLUX_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING:
				setLuminousFluxAsString(LUMINOUS_FLUX_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				setLightEmissionSource(LIGHT_EMISSION_SOURCE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
				setLightDistributionDataSource((IfcLightDistributionDataSourceSelect)null);
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
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__POSITION:
				return position != null;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_APPEARANCE:
				return isSetColourAppearance();
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE:
				return colourTemperature != COLOUR_TEMPERATURE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__COLOUR_TEMPERATURE_AS_STRING:
				return COLOUR_TEMPERATURE_AS_STRING_EDEFAULT == null ? colourTemperatureAsString != null : !COLOUR_TEMPERATURE_AS_STRING_EDEFAULT.equals(colourTemperatureAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX:
				return luminousFlux != LUMINOUS_FLUX_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LUMINOUS_FLUX_AS_STRING:
				return LUMINOUS_FLUX_AS_STRING_EDEFAULT == null ? luminousFluxAsString != null : !LUMINOUS_FLUX_AS_STRING_EDEFAULT.equals(luminousFluxAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_EMISSION_SOURCE:
				return lightEmissionSource != LIGHT_EMISSION_SOURCE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_SOURCE_GONIOMETRIC__LIGHT_DISTRIBUTION_DATA_SOURCE:
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
		result.append(" (ColourTemperature: ");
		result.append(colourTemperature);
		result.append(", ColourTemperatureAsString: ");
		result.append(colourTemperatureAsString);
		result.append(", LuminousFlux: ");
		result.append(luminousFlux);
		result.append(", LuminousFluxAsString: ");
		result.append(luminousFluxAsString);
		result.append(", LightEmissionSource: ");
		result.append(lightEmissionSource);
		result.append(')');
		return result.toString();
	}

} //IfcLightSourceGoniometricImpl
