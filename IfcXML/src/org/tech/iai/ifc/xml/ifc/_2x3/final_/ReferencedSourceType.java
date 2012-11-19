/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedSourceType#getIfcClassification <em>Ifc Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getReferencedSourceType()
 * @model extendedMetaData="name='ReferencedSource_._type' kind='elementOnly'"
 * @generated
 */
public interface ReferencedSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Classification</em>' containment reference.
	 * @see #setIfcClassification(IfcClassification)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getReferencedSourceType_IfcClassification()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClassification getIfcClassification();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ReferencedSourceType#getIfcClassification <em>Ifc Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Classification</em>' containment reference.
	 * @see #getIfcClassification()
	 * @generated
	 */
	void setIfcClassification(IfcClassification value);

} // ReferencedSourceType
