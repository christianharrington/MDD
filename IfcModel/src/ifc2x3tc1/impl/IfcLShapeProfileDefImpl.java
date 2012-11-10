/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc LShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getWidthAsString <em>Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getThicknessAsString <em>Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getEdgeRadiusAsString <em>Edge Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getLegSlope <em>Leg Slope</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getLegSlopeAsString <em>Leg Slope As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcLShapeProfileDef {
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
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

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
	 * This is true if the Width As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthAsStringESet;

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
	 * The default value of the '{@link #getLegSlope() <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double LEG_SLOPE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLegSlope() <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlope()
	 * @generated
	 * @ordered
	 */
	protected double legSlope = LEG_SLOPE_EDEFAULT;

	/**
	 * This is true if the Leg Slope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legSlopeESet;

	/**
	 * The default value of the '{@link #getLegSlopeAsString() <em>Leg Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LEG_SLOPE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegSlopeAsString() <em>Leg Slope As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlopeAsString()
	 * @generated
	 * @ordered
	 */
	protected String legSlopeAsString = LEG_SLOPE_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Leg Slope As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean legSlopeAsStringESet;

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
	protected IfcLShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING, oldDepthAsString, depthAsString));
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
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		double oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
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
		boolean oldWidthAsStringESet = widthAsStringESet;
		widthAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING, oldWidthAsString, widthAsString, !oldWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidthAsString() {
		String oldWidthAsString = widthAsString;
		boolean oldWidthAsStringESet = widthAsStringESet;
		widthAsString = WIDTH_AS_STRING_EDEFAULT;
		widthAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING, oldWidthAsString, WIDTH_AS_STRING_EDEFAULT, oldWidthAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidthAsString() {
		return widthAsStringESet;
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS, oldThickness, thickness));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING, oldThicknessAsString, thicknessAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius, !oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, FILLET_RADIUS_EDEFAULT, oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, filletRadiusAsString, !oldFilletRadiusAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, FILLET_RADIUS_AS_STRING_EDEFAULT, oldFilletRadiusAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, edgeRadius, !oldEdgeRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, EDGE_RADIUS_EDEFAULT, oldEdgeRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING, oldEdgeRadiusAsString, edgeRadiusAsString, !oldEdgeRadiusAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING, oldEdgeRadiusAsString, EDGE_RADIUS_AS_STRING_EDEFAULT, oldEdgeRadiusAsStringESet));
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
	public double getLegSlope() {
		return legSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegSlope(double newLegSlope) {
		double oldLegSlope = legSlope;
		legSlope = newLegSlope;
		boolean oldLegSlopeESet = legSlopeESet;
		legSlopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE, oldLegSlope, legSlope, !oldLegSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegSlope() {
		double oldLegSlope = legSlope;
		boolean oldLegSlopeESet = legSlopeESet;
		legSlope = LEG_SLOPE_EDEFAULT;
		legSlopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE, oldLegSlope, LEG_SLOPE_EDEFAULT, oldLegSlopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegSlope() {
		return legSlopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegSlopeAsString() {
		return legSlopeAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegSlopeAsString(String newLegSlopeAsString) {
		String oldLegSlopeAsString = legSlopeAsString;
		legSlopeAsString = newLegSlopeAsString;
		boolean oldLegSlopeAsStringESet = legSlopeAsStringESet;
		legSlopeAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING, oldLegSlopeAsString, legSlopeAsString, !oldLegSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLegSlopeAsString() {
		String oldLegSlopeAsString = legSlopeAsString;
		boolean oldLegSlopeAsStringESet = legSlopeAsStringESet;
		legSlopeAsString = LEG_SLOPE_AS_STRING_EDEFAULT;
		legSlopeAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING, oldLegSlopeAsString, LEG_SLOPE_AS_STRING_EDEFAULT, oldLegSlopeAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLegSlopeAsString() {
		return legSlopeAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX, !oldCentreOfGravityInXESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, CENTRE_OF_GRAVITY_IN_X_EDEFAULT, oldCentreOfGravityInXESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, centreOfGravityInXAsString, !oldCentreOfGravityInXAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT, oldCentreOfGravityInXAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY, !oldCentreOfGravityInYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, CENTRE_OF_GRAVITY_IN_Y_EDEFAULT, oldCentreOfGravityInYESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, centreOfGravityInYAsString, !oldCentreOfGravityInYAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT, oldCentreOfGravityInYAsStringESet));
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
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return getDepthAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				return getWidth();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				return getWidthAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				return getThickness();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING:
				return getThicknessAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return getFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				return getEdgeRadius();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				return getEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				return getLegSlope();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING:
				return getLegSlopeAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return getCentreOfGravityInXAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				setWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				setWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				setThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING:
				setThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				setFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				setEdgeRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				setLegSlope((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING:
				setLegSlopeAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				setCentreOfGravityInXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				setDepthAsString(DEPTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				unsetWidth();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				unsetWidthAsString();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING:
				setThicknessAsString(THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				unsetFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				unsetFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				unsetEdgeRadius();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				unsetEdgeRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				unsetLegSlope();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING:
				unsetLegSlopeAsString();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				unsetCentreOfGravityInX();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				unsetCentreOfGravityInXAsString();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				unsetCentreOfGravityInY();
				return;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__DEPTH_AS_STRING:
				return DEPTH_AS_STRING_EDEFAULT == null ? depthAsString != null : !DEPTH_AS_STRING_EDEFAULT.equals(depthAsString);
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				return isSetWidth();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__WIDTH_AS_STRING:
				return isSetWidthAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				return thickness != THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__THICKNESS_AS_STRING:
				return THICKNESS_AS_STRING_EDEFAULT == null ? thicknessAsString != null : !THICKNESS_AS_STRING_EDEFAULT.equals(thicknessAsString);
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return isSetFilletRadius();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return isSetFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				return isSetEdgeRadius();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS_AS_STRING:
				return isSetEdgeRadiusAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				return isSetLegSlope();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE_AS_STRING:
				return isSetLegSlopeAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return isSetCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return isSetCentreOfGravityInXAsString();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return isSetCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
		result.append(", Width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", WidthAsString: ");
		if (widthAsStringESet) result.append(widthAsString); else result.append("<unset>");
		result.append(", Thickness: ");
		result.append(thickness);
		result.append(", ThicknessAsString: ");
		result.append(thicknessAsString);
		result.append(", FilletRadius: ");
		if (filletRadiusESet) result.append(filletRadius); else result.append("<unset>");
		result.append(", FilletRadiusAsString: ");
		if (filletRadiusAsStringESet) result.append(filletRadiusAsString); else result.append("<unset>");
		result.append(", EdgeRadius: ");
		if (edgeRadiusESet) result.append(edgeRadius); else result.append("<unset>");
		result.append(", EdgeRadiusAsString: ");
		if (edgeRadiusAsStringESet) result.append(edgeRadiusAsString); else result.append("<unset>");
		result.append(", LegSlope: ");
		if (legSlopeESet) result.append(legSlope); else result.append("<unset>");
		result.append(", LegSlopeAsString: ");
		if (legSlopeAsStringESet) result.append(legSlopeAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInX: ");
		if (centreOfGravityInXESet) result.append(centreOfGravityInX); else result.append("<unset>");
		result.append(", CentreOfGravityInXAsString: ");
		if (centreOfGravityInXAsStringESet) result.append(centreOfGravityInXAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInY: ");
		if (centreOfGravityInYESet) result.append(centreOfGravityInY); else result.append("<unset>");
		result.append(", CentreOfGravityInYAsString: ");
		if (centreOfGravityInYAsStringESet) result.append(centreOfGravityInYAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcLShapeProfileDefImpl
