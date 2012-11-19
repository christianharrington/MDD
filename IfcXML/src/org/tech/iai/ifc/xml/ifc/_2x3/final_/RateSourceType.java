/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RateSourceType#getIfcLibraryInformation <em>Ifc Library Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRateSourceType()
 * @model extendedMetaData="name='RateSource_._type' kind='elementOnly'"
 * @generated
 */
public interface RateSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Library Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Library Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Library Information</em>' containment reference.
	 * @see #setIfcLibraryInformation(IfcLibraryInformation)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRateSourceType_IfcLibraryInformation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLibraryInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLibraryInformation getIfcLibraryInformation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RateSourceType#getIfcLibraryInformation <em>Ifc Library Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Library Information</em>' containment reference.
	 * @see #getIfcLibraryInformation()
	 * @generated
	 */
	void setIfcLibraryInformation(IfcLibraryInformation value);

} // RateSourceType
