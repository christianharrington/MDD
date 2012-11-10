/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcWaterProperties;
import ifc2x3tc1.Tristate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getHardnessAsString <em>Hardness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAlkalinityConcentrationAsString <em>Alkalinity Concentration As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getAcidityConcentrationAsString <em>Acidity Concentration As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getImpuritiesContentAsString <em>Impurities Content As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getPHLevelAsString <em>PH Level As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContentAsString <em>Dissolved Solids Content As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWaterPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcWaterProperties {
	/**
	 * The default value of the '{@link #getIsPotable() <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPotable()
	 * @generated
	 * @ordered
	 */
	protected static final Tristate IS_POTABLE_EDEFAULT = Tristate.TRUE;

	/**
	 * The cached value of the '{@link #getIsPotable() <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPotable()
	 * @generated
	 * @ordered
	 */
	protected Tristate isPotable = IS_POTABLE_EDEFAULT;

	/**
	 * This is true if the Is Potable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPotableESet;

	/**
	 * The default value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardness()
	 * @generated
	 * @ordered
	 */
	protected static final double HARDNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardness()
	 * @generated
	 * @ordered
	 */
	protected double hardness = HARDNESS_EDEFAULT;

	/**
	 * This is true if the Hardness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hardnessESet;

	/**
	 * The default value of the '{@link #getHardnessAsString() <em>Hardness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardnessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardnessAsString() <em>Hardness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardnessAsString()
	 * @generated
	 * @ordered
	 */
	protected String hardnessAsString = HARDNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Hardness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hardnessAsStringESet;

	/**
	 * The default value of the '{@link #getAlkalinityConcentration() <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final double ALKALINITY_CONCENTRATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAlkalinityConcentration() <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentration()
	 * @generated
	 * @ordered
	 */
	protected double alkalinityConcentration = ALKALINITY_CONCENTRATION_EDEFAULT;

	/**
	 * This is true if the Alkalinity Concentration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alkalinityConcentrationESet;

	/**
	 * The default value of the '{@link #getAlkalinityConcentrationAsString() <em>Alkalinity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentrationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ALKALINITY_CONCENTRATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlkalinityConcentrationAsString() <em>Alkalinity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentrationAsString()
	 * @generated
	 * @ordered
	 */
	protected String alkalinityConcentrationAsString = ALKALINITY_CONCENTRATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Alkalinity Concentration As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alkalinityConcentrationAsStringESet;

	/**
	 * The default value of the '{@link #getAcidityConcentration() <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final double ACIDITY_CONCENTRATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAcidityConcentration() <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentration()
	 * @generated
	 * @ordered
	 */
	protected double acidityConcentration = ACIDITY_CONCENTRATION_EDEFAULT;

	/**
	 * This is true if the Acidity Concentration attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acidityConcentrationESet;

	/**
	 * The default value of the '{@link #getAcidityConcentrationAsString() <em>Acidity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentrationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ACIDITY_CONCENTRATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcidityConcentrationAsString() <em>Acidity Concentration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentrationAsString()
	 * @generated
	 * @ordered
	 */
	protected String acidityConcentrationAsString = ACIDITY_CONCENTRATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Acidity Concentration As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean acidityConcentrationAsStringESet;

	/**
	 * The default value of the '{@link #getImpuritiesContent() <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContent()
	 * @generated
	 * @ordered
	 */
	protected static final double IMPURITIES_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getImpuritiesContent() <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContent()
	 * @generated
	 * @ordered
	 */
	protected double impuritiesContent = IMPURITIES_CONTENT_EDEFAULT;

	/**
	 * This is true if the Impurities Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impuritiesContentESet;

	/**
	 * The default value of the '{@link #getImpuritiesContentAsString() <em>Impurities Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPURITIES_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpuritiesContentAsString() <em>Impurities Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String impuritiesContentAsString = IMPURITIES_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Impurities Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean impuritiesContentAsStringESet;

	/**
	 * The default value of the '{@link #getPHLevel() <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevel()
	 * @generated
	 * @ordered
	 */
	protected static final double PH_LEVEL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPHLevel() <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevel()
	 * @generated
	 * @ordered
	 */
	protected double phLevel = PH_LEVEL_EDEFAULT;

	/**
	 * This is true if the PH Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phLevelESet;

	/**
	 * The default value of the '{@link #getPHLevelAsString() <em>PH Level As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevelAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PH_LEVEL_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPHLevelAsString() <em>PH Level As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevelAsString()
	 * @generated
	 * @ordered
	 */
	protected String phLevelAsString = PH_LEVEL_AS_STRING_EDEFAULT;

	/**
	 * This is true if the PH Level As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phLevelAsStringESet;

	/**
	 * The default value of the '{@link #getDissolvedSolidsContent() <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 * @ordered
	 */
	protected static final double DISSOLVED_SOLIDS_CONTENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDissolvedSolidsContent() <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 * @ordered
	 */
	protected double dissolvedSolidsContent = DISSOLVED_SOLIDS_CONTENT_EDEFAULT;

	/**
	 * This is true if the Dissolved Solids Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dissolvedSolidsContentESet;

	/**
	 * The default value of the '{@link #getDissolvedSolidsContentAsString() <em>Dissolved Solids Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContentAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISSOLVED_SOLIDS_CONTENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDissolvedSolidsContentAsString() <em>Dissolved Solids Content As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContentAsString()
	 * @generated
	 * @ordered
	 */
	protected String dissolvedSolidsContentAsString = DISSOLVED_SOLIDS_CONTENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Dissolved Solids Content As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dissolvedSolidsContentAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWaterPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcWaterProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tristate getIsPotable() {
		return isPotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPotable(Tristate newIsPotable) {
		Tristate oldIsPotable = isPotable;
		isPotable = newIsPotable == null ? IS_POTABLE_EDEFAULT : newIsPotable;
		boolean oldIsPotableESet = isPotableESet;
		isPotableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE, oldIsPotable, isPotable, !oldIsPotableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPotable() {
		Tristate oldIsPotable = isPotable;
		boolean oldIsPotableESet = isPotableESet;
		isPotable = IS_POTABLE_EDEFAULT;
		isPotableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE, oldIsPotable, IS_POTABLE_EDEFAULT, oldIsPotableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPotable() {
		return isPotableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHardness() {
		return hardness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardness(double newHardness) {
		double oldHardness = hardness;
		hardness = newHardness;
		boolean oldHardnessESet = hardnessESet;
		hardnessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS, oldHardness, hardness, !oldHardnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardness() {
		double oldHardness = hardness;
		boolean oldHardnessESet = hardnessESet;
		hardness = HARDNESS_EDEFAULT;
		hardnessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS, oldHardness, HARDNESS_EDEFAULT, oldHardnessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardness() {
		return hardnessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardnessAsString() {
		return hardnessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardnessAsString(String newHardnessAsString) {
		String oldHardnessAsString = hardnessAsString;
		hardnessAsString = newHardnessAsString;
		boolean oldHardnessAsStringESet = hardnessAsStringESet;
		hardnessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING, oldHardnessAsString, hardnessAsString, !oldHardnessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHardnessAsString() {
		String oldHardnessAsString = hardnessAsString;
		boolean oldHardnessAsStringESet = hardnessAsStringESet;
		hardnessAsString = HARDNESS_AS_STRING_EDEFAULT;
		hardnessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING, oldHardnessAsString, HARDNESS_AS_STRING_EDEFAULT, oldHardnessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHardnessAsString() {
		return hardnessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAlkalinityConcentration() {
		return alkalinityConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkalinityConcentration(double newAlkalinityConcentration) {
		double oldAlkalinityConcentration = alkalinityConcentration;
		alkalinityConcentration = newAlkalinityConcentration;
		boolean oldAlkalinityConcentrationESet = alkalinityConcentrationESet;
		alkalinityConcentrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION, oldAlkalinityConcentration, alkalinityConcentration, !oldAlkalinityConcentrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlkalinityConcentration() {
		double oldAlkalinityConcentration = alkalinityConcentration;
		boolean oldAlkalinityConcentrationESet = alkalinityConcentrationESet;
		alkalinityConcentration = ALKALINITY_CONCENTRATION_EDEFAULT;
		alkalinityConcentrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION, oldAlkalinityConcentration, ALKALINITY_CONCENTRATION_EDEFAULT, oldAlkalinityConcentrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlkalinityConcentration() {
		return alkalinityConcentrationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlkalinityConcentrationAsString() {
		return alkalinityConcentrationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkalinityConcentrationAsString(String newAlkalinityConcentrationAsString) {
		String oldAlkalinityConcentrationAsString = alkalinityConcentrationAsString;
		alkalinityConcentrationAsString = newAlkalinityConcentrationAsString;
		boolean oldAlkalinityConcentrationAsStringESet = alkalinityConcentrationAsStringESet;
		alkalinityConcentrationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING, oldAlkalinityConcentrationAsString, alkalinityConcentrationAsString, !oldAlkalinityConcentrationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlkalinityConcentrationAsString() {
		String oldAlkalinityConcentrationAsString = alkalinityConcentrationAsString;
		boolean oldAlkalinityConcentrationAsStringESet = alkalinityConcentrationAsStringESet;
		alkalinityConcentrationAsString = ALKALINITY_CONCENTRATION_AS_STRING_EDEFAULT;
		alkalinityConcentrationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING, oldAlkalinityConcentrationAsString, ALKALINITY_CONCENTRATION_AS_STRING_EDEFAULT, oldAlkalinityConcentrationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlkalinityConcentrationAsString() {
		return alkalinityConcentrationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAcidityConcentration() {
		return acidityConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcidityConcentration(double newAcidityConcentration) {
		double oldAcidityConcentration = acidityConcentration;
		acidityConcentration = newAcidityConcentration;
		boolean oldAcidityConcentrationESet = acidityConcentrationESet;
		acidityConcentrationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION, oldAcidityConcentration, acidityConcentration, !oldAcidityConcentrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcidityConcentration() {
		double oldAcidityConcentration = acidityConcentration;
		boolean oldAcidityConcentrationESet = acidityConcentrationESet;
		acidityConcentration = ACIDITY_CONCENTRATION_EDEFAULT;
		acidityConcentrationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION, oldAcidityConcentration, ACIDITY_CONCENTRATION_EDEFAULT, oldAcidityConcentrationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcidityConcentration() {
		return acidityConcentrationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcidityConcentrationAsString() {
		return acidityConcentrationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcidityConcentrationAsString(String newAcidityConcentrationAsString) {
		String oldAcidityConcentrationAsString = acidityConcentrationAsString;
		acidityConcentrationAsString = newAcidityConcentrationAsString;
		boolean oldAcidityConcentrationAsStringESet = acidityConcentrationAsStringESet;
		acidityConcentrationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING, oldAcidityConcentrationAsString, acidityConcentrationAsString, !oldAcidityConcentrationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAcidityConcentrationAsString() {
		String oldAcidityConcentrationAsString = acidityConcentrationAsString;
		boolean oldAcidityConcentrationAsStringESet = acidityConcentrationAsStringESet;
		acidityConcentrationAsString = ACIDITY_CONCENTRATION_AS_STRING_EDEFAULT;
		acidityConcentrationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING, oldAcidityConcentrationAsString, ACIDITY_CONCENTRATION_AS_STRING_EDEFAULT, oldAcidityConcentrationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAcidityConcentrationAsString() {
		return acidityConcentrationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getImpuritiesContent() {
		return impuritiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpuritiesContent(double newImpuritiesContent) {
		double oldImpuritiesContent = impuritiesContent;
		impuritiesContent = newImpuritiesContent;
		boolean oldImpuritiesContentESet = impuritiesContentESet;
		impuritiesContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT, oldImpuritiesContent, impuritiesContent, !oldImpuritiesContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpuritiesContent() {
		double oldImpuritiesContent = impuritiesContent;
		boolean oldImpuritiesContentESet = impuritiesContentESet;
		impuritiesContent = IMPURITIES_CONTENT_EDEFAULT;
		impuritiesContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT, oldImpuritiesContent, IMPURITIES_CONTENT_EDEFAULT, oldImpuritiesContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpuritiesContent() {
		return impuritiesContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpuritiesContentAsString() {
		return impuritiesContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpuritiesContentAsString(String newImpuritiesContentAsString) {
		String oldImpuritiesContentAsString = impuritiesContentAsString;
		impuritiesContentAsString = newImpuritiesContentAsString;
		boolean oldImpuritiesContentAsStringESet = impuritiesContentAsStringESet;
		impuritiesContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING, oldImpuritiesContentAsString, impuritiesContentAsString, !oldImpuritiesContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImpuritiesContentAsString() {
		String oldImpuritiesContentAsString = impuritiesContentAsString;
		boolean oldImpuritiesContentAsStringESet = impuritiesContentAsStringESet;
		impuritiesContentAsString = IMPURITIES_CONTENT_AS_STRING_EDEFAULT;
		impuritiesContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING, oldImpuritiesContentAsString, IMPURITIES_CONTENT_AS_STRING_EDEFAULT, oldImpuritiesContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImpuritiesContentAsString() {
		return impuritiesContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPHLevel() {
		return phLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHLevel(double newPHLevel) {
		double oldPHLevel = phLevel;
		phLevel = newPHLevel;
		boolean oldPHLevelESet = phLevelESet;
		phLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL, oldPHLevel, phLevel, !oldPHLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHLevel() {
		double oldPHLevel = phLevel;
		boolean oldPHLevelESet = phLevelESet;
		phLevel = PH_LEVEL_EDEFAULT;
		phLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL, oldPHLevel, PH_LEVEL_EDEFAULT, oldPHLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHLevel() {
		return phLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPHLevelAsString() {
		return phLevelAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHLevelAsString(String newPHLevelAsString) {
		String oldPHLevelAsString = phLevelAsString;
		phLevelAsString = newPHLevelAsString;
		boolean oldPHLevelAsStringESet = phLevelAsStringESet;
		phLevelAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING, oldPHLevelAsString, phLevelAsString, !oldPHLevelAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPHLevelAsString() {
		String oldPHLevelAsString = phLevelAsString;
		boolean oldPHLevelAsStringESet = phLevelAsStringESet;
		phLevelAsString = PH_LEVEL_AS_STRING_EDEFAULT;
		phLevelAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING, oldPHLevelAsString, PH_LEVEL_AS_STRING_EDEFAULT, oldPHLevelAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPHLevelAsString() {
		return phLevelAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDissolvedSolidsContent() {
		return dissolvedSolidsContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissolvedSolidsContent(double newDissolvedSolidsContent) {
		double oldDissolvedSolidsContent = dissolvedSolidsContent;
		dissolvedSolidsContent = newDissolvedSolidsContent;
		boolean oldDissolvedSolidsContentESet = dissolvedSolidsContentESet;
		dissolvedSolidsContentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT, oldDissolvedSolidsContent, dissolvedSolidsContent, !oldDissolvedSolidsContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDissolvedSolidsContent() {
		double oldDissolvedSolidsContent = dissolvedSolidsContent;
		boolean oldDissolvedSolidsContentESet = dissolvedSolidsContentESet;
		dissolvedSolidsContent = DISSOLVED_SOLIDS_CONTENT_EDEFAULT;
		dissolvedSolidsContentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT, oldDissolvedSolidsContent, DISSOLVED_SOLIDS_CONTENT_EDEFAULT, oldDissolvedSolidsContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDissolvedSolidsContent() {
		return dissolvedSolidsContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDissolvedSolidsContentAsString() {
		return dissolvedSolidsContentAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissolvedSolidsContentAsString(String newDissolvedSolidsContentAsString) {
		String oldDissolvedSolidsContentAsString = dissolvedSolidsContentAsString;
		dissolvedSolidsContentAsString = newDissolvedSolidsContentAsString;
		boolean oldDissolvedSolidsContentAsStringESet = dissolvedSolidsContentAsStringESet;
		dissolvedSolidsContentAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING, oldDissolvedSolidsContentAsString, dissolvedSolidsContentAsString, !oldDissolvedSolidsContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDissolvedSolidsContentAsString() {
		String oldDissolvedSolidsContentAsString = dissolvedSolidsContentAsString;
		boolean oldDissolvedSolidsContentAsStringESet = dissolvedSolidsContentAsStringESet;
		dissolvedSolidsContentAsString = DISSOLVED_SOLIDS_CONTENT_AS_STRING_EDEFAULT;
		dissolvedSolidsContentAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING, oldDissolvedSolidsContentAsString, DISSOLVED_SOLIDS_CONTENT_AS_STRING_EDEFAULT, oldDissolvedSolidsContentAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDissolvedSolidsContentAsString() {
		return dissolvedSolidsContentAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE:
				return getIsPotable();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS:
				return getHardness();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING:
				return getHardnessAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				return getAlkalinityConcentration();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING:
				return getAlkalinityConcentrationAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				return getAcidityConcentration();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING:
				return getAcidityConcentrationAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				return getImpuritiesContent();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING:
				return getImpuritiesContentAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL:
				return getPHLevel();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING:
				return getPHLevelAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				return getDissolvedSolidsContent();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING:
				return getDissolvedSolidsContentAsString();
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
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE:
				setIsPotable((Tristate)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS:
				setHardness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING:
				setHardnessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				setAlkalinityConcentration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING:
				setAlkalinityConcentrationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				setAcidityConcentration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING:
				setAcidityConcentrationAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				setImpuritiesContent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING:
				setImpuritiesContentAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL:
				setPHLevel((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING:
				setPHLevelAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				setDissolvedSolidsContent((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING:
				setDissolvedSolidsContentAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE:
				unsetIsPotable();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS:
				unsetHardness();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING:
				unsetHardnessAsString();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				unsetAlkalinityConcentration();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING:
				unsetAlkalinityConcentrationAsString();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				unsetAcidityConcentration();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING:
				unsetAcidityConcentrationAsString();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				unsetImpuritiesContent();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING:
				unsetImpuritiesContentAsString();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL:
				unsetPHLevel();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING:
				unsetPHLevelAsString();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				unsetDissolvedSolidsContent();
				return;
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING:
				unsetDissolvedSolidsContentAsString();
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
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IS_POTABLE:
				return isSetIsPotable();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS:
				return isSetHardness();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__HARDNESS_AS_STRING:
				return isSetHardnessAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				return isSetAlkalinityConcentration();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION_AS_STRING:
				return isSetAlkalinityConcentrationAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				return isSetAcidityConcentration();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION_AS_STRING:
				return isSetAcidityConcentrationAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				return isSetImpuritiesContent();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT_AS_STRING:
				return isSetImpuritiesContentAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL:
				return isSetPHLevel();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__PH_LEVEL_AS_STRING:
				return isSetPHLevelAsString();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				return isSetDissolvedSolidsContent();
			case Ifc2x3tc1Package.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT_AS_STRING:
				return isSetDissolvedSolidsContentAsString();
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
		result.append(" (IsPotable: ");
		if (isPotableESet) result.append(isPotable); else result.append("<unset>");
		result.append(", Hardness: ");
		if (hardnessESet) result.append(hardness); else result.append("<unset>");
		result.append(", HardnessAsString: ");
		if (hardnessAsStringESet) result.append(hardnessAsString); else result.append("<unset>");
		result.append(", AlkalinityConcentration: ");
		if (alkalinityConcentrationESet) result.append(alkalinityConcentration); else result.append("<unset>");
		result.append(", AlkalinityConcentrationAsString: ");
		if (alkalinityConcentrationAsStringESet) result.append(alkalinityConcentrationAsString); else result.append("<unset>");
		result.append(", AcidityConcentration: ");
		if (acidityConcentrationESet) result.append(acidityConcentration); else result.append("<unset>");
		result.append(", AcidityConcentrationAsString: ");
		if (acidityConcentrationAsStringESet) result.append(acidityConcentrationAsString); else result.append("<unset>");
		result.append(", ImpuritiesContent: ");
		if (impuritiesContentESet) result.append(impuritiesContent); else result.append("<unset>");
		result.append(", ImpuritiesContentAsString: ");
		if (impuritiesContentAsStringESet) result.append(impuritiesContentAsString); else result.append("<unset>");
		result.append(", PHLevel: ");
		if (phLevelESet) result.append(phLevel); else result.append("<unset>");
		result.append(", PHLevelAsString: ");
		if (phLevelAsStringESet) result.append(phLevelAsString); else result.append("<unset>");
		result.append(", DissolvedSolidsContent: ");
		if (dissolvedSolidsContentESet) result.append(dissolvedSolidsContent); else result.append("<unset>");
		result.append(", DissolvedSolidsContentAsString: ");
		if (dissolvedSolidsContentAsStringESet) result.append(dissolvedSolidsContentAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcWaterPropertiesImpl
