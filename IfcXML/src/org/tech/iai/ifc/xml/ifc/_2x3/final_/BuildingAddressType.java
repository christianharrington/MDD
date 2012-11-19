/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Building Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BuildingAddressType#getIfcPostalAddress <em>Ifc Postal Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBuildingAddressType()
 * @model extendedMetaData="name='BuildingAddress_._type' kind='elementOnly'"
 * @generated
 */
public interface BuildingAddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Postal Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Postal Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Postal Address</em>' containment reference.
	 * @see #setIfcPostalAddress(IfcPostalAddress)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBuildingAddressType_IfcPostalAddress()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPostalAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPostalAddress getIfcPostalAddress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BuildingAddressType#getIfcPostalAddress <em>Ifc Postal Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Postal Address</em>' containment reference.
	 * @see #getIfcPostalAddress()
	 * @generated
	 */
	void setIfcPostalAddress(IfcPostalAddress value);

} // BuildingAddressType
