/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcBuildingStorey;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Building Storey</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingStoreyImpl#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcBuildingStoreyImpl#getElevationAsString <em>Elevation As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBuildingStoreyImpl extends IfcSpatialStructureElementImpl implements IfcBuildingStorey {
	/**
	 * The default value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected static final double ELEVATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElevation() <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevation()
	 * @generated
	 * @ordered
	 */
	protected double elevation = ELEVATION_EDEFAULT;

	/**
	 * This is true if the Elevation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationESet;

	/**
	 * The default value of the '{@link #getElevationAsString() <em>Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String ELEVATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getElevationAsString() <em>Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationAsString()
	 * @generated
	 * @ordered
	 */
	protected String elevationAsString = ELEVATION_AS_STRING_EDEFAULT;

	/**
	 * This is true if the Elevation As String attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elevationAsStringESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBuildingStoreyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcBuildingStorey();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevation(double newElevation) {
		double oldElevation = elevation;
		elevation = newElevation;
		boolean oldElevationESet = elevationESet;
		elevationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION, oldElevation, elevation, !oldElevationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevation() {
		double oldElevation = elevation;
		boolean oldElevationESet = elevationESet;
		elevation = ELEVATION_EDEFAULT;
		elevationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION, oldElevation, ELEVATION_EDEFAULT, oldElevationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevation() {
		return elevationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getElevationAsString() {
		return elevationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationAsString(String newElevationAsString) {
		String oldElevationAsString = elevationAsString;
		elevationAsString = newElevationAsString;
		boolean oldElevationAsStringESet = elevationAsStringESet;
		elevationAsStringESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING, oldElevationAsString, elevationAsString, !oldElevationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetElevationAsString() {
		String oldElevationAsString = elevationAsString;
		boolean oldElevationAsStringESet = elevationAsStringESet;
		elevationAsString = ELEVATION_AS_STRING_EDEFAULT;
		elevationAsStringESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING, oldElevationAsString, ELEVATION_AS_STRING_EDEFAULT, oldElevationAsStringESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetElevationAsString() {
		return elevationAsStringESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION:
				return getElevation();
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING:
				return getElevationAsString();
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
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION:
				setElevation((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING:
				setElevationAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION:
				unsetElevation();
				return;
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING:
				unsetElevationAsString();
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
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION:
				return isSetElevation();
			case Ifc2x3tc1Package.IFC_BUILDING_STOREY__ELEVATION_AS_STRING:
				return isSetElevationAsString();
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
		result.append(" (Elevation: ");
		if (elevationESet) result.append(elevation); else result.append("<unset>");
		result.append(", ElevationAsString: ");
		if (elevationAsStringESet) result.append(elevationAsString); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcBuildingStoreyImpl
