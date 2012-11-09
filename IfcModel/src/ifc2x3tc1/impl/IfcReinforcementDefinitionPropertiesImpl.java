/**
 */
package ifc2x3tc1.impl;

import ifc2x3tc1.Ifc2x3tc1Package;
import ifc2x3tc1.IfcReinforcementDefinitionProperties;
import ifc2x3tc1.IfcSectionReinforcementProperties;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Definition Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementDefinitionPropertiesImpl#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link ifc2x3tc1.impl.IfcReinforcementDefinitionPropertiesImpl#getReinforcementSectionDefinitions <em>Reinforcement Section Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcReinforcementDefinitionPropertiesImpl extends IfcPropertySetDefinitionImpl implements IfcReinforcementDefinitionProperties {
	/**
	 * The default value of the '{@link #getDefinitionType() <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionType()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitionType() <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionType()
	 * @generated
	 * @ordered
	 */
	protected String definitionType = DEFINITION_TYPE_EDEFAULT;

	/**
	 * This is true if the Definition Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definitionTypeESet;

	/**
	 * The cached value of the '{@link #getReinforcementSectionDefinitions() <em>Reinforcement Section Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementSectionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<IfcSectionReinforcementProperties> reinforcementSectionDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcReinforcementDefinitionPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.eINSTANCE.getIfcReinforcementDefinitionProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefinitionType() {
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionType(String newDefinitionType) {
		String oldDefinitionType = definitionType;
		definitionType = newDefinitionType;
		boolean oldDefinitionTypeESet = definitionTypeESet;
		definitionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE, oldDefinitionType, definitionType, !oldDefinitionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinitionType() {
		String oldDefinitionType = definitionType;
		boolean oldDefinitionTypeESet = definitionTypeESet;
		definitionType = DEFINITION_TYPE_EDEFAULT;
		definitionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE, oldDefinitionType, DEFINITION_TYPE_EDEFAULT, oldDefinitionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinitionType() {
		return definitionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions() {
		if (reinforcementSectionDefinitions == null) {
			reinforcementSectionDefinitions = new EObjectResolvingEList<IfcSectionReinforcementProperties>(IfcSectionReinforcementProperties.class, this, Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS);
		}
		return reinforcementSectionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				return getDefinitionType();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				return getReinforcementSectionDefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				setDefinitionType((String)newValue);
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				getReinforcementSectionDefinitions().clear();
				getReinforcementSectionDefinitions().addAll((Collection<? extends IfcSectionReinforcementProperties>)newValue);
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
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				unsetDefinitionType();
				return;
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				getReinforcementSectionDefinitions().clear();
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
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				return isSetDefinitionType();
			case Ifc2x3tc1Package.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				return reinforcementSectionDefinitions != null && !reinforcementSectionDefinitions.isEmpty();
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
		result.append(" (DefinitionType: ");
		if (definitionTypeESet) result.append(definitionType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //IfcReinforcementDefinitionPropertiesImpl
