/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcRibPlateDirectionEnum;
import ifc2x3tc1.IfcRibPlateProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rib Plate Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibHeight <em>Rib Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibHeightAsString <em>Rib Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibWidth <em>Rib Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibWidthAsString <em>Rib Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibSpacing <em>Rib Spacing</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getRibSpacingAsString <em>Rib Spacing As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcRibPlateProfilePropertiesImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRibPlateProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcRibPlateProfileProperties {
	/**
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected double thickness = THICKNESS_EDEFAULT;

	/**
	 * This is true if the Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thicknessESet;

	/**
	 * The default value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThicknessAsString() <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String thicknessAsString = THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean thicknessAsStringESet;

	/**
	 * The default value of the '{@link #getRibHeight() <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double RIB_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRibHeight() <em>Rib Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeight()
	 * @generated
	 * @ordered
	 */
	protected double ribHeight = RIB_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Rib Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribHeightESet;

	/**
	 * The default value of the '{@link #getRibHeightAsString() <em>Rib Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RIB_HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibHeightAsString() <em>Rib Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String ribHeightAsString = RIB_HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rib Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribHeightAsStringESet;

	/**
	 * The default value of the '{@link #getRibWidth() <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double RIB_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRibWidth() <em>Rib Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidth()
	 * @generated
	 * @ordered
	 */
	protected double ribWidth = RIB_WIDTH_EDEFAULT;

	/**
	 * This is true if the Rib Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribWidthESet;

	/**
	 * The default value of the '{@link #getRibWidthAsString() <em>Rib Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RIB_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibWidthAsString() <em>Rib Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String ribWidthAsString = RIB_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rib Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribWidthAsStringESet;

	/**
	 * The default value of the '{@link #getRibSpacing() <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final double RIB_SPACING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRibSpacing() <em>Rib Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacing()
	 * @generated
	 * @ordered
	 */
	protected double ribSpacing = RIB_SPACING_EDEFAULT;

	/**
	 * This is true if the Rib Spacing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribSpacingESet;

	/**
	 * The default value of the '{@link #getRibSpacingAsString() <em>Rib Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String RIB_SPACING_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRibSpacingAsString() <em>Rib Spacing As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRibSpacingAsString()
	 * @generated
	 * @ordered
	 */
	protected String ribSpacingAsString = RIB_SPACING_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rib Spacing As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ribSpacingAsStringESet;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IfcRibPlateDirectionEnum DIRECTION_EDEFAULT = IfcRibPlateDirectionEnum.NULL;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcRibPlateDirectionEnum direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRibPlateProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcRibPlateProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(double newThickness) {
		double oldThickness = thickness;
		thickness = newThickness;
		boolean oldThicknessESet = thicknessESet;
		thicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS, oldThickness, thickness, !oldThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThickness() {
		double oldThickness = thickness;
		boolean oldThicknessESet = thicknessESet;
		thickness = THICKNESS_EDEFAULT;
		thicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS, oldThickness, THICKNESS_EDEFAULT, oldThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThickness() {
		return thicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getThicknessAsString() {
		return thicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThicknessAsString(String newThicknessAsString) {
		String oldThicknessAsString = thicknessAsString;
		thicknessAsString = newThicknessAsString;
		boolean oldThicknessAsStringESet = thicknessAsStringESet;
		thicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING, oldThicknessAsString, thicknessAsString, !oldThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThicknessAsString() {
		String oldThicknessAsString = thicknessAsString;
		boolean oldThicknessAsStringESet = thicknessAsStringESet;
		thicknessAsString = THICKNESS_AS_STRING_EDEFAULT;
		thicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING, oldThicknessAsString, THICKNESS_AS_STRING_EDEFAULT, oldThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThicknessAsString() {
		return thicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRibHeight() {
		return ribHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibHeight(double newRibHeight) {
		double oldRibHeight = ribHeight;
		ribHeight = newRibHeight;
		boolean oldRibHeightESet = ribHeightESet;
		ribHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT, oldRibHeight, ribHeight, !oldRibHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibHeight() {
		double oldRibHeight = ribHeight;
		boolean oldRibHeightESet = ribHeightESet;
		ribHeight = RIB_HEIGHT_EDEFAULT;
		ribHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT, oldRibHeight, RIB_HEIGHT_EDEFAULT, oldRibHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibHeight() {
		return ribHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRibHeightAsString() {
		return ribHeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibHeightAsString(String newRibHeightAsString) {
		String oldRibHeightAsString = ribHeightAsString;
		ribHeightAsString = newRibHeightAsString;
		boolean oldRibHeightAsStringESet = ribHeightAsStringESet;
		ribHeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING, oldRibHeightAsString, ribHeightAsString, !oldRibHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibHeightAsString() {
		String oldRibHeightAsString = ribHeightAsString;
		boolean oldRibHeightAsStringESet = ribHeightAsStringESet;
		ribHeightAsString = RIB_HEIGHT_AS_STRING_EDEFAULT;
		ribHeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING, oldRibHeightAsString, RIB_HEIGHT_AS_STRING_EDEFAULT, oldRibHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibHeightAsString() {
		return ribHeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRibWidth() {
		return ribWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibWidth(double newRibWidth) {
		double oldRibWidth = ribWidth;
		ribWidth = newRibWidth;
		boolean oldRibWidthESet = ribWidthESet;
		ribWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH, oldRibWidth, ribWidth, !oldRibWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibWidth() {
		double oldRibWidth = ribWidth;
		boolean oldRibWidthESet = ribWidthESet;
		ribWidth = RIB_WIDTH_EDEFAULT;
		ribWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH, oldRibWidth, RIB_WIDTH_EDEFAULT, oldRibWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibWidth() {
		return ribWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRibWidthAsString() {
		return ribWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibWidthAsString(String newRibWidthAsString) {
		String oldRibWidthAsString = ribWidthAsString;
		ribWidthAsString = newRibWidthAsString;
		boolean oldRibWidthAsStringESet = ribWidthAsStringESet;
		ribWidthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING, oldRibWidthAsString, ribWidthAsString, !oldRibWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibWidthAsString() {
		String oldRibWidthAsString = ribWidthAsString;
		boolean oldRibWidthAsStringESet = ribWidthAsStringESet;
		ribWidthAsString = RIB_WIDTH_AS_STRING_EDEFAULT;
		ribWidthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING, oldRibWidthAsString, RIB_WIDTH_AS_STRING_EDEFAULT, oldRibWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibWidthAsString() {
		return ribWidthAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRibSpacing() {
		return ribSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibSpacing(double newRibSpacing) {
		double oldRibSpacing = ribSpacing;
		ribSpacing = newRibSpacing;
		boolean oldRibSpacingESet = ribSpacingESet;
		ribSpacingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING, oldRibSpacing, ribSpacing, !oldRibSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibSpacing() {
		double oldRibSpacing = ribSpacing;
		boolean oldRibSpacingESet = ribSpacingESet;
		ribSpacing = RIB_SPACING_EDEFAULT;
		ribSpacingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING, oldRibSpacing, RIB_SPACING_EDEFAULT, oldRibSpacingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibSpacing() {
		return ribSpacingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRibSpacingAsString() {
		return ribSpacingAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRibSpacingAsString(String newRibSpacingAsString) {
		String oldRibSpacingAsString = ribSpacingAsString;
		ribSpacingAsString = newRibSpacingAsString;
		boolean oldRibSpacingAsStringESet = ribSpacingAsStringESet;
		ribSpacingAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING, oldRibSpacingAsString, ribSpacingAsString, !oldRibSpacingAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRibSpacingAsString() {
		String oldRibSpacingAsString = ribSpacingAsString;
		boolean oldRibSpacingAsStringESet = ribSpacingAsStringESet;
		ribSpacingAsString = RIB_SPACING_AS_STRING_EDEFAULT;
		ribSpacingAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING, oldRibSpacingAsString, RIB_SPACING_AS_STRING_EDEFAULT, oldRibSpacingAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRibSpacingAsString() {
		return ribSpacingAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRibPlateDirectionEnum getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(IfcRibPlateDirectionEnum newDirection) {
		IfcRibPlateDirectionEnum oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				return getThickness();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING:
				return getThicknessAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				return getRibHeight();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING:
				return getRibHeightAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				return getRibWidth();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING:
				return getRibWidthAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				return getRibSpacing();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING:
				return getRibSpacingAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				return getDirection();
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
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				setThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING:
				setThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				setRibHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING:
				setRibHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				setRibWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING:
				setRibWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				setRibSpacing((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING:
				setRibSpacingAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				setDirection((IfcRibPlateDirectionEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				unsetThickness();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING:
				unsetThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				unsetRibHeight();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING:
				unsetRibHeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				unsetRibWidth();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING:
				unsetRibWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				unsetRibSpacing();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING:
				unsetRibSpacingAsString();
				return;
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS:
				return isSetThickness();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__THICKNESS_AS_STRING:
				return isSetThicknessAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT:
				return isSetRibHeight();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_HEIGHT_AS_STRING:
				return isSetRibHeightAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH:
				return isSetRibWidth();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_WIDTH_AS_STRING:
				return isSetRibWidthAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING:
				return isSetRibSpacing();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__RIB_SPACING_AS_STRING:
				return isSetRibSpacingAsString();
			case Ifc2x3tc1Package.IFC_RIB_PLATE_PROFILE_PROPERTIES__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (Thickness: ");
		if (thicknessESet) result.append(thickness); else result.append("<unset>");
		result.append(", ThicknessAsString: ");
		if (thicknessAsStringESet) result.append(thicknessAsString); else result.append("<unset>");
		result.append(", RibHeight: ");
		if (ribHeightESet) result.append(ribHeight); else result.append("<unset>");
		result.append(", RibHeightAsString: ");
		if (ribHeightAsStringESet) result.append(ribHeightAsString); else result.append("<unset>");
		result.append(", RibWidth: ");
		if (ribWidthESet) result.append(ribWidth); else result.append("<unset>");
		result.append(", RibWidthAsString: ");
		if (ribWidthAsStringESet) result.append(ribWidthAsString); else result.append("<unset>");
		result.append(", RibSpacing: ");
		if (ribSpacingESet) result.append(ribSpacing); else result.append("<unset>");
		result.append(", RibSpacingAsString: ");
		if (ribSpacingAsStringESet) result.append(ribSpacingAsString); else result.append("<unset>");
		result.append(", Direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //IfcRibPlateProfilePropertiesImpl
