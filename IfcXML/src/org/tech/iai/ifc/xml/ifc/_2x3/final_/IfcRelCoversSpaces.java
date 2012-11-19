/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Covers Spaces</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversSpaces()
 * @model extendedMetaData="name='IfcRelCoversSpaces' kind='elementOnly'"
 * @generated
 */
public interface IfcRelCoversSpaces extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Related Space</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space</em>' containment reference.
	 * @see #setRelatedSpace(RelatedSpaceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversSpaces_RelatedSpace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedSpace' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedSpaceType getRelatedSpace();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversSpaces#getRelatedSpace <em>Related Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space</em>' containment reference.
	 * @see #getRelatedSpace()
	 * @generated
	 */
	void setRelatedSpace(RelatedSpaceType value);

	/**
	 * Returns the value of the '<em><b>Related Coverings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Coverings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Coverings</em>' containment reference.
	 * @see #setRelatedCoverings(RelatedCoveringsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelCoversSpaces_RelatedCoverings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedCoverings' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedCoveringsType getRelatedCoverings();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelCoversSpaces#getRelatedCoverings <em>Related Coverings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Coverings</em>' containment reference.
	 * @see #getRelatedCoverings()
	 * @generated
	 */
	void setRelatedCoverings(RelatedCoveringsType value);

} // IfcRelCoversSpaces
