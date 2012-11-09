/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Draughting Callout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCallout#getContents <em>Contents</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCallout()
 * @model
 * @generated
 */
public interface IfcDraughtingCallout extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDraughtingCalloutElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCallout_Contents()
	 * @model
	 * @generated
	 */
	EList<IfcDraughtingCalloutElement> getContents();

	/**
	 * Returns the value of the '<em><b>Is Related From Callout</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDraughtingCalloutRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout <em>Related Draughting Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related From Callout</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related From Callout</em>' reference list.
	 * @see #isSetIsRelatedFromCallout()
	 * @see #unsetIsRelatedFromCallout()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCallout_IsRelatedFromCallout()
	 * @see ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatedDraughtingCallout
	 * @model opposite="RelatedDraughtingCallout" unsettable="true"
	 * @generated
	 */
	EList<IfcDraughtingCalloutRelationship> getIsRelatedFromCallout();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRelatedFromCallout()
	 * @see #getIsRelatedFromCallout()
	 * @generated
	 */
	void unsetIsRelatedFromCallout();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedFromCallout <em>Is Related From Callout</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Related From Callout</em>' reference list is set.
	 * @see #unsetIsRelatedFromCallout()
	 * @see #getIsRelatedFromCallout()
	 * @generated
	 */
	boolean isSetIsRelatedFromCallout();

	/**
	 * Returns the value of the '<em><b>Is Related To Callout</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcDraughtingCalloutRelationship}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout <em>Relating Draughting Callout</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related To Callout</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related To Callout</em>' reference list.
	 * @see #isSetIsRelatedToCallout()
	 * @see #unsetIsRelatedToCallout()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcDraughtingCallout_IsRelatedToCallout()
	 * @see ifc2x3tc1.IfcDraughtingCalloutRelationship#getRelatingDraughtingCallout
	 * @model opposite="RelatingDraughtingCallout" unsettable="true"
	 * @generated
	 */
	EList<IfcDraughtingCalloutRelationship> getIsRelatedToCallout();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRelatedToCallout()
	 * @see #getIsRelatedToCallout()
	 * @generated
	 */
	void unsetIsRelatedToCallout();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcDraughtingCallout#getIsRelatedToCallout <em>Is Related To Callout</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Related To Callout</em>' reference list is set.
	 * @see #unsetIsRelatedToCallout()
	 * @see #getIsRelatedToCallout()
	 * @generated
	 */
	boolean isSetIsRelatedToCallout();

} // IfcDraughtingCallout
