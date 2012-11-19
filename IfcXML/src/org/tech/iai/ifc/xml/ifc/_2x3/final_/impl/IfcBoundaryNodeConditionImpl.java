/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryNodeCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Node Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessX <em>Linear Stiffness X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessY <em>Linear Stiffness Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getLinearStiffnessZ <em>Linear Stiffness Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessX <em>Rotational Stiffness X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessY <em>Rotational Stiffness Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryNodeConditionImpl#getRotationalStiffnessZ <em>Rotational Stiffness Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryNodeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryNodeCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessX() <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessX() <em>Linear Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessX = LINEAR_STIFFNESS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessY() <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessY() <em>Linear Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessY = LINEAR_STIFFNESS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessZ() <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessZ() <em>Linear Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessZ = LINEAR_STIFFNESS_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessX() <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessX() <em>Rotational Stiffness X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessX()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessX = ROTATIONAL_STIFFNESS_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessY() <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessY() <em>Rotational Stiffness Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessY()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessY = ROTATIONAL_STIFFNESS_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessZ() <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessZ() <em>Rotational Stiffness Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessZ()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessZ = ROTATIONAL_STIFFNESS_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryNodeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBoundaryNodeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessX() {
		return linearStiffnessX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessX(Double newLinearStiffnessX) {
		Double oldLinearStiffnessX = linearStiffnessX;
		linearStiffnessX = newLinearStiffnessX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X, oldLinearStiffnessX, linearStiffnessX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessY() {
		return linearStiffnessY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessY(Double newLinearStiffnessY) {
		Double oldLinearStiffnessY = linearStiffnessY;
		linearStiffnessY = newLinearStiffnessY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y, oldLinearStiffnessY, linearStiffnessY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessZ() {
		return linearStiffnessZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessZ(Double newLinearStiffnessZ) {
		Double oldLinearStiffnessZ = linearStiffnessZ;
		linearStiffnessZ = newLinearStiffnessZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z, oldLinearStiffnessZ, linearStiffnessZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessX() {
		return rotationalStiffnessX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessX(Double newRotationalStiffnessX) {
		Double oldRotationalStiffnessX = rotationalStiffnessX;
		rotationalStiffnessX = newRotationalStiffnessX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X, oldRotationalStiffnessX, rotationalStiffnessX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessY() {
		return rotationalStiffnessY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessY(Double newRotationalStiffnessY) {
		Double oldRotationalStiffnessY = rotationalStiffnessY;
		rotationalStiffnessY = newRotationalStiffnessY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y, oldRotationalStiffnessY, rotationalStiffnessY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessZ() {
		return rotationalStiffnessZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessZ(Double newRotationalStiffnessZ) {
		Double oldRotationalStiffnessZ = rotationalStiffnessZ;
		rotationalStiffnessZ = newRotationalStiffnessZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z, oldRotationalStiffnessZ, rotationalStiffnessZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				return getLinearStiffnessX();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				return getLinearStiffnessY();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				return getLinearStiffnessZ();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				return getRotationalStiffnessX();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				return getRotationalStiffnessY();
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				return getRotationalStiffnessZ();
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
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				setLinearStiffnessX((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				setLinearStiffnessY((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				setLinearStiffnessZ((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				setRotationalStiffnessX((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				setRotationalStiffnessY((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				setRotationalStiffnessZ((Double)newValue);
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
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				setLinearStiffnessX(LINEAR_STIFFNESS_X_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				setLinearStiffnessY(LINEAR_STIFFNESS_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				setLinearStiffnessZ(LINEAR_STIFFNESS_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				setRotationalStiffnessX(ROTATIONAL_STIFFNESS_X_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				setRotationalStiffnessY(ROTATIONAL_STIFFNESS_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				setRotationalStiffnessZ(ROTATIONAL_STIFFNESS_Z_EDEFAULT);
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
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_X:
				return LINEAR_STIFFNESS_X_EDEFAULT == null ? linearStiffnessX != null : !LINEAR_STIFFNESS_X_EDEFAULT.equals(linearStiffnessX);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Y:
				return LINEAR_STIFFNESS_Y_EDEFAULT == null ? linearStiffnessY != null : !LINEAR_STIFFNESS_Y_EDEFAULT.equals(linearStiffnessY);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__LINEAR_STIFFNESS_Z:
				return LINEAR_STIFFNESS_Z_EDEFAULT == null ? linearStiffnessZ != null : !LINEAR_STIFFNESS_Z_EDEFAULT.equals(linearStiffnessZ);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_X:
				return ROTATIONAL_STIFFNESS_X_EDEFAULT == null ? rotationalStiffnessX != null : !ROTATIONAL_STIFFNESS_X_EDEFAULT.equals(rotationalStiffnessX);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Y:
				return ROTATIONAL_STIFFNESS_Y_EDEFAULT == null ? rotationalStiffnessY != null : !ROTATIONAL_STIFFNESS_Y_EDEFAULT.equals(rotationalStiffnessY);
			case FinalPackage.IFC_BOUNDARY_NODE_CONDITION__ROTATIONAL_STIFFNESS_Z:
				return ROTATIONAL_STIFFNESS_Z_EDEFAULT == null ? rotationalStiffnessZ != null : !ROTATIONAL_STIFFNESS_Z_EDEFAULT.equals(rotationalStiffnessZ);
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
		result.append(" (linearStiffnessX: ");
		result.append(linearStiffnessX);
		result.append(", linearStiffnessY: ");
		result.append(linearStiffnessY);
		result.append(", linearStiffnessZ: ");
		result.append(linearStiffnessZ);
		result.append(", rotationalStiffnessX: ");
		result.append(rotationalStiffnessX);
		result.append(", rotationalStiffnessY: ");
		result.append(rotationalStiffnessY);
		result.append(", rotationalStiffnessZ: ");
		result.append(rotationalStiffnessZ);
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryNodeConditionImpl
