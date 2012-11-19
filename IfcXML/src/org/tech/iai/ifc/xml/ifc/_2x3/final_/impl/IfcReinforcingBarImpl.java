/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBar;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarRoleEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarSurfaceEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcing Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingBarImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingBarImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingBarImpl#getBarLength <em>Bar Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingBarImpl#getBarRole <em>Bar Role</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcingBarImpl#getBarSurface <em>Bar Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcingBarImpl extends IfcReinforcingElementImpl implements IfcReinforcingBar {
	/**
	 * The default value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final double NOMINAL_DIAMETER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected double nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double crossSectionArea = CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarLength() <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double BAR_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarLength() <em>Bar Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarLength()
	 * @generated
	 * @ordered
	 */
	protected Double barLength = BAR_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarRole() <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarRole()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarRoleEnum BAR_ROLE_EDEFAULT = IfcReinforcingBarRoleEnum.MAIN;

	/**
	 * The cached value of the '{@link #getBarRole() <em>Bar Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarRole()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarRoleEnum barRole = BAR_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarSurfaceEnum BAR_SURFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarSurface() <em>Bar Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarSurface()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarSurfaceEnum barSurface = BAR_SURFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcingBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcReinforcingBar();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNominalDiameter() {
		return nominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(double newNominalDiameter) {
		double oldNominalDiameter = nominalDiameter;
		nominalDiameter = newNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_BAR__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCrossSectionArea() {
		return crossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(double newCrossSectionArea) {
		double oldCrossSectionArea = crossSectionArea;
		crossSectionArea = newCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_BAR__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBarLength() {
		return barLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarLength(Double newBarLength) {
		Double oldBarLength = barLength;
		barLength = newBarLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_BAR__BAR_LENGTH, oldBarLength, barLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getBarRole() {
		return barRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarRole(IfcReinforcingBarRoleEnum newBarRole) {
		IfcReinforcingBarRoleEnum oldBarRole = barRole;
		barRole = newBarRole == null ? BAR_ROLE_EDEFAULT : newBarRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_BAR__BAR_ROLE, oldBarRole, barRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarSurfaceEnum getBarSurface() {
		return barSurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarSurface(IfcReinforcingBarSurfaceEnum newBarSurface) {
		IfcReinforcingBarSurfaceEnum oldBarSurface = barSurface;
		barSurface = newBarSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCING_BAR__BAR_SURFACE, oldBarSurface, barSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case FinalPackage.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				return getCrossSectionArea();
			case FinalPackage.IFC_REINFORCING_BAR__BAR_LENGTH:
				return getBarLength();
			case FinalPackage.IFC_REINFORCING_BAR__BAR_ROLE:
				return getBarRole();
			case FinalPackage.IFC_REINFORCING_BAR__BAR_SURFACE:
				return getBarSurface();
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
			case FinalPackage.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_LENGTH:
				setBarLength((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_ROLE:
				setBarRole((IfcReinforcingBarRoleEnum)newValue);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_SURFACE:
				setBarSurface((IfcReinforcingBarSurfaceEnum)newValue);
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
			case FinalPackage.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				setNominalDiameter(NOMINAL_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				setCrossSectionArea(CROSS_SECTION_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_LENGTH:
				setBarLength(BAR_LENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_ROLE:
				setBarRole(BAR_ROLE_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_SURFACE:
				setBarSurface(BAR_SURFACE_EDEFAULT);
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
			case FinalPackage.IFC_REINFORCING_BAR__NOMINAL_DIAMETER:
				return nominalDiameter != NOMINAL_DIAMETER_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_BAR__CROSS_SECTION_AREA:
				return crossSectionArea != CROSS_SECTION_AREA_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_LENGTH:
				return BAR_LENGTH_EDEFAULT == null ? barLength != null : !BAR_LENGTH_EDEFAULT.equals(barLength);
			case FinalPackage.IFC_REINFORCING_BAR__BAR_ROLE:
				return barRole != BAR_ROLE_EDEFAULT;
			case FinalPackage.IFC_REINFORCING_BAR__BAR_SURFACE:
				return BAR_SURFACE_EDEFAULT == null ? barSurface != null : !BAR_SURFACE_EDEFAULT.equals(barSurface);
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
		result.append(" (nominalDiameter: ");
		result.append(nominalDiameter);
		result.append(", crossSectionArea: ");
		result.append(crossSectionArea);
		result.append(", barLength: ");
		result.append(barLength);
		result.append(", barRole: ");
		result.append(barRole);
		result.append(", barSurface: ");
		result.append(barSurface);
		result.append(')');
		return result.toString();
	}

} //IfcReinforcingBarImpl
