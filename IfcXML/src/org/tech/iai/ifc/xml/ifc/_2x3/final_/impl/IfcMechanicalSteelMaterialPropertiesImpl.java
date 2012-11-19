/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.RelaxationsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalSteelMaterialPropertiesImpl#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalSteelMaterialPropertiesImpl extends IfcMechanicalMaterialPropertiesImpl implements IfcMechanicalSteelMaterialProperties {
	/**
	 * The default value of the '{@link #getYieldStress() <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStress()
	 * @generated
	 * @ordered
	 */
	protected static final Double YIELD_STRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYieldStress() <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYieldStress()
	 * @generated
	 * @ordered
	 */
	protected Double yieldStress = YIELD_STRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUltimateStress() <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStress()
	 * @generated
	 * @ordered
	 */
	protected static final Double ULTIMATE_STRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimateStress() <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStress()
	 * @generated
	 * @ordered
	 */
	protected Double ultimateStress = ULTIMATE_STRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUltimateStrain() <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrain()
	 * @generated
	 * @ordered
	 */
	protected static final Double ULTIMATE_STRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUltimateStrain() <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUltimateStrain()
	 * @generated
	 * @ordered
	 */
	protected Double ultimateStrain = ULTIMATE_STRAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardeningModule() <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModule()
	 * @generated
	 * @ordered
	 */
	protected static final Double HARDENING_MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardeningModule() <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardeningModule()
	 * @generated
	 * @ordered
	 */
	protected Double hardeningModule = HARDENING_MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProportionalStress() <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStress()
	 * @generated
	 * @ordered
	 */
	protected static final Double PROPORTIONAL_STRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProportionalStress() <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProportionalStress()
	 * @generated
	 * @ordered
	 */
	protected Double proportionalStress = PROPORTIONAL_STRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlasticStrain() <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrain()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLASTIC_STRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticStrain() <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticStrain()
	 * @generated
	 * @ordered
	 */
	protected Double plasticStrain = PLASTIC_STRAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelaxations() <em>Relaxations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelaxations()
	 * @generated
	 * @ordered
	 */
	protected RelaxationsType relaxations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalSteelMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMechanicalSteelMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getYieldStress() {
		return yieldStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYieldStress(Double newYieldStress) {
		Double oldYieldStress = yieldStress;
		yieldStress = newYieldStress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS, oldYieldStress, yieldStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUltimateStress() {
		return ultimateStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStress(Double newUltimateStress) {
		Double oldUltimateStress = ultimateStress;
		ultimateStress = newUltimateStress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS, oldUltimateStress, ultimateStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getUltimateStrain() {
		return ultimateStrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUltimateStrain(Double newUltimateStrain) {
		Double oldUltimateStrain = ultimateStrain;
		ultimateStrain = newUltimateStrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN, oldUltimateStrain, ultimateStrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHardeningModule() {
		return hardeningModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardeningModule(Double newHardeningModule) {
		Double oldHardeningModule = hardeningModule;
		hardeningModule = newHardeningModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE, oldHardeningModule, hardeningModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getProportionalStress() {
		return proportionalStress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProportionalStress(Double newProportionalStress) {
		Double oldProportionalStress = proportionalStress;
		proportionalStress = newProportionalStress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS, oldProportionalStress, proportionalStress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticStrain() {
		return plasticStrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticStrain(Double newPlasticStrain) {
		Double oldPlasticStrain = plasticStrain;
		plasticStrain = newPlasticStrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN, oldPlasticStrain, plasticStrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelaxationsType getRelaxations() {
		return relaxations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelaxations(RelaxationsType newRelaxations, NotificationChain msgs) {
		RelaxationsType oldRelaxations = relaxations;
		relaxations = newRelaxations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS, oldRelaxations, newRelaxations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelaxations(RelaxationsType newRelaxations) {
		if (newRelaxations != relaxations) {
			NotificationChain msgs = null;
			if (relaxations != null)
				msgs = ((InternalEObject)relaxations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS, null, msgs);
			if (newRelaxations != null)
				msgs = ((InternalEObject)newRelaxations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS, null, msgs);
			msgs = basicSetRelaxations(newRelaxations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS, newRelaxations, newRelaxations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				return basicSetRelaxations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				return getYieldStress();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				return getUltimateStress();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				return getUltimateStrain();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				return getHardeningModule();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				return getProportionalStress();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				return getPlasticStrain();
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				return getRelaxations();
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
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				setYieldStress((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				setUltimateStress((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				setUltimateStrain((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				setHardeningModule((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				setProportionalStress((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				setPlasticStrain((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				setRelaxations((RelaxationsType)newValue);
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
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				setYieldStress(YIELD_STRESS_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				setUltimateStress(ULTIMATE_STRESS_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				setUltimateStrain(ULTIMATE_STRAIN_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				setHardeningModule(HARDENING_MODULE_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				setProportionalStress(PROPORTIONAL_STRESS_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				setPlasticStrain(PLASTIC_STRAIN_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				setRelaxations((RelaxationsType)null);
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
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__YIELD_STRESS:
				return YIELD_STRESS_EDEFAULT == null ? yieldStress != null : !YIELD_STRESS_EDEFAULT.equals(yieldStress);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRESS:
				return ULTIMATE_STRESS_EDEFAULT == null ? ultimateStress != null : !ULTIMATE_STRESS_EDEFAULT.equals(ultimateStress);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__ULTIMATE_STRAIN:
				return ULTIMATE_STRAIN_EDEFAULT == null ? ultimateStrain != null : !ULTIMATE_STRAIN_EDEFAULT.equals(ultimateStrain);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__HARDENING_MODULE:
				return HARDENING_MODULE_EDEFAULT == null ? hardeningModule != null : !HARDENING_MODULE_EDEFAULT.equals(hardeningModule);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PROPORTIONAL_STRESS:
				return PROPORTIONAL_STRESS_EDEFAULT == null ? proportionalStress != null : !PROPORTIONAL_STRESS_EDEFAULT.equals(proportionalStress);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__PLASTIC_STRAIN:
				return PLASTIC_STRAIN_EDEFAULT == null ? plasticStrain != null : !PLASTIC_STRAIN_EDEFAULT.equals(plasticStrain);
			case FinalPackage.IFC_MECHANICAL_STEEL_MATERIAL_PROPERTIES__RELAXATIONS:
				return relaxations != null;
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
		result.append(" (yieldStress: ");
		result.append(yieldStress);
		result.append(", ultimateStress: ");
		result.append(ultimateStress);
		result.append(", ultimateStrain: ");
		result.append(ultimateStrain);
		result.append(", hardeningModule: ");
		result.append(hardeningModule);
		result.append(", proportionalStress: ");
		result.append(proportionalStress);
		result.append(", plasticStrain: ");
		result.append(plasticStrain);
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalSteelMaterialPropertiesImpl
