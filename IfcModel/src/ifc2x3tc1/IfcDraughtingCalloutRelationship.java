/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Draughting Callout Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCalloutRelationship()
 * @model
 * @generated
 */
public interface IfcDraughtingCalloutRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCalloutRelationship_Name()
	 * @model unsettable="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #setDescription(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCalloutRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isSetDescription()
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getDescription <em>Description</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Description</em>' attribute is set.
	 * @see #unsetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	boolean isSetDescription();

	/**
	 * Returns the value of the '<em><b>Relating Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #setRelatingDraughtingCallout(IfcDraughtingCallout)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCalloutRelationship_RelatingDraughtingCallout()
	 * @see ifc2x3tc1.IfcDraughtingCallout#getIsRelatedToCallout
	 * @model opposite="IsRelatedToCallout"
	 * @generated
	 */
	IfcDraughtingCallout getRelatingDraughtingCallout();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Draughting Callout</em>' reference.
	 * @see #getRelatingDraughtingCallout()
	 * @generated
	 */
	void setRelatingDraughtingCallout(IfcDraughtingCallout value);

	/**
	 * Returns the value of the '<em><b>Related Draughting Callout</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Draughting Callout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #setRelatedDraughtingCallout(IfcDraughtingCallout)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCalloutRelationship_RelatedDraughtingCallout()
	 * @see ifc2x3tc1.IfcDraughtingCallout#getIsRelatedFromCallout
	 * @model opposite="IsRelatedFromCallout"
	 * @generated
	 */
	IfcDraughtingCallout getRelatedDraughtingCallout();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Draughting Callout</em>' reference.
	 * @see #getRelatedDraughtingCallout()
	 * @generated
	 */
	void setRelatedDraughtingCallout(IfcDraughtingCallout value);

} // IfcDraughtingCalloutRelationship
