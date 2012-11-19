/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcementDefinitionProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.ReinforcementSectionDefinitionsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Reinforcement Definition Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementDefinitionPropertiesImpl#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcReinforcementDefinitionPropertiesImpl#getReinforcementSectionDefinitions <em>Reinforcement Section Definitions</em>}</li>
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
	 * The cached value of the '{@link #getReinforcementSectionDefinitions() <em>Reinforcement Section Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementSectionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected ReinforcementSectionDefinitionsType reinforcementSectionDefinitions;

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
		return FinalPackage.eINSTANCE.getIfcReinforcementDefinitionProperties();
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE, oldDefinitionType, definitionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReinforcementSectionDefinitionsType getReinforcementSectionDefinitions() {
		return reinforcementSectionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReinforcementSectionDefinitions(ReinforcementSectionDefinitionsType newReinforcementSectionDefinitions, NotificationChain msgs) {
		ReinforcementSectionDefinitionsType oldReinforcementSectionDefinitions = reinforcementSectionDefinitions;
		reinforcementSectionDefinitions = newReinforcementSectionDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS, oldReinforcementSectionDefinitions, newReinforcementSectionDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReinforcementSectionDefinitions(ReinforcementSectionDefinitionsType newReinforcementSectionDefinitions) {
		if (newReinforcementSectionDefinitions != reinforcementSectionDefinitions) {
			NotificationChain msgs = null;
			if (reinforcementSectionDefinitions != null)
				msgs = ((InternalEObject)reinforcementSectionDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS, null, msgs);
			if (newReinforcementSectionDefinitions != null)
				msgs = ((InternalEObject)newReinforcementSectionDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS, null, msgs);
			msgs = basicSetReinforcementSectionDefinitions(newReinforcementSectionDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS, newReinforcementSectionDefinitions, newReinforcementSectionDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				return basicSetReinforcementSectionDefinitions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				return getDefinitionType();
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				return getReinforcementSectionDefinitions();
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
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				setDefinitionType((String)newValue);
				return;
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				setReinforcementSectionDefinitions((ReinforcementSectionDefinitionsType)newValue);
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
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				setDefinitionType(DEFINITION_TYPE_EDEFAULT);
				return;
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				setReinforcementSectionDefinitions((ReinforcementSectionDefinitionsType)null);
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
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__DEFINITION_TYPE:
				return DEFINITION_TYPE_EDEFAULT == null ? definitionType != null : !DEFINITION_TYPE_EDEFAULT.equals(definitionType);
			case FinalPackage.IFC_REINFORCEMENT_DEFINITION_PROPERTIES__REINFORCEMENT_SECTION_DEFINITIONS:
				return reinforcementSectionDefinitions != null;
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
		result.append(" (definitionType: ");
		result.append(definitionType);
		result.append(')');
		return result.toString();
	}

} //IfcReinforcementDefinitionPropertiesImpl
