/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcEnergyProperties;
import ifc2x3tc1.IfcEnergySequenceEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Energy Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcEnergyPropertiesImpl#getEnergySequence <em>Energy Sequence</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcEnergyPropertiesImpl#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}</li>
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
	protected static final IfcEnergySequenceEnum ENERGY_SEQUENCE_EDEFAULT = IfcEnergySequenceEnum.NULL;

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
	 * This is true if the Energy Sequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean energySequenceESet;

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
	 * This is true if the User Defined Energy Sequence attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedEnergySequenceESet;

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
		return Ifc2x3tc1Package.eINSTANCE.getIfcEnergyProperties();
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
		energySequence = newEnergySequence == null ? ENERGY_SEQUENCE_EDEFAULT : newEnergySequence;
		boolean oldEnergySequenceESet = energySequenceESet;
		energySequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE, oldEnergySequence, energySequence, !oldEnergySequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnergySequence() {
		IfcEnergySequenceEnum oldEnergySequence = energySequence;
		boolean oldEnergySequenceESet = energySequenceESet;
		energySequence = ENERGY_SEQUENCE_EDEFAULT;
		energySequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE, oldEnergySequence, ENERGY_SEQUENCE_EDEFAULT, oldEnergySequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnergySequence() {
		return energySequenceESet;
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
		boolean oldUserDefinedEnergySequenceESet = userDefinedEnergySequenceESet;
		userDefinedEnergySequenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE, oldUserDefinedEnergySequence, userDefinedEnergySequence, !oldUserDefinedEnergySequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedEnergySequence() {
		String oldUserDefinedEnergySequence = userDefinedEnergySequence;
		boolean oldUserDefinedEnergySequenceESet = userDefinedEnergySequenceESet;
		userDefinedEnergySequence = USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT;
		userDefinedEnergySequenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE, oldUserDefinedEnergySequence, USER_DEFINED_ENERGY_SEQUENCE_EDEFAULT, oldUserDefinedEnergySequenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedEnergySequence() {
		return userDefinedEnergySequenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				return getEnergySequence();
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
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
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				setEnergySequence((IfcEnergySequenceEnum)newValue);
				return;
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
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
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				unsetEnergySequence();
				return;
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				unsetUserDefinedEnergySequence();
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
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__ENERGY_SEQUENCE:
				return isSetEnergySequence();
			case Ifc2x3tc1Package.IFC_ENERGY_PROPERTIES__USER_DEFINED_ENERGY_SEQUENCE:
				return isSetUserDefinedEnergySequence();
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
		result.append(" (EnergySequence: ");
		if (energySequenceESet) result.append(energySequence); else result.append("<unset>");
		result.append(", UserDefinedEnergySequence: ");
		if (userDefinedEnergySequenceESet) result.append(userDefinedEnergySequence); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcEnergyPropertiesImpl
