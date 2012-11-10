/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDimensionalExponents;
import ifc2x3tc1.IfcNamedUnit;
import ifc2x3tc1.IfcUnitEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Named Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcNamedUnitImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcNamedUnitImpl#getUnitType <em>Unit Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcNamedUnitImpl extends EObjectImpl implements IfcNamedUnit {
	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected IfcDimensionalExponents dimensions;

	/**
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcUnitEnum UNIT_TYPE_EDEFAULT = IfcUnitEnum.NULL;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected IfcUnitEnum unitType = UNIT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcNamedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcNamedUnit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionalExponents getDimensions() {
		if (dimensions != null && dimensions.eIsProxy()) {
			InternalEObject oldDimensions = (InternalEObject)dimensions;
			dimensions = (IfcDimensionalExponents)eResolveProxy(oldDimensions);
			if (dimensions != oldDimensions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS, oldDimensions, dimensions));
			}
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDimensionalExponents basicGetDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(IfcDimensionalExponents newDimensions) {
		IfcDimensionalExponents oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS, oldDimensions, dimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcUnitEnum getUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(IfcUnitEnum newUnitType) {
		IfcUnitEnum oldUnitType = unitType;
		unitType = newUnitType == null ? UNIT_TYPE_EDEFAULT : newUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_NAMED_UNIT__UNIT_TYPE, oldUnitType, unitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS:
				if (resolve) return getDimensions();
				return basicGetDimensions();
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__UNIT_TYPE:
				return getUnitType();
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
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS:
				setDimensions((IfcDimensionalExponents)newValue);
				return;
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__UNIT_TYPE:
				setUnitType((IfcUnitEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS:
				setDimensions((IfcDimensionalExponents)null);
				return;
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__DIMENSIONS:
				return dimensions != null;
			case Ifc2x3tc1Package.IFC_NAMED_UNIT__UNIT_TYPE:
				return unitType != UNIT_TYPE_EDEFAULT;
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
		result.append(')');
		return result.toString();
	}

} //IfcNamedUnitImpl
