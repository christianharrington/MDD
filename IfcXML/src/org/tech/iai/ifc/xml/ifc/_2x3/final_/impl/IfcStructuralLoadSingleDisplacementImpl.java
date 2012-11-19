/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadSingleDisplacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Single Displacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementX <em>Displacement X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementY <em>Displacement Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getDisplacementZ <em>Displacement Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRX <em>Rotational Displacement RX</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRY <em>Rotational Displacement RY</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadSingleDisplacementImpl#getRotationalDisplacementRZ <em>Rotational Displacement RZ</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadSingleDisplacementImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadSingleDisplacement {
	/**
	 * The default value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISPLACEMENT_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementX() <em>Displacement X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementX()
	 * @generated
	 * @ordered
	 */
	protected Double displacementX = DISPLACEMENT_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISPLACEMENT_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementY() <em>Displacement Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementY()
	 * @generated
	 * @ordered
	 */
	protected Double displacementY = DISPLACEMENT_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplacementZ() <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double DISPLACEMENT_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplacementZ() <em>Displacement Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplacementZ()
	 * @generated
	 * @ordered
	 */
	protected Double displacementZ = DISPLACEMENT_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRX() <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_DISPLACEMENT_RX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRX() <em>Rotational Displacement RX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRX()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalDisplacementRX = ROTATIONAL_DISPLACEMENT_RX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRY() <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_DISPLACEMENT_RY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRY() <em>Rotational Displacement RY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRY()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalDisplacementRY = ROTATIONAL_DISPLACEMENT_RY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotationalDisplacementRZ() <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRotationalDisplacementRZ() <em>Rotational Displacement RZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotationalDisplacementRZ()
	 * @generated
	 * @ordered
	 */
	protected Double rotationalDisplacementRZ = ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadSingleDisplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadSingleDisplacement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementX() {
		return displacementX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementX(Double newDisplacementX) {
		Double oldDisplacementX = displacementX;
		displacementX = newDisplacementX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X, oldDisplacementX, displacementX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementY() {
		return displacementY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementY(Double newDisplacementY) {
		Double oldDisplacementY = displacementY;
		displacementY = newDisplacementY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y, oldDisplacementY, displacementY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDisplacementZ() {
		return displacementZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplacementZ(Double newDisplacementZ) {
		Double oldDisplacementZ = displacementZ;
		displacementZ = newDisplacementZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z, oldDisplacementZ, displacementZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRX() {
		return rotationalDisplacementRX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRX(Double newRotationalDisplacementRX) {
		Double oldRotationalDisplacementRX = rotationalDisplacementRX;
		rotationalDisplacementRX = newRotationalDisplacementRX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX, oldRotationalDisplacementRX, rotationalDisplacementRX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRY() {
		return rotationalDisplacementRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRY(Double newRotationalDisplacementRY) {
		Double oldRotationalDisplacementRY = rotationalDisplacementRY;
		rotationalDisplacementRY = newRotationalDisplacementRY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY, oldRotationalDisplacementRY, rotationalDisplacementRY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getRotationalDisplacementRZ() {
		return rotationalDisplacementRZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotationalDisplacementRZ(Double newRotationalDisplacementRZ) {
		Double oldRotationalDisplacementRZ = rotationalDisplacementRZ;
		rotationalDisplacementRZ = newRotationalDisplacementRZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ, oldRotationalDisplacementRZ, rotationalDisplacementRZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				return getDisplacementX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				return getDisplacementY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				return getDisplacementZ();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				return getRotationalDisplacementRX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				return getRotationalDisplacementRY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				return getRotationalDisplacementRZ();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				setDisplacementX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				setDisplacementY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				setDisplacementZ((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				setRotationalDisplacementRX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				setRotationalDisplacementRY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				setRotationalDisplacementRZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				setDisplacementX(DISPLACEMENT_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				setDisplacementY(DISPLACEMENT_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				setDisplacementZ(DISPLACEMENT_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				setRotationalDisplacementRX(ROTATIONAL_DISPLACEMENT_RX_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				setRotationalDisplacementRY(ROTATIONAL_DISPLACEMENT_RY_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				setRotationalDisplacementRZ(ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_X:
				return DISPLACEMENT_X_EDEFAULT == null ? displacementX != null : !DISPLACEMENT_X_EDEFAULT.equals(displacementX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Y:
				return DISPLACEMENT_Y_EDEFAULT == null ? displacementY != null : !DISPLACEMENT_Y_EDEFAULT.equals(displacementY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__DISPLACEMENT_Z:
				return DISPLACEMENT_Z_EDEFAULT == null ? displacementZ != null : !DISPLACEMENT_Z_EDEFAULT.equals(displacementZ);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RX:
				return ROTATIONAL_DISPLACEMENT_RX_EDEFAULT == null ? rotationalDisplacementRX != null : !ROTATIONAL_DISPLACEMENT_RX_EDEFAULT.equals(rotationalDisplacementRX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RY:
				return ROTATIONAL_DISPLACEMENT_RY_EDEFAULT == null ? rotationalDisplacementRY != null : !ROTATIONAL_DISPLACEMENT_RY_EDEFAULT.equals(rotationalDisplacementRY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_SINGLE_DISPLACEMENT__ROTATIONAL_DISPLACEMENT_RZ:
				return ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT == null ? rotationalDisplacementRZ != null : !ROTATIONAL_DISPLACEMENT_RZ_EDEFAULT.equals(rotationalDisplacementRZ);
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
		result.append(" (displacementX: ");
		result.append(displacementX);
		result.append(", displacementY: ");
		result.append(displacementY);
		result.append(", displacementZ: ");
		result.append(displacementZ);
		result.append(", rotationalDisplacementRX: ");
		result.append(rotationalDisplacementRX);
		result.append(", rotationalDisplacementRY: ");
		result.append(rotationalDisplacementRY);
		result.append(", rotationalDisplacementRZ: ");
		result.append(rotationalDisplacementRZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadSingleDisplacementImpl
