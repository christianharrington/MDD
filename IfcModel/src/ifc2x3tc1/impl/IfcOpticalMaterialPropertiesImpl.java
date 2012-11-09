/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcOpticalMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Optical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittance <em>Visible Transmittance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleTransmittanceAsString <em>Visible Transmittance As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittance <em>Solar Transmittance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarTransmittanceAsString <em>Solar Transmittance As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittance <em>Thermal Ir Transmittance</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrTransmittanceAsString <em>Thermal Ir Transmittance As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBack <em>Thermal Ir Emissivity Back</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityBackAsString <em>Thermal Ir Emissivity Back As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFront <em>Thermal Ir Emissivity Front</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getThermalIrEmissivityFrontAsString <em>Thermal Ir Emissivity Front As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBack <em>Visible Reflectance Back</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceBackAsString <em>Visible Reflectance Back As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFront <em>Visible Reflectance Front</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getVisibleReflectanceFrontAsString <em>Visible Reflectance Front As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFront <em>Solar Reflectance Front</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceFrontAsString <em>Solar Reflectance Front As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBack <em>Solar Reflectance Back</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcOpticalMaterialPropertiesImpl#getSolarReflectanceBackAsString <em>Solar Reflectance Back As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcOpticalMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcOpticalMaterialProperties {
	/**
	 * The default value of the '{@link #getVisibleTransmittance() <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final double VISIBLE_TRANSMITTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVisibleTransmittance() <em>Visible Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittance()
	 * @generated
	 * @ordered
	 */
	protected double visibleTransmittance = VISIBLE_TRANSMITTANCE_EDEFAULT;

	/**
	 * This is true if the Visible Transmittance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleTransmittanceESet;

	/**
	 * The default value of the '{@link #getVisibleTransmittanceAsString() <em>Visible Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_TRANSMITTANCE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleTransmittanceAsString() <em>Visible Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected String visibleTransmittanceAsString = VISIBLE_TRANSMITTANCE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Visible Transmittance As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleTransmittanceAsStringESet;

	/**
	 * The default value of the '{@link #getSolarTransmittance() <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final double SOLAR_TRANSMITTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSolarTransmittance() <em>Solar Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittance()
	 * @generated
	 * @ordered
	 */
	protected double solarTransmittance = SOLAR_TRANSMITTANCE_EDEFAULT;

	/**
	 * This is true if the Solar Transmittance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarTransmittanceESet;

	/**
	 * The default value of the '{@link #getSolarTransmittanceAsString() <em>Solar Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_TRANSMITTANCE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarTransmittanceAsString() <em>Solar Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected String solarTransmittanceAsString = SOLAR_TRANSMITTANCE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Solar Transmittance As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarTransmittanceAsStringESet;

	/**
	 * The default value of the '{@link #getThermalIrTransmittance() <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittance()
	 * @generated
	 * @ordered
	 */
	protected static final double THERMAL_IR_TRANSMITTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThermalIrTransmittance() <em>Thermal Ir Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittance()
	 * @generated
	 * @ordered
	 */
	protected double thermalIrTransmittance = THERMAL_IR_TRANSMITTANCE_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Transmittance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrTransmittanceESet;

	/**
	 * The default value of the '{@link #getThermalIrTransmittanceAsString() <em>Thermal Ir Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_IR_TRANSMITTANCE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrTransmittanceAsString() <em>Thermal Ir Transmittance As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrTransmittanceAsString()
	 * @generated
	 * @ordered
	 */
	protected String thermalIrTransmittanceAsString = THERMAL_IR_TRANSMITTANCE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Transmittance As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrTransmittanceAsStringESet;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityBack() <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 * @ordered
	 */
	protected static final double THERMAL_IR_EMISSIVITY_BACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityBack() <em>Thermal Ir Emissivity Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBack()
	 * @generated
	 * @ordered
	 */
	protected double thermalIrEmissivityBack = THERMAL_IR_EMISSIVITY_BACK_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Emissivity Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrEmissivityBackESet;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityBackAsString() <em>Thermal Ir Emissivity Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBackAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_IR_EMISSIVITY_BACK_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityBackAsString() <em>Thermal Ir Emissivity Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityBackAsString()
	 * @generated
	 * @ordered
	 */
	protected String thermalIrEmissivityBackAsString = THERMAL_IR_EMISSIVITY_BACK_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Emissivity Back As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrEmissivityBackAsStringESet;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityFront() <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 * @ordered
	 */
	protected static final double THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityFront() <em>Thermal Ir Emissivity Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFront()
	 * @generated
	 * @ordered
	 */
	protected double thermalIrEmissivityFront = THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Emissivity Front attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrEmissivityFrontESet;

	/**
	 * The default value of the '{@link #getThermalIrEmissivityFrontAsString() <em>Thermal Ir Emissivity Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THERMAL_IR_EMISSIVITY_FRONT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThermalIrEmissivityFrontAsString() <em>Thermal Ir Emissivity Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermalIrEmissivityFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected String thermalIrEmissivityFrontAsString = THERMAL_IR_EMISSIVITY_FRONT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thermal Ir Emissivity Front As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thermalIrEmissivityFrontAsStringESet;

	/**
	 * The default value of the '{@link #getVisibleReflectanceBack() <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected static final double VISIBLE_REFLECTANCE_BACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceBack() <em>Visible Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected double visibleReflectanceBack = VISIBLE_REFLECTANCE_BACK_EDEFAULT;

	/**
	 * This is true if the Visible Reflectance Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleReflectanceBackESet;

	/**
	 * The default value of the '{@link #getVisibleReflectanceBackAsString() <em>Visible Reflectance Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBackAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_REFLECTANCE_BACK_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceBackAsString() <em>Visible Reflectance Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceBackAsString()
	 * @generated
	 * @ordered
	 */
	protected String visibleReflectanceBackAsString = VISIBLE_REFLECTANCE_BACK_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Visible Reflectance Back As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleReflectanceBackAsStringESet;

	/**
	 * The default value of the '{@link #getVisibleReflectanceFront() <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected static final double VISIBLE_REFLECTANCE_FRONT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceFront() <em>Visible Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected double visibleReflectanceFront = VISIBLE_REFLECTANCE_FRONT_EDEFAULT;

	/**
	 * This is true if the Visible Reflectance Front attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleReflectanceFrontESet;

	/**
	 * The default value of the '{@link #getVisibleReflectanceFrontAsString() <em>Visible Reflectance Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBLE_REFLECTANCE_FRONT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibleReflectanceFrontAsString() <em>Visible Reflectance Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleReflectanceFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected String visibleReflectanceFrontAsString = VISIBLE_REFLECTANCE_FRONT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Visible Reflectance Front As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleReflectanceFrontAsStringESet;

	/**
	 * The default value of the '{@link #getSolarReflectanceFront() <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected static final double SOLAR_REFLECTANCE_FRONT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSolarReflectanceFront() <em>Solar Reflectance Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFront()
	 * @generated
	 * @ordered
	 */
	protected double solarReflectanceFront = SOLAR_REFLECTANCE_FRONT_EDEFAULT;

	/**
	 * This is true if the Solar Reflectance Front attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarReflectanceFrontESet;

	/**
	 * The default value of the '{@link #getSolarReflectanceFrontAsString() <em>Solar Reflectance Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_REFLECTANCE_FRONT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarReflectanceFrontAsString() <em>Solar Reflectance Front As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceFrontAsString()
	 * @generated
	 * @ordered
	 */
	protected String solarReflectanceFrontAsString = SOLAR_REFLECTANCE_FRONT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Solar Reflectance Front As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarReflectanceFrontAsStringESet;

	/**
	 * The default value of the '{@link #getSolarReflectanceBack() <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected static final double SOLAR_REFLECTANCE_BACK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSolarReflectanceBack() <em>Solar Reflectance Back</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBack()
	 * @generated
	 * @ordered
	 */
	protected double solarReflectanceBack = SOLAR_REFLECTANCE_BACK_EDEFAULT;

	/**
	 * This is true if the Solar Reflectance Back attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarReflectanceBackESet;

	/**
	 * The default value of the '{@link #getSolarReflectanceBackAsString() <em>Solar Reflectance Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBackAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLAR_REFLECTANCE_BACK_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarReflectanceBackAsString() <em>Solar Reflectance Back As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarReflectanceBackAsString()
	 * @generated
	 * @ordered
	 */
	protected String solarReflectanceBackAsString = SOLAR_REFLECTANCE_BACK_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Solar Reflectance Back As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean solarReflectanceBackAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcOpticalMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcOpticalMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVisibleTransmittance() {
		return visibleTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittance(double newVisibleTransmittance) {
		double oldVisibleTransmittance = visibleTransmittance;
		visibleTransmittance = newVisibleTransmittance;
		boolean oldVisibleTransmittanceESet = visibleTransmittanceESet;
		visibleTransmittanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE, oldVisibleTransmittance, visibleTransmittance, !oldVisibleTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleTransmittance() {
		double oldVisibleTransmittance = visibleTransmittance;
		boolean oldVisibleTransmittanceESet = visibleTransmittanceESet;
		visibleTransmittance = VISIBLE_TRANSMITTANCE_EDEFAULT;
		visibleTransmittanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE, oldVisibleTransmittance, VISIBLE_TRANSMITTANCE_EDEFAULT, oldVisibleTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleTransmittance() {
		return visibleTransmittanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleTransmittanceAsString() {
		return visibleTransmittanceAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleTransmittanceAsString(String newVisibleTransmittanceAsString) {
		String oldVisibleTransmittanceAsString = visibleTransmittanceAsString;
		visibleTransmittanceAsString = newVisibleTransmittanceAsString;
		boolean oldVisibleTransmittanceAsStringESet = visibleTransmittanceAsStringESet;
		visibleTransmittanceAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING, oldVisibleTransmittanceAsString, visibleTransmittanceAsString, !oldVisibleTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleTransmittanceAsString() {
		String oldVisibleTransmittanceAsString = visibleTransmittanceAsString;
		boolean oldVisibleTransmittanceAsStringESet = visibleTransmittanceAsStringESet;
		visibleTransmittanceAsString = VISIBLE_TRANSMITTANCE_AS_STRING_EDEFAULT;
		visibleTransmittanceAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING, oldVisibleTransmittanceAsString, VISIBLE_TRANSMITTANCE_AS_STRING_EDEFAULT, oldVisibleTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleTransmittanceAsString() {
		return visibleTransmittanceAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSolarTransmittance() {
		return solarTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittance(double newSolarTransmittance) {
		double oldSolarTransmittance = solarTransmittance;
		solarTransmittance = newSolarTransmittance;
		boolean oldSolarTransmittanceESet = solarTransmittanceESet;
		solarTransmittanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE, oldSolarTransmittance, solarTransmittance, !oldSolarTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarTransmittance() {
		double oldSolarTransmittance = solarTransmittance;
		boolean oldSolarTransmittanceESet = solarTransmittanceESet;
		solarTransmittance = SOLAR_TRANSMITTANCE_EDEFAULT;
		solarTransmittanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE, oldSolarTransmittance, SOLAR_TRANSMITTANCE_EDEFAULT, oldSolarTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarTransmittance() {
		return solarTransmittanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarTransmittanceAsString() {
		return solarTransmittanceAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarTransmittanceAsString(String newSolarTransmittanceAsString) {
		String oldSolarTransmittanceAsString = solarTransmittanceAsString;
		solarTransmittanceAsString = newSolarTransmittanceAsString;
		boolean oldSolarTransmittanceAsStringESet = solarTransmittanceAsStringESet;
		solarTransmittanceAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING, oldSolarTransmittanceAsString, solarTransmittanceAsString, !oldSolarTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarTransmittanceAsString() {
		String oldSolarTransmittanceAsString = solarTransmittanceAsString;
		boolean oldSolarTransmittanceAsStringESet = solarTransmittanceAsStringESet;
		solarTransmittanceAsString = SOLAR_TRANSMITTANCE_AS_STRING_EDEFAULT;
		solarTransmittanceAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING, oldSolarTransmittanceAsString, SOLAR_TRANSMITTANCE_AS_STRING_EDEFAULT, oldSolarTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarTransmittanceAsString() {
		return solarTransmittanceAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThermalIrTransmittance() {
		return thermalIrTransmittance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittance(double newThermalIrTransmittance) {
		double oldThermalIrTransmittance = thermalIrTransmittance;
		thermalIrTransmittance = newThermalIrTransmittance;
		boolean oldThermalIrTransmittanceESet = thermalIrTransmittanceESet;
		thermalIrTransmittanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE, oldThermalIrTransmittance, thermalIrTransmittance, !oldThermalIrTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrTransmittance() {
		double oldThermalIrTransmittance = thermalIrTransmittance;
		boolean oldThermalIrTransmittanceESet = thermalIrTransmittanceESet;
		thermalIrTransmittance = THERMAL_IR_TRANSMITTANCE_EDEFAULT;
		thermalIrTransmittanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE, oldThermalIrTransmittance, THERMAL_IR_TRANSMITTANCE_EDEFAULT, oldThermalIrTransmittanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrTransmittance() {
		return thermalIrTransmittanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrTransmittanceAsString() {
		return thermalIrTransmittanceAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrTransmittanceAsString(String newThermalIrTransmittanceAsString) {
		String oldThermalIrTransmittanceAsString = thermalIrTransmittanceAsString;
		thermalIrTransmittanceAsString = newThermalIrTransmittanceAsString;
		boolean oldThermalIrTransmittanceAsStringESet = thermalIrTransmittanceAsStringESet;
		thermalIrTransmittanceAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING, oldThermalIrTransmittanceAsString, thermalIrTransmittanceAsString, !oldThermalIrTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrTransmittanceAsString() {
		String oldThermalIrTransmittanceAsString = thermalIrTransmittanceAsString;
		boolean oldThermalIrTransmittanceAsStringESet = thermalIrTransmittanceAsStringESet;
		thermalIrTransmittanceAsString = THERMAL_IR_TRANSMITTANCE_AS_STRING_EDEFAULT;
		thermalIrTransmittanceAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING, oldThermalIrTransmittanceAsString, THERMAL_IR_TRANSMITTANCE_AS_STRING_EDEFAULT, oldThermalIrTransmittanceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrTransmittanceAsString() {
		return thermalIrTransmittanceAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThermalIrEmissivityBack() {
		return thermalIrEmissivityBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBack(double newThermalIrEmissivityBack) {
		double oldThermalIrEmissivityBack = thermalIrEmissivityBack;
		thermalIrEmissivityBack = newThermalIrEmissivityBack;
		boolean oldThermalIrEmissivityBackESet = thermalIrEmissivityBackESet;
		thermalIrEmissivityBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK, oldThermalIrEmissivityBack, thermalIrEmissivityBack, !oldThermalIrEmissivityBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityBack() {
		double oldThermalIrEmissivityBack = thermalIrEmissivityBack;
		boolean oldThermalIrEmissivityBackESet = thermalIrEmissivityBackESet;
		thermalIrEmissivityBack = THERMAL_IR_EMISSIVITY_BACK_EDEFAULT;
		thermalIrEmissivityBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK, oldThermalIrEmissivityBack, THERMAL_IR_EMISSIVITY_BACK_EDEFAULT, oldThermalIrEmissivityBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityBack() {
		return thermalIrEmissivityBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrEmissivityBackAsString() {
		return thermalIrEmissivityBackAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityBackAsString(String newThermalIrEmissivityBackAsString) {
		String oldThermalIrEmissivityBackAsString = thermalIrEmissivityBackAsString;
		thermalIrEmissivityBackAsString = newThermalIrEmissivityBackAsString;
		boolean oldThermalIrEmissivityBackAsStringESet = thermalIrEmissivityBackAsStringESet;
		thermalIrEmissivityBackAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING, oldThermalIrEmissivityBackAsString, thermalIrEmissivityBackAsString, !oldThermalIrEmissivityBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityBackAsString() {
		String oldThermalIrEmissivityBackAsString = thermalIrEmissivityBackAsString;
		boolean oldThermalIrEmissivityBackAsStringESet = thermalIrEmissivityBackAsStringESet;
		thermalIrEmissivityBackAsString = THERMAL_IR_EMISSIVITY_BACK_AS_STRING_EDEFAULT;
		thermalIrEmissivityBackAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING, oldThermalIrEmissivityBackAsString, THERMAL_IR_EMISSIVITY_BACK_AS_STRING_EDEFAULT, oldThermalIrEmissivityBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityBackAsString() {
		return thermalIrEmissivityBackAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThermalIrEmissivityFront() {
		return thermalIrEmissivityFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFront(double newThermalIrEmissivityFront) {
		double oldThermalIrEmissivityFront = thermalIrEmissivityFront;
		thermalIrEmissivityFront = newThermalIrEmissivityFront;
		boolean oldThermalIrEmissivityFrontESet = thermalIrEmissivityFrontESet;
		thermalIrEmissivityFrontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT, oldThermalIrEmissivityFront, thermalIrEmissivityFront, !oldThermalIrEmissivityFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityFront() {
		double oldThermalIrEmissivityFront = thermalIrEmissivityFront;
		boolean oldThermalIrEmissivityFrontESet = thermalIrEmissivityFrontESet;
		thermalIrEmissivityFront = THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT;
		thermalIrEmissivityFrontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT, oldThermalIrEmissivityFront, THERMAL_IR_EMISSIVITY_FRONT_EDEFAULT, oldThermalIrEmissivityFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityFront() {
		return thermalIrEmissivityFrontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThermalIrEmissivityFrontAsString() {
		return thermalIrEmissivityFrontAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThermalIrEmissivityFrontAsString(String newThermalIrEmissivityFrontAsString) {
		String oldThermalIrEmissivityFrontAsString = thermalIrEmissivityFrontAsString;
		thermalIrEmissivityFrontAsString = newThermalIrEmissivityFrontAsString;
		boolean oldThermalIrEmissivityFrontAsStringESet = thermalIrEmissivityFrontAsStringESet;
		thermalIrEmissivityFrontAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING, oldThermalIrEmissivityFrontAsString, thermalIrEmissivityFrontAsString, !oldThermalIrEmissivityFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThermalIrEmissivityFrontAsString() {
		String oldThermalIrEmissivityFrontAsString = thermalIrEmissivityFrontAsString;
		boolean oldThermalIrEmissivityFrontAsStringESet = thermalIrEmissivityFrontAsStringESet;
		thermalIrEmissivityFrontAsString = THERMAL_IR_EMISSIVITY_FRONT_AS_STRING_EDEFAULT;
		thermalIrEmissivityFrontAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING, oldThermalIrEmissivityFrontAsString, THERMAL_IR_EMISSIVITY_FRONT_AS_STRING_EDEFAULT, oldThermalIrEmissivityFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThermalIrEmissivityFrontAsString() {
		return thermalIrEmissivityFrontAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVisibleReflectanceBack() {
		return visibleReflectanceBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBack(double newVisibleReflectanceBack) {
		double oldVisibleReflectanceBack = visibleReflectanceBack;
		visibleReflectanceBack = newVisibleReflectanceBack;
		boolean oldVisibleReflectanceBackESet = visibleReflectanceBackESet;
		visibleReflectanceBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK, oldVisibleReflectanceBack, visibleReflectanceBack, !oldVisibleReflectanceBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceBack() {
		double oldVisibleReflectanceBack = visibleReflectanceBack;
		boolean oldVisibleReflectanceBackESet = visibleReflectanceBackESet;
		visibleReflectanceBack = VISIBLE_REFLECTANCE_BACK_EDEFAULT;
		visibleReflectanceBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK, oldVisibleReflectanceBack, VISIBLE_REFLECTANCE_BACK_EDEFAULT, oldVisibleReflectanceBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceBack() {
		return visibleReflectanceBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleReflectanceBackAsString() {
		return visibleReflectanceBackAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceBackAsString(String newVisibleReflectanceBackAsString) {
		String oldVisibleReflectanceBackAsString = visibleReflectanceBackAsString;
		visibleReflectanceBackAsString = newVisibleReflectanceBackAsString;
		boolean oldVisibleReflectanceBackAsStringESet = visibleReflectanceBackAsStringESet;
		visibleReflectanceBackAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING, oldVisibleReflectanceBackAsString, visibleReflectanceBackAsString, !oldVisibleReflectanceBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceBackAsString() {
		String oldVisibleReflectanceBackAsString = visibleReflectanceBackAsString;
		boolean oldVisibleReflectanceBackAsStringESet = visibleReflectanceBackAsStringESet;
		visibleReflectanceBackAsString = VISIBLE_REFLECTANCE_BACK_AS_STRING_EDEFAULT;
		visibleReflectanceBackAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING, oldVisibleReflectanceBackAsString, VISIBLE_REFLECTANCE_BACK_AS_STRING_EDEFAULT, oldVisibleReflectanceBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceBackAsString() {
		return visibleReflectanceBackAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVisibleReflectanceFront() {
		return visibleReflectanceFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFront(double newVisibleReflectanceFront) {
		double oldVisibleReflectanceFront = visibleReflectanceFront;
		visibleReflectanceFront = newVisibleReflectanceFront;
		boolean oldVisibleReflectanceFrontESet = visibleReflectanceFrontESet;
		visibleReflectanceFrontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT, oldVisibleReflectanceFront, visibleReflectanceFront, !oldVisibleReflectanceFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceFront() {
		double oldVisibleReflectanceFront = visibleReflectanceFront;
		boolean oldVisibleReflectanceFrontESet = visibleReflectanceFrontESet;
		visibleReflectanceFront = VISIBLE_REFLECTANCE_FRONT_EDEFAULT;
		visibleReflectanceFrontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT, oldVisibleReflectanceFront, VISIBLE_REFLECTANCE_FRONT_EDEFAULT, oldVisibleReflectanceFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceFront() {
		return visibleReflectanceFrontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisibleReflectanceFrontAsString() {
		return visibleReflectanceFrontAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibleReflectanceFrontAsString(String newVisibleReflectanceFrontAsString) {
		String oldVisibleReflectanceFrontAsString = visibleReflectanceFrontAsString;
		visibleReflectanceFrontAsString = newVisibleReflectanceFrontAsString;
		boolean oldVisibleReflectanceFrontAsStringESet = visibleReflectanceFrontAsStringESet;
		visibleReflectanceFrontAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING, oldVisibleReflectanceFrontAsString, visibleReflectanceFrontAsString, !oldVisibleReflectanceFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisibleReflectanceFrontAsString() {
		String oldVisibleReflectanceFrontAsString = visibleReflectanceFrontAsString;
		boolean oldVisibleReflectanceFrontAsStringESet = visibleReflectanceFrontAsStringESet;
		visibleReflectanceFrontAsString = VISIBLE_REFLECTANCE_FRONT_AS_STRING_EDEFAULT;
		visibleReflectanceFrontAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING, oldVisibleReflectanceFrontAsString, VISIBLE_REFLECTANCE_FRONT_AS_STRING_EDEFAULT, oldVisibleReflectanceFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisibleReflectanceFrontAsString() {
		return visibleReflectanceFrontAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSolarReflectanceFront() {
		return solarReflectanceFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFront(double newSolarReflectanceFront) {
		double oldSolarReflectanceFront = solarReflectanceFront;
		solarReflectanceFront = newSolarReflectanceFront;
		boolean oldSolarReflectanceFrontESet = solarReflectanceFrontESet;
		solarReflectanceFrontESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT, oldSolarReflectanceFront, solarReflectanceFront, !oldSolarReflectanceFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceFront() {
		double oldSolarReflectanceFront = solarReflectanceFront;
		boolean oldSolarReflectanceFrontESet = solarReflectanceFrontESet;
		solarReflectanceFront = SOLAR_REFLECTANCE_FRONT_EDEFAULT;
		solarReflectanceFrontESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT, oldSolarReflectanceFront, SOLAR_REFLECTANCE_FRONT_EDEFAULT, oldSolarReflectanceFrontESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceFront() {
		return solarReflectanceFrontESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarReflectanceFrontAsString() {
		return solarReflectanceFrontAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceFrontAsString(String newSolarReflectanceFrontAsString) {
		String oldSolarReflectanceFrontAsString = solarReflectanceFrontAsString;
		solarReflectanceFrontAsString = newSolarReflectanceFrontAsString;
		boolean oldSolarReflectanceFrontAsStringESet = solarReflectanceFrontAsStringESet;
		solarReflectanceFrontAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING, oldSolarReflectanceFrontAsString, solarReflectanceFrontAsString, !oldSolarReflectanceFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceFrontAsString() {
		String oldSolarReflectanceFrontAsString = solarReflectanceFrontAsString;
		boolean oldSolarReflectanceFrontAsStringESet = solarReflectanceFrontAsStringESet;
		solarReflectanceFrontAsString = SOLAR_REFLECTANCE_FRONT_AS_STRING_EDEFAULT;
		solarReflectanceFrontAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING, oldSolarReflectanceFrontAsString, SOLAR_REFLECTANCE_FRONT_AS_STRING_EDEFAULT, oldSolarReflectanceFrontAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceFrontAsString() {
		return solarReflectanceFrontAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSolarReflectanceBack() {
		return solarReflectanceBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBack(double newSolarReflectanceBack) {
		double oldSolarReflectanceBack = solarReflectanceBack;
		solarReflectanceBack = newSolarReflectanceBack;
		boolean oldSolarReflectanceBackESet = solarReflectanceBackESet;
		solarReflectanceBackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK, oldSolarReflectanceBack, solarReflectanceBack, !oldSolarReflectanceBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceBack() {
		double oldSolarReflectanceBack = solarReflectanceBack;
		boolean oldSolarReflectanceBackESet = solarReflectanceBackESet;
		solarReflectanceBack = SOLAR_REFLECTANCE_BACK_EDEFAULT;
		solarReflectanceBackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK, oldSolarReflectanceBack, SOLAR_REFLECTANCE_BACK_EDEFAULT, oldSolarReflectanceBackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceBack() {
		return solarReflectanceBackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarReflectanceBackAsString() {
		return solarReflectanceBackAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarReflectanceBackAsString(String newSolarReflectanceBackAsString) {
		String oldSolarReflectanceBackAsString = solarReflectanceBackAsString;
		solarReflectanceBackAsString = newSolarReflectanceBackAsString;
		boolean oldSolarReflectanceBackAsStringESet = solarReflectanceBackAsStringESet;
		solarReflectanceBackAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING, oldSolarReflectanceBackAsString, solarReflectanceBackAsString, !oldSolarReflectanceBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSolarReflectanceBackAsString() {
		String oldSolarReflectanceBackAsString = solarReflectanceBackAsString;
		boolean oldSolarReflectanceBackAsStringESet = solarReflectanceBackAsStringESet;
		solarReflectanceBackAsString = SOLAR_REFLECTANCE_BACK_AS_STRING_EDEFAULT;
		solarReflectanceBackAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING, oldSolarReflectanceBackAsString, SOLAR_REFLECTANCE_BACK_AS_STRING_EDEFAULT, oldSolarReflectanceBackAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSolarReflectanceBackAsString() {
		return solarReflectanceBackAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				return getVisibleTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING:
				return getVisibleTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				return getSolarTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING:
				return getSolarTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				return getThermalIrTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING:
				return getThermalIrTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				return getThermalIrEmissivityBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING:
				return getThermalIrEmissivityBackAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				return getThermalIrEmissivityFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING:
				return getThermalIrEmissivityFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				return getVisibleReflectanceBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING:
				return getVisibleReflectanceBackAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				return getVisibleReflectanceFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING:
				return getVisibleReflectanceFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				return getSolarReflectanceFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING:
				return getSolarReflectanceFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				return getSolarReflectanceBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING:
				return getSolarReflectanceBackAsString();
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
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				setVisibleTransmittance((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING:
				setVisibleTransmittanceAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				setSolarTransmittance((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING:
				setSolarTransmittanceAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				setThermalIrTransmittance((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING:
				setThermalIrTransmittanceAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				setThermalIrEmissivityBack((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING:
				setThermalIrEmissivityBackAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				setThermalIrEmissivityFront((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING:
				setThermalIrEmissivityFrontAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				setVisibleReflectanceBack((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING:
				setVisibleReflectanceBackAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				setVisibleReflectanceFront((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING:
				setVisibleReflectanceFrontAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				setSolarReflectanceFront((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING:
				setSolarReflectanceFrontAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				setSolarReflectanceBack((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING:
				setSolarReflectanceBackAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				unsetVisibleTransmittance();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING:
				unsetVisibleTransmittanceAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				unsetSolarTransmittance();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING:
				unsetSolarTransmittanceAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				unsetThermalIrTransmittance();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING:
				unsetThermalIrTransmittanceAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				unsetThermalIrEmissivityBack();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING:
				unsetThermalIrEmissivityBackAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				unsetThermalIrEmissivityFront();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING:
				unsetThermalIrEmissivityFrontAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				unsetVisibleReflectanceBack();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING:
				unsetVisibleReflectanceBackAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				unsetVisibleReflectanceFront();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING:
				unsetVisibleReflectanceFrontAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				unsetSolarReflectanceFront();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING:
				unsetSolarReflectanceFrontAsString();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				unsetSolarReflectanceBack();
				return;
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING:
				unsetSolarReflectanceBackAsString();
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
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE:
				return isSetVisibleTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_TRANSMITTANCE_AS_STRING:
				return isSetVisibleTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE:
				return isSetSolarTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_TRANSMITTANCE_AS_STRING:
				return isSetSolarTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE:
				return isSetThermalIrTransmittance();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_TRANSMITTANCE_AS_STRING:
				return isSetThermalIrTransmittanceAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK:
				return isSetThermalIrEmissivityBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_BACK_AS_STRING:
				return isSetThermalIrEmissivityBackAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT:
				return isSetThermalIrEmissivityFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__THERMAL_IR_EMISSIVITY_FRONT_AS_STRING:
				return isSetThermalIrEmissivityFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK:
				return isSetVisibleReflectanceBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_BACK_AS_STRING:
				return isSetVisibleReflectanceBackAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT:
				return isSetVisibleReflectanceFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__VISIBLE_REFLECTANCE_FRONT_AS_STRING:
				return isSetVisibleReflectanceFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT:
				return isSetSolarReflectanceFront();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_FRONT_AS_STRING:
				return isSetSolarReflectanceFrontAsString();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK:
				return isSetSolarReflectanceBack();
			case Ifc2x3tc1Package.IFC_OPTICAL_MATERIAL_PROPERTIES__SOLAR_REFLECTANCE_BACK_AS_STRING:
				return isSetSolarReflectanceBackAsString();
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
		result.append(" (VisibleTransmittance: ");
		if (visibleTransmittanceESet) result.append(visibleTransmittance); else result.append("<unset>");
		result.append(", VisibleTransmittanceAsString: ");
		if (visibleTransmittanceAsStringESet) result.append(visibleTransmittanceAsString); else result.append("<unset>");
		result.append(", SolarTransmittance: ");
		if (solarTransmittanceESet) result.append(solarTransmittance); else result.append("<unset>");
		result.append(", SolarTransmittanceAsString: ");
		if (solarTransmittanceAsStringESet) result.append(solarTransmittanceAsString); else result.append("<unset>");
		result.append(", ThermalIrTransmittance: ");
		if (thermalIrTransmittanceESet) result.append(thermalIrTransmittance); else result.append("<unset>");
		result.append(", ThermalIrTransmittanceAsString: ");
		if (thermalIrTransmittanceAsStringESet) result.append(thermalIrTransmittanceAsString); else result.append("<unset>");
		result.append(", ThermalIrEmissivityBack: ");
		if (thermalIrEmissivityBackESet) result.append(thermalIrEmissivityBack); else result.append("<unset>");
		result.append(", ThermalIrEmissivityBackAsString: ");
		if (thermalIrEmissivityBackAsStringESet) result.append(thermalIrEmissivityBackAsString); else result.append("<unset>");
		result.append(", ThermalIrEmissivityFront: ");
		if (thermalIrEmissivityFrontESet) result.append(thermalIrEmissivityFront); else result.append("<unset>");
		result.append(", ThermalIrEmissivityFrontAsString: ");
		if (thermalIrEmissivityFrontAsStringESet) result.append(thermalIrEmissivityFrontAsString); else result.append("<unset>");
		result.append(", VisibleReflectanceBack: ");
		if (visibleReflectanceBackESet) result.append(visibleReflectanceBack); else result.append("<unset>");
		result.append(", VisibleReflectanceBackAsString: ");
		if (visibleReflectanceBackAsStringESet) result.append(visibleReflectanceBackAsString); else result.append("<unset>");
		result.append(", VisibleReflectanceFront: ");
		if (visibleReflectanceFrontESet) result.append(visibleReflectanceFront); else result.append("<unset>");
		result.append(", VisibleReflectanceFrontAsString: ");
		if (visibleReflectanceFrontAsStringESet) result.append(visibleReflectanceFrontAsString); else result.append("<unset>");
		result.append(", SolarReflectanceFront: ");
		if (solarReflectanceFrontESet) result.append(solarReflectanceFront); else result.append("<unset>");
		result.append(", SolarReflectanceFrontAsString: ");
		if (solarReflectanceFrontAsStringESet) result.append(solarReflectanceFrontAsString); else result.append("<unset>");
		result.append(", SolarReflectanceBack: ");
		if (solarReflectanceBackESet) result.append(solarReflectanceBack); else result.append("<unset>");
		result.append(", SolarReflectanceBackAsString: ");
		if (solarReflectanceBackAsStringESet) result.append(solarReflectanceBackAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcOpticalMaterialPropertiesImpl
