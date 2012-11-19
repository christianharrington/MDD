/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadLinearForce;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Linear Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearForceX <em>Linear Force X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearForceY <em>Linear Force Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearForceZ <em>Linear Force Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentX <em>Linear Moment X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentY <em>Linear Moment Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadLinearForceImpl#getLinearMomentZ <em>Linear Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadLinearForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadLinearForce {
	/**
	 * The default value of the '{@link #getLinearForceX() <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceX()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_FORCE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceX() <em>Linear Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceX()
	 * @generated
	 * @ordered
	 */
	protected Double linearForceX = LINEAR_FORCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearForceY() <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceY()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_FORCE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceY() <em>Linear Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceY()
	 * @generated
	 * @ordered
	 */
	protected Double linearForceY = LINEAR_FORCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearForceZ() <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_FORCE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearForceZ() <em>Linear Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearForceZ()
	 * @generated
	 * @ordered
	 */
	protected Double linearForceZ = LINEAR_FORCE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearMomentX() <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentX()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_MOMENT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentX() <em>Linear Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentX()
	 * @generated
	 * @ordered
	 */
	protected Double linearMomentX = LINEAR_MOMENT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearMomentY() <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentY()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_MOMENT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentY() <em>Linear Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentY()
	 * @generated
	 * @ordered
	 */
	protected Double linearMomentY = LINEAR_MOMENT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinearMomentZ() <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double LINEAR_MOMENT_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinearMomentZ() <em>Linear Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearMomentZ()
	 * @generated
	 * @ordered
	 */
	protected Double linearMomentZ = LINEAR_MOMENT_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadLinearForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadLinearForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceX() {
		return linearForceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceX(Double newLinearForceX) {
		Double oldLinearForceX = linearForceX;
		linearForceX = newLinearForceX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X, oldLinearForceX, linearForceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceY() {
		return linearForceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceY(Double newLinearForceY) {
		Double oldLinearForceY = linearForceY;
		linearForceY = newLinearForceY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y, oldLinearForceY, linearForceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearForceZ() {
		return linearForceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearForceZ(Double newLinearForceZ) {
		Double oldLinearForceZ = linearForceZ;
		linearForceZ = newLinearForceZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z, oldLinearForceZ, linearForceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentX() {
		return linearMomentX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentX(Double newLinearMomentX) {
		Double oldLinearMomentX = linearMomentX;
		linearMomentX = newLinearMomentX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X, oldLinearMomentX, linearMomentX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentY() {
		return linearMomentY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentY(Double newLinearMomentY) {
		Double oldLinearMomentY = linearMomentY;
		linearMomentY = newLinearMomentY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y, oldLinearMomentY, linearMomentY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLinearMomentZ() {
		return linearMomentZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinearMomentZ(Double newLinearMomentZ) {
		Double oldLinearMomentZ = linearMomentZ;
		linearMomentZ = newLinearMomentZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z, oldLinearMomentZ, linearMomentZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				return getLinearForceX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				return getLinearForceY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				return getLinearForceZ();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				return getLinearMomentX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				return getLinearMomentY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				return getLinearMomentZ();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				setLinearForceX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				setLinearForceY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				setLinearForceZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				setLinearMomentX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				setLinearMomentY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				setLinearMomentZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				setLinearForceX(LINEAR_FORCE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				setLinearForceY(LINEAR_FORCE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				setLinearForceZ(LINEAR_FORCE_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				setLinearMomentX(LINEAR_MOMENT_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				setLinearMomentY(LINEAR_MOMENT_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				setLinearMomentZ(LINEAR_MOMENT_Z_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_X:
				return LINEAR_FORCE_X_EDEFAULT == null ? linearForceX != null : !LINEAR_FORCE_X_EDEFAULT.equals(linearForceX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Y:
				return LINEAR_FORCE_Y_EDEFAULT == null ? linearForceY != null : !LINEAR_FORCE_Y_EDEFAULT.equals(linearForceY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_FORCE_Z:
				return LINEAR_FORCE_Z_EDEFAULT == null ? linearForceZ != null : !LINEAR_FORCE_Z_EDEFAULT.equals(linearForceZ);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_X:
				return LINEAR_MOMENT_X_EDEFAULT == null ? linearMomentX != null : !LINEAR_MOMENT_X_EDEFAULT.equals(linearMomentX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Y:
				return LINEAR_MOMENT_Y_EDEFAULT == null ? linearMomentY != null : !LINEAR_MOMENT_Y_EDEFAULT.equals(linearMomentY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_LINEAR_FORCE__LINEAR_MOMENT_Z:
				return LINEAR_MOMENT_Z_EDEFAULT == null ? linearMomentZ != null : !LINEAR_MOMENT_Z_EDEFAULT.equals(linearMomentZ);
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
		result.append(" (linearForceX: ");
		result.append(linearForceX);
		result.append(", linearForceY: ");
		result.append(linearForceY);
		result.append(", linearForceZ: ");
		result.append(linearForceZ);
		result.append(", linearMomentX: ");
		result.append(linearMomentX);
		result.append(", linearMomentY: ");
		result.append(linearMomentY);
		result.append(", linearMomentZ: ");
		result.append(linearMomentZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadLinearForceImpl
