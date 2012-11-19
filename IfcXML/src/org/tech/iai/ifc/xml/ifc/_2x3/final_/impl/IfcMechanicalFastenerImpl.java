/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalFastener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Mechanical Fastener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalFastenerImpl#getNominalDiameter <em>Nominal Diameter</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcMechanicalFastenerImpl#getNominalLength <em>Nominal Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcMechanicalFastenerImpl extends IfcFastenerImpl implements IfcMechanicalFastener {
	/**
	 * The default value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected static final Double NOMINAL_DIAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalDiameter() <em>Nominal Diameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalDiameter()
	 * @generated
	 * @ordered
	 */
	protected Double nominalDiameter = NOMINAL_DIAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNominalLength() <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLength()
	 * @generated
	 * @ordered
	 */
	protected static final Double NOMINAL_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNominalLength() <em>Nominal Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNominalLength()
	 * @generated
	 * @ordered
	 */
	protected Double nominalLength = NOMINAL_LENGTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcMechanicalFastenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcMechanicalFastener();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalDiameter() {
		return nominalDiameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalDiameter(Double newNominalDiameter) {
		Double oldNominalDiameter = nominalDiameter;
		nominalDiameter = newNominalDiameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER, oldNominalDiameter, nominalDiameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getNominalLength() {
		return nominalLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNominalLength(Double newNominalLength) {
		Double oldNominalLength = nominalLength;
		nominalLength = newNominalLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH, oldNominalLength, nominalLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				return getNominalDiameter();
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				return getNominalLength();
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
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				setNominalDiameter((Double)newValue);
				return;
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				setNominalLength((Double)newValue);
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
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				setNominalDiameter(NOMINAL_DIAMETER_EDEFAULT);
				return;
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				setNominalLength(NOMINAL_LENGTH_EDEFAULT);
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
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_DIAMETER:
				return NOMINAL_DIAMETER_EDEFAULT == null ? nominalDiameter != null : !NOMINAL_DIAMETER_EDEFAULT.equals(nominalDiameter);
			case FinalPackage.IFC_MECHANICAL_FASTENER__NOMINAL_LENGTH:
				return NOMINAL_LENGTH_EDEFAULT == null ? nominalLength != null : !NOMINAL_LENGTH_EDEFAULT.equals(nominalLength);
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
		result.append(" (nominalDiameter: ");
		result.append(nominalDiameter);
		result.append(", nominalLength: ");
		result.append(nominalLength);
		result.append(')');
		return result.toString();
	}

} //IfcMechanicalFastenerImpl
