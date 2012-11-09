/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBuilding;
import ifc2x3tc1.IfcPostalAddress;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingImpl#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingImpl#getElevationOfRefHeightAsString <em>Elevation Of Ref Height As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingImpl#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingImpl#getElevationOfTerrainAsString <em>Elevation Of Terrain As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingImpl#getBuildingAddress <em>Building Address</em>}</li>
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
	protected static final double ELEVATION_OF_REF_HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevationOfRefHeight() <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfRefHeight()
	 * @generated
	 * @ordered
	 */
	protected double elevationOfRefHeight = ELEVATION_OF_REF_HEIGHT_EDEFAULT;

	/**
	 * This is true if the Elevation Of Ref Height attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationOfRefHeightESet;

	/**
	 * The default value of the '{@link #getElevationOfRefHeightAsString() <em>Elevation Of Ref Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfRefHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEVATION_OF_REF_HEIGHT_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationOfRefHeightAsString() <em>Elevation Of Ref Height As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfRefHeightAsString()
	 * @generated
	 * @ordered
	 */
	protected String elevationOfRefHeightAsString = ELEVATION_OF_REF_HEIGHT_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Elevation Of Ref Height As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationOfRefHeightAsStringESet;

	/**
	 * The default value of the '{@link #getElevationOfTerrain() <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrain()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_OF_TERRAIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevationOfTerrain() <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrain()
	 * @generated
	 * @ordered
	 */
	protected double elevationOfTerrain = ELEVATION_OF_TERRAIN_EDEFAULT;

	/**
	 * This is true if the Elevation Of Terrain attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationOfTerrainESet;

	/**
	 * The default value of the '{@link #getElevationOfTerrainAsString() <em>Elevation Of Terrain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrainAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEVATION_OF_TERRAIN_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationOfTerrainAsString() <em>Elevation Of Terrain As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationOfTerrainAsString()
	 * @generated
	 * @ordered
	 */
	protected String elevationOfTerrainAsString = ELEVATION_OF_TERRAIN_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Elevation Of Terrain As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationOfTerrainAsStringESet;

	/**
	 * The cached value of the '{@link #getBuildingAddress() <em>Building Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingAddress()
	 * @generated
	 * @ordered
	 */
	protected IfcPostalAddress buildingAddress;

	/**
	 * This is true if the Building Address reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean buildingAddressESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcBuilding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevationOfRefHeight() {
		return elevationOfRefHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfRefHeight(double newElevationOfRefHeight) {
		double oldElevationOfRefHeight = elevationOfRefHeight;
		elevationOfRefHeight = newElevationOfRefHeight;
		boolean oldElevationOfRefHeightESet = elevationOfRefHeightESet;
		elevationOfRefHeightESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT, oldElevationOfRefHeight, elevationOfRefHeight, !oldElevationOfRefHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfRefHeight() {
		double oldElevationOfRefHeight = elevationOfRefHeight;
		boolean oldElevationOfRefHeightESet = elevationOfRefHeightESet;
		elevationOfRefHeight = ELEVATION_OF_REF_HEIGHT_EDEFAULT;
		elevationOfRefHeightESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT, oldElevationOfRefHeight, ELEVATION_OF_REF_HEIGHT_EDEFAULT, oldElevationOfRefHeightESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfRefHeight() {
		return elevationOfRefHeightESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElevationOfRefHeightAsString() {
		return elevationOfRefHeightAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfRefHeightAsString(String newElevationOfRefHeightAsString) {
		String oldElevationOfRefHeightAsString = elevationOfRefHeightAsString;
		elevationOfRefHeightAsString = newElevationOfRefHeightAsString;
		boolean oldElevationOfRefHeightAsStringESet = elevationOfRefHeightAsStringESet;
		elevationOfRefHeightAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING, oldElevationOfRefHeightAsString, elevationOfRefHeightAsString, !oldElevationOfRefHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfRefHeightAsString() {
		String oldElevationOfRefHeightAsString = elevationOfRefHeightAsString;
		boolean oldElevationOfRefHeightAsStringESet = elevationOfRefHeightAsStringESet;
		elevationOfRefHeightAsString = ELEVATION_OF_REF_HEIGHT_AS_STRING_EDEFAULT;
		elevationOfRefHeightAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING, oldElevationOfRefHeightAsString, ELEVATION_OF_REF_HEIGHT_AS_STRING_EDEFAULT, oldElevationOfRefHeightAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfRefHeightAsString() {
		return elevationOfRefHeightAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevationOfTerrain() {
		return elevationOfTerrain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfTerrain(double newElevationOfTerrain) {
		double oldElevationOfTerrain = elevationOfTerrain;
		elevationOfTerrain = newElevationOfTerrain;
		boolean oldElevationOfTerrainESet = elevationOfTerrainESet;
		elevationOfTerrainESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN, oldElevationOfTerrain, elevationOfTerrain, !oldElevationOfTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfTerrain() {
		double oldElevationOfTerrain = elevationOfTerrain;
		boolean oldElevationOfTerrainESet = elevationOfTerrainESet;
		elevationOfTerrain = ELEVATION_OF_TERRAIN_EDEFAULT;
		elevationOfTerrainESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN, oldElevationOfTerrain, ELEVATION_OF_TERRAIN_EDEFAULT, oldElevationOfTerrainESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfTerrain() {
		return elevationOfTerrainESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElevationOfTerrainAsString() {
		return elevationOfTerrainAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationOfTerrainAsString(String newElevationOfTerrainAsString) {
		String oldElevationOfTerrainAsString = elevationOfTerrainAsString;
		elevationOfTerrainAsString = newElevationOfTerrainAsString;
		boolean oldElevationOfTerrainAsStringESet = elevationOfTerrainAsStringESet;
		elevationOfTerrainAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING, oldElevationOfTerrainAsString, elevationOfTerrainAsString, !oldElevationOfTerrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationOfTerrainAsString() {
		String oldElevationOfTerrainAsString = elevationOfTerrainAsString;
		boolean oldElevationOfTerrainAsStringESet = elevationOfTerrainAsStringESet;
		elevationOfTerrainAsString = ELEVATION_OF_TERRAIN_AS_STRING_EDEFAULT;
		elevationOfTerrainAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING, oldElevationOfTerrainAsString, ELEVATION_OF_TERRAIN_AS_STRING_EDEFAULT, oldElevationOfTerrainAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationOfTerrainAsString() {
		return elevationOfTerrainAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress getBuildingAddress() {
		if (buildingAddress != null && buildingAddress.eIsProxy()) {
			InternalEObject oldBuildingAddress = (InternalEObject)buildingAddress;
			buildingAddress = (IfcPostalAddress)eResolveProxy(oldBuildingAddress);
			if (buildingAddress != oldBuildingAddress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS, oldBuildingAddress, buildingAddress));
			}
		}
		return buildingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPostalAddress basicGetBuildingAddress() {
		return buildingAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingAddress(IfcPostalAddress newBuildingAddress) {
		IfcPostalAddress oldBuildingAddress = buildingAddress;
		buildingAddress = newBuildingAddress;
		boolean oldBuildingAddressESet = buildingAddressESet;
		buildingAddressESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS, oldBuildingAddress, buildingAddress, !oldBuildingAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBuildingAddress() {
		IfcPostalAddress oldBuildingAddress = buildingAddress;
		boolean oldBuildingAddressESet = buildingAddressESet;
		buildingAddress = null;
		buildingAddressESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS, oldBuildingAddress, null, oldBuildingAddressESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBuildingAddress() {
		return buildingAddressESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				return getElevationOfRefHeight();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING:
				return getElevationOfRefHeightAsString();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				return getElevationOfTerrain();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING:
				return getElevationOfTerrainAsString();
			case Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS:
				if (resolve) return getBuildingAddress();
				return basicGetBuildingAddress();
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
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				setElevationOfRefHeight((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING:
				setElevationOfRefHeightAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				setElevationOfTerrain((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING:
				setElevationOfTerrainAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS:
				setBuildingAddress((IfcPostalAddress)newValue);
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
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				unsetElevationOfRefHeight();
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING:
				unsetElevationOfRefHeightAsString();
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				unsetElevationOfTerrain();
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING:
				unsetElevationOfTerrainAsString();
				return;
			case Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS:
				unsetBuildingAddress();
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
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT:
				return isSetElevationOfRefHeight();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_REF_HEIGHT_AS_STRING:
				return isSetElevationOfRefHeightAsString();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN:
				return isSetElevationOfTerrain();
			case Ifc2x3tc1Package.IFC_BUILDING__ELEVATION_OF_TERRAIN_AS_STRING:
				return isSetElevationOfTerrainAsString();
			case Ifc2x3tc1Package.IFC_BUILDING__BUILDING_ADDRESS:
				return isSetBuildingAddress();
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
		result.append(" (ElevationOfRefHeight: ");
		if (elevationOfRefHeightESet) result.append(elevationOfRefHeight); else result.append("<unset>");
		result.append(", ElevationOfRefHeightAsString: ");
		if (elevationOfRefHeightAsStringESet) result.append(elevationOfRefHeightAsString); else result.append("<unset>");
		result.append(", ElevationOfTerrain: ");
		if (elevationOfTerrainESet) result.append(elevationOfTerrain); else result.append("<unset>");
		result.append(", ElevationOfTerrainAsString: ");
		if (elevationOfTerrainAsStringESet) result.append(elevationOfTerrainAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBuildingImpl
