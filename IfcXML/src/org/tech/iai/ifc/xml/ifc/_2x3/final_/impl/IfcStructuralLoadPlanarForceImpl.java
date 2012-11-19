/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralLoadPlanarForce;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Structural Load Planar Force</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceX <em>Planar Force X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceY <em>Planar Force Y</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcStructuralLoadPlanarForceImpl#getPlanarForceZ <em>Planar Force Z</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcStructuralLoadPlanarForceImpl extends IfcStructuralLoadStaticImpl implements IfcStructuralLoadPlanarForce {
	/**
	 * The default value of the '{@link #getPlanarForceX() <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceX()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLANAR_FORCE_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceX() <em>Planar Force X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceX()
	 * @generated
	 * @ordered
	 */
	protected Double planarForceX = PLANAR_FORCE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanarForceY() <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceY()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLANAR_FORCE_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceY() <em>Planar Force Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceY()
	 * @generated
	 * @ordered
	 */
	protected Double planarForceY = PLANAR_FORCE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlanarForceZ() <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZ()
	 * @generated
	 * @ordered
	 */
	protected static final Double PLANAR_FORCE_Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanarForceZ() <em>Planar Force Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanarForceZ()
	 * @generated
	 * @ordered
	 */
	protected Double planarForceZ = PLANAR_FORCE_Z_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcStructuralLoadPlanarForceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcStructuralLoadPlanarForce();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceX() {
		return planarForceX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceX(Double newPlanarForceX) {
		Double oldPlanarForceX = planarForceX;
		planarForceX = newPlanarForceX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X, oldPlanarForceX, planarForceX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceY() {
		return planarForceY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceY(Double newPlanarForceY) {
		Double oldPlanarForceY = planarForceY;
		planarForceY = newPlanarForceY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y, oldPlanarForceY, planarForceY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getPlanarForceZ() {
		return planarForceZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanarForceZ(Double newPlanarForceZ) {
		Double oldPlanarForceZ = planarForceZ;
		planarForceZ = newPlanarForceZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z, oldPlanarForceZ, planarForceZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				return getPlanarForceX();
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				return getPlanarForceY();
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				return getPlanarForceZ();
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				setPlanarForceX((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				setPlanarForceY((Double)newValue);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				setPlanarForceZ((Double)newValue);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				setPlanarForceX(PLANAR_FORCE_X_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				setPlanarForceY(PLANAR_FORCE_Y_EDEFAULT);
				return;
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				setPlanarForceZ(PLANAR_FORCE_Z_EDEFAULT);
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
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_X:
				return PLANAR_FORCE_X_EDEFAULT == null ? planarForceX != null : !PLANAR_FORCE_X_EDEFAULT.equals(planarForceX);
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Y:
				return PLANAR_FORCE_Y_EDEFAULT == null ? planarForceY != null : !PLANAR_FORCE_Y_EDEFAULT.equals(planarForceY);
			case FinalPackage.IFC_STRUCTURAL_LOAD_PLANAR_FORCE__PLANAR_FORCE_Z:
				return PLANAR_FORCE_Z_EDEFAULT == null ? planarForceZ != null : !PLANAR_FORCE_Z_EDEFAULT.equals(planarForceZ);
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
		result.append(" (planarForceX: ");
		result.append(planarForceX);
		result.append(", planarForceY: ");
		result.append(planarForceY);
		result.append(", planarForceZ: ");
		result.append(planarForceZ);
		result.append(')');
		return result.toString();
	}

} //IfcStructuralLoadPlanarForceImpl
