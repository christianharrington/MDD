/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlanarExtent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Planar Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPlanarExtentImpl#getSizeInX <em>Size In X</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcPlanarExtentImpl#getSizeInY <em>Size In Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcPlanarExtentImpl extends IfcGeometricRepresentationItemImpl implements IfcPlanarExtent {
	/**
	 * The default value of the '{@link #getSizeInX() <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SIZE_IN_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeInX() <em>Size In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInX()
	 * @generated
	 * @ordered
	 */
	protected Double sizeInX = SIZE_IN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeInY() <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SIZE_IN_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeInY() <em>Size In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInY()
	 * @generated
	 * @ordered
	 */
	protected Double sizeInY = SIZE_IN_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPlanarExtentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcPlanarExtent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSizeInX() {
		return sizeInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInX(Double newSizeInX) {
		Double oldSizeInX = sizeInX;
		sizeInX = newSizeInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_X, oldSizeInX, sizeInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getSizeInY() {
		return sizeInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInY(Double newSizeInY) {
		Double oldSizeInY = sizeInY;
		sizeInY = newSizeInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_Y, oldSizeInY, sizeInY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_X:
				return getSizeInX();
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				return getSizeInY();
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
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_X:
				setSizeInX((Double)newValue);
				return;
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				setSizeInY((Double)newValue);
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
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_X:
				setSizeInX(SIZE_IN_X_EDEFAULT);
				return;
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				setSizeInY(SIZE_IN_Y_EDEFAULT);
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
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_X:
				return SIZE_IN_X_EDEFAULT == null ? sizeInX != null : !SIZE_IN_X_EDEFAULT.equals(sizeInX);
			case FinalPackage.IFC_PLANAR_EXTENT__SIZE_IN_Y:
				return SIZE_IN_Y_EDEFAULT == null ? sizeInY != null : !SIZE_IN_Y_EDEFAULT.equals(sizeInY);
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
		result.append(" (sizeInX: ");
		result.append(sizeInX);
		result.append(", sizeInY: ");
		result.append(sizeInY);
		result.append(')');
		return result.toString();
	}

} //IfcPlanarExtentImpl
