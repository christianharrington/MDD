/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.BuildingAddressType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBuildingImpl#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBuildingImpl#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBuildingImpl#getBuildingAddress <em>Building Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBuildingImpl extends IfcSpatialStructureElementImpl implements IfcBuilding {
	/**
	 * The default value of the '{@link #getElevationOfRefHeight() <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfRefHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Double ELEVATION_OF_REF_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationOfRefHeight() <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfRefHeight()
	 * @generated
	 * @ordered
	 */
	protected Double elevationOfRefHeight = ELEVATION_OF_REF_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElevationOfTerrain() <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final Double ELEVATION_OF_TERRAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationOfTerrain() <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrain()
	 * @generated
	 * @ordered
	 */
	protected Double elevationOfTerrain = ELEVATION_OF_TERRAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuildingAddress() <em>Building Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingAddress()
	 * @generated
	 * @ordered
	 */
	protected BuildingAddressType buildingAddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBuilding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationOfRefHeight() {
		return elevationOfRefHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfRefHeight(Double newElevationOfRefHeight) {
		Double oldElevationOfRefHeight = elevationOfRefHeight;
		elevationOfRefHeight = newElevationOfRefHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT, oldElevationOfRefHeight, elevationOfRefHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getElevationOfTerrain() {
		return elevationOfTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfTerrain(Double newElevationOfTerrain) {
		Double oldElevationOfTerrain = elevationOfTerrain;
		elevationOfTerrain = newElevationOfTerrain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BUILDING__ELEVATION_OF_TERRAIN, oldElevationOfTerrain, elevationOfTerrain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildingAddressType getBuildingAddress() {
		return buildingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildingAddress(BuildingAddressType newBuildingAddress, NotificationChain msgs) {
		BuildingAddressType oldBuildingAddress = buildingAddress;
		buildingAddress = newBuildingAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BUILDING__BUILDING_ADDRESS, oldBuildingAddress, newBuildingAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingAddress(BuildingAddressType newBuildingAddress) {
		if (newBuildingAddress != buildingAddress) {
			NotificationChain msgs = null;
			if (buildingAddress != null)
				msgs = ((InternalEObject)buildingAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BUILDING__BUILDING_ADDRESS, null, msgs);
			if (newBuildingAddress != null)
				msgs = ((InternalEObject)newBuildingAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_BUILDING__BUILDING_ADDRESS, null, msgs);
			msgs = basicSetBuildingAddress(newBuildingAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BUILDING__BUILDING_ADDRESS, newBuildingAddress, newBuildingAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_BUILDING__BUILDING_ADDRESS:
				return basicSetBuildingAddress(null, msgs);
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
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				return getElevationOfRefHeight();
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				return getElevationOfTerrain();
			case FinalPackage.IFC_BUILDING__BUILDING_ADDRESS:
				return getBuildingAddress();
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
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				setElevationOfRefHeight((Double)newValue);
				return;
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				setElevationOfTerrain((Double)newValue);
				return;
			case FinalPackage.IFC_BUILDING__BUILDING_ADDRESS:
				setBuildingAddress((BuildingAddressType)newValue);
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
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				setElevationOfRefHeight(ELEVATION_OF_REF_HEIGHT_EDEFAULT);
				return;
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				setElevationOfTerrain(ELEVATION_OF_TERRAIN_EDEFAULT);
				return;
			case FinalPackage.IFC_BUILDING__BUILDING_ADDRESS:
				setBuildingAddress((BuildingAddressType)null);
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
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				return ELEVATION_OF_REF_HEIGHT_EDEFAULT == null ? elevationOfRefHeight != null : !ELEVATION_OF_REF_HEIGHT_EDEFAULT.equals(elevationOfRefHeight);
			case FinalPackage.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				return ELEVATION_OF_TERRAIN_EDEFAULT == null ? elevationOfTerrain != null : !ELEVATION_OF_TERRAIN_EDEFAULT.equals(elevationOfTerrain);
			case FinalPackage.IFC_BUILDING__BUILDING_ADDRESS:
				return buildingAddress != null;
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
		result.append(" (elevationOfRefHeight: ");
		result.append(elevationOfRefHeight);
		result.append(", elevationOfTerrain: ");
		result.append(elevationOfTerrain);
		result.append(')');
		return result.toString();
	}

} //IfcBuildingImpl
