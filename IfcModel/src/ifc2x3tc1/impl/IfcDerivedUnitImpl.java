/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDerivedUnit;
import ifc2x3tc1.IfcDerivedUnitElement;
import ifc2x3tc1.IfcDerivedUnitEnum;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Derived Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedUnitImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedUnitImpl#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcDerivedUnitImpl#getUserDefinedType <em>User Defined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDerivedUnitImpl extends EObjectImpl implements IfcDerivedUnit {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcDerivedUnitElement> elements;

	/**
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcDerivedUnitEnum UNIT_TYPE_EDEFAULT = IfcDerivedUnitEnum.NULL;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected IfcDerivedUnitEnum unitType = UNIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedType() <em>User Defined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedType() <em>User Defined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedType()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedType = USER_DEFINED_TYPE_EDEFAULT;

	/**
	 * This is true if the User Defined Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDerivedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDerivedUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcDerivedUnitElement> getElements() {
		if (elements == null) {
			elements = new EObjectResolvingEList<IfcDerivedUnitElement>(IfcDerivedUnitElement.class, this, Ifc2x3tc1Package.IFC_DERIVED_UNIT__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedUnitEnum getUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(IfcDerivedUnitEnum newUnitType) {
		IfcDerivedUnitEnum oldUnitType = unitType;
		unitType = newUnitType == null ? UNIT_TYPE_EDEFAULT : newUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DERIVED_UNIT__UNIT_TYPE, oldUnitType, unitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedType() {
		return userDefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedType(String newUserDefinedType) {
		String oldUserDefinedType = userDefinedType;
		userDefinedType = newUserDefinedType;
		boolean oldUserDefinedTypeESet = userDefinedTypeESet;
		userDefinedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE, oldUserDefinedType, userDefinedType, !oldUserDefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedType() {
		String oldUserDefinedType = userDefinedType;
		boolean oldUserDefinedTypeESet = userDefinedTypeESet;
		userDefinedType = USER_DEFINED_TYPE_EDEFAULT;
		userDefinedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE, oldUserDefinedType, USER_DEFINED_TYPE_EDEFAULT, oldUserDefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedType() {
		return userDefinedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__ELEMENTS:
				return getElements();
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__UNIT_TYPE:
				return getUnitType();
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE:
				return getUserDefinedType();
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
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends IfcDerivedUnitElement>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__UNIT_TYPE:
				setUnitType((IfcDerivedUnitEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE:
				setUserDefinedType((String)newValue);
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
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__ELEMENTS:
				getElements().clear();
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE:
				unsetUserDefinedType();
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
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__UNIT_TYPE:
				return unitType != UNIT_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_DERIVED_UNIT__USER_DEFINED_TYPE:
				return isSetUserDefinedType();
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
		result.append(" (UnitType: ");
		result.append(unitType);
		result.append(", UserDefinedType: ");
		if (userDefinedTypeESet) result.append(userDefinedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDerivedUnitImpl
