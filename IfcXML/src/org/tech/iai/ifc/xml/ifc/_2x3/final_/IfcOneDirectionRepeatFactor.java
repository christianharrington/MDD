/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc One Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOneDirectionRepeatFactor#getRepeatFactor <em>Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOneDirectionRepeatFactor()
 * @model extendedMetaData="name='IfcOneDirectionRepeatFactor' kind='elementOnly'"
 * @generated
 */
public interface IfcOneDirectionRepeatFactor extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Repeat Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeat Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeat Factor</em>' containment reference.
	 * @see #setRepeatFactor(RepeatFactorType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOneDirectionRepeatFactor_RepeatFactor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RepeatFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	RepeatFactorType getRepeatFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOneDirectionRepeatFactor#getRepeatFactor <em>Repeat Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeat Factor</em>' containment reference.
	 * @see #getRepeatFactor()
	 * @generated
	 */
	void setRepeatFactor(RepeatFactorType value);

} // IfcOneDirectionRepeatFactor
