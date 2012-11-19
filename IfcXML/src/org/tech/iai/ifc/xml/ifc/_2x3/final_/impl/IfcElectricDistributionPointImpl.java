/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPoint;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPointFunctionEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricDistributionPointImpl#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcElectricDistributionPointImpl#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcElectricDistributionPointImpl extends IfcFlowControllerImpl implements IfcElectricDistributionPoint {
	/**
	 * The default value of the '{@link #getDistributionPointFunction() <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionPointFunction()
	 * @generated
	 * @ordered
	 */
	protected static final IfcElectricDistributionPointFunctionEnum DISTRIBUTION_POINT_FUNCTION_EDEFAULT = IfcElectricDistributionPointFunctionEnum.ALARMPANEL;

	/**
	 * The cached value of the '{@link #getDistributionPointFunction() <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistributionPointFunction()
	 * @generated
	 * @ordered
	 */
	protected IfcElectricDistributionPointFunctionEnum distributionPointFunction = DISTRIBUTION_POINT_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedFunction() <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedFunction() <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedFunction()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedFunction = USER_DEFINED_FUNCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcElectricDistributionPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcElectricDistributionPoint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcElectricDistributionPointFunctionEnum getDistributionPointFunction() {
		return distributionPointFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum newDistributionPointFunction) {
		IfcElectricDistributionPointFunctionEnum oldDistributionPointFunction = distributionPointFunction;
		distributionPointFunction = newDistributionPointFunction == null ? DISTRIBUTION_POINT_FUNCTION_EDEFAULT : newDistributionPointFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__DISTRIBUTION_POINT_FUNCTION, oldDistributionPointFunction, distributionPointFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedFunction() {
		return userDefinedFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedFunction(String newUserDefinedFunction) {
		String oldUserDefinedFunction = userDefinedFunction;
		userDefinedFunction = newUserDefinedFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__USER_DEFINED_FUNCTION, oldUserDefinedFunction, userDefinedFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__DISTRIBUTION_POINT_FUNCTION:
				return getDistributionPointFunction();
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__USER_DEFINED_FUNCTION:
				return getUserDefinedFunction();
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
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__DISTRIBUTION_POINT_FUNCTION:
				setDistributionPointFunction((IfcElectricDistributionPointFunctionEnum)newValue);
				return;
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__USER_DEFINED_FUNCTION:
				setUserDefinedFunction((String)newValue);
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
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__DISTRIBUTION_POINT_FUNCTION:
				setDistributionPointFunction(DISTRIBUTION_POINT_FUNCTION_EDEFAULT);
				return;
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__USER_DEFINED_FUNCTION:
				setUserDefinedFunction(USER_DEFINED_FUNCTION_EDEFAULT);
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
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__DISTRIBUTION_POINT_FUNCTION:
				return distributionPointFunction != DISTRIBUTION_POINT_FUNCTION_EDEFAULT;
			case FinalPackage.IFC_ELECTRIC_DISTRIBUTION_POINT__USER_DEFINED_FUNCTION:
				return USER_DEFINED_FUNCTION_EDEFAULT == null ? userDefinedFunction != null : !USER_DEFINED_FUNCTION_EDEFAULT.equals(userDefinedFunction);
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
		result.append(" (distributionPointFunction: ");
		result.append(distributionPointFunction);
		result.append(", userDefinedFunction: ");
		result.append(userDefinedFunction);
		result.append(')');
		return result.toString();
	}

} //IfcElectricDistributionPointImpl
