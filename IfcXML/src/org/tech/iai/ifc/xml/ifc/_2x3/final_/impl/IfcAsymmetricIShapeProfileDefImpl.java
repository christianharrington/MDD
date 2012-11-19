/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsymmetricIShapeProfileDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAsymmetricIShapeProfileDefImpl#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcAsymmetricIShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
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
	 * The default value of the '{@link #getTopFlangeThickness() <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double TOP_FLANGE_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopFlangeThickness() <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeThickness()
	 * @generated
	 * @ordered
	 */
	protected Double topFlangeThickness = TOP_FLANGE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopFlangeFilletRadius() <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double TOP_FLANGE_FILLET_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopFlangeFilletRadius() <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 * @ordered
	 */
	protected Double topFlangeFilletRadius = TOP_FLANGE_FILLET_RADIUS_EDEFAULT;

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
		return FinalPackage.eINSTANCE.getIfcAsymmetricIShapeProfileDef();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH, oldTopFlangeWidth, topFlangeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopFlangeThickness() {
		return topFlangeThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeThickness(Double newTopFlangeThickness) {
		Double oldTopFlangeThickness = topFlangeThickness;
		topFlangeThickness = newTopFlangeThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS, oldTopFlangeThickness, topFlangeThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTopFlangeFilletRadius() {
		return topFlangeFilletRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopFlangeFilletRadius(Double newTopFlangeFilletRadius) {
		Double oldTopFlangeFilletRadius = topFlangeFilletRadius;
		topFlangeFilletRadius = newTopFlangeFilletRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS, oldTopFlangeFilletRadius, topFlangeFilletRadius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				return getTopFlangeWidth();
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				return getTopFlangeThickness();
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				return getTopFlangeFilletRadius();
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				setTopFlangeWidth((Double)newValue);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				setTopFlangeThickness((Double)newValue);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				setTopFlangeFilletRadius((Double)newValue);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				setTopFlangeWidth(TOP_FLANGE_WIDTH_EDEFAULT);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				setTopFlangeThickness(TOP_FLANGE_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				setTopFlangeFilletRadius(TOP_FLANGE_FILLET_RADIUS_EDEFAULT);
				return;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_WIDTH:
				return topFlangeWidth != TOP_FLANGE_WIDTH_EDEFAULT;
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_THICKNESS:
				return TOP_FLANGE_THICKNESS_EDEFAULT == null ? topFlangeThickness != null : !TOP_FLANGE_THICKNESS_EDEFAULT.equals(topFlangeThickness);
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__TOP_FLANGE_FILLET_RADIUS:
				return TOP_FLANGE_FILLET_RADIUS_EDEFAULT == null ? topFlangeFilletRadius != null : !TOP_FLANGE_FILLET_RADIUS_EDEFAULT.equals(topFlangeFilletRadius);
			case FinalPackage.IFC_ASYMMETRIC_ISHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y:
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
		result.append(" (topFlangeWidth: ");
		result.append(topFlangeWidth);
		result.append(", topFlangeThickness: ");
		result.append(topFlangeThickness);
		result.append(", topFlangeFilletRadius: ");
		result.append(topFlangeFilletRadius);
		result.append(", centreOfGravityInY: ");
		result.append(centreOfGravityInY);
		result.append(')');
		return result.toString();
	}

} //IfcAsymmetricIShapeProfileDefImpl
