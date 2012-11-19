/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Space Program Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceProgramType#getIfcSpaceProgram <em>Ifc Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedSpaceProgramType()
 * @model extendedMetaData="name='RelatedSpaceProgram_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedSpaceProgramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Space Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Space Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Space Program</em>' containment reference.
	 * @see #setIfcSpaceProgram(IfcSpaceProgram)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedSpaceProgramType_IfcSpaceProgram()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSpaceProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSpaceProgram getIfcSpaceProgram();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedSpaceProgramType#getIfcSpaceProgram <em>Ifc Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Space Program</em>' containment reference.
	 * @see #getIfcSpaceProgram()
	 * @generated
	 */
	void setIfcSpaceProgram(IfcSpaceProgram value);

} // RelatedSpaceProgramType
