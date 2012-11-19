/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadTemperature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Temperature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadTemperatureImpl#getDeltaTConstant <em>Delta TConstant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadTemperatureImpl#getDeltaTY <em>Delta TY</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadTemperatureImpl#getDeltaTZ <em>Delta TZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadTemperatureImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadTemperature {
	/**
	 * The default value of the '{@link #getDeltaTConstant() <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTConstant()
	 * @generated
	 * @ordered
	 */
	protected static final Double DELTA_TCONSTANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaTConstant() <em>Delta TConstant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTConstant()
	 * @generated
	 * @ordered
	 */
	protected Double deltaTConstant = DELTA_TCONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaTY() <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTY()
	 * @generated
	 * @ordered
	 */
	protected static final Double DELTA_TY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaTY() <em>Delta TY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTY()
	 * @generated
	 * @ordered
	 */
	protected Double deltaTY = DELTA_TY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeltaTZ() <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double DELTA_TZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeltaTZ() <em>Delta TZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeltaTZ()
	 * @generated
	 * @ordered
	 */
	protected Double deltaTZ = DELTA_TZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadTemperatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadTemperature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaTConstant() {
		return deltaTConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaTConstant(Double newDeltaTConstant) {
		Double oldDeltaTConstant = deltaTConstant;
		deltaTConstant = newDeltaTConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT, oldDeltaTConstant, deltaTConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaTY() {
		return deltaTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaTY(Double newDeltaTY) {
		Double oldDeltaTY = deltaTY;
		deltaTY = newDeltaTY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY, oldDeltaTY, deltaTY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDeltaTZ() {
		return deltaTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeltaTZ(Double newDeltaTZ) {
		Double oldDeltaTZ = deltaTZ;
		deltaTZ = newDeltaTZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ, oldDeltaTZ, deltaTZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				return getDeltaTConstant();
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				return getDeltaTY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				return getDeltaTZ();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				setDeltaTConstant((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				setDeltaTY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				setDeltaTZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				setDeltaTConstant(DELTA_TCONSTANT_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				setDeltaTY(DELTA_TY_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				setDeltaTZ(DELTA_TZ_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TCONSTANT:
				return DELTA_TCONSTANT_EDEFAULT == null ? deltaTConstant != null : !DELTA_TCONSTANT_EDEFAULT.equals(deltaTConstant);
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TY:
				return DELTA_TY_EDEFAULT == null ? deltaTY != null : !DELTA_TY_EDEFAULT.equals(deltaTY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_TEMPERATURE__DELTA_TZ:
				return DELTA_TZ_EDEFAULT == null ? deltaTZ != null : !DELTA_TZ_EDEFAULT.equals(deltaTZ);
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
		result.append(" (deltaTConstant: ");
		result.append(deltaTConstant);
		result.append(", deltaTY: ");
		result.append(deltaTY);
		result.append(", deltaTZ: ");
		result.append(deltaTZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadTemperatureImpl
