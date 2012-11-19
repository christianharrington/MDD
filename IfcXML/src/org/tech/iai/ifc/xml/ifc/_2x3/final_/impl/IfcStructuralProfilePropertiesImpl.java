/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralProfileProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralProfilePropertiesImpl extends IfcGeneralProfilePropertiesImpl implements IfcStructuralProfileProperties {
	/**
	 * The default value of the '{@link #getTorsionalConstantX() <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalConstantX()
	 * @generated
	 * @ordered
	 */
	protected static final Double TORSIONAL_CONSTANT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTorsionalConstantX() <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalConstantX()
	 * @generated
	 * @ordered
	 */
	protected Double torsionalConstantX = TORSIONAL_CONSTANT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentOfInertiaYZ() <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_OF_INERTIA_YZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaYZ() <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 * @ordered
	 */
	protected Double momentOfInertiaYZ = MOMENT_OF_INERTIA_YZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentOfInertiaY() <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaY()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_OF_INERTIA_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaY() <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaY()
	 * @generated
	 * @ordered
	 */
	protected Double momentOfInertiaY = MOMENT_OF_INERTIA_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentOfInertiaZ() <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_OF_INERTIA_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaZ() <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 * @ordered
	 */
	protected Double momentOfInertiaZ = MOMENT_OF_INERTIA_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarpingConstant() <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstant()
	 * @generated
	 * @ordered
	 */
	protected static final Double WARPING_CONSTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarpingConstant() <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstant()
	 * @generated
	 * @ordered
	 */
	protected Double warpingConstant = WARPING_CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearCentreZ() <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_CENTRE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearCentreZ() <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZ()
	 * @generated
	 * @ordered
	 */
	protected Double shearCentreZ = SHEAR_CENTRE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearCentreY() <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_CENTRE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearCentreY() <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreY()
	 * @generated
	 * @ordered
	 */
	protected Double shearCentreY = SHEAR_CENTRE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearDeformationAreaZ() <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_DEFORMATION_AREA_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaZ() <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 * @ordered
	 */
	protected Double shearDeformationAreaZ = SHEAR_DEFORMATION_AREA_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getShearDeformationAreaY() <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHEAR_DEFORMATION_AREA_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaY() <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaY()
	 * @generated
	 * @ordered
	 */
	protected Double shearDeformationAreaY = SHEAR_DEFORMATION_AREA_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusY() <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_SECTION_MODULUS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusY() <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected Double maximumSectionModulusY = MAXIMUM_SECTION_MODULUS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusY() <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_SECTION_MODULUS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusY() <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected Double minimumSectionModulusY = MINIMUM_SECTION_MODULUS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusZ() <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_SECTION_MODULUS_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusZ() <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected Double maximumSectionModulusZ = MAXIMUM_SECTION_MODULUS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusZ() <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_SECTION_MODULUS_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusZ() <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected Double minimumSectionModulusZ = MINIMUM_SECTION_MODULUS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getTorsionalSectionModulus() <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 * @ordered
	 */
	protected static final Double TORSIONAL_SECTION_MODULUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTorsionalSectionModulus() <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 * @ordered
	 */
	protected Double torsionalSectionModulus = TORSIONAL_SECTION_MODULUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected static final Double CENTRE_OF_GRAVITY_IN_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected Double centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected static final Double CENTRE_OF_GRAVITY_IN_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected Double centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralProfilePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTorsionalConstantX() {
		return torsionalConstantX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalConstantX(Double newTorsionalConstantX) {
		Double oldTorsionalConstantX = torsionalConstantX;
		torsionalConstantX = newTorsionalConstantX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X, oldTorsionalConstantX, torsionalConstantX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaYZ() {
		return momentOfInertiaYZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYZ(Double newMomentOfInertiaYZ) {
		Double oldMomentOfInertiaYZ = momentOfInertiaYZ;
		momentOfInertiaYZ = newMomentOfInertiaYZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ, oldMomentOfInertiaYZ, momentOfInertiaYZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaY() {
		return momentOfInertiaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaY(Double newMomentOfInertiaY) {
		Double oldMomentOfInertiaY = momentOfInertiaY;
		momentOfInertiaY = newMomentOfInertiaY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y, oldMomentOfInertiaY, momentOfInertiaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentOfInertiaZ() {
		return momentOfInertiaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaZ(Double newMomentOfInertiaZ) {
		Double oldMomentOfInertiaZ = momentOfInertiaZ;
		momentOfInertiaZ = newMomentOfInertiaZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z, oldMomentOfInertiaZ, momentOfInertiaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getWarpingConstant() {
		return warpingConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingConstant(Double newWarpingConstant) {
		Double oldWarpingConstant = warpingConstant;
		warpingConstant = newWarpingConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT, oldWarpingConstant, warpingConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearCentreZ() {
		return shearCentreZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreZ(Double newShearCentreZ) {
		Double oldShearCentreZ = shearCentreZ;
		shearCentreZ = newShearCentreZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z, oldShearCentreZ, shearCentreZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearCentreY() {
		return shearCentreY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreY(Double newShearCentreY) {
		Double oldShearCentreY = shearCentreY;
		shearCentreY = newShearCentreY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y, oldShearCentreY, shearCentreY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearDeformationAreaZ() {
		return shearDeformationAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaZ(Double newShearDeformationAreaZ) {
		Double oldShearDeformationAreaZ = shearDeformationAreaZ;
		shearDeformationAreaZ = newShearDeformationAreaZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z, oldShearDeformationAreaZ, shearDeformationAreaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getShearDeformationAreaY() {
		return shearDeformationAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaY(Double newShearDeformationAreaY) {
		Double oldShearDeformationAreaY = shearDeformationAreaY;
		shearDeformationAreaY = newShearDeformationAreaY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y, oldShearDeformationAreaY, shearDeformationAreaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumSectionModulusY() {
		return maximumSectionModulusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusY(Double newMaximumSectionModulusY) {
		Double oldMaximumSectionModulusY = maximumSectionModulusY;
		maximumSectionModulusY = newMaximumSectionModulusY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y, oldMaximumSectionModulusY, maximumSectionModulusY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumSectionModulusY() {
		return minimumSectionModulusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusY(Double newMinimumSectionModulusY) {
		Double oldMinimumSectionModulusY = minimumSectionModulusY;
		minimumSectionModulusY = newMinimumSectionModulusY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y, oldMinimumSectionModulusY, minimumSectionModulusY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximumSectionModulusZ() {
		return maximumSectionModulusZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusZ(Double newMaximumSectionModulusZ) {
		Double oldMaximumSectionModulusZ = maximumSectionModulusZ;
		maximumSectionModulusZ = newMaximumSectionModulusZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z, oldMaximumSectionModulusZ, maximumSectionModulusZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimumSectionModulusZ() {
		return minimumSectionModulusZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusZ(Double newMinimumSectionModulusZ) {
		Double oldMinimumSectionModulusZ = minimumSectionModulusZ;
		minimumSectionModulusZ = newMinimumSectionModulusZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z, oldMinimumSectionModulusZ, minimumSectionModulusZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTorsionalSectionModulus() {
		return torsionalSectionModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalSectionModulus(Double newTorsionalSectionModulus) {
		Double oldTorsionalSectionModulus = torsionalSectionModulus;
		torsionalSectionModulus = newTorsionalSectionModulus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS, oldTorsionalSectionModulus, torsionalSectionModulus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInX() {
		return centreOfGravityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(Double newCentreOfGravityInX) {
		Double oldCentreOfGravityInX = centreOfGravityInX;
		centreOfGravityInX = newCentreOfGravityInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCentreOfGravityInY() {
		return centreOfGravityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(Double newCentreOfGravityInY) {
		Double oldCentreOfGravityInY = centreOfGravityInY;
		centreOfGravityInY = newCentreOfGravityInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				return getTorsionalConstantX();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				return getMomentOfInertiaYZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				return getMomentOfInertiaY();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				return getMomentOfInertiaZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				return getWarpingConstant();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				return getShearCentreZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				return getShearCentreY();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				return getShearDeformationAreaZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				return getShearDeformationAreaY();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				return getMaximumSectionModulusY();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				return getMinimumSectionModulusY();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				return getMaximumSectionModulusZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				return getMinimumSectionModulusZ();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				return getTorsionalSectionModulus();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
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
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				setTorsionalConstantX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				setMomentOfInertiaYZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				setMomentOfInertiaY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				setMomentOfInertiaZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				setWarpingConstant((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				setShearCentreZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				setShearCentreY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				setShearDeformationAreaZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				setShearDeformationAreaY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				setMaximumSectionModulusY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				setMinimumSectionModulusY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				setMaximumSectionModulusZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				setMinimumSectionModulusZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				setTorsionalSectionModulus((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				setTorsionalConstantX(TORSIONAL_CONSTANT_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				setMomentOfInertiaYZ(MOMENT_OF_INERTIA_YZ_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				setMomentOfInertiaY(MOMENT_OF_INERTIA_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				setMomentOfInertiaZ(MOMENT_OF_INERTIA_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				setWarpingConstant(WARPING_CONSTANT_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				setShearCentreZ(SHEAR_CENTRE_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				setShearCentreY(SHEAR_CENTRE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				setShearDeformationAreaZ(SHEAR_DEFORMATION_AREA_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				setShearDeformationAreaY(SHEAR_DEFORMATION_AREA_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				setMaximumSectionModulusY(MAXIMUM_SECTION_MODULUS_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				setMinimumSectionModulusY(MINIMUM_SECTION_MODULUS_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				setMaximumSectionModulusZ(MAXIMUM_SECTION_MODULUS_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				setMinimumSectionModulusZ(MINIMUM_SECTION_MODULUS_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				setTorsionalSectionModulus(TORSIONAL_SECTION_MODULUS_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX(CENTRE_OF_GRAVITY_IN_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY(CENTRE_OF_GRAVITY_IN_Y_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				return TORSIONAL_CONSTANT_X_EDEFAULT == null ? torsionalConstantX != null : !TORSIONAL_CONSTANT_X_EDEFAULT.equals(torsionalConstantX);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				return MOMENT_OF_INERTIA_YZ_EDEFAULT == null ? momentOfInertiaYZ != null : !MOMENT_OF_INERTIA_YZ_EDEFAULT.equals(momentOfInertiaYZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				return MOMENT_OF_INERTIA_Y_EDEFAULT == null ? momentOfInertiaY != null : !MOMENT_OF_INERTIA_Y_EDEFAULT.equals(momentOfInertiaY);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				return MOMENT_OF_INERTIA_Z_EDEFAULT == null ? momentOfInertiaZ != null : !MOMENT_OF_INERTIA_Z_EDEFAULT.equals(momentOfInertiaZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				return WARPING_CONSTANT_EDEFAULT == null ? warpingConstant != null : !WARPING_CONSTANT_EDEFAULT.equals(warpingConstant);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				return SHEAR_CENTRE_Z_EDEFAULT == null ? shearCentreZ != null : !SHEAR_CENTRE_Z_EDEFAULT.equals(shearCentreZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				return SHEAR_CENTRE_Y_EDEFAULT == null ? shearCentreY != null : !SHEAR_CENTRE_Y_EDEFAULT.equals(shearCentreY);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				return SHEAR_DEFORMATION_AREA_Z_EDEFAULT == null ? shearDeformationAreaZ != null : !SHEAR_DEFORMATION_AREA_Z_EDEFAULT.equals(shearDeformationAreaZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				return SHEAR_DEFORMATION_AREA_Y_EDEFAULT == null ? shearDeformationAreaY != null : !SHEAR_DEFORMATION_AREA_Y_EDEFAULT.equals(shearDeformationAreaY);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				return MAXIMUM_SECTION_MODULUS_Y_EDEFAULT == null ? maximumSectionModulusY != null : !MAXIMUM_SECTION_MODULUS_Y_EDEFAULT.equals(maximumSectionModulusY);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				return MINIMUM_SECTION_MODULUS_Y_EDEFAULT == null ? minimumSectionModulusY != null : !MINIMUM_SECTION_MODULUS_Y_EDEFAULT.equals(minimumSectionModulusY);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				return MAXIMUM_SECTION_MODULUS_Z_EDEFAULT == null ? maximumSectionModulusZ != null : !MAXIMUM_SECTION_MODULUS_Z_EDEFAULT.equals(maximumSectionModulusZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				return MINIMUM_SECTION_MODULUS_Z_EDEFAULT == null ? minimumSectionModulusZ != null : !MINIMUM_SECTION_MODULUS_Z_EDEFAULT.equals(minimumSectionModulusZ);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				return TORSIONAL_SECTION_MODULUS_EDEFAULT == null ? torsionalSectionModulus != null : !TORSIONAL_SECTION_MODULUS_EDEFAULT.equals(torsionalSectionModulus);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				return CENTRE_OF_GRAVITY_IN_X_EDEFAULT == null ? centreOfGravityInX != null : !CENTRE_OF_GRAVITY_IN_X_EDEFAULT.equals(centreOfGravityInX);
			case FinalPackage.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				return CENTRE_OF_GRAVITY_IN_Y_EDEFAULT == null ? centreOfGravityInY != null : !CENTRE_OF_GRAVITY_IN_Y_EDEFAULT.equals(centreOfGravityInY);
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
		result.append(" (torsionalConstantX: ");
		result.append(torsionalConstantX);
		result.append(", momentOfInertiaYZ: ");
		result.append(momentOfInertiaYZ);
		result.append(", momentOfInertiaY: ");
		result.append(momentOfInertiaY);
		result.append(", momentOfInertiaZ: ");
		result.append(momentOfInertiaZ);
		result.append(", warpingConstant: ");
		result.append(warpingConstant);
		result.append(", shearCentreZ: ");
		result.append(shearCentreZ);
		result.append(", shearCentreY: ");
		result.append(shearCentreY);
		result.append(", shearDeformationAreaZ: ");
		result.append(shearDeformationAreaZ);
		result.append(", shearDeformationAreaY: ");
		result.append(shearDeformationAreaY);
		result.append(", maximumSectionModulusY: ");
		result.append(maximumSectionModulusY);
		result.append(", minimumSectionModulusY: ");
		result.append(minimumSectionModulusY);
		result.append(", maximumSectionModulusZ: ");
		result.append(maximumSectionModulusZ);
		result.append(", minimumSectionModulusZ: ");
		result.append(minimumSectionModulusZ);
		result.append(", torsionalSectionModulus: ");
		result.append(torsionalSectionModulus);
		result.append(", centreOfGravityInX: ");
		result.append(centreOfGravityInX);
		result.append(", centreOfGravityInY: ");
		result.append(centreOfGravityInY);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralProfilePropertiesImpl
