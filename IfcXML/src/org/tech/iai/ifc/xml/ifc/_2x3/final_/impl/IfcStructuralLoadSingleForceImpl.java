/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadSingleForce;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getForceX <em>Force X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getForceY <em>Force Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getForceZ <em>Force Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getMomentX <em>Moment X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getMomentY <em>Moment Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleForceImpl#getMomentZ <em>Moment Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleForce {
	/**
	 * The default value of the '{@link #getForceX() <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceX()
	 * @generated
	 * @ordered
	 */
	protected static final Double FORCE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceX() <em>Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceX()
	 * @generated
	 * @ordered
	 */
	protected Double forceX = FORCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceY() <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceY()
	 * @generated
	 * @ordered
	 */
	protected static final Double FORCE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceY() <em>Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceY()
	 * @generated
	 * @ordered
	 */
	protected Double forceY = FORCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceZ() <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double FORCE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceZ() <em>Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceZ()
	 * @generated
	 * @ordered
	 */
	protected Double forceZ = FORCE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentX() <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentX()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentX() <em>Moment X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentX()
	 * @generated
	 * @ordered
	 */
	protected Double momentX = MOMENT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentY() <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentY()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentY() <em>Moment Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentY()
	 * @generated
	 * @ordered
	 */
	protected Double momentY = MOMENT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getMomentZ() <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double MOMENT_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMomentZ() <em>Moment Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMomentZ()
	 * @generated
	 * @ordered
	 */
	protected Double momentZ = MOMENT_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadSingleForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceX() {
		return forceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceX(Double newForceX) {
		Double oldForceX = forceX;
		forceX = newForceX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X, oldForceX, forceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceY() {
		return forceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceY(Double newForceY) {
		Double oldForceY = forceY;
		forceY = newForceY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y, oldForceY, forceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getForceZ() {
		return forceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceZ(Double newForceZ) {
		Double oldForceZ = forceZ;
		forceZ = newForceZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z, oldForceZ, forceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentX() {
		return momentX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentX(Double newMomentX) {
		Double oldMomentX = momentX;
		momentX = newMomentX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X, oldMomentX, momentX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentY() {
		return momentY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentY(Double newMomentY) {
		Double oldMomentY = momentY;
		momentY = newMomentY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y, oldMomentY, momentY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMomentZ() {
		return momentZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMomentZ(Double newMomentZ) {
		Double oldMomentZ = momentZ;
		momentZ = newMomentZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z, oldMomentZ, momentZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				return getForceX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				return getForceY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				return getForceZ();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				return getMomentX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				return getMomentY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				return getMomentZ();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				setForceX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				setForceY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				setForceZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				setMomentX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				setMomentY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				setMomentZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				setForceX(FORCE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				setForceY(FORCE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				setForceZ(FORCE_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				setMomentX(MOMENT_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				setMomentY(MOMENT_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				setMomentZ(MOMENT_Z_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_X:
				return FORCE_X_EDEFAULT == null ? forceX != null : !FORCE_X_EDEFAULT.equals(forceX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Y:
				return FORCE_Y_EDEFAULT == null ? forceY != null : !FORCE_Y_EDEFAULT.equals(forceY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__FORCE_Z:
				return FORCE_Z_EDEFAULT == null ? forceZ != null : !FORCE_Z_EDEFAULT.equals(forceZ);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_X:
				return MOMENT_X_EDEFAULT == null ? momentX != null : !MOMENT_X_EDEFAULT.equals(momentX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Y:
				return MOMENT_Y_EDEFAULT == null ? momentY != null : !MOMENT_Y_EDEFAULT.equals(momentY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_FORCE__MOMENT_Z:
				return MOMENT_Z_EDEFAULT == null ? momentZ != null : !MOMENT_Z_EDEFAULT.equals(momentZ);
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
		result.append(" (forceX: ");
		result.append(forceX);
		result.append(", forceY: ");
		result.append(forceY);
		result.append(", forceZ: ");
		result.append(forceZ);
		result.append(", momentX: ");
		result.append(momentX);
		result.append(", momentY: ");
		result.append(momentY);
		result.append(", momentZ: ");
		result.append(momentZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleForceImpl
