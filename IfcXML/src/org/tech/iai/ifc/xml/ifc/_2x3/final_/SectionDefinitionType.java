/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SectionDefinitionType#getIfcSectionProperties <em>Ifc Section Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSectionDefinitionType()
 * @model extendedMetaData="name='SectionDefinition_._type' kind='elementOnly'"
 * @generated
 */
public interface SectionDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Section Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Section Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Section Properties</em>' containment reference.
	 * @see #setIfcSectionProperties(IfcSectionProperties)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSectionDefinitionType_IfcSectionProperties()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSectionProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSectionProperties getIfcSectionProperties();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SectionDefinitionType#getIfcSectionProperties <em>Ifc Section Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Section Properties</em>' containment reference.
	 * @see #getIfcSectionProperties()
	 * @generated
	 */
	void setIfcSectionProperties(IfcSectionProperties value);

} // SectionDefinitionType
