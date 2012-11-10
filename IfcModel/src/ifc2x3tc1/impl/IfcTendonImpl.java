/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTendon;
import ifc2x3tc1.IfcTendonTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getNominalDiameterAsString <em>Nominal Diameter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getTensionForceAsString <em>Tension Force As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getPreStressAsString <em>Pre Stress As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getFrictionCoefficientAsString <em>Friction Coefficient As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getAnchorageSlipAsString <em>Anchorage Slip As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTendonImpl#getMinCurvatureRadiusAsString <em>Min Curvature Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTendonImpl extends IfcReinforcingElementImpl implements IfcTendon {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTendonTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcTendonTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcTendonTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMINAL_DIAMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalDiameterAsString() <em>Nominal Diameter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameterAsString()
	 * @generated
	 * @ordered
	 */
	protected String nominalDiameterAsString = NOMINAL_DIAMETER_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double crossSectionArea = CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionAreaAsString() <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CROSS_SECTION_AREA_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossSectionAreaAsString() <em>Cross Section Area As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionAreaAsString()
	 * @generated
	 * @ordered
	 */
	protected String crossSectionAreaAsString = CROSS_SECTION_AREA_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTensionForce() <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForce()
	 * @generated
	 * @ordered
	 */
	protected static final double TENSION_FORCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTensionForce() <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForce()
	 * @generated
	 * @ordered
	 */
	protected double tensionForce = TENSION_FORCE_EDEFAULT;

	/**
	 * This is true if the Tension Force attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionForceESet;

	/**
	 * The default value of the '{@link #getTensionForceAsString() <em>Tension Force As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForceAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TENSION_FORCE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionForceAsString() <em>Tension Force As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForceAsString()
	 * @generated
	 * @ordered
	 */
	protected String tensionForceAsString = TENSION_FORCE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Tension Force As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tensionForceAsStringESet;

	/**
	 * The default value of the '{@link #getPreStress() <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStress()
	 * @generated
	 * @ordered
	 */
	protected static final double PRE_STRESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPreStress() <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStress()
	 * @generated
	 * @ordered
	 */
	protected double preStress = PRE_STRESS_EDEFAULT;

	/**
	 * This is true if the Pre Stress attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preStressESet;

	/**
	 * The default value of the '{@link #getPreStressAsString() <em>Pre Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStressAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_STRESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreStressAsString() <em>Pre Stress As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStressAsString()
	 * @generated
	 * @ordered
	 */
	protected String preStressAsString = PRE_STRESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Pre Stress As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean preStressAsStringESet;

	/**
	 * The default value of the '{@link #getFrictionCoefficient() <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final double FRICTION_COEFFICIENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFrictionCoefficient() <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected double frictionCoefficient = FRICTION_COEFFICIENT_EDEFAULT;

	/**
	 * This is true if the Friction Coefficient attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frictionCoefficientESet;

	/**
	 * The default value of the '{@link #getFrictionCoefficientAsString() <em>Friction Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FRICTION_COEFFICIENT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrictionCoefficientAsString() <em>Friction Coefficient As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficientAsString()
	 * @generated
	 * @ordered
	 */
	protected String frictionCoefficientAsString = FRICTION_COEFFICIENT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Friction Coefficient As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frictionCoefficientAsStringESet;

	/**
	 * The default value of the '{@link #getAnchorageSlip() <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlip()
	 * @generated
	 * @ordered
	 */
	protected static final double ANCHORAGE_SLIP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAnchorageSlip() <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlip()
	 * @generated
	 * @ordered
	 */
	protected double anchorageSlip = ANCHORAGE_SLIP_EDEFAULT;

	/**
	 * This is true if the Anchorage Slip attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorageSlipESet;

	/**
	 * The default value of the '{@link #getAnchorageSlipAsString() <em>Anchorage Slip As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlipAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ANCHORAGE_SLIP_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorageSlipAsString() <em>Anchorage Slip As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlipAsString()
	 * @generated
	 * @ordered
	 */
	protected String anchorageSlipAsString = ANCHORAGE_SLIP_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Anchorage Slip As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anchorageSlipAsStringESet;

	/**
	 * The default value of the '{@link #getMinCurvatureRadius() <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_CURVATURE_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinCurvatureRadius() <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadius()
	 * @generated
	 * @ordered
	 */
	protected double minCurvatureRadius = MIN_CURVATURE_RADIUS_EDEFAULT;

	/**
	 * This is true if the Min Curvature Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minCurvatureRadiusESet;

	/**
	 * The default value of the '{@link #getMinCurvatureRadiusAsString() <em>Min Curvature Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_CURVATURE_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinCurvatureRadiusAsString() <em>Min Curvature Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String minCurvatureRadiusAsString = MIN_CURVATURE_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Min Curvature Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minCurvatureRadiusAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTendonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTendon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcTendonTypeEnum newPredefinedType) {
		IfcTendonTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalDiameter() {
		return nominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(double newNominalDiameter) {
		double oldNominalDiameter = nominalDiameter;
		nominalDiameter = newNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNominalDiameterAsString() {
		return nominalDiameterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameterAsString(String newNominalDiameterAsString) {
		String oldNominalDiameterAsString = nominalDiameterAsString;
		nominalDiameterAsString = newNominalDiameterAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING, oldNominalDiameterAsString, nominalDiameterAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCrossSectionArea() {
		return crossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(double newCrossSectionArea) {
		double oldCrossSectionArea = crossSectionArea;
		crossSectionArea = newCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCrossSectionAreaAsString() {
		return crossSectionAreaAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionAreaAsString(String newCrossSectionAreaAsString) {
		String oldCrossSectionAreaAsString = crossSectionAreaAsString;
		crossSectionAreaAsString = newCrossSectionAreaAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING, oldCrossSectionAreaAsString, crossSectionAreaAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTensionForce() {
		return tensionForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionForce(double newTensionForce) {
		double oldTensionForce = tensionForce;
		tensionForce = newTensionForce;
		boolean oldTensionForceESet = tensionForceESet;
		tensionForceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE, oldTensionForce, tensionForce, !oldTensionForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionForce() {
		double oldTensionForce = tensionForce;
		boolean oldTensionForceESet = tensionForceESet;
		tensionForce = TENSION_FORCE_EDEFAULT;
		tensionForceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE, oldTensionForce, TENSION_FORCE_EDEFAULT, oldTensionForceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionForce() {
		return tensionForceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTensionForceAsString() {
		return tensionForceAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionForceAsString(String newTensionForceAsString) {
		String oldTensionForceAsString = tensionForceAsString;
		tensionForceAsString = newTensionForceAsString;
		boolean oldTensionForceAsStringESet = tensionForceAsStringESet;
		tensionForceAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING, oldTensionForceAsString, tensionForceAsString, !oldTensionForceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTensionForceAsString() {
		String oldTensionForceAsString = tensionForceAsString;
		boolean oldTensionForceAsStringESet = tensionForceAsStringESet;
		tensionForceAsString = TENSION_FORCE_AS_STRING_EDEFAULT;
		tensionForceAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING, oldTensionForceAsString, TENSION_FORCE_AS_STRING_EDEFAULT, oldTensionForceAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTensionForceAsString() {
		return tensionForceAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPreStress() {
		return preStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStress(double newPreStress) {
		double oldPreStress = preStress;
		preStress = newPreStress;
		boolean oldPreStressESet = preStressESet;
		preStressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS, oldPreStress, preStress, !oldPreStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreStress() {
		double oldPreStress = preStress;
		boolean oldPreStressESet = preStressESet;
		preStress = PRE_STRESS_EDEFAULT;
		preStressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS, oldPreStress, PRE_STRESS_EDEFAULT, oldPreStressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreStress() {
		return preStressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreStressAsString() {
		return preStressAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStressAsString(String newPreStressAsString) {
		String oldPreStressAsString = preStressAsString;
		preStressAsString = newPreStressAsString;
		boolean oldPreStressAsStringESet = preStressAsStringESet;
		preStressAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING, oldPreStressAsString, preStressAsString, !oldPreStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPreStressAsString() {
		String oldPreStressAsString = preStressAsString;
		boolean oldPreStressAsStringESet = preStressAsStringESet;
		preStressAsString = PRE_STRESS_AS_STRING_EDEFAULT;
		preStressAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING, oldPreStressAsString, PRE_STRESS_AS_STRING_EDEFAULT, oldPreStressAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPreStressAsString() {
		return preStressAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFrictionCoefficient() {
		return frictionCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrictionCoefficient(double newFrictionCoefficient) {
		double oldFrictionCoefficient = frictionCoefficient;
		frictionCoefficient = newFrictionCoefficient;
		boolean oldFrictionCoefficientESet = frictionCoefficientESet;
		frictionCoefficientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT, oldFrictionCoefficient, frictionCoefficient, !oldFrictionCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrictionCoefficient() {
		double oldFrictionCoefficient = frictionCoefficient;
		boolean oldFrictionCoefficientESet = frictionCoefficientESet;
		frictionCoefficient = FRICTION_COEFFICIENT_EDEFAULT;
		frictionCoefficientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT, oldFrictionCoefficient, FRICTION_COEFFICIENT_EDEFAULT, oldFrictionCoefficientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrictionCoefficient() {
		return frictionCoefficientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrictionCoefficientAsString() {
		return frictionCoefficientAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrictionCoefficientAsString(String newFrictionCoefficientAsString) {
		String oldFrictionCoefficientAsString = frictionCoefficientAsString;
		frictionCoefficientAsString = newFrictionCoefficientAsString;
		boolean oldFrictionCoefficientAsStringESet = frictionCoefficientAsStringESet;
		frictionCoefficientAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING, oldFrictionCoefficientAsString, frictionCoefficientAsString, !oldFrictionCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrictionCoefficientAsString() {
		String oldFrictionCoefficientAsString = frictionCoefficientAsString;
		boolean oldFrictionCoefficientAsStringESet = frictionCoefficientAsStringESet;
		frictionCoefficientAsString = FRICTION_COEFFICIENT_AS_STRING_EDEFAULT;
		frictionCoefficientAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING, oldFrictionCoefficientAsString, FRICTION_COEFFICIENT_AS_STRING_EDEFAULT, oldFrictionCoefficientAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrictionCoefficientAsString() {
		return frictionCoefficientAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAnchorageSlip() {
		return anchorageSlip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorageSlip(double newAnchorageSlip) {
		double oldAnchorageSlip = anchorageSlip;
		anchorageSlip = newAnchorageSlip;
		boolean oldAnchorageSlipESet = anchorageSlipESet;
		anchorageSlipESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP, oldAnchorageSlip, anchorageSlip, !oldAnchorageSlipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnchorageSlip() {
		double oldAnchorageSlip = anchorageSlip;
		boolean oldAnchorageSlipESet = anchorageSlipESet;
		anchorageSlip = ANCHORAGE_SLIP_EDEFAULT;
		anchorageSlipESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP, oldAnchorageSlip, ANCHORAGE_SLIP_EDEFAULT, oldAnchorageSlipESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnchorageSlip() {
		return anchorageSlipESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnchorageSlipAsString() {
		return anchorageSlipAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorageSlipAsString(String newAnchorageSlipAsString) {
		String oldAnchorageSlipAsString = anchorageSlipAsString;
		anchorageSlipAsString = newAnchorageSlipAsString;
		boolean oldAnchorageSlipAsStringESet = anchorageSlipAsStringESet;
		anchorageSlipAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING, oldAnchorageSlipAsString, anchorageSlipAsString, !oldAnchorageSlipAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAnchorageSlipAsString() {
		String oldAnchorageSlipAsString = anchorageSlipAsString;
		boolean oldAnchorageSlipAsStringESet = anchorageSlipAsStringESet;
		anchorageSlipAsString = ANCHORAGE_SLIP_AS_STRING_EDEFAULT;
		anchorageSlipAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING, oldAnchorageSlipAsString, ANCHORAGE_SLIP_AS_STRING_EDEFAULT, oldAnchorageSlipAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnchorageSlipAsString() {
		return anchorageSlipAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCurvatureRadius() {
		return minCurvatureRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCurvatureRadius(double newMinCurvatureRadius) {
		double oldMinCurvatureRadius = minCurvatureRadius;
		minCurvatureRadius = newMinCurvatureRadius;
		boolean oldMinCurvatureRadiusESet = minCurvatureRadiusESet;
		minCurvatureRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS, oldMinCurvatureRadius, minCurvatureRadius, !oldMinCurvatureRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinCurvatureRadius() {
		double oldMinCurvatureRadius = minCurvatureRadius;
		boolean oldMinCurvatureRadiusESet = minCurvatureRadiusESet;
		minCurvatureRadius = MIN_CURVATURE_RADIUS_EDEFAULT;
		minCurvatureRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS, oldMinCurvatureRadius, MIN_CURVATURE_RADIUS_EDEFAULT, oldMinCurvatureRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinCurvatureRadius() {
		return minCurvatureRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinCurvatureRadiusAsString() {
		return minCurvatureRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCurvatureRadiusAsString(String newMinCurvatureRadiusAsString) {
		String oldMinCurvatureRadiusAsString = minCurvatureRadiusAsString;
		minCurvatureRadiusAsString = newMinCurvatureRadiusAsString;
		boolean oldMinCurvatureRadiusAsStringESet = minCurvatureRadiusAsStringESet;
		minCurvatureRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING, oldMinCurvatureRadiusAsString, minCurvatureRadiusAsString, !oldMinCurvatureRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinCurvatureRadiusAsString() {
		String oldMinCurvatureRadiusAsString = minCurvatureRadiusAsString;
		boolean oldMinCurvatureRadiusAsStringESet = minCurvatureRadiusAsStringESet;
		minCurvatureRadiusAsString = MIN_CURVATURE_RADIUS_AS_STRING_EDEFAULT;
		minCurvatureRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING, oldMinCurvatureRadiusAsString, MIN_CURVATURE_RADIUS_AS_STRING_EDEFAULT, oldMinCurvatureRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinCurvatureRadiusAsString() {
		return minCurvatureRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE:
				return getPredefinedType();
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING:
				return getNominalDiameterAsString();
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA:
				return getCrossSectionArea();
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING:
				return getCrossSectionAreaAsString();
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE:
				return getTensionForce();
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING:
				return getTensionForceAsString();
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS:
				return getPreStress();
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING:
				return getPreStressAsString();
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT:
				return getFrictionCoefficient();
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING:
				return getFrictionCoefficientAsString();
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP:
				return getAnchorageSlip();
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING:
				return getAnchorageSlipAsString();
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS:
				return getMinCurvatureRadius();
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING:
				return getMinCurvatureRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE:
				setPredefinedType((IfcTendonTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING:
				setNominalDiameterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING:
				setCrossSectionAreaAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE:
				setTensionForce((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING:
				setTensionForceAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS:
				setPreStress((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING:
				setPreStressAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT:
				setFrictionCoefficient((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING:
				setFrictionCoefficientAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP:
				setAnchorageSlip((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING:
				setAnchorageSlipAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS:
				setMinCurvatureRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING:
				setMinCurvatureRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER:
				setNominalDiameter(NOMINAL_DIAMETER_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING:
				setNominalDiameterAsString(NOMINAL_DIAMETER_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA:
				setCrossSectionArea(CROSS_SECTION_AREA_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING:
				setCrossSectionAreaAsString(CROSS_SECTION_AREA_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE:
				unsetTensionForce();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING:
				unsetTensionForceAsString();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS:
				unsetPreStress();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING:
				unsetPreStressAsString();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT:
				unsetFrictionCoefficient();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING:
				unsetFrictionCoefficientAsString();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP:
				unsetAnchorageSlip();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING:
				unsetAnchorageSlipAsString();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS:
				unsetMinCurvatureRadius();
				return;
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING:
				unsetMinCurvatureRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_TENDON__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER:
				return nominalDiameter != NOMINAL_DIAMETER_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TENDON__NOMINAL_DIAMETER_AS_STRING:
				return NOMINAL_DIAMETER_AS_STRING_EDEFAULT == null ? nominalDiameterAsString != null : !NOMINAL_DIAMETER_AS_STRING_EDEFAULT.equals(nominalDiameterAsString);
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA:
				return crossSectionArea != CROSS_SECTION_AREA_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TENDON__CROSS_SECTION_AREA_AS_STRING:
				return CROSS_SECTION_AREA_AS_STRING_EDEFAULT == null ? crossSectionAreaAsString != null : !CROSS_SECTION_AREA_AS_STRING_EDEFAULT.equals(crossSectionAreaAsString);
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE:
				return isSetTensionForce();
			case Ifc2x3tc1Package.IFC_TENDON__TENSION_FORCE_AS_STRING:
				return isSetTensionForceAsString();
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS:
				return isSetPreStress();
			case Ifc2x3tc1Package.IFC_TENDON__PRE_STRESS_AS_STRING:
				return isSetPreStressAsString();
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT:
				return isSetFrictionCoefficient();
			case Ifc2x3tc1Package.IFC_TENDON__FRICTION_COEFFICIENT_AS_STRING:
				return isSetFrictionCoefficientAsString();
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP:
				return isSetAnchorageSlip();
			case Ifc2x3tc1Package.IFC_TENDON__ANCHORAGE_SLIP_AS_STRING:
				return isSetAnchorageSlipAsString();
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS:
				return isSetMinCurvatureRadius();
			case Ifc2x3tc1Package.IFC_TENDON__MIN_CURVATURE_RADIUS_AS_STRING:
				return isSetMinCurvatureRadiusAsString();
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
		result.append(" (PredefinedType: ");
		result.append(predefinedType);
		result.append(", NominalDiameter: ");
		result.append(nominalDiameter);
		result.append(", NominalDiameterAsString: ");
		result.append(nominalDiameterAsString);
		result.append(", CrossSectionArea: ");
		result.append(crossSectionArea);
		result.append(", CrossSectionAreaAsString: ");
		result.append(crossSectionAreaAsString);
		result.append(", TensionForce: ");
		if (tensionForceESet) result.append(tensionForce); else result.append("<unset>");
		result.append(", TensionForceAsString: ");
		if (tensionForceAsStringESet) result.append(tensionForceAsString); else result.append("<unset>");
		result.append(", PreStress: ");
		if (preStressESet) result.append(preStress); else result.append("<unset>");
		result.append(", PreStressAsString: ");
		if (preStressAsStringESet) result.append(preStressAsString); else result.append("<unset>");
		result.append(", FrictionCoefficient: ");
		if (frictionCoefficientESet) result.append(frictionCoefficient); else result.append("<unset>");
		result.append(", FrictionCoefficientAsString: ");
		if (frictionCoefficientAsStringESet) result.append(frictionCoefficientAsString); else result.append("<unset>");
		result.append(", AnchorageSlip: ");
		if (anchorageSlipESet) result.append(anchorageSlip); else result.append("<unset>");
		result.append(", AnchorageSlipAsString: ");
		if (anchorageSlipAsStringESet) result.append(anchorageSlipAsString); else result.append("<unset>");
		result.append(", MinCurvatureRadius: ");
		if (minCurvatureRadiusESet) result.append(minCurvatureRadius); else result.append("<unset>");
		result.append(", MinCurvatureRadiusAsString: ");
		if (minCurvatureRadiusAsStringESet) result.append(minCurvatureRadiusAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTendonImpl
