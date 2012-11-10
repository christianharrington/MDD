/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getTorsionalConstantX <em>Torsional Constant X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getTorsionalConstantXAsString <em>Torsional Constant XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYZ <em>Moment Of Inertia YZ</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYZAsString <em>Moment Of Inertia YZ As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaY <em>Moment Of Inertia Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaYAsString <em>Moment Of Inertia YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaZ <em>Moment Of Inertia Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMomentOfInertiaZAsString <em>Moment Of Inertia ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getWarpingConstant <em>Warping Constant</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getWarpingConstantAsString <em>Warping Constant As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearCentreZ <em>Shear Centre Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearCentreZAsString <em>Shear Centre ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearCentreY <em>Shear Centre Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearCentreYAsString <em>Shear Centre YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaZ <em>Shear Deformation Area Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaZAsString <em>Shear Deformation Area ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaY <em>Shear Deformation Area Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getShearDeformationAreaYAsString <em>Shear Deformation Area YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusY <em>Maximum Section Modulus Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusYAsString <em>Maximum Section Modulus YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusY <em>Minimum Section Modulus Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusYAsString <em>Minimum Section Modulus YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusZ <em>Maximum Section Modulus Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMaximumSectionModulusZAsString <em>Maximum Section Modulus ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusZ <em>Minimum Section Modulus Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getMinimumSectionModulusZAsString <em>Minimum Section Modulus ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getTorsionalSectionModulus <em>Torsional Section Modulus</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getTorsionalSectionModulusAsString <em>Torsional Section Modulus As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInX <em>Centre Of Gravity In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInXAsString <em>Centre Of Gravity In XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralProfilePropertiesImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
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
	protected static final double TORSIONAL_CONSTANT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTorsionalConstantX() <em>Torsional Constant X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalConstantX()
	 * @generated
	 * @ordered
	 */
	protected double torsionalConstantX = TORSIONAL_CONSTANT_X_EDEFAULT;

	/**
	 * This is true if the Torsional Constant X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean torsionalConstantXESet;

	/**
	 * The default value of the '{@link #getTorsionalConstantXAsString() <em>Torsional Constant XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalConstantXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TORSIONAL_CONSTANT_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTorsionalConstantXAsString() <em>Torsional Constant XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalConstantXAsString()
	 * @generated
	 * @ordered
	 */
	protected String torsionalConstantXAsString = TORSIONAL_CONSTANT_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Torsional Constant XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean torsionalConstantXAsStringESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaYZ() <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_OF_INERTIA_YZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaYZ() <em>Moment Of Inertia YZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZ()
	 * @generated
	 * @ordered
	 */
	protected double momentOfInertiaYZ = MOMENT_OF_INERTIA_YZ_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia YZ attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaYZESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaYZAsString() <em>Moment Of Inertia YZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_OF_INERTIA_YZ_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaYZAsString() <em>Moment Of Inertia YZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYZAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentOfInertiaYZAsString = MOMENT_OF_INERTIA_YZ_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia YZ As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaYZAsStringESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaY() <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaY()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_OF_INERTIA_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaY() <em>Moment Of Inertia Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaY()
	 * @generated
	 * @ordered
	 */
	protected double momentOfInertiaY = MOMENT_OF_INERTIA_Y_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaYESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaYAsString() <em>Moment Of Inertia YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_OF_INERTIA_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaYAsString() <em>Moment Of Inertia YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaYAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentOfInertiaYAsString = MOMENT_OF_INERTIA_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaYAsStringESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaZ() <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_OF_INERTIA_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaZ() <em>Moment Of Inertia Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZ()
	 * @generated
	 * @ordered
	 */
	protected double momentOfInertiaZ = MOMENT_OF_INERTIA_Z_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaZESet;

	/**
	 * The default value of the '{@link #getMomentOfInertiaZAsString() <em>Moment Of Inertia ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_OF_INERTIA_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentOfInertiaZAsString() <em>Moment Of Inertia ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentOfInertiaZAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentOfInertiaZAsString = MOMENT_OF_INERTIA_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment Of Inertia ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentOfInertiaZAsStringESet;

	/**
	 * The default value of the '{@link #getWarpingConstant() <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstant()
	 * @generated
	 * @ordered
	 */
	protected static final double WARPING_CONSTANT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWarpingConstant() <em>Warping Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstant()
	 * @generated
	 * @ordered
	 */
	protected double warpingConstant = WARPING_CONSTANT_EDEFAULT;

	/**
	 * This is true if the Warping Constant attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingConstantESet;

	/**
	 * The default value of the '{@link #getWarpingConstantAsString() <em>Warping Constant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstantAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String WARPING_CONSTANT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWarpingConstantAsString() <em>Warping Constant As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarpingConstantAsString()
	 * @generated
	 * @ordered
	 */
	protected String warpingConstantAsString = WARPING_CONSTANT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Warping Constant As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warpingConstantAsStringESet;

	/**
	 * The default value of the '{@link #getShearCentreZ() <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZ()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_CENTRE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearCentreZ() <em>Shear Centre Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZ()
	 * @generated
	 * @ordered
	 */
	protected double shearCentreZ = SHEAR_CENTRE_Z_EDEFAULT;

	/**
	 * This is true if the Shear Centre Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearCentreZESet;

	/**
	 * The default value of the '{@link #getShearCentreZAsString() <em>Shear Centre ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_CENTRE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearCentreZAsString() <em>Shear Centre ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreZAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearCentreZAsString = SHEAR_CENTRE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Centre ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearCentreZAsStringESet;

	/**
	 * The default value of the '{@link #getShearCentreY() <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreY()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_CENTRE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearCentreY() <em>Shear Centre Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreY()
	 * @generated
	 * @ordered
	 */
	protected double shearCentreY = SHEAR_CENTRE_Y_EDEFAULT;

	/**
	 * This is true if the Shear Centre Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearCentreYESet;

	/**
	 * The default value of the '{@link #getShearCentreYAsString() <em>Shear Centre YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_CENTRE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearCentreYAsString() <em>Shear Centre YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearCentreYAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearCentreYAsString = SHEAR_CENTRE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Centre YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearCentreYAsStringESet;

	/**
	 * The default value of the '{@link #getShearDeformationAreaZ() <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_DEFORMATION_AREA_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaZ() <em>Shear Deformation Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZ()
	 * @generated
	 * @ordered
	 */
	protected double shearDeformationAreaZ = SHEAR_DEFORMATION_AREA_Z_EDEFAULT;

	/**
	 * This is true if the Shear Deformation Area Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearDeformationAreaZESet;

	/**
	 * The default value of the '{@link #getShearDeformationAreaZAsString() <em>Shear Deformation Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_DEFORMATION_AREA_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaZAsString() <em>Shear Deformation Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearDeformationAreaZAsString = SHEAR_DEFORMATION_AREA_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Deformation Area ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearDeformationAreaZAsStringESet;

	/**
	 * The default value of the '{@link #getShearDeformationAreaY() <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_DEFORMATION_AREA_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaY() <em>Shear Deformation Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaY()
	 * @generated
	 * @ordered
	 */
	protected double shearDeformationAreaY = SHEAR_DEFORMATION_AREA_Y_EDEFAULT;

	/**
	 * This is true if the Shear Deformation Area Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearDeformationAreaYESet;

	/**
	 * The default value of the '{@link #getShearDeformationAreaYAsString() <em>Shear Deformation Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_DEFORMATION_AREA_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearDeformationAreaYAsString() <em>Shear Deformation Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearDeformationAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearDeformationAreaYAsString = SHEAR_DEFORMATION_AREA_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Deformation Area YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearDeformationAreaYAsStringESet;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusY() <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_SECTION_MODULUS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusY() <em>Maximum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected double maximumSectionModulusY = MAXIMUM_SECTION_MODULUS_Y_EDEFAULT;

	/**
	 * This is true if the Maximum Section Modulus Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumSectionModulusYESet;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusYAsString() <em>Maximum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusYAsString() <em>Maximum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusYAsString()
	 * @generated
	 * @ordered
	 */
	protected String maximumSectionModulusYAsString = MAXIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Maximum Section Modulus YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumSectionModulusYAsStringESet;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusY() <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_SECTION_MODULUS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusY() <em>Minimum Section Modulus Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusY()
	 * @generated
	 * @ordered
	 */
	protected double minimumSectionModulusY = MINIMUM_SECTION_MODULUS_Y_EDEFAULT;

	/**
	 * This is true if the Minimum Section Modulus Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumSectionModulusYESet;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusYAsString() <em>Minimum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusYAsString() <em>Minimum Section Modulus YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusYAsString()
	 * @generated
	 * @ordered
	 */
	protected String minimumSectionModulusYAsString = MINIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Minimum Section Modulus YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumSectionModulusYAsStringESet;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusZ() <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_SECTION_MODULUS_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusZ() <em>Maximum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected double maximumSectionModulusZ = MAXIMUM_SECTION_MODULUS_Z_EDEFAULT;

	/**
	 * This is true if the Maximum Section Modulus Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumSectionModulusZESet;

	/**
	 * The default value of the '{@link #getMaximumSectionModulusZAsString() <em>Maximum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumSectionModulusZAsString() <em>Maximum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumSectionModulusZAsString()
	 * @generated
	 * @ordered
	 */
	protected String maximumSectionModulusZAsString = MAXIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Maximum Section Modulus ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumSectionModulusZAsStringESet;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusZ() <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_SECTION_MODULUS_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusZ() <em>Minimum Section Modulus Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZ()
	 * @generated
	 * @ordered
	 */
	protected double minimumSectionModulusZ = MINIMUM_SECTION_MODULUS_Z_EDEFAULT;

	/**
	 * This is true if the Minimum Section Modulus Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumSectionModulusZESet;

	/**
	 * The default value of the '{@link #getMinimumSectionModulusZAsString() <em>Minimum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumSectionModulusZAsString() <em>Minimum Section Modulus ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumSectionModulusZAsString()
	 * @generated
	 * @ordered
	 */
	protected String minimumSectionModulusZAsString = MINIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Minimum Section Modulus ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimumSectionModulusZAsStringESet;

	/**
	 * The default value of the '{@link #getTorsionalSectionModulus() <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 * @ordered
	 */
	protected static final double TORSIONAL_SECTION_MODULUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTorsionalSectionModulus() <em>Torsional Section Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulus()
	 * @generated
	 * @ordered
	 */
	protected double torsionalSectionModulus = TORSIONAL_SECTION_MODULUS_EDEFAULT;

	/**
	 * This is true if the Torsional Section Modulus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean torsionalSectionModulusESet;

	/**
	 * The default value of the '{@link #getTorsionalSectionModulusAsString() <em>Torsional Section Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String TORSIONAL_SECTION_MODULUS_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTorsionalSectionModulusAsString() <em>Torsional Section Modulus As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTorsionalSectionModulusAsString()
	 * @generated
	 * @ordered
	 */
	protected String torsionalSectionModulusAsString = TORSIONAL_SECTION_MODULUS_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Torsional Section Modulus As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean torsionalSectionModulusAsStringESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRE_OF_GRAVITY_IN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInX() <em>Centre Of Gravity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInX()
	 * @generated
	 * @ordered
	 */
	protected double centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInXESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInXAsString() <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInXAsString() <em>Centre Of Gravity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected String centreOfGravityInXAsString = CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInXAsStringESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected static final double CENTRE_OF_GRAVITY_IN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInY() <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInY()
	 * @generated
	 * @ordered
	 */
	protected double centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInYESet;

	/**
	 * The default value of the '{@link #getCentreOfGravityInYAsString() <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentreOfGravityInYAsString() <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected String centreOfGravityInYAsString = CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Centre Of Gravity In YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean centreOfGravityInYAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTorsionalConstantX() {
		return torsionalConstantX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalConstantX(double newTorsionalConstantX) {
		double oldTorsionalConstantX = torsionalConstantX;
		torsionalConstantX = newTorsionalConstantX;
		boolean oldTorsionalConstantXESet = torsionalConstantXESet;
		torsionalConstantXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X, oldTorsionalConstantX, torsionalConstantX, !oldTorsionalConstantXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalConstantX() {
		double oldTorsionalConstantX = torsionalConstantX;
		boolean oldTorsionalConstantXESet = torsionalConstantXESet;
		torsionalConstantX = TORSIONAL_CONSTANT_X_EDEFAULT;
		torsionalConstantXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X, oldTorsionalConstantX, TORSIONAL_CONSTANT_X_EDEFAULT, oldTorsionalConstantXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalConstantX() {
		return torsionalConstantXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTorsionalConstantXAsString() {
		return torsionalConstantXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalConstantXAsString(String newTorsionalConstantXAsString) {
		String oldTorsionalConstantXAsString = torsionalConstantXAsString;
		torsionalConstantXAsString = newTorsionalConstantXAsString;
		boolean oldTorsionalConstantXAsStringESet = torsionalConstantXAsStringESet;
		torsionalConstantXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING, oldTorsionalConstantXAsString, torsionalConstantXAsString, !oldTorsionalConstantXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalConstantXAsString() {
		String oldTorsionalConstantXAsString = torsionalConstantXAsString;
		boolean oldTorsionalConstantXAsStringESet = torsionalConstantXAsStringESet;
		torsionalConstantXAsString = TORSIONAL_CONSTANT_XAS_STRING_EDEFAULT;
		torsionalConstantXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING, oldTorsionalConstantXAsString, TORSIONAL_CONSTANT_XAS_STRING_EDEFAULT, oldTorsionalConstantXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalConstantXAsString() {
		return torsionalConstantXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentOfInertiaYZ() {
		return momentOfInertiaYZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYZ(double newMomentOfInertiaYZ) {
		double oldMomentOfInertiaYZ = momentOfInertiaYZ;
		momentOfInertiaYZ = newMomentOfInertiaYZ;
		boolean oldMomentOfInertiaYZESet = momentOfInertiaYZESet;
		momentOfInertiaYZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ, oldMomentOfInertiaYZ, momentOfInertiaYZ, !oldMomentOfInertiaYZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaYZ() {
		double oldMomentOfInertiaYZ = momentOfInertiaYZ;
		boolean oldMomentOfInertiaYZESet = momentOfInertiaYZESet;
		momentOfInertiaYZ = MOMENT_OF_INERTIA_YZ_EDEFAULT;
		momentOfInertiaYZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ, oldMomentOfInertiaYZ, MOMENT_OF_INERTIA_YZ_EDEFAULT, oldMomentOfInertiaYZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaYZ() {
		return momentOfInertiaYZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentOfInertiaYZAsString() {
		return momentOfInertiaYZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYZAsString(String newMomentOfInertiaYZAsString) {
		String oldMomentOfInertiaYZAsString = momentOfInertiaYZAsString;
		momentOfInertiaYZAsString = newMomentOfInertiaYZAsString;
		boolean oldMomentOfInertiaYZAsStringESet = momentOfInertiaYZAsStringESet;
		momentOfInertiaYZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING, oldMomentOfInertiaYZAsString, momentOfInertiaYZAsString, !oldMomentOfInertiaYZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaYZAsString() {
		String oldMomentOfInertiaYZAsString = momentOfInertiaYZAsString;
		boolean oldMomentOfInertiaYZAsStringESet = momentOfInertiaYZAsStringESet;
		momentOfInertiaYZAsString = MOMENT_OF_INERTIA_YZ_AS_STRING_EDEFAULT;
		momentOfInertiaYZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING, oldMomentOfInertiaYZAsString, MOMENT_OF_INERTIA_YZ_AS_STRING_EDEFAULT, oldMomentOfInertiaYZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaYZAsString() {
		return momentOfInertiaYZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentOfInertiaY() {
		return momentOfInertiaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaY(double newMomentOfInertiaY) {
		double oldMomentOfInertiaY = momentOfInertiaY;
		momentOfInertiaY = newMomentOfInertiaY;
		boolean oldMomentOfInertiaYESet = momentOfInertiaYESet;
		momentOfInertiaYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y, oldMomentOfInertiaY, momentOfInertiaY, !oldMomentOfInertiaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaY() {
		double oldMomentOfInertiaY = momentOfInertiaY;
		boolean oldMomentOfInertiaYESet = momentOfInertiaYESet;
		momentOfInertiaY = MOMENT_OF_INERTIA_Y_EDEFAULT;
		momentOfInertiaYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y, oldMomentOfInertiaY, MOMENT_OF_INERTIA_Y_EDEFAULT, oldMomentOfInertiaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaY() {
		return momentOfInertiaYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentOfInertiaYAsString() {
		return momentOfInertiaYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaYAsString(String newMomentOfInertiaYAsString) {
		String oldMomentOfInertiaYAsString = momentOfInertiaYAsString;
		momentOfInertiaYAsString = newMomentOfInertiaYAsString;
		boolean oldMomentOfInertiaYAsStringESet = momentOfInertiaYAsStringESet;
		momentOfInertiaYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING, oldMomentOfInertiaYAsString, momentOfInertiaYAsString, !oldMomentOfInertiaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaYAsString() {
		String oldMomentOfInertiaYAsString = momentOfInertiaYAsString;
		boolean oldMomentOfInertiaYAsStringESet = momentOfInertiaYAsStringESet;
		momentOfInertiaYAsString = MOMENT_OF_INERTIA_YAS_STRING_EDEFAULT;
		momentOfInertiaYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING, oldMomentOfInertiaYAsString, MOMENT_OF_INERTIA_YAS_STRING_EDEFAULT, oldMomentOfInertiaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaYAsString() {
		return momentOfInertiaYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentOfInertiaZ() {
		return momentOfInertiaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaZ(double newMomentOfInertiaZ) {
		double oldMomentOfInertiaZ = momentOfInertiaZ;
		momentOfInertiaZ = newMomentOfInertiaZ;
		boolean oldMomentOfInertiaZESet = momentOfInertiaZESet;
		momentOfInertiaZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z, oldMomentOfInertiaZ, momentOfInertiaZ, !oldMomentOfInertiaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaZ() {
		double oldMomentOfInertiaZ = momentOfInertiaZ;
		boolean oldMomentOfInertiaZESet = momentOfInertiaZESet;
		momentOfInertiaZ = MOMENT_OF_INERTIA_Z_EDEFAULT;
		momentOfInertiaZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z, oldMomentOfInertiaZ, MOMENT_OF_INERTIA_Z_EDEFAULT, oldMomentOfInertiaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaZ() {
		return momentOfInertiaZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentOfInertiaZAsString() {
		return momentOfInertiaZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentOfInertiaZAsString(String newMomentOfInertiaZAsString) {
		String oldMomentOfInertiaZAsString = momentOfInertiaZAsString;
		momentOfInertiaZAsString = newMomentOfInertiaZAsString;
		boolean oldMomentOfInertiaZAsStringESet = momentOfInertiaZAsStringESet;
		momentOfInertiaZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING, oldMomentOfInertiaZAsString, momentOfInertiaZAsString, !oldMomentOfInertiaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentOfInertiaZAsString() {
		String oldMomentOfInertiaZAsString = momentOfInertiaZAsString;
		boolean oldMomentOfInertiaZAsStringESet = momentOfInertiaZAsStringESet;
		momentOfInertiaZAsString = MOMENT_OF_INERTIA_ZAS_STRING_EDEFAULT;
		momentOfInertiaZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING, oldMomentOfInertiaZAsString, MOMENT_OF_INERTIA_ZAS_STRING_EDEFAULT, oldMomentOfInertiaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentOfInertiaZAsString() {
		return momentOfInertiaZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWarpingConstant() {
		return warpingConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingConstant(double newWarpingConstant) {
		double oldWarpingConstant = warpingConstant;
		warpingConstant = newWarpingConstant;
		boolean oldWarpingConstantESet = warpingConstantESet;
		warpingConstantESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT, oldWarpingConstant, warpingConstant, !oldWarpingConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingConstant() {
		double oldWarpingConstant = warpingConstant;
		boolean oldWarpingConstantESet = warpingConstantESet;
		warpingConstant = WARPING_CONSTANT_EDEFAULT;
		warpingConstantESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT, oldWarpingConstant, WARPING_CONSTANT_EDEFAULT, oldWarpingConstantESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingConstant() {
		return warpingConstantESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarpingConstantAsString() {
		return warpingConstantAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarpingConstantAsString(String newWarpingConstantAsString) {
		String oldWarpingConstantAsString = warpingConstantAsString;
		warpingConstantAsString = newWarpingConstantAsString;
		boolean oldWarpingConstantAsStringESet = warpingConstantAsStringESet;
		warpingConstantAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING, oldWarpingConstantAsString, warpingConstantAsString, !oldWarpingConstantAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarpingConstantAsString() {
		String oldWarpingConstantAsString = warpingConstantAsString;
		boolean oldWarpingConstantAsStringESet = warpingConstantAsStringESet;
		warpingConstantAsString = WARPING_CONSTANT_AS_STRING_EDEFAULT;
		warpingConstantAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING, oldWarpingConstantAsString, WARPING_CONSTANT_AS_STRING_EDEFAULT, oldWarpingConstantAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarpingConstantAsString() {
		return warpingConstantAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearCentreZ() {
		return shearCentreZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreZ(double newShearCentreZ) {
		double oldShearCentreZ = shearCentreZ;
		shearCentreZ = newShearCentreZ;
		boolean oldShearCentreZESet = shearCentreZESet;
		shearCentreZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z, oldShearCentreZ, shearCentreZ, !oldShearCentreZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreZ() {
		double oldShearCentreZ = shearCentreZ;
		boolean oldShearCentreZESet = shearCentreZESet;
		shearCentreZ = SHEAR_CENTRE_Z_EDEFAULT;
		shearCentreZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z, oldShearCentreZ, SHEAR_CENTRE_Z_EDEFAULT, oldShearCentreZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreZ() {
		return shearCentreZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearCentreZAsString() {
		return shearCentreZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreZAsString(String newShearCentreZAsString) {
		String oldShearCentreZAsString = shearCentreZAsString;
		shearCentreZAsString = newShearCentreZAsString;
		boolean oldShearCentreZAsStringESet = shearCentreZAsStringESet;
		shearCentreZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING, oldShearCentreZAsString, shearCentreZAsString, !oldShearCentreZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreZAsString() {
		String oldShearCentreZAsString = shearCentreZAsString;
		boolean oldShearCentreZAsStringESet = shearCentreZAsStringESet;
		shearCentreZAsString = SHEAR_CENTRE_ZAS_STRING_EDEFAULT;
		shearCentreZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING, oldShearCentreZAsString, SHEAR_CENTRE_ZAS_STRING_EDEFAULT, oldShearCentreZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreZAsString() {
		return shearCentreZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearCentreY() {
		return shearCentreY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreY(double newShearCentreY) {
		double oldShearCentreY = shearCentreY;
		shearCentreY = newShearCentreY;
		boolean oldShearCentreYESet = shearCentreYESet;
		shearCentreYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y, oldShearCentreY, shearCentreY, !oldShearCentreYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreY() {
		double oldShearCentreY = shearCentreY;
		boolean oldShearCentreYESet = shearCentreYESet;
		shearCentreY = SHEAR_CENTRE_Y_EDEFAULT;
		shearCentreYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y, oldShearCentreY, SHEAR_CENTRE_Y_EDEFAULT, oldShearCentreYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreY() {
		return shearCentreYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearCentreYAsString() {
		return shearCentreYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearCentreYAsString(String newShearCentreYAsString) {
		String oldShearCentreYAsString = shearCentreYAsString;
		shearCentreYAsString = newShearCentreYAsString;
		boolean oldShearCentreYAsStringESet = shearCentreYAsStringESet;
		shearCentreYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING, oldShearCentreYAsString, shearCentreYAsString, !oldShearCentreYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearCentreYAsString() {
		String oldShearCentreYAsString = shearCentreYAsString;
		boolean oldShearCentreYAsStringESet = shearCentreYAsStringESet;
		shearCentreYAsString = SHEAR_CENTRE_YAS_STRING_EDEFAULT;
		shearCentreYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING, oldShearCentreYAsString, SHEAR_CENTRE_YAS_STRING_EDEFAULT, oldShearCentreYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearCentreYAsString() {
		return shearCentreYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearDeformationAreaZ() {
		return shearDeformationAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaZ(double newShearDeformationAreaZ) {
		double oldShearDeformationAreaZ = shearDeformationAreaZ;
		shearDeformationAreaZ = newShearDeformationAreaZ;
		boolean oldShearDeformationAreaZESet = shearDeformationAreaZESet;
		shearDeformationAreaZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z, oldShearDeformationAreaZ, shearDeformationAreaZ, !oldShearDeformationAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaZ() {
		double oldShearDeformationAreaZ = shearDeformationAreaZ;
		boolean oldShearDeformationAreaZESet = shearDeformationAreaZESet;
		shearDeformationAreaZ = SHEAR_DEFORMATION_AREA_Z_EDEFAULT;
		shearDeformationAreaZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z, oldShearDeformationAreaZ, SHEAR_DEFORMATION_AREA_Z_EDEFAULT, oldShearDeformationAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaZ() {
		return shearDeformationAreaZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearDeformationAreaZAsString() {
		return shearDeformationAreaZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaZAsString(String newShearDeformationAreaZAsString) {
		String oldShearDeformationAreaZAsString = shearDeformationAreaZAsString;
		shearDeformationAreaZAsString = newShearDeformationAreaZAsString;
		boolean oldShearDeformationAreaZAsStringESet = shearDeformationAreaZAsStringESet;
		shearDeformationAreaZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING, oldShearDeformationAreaZAsString, shearDeformationAreaZAsString, !oldShearDeformationAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaZAsString() {
		String oldShearDeformationAreaZAsString = shearDeformationAreaZAsString;
		boolean oldShearDeformationAreaZAsStringESet = shearDeformationAreaZAsStringESet;
		shearDeformationAreaZAsString = SHEAR_DEFORMATION_AREA_ZAS_STRING_EDEFAULT;
		shearDeformationAreaZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING, oldShearDeformationAreaZAsString, SHEAR_DEFORMATION_AREA_ZAS_STRING_EDEFAULT, oldShearDeformationAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaZAsString() {
		return shearDeformationAreaZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearDeformationAreaY() {
		return shearDeformationAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaY(double newShearDeformationAreaY) {
		double oldShearDeformationAreaY = shearDeformationAreaY;
		shearDeformationAreaY = newShearDeformationAreaY;
		boolean oldShearDeformationAreaYESet = shearDeformationAreaYESet;
		shearDeformationAreaYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y, oldShearDeformationAreaY, shearDeformationAreaY, !oldShearDeformationAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaY() {
		double oldShearDeformationAreaY = shearDeformationAreaY;
		boolean oldShearDeformationAreaYESet = shearDeformationAreaYESet;
		shearDeformationAreaY = SHEAR_DEFORMATION_AREA_Y_EDEFAULT;
		shearDeformationAreaYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y, oldShearDeformationAreaY, SHEAR_DEFORMATION_AREA_Y_EDEFAULT, oldShearDeformationAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaY() {
		return shearDeformationAreaYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearDeformationAreaYAsString() {
		return shearDeformationAreaYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearDeformationAreaYAsString(String newShearDeformationAreaYAsString) {
		String oldShearDeformationAreaYAsString = shearDeformationAreaYAsString;
		shearDeformationAreaYAsString = newShearDeformationAreaYAsString;
		boolean oldShearDeformationAreaYAsStringESet = shearDeformationAreaYAsStringESet;
		shearDeformationAreaYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING, oldShearDeformationAreaYAsString, shearDeformationAreaYAsString, !oldShearDeformationAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearDeformationAreaYAsString() {
		String oldShearDeformationAreaYAsString = shearDeformationAreaYAsString;
		boolean oldShearDeformationAreaYAsStringESet = shearDeformationAreaYAsStringESet;
		shearDeformationAreaYAsString = SHEAR_DEFORMATION_AREA_YAS_STRING_EDEFAULT;
		shearDeformationAreaYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING, oldShearDeformationAreaYAsString, SHEAR_DEFORMATION_AREA_YAS_STRING_EDEFAULT, oldShearDeformationAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearDeformationAreaYAsString() {
		return shearDeformationAreaYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumSectionModulusY() {
		return maximumSectionModulusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusY(double newMaximumSectionModulusY) {
		double oldMaximumSectionModulusY = maximumSectionModulusY;
		maximumSectionModulusY = newMaximumSectionModulusY;
		boolean oldMaximumSectionModulusYESet = maximumSectionModulusYESet;
		maximumSectionModulusYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y, oldMaximumSectionModulusY, maximumSectionModulusY, !oldMaximumSectionModulusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusY() {
		double oldMaximumSectionModulusY = maximumSectionModulusY;
		boolean oldMaximumSectionModulusYESet = maximumSectionModulusYESet;
		maximumSectionModulusY = MAXIMUM_SECTION_MODULUS_Y_EDEFAULT;
		maximumSectionModulusYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y, oldMaximumSectionModulusY, MAXIMUM_SECTION_MODULUS_Y_EDEFAULT, oldMaximumSectionModulusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusY() {
		return maximumSectionModulusYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumSectionModulusYAsString() {
		return maximumSectionModulusYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusYAsString(String newMaximumSectionModulusYAsString) {
		String oldMaximumSectionModulusYAsString = maximumSectionModulusYAsString;
		maximumSectionModulusYAsString = newMaximumSectionModulusYAsString;
		boolean oldMaximumSectionModulusYAsStringESet = maximumSectionModulusYAsStringESet;
		maximumSectionModulusYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING, oldMaximumSectionModulusYAsString, maximumSectionModulusYAsString, !oldMaximumSectionModulusYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusYAsString() {
		String oldMaximumSectionModulusYAsString = maximumSectionModulusYAsString;
		boolean oldMaximumSectionModulusYAsStringESet = maximumSectionModulusYAsStringESet;
		maximumSectionModulusYAsString = MAXIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT;
		maximumSectionModulusYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING, oldMaximumSectionModulusYAsString, MAXIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT, oldMaximumSectionModulusYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusYAsString() {
		return maximumSectionModulusYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumSectionModulusY() {
		return minimumSectionModulusY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusY(double newMinimumSectionModulusY) {
		double oldMinimumSectionModulusY = minimumSectionModulusY;
		minimumSectionModulusY = newMinimumSectionModulusY;
		boolean oldMinimumSectionModulusYESet = minimumSectionModulusYESet;
		minimumSectionModulusYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y, oldMinimumSectionModulusY, minimumSectionModulusY, !oldMinimumSectionModulusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusY() {
		double oldMinimumSectionModulusY = minimumSectionModulusY;
		boolean oldMinimumSectionModulusYESet = minimumSectionModulusYESet;
		minimumSectionModulusY = MINIMUM_SECTION_MODULUS_Y_EDEFAULT;
		minimumSectionModulusYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y, oldMinimumSectionModulusY, MINIMUM_SECTION_MODULUS_Y_EDEFAULT, oldMinimumSectionModulusYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusY() {
		return minimumSectionModulusYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumSectionModulusYAsString() {
		return minimumSectionModulusYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusYAsString(String newMinimumSectionModulusYAsString) {
		String oldMinimumSectionModulusYAsString = minimumSectionModulusYAsString;
		minimumSectionModulusYAsString = newMinimumSectionModulusYAsString;
		boolean oldMinimumSectionModulusYAsStringESet = minimumSectionModulusYAsStringESet;
		minimumSectionModulusYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING, oldMinimumSectionModulusYAsString, minimumSectionModulusYAsString, !oldMinimumSectionModulusYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusYAsString() {
		String oldMinimumSectionModulusYAsString = minimumSectionModulusYAsString;
		boolean oldMinimumSectionModulusYAsStringESet = minimumSectionModulusYAsStringESet;
		minimumSectionModulusYAsString = MINIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT;
		minimumSectionModulusYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING, oldMinimumSectionModulusYAsString, MINIMUM_SECTION_MODULUS_YAS_STRING_EDEFAULT, oldMinimumSectionModulusYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusYAsString() {
		return minimumSectionModulusYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumSectionModulusZ() {
		return maximumSectionModulusZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusZ(double newMaximumSectionModulusZ) {
		double oldMaximumSectionModulusZ = maximumSectionModulusZ;
		maximumSectionModulusZ = newMaximumSectionModulusZ;
		boolean oldMaximumSectionModulusZESet = maximumSectionModulusZESet;
		maximumSectionModulusZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z, oldMaximumSectionModulusZ, maximumSectionModulusZ, !oldMaximumSectionModulusZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusZ() {
		double oldMaximumSectionModulusZ = maximumSectionModulusZ;
		boolean oldMaximumSectionModulusZESet = maximumSectionModulusZESet;
		maximumSectionModulusZ = MAXIMUM_SECTION_MODULUS_Z_EDEFAULT;
		maximumSectionModulusZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z, oldMaximumSectionModulusZ, MAXIMUM_SECTION_MODULUS_Z_EDEFAULT, oldMaximumSectionModulusZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusZ() {
		return maximumSectionModulusZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaximumSectionModulusZAsString() {
		return maximumSectionModulusZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumSectionModulusZAsString(String newMaximumSectionModulusZAsString) {
		String oldMaximumSectionModulusZAsString = maximumSectionModulusZAsString;
		maximumSectionModulusZAsString = newMaximumSectionModulusZAsString;
		boolean oldMaximumSectionModulusZAsStringESet = maximumSectionModulusZAsStringESet;
		maximumSectionModulusZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING, oldMaximumSectionModulusZAsString, maximumSectionModulusZAsString, !oldMaximumSectionModulusZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumSectionModulusZAsString() {
		String oldMaximumSectionModulusZAsString = maximumSectionModulusZAsString;
		boolean oldMaximumSectionModulusZAsStringESet = maximumSectionModulusZAsStringESet;
		maximumSectionModulusZAsString = MAXIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT;
		maximumSectionModulusZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING, oldMaximumSectionModulusZAsString, MAXIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT, oldMaximumSectionModulusZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumSectionModulusZAsString() {
		return maximumSectionModulusZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimumSectionModulusZ() {
		return minimumSectionModulusZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusZ(double newMinimumSectionModulusZ) {
		double oldMinimumSectionModulusZ = minimumSectionModulusZ;
		minimumSectionModulusZ = newMinimumSectionModulusZ;
		boolean oldMinimumSectionModulusZESet = minimumSectionModulusZESet;
		minimumSectionModulusZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z, oldMinimumSectionModulusZ, minimumSectionModulusZ, !oldMinimumSectionModulusZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusZ() {
		double oldMinimumSectionModulusZ = minimumSectionModulusZ;
		boolean oldMinimumSectionModulusZESet = minimumSectionModulusZESet;
		minimumSectionModulusZ = MINIMUM_SECTION_MODULUS_Z_EDEFAULT;
		minimumSectionModulusZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z, oldMinimumSectionModulusZ, MINIMUM_SECTION_MODULUS_Z_EDEFAULT, oldMinimumSectionModulusZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusZ() {
		return minimumSectionModulusZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinimumSectionModulusZAsString() {
		return minimumSectionModulusZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumSectionModulusZAsString(String newMinimumSectionModulusZAsString) {
		String oldMinimumSectionModulusZAsString = minimumSectionModulusZAsString;
		minimumSectionModulusZAsString = newMinimumSectionModulusZAsString;
		boolean oldMinimumSectionModulusZAsStringESet = minimumSectionModulusZAsStringESet;
		minimumSectionModulusZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING, oldMinimumSectionModulusZAsString, minimumSectionModulusZAsString, !oldMinimumSectionModulusZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinimumSectionModulusZAsString() {
		String oldMinimumSectionModulusZAsString = minimumSectionModulusZAsString;
		boolean oldMinimumSectionModulusZAsStringESet = minimumSectionModulusZAsStringESet;
		minimumSectionModulusZAsString = MINIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT;
		minimumSectionModulusZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING, oldMinimumSectionModulusZAsString, MINIMUM_SECTION_MODULUS_ZAS_STRING_EDEFAULT, oldMinimumSectionModulusZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinimumSectionModulusZAsString() {
		return minimumSectionModulusZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTorsionalSectionModulus() {
		return torsionalSectionModulus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalSectionModulus(double newTorsionalSectionModulus) {
		double oldTorsionalSectionModulus = torsionalSectionModulus;
		torsionalSectionModulus = newTorsionalSectionModulus;
		boolean oldTorsionalSectionModulusESet = torsionalSectionModulusESet;
		torsionalSectionModulusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS, oldTorsionalSectionModulus, torsionalSectionModulus, !oldTorsionalSectionModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalSectionModulus() {
		double oldTorsionalSectionModulus = torsionalSectionModulus;
		boolean oldTorsionalSectionModulusESet = torsionalSectionModulusESet;
		torsionalSectionModulus = TORSIONAL_SECTION_MODULUS_EDEFAULT;
		torsionalSectionModulusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS, oldTorsionalSectionModulus, TORSIONAL_SECTION_MODULUS_EDEFAULT, oldTorsionalSectionModulusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalSectionModulus() {
		return torsionalSectionModulusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTorsionalSectionModulusAsString() {
		return torsionalSectionModulusAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTorsionalSectionModulusAsString(String newTorsionalSectionModulusAsString) {
		String oldTorsionalSectionModulusAsString = torsionalSectionModulusAsString;
		torsionalSectionModulusAsString = newTorsionalSectionModulusAsString;
		boolean oldTorsionalSectionModulusAsStringESet = torsionalSectionModulusAsStringESet;
		torsionalSectionModulusAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING, oldTorsionalSectionModulusAsString, torsionalSectionModulusAsString, !oldTorsionalSectionModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTorsionalSectionModulusAsString() {
		String oldTorsionalSectionModulusAsString = torsionalSectionModulusAsString;
		boolean oldTorsionalSectionModulusAsStringESet = torsionalSectionModulusAsStringESet;
		torsionalSectionModulusAsString = TORSIONAL_SECTION_MODULUS_AS_STRING_EDEFAULT;
		torsionalSectionModulusAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING, oldTorsionalSectionModulusAsString, TORSIONAL_SECTION_MODULUS_AS_STRING_EDEFAULT, oldTorsionalSectionModulusAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTorsionalSectionModulusAsString() {
		return torsionalSectionModulusAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentreOfGravityInX() {
		return centreOfGravityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInX(double newCentreOfGravityInX) {
		double oldCentreOfGravityInX = centreOfGravityInX;
		centreOfGravityInX = newCentreOfGravityInX;
		boolean oldCentreOfGravityInXESet = centreOfGravityInXESet;
		centreOfGravityInXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, centreOfGravityInX, !oldCentreOfGravityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInX() {
		double oldCentreOfGravityInX = centreOfGravityInX;
		boolean oldCentreOfGravityInXESet = centreOfGravityInXESet;
		centreOfGravityInX = CENTRE_OF_GRAVITY_IN_X_EDEFAULT;
		centreOfGravityInXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X, oldCentreOfGravityInX, CENTRE_OF_GRAVITY_IN_X_EDEFAULT, oldCentreOfGravityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInX() {
		return centreOfGravityInXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInXAsString() {
		return centreOfGravityInXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInXAsString(String newCentreOfGravityInXAsString) {
		String oldCentreOfGravityInXAsString = centreOfGravityInXAsString;
		centreOfGravityInXAsString = newCentreOfGravityInXAsString;
		boolean oldCentreOfGravityInXAsStringESet = centreOfGravityInXAsStringESet;
		centreOfGravityInXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, centreOfGravityInXAsString, !oldCentreOfGravityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInXAsString() {
		String oldCentreOfGravityInXAsString = centreOfGravityInXAsString;
		boolean oldCentreOfGravityInXAsStringESet = centreOfGravityInXAsStringESet;
		centreOfGravityInXAsString = CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT;
		centreOfGravityInXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING, oldCentreOfGravityInXAsString, CENTRE_OF_GRAVITY_IN_XAS_STRING_EDEFAULT, oldCentreOfGravityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInXAsString() {
		return centreOfGravityInXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentreOfGravityInY() {
		return centreOfGravityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(double newCentreOfGravityInY) {
		double oldCentreOfGravityInY = centreOfGravityInY;
		centreOfGravityInY = newCentreOfGravityInY;
		boolean oldCentreOfGravityInYESet = centreOfGravityInYESet;
		centreOfGravityInYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, centreOfGravityInY, !oldCentreOfGravityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		double oldCentreOfGravityInY = centreOfGravityInY;
		boolean oldCentreOfGravityInYESet = centreOfGravityInYESet;
		centreOfGravityInY = CENTRE_OF_GRAVITY_IN_Y_EDEFAULT;
		centreOfGravityInYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y, oldCentreOfGravityInY, CENTRE_OF_GRAVITY_IN_Y_EDEFAULT, oldCentreOfGravityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return centreOfGravityInYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInYAsString() {
		return centreOfGravityInYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
		String oldCentreOfGravityInYAsString = centreOfGravityInYAsString;
		centreOfGravityInYAsString = newCentreOfGravityInYAsString;
		boolean oldCentreOfGravityInYAsStringESet = centreOfGravityInYAsStringESet;
		centreOfGravityInYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, centreOfGravityInYAsString, !oldCentreOfGravityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInYAsString() {
		String oldCentreOfGravityInYAsString = centreOfGravityInYAsString;
		boolean oldCentreOfGravityInYAsStringESet = centreOfGravityInYAsStringESet;
		centreOfGravityInYAsString = CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT;
		centreOfGravityInYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING, oldCentreOfGravityInYAsString, CENTRE_OF_GRAVITY_IN_YAS_STRING_EDEFAULT, oldCentreOfGravityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInYAsString() {
		return centreOfGravityInYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				return getTorsionalConstantX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING:
				return getTorsionalConstantXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				return getMomentOfInertiaYZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING:
				return getMomentOfInertiaYZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				return getMomentOfInertiaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING:
				return getMomentOfInertiaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				return getMomentOfInertiaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING:
				return getMomentOfInertiaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				return getWarpingConstant();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING:
				return getWarpingConstantAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				return getShearCentreZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING:
				return getShearCentreZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				return getShearCentreY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING:
				return getShearCentreYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				return getShearDeformationAreaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING:
				return getShearDeformationAreaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				return getShearDeformationAreaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING:
				return getShearDeformationAreaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				return getMaximumSectionModulusY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING:
				return getMaximumSectionModulusYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				return getMinimumSectionModulusY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING:
				return getMinimumSectionModulusYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				return getMaximumSectionModulusZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING:
				return getMaximumSectionModulusZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				return getMinimumSectionModulusZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING:
				return getMinimumSectionModulusZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				return getTorsionalSectionModulus();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING:
				return getTorsionalSectionModulusAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				return getCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return getCentreOfGravityInXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				return getCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				return getCentreOfGravityInYAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				setTorsionalConstantX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING:
				setTorsionalConstantXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				setMomentOfInertiaYZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING:
				setMomentOfInertiaYZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				setMomentOfInertiaY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING:
				setMomentOfInertiaYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				setMomentOfInertiaZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING:
				setMomentOfInertiaZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				setWarpingConstant((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING:
				setWarpingConstantAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				setShearCentreZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING:
				setShearCentreZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				setShearCentreY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING:
				setShearCentreYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				setShearDeformationAreaZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING:
				setShearDeformationAreaZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				setShearDeformationAreaY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING:
				setShearDeformationAreaYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				setMaximumSectionModulusY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING:
				setMaximumSectionModulusYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				setMinimumSectionModulusY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING:
				setMinimumSectionModulusYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				setMaximumSectionModulusZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING:
				setMaximumSectionModulusZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				setMinimumSectionModulusZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING:
				setMinimumSectionModulusZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				setTorsionalSectionModulus((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING:
				setTorsionalSectionModulusAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				setCentreOfGravityInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				setCentreOfGravityInXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				setCentreOfGravityInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				setCentreOfGravityInYAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				unsetTorsionalConstantX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING:
				unsetTorsionalConstantXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				unsetMomentOfInertiaYZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING:
				unsetMomentOfInertiaYZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				unsetMomentOfInertiaY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING:
				unsetMomentOfInertiaYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				unsetMomentOfInertiaZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING:
				unsetMomentOfInertiaZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				unsetWarpingConstant();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING:
				unsetWarpingConstantAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				unsetShearCentreZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING:
				unsetShearCentreZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				unsetShearCentreY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING:
				unsetShearCentreYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				unsetShearDeformationAreaZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING:
				unsetShearDeformationAreaZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				unsetShearDeformationAreaY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING:
				unsetShearDeformationAreaYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				unsetMaximumSectionModulusY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING:
				unsetMaximumSectionModulusYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				unsetMinimumSectionModulusY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING:
				unsetMinimumSectionModulusYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				unsetMaximumSectionModulusZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING:
				unsetMaximumSectionModulusZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				unsetMinimumSectionModulusZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING:
				unsetMinimumSectionModulusZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				unsetTorsionalSectionModulus();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING:
				unsetTorsionalSectionModulusAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				unsetCentreOfGravityInX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				unsetCentreOfGravityInXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				unsetCentreOfGravityInY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				unsetCentreOfGravityInYAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_X:
				return isSetTorsionalConstantX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_CONSTANT_XAS_STRING:
				return isSetTorsionalConstantXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ:
				return isSetMomentOfInertiaYZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YZ_AS_STRING:
				return isSetMomentOfInertiaYZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Y:
				return isSetMomentOfInertiaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_YAS_STRING:
				return isSetMomentOfInertiaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_Z:
				return isSetMomentOfInertiaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MOMENT_OF_INERTIA_ZAS_STRING:
				return isSetMomentOfInertiaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT:
				return isSetWarpingConstant();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__WARPING_CONSTANT_AS_STRING:
				return isSetWarpingConstantAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Z:
				return isSetShearCentreZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_ZAS_STRING:
				return isSetShearCentreZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_Y:
				return isSetShearCentreY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_CENTRE_YAS_STRING:
				return isSetShearCentreYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Z:
				return isSetShearDeformationAreaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_ZAS_STRING:
				return isSetShearDeformationAreaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_Y:
				return isSetShearDeformationAreaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__SHEAR_DEFORMATION_AREA_YAS_STRING:
				return isSetShearDeformationAreaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Y:
				return isSetMaximumSectionModulusY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_YAS_STRING:
				return isSetMaximumSectionModulusYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Y:
				return isSetMinimumSectionModulusY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_YAS_STRING:
				return isSetMinimumSectionModulusYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_Z:
				return isSetMaximumSectionModulusZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MAXIMUM_SECTION_MODULUS_ZAS_STRING:
				return isSetMaximumSectionModulusZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_Z:
				return isSetMinimumSectionModulusZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__MINIMUM_SECTION_MODULUS_ZAS_STRING:
				return isSetMinimumSectionModulusZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS:
				return isSetTorsionalSectionModulus();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__TORSIONAL_SECTION_MODULUS_AS_STRING:
				return isSetTorsionalSectionModulusAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_X:
				return isSetCentreOfGravityInX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_XAS_STRING:
				return isSetCentreOfGravityInXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_Y:
				return isSetCentreOfGravityInY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_PROFILE_PROPERTIES__CENTRE_OF_GRAVITY_IN_YAS_STRING:
				return isSetCentreOfGravityInYAsString();
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
		result.append(" (TorsionalConstantX: ");
		if (torsionalConstantXESet) result.append(torsionalConstantX); else result.append("<unset>");
		result.append(", TorsionalConstantXAsString: ");
		if (torsionalConstantXAsStringESet) result.append(torsionalConstantXAsString); else result.append("<unset>");
		result.append(", MomentOfInertiaYZ: ");
		if (momentOfInertiaYZESet) result.append(momentOfInertiaYZ); else result.append("<unset>");
		result.append(", MomentOfInertiaYZAsString: ");
		if (momentOfInertiaYZAsStringESet) result.append(momentOfInertiaYZAsString); else result.append("<unset>");
		result.append(", MomentOfInertiaY: ");
		if (momentOfInertiaYESet) result.append(momentOfInertiaY); else result.append("<unset>");
		result.append(", MomentOfInertiaYAsString: ");
		if (momentOfInertiaYAsStringESet) result.append(momentOfInertiaYAsString); else result.append("<unset>");
		result.append(", MomentOfInertiaZ: ");
		if (momentOfInertiaZESet) result.append(momentOfInertiaZ); else result.append("<unset>");
		result.append(", MomentOfInertiaZAsString: ");
		if (momentOfInertiaZAsStringESet) result.append(momentOfInertiaZAsString); else result.append("<unset>");
		result.append(", WarpingConstant: ");
		if (warpingConstantESet) result.append(warpingConstant); else result.append("<unset>");
		result.append(", WarpingConstantAsString: ");
		if (warpingConstantAsStringESet) result.append(warpingConstantAsString); else result.append("<unset>");
		result.append(", ShearCentreZ: ");
		if (shearCentreZESet) result.append(shearCentreZ); else result.append("<unset>");
		result.append(", ShearCentreZAsString: ");
		if (shearCentreZAsStringESet) result.append(shearCentreZAsString); else result.append("<unset>");
		result.append(", ShearCentreY: ");
		if (shearCentreYESet) result.append(shearCentreY); else result.append("<unset>");
		result.append(", ShearCentreYAsString: ");
		if (shearCentreYAsStringESet) result.append(shearCentreYAsString); else result.append("<unset>");
		result.append(", ShearDeformationAreaZ: ");
		if (shearDeformationAreaZESet) result.append(shearDeformationAreaZ); else result.append("<unset>");
		result.append(", ShearDeformationAreaZAsString: ");
		if (shearDeformationAreaZAsStringESet) result.append(shearDeformationAreaZAsString); else result.append("<unset>");
		result.append(", ShearDeformationAreaY: ");
		if (shearDeformationAreaYESet) result.append(shearDeformationAreaY); else result.append("<unset>");
		result.append(", ShearDeformationAreaYAsString: ");
		if (shearDeformationAreaYAsStringESet) result.append(shearDeformationAreaYAsString); else result.append("<unset>");
		result.append(", MaximumSectionModulusY: ");
		if (maximumSectionModulusYESet) result.append(maximumSectionModulusY); else result.append("<unset>");
		result.append(", MaximumSectionModulusYAsString: ");
		if (maximumSectionModulusYAsStringESet) result.append(maximumSectionModulusYAsString); else result.append("<unset>");
		result.append(", MinimumSectionModulusY: ");
		if (minimumSectionModulusYESet) result.append(minimumSectionModulusY); else result.append("<unset>");
		result.append(", MinimumSectionModulusYAsString: ");
		if (minimumSectionModulusYAsStringESet) result.append(minimumSectionModulusYAsString); else result.append("<unset>");
		result.append(", MaximumSectionModulusZ: ");
		if (maximumSectionModulusZESet) result.append(maximumSectionModulusZ); else result.append("<unset>");
		result.append(", MaximumSectionModulusZAsString: ");
		if (maximumSectionModulusZAsStringESet) result.append(maximumSectionModulusZAsString); else result.append("<unset>");
		result.append(", MinimumSectionModulusZ: ");
		if (minimumSectionModulusZESet) result.append(minimumSectionModulusZ); else result.append("<unset>");
		result.append(", MinimumSectionModulusZAsString: ");
		if (minimumSectionModulusZAsStringESet) result.append(minimumSectionModulusZAsString); else result.append("<unset>");
		result.append(", TorsionalSectionModulus: ");
		if (torsionalSectionModulusESet) result.append(torsionalSectionModulus); else result.append("<unset>");
		result.append(", TorsionalSectionModulusAsString: ");
		if (torsionalSectionModulusAsStringESet) result.append(torsionalSectionModulusAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInX: ");
		if (centreOfGravityInXESet) result.append(centreOfGravityInX); else result.append("<unset>");
		result.append(", CentreOfGravityInXAsString: ");
		if (centreOfGravityInXAsStringESet) result.append(centreOfGravityInXAsString); else result.append("<unset>");
		result.append(", CentreOfGravityInY: ");
		if (centreOfGravityInYESet) result.append(centreOfGravityInY); else result.append("<unset>");
		result.append(", CentreOfGravityInYAsString: ");
		if (centreOfGravityInYAsStringESet) result.append(centreOfGravityInYAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralProfilePropertiesImpl
