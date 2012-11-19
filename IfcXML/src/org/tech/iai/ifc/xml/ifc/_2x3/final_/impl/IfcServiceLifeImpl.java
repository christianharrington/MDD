/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLife;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeTypeEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeImpl#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcServiceLifeImpl#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcServiceLifeImpl extends IfcControlImpl implements IfcServiceLife {
	/**
	 * The default value of the '{@link #getServiceLifeType() <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeType()
	 * @generated
	 * @ordered
	 */
	protected static final IfcServiceLifeTypeEnum SERVICE_LIFE_TYPE_EDEFAULT = IfcServiceLifeTypeEnum.ACTUALSERVICELIFE;

	/**
	 * The cached value of the '{@link #getServiceLifeType() <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeType()
	 * @generated
	 * @ordered
	 */
	protected IfcServiceLifeTypeEnum serviceLifeType = SERVICE_LIFE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceLifeDuration() <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double SERVICE_LIFE_DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getServiceLifeDuration() <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeDuration()
	 * @generated
	 * @ordered
	 */
	protected double serviceLifeDuration = SERVICE_LIFE_DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcServiceLifeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcServiceLife();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeTypeEnum getServiceLifeType() {
		return serviceLifeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLifeType(IfcServiceLifeTypeEnum newServiceLifeType) {
		IfcServiceLifeTypeEnum oldServiceLifeType = serviceLifeType;
		serviceLifeType = newServiceLifeType == null ? SERVICE_LIFE_TYPE_EDEFAULT : newServiceLifeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE, oldServiceLifeType, serviceLifeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getServiceLifeDuration() {
		return serviceLifeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLifeDuration(double newServiceLifeDuration) {
		double oldServiceLifeDuration = serviceLifeDuration;
		serviceLifeDuration = newServiceLifeDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION, oldServiceLifeDuration, serviceLifeDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				return getServiceLifeType();
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				return getServiceLifeDuration();
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
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				setServiceLifeType((IfcServiceLifeTypeEnum)newValue);
				return;
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				setServiceLifeDuration((Double)newValue);
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
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				setServiceLifeType(SERVICE_LIFE_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				setServiceLifeDuration(SERVICE_LIFE_DURATION_EDEFAULT);
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
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				return serviceLifeType != SERVICE_LIFE_TYPE_EDEFAULT;
			case FinalPackage.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				return serviceLifeDuration != SERVICE_LIFE_DURATION_EDEFAULT;
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
		result.append(" (serviceLifeType: ");
		result.append(serviceLifeType);
		result.append(", serviceLifeDuration: ");
		result.append(serviceLifeDuration);
		result.append(')');
		return result.toString();
	}

} //IfcServiceLifeImpl
