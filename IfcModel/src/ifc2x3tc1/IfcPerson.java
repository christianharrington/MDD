/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPerson#getId <em>Id</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getFamilyName <em>Family Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getMiddleNames <em>Middle Names</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getRoles <em>Roles</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPerson#getEngagedIn <em>Engaged In</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson()
 * @model
 * @generated
 */
public interface IfcPerson extends IfcActorSelect, IfcObjectReferenceSelect {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_Id()
	 * @model unsettable="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPerson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #setFamilyName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_FamilyName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFamilyName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPerson#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Name</em>' attribute.
	 * @see #isSetFamilyName()
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @generated
	 */
	void setFamilyName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getFamilyName <em>Family Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	void unsetFamilyName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getFamilyName <em>Family Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Family Name</em>' attribute is set.
	 * @see #unsetFamilyName()
	 * @see #getFamilyName()
	 * @see #setFamilyName(String)
	 * @generated
	 */
	boolean isSetFamilyName();

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Given Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #setGivenName(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_GivenName()
	 * @model unsettable="true"
	 * @generated
	 */
	String getGivenName();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPerson#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Given Name</em>' attribute.
	 * @see #isSetGivenName()
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @generated
	 */
	void setGivenName(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getGivenName <em>Given Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	void unsetGivenName();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getGivenName <em>Given Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Given Name</em>' attribute is set.
	 * @see #unsetGivenName()
	 * @see #getGivenName()
	 * @see #setGivenName(String)
	 * @generated
	 */
	boolean isSetGivenName();

	/**
	 * Returns the value of the '<em><b>Middle Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Names</em>' attribute list.
	 * @see #isSetMiddleNames()
	 * @see #unsetMiddleNames()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_MiddleNames()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getMiddleNames();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getMiddleNames <em>Middle Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiddleNames()
	 * @see #getMiddleNames()
	 * @generated
	 */
	void unsetMiddleNames();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getMiddleNames <em>Middle Names</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Middle Names</em>' attribute list is set.
	 * @see #unsetMiddleNames()
	 * @see #getMiddleNames()
	 * @generated
	 */
	boolean isSetMiddleNames();

	/**
	 * Returns the value of the '<em><b>Prefix Titles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix Titles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix Titles</em>' attribute list.
	 * @see #isSetPrefixTitles()
	 * @see #unsetPrefixTitles()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_PrefixTitles()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getPrefixTitles();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefixTitles()
	 * @see #getPrefixTitles()
	 * @generated
	 */
	void unsetPrefixTitles();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getPrefixTitles <em>Prefix Titles</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix Titles</em>' attribute list is set.
	 * @see #unsetPrefixTitles()
	 * @see #getPrefixTitles()
	 * @generated
	 */
	boolean isSetPrefixTitles();

	/**
	 * Returns the value of the '<em><b>Suffix Titles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suffix Titles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suffix Titles</em>' attribute list.
	 * @see #isSetSuffixTitles()
	 * @see #unsetSuffixTitles()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_SuffixTitles()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	EList<String> getSuffixTitles();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSuffixTitles()
	 * @see #getSuffixTitles()
	 * @generated
	 */
	void unsetSuffixTitles();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getSuffixTitles <em>Suffix Titles</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Suffix Titles</em>' attribute list is set.
	 * @see #unsetSuffixTitles()
	 * @see #getSuffixTitles()
	 * @generated
	 */
	boolean isSetSuffixTitles();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcActorRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see #isSetRoles()
	 * @see #unsetRoles()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_Roles()
	 * @model unsettable="true"
	 * @generated
	 */
	EList<IfcActorRole> getRoles();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getRoles <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRoles()
	 * @see #getRoles()
	 * @generated
	 */
	void unsetRoles();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getRoles <em>Roles</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Roles</em>' reference list is set.
	 * @see #unsetRoles()
	 * @see #getRoles()
	 * @generated
	 */
	boolean isSetRoles();

	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcAddress}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcAddress#getOfPerson <em>Of Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Addresses</em>' reference list.
	 * @see #isSetAddresses()
	 * @see #unsetAddresses()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_Addresses()
	 * @see ifc2x3tc1.IfcAddress#getOfPerson
	 * @model opposite="OfPerson" unsettable="true"
	 * @generated
	 */
	EList<IfcAddress> getAddresses();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getAddresses <em>Addresses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAddresses()
	 * @see #getAddresses()
	 * @generated
	 */
	void unsetAddresses();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getAddresses <em>Addresses</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Addresses</em>' reference list is set.
	 * @see #unsetAddresses()
	 * @see #getAddresses()
	 * @generated
	 */
	boolean isSetAddresses();

	/**
	 * Returns the value of the '<em><b>Engaged In</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcPersonAndOrganization}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcPersonAndOrganization#getThePerson <em>The Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engaged In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engaged In</em>' reference list.
	 * @see #isSetEngagedIn()
	 * @see #unsetEngagedIn()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPerson_EngagedIn()
	 * @see ifc2x3tc1.IfcPersonAndOrganization#getThePerson
	 * @model opposite="ThePerson" unsettable="true"
	 * @generated
	 */
	EList<IfcPersonAndOrganization> getEngagedIn();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPerson#getEngagedIn <em>Engaged In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEngagedIn()
	 * @see #getEngagedIn()
	 * @generated
	 */
	void unsetEngagedIn();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPerson#getEngagedIn <em>Engaged In</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Engaged In</em>' reference list is set.
	 * @see #unsetEngagedIn()
	 * @see #getEngagedIn()
	 * @generated
	 */
	boolean isSetEngagedIn();

} // IfcPerson
