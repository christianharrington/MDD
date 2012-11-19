/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCShapeProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc CShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getGirth <em>Girth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getInternalFilletRadius <em>Internal Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcCShapeProfileDefImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
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
	 * The default value of the '{@link #getInternalFilletRadius() <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double INTERNAL_FILLET_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInternalFilletRadius() <em>Internal Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected Double internalFilletRadius = INTERNAL_FILLET_RADIUS_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcCShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__DEPTH, oldDepth, depth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS, oldWallThickness, wallThickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__GIRTH, oldGirth, girth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInternalFilletRadius() {
		return internalFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalFilletRadius(Double newInternalFilletRadius) {
		Double oldInternalFilletRadius = internalFilletRadius;
		internalFilletRadius = newInternalFilletRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS, oldInternalFilletRadius, internalFilletRadius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				return getDepth();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				return getWidth();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				return getWallThickness();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				return getGirth();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				return getInternalFilletRadius();
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
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
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				setDepth((Double)newValue);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				setWidth((Double)newValue);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness((Double)newValue);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				setGirth((Double)newValue);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				setInternalFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
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
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				setDepth(DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness(WALL_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				setGirth(GIRTH_EDEFAULT);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				setInternalFilletRadius(INTERNAL_FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
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
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__DEPTH:
				return depth != DEPTH_EDEFAULT;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WIDTH:
				return width != WIDTH_EDEFAULT;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__WALL_THICKNESS:
				return wallThickness != WALL_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__GIRTH:
				return girth != GIRTH_EDEFAULT;
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__INTERNAL_FILLET_RADIUS:
				return INTERNAL_FILLET_RADIUS_EDEFAULT == null ? internalFilletRadius != null : !INTERNAL_FILLET_RADIUS_EDEFAULT.equals(internalFilletRadius);
			case FinalPackage.IFC_CSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_X:
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
		result.append(", width: ");
		result.append(width);
		result.append(", wallThickness: ");
		result.append(wallThickness);
		result.append(", girth: ");
		result.append(girth);
		result.append(", internalFilletRadius: ");
		result.append(internalFilletRadius);
		result.append(", centreOfGravityInX: ");
		result.append(centreOfGravityInX);
		result.append(')');
		return result.toString();
	}

} //IfcCShapeProfileDefImpl
