/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAsymmetricIShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeWidthAsString <em>Top Flange Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeThicknessAsString <em>Top Flange Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeFilletRadiusAsString <em>Top Flange Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcAsymmetricIShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcAsymmetricIShapeProfileDefImpl extends IfcIShapeProfileDefImpl implements IfcAsymmetricIShapeProfileDef {
	/**
	 * The default value of the '{@link #getTopFlangeWidth() <em>Top Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FLANGE_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopFlangeWidth() <em>Top Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeWidth()
	 * @generated
	 * @ordered
	 */
	protected double topFlangeWidth = TOP_FLANGE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopFlangeWidthAsString() <em>Top Flange Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_FLANGE_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopFlangeWidthAsString() <em>Top Flange Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String topFlangeWidthAsString = TOP_FLANGE_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopFlangeThickness() <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FLANGE_THICKNESS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopFlangeThickness() <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected double topFlangeThickness = TOP_FLANGE_THICKNESS_EDEFAULT;

	/**
	 * This is true if the Top Flange Thickness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topFlangeThicknessESet;

	/**
	 * The default value of the '{@link #getTopFlangeThicknessAsString() <em>Top Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_FLANGE_THICKNESS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopFlangeThicknessAsString() <em>Top Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThicknessAsString()
	 * @generated
	 * @ordered
	 */
	protected String topFlangeThicknessAsString = TOP_FLANGE_THICKNESS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Top Flange Thickness As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topFlangeThicknessAsStringESet;

	/**
	 * The default value of the '{@link #getTopFlangeFilletRadius() <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double TOP_FLANGE_FILLET_RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTopFlangeFilletRadius() <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected double topFlangeFilletRadius = TOP_FLANGE_FILLET_RADIUS_EDEFAULT;

	/**
	 * This is true if the Top Flange Fillet Radius attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topFlangeFilletRadiusESet;

	/**
	 * The default value of the '{@link #getTopFlangeFilletRadiusAsString() <em>Top Flange Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOP_FLANGE_FILLET_RADIUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopFlangeFilletRadiusAsString() <em>Top Flange Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadiusAsString()
	 * @generated
	 * @ordered
	 */
	protected String topFlangeFilletRadiusAsString = TOP_FLANGE_FILLET_RADIUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Top Flange Fillet Radius As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topFlangeFilletRadiusAsStringESet;

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
	protected IfcAsymmetricIShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcAsymmetricIShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopFlangeWidth() {
		return topFlangeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeWidth(double newTopFlangeWidth) {
		double oldTopFlangeWidth = topFlangeWidth;
		topFlangeWidth = newTopFlangeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH, oldTopFlangeWidth, topFlangeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopFlangeWidthAsString() {
		return topFlangeWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeWidthAsString(String newTopFlangeWidthAsString) {
		String oldTopFlangeWidthAsString = topFlangeWidthAsString;
		topFlangeWidthAsString = newTopFlangeWidthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING, oldTopFlangeWidthAsString, topFlangeWidthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopFlangeThickness() {
		return topFlangeThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeThickness(double newTopFlangeThickness) {
		double oldTopFlangeThickness = topFlangeThickness;
		topFlangeThickness = newTopFlangeThickness;
		boolean oldTopFlangeThicknessESet = topFlangeThicknessESet;
		topFlangeThicknessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS, oldTopFlangeThickness, topFlangeThickness, !oldTopFlangeThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeThickness() {
		double oldTopFlangeThickness = topFlangeThickness;
		boolean oldTopFlangeThicknessESet = topFlangeThicknessESet;
		topFlangeThickness = TOP_FLANGE_THICKNESS_EDEFAULT;
		topFlangeThicknessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS, oldTopFlangeThickness, TOP_FLANGE_THICKNESS_EDEFAULT, oldTopFlangeThicknessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeThickness() {
		return topFlangeThicknessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopFlangeThicknessAsString() {
		return topFlangeThicknessAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeThicknessAsString(String newTopFlangeThicknessAsString) {
		String oldTopFlangeThicknessAsString = topFlangeThicknessAsString;
		topFlangeThicknessAsString = newTopFlangeThicknessAsString;
		boolean oldTopFlangeThicknessAsStringESet = topFlangeThicknessAsStringESet;
		topFlangeThicknessAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING, oldTopFlangeThicknessAsString, topFlangeThicknessAsString, !oldTopFlangeThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeThicknessAsString() {
		String oldTopFlangeThicknessAsString = topFlangeThicknessAsString;
		boolean oldTopFlangeThicknessAsStringESet = topFlangeThicknessAsStringESet;
		topFlangeThicknessAsString = TOP_FLANGE_THICKNESS_AS_STRING_EDEFAULT;
		topFlangeThicknessAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING, oldTopFlangeThicknessAsString, TOP_FLANGE_THICKNESS_AS_STRING_EDEFAULT, oldTopFlangeThicknessAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeThicknessAsString() {
		return topFlangeThicknessAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTopFlangeFilletRadius() {
		return topFlangeFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeFilletRadius(double newTopFlangeFilletRadius) {
		double oldTopFlangeFilletRadius = topFlangeFilletRadius;
		topFlangeFilletRadius = newTopFlangeFilletRadius;
		boolean oldTopFlangeFilletRadiusESet = topFlangeFilletRadiusESet;
		topFlangeFilletRadiusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS, oldTopFlangeFilletRadius, topFlangeFilletRadius, !oldTopFlangeFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeFilletRadius() {
		double oldTopFlangeFilletRadius = topFlangeFilletRadius;
		boolean oldTopFlangeFilletRadiusESet = topFlangeFilletRadiusESet;
		topFlangeFilletRadius = TOP_FLANGE_FILLET_RADIUS_EDEFAULT;
		topFlangeFilletRadiusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS, oldTopFlangeFilletRadius, TOP_FLANGE_FILLET_RADIUS_EDEFAULT, oldTopFlangeFilletRadiusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeFilletRadius() {
		return topFlangeFilletRadiusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopFlangeFilletRadiusAsString() {
		return topFlangeFilletRadiusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeFilletRadiusAsString(String newTopFlangeFilletRadiusAsString) {
		String oldTopFlangeFilletRadiusAsString = topFlangeFilletRadiusAsString;
		topFlangeFilletRadiusAsString = newTopFlangeFilletRadiusAsString;
		boolean oldTopFlangeFilletRadiusAsStringESet = topFlangeFilletRadiusAsStringESet;
		topFlangeFilletRadiusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING, oldTopFlangeFilletRadiusAsString, topFlangeFilletRadiusAsString, !oldTopFlangeFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopFlangeFilletRadiusAsString() {
		String oldTopFlangeFilletRadiusAsString = topFlangeFilletRadiusAsString;
		boolean oldTopFlangeFilletRadiusAsStringESet = topFlangeFilletRadiusAsStringESet;
		topFlangeFilletRadiusAsString = TOP_FLANGE_FILLET_RADIUS_AS_STRING_EDEFAULT;
		topFlangeFilletRadiusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING, oldTopFlangeFilletRadiusAsString, TOP_FLANGE_FILLET_RADIUS_AS_STRING_EDEFAULT, oldTopFlangeFilletRadiusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopFlangeFilletRadiusAsString() {
		return topFlangeFilletRadiusAsStringESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY, !oldCentreOfGravityInYESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, CENTRE_OF_GRAVITY_IN_Y_EDEFAULT, oldCentreOfGravityInYESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, centreOfGravityInYAsString, !oldCentreOfGravityInYAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT, oldCentreOfGravityInYAsStringESet));
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
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				return getTopFlangeWidth();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING:
				return getTopFlangeWidthAsString();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				return getTopFlangeThickness();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING:
				return getTopFlangeThicknessAsString();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				return getTopFlangeFilletRadius();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING:
				return getTopFlangeFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				setTopFlangeWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING:
				setTopFlangeWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				setTopFlangeThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING:
				setTopFlangeThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				setTopFlangeFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING:
				setTopFlangeFilletRadiusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				setTopFlangeWidth(TOP_FLANGE_WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING:
				setTopFlangeWidthAsString(TOP_FLANGE_WIDTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				unsetTopFlangeThickness();
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING:
				unsetTopFlangeThicknessAsString();
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				unsetTopFlangeFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING:
				unsetTopFlangeFilletRadiusAsString();
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				unsetCentreOfGravityInY();
				return;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				return topFlangeWidth != TOP_FLANGE_WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH_AS_STRING:
				return TOP_FLANGE_WIDTH_AS_STRING_EDEFAULT == null ? topFlangeWidthAsString != null : !TOP_FLANGE_WIDTH_AS_STRING_EDEFAULT.equals(topFlangeWidthAsString);
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				return isSetTopFlangeThickness();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS_AS_STRING:
				return isSetTopFlangeThicknessAsString();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				return isSetTopFlangeFilletRadius();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS_AS_STRING:
				return isSetTopFlangeFilletRadiusAsString();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return isSetCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING:
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
		result.append(" (TopFlangeWidth: ");
		result.append(topFlangeWidth);
		result.append(", TopFlangeWidthAsString: ");
		result.append(topFlangeWidthAsString);
		result.append(", TopFlangeThickness: ");
		if (topFlangeThicknessESet) result.append(topFlangeThickness); else result.append("<unset>");
		result.append(", TopFlangeThicknessAsString: ");
		if (topFlangeThicknessAsStringESet) result.append(topFlangeThicknessAsString); else result.append("<unset>");
		result.append(", TopFlangeFilletRadius: ");
		if (topFlangeFilletRadiusESet) result.append(topFlangeFilletRadius); else result.append("<unset>");
		result.append(", TopFlangeFilletRadiusAsString: ");
		if (topFlangeFilletRadiusAsStringESet) result.append(topFlangeFilletRadiusAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInY: ");
		if (centreOfGravityInYESet) result.append(centreOfGravityInY); else result.append("<unset>");
		result.append(", CentreOfGravityInYAsString: ");
		if (centreOfGravityInYAsStringESet) result.append(centreOfGravityInYAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcAsymmetricIShapeProfileDefImpl
