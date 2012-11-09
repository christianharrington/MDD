/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcReinforcementBarProperties;
import ifc2x3tc1.IfcReinforcingBarSurfaceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionAreaAsString <em>Total Cross Section Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepthAsString <em>Effective Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameterAsString <em>Nominal Bar Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarCount <em>Bar Count</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementBarPropertiesImpl#getBarCountAsString <em>Bar Count As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcementBarPropertiesImpl extends EObjectImpl implements IfcReinforcementBarProperties {
	/**
	 * The default value of the '{@link #getTotalCrossSectionArea() <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCrossSectionArea() <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double totalCrossSectionArea = TOTAL_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalCrossSectionAreaAsString() <em>Total Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_CROSS_SECTION_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalCrossSectionAreaAsString() <em>Total Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String totalCrossSectionAreaAsString = TOTAL_CROSS_SECTION_AREA_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteelGrade() <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteelGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String STEEL_GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteelGrade() <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteelGrade()
	 * @generated
	 * @ordered
	 */
	protected String steelGrade = STEEL_GRADE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarSurfaceEnum BAR_SURFACE_EDEFAULT = IfcReinforcingBarSurfaceEnum.NULL;

	/**
	 * The cached value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarSurfaceEnum barSurface = BAR_SURFACE_EDEFAULT;

	/**
	 * This is true if the Bar Surface attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barSurfaceESet;

	/**
	 * The default value of the '{@link #getEffectiveDepth() <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double EFFECTIVE_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEffectiveDepth() <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepth()
	 * @generated
	 * @ordered
	 */
	protected double effectiveDepth = EFFECTIVE_DEPTH_EDEFAULT;

	/**
	 * This is true if the Effective Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectiveDepthESet;

	/**
	 * The default value of the '{@link #getEffectiveDepthAsString() <em>Effective Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDepthAsString() <em>Effective Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String effectiveDepthAsString = EFFECTIVE_DEPTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Effective Depth As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean effectiveDepthAsStringESet;

	/**
	 * The default value of the '{@link #getNominalBarDiameter() <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_BAR_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalBarDiameter() <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameter()
	 * @generated
	 * @ordered
	 */
	protected double nominalBarDiameter = NOMINAL_BAR_DIAMETER_EDEFAULT;

	/**
	 * This is true if the Nominal Bar Diameter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalBarDiameterESet;

	/**
	 * The default value of the '{@link #getNominalBarDiameterAsString() <em>Nominal Bar Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_BAR_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalBarDiameterAsString() <em>Nominal Bar Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String nominalBarDiameterAsString = NOMINAL_BAR_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Nominal Bar Diameter As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nominalBarDiameterAsStringESet;

	/**
	 * The default value of the '{@link #getBarCount() <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCount()
	 * @generated
	 * @ordered
	 */
	protected static final double BAR_COUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBarCount() <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCount()
	 * @generated
	 * @ordered
	 */
	protected double barCount = BAR_COUNT_EDEFAULT;

	/**
	 * This is true if the Bar Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barCountESet;

	/**
	 * The default value of the '{@link #getBarCountAsString() <em>Bar Count As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCountAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String BAR_COUNT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarCountAsString() <em>Bar Count As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCountAsString()
	 * @generated
	 * @ordered
	 */
	protected String barCountAsString = BAR_COUNT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Bar Count As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean barCountAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementBarPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementBarProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCrossSectionArea() {
		return totalCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionArea(double newTotalCrossSectionArea) {
		double oldTotalCrossSectionArea = totalCrossSectionArea;
		totalCrossSectionArea = newTotalCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA, oldTotalCrossSectionArea, totalCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalCrossSectionAreaAsString() {
		return totalCrossSectionAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionAreaAsString(String newTotalCrossSectionAreaAsString) {
		String oldTotalCrossSectionAreaAsString = totalCrossSectionAreaAsString;
		totalCrossSectionAreaAsString = newTotalCrossSectionAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING, oldTotalCrossSectionAreaAsString, totalCrossSectionAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSteelGrade() {
		return steelGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(String newSteelGrade) {
		String oldSteelGrade = steelGrade;
		steelGrade = newSteelGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE, oldSteelGrade, steelGrade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return barSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		IfcReinforcingBarSurfaceEnum oldBarSurface = barSurface;
		barSurface = newBarSurface == null ? BAR_SURFACE_EDEFAULT : newBarSurface;
		boolean oldBarSurfaceESet = barSurfaceESet;
		barSurfaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE, oldBarSurface, barSurface, !oldBarSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarSurface() {
		IfcReinforcingBarSurfaceEnum oldBarSurface = barSurface;
		boolean oldBarSurfaceESet = barSurfaceESet;
		barSurface = BAR_SURFACE_EDEFAULT;
		barSurfaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE, oldBarSurface, BAR_SURFACE_EDEFAULT, oldBarSurfaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarSurface() {
		return barSurfaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEffectiveDepth() {
		return effectiveDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepth(double newEffectiveDepth) {
		double oldEffectiveDepth = effectiveDepth;
		effectiveDepth = newEffectiveDepth;
		boolean oldEffectiveDepthESet = effectiveDepthESet;
		effectiveDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH, oldEffectiveDepth, effectiveDepth, !oldEffectiveDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepth() {
		double oldEffectiveDepth = effectiveDepth;
		boolean oldEffectiveDepthESet = effectiveDepthESet;
		effectiveDepth = EFFECTIVE_DEPTH_EDEFAULT;
		effectiveDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH, oldEffectiveDepth, EFFECTIVE_DEPTH_EDEFAULT, oldEffectiveDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepth() {
		return effectiveDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffectiveDepthAsString() {
		return effectiveDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepthAsString(String newEffectiveDepthAsString) {
		String oldEffectiveDepthAsString = effectiveDepthAsString;
		effectiveDepthAsString = newEffectiveDepthAsString;
		boolean oldEffectiveDepthAsStringESet = effectiveDepthAsStringESet;
		effectiveDepthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING, oldEffectiveDepthAsString, effectiveDepthAsString, !oldEffectiveDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEffectiveDepthAsString() {
		String oldEffectiveDepthAsString = effectiveDepthAsString;
		boolean oldEffectiveDepthAsStringESet = effectiveDepthAsStringESet;
		effectiveDepthAsString = EFFECTIVE_DEPTH_AS_STRING_EDEFAULT;
		effectiveDepthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING, oldEffectiveDepthAsString, EFFECTIVE_DEPTH_AS_STRING_EDEFAULT, oldEffectiveDepthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEffectiveDepthAsString() {
		return effectiveDepthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalBarDiameter() {
		return nominalBarDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameter(double newNominalBarDiameter) {
		double oldNominalBarDiameter = nominalBarDiameter;
		nominalBarDiameter = newNominalBarDiameter;
		boolean oldNominalBarDiameterESet = nominalBarDiameterESet;
		nominalBarDiameterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER, oldNominalBarDiameter, nominalBarDiameter, !oldNominalBarDiameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameter() {
		double oldNominalBarDiameter = nominalBarDiameter;
		boolean oldNominalBarDiameterESet = nominalBarDiameterESet;
		nominalBarDiameter = NOMINAL_BAR_DIAMETER_EDEFAULT;
		nominalBarDiameterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER, oldNominalBarDiameter, NOMINAL_BAR_DIAMETER_EDEFAULT, oldNominalBarDiameterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameter() {
		return nominalBarDiameterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalBarDiameterAsString() {
		return nominalBarDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameterAsString(String newNominalBarDiameterAsString) {
		String oldNominalBarDiameterAsString = nominalBarDiameterAsString;
		nominalBarDiameterAsString = newNominalBarDiameterAsString;
		boolean oldNominalBarDiameterAsStringESet = nominalBarDiameterAsStringESet;
		nominalBarDiameterAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING, oldNominalBarDiameterAsString, nominalBarDiameterAsString, !oldNominalBarDiameterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNominalBarDiameterAsString() {
		String oldNominalBarDiameterAsString = nominalBarDiameterAsString;
		boolean oldNominalBarDiameterAsStringESet = nominalBarDiameterAsStringESet;
		nominalBarDiameterAsString = NOMINAL_BAR_DIAMETER_AS_STRING_EDEFAULT;
		nominalBarDiameterAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING, oldNominalBarDiameterAsString, NOMINAL_BAR_DIAMETER_AS_STRING_EDEFAULT, oldNominalBarDiameterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNominalBarDiameterAsString() {
		return nominalBarDiameterAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBarCount() {
		return barCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCount(double newBarCount) {
		double oldBarCount = barCount;
		barCount = newBarCount;
		boolean oldBarCountESet = barCountESet;
		barCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT, oldBarCount, barCount, !oldBarCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCount() {
		double oldBarCount = barCount;
		boolean oldBarCountESet = barCountESet;
		barCount = BAR_COUNT_EDEFAULT;
		barCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT, oldBarCount, BAR_COUNT_EDEFAULT, oldBarCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCount() {
		return barCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBarCountAsString() {
		return barCountAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCountAsString(String newBarCountAsString) {
		String oldBarCountAsString = barCountAsString;
		barCountAsString = newBarCountAsString;
		boolean oldBarCountAsStringESet = barCountAsStringESet;
		barCountAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING, oldBarCountAsString, barCountAsString, !oldBarCountAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBarCountAsString() {
		String oldBarCountAsString = barCountAsString;
		boolean oldBarCountAsStringESet = barCountAsStringESet;
		barCountAsString = BAR_COUNT_AS_STRING_EDEFAULT;
		barCountAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING, oldBarCountAsString, BAR_COUNT_AS_STRING_EDEFAULT, oldBarCountAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBarCountAsString() {
		return barCountAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				return getTotalCrossSectionArea();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING:
				return getTotalCrossSectionAreaAsString();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				return getSteelGrade();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				return getBarSurface();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				return getEffectiveDepth();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING:
				return getEffectiveDepthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				return getNominalBarDiameter();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING:
				return getNominalBarDiameterAsString();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				return getBarCount();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING:
				return getBarCountAsString();
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
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				setTotalCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING:
				setTotalCrossSectionAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				setSteelGrade((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				setBarSurface((IfcReinforcingBarSurfaceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				setEffectiveDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING:
				setEffectiveDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				setNominalBarDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING:
				setNominalBarDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				setBarCount((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING:
				setBarCountAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				setTotalCrossSectionArea(TOTAL_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING:
				setTotalCrossSectionAreaAsString(TOTAL_CROSS_SECTION_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				setSteelGrade(STEEL_GRADE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				unsetBarSurface();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				unsetEffectiveDepth();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING:
				unsetEffectiveDepthAsString();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				unsetNominalBarDiameter();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING:
				unsetNominalBarDiameterAsString();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				unsetBarCount();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING:
				unsetBarCountAsString();
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
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				return totalCrossSectionArea != TOTAL_CROSS_SECTION_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA_AS_STRING:
				return TOTAL_CROSS_SECTION_AREA_AS_STRING_EDEFAULT == null ? totalCrossSectionAreaAsString != null : !TOTAL_CROSS_SECTION_AREA_AS_STRING_EDEFAULT.equals(totalCrossSectionAreaAsString);
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				return STEEL_GRADE_EDEFAULT == null ? steelGrade != null : !STEEL_GRADE_EDEFAULT.equals(steelGrade);
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				return isSetBarSurface();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				return isSetEffectiveDepth();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH_AS_STRING:
				return isSetEffectiveDepthAsString();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				return isSetNominalBarDiameter();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER_AS_STRING:
				return isSetNominalBarDiameterAsString();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				return isSetBarCount();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT_AS_STRING:
				return isSetBarCountAsString();
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
		result.append(" (TotalCrossSectionArea: ");
		result.append(totalCrossSectionArea);
		result.append(", TotalCrossSectionAreaAsString: ");
		result.append(totalCrossSectionAreaAsString);
		result.append(", SteelGrade: ");
		result.append(steelGrade);
		result.append(", BarSurface: ");
		if (barSurfaceESet) result.append(barSurface); else result.append("<unset>");
		result.append(", EffectiveDepth: ");
		if (effectiveDepthESet) result.append(effectiveDepth); else result.append("<unset>");
		result.append(", EffectiveDepthAsString: ");
		if (effectiveDepthAsStringESet) result.append(effectiveDepthAsString); else result.append("<unset>");
		result.append(", NominalBarDiameter: ");
		if (nominalBarDiameterESet) result.append(nominalBarDiameter); else result.append("<unset>");
		result.append(", NominalBarDiameterAsString: ");
		if (nominalBarDiameterAsStringESet) result.append(nominalBarDiameterAsString); else result.append("<unset>");
		result.append(", BarCount: ");
		if (barCountESet) result.append(barCount); else result.append("<unset>");
		result.append(", BarCountAsString: ");
		if (barCountAsStringESet) result.append(barCountAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcReinforcementBarPropertiesImpl
