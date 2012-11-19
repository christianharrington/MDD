/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcUShapeProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc UShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcUShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
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
	 * The default value of the '{@link #getEdgeRadius() <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double EDGE_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdgeRadius() <em>Edge Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeRadius()
	 * @generated
	 * @ordered
	 */
	protected Double edgeRadius = EDGE_RADIUS_EDEFAULT;

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
	 * The default value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected static final Double CENTRE_OF_GRAVITY_IN_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected Double centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcUShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH, oldFlangeWidth, flangeWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS, oldWebThickness, webThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS, oldFlangeThickness, flangeThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEdgeRadius() {
		return edgeRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdgeRadius(Double newEdgeRadius) {
		Double oldEdgeRadius = edgeRadius;
		edgeRadius = newEdgeRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, edgeRadius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE, oldFlangeSlope, flangeSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInX() {
		return centreOfGravityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(Double newCentreOfGravityInX) {
		Double oldCentreOfGravityInX = centreOfGravityInX;
		centreOfGravityInX = newCentreOfGravityInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return getFlangeWidth();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				return getWebThickness();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return getFlangeThickness();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				return getEdgeRadius();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return getFlangeSlope();
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
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
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope((Double)newValue);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
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
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				setFlangeWidth(FLANGE_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				setWebThickness(WEB_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				setFlangeThickness(FLANGE_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius(FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius(EDGE_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				setFlangeSlope(FLANGE_SLOPE_EDEFAULT);
				return;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX(CENTRE_OF_GRAVITY_IN_X_EDEFAULT);
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
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_WIDTH:
				return flangeWidth != FLANGE_WIDTH_EDEFAULT;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__WEB_THICKNESS:
				return webThickness != WEB_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_THICKNESS:
				return flangeThickness != FLANGE_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FILLET_RADIUS:
				return FILLET_RADIUS_EDEFAULT == null ? filletRadius != null : !FILLET_RADIUS_EDEFAULT.equals(filletRadius);
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__EDGE_RADIUS:
				return EDGE_RADIUS_EDEFAULT == null ? edgeRadius != null : !EDGE_RADIUS_EDEFAULT.equals(edgeRadius);
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__FLANGE_SLOPE:
				return FLANGE_SLOPE_EDEFAULT == null ? flangeSlope != null : !FLANGE_SLOPE_EDEFAULT.equals(flangeSlope);
			case FinalPackage.IFC_USHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return CENTRE_OF_GRAVITY_IN_X_EDEFAULT == null ? centreOfGravityInX != null : !CENTRE_OF_GRAVITY_IN_X_EDEFAULT.equals(centreOfGravityInX);
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
		result.append(", edgeRadius: ");
		result.append(edgeRadius);
		result.append(", flangeSlope: ");
		result.append(flangeSlope);
		result.append(", centreOfGravityInX: ");
		result.append(centreOfGravityInX);
		result.append(')');
		return result.toString();
	}

} //IfcUShapeProfileDefImpl
