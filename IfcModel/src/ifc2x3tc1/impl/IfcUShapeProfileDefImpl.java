/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcUShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc UShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeWidthAsString <em>Flange Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeThicknessAsString <em>Flange Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getEdgeRadiusAsString <em>Edge Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getFlangeSlopeAsString <em>Flange Slope As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcUShapeProfileDefImpl#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcUShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcUShapeProfileDef {
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
	 * The default value of the '{@link #getFlangeWidth() <em>Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double FLANGE_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlangeWidth() <em>Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeWidth()
	 * @generated
	 * @ordered
	 */
	protected double flangeWidth = FLANGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlangeWidthAsString() <em>Flange Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FLANGE_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeWidthAsString() <em>Flange Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String flangeWidthAsString = FLANGE_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebThickness() <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double WEB_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWebThickness() <em>Web Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebThickness()
	 * @generated
	 * @ordered
	 */
	protected double webThickness = WEB_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebThicknessAsString() <em>Web Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebThicknessAsString() <em>Web Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String webThicknessAsString = WEB_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlangeThickness() <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double FLANGE_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlangeThickness() <em>Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected double flangeThickness = FLANGE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlangeThicknessAsString() <em>Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FLANGE_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeThicknessAsString() <em>Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String flangeThicknessAsString = FLANGE_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double FILLET_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected double filletRadius = FILLET_RADIUS_EDEFAULT;

	/**
	 * This is true if the Fillet Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filletRadiusESet;

	/**
	 * The default value of the '{@link #getFilletRadiusAsString() <em>Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FILLET_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilletRadiusAsString() <em>Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String filletRadiusAsString = FILLET_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Fillet Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filletRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getEdgeRadius() <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double EDGE_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEdgeRadius() <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected double edgeRadius = EDGE_RADIUS_EDEFAULT;

	/**
	 * This is true if the Edge Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeRadiusESet;

	/**
	 * The default value of the '{@link #getEdgeRadiusAsString() <em>Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String EDGE_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdgeRadiusAsString() <em>Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String edgeRadiusAsString = EDGE_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Edge Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean edgeRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getFlangeSlope() <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double FLANGE_SLOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlangeSlope() <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlope()
	 * @generated
	 * @ordered
	 */
	protected double flangeSlope = FLANGE_SLOPE_EDEFAULT;

	/**
	 * This is true if the Flange Slope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flangeSlopeESet;

	/**
	 * The default value of the '{@link #getFlangeSlopeAsString() <em>Flange Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FLANGE_SLOPE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeSlopeAsString() <em>Flange Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected String flangeSlopeAsString = FLANGE_SLOPE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Flange Slope As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flangeSlopeAsStringESet;

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
	protected IfcUShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcUShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING, oldDepthAsString, depthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeWidth() {
		return flangeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidth(double newFlangeWidth) {
		double oldFlangeWidth = flangeWidth;
		flangeWidth = newFlangeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH, oldFlangeWidth, flangeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeWidthAsString() {
		return flangeWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidthAsString(String newFlangeWidthAsString) {
		String oldFlangeWidthAsString = flangeWidthAsString;
		flangeWidthAsString = newFlangeWidthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING, oldFlangeWidthAsString, flangeWidthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebThickness() {
		return webThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(double newWebThickness) {
		double oldWebThickness = webThickness;
		webThickness = newWebThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS, oldWebThickness, webThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebThicknessAsString() {
		return webThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThicknessAsString(String newWebThicknessAsString) {
		String oldWebThicknessAsString = webThicknessAsString;
		webThicknessAsString = newWebThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, oldWebThicknessAsString, webThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeThickness() {
		return flangeThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(double newFlangeThickness) {
		double oldFlangeThickness = flangeThickness;
		flangeThickness = newFlangeThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS, oldFlangeThickness, flangeThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeThicknessAsString() {
		return flangeThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThicknessAsString(String newFlangeThicknessAsString) {
		String oldFlangeThicknessAsString = flangeThicknessAsString;
		flangeThicknessAsString = newFlangeThicknessAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING, oldFlangeThicknessAsString, flangeThicknessAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFilletRadius() {
		return filletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(double newFilletRadius) {
		double oldFilletRadius = filletRadius;
		filletRadius = newFilletRadius;
		boolean oldFilletRadiusESet = filletRadiusESet;
		filletRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius, !oldFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		double oldFilletRadius = filletRadius;
		boolean oldFilletRadiusESet = filletRadiusESet;
		filletRadius = FILLET_RADIUS_EDEFAULT;
		filletRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, FILLET_RADIUS_EDEFAULT, oldFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return filletRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilletRadiusAsString() {
		return filletRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadiusAsString(String newFilletRadiusAsString) {
		String oldFilletRadiusAsString = filletRadiusAsString;
		filletRadiusAsString = newFilletRadiusAsString;
		boolean oldFilletRadiusAsStringESet = filletRadiusAsStringESet;
		filletRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, filletRadiusAsString, !oldFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadiusAsString() {
		String oldFilletRadiusAsString = filletRadiusAsString;
		boolean oldFilletRadiusAsStringESet = filletRadiusAsStringESet;
		filletRadiusAsString = FILLET_RADIUS_AS_STRING_EDEFAULT;
		filletRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, FILLET_RADIUS_AS_STRING_EDEFAULT, oldFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadiusAsString() {
		return filletRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEdgeRadius() {
		return edgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRadius(double newEdgeRadius) {
		double oldEdgeRadius = edgeRadius;
		edgeRadius = newEdgeRadius;
		boolean oldEdgeRadiusESet = edgeRadiusESet;
		edgeRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, edgeRadius, !oldEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeRadius() {
		double oldEdgeRadius = edgeRadius;
		boolean oldEdgeRadiusESet = edgeRadiusESet;
		edgeRadius = EDGE_RADIUS_EDEFAULT;
		edgeRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, EDGE_RADIUS_EDEFAULT, oldEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeRadius() {
		return edgeRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdgeRadiusAsString() {
		return edgeRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRadiusAsString(String newEdgeRadiusAsString) {
		String oldEdgeRadiusAsString = edgeRadiusAsString;
		edgeRadiusAsString = newEdgeRadiusAsString;
		boolean oldEdgeRadiusAsStringESet = edgeRadiusAsStringESet;
		edgeRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING, oldEdgeRadiusAsString, edgeRadiusAsString, !oldEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdgeRadiusAsString() {
		String oldEdgeRadiusAsString = edgeRadiusAsString;
		boolean oldEdgeRadiusAsStringESet = edgeRadiusAsStringESet;
		edgeRadiusAsString = EDGE_RADIUS_AS_STRING_EDEFAULT;
		edgeRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING, oldEdgeRadiusAsString, EDGE_RADIUS_AS_STRING_EDEFAULT, oldEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdgeRadiusAsString() {
		return edgeRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeSlope() {
		return flangeSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(double newFlangeSlope) {
		double oldFlangeSlope = flangeSlope;
		flangeSlope = newFlangeSlope;
		boolean oldFlangeSlopeESet = flangeSlopeESet;
		flangeSlopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, flangeSlope, !oldFlangeSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlope() {
		double oldFlangeSlope = flangeSlope;
		boolean oldFlangeSlopeESet = flangeSlopeESet;
		flangeSlope = FLANGE_SLOPE_EDEFAULT;
		flangeSlopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, FLANGE_SLOPE_EDEFAULT, oldFlangeSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlope() {
		return flangeSlopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeSlopeAsString() {
		return flangeSlopeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlopeAsString(String newFlangeSlopeAsString) {
		String oldFlangeSlopeAsString = flangeSlopeAsString;
		flangeSlopeAsString = newFlangeSlopeAsString;
		boolean oldFlangeSlopeAsStringESet = flangeSlopeAsStringESet;
		flangeSlopeAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, oldFlangeSlopeAsString, flangeSlopeAsString, !oldFlangeSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlopeAsString() {
		String oldFlangeSlopeAsString = flangeSlopeAsString;
		boolean oldFlangeSlopeAsStringESet = flangeSlopeAsStringESet;
		flangeSlopeAsString = FLANGE_SLOPE_AS_STRING_EDEFAULT;
		flangeSlopeAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, oldFlangeSlopeAsString, FLANGE_SLOPE_AS_STRING_EDEFAULT, oldFlangeSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlopeAsString() {
		return flangeSlopeAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX, !oldCentreOfGravityInXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, CENTRE_OF_GRAVITY_IN_X_EDEFAULT, oldCentreOfGravityInXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, centreOfGravityInXAsString, !oldCentreOfGravityInXAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT, oldCentreOfGravityInXAsStringESet));
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
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return getDepthAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return getFlangeWidth();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				return getFlangeWidthAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				return getWebThickness();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return getWebThicknessAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return getFlangeThickness();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return getFlangeThicknessAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return getFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				return getEdgeRadius();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				return getEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return getFlangeSlope();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				return getFlangeSlopeAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				setFlangeWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				setFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				setEdgeRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				setFlangeSlopeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString(DEPTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth(FLANGE_WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				setFlangeWidthAsString(FLANGE_WIDTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness(WEB_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString(WEB_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness(FLANGE_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString(FLANGE_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				unsetFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				unsetFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				unsetEdgeRadius();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				unsetEdgeRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				unsetFlangeSlope();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				unsetFlangeSlopeAsString();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				unsetCentreOfGravityInX();
				return;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return DEPTH_AS_STRING_EDEFAULT == null ? depthAsString != null : !DEPTH_AS_STRING_EDEFAULT.equals(depthAsString);
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return flangeWidth != FLANGE_WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				return FLANGE_WIDTH_AS_STRING_EDEFAULT == null ? flangeWidthAsString != null : !FLANGE_WIDTH_AS_STRING_EDEFAULT.equals(flangeWidthAsString);
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				return webThickness != WEB_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return WEB_THICKNESS_AS_STRING_EDEFAULT == null ? webThicknessAsString != null : !WEB_THICKNESS_AS_STRING_EDEFAULT.equals(webThicknessAsString);
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return flangeThickness != FLANGE_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return FLANGE_THICKNESS_AS_STRING_EDEFAULT == null ? flangeThicknessAsString != null : !FLANGE_THICKNESS_AS_STRING_EDEFAULT.equals(flangeThicknessAsString);
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				return isSetFilletRadius();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return isSetFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				return isSetEdgeRadius();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				return isSetEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return isSetFlangeSlope();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				return isSetFlangeSlopeAsString();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return isSetCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
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
		result.append(", FlangeWidth: ");
		result.append(flangeWidth);
		result.append(", FlangeWidthAsString: ");
		result.append(flangeWidthAsString);
		result.append(", WebThickness: ");
		result.append(webThickness);
		result.append(", WebThicknessAsString: ");
		result.append(webThicknessAsString);
		result.append(", FlangeThickness: ");
		result.append(flangeThickness);
		result.append(", FlangeThicknessAsString: ");
		result.append(flangeThicknessAsString);
		result.append(", FilletRadius: ");
		if (filletRadiusESet) result.append(filletRadius); else result.append("<unset>");
		result.append(", FilletRadiusAsString: ");
		if (filletRadiusAsStringESet) result.append(filletRadiusAsString); else result.append("<unset>");
		result.append(", EdgeRadius: ");
		if (edgeRadiusESet) result.append(edgeRadius); else result.append("<unset>");
		result.append(", EdgeRadiusAsString: ");
		if (edgeRadiusAsStringESet) result.append(edgeRadiusAsString); else result.append("<unset>");
		result.append(", FlangeSlope: ");
		if (flangeSlopeESet) result.append(flangeSlope); else result.append("<unset>");
		result.append(", FlangeSlopeAsString: ");
		if (flangeSlopeAsStringESet) result.append(flangeSlopeAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInX: ");
		if (centreOfGravityInXESet) result.append(centreOfGravityInX); else result.append("<unset>");
		result.append(", CentreOfGravityInXAsString: ");
		if (centreOfGravityInXAsStringESet) result.append(centreOfGravityInXAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcUShapeProfileDefImpl
