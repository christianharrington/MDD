/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.impl.EntityImpl;

import org.tech.iai.ifc.xml.ifc._2x3.final_.CrossSectionReinforcementDefinitionsType;
import org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarRoleEnum;
import org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties;
import org.tech.iai.ifc.xml.ifc._2x3.final_.SectionDefinitionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.impl.IfcSectionReinforcementPropertiesImpl#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSectionReinforcementPropertiesImpl extends EntityImpl implements IfcSectionReinforcementProperties {
	/**
	 * The default value of the '{@link #getLongitudinalStartPosition() <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Double LONGITUDINAL_START_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalStartPosition() <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 * @ordered
	 */
	protected Double longitudinalStartPosition = LONGITUDINAL_START_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongitudinalEndPosition() <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Double LONGITUDINAL_END_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongitudinalEndPosition() <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 * @ordered
	 */
	protected Double longitudinalEndPosition = LONGITUDINAL_END_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransversePosition() <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePosition()
	 * @generated
	 * @ordered
	 */
	protected static final Double TRANSVERSE_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransversePosition() <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransversePosition()
	 * @generated
	 * @ordered
	 */
	protected Double transversePosition = TRANSVERSE_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReinforcementRole() <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementRole()
	 * @generated
	 * @ordered
	 */
	protected static final IfcReinforcingBarRoleEnum REINFORCEMENT_ROLE_EDEFAULT = IfcReinforcingBarRoleEnum.MAIN;

	/**
	 * The cached value of the '{@link #getReinforcementRole() <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReinforcementRole()
	 * @generated
	 * @ordered
	 */
	protected IfcReinforcingBarRoleEnum reinforcementRole = REINFORCEMENT_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSectionDefinition() <em>Section Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectionDefinition()
	 * @generated
	 * @ordered
	 */
	protected SectionDefinitionType sectionDefinition;

	/**
	 * The cached value of the '{@link #getCrossSectionReinforcementDefinitions() <em>Cross Section Reinforcement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrossSectionReinforcementDefinitions()
	 * @generated
	 * @ordered
	 */
	protected CrossSectionReinforcementDefinitionsType crossSectionReinforcementDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSectionReinforcementPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FinalPackage.eINSTANCE.getIfcSectionReinforcementProperties();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalStartPosition() {
		return longitudinalStartPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalStartPosition(Double newLongitudinalStartPosition) {
		Double oldLongitudinalStartPosition = longitudinalStartPosition;
		longitudinalStartPosition = newLongitudinalStartPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION, oldLongitudinalStartPosition, longitudinalStartPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getLongitudinalEndPosition() {
		return longitudinalEndPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudinalEndPosition(Double newLongitudinalEndPosition) {
		Double oldLongitudinalEndPosition = longitudinalEndPosition;
		longitudinalEndPosition = newLongitudinalEndPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION, oldLongitudinalEndPosition, longitudinalEndPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTransversePosition() {
		return transversePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransversePosition(Double newTransversePosition) {
		Double oldTransversePosition = transversePosition;
		transversePosition = newTransversePosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION, oldTransversePosition, transversePosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcReinforcingBarRoleEnum getReinforcementRole() {
		return reinforcementRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReinforcementRole(IfcReinforcingBarRoleEnum newReinforcementRole) {
		IfcReinforcingBarRoleEnum oldReinforcementRole = reinforcementRole;
		reinforcementRole = newReinforcementRole == null ? REINFORCEMENT_ROLE_EDEFAULT : newReinforcementRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE, oldReinforcementRole, reinforcementRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionDefinitionType getSectionDefinition() {
		return sectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSectionDefinition(SectionDefinitionType newSectionDefinition, NotificationChain msgs) {
		SectionDefinitionType oldSectionDefinition = sectionDefinition;
		sectionDefinition = newSectionDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, oldSectionDefinition, newSectionDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectionDefinition(SectionDefinitionType newSectionDefinition) {
		if (newSectionDefinition != sectionDefinition) {
			NotificationChain msgs = null;
			if (sectionDefinition != null)
				msgs = ((InternalEObject)sectionDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, null, msgs);
			if (newSectionDefinition != null)
				msgs = ((InternalEObject)newSectionDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, null, msgs);
			msgs = basicSetSectionDefinition(newSectionDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION, newSectionDefinition, newSectionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrossSectionReinforcementDefinitionsType getCrossSectionReinforcementDefinitions() {
		return crossSectionReinforcementDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCrossSectionReinforcementDefinitions(CrossSectionReinforcementDefinitionsType newCrossSectionReinforcementDefinitions, NotificationChain msgs) {
		CrossSectionReinforcementDefinitionsType oldCrossSectionReinforcementDefinitions = crossSectionReinforcementDefinitions;
		crossSectionReinforcementDefinitions = newCrossSectionReinforcementDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS, oldCrossSectionReinforcementDefinitions, newCrossSectionReinforcementDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrossSectionReinforcementDefinitions(CrossSectionReinforcementDefinitionsType newCrossSectionReinforcementDefinitions) {
		if (newCrossSectionReinforcementDefinitions != crossSectionReinforcementDefinitions) {
			NotificationChain msgs = null;
			if (crossSectionReinforcementDefinitions != null)
				msgs = ((InternalEObject)crossSectionReinforcementDefinitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS, null, msgs);
			if (newCrossSectionReinforcementDefinitions != null)
				msgs = ((InternalEObject)newCrossSectionReinforcementDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS, null, msgs);
			msgs = basicSetCrossSectionReinforcementDefinitions(newCrossSectionReinforcementDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS, newCrossSectionReinforcementDefinitions, newCrossSectionReinforcementDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				return basicSetSectionDefinition(null, msgs);
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				return basicSetCrossSectionReinforcementDefinitions(null, msgs);
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
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				return getLongitudinalStartPosition();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				return getLongitudinalEndPosition();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				return getTransversePosition();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				return getReinforcementRole();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				return getSectionDefinition();
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				return getCrossSectionReinforcementDefinitions();
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
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				setLongitudinalStartPosition((Double)newValue);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				setLongitudinalEndPosition((Double)newValue);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				setTransversePosition((Double)newValue);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				setReinforcementRole((IfcReinforcingBarRoleEnum)newValue);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				setSectionDefinition((SectionDefinitionType)newValue);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				setCrossSectionReinforcementDefinitions((CrossSectionReinforcementDefinitionsType)newValue);
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
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				setLongitudinalStartPosition(LONGITUDINAL_START_POSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				setLongitudinalEndPosition(LONGITUDINAL_END_POSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				setTransversePosition(TRANSVERSE_POSITION_EDEFAULT);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				setReinforcementRole(REINFORCEMENT_ROLE_EDEFAULT);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				setSectionDefinition((SectionDefinitionType)null);
				return;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				setCrossSectionReinforcementDefinitions((CrossSectionReinforcementDefinitionsType)null);
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
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_START_POSITION:
				return LONGITUDINAL_START_POSITION_EDEFAULT == null ? longitudinalStartPosition != null : !LONGITUDINAL_START_POSITION_EDEFAULT.equals(longitudinalStartPosition);
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__LONGITUDINAL_END_POSITION:
				return LONGITUDINAL_END_POSITION_EDEFAULT == null ? longitudinalEndPosition != null : !LONGITUDINAL_END_POSITION_EDEFAULT.equals(longitudinalEndPosition);
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__TRANSVERSE_POSITION:
				return TRANSVERSE_POSITION_EDEFAULT == null ? transversePosition != null : !TRANSVERSE_POSITION_EDEFAULT.equals(transversePosition);
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__REINFORCEMENT_ROLE:
				return reinforcementRole != REINFORCEMENT_ROLE_EDEFAULT;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__SECTION_DEFINITION:
				return sectionDefinition != null;
			case FinalPackage.IFC_SECTION_REINFORCEMENT_PROPERTIES__CROSS_SECTION_REINFORCEMENT_DEFINITIONS:
				return crossSectionReinforcementDefinitions != null;
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
		result.append(" (longitudinalStartPosition: ");
		result.append(longitudinalStartPosition);
		result.append(", longitudinalEndPosition: ");
		result.append(longitudinalEndPosition);
		result.append(", transversePosition: ");
		result.append(transversePosition);
		result.append(", reinforcementRole: ");
		result.append(reinforcementRole);
		result.append(')');
		return result.toString();
	}

} //IfcSectionReinforcementPropertiesImpl
