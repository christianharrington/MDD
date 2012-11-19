/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoundaryFaceCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Boundary Face Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaX <em>Linear Stiffness By Area X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaY <em>Linear Stiffness By Area Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBoundaryFaceConditionImpl#getLinearStiffnessByAreaZ <em>Linear Stiffness By Area Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBoundaryFaceConditionImpl extends IfcBoundaryConditionImpl implements IfcBoundaryFaceCondition {
	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaX() <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaX() <em>Linear Stiffness By Area X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaX()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByAreaX = LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaY() <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaY() <em>Linear Stiffness By Area Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaY()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByAreaY = LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearStiffnessByAreaZ() <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearStiffnessByAreaZ() <em>Linear Stiffness By Area Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearStiffnessByAreaZ()
	 * @generated
	 * @ordered
	 */
	protected Double linearStiffnessByAreaZ = LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBoundaryFaceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBoundaryFaceCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaX() {
		return linearStiffnessByAreaX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaX(Double newLinearStiffnessByAreaX) {
		Double oldLinearStiffnessByAreaX = linearStiffnessByAreaX;
		linearStiffnessByAreaX = newLinearStiffnessByAreaX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X, oldLinearStiffnessByAreaX, linearStiffnessByAreaX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaY() {
		return linearStiffnessByAreaY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaY(Double newLinearStiffnessByAreaY) {
		Double oldLinearStiffnessByAreaY = linearStiffnessByAreaY;
		linearStiffnessByAreaY = newLinearStiffnessByAreaY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y, oldLinearStiffnessByAreaY, linearStiffnessByAreaY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearStiffnessByAreaZ() {
		return linearStiffnessByAreaZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearStiffnessByAreaZ(Double newLinearStiffnessByAreaZ) {
		Double oldLinearStiffnessByAreaZ = linearStiffnessByAreaZ;
		linearStiffnessByAreaZ = newLinearStiffnessByAreaZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z, oldLinearStiffnessByAreaZ, linearStiffnessByAreaZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				return getLinearStiffnessByAreaX();
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				return getLinearStiffnessByAreaY();
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				return getLinearStiffnessByAreaZ();
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
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				setLinearStiffnessByAreaX((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				setLinearStiffnessByAreaY((Double)newValue);
				return;
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				setLinearStiffnessByAreaZ((Double)newValue);
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
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				setLinearStiffnessByAreaX(LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				setLinearStiffnessByAreaY(LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				setLinearStiffnessByAreaZ(LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT);
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
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_X:
				return LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT == null ? linearStiffnessByAreaX != null : !LINEAR_STIFFNESS_BY_AREA_X_EDEFAULT.equals(linearStiffnessByAreaX);
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Y:
				return LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT == null ? linearStiffnessByAreaY != null : !LINEAR_STIFFNESS_BY_AREA_Y_EDEFAULT.equals(linearStiffnessByAreaY);
			case FinalPackage.IFC_BOUNDARY_FACE_CONDITION__LINEAR_STIFFNESS_BY_AREA_Z:
				return LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT == null ? linearStiffnessByAreaZ != null : !LINEAR_STIFFNESS_BY_AREA_Z_EDEFAULT.equals(linearStiffnessByAreaZ);
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
		result.append(" (linearStiffnessByAreaX: ");
		result.append(linearStiffnessByAreaX);
		result.append(", linearStiffnessByAreaY: ");
		result.append(linearStiffnessByAreaY);
		result.append(", linearStiffnessByAreaZ: ");
		result.append(linearStiffnessByAreaZ);
		result.append(')');
		return result.toString();
	}

} //IfcBoundaryFaceConditionImpl
