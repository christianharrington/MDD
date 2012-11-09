/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralSteelProfileProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Steel Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaZ <em>Shear Area Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaZAsString <em>Shear Area ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaY <em>Shear Area Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getShearAreaYAsString <em>Shear Area YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorY <em>Plastic Shape Factor Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorYAsString <em>Plastic Shape Factor YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorZ <em>Plastic Shape Factor Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralSteelProfilePropertiesImpl#getPlasticShapeFactorZAsString <em>Plastic Shape Factor ZAs String</em>}</li>
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
	protected static final double SHEAR_AREA_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearAreaZ() <em>Shear Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaZ()
	 * @generated
	 * @ordered
	 */
	protected double shearAreaZ = SHEAR_AREA_Z_EDEFAULT;

	/**
	 * This is true if the Shear Area Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearAreaZESet;

	/**
	 * The default value of the '{@link #getShearAreaZAsString() <em>Shear Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_AREA_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearAreaZAsString() <em>Shear Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearAreaZAsString = SHEAR_AREA_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Area ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearAreaZAsStringESet;

	/**
	 * The default value of the '{@link #getShearAreaY() <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final double SHEAR_AREA_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShearAreaY() <em>Shear Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaY()
	 * @generated
	 * @ordered
	 */
	protected double shearAreaY = SHEAR_AREA_Y_EDEFAULT;

	/**
	 * This is true if the Shear Area Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearAreaYESet;

	/**
	 * The default value of the '{@link #getShearAreaYAsString() <em>Shear Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SHEAR_AREA_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShearAreaYAsString() <em>Shear Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShearAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected String shearAreaYAsString = SHEAR_AREA_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Shear Area YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shearAreaYAsStringESet;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorY() <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 * @ordered
	 */
	protected static final double PLASTIC_SHAPE_FACTOR_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorY() <em>Plastic Shape Factor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorY()
	 * @generated
	 * @ordered
	 */
	protected double plasticShapeFactorY = PLASTIC_SHAPE_FACTOR_Y_EDEFAULT;

	/**
	 * This is true if the Plastic Shape Factor Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticShapeFactorYESet;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorYAsString() <em>Plastic Shape Factor YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLASTIC_SHAPE_FACTOR_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorYAsString() <em>Plastic Shape Factor YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorYAsString()
	 * @generated
	 * @ordered
	 */
	protected String plasticShapeFactorYAsString = PLASTIC_SHAPE_FACTOR_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Plastic Shape Factor YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticShapeFactorYAsStringESet;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorZ() <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 * @ordered
	 */
	protected static final double PLASTIC_SHAPE_FACTOR_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorZ() <em>Plastic Shape Factor Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZ()
	 * @generated
	 * @ordered
	 */
	protected double plasticShapeFactorZ = PLASTIC_SHAPE_FACTOR_Z_EDEFAULT;

	/**
	 * This is true if the Plastic Shape Factor Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticShapeFactorZESet;

	/**
	 * The default value of the '{@link #getPlasticShapeFactorZAsString() <em>Plastic Shape Factor ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLASTIC_SHAPE_FACTOR_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlasticShapeFactorZAsString() <em>Plastic Shape Factor ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlasticShapeFactorZAsString()
	 * @generated
	 * @ordered
	 */
	protected String plasticShapeFactorZAsString = PLASTIC_SHAPE_FACTOR_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Plastic Shape Factor ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean plasticShapeFactorZAsStringESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralSteelProfileProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearAreaZ() {
		return shearAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaZ(double newShearAreaZ) {
		double oldShearAreaZ = shearAreaZ;
		shearAreaZ = newShearAreaZ;
		boolean oldShearAreaZESet = shearAreaZESet;
		shearAreaZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z, oldShearAreaZ, shearAreaZ, !oldShearAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaZ() {
		double oldShearAreaZ = shearAreaZ;
		boolean oldShearAreaZESet = shearAreaZESet;
		shearAreaZ = SHEAR_AREA_Z_EDEFAULT;
		shearAreaZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z, oldShearAreaZ, SHEAR_AREA_Z_EDEFAULT, oldShearAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaZ() {
		return shearAreaZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearAreaZAsString() {
		return shearAreaZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaZAsString(String newShearAreaZAsString) {
		String oldShearAreaZAsString = shearAreaZAsString;
		shearAreaZAsString = newShearAreaZAsString;
		boolean oldShearAreaZAsStringESet = shearAreaZAsStringESet;
		shearAreaZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING, oldShearAreaZAsString, shearAreaZAsString, !oldShearAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaZAsString() {
		String oldShearAreaZAsString = shearAreaZAsString;
		boolean oldShearAreaZAsStringESet = shearAreaZAsStringESet;
		shearAreaZAsString = SHEAR_AREA_ZAS_STRING_EDEFAULT;
		shearAreaZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING, oldShearAreaZAsString, SHEAR_AREA_ZAS_STRING_EDEFAULT, oldShearAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaZAsString() {
		return shearAreaZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShearAreaY() {
		return shearAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaY(double newShearAreaY) {
		double oldShearAreaY = shearAreaY;
		shearAreaY = newShearAreaY;
		boolean oldShearAreaYESet = shearAreaYESet;
		shearAreaYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y, oldShearAreaY, shearAreaY, !oldShearAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaY() {
		double oldShearAreaY = shearAreaY;
		boolean oldShearAreaYESet = shearAreaYESet;
		shearAreaY = SHEAR_AREA_Y_EDEFAULT;
		shearAreaYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y, oldShearAreaY, SHEAR_AREA_Y_EDEFAULT, oldShearAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaY() {
		return shearAreaYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShearAreaYAsString() {
		return shearAreaYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShearAreaYAsString(String newShearAreaYAsString) {
		String oldShearAreaYAsString = shearAreaYAsString;
		shearAreaYAsString = newShearAreaYAsString;
		boolean oldShearAreaYAsStringESet = shearAreaYAsStringESet;
		shearAreaYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING, oldShearAreaYAsString, shearAreaYAsString, !oldShearAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShearAreaYAsString() {
		String oldShearAreaYAsString = shearAreaYAsString;
		boolean oldShearAreaYAsStringESet = shearAreaYAsStringESet;
		shearAreaYAsString = SHEAR_AREA_YAS_STRING_EDEFAULT;
		shearAreaYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING, oldShearAreaYAsString, SHEAR_AREA_YAS_STRING_EDEFAULT, oldShearAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShearAreaYAsString() {
		return shearAreaYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlasticShapeFactorY() {
		return plasticShapeFactorY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorY(double newPlasticShapeFactorY) {
		double oldPlasticShapeFactorY = plasticShapeFactorY;
		plasticShapeFactorY = newPlasticShapeFactorY;
		boolean oldPlasticShapeFactorYESet = plasticShapeFactorYESet;
		plasticShapeFactorYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y, oldPlasticShapeFactorY, plasticShapeFactorY, !oldPlasticShapeFactorYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorY() {
		double oldPlasticShapeFactorY = plasticShapeFactorY;
		boolean oldPlasticShapeFactorYESet = plasticShapeFactorYESet;
		plasticShapeFactorY = PLASTIC_SHAPE_FACTOR_Y_EDEFAULT;
		plasticShapeFactorYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y, oldPlasticShapeFactorY, PLASTIC_SHAPE_FACTOR_Y_EDEFAULT, oldPlasticShapeFactorYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorY() {
		return plasticShapeFactorYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlasticShapeFactorYAsString() {
		return plasticShapeFactorYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorYAsString(String newPlasticShapeFactorYAsString) {
		String oldPlasticShapeFactorYAsString = plasticShapeFactorYAsString;
		plasticShapeFactorYAsString = newPlasticShapeFactorYAsString;
		boolean oldPlasticShapeFactorYAsStringESet = plasticShapeFactorYAsStringESet;
		plasticShapeFactorYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING, oldPlasticShapeFactorYAsString, plasticShapeFactorYAsString, !oldPlasticShapeFactorYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorYAsString() {
		String oldPlasticShapeFactorYAsString = plasticShapeFactorYAsString;
		boolean oldPlasticShapeFactorYAsStringESet = plasticShapeFactorYAsStringESet;
		plasticShapeFactorYAsString = PLASTIC_SHAPE_FACTOR_YAS_STRING_EDEFAULT;
		plasticShapeFactorYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING, oldPlasticShapeFactorYAsString, PLASTIC_SHAPE_FACTOR_YAS_STRING_EDEFAULT, oldPlasticShapeFactorYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorYAsString() {
		return plasticShapeFactorYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlasticShapeFactorZ() {
		return plasticShapeFactorZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorZ(double newPlasticShapeFactorZ) {
		double oldPlasticShapeFactorZ = plasticShapeFactorZ;
		plasticShapeFactorZ = newPlasticShapeFactorZ;
		boolean oldPlasticShapeFactorZESet = plasticShapeFactorZESet;
		plasticShapeFactorZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z, oldPlasticShapeFactorZ, plasticShapeFactorZ, !oldPlasticShapeFactorZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorZ() {
		double oldPlasticShapeFactorZ = plasticShapeFactorZ;
		boolean oldPlasticShapeFactorZESet = plasticShapeFactorZESet;
		plasticShapeFactorZ = PLASTIC_SHAPE_FACTOR_Z_EDEFAULT;
		plasticShapeFactorZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z, oldPlasticShapeFactorZ, PLASTIC_SHAPE_FACTOR_Z_EDEFAULT, oldPlasticShapeFactorZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorZ() {
		return plasticShapeFactorZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlasticShapeFactorZAsString() {
		return plasticShapeFactorZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlasticShapeFactorZAsString(String newPlasticShapeFactorZAsString) {
		String oldPlasticShapeFactorZAsString = plasticShapeFactorZAsString;
		plasticShapeFactorZAsString = newPlasticShapeFactorZAsString;
		boolean oldPlasticShapeFactorZAsStringESet = plasticShapeFactorZAsStringESet;
		plasticShapeFactorZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING, oldPlasticShapeFactorZAsString, plasticShapeFactorZAsString, !oldPlasticShapeFactorZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlasticShapeFactorZAsString() {
		String oldPlasticShapeFactorZAsString = plasticShapeFactorZAsString;
		boolean oldPlasticShapeFactorZAsStringESet = plasticShapeFactorZAsStringESet;
		plasticShapeFactorZAsString = PLASTIC_SHAPE_FACTOR_ZAS_STRING_EDEFAULT;
		plasticShapeFactorZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING, oldPlasticShapeFactorZAsString, PLASTIC_SHAPE_FACTOR_ZAS_STRING_EDEFAULT, oldPlasticShapeFactorZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlasticShapeFactorZAsString() {
		return plasticShapeFactorZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				return getShearAreaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING:
				return getShearAreaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				return getShearAreaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING:
				return getShearAreaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				return getPlasticShapeFactorY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING:
				return getPlasticShapeFactorYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				return getPlasticShapeFactorZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING:
				return getPlasticShapeFactorZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				setShearAreaZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING:
				setShearAreaZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				setShearAreaY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING:
				setShearAreaYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				setPlasticShapeFactorY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING:
				setPlasticShapeFactorYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				setPlasticShapeFactorZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING:
				setPlasticShapeFactorZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				unsetShearAreaZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING:
				unsetShearAreaZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				unsetShearAreaY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING:
				unsetShearAreaYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				unsetPlasticShapeFactorY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING:
				unsetPlasticShapeFactorYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				unsetPlasticShapeFactorZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING:
				unsetPlasticShapeFactorZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Z:
				return isSetShearAreaZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_ZAS_STRING:
				return isSetShearAreaZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_Y:
				return isSetShearAreaY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__SHEAR_AREA_YAS_STRING:
				return isSetShearAreaYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Y:
				return isSetPlasticShapeFactorY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_YAS_STRING:
				return isSetPlasticShapeFactorYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_Z:
				return isSetPlasticShapeFactorZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_STEEL_PROFILE_PROPERTIES__PLASTIC_SHAPE_FACTOR_ZAS_STRING:
				return isSetPlasticShapeFactorZAsString();
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
		result.append(" (ShearAreaZ: ");
		if (shearAreaZESet) result.append(shearAreaZ); else result.append("<unset>");
		result.append(", ShearAreaZAsString: ");
		if (shearAreaZAsStringESet) result.append(shearAreaZAsString); else result.append("<unset>");
		result.append(", ShearAreaY: ");
		if (shearAreaYESet) result.append(shearAreaY); else result.append("<unset>");
		result.append(", ShearAreaYAsString: ");
		if (shearAreaYAsStringESet) result.append(shearAreaYAsString); else result.append("<unset>");
		result.append(", PlasticShapeFactorY: ");
		if (plasticShapeFactorYESet) result.append(plasticShapeFactorY); else result.append("<unset>");
		result.append(", PlasticShapeFactorYAsString: ");
		if (plasticShapeFactorYAsStringESet) result.append(plasticShapeFactorYAsString); else result.append("<unset>");
		result.append(", PlasticShapeFactorZ: ");
		if (plasticShapeFactorZESet) result.append(plasticShapeFactorZ); else result.append("<unset>");
		result.append(", PlasticShapeFactorZAsString: ");
		if (plasticShapeFactorZAsStringESet) result.append(plasticShapeFactorZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralSteelProfilePropertiesImpl
