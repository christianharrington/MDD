/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcWaterPropertiesImpl#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcWaterPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcWaterProperties {
	/**
	 * The default value of the '{@link #getIsPotable() <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPotable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_POTABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsPotable() <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPotable()
	 * @generated
	 * @ordered
	 */
	protected Boolean isPotable = IS_POTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardness()
	 * @generated
	 * @ordered
	 */
	protected static final Double HARDNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardness() <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardness()
	 * @generated
	 * @ordered
	 */
	protected Double hardness = HARDNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlkalinityConcentration() <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final Double ALKALINITY_CONCENTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlkalinityConcentration() <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlkalinityConcentration()
	 * @generated
	 * @ordered
	 */
	protected Double alkalinityConcentration = ALKALINITY_CONCENTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcidityConcentration() <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final Double ACIDITY_CONCENTRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcidityConcentration() <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcidityConcentration()
	 * @generated
	 * @ordered
	 */
	protected Double acidityConcentration = ACIDITY_CONCENTRATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpuritiesContent() <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContent()
	 * @generated
	 * @ordered
	 */
	protected static final Double IMPURITIES_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpuritiesContent() <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpuritiesContent()
	 * @generated
	 * @ordered
	 */
	protected Double impuritiesContent = IMPURITIES_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPHLevel() <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Double PH_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPHLevel() <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPHLevel()
	 * @generated
	 * @ordered
	 */
	protected Double pHLevel = PH_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDissolvedSolidsContent() <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISSOLVED_SOLIDS_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDissolvedSolidsContent() <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 * @ordered
	 */
	protected Double dissolvedSolidsContent = DISSOLVED_SOLIDS_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcWaterPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcWaterProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsPotable() {
		return isPotable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPotable(Boolean newIsPotable) {
		Boolean oldIsPotable = isPotable;
		isPotable = newIsPotable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__IS_POTABLE, oldIsPotable, isPotable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getHardness() {
		return hardness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardness(Double newHardness) {
		Double oldHardness = hardness;
		hardness = newHardness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__HARDNESS, oldHardness, hardness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAlkalinityConcentration() {
		return alkalinityConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlkalinityConcentration(Double newAlkalinityConcentration) {
		Double oldAlkalinityConcentration = alkalinityConcentration;
		alkalinityConcentration = newAlkalinityConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION, oldAlkalinityConcentration, alkalinityConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getAcidityConcentration() {
		return acidityConcentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcidityConcentration(Double newAcidityConcentration) {
		Double oldAcidityConcentration = acidityConcentration;
		acidityConcentration = newAcidityConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION, oldAcidityConcentration, acidityConcentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getImpuritiesContent() {
		return impuritiesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpuritiesContent(Double newImpuritiesContent) {
		Double oldImpuritiesContent = impuritiesContent;
		impuritiesContent = newImpuritiesContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT, oldImpuritiesContent, impuritiesContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPHLevel() {
		return pHLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPHLevel(Double newPHLevel) {
		Double oldPHLevel = pHLevel;
		pHLevel = newPHLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__PH_LEVEL, oldPHLevel, pHLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDissolvedSolidsContent() {
		return dissolvedSolidsContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDissolvedSolidsContent(Double newDissolvedSolidsContent) {
		Double oldDissolvedSolidsContent = dissolvedSolidsContent;
		dissolvedSolidsContent = newDissolvedSolidsContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT, oldDissolvedSolidsContent, dissolvedSolidsContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_WATER_PROPERTIES__IS_POTABLE:
				return getIsPotable();
			case FinalPackage.IFC_WATER_PROPERTIES__HARDNESS:
				return getHardness();
			case FinalPackage.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				return getAlkalinityConcentration();
			case FinalPackage.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				return getAcidityConcentration();
			case FinalPackage.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				return getImpuritiesContent();
			case FinalPackage.IFC_WATER_PROPERTIES__PH_LEVEL:
				return getPHLevel();
			case FinalPackage.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				return getDissolvedSolidsContent();
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
			case FinalPackage.IFC_WATER_PROPERTIES__IS_POTABLE:
				setIsPotable((Boolean)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__HARDNESS:
				setHardness((Double)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				setAlkalinityConcentration((Double)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				setAcidityConcentration((Double)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				setImpuritiesContent((Double)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__PH_LEVEL:
				setPHLevel((Double)newValue);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				setDissolvedSolidsContent((Double)newValue);
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
			case FinalPackage.IFC_WATER_PROPERTIES__IS_POTABLE:
				setIsPotable(IS_POTABLE_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__HARDNESS:
				setHardness(HARDNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				setAlkalinityConcentration(ALKALINITY_CONCENTRATION_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				setAcidityConcentration(ACIDITY_CONCENTRATION_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				setImpuritiesContent(IMPURITIES_CONTENT_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__PH_LEVEL:
				setPHLevel(PH_LEVEL_EDEFAULT);
				return;
			case FinalPackage.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				setDissolvedSolidsContent(DISSOLVED_SOLIDS_CONTENT_EDEFAULT);
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
			case FinalPackage.IFC_WATER_PROPERTIES__IS_POTABLE:
				return IS_POTABLE_EDEFAULT == null ? isPotable != null : !IS_POTABLE_EDEFAULT.equals(isPotable);
			case FinalPackage.IFC_WATER_PROPERTIES__HARDNESS:
				return HARDNESS_EDEFAULT == null ? hardness != null : !HARDNESS_EDEFAULT.equals(hardness);
			case FinalPackage.IFC_WATER_PROPERTIES__ALKALINITY_CONCENTRATION:
				return ALKALINITY_CONCENTRATION_EDEFAULT == null ? alkalinityConcentration != null : !ALKALINITY_CONCENTRATION_EDEFAULT.equals(alkalinityConcentration);
			case FinalPackage.IFC_WATER_PROPERTIES__ACIDITY_CONCENTRATION:
				return ACIDITY_CONCENTRATION_EDEFAULT == null ? acidityConcentration != null : !ACIDITY_CONCENTRATION_EDEFAULT.equals(acidityConcentration);
			case FinalPackage.IFC_WATER_PROPERTIES__IMPURITIES_CONTENT:
				return IMPURITIES_CONTENT_EDEFAULT == null ? impuritiesContent != null : !IMPURITIES_CONTENT_EDEFAULT.equals(impuritiesContent);
			case FinalPackage.IFC_WATER_PROPERTIES__PH_LEVEL:
				return PH_LEVEL_EDEFAULT == null ? pHLevel != null : !PH_LEVEL_EDEFAULT.equals(pHLevel);
			case FinalPackage.IFC_WATER_PROPERTIES__DISSOLVED_SOLIDS_CONTENT:
				return DISSOLVED_SOLIDS_CONTENT_EDEFAULT == null ? dissolvedSolidsContent != null : !DISSOLVED_SOLIDS_CONTENT_EDEFAULT.equals(dissolvedSolidsContent);
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
		result.append(" (isPotable: ");
		result.append(isPotable);
		result.append(", hardness: ");
		result.append(hardness);
		result.append(", alkalinityConcentration: ");
		result.append(alkalinityConcentration);
		result.append(", acidityConcentration: ");
		result.append(acidityConcentration);
		result.append(", impuritiesContent: ");
		result.append(impuritiesContent);
		result.append(", pHLevel: ");
		result.append(pHLevel);
		result.append(", dissolvedSolidsContent: ");
		result.append(dissolvedSolidsContent);
		result.append(')');
		return result.toString();
	}

} //IfcWaterPropertiesImpl
