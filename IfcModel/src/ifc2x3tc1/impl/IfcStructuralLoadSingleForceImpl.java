/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadSingleForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceX <em>Force X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceXAsString <em>Force XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceY <em>Force Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceYAsString <em>Force YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getForceZAsString <em>Force ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentXAsString <em>Moment XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentYAsString <em>Moment YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentZ <em>Moment Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadSingleForceImpl#getMomentZAsString <em>Moment ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleForce {
	/**
	 * The default value of the '{@link #getForceX() <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceX()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForceX() <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceX()
	 * @generated
	 * @ordered
	 */
	protected double forceX = FORCE_X_EDEFAULT;

	/**
	 * This is true if the Force X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceXESet;

	/**
	 * The default value of the '{@link #getForceXAsString() <em>Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceXAsString() <em>Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected String forceXAsString = FORCE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Force XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceXAsStringESet;

	/**
	 * The default value of the '{@link #getForceY() <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceY()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForceY() <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceY()
	 * @generated
	 * @ordered
	 */
	protected double forceY = FORCE_Y_EDEFAULT;

	/**
	 * This is true if the Force Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceYESet;

	/**
	 * The default value of the '{@link #getForceYAsString() <em>Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceYAsString() <em>Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected String forceYAsString = FORCE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Force YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceYAsStringESet;

	/**
	 * The default value of the '{@link #getForceZ() <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final double FORCE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getForceZ() <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZ()
	 * @generated
	 * @ordered
	 */
	protected double forceZ = FORCE_Z_EDEFAULT;

	/**
	 * This is true if the Force Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceZESet;

	/**
	 * The default value of the '{@link #getForceZAsString() <em>Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceZAsString() <em>Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected String forceZAsString = FORCE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Force ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean forceZAsStringESet;

	/**
	 * The default value of the '{@link #getMomentX() <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentX()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentX() <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentX()
	 * @generated
	 * @ordered
	 */
	protected double momentX = MOMENT_X_EDEFAULT;

	/**
	 * This is true if the Moment X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentXESet;

	/**
	 * The default value of the '{@link #getMomentXAsString() <em>Moment XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentXAsString() <em>Moment XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentXAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentXAsString = MOMENT_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentXAsStringESet;

	/**
	 * The default value of the '{@link #getMomentY() <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentY()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentY() <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentY()
	 * @generated
	 * @ordered
	 */
	protected double momentY = MOMENT_Y_EDEFAULT;

	/**
	 * This is true if the Moment Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentYESet;

	/**
	 * The default value of the '{@link #getMomentYAsString() <em>Moment YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentYAsString() <em>Moment YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentYAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentYAsString = MOMENT_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentYAsStringESet;

	/**
	 * The default value of the '{@link #getMomentZ() <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZ()
	 * @generated
	 * @ordered
	 */
	protected static final double MOMENT_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMomentZ() <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZ()
	 * @generated
	 * @ordered
	 */
	protected double momentZ = MOMENT_Z_EDEFAULT;

	/**
	 * This is true if the Moment Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentZESet;

	/**
	 * The default value of the '{@link #getMomentZAsString() <em>Moment ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MOMENT_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentZAsString() <em>Moment ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZAsString()
	 * @generated
	 * @ordered
	 */
	protected String momentZAsString = MOMENT_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Moment ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean momentZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadSingleForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForceX() {
		return forceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceX(double newForceX) {
		double oldForceX = forceX;
		forceX = newForceX;
		boolean oldForceXESet = forceXESet;
		forceXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X, oldForceX, forceX, !oldForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceX() {
		double oldForceX = forceX;
		boolean oldForceXESet = forceXESet;
		forceX = FORCE_X_EDEFAULT;
		forceXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X, oldForceX, FORCE_X_EDEFAULT, oldForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceX() {
		return forceXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceXAsString() {
		return forceXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceXAsString(String newForceXAsString) {
		String oldForceXAsString = forceXAsString;
		forceXAsString = newForceXAsString;
		boolean oldForceXAsStringESet = forceXAsStringESet;
		forceXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING, oldForceXAsString, forceXAsString, !oldForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceXAsString() {
		String oldForceXAsString = forceXAsString;
		boolean oldForceXAsStringESet = forceXAsStringESet;
		forceXAsString = FORCE_XAS_STRING_EDEFAULT;
		forceXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING, oldForceXAsString, FORCE_XAS_STRING_EDEFAULT, oldForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceXAsString() {
		return forceXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForceY() {
		return forceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceY(double newForceY) {
		double oldForceY = forceY;
		forceY = newForceY;
		boolean oldForceYESet = forceYESet;
		forceYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y, oldForceY, forceY, !oldForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceY() {
		double oldForceY = forceY;
		boolean oldForceYESet = forceYESet;
		forceY = FORCE_Y_EDEFAULT;
		forceYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y, oldForceY, FORCE_Y_EDEFAULT, oldForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceY() {
		return forceYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceYAsString() {
		return forceYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceYAsString(String newForceYAsString) {
		String oldForceYAsString = forceYAsString;
		forceYAsString = newForceYAsString;
		boolean oldForceYAsStringESet = forceYAsStringESet;
		forceYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING, oldForceYAsString, forceYAsString, !oldForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceYAsString() {
		String oldForceYAsString = forceYAsString;
		boolean oldForceYAsStringESet = forceYAsStringESet;
		forceYAsString = FORCE_YAS_STRING_EDEFAULT;
		forceYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING, oldForceYAsString, FORCE_YAS_STRING_EDEFAULT, oldForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceYAsString() {
		return forceYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getForceZ() {
		return forceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceZ(double newForceZ) {
		double oldForceZ = forceZ;
		forceZ = newForceZ;
		boolean oldForceZESet = forceZESet;
		forceZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z, oldForceZ, forceZ, !oldForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceZ() {
		double oldForceZ = forceZ;
		boolean oldForceZESet = forceZESet;
		forceZ = FORCE_Z_EDEFAULT;
		forceZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z, oldForceZ, FORCE_Z_EDEFAULT, oldForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceZ() {
		return forceZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceZAsString() {
		return forceZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceZAsString(String newForceZAsString) {
		String oldForceZAsString = forceZAsString;
		forceZAsString = newForceZAsString;
		boolean oldForceZAsStringESet = forceZAsStringESet;
		forceZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING, oldForceZAsString, forceZAsString, !oldForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetForceZAsString() {
		String oldForceZAsString = forceZAsString;
		boolean oldForceZAsStringESet = forceZAsStringESet;
		forceZAsString = FORCE_ZAS_STRING_EDEFAULT;
		forceZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING, oldForceZAsString, FORCE_ZAS_STRING_EDEFAULT, oldForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetForceZAsString() {
		return forceZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentX() {
		return momentX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentX(double newMomentX) {
		double oldMomentX = momentX;
		momentX = newMomentX;
		boolean oldMomentXESet = momentXESet;
		momentXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X, oldMomentX, momentX, !oldMomentXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentX() {
		double oldMomentX = momentX;
		boolean oldMomentXESet = momentXESet;
		momentX = MOMENT_X_EDEFAULT;
		momentXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X, oldMomentX, MOMENT_X_EDEFAULT, oldMomentXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentX() {
		return momentXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentXAsString() {
		return momentXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentXAsString(String newMomentXAsString) {
		String oldMomentXAsString = momentXAsString;
		momentXAsString = newMomentXAsString;
		boolean oldMomentXAsStringESet = momentXAsStringESet;
		momentXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING, oldMomentXAsString, momentXAsString, !oldMomentXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentXAsString() {
		String oldMomentXAsString = momentXAsString;
		boolean oldMomentXAsStringESet = momentXAsStringESet;
		momentXAsString = MOMENT_XAS_STRING_EDEFAULT;
		momentXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING, oldMomentXAsString, MOMENT_XAS_STRING_EDEFAULT, oldMomentXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentXAsString() {
		return momentXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentY() {
		return momentY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentY(double newMomentY) {
		double oldMomentY = momentY;
		momentY = newMomentY;
		boolean oldMomentYESet = momentYESet;
		momentYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y, oldMomentY, momentY, !oldMomentYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentY() {
		double oldMomentY = momentY;
		boolean oldMomentYESet = momentYESet;
		momentY = MOMENT_Y_EDEFAULT;
		momentYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y, oldMomentY, MOMENT_Y_EDEFAULT, oldMomentYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentY() {
		return momentYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentYAsString() {
		return momentYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentYAsString(String newMomentYAsString) {
		String oldMomentYAsString = momentYAsString;
		momentYAsString = newMomentYAsString;
		boolean oldMomentYAsStringESet = momentYAsStringESet;
		momentYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING, oldMomentYAsString, momentYAsString, !oldMomentYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentYAsString() {
		String oldMomentYAsString = momentYAsString;
		boolean oldMomentYAsStringESet = momentYAsStringESet;
		momentYAsString = MOMENT_YAS_STRING_EDEFAULT;
		momentYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING, oldMomentYAsString, MOMENT_YAS_STRING_EDEFAULT, oldMomentYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentYAsString() {
		return momentYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMomentZ() {
		return momentZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentZ(double newMomentZ) {
		double oldMomentZ = momentZ;
		momentZ = newMomentZ;
		boolean oldMomentZESet = momentZESet;
		momentZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z, oldMomentZ, momentZ, !oldMomentZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentZ() {
		double oldMomentZ = momentZ;
		boolean oldMomentZESet = momentZESet;
		momentZ = MOMENT_Z_EDEFAULT;
		momentZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z, oldMomentZ, MOMENT_Z_EDEFAULT, oldMomentZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentZ() {
		return momentZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMomentZAsString() {
		return momentZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentZAsString(String newMomentZAsString) {
		String oldMomentZAsString = momentZAsString;
		momentZAsString = newMomentZAsString;
		boolean oldMomentZAsStringESet = momentZAsStringESet;
		momentZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING, oldMomentZAsString, momentZAsString, !oldMomentZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMomentZAsString() {
		String oldMomentZAsString = momentZAsString;
		boolean oldMomentZAsStringESet = momentZAsStringESet;
		momentZAsString = MOMENT_ZAS_STRING_EDEFAULT;
		momentZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING, oldMomentZAsString, MOMENT_ZAS_STRING_EDEFAULT, oldMomentZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMomentZAsString() {
		return momentZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				return getForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING:
				return getForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				return getForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING:
				return getForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				return getForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING:
				return getForceZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				return getMomentX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING:
				return getMomentXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				return getMomentY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING:
				return getMomentYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				return getMomentZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING:
				return getMomentZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				setForceX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING:
				setForceXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				setForceY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING:
				setForceYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				setForceZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING:
				setForceZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				setMomentX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING:
				setMomentXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				setMomentY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING:
				setMomentYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				setMomentZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING:
				setMomentZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				unsetForceX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING:
				unsetForceXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				unsetForceY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING:
				unsetForceYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				unsetForceZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING:
				unsetForceZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				unsetMomentX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING:
				unsetMomentXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				unsetMomentY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING:
				unsetMomentYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				unsetMomentZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING:
				unsetMomentZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				return isSetForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_XAS_STRING:
				return isSetForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				return isSetForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_YAS_STRING:
				return isSetForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				return isSetForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_ZAS_STRING:
				return isSetForceZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				return isSetMomentX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_XAS_STRING:
				return isSetMomentXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				return isSetMomentY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_YAS_STRING:
				return isSetMomentYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				return isSetMomentZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_ZAS_STRING:
				return isSetMomentZAsString();
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
		result.append(" (ForceX: ");
		if (forceXESet) result.append(forceX); else result.append("<unset>");
		result.append(", ForceXAsString: ");
		if (forceXAsStringESet) result.append(forceXAsString); else result.append("<unset>");
		result.append(", ForceY: ");
		if (forceYESet) result.append(forceY); else result.append("<unset>");
		result.append(", ForceYAsString: ");
		if (forceYAsStringESet) result.append(forceYAsString); else result.append("<unset>");
		result.append(", ForceZ: ");
		if (forceZESet) result.append(forceZ); else result.append("<unset>");
		result.append(", ForceZAsString: ");
		if (forceZAsStringESet) result.append(forceZAsString); else result.append("<unset>");
		result.append(", MomentX: ");
		if (momentXESet) result.append(momentX); else result.append("<unset>");
		result.append(", MomentXAsString: ");
		if (momentXAsStringESet) result.append(momentXAsString); else result.append("<unset>");
		result.append(", MomentY: ");
		if (momentYESet) result.append(momentY); else result.append("<unset>");
		result.append(", MomentYAsString: ");
		if (momentYAsStringESet) result.append(momentYAsString); else result.append("<unset>");
		result.append(", MomentZ: ");
		if (momentZESet) result.append(momentZ); else result.append("<unset>");
		result.append(", MomentZAsString: ");
		if (momentZAsStringESet) result.append(momentZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleForceImpl
