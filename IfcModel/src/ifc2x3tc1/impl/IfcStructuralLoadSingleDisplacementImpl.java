/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadSingleDisplacement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementXAsString <em>Displacement XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementYAsString <em>Displacement YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementZAsString <em>Displacement ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRXAsString <em>Rotational Displacement RX As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRYAsString <em>Rotational Displacement RY As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRZAsString <em>Rotational Displacement RZ As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleDisplacement {
	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected double displacementX = DISPLACEMENT_X_EDEFAULT;

	/**
	 * This is true if the Displacement X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementXESet;

	/**
	 * The default value of the '{@link #getDisplacementXAsString() <em>Displacement XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementXAsString() <em>Displacement XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementXAsString()
	 * @generated
	 * @ordered
	 */
	protected String displacementXAsString = DISPLACEMENT_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Displacement XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementXAsStringESet;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected double displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * This is true if the Displacement Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementYESet;

	/**
	 * The default value of the '{@link #getDisplacementYAsString() <em>Displacement YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementYAsString() <em>Displacement YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementYAsString()
	 * @generated
	 * @ordered
	 */
	protected String displacementYAsString = DISPLACEMENT_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Displacement YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementYAsStringESet;

	/**
	 * The default value of the '{@link #getDisplacementZ() <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZ()
	 * @generated
	 * @ordered
	 */
	protected static final double DISPLACEMENT_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDisplacementZ() <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZ()
	 * @generated
	 * @ordered
	 */
	protected double displacementZ = DISPLACEMENT_Z_EDEFAULT;

	/**
	 * This is true if the Displacement Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementZESet;

	/**
	 * The default value of the '{@link #getDisplacementZAsString() <em>Displacement ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLACEMENT_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementZAsString() <em>Displacement ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZAsString()
	 * @generated
	 * @ordered
	 */
	protected String displacementZAsString = DISPLACEMENT_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Displacement ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displacementZAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRX() <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_DISPLACEMENT_RX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRX() <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 * @ordered
	 */
	protected double rotationalDisplacementRX = ROTATIONAL_DISPLACEMENT_RX_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RX attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRXESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRXAsString() <em>Rotational Displacement RX As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_DISPLACEMENT_RX_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRXAsString() <em>Rotational Displacement RX As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRXAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalDisplacementRXAsString = ROTATIONAL_DISPLACEMENT_RX_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RX As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRXAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRY() <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_DISPLACEMENT_RY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRY() <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 * @ordered
	 */
	protected double rotationalDisplacementRY = ROTATIONAL_DISPLACEMENT_RY_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RY attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRYESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRYAsString() <em>Rotational Displacement RY As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_DISPLACEMENT_RY_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRYAsString() <em>Rotational Displacement RY As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRYAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalDisplacementRYAsString = ROTATIONAL_DISPLACEMENT_RY_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RY As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRYAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRZ() <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRZ() <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 * @ordered
	 */
	protected double rotationalDisplacementRZ = ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RZ attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRZESet;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRZAsString() <em>Rotational Displacement RZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_DISPLACEMENT_RZ_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRZAsString() <em>Rotational Displacement RZ As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalDisplacementRZAsString = ROTATIONAL_DISPLACEMENT_RZ_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Displacement RZ As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalDisplacementRZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleDisplacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplacementX() {
		return displacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementX(double newDisplacementX) {
		double oldDisplacementX = displacementX;
		displacementX = newDisplacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X, oldDisplacementX, displacementX, !oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementX() {
		double oldDisplacementX = displacementX;
		boolean oldDisplacementXESet = displacementXESet;
		displacementX = DISPLACEMENT_X_EDEFAULT;
		displacementXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X, oldDisplacementX, DISPLACEMENT_X_EDEFAULT, oldDisplacementXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementX() {
		return displacementXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplacementXAsString() {
		return displacementXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementXAsString(String newDisplacementXAsString) {
		String oldDisplacementXAsString = displacementXAsString;
		displacementXAsString = newDisplacementXAsString;
		boolean oldDisplacementXAsStringESet = displacementXAsStringESet;
		displacementXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING, oldDisplacementXAsString, displacementXAsString, !oldDisplacementXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementXAsString() {
		String oldDisplacementXAsString = displacementXAsString;
		boolean oldDisplacementXAsStringESet = displacementXAsStringESet;
		displacementXAsString = DISPLACEMENT_XAS_STRING_EDEFAULT;
		displacementXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING, oldDisplacementXAsString, DISPLACEMENT_XAS_STRING_EDEFAULT, oldDisplacementXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementXAsString() {
		return displacementXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplacementY() {
		return displacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementY(double newDisplacementY) {
		double oldDisplacementY = displacementY;
		displacementY = newDisplacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y, oldDisplacementY, displacementY, !oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementY() {
		double oldDisplacementY = displacementY;
		boolean oldDisplacementYESet = displacementYESet;
		displacementY = DISPLACEMENT_Y_EDEFAULT;
		displacementYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y, oldDisplacementY, DISPLACEMENT_Y_EDEFAULT, oldDisplacementYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementY() {
		return displacementYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplacementYAsString() {
		return displacementYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementYAsString(String newDisplacementYAsString) {
		String oldDisplacementYAsString = displacementYAsString;
		displacementYAsString = newDisplacementYAsString;
		boolean oldDisplacementYAsStringESet = displacementYAsStringESet;
		displacementYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING, oldDisplacementYAsString, displacementYAsString, !oldDisplacementYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementYAsString() {
		String oldDisplacementYAsString = displacementYAsString;
		boolean oldDisplacementYAsStringESet = displacementYAsStringESet;
		displacementYAsString = DISPLACEMENT_YAS_STRING_EDEFAULT;
		displacementYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING, oldDisplacementYAsString, DISPLACEMENT_YAS_STRING_EDEFAULT, oldDisplacementYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementYAsString() {
		return displacementYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDisplacementZ() {
		return displacementZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementZ(double newDisplacementZ) {
		double oldDisplacementZ = displacementZ;
		displacementZ = newDisplacementZ;
		boolean oldDisplacementZESet = displacementZESet;
		displacementZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z, oldDisplacementZ, displacementZ, !oldDisplacementZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementZ() {
		double oldDisplacementZ = displacementZ;
		boolean oldDisplacementZESet = displacementZESet;
		displacementZ = DISPLACEMENT_Z_EDEFAULT;
		displacementZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z, oldDisplacementZ, DISPLACEMENT_Z_EDEFAULT, oldDisplacementZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementZ() {
		return displacementZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplacementZAsString() {
		return displacementZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementZAsString(String newDisplacementZAsString) {
		String oldDisplacementZAsString = displacementZAsString;
		displacementZAsString = newDisplacementZAsString;
		boolean oldDisplacementZAsStringESet = displacementZAsStringESet;
		displacementZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING, oldDisplacementZAsString, displacementZAsString, !oldDisplacementZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplacementZAsString() {
		String oldDisplacementZAsString = displacementZAsString;
		boolean oldDisplacementZAsStringESet = displacementZAsStringESet;
		displacementZAsString = DISPLACEMENT_ZAS_STRING_EDEFAULT;
		displacementZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING, oldDisplacementZAsString, DISPLACEMENT_ZAS_STRING_EDEFAULT, oldDisplacementZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplacementZAsString() {
		return displacementZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalDisplacementRX() {
		return rotationalDisplacementRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRX(double newRotationalDisplacementRX) {
		double oldRotationalDisplacementRX = rotationalDisplacementRX;
		rotationalDisplacementRX = newRotationalDisplacementRX;
		boolean oldRotationalDisplacementRXESet = rotationalDisplacementRXESet;
		rotationalDisplacementRXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX, oldRotationalDisplacementRX, rotationalDisplacementRX, !oldRotationalDisplacementRXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRX() {
		double oldRotationalDisplacementRX = rotationalDisplacementRX;
		boolean oldRotationalDisplacementRXESet = rotationalDisplacementRXESet;
		rotationalDisplacementRX = ROTATIONAL_DISPLACEMENT_RX_EDEFAULT;
		rotationalDisplacementRXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX, oldRotationalDisplacementRX, ROTATIONAL_DISPLACEMENT_RX_EDEFAULT, oldRotationalDisplacementRXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRX() {
		return rotationalDisplacementRXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalDisplacementRXAsString() {
		return rotationalDisplacementRXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRXAsString(String newRotationalDisplacementRXAsString) {
		String oldRotationalDisplacementRXAsString = rotationalDisplacementRXAsString;
		rotationalDisplacementRXAsString = newRotationalDisplacementRXAsString;
		boolean oldRotationalDisplacementRXAsStringESet = rotationalDisplacementRXAsStringESet;
		rotationalDisplacementRXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING, oldRotationalDisplacementRXAsString, rotationalDisplacementRXAsString, !oldRotationalDisplacementRXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRXAsString() {
		String oldRotationalDisplacementRXAsString = rotationalDisplacementRXAsString;
		boolean oldRotationalDisplacementRXAsStringESet = rotationalDisplacementRXAsStringESet;
		rotationalDisplacementRXAsString = ROTATIONAL_DISPLACEMENT_RX_AS_STRING_EDEFAULT;
		rotationalDisplacementRXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING, oldRotationalDisplacementRXAsString, ROTATIONAL_DISPLACEMENT_RX_AS_STRING_EDEFAULT, oldRotationalDisplacementRXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRXAsString() {
		return rotationalDisplacementRXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalDisplacementRY() {
		return rotationalDisplacementRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRY(double newRotationalDisplacementRY) {
		double oldRotationalDisplacementRY = rotationalDisplacementRY;
		rotationalDisplacementRY = newRotationalDisplacementRY;
		boolean oldRotationalDisplacementRYESet = rotationalDisplacementRYESet;
		rotationalDisplacementRYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY, oldRotationalDisplacementRY, rotationalDisplacementRY, !oldRotationalDisplacementRYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRY() {
		double oldRotationalDisplacementRY = rotationalDisplacementRY;
		boolean oldRotationalDisplacementRYESet = rotationalDisplacementRYESet;
		rotationalDisplacementRY = ROTATIONAL_DISPLACEMENT_RY_EDEFAULT;
		rotationalDisplacementRYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY, oldRotationalDisplacementRY, ROTATIONAL_DISPLACEMENT_RY_EDEFAULT, oldRotationalDisplacementRYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRY() {
		return rotationalDisplacementRYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalDisplacementRYAsString() {
		return rotationalDisplacementRYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRYAsString(String newRotationalDisplacementRYAsString) {
		String oldRotationalDisplacementRYAsString = rotationalDisplacementRYAsString;
		rotationalDisplacementRYAsString = newRotationalDisplacementRYAsString;
		boolean oldRotationalDisplacementRYAsStringESet = rotationalDisplacementRYAsStringESet;
		rotationalDisplacementRYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING, oldRotationalDisplacementRYAsString, rotationalDisplacementRYAsString, !oldRotationalDisplacementRYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRYAsString() {
		String oldRotationalDisplacementRYAsString = rotationalDisplacementRYAsString;
		boolean oldRotationalDisplacementRYAsStringESet = rotationalDisplacementRYAsStringESet;
		rotationalDisplacementRYAsString = ROTATIONAL_DISPLACEMENT_RY_AS_STRING_EDEFAULT;
		rotationalDisplacementRYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING, oldRotationalDisplacementRYAsString, ROTATIONAL_DISPLACEMENT_RY_AS_STRING_EDEFAULT, oldRotationalDisplacementRYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRYAsString() {
		return rotationalDisplacementRYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalDisplacementRZ() {
		return rotationalDisplacementRZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRZ(double newRotationalDisplacementRZ) {
		double oldRotationalDisplacementRZ = rotationalDisplacementRZ;
		rotationalDisplacementRZ = newRotationalDisplacementRZ;
		boolean oldRotationalDisplacementRZESet = rotationalDisplacementRZESet;
		rotationalDisplacementRZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ, oldRotationalDisplacementRZ, rotationalDisplacementRZ, !oldRotationalDisplacementRZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRZ() {
		double oldRotationalDisplacementRZ = rotationalDisplacementRZ;
		boolean oldRotationalDisplacementRZESet = rotationalDisplacementRZESet;
		rotationalDisplacementRZ = ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT;
		rotationalDisplacementRZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ, oldRotationalDisplacementRZ, ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT, oldRotationalDisplacementRZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRZ() {
		return rotationalDisplacementRZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalDisplacementRZAsString() {
		return rotationalDisplacementRZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRZAsString(String newRotationalDisplacementRZAsString) {
		String oldRotationalDisplacementRZAsString = rotationalDisplacementRZAsString;
		rotationalDisplacementRZAsString = newRotationalDisplacementRZAsString;
		boolean oldRotationalDisplacementRZAsStringESet = rotationalDisplacementRZAsStringESet;
		rotationalDisplacementRZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING, oldRotationalDisplacementRZAsString, rotationalDisplacementRZAsString, !oldRotationalDisplacementRZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalDisplacementRZAsString() {
		String oldRotationalDisplacementRZAsString = rotationalDisplacementRZAsString;
		boolean oldRotationalDisplacementRZAsStringESet = rotationalDisplacementRZAsStringESet;
		rotationalDisplacementRZAsString = ROTATIONAL_DISPLACEMENT_RZ_AS_STRING_EDEFAULT;
		rotationalDisplacementRZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING, oldRotationalDisplacementRZAsString, ROTATIONAL_DISPLACEMENT_RZ_AS_STRING_EDEFAULT, oldRotationalDisplacementRZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalDisplacementRZAsString() {
		return rotationalDisplacementRZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				return getDisplacementX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING:
				return getDisplacementXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				return getDisplacementY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING:
				return getDisplacementYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				return getDisplacementZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING:
				return getDisplacementZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				return getRotationalDisplacementRX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING:
				return getRotationalDisplacementRXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				return getRotationalDisplacementRY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING:
				return getRotationalDisplacementRYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				return getRotationalDisplacementRZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING:
				return getRotationalDisplacementRZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				setDisplacementX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING:
				setDisplacementXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				setDisplacementY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING:
				setDisplacementYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				setDisplacementZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING:
				setDisplacementZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				setRotationalDisplacementRX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING:
				setRotationalDisplacementRXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				setRotationalDisplacementRY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING:
				setRotationalDisplacementRYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				setRotationalDisplacementRZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING:
				setRotationalDisplacementRZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				unsetDisplacementX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING:
				unsetDisplacementXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				unsetDisplacementY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING:
				unsetDisplacementYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				unsetDisplacementZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING:
				unsetDisplacementZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				unsetRotationalDisplacementRX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING:
				unsetRotationalDisplacementRXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				unsetRotationalDisplacementRY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING:
				unsetRotationalDisplacementRYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				unsetRotationalDisplacementRZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING:
				unsetRotationalDisplacementRZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				return isSetDisplacementX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_XAS_STRING:
				return isSetDisplacementXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				return isSetDisplacementY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_YAS_STRING:
				return isSetDisplacementYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				return isSetDisplacementZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_ZAS_STRING:
				return isSetDisplacementZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				return isSetRotationalDisplacementRX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX_AS_STRING:
				return isSetRotationalDisplacementRXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				return isSetRotationalDisplacementRY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY_AS_STRING:
				return isSetRotationalDisplacementRYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				return isSetRotationalDisplacementRZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ_AS_STRING:
				return isSetRotationalDisplacementRZAsString();
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
		result.append(" (DisplacementX: ");
		if (displacementXESet) result.append(displacementX); else result.append("<unset>");
		result.append(", DisplacementXAsString: ");
		if (displacementXAsStringESet) result.append(displacementXAsString); else result.append("<unset>");
		result.append(", DisplacementY: ");
		if (displacementYESet) result.append(displacementY); else result.append("<unset>");
		result.append(", DisplacementYAsString: ");
		if (displacementYAsStringESet) result.append(displacementYAsString); else result.append("<unset>");
		result.append(", DisplacementZ: ");
		if (displacementZESet) result.append(displacementZ); else result.append("<unset>");
		result.append(", DisplacementZAsString: ");
		if (displacementZAsStringESet) result.append(displacementZAsString); else result.append("<unset>");
		result.append(", RotationalDisplacementRX: ");
		if (rotationalDisplacementRXESet) result.append(rotationalDisplacementRX); else result.append("<unset>");
		result.append(", RotationalDisplacementRXAsString: ");
		if (rotationalDisplacementRXAsStringESet) result.append(rotationalDisplacementRXAsString); else result.append("<unset>");
		result.append(", RotationalDisplacementRY: ");
		if (rotationalDisplacementRYESet) result.append(rotationalDisplacementRY); else result.append("<unset>");
		result.append(", RotationalDisplacementRYAsString: ");
		if (rotationalDisplacementRYAsStringESet) result.append(rotationalDisplacementRYAsString); else result.append("<unset>");
		result.append(", RotationalDisplacementRZ: ");
		if (rotationalDisplacementRZESet) result.append(rotationalDisplacementRZ); else result.append("<unset>");
		result.append(", RotationalDisplacementRZAsString: ");
		if (rotationalDisplacementRZAsStringESet) result.append(rotationalDisplacementRZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleDisplacementImpl
