/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Reinforcement Definition Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcReinforcementDefinitionProperties#getReinforcementSectionDefinitions <em>Reinforcement Section Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcReinforcementDefinitionProperties()
 * @model
 * @generated
 */
public interface IfcReinforcementDefinitionProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Definition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Type</em>' attribute.
	 * @see #isSetDefinitionType()
	 * @see #unsetDefinitionType()
	 * @see #setDefinitionType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcReinforcementDefinitionProperties_DefinitionType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDefinitionType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition Type</em>' attribute.
	 * @see #isSetDefinitionType()
	 * @see #unsetDefinitionType()
	 * @see #getDefinitionType()
	 * @generated
	 */
	void setDefinitionType(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinitionType()
	 * @see #getDefinitionType()
	 * @see #setDefinitionType(String)
	 * @generated
	 */
	void unsetDefinitionType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcReinforcementDefinitionProperties#getDefinitionType <em>Definition Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition Type</em>' attribute is set.
	 * @see #unsetDefinitionType()
	 * @see #getDefinitionType()
	 * @see #setDefinitionType(String)
	 * @generated
	 */
	boolean isSetDefinitionType();

	/**
	 * Returns the value of the '<em><b>Reinforcement Section Definitions</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcSectionReinforcementProperties}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reinforcement Section Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reinforcement Section Definitions</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcReinforcementDefinitionProperties_ReinforcementSectionDefinitions()
	 * @model
	 * @generated
	 */
	EList<IfcSectionReinforcementProperties> getReinforcementSectionDefinitions();

} // IfcReinforcementDefinitionProperties
