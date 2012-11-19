/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcementBarProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarSurfaceEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Bar Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getTotalCrossSectionArea <em>Total Cross Section Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getSteelGrade <em>Steel Grade</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getBarSurface <em>Bar Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getEffectiveDepth <em>Effective Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getNominalBarDiameter <em>Nominal Bar Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementBarPropertiesImpl#getBarCount <em>Bar Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcementBarPropertiesImpl extends EntityImpl implements IfcReinforcementBarProperties {
	/**
	 * The default value of the '{@link #getTotalCrossSectionArea() <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_CROSS_SECTION_AREA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalCrossSectionArea() <em>Total Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected double totalCrossSectionArea = TOTAL_CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * The default value of the '{@link #getSteelGrade() <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteelGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String STEEL_GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSteelGrade() <em>Steel Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteelGrade()
	 * @generated
	 * @ordered
	 */
	protected String steelGrade = STEEL_GRADE_EDEFAULT;

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
	 * The default value of the '{@link #getEffectiveDepth() <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Double EFFECTIVE_DEPTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffectiveDepth() <em>Effective Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveDepth()
	 * @generated
	 * @ordered
	 */
	protected Double effectiveDepth = EFFECTIVE_DEPTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalBarDiameter() <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final Double NOMINAL_BAR_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalBarDiameter() <em>Nominal Bar Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalBarDiameter()
	 * @generated
	 * @ordered
	 */
	protected Double nominalBarDiameter = NOMINAL_BAR_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBarCount() <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCount()
	 * @generated
	 * @ordered
	 */
	protected static final Double BAR_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBarCount() <em>Bar Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBarCount()
	 * @generated
	 * @ordered
	 */
	protected Double barCount = BAR_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementBarPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcReinforcementBarProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalCrossSectionArea() {
		return totalCrossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCrossSectionArea(double newTotalCrossSectionArea) {
		double oldTotalCrossSectionArea = totalCrossSectionArea;
		totalCrossSectionArea = newTotalCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA, oldTotalCrossSectionArea, totalCrossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSteelGrade() {
		return steelGrade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSteelGrade(String newSteelGrade) {
		String oldSteelGrade = steelGrade;
		steelGrade = newSteelGrade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE, oldSteelGrade, steelGrade));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE, oldBarSurface, barSurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEffectiveDepth() {
		return effectiveDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffectiveDepth(Double newEffectiveDepth) {
		Double oldEffectiveDepth = effectiveDepth;
		effectiveDepth = newEffectiveDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH, oldEffectiveDepth, effectiveDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalBarDiameter() {
		return nominalBarDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalBarDiameter(Double newNominalBarDiameter) {
		Double oldNominalBarDiameter = nominalBarDiameter;
		nominalBarDiameter = newNominalBarDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER, oldNominalBarDiameter, nominalBarDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getBarCount() {
		return barCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBarCount(Double newBarCount) {
		Double oldBarCount = barCount;
		barCount = newBarCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT, oldBarCount, barCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				return getTotalCrossSectionArea();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				return getSteelGrade();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				return getBarSurface();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				return getEffectiveDepth();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				return getNominalBarDiameter();
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				return getBarCount();
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
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				setTotalCrossSectionArea((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				setSteelGrade((String)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				setBarSurface((IfcReinforcingBarSurfaceEnum)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				setEffectiveDepth((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				setNominalBarDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				setBarCount((Double)newValue);
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
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				setTotalCrossSectionArea(TOTAL_CROSS_SECTION_AREA_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				setSteelGrade(STEEL_GRADE_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				setBarSurface(BAR_SURFACE_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				setEffectiveDepth(EFFECTIVE_DEPTH_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				setNominalBarDiameter(NOMINAL_BAR_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				setBarCount(BAR_COUNT_EDEFAULT);
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
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__TOTAL_CROSS_SECTION_AREA:
				return totalCrossSectionArea != TOTAL_CROSS_SECTION_AREA_EDEFAULT;
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__STEEL_GRADE:
				return STEEL_GRADE_EDEFAULT == null ? steelGrade != null : !STEEL_GRADE_EDEFAULT.equals(steelGrade);
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_SURFACE:
				return BAR_SURFACE_EDEFAULT == null ? barSurface != null : !BAR_SURFACE_EDEFAULT.equals(barSurface);
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__EFFECTIVE_DEPTH:
				return EFFECTIVE_DEPTH_EDEFAULT == null ? effectiveDepth != null : !EFFECTIVE_DEPTH_EDEFAULT.equals(effectiveDepth);
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__NOMINAL_BAR_DIAMETER:
				return NOMINAL_BAR_DIAMETER_EDEFAULT == null ? nominalBarDiameter != null : !NOMINAL_BAR_DIAMETER_EDEFAULT.equals(nominalBarDiameter);
			case FinalPackage.IFC_REINFORCEMENT_BAR_PROPERTIES__BAR_COUNT:
				return BAR_COUNT_EDEFAULT == null ? barCount != null : !BAR_COUNT_EDEFAULT.equals(barCount);
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
		result.append(" (totalCrossSectionArea: ");
		result.append(totalCrossSectionArea);
		result.append(", steelGrade: ");
		result.append(steelGrade);
		result.append(", barSurface: ");
		result.append(barSurface);
		result.append(", effectiveDepth: ");
		result.append(effectiveDepth);
		result.append(", nominalBarDiameter: ");
		result.append(nominalBarDiameter);
		result.append(", barCount: ");
		result.append(barCount);
		result.append(')');
		return result.toString();
	}

} //IfcReinforcementBarPropertiesImpl
