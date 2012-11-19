/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData;
import org.tech.iai.ifc.xml.ifc._2x3.final_.LuminousIntensityType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SecondaryPlaneAngleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataImpl#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataImpl#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcLightDistributionDataImpl#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLightDistributionDataImpl extends EntityImpl implements IfcLightDistributionData {
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
	 * The cached value of the '{@link #getSecondaryPlaneAngle() <em>Secondary Plane Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryPlaneAngle()
	 * @generated
	 * @ordered
	 */
	protected SecondaryPlaneAngleType secondaryPlaneAngle;

	/**
	 * The cached value of the '{@link #getLuminousIntensity() <em>Luminous Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensity()
	 * @generated
	 * @ordered
	 */
	protected LuminousIntensityType luminousIntensity;

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
		return FinalPackage.eINSTANCE.getIfcLightDistributionData();
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
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE, oldMainPlaneAngle, mainPlaneAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryPlaneAngleType getSecondaryPlaneAngle() {
		return secondaryPlaneAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondaryPlaneAngle(SecondaryPlaneAngleType newSecondaryPlaneAngle, NotificationChain msgs) {
		SecondaryPlaneAngleType oldSecondaryPlaneAngle = secondaryPlaneAngle;
		secondaryPlaneAngle = newSecondaryPlaneAngle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE, oldSecondaryPlaneAngle, newSecondaryPlaneAngle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondaryPlaneAngle(SecondaryPlaneAngleType newSecondaryPlaneAngle) {
		if (newSecondaryPlaneAngle != secondaryPlaneAngle) {
			NotificationChain msgs = null;
			if (secondaryPlaneAngle != null)
				msgs = ((InternalEObject)secondaryPlaneAngle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE, null, msgs);
			if (newSecondaryPlaneAngle != null)
				msgs = ((InternalEObject)newSecondaryPlaneAngle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE, null, msgs);
			msgs = basicSetSecondaryPlaneAngle(newSecondaryPlaneAngle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE, newSecondaryPlaneAngle, newSecondaryPlaneAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuminousIntensityType getLuminousIntensity() {
		return luminousIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLuminousIntensity(LuminousIntensityType newLuminousIntensity, NotificationChain msgs) {
		LuminousIntensityType oldLuminousIntensity = luminousIntensity;
		luminousIntensity = newLuminousIntensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY, oldLuminousIntensity, newLuminousIntensity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLuminousIntensity(LuminousIntensityType newLuminousIntensity) {
		if (newLuminousIntensity != luminousIntensity) {
			NotificationChain msgs = null;
			if (luminousIntensity != null)
				msgs = ((InternalEObject)luminousIntensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY, null, msgs);
			if (newLuminousIntensity != null)
				msgs = ((InternalEObject)newLuminousIntensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY, null, msgs);
			msgs = basicSetLuminousIntensity(newLuminousIntensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY, newLuminousIntensity, newLuminousIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				return basicSetSecondaryPlaneAngle(null, msgs);
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				return basicSetLuminousIntensity(null, msgs);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				return getMainPlaneAngle();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				return getSecondaryPlaneAngle();
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				return getLuminousIntensity();
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				setMainPlaneAngle((Double)newValue);
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				setSecondaryPlaneAngle((SecondaryPlaneAngleType)newValue);
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				setLuminousIntensity((LuminousIntensityType)newValue);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				setMainPlaneAngle(MAIN_PLANE_ANGLE_EDEFAULT);
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				setSecondaryPlaneAngle((SecondaryPlaneAngleType)null);
				return;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				setLuminousIntensity((LuminousIntensityType)null);
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
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__MAIN_PLANE_ANGLE:
				return mainPlaneAngle != MAIN_PLANE_ANGLE_EDEFAULT;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__SECONDARY_PLANE_ANGLE:
				return secondaryPlaneAngle != null;
			case FinalPackage.IFC_LIGHT_DISTRIBUTION_DATA__LUMINOUS_INTENSITY:
				return luminousIntensity != null;
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
		result.append(" (mainPlaneAngle: ");
		result.append(mainPlaneAngle);
		result.append(')');
		return result.toString();
	}

} //IfcLightDistributionDataImpl
