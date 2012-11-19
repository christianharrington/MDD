/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enclosure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.EnclosureType#getIfcBoundingBox <em>Ifc Bounding Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getEnclosureType()
 * @model extendedMetaData="name='Enclosure_._type' kind='elementOnly'"
 * @generated
 */
public interface EnclosureType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Bounding Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Bounding Box</em>' containment reference.
	 * @see #setIfcBoundingBox(IfcBoundingBox)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getEnclosureType_IfcBoundingBox()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcBoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcBoundingBox getIfcBoundingBox();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.EnclosureType#getIfcBoundingBox <em>Ifc Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Bounding Box</em>' containment reference.
	 * @see #getIfcBoundingBox()
	 * @generated
	 */
	void setIfcBoundingBox(IfcBoundingBox value);

} // EnclosureType
