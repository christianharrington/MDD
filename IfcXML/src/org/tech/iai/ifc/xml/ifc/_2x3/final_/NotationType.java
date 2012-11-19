/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.NotationType#getIfcClassificationNotationFacet <em>Ifc Classification Notation Facet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getNotationType()
 * @model extendedMetaData="name='Notation_._type' kind='elementOnly'"
 * @generated
 */
public interface NotationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Classification Notation Facet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Classification Notation Facet</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Classification Notation Facet</em>' containment reference.
	 * @see #setIfcClassificationNotationFacet(IfcClassificationNotationFacet)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getNotationType_IfcClassificationNotationFacet()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClassificationNotationFacet' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClassificationNotationFacet getIfcClassificationNotationFacet();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.NotationType#getIfcClassificationNotationFacet <em>Ifc Classification Notation Facet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Classification Notation Facet</em>' containment reference.
	 * @see #getIfcClassificationNotationFacet()
	 * @generated
	 */
	void setIfcClassificationNotationFacet(IfcClassificationNotationFacet value);

} // NotationType
