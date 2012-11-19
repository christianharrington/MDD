/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralMaterialPropertiesImpl#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralMaterialPropertiesImpl#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeneralMaterialPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcGeneralMaterialProperties {
	/**
	 * The default value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOLECULAR_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected Double molecularWeight = MOLECULAR_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPorosity() <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosity()
	 * @generated
	 * @ordered
	 */
	protected static final Double POROSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorosity() <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosity()
	 * @generated
	 * @ordered
	 */
	protected Double porosity = POROSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMassDensity() <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensity()
	 * @generated
	 * @ordered
	 */
	protected static final Double MASS_DENSITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMassDensity() <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensity()
	 * @generated
	 * @ordered
	 */
	protected Double massDensity = MASS_DENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralMaterialPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGeneralMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMolecularWeight() {
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(Double newMolecularWeight) {
		Double oldMolecularWeight = molecularWeight;
		molecularWeight = newMolecularWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT, oldMolecularWeight, molecularWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPorosity() {
		return porosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorosity(Double newPorosity) {
		Double oldPorosity = porosity;
		porosity = newPorosity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY, oldPorosity, porosity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMassDensity() {
		return massDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassDensity(Double newMassDensity) {
		Double oldMassDensity = massDensity;
		massDensity = newMassDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY, oldMassDensity, massDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				return getPorosity();
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				return getMassDensity();
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
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				setMolecularWeight((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				setPorosity((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				setMassDensity((Double)newValue);
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
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				setMolecularWeight(MOLECULAR_WEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				setPorosity(POROSITY_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				setMassDensity(MASS_DENSITY_EDEFAULT);
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
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				return MOLECULAR_WEIGHT_EDEFAULT == null ? molecularWeight != null : !MOLECULAR_WEIGHT_EDEFAULT.equals(molecularWeight);
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				return POROSITY_EDEFAULT == null ? porosity != null : !POROSITY_EDEFAULT.equals(porosity);
			case FinalPackage.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				return MASS_DENSITY_EDEFAULT == null ? massDensity != null : !MASS_DENSITY_EDEFAULT.equals(massDensity);
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
		result.append(" (molecularWeight: ");
		result.append(molecularWeight);
		result.append(", porosity: ");
		result.append(porosity);
		result.append(", massDensity: ");
		result.append(massDensity);
		result.append(')');
		return result.toString();
	}

} //IfcGeneralMaterialPropertiesImpl
