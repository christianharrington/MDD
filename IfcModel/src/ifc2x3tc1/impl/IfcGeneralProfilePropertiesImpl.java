/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGeneralProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getPhysicalWeight <em>Physical Weight</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getPhysicalWeightAsString <em>Physical Weight As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getPerimeterAsString <em>Perimeter As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getMinimumPlateThicknessAsString <em>Minimum Plate Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getMaximumPlateThicknessAsString <em>Maximum Plate Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralProfilePropertiesImpl#getCrossSectionAreaAsString <em>Cross Section Area As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeneralProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcGeneralProfileProperties {
	/**
	 * The default value of the '{@link #getPhysicalWeight() <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double PHYSICAL_WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPhysicalWeight() <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeight()
	 * @generated
	 * @ordered
	 */
	protected double physicalWeight = PHYSICAL_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Physical Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalWeightESet;

	/**
	 * The default value of the '{@link #getPhysicalWeightAsString() <em>Physical Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_WEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalWeightAsString() <em>Physical Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String physicalWeightAsString = PHYSICAL_WEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Physical Weight As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean physicalWeightAsStringESet;

	/**
	 * The default value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected double perimeter = PERIMETER_EDEFAULT;

	/**
	 * This is true if the Perimeter attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perimeterESet;

	/**
	 * The default value of the '{@link #getPerimeterAsString() <em>Perimeter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeterAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PERIMETER_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerimeterAsString() <em>Perimeter As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeterAsString()
	 * @generated
	 * @ordered
	 */
	protected String perimeterAsString = PERIMETER_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Perimeter As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean perimeterAsStringESet;

	/**
	 * The default value of the '{@link #getMinimumPlateThickness() <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_PLATE_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumPlateThickness() <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected double minimumPlateThickness = MINIMUM_PLATE_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Minimum Plate Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumPlateThicknessESet;

	/**
	 * The default value of the '{@link #getMinimumPlateThicknessAsString() <em>Minimum Plate Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumPlateThicknessAsString() <em>Minimum Plate Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String minimumPlateThicknessAsString = MINIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Minimum Plate Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumPlateThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getMaximumPlateThickness() <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_PLATE_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumPlateThickness() <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected double maximumPlateThickness = MAXIMUM_PLATE_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Maximum Plate Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumPlateThicknessESet;

	/**
	 * The default value of the '{@link #getMaximumPlateThicknessAsString() <em>Maximum Plate Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPlateThicknessAsString() <em>Maximum Plate Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String maximumPlateThicknessAsString = MAXIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Maximum Plate Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumPlateThicknessAsStringESet;

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
	 * This is true if the Cross Section Area attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crossSectionAreaESet;

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
	 * This is true if the Cross Section Area As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean crossSectionAreaAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcGeneralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPhysicalWeight() {
		return physicalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalWeight(double newPhysicalWeight) {
		double oldPhysicalWeight = physicalWeight;
		physicalWeight = newPhysicalWeight;
		boolean oldPhysicalWeightESet = physicalWeightESet;
		physicalWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT, oldPhysicalWeight, physicalWeight, !oldPhysicalWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhysicalWeight() {
		double oldPhysicalWeight = physicalWeight;
		boolean oldPhysicalWeightESet = physicalWeightESet;
		physicalWeight = PHYSICAL_WEIGHT_EDEFAULT;
		physicalWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT, oldPhysicalWeight, PHYSICAL_WEIGHT_EDEFAULT, oldPhysicalWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhysicalWeight() {
		return physicalWeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysicalWeightAsString() {
		return physicalWeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalWeightAsString(String newPhysicalWeightAsString) {
		String oldPhysicalWeightAsString = physicalWeightAsString;
		physicalWeightAsString = newPhysicalWeightAsString;
		boolean oldPhysicalWeightAsStringESet = physicalWeightAsStringESet;
		physicalWeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING, oldPhysicalWeightAsString, physicalWeightAsString, !oldPhysicalWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhysicalWeightAsString() {
		String oldPhysicalWeightAsString = physicalWeightAsString;
		boolean oldPhysicalWeightAsStringESet = physicalWeightAsStringESet;
		physicalWeightAsString = PHYSICAL_WEIGHT_AS_STRING_EDEFAULT;
		physicalWeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING, oldPhysicalWeightAsString, PHYSICAL_WEIGHT_AS_STRING_EDEFAULT, oldPhysicalWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhysicalWeightAsString() {
		return physicalWeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPerimeter() {
		return perimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeter(double newPerimeter) {
		double oldPerimeter = perimeter;
		perimeter = newPerimeter;
		boolean oldPerimeterESet = perimeterESet;
		perimeterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER, oldPerimeter, perimeter, !oldPerimeterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerimeter() {
		double oldPerimeter = perimeter;
		boolean oldPerimeterESet = perimeterESet;
		perimeter = PERIMETER_EDEFAULT;
		perimeterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER, oldPerimeter, PERIMETER_EDEFAULT, oldPerimeterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerimeter() {
		return perimeterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPerimeterAsString() {
		return perimeterAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeterAsString(String newPerimeterAsString) {
		String oldPerimeterAsString = perimeterAsString;
		perimeterAsString = newPerimeterAsString;
		boolean oldPerimeterAsStringESet = perimeterAsStringESet;
		perimeterAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING, oldPerimeterAsString, perimeterAsString, !oldPerimeterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPerimeterAsString() {
		String oldPerimeterAsString = perimeterAsString;
		boolean oldPerimeterAsStringESet = perimeterAsStringESet;
		perimeterAsString = PERIMETER_AS_STRING_EDEFAULT;
		perimeterAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING, oldPerimeterAsString, PERIMETER_AS_STRING_EDEFAULT, oldPerimeterAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPerimeterAsString() {
		return perimeterAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumPlateThickness() {
		return minimumPlateThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumPlateThickness(double newMinimumPlateThickness) {
		double oldMinimumPlateThickness = minimumPlateThickness;
		minimumPlateThickness = newMinimumPlateThickness;
		boolean oldMinimumPlateThicknessESet = minimumPlateThicknessESet;
		minimumPlateThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS, oldMinimumPlateThickness, minimumPlateThickness, !oldMinimumPlateThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumPlateThickness() {
		double oldMinimumPlateThickness = minimumPlateThickness;
		boolean oldMinimumPlateThicknessESet = minimumPlateThicknessESet;
		minimumPlateThickness = MINIMUM_PLATE_THICKNESS_EDEFAULT;
		minimumPlateThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS, oldMinimumPlateThickness, MINIMUM_PLATE_THICKNESS_EDEFAULT, oldMinimumPlateThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumPlateThickness() {
		return minimumPlateThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumPlateThicknessAsString() {
		return minimumPlateThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumPlateThicknessAsString(String newMinimumPlateThicknessAsString) {
		String oldMinimumPlateThicknessAsString = minimumPlateThicknessAsString;
		minimumPlateThicknessAsString = newMinimumPlateThicknessAsString;
		boolean oldMinimumPlateThicknessAsStringESet = minimumPlateThicknessAsStringESet;
		minimumPlateThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING, oldMinimumPlateThicknessAsString, minimumPlateThicknessAsString, !oldMinimumPlateThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumPlateThicknessAsString() {
		String oldMinimumPlateThicknessAsString = minimumPlateThicknessAsString;
		boolean oldMinimumPlateThicknessAsStringESet = minimumPlateThicknessAsStringESet;
		minimumPlateThicknessAsString = MINIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT;
		minimumPlateThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING, oldMinimumPlateThicknessAsString, MINIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT, oldMinimumPlateThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumPlateThicknessAsString() {
		return minimumPlateThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumPlateThickness() {
		return maximumPlateThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPlateThickness(double newMaximumPlateThickness) {
		double oldMaximumPlateThickness = maximumPlateThickness;
		maximumPlateThickness = newMaximumPlateThickness;
		boolean oldMaximumPlateThicknessESet = maximumPlateThicknessESet;
		maximumPlateThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS, oldMaximumPlateThickness, maximumPlateThickness, !oldMaximumPlateThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPlateThickness() {
		double oldMaximumPlateThickness = maximumPlateThickness;
		boolean oldMaximumPlateThicknessESet = maximumPlateThicknessESet;
		maximumPlateThickness = MAXIMUM_PLATE_THICKNESS_EDEFAULT;
		maximumPlateThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS, oldMaximumPlateThickness, MAXIMUM_PLATE_THICKNESS_EDEFAULT, oldMaximumPlateThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPlateThickness() {
		return maximumPlateThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumPlateThicknessAsString() {
		return maximumPlateThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPlateThicknessAsString(String newMaximumPlateThicknessAsString) {
		String oldMaximumPlateThicknessAsString = maximumPlateThicknessAsString;
		maximumPlateThicknessAsString = newMaximumPlateThicknessAsString;
		boolean oldMaximumPlateThicknessAsStringESet = maximumPlateThicknessAsStringESet;
		maximumPlateThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING, oldMaximumPlateThicknessAsString, maximumPlateThicknessAsString, !oldMaximumPlateThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumPlateThicknessAsString() {
		String oldMaximumPlateThicknessAsString = maximumPlateThicknessAsString;
		boolean oldMaximumPlateThicknessAsStringESet = maximumPlateThicknessAsStringESet;
		maximumPlateThicknessAsString = MAXIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT;
		maximumPlateThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING, oldMaximumPlateThicknessAsString, MAXIMUM_PLATE_THICKNESS_AS_STRING_EDEFAULT, oldMaximumPlateThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumPlateThicknessAsString() {
		return maximumPlateThicknessAsStringESet;
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
		boolean oldCrossSectionAreaESet = crossSectionAreaESet;
		crossSectionAreaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea, !oldCrossSectionAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossSectionArea() {
		double oldCrossSectionArea = crossSectionArea;
		boolean oldCrossSectionAreaESet = crossSectionAreaESet;
		crossSectionArea = CROSS_SECTION_AREA_EDEFAULT;
		crossSectionAreaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA, oldCrossSectionArea, CROSS_SECTION_AREA_EDEFAULT, oldCrossSectionAreaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossSectionArea() {
		return crossSectionAreaESet;
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
		boolean oldCrossSectionAreaAsStringESet = crossSectionAreaAsStringESet;
		crossSectionAreaAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING, oldCrossSectionAreaAsString, crossSectionAreaAsString, !oldCrossSectionAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCrossSectionAreaAsString() {
		String oldCrossSectionAreaAsString = crossSectionAreaAsString;
		boolean oldCrossSectionAreaAsStringESet = crossSectionAreaAsStringESet;
		crossSectionAreaAsString = CROSS_SECTION_AREA_AS_STRING_EDEFAULT;
		crossSectionAreaAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING, oldCrossSectionAreaAsString, CROSS_SECTION_AREA_AS_STRING_EDEFAULT, oldCrossSectionAreaAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCrossSectionAreaAsString() {
		return crossSectionAreaAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				return getPhysicalWeight();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING:
				return getPhysicalWeightAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				return getPerimeter();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING:
				return getPerimeterAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				return getMinimumPlateThickness();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING:
				return getMinimumPlateThicknessAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				return getMaximumPlateThickness();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING:
				return getMaximumPlateThicknessAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				return getCrossSectionArea();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING:
				return getCrossSectionAreaAsString();
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
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				setPhysicalWeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING:
				setPhysicalWeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				setPerimeter((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING:
				setPerimeterAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				setMinimumPlateThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING:
				setMinimumPlateThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				setMaximumPlateThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING:
				setMaximumPlateThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING:
				setCrossSectionAreaAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				unsetPhysicalWeight();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING:
				unsetPhysicalWeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				unsetPerimeter();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING:
				unsetPerimeterAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				unsetMinimumPlateThickness();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING:
				unsetMinimumPlateThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				unsetMaximumPlateThickness();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING:
				unsetMaximumPlateThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				unsetCrossSectionArea();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING:
				unsetCrossSectionAreaAsString();
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
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				return isSetPhysicalWeight();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT_AS_STRING:
				return isSetPhysicalWeightAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				return isSetPerimeter();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER_AS_STRING:
				return isSetPerimeterAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				return isSetMinimumPlateThickness();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS_AS_STRING:
				return isSetMinimumPlateThicknessAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				return isSetMaximumPlateThickness();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS_AS_STRING:
				return isSetMaximumPlateThicknessAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				return isSetCrossSectionArea();
			case Ifc2x3tc1Package.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA_AS_STRING:
				return isSetCrossSectionAreaAsString();
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
		result.append(" (PhysicalWeight: ");
		if (physicalWeightESet) result.append(physicalWeight); else result.append("<unset>");
		result.append(", PhysicalWeightAsString: ");
		if (physicalWeightAsStringESet) result.append(physicalWeightAsString); else result.append("<unset>");
		result.append(", Perimeter: ");
		if (perimeterESet) result.append(perimeter); else result.append("<unset>");
		result.append(", PerimeterAsString: ");
		if (perimeterAsStringESet) result.append(perimeterAsString); else result.append("<unset>");
		result.append(", MinimumPlateThickness: ");
		if (minimumPlateThicknessESet) result.append(minimumPlateThickness); else result.append("<unset>");
		result.append(", MinimumPlateThicknessAsString: ");
		if (minimumPlateThicknessAsStringESet) result.append(minimumPlateThicknessAsString); else result.append("<unset>");
		result.append(", MaximumPlateThickness: ");
		if (maximumPlateThicknessESet) result.append(maximumPlateThickness); else result.append("<unset>");
		result.append(", MaximumPlateThicknessAsString: ");
		if (maximumPlateThicknessAsStringESet) result.append(maximumPlateThicknessAsString); else result.append("<unset>");
		result.append(", CrossSectionArea: ");
		if (crossSectionAreaESet) result.append(crossSectionArea); else result.append("<unset>");
		result.append(", CrossSectionAreaAsString: ");
		if (crossSectionAreaAsStringESet) result.append(crossSectionAreaAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcGeneralProfilePropertiesImpl
