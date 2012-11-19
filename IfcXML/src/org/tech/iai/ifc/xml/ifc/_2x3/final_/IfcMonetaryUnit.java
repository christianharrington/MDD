/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Monetary Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryUnit#getCurrency <em>Currency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMonetaryUnit()
 * @model extendedMetaData="name='IfcMonetaryUnit' kind='elementOnly'"
 * @generated
 */
public interface IfcMonetaryUnit extends Entity {
	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyEnum
	 * @see #setCurrency(IfcCurrencyEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMonetaryUnit_Currency()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Currency' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCurrencyEnum getCurrency();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMonetaryUnit#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyEnum
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(IfcCurrencyEnum value);

} // IfcMonetaryUnit
