/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadLinearForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceXAsString <em>Linear Force XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceYAsString <em>Linear Force YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearForceZAsString <em>Linear Force ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentXAsString <em>Linear Moment XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentYAsString <em>Linear Moment YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentZAsString <em>Linear Moment ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadLinearForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadLinearForce {
	/**
	 * The default value of the '{@link #getLinearForceX() <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceX()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_FORCE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearForceX() <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceX()
	 * @generated
	 * @ordered
	 */
	protected double linearForceX = LINEAR_FORCE_X_EDEFAULT;

	/**
	 * This is true if the Linear Force X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceXESet;

	/**
	 * The default value of the '{@link #getLinearForceXAsString() <em>Linear Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_FORCE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceXAsString() <em>Linear Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearForceXAsString = LINEAR_FORCE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Force XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceXAsStringESet;

	/**
	 * The default value of the '{@link #getLinearForceY() <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceY()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_FORCE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearForceY() <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceY()
	 * @generated
	 * @ordered
	 */
	protected double linearForceY = LINEAR_FORCE_Y_EDEFAULT;

	/**
	 * This is true if the Linear Force Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceYESet;

	/**
	 * The default value of the '{@link #getLinearForceYAsString() <em>Linear Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_FORCE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceYAsString() <em>Linear Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearForceYAsString = LINEAR_FORCE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Force YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceYAsStringESet;

	/**
	 * The default value of the '{@link #getLinearForceZ() <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_FORCE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearForceZ() <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZ()
	 * @generated
	 * @ordered
	 */
	protected double linearForceZ = LINEAR_FORCE_Z_EDEFAULT;

	/**
	 * This is true if the Linear Force Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceZESet;

	/**
	 * The default value of the '{@link #getLinearForceZAsString() <em>Linear Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_FORCE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceZAsString() <em>Linear Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearForceZAsString = LINEAR_FORCE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Force ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearForceZAsStringESet;

	/**
	 * The default value of the '{@link #getLinearMomentX() <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentX()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_MOMENT_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearMomentX() <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentX()
	 * @generated
	 * @ordered
	 */
	protected double linearMomentX = LINEAR_MOMENT_X_EDEFAULT;

	/**
	 * This is true if the Linear Moment X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentXESet;

	/**
	 * The default value of the '{@link #getLinearMomentXAsString() <em>Linear Moment XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_MOMENT_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentXAsString() <em>Linear Moment XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentXAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearMomentXAsString = LINEAR_MOMENT_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Moment XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentXAsStringESet;

	/**
	 * The default value of the '{@link #getLinearMomentY() <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentY()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_MOMENT_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearMomentY() <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentY()
	 * @generated
	 * @ordered
	 */
	protected double linearMomentY = LINEAR_MOMENT_Y_EDEFAULT;

	/**
	 * This is true if the Linear Moment Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentYESet;

	/**
	 * The default value of the '{@link #getLinearMomentYAsString() <em>Linear Moment YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_MOMENT_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentYAsString() <em>Linear Moment YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentYAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearMomentYAsString = LINEAR_MOMENT_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Moment YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentYAsStringESet;

	/**
	 * The default value of the '{@link #getLinearMomentZ() <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZ()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_MOMENT_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearMomentZ() <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZ()
	 * @generated
	 * @ordered
	 */
	protected double linearMomentZ = LINEAR_MOMENT_Z_EDEFAULT;

	/**
	 * This is true if the Linear Moment Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentZESet;

	/**
	 * The default value of the '{@link #getLinearMomentZAsString() <em>Linear Moment ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_MOMENT_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentZAsString() <em>Linear Moment ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearMomentZAsString = LINEAR_MOMENT_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Moment ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearMomentZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadLinearForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadLinearForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearForceX() {
		return linearForceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceX(double newLinearForceX) {
		double oldLinearForceX = linearForceX;
		linearForceX = newLinearForceX;
		boolean oldLinearForceXESet = linearForceXESet;
		linearForceXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X, oldLinearForceX, linearForceX, !oldLinearForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceX() {
		double oldLinearForceX = linearForceX;
		boolean oldLinearForceXESet = linearForceXESet;
		linearForceX = LINEAR_FORCE_X_EDEFAULT;
		linearForceXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X, oldLinearForceX, LINEAR_FORCE_X_EDEFAULT, oldLinearForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceX() {
		return linearForceXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearForceXAsString() {
		return linearForceXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceXAsString(String newLinearForceXAsString) {
		String oldLinearForceXAsString = linearForceXAsString;
		linearForceXAsString = newLinearForceXAsString;
		boolean oldLinearForceXAsStringESet = linearForceXAsStringESet;
		linearForceXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING, oldLinearForceXAsString, linearForceXAsString, !oldLinearForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceXAsString() {
		String oldLinearForceXAsString = linearForceXAsString;
		boolean oldLinearForceXAsStringESet = linearForceXAsStringESet;
		linearForceXAsString = LINEAR_FORCE_XAS_STRING_EDEFAULT;
		linearForceXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING, oldLinearForceXAsString, LINEAR_FORCE_XAS_STRING_EDEFAULT, oldLinearForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceXAsString() {
		return linearForceXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearForceY() {
		return linearForceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceY(double newLinearForceY) {
		double oldLinearForceY = linearForceY;
		linearForceY = newLinearForceY;
		boolean oldLinearForceYESet = linearForceYESet;
		linearForceYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y, oldLinearForceY, linearForceY, !oldLinearForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceY() {
		double oldLinearForceY = linearForceY;
		boolean oldLinearForceYESet = linearForceYESet;
		linearForceY = LINEAR_FORCE_Y_EDEFAULT;
		linearForceYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y, oldLinearForceY, LINEAR_FORCE_Y_EDEFAULT, oldLinearForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceY() {
		return linearForceYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearForceYAsString() {
		return linearForceYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceYAsString(String newLinearForceYAsString) {
		String oldLinearForceYAsString = linearForceYAsString;
		linearForceYAsString = newLinearForceYAsString;
		boolean oldLinearForceYAsStringESet = linearForceYAsStringESet;
		linearForceYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING, oldLinearForceYAsString, linearForceYAsString, !oldLinearForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceYAsString() {
		String oldLinearForceYAsString = linearForceYAsString;
		boolean oldLinearForceYAsStringESet = linearForceYAsStringESet;
		linearForceYAsString = LINEAR_FORCE_YAS_STRING_EDEFAULT;
		linearForceYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING, oldLinearForceYAsString, LINEAR_FORCE_YAS_STRING_EDEFAULT, oldLinearForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceYAsString() {
		return linearForceYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearForceZ() {
		return linearForceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceZ(double newLinearForceZ) {
		double oldLinearForceZ = linearForceZ;
		linearForceZ = newLinearForceZ;
		boolean oldLinearForceZESet = linearForceZESet;
		linearForceZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z, oldLinearForceZ, linearForceZ, !oldLinearForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceZ() {
		double oldLinearForceZ = linearForceZ;
		boolean oldLinearForceZESet = linearForceZESet;
		linearForceZ = LINEAR_FORCE_Z_EDEFAULT;
		linearForceZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z, oldLinearForceZ, LINEAR_FORCE_Z_EDEFAULT, oldLinearForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceZ() {
		return linearForceZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearForceZAsString() {
		return linearForceZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceZAsString(String newLinearForceZAsString) {
		String oldLinearForceZAsString = linearForceZAsString;
		linearForceZAsString = newLinearForceZAsString;
		boolean oldLinearForceZAsStringESet = linearForceZAsStringESet;
		linearForceZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING, oldLinearForceZAsString, linearForceZAsString, !oldLinearForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearForceZAsString() {
		String oldLinearForceZAsString = linearForceZAsString;
		boolean oldLinearForceZAsStringESet = linearForceZAsStringESet;
		linearForceZAsString = LINEAR_FORCE_ZAS_STRING_EDEFAULT;
		linearForceZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING, oldLinearForceZAsString, LINEAR_FORCE_ZAS_STRING_EDEFAULT, oldLinearForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearForceZAsString() {
		return linearForceZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearMomentX() {
		return linearMomentX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentX(double newLinearMomentX) {
		double oldLinearMomentX = linearMomentX;
		linearMomentX = newLinearMomentX;
		boolean oldLinearMomentXESet = linearMomentXESet;
		linearMomentXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X, oldLinearMomentX, linearMomentX, !oldLinearMomentXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentX() {
		double oldLinearMomentX = linearMomentX;
		boolean oldLinearMomentXESet = linearMomentXESet;
		linearMomentX = LINEAR_MOMENT_X_EDEFAULT;
		linearMomentXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X, oldLinearMomentX, LINEAR_MOMENT_X_EDEFAULT, oldLinearMomentXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentX() {
		return linearMomentXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearMomentXAsString() {
		return linearMomentXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentXAsString(String newLinearMomentXAsString) {
		String oldLinearMomentXAsString = linearMomentXAsString;
		linearMomentXAsString = newLinearMomentXAsString;
		boolean oldLinearMomentXAsStringESet = linearMomentXAsStringESet;
		linearMomentXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING, oldLinearMomentXAsString, linearMomentXAsString, !oldLinearMomentXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentXAsString() {
		String oldLinearMomentXAsString = linearMomentXAsString;
		boolean oldLinearMomentXAsStringESet = linearMomentXAsStringESet;
		linearMomentXAsString = LINEAR_MOMENT_XAS_STRING_EDEFAULT;
		linearMomentXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING, oldLinearMomentXAsString, LINEAR_MOMENT_XAS_STRING_EDEFAULT, oldLinearMomentXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentXAsString() {
		return linearMomentXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearMomentY() {
		return linearMomentY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentY(double newLinearMomentY) {
		double oldLinearMomentY = linearMomentY;
		linearMomentY = newLinearMomentY;
		boolean oldLinearMomentYESet = linearMomentYESet;
		linearMomentYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y, oldLinearMomentY, linearMomentY, !oldLinearMomentYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentY() {
		double oldLinearMomentY = linearMomentY;
		boolean oldLinearMomentYESet = linearMomentYESet;
		linearMomentY = LINEAR_MOMENT_Y_EDEFAULT;
		linearMomentYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y, oldLinearMomentY, LINEAR_MOMENT_Y_EDEFAULT, oldLinearMomentYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentY() {
		return linearMomentYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearMomentYAsString() {
		return linearMomentYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentYAsString(String newLinearMomentYAsString) {
		String oldLinearMomentYAsString = linearMomentYAsString;
		linearMomentYAsString = newLinearMomentYAsString;
		boolean oldLinearMomentYAsStringESet = linearMomentYAsStringESet;
		linearMomentYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING, oldLinearMomentYAsString, linearMomentYAsString, !oldLinearMomentYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentYAsString() {
		String oldLinearMomentYAsString = linearMomentYAsString;
		boolean oldLinearMomentYAsStringESet = linearMomentYAsStringESet;
		linearMomentYAsString = LINEAR_MOMENT_YAS_STRING_EDEFAULT;
		linearMomentYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING, oldLinearMomentYAsString, LINEAR_MOMENT_YAS_STRING_EDEFAULT, oldLinearMomentYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentYAsString() {
		return linearMomentYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearMomentZ() {
		return linearMomentZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentZ(double newLinearMomentZ) {
		double oldLinearMomentZ = linearMomentZ;
		linearMomentZ = newLinearMomentZ;
		boolean oldLinearMomentZESet = linearMomentZESet;
		linearMomentZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z, oldLinearMomentZ, linearMomentZ, !oldLinearMomentZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentZ() {
		double oldLinearMomentZ = linearMomentZ;
		boolean oldLinearMomentZESet = linearMomentZESet;
		linearMomentZ = LINEAR_MOMENT_Z_EDEFAULT;
		linearMomentZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z, oldLinearMomentZ, LINEAR_MOMENT_Z_EDEFAULT, oldLinearMomentZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentZ() {
		return linearMomentZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearMomentZAsString() {
		return linearMomentZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentZAsString(String newLinearMomentZAsString) {
		String oldLinearMomentZAsString = linearMomentZAsString;
		linearMomentZAsString = newLinearMomentZAsString;
		boolean oldLinearMomentZAsStringESet = linearMomentZAsStringESet;
		linearMomentZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING, oldLinearMomentZAsString, linearMomentZAsString, !oldLinearMomentZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearMomentZAsString() {
		String oldLinearMomentZAsString = linearMomentZAsString;
		boolean oldLinearMomentZAsStringESet = linearMomentZAsStringESet;
		linearMomentZAsString = LINEAR_MOMENT_ZAS_STRING_EDEFAULT;
		linearMomentZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING, oldLinearMomentZAsString, LINEAR_MOMENT_ZAS_STRING_EDEFAULT, oldLinearMomentZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearMomentZAsString() {
		return linearMomentZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				return getLinearForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING:
				return getLinearForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				return getLinearForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING:
				return getLinearForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				return getLinearForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING:
				return getLinearForceZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				return getLinearMomentX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING:
				return getLinearMomentXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				return getLinearMomentY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING:
				return getLinearMomentYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				return getLinearMomentZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING:
				return getLinearMomentZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				setLinearForceX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING:
				setLinearForceXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				setLinearForceY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING:
				setLinearForceYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				setLinearForceZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING:
				setLinearForceZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				setLinearMomentX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING:
				setLinearMomentXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				setLinearMomentY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING:
				setLinearMomentYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				setLinearMomentZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING:
				setLinearMomentZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				unsetLinearForceX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING:
				unsetLinearForceXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				unsetLinearForceY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING:
				unsetLinearForceYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				unsetLinearForceZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING:
				unsetLinearForceZAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				unsetLinearMomentX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING:
				unsetLinearMomentXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				unsetLinearMomentY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING:
				unsetLinearMomentYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				unsetLinearMomentZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING:
				unsetLinearMomentZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				return isSetLinearForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_XAS_STRING:
				return isSetLinearForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				return isSetLinearForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_YAS_STRING:
				return isSetLinearForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				return isSetLinearForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_ZAS_STRING:
				return isSetLinearForceZAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				return isSetLinearMomentX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_XAS_STRING:
				return isSetLinearMomentXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				return isSetLinearMomentY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_YAS_STRING:
				return isSetLinearMomentYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				return isSetLinearMomentZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_ZAS_STRING:
				return isSetLinearMomentZAsString();
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
		result.append(" (LinearForceX: ");
		if (linearForceXESet) result.append(linearForceX); else result.append("<unset>");
		result.append(", LinearForceXAsString: ");
		if (linearForceXAsStringESet) result.append(linearForceXAsString); else result.append("<unset>");
		result.append(", LinearForceY: ");
		if (linearForceYESet) result.append(linearForceY); else result.append("<unset>");
		result.append(", LinearForceYAsString: ");
		if (linearForceYAsStringESet) result.append(linearForceYAsString); else result.append("<unset>");
		result.append(", LinearForceZ: ");
		if (linearForceZESet) result.append(linearForceZ); else result.append("<unset>");
		result.append(", LinearForceZAsString: ");
		if (linearForceZAsStringESet) result.append(linearForceZAsString); else result.append("<unset>");
		result.append(", LinearMomentX: ");
		if (linearMomentXESet) result.append(linearMomentX); else result.append("<unset>");
		result.append(", LinearMomentXAsString: ");
		if (linearMomentXAsStringESet) result.append(linearMomentXAsString); else result.append("<unset>");
		result.append(", LinearMomentY: ");
		if (linearMomentYESet) result.append(linearMomentY); else result.append("<unset>");
		result.append(", LinearMomentYAsString: ");
		if (linearMomentYAsStringESet) result.append(linearMomentYAsString); else result.append("<unset>");
		result.append(", LinearMomentZ: ");
		if (linearMomentZESet) result.append(linearMomentZ); else result.append("<unset>");
		result.append(", LinearMomentZAsString: ");
		if (linearMomentZAsStringESet) result.append(linearMomentZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadLinearForceImpl
