/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328HeaderType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Uos;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iso1030328 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl#getIso1030328Header <em>Iso1030328 Header</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl#getUosGroup <em>Uos Group</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl#getUos <em>Uos</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.Iso1030328TypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Iso1030328TypeImpl extends EObjectImpl implements Iso1030328Type {
	/**
	 * The cached value of the '{@link #getIso1030328Header() <em>Iso1030328 Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIso1030328Header()
	 * @generated
	 * @ordered
	 */
	protected Iso1030328HeaderType iso1030328Header;

	/**
	 * The cached value of the '{@link #getUosGroup() <em>Uos Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUosGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap uosGroup;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Iso1030328TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.ISO1030328_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iso1030328HeaderType getIso1030328Header() {
		return iso1030328Header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIso1030328Header(Iso1030328HeaderType newIso1030328Header, NotificationChain msgs) {
		Iso1030328HeaderType oldIso1030328Header = iso1030328Header;
		iso1030328Header = newIso1030328Header;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER, oldIso1030328Header, newIso1030328Header);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIso1030328Header(Iso1030328HeaderType newIso1030328Header) {
		if (newIso1030328Header != iso1030328Header) {
			NotificationChain msgs = null;
			if (iso1030328Header != null)
				msgs = ((InternalEObject)iso1030328Header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER, null, msgs);
			if (newIso1030328Header != null)
				msgs = ((InternalEObject)newIso1030328Header).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER, null, msgs);
			msgs = basicSetIso1030328Header(newIso1030328Header, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER, newIso1030328Header, newIso1030328Header));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getUosGroup() {
		if (uosGroup == null) {
			uosGroup = new BasicFeatureMap(this, CommonPackage.ISO1030328_TYPE__UOS_GROUP);
		}
		return uosGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uos getUos() {
		return (Uos)getUosGroup().get(CommonPackage.Literals.ISO1030328_TYPE__UOS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUos(Uos newUos, NotificationChain msgs) {
		return ((FeatureMap.Internal)getUosGroup()).basicAdd(CommonPackage.Literals.ISO1030328_TYPE__UOS, newUos, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.ISO1030328_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER:
				return basicSetIso1030328Header(null, msgs);
			case CommonPackage.ISO1030328_TYPE__UOS_GROUP:
				return ((InternalEList<?>)getUosGroup()).basicRemove(otherEnd, msgs);
			case CommonPackage.ISO1030328_TYPE__UOS:
				return basicSetUos(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER:
				return getIso1030328Header();
			case CommonPackage.ISO1030328_TYPE__UOS_GROUP:
				if (coreType) return getUosGroup();
				return ((FeatureMap.Internal)getUosGroup()).getWrapper();
			case CommonPackage.ISO1030328_TYPE__UOS:
				return getUos();
			case CommonPackage.ISO1030328_TYPE__VERSION:
				return getVersion();
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
			case CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER:
				setIso1030328Header((Iso1030328HeaderType)newValue);
				return;
			case CommonPackage.ISO1030328_TYPE__UOS_GROUP:
				((FeatureMap.Internal)getUosGroup()).set(newValue);
				return;
			case CommonPackage.ISO1030328_TYPE__VERSION:
				setVersion((String)newValue);
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
			case CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER:
				setIso1030328Header((Iso1030328HeaderType)null);
				return;
			case CommonPackage.ISO1030328_TYPE__UOS_GROUP:
				getUosGroup().clear();
				return;
			case CommonPackage.ISO1030328_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case CommonPackage.ISO1030328_TYPE__ISO1030328_HEADER:
				return iso1030328Header != null;
			case CommonPackage.ISO1030328_TYPE__UOS_GROUP:
				return uosGroup != null && !uosGroup.isEmpty();
			case CommonPackage.ISO1030328_TYPE__UOS:
				return getUos() != null;
			case CommonPackage.ISO1030328_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (uosGroup: ");
		result.append(uosGroup);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //Iso1030328TypeImpl
