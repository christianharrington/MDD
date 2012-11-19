/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralSteelProfileProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Steel Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaZ <em>Shear Area Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaY <em>Shear Area Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralSteelProfilePropertiesImpl extends IfcStructuralProfilePropertiesImpl implements IfcStructuralSteelProfileProperties {
	/**
	 * The default value of the '{@link #getShearAreaZ() <em>Shear Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_AREA_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearAreaZ() <em>Shear Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaZ()
	 * @generated
	 * @ordered
	 */
	protected Double shearAreaZ = SHEAR_AREA_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearAreaY() <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_AREA_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearAreaY() <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaY()
	 * @generated
	 * @ordered
	 */
	protected Double shearAreaY = SHEAR_AREA_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorY() <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLASTIC_SHAPE_FACTOR_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorY() <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 * @ordered
	 */
	protected Double plasticShapeFactorY = PLASTIC_SHAPE_FACTOR_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorZ() <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLASTIC_SHAPE_FACTOR_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorZ() <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 * @ordered
	 */
	protected Double plasticShapeFactorZ = PLASTIC_SHAPE_FACTOR_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralSteelProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralSteelProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearAreaZ() {
		return shearAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaZ(Double newShearAreaZ) {
		Double oldShearAreaZ = shearAreaZ;
		shearAreaZ = newShearAreaZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z, oldShearAreaZ, shearAreaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearAreaY() {
		return shearAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaY(Double newShearAreaY) {
		Double oldShearAreaY = shearAreaY;
		shearAreaY = newShearAreaY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y, oldShearAreaY, shearAreaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticShapeFactorY() {
		return plasticShapeFactorY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorY(Double newPlasticShapeFactorY) {
		Double oldPlasticShapeFactorY = plasticShapeFactorY;
		plasticShapeFactorY = newPlasticShapeFactorY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y, oldPlasticShapeFactorY, plasticShapeFactorY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlasticShapeFactorZ() {
		return plasticShapeFactorZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorZ(Double newPlasticShapeFactorZ) {
		Double oldPlasticShapeFactorZ = plasticShapeFactorZ;
		plasticShapeFactorZ = newPlasticShapeFactorZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z, oldPlasticShapeFactorZ, plasticShapeFactorZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				return getShearAreaZ();
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				return getShearAreaY();
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				return getPlasticShapeFactorY();
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				return getPlasticShapeFactorZ();
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
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				setShearAreaZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				setShearAreaY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				setPlasticShapeFactorY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				setPlasticShapeFactorZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				setShearAreaZ(SHEAR_AREA_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				setShearAreaY(SHEAR_AREA_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				setPlasticShapeFactorY(PLASTIC_SHAPE_FACTOR_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				setPlasticShapeFactorZ(PLASTIC_SHAPE_FACTOR_Z_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				return SHEAR_AREA_Z_EDEFAULT == null ? shearAreaZ != null : !SHEAR_AREA_Z_EDEFAULT.equals(shearAreaZ);
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				return SHEAR_AREA_Y_EDEFAULT == null ? shearAreaY != null : !SHEAR_AREA_Y_EDEFAULT.equals(shearAreaY);
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				return PLASTIC_SHAPE_FACTOR_Y_EDEFAULT == null ? plasticShapeFactorY != null : !PLASTIC_SHAPE_FACTOR_Y_EDEFAULT.equals(plasticShapeFactorY);
			case FinalPackage.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				return PLASTIC_SHAPE_FACTOR_Z_EDEFAULT == null ? plasticShapeFactorZ != null : !PLASTIC_SHAPE_FACTOR_Z_EDEFAULT.equals(plasticShapeFactorZ);
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
		result.append(" (shearAreaZ: ");
		result.append(shearAreaZ);
		result.append(", shearAreaY: ");
		result.append(shearAreaY);
		result.append(", plasticShapeFactorY: ");
		result.append(plasticShapeFactorY);
		result.append(", plasticShapeFactorZ: ");
		result.append(plasticShapeFactorZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralSteelProfilePropertiesImpl
