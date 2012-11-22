/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Section Reinforcement Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getSectionDefinition <em>Section Definition</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties()
 * @model extendedMetaData="name='IfcSectionReinforcementProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcSectionReinforcementProperties extends Entity {
	/**
	 * Returns the value of the '<em><b>Longitudinal Start Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal Start Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal Start Position</em>' attribute.
	 * @see #setLongitudinalStartPosition(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_LongitudinalStartPosition()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='LongitudinalStartPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLongitudinalStartPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getLongitudinalStartPosition <em>Longitudinal Start Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal Start Position</em>' attribute.
	 * @see #getLongitudinalStartPosition()
	 * @generated
	 */
	void setLongitudinalStartPosition(Double value);

	/**
	 * Returns the value of the '<em><b>Longitudinal End Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longitudinal End Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitudinal End Position</em>' attribute.
	 * @see #setLongitudinalEndPosition(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_LongitudinalEndPosition()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='LongitudinalEndPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLongitudinalEndPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getLongitudinalEndPosition <em>Longitudinal End Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitudinal End Position</em>' attribute.
	 * @see #getLongitudinalEndPosition()
	 * @generated
	 */
	void setLongitudinalEndPosition(Double value);

	/**
	 * Returns the value of the '<em><b>Transverse Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transverse Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transverse Position</em>' attribute.
	 * @see #setTransversePosition(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_TransversePosition()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='TransversePosition' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTransversePosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getTransversePosition <em>Transverse Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transverse Position</em>' attribute.
	 * @see #getTransversePosition()
	 * @generated
	 */
	void setTransversePosition(Double value);

	/**
	 * Returns the value of the '<em><b>Reinforcement Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarRoleEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reinforcement Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reinforcement Role</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarRoleEnum
	 * @see #setReinforcementRole(IfcReinforcingBarRoleEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_ReinforcementRole()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ReinforcementRole' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcReinforcingBarRoleEnum getReinforcementRole();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getReinforcementRole <em>Reinforcement Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reinforcement Role</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcReinforcingBarRoleEnum
	 * @see #getReinforcementRole()
	 * @generated
	 */
	void setReinforcementRole(IfcReinforcingBarRoleEnum value);

	/**
	 * Returns the value of the '<em><b>Section Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Definition</em>' containment reference.
	 * @see #setSectionDefinition(SectionDefinitionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_SectionDefinition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SectionDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	SectionDefinitionType getSectionDefinition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getSectionDefinition <em>Section Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section Definition</em>' containment reference.
	 * @see #getSectionDefinition()
	 * @generated
	 */
	void setSectionDefinition(SectionDefinitionType value);

	/**
	 * Returns the value of the '<em><b>Cross Section Reinforcement Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Reinforcement Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Reinforcement Definitions</em>' containment reference.
	 * @see #setCrossSectionReinforcementDefinitions(CrossSectionReinforcementDefinitionsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionReinforcementProperties_CrossSectionReinforcementDefinitions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CrossSectionReinforcementDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossSectionReinforcementDefinitionsType getCrossSectionReinforcementDefinitions();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionReinforcementProperties#getCrossSectionReinforcementDefinitions <em>Cross Section Reinforcement Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Reinforcement Definitions</em>' containment reference.
	 * @see #getCrossSectionReinforcementDefinitions()
	 * @generated
	 */
	void setCrossSectionReinforcementDefinitions(CrossSectionReinforcementDefinitionsType value);

} // IfcSectionReinforcementProperties
