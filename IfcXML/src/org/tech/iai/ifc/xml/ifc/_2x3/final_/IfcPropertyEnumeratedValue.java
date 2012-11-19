/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Property Enumerated Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeratedValue#getEnumerationValues <em>Enumeration Values</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyEnumeratedValue()
 * @model extendedMetaData="name='IfcPropertyEnumeratedValue' kind='elementOnly'"
 * @generated
 */
public interface IfcPropertyEnumeratedValue extends IfcSimpleProperty {
	/**
	 * Returns the value of the '<em><b>Enumeration Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Values</em>' containment reference.
	 * @see #setEnumerationValues(EnumerationValuesType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyEnumeratedValue_EnumerationValues()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EnumerationValues' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationValuesType1 getEnumerationValues();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeratedValue#getEnumerationValues <em>Enumeration Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Values</em>' containment reference.
	 * @see #getEnumerationValues()
	 * @generated
	 */
	void setEnumerationValues(EnumerationValuesType1 value);

	/**
	 * Returns the value of the '<em><b>Enumeration Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Reference</em>' containment reference.
	 * @see #setEnumerationReference(EnumerationReferenceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPropertyEnumeratedValue_EnumerationReference()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='EnumerationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumerationReferenceType getEnumerationReference();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPropertyEnumeratedValue#getEnumerationReference <em>Enumeration Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Reference</em>' containment reference.
	 * @see #getEnumerationReference()
	 * @generated
	 */
	void setEnumerationReference(EnumerationReferenceType value);

} // IfcPropertyEnumeratedValue
