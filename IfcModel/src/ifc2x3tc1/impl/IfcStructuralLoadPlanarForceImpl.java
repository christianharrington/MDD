/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcStructuralLoadPlanarForce;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceXAsString <em>Planar Force XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceYAsString <em>Planar Force YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceZ <em>Planar Force Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceZAsString <em>Planar Force ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadPlanarForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadPlanarForce {
	/**
	 * The default value of the '{@link #getPlanarForceX() <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceX()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANAR_FORCE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlanarForceX() <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceX()
	 * @generated
	 * @ordered
	 */
	protected double planarForceX = PLANAR_FORCE_X_EDEFAULT;

	/**
	 * This is true if the Planar Force X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceXESet;

	/**
	 * The default value of the '{@link #getPlanarForceXAsString() <em>Planar Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANAR_FORCE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceXAsString() <em>Planar Force XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceXAsString()
	 * @generated
	 * @ordered
	 */
	protected String planarForceXAsString = PLANAR_FORCE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Planar Force XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceXAsStringESet;

	/**
	 * The default value of the '{@link #getPlanarForceY() <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceY()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANAR_FORCE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlanarForceY() <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceY()
	 * @generated
	 * @ordered
	 */
	protected double planarForceY = PLANAR_FORCE_Y_EDEFAULT;

	/**
	 * This is true if the Planar Force Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceYESet;

	/**
	 * The default value of the '{@link #getPlanarForceYAsString() <em>Planar Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANAR_FORCE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceYAsString() <em>Planar Force YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceYAsString()
	 * @generated
	 * @ordered
	 */
	protected String planarForceYAsString = PLANAR_FORCE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Planar Force YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceYAsStringESet;

	/**
	 * The default value of the '{@link #getPlanarForceZ() <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final double PLANAR_FORCE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlanarForceZ() <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZ()
	 * @generated
	 * @ordered
	 */
	protected double planarForceZ = PLANAR_FORCE_Z_EDEFAULT;

	/**
	 * This is true if the Planar Force Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceZESet;

	/**
	 * The default value of the '{@link #getPlanarForceZAsString() <em>Planar Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String PLANAR_FORCE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceZAsString() <em>Planar Force ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZAsString()
	 * @generated
	 * @ordered
	 */
	protected String planarForceZAsString = PLANAR_FORCE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Planar Force ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean planarForceZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadPlanarForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcStructuralLoadPlanarForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlanarForceX() {
		return planarForceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceX(double newPlanarForceX) {
		double oldPlanarForceX = planarForceX;
		planarForceX = newPlanarForceX;
		boolean oldPlanarForceXESet = planarForceXESet;
		planarForceXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X, oldPlanarForceX, planarForceX, !oldPlanarForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceX() {
		double oldPlanarForceX = planarForceX;
		boolean oldPlanarForceXESet = planarForceXESet;
		planarForceX = PLANAR_FORCE_X_EDEFAULT;
		planarForceXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X, oldPlanarForceX, PLANAR_FORCE_X_EDEFAULT, oldPlanarForceXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceX() {
		return planarForceXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanarForceXAsString() {
		return planarForceXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceXAsString(String newPlanarForceXAsString) {
		String oldPlanarForceXAsString = planarForceXAsString;
		planarForceXAsString = newPlanarForceXAsString;
		boolean oldPlanarForceXAsStringESet = planarForceXAsStringESet;
		planarForceXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING, oldPlanarForceXAsString, planarForceXAsString, !oldPlanarForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceXAsString() {
		String oldPlanarForceXAsString = planarForceXAsString;
		boolean oldPlanarForceXAsStringESet = planarForceXAsStringESet;
		planarForceXAsString = PLANAR_FORCE_XAS_STRING_EDEFAULT;
		planarForceXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING, oldPlanarForceXAsString, PLANAR_FORCE_XAS_STRING_EDEFAULT, oldPlanarForceXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceXAsString() {
		return planarForceXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlanarForceY() {
		return planarForceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceY(double newPlanarForceY) {
		double oldPlanarForceY = planarForceY;
		planarForceY = newPlanarForceY;
		boolean oldPlanarForceYESet = planarForceYESet;
		planarForceYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y, oldPlanarForceY, planarForceY, !oldPlanarForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceY() {
		double oldPlanarForceY = planarForceY;
		boolean oldPlanarForceYESet = planarForceYESet;
		planarForceY = PLANAR_FORCE_Y_EDEFAULT;
		planarForceYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y, oldPlanarForceY, PLANAR_FORCE_Y_EDEFAULT, oldPlanarForceYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceY() {
		return planarForceYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanarForceYAsString() {
		return planarForceYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceYAsString(String newPlanarForceYAsString) {
		String oldPlanarForceYAsString = planarForceYAsString;
		planarForceYAsString = newPlanarForceYAsString;
		boolean oldPlanarForceYAsStringESet = planarForceYAsStringESet;
		planarForceYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING, oldPlanarForceYAsString, planarForceYAsString, !oldPlanarForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceYAsString() {
		String oldPlanarForceYAsString = planarForceYAsString;
		boolean oldPlanarForceYAsStringESet = planarForceYAsStringESet;
		planarForceYAsString = PLANAR_FORCE_YAS_STRING_EDEFAULT;
		planarForceYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING, oldPlanarForceYAsString, PLANAR_FORCE_YAS_STRING_EDEFAULT, oldPlanarForceYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceYAsString() {
		return planarForceYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlanarForceZ() {
		return planarForceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceZ(double newPlanarForceZ) {
		double oldPlanarForceZ = planarForceZ;
		planarForceZ = newPlanarForceZ;
		boolean oldPlanarForceZESet = planarForceZESet;
		planarForceZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z, oldPlanarForceZ, planarForceZ, !oldPlanarForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceZ() {
		double oldPlanarForceZ = planarForceZ;
		boolean oldPlanarForceZESet = planarForceZESet;
		planarForceZ = PLANAR_FORCE_Z_EDEFAULT;
		planarForceZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z, oldPlanarForceZ, PLANAR_FORCE_Z_EDEFAULT, oldPlanarForceZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceZ() {
		return planarForceZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanarForceZAsString() {
		return planarForceZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceZAsString(String newPlanarForceZAsString) {
		String oldPlanarForceZAsString = planarForceZAsString;
		planarForceZAsString = newPlanarForceZAsString;
		boolean oldPlanarForceZAsStringESet = planarForceZAsStringESet;
		planarForceZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING, oldPlanarForceZAsString, planarForceZAsString, !oldPlanarForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPlanarForceZAsString() {
		String oldPlanarForceZAsString = planarForceZAsString;
		boolean oldPlanarForceZAsStringESet = planarForceZAsStringESet;
		planarForceZAsString = PLANAR_FORCE_ZAS_STRING_EDEFAULT;
		planarForceZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING, oldPlanarForceZAsString, PLANAR_FORCE_ZAS_STRING_EDEFAULT, oldPlanarForceZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPlanarForceZAsString() {
		return planarForceZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				return getPlanarForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING:
				return getPlanarForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				return getPlanarForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING:
				return getPlanarForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				return getPlanarForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING:
				return getPlanarForceZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				setPlanarForceX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING:
				setPlanarForceXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				setPlanarForceY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING:
				setPlanarForceYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				setPlanarForceZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING:
				setPlanarForceZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				unsetPlanarForceX();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING:
				unsetPlanarForceXAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				unsetPlanarForceY();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING:
				unsetPlanarForceYAsString();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				unsetPlanarForceZ();
				return;
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING:
				unsetPlanarForceZAsString();
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
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				return isSetPlanarForceX();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_XAS_STRING:
				return isSetPlanarForceXAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				return isSetPlanarForceY();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_YAS_STRING:
				return isSetPlanarForceYAsString();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				return isSetPlanarForceZ();
			case Ifc2x3tc1Package.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_ZAS_STRING:
				return isSetPlanarForceZAsString();
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
		result.append(" (PlanarForceX: ");
		if (planarForceXESet) result.append(planarForceX); else result.append("<unset>");
		result.append(", PlanarForceXAsString: ");
		if (planarForceXAsStringESet) result.append(planarForceXAsString); else result.append("<unset>");
		result.append(", PlanarForceY: ");
		if (planarForceYESet) result.append(planarForceY); else result.append("<unset>");
		result.append(", PlanarForceYAsString: ");
		if (planarForceYAsStringESet) result.append(planarForceYAsString); else result.append("<unset>");
		result.append(", PlanarForceZ: ");
		if (planarForceZESet) result.append(planarForceZ); else result.append("<unset>");
		result.append(", PlanarForceZAsString: ");
		if (planarForceZAsStringESet) result.append(planarForceZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadPlanarForceImpl
