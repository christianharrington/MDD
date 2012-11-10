/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Set Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertySetDefinition()
 * @model
 * @generated
 */
public interface IfcPropertySetDefinition extends IfcPropertyDefinition {
	/**
	 * Returns the value of the '<em><b>Property Definition Of</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcRelDefinesByProperties}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Definition Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Definition Of</em>' reference list.
	 * @see #isSetPropertyDefinitionOf()
	 * @see #unsetPropertyDefinitionOf()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertySetDefinition_PropertyDefinitionOf()
	 * @see ifc2x3tc1.IfcRelDefinesByProperties#getRelatingPropertyDefinition
	 * @model opposite="RelatingPropertyDefinition" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcRelDefinesByProperties> getPropertyDefinitionOf();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPropertyDefinitionOf()
	 * @see #getPropertyDefinitionOf()
	 * @generated
	 */
	void unsetPropertyDefinitionOf();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Property Definition Of</em>' reference list is set.
	 * @see #unsetPropertyDefinitionOf()
	 * @see #getPropertyDefinitionOf()
	 * @generated
	 */
	boolean isSetPropertyDefinitionOf();

	/**
	 * Returns the value of the '<em><b>Defines Type</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcTypeObject}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcTypeObject#getHasPropertySets <em>Has Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines Type</em>' reference list.
	 * @see #isSetDefinesType()
	 * @see #unsetDefinesType()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPropertySetDefinition_DefinesType()
	 * @see ifc2x3tc1.IfcTypeObject#getHasPropertySets
	 * @model opposite="HasPropertySets" unsettable="true" upper="2"
	 * @generated
	 */
	EList<IfcTypeObject> getDefinesType();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinesType()
	 * @see #getDefinesType()
	 * @generated
	 */
	void unsetDefinesType();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPropertySetDefinition#getDefinesType <em>Defines Type</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Defines Type</em>' reference list is set.
	 * @see #unsetDefinesType()
	 * @see #getDefinesType()
	 * @generated
	 */
	boolean isSetDefinesType();

} // IfcPropertySetDefinition
