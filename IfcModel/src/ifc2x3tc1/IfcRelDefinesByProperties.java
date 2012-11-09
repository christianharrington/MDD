/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Defines By Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefinesByProperties()
 * @model
 * @generated
 */
public interface IfcRelDefinesByProperties extends IfcRelDefines {
	/**
	 * Returns the value of the '<em><b>Relating Property Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPropertySetDefinition#getPropertyDefinitionOf <em>Property Definition Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Property Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Property Definition</em>' reference.
	 * @see #setRelatingPropertyDefinition(IfcPropertySetDefinition)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelDefinesByProperties_RelatingPropertyDefinition()
	 * @see ifc2x3tc1.IfcPropertySetDefinition#getPropertyDefinitionOf
	 * @model opposite="PropertyDefinitionOf"
	 * @generated
	 */
	IfcPropertySetDefinition getRelatingPropertyDefinition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelDefinesByProperties#getRelatingPropertyDefinition <em>Relating Property Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Property Definition</em>' reference.
	 * @see #getRelatingPropertyDefinition()
	 * @generated
	 */
	void setRelatingPropertyDefinition(IfcPropertySetDefinition value);

} // IfcRelDefinesByProperties
