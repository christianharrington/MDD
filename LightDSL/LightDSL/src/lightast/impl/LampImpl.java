/**
 */
package lightast.impl;

import lightast.Lamp;
import lightast.LampType;
import lightast.LightastPackage;

import lightast.Material;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
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
 *   <li>{@link lightast.impl.LampImpl#getConsistsOf <em>Consists Of</em>}</li>
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
	protected static final LampType PREDEFINED_TYPE_EDEFAULT = LampType.COMPACTFLUORESCENT;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected LampType predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsistsOf() <em>Consists Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistsOf()
	 * @generated
	 * @ordered
	 */
	protected Material consistsOf;

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
	public LampType getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(LampType newPredefinedType) {
		LampType oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LAMP__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material getConsistsOf() {
		if (consistsOf != null && consistsOf.eIsProxy()) {
			InternalEObject oldConsistsOf = (InternalEObject)consistsOf;
			consistsOf = (Material)eResolveProxy(oldConsistsOf);
			if (consistsOf != oldConsistsOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LightastPackage.LAMP__CONSISTS_OF, oldConsistsOf, consistsOf));
			}
		}
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Material basicGetConsistsOf() {
		return consistsOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistsOf(Material newConsistsOf) {
		Material oldConsistsOf = consistsOf;
		consistsOf = newConsistsOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LightastPackage.LAMP__CONSISTS_OF, oldConsistsOf, consistsOf));
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
			case LightastPackage.LAMP__CONSISTS_OF:
				if (resolve) return getConsistsOf();
				return basicGetConsistsOf();
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
				setPredefinedType((LampType)newValue);
				return;
			case LightastPackage.LAMP__CONSISTS_OF:
				setConsistsOf((Material)newValue);
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
			case LightastPackage.LAMP__CONSISTS_OF:
				setConsistsOf((Material)null);
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
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
			case LightastPackage.LAMP__CONSISTS_OF:
				return consistsOf != null;
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
