/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcSlab;
import ifc2x3tc1.IfcSlabTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcSlabImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSlabImpl extends IfcBuildingElementImpl implements IfcSlab {
	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcSlabTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcSlabTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcSlabTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * This is true if the Predefined Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean predefinedTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcSlab();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcSlabTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcSlabTypeEnum newPredefinedType) {
		IfcSlabTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		boolean oldPredefinedTypeESet = predefinedTypeESet;
		predefinedTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE, oldPredefinedType, predefinedType, !oldPredefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		IfcSlabTypeEnum oldPredefinedType = predefinedType;
		boolean oldPredefinedTypeESet = predefinedTypeESet;
		predefinedType = PREDEFINED_TYPE_EDEFAULT;
		predefinedTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE, oldPredefinedType, PREDEFINED_TYPE_EDEFAULT, oldPredefinedTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return predefinedTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE:
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
			case Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE:
				setPredefinedType((IfcSlabTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE:
				unsetPredefinedType();
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
			case Ifc2x3tc1Package.IFC_SLAB__PREDEFINED_TYPE:
				return isSetPredefinedType();
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
		result.append(" (PredefinedType: ");
		if (predefinedTypeESet) result.append(predefinedType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcSlabImpl
