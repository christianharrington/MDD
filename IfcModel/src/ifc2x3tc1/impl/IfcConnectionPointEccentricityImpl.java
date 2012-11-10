/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcConnectionPointEccentricity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInXAsString <em>Eccentricity In XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInYAsString <em>Eccentricity In YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZAsString <em>Eccentricity In ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPointEccentricityImpl extends IfcConnectionPointGeometryImpl implements IfcConnectionPointEccentricity {
	/**
	 * The default value of the '{@link #getEccentricityInX() <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInX()
	 * @generated
	 * @ordered
	 */
	protected static final double ECCENTRICITY_IN_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEccentricityInX() <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInX()
	 * @generated
	 * @ordered
	 */
	protected double eccentricityInX = ECCENTRICITY_IN_X_EDEFAULT;

	/**
	 * This is true if the Eccentricity In X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInXESet;

	/**
	 * The default value of the '{@link #getEccentricityInXAsString() <em>Eccentricity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ECCENTRICITY_IN_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInXAsString() <em>Eccentricity In XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInXAsString()
	 * @generated
	 * @ordered
	 */
	protected String eccentricityInXAsString = ECCENTRICITY_IN_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Eccentricity In XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInXAsStringESet;

	/**
	 * The default value of the '{@link #getEccentricityInY() <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInY()
	 * @generated
	 * @ordered
	 */
	protected static final double ECCENTRICITY_IN_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEccentricityInY() <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInY()
	 * @generated
	 * @ordered
	 */
	protected double eccentricityInY = ECCENTRICITY_IN_Y_EDEFAULT;

	/**
	 * This is true if the Eccentricity In Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInYESet;

	/**
	 * The default value of the '{@link #getEccentricityInYAsString() <em>Eccentricity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ECCENTRICITY_IN_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInYAsString() <em>Eccentricity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInYAsString()
	 * @generated
	 * @ordered
	 */
	protected String eccentricityInYAsString = ECCENTRICITY_IN_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Eccentricity In YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInYAsStringESet;

	/**
	 * The default value of the '{@link #getEccentricityInZ() <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZ()
	 * @generated
	 * @ordered
	 */
	protected static final double ECCENTRICITY_IN_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getEccentricityInZ() <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZ()
	 * @generated
	 * @ordered
	 */
	protected double eccentricityInZ = ECCENTRICITY_IN_Z_EDEFAULT;

	/**
	 * This is true if the Eccentricity In Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInZESet;

	/**
	 * The default value of the '{@link #getEccentricityInZAsString() <em>Eccentricity In ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ECCENTRICITY_IN_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInZAsString() <em>Eccentricity In ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZAsString()
	 * @generated
	 * @ordered
	 */
	protected String eccentricityInZAsString = ECCENTRICITY_IN_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Eccentricity In ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eccentricityInZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointEccentricityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcConnectionPointEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEccentricityInX() {
		return eccentricityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInX(double newEccentricityInX) {
		double oldEccentricityInX = eccentricityInX;
		eccentricityInX = newEccentricityInX;
		boolean oldEccentricityInXESet = eccentricityInXESet;
		eccentricityInXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X, oldEccentricityInX, eccentricityInX, !oldEccentricityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInX() {
		double oldEccentricityInX = eccentricityInX;
		boolean oldEccentricityInXESet = eccentricityInXESet;
		eccentricityInX = ECCENTRICITY_IN_X_EDEFAULT;
		eccentricityInXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X, oldEccentricityInX, ECCENTRICITY_IN_X_EDEFAULT, oldEccentricityInXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInX() {
		return eccentricityInXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInXAsString() {
		return eccentricityInXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInXAsString(String newEccentricityInXAsString) {
		String oldEccentricityInXAsString = eccentricityInXAsString;
		eccentricityInXAsString = newEccentricityInXAsString;
		boolean oldEccentricityInXAsStringESet = eccentricityInXAsStringESet;
		eccentricityInXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING, oldEccentricityInXAsString, eccentricityInXAsString, !oldEccentricityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInXAsString() {
		String oldEccentricityInXAsString = eccentricityInXAsString;
		boolean oldEccentricityInXAsStringESet = eccentricityInXAsStringESet;
		eccentricityInXAsString = ECCENTRICITY_IN_XAS_STRING_EDEFAULT;
		eccentricityInXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING, oldEccentricityInXAsString, ECCENTRICITY_IN_XAS_STRING_EDEFAULT, oldEccentricityInXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInXAsString() {
		return eccentricityInXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEccentricityInY() {
		return eccentricityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInY(double newEccentricityInY) {
		double oldEccentricityInY = eccentricityInY;
		eccentricityInY = newEccentricityInY;
		boolean oldEccentricityInYESet = eccentricityInYESet;
		eccentricityInYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y, oldEccentricityInY, eccentricityInY, !oldEccentricityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInY() {
		double oldEccentricityInY = eccentricityInY;
		boolean oldEccentricityInYESet = eccentricityInYESet;
		eccentricityInY = ECCENTRICITY_IN_Y_EDEFAULT;
		eccentricityInYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y, oldEccentricityInY, ECCENTRICITY_IN_Y_EDEFAULT, oldEccentricityInYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInY() {
		return eccentricityInYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInYAsString() {
		return eccentricityInYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInYAsString(String newEccentricityInYAsString) {
		String oldEccentricityInYAsString = eccentricityInYAsString;
		eccentricityInYAsString = newEccentricityInYAsString;
		boolean oldEccentricityInYAsStringESet = eccentricityInYAsStringESet;
		eccentricityInYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING, oldEccentricityInYAsString, eccentricityInYAsString, !oldEccentricityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInYAsString() {
		String oldEccentricityInYAsString = eccentricityInYAsString;
		boolean oldEccentricityInYAsStringESet = eccentricityInYAsStringESet;
		eccentricityInYAsString = ECCENTRICITY_IN_YAS_STRING_EDEFAULT;
		eccentricityInYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING, oldEccentricityInYAsString, ECCENTRICITY_IN_YAS_STRING_EDEFAULT, oldEccentricityInYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInYAsString() {
		return eccentricityInYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getEccentricityInZ() {
		return eccentricityInZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZ(double newEccentricityInZ) {
		double oldEccentricityInZ = eccentricityInZ;
		eccentricityInZ = newEccentricityInZ;
		boolean oldEccentricityInZESet = eccentricityInZESet;
		eccentricityInZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z, oldEccentricityInZ, eccentricityInZ, !oldEccentricityInZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInZ() {
		double oldEccentricityInZ = eccentricityInZ;
		boolean oldEccentricityInZESet = eccentricityInZESet;
		eccentricityInZ = ECCENTRICITY_IN_Z_EDEFAULT;
		eccentricityInZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z, oldEccentricityInZ, ECCENTRICITY_IN_Z_EDEFAULT, oldEccentricityInZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInZ() {
		return eccentricityInZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEccentricityInZAsString() {
		return eccentricityInZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZAsString(String newEccentricityInZAsString) {
		String oldEccentricityInZAsString = eccentricityInZAsString;
		eccentricityInZAsString = newEccentricityInZAsString;
		boolean oldEccentricityInZAsStringESet = eccentricityInZAsStringESet;
		eccentricityInZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING, oldEccentricityInZAsString, eccentricityInZAsString, !oldEccentricityInZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEccentricityInZAsString() {
		String oldEccentricityInZAsString = eccentricityInZAsString;
		boolean oldEccentricityInZAsStringESet = eccentricityInZAsStringESet;
		eccentricityInZAsString = ECCENTRICITY_IN_ZAS_STRING_EDEFAULT;
		eccentricityInZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING, oldEccentricityInZAsString, ECCENTRICITY_IN_ZAS_STRING_EDEFAULT, oldEccentricityInZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEccentricityInZAsString() {
		return eccentricityInZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				return getEccentricityInX();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING:
				return getEccentricityInXAsString();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				return getEccentricityInY();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING:
				return getEccentricityInYAsString();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				return getEccentricityInZ();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING:
				return getEccentricityInZAsString();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				setEccentricityInX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING:
				setEccentricityInXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				setEccentricityInY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING:
				setEccentricityInYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				setEccentricityInZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING:
				setEccentricityInZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				unsetEccentricityInX();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING:
				unsetEccentricityInXAsString();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				unsetEccentricityInY();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING:
				unsetEccentricityInYAsString();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				unsetEccentricityInZ();
				return;
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING:
				unsetEccentricityInZAsString();
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
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				return isSetEccentricityInX();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_XAS_STRING:
				return isSetEccentricityInXAsString();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				return isSetEccentricityInY();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_YAS_STRING:
				return isSetEccentricityInYAsString();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				return isSetEccentricityInZ();
			case Ifc2x3tc1Package.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_ZAS_STRING:
				return isSetEccentricityInZAsString();
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
		result.append(" (EccentricityInX: ");
		if (eccentricityInXESet) result.append(eccentricityInX); else result.append("<unset>");
		result.append(", EccentricityInXAsString: ");
		if (eccentricityInXAsStringESet) result.append(eccentricityInXAsString); else result.append("<unset>");
		result.append(", EccentricityInY: ");
		if (eccentricityInYESet) result.append(eccentricityInY); else result.append("<unset>");
		result.append(", EccentricityInYAsString: ");
		if (eccentricityInYAsStringESet) result.append(eccentricityInYAsString); else result.append("<unset>");
		result.append(", EccentricityInZ: ");
		if (eccentricityInZESet) result.append(eccentricityInZ); else result.append("<unset>");
		result.append(", EccentricityInZAsString: ");
		if (eccentricityInZAsStringESet) result.append(eccentricityInZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcConnectionPointEccentricityImpl
