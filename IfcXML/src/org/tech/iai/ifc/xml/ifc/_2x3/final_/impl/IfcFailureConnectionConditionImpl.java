/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFailureConnectionCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Failure Connection Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getTensionFailureX <em>Tension Failure X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getTensionFailureY <em>Tension Failure Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getTensionFailureZ <em>Tension Failure Z</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getCompressionFailureX <em>Compression Failure X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getCompressionFailureY <em>Compression Failure Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcFailureConnectionConditionImpl#getCompressionFailureZ <em>Compression Failure Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcFailureConnectionConditionImpl extends IfcStructuralConnectionConditionImpl implements IfcFailureConnectionCondition {
	/**
	 * The default value of the '{@link #getTensionFailureX() <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureX()
	 * @generated
	 * @ordered
	 */
	protected static final Double TENSION_FAILURE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureX() <em>Tension Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureX()
	 * @generated
	 * @ordered
	 */
	protected Double tensionFailureX = TENSION_FAILURE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getTensionFailureY() <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureY()
	 * @generated
	 * @ordered
	 */
	protected static final Double TENSION_FAILURE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureY() <em>Tension Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureY()
	 * @generated
	 * @ordered
	 */
	protected Double tensionFailureY = TENSION_FAILURE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getTensionFailureZ() <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double TENSION_FAILURE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTensionFailureZ() <em>Tension Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTensionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected Double tensionFailureZ = TENSION_FAILURE_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionFailureX() <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureX()
	 * @generated
	 * @ordered
	 */
	protected static final Double COMPRESSION_FAILURE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureX() <em>Compression Failure X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureX()
	 * @generated
	 * @ordered
	 */
	protected Double compressionFailureX = COMPRESSION_FAILURE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionFailureY() <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureY()
	 * @generated
	 * @ordered
	 */
	protected static final Double COMPRESSION_FAILURE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureY() <em>Compression Failure Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureY()
	 * @generated
	 * @ordered
	 */
	protected Double compressionFailureY = COMPRESSION_FAILURE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompressionFailureZ() <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double COMPRESSION_FAILURE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompressionFailureZ() <em>Compression Failure Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompressionFailureZ()
	 * @generated
	 * @ordered
	 */
	protected Double compressionFailureZ = COMPRESSION_FAILURE_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFailureConnectionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcFailureConnectionCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureX() {
		return tensionFailureX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureX(Double newTensionFailureX) {
		Double oldTensionFailureX = tensionFailureX;
		tensionFailureX = newTensionFailureX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X, oldTensionFailureX, tensionFailureX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureY() {
		return tensionFailureY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureY(Double newTensionFailureY) {
		Double oldTensionFailureY = tensionFailureY;
		tensionFailureY = newTensionFailureY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y, oldTensionFailureY, tensionFailureY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTensionFailureZ() {
		return tensionFailureZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTensionFailureZ(Double newTensionFailureZ) {
		Double oldTensionFailureZ = tensionFailureZ;
		tensionFailureZ = newTensionFailureZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z, oldTensionFailureZ, tensionFailureZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureX() {
		return compressionFailureX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureX(Double newCompressionFailureX) {
		Double oldCompressionFailureX = compressionFailureX;
		compressionFailureX = newCompressionFailureX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X, oldCompressionFailureX, compressionFailureX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureY() {
		return compressionFailureY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureY(Double newCompressionFailureY) {
		Double oldCompressionFailureY = compressionFailureY;
		compressionFailureY = newCompressionFailureY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y, oldCompressionFailureY, compressionFailureY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCompressionFailureZ() {
		return compressionFailureZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompressionFailureZ(Double newCompressionFailureZ) {
		Double oldCompressionFailureZ = compressionFailureZ;
		compressionFailureZ = newCompressionFailureZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z, oldCompressionFailureZ, compressionFailureZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				return getTensionFailureX();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				return getTensionFailureY();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				return getTensionFailureZ();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				return getCompressionFailureX();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				return getCompressionFailureY();
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				return getCompressionFailureZ();
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
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				setTensionFailureX((Double)newValue);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				setTensionFailureY((Double)newValue);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				setTensionFailureZ((Double)newValue);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				setCompressionFailureX((Double)newValue);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				setCompressionFailureY((Double)newValue);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				setCompressionFailureZ((Double)newValue);
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
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				setTensionFailureX(TENSION_FAILURE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				setTensionFailureY(TENSION_FAILURE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				setTensionFailureZ(TENSION_FAILURE_Z_EDEFAULT);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				setCompressionFailureX(COMPRESSION_FAILURE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				setCompressionFailureY(COMPRESSION_FAILURE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				setCompressionFailureZ(COMPRESSION_FAILURE_Z_EDEFAULT);
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
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_X:
				return TENSION_FAILURE_X_EDEFAULT == null ? tensionFailureX != null : !TENSION_FAILURE_X_EDEFAULT.equals(tensionFailureX);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Y:
				return TENSION_FAILURE_Y_EDEFAULT == null ? tensionFailureY != null : !TENSION_FAILURE_Y_EDEFAULT.equals(tensionFailureY);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__TENSION_FAILURE_Z:
				return TENSION_FAILURE_Z_EDEFAULT == null ? tensionFailureZ != null : !TENSION_FAILURE_Z_EDEFAULT.equals(tensionFailureZ);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_X:
				return COMPRESSION_FAILURE_X_EDEFAULT == null ? compressionFailureX != null : !COMPRESSION_FAILURE_X_EDEFAULT.equals(compressionFailureX);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Y:
				return COMPRESSION_FAILURE_Y_EDEFAULT == null ? compressionFailureY != null : !COMPRESSION_FAILURE_Y_EDEFAULT.equals(compressionFailureY);
			case FinalPackage.IFC_FAILURE_CONNECTION_CONDITION__COMPRESSION_FAILURE_Z:
				return COMPRESSION_FAILURE_Z_EDEFAULT == null ? compressionFailureZ != null : !COMPRESSION_FAILURE_Z_EDEFAULT.equals(compressionFailureZ);
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
		result.append(" (tensionFailureX: ");
		result.append(tensionFailureX);
		result.append(", tensionFailureY: ");
		result.append(tensionFailureY);
		result.append(", tensionFailureZ: ");
		result.append(tensionFailureZ);
		result.append(", compressionFailureX: ");
		result.append(compressionFailureX);
		result.append(", compressionFailureY: ");
		result.append(compressionFailureY);
		result.append(", compressionFailureZ: ");
		result.append(compressionFailureZ);
		result.append(')');
		return result.toString();
	}

} //IfcFailureConnectionConditionImpl
