/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAssemblyPlaceEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFurnitureType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Furniture Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFurnitureTypeImpl#getAssemblyPlace <em>Assembly Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFurnitureTypeImpl extends IfcFurnishingElementTypeImpl implements IfcFurnitureType {
	/**
	 * The default value of the '{@link #getAssemblyPlace() <em>Assembly Place</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyPlace()
	 * @generated
	 * @ordered
	 */
	protected static final IfcAssemblyPlaceEnum ASSEMBLY_PLACE_EDEFAULT = IfcAssemblyPlaceEnum.SITE;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFurnitureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFurnitureType();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FURNITURE_TYPE__ASSEMBLY_PLACE, oldAssemblyPlace, assemblyPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_FURNITURE_TYPE__ASSEMBLY_PLACE:
				return getAssemblyPlace();
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
			case FinalPackage.IFC_FURNITURE_TYPE__ASSEMBLY_PLACE:
				setAssemblyPlace((IfcAssemblyPlaceEnum)newValue);
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
			case FinalPackage.IFC_FURNITURE_TYPE__ASSEMBLY_PLACE:
				setAssemblyPlace(ASSEMBLY_PLACE_EDEFAULT);
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
			case FinalPackage.IFC_FURNITURE_TYPE__ASSEMBLY_PLACE:
				return assemblyPlace != ASSEMBLY_PLACE_EDEFAULT;
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
		result.append(" (assemblyPlace: ");
		result.append(assemblyPlace);
		result.append(')');
		return result.toString();
	}

} //IfcFurnitureTypeImpl
