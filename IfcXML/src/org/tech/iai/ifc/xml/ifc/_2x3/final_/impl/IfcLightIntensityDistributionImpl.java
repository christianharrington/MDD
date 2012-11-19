/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.DistributionDataType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionCurveEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightIntensityDistribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Intensity Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightIntensityDistributionImpl#getLightDistributionCurve <em>Light Distribution Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightIntensityDistributionImpl#getDistributionData <em>Distribution Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightIntensityDistributionImpl extends EntityImpl implements IfcLightIntensityDistribution {
	/**
	 * The default value of the '{@link #getLightDistributionCurve() <em>Light Distribution Curve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLightDistributionCurve()
	 * @generated
	 * @ordered
	 */
	protected static final IfcLightDistributionCurveEnum LIGHT_DISTRIBUTION_CURVE_EDEFAULT = IfcLightDistributionCurveEnum.TYPE_A;

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
	 * The cached value of the '{@link #getDistributionData() <em>Distribution Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionData()
	 * @generated
	 * @ordered
	 */
	protected DistributionDataType distributionData;

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
		return FinalPackage.eINSTANCE.getIfcLightIntensityDistribution();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE, oldLightDistributionCurve, lightDistributionCurve));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionDataType getDistributionData() {
		return distributionData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistributionData(DistributionDataType newDistributionData, NotificationChain msgs) {
		DistributionDataType oldDistributionData = distributionData;
		distributionData = newDistributionData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA, oldDistributionData, newDistributionData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionData(DistributionDataType newDistributionData) {
		if (newDistributionData != distributionData) {
			NotificationChain msgs = null;
			if (distributionData != null)
				msgs = ((InternalEObject)distributionData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA, null, msgs);
			if (newDistributionData != null)
				msgs = ((InternalEObject)newDistributionData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA, null, msgs);
			msgs = basicSetDistributionData(newDistributionData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA, newDistributionData, newDistributionData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				return basicSetDistributionData(null, msgs);
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
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				return getLightDistributionCurve();
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				return getDistributionData();
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
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				setLightDistributionCurve((IfcLightDistributionCurveEnum)newValue);
				return;
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				setDistributionData((DistributionDataType)newValue);
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
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				setLightDistributionCurve(LIGHT_DISTRIBUTION_CURVE_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				setDistributionData((DistributionDataType)null);
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
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__LIGHT_DISTRIBUTION_CURVE:
				return lightDistributionCurve != LIGHT_DISTRIBUTION_CURVE_EDEFAULT;
			case FinalPackage.IFC_LIGHT_INTENSITY_DISTRIBUTION__DISTRIBUTION_DATA:
				return distributionData != null;
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
		result.append(" (lightDistributionCurve: ");
		result.append(lightDistributionCurve);
		result.append(')');
		return result.toString();
	}

} //IfcLightIntensityDistributionImpl
