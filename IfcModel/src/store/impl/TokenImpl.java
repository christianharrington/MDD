/**
 */
package store.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import store.StorePackage;
import store.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link store.impl.TokenImpl#getTokenString <em>Token String</em>}</li>
 *   <li>{@link store.impl.TokenImpl#getExpires <em>Expires</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TokenImpl extends EObjectImpl implements Token {
	/**
	 * The default value of the '{@link #getTokenString() <em>Token String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenString()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenString() <em>Token String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenString()
	 * @generated
	 * @ordered
	 */
	protected String tokenString = TOKEN_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final long EXPIRES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected long expires = EXPIRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTokenString() {
		return tokenString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenString(String newTokenString) {
		String oldTokenString = tokenString;
		tokenString = newTokenString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.TOKEN__TOKEN_STRING, oldTokenString, tokenString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpires(long newExpires) {
		long oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.TOKEN__EXPIRES, oldExpires, expires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StorePackage.TOKEN__TOKEN_STRING:
				return getTokenString();
			case StorePackage.TOKEN__EXPIRES:
				return getExpires();
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
			case StorePackage.TOKEN__TOKEN_STRING:
				setTokenString((String)newValue);
				return;
			case StorePackage.TOKEN__EXPIRES:
				setExpires((Long)newValue);
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
			case StorePackage.TOKEN__TOKEN_STRING:
				setTokenString(TOKEN_STRING_EDEFAULT);
				return;
			case StorePackage.TOKEN__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
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
			case StorePackage.TOKEN__TOKEN_STRING:
				return TOKEN_STRING_EDEFAULT == null ? tokenString != null : !TOKEN_STRING_EDEFAULT.equals(tokenString);
			case StorePackage.TOKEN__EXPIRES:
				return expires != EXPIRES_EDEFAULT;
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
		result.append(" (tokenString: ");
		result.append(tokenString);
		result.append(", expires: ");
		result.append(expires);
		result.append(')');
		return result.toString();
	}

} //TokenImpl
