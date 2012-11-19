/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Item Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationItemRelationship()
 * @model extendedMetaData="name='IfcClassificationItemRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcClassificationItemRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Relating Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Item</em>' containment reference.
	 * @see #setRelatingItem(RelatingItemType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationItemRelationship_RelatingItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingItem' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingItemType getRelatingItem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItemRelationship#getRelatingItem <em>Relating Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Item</em>' containment reference.
	 * @see #getRelatingItem()
	 * @generated
	 */
	void setRelatingItem(RelatingItemType value);

	/**
	 * Returns the value of the '<em><b>Related Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Items</em>' containment reference.
	 * @see #setRelatedItems(RelatedItemsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationItemRelationship_RelatedItems()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedItems' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedItemsType getRelatedItems();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationItemRelationship#getRelatedItems <em>Related Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Items</em>' containment reference.
	 * @see #getRelatedItems()
	 * @generated
	 */
	void setRelatedItems(RelatedItemsType value);

} // IfcClassificationItemRelationship
