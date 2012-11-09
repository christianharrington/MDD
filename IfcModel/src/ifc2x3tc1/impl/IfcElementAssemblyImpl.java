/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcAssemblyPlaceEnum;
import ifc2x3tc1.IfcElementAssembly;
import ifc2x3tc1.IfcElementAssemblyTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Element Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcElementAssemblyImpl#getAssemblyPlace <em>Assembly Place</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcElementAssemblyImpl#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElementAssemblyImpl extends IfcElementImpl implements IfcElementAssembly {
	/**
	 * The default value of the '{@link #getAssemblyPlace() <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyPlace()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAssemblyPlaceEnum ASSEMBLY_PLACE_EDEFAULT = IfcAssemblyPlaceEnum.NULL;

	/**
	 * The cached value of the '{@link #getAssemblyPlace() <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyPlace()
	 * @generated
	 * @ordered
	 */
	protected IfcAssemblyPlaceEnum assemblyPlace = ASSEMBLY_PLACE_EDEFAULT;

	/**
	 * This is true if the Assembly Place attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean assemblyPlaceESet;

	/**
	 * The default value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcElementAssemblyTypeEnum PREDEFINED_TYPE_EDEFAULT = IfcElementAssemblyTypeEnum.NULL;

	/**
	 * The cached value of the '{@link #getPredefinedType() <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredefinedType()
	 * @generated
	 * @ordered
	 */
	protected IfcElementAssemblyTypeEnum predefinedType = PREDEFINED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElementAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcElementAssembly();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcAssemblyPlaceEnum getAssemblyPlace() {
		return assemblyPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyPlace(IfcAssemblyPlaceEnum newAssemblyPlace) {
		IfcAssemblyPlaceEnum oldAssemblyPlace = assemblyPlace;
		assemblyPlace = newAssemblyPlace == null ? ASSEMBLY_PLACE_EDEFAULT : newAssemblyPlace;
		boolean oldAssemblyPlaceESet = assemblyPlaceESet;
		assemblyPlaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE, oldAssemblyPlace, assemblyPlace, !oldAssemblyPlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssemblyPlace() {
		IfcAssemblyPlaceEnum oldAssemblyPlace = assemblyPlace;
		boolean oldAssemblyPlaceESet = assemblyPlaceESet;
		assemblyPlace = ASSEMBLY_PLACE_EDEFAULT;
		assemblyPlaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE, oldAssemblyPlace, ASSEMBLY_PLACE_EDEFAULT, oldAssemblyPlaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssemblyPlace() {
		return assemblyPlaceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElementAssemblyTypeEnum getPredefinedType() {
		return predefinedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcElementAssemblyTypeEnum newPredefinedType) {
		IfcElementAssemblyTypeEnum oldPredefinedType = predefinedType;
		predefinedType = newPredefinedType == null ? PREDEFINED_TYPE_EDEFAULT : newPredefinedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__PREDEFINED_TYPE, oldPredefinedType, predefinedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE:
				return getAssemblyPlace();
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__PREDEFINED_TYPE:
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
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE:
				setAssemblyPlace((IfcAssemblyPlaceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__PREDEFINED_TYPE:
				setPredefinedType((IfcElementAssemblyTypeEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE:
				unsetAssemblyPlace();
				return;
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__PREDEFINED_TYPE:
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
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__ASSEMBLY_PLACE:
				return isSetAssemblyPlace();
			case Ifc2x3tc1Package.IFC_ELEMENT_ASSEMBLY__PREDEFINED_TYPE:
				return predefinedType != PREDEFINED_TYPE_EDEFAULT;
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
		result.append(" (AssemblyPlace: ");
		if (assemblyPlaceESet) result.append(assemblyPlace); else result.append("<unset>");
		result.append(", PredefinedType: ");
		result.append(predefinedType);
		result.append(')');
		return result.toString();
	}

} //IfcElementAssemblyImpl
