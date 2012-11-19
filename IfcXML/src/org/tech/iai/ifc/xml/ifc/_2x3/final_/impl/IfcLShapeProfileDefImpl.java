/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLShapeProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc LShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getEdgeRadius <em>Edge Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getLegSlope <em>Leg Slope</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Double WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected Double width = WIDTH_EDEFAULT;

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
	 * The default value of the '{@link #getLegSlope() <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlope()
	 * @generated
	 * @ordered
	 */
	protected static final Double LEG_SLOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegSlope() <em>Leg Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegSlope()
	 * @generated
	 * @ordered
	 */
	protected Double legSlope = LEG_SLOPE_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcLShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(Double newWidth) {
		Double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__THICKNESS, oldThickness, thickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS, oldFilletRadius, filletRadius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS, oldEdgeRadius, edgeRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLegSlope() {
		return legSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegSlope(Double newLegSlope) {
		Double oldLegSlope = legSlope;
		legSlope = newLegSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE, oldLegSlope, legSlope));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				return getWidth();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				return getThickness();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return getFilletRadius();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				return getEdgeRadius();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				return getLegSlope();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				setWidth((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				setThickness((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				setLegSlope((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				setFilletRadius(FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				setEdgeRadius(EDGE_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				setLegSlope(LEG_SLOPE_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX(CENTRE_OF_GRAVITY_IN_X_EDEFAULT);
				return;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__THICKNESS:
				return thickness != THICKNESS_EDEFAULT;
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__FILLET_RADIUS:
				return FILLET_RADIUS_EDEFAULT == null ? filletRadius != null : !FILLET_RADIUS_EDEFAULT.equals(filletRadius);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__EDGE_RADIUS:
				return EDGE_RADIUS_EDEFAULT == null ? edgeRadius != null : !EDGE_RADIUS_EDEFAULT.equals(edgeRadius);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__LEG_SLOPE:
				return LEG_SLOPE_EDEFAULT == null ? legSlope != null : !LEG_SLOPE_EDEFAULT.equals(legSlope);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
				return CENTRE_OF_GRAVITY_IN_X_EDEFAULT == null ? centreOfGravityInX != null : !CENTRE_OF_GRAVITY_IN_X_EDEFAULT.equals(centreOfGravityInX);
			case FinalPackage.IFC_LSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
		result.append(", width: ");
		result.append(width);
		result.append(", thickness: ");
		result.append(thickness);
		result.append(", filletRadius: ");
		result.append(filletRadius);
		result.append(", edgeRadius: ");
		result.append(edgeRadius);
		result.append(", legSlope: ");
		result.append(legSlope);
		result.append(", centreOfGravityInX: ");
		result.append(centreOfGravityInX);
		result.append(", centreOfGravityInY: ");
		result.append(centreOfGravityInY);
		result.append(')');
		return result.toString();
	}

} //IfcLShapeProfileDefImpl
