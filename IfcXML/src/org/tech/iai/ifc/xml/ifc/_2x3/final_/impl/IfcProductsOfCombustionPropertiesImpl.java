/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductsOfCombustionPropertiesImpl#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductsOfCombustionPropertiesImpl#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductsOfCombustionPropertiesImpl#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcProductsOfCombustionPropertiesImpl#getCO2Content <em>CO2 Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProductsOfCombustionPropertiesImpl extends IfcMaterialPropertiesImpl implements IfcProductsOfCombustionProperties {
	/**
	 * The default value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final Double SPECIFIC_HEAT_CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecificHeatCapacity() <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 * @ordered
	 */
	protected Double specificHeatCapacity = SPECIFIC_HEAT_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getN20Content() <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20Content()
	 * @generated
	 * @ordered
	 */
	protected static final Double N20_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getN20Content() <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getN20Content()
	 * @generated
	 * @ordered
	 */
	protected Double n20Content = N20_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCOContent() <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContent()
	 * @generated
	 * @ordered
	 */
	protected static final Double CO_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOContent() <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOContent()
	 * @generated
	 * @ordered
	 */
	protected Double cOContent = CO_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCO2Content() <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Content()
	 * @generated
	 * @ordered
	 */
	protected static final Double CO2_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCO2Content() <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCO2Content()
	 * @generated
	 * @ordered
	 */
	protected Double cO2Content = CO2_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProductsOfCombustionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcProductsOfCombustionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecificHeatCapacity(Double newSpecificHeatCapacity) {
		Double oldSpecificHeatCapacity = specificHeatCapacity;
		specificHeatCapacity = newSpecificHeatCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY, oldSpecificHeatCapacity, specificHeatCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getN20Content() {
		return n20Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setN20Content(Double newN20Content) {
		Double oldN20Content = n20Content;
		n20Content = newN20Content;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT, oldN20Content, n20Content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCOContent() {
		return cOContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOContent(Double newCOContent) {
		Double oldCOContent = cOContent;
		cOContent = newCOContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT, oldCOContent, cOContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCO2Content() {
		return cO2Content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCO2Content(Double newCO2Content) {
		Double oldCO2Content = cO2Content;
		cO2Content = newCO2Content;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT, oldCO2Content, cO2Content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return getSpecificHeatCapacity();
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				return getN20Content();
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				return getCOContent();
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				return getCO2Content();
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
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity((Double)newValue);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				setN20Content((Double)newValue);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				setCOContent((Double)newValue);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				setCO2Content((Double)newValue);
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
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				setSpecificHeatCapacity(SPECIFIC_HEAT_CAPACITY_EDEFAULT);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				setN20Content(N20_CONTENT_EDEFAULT);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				setCOContent(CO_CONTENT_EDEFAULT);
				return;
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				setCO2Content(CO2_CONTENT_EDEFAULT);
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
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__SPECIFIC_HEAT_CAPACITY:
				return SPECIFIC_HEAT_CAPACITY_EDEFAULT == null ? specificHeatCapacity != null : !SPECIFIC_HEAT_CAPACITY_EDEFAULT.equals(specificHeatCapacity);
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__N20_CONTENT:
				return N20_CONTENT_EDEFAULT == null ? n20Content != null : !N20_CONTENT_EDEFAULT.equals(n20Content);
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO_CONTENT:
				return CO_CONTENT_EDEFAULT == null ? cOContent != null : !CO_CONTENT_EDEFAULT.equals(cOContent);
			case FinalPackage.IFC_PRODUCTS_OF_COMBUSTION_PROPERTIES__CO2_CONTENT:
				return CO2_CONTENT_EDEFAULT == null ? cO2Content != null : !CO2_CONTENT_EDEFAULT.equals(cO2Content);
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
		result.append(" (specificHeatCapacity: ");
		result.append(specificHeatCapacity);
		result.append(", n20Content: ");
		result.append(n20Content);
		result.append(", cOContent: ");
		result.append(cOContent);
		result.append(", cO2Content: ");
		result.append(cO2Content);
		result.append(')');
		return result.toString();
	}

} //IfcProductsOfCombustionPropertiesImpl
