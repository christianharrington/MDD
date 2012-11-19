/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repeat Factor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepeatFactorType#getIfcVector <em>Ifc Vector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepeatFactorType()
 * @model extendedMetaData="name='RepeatFactor_._type' kind='elementOnly'"
 * @generated
 */
public interface RepeatFactorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Vector</em>' containment reference.
	 * @see #setIfcVector(IfcVector)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepeatFactorType_IfcVector()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcVector' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcVector getIfcVector();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepeatFactorType#getIfcVector <em>Ifc Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Vector</em>' containment reference.
	 * @see #getIfcVector()
	 * @generated
	 */
	void setIfcVector(IfcVector value);

} // RepeatFactorType
