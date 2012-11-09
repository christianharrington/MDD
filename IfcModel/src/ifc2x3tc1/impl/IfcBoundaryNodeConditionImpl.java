/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundaryNodeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessXAsString <em>Linear Stiffness XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessYAsString <em>Linear Stiffness YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZAsString <em>Linear Stiffness ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessXAsString <em>Rotational Stiffness XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessYAsString <em>Rotational Stiffness YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZAsString <em>Rotational Stiffness ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryNodeCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessX() <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessX() <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessX = LINEAR_STIFFNESS_X_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessXESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessXAsString() <em>Linear Stiffness XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessXAsString() <em>Linear Stiffness XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessXAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessXAsString = LINEAR_STIFFNESS_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessXAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessY() <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessY() <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessY = LINEAR_STIFFNESS_Y_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessYESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessYAsString() <em>Linear Stiffness YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessYAsString() <em>Linear Stiffness YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessYAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessYAsString = LINEAR_STIFFNESS_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessYAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessZ() <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessZ() <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessZ = LINEAR_STIFFNESS_Z_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessZESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessZAsString() <em>Linear Stiffness ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessZAsString() <em>Linear Stiffness ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessZAsString = LINEAR_STIFFNESS_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessZAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessX() <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessX() <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessX = ROTATIONAL_STIFFNESS_X_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessXESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessXAsString() <em>Rotational Stiffness XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessXAsString() <em>Rotational Stiffness XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessXAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessXAsString = ROTATIONAL_STIFFNESS_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessXAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessY() <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessY() <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessY = ROTATIONAL_STIFFNESS_Y_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessYESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessYAsString() <em>Rotational Stiffness YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessYAsString() <em>Rotational Stiffness YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessYAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessYAsString = ROTATIONAL_STIFFNESS_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessYAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessZ() <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessZ() <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessZ = ROTATIONAL_STIFFNESS_Z_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessZESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessZAsString() <em>Rotational Stiffness ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessZAsString() <em>Rotational Stiffness ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessZAsString = ROTATIONAL_STIFFNESS_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryNodeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessX() {
		return linearStiffnessX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessX(double newLinearStiffnessX) {
		double oldLinearStiffnessX = linearStiffnessX;
		linearStiffnessX = newLinearStiffnessX;
		boolean oldLinearStiffnessXESet = linearStiffnessXESet;
		linearStiffnessXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X, oldLinearStiffnessX, linearStiffnessX, !oldLinearStiffnessXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessX() {
		double oldLinearStiffnessX = linearStiffnessX;
		boolean oldLinearStiffnessXESet = linearStiffnessXESet;
		linearStiffnessX = LINEAR_STIFFNESS_X_EDEFAULT;
		linearStiffnessXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X, oldLinearStiffnessX, LINEAR_STIFFNESS_X_EDEFAULT, oldLinearStiffnessXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessX() {
		return linearStiffnessXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessXAsString() {
		return linearStiffnessXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessXAsString(String newLinearStiffnessXAsString) {
		String oldLinearStiffnessXAsString = linearStiffnessXAsString;
		linearStiffnessXAsString = newLinearStiffnessXAsString;
		boolean oldLinearStiffnessXAsStringESet = linearStiffnessXAsStringESet;
		linearStiffnessXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING, oldLinearStiffnessXAsString, linearStiffnessXAsString, !oldLinearStiffnessXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessXAsString() {
		String oldLinearStiffnessXAsString = linearStiffnessXAsString;
		boolean oldLinearStiffnessXAsStringESet = linearStiffnessXAsStringESet;
		linearStiffnessXAsString = LINEAR_STIFFNESS_XAS_STRING_EDEFAULT;
		linearStiffnessXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING, oldLinearStiffnessXAsString, LINEAR_STIFFNESS_XAS_STRING_EDEFAULT, oldLinearStiffnessXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessXAsString() {
		return linearStiffnessXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessY() {
		return linearStiffnessY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessY(double newLinearStiffnessY) {
		double oldLinearStiffnessY = linearStiffnessY;
		linearStiffnessY = newLinearStiffnessY;
		boolean oldLinearStiffnessYESet = linearStiffnessYESet;
		linearStiffnessYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y, oldLinearStiffnessY, linearStiffnessY, !oldLinearStiffnessYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessY() {
		double oldLinearStiffnessY = linearStiffnessY;
		boolean oldLinearStiffnessYESet = linearStiffnessYESet;
		linearStiffnessY = LINEAR_STIFFNESS_Y_EDEFAULT;
		linearStiffnessYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y, oldLinearStiffnessY, LINEAR_STIFFNESS_Y_EDEFAULT, oldLinearStiffnessYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessY() {
		return linearStiffnessYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessYAsString() {
		return linearStiffnessYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessYAsString(String newLinearStiffnessYAsString) {
		String oldLinearStiffnessYAsString = linearStiffnessYAsString;
		linearStiffnessYAsString = newLinearStiffnessYAsString;
		boolean oldLinearStiffnessYAsStringESet = linearStiffnessYAsStringESet;
		linearStiffnessYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING, oldLinearStiffnessYAsString, linearStiffnessYAsString, !oldLinearStiffnessYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessYAsString() {
		String oldLinearStiffnessYAsString = linearStiffnessYAsString;
		boolean oldLinearStiffnessYAsStringESet = linearStiffnessYAsStringESet;
		linearStiffnessYAsString = LINEAR_STIFFNESS_YAS_STRING_EDEFAULT;
		linearStiffnessYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING, oldLinearStiffnessYAsString, LINEAR_STIFFNESS_YAS_STRING_EDEFAULT, oldLinearStiffnessYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessYAsString() {
		return linearStiffnessYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessZ() {
		return linearStiffnessZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessZ(double newLinearStiffnessZ) {
		double oldLinearStiffnessZ = linearStiffnessZ;
		linearStiffnessZ = newLinearStiffnessZ;
		boolean oldLinearStiffnessZESet = linearStiffnessZESet;
		linearStiffnessZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z, oldLinearStiffnessZ, linearStiffnessZ, !oldLinearStiffnessZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessZ() {
		double oldLinearStiffnessZ = linearStiffnessZ;
		boolean oldLinearStiffnessZESet = linearStiffnessZESet;
		linearStiffnessZ = LINEAR_STIFFNESS_Z_EDEFAULT;
		linearStiffnessZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z, oldLinearStiffnessZ, LINEAR_STIFFNESS_Z_EDEFAULT, oldLinearStiffnessZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessZ() {
		return linearStiffnessZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessZAsString() {
		return linearStiffnessZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessZAsString(String newLinearStiffnessZAsString) {
		String oldLinearStiffnessZAsString = linearStiffnessZAsString;
		linearStiffnessZAsString = newLinearStiffnessZAsString;
		boolean oldLinearStiffnessZAsStringESet = linearStiffnessZAsStringESet;
		linearStiffnessZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING, oldLinearStiffnessZAsString, linearStiffnessZAsString, !oldLinearStiffnessZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessZAsString() {
		String oldLinearStiffnessZAsString = linearStiffnessZAsString;
		boolean oldLinearStiffnessZAsStringESet = linearStiffnessZAsStringESet;
		linearStiffnessZAsString = LINEAR_STIFFNESS_ZAS_STRING_EDEFAULT;
		linearStiffnessZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING, oldLinearStiffnessZAsString, LINEAR_STIFFNESS_ZAS_STRING_EDEFAULT, oldLinearStiffnessZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessZAsString() {
		return linearStiffnessZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessX() {
		return rotationalStiffnessX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessX(double newRotationalStiffnessX) {
		double oldRotationalStiffnessX = rotationalStiffnessX;
		rotationalStiffnessX = newRotationalStiffnessX;
		boolean oldRotationalStiffnessXESet = rotationalStiffnessXESet;
		rotationalStiffnessXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X, oldRotationalStiffnessX, rotationalStiffnessX, !oldRotationalStiffnessXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessX() {
		double oldRotationalStiffnessX = rotationalStiffnessX;
		boolean oldRotationalStiffnessXESet = rotationalStiffnessXESet;
		rotationalStiffnessX = ROTATIONAL_STIFFNESS_X_EDEFAULT;
		rotationalStiffnessXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X, oldRotationalStiffnessX, ROTATIONAL_STIFFNESS_X_EDEFAULT, oldRotationalStiffnessXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessX() {
		return rotationalStiffnessXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessXAsString() {
		return rotationalStiffnessXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessXAsString(String newRotationalStiffnessXAsString) {
		String oldRotationalStiffnessXAsString = rotationalStiffnessXAsString;
		rotationalStiffnessXAsString = newRotationalStiffnessXAsString;
		boolean oldRotationalStiffnessXAsStringESet = rotationalStiffnessXAsStringESet;
		rotationalStiffnessXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING, oldRotationalStiffnessXAsString, rotationalStiffnessXAsString, !oldRotationalStiffnessXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessXAsString() {
		String oldRotationalStiffnessXAsString = rotationalStiffnessXAsString;
		boolean oldRotationalStiffnessXAsStringESet = rotationalStiffnessXAsStringESet;
		rotationalStiffnessXAsString = ROTATIONAL_STIFFNESS_XAS_STRING_EDEFAULT;
		rotationalStiffnessXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING, oldRotationalStiffnessXAsString, ROTATIONAL_STIFFNESS_XAS_STRING_EDEFAULT, oldRotationalStiffnessXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessXAsString() {
		return rotationalStiffnessXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessY() {
		return rotationalStiffnessY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessY(double newRotationalStiffnessY) {
		double oldRotationalStiffnessY = rotationalStiffnessY;
		rotationalStiffnessY = newRotationalStiffnessY;
		boolean oldRotationalStiffnessYESet = rotationalStiffnessYESet;
		rotationalStiffnessYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y, oldRotationalStiffnessY, rotationalStiffnessY, !oldRotationalStiffnessYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessY() {
		double oldRotationalStiffnessY = rotationalStiffnessY;
		boolean oldRotationalStiffnessYESet = rotationalStiffnessYESet;
		rotationalStiffnessY = ROTATIONAL_STIFFNESS_Y_EDEFAULT;
		rotationalStiffnessYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y, oldRotationalStiffnessY, ROTATIONAL_STIFFNESS_Y_EDEFAULT, oldRotationalStiffnessYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessY() {
		return rotationalStiffnessYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessYAsString() {
		return rotationalStiffnessYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessYAsString(String newRotationalStiffnessYAsString) {
		String oldRotationalStiffnessYAsString = rotationalStiffnessYAsString;
		rotationalStiffnessYAsString = newRotationalStiffnessYAsString;
		boolean oldRotationalStiffnessYAsStringESet = rotationalStiffnessYAsStringESet;
		rotationalStiffnessYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING, oldRotationalStiffnessYAsString, rotationalStiffnessYAsString, !oldRotationalStiffnessYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessYAsString() {
		String oldRotationalStiffnessYAsString = rotationalStiffnessYAsString;
		boolean oldRotationalStiffnessYAsStringESet = rotationalStiffnessYAsStringESet;
		rotationalStiffnessYAsString = ROTATIONAL_STIFFNESS_YAS_STRING_EDEFAULT;
		rotationalStiffnessYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING, oldRotationalStiffnessYAsString, ROTATIONAL_STIFFNESS_YAS_STRING_EDEFAULT, oldRotationalStiffnessYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessYAsString() {
		return rotationalStiffnessYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessZ() {
		return rotationalStiffnessZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessZ(double newRotationalStiffnessZ) {
		double oldRotationalStiffnessZ = rotationalStiffnessZ;
		rotationalStiffnessZ = newRotationalStiffnessZ;
		boolean oldRotationalStiffnessZESet = rotationalStiffnessZESet;
		rotationalStiffnessZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z, oldRotationalStiffnessZ, rotationalStiffnessZ, !oldRotationalStiffnessZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessZ() {
		double oldRotationalStiffnessZ = rotationalStiffnessZ;
		boolean oldRotationalStiffnessZESet = rotationalStiffnessZESet;
		rotationalStiffnessZ = ROTATIONAL_STIFFNESS_Z_EDEFAULT;
		rotationalStiffnessZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z, oldRotationalStiffnessZ, ROTATIONAL_STIFFNESS_Z_EDEFAULT, oldRotationalStiffnessZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessZ() {
		return rotationalStiffnessZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessZAsString() {
		return rotationalStiffnessZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessZAsString(String newRotationalStiffnessZAsString) {
		String oldRotationalStiffnessZAsString = rotationalStiffnessZAsString;
		rotationalStiffnessZAsString = newRotationalStiffnessZAsString;
		boolean oldRotationalStiffnessZAsStringESet = rotationalStiffnessZAsStringESet;
		rotationalStiffnessZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING, oldRotationalStiffnessZAsString, rotationalStiffnessZAsString, !oldRotationalStiffnessZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessZAsString() {
		String oldRotationalStiffnessZAsString = rotationalStiffnessZAsString;
		boolean oldRotationalStiffnessZAsStringESet = rotationalStiffnessZAsStringESet;
		rotationalStiffnessZAsString = ROTATIONAL_STIFFNESS_ZAS_STRING_EDEFAULT;
		rotationalStiffnessZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING, oldRotationalStiffnessZAsString, ROTATIONAL_STIFFNESS_ZAS_STRING_EDEFAULT, oldRotationalStiffnessZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessZAsString() {
		return rotationalStiffnessZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				return getLinearStiffnessX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING:
				return getLinearStiffnessXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				return getLinearStiffnessY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING:
				return getLinearStiffnessYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				return getLinearStiffnessZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING:
				return getLinearStiffnessZAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				return getRotationalStiffnessX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING:
				return getRotationalStiffnessXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				return getRotationalStiffnessY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING:
				return getRotationalStiffnessYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				return getRotationalStiffnessZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING:
				return getRotationalStiffnessZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				setLinearStiffnessX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING:
				setLinearStiffnessXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				setLinearStiffnessY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING:
				setLinearStiffnessYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				setLinearStiffnessZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING:
				setLinearStiffnessZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				setRotationalStiffnessX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING:
				setRotationalStiffnessXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				setRotationalStiffnessY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING:
				setRotationalStiffnessYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				setRotationalStiffnessZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING:
				setRotationalStiffnessZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				unsetLinearStiffnessX();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING:
				unsetLinearStiffnessXAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				unsetLinearStiffnessY();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING:
				unsetLinearStiffnessYAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				unsetLinearStiffnessZ();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING:
				unsetLinearStiffnessZAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				unsetRotationalStiffnessX();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING:
				unsetRotationalStiffnessXAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				unsetRotationalStiffnessY();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING:
				unsetRotationalStiffnessYAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				unsetRotationalStiffnessZ();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING:
				unsetRotationalStiffnessZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				return isSetLinearStiffnessX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_XAS_STRING:
				return isSetLinearStiffnessXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				return isSetLinearStiffnessY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_YAS_STRING:
				return isSetLinearStiffnessYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				return isSetLinearStiffnessZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_ZAS_STRING:
				return isSetLinearStiffnessZAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				return isSetRotationalStiffnessX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_XAS_STRING:
				return isSetRotationalStiffnessXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				return isSetRotationalStiffnessY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_YAS_STRING:
				return isSetRotationalStiffnessYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				return isSetRotationalStiffnessZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_ZAS_STRING:
				return isSetRotationalStiffnessZAsString();
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
		result.append(" (LinearStiffnessX: ");
		if (linearStiffnessXESet) result.append(linearStiffnessX); else result.append("<unset>");
		result.append(", LinearStiffnessXAsString: ");
		if (linearStiffnessXAsStringESet) result.append(linearStiffnessXAsString); else result.append("<unset>");
		result.append(", LinearStiffnessY: ");
		if (linearStiffnessYESet) result.append(linearStiffnessY); else result.append("<unset>");
		result.append(", LinearStiffnessYAsString: ");
		if (linearStiffnessYAsStringESet) result.append(linearStiffnessYAsString); else result.append("<unset>");
		result.append(", LinearStiffnessZ: ");
		if (linearStiffnessZESet) result.append(linearStiffnessZ); else result.append("<unset>");
		result.append(", LinearStiffnessZAsString: ");
		if (linearStiffnessZAsStringESet) result.append(linearStiffnessZAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessX: ");
		if (rotationalStiffnessXESet) result.append(rotationalStiffnessX); else result.append("<unset>");
		result.append(", RotationalStiffnessXAsString: ");
		if (rotationalStiffnessXAsStringESet) result.append(rotationalStiffnessXAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessY: ");
		if (rotationalStiffnessYESet) result.append(rotationalStiffnessY); else result.append("<unset>");
		result.append(", RotationalStiffnessYAsString: ");
		if (rotationalStiffnessYAsStringESet) result.append(rotationalStiffnessYAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessZ: ");
		if (rotationalStiffnessZESet) result.append(rotationalStiffnessZ); else result.append("<unset>");
		result.append(", RotationalStiffnessZAsString: ");
		if (rotationalStiffnessZAsStringESet) result.append(rotationalStiffnessZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryNodeConditionImpl
