/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointEccentricity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Connection Point Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPointEccentricityImpl#getEccentricityInX <em>Eccentricity In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPointEccentricityImpl#getEccentricityInY <em>Eccentricity In Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcConnectionPointEccentricityImpl#getEccentricityInZ <em>Eccentricity In Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcConnectionPointEccentricityImpl extends IfcConnectionPointGeometryImpl implements IfcConnectionPointEccentricity {
	/**
	 * The default value of the '{@link #getEccentricityInX() <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInX()
	 * @generated
	 * @ordered
	 */
	protected static final Double ECCENTRICITY_IN_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInX() <em>Eccentricity In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInX()
	 * @generated
	 * @ordered
	 */
	protected Double eccentricityInX = ECCENTRICITY_IN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getEccentricityInY() <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInY()
	 * @generated
	 * @ordered
	 */
	protected static final Double ECCENTRICITY_IN_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInY() <em>Eccentricity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInY()
	 * @generated
	 * @ordered
	 */
	protected Double eccentricityInY = ECCENTRICITY_IN_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getEccentricityInZ() <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double ECCENTRICITY_IN_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEccentricityInZ() <em>Eccentricity In Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEccentricityInZ()
	 * @generated
	 * @ordered
	 */
	protected Double eccentricityInZ = ECCENTRICITY_IN_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConnectionPointEccentricityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcConnectionPointEccentricity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInX() {
		return eccentricityInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInX(Double newEccentricityInX) {
		Double oldEccentricityInX = eccentricityInX;
		eccentricityInX = newEccentricityInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X, oldEccentricityInX, eccentricityInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInY() {
		return eccentricityInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInY(Double newEccentricityInY) {
		Double oldEccentricityInY = eccentricityInY;
		eccentricityInY = newEccentricityInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y, oldEccentricityInY, eccentricityInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getEccentricityInZ() {
		return eccentricityInZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEccentricityInZ(Double newEccentricityInZ) {
		Double oldEccentricityInZ = eccentricityInZ;
		eccentricityInZ = newEccentricityInZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z, oldEccentricityInZ, eccentricityInZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				return getEccentricityInX();
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				return getEccentricityInY();
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				return getEccentricityInZ();
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
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				setEccentricityInX((Double)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				setEccentricityInY((Double)newValue);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				setEccentricityInZ((Double)newValue);
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
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				setEccentricityInX(ECCENTRICITY_IN_X_EDEFAULT);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				setEccentricityInY(ECCENTRICITY_IN_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				setEccentricityInZ(ECCENTRICITY_IN_Z_EDEFAULT);
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
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_X:
				return ECCENTRICITY_IN_X_EDEFAULT == null ? eccentricityInX != null : !ECCENTRICITY_IN_X_EDEFAULT.equals(eccentricityInX);
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Y:
				return ECCENTRICITY_IN_Y_EDEFAULT == null ? eccentricityInY != null : !ECCENTRICITY_IN_Y_EDEFAULT.equals(eccentricityInY);
			case FinalPackage.IFC_CONNECTION_POINT_ECCENTRICITY__ECCENTRICITY_IN_Z:
				return ECCENTRICITY_IN_Z_EDEFAULT == null ? eccentricityInZ != null : !ECCENTRICITY_IN_Z_EDEFAULT.equals(eccentricityInZ);
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
		result.append(" (eccentricityInX: ");
		result.append(eccentricityInX);
		result.append(", eccentricityInY: ");
		result.append(eccentricityInY);
		result.append(", eccentricityInZ: ");
		result.append(eccentricityInZ);
		result.append(')');
		return result.toString();
	}

} //IfcConnectionPointEccentricityImpl
