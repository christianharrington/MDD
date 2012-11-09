/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcCShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getWidthAsString <em>Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getWallThicknessAsString <em>Wall Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getGirth <em>Girth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getGirthAsString <em>Girth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getInternalFilletRadiusAsString <em>Internal Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcCShapeProfileDefImpl#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcCShapeProfileDef {
	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected double depth = DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepthAsString() <em>Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDepthAsString() <em>Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String depthAsString = DEPTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthAsString() <em>Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidthAsString() <em>Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String widthAsString = WIDTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double WALL_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWallThickness() <em>Wall Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThickness()
	 * @generated
	 * @ordered
	 */
	protected double wallThickness = WALL_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WALL_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWallThicknessAsString() <em>Wall Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String wallThicknessAsString = WALL_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getGirth() <em>Girth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGirth()
	 * @generated
	 * @ordered
	 */
	protected static final double GIRTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGirth() <em>Girth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGirth()
	 * @generated
	 * @ordered
	 */
	protected double girth = GIRTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGirthAsString() <em>Girth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGirthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String GIRTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGirthAsString() <em>Girth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGirthAsString()
	 * @generated
	 * @ordered
	 */
	protected String girthAsString = GIRTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInternalFilletRadius() <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double INTERNAL_FILLET_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInternalFilletRadius() <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected double internalFilletRadius = INTERNAL_FILLET_RADIUS_EDEFAULT;

	/**
	 * This is true if the Internal Fillet Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean internalFilletRadiusESet;

	/**
	 * The default value of the '{@link #getInternalFilletRadiusAsString() <em>Internal Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNAL_FILLET_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalFilletRadiusAsString() <em>Internal Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String internalFilletRadiusAsString = INTERNAL_FILLET_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Internal Fillet Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean internalFilletRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRE_OF_GRAVITY_IN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected double centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInXESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInXAsString() <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInXAsString() <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected String centreOfGravityInXAsString = CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInXAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcCShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		double oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepthAsString() {
		return depthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthAsString(String newDepthAsString) {
		String oldDepthAsString = depthAsString;
		depthAsString = newDepthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING, oldDepthAsString, depthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidthAsString() {
		return widthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthAsString(String newWidthAsString) {
		String oldWidthAsString = widthAsString;
		widthAsString = newWidthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING, oldWidthAsString, widthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWallThickness() {
		return wallThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThickness(double newWallThickness) {
		double oldWallThickness = wallThickness;
		wallThickness = newWallThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS, oldWallThickness, wallThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWallThicknessAsString() {
		return wallThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWallThicknessAsString(String newWallThicknessAsString) {
		String oldWallThicknessAsString = wallThicknessAsString;
		wallThicknessAsString = newWallThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING, oldWallThicknessAsString, wallThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGirth() {
		return girth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGirth(double newGirth) {
		double oldGirth = girth;
		girth = newGirth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH, oldGirth, girth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGirthAsString() {
		return girthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGirthAsString(String newGirthAsString) {
		String oldGirthAsString = girthAsString;
		girthAsString = newGirthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING, oldGirthAsString, girthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInternalFilletRadius() {
		return internalFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFilletRadius(double newInternalFilletRadius) {
		double oldInternalFilletRadius = internalFilletRadius;
		internalFilletRadius = newInternalFilletRadius;
		boolean oldInternalFilletRadiusESet = internalFilletRadiusESet;
		internalFilletRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS, oldInternalFilletRadius, internalFilletRadius, !oldInternalFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalFilletRadius() {
		double oldInternalFilletRadius = internalFilletRadius;
		boolean oldInternalFilletRadiusESet = internalFilletRadiusESet;
		internalFilletRadius = INTERNAL_FILLET_RADIUS_EDEFAULT;
		internalFilletRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS, oldInternalFilletRadius, INTERNAL_FILLET_RADIUS_EDEFAULT, oldInternalFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalFilletRadius() {
		return internalFilletRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInternalFilletRadiusAsString() {
		return internalFilletRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFilletRadiusAsString(String newInternalFilletRadiusAsString) {
		String oldInternalFilletRadiusAsString = internalFilletRadiusAsString;
		internalFilletRadiusAsString = newInternalFilletRadiusAsString;
		boolean oldInternalFilletRadiusAsStringESet = internalFilletRadiusAsStringESet;
		internalFilletRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING, oldInternalFilletRadiusAsString, internalFilletRadiusAsString, !oldInternalFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInternalFilletRadiusAsString() {
		String oldInternalFilletRadiusAsString = internalFilletRadiusAsString;
		boolean oldInternalFilletRadiusAsStringESet = internalFilletRadiusAsStringESet;
		internalFilletRadiusAsString = INTERNAL_FILLET_RADIUS_AS_STRING_EDEFAULT;
		internalFilletRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING, oldInternalFilletRadiusAsString, INTERNAL_FILLET_RADIUS_AS_STRING_EDEFAULT, oldInternalFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInternalFilletRadiusAsString() {
		return internalFilletRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentreOfGravityInX() {
		return centreOfGravityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(double newCentreOfGravityInX) {
		double oldCentreOfGravityInX = centreOfGravityInX;
		centreOfGravityInX = newCentreOfGravityInX;
		boolean oldCentreOfGravityInXESet = centreOfGravityInXESet;
		centreOfGravityInXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX, !oldCentreOfGravityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		double oldCentreOfGravityInX = centreOfGravityInX;
		boolean oldCentreOfGravityInXESet = centreOfGravityInXESet;
		centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;
		centreOfGravityInXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, CENTRE_OF_GRAVITY_IN_X_EDEFAULT, oldCentreOfGravityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return centreOfGravityInXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInXAsString() {
		return centreOfGravityInXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInXAsString(String newCentreOfGravityInXAsString) {
		String oldCentreOfGravityInXAsString = centreOfGravityInXAsString;
		centreOfGravityInXAsString = newCentreOfGravityInXAsString;
		boolean oldCentreOfGravityInXAsStringESet = centreOfGravityInXAsStringESet;
		centreOfGravityInXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, centreOfGravityInXAsString, !oldCentreOfGravityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInXAsString() {
		String oldCentreOfGravityInXAsString = centreOfGravityInXAsString;
		boolean oldCentreOfGravityInXAsStringESet = centreOfGravityInXAsStringESet;
		centreOfGravityInXAsString = CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT;
		centreOfGravityInXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT, oldCentreOfGravityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInXAsString() {
		return centreOfGravityInXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return getDepthAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				return getWidth();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				return getWidthAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				return getWallThickness();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return getWallThicknessAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				return getGirth();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING:
				return getGirthAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				return getInternalFilletRadius();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING:
				return getInternalFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return getCentreOfGravityInXAsString();
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
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				setWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				setWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				setGirth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING:
				setGirthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				setInternalFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING:
				setInternalFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				setCentreOfGravityInXAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString(DEPTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				setWidthAsString(WIDTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness(WALL_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				setWallThicknessAsString(WALL_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				setGirth(GIRTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING:
				setGirthAsString(GIRTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				unsetInternalFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING:
				unsetInternalFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				unsetCentreOfGravityInX();
				return;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				unsetCentreOfGravityInXAsString();
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
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return DEPTH_AS_STRING_EDEFAULT == null ? depthAsString != null : !DEPTH_AS_STRING_EDEFAULT.equals(depthAsString);
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				return width != WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				return WIDTH_AS_STRING_EDEFAULT == null ? widthAsString != null : !WIDTH_AS_STRING_EDEFAULT.equals(widthAsString);
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				return wallThickness != WALL_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS_AS_STRING:
				return WALL_THICKNESS_AS_STRING_EDEFAULT == null ? wallThicknessAsString != null : !WALL_THICKNESS_AS_STRING_EDEFAULT.equals(wallThicknessAsString);
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				return girth != GIRTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__GIRTH_AS_STRING:
				return GIRTH_AS_STRING_EDEFAULT == null ? girthAsString != null : !GIRTH_AS_STRING_EDEFAULT.equals(girthAsString);
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				return isSetInternalFilletRadius();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS_AS_STRING:
				return isSetInternalFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return isSetCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return isSetCentreOfGravityInXAsString();
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
		result.append(" (Depth: ");
		result.append(depth);
		result.append(", DepthAsString: ");
		result.append(depthAsString);
		result.append(", Width: ");
		result.append(width);
		result.append(", WidthAsString: ");
		result.append(widthAsString);
		result.append(", WallThickness: ");
		result.append(wallThickness);
		result.append(", WallThicknessAsString: ");
		result.append(wallThicknessAsString);
		result.append(", Girth: ");
		result.append(girth);
		result.append(", GirthAsString: ");
		result.append(girthAsString);
		result.append(", InternalFilletRadius: ");
		if (internalFilletRadiusESet) result.append(internalFilletRadius); else result.append("<unset>");
		result.append(", InternalFilletRadiusAsString: ");
		if (internalFilletRadiusAsStringESet) result.append(internalFilletRadiusAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInX: ");
		if (centreOfGravityInXESet) result.append(centreOfGravityInX); else result.append("<unset>");
		result.append(", CentreOfGravityInXAsString: ");
		if (centreOfGravityInXAsStringESet) result.append(centreOfGravityInXAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcCShapeProfileDefImpl
