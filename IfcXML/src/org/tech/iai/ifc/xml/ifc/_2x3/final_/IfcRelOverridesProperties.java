/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Overrides Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelOverridesProperties#getOverridingProperties <em>Overriding Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelOverridesProperties()
 * @model extendedMetaData="name='IfcRelOverridesProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcRelOverridesProperties extends IfcRelDefinesByProperties {
	/**
	 * Returns the value of the '<em><b>Overriding Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overriding Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding Properties</em>' containment reference.
	 * @see #setOverridingProperties(OverridingPropertiesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelOverridesProperties_OverridingProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OverridingProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	OverridingPropertiesType getOverridingProperties();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelOverridesProperties#getOverridingProperties <em>Overriding Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overriding Properties</em>' containment reference.
	 * @see #getOverridingProperties()
	 * @generated
	 */
	void setOverridingProperties(OverridingPropertiesType value);

} // IfcRelOverridesProperties
