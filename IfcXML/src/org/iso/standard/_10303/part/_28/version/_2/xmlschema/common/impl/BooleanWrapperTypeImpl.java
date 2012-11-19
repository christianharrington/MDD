/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.BooleanWrapperType;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Wrapper Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl#isValue <em>Value</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.BooleanWrapperTypeImpl#getPos <em>Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanWrapperTypeImpl extends EObjectImpl implements BooleanWrapperType {
	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected List<String> path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected static final List<BigInteger> POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPos()
	 * @generated
	 * @ordered
	 */
	protected List<BigInteger> pos = POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanWrapperTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.BOOLEAN_WRAPPER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.BOOLEAN_WRAPPER_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.BOOLEAN_WRAPPER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(List<String> newPath) {
		List<String> oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.BOOLEAN_WRAPPER_TYPE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> getPos() {
		return pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPos(List<BigInteger> newPos) {
		List<BigInteger> oldPos = pos;
		pos = newPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.BOOLEAN_WRAPPER_TYPE__POS, oldPos, pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__VALUE:
				return isValue();
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__ID:
				return getId();
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__PATH:
				return getPath();
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__POS:
				return getPos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__VALUE:
				setValue((Boolean)newValue);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__ID:
				setId((String)newValue);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__PATH:
				setPath((List<String>)newValue);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__POS:
				setPos((List<BigInteger>)newValue);
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
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__POS:
				setPos(POS_EDEFAULT);
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
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__VALUE:
				return value != VALUE_EDEFAULT;
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case CommonPackage.BOOLEAN_WRAPPER_TYPE__POS:
				return POS_EDEFAULT == null ? pos != null : !POS_EDEFAULT.equals(pos);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", id: ");
		result.append(id);
		result.append(", path: ");
		result.append(path);
		result.append(", pos: ");
		result.append(pos);
		result.append(')');
		return result.toString();
	}

} //BooleanWrapperTypeImpl