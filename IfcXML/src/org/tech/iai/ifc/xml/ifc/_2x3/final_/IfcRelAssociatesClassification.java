/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesClassification#getRelatingClassification <em>Relating Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesClassification()
 * @model extendedMetaData="name='IfcRelAssociatesClassification' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesClassification extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Classification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Classification</em>' containment reference.
	 * @see #setRelatingClassification(RelatingClassificationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesClassification_RelatingClassification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingClassificationType getRelatingClassification();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesClassification#getRelatingClassification <em>Relating Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Classification</em>' containment reference.
	 * @see #getRelatingClassification()
	 * @generated
	 */
	void setRelatingClassification(RelatingClassificationType value);

} // IfcRelAssociatesClassification
