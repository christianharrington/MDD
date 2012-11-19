/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWorkability <em>Workability</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalConcreteMaterialPropertiesImpl#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalConcreteMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalConcreteMaterialProperties {
	/**
	 * The default value of the '{@link #getCompressiveStrength() <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrength()
	 * @generated
	 * @ordered
	 */
	protected static final Double COMPRESSIVE_STRENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressiveStrength() <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressiveStrength()
	 * @generated
	 * @ordered
	 */
	protected Double compressiveStrength = COMPRESSIVE_STRENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAggregateSize() <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSize()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_AGGREGATE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAggregateSize() <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAggregateSize()
	 * @generated
	 * @ordered
	 */
	protected Double maxAggregateSize = MAX_AGGREGATE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdmixturesDescription() <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmixturesDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String ADMIXTURES_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdmixturesDescription() <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdmixturesDescription()
	 * @generated
	 * @ordered
	 */
	protected String admixturesDescription = ADMIXTURES_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkability() <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkability()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkability() <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkability()
	 * @generated
	 * @ordered
	 */
	protected String workability = WORKABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtectivePoreRatio() <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatio()
	 * @generated
	 * @ordered
	 */
	protected static final Double PROTECTIVE_PORE_RATIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProtectivePoreRatio() <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectivePoreRatio()
	 * @generated
	 * @ordered
	 */
	protected Double protectivePoreRatio = PROTECTIVE_PORE_RATIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getWaterImpermeability() <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterImpermeability()
	 * @generated
	 * @ordered
	 */
	protected static final String WATER_IMPERMEABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWaterImpermeability() <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterImpermeability()
	 * @generated
	 * @ordered
	 */
	protected String waterImpermeability = WATER_IMPERMEABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalConcreteMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMechanicalConcreteMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressiveStrength() {
		return compressiveStrength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressiveStrength(Double newCompressiveStrength) {
		Double oldCompressiveStrength = compressiveStrength;
		compressiveStrength = newCompressiveStrength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH, oldCompressiveStrength, compressiveStrength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaxAggregateSize() {
		return maxAggregateSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAggregateSize(Double newMaxAggregateSize) {
		Double oldMaxAggregateSize = maxAggregateSize;
		maxAggregateSize = newMaxAggregateSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE, oldMaxAggregateSize, maxAggregateSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdmixturesDescription() {
		return admixturesDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdmixturesDescription(String newAdmixturesDescription) {
		String oldAdmixturesDescription = admixturesDescription;
		admixturesDescription = newAdmixturesDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION, oldAdmixturesDescription, admixturesDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWorkability() {
		return workability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkability(String newWorkability) {
		String oldWorkability = workability;
		workability = newWorkability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY, oldWorkability, workability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProtectivePoreRatio() {
		return protectivePoreRatio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtectivePoreRatio(Double newProtectivePoreRatio) {
		Double oldProtectivePoreRatio = protectivePoreRatio;
		protectivePoreRatio = newProtectivePoreRatio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO, oldProtectivePoreRatio, protectivePoreRatio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWaterImpermeability() {
		return waterImpermeability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWaterImpermeability(String newWaterImpermeability) {
		String oldWaterImpermeability = waterImpermeability;
		waterImpermeability = newWaterImpermeability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY, oldWaterImpermeability, waterImpermeability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				return getCompressiveStrength();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				return getMaxAggregateSize();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				return getAdmixturesDescription();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				return getWorkability();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				return getProtectivePoreRatio();
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				return getWaterImpermeability();
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
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				setCompressiveStrength((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				setMaxAggregateSize((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				setAdmixturesDescription((String)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				setWorkability((String)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				setProtectivePoreRatio((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				setWaterImpermeability((String)newValue);
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
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				setCompressiveStrength(COMPRESSIVE_STRENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				setMaxAggregateSize(MAX_AGGREGATE_SIZE_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				setAdmixturesDescription(ADMIXTURES_DESCRIPTION_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				setWorkability(WORKABILITY_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				setProtectivePoreRatio(PROTECTIVE_PORE_RATIO_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				setWaterImpermeability(WATER_IMPERMEABILITY_EDEFAULT);
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
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__COMPRESSIVE_STRENGTH:
				return COMPRESSIVE_STRENGTH_EDEFAULT == null ? compressiveStrength != null : !COMPRESSIVE_STRENGTH_EDEFAULT.equals(compressiveStrength);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__MAX_AGGREGATE_SIZE:
				return MAX_AGGREGATE_SIZE_EDEFAULT == null ? maxAggregateSize != null : !MAX_AGGREGATE_SIZE_EDEFAULT.equals(maxAggregateSize);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__ADMIXTURES_DESCRIPTION:
				return ADMIXTURES_DESCRIPTION_EDEFAULT == null ? admixturesDescription != null : !ADMIXTURES_DESCRIPTION_EDEFAULT.equals(admixturesDescription);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WORKABILITY:
				return WORKABILITY_EDEFAULT == null ? workability != null : !WORKABILITY_EDEFAULT.equals(workability);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__PROTECTIVE_PORE_RATIO:
				return PROTECTIVE_PORE_RATIO_EDEFAULT == null ? protectivePoreRatio != null : !PROTECTIVE_PORE_RATIO_EDEFAULT.equals(protectivePoreRatio);
			case FinalPackage.IFC_MECHANICAL_CONCRETE_MATERIAL_PROPERTIES__WATER_IMPERMEABILITY:
				return WATER_IMPERMEABILITY_EDEFAULT == null ? waterImpermeability != null : !WATER_IMPERMEABILITY_EDEFAULT.equals(waterImpermeability);
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
		result.append(" (compressiveStrength: ");
		result.append(compressiveStrength);
		result.append(", maxAggregateSize: ");
		result.append(maxAggregateSize);
		result.append(", admixturesDescription: ");
		result.append(admixturesDescription);
		result.append(", workability: ");
		result.append(workability);
		result.append(", protectivePoreRatio: ");
		result.append(protectivePoreRatio);
		result.append(", waterImpermeability: ");
		result.append(waterImpermeability);
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalConcreteMaterialPropertiesImpl
