/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Interaction Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements()
 * @model extendedMetaData="name='IfcRelInteractionRequirements' kind='elementOnly'"
 * @generated
 */
public interface IfcRelInteractionRequirements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Daily Interaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daily Interaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daily Interaction</em>' attribute.
	 * @see #setDailyInteraction(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements_DailyInteraction()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCountMeasureObject"
	 *        extendedMetaData="kind='element' name='DailyInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDailyInteraction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getDailyInteraction <em>Daily Interaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daily Interaction</em>' attribute.
	 * @see #getDailyInteraction()
	 * @generated
	 */
	void setDailyInteraction(Double value);

	/**
	 * Returns the value of the '<em><b>Importance Rating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Importance Rating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Importance Rating</em>' attribute.
	 * @see #setImportanceRating(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements_ImportanceRating()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='ImportanceRating' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getImportanceRating();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getImportanceRating <em>Importance Rating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Importance Rating</em>' attribute.
	 * @see #getImportanceRating()
	 * @generated
	 */
	void setImportanceRating(Double value);

	/**
	 * Returns the value of the '<em><b>Location Of Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location Of Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location Of Interaction</em>' containment reference.
	 * @see #setLocationOfInteraction(LocationOfInteractionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements_LocationOfInteraction()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocationOfInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationOfInteractionType getLocationOfInteraction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getLocationOfInteraction <em>Location Of Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location Of Interaction</em>' containment reference.
	 * @see #getLocationOfInteraction()
	 * @generated
	 */
	void setLocationOfInteraction(LocationOfInteractionType value);

	/**
	 * Returns the value of the '<em><b>Related Space Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Space Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Space Program</em>' containment reference.
	 * @see #setRelatedSpaceProgram(RelatedSpaceProgramType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements_RelatedSpaceProgram()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedSpaceProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedSpaceProgramType getRelatedSpaceProgram();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getRelatedSpaceProgram <em>Related Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Space Program</em>' containment reference.
	 * @see #getRelatedSpaceProgram()
	 * @generated
	 */
	void setRelatedSpaceProgram(RelatedSpaceProgramType value);

	/**
	 * Returns the value of the '<em><b>Relating Space Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Space Program</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Space Program</em>' containment reference.
	 * @see #setRelatingSpaceProgram(RelatingSpaceProgramType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelInteractionRequirements_RelatingSpaceProgram()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingSpaceProgram' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingSpaceProgramType getRelatingSpaceProgram();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelInteractionRequirements#getRelatingSpaceProgram <em>Relating Space Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Space Program</em>' containment reference.
	 * @see #getRelatingSpaceProgram()
	 * @generated
	 */
	void setRelatingSpaceProgram(RelatingSpaceProgramType value);

} // IfcRelInteractionRequirements
