/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingItemType#getIfcClassificationItem <em>Ifc Classification Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingItemType()
 * @model extendedMetaData="name='RelatingItem_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Classification Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Classification Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Classification Item</em>' containment reference.
	 * @see #setIfcClassificationItem(IfcClassificationItem)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingItemType_IfcClassificationItem()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClassificationItem' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClassificationItem getIfcClassificationItem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingItemType#getIfcClassificationItem <em>Ifc Classification Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Classification Item</em>' containment reference.
	 * @see #getIfcClassificationItem()
	 * @generated
	 */
	void setIfcClassificationItem(IfcClassificationItem value);

} // RelatingItemType
