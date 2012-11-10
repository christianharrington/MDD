/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSlippageConnectionCondition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageXAsString <em>Slippage XAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageYAsString <em>Slippage YAs String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageZ <em>Slippage Z</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcSlippageConnectionConditionImpl#getSlippageZAsString <em>Slippage ZAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSlippageConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcSlippageConnectionCondition {
	/**
	 * The default value of the '{@link #getSlippageX() <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageX()
	 * @generated
	 * @ordered
	 */
	protected static final double SLIPPAGE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlippageX() <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageX()
	 * @generated
	 * @ordered
	 */
	protected double slippageX = SLIPPAGE_X_EDEFAULT;

	/**
	 * This is true if the Slippage X attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageXESet;

	/**
	 * The default value of the '{@link #getSlippageXAsString() <em>Slippage XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageXAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIPPAGE_XAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageXAsString() <em>Slippage XAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageXAsString()
	 * @generated
	 * @ordered
	 */
	protected String slippageXAsString = SLIPPAGE_XAS_STRING_EDEFAULT;

	/**
	 * This is true if the Slippage XAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageXAsStringESet;

	/**
	 * The default value of the '{@link #getSlippageY() <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageY()
	 * @generated
	 * @ordered
	 */
	protected static final double SLIPPAGE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlippageY() <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageY()
	 * @generated
	 * @ordered
	 */
	protected double slippageY = SLIPPAGE_Y_EDEFAULT;

	/**
	 * This is true if the Slippage Y attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageYESet;

	/**
	 * The default value of the '{@link #getSlippageYAsString() <em>Slippage YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageYAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIPPAGE_YAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageYAsString() <em>Slippage YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageYAsString()
	 * @generated
	 * @ordered
	 */
	protected String slippageYAsString = SLIPPAGE_YAS_STRING_EDEFAULT;

	/**
	 * This is true if the Slippage YAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageYAsStringESet;

	/**
	 * The default value of the '{@link #getSlippageZ() <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZ()
	 * @generated
	 * @ordered
	 */
	protected static final double SLIPPAGE_Z_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSlippageZ() <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZ()
	 * @generated
	 * @ordered
	 */
	protected double slippageZ = SLIPPAGE_Z_EDEFAULT;

	/**
	 * This is true if the Slippage Z attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageZESet;

	/**
	 * The default value of the '{@link #getSlippageZAsString() <em>Slippage ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SLIPPAGE_ZAS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageZAsString() <em>Slippage ZAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZAsString()
	 * @generated
	 * @ordered
	 */
	protected String slippageZAsString = SLIPPAGE_ZAS_STRING_EDEFAULT;

	/**
	 * This is true if the Slippage ZAs String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean slippageZAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlippageConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSlippageConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageX() {
		return slippageX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageX(double newSlippageX) {
		double oldSlippageX = slippageX;
		slippageX = newSlippageX;
		boolean oldSlippageXESet = slippageXESet;
		slippageXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X, oldSlippageX, slippageX, !oldSlippageXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageX() {
		double oldSlippageX = slippageX;
		boolean oldSlippageXESet = slippageXESet;
		slippageX = SLIPPAGE_X_EDEFAULT;
		slippageXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X, oldSlippageX, SLIPPAGE_X_EDEFAULT, oldSlippageXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageX() {
		return slippageXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageXAsString() {
		return slippageXAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageXAsString(String newSlippageXAsString) {
		String oldSlippageXAsString = slippageXAsString;
		slippageXAsString = newSlippageXAsString;
		boolean oldSlippageXAsStringESet = slippageXAsStringESet;
		slippageXAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING, oldSlippageXAsString, slippageXAsString, !oldSlippageXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageXAsString() {
		String oldSlippageXAsString = slippageXAsString;
		boolean oldSlippageXAsStringESet = slippageXAsStringESet;
		slippageXAsString = SLIPPAGE_XAS_STRING_EDEFAULT;
		slippageXAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING, oldSlippageXAsString, SLIPPAGE_XAS_STRING_EDEFAULT, oldSlippageXAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageXAsString() {
		return slippageXAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageY() {
		return slippageY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageY(double newSlippageY) {
		double oldSlippageY = slippageY;
		slippageY = newSlippageY;
		boolean oldSlippageYESet = slippageYESet;
		slippageYESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y, oldSlippageY, slippageY, !oldSlippageYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageY() {
		double oldSlippageY = slippageY;
		boolean oldSlippageYESet = slippageYESet;
		slippageY = SLIPPAGE_Y_EDEFAULT;
		slippageYESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y, oldSlippageY, SLIPPAGE_Y_EDEFAULT, oldSlippageYESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageY() {
		return slippageYESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageYAsString() {
		return slippageYAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageYAsString(String newSlippageYAsString) {
		String oldSlippageYAsString = slippageYAsString;
		slippageYAsString = newSlippageYAsString;
		boolean oldSlippageYAsStringESet = slippageYAsStringESet;
		slippageYAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING, oldSlippageYAsString, slippageYAsString, !oldSlippageYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageYAsString() {
		String oldSlippageYAsString = slippageYAsString;
		boolean oldSlippageYAsStringESet = slippageYAsStringESet;
		slippageYAsString = SLIPPAGE_YAS_STRING_EDEFAULT;
		slippageYAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING, oldSlippageYAsString, SLIPPAGE_YAS_STRING_EDEFAULT, oldSlippageYAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageYAsString() {
		return slippageYAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSlippageZ() {
		return slippageZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZ(double newSlippageZ) {
		double oldSlippageZ = slippageZ;
		slippageZ = newSlippageZ;
		boolean oldSlippageZESet = slippageZESet;
		slippageZESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z, oldSlippageZ, slippageZ, !oldSlippageZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageZ() {
		double oldSlippageZ = slippageZ;
		boolean oldSlippageZESet = slippageZESet;
		slippageZ = SLIPPAGE_Z_EDEFAULT;
		slippageZESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z, oldSlippageZ, SLIPPAGE_Z_EDEFAULT, oldSlippageZESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageZ() {
		return slippageZESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSlippageZAsString() {
		return slippageZAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZAsString(String newSlippageZAsString) {
		String oldSlippageZAsString = slippageZAsString;
		slippageZAsString = newSlippageZAsString;
		boolean oldSlippageZAsStringESet = slippageZAsStringESet;
		slippageZAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING, oldSlippageZAsString, slippageZAsString, !oldSlippageZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSlippageZAsString() {
		String oldSlippageZAsString = slippageZAsString;
		boolean oldSlippageZAsStringESet = slippageZAsStringESet;
		slippageZAsString = SLIPPAGE_ZAS_STRING_EDEFAULT;
		slippageZAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING, oldSlippageZAsString, SLIPPAGE_ZAS_STRING_EDEFAULT, oldSlippageZAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSlippageZAsString() {
		return slippageZAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				return getSlippageX();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING:
				return getSlippageXAsString();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				return getSlippageY();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING:
				return getSlippageYAsString();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				return getSlippageZ();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING:
				return getSlippageZAsString();
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
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				setSlippageX((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING:
				setSlippageXAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				setSlippageY((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING:
				setSlippageYAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				setSlippageZ((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING:
				setSlippageZAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				unsetSlippageX();
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING:
				unsetSlippageXAsString();
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				unsetSlippageY();
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING:
				unsetSlippageYAsString();
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				unsetSlippageZ();
				return;
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING:
				unsetSlippageZAsString();
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
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				return isSetSlippageX();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_XAS_STRING:
				return isSetSlippageXAsString();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				return isSetSlippageY();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_YAS_STRING:
				return isSetSlippageYAsString();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				return isSetSlippageZ();
			case Ifc2x3tc1Package.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_ZAS_STRING:
				return isSetSlippageZAsString();
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
		result.append(" (SlippageX: ");
		if (slippageXESet) result.append(slippageX); else result.append("<unset>");
		result.append(", SlippageXAsString: ");
		if (slippageXAsStringESet) result.append(slippageXAsString); else result.append("<unset>");
		result.append(", SlippageY: ");
		if (slippageYESet) result.append(slippageY); else result.append("<unset>");
		result.append(", SlippageYAsString: ");
		if (slippageYAsStringESet) result.append(slippageYAsString); else result.append("<unset>");
		result.append(", SlippageZ: ");
		if (slippageZESet) result.append(slippageZ); else result.append("<unset>");
		result.append(", SlippageZAsString: ");
		if (slippageZAsStringESet) result.append(slippageZAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSlippageConnectionConditionImpl
