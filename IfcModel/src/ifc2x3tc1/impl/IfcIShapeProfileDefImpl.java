/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcIShapeProfileDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getOverallWidth <em>Overall Width</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getOverallWidthAsString <em>Overall Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getOverallDepth <em>Overall Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getOverallDepthAsString <em>Overall Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getFlangeThicknessAsString <em>Flange Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcIShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcIShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcIShapeProfileDef {
	/**
	 * The default value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERALL_WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverallWidth() <em>Overall Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidth()
	 * @generated
	 * @ordered
	 */
	protected double overallWidth = OVERALL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallWidthAsString() <em>Overall Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERALL_WIDTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallWidthAsString() <em>Overall Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallWidthAsString()
	 * @generated
	 * @ordered
	 */
	protected String overallWidthAsString = OVERALL_WIDTH_AS_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallDepth() <em>Overall Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallDepth()
	 * @generated
	 * @ordered
	 */
	protected static final double OVERALL_DEPTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOverallDepth() <em>Overall Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallDepth()
	 * @generated
	 * @ordered
	 */
	protected double overallDepth = OVERALL_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOverallDepthAsString() <em>Overall Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String OVERALL_DEPTH_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOverallDepthAsString() <em>Overall Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverallDepthAsString()
	 * @generated
	 * @ordered
	 */
	protected String overallDepthAsString = OVERALL_DEPTH_AS_STRING_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcIShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcIShapeProfileDef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallWidth() {
		return overallWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidth(double newOverallWidth) {
		double oldOverallWidth = overallWidth;
		overallWidth = newOverallWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH, oldOverallWidth, overallWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallWidthAsString() {
		return overallWidthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallWidthAsString(String newOverallWidthAsString) {
		String oldOverallWidthAsString = overallWidthAsString;
		overallWidthAsString = newOverallWidthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING, oldOverallWidthAsString, overallWidthAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOverallDepth() {
		return overallDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallDepth(double newOverallDepth) {
		double oldOverallDepth = overallDepth;
		overallDepth = newOverallDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH, oldOverallDepth, overallDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOverallDepthAsString() {
		return overallDepthAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverallDepthAsString(String newOverallDepthAsString) {
		String oldOverallDepthAsString = overallDepthAsString;
		overallDepthAsString = newOverallDepthAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING, oldOverallDepthAsString, overallDepthAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS, oldWebThickness, webThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, oldWebThicknessAsString, webThicknessAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS, oldFlangeThickness, flangeThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING, oldFlangeThicknessAsString, flangeThicknessAsString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius, !oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, FILLET_RADIUS_EDEFAULT, oldFilletRadiusESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, filletRadiusAsString, !oldFilletRadiusAsStringESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, oldFilletRadiusAsString, FILLET_RADIUS_AS_STRING_EDEFAULT, oldFilletRadiusAsStringESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH:
				return getOverallWidth();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING:
				return getOverallWidthAsString();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH:
				return getOverallDepth();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING:
				return getOverallDepthAsString();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS:
				return getWebThickness();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return getWebThicknessAsString();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return getFlangeThickness();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return getFlangeThicknessAsString();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return getFilletRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH:
				setOverallWidth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING:
				setOverallWidthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH:
				setOverallDepth((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING:
				setOverallDepthAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				setFilletRadiusAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH:
				setOverallWidth(OVERALL_WIDTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING:
				setOverallWidthAsString(OVERALL_WIDTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH:
				setOverallDepth(OVERALL_DEPTH_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING:
				setOverallDepthAsString(OVERALL_DEPTH_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness(WEB_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				setWebThicknessAsString(WEB_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness(FLANGE_THICKNESS_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				setFlangeThicknessAsString(FLANGE_THICKNESS_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS:
				unsetFilletRadius();
				return;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				unsetFilletRadiusAsString();
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
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH:
				return overallWidth != OVERALL_WIDTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_WIDTH_AS_STRING:
				return OVERALL_WIDTH_AS_STRING_EDEFAULT == null ? overallWidthAsString != null : !OVERALL_WIDTH_AS_STRING_EDEFAULT.equals(overallWidthAsString);
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH:
				return overallDepth != OVERALL_DEPTH_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__OVERALL_DEPTH_AS_STRING:
				return OVERALL_DEPTH_AS_STRING_EDEFAULT == null ? overallDepthAsString != null : !OVERALL_DEPTH_AS_STRING_EDEFAULT.equals(overallDepthAsString);
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS:
				return webThickness != WEB_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING:
				return WEB_THICKNESS_AS_STRING_EDEFAULT == null ? webThicknessAsString != null : !WEB_THICKNESS_AS_STRING_EDEFAULT.equals(webThicknessAsString);
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return flangeThickness != FLANGE_THICKNESS_EDEFAULT;
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING:
				return FLANGE_THICKNESS_AS_STRING_EDEFAULT == null ? flangeThicknessAsString != null : !FLANGE_THICKNESS_AS_STRING_EDEFAULT.equals(flangeThicknessAsString);
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS:
				return isSetFilletRadius();
			case Ifc2x3tc1Package.IFC_ISHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING:
				return isSetFilletRadiusAsString();
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
		result.append(" (OverallWidth: ");
		result.append(overallWidth);
		result.append(", OverallWidthAsString: ");
		result.append(overallWidthAsString);
		result.append(", OverallDepth: ");
		result.append(overallDepth);
		result.append(", OverallDepthAsString: ");
		result.append(overallDepthAsString);
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
		result.append(')');
		return result.toString();
	}

} //IfcIShapeProfileDefImpl
