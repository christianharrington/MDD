/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLightDistributionData;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getMainPlaneAngleAsString <em>Main Plane Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getSecondaryPlaneAngleAsString <em>Secondary Plane Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightDistributionDataImpl#getLuminousIntensityAsString <em>Luminous Intensity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightDistributionDataImpl extends EObjectImpl implements IfcLightDistributionData {
	/**
	 * The default value of the '{@link #getMainPlaneAngle() <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPlaneAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double MAIN_PLANE_ANGLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMainPlaneAngle() <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPlaneAngle()
	 * @generated
	 * @ordered
	 */
	protected double mainPlaneAngle = MAIN_PLANE_ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMainPlaneAngleAsString() <em>Main Plane Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPlaneAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIN_PLANE_ANGLE_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMainPlaneAngleAsString() <em>Main Plane Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainPlaneAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected String mainPlaneAngleAsString = MAIN_PLANE_ANGLE_AS_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecondaryPlaneAngle() <em>Secondary Plane Angle</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryPlaneAngle()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> secondaryPlaneAngle;

	/**
	 * The cached value of the '{@link #getSecondaryPlaneAngleAsString() <em>Secondary Plane Angle As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryPlaneAngleAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secondaryPlaneAngleAsString;

	/**
	 * The cached value of the '{@link #getLuminousIntensity() <em>Luminous Intensity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensity()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> luminousIntensity;

	/**
	 * The cached value of the '{@link #getLuminousIntensityAsString() <em>Luminous Intensity As String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensityAsString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> luminousIntensityAsString;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightDistributionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightDistributionData();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMainPlaneAngle() {
		return mainPlaneAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPlaneAngle(double newMainPlaneAngle) {
		double oldMainPlaneAngle = mainPlaneAngle;
		mainPlaneAngle = newMainPlaneAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE, oldMainPlaneAngle, mainPlaneAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMainPlaneAngleAsString() {
		return mainPlaneAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainPlaneAngleAsString(String newMainPlaneAngleAsString) {
		String oldMainPlaneAngleAsString = mainPlaneAngleAsString;
		mainPlaneAngleAsString = newMainPlaneAngleAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING, oldMainPlaneAngleAsString, mainPlaneAngleAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getSecondaryPlaneAngle() {
		if (secondaryPlaneAngle == null) {
			secondaryPlaneAngle = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE);
		}
		return secondaryPlaneAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSecondaryPlaneAngleAsString() {
		if (secondaryPlaneAngleAsString == null) {
			secondaryPlaneAngleAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING);
		}
		return secondaryPlaneAngleAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getLuminousIntensity() {
		if (luminousIntensity == null) {
			luminousIntensity = new EDataTypeEList<Double>(Double.class, this, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY);
		}
		return luminousIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLuminousIntensityAsString() {
		if (luminousIntensityAsString == null) {
			luminousIntensityAsString = new EDataTypeEList<String>(String.class, this, Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING);
		}
		return luminousIntensityAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				return getMainPlaneAngle();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING:
				return getMainPlaneAngleAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				return getSecondaryPlaneAngle();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING:
				return getSecondaryPlaneAngleAsString();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				return getLuminousIntensity();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING:
				return getLuminousIntensityAsString();
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
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				setMainPlaneAngle((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING:
				setMainPlaneAngleAsString((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				getSecondaryPlaneAngle().clear();
				getSecondaryPlaneAngle().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING:
				getSecondaryPlaneAngleAsString().clear();
				getSecondaryPlaneAngleAsString().addAll((Collection<? extends String>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				getLuminousIntensity().clear();
				getLuminousIntensity().addAll((Collection<? extends Double>)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING:
				getLuminousIntensityAsString().clear();
				getLuminousIntensityAsString().addAll((Collection<? extends String>)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				setMainPlaneAngle(MAIN_PLANE_ANGLE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING:
				setMainPlaneAngleAsString(MAIN_PLANE_ANGLE_AS_STRING_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				getSecondaryPlaneAngle().clear();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING:
				getSecondaryPlaneAngleAsString().clear();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				getLuminousIntensity().clear();
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING:
				getLuminousIntensityAsString().clear();
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
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				return mainPlaneAngle != MAIN_PLANE_ANGLE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE_AS_STRING:
				return MAIN_PLANE_ANGLE_AS_STRING_EDEFAULT == null ? mainPlaneAngleAsString != null : !MAIN_PLANE_ANGLE_AS_STRING_EDEFAULT.equals(mainPlaneAngleAsString);
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				return secondaryPlaneAngle != null && !secondaryPlaneAngle.isEmpty();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE_AS_STRING:
				return secondaryPlaneAngleAsString != null && !secondaryPlaneAngleAsString.isEmpty();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				return luminousIntensity != null && !luminousIntensity.isEmpty();
			case Ifc2x3tc1Package.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY_AS_STRING:
				return luminousIntensityAsString != null && !luminousIntensityAsString.isEmpty();
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
		result.append(" (MainPlaneAngle: ");
		result.append(mainPlaneAngle);
		result.append(", MainPlaneAngleAsString: ");
		result.append(mainPlaneAngleAsString);
		result.append(", SecondaryPlaneAngle: ");
		result.append(secondaryPlaneAngle);
		result.append(", SecondaryPlaneAngleAsString: ");
		result.append(secondaryPlaneAngleAsString);
		result.append(", LuminousIntensity: ");
		result.append(luminousIntensity);
		result.append(", LuminousIntensityAsString: ");
		result.append(luminousIntensityAsString);
		result.append(')');
		return result.toString();
	}

} //IfcLightDistributionDataImpl
