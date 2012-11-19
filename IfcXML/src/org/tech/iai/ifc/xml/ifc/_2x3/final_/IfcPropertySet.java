/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySet#getHasProperties <em>Has Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertySet()
 * @model extendedMetaData="name='IfcPropertySet' kind='elementOnly'"
 * @generated
 */
public interface IfcPropertySet extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Has Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Properties</em>' containment reference.
	 * @see #setHasProperties(HasPropertiesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertySet_HasProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HasProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	HasPropertiesType getHasProperties();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertySet#getHasProperties <em>Has Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Properties</em>' containment reference.
	 * @see #getHasProperties()
	 * @generated
	 */
	void setHasProperties(HasPropertiesType value);

} // IfcPropertySet
