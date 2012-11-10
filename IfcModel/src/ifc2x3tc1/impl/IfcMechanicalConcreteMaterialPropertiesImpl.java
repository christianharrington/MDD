/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcMechanicalConcreteMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getCompressiveStrengthAsString <em>Compressive Strength As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getMaxAggregateSizeAsString <em>Max Aggregate Size As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWorkability <em>Workability</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getProtectivePoreRatioAsString <em>Protective Pore Ratio As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalConcreteMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalConcreteMaterialProperties {
	/**
	 * The default value of the '{@link #getCompressiveStrength() <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrength()
	 * @generated
	 * @ordered
	 */
	protected static final double COMPRESSIVE_STRENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCompressiveStrength() <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrength()
	 * @generated
	 * @ordered
	 */
	protected double compressiveStrength = COMPRESSIVE_STRENGTH_EDEFAULT;

	/**
	 * This is true if the Compressive Strength attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressiveStrengthESet;

	/**
	 * The default value of the '{@link #getCompressiveStrengthAsString() <em>Compressive Strength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrengthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPRESSIVE_STRENGTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressiveStrengthAsString() <em>Compressive Strength As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrengthAsString()
	 * @generated
	 * @ordered
	 */
	protected String compressiveStrengthAsString = COMPRESSIVE_STRENGTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Compressive Strength As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean compressiveStrengthAsStringESet;

	/**
	 * The default value of the '{@link #getMaxAggregateSize() <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSize()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_AGGREGATE_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxAggregateSize() <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSize()
	 * @generated
	 * @ordered
	 */
	protected double maxAggregateSize = MAX_AGGREGATE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Aggregate Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAggregateSizeESet;

	/**
	 * The default value of the '{@link #getMaxAggregateSizeAsString() <em>Max Aggregate Size As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSizeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_AGGREGATE_SIZE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAggregateSizeAsString() <em>Max Aggregate Size As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSizeAsString()
	 * @generated
	 * @ordered
	 */
	protected String maxAggregateSizeAsString = MAX_AGGREGATE_SIZE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Max Aggregate Size As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxAggregateSizeAsStringESet;

	/**
	 * The default value of the '{@link #getAdmixturesDescription() <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmixturesDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIXTURES_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmixturesDescription() <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmixturesDescription()
	 * @generated
	 * @ordered
	 */
	protected String admixturesDescription = ADMIXTURES_DESCRIPTION_EDEFAULT;

	/**
	 * This is true if the Admixtures Description attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean admixturesDescriptionESet;

	/**
	 * The default value of the '{@link #getWorkability() <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkability()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkability() <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkability()
	 * @generated
	 * @ordered
	 */
	protected String workability = WORKABILITY_EDEFAULT;

	/**
	 * This is true if the Workability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean workabilityESet;

	/**
	 * The default value of the '{@link #getProtectivePoreRatio() <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatio()
	 * @generated
	 * @ordered
	 */
	protected static final double PROTECTIVE_PORE_RATIO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProtectivePoreRatio() <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatio()
	 * @generated
	 * @ordered
	 */
	protected double protectivePoreRatio = PROTECTIVE_PORE_RATIO_EDEFAULT;

	/**
	 * This is true if the Protective Pore Ratio attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectivePoreRatioESet;

	/**
	 * The default value of the '{@link #getProtectivePoreRatioAsString() <em>Protective Pore Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PROTECTIVE_PORE_RATIO_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectivePoreRatioAsString() <em>Protective Pore Ratio As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatioAsString()
	 * @generated
	 * @ordered
	 */
	protected String protectivePoreRatioAsString = PROTECTIVE_PORE_RATIO_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Protective Pore Ratio As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protectivePoreRatioAsStringESet;

	/**
	 * The default value of the '{@link #getWaterImpermeability() <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterImpermeability()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_IMPERMEABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaterImpermeability() <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterImpermeability()
	 * @generated
	 * @ordered
	 */
	protected String waterImpermeability = WATER_IMPERMEABILITY_EDEFAULT;

	/**
	 * This is true if the Water Impermeability attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean waterImpermeabilityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalConcreteMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcMechanicalConcreteMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCompressiveStrength() {
		return compressiveStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressiveStrength(double newCompressiveStrength) {
		double oldCompressiveStrength = compressiveStrength;
		compressiveStrength = newCompressiveStrength;
		boolean oldCompressiveStrengthESet = compressiveStrengthESet;
		compressiveStrengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH, oldCompressiveStrength, compressiveStrength, !oldCompressiveStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressiveStrength() {
		double oldCompressiveStrength = compressiveStrength;
		boolean oldCompressiveStrengthESet = compressiveStrengthESet;
		compressiveStrength = COMPRESSIVE_STRENGTH_EDEFAULT;
		compressiveStrengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH, oldCompressiveStrength, COMPRESSIVE_STRENGTH_EDEFAULT, oldCompressiveStrengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressiveStrength() {
		return compressiveStrengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompressiveStrengthAsString() {
		return compressiveStrengthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressiveStrengthAsString(String newCompressiveStrengthAsString) {
		String oldCompressiveStrengthAsString = compressiveStrengthAsString;
		compressiveStrengthAsString = newCompressiveStrengthAsString;
		boolean oldCompressiveStrengthAsStringESet = compressiveStrengthAsStringESet;
		compressiveStrengthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING, oldCompressiveStrengthAsString, compressiveStrengthAsString, !oldCompressiveStrengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCompressiveStrengthAsString() {
		String oldCompressiveStrengthAsString = compressiveStrengthAsString;
		boolean oldCompressiveStrengthAsStringESet = compressiveStrengthAsStringESet;
		compressiveStrengthAsString = COMPRESSIVE_STRENGTH_AS_STRING_EDEFAULT;
		compressiveStrengthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING, oldCompressiveStrengthAsString, COMPRESSIVE_STRENGTH_AS_STRING_EDEFAULT, oldCompressiveStrengthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompressiveStrengthAsString() {
		return compressiveStrengthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxAggregateSize() {
		return maxAggregateSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAggregateSize(double newMaxAggregateSize) {
		double oldMaxAggregateSize = maxAggregateSize;
		maxAggregateSize = newMaxAggregateSize;
		boolean oldMaxAggregateSizeESet = maxAggregateSizeESet;
		maxAggregateSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE, oldMaxAggregateSize, maxAggregateSize, !oldMaxAggregateSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAggregateSize() {
		double oldMaxAggregateSize = maxAggregateSize;
		boolean oldMaxAggregateSizeESet = maxAggregateSizeESet;
		maxAggregateSize = MAX_AGGREGATE_SIZE_EDEFAULT;
		maxAggregateSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE, oldMaxAggregateSize, MAX_AGGREGATE_SIZE_EDEFAULT, oldMaxAggregateSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAggregateSize() {
		return maxAggregateSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxAggregateSizeAsString() {
		return maxAggregateSizeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAggregateSizeAsString(String newMaxAggregateSizeAsString) {
		String oldMaxAggregateSizeAsString = maxAggregateSizeAsString;
		maxAggregateSizeAsString = newMaxAggregateSizeAsString;
		boolean oldMaxAggregateSizeAsStringESet = maxAggregateSizeAsStringESet;
		maxAggregateSizeAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING, oldMaxAggregateSizeAsString, maxAggregateSizeAsString, !oldMaxAggregateSizeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxAggregateSizeAsString() {
		String oldMaxAggregateSizeAsString = maxAggregateSizeAsString;
		boolean oldMaxAggregateSizeAsStringESet = maxAggregateSizeAsStringESet;
		maxAggregateSizeAsString = MAX_AGGREGATE_SIZE_AS_STRING_EDEFAULT;
		maxAggregateSizeAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING, oldMaxAggregateSizeAsString, MAX_AGGREGATE_SIZE_AS_STRING_EDEFAULT, oldMaxAggregateSizeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxAggregateSizeAsString() {
		return maxAggregateSizeAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmixturesDescription() {
		return admixturesDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmixturesDescription(String newAdmixturesDescription) {
		String oldAdmixturesDescription = admixturesDescription;
		admixturesDescription = newAdmixturesDescription;
		boolean oldAdmixturesDescriptionESet = admixturesDescriptionESet;
		admixturesDescriptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION, oldAdmixturesDescription, admixturesDescription, !oldAdmixturesDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAdmixturesDescription() {
		String oldAdmixturesDescription = admixturesDescription;
		boolean oldAdmixturesDescriptionESet = admixturesDescriptionESet;
		admixturesDescription = ADMIXTURES_DESCRIPTION_EDEFAULT;
		admixturesDescriptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION, oldAdmixturesDescription, ADMIXTURES_DESCRIPTION_EDEFAULT, oldAdmixturesDescriptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAdmixturesDescription() {
		return admixturesDescriptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkability() {
		return workability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkability(String newWorkability) {
		String oldWorkability = workability;
		workability = newWorkability;
		boolean oldWorkabilityESet = workabilityESet;
		workabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY, oldWorkability, workability, !oldWorkabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorkability() {
		String oldWorkability = workability;
		boolean oldWorkabilityESet = workabilityESet;
		workability = WORKABILITY_EDEFAULT;
		workabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY, oldWorkability, WORKABILITY_EDEFAULT, oldWorkabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorkability() {
		return workabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProtectivePoreRatio() {
		return protectivePoreRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectivePoreRatio(double newProtectivePoreRatio) {
		double oldProtectivePoreRatio = protectivePoreRatio;
		protectivePoreRatio = newProtectivePoreRatio;
		boolean oldProtectivePoreRatioESet = protectivePoreRatioESet;
		protectivePoreRatioESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO, oldProtectivePoreRatio, protectivePoreRatio, !oldProtectivePoreRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtectivePoreRatio() {
		double oldProtectivePoreRatio = protectivePoreRatio;
		boolean oldProtectivePoreRatioESet = protectivePoreRatioESet;
		protectivePoreRatio = PROTECTIVE_PORE_RATIO_EDEFAULT;
		protectivePoreRatioESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO, oldProtectivePoreRatio, PROTECTIVE_PORE_RATIO_EDEFAULT, oldProtectivePoreRatioESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtectivePoreRatio() {
		return protectivePoreRatioESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProtectivePoreRatioAsString() {
		return protectivePoreRatioAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectivePoreRatioAsString(String newProtectivePoreRatioAsString) {
		String oldProtectivePoreRatioAsString = protectivePoreRatioAsString;
		protectivePoreRatioAsString = newProtectivePoreRatioAsString;
		boolean oldProtectivePoreRatioAsStringESet = protectivePoreRatioAsStringESet;
		protectivePoreRatioAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING, oldProtectivePoreRatioAsString, protectivePoreRatioAsString, !oldProtectivePoreRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtectivePoreRatioAsString() {
		String oldProtectivePoreRatioAsString = protectivePoreRatioAsString;
		boolean oldProtectivePoreRatioAsStringESet = protectivePoreRatioAsStringESet;
		protectivePoreRatioAsString = PROTECTIVE_PORE_RATIO_AS_STRING_EDEFAULT;
		protectivePoreRatioAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING, oldProtectivePoreRatioAsString, PROTECTIVE_PORE_RATIO_AS_STRING_EDEFAULT, oldProtectivePoreRatioAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtectivePoreRatioAsString() {
		return protectivePoreRatioAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaterImpermeability() {
		return waterImpermeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterImpermeability(String newWaterImpermeability) {
		String oldWaterImpermeability = waterImpermeability;
		waterImpermeability = newWaterImpermeability;
		boolean oldWaterImpermeabilityESet = waterImpermeabilityESet;
		waterImpermeabilityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY, oldWaterImpermeability, waterImpermeability, !oldWaterImpermeabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWaterImpermeability() {
		String oldWaterImpermeability = waterImpermeability;
		boolean oldWaterImpermeabilityESet = waterImpermeabilityESet;
		waterImpermeability = WATER_IMPERMEABILITY_EDEFAULT;
		waterImpermeabilityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY, oldWaterImpermeability, WATER_IMPERMEABILITY_EDEFAULT, oldWaterImpermeabilityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWaterImpermeability() {
		return waterImpermeabilityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				return getCompressiveStrength();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING:
				return getCompressiveStrengthAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				return getMaxAggregateSize();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING:
				return getMaxAggregateSizeAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				return getAdmixturesDescription();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				return getWorkability();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				return getProtectivePoreRatio();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING:
				return getProtectivePoreRatioAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				return getWaterImpermeability();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				setCompressiveStrength((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING:
				setCompressiveStrengthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				setMaxAggregateSize((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING:
				setMaxAggregateSizeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				setAdmixturesDescription((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				setWorkability((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				setProtectivePoreRatio((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING:
				setProtectivePoreRatioAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				setWaterImpermeability((String)newValue);
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				unsetCompressiveStrength();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING:
				unsetCompressiveStrengthAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				unsetMaxAggregateSize();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING:
				unsetMaxAggregateSizeAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				unsetAdmixturesDescription();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				unsetWorkability();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				unsetProtectivePoreRatio();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING:
				unsetProtectivePoreRatioAsString();
				return;
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				unsetWaterImpermeability();
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
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				return isSetCompressiveStrength();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH_AS_STRING:
				return isSetCompressiveStrengthAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				return isSetMaxAggregateSize();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE_AS_STRING:
				return isSetMaxAggregateSizeAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				return isSetAdmixturesDescription();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				return isSetWorkability();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				return isSetProtectivePoreRatio();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO_AS_STRING:
				return isSetProtectivePoreRatioAsString();
			case Ifc2x3tc1Package.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				return isSetWaterImpermeability();
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
		result.append(" (CompressiveStrength: ");
		if (compressiveStrengthESet) result.append(compressiveStrength); else result.append("<unset>");
		result.append(", CompressiveStrengthAsString: ");
		if (compressiveStrengthAsStringESet) result.append(compressiveStrengthAsString); else result.append("<unset>");
		result.append(", MaxAggregateSize: ");
		if (maxAggregateSizeESet) result.append(maxAggregateSize); else result.append("<unset>");
		result.append(", MaxAggregateSizeAsString: ");
		if (maxAggregateSizeAsStringESet) result.append(maxAggregateSizeAsString); else result.append("<unset>");
		result.append(", AdmixturesDescription: ");
		if (admixturesDescriptionESet) result.append(admixturesDescription); else result.append("<unset>");
		result.append(", Workability: ");
		if (workabilityESet) result.append(workability); else result.append("<unset>");
		result.append(", ProtectivePoreRatio: ");
		if (protectivePoreRatioESet) result.append(protectivePoreRatio); else result.append("<unset>");
		result.append(", ProtectivePoreRatioAsString: ");
		if (protectivePoreRatioAsStringESet) result.append(protectivePoreRatioAsString); else result.append("<unset>");
		result.append(", WaterImpermeability: ");
		if (waterImpermeabilityESet) result.append(waterImpermeability); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalConcreteMaterialPropertiesImpl
