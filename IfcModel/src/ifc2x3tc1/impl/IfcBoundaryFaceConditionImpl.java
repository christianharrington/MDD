/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBoundaryFaceCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaXAsString <em>Linear Stiffness By Area XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaYAsString <em>Linear Stiffness By Area YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZAsString <em>Linear Stiffness By Area ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryFaceConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryFaceCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaX() <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaX() <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByAreaX = LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaXESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaXAsString() <em>Linear Stiffness By Area XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_AREA_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaXAsString() <em>Linear Stiffness By Area XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaXAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByAreaXAsString = LINEAR_STIFFNESS_BY_AREA_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaXAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaY() <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaY() <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByAreaY = LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaYESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaYAsString() <em>Linear Stiffness By Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_AREA_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaYAsString() <em>Linear Stiffness By Area YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaYAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByAreaYAsString = LINEAR_STIFFNESS_BY_AREA_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaYAsStringESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaZ() <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaZ() <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 * @ordered
	 */
	protected double linearStiffnessByAreaZ = LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaZESet;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaZAsString() <em>Linear Stiffness By Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String LINEAR_STIFFNESS_BY_AREA_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaZAsString() <em>Linear Stiffness By Area ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZAsString()
	 * @generated
	 * @ordered
	 */
	protected String linearStiffnessByAreaZAsString = LINEAR_STIFFNESS_BY_AREA_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Linear Stiffness By Area ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean linearStiffnessByAreaZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryFaceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBoundaryFaceCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByAreaX() {
		return linearStiffnessByAreaX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaX(double newLinearStiffnessByAreaX) {
		double oldLinearStiffnessByAreaX = linearStiffnessByAreaX;
		linearStiffnessByAreaX = newLinearStiffnessByAreaX;
		boolean oldLinearStiffnessByAreaXESet = linearStiffnessByAreaXESet;
		linearStiffnessByAreaXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X, oldLinearStiffnessByAreaX, linearStiffnessByAreaX, !oldLinearStiffnessByAreaXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaX() {
		double oldLinearStiffnessByAreaX = linearStiffnessByAreaX;
		boolean oldLinearStiffnessByAreaXESet = linearStiffnessByAreaXESet;
		linearStiffnessByAreaX = LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT;
		linearStiffnessByAreaXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X, oldLinearStiffnessByAreaX, LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT, oldLinearStiffnessByAreaXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaX() {
		return linearStiffnessByAreaXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByAreaXAsString() {
		return linearStiffnessByAreaXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaXAsString(String newLinearStiffnessByAreaXAsString) {
		String oldLinearStiffnessByAreaXAsString = linearStiffnessByAreaXAsString;
		linearStiffnessByAreaXAsString = newLinearStiffnessByAreaXAsString;
		boolean oldLinearStiffnessByAreaXAsStringESet = linearStiffnessByAreaXAsStringESet;
		linearStiffnessByAreaXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING, oldLinearStiffnessByAreaXAsString, linearStiffnessByAreaXAsString, !oldLinearStiffnessByAreaXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaXAsString() {
		String oldLinearStiffnessByAreaXAsString = linearStiffnessByAreaXAsString;
		boolean oldLinearStiffnessByAreaXAsStringESet = linearStiffnessByAreaXAsStringESet;
		linearStiffnessByAreaXAsString = LINEAR_STIFFNESS_BY_AREA_XAS_STRING_EDEFAULT;
		linearStiffnessByAreaXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING, oldLinearStiffnessByAreaXAsString, LINEAR_STIFFNESS_BY_AREA_XAS_STRING_EDEFAULT, oldLinearStiffnessByAreaXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaXAsString() {
		return linearStiffnessByAreaXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByAreaY() {
		return linearStiffnessByAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaY(double newLinearStiffnessByAreaY) {
		double oldLinearStiffnessByAreaY = linearStiffnessByAreaY;
		linearStiffnessByAreaY = newLinearStiffnessByAreaY;
		boolean oldLinearStiffnessByAreaYESet = linearStiffnessByAreaYESet;
		linearStiffnessByAreaYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y, oldLinearStiffnessByAreaY, linearStiffnessByAreaY, !oldLinearStiffnessByAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaY() {
		double oldLinearStiffnessByAreaY = linearStiffnessByAreaY;
		boolean oldLinearStiffnessByAreaYESet = linearStiffnessByAreaYESet;
		linearStiffnessByAreaY = LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT;
		linearStiffnessByAreaYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y, oldLinearStiffnessByAreaY, LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT, oldLinearStiffnessByAreaYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaY() {
		return linearStiffnessByAreaYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByAreaYAsString() {
		return linearStiffnessByAreaYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaYAsString(String newLinearStiffnessByAreaYAsString) {
		String oldLinearStiffnessByAreaYAsString = linearStiffnessByAreaYAsString;
		linearStiffnessByAreaYAsString = newLinearStiffnessByAreaYAsString;
		boolean oldLinearStiffnessByAreaYAsStringESet = linearStiffnessByAreaYAsStringESet;
		linearStiffnessByAreaYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING, oldLinearStiffnessByAreaYAsString, linearStiffnessByAreaYAsString, !oldLinearStiffnessByAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaYAsString() {
		String oldLinearStiffnessByAreaYAsString = linearStiffnessByAreaYAsString;
		boolean oldLinearStiffnessByAreaYAsStringESet = linearStiffnessByAreaYAsStringESet;
		linearStiffnessByAreaYAsString = LINEAR_STIFFNESS_BY_AREA_YAS_STRING_EDEFAULT;
		linearStiffnessByAreaYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING, oldLinearStiffnessByAreaYAsString, LINEAR_STIFFNESS_BY_AREA_YAS_STRING_EDEFAULT, oldLinearStiffnessByAreaYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaYAsString() {
		return linearStiffnessByAreaYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearStiffnessByAreaZ() {
		return linearStiffnessByAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaZ(double newLinearStiffnessByAreaZ) {
		double oldLinearStiffnessByAreaZ = linearStiffnessByAreaZ;
		linearStiffnessByAreaZ = newLinearStiffnessByAreaZ;
		boolean oldLinearStiffnessByAreaZESet = linearStiffnessByAreaZESet;
		linearStiffnessByAreaZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z, oldLinearStiffnessByAreaZ, linearStiffnessByAreaZ, !oldLinearStiffnessByAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaZ() {
		double oldLinearStiffnessByAreaZ = linearStiffnessByAreaZ;
		boolean oldLinearStiffnessByAreaZESet = linearStiffnessByAreaZESet;
		linearStiffnessByAreaZ = LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT;
		linearStiffnessByAreaZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z, oldLinearStiffnessByAreaZ, LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT, oldLinearStiffnessByAreaZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaZ() {
		return linearStiffnessByAreaZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinearStiffnessByAreaZAsString() {
		return linearStiffnessByAreaZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaZAsString(String newLinearStiffnessByAreaZAsString) {
		String oldLinearStiffnessByAreaZAsString = linearStiffnessByAreaZAsString;
		linearStiffnessByAreaZAsString = newLinearStiffnessByAreaZAsString;
		boolean oldLinearStiffnessByAreaZAsStringESet = linearStiffnessByAreaZAsStringESet;
		linearStiffnessByAreaZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING, oldLinearStiffnessByAreaZAsString, linearStiffnessByAreaZAsString, !oldLinearStiffnessByAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLinearStiffnessByAreaZAsString() {
		String oldLinearStiffnessByAreaZAsString = linearStiffnessByAreaZAsString;
		boolean oldLinearStiffnessByAreaZAsStringESet = linearStiffnessByAreaZAsStringESet;
		linearStiffnessByAreaZAsString = LINEAR_STIFFNESS_BY_AREA_ZAS_STRING_EDEFAULT;
		linearStiffnessByAreaZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING, oldLinearStiffnessByAreaZAsString, LINEAR_STIFFNESS_BY_AREA_ZAS_STRING_EDEFAULT, oldLinearStiffnessByAreaZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinearStiffnessByAreaZAsString() {
		return linearStiffnessByAreaZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				return getLinearStiffnessByAreaX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING:
				return getLinearStiffnessByAreaXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				return getLinearStiffnessByAreaY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING:
				return getLinearStiffnessByAreaYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				return getLinearStiffnessByAreaZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING:
				return getLinearStiffnessByAreaZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				setLinearStiffnessByAreaX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING:
				setLinearStiffnessByAreaXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				setLinearStiffnessByAreaY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING:
				setLinearStiffnessByAreaYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				setLinearStiffnessByAreaZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING:
				setLinearStiffnessByAreaZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				unsetLinearStiffnessByAreaX();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING:
				unsetLinearStiffnessByAreaXAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				unsetLinearStiffnessByAreaY();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING:
				unsetLinearStiffnessByAreaYAsString();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				unsetLinearStiffnessByAreaZ();
				return;
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING:
				unsetLinearStiffnessByAreaZAsString();
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
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				return isSetLinearStiffnessByAreaX();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_XAS_STRING:
				return isSetLinearStiffnessByAreaXAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				return isSetLinearStiffnessByAreaY();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_YAS_STRING:
				return isSetLinearStiffnessByAreaYAsString();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				return isSetLinearStiffnessByAreaZ();
			case Ifc2x3tc1Package.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_ZAS_STRING:
				return isSetLinearStiffnessByAreaZAsString();
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
		result.append(" (LinearStiffnessByAreaX: ");
		if (linearStiffnessByAreaXESet) result.append(linearStiffnessByAreaX); else result.append("<unset>");
		result.append(", LinearStiffnessByAreaXAsString: ");
		if (linearStiffnessByAreaXAsStringESet) result.append(linearStiffnessByAreaXAsString); else result.append("<unset>");
		result.append(", LinearStiffnessByAreaY: ");
		if (linearStiffnessByAreaYESet) result.append(linearStiffnessByAreaY); else result.append("<unset>");
		result.append(", LinearStiffnessByAreaYAsString: ");
		if (linearStiffnessByAreaYAsStringESet) result.append(linearStiffnessByAreaYAsString); else result.append("<unset>");
		result.append(", LinearStiffnessByAreaZ: ");
		if (linearStiffnessByAreaZESet) result.append(linearStiffnessByAreaZ); else result.append("<unset>");
		result.append(", LinearStiffnessByAreaZAsString: ");
		if (linearStiffnessByAreaZAsStringESet) result.append(linearStiffnessByAreaZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryFaceConditionImpl
