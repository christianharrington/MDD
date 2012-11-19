/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember()
 * @model extendedMetaData="name='IfcRelConnectsStructuralMember' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsStructuralMember extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Structural Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structural Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structural Member</em>' containment reference.
	 * @see #setRelatingStructuralMember(RelatingStructuralMemberType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_RelatingStructuralMember()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingStructuralMember' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingStructuralMemberType getRelatingStructuralMember();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structural Member</em>' containment reference.
	 * @see #getRelatingStructuralMember()
	 * @generated
	 */
	void setRelatingStructuralMember(RelatingStructuralMemberType value);

	/**
	 * Returns the value of the '<em><b>Related Structural Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Connection</em>' containment reference.
	 * @see #setRelatedStructuralConnection(RelatedStructuralConnectionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_RelatedStructuralConnection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedStructuralConnection' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedStructuralConnectionType getRelatedStructuralConnection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Connection</em>' containment reference.
	 * @see #getRelatedStructuralConnection()
	 * @generated
	 */
	void setRelatedStructuralConnection(RelatedStructuralConnectionType value);

	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' containment reference.
	 * @see #setAppliedCondition(AppliedConditionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_AppliedCondition()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AppliedCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	AppliedConditionType getAppliedCondition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' containment reference.
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(AppliedConditionType value);

	/**
	 * Returns the value of the '<em><b>Additional Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Conditions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Conditions</em>' containment reference.
	 * @see #setAdditionalConditions(AdditionalConditionsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_AdditionalConditions()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='AdditionalConditions' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalConditionsType getAdditionalConditions();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Conditions</em>' containment reference.
	 * @see #getAdditionalConditions()
	 * @generated
	 */
	void setAdditionalConditions(AdditionalConditionsType value);

	/**
	 * Returns the value of the '<em><b>Supported Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Length</em>' attribute.
	 * @see #setSupportedLength(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_SupportedLength()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='SupportedLength' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSupportedLength();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Length</em>' attribute.
	 * @see #getSupportedLength()
	 * @generated
	 */
	void setSupportedLength(Double value);

	/**
	 * Returns the value of the '<em><b>Condition Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Coordinate System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Coordinate System</em>' containment reference.
	 * @see #setConditionCoordinateSystem(ConditionCoordinateSystemType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsStructuralMember_ConditionCoordinateSystem()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ConditionCoordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionCoordinateSystemType getConditionCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Coordinate System</em>' containment reference.
	 * @see #getConditionCoordinateSystem()
	 * @generated
	 */
	void setConditionCoordinateSystem(ConditionCoordinateSystemType value);

} // IfcRelConnectsStructuralMember
