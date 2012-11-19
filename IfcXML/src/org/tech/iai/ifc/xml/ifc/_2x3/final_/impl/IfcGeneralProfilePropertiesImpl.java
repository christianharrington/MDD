/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralProfileProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc General Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralProfilePropertiesImpl#getPhysicalWeight <em>Physical Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralProfilePropertiesImpl#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralProfilePropertiesImpl#getMinimumPlateThickness <em>Minimum Plate Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralProfilePropertiesImpl#getMaximumPlateThickness <em>Maximum Plate Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcGeneralProfilePropertiesImpl#getCrossSectionArea <em>Cross Section Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcGeneralProfilePropertiesImpl extends IfcProfilePropertiesImpl implements IfcGeneralProfileProperties {
	/**
	 * The default value of the '{@link #getPhysicalWeight() <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double PHYSICAL_WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysicalWeight() <em>Physical Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalWeight()
	 * @generated
	 * @ordered
	 */
	protected Double physicalWeight = PHYSICAL_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected static final Double PERIMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPerimeter() <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerimeter()
	 * @generated
	 * @ordered
	 */
	protected Double perimeter = PERIMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumPlateThickness() <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_PLATE_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumPlateThickness() <em>Minimum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected Double minimumPlateThickness = MINIMUM_PLATE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumPlateThickness() <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_PLATE_THICKNESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumPlateThickness() <em>Maximum Plate Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumPlateThickness()
	 * @generated
	 * @ordered
	 */
	protected Double maximumPlateThickness = MAXIMUM_PLATE_THICKNESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected static final Double CROSS_SECTION_AREA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCrossSectionArea() <em>Cross Section Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionArea()
	 * @generated
	 * @ordered
	 */
	protected Double crossSectionArea = CROSS_SECTION_AREA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcGeneralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcGeneralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPhysicalWeight() {
		return physicalWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysicalWeight(Double newPhysicalWeight) {
		Double oldPhysicalWeight = physicalWeight;
		physicalWeight = newPhysicalWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT, oldPhysicalWeight, physicalWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPerimeter() {
		return perimeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerimeter(Double newPerimeter) {
		Double oldPerimeter = perimeter;
		perimeter = newPerimeter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER, oldPerimeter, perimeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumPlateThickness() {
		return minimumPlateThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumPlateThickness(Double newMinimumPlateThickness) {
		Double oldMinimumPlateThickness = minimumPlateThickness;
		minimumPlateThickness = newMinimumPlateThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS, oldMinimumPlateThickness, minimumPlateThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumPlateThickness() {
		return maximumPlateThickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumPlateThickness(Double newMaximumPlateThickness) {
		Double oldMaximumPlateThickness = maximumPlateThickness;
		maximumPlateThickness = newMaximumPlateThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS, oldMaximumPlateThickness, maximumPlateThickness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCrossSectionArea() {
		return crossSectionArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionArea(Double newCrossSectionArea) {
		Double oldCrossSectionArea = crossSectionArea;
		crossSectionArea = newCrossSectionArea;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA, oldCrossSectionArea, crossSectionArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				return getPhysicalWeight();
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				return getPerimeter();
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				return getMinimumPlateThickness();
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				return getMaximumPlateThickness();
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				return getCrossSectionArea();
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
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				setPhysicalWeight((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				setPerimeter((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				setMinimumPlateThickness((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				setMaximumPlateThickness((Double)newValue);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				setCrossSectionArea((Double)newValue);
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
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				setPhysicalWeight(PHYSICAL_WEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				setPerimeter(PERIMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				setMinimumPlateThickness(MINIMUM_PLATE_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				setMaximumPlateThickness(MAXIMUM_PLATE_THICKNESS_EDEFAULT);
				return;
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				setCrossSectionArea(CROSS_SECTION_AREA_EDEFAULT);
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
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PHYSICAL_WEIGHT:
				return PHYSICAL_WEIGHT_EDEFAULT == null ? physicalWeight != null : !PHYSICAL_WEIGHT_EDEFAULT.equals(physicalWeight);
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__PERIMETER:
				return PERIMETER_EDEFAULT == null ? perimeter != null : !PERIMETER_EDEFAULT.equals(perimeter);
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MINIMUM_PLATE_THICKNESS:
				return MINIMUM_PLATE_THICKNESS_EDEFAULT == null ? minimumPlateThickness != null : !MINIMUM_PLATE_THICKNESS_EDEFAULT.equals(minimumPlateThickness);
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__MAXIMUM_PLATE_THICKNESS:
				return MAXIMUM_PLATE_THICKNESS_EDEFAULT == null ? maximumPlateThickness != null : !MAXIMUM_PLATE_THICKNESS_EDEFAULT.equals(maximumPlateThickness);
			case FinalPackage.IFC_GENERAL_PROFILE_PROPERTIES__CROSS_SECTION_AREA:
				return CROSS_SECTION_AREA_EDEFAULT == null ? crossSectionArea != null : !CROSS_SECTION_AREA_EDEFAULT.equals(crossSectionArea);
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
		result.append(" (physicalWeight: ");
		result.append(physicalWeight);
		result.append(", perimeter: ");
		result.append(perimeter);
		result.append(", minimumPlateThickness: ");
		result.append(minimumPlateThickness);
		result.append(", maximumPlateThickness: ");
		result.append(maximumPlateThickness);
		result.append(", crossSectionArea: ");
		result.append(crossSectionArea);
		result.append(')');
		return result.toString();
	}

} //IfcGeneralProfilePropertiesImpl
