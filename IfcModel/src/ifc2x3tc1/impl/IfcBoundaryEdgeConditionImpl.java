/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundaryEdgeCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthXAsString <em>Linear Stiffness By Length XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthYAsString <em>Linear Stiffness By Length YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZAsString <em>Linear Stiffness By Length ZAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthXAsString <em>Rotational Stiffness By Length XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthYAsString <em>Rotational Stiffness By Length YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZAsString <em>Rotational Stiffness By Length ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryEdgeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryEdgeCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthX() <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthX() <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByLengthX = LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthXESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthXAsString() <em>Linear Stiffness By Length XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthXAsString() <em>Linear Stiffness By Length XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthXAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByLengthXAsString = LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthXAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthY() <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthY() <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByLengthY = LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthYESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthYAsString() <em>Linear Stiffness By Length YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthYAsString() <em>Linear Stiffness By Length YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthYAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByLengthYAsString = LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthYAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthZ() <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthZ() <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByLengthZ = LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthZESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthZAsString() <em>Linear Stiffness By Length ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthZAsString() <em>Linear Stiffness By Length ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByLengthZAsString = LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Length ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByLengthZAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthX() <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthX() <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessByLengthX = ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthXESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthXAsString() <em>Rotational Stiffness By Length XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthXAsString() <em>Rotational Stiffness By Length XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthXAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessByLengthXAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthXAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthY() <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthY() <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessByLengthY = ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthYESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthYAsString() <em>Rotational Stiffness By Length YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthYAsString() <em>Rotational Stiffness By Length YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthYAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessByLengthYAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthYAsStringESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthZ() <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected static final double ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthZ() <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected double rotationalStiffnessByLengthZ = ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthZESet;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthZAsString() <em>Rotational Stiffness By Length ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthZAsString() <em>Rotational Stiffness By Length ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZAsString()
	 * @generated
	 * @ordered
	 */
	protected String rotationalStiffnessByLengthZAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Rotational Stiffness By Length ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rotationalStiffnessByLengthZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryEdgeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryEdgeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByLengthX() {
		return linearStiffnessByLengthX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthX(double newLinearStiffnessByLengthX) {
		double oldLinearStiffnessByLengthX = linearStiffnessByLengthX;
		linearStiffnessByLengthX = newLinearStiffnessByLengthX;
		boolean oldLinearStiffnessByLengthXESet = linearStiffnessByLengthXESet;
		linearStiffnessByLengthXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X, oldLinearStiffnessByLengthX, linearStiffnessByLengthX, !oldLinearStiffnessByLengthXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthX() {
		double oldLinearStiffnessByLengthX = linearStiffnessByLengthX;
		boolean oldLinearStiffnessByLengthXESet = linearStiffnessByLengthXESet;
		linearStiffnessByLengthX = LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT;
		linearStiffnessByLengthXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X, oldLinearStiffnessByLengthX, LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT, oldLinearStiffnessByLengthXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthX() {
		return linearStiffnessByLengthXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByLengthXAsString() {
		return linearStiffnessByLengthXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthXAsString(String newLinearStiffnessByLengthXAsString) {
		String oldLinearStiffnessByLengthXAsString = linearStiffnessByLengthXAsString;
		linearStiffnessByLengthXAsString = newLinearStiffnessByLengthXAsString;
		boolean oldLinearStiffnessByLengthXAsStringESet = linearStiffnessByLengthXAsStringESet;
		linearStiffnessByLengthXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING, oldLinearStiffnessByLengthXAsString, linearStiffnessByLengthXAsString, !oldLinearStiffnessByLengthXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthXAsString() {
		String oldLinearStiffnessByLengthXAsString = linearStiffnessByLengthXAsString;
		boolean oldLinearStiffnessByLengthXAsStringESet = linearStiffnessByLengthXAsStringESet;
		linearStiffnessByLengthXAsString = LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT;
		linearStiffnessByLengthXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING, oldLinearStiffnessByLengthXAsString, LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT, oldLinearStiffnessByLengthXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthXAsString() {
		return linearStiffnessByLengthXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByLengthY() {
		return linearStiffnessByLengthY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthY(double newLinearStiffnessByLengthY) {
		double oldLinearStiffnessByLengthY = linearStiffnessByLengthY;
		linearStiffnessByLengthY = newLinearStiffnessByLengthY;
		boolean oldLinearStiffnessByLengthYESet = linearStiffnessByLengthYESet;
		linearStiffnessByLengthYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y, oldLinearStiffnessByLengthY, linearStiffnessByLengthY, !oldLinearStiffnessByLengthYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthY() {
		double oldLinearStiffnessByLengthY = linearStiffnessByLengthY;
		boolean oldLinearStiffnessByLengthYESet = linearStiffnessByLengthYESet;
		linearStiffnessByLengthY = LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT;
		linearStiffnessByLengthYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y, oldLinearStiffnessByLengthY, LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT, oldLinearStiffnessByLengthYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthY() {
		return linearStiffnessByLengthYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByLengthYAsString() {
		return linearStiffnessByLengthYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthYAsString(String newLinearStiffnessByLengthYAsString) {
		String oldLinearStiffnessByLengthYAsString = linearStiffnessByLengthYAsString;
		linearStiffnessByLengthYAsString = newLinearStiffnessByLengthYAsString;
		boolean oldLinearStiffnessByLengthYAsStringESet = linearStiffnessByLengthYAsStringESet;
		linearStiffnessByLengthYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING, oldLinearStiffnessByLengthYAsString, linearStiffnessByLengthYAsString, !oldLinearStiffnessByLengthYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthYAsString() {
		String oldLinearStiffnessByLengthYAsString = linearStiffnessByLengthYAsString;
		boolean oldLinearStiffnessByLengthYAsStringESet = linearStiffnessByLengthYAsStringESet;
		linearStiffnessByLengthYAsString = LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT;
		linearStiffnessByLengthYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING, oldLinearStiffnessByLengthYAsString, LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT, oldLinearStiffnessByLengthYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthYAsString() {
		return linearStiffnessByLengthYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByLengthZ() {
		return linearStiffnessByLengthZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthZ(double newLinearStiffnessByLengthZ) {
		double oldLinearStiffnessByLengthZ = linearStiffnessByLengthZ;
		linearStiffnessByLengthZ = newLinearStiffnessByLengthZ;
		boolean oldLinearStiffnessByLengthZESet = linearStiffnessByLengthZESet;
		linearStiffnessByLengthZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z, oldLinearStiffnessByLengthZ, linearStiffnessByLengthZ, !oldLinearStiffnessByLengthZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthZ() {
		double oldLinearStiffnessByLengthZ = linearStiffnessByLengthZ;
		boolean oldLinearStiffnessByLengthZESet = linearStiffnessByLengthZESet;
		linearStiffnessByLengthZ = LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT;
		linearStiffnessByLengthZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z, oldLinearStiffnessByLengthZ, LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT, oldLinearStiffnessByLengthZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthZ() {
		return linearStiffnessByLengthZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByLengthZAsString() {
		return linearStiffnessByLengthZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthZAsString(String newLinearStiffnessByLengthZAsString) {
		String oldLinearStiffnessByLengthZAsString = linearStiffnessByLengthZAsString;
		linearStiffnessByLengthZAsString = newLinearStiffnessByLengthZAsString;
		boolean oldLinearStiffnessByLengthZAsStringESet = linearStiffnessByLengthZAsStringESet;
		linearStiffnessByLengthZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING, oldLinearStiffnessByLengthZAsString, linearStiffnessByLengthZAsString, !oldLinearStiffnessByLengthZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByLengthZAsString() {
		String oldLinearStiffnessByLengthZAsString = linearStiffnessByLengthZAsString;
		boolean oldLinearStiffnessByLengthZAsStringESet = linearStiffnessByLengthZAsStringESet;
		linearStiffnessByLengthZAsString = LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT;
		linearStiffnessByLengthZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING, oldLinearStiffnessByLengthZAsString, LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT, oldLinearStiffnessByLengthZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByLengthZAsString() {
		return linearStiffnessByLengthZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessByLengthX() {
		return rotationalStiffnessByLengthX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthX(double newRotationalStiffnessByLengthX) {
		double oldRotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
		rotationalStiffnessByLengthX = newRotationalStiffnessByLengthX;
		boolean oldRotationalStiffnessByLengthXESet = rotationalStiffnessByLengthXESet;
		rotationalStiffnessByLengthXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X, oldRotationalStiffnessByLengthX, rotationalStiffnessByLengthX, !oldRotationalStiffnessByLengthXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthX() {
		double oldRotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
		boolean oldRotationalStiffnessByLengthXESet = rotationalStiffnessByLengthXESet;
		rotationalStiffnessByLengthX = ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT;
		rotationalStiffnessByLengthXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X, oldRotationalStiffnessByLengthX, ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT, oldRotationalStiffnessByLengthXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthX() {
		return rotationalStiffnessByLengthXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessByLengthXAsString() {
		return rotationalStiffnessByLengthXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthXAsString(String newRotationalStiffnessByLengthXAsString) {
		String oldRotationalStiffnessByLengthXAsString = rotationalStiffnessByLengthXAsString;
		rotationalStiffnessByLengthXAsString = newRotationalStiffnessByLengthXAsString;
		boolean oldRotationalStiffnessByLengthXAsStringESet = rotationalStiffnessByLengthXAsStringESet;
		rotationalStiffnessByLengthXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING, oldRotationalStiffnessByLengthXAsString, rotationalStiffnessByLengthXAsString, !oldRotationalStiffnessByLengthXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthXAsString() {
		String oldRotationalStiffnessByLengthXAsString = rotationalStiffnessByLengthXAsString;
		boolean oldRotationalStiffnessByLengthXAsStringESet = rotationalStiffnessByLengthXAsStringESet;
		rotationalStiffnessByLengthXAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT;
		rotationalStiffnessByLengthXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING, oldRotationalStiffnessByLengthXAsString, ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING_EDEFAULT, oldRotationalStiffnessByLengthXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthXAsString() {
		return rotationalStiffnessByLengthXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessByLengthY() {
		return rotationalStiffnessByLengthY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthY(double newRotationalStiffnessByLengthY) {
		double oldRotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
		rotationalStiffnessByLengthY = newRotationalStiffnessByLengthY;
		boolean oldRotationalStiffnessByLengthYESet = rotationalStiffnessByLengthYESet;
		rotationalStiffnessByLengthYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y, oldRotationalStiffnessByLengthY, rotationalStiffnessByLengthY, !oldRotationalStiffnessByLengthYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthY() {
		double oldRotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
		boolean oldRotationalStiffnessByLengthYESet = rotationalStiffnessByLengthYESet;
		rotationalStiffnessByLengthY = ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT;
		rotationalStiffnessByLengthYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y, oldRotationalStiffnessByLengthY, ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT, oldRotationalStiffnessByLengthYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthY() {
		return rotationalStiffnessByLengthYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessByLengthYAsString() {
		return rotationalStiffnessByLengthYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthYAsString(String newRotationalStiffnessByLengthYAsString) {
		String oldRotationalStiffnessByLengthYAsString = rotationalStiffnessByLengthYAsString;
		rotationalStiffnessByLengthYAsString = newRotationalStiffnessByLengthYAsString;
		boolean oldRotationalStiffnessByLengthYAsStringESet = rotationalStiffnessByLengthYAsStringESet;
		rotationalStiffnessByLengthYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING, oldRotationalStiffnessByLengthYAsString, rotationalStiffnessByLengthYAsString, !oldRotationalStiffnessByLengthYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthYAsString() {
		String oldRotationalStiffnessByLengthYAsString = rotationalStiffnessByLengthYAsString;
		boolean oldRotationalStiffnessByLengthYAsStringESet = rotationalStiffnessByLengthYAsStringESet;
		rotationalStiffnessByLengthYAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT;
		rotationalStiffnessByLengthYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING, oldRotationalStiffnessByLengthYAsString, ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING_EDEFAULT, oldRotationalStiffnessByLengthYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthYAsString() {
		return rotationalStiffnessByLengthYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRotationalStiffnessByLengthZ() {
		return rotationalStiffnessByLengthZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthZ(double newRotationalStiffnessByLengthZ) {
		double oldRotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
		rotationalStiffnessByLengthZ = newRotationalStiffnessByLengthZ;
		boolean oldRotationalStiffnessByLengthZESet = rotationalStiffnessByLengthZESet;
		rotationalStiffnessByLengthZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z, oldRotationalStiffnessByLengthZ, rotationalStiffnessByLengthZ, !oldRotationalStiffnessByLengthZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthZ() {
		double oldRotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
		boolean oldRotationalStiffnessByLengthZESet = rotationalStiffnessByLengthZESet;
		rotationalStiffnessByLengthZ = ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT;
		rotationalStiffnessByLengthZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z, oldRotationalStiffnessByLengthZ, ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT, oldRotationalStiffnessByLengthZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthZ() {
		return rotationalStiffnessByLengthZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRotationalStiffnessByLengthZAsString() {
		return rotationalStiffnessByLengthZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthZAsString(String newRotationalStiffnessByLengthZAsString) {
		String oldRotationalStiffnessByLengthZAsString = rotationalStiffnessByLengthZAsString;
		rotationalStiffnessByLengthZAsString = newRotationalStiffnessByLengthZAsString;
		boolean oldRotationalStiffnessByLengthZAsStringESet = rotationalStiffnessByLengthZAsStringESet;
		rotationalStiffnessByLengthZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING, oldRotationalStiffnessByLengthZAsString, rotationalStiffnessByLengthZAsString, !oldRotationalStiffnessByLengthZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRotationalStiffnessByLengthZAsString() {
		String oldRotationalStiffnessByLengthZAsString = rotationalStiffnessByLengthZAsString;
		boolean oldRotationalStiffnessByLengthZAsStringESet = rotationalStiffnessByLengthZAsStringESet;
		rotationalStiffnessByLengthZAsString = ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT;
		rotationalStiffnessByLengthZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING, oldRotationalStiffnessByLengthZAsString, ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING_EDEFAULT, oldRotationalStiffnessByLengthZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRotationalStiffnessByLengthZAsString() {
		return rotationalStiffnessByLengthZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				return getLinearStiffnessByLengthX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING:
				return getLinearStiffnessByLengthXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				return getLinearStiffnessByLengthY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING:
				return getLinearStiffnessByLengthYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				return getLinearStiffnessByLengthZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING:
				return getLinearStiffnessByLengthZAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				return getRotationalStiffnessByLengthX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING:
				return getRotationalStiffnessByLengthXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				return getRotationalStiffnessByLengthY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING:
				return getRotationalStiffnessByLengthYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				return getRotationalStiffnessByLengthZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING:
				return getRotationalStiffnessByLengthZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				setLinearStiffnessByLengthX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING:
				setLinearStiffnessByLengthXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				setLinearStiffnessByLengthY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING:
				setLinearStiffnessByLengthYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				setLinearStiffnessByLengthZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING:
				setLinearStiffnessByLengthZAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				setRotationalStiffnessByLengthX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING:
				setRotationalStiffnessByLengthXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				setRotationalStiffnessByLengthY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING:
				setRotationalStiffnessByLengthYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				setRotationalStiffnessByLengthZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING:
				setRotationalStiffnessByLengthZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				unsetLinearStiffnessByLengthX();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING:
				unsetLinearStiffnessByLengthXAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				unsetLinearStiffnessByLengthY();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING:
				unsetLinearStiffnessByLengthYAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				unsetLinearStiffnessByLengthZ();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING:
				unsetLinearStiffnessByLengthZAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				unsetRotationalStiffnessByLengthX();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING:
				unsetRotationalStiffnessByLengthXAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				unsetRotationalStiffnessByLengthY();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING:
				unsetRotationalStiffnessByLengthYAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				unsetRotationalStiffnessByLengthZ();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING:
				unsetRotationalStiffnessByLengthZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				return isSetLinearStiffnessByLengthX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_XAS_STRING:
				return isSetLinearStiffnessByLengthXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				return isSetLinearStiffnessByLengthY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_YAS_STRING:
				return isSetLinearStiffnessByLengthYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				return isSetLinearStiffnessByLengthZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_ZAS_STRING:
				return isSetLinearStiffnessByLengthZAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				return isSetRotationalStiffnessByLengthX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_XAS_STRING:
				return isSetRotationalStiffnessByLengthXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				return isSetRotationalStiffnessByLengthY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_YAS_STRING:
				return isSetRotationalStiffnessByLengthYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				return isSetRotationalStiffnessByLengthZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_ZAS_STRING:
				return isSetRotationalStiffnessByLengthZAsString();
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
		result.append(" (LinearStiffnessByLengthX: ");
		if (linearStiffnessByLengthXESet) result.append(linearStiffnessByLengthX); else result.append("<unset>");
		result.append(", LinearStiffnessByLengthXAsString: ");
		if (linearStiffnessByLengthXAsStringESet) result.append(linearStiffnessByLengthXAsString); else result.append("<unset>");
		result.append(", LinearStiffnessByLengthY: ");
		if (linearStiffnessByLengthYESet) result.append(linearStiffnessByLengthY); else result.append("<unset>");
		result.append(", LinearStiffnessByLengthYAsString: ");
		if (linearStiffnessByLengthYAsStringESet) result.append(linearStiffnessByLengthYAsString); else result.append("<unset>");
		result.append(", LinearStiffnessByLengthZ: ");
		if (linearStiffnessByLengthZESet) result.append(linearStiffnessByLengthZ); else result.append("<unset>");
		result.append(", LinearStiffnessByLengthZAsString: ");
		if (linearStiffnessByLengthZAsStringESet) result.append(linearStiffnessByLengthZAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthX: ");
		if (rotationalStiffnessByLengthXESet) result.append(rotationalStiffnessByLengthX); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthXAsString: ");
		if (rotationalStiffnessByLengthXAsStringESet) result.append(rotationalStiffnessByLengthXAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthY: ");
		if (rotationalStiffnessByLengthYESet) result.append(rotationalStiffnessByLengthY); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthYAsString: ");
		if (rotationalStiffnessByLengthYAsStringESet) result.append(rotationalStiffnessByLengthYAsString); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthZ: ");
		if (rotationalStiffnessByLengthZESet) result.append(rotationalStiffnessByLengthZ); else result.append("<unset>");
		result.append(", RotationalStiffnessByLengthZAsString: ");
		if (rotationalStiffnessByLengthZAsStringESet) result.append(rotationalStiffnessByLengthZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryEdgeConditionImpl
