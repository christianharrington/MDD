/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Pre Defined Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedItem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPreDefinedItem()
 * @model abstract="true"
 *        extendedMetaData="name='IfcPreDefinedItem' kind='elementOnly'"
 * @generated
 */
public interface IfcPreDefinedItem extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPreDefinedItem_Name()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPreDefinedItem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IfcPreDefinedItem