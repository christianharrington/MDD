/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcInternalOrExternalEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceImpl#getInteriorOrExteriorSpace <em>Interior Or Exterior Space</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSpaceImpl#getElevationWithFlooring <em>Elevation With Flooring</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSpaceImpl extends IfcSpatialStructureElementImpl implements IfcSpace {
	/**
	 * The default value of the '{@link #getInteriorOrExteriorSpace() <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 * @ordered
	 */
	protected static final IfcInternalOrExternalEnum INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT = IfcInternalOrExternalEnum.INTERNAL;

	/**
	 * The cached value of the '{@link #getInteriorOrExteriorSpace() <em>Interior Or Exterior Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteriorOrExteriorSpace()
	 * @generated
	 * @ordered
	 */
	protected IfcInternalOrExternalEnum interiorOrExteriorSpace = INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevationWithFlooring() <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooring()
	 * @generated
	 * @ordered
	 */
	protected static final Double ELEVATION_WITH_FLOORING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationWithFlooring() <em>Elevation With Flooring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationWithFlooring()
	 * @generated
	 * @ordered
	 */
	protected Double elevationWithFlooring = ELEVATION_WITH_FLOORING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSpace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInternalOrExternalEnum getInteriorOrExteriorSpace() {
		return interiorOrExteriorSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteriorOrExteriorSpace(IfcInternalOrExternalEnum newInteriorOrExteriorSpace) {
		IfcInternalOrExternalEnum oldInteriorOrExteriorSpace = interiorOrExteriorSpace;
		interiorOrExteriorSpace = newInteriorOrExteriorSpace == null ? INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT : newInteriorOrExteriorSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE, oldInteriorOrExteriorSpace, interiorOrExteriorSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationWithFlooring() {
		return elevationWithFlooring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationWithFlooring(Double newElevationWithFlooring) {
		Double oldElevationWithFlooring = elevationWithFlooring;
		elevationWithFlooring = newElevationWithFlooring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SPACE__ELEVATION_WITH_FLOORING, oldElevationWithFlooring, elevationWithFlooring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				return getInteriorOrExteriorSpace();
			case FinalPackage.IFC_SPACE__ELEVATION_WITH_FLOORING:
				return getElevationWithFlooring();
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
			case FinalPackage.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				setInteriorOrExteriorSpace((IfcInternalOrExternalEnum)newValue);
				return;
			case FinalPackage.IFC_SPACE__ELEVATION_WITH_FLOORING:
				setElevationWithFlooring((Double)newValue);
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
			case FinalPackage.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				setInteriorOrExteriorSpace(INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT);
				return;
			case FinalPackage.IFC_SPACE__ELEVATION_WITH_FLOORING:
				setElevationWithFlooring(ELEVATION_WITH_FLOORING_EDEFAULT);
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
			case FinalPackage.IFC_SPACE__INTERIOR_OR_EXTERIOR_SPACE:
				return interiorOrExteriorSpace != INTERIOR_OR_EXTERIOR_SPACE_EDEFAULT;
			case FinalPackage.IFC_SPACE__ELEVATION_WITH_FLOORING:
				return ELEVATION_WITH_FLOORING_EDEFAULT == null ? elevationWithFlooring != null : !ELEVATION_WITH_FLOORING_EDEFAULT.equals(elevationWithFlooring);
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
		result.append(" (interiorOrExteriorSpace: ");
		result.append(interiorOrExteriorSpace);
		result.append(", elevationWithFlooring: ");
		result.append(elevationWithFlooring);
		result.append(')');
		return result.toString();
	}

} //IfcSpaceImpl
