/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Monetary Unit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedMonetaryUnitType#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedMonetaryUnitType()
 * @model extendedMetaData="name='RelatedMonetaryUnit_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedMonetaryUnitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Monetary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Monetary Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Monetary Unit</em>' containment reference.
	 * @see #setIfcMonetaryUnit(IfcMonetaryUnit)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedMonetaryUnitType_IfcMonetaryUnit()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMonetaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMonetaryUnit getIfcMonetaryUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedMonetaryUnitType#getIfcMonetaryUnit <em>Ifc Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Monetary Unit</em>' containment reference.
	 * @see #getIfcMonetaryUnit()
	 * @generated
	 */
	void setIfcMonetaryUnit(IfcMonetaryUnit value);

} // RelatedMonetaryUnitType
