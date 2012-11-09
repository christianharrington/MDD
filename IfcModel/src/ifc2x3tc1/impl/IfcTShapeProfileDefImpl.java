/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcTShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeWidthAsString <em>Flange Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeThicknessAsString <em>Flange Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadiusAsString <em>Flange Edge Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebEdgeRadiusAsString <em>Web Edge Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebSlopeAsString <em>Web Slope As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeSlopeAsString <em>Flange Slope As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTShapeProfileDef {
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
	 * The default value of the '{@link #getFlangeEdgeRadius() <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double FLANGE_EDGE_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFlangeEdgeRadius() <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected double flangeEdgeRadius = FLANGE_EDGE_RADIUS_EDEFAULT;

	/**
	 * This is true if the Flange Edge Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flangeEdgeRadiusESet;

	/**
	 * The default value of the '{@link #getFlangeEdgeRadiusAsString() <em>Flange Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FLANGE_EDGE_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeEdgeRadiusAsString() <em>Flange Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String flangeEdgeRadiusAsString = FLANGE_EDGE_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Flange Edge Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flangeEdgeRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getWebEdgeRadius() <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double WEB_EDGE_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWebEdgeRadius() <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected double webEdgeRadius = WEB_EDGE_RADIUS_EDEFAULT;

	/**
	 * This is true if the Web Edge Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean webEdgeRadiusESet;

	/**
	 * The default value of the '{@link #getWebEdgeRadiusAsString() <em>Web Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_EDGE_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebEdgeRadiusAsString() <em>Web Edge Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String webEdgeRadiusAsString = WEB_EDGE_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Web Edge Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean webEdgeRadiusAsStringESet;

	/**
	 * The default value of the '{@link #getWebSlope() <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double WEB_SLOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWebSlope() <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlope()
	 * @generated
	 * @ordered
	 */
	protected double webSlope = WEB_SLOPE_EDEFAULT;

	/**
	 * This is true if the Web Slope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean webSlopeESet;

	/**
	 * The default value of the '{@link #getWebSlopeAsString() <em>Web Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_SLOPE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSlopeAsString() <em>Web Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected String webSlopeAsString = WEB_SLOPE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Web Slope As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean webSlopeAsStringESet;

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
	 * The default value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRE_OF_GRAVITY_IN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected double centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInYESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInYAsString() <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInYAsString() <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected String centreOfGravityInYAsString = CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInYAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcTShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING, oldDepthAsString, depthAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH, oldFlangeWidth, flangeWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING, oldFlangeWidthAsString, flangeWidthAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS, oldWebThickness, webThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, oldWebThicknessAsString, webThicknessAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS, oldFlangeThickness, flangeThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING, oldFlangeThicknessAsString, flangeThicknessAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius, !oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, FILLET_RADIUS_EDEFAULT, oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, filletRadiusAsString, !oldFilletRadiusAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, FILLET_RADIUS_AS_STRING_EDEFAULT, oldFilletRadiusAsStringESet));
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
	public double getFlangeEdgeRadius() {
		return flangeEdgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadius(double newFlangeEdgeRadius) {
		double oldFlangeEdgeRadius = flangeEdgeRadius;
		flangeEdgeRadius = newFlangeEdgeRadius;
		boolean oldFlangeEdgeRadiusESet = flangeEdgeRadiusESet;
		flangeEdgeRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS, oldFlangeEdgeRadius, flangeEdgeRadius, !oldFlangeEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeEdgeRadius() {
		double oldFlangeEdgeRadius = flangeEdgeRadius;
		boolean oldFlangeEdgeRadiusESet = flangeEdgeRadiusESet;
		flangeEdgeRadius = FLANGE_EDGE_RADIUS_EDEFAULT;
		flangeEdgeRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS, oldFlangeEdgeRadius, FLANGE_EDGE_RADIUS_EDEFAULT, oldFlangeEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeEdgeRadius() {
		return flangeEdgeRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeEdgeRadiusAsString() {
		return flangeEdgeRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadiusAsString(String newFlangeEdgeRadiusAsString) {
		String oldFlangeEdgeRadiusAsString = flangeEdgeRadiusAsString;
		flangeEdgeRadiusAsString = newFlangeEdgeRadiusAsString;
		boolean oldFlangeEdgeRadiusAsStringESet = flangeEdgeRadiusAsStringESet;
		flangeEdgeRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING, oldFlangeEdgeRadiusAsString, flangeEdgeRadiusAsString, !oldFlangeEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeEdgeRadiusAsString() {
		String oldFlangeEdgeRadiusAsString = flangeEdgeRadiusAsString;
		boolean oldFlangeEdgeRadiusAsStringESet = flangeEdgeRadiusAsStringESet;
		flangeEdgeRadiusAsString = FLANGE_EDGE_RADIUS_AS_STRING_EDEFAULT;
		flangeEdgeRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING, oldFlangeEdgeRadiusAsString, FLANGE_EDGE_RADIUS_AS_STRING_EDEFAULT, oldFlangeEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeEdgeRadiusAsString() {
		return flangeEdgeRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebEdgeRadius() {
		return webEdgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadius(double newWebEdgeRadius) {
		double oldWebEdgeRadius = webEdgeRadius;
		webEdgeRadius = newWebEdgeRadius;
		boolean oldWebEdgeRadiusESet = webEdgeRadiusESet;
		webEdgeRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS, oldWebEdgeRadius, webEdgeRadius, !oldWebEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebEdgeRadius() {
		double oldWebEdgeRadius = webEdgeRadius;
		boolean oldWebEdgeRadiusESet = webEdgeRadiusESet;
		webEdgeRadius = WEB_EDGE_RADIUS_EDEFAULT;
		webEdgeRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS, oldWebEdgeRadius, WEB_EDGE_RADIUS_EDEFAULT, oldWebEdgeRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebEdgeRadius() {
		return webEdgeRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebEdgeRadiusAsString() {
		return webEdgeRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadiusAsString(String newWebEdgeRadiusAsString) {
		String oldWebEdgeRadiusAsString = webEdgeRadiusAsString;
		webEdgeRadiusAsString = newWebEdgeRadiusAsString;
		boolean oldWebEdgeRadiusAsStringESet = webEdgeRadiusAsStringESet;
		webEdgeRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING, oldWebEdgeRadiusAsString, webEdgeRadiusAsString, !oldWebEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebEdgeRadiusAsString() {
		String oldWebEdgeRadiusAsString = webEdgeRadiusAsString;
		boolean oldWebEdgeRadiusAsStringESet = webEdgeRadiusAsStringESet;
		webEdgeRadiusAsString = WEB_EDGE_RADIUS_AS_STRING_EDEFAULT;
		webEdgeRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING, oldWebEdgeRadiusAsString, WEB_EDGE_RADIUS_AS_STRING_EDEFAULT, oldWebEdgeRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebEdgeRadiusAsString() {
		return webEdgeRadiusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebSlope() {
		return webSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlope(double newWebSlope) {
		double oldWebSlope = webSlope;
		webSlope = newWebSlope;
		boolean oldWebSlopeESet = webSlopeESet;
		webSlopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE, oldWebSlope, webSlope, !oldWebSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebSlope() {
		double oldWebSlope = webSlope;
		boolean oldWebSlopeESet = webSlopeESet;
		webSlope = WEB_SLOPE_EDEFAULT;
		webSlopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE, oldWebSlope, WEB_SLOPE_EDEFAULT, oldWebSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebSlope() {
		return webSlopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebSlopeAsString() {
		return webSlopeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlopeAsString(String newWebSlopeAsString) {
		String oldWebSlopeAsString = webSlopeAsString;
		webSlopeAsString = newWebSlopeAsString;
		boolean oldWebSlopeAsStringESet = webSlopeAsStringESet;
		webSlopeAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING, oldWebSlopeAsString, webSlopeAsString, !oldWebSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebSlopeAsString() {
		String oldWebSlopeAsString = webSlopeAsString;
		boolean oldWebSlopeAsStringESet = webSlopeAsStringESet;
		webSlopeAsString = WEB_SLOPE_AS_STRING_EDEFAULT;
		webSlopeAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING, oldWebSlopeAsString, WEB_SLOPE_AS_STRING_EDEFAULT, oldWebSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebSlopeAsString() {
		return webSlopeAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, flangeSlope, !oldFlangeSlopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, FLANGE_SLOPE_EDEFAULT, oldFlangeSlopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, oldFlangeSlopeAsString, flangeSlopeAsString, !oldFlangeSlopeAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, oldFlangeSlopeAsString, FLANGE_SLOPE_AS_STRING_EDEFAULT, oldFlangeSlopeAsStringESet));
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
	public double getCentreOfGravityInY() {
		return centreOfGravityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(double newCentreOfGravityInY) {
		double oldCentreOfGravityInY = centreOfGravityInY;
		centreOfGravityInY = newCentreOfGravityInY;
		boolean oldCentreOfGravityInYESet = centreOfGravityInYESet;
		centreOfGravityInYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY, !oldCentreOfGravityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		double oldCentreOfGravityInY = centreOfGravityInY;
		boolean oldCentreOfGravityInYESet = centreOfGravityInYESet;
		centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;
		centreOfGravityInYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, CENTRE_OF_GRAVITY_IN_Y_EDEFAULT, oldCentreOfGravityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return centreOfGravityInYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInYAsString() {
		return centreOfGravityInYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
		String oldCentreOfGravityInYAsString = centreOfGravityInYAsString;
		centreOfGravityInYAsString = newCentreOfGravityInYAsString;
		boolean oldCentreOfGravityInYAsStringESet = centreOfGravityInYAsStringESet;
		centreOfGravityInYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, centreOfGravityInYAsString, !oldCentreOfGravityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInYAsString() {
		String oldCentreOfGravityInYAsString = centreOfGravityInYAsString;
		boolean oldCentreOfGravityInYAsStringESet = centreOfGravityInYAsStringESet;
		centreOfGravityInYAsString = CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT;
		centreOfGravityInYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT, oldCentreOfGravityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInYAsString() {
		return centreOfGravityInYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return getDepthAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return getFlangeWidth();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				return getFlangeWidthAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				return getWebThickness();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return getWebThicknessAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return getFlangeThickness();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return getFlangeThicknessAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return getFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				return getFlangeEdgeRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING:
				return getFlangeEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				return getWebEdgeRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING:
				return getWebEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				return getWebSlope();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING:
				return getWebSlopeAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return getFlangeSlope();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				return getFlangeSlopeAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				return getCentreOfGravityInYAsString();
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
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				setFlangeWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				setFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				setFlangeEdgeRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING:
				setFlangeEdgeRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				setWebEdgeRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING:
				setWebEdgeRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				setWebSlope((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING:
				setWebSlopeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				setFlangeSlopeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				setCentreOfGravityInYAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString(DEPTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth(FLANGE_WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				setFlangeWidthAsString(FLANGE_WIDTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness(WEB_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString(WEB_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness(FLANGE_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString(FLANGE_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				unsetFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				unsetFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				unsetFlangeEdgeRadius();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING:
				unsetFlangeEdgeRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				unsetWebEdgeRadius();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING:
				unsetWebEdgeRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				unsetWebSlope();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING:
				unsetWebSlopeAsString();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				unsetFlangeSlope();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				unsetFlangeSlopeAsString();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				unsetCentreOfGravityInY();
				return;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				unsetCentreOfGravityInYAsString();
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
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return DEPTH_AS_STRING_EDEFAULT == null ? depthAsString != null : !DEPTH_AS_STRING_EDEFAULT.equals(depthAsString);
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return flangeWidth != FLANGE_WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING:
				return FLANGE_WIDTH_AS_STRING_EDEFAULT == null ? flangeWidthAsString != null : !FLANGE_WIDTH_AS_STRING_EDEFAULT.equals(flangeWidthAsString);
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				return webThickness != WEB_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return WEB_THICKNESS_AS_STRING_EDEFAULT == null ? webThicknessAsString != null : !WEB_THICKNESS_AS_STRING_EDEFAULT.equals(webThicknessAsString);
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return flangeThickness != FLANGE_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return FLANGE_THICKNESS_AS_STRING_EDEFAULT == null ? flangeThicknessAsString != null : !FLANGE_THICKNESS_AS_STRING_EDEFAULT.equals(flangeThicknessAsString);
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return isSetFilletRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return isSetFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				return isSetFlangeEdgeRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING:
				return isSetFlangeEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				return isSetWebEdgeRadius();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING:
				return isSetWebEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				return isSetWebSlope();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING:
				return isSetWebSlopeAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return isSetFlangeSlope();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING:
				return isSetFlangeSlopeAsString();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return isSetCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				return isSetCentreOfGravityInYAsString();
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
		result.append(", FlangeEdgeRadius: ");
		if (flangeEdgeRadiusESet) result.append(flangeEdgeRadius); else result.append("<unset>");
		result.append(", FlangeEdgeRadiusAsString: ");
		if (flangeEdgeRadiusAsStringESet) result.append(flangeEdgeRadiusAsString); else result.append("<unset>");
		result.append(", WebEdgeRadius: ");
		if (webEdgeRadiusESet) result.append(webEdgeRadius); else result.append("<unset>");
		result.append(", WebEdgeRadiusAsString: ");
		if (webEdgeRadiusAsStringESet) result.append(webEdgeRadiusAsString); else result.append("<unset>");
		result.append(", WebSlope: ");
		if (webSlopeESet) result.append(webSlope); else result.append("<unset>");
		result.append(", WebSlopeAsString: ");
		if (webSlopeAsStringESet) result.append(webSlopeAsString); else result.append("<unset>");
		result.append(", FlangeSlope: ");
		if (flangeSlopeESet) result.append(flangeSlope); else result.append("<unset>");
		result.append(", FlangeSlopeAsString: ");
		if (flangeSlopeAsStringESet) result.append(flangeSlopeAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInY: ");
		if (centreOfGravityInYESet) result.append(centreOfGravityInY); else result.append("<unset>");
		result.append(", CentreOfGravityInYAsString: ");
		if (centreOfGravityInYAsStringESet) result.append(centreOfGravityInYAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcTShapeProfileDefImpl
