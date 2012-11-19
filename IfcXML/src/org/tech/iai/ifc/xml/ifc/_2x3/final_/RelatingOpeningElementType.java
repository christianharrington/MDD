/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Opening Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingOpeningElementType#getIfcOpeningElement <em>Ifc Opening Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingOpeningElementType()
 * @model extendedMetaData="name='RelatingOpeningElement_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingOpeningElementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Opening Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Opening Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Opening Element</em>' containment reference.
	 * @see #setIfcOpeningElement(IfcOpeningElement)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingOpeningElementType_IfcOpeningElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcOpeningElement' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcOpeningElement getIfcOpeningElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingOpeningElementType#getIfcOpeningElement <em>Ifc Opening Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Opening Element</em>' containment reference.
	 * @see #getIfcOpeningElement()
	 * @generated
	 */
	void setIfcOpeningElement(IfcOpeningElement value);

} // RelatingOpeningElementType
