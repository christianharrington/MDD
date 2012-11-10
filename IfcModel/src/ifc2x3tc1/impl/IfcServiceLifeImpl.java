/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcServiceLife;
import ifc2x3tc1.IfcServiceLifeTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeImpl#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeImpl#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcServiceLifeImpl#getServiceLifeDurationAsString <em>Service Life Duration As String</em>}</li>
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
	protected static final IfcServiceLifeTypeEnum SERVICE_LIFE_TYPE_EDEFAULT = IfcServiceLifeTypeEnum.NULL;

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
	 * The default value of the '{@link #getServiceLifeDurationAsString() <em>Service Life Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_LIFE_DURATION_AS_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceLifeDurationAsString() <em>Service Life Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceLifeDurationAsString()
	 * @generated
	 * @ordered
	 */
	protected String serviceLifeDurationAsString = SERVICE_LIFE_DURATION_AS_STRING_EDEFAULT;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcServiceLife();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE, oldServiceLifeType, serviceLifeType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION, oldServiceLifeDuration, serviceLifeDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceLifeDurationAsString() {
		return serviceLifeDurationAsString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLifeDurationAsString(String newServiceLifeDurationAsString) {
		String oldServiceLifeDurationAsString = serviceLifeDurationAsString;
		serviceLifeDurationAsString = newServiceLifeDurationAsString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION_AS_STRING, oldServiceLifeDurationAsString, serviceLifeDurationAsString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				return getServiceLifeType();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				return getServiceLifeDuration();
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION_AS_STRING:
				return getServiceLifeDurationAsString();
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				setServiceLifeType((IfcServiceLifeTypeEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				setServiceLifeDuration((Double)newValue);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION_AS_STRING:
				setServiceLifeDurationAsString((String)newValue);
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				setServiceLifeType(SERVICE_LIFE_TYPE_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				setServiceLifeDuration(SERVICE_LIFE_DURATION_EDEFAULT);
				return;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION_AS_STRING:
				setServiceLifeDurationAsString(SERVICE_LIFE_DURATION_AS_STRING_EDEFAULT);
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
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_TYPE:
				return serviceLifeType != SERVICE_LIFE_TYPE_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION:
				return serviceLifeDuration != SERVICE_LIFE_DURATION_EDEFAULT;
			case Ifc2x3tc1Package.IFC_SERVICE_LIFE__SERVICE_LIFE_DURATION_AS_STRING:
				return SERVICE_LIFE_DURATION_AS_STRING_EDEFAULT == null ? serviceLifeDurationAsString != null : !SERVICE_LIFE_DURATION_AS_STRING_EDEFAULT.equals(serviceLifeDurationAsString);
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
		result.append(" (ServiceLifeType: ");
		result.append(serviceLifeType);
		result.append(", ServiceLifeDuration: ");
		result.append(serviceLifeDuration);
		result.append(", ServiceLifeDurationAsString: ");
		result.append(serviceLifeDurationAsString);
		result.append(')');
		return result.toString();
	}

} //IfcServiceLifeImpl
