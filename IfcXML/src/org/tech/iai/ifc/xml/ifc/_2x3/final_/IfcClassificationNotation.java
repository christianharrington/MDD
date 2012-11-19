/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationNotation()
 * @model extendedMetaData="name='IfcClassificationNotation' kind='elementOnly'"
 * @generated
 */
public interface IfcClassificationNotation extends Entity {
	/**
	 * Returns the value of the '<em><b>Notation Facets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notation Facets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notation Facets</em>' containment reference.
	 * @see #setNotationFacets(NotationFacetsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationNotation_NotationFacets()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NotationFacets' namespace='##targetNamespace'"
	 * @generated
	 */
	NotationFacetsType getNotationFacets();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotation#getNotationFacets <em>Notation Facets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notation Facets</em>' containment reference.
	 * @see #getNotationFacets()
	 * @generated
	 */
	void setNotationFacets(NotationFacetsType value);

} // IfcClassificationNotation
