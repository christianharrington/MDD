/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSlippageConnectionCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Slippage Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSlippageConnectionConditionImpl#getSlippageX <em>Slippage X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSlippageConnectionConditionImpl#getSlippageY <em>Slippage Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSlippageConnectionConditionImpl#getSlippageZ <em>Slippage Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSlippageConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcSlippageConnectionCondition {
	/**
	 * The default value of the '{@link #getSlippageX() <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SLIPPAGE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageX() <em>Slippage X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageX()
	 * @generated
	 * @ordered
	 */
	protected Double slippageX = SLIPPAGE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlippageY() <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SLIPPAGE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageY() <em>Slippage Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageY()
	 * @generated
	 * @ordered
	 */
	protected Double slippageY = SLIPPAGE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlippageZ() <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double SLIPPAGE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSlippageZ() <em>Slippage Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlippageZ()
	 * @generated
	 * @ordered
	 */
	protected Double slippageZ = SLIPPAGE_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSlippageConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSlippageConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageX() {
		return slippageX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageX(Double newSlippageX) {
		Double oldSlippageX = slippageX;
		slippageX = newSlippageX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X, oldSlippageX, slippageX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageY() {
		return slippageY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageY(Double newSlippageY) {
		Double oldSlippageY = slippageY;
		slippageY = newSlippageY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y, oldSlippageY, slippageY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSlippageZ() {
		return slippageZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlippageZ(Double newSlippageZ) {
		Double oldSlippageZ = slippageZ;
		slippageZ = newSlippageZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z, oldSlippageZ, slippageZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				return getSlippageX();
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				return getSlippageY();
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				return getSlippageZ();
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
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				setSlippageX((Double)newValue);
				return;
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				setSlippageY((Double)newValue);
				return;
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				setSlippageZ((Double)newValue);
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
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				setSlippageX(SLIPPAGE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				setSlippageY(SLIPPAGE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				setSlippageZ(SLIPPAGE_Z_EDEFAULT);
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
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_X:
				return SLIPPAGE_X_EDEFAULT == null ? slippageX != null : !SLIPPAGE_X_EDEFAULT.equals(slippageX);
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Y:
				return SLIPPAGE_Y_EDEFAULT == null ? slippageY != null : !SLIPPAGE_Y_EDEFAULT.equals(slippageY);
			case FinalPackage.IFC_SLIPPAGE_CONNECTION_CONDITION__SLIPPAGE_Z:
				return SLIPPAGE_Z_EDEFAULT == null ? slippageZ != null : !SLIPPAGE_Z_EDEFAULT.equals(slippageZ);
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
		result.append(" (slippageX: ");
		result.append(slippageX);
		result.append(", slippageY: ");
		result.append(slippageY);
		result.append(", slippageZ: ");
		result.append(slippageZ);
		result.append(')');
		return result.toString();
	}

} //IfcSlippageConnectionConditionImpl
