/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcLightDistributionCurveEnum;
import ifc2x3tc1.IfcLightDistributionData;
import ifc2x3tc1.IfcLightIntensityDistribution;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcLightIntensityDistributionImpl#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcLightIntensityDistributionImpl#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightIntensityDistributionImpl extends EObjectImpl implements IfcLightIntensityDistribution {
	/**
	 * The default value of the '{@link #getLightDistributionCurve() <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightDistributionCurve()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLightDistributionCurveEnum LIGHT_DISTRIBUTION_CURVE_EDEFAULT = IfcLightDistributionCurveEnum.NULL;

	/**
	 * The cached value of the '{@link #getLightDistributionCurve() <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightDistributionCurve()
	 * @generated
	 * @ordered
	 */
	protected IfcLightDistributionCurveEnum lightDistributionCurve = LIGHT_DISTRIBUTION_CURVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDistributionData() <em>Distribution Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionData()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcLightDistributionData> distributionData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLightIntensityDistributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcLightIntensityDistribution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcLightDistributionCurveEnum getLightDistributionCurve() {
		return lightDistributionCurve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightDistributionCurve(IfcLightDistributionCurveEnum newLightDistributionCurve) {
		IfcLightDistributionCurveEnum oldLightDistributionCurve = lightDistributionCurve;
		lightDistributionCurve = newLightDistributionCurve == null ? LIGHT_DISTRIBUTION_CURVE_EDEFAULT : newLightDistributionCurve;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE, oldLightDistributionCurve, lightDistributionCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcLightDistributionData> getDistributionData() {
		if (distributionData == null) {
			distributionData = new EObjectResolvingEList<IfcLightDistributionData>(IfcLightDistributionData.class, this, Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA);
		}
		return distributionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				return getLightDistributionCurve();
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				return getDistributionData();
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
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				setLightDistributionCurve((IfcLightDistributionCurveEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				getDistributionData().clear();
				getDistributionData().addAll((Collection<? extends IfcLightDistributionData>)newValue);
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
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				setLightDistributionCurve(LIGHT_DISTRIBUTION_CURVE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				getDistributionData().clear();
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
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				return lightDistributionCurve != LIGHT_DISTRIBUTION_CURVE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				return distributionData != null && !distributionData.isEmpty();
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
		result.append(" (LightDistributionCurve: ");
		result.append(lightDistributionCurve);
		result.append(')');
		return result.toString();
	}

} //IfcLightIntensityDistributionImpl
