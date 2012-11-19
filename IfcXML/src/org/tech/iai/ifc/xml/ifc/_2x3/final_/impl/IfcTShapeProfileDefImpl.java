/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTShapeProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
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
	 * The default value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double FILLET_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilletRadius() <em>Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected Double filletRadius = FILLET_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlangeEdgeRadius() <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double FLANGE_EDGE_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeEdgeRadius() <em>Flange Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected Double flangeEdgeRadius = FLANGE_EDGE_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebEdgeRadius() <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double WEB_EDGE_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebEdgeRadius() <em>Web Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected Double webEdgeRadius = WEB_EDGE_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWebSlope() <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlope()
	 * @generated
	 * @ordered
	 */
	protected static final Double WEB_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWebSlope() <em>Web Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebSlope()
	 * @generated
	 * @ordered
	 */
	protected Double webSlope = WEB_SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlangeSlope() <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlope()
	 * @generated
	 * @ordered
	 */
	protected static final Double FLANGE_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlangeSlope() <em>Flange Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlangeSlope()
	 * @generated
	 * @ordered
	 */
	protected Double flangeSlope = FLANGE_SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected static final Double CENTRE_OF_GRAVITY_IN_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected Double centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcTShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH, oldFlangeWidth, flangeWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS, oldWebThickness, webThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS, oldFlangeThickness, flangeThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFilletRadius() {
		return filletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(Double newFilletRadius) {
		Double oldFilletRadius = filletRadius;
		filletRadius = newFilletRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeEdgeRadius() {
		return flangeEdgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadius(Double newFlangeEdgeRadius) {
		Double oldFlangeEdgeRadius = flangeEdgeRadius;
		flangeEdgeRadius = newFlangeEdgeRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS, oldFlangeEdgeRadius, flangeEdgeRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebEdgeRadius() {
		return webEdgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadius(Double newWebEdgeRadius) {
		Double oldWebEdgeRadius = webEdgeRadius;
		webEdgeRadius = newWebEdgeRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS, oldWebEdgeRadius, webEdgeRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWebSlope() {
		return webSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlope(Double newWebSlope) {
		Double oldWebSlope = webSlope;
		webSlope = newWebSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE, oldWebSlope, webSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFlangeSlope() {
		return flangeSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(Double newFlangeSlope) {
		Double oldFlangeSlope = flangeSlope;
		flangeSlope = newFlangeSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, flangeSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return centreOfGravityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		Double oldCentreOfGravityInY = centreOfGravityInY;
		centreOfGravityInY = newCentreOfGravityInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return getFlangeWidth();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				return getWebThickness();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return getFlangeThickness();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				return getFlangeEdgeRadius();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				return getWebEdgeRadius();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				return getWebSlope();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return getFlangeSlope();
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
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
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				setFlangeEdgeRadius((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				setWebEdgeRadius((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				setWebSlope((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope((Double)newValue);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
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
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth(FLANGE_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness(WEB_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness(FLANGE_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius(FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				setFlangeEdgeRadius(FLANGE_EDGE_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				setWebEdgeRadius(WEB_EDGE_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				setWebSlope(WEB_SLOPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope(FLANGE_SLOPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY(CENTRE_OF_GRAVITY_IN_Y_EDEFAULT);
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
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return flangeWidth != FLANGE_WIDTH_EDEFAULT;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS:
				return webThickness != WEB_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return flangeThickness != FLANGE_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return FILLET_RADIUS_EDEFAULT == null ? filletRadius != null : !FILLET_RADIUS_EDEFAULT.equals(filletRadius);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS:
				return FLANGE_EDGE_RADIUS_EDEFAULT == null ? flangeEdgeRadius != null : !FLANGE_EDGE_RADIUS_EDEFAULT.equals(flangeEdgeRadius);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS:
				return WEB_EDGE_RADIUS_EDEFAULT == null ? webEdgeRadius != null : !WEB_EDGE_RADIUS_EDEFAULT.equals(webEdgeRadius);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE:
				return WEB_SLOPE_EDEFAULT == null ? webSlope != null : !WEB_SLOPE_EDEFAULT.equals(webSlope);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return FLANGE_SLOPE_EDEFAULT == null ? flangeSlope != null : !FLANGE_SLOPE_EDEFAULT.equals(flangeSlope);
			case FinalPackage.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
				return CENTRE_OF_GRAVITY_IN_Y_EDEFAULT == null ? centreOfGravityInY != null : !CENTRE_OF_GRAVITY_IN_Y_EDEFAULT.equals(centreOfGravityInY);
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
		result.append(" (depth: ");
		result.append(depth);
		result.append(", flangeWidth: ");
		result.append(flangeWidth);
		result.append(", webThickness: ");
		result.append(webThickness);
		result.append(", flangeThickness: ");
		result.append(flangeThickness);
		result.append(", filletRadius: ");
		result.append(filletRadius);
		result.append(", flangeEdgeRadius: ");
		result.append(flangeEdgeRadius);
		result.append(", webEdgeRadius: ");
		result.append(webEdgeRadius);
		result.append(", webSlope: ");
		result.append(webSlope);
		result.append(", flangeSlope: ");
		result.append(flangeSlope);
		result.append(", centreOfGravityInY: ");
		result.append(centreOfGravityInY);
		result.append(')');
		return result.toString();
	}

} //IfcTShapeProfileDefImpl
