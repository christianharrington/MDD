/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBlock;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBlockImpl#getXLength <em>XLength</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBlockImpl#getYLength <em>YLength</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcBlockImpl#getZLength <em>ZLength</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcBlockImpl extends IfcCsgPrimitive3DImpl implements IfcBlock {
	/**
	 * The default value of the '{@link #getXLength() <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLength()
	 * @generated
	 * @ordered
	 */
	protected static final double XLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXLength() <em>XLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXLength()
	 * @generated
	 * @ordered
	 */
	protected double xLength = XLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYLength() <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLength()
	 * @generated
	 * @ordered
	 */
	protected static final double YLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYLength() <em>YLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYLength()
	 * @generated
	 * @ordered
	 */
	protected double yLength = YLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getZLength() <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLength()
	 * @generated
	 * @ordered
	 */
	protected static final double ZLENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getZLength() <em>ZLength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLength()
	 * @generated
	 * @ordered
	 */
	protected double zLength = ZLENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXLength() {
		return xLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXLength(double newXLength) {
		double oldXLength = xLength;
		xLength = newXLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BLOCK__XLENGTH, oldXLength, xLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYLength() {
		return yLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYLength(double newYLength) {
		double oldYLength = yLength;
		yLength = newYLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BLOCK__YLENGTH, oldYLength, yLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getZLength() {
		return zLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZLength(double newZLength) {
		double oldZLength = zLength;
		zLength = newZLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_BLOCK__ZLENGTH, oldZLength, zLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_BLOCK__XLENGTH:
				return getXLength();
			case FinalPackage.IFC_BLOCK__YLENGTH:
				return getYLength();
			case FinalPackage.IFC_BLOCK__ZLENGTH:
				return getZLength();
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
			case FinalPackage.IFC_BLOCK__XLENGTH:
				setXLength((Double)newValue);
				return;
			case FinalPackage.IFC_BLOCK__YLENGTH:
				setYLength((Double)newValue);
				return;
			case FinalPackage.IFC_BLOCK__ZLENGTH:
				setZLength((Double)newValue);
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
			case FinalPackage.IFC_BLOCK__XLENGTH:
				setXLength(XLENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_BLOCK__YLENGTH:
				setYLength(YLENGTH_EDEFAULT);
				return;
			case FinalPackage.IFC_BLOCK__ZLENGTH:
				setZLength(ZLENGTH_EDEFAULT);
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
			case FinalPackage.IFC_BLOCK__XLENGTH:
				return xLength != XLENGTH_EDEFAULT;
			case FinalPackage.IFC_BLOCK__YLENGTH:
				return yLength != YLENGTH_EDEFAULT;
			case FinalPackage.IFC_BLOCK__ZLENGTH:
				return zLength != ZLENGTH_EDEFAULT;
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
		result.append(" (xLength: ");
		result.append(xLength);
		result.append(", yLength: ");
		result.append(yLength);
		result.append(", zLength: ");
		result.append(zLength);
		result.append(')');
		return result.toString();
	}

} //IfcBlockImpl
