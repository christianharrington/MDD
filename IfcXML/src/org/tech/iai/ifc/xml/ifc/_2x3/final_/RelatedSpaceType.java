/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Space Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceType#getIfcSpace <em>Ifc Space</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedSpaceType()
 * @model extendedMetaData="name='RelatedSpace_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedSpaceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Space</em>' containment reference.
	 * @see #setIfcSpace(IfcSpace)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedSpaceType_IfcSpace()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSpace getIfcSpace();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceType#getIfcSpace <em>Ifc Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Space</em>' containment reference.
	 * @see #getIfcSpace()
	 * @generated
	 */
	void setIfcSpace(IfcSpace value);

} // RelatedSpaceType
