/**
 */
package lightast.impl;

import lightast.Lamp;
import lightast.LightastPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lamp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lightast.impl.LampImpl#getGlobalID <em>Global ID</em>}</li>
 *   <li>{@link lightast.impl.LampImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LampImpl extends EObjectImpl implements Lamp {
	/**
	 * The default value of the '{@link #getGlobalID() <em>Global ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalID()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalID() <em>Global ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalID()
	 * @generated
	 * @ordered
	 */
	protected String globalID = GLOBAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final String PREDEFINED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected String predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LampImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LightastPackage.Literals.LAMP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalID() {
		return globalID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalID(String newGlobalID) {
		String oldGlobalID = globalID;
		globalID = newGlobalID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LAMP__GLOBAL_ID, oldGlobalID, globalID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(String newPredefinedType) {
		String oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LAMP__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LightastPackage.LAMP__GLOBAL_ID:
				return getGlobalID();
			case LightastPackage.LAMP__PREDEFINED_TYPE:
				return getPredefinedType();
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
			case LightastPackage.LAMP__GLOBAL_ID:
				setGlobalID((String)newValue);
				return;
			case LightastPackage.LAMP__PREDEFINED_TYPE:
				setPredefinedType((String)newValue);
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
			case LightastPackage.LAMP__GLOBAL_ID:
				setGlobalID(GLOBAL_ID_EDEFAULT);
				return;
			case LightastPackage.LAMP__PREDEFINED_TYPE:
				setPredefinedType(PREDEFINED_TYPE_EDEFAULT);
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
			case LightastPackage.LAMP__GLOBAL_ID:
				return GLOBAL_ID_EDEFAULT == null ? globalID != null : !GLOBAL_ID_EDEFAULT.equals(globalID);
			case LightastPackage.LAMP__PREDEFINED_TYPE:
				return PREDEFINED_TYPE_EDEFAULT == null ? predefinedType != null : !PREDEFINED_TYPE_EDEFAULT.equals(predefinedType);
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
		result.append(" (GlobalID: ");
		result.append(globalID);
		result.append(", PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //LampImpl
