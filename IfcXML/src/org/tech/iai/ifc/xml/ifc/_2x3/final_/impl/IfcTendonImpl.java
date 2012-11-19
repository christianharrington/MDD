/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTendon;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTendonTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Tendon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getTensionForce <em>Tension Force</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getPreStress <em>Pre Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getFrictionCoefficient <em>Friction Coefficient</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getAnchorageSlip <em>Anchorage Slip</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcTendonImpl#getMinCurvatureRadius <em>Min Curvature Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTendonImpl extends IfcReinforcingElementImpl implements IfcTendon {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcTendonTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcTendonTypeEnum.STRAND;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcTendonTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getTensionForce() <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForce()
	 * @generated
	 * @ordered
	 */
	protected static final Double TENSION_FORCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionForce() <em>Tension Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionForce()
	 * @generated
	 * @ordered
	 */
	protected Double tensionForce = TENSION_FORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreStress() <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStress()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRE_STRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreStress() <em>Pre Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreStress()
	 * @generated
	 * @ordered
	 */
	protected Double preStress = PRE_STRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFrictionCoefficient() <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected static final Double FRICTION_COEFFICIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrictionCoefficient() <em>Friction Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrictionCoefficient()
	 * @generated
	 * @ordered
	 */
	protected Double frictionCoefficient = FRICTION_COEFFICIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnchorageSlip() <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlip()
	 * @generated
	 * @ordered
	 */
	protected static final Double ANCHORAGE_SLIP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnchorageSlip() <em>Anchorage Slip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorageSlip()
	 * @generated
	 * @ordered
	 */
	protected Double anchorageSlip = ANCHORAGE_SLIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinCurvatureRadius() <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_CURVATURE_RADIUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinCurvatureRadius() <em>Min Curvature Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCurvatureRadius()
	 * @generated
	 * @ordered
	 */
	protected Double minCurvatureRadius = MIN_CURVATURE_RADIUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTendonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcTendon();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTendonTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcTendonTypeEnum newPredefinedType) {
		IfcTendonTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionForce() {
		return tensionForce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionForce(Double newTensionForce) {
		Double oldTensionForce = tensionForce;
		tensionForce = newTensionForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__TENSION_FORCE, oldTensionForce, tensionForce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPreStress() {
		return preStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreStress(Double newPreStress) {
		Double oldPreStress = preStress;
		preStress = newPreStress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__PRE_STRESS, oldPreStress, preStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getFrictionCoefficient() {
		return frictionCoefficient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrictionCoefficient(Double newFrictionCoefficient) {
		Double oldFrictionCoefficient = frictionCoefficient;
		frictionCoefficient = newFrictionCoefficient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__FRICTION_COEFFICIENT, oldFrictionCoefficient, frictionCoefficient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAnchorageSlip() {
		return anchorageSlip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnchorageSlip(Double newAnchorageSlip) {
		Double oldAnchorageSlip = anchorageSlip;
		anchorageSlip = newAnchorageSlip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__ANCHORAGE_SLIP, oldAnchorageSlip, anchorageSlip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinCurvatureRadius() {
		return minCurvatureRadius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCurvatureRadius(Double newMinCurvatureRadius) {
		Double oldMinCurvatureRadius = minCurvatureRadius;
		minCurvatureRadius = newMinCurvatureRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_TENDON__MIN_CURVATURE_RADIUS, oldMinCurvatureRadius, minCurvatureRadius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_TENDON__PREDEFINED_TYPE:
				return getPredefinedType();
			case FinalPackage.IFC_TENDON__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case FinalPackage.IFC_TENDON__CROSS_SECTION_AREA:
				return getCrossSectionArea();
			case FinalPackage.IFC_TENDON__TENSION_FORCE:
				return getTensionForce();
			case FinalPackage.IFC_TENDON__PRE_STRESS:
				return getPreStress();
			case FinalPackage.IFC_TENDON__FRICTION_COEFFICIENT:
				return getFrictionCoefficient();
			case FinalPackage.IFC_TENDON__ANCHORAGE_SLIP:
				return getAnchorageSlip();
			case FinalPackage.IFC_TENDON__MIN_CURVATURE_RADIUS:
				return getMinCurvatureRadius();
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
			case FinalPackage.IFC_TENDON__PREDEFINED_TYPE:
				setPredefinedType((IfcTendonTypeEnum)newValue);
				return;
			case FinalPackage.IFC_TENDON__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__TENSION_FORCE:
				setTensionForce((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__PRE_STRESS:
				setPreStress((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__FRICTION_COEFFICIENT:
				setFrictionCoefficient((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__ANCHORAGE_SLIP:
				setAnchorageSlip((Double)newValue);
				return;
			case FinalPackage.IFC_TENDON__MIN_CURVATURE_RADIUS:
				setMinCurvatureRadius((Double)newValue);
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
			case FinalPackage.IFC_TENDON__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__NOMINAL_DIAMETER:
				setNominalDiameter(NOMINAL_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__CROSS_SECTION_AREA:
				setCrossSectionArea(CROSS_SECTION_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__TENSION_FORCE:
				setTensionForce(TENSION_FORCE_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__PRE_STRESS:
				setPreStress(PRE_STRESS_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__FRICTION_COEFFICIENT:
				setFrictionCoefficient(FRICTION_COEFFICIENT_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__ANCHORAGE_SLIP:
				setAnchorageSlip(ANCHORAGE_SLIP_EDEFAULT);
				return;
			case FinalPackage.IFC_TENDON__MIN_CURVATURE_RADIUS:
				setMinCurvatureRadius(MIN_CURVATURE_RADIUS_EDEFAULT);
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
			case FinalPackage.IFC_TENDON__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case FinalPackage.IFC_TENDON__NOMINAL_DIAMETER:
				return nominalDiameter != NOMINAL_DIAMETER_EDEFAULT;
			case FinalPackage.IFC_TENDON__CROSS_SECTION_AREA:
				return crossSectionArea != CROSS_SECTION_AREA_EDEFAULT;
			case FinalPackage.IFC_TENDON__TENSION_FORCE:
				return TENSION_FORCE_EDEFAULT == null ? tensionForce != null : !TENSION_FORCE_EDEFAULT.equals(tensionForce);
			case FinalPackage.IFC_TENDON__PRE_STRESS:
				return PRE_STRESS_EDEFAULT == null ? preStress != null : !PRE_STRESS_EDEFAULT.equals(preStress);
			case FinalPackage.IFC_TENDON__FRICTION_COEFFICIENT:
				return FRICTION_COEFFICIENT_EDEFAULT == null ? frictionCoefficient != null : !FRICTION_COEFFICIENT_EDEFAULT.equals(frictionCoefficient);
			case FinalPackage.IFC_TENDON__ANCHORAGE_SLIP:
				return ANCHORAGE_SLIP_EDEFAULT == null ? anchorageSlip != null : !ANCHORAGE_SLIP_EDEFAULT.equals(anchorageSlip);
			case FinalPackage.IFC_TENDON__MIN_CURVATURE_RADIUS:
				return MIN_CURVATURE_RADIUS_EDEFAULT == null ? minCurvatureRadius != null : !MIN_CURVATURE_RADIUS_EDEFAULT.equals(minCurvatureRadius);
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
		result.append(" (predefinedType: ");
		result.append(predefinedType);
		result.append(", nominalDiameter: ");
		result.append(nominalDiameter);
		result.append(", crossSectionArea: ");
		result.append(crossSectionArea);
		result.append(", tensionForce: ");
		result.append(tensionForce);
		result.append(", preStress: ");
		result.append(preStress);
		result.append(", frictionCoefficient: ");
		result.append(frictionCoefficient);
		result.append(", anchorageSlip: ");
		result.append(anchorageSlip);
		result.append(", minCurvatureRadius: ");
		result.append(minCurvatureRadius);
		result.append(')');
		return result.toString();
	}

} //IfcTendonImpl
