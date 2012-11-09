/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcDistributionPort;
import ifc2x3tc1.IfcFlowDirectionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcDistributionPortImpl#getFlowDirection <em>Flow Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcDistributionPortImpl extends IfcPortImpl implements IfcDistributionPort {
	/**
	 * The default value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDirection()
	 * @generated
	 * @ordered
	 */
	protected static final IfcFlowDirectionEnum FLOW_DIRECTION_EDEFAULT = IfcFlowDirectionEnum.NULL;

	/**
	 * The cached value of the '{@link #getFlowDirection() <em>Flow Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowDirection()
	 * @generated
	 * @ordered
	 */
	protected IfcFlowDirectionEnum flowDirection = FLOW_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Flow Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean flowDirectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcDistributionPort();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcFlowDirectionEnum getFlowDirection() {
		return flowDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowDirection(IfcFlowDirectionEnum newFlowDirection) {
		IfcFlowDirectionEnum oldFlowDirection = flowDirection;
		flowDirection = newFlowDirection == null ? FLOW_DIRECTION_EDEFAULT : newFlowDirection;
		boolean oldFlowDirectionESet = flowDirectionESet;
		flowDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION, oldFlowDirection, flowDirection, !oldFlowDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlowDirection() {
		IfcFlowDirectionEnum oldFlowDirection = flowDirection;
		boolean oldFlowDirectionESet = flowDirectionESet;
		flowDirection = FLOW_DIRECTION_EDEFAULT;
		flowDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION, oldFlowDirection, FLOW_DIRECTION_EDEFAULT, oldFlowDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowDirection() {
		return flowDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION:
				return getFlowDirection();
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION:
				setFlowDirection((IfcFlowDirectionEnum)newValue);
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION:
				unsetFlowDirection();
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
			case Ifc2x3tc1Package.IFC_DISTRIBUTION_PORT__FLOW_DIRECTION:
				return isSetFlowDirection();
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
		result.append(" (FlowDirection: ");
		if (flowDirectionESet) result.append(flowDirection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcDistributionPortImpl
