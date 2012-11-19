/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Style Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationStyleAssignment#getStyles <em>Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationStyleAssignment()
 * @model extendedMetaData="name='IfcPresentationStyleAssignment' kind='elementOnly'"
 * @generated
 */
public interface IfcPresentationStyleAssignment extends Entity {
	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference.
	 * @see #setStyles(StylesType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationStyleAssignment_Styles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Styles' namespace='##targetNamespace'"
	 * @generated
	 */
	StylesType1 getStyles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationStyleAssignment#getStyles <em>Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styles</em>' containment reference.
	 * @see #getStyles()
	 * @generated
	 */
	void setStyles(StylesType1 value);

} // IfcPresentationStyleAssignment
