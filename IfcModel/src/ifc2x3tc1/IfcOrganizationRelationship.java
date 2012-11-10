/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Organization Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcOrganizationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOrganizationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOrganizationRelationship#getRelatedOrganizations <em>Related Organizations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrganizationRelationship()
 * @model
 * @generated
 */
public interface IfcOrganizationRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrganizationRelationship_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrganizationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrganizationRelationship_Description()
	 * @model unsettable="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute.
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
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDescription()
	 * @see #getDescription()
	 * @see #setDescription(String)
	 * @generated
	 */
	void unsetDescription();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOrganizationRelationship#getDescription <em>Description</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Relating Organization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcOrganization#getRelates <em>Relates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Organization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Organization</em>' reference.
	 * @see #setRelatingOrganization(IfcOrganization)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrganizationRelationship_RelatingOrganization()
	 * @see ifc2x3tc1.IfcOrganization#getRelates
	 * @model opposite="Relates"
	 * @generated
	 */
	IfcOrganization getRelatingOrganization();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOrganizationRelationship#getRelatingOrganization <em>Relating Organization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Organization</em>' reference.
	 * @see #getRelatingOrganization()
	 * @generated
	 */
	void setRelatingOrganization(IfcOrganization value);

	/**
	 * Returns the value of the '<em><b>Related Organizations</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcOrganization}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcOrganization#getIsRelatedBy <em>Is Related By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Organizations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Organizations</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOrganizationRelationship_RelatedOrganizations()
	 * @see ifc2x3tc1.IfcOrganization#getIsRelatedBy
	 * @model opposite="IsRelatedBy"
	 * @generated
	 */
	EList<IfcOrganization> getRelatedOrganizations();

} // IfcOrganizationRelationship
