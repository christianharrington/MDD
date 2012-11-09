/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcGeneralMaterialProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMolecularWeightAsString <em>Molecular Weight As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getPorosityAsString <em>Porosity As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMassDensity <em>Mass Density</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcGeneralMaterialPropertiesImpl#getMassDensityAsString <em>Mass Density As String</em>}</li>
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
	protected static final double MOLECULAR_WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMolecularWeight() <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeight()
	 * @generated
	 * @ordered
	 */
	protected double molecularWeight = MOLECULAR_WEIGHT_EDEFAULT;

	/**
	 * This is true if the Molecular Weight attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean molecularWeightESet;

	/**
	 * The default value of the '{@link #getMolecularWeightAsString() <em>Molecular Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOLECULAR_WEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMolecularWeightAsString() <em>Molecular Weight As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMolecularWeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String molecularWeightAsString = MOLECULAR_WEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Molecular Weight As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean molecularWeightAsStringESet;

	/**
	 * The default value of the '{@link #getPorosity() <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosity()
	 * @generated
	 * @ordered
	 */
	protected static final double POROSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPorosity() <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosity()
	 * @generated
	 * @ordered
	 */
	protected double porosity = POROSITY_EDEFAULT;

	/**
	 * This is true if the Porosity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean porosityESet;

	/**
	 * The default value of the '{@link #getPorosityAsString() <em>Porosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String POROSITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPorosityAsString() <em>Porosity As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorosityAsString()
	 * @generated
	 * @ordered
	 */
	protected String porosityAsString = POROSITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Porosity As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean porosityAsStringESet;

	/**
	 * The default value of the '{@link #getMassDensity() <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensity()
	 * @generated
	 * @ordered
	 */
	protected static final double MASS_DENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMassDensity() <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensity()
	 * @generated
	 * @ordered
	 */
	protected double massDensity = MASS_DENSITY_EDEFAULT;

	/**
	 * This is true if the Mass Density attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean massDensityESet;

	/**
	 * The default value of the '{@link #getMassDensityAsString() <em>Mass Density As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensityAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MASS_DENSITY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMassDensityAsString() <em>Mass Density As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassDensityAsString()
	 * @generated
	 * @ordered
	 */
	protected String massDensityAsString = MASS_DENSITY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Mass Density As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean massDensityAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcGeneralMaterialProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMolecularWeight() {
		return molecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeight(double newMolecularWeight) {
		double oldMolecularWeight = molecularWeight;
		molecularWeight = newMolecularWeight;
		boolean oldMolecularWeightESet = molecularWeightESet;
		molecularWeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT, oldMolecularWeight, molecularWeight, !oldMolecularWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMolecularWeight() {
		double oldMolecularWeight = molecularWeight;
		boolean oldMolecularWeightESet = molecularWeightESet;
		molecularWeight = MOLECULAR_WEIGHT_EDEFAULT;
		molecularWeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT, oldMolecularWeight, MOLECULAR_WEIGHT_EDEFAULT, oldMolecularWeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMolecularWeight() {
		return molecularWeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMolecularWeightAsString() {
		return molecularWeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMolecularWeightAsString(String newMolecularWeightAsString) {
		String oldMolecularWeightAsString = molecularWeightAsString;
		molecularWeightAsString = newMolecularWeightAsString;
		boolean oldMolecularWeightAsStringESet = molecularWeightAsStringESet;
		molecularWeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING, oldMolecularWeightAsString, molecularWeightAsString, !oldMolecularWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMolecularWeightAsString() {
		String oldMolecularWeightAsString = molecularWeightAsString;
		boolean oldMolecularWeightAsStringESet = molecularWeightAsStringESet;
		molecularWeightAsString = MOLECULAR_WEIGHT_AS_STRING_EDEFAULT;
		molecularWeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING, oldMolecularWeightAsString, MOLECULAR_WEIGHT_AS_STRING_EDEFAULT, oldMolecularWeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMolecularWeightAsString() {
		return molecularWeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPorosity() {
		return porosity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorosity(double newPorosity) {
		double oldPorosity = porosity;
		porosity = newPorosity;
		boolean oldPorosityESet = porosityESet;
		porosityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY, oldPorosity, porosity, !oldPorosityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPorosity() {
		double oldPorosity = porosity;
		boolean oldPorosityESet = porosityESet;
		porosity = POROSITY_EDEFAULT;
		porosityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY, oldPorosity, POROSITY_EDEFAULT, oldPorosityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPorosity() {
		return porosityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPorosityAsString() {
		return porosityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorosityAsString(String newPorosityAsString) {
		String oldPorosityAsString = porosityAsString;
		porosityAsString = newPorosityAsString;
		boolean oldPorosityAsStringESet = porosityAsStringESet;
		porosityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING, oldPorosityAsString, porosityAsString, !oldPorosityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPorosityAsString() {
		String oldPorosityAsString = porosityAsString;
		boolean oldPorosityAsStringESet = porosityAsStringESet;
		porosityAsString = POROSITY_AS_STRING_EDEFAULT;
		porosityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING, oldPorosityAsString, POROSITY_AS_STRING_EDEFAULT, oldPorosityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPorosityAsString() {
		return porosityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMassDensity() {
		return massDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassDensity(double newMassDensity) {
		double oldMassDensity = massDensity;
		massDensity = newMassDensity;
		boolean oldMassDensityESet = massDensityESet;
		massDensityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY, oldMassDensity, massDensity, !oldMassDensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMassDensity() {
		double oldMassDensity = massDensity;
		boolean oldMassDensityESet = massDensityESet;
		massDensity = MASS_DENSITY_EDEFAULT;
		massDensityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY, oldMassDensity, MASS_DENSITY_EDEFAULT, oldMassDensityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMassDensity() {
		return massDensityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMassDensityAsString() {
		return massDensityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMassDensityAsString(String newMassDensityAsString) {
		String oldMassDensityAsString = massDensityAsString;
		massDensityAsString = newMassDensityAsString;
		boolean oldMassDensityAsStringESet = massDensityAsStringESet;
		massDensityAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING, oldMassDensityAsString, massDensityAsString, !oldMassDensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMassDensityAsString() {
		String oldMassDensityAsString = massDensityAsString;
		boolean oldMassDensityAsStringESet = massDensityAsStringESet;
		massDensityAsString = MASS_DENSITY_AS_STRING_EDEFAULT;
		massDensityAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING, oldMassDensityAsString, MASS_DENSITY_AS_STRING_EDEFAULT, oldMassDensityAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMassDensityAsString() {
		return massDensityAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				return getMolecularWeight();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING:
				return getMolecularWeightAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				return getPorosity();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING:
				return getPorosityAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				return getMassDensity();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING:
				return getMassDensityAsString();
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
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				setMolecularWeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING:
				setMolecularWeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				setPorosity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING:
				setPorosityAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				setMassDensity((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING:
				setMassDensityAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				unsetMolecularWeight();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING:
				unsetMolecularWeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				unsetPorosity();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING:
				unsetPorosityAsString();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				unsetMassDensity();
				return;
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING:
				unsetMassDensityAsString();
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
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT:
				return isSetMolecularWeight();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MOLECULAR_WEIGHT_AS_STRING:
				return isSetMolecularWeightAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY:
				return isSetPorosity();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__POROSITY_AS_STRING:
				return isSetPorosityAsString();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY:
				return isSetMassDensity();
			case Ifc2x3tc1Package.IFC_GENERAL_MATERIAL_PROPERTIES__MASS_DENSITY_AS_STRING:
				return isSetMassDensityAsString();
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
		result.append(" (MolecularWeight: ");
		if (molecularWeightESet) result.append(molecularWeight); else result.append("<unset>");
		result.append(", MolecularWeightAsString: ");
		if (molecularWeightAsStringESet) result.append(molecularWeightAsString); else result.append("<unset>");
		result.append(", Porosity: ");
		if (porosityESet) result.append(porosity); else result.append("<unset>");
		result.append(", PorosityAsString: ");
		if (porosityAsStringESet) result.append(porosityAsString); else result.append("<unset>");
		result.append(", MassDensity: ");
		if (massDensityESet) result.append(massDensity); else result.append("<unset>");
		result.append(", MassDensityAsString: ");
		if (massDensityAsStringESet) result.append(massDensityAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcGeneralMaterialPropertiesImpl
