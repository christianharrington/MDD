/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcObjectTypeEnum;
import ifc2x3tc1.IfcProxy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcProxyImpl#getProxyType <em>Proxy Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcProxyImpl#getTag <em>Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcProxyImpl extends IfcProductImpl implements IfcProxy {
	/**
	 * The default value of the '{@link #getProxyType() <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcObjectTypeEnum PROXY_TYPE_EDEFAULT = IfcObjectTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getProxyType() <em>Proxy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyType()
	 * @generated
	 * @ordered
	 */
	protected IfcObjectTypeEnum proxyType = PROXY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * This is true if the Tag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tagESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcProxyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcProxy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcObjectTypeEnum getProxyType() {
		return proxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProxyType(IfcObjectTypeEnum newProxyType) {
		IfcObjectTypeEnum oldProxyType = proxyType;
		proxyType = newProxyType == null ? PROXY_TYPE_EDEFAULT : newProxyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROXY__PROXY_TYPE, oldProxyType, proxyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		boolean oldTagESet = tagESet;
		tagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_PROXY__TAG, oldTag, tag, !oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTag() {
		String oldTag = tag;
		boolean oldTagESet = tagESet;
		tag = TAG_EDEFAULT;
		tagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_PROXY__TAG, oldTag, TAG_EDEFAULT, oldTagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTag() {
		return tagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_PROXY__PROXY_TYPE:
				return getProxyType();
			case Ifc2x3tc1Package.IFC_PROXY__TAG:
				return getTag();
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
			case Ifc2x3tc1Package.IFC_PROXY__PROXY_TYPE:
				setProxyType((IfcObjectTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_PROXY__TAG:
				setTag((String)newValue);
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
			case Ifc2x3tc1Package.IFC_PROXY__PROXY_TYPE:
				setProxyType(PROXY_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_PROXY__TAG:
				unsetTag();
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
			case Ifc2x3tc1Package.IFC_PROXY__PROXY_TYPE:
				return proxyType != PROXY_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_PROXY__TAG:
				return isSetTag();
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
		result.append(" (ProxyType: ");
		result.append(proxyType);
		result.append(", Tag: ");
		if (tagESet) result.append(tag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcProxyImpl
