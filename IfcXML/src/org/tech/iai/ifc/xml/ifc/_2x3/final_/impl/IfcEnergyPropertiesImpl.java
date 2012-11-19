/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEnergyProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEnergySequenceEnum;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Energy Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEnergyPropertiesImpl#getEnergySequence <em>Energy Sequence</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcEnergyPropertiesImpl#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcEnergyPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcEnergyProperties {
	/**
	 * The default value of the '{@link #getEnergySequence() <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergySequence()
	 * @generated
	 * @ordered
	 */
	protected static final IfcEnergySequenceEnum ENERGY_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnergySequence() <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergySequence()
	 * @generated
	 * @ordered
	 */
	protected IfcEnergySequenceEnum energySequence = ENERGY_SEQUENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserDefinedEnergySequence() <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedEnergySequence()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserDefinedEnergySequence() <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedEnergySequence()
	 * @generated
	 * @ordered
	 */
	protected String userDefinedEnergySequence = USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnergyPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcEnergyProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcEnergySequenceEnum getEnergySequence() {
		return energySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnergySequence(IfcEnergySequenceEnum newEnergySequence) {
		IfcEnergySequenceEnum oldEnergySequence = energySequence;
		energySequence = newEnergySequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE, oldEnergySequence, energySequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserDefinedEnergySequence() {
		return userDefinedEnergySequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedEnergySequence(String newUserDefinedEnergySequence) {
		String oldUserDefinedEnergySequence = userDefinedEnergySequence;
		userDefinedEnergySequence = newUserDefinedEnergySequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE, oldUserDefinedEnergySequence, userDefinedEnergySequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				return getEnergySequence();
			case FinalPackage.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				return getUserDefinedEnergySequence();
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
			case FinalPackage.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				setEnergySequence((IfcEnergySequenceEnum)newValue);
				return;
			case FinalPackage.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				setUserDefinedEnergySequence((String)newValue);
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
			case FinalPackage.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				setEnergySequence(ENERGY_SEQUENCE_EDEFAULT);
				return;
			case FinalPackage.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				setUserDefinedEnergySequence(USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT);
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
			case FinalPackage.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				return ENERGY_SEQUENCE_EDEFAULT == null ? energySequence != null : !ENERGY_SEQUENCE_EDEFAULT.equals(energySequence);
			case FinalPackage.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				return USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT == null ? userDefinedEnergySequence != null : !USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT.equals(userDefinedEnergySequence);
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
		result.append(" (energySequence: ");
		result.append(energySequence);
		result.append(", userDefinedEnergySequence: ");
		result.append(userDefinedEnergySequence);
		result.append(')');
		return result.toString();
	}

} //IfcEnergyPropertiesImpl
