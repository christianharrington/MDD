/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryEdgeCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Edge Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthX <em>Linear Stiffness By Length X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthY <em>Linear Stiffness By Length Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getLinearStiffnessByLengthZ <em>Linear Stiffness By Length Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthX <em>Rotational Stiffness By Length X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthY <em>Rotational Stiffness By Length Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryEdgeConditionImpl#getRotationalStiffnessByLengthZ <em>Rotational Stiffness By Length Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryEdgeConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryEdgeCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthX() <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthX() <em>Linear Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByLengthX = LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthY() <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthY() <em>Linear Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByLengthY = LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessByLengthZ() <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByLengthZ() <em>Linear Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByLengthZ = LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthX() <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthX() <em>Rotational Stiffness By Length X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthX()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessByLengthX = ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthY() <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthY() <em>Rotational Stiffness By Length Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthY()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessByLengthY = ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalStiffnessByLengthZ() <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalStiffnessByLengthZ() <em>Rotational Stiffness By Length Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalStiffnessByLengthZ()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalStiffnessByLengthZ = ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryEdgeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBoundaryEdgeCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthX() {
		return linearStiffnessByLengthX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthX(Double newLinearStiffnessByLengthX) {
		Double oldLinearStiffnessByLengthX = linearStiffnessByLengthX;
		linearStiffnessByLengthX = newLinearStiffnessByLengthX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X, oldLinearStiffnessByLengthX, linearStiffnessByLengthX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthY() {
		return linearStiffnessByLengthY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthY(Double newLinearStiffnessByLengthY) {
		Double oldLinearStiffnessByLengthY = linearStiffnessByLengthY;
		linearStiffnessByLengthY = newLinearStiffnessByLengthY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y, oldLinearStiffnessByLengthY, linearStiffnessByLengthY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByLengthZ() {
		return linearStiffnessByLengthZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByLengthZ(Double newLinearStiffnessByLengthZ) {
		Double oldLinearStiffnessByLengthZ = linearStiffnessByLengthZ;
		linearStiffnessByLengthZ = newLinearStiffnessByLengthZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z, oldLinearStiffnessByLengthZ, linearStiffnessByLengthZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthX() {
		return rotationalStiffnessByLengthX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthX(Double newRotationalStiffnessByLengthX) {
		Double oldRotationalStiffnessByLengthX = rotationalStiffnessByLengthX;
		rotationalStiffnessByLengthX = newRotationalStiffnessByLengthX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X, oldRotationalStiffnessByLengthX, rotationalStiffnessByLengthX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthY() {
		return rotationalStiffnessByLengthY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthY(Double newRotationalStiffnessByLengthY) {
		Double oldRotationalStiffnessByLengthY = rotationalStiffnessByLengthY;
		rotationalStiffnessByLengthY = newRotationalStiffnessByLengthY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y, oldRotationalStiffnessByLengthY, rotationalStiffnessByLengthY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalStiffnessByLengthZ() {
		return rotationalStiffnessByLengthZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalStiffnessByLengthZ(Double newRotationalStiffnessByLengthZ) {
		Double oldRotationalStiffnessByLengthZ = rotationalStiffnessByLengthZ;
		rotationalStiffnessByLengthZ = newRotationalStiffnessByLengthZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z, oldRotationalStiffnessByLengthZ, rotationalStiffnessByLengthZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				return getLinearStiffnessByLengthX();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				return getLinearStiffnessByLengthY();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				return getLinearStiffnessByLengthZ();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				return getRotationalStiffnessByLengthX();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				return getRotationalStiffnessByLengthY();
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				return getRotationalStiffnessByLengthZ();
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
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				setLinearStiffnessByLengthX((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				setLinearStiffnessByLengthY((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				setLinearStiffnessByLengthZ((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				setRotationalStiffnessByLengthX((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				setRotationalStiffnessByLengthY((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				setRotationalStiffnessByLengthZ((Double)newValue);
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
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				setLinearStiffnessByLengthX(LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				setLinearStiffnessByLengthY(LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				setLinearStiffnessByLengthZ(LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				setRotationalStiffnessByLengthX(ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				setRotationalStiffnessByLengthY(ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				setRotationalStiffnessByLengthZ(ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT);
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
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_X:
				return LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT == null ? linearStiffnessByLengthX != null : !LINEAR_STIFFNESS_BY_LENGTH_X_EDEFAULT.equals(linearStiffnessByLengthX);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Y:
				return LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT == null ? linearStiffnessByLengthY != null : !LINEAR_STIFFNESS_BY_LENGTH_Y_EDEFAULT.equals(linearStiffnessByLengthY);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__LINEAR_STIFFNESS_BY_LENGTH_Z:
				return LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT == null ? linearStiffnessByLengthZ != null : !LINEAR_STIFFNESS_BY_LENGTH_Z_EDEFAULT.equals(linearStiffnessByLengthZ);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_X:
				return ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT == null ? rotationalStiffnessByLengthX != null : !ROTATIONAL_STIFFNESS_BY_LENGTH_X_EDEFAULT.equals(rotationalStiffnessByLengthX);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Y:
				return ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT == null ? rotationalStiffnessByLengthY != null : !ROTATIONAL_STIFFNESS_BY_LENGTH_Y_EDEFAULT.equals(rotationalStiffnessByLengthY);
			case FinalPackage.IFC_BOUNDARY_EDGE_CONDITION__ROTATIONAL_STIFFNESS_BY_LENGTH_Z:
				return ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT == null ? rotationalStiffnessByLengthZ != null : !ROTATIONAL_STIFFNESS_BY_LENGTH_Z_EDEFAULT.equals(rotationalStiffnessByLengthZ);
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
		result.append(" (linearStiffnessByLengthX: ");
		result.append(linearStiffnessByLengthX);
		result.append(", linearStiffnessByLengthY: ");
		result.append(linearStiffnessByLengthY);
		result.append(", linearStiffnessByLengthZ: ");
		result.append(linearStiffnessByLengthZ);
		result.append(", rotationalStiffnessByLengthX: ");
		result.append(rotationalStiffnessByLengthX);
		result.append(", rotationalStiffnessByLengthY: ");
		result.append(rotationalStiffnessByLengthY);
		result.append(", rotationalStiffnessByLengthZ: ");
		result.append(rotationalStiffnessByLengthZ);
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryEdgeConditionImpl
