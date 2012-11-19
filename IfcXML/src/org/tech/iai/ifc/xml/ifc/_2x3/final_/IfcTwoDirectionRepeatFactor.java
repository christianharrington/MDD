/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTwoDirectionRepeatFactor()
 * @model extendedMetaData="name='IfcTwoDirectionRepeatFactor' kind='elementOnly'"
 * @generated
 */
public interface IfcTwoDirectionRepeatFactor extends IfcOneDirectionRepeatFactor {
	/**
	 * Returns the value of the '<em><b>Second Repeat Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Repeat Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Repeat Factor</em>' containment reference.
	 * @see #setSecondRepeatFactor(SecondRepeatFactorType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTwoDirectionRepeatFactor_SecondRepeatFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecondRepeatFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondRepeatFactorType getSecondRepeatFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Repeat Factor</em>' containment reference.
	 * @see #getSecondRepeatFactor()
	 * @generated
	 */
	void setSecondRepeatFactor(SecondRepeatFactorType value);

} // IfcTwoDirectionRepeatFactor
