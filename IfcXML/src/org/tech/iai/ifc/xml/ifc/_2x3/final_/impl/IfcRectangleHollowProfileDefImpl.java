/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRectangleHollowProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Rectangle Hollow Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangleHollowProfileDefImpl#getWallThickness <em>Wall Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangleHollowProfileDefImpl#getInnerFilletRadius <em>Inner Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcRectangleHollowProfileDefImpl#getOuterFilletRadius <em>Outer Fillet Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcRectangleHollowProfileDefImpl extends IfcRectangleProfileDefImpl implements IfcRectangleHollowProfileDef {
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
	 * The default value of the '{@link #getInnerFilletRadius() <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double INNER_FILLET_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerFilletRadius() <em>Inner Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected Double innerFilletRadius = INNER_FILLET_RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterFilletRadius() <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double OUTER_FILLET_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuterFilletRadius() <em>Outer Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected Double outerFilletRadius = OUTER_FILLET_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcRectangleHollowProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcRectangleHollowProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS, oldWallThickness, wallThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getInnerFilletRadius() {
		return innerFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerFilletRadius(Double newInnerFilletRadius) {
		Double oldInnerFilletRadius = innerFilletRadius;
		innerFilletRadius = newInnerFilletRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS, oldInnerFilletRadius, innerFilletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getOuterFilletRadius() {
		return outerFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuterFilletRadius(Double newOuterFilletRadius) {
		Double oldOuterFilletRadius = outerFilletRadius;
		outerFilletRadius = newOuterFilletRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS, oldOuterFilletRadius, outerFilletRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return getWallThickness();
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				return getInnerFilletRadius();
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				return getOuterFilletRadius();
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
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				setInnerFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				setOuterFilletRadius((Double)newValue);
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
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				setWallThickness(WALL_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				setInnerFilletRadius(INNER_FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				setOuterFilletRadius(OUTER_FILLET_RADIUS_EDEFAULT);
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
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__WALL_THICKNESS:
				return wallThickness != WALL_THICKNESS_EDEFAULT;
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__INNER_FILLET_RADIUS:
				return INNER_FILLET_RADIUS_EDEFAULT == null ? innerFilletRadius != null : !INNER_FILLET_RADIUS_EDEFAULT.equals(innerFilletRadius);
			case FinalPackage.IFC_RECTANGLE_HOLLOW_PROFILE_DEF__OUTER_FILLET_RADIUS:
				return OUTER_FILLET_RADIUS_EDEFAULT == null ? outerFilletRadius != null : !OUTER_FILLET_RADIUS_EDEFAULT.equals(outerFilletRadius);
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
		result.append(" (wallThickness: ");
		result.append(wallThickness);
		result.append(", innerFilletRadius: ");
		result.append(innerFilletRadius);
		result.append(", outerFilletRadius: ");
		result.append(outerFilletRadius);
		result.append(')');
		return result.toString();
	}

} //IfcRectangleHollowProfileDefImpl
