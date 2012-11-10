/**
 */
package ifc2x3tc1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getState <em>State</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory()
 * @model
 * @generated
 */
public interface IfcOwnerHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Owning User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning User</em>' reference.
	 * @see #setOwningUser(IfcPersonAndOrganization)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_OwningUser()
	 * @model
	 * @generated
	 */
	IfcPersonAndOrganization getOwningUser();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getOwningUser <em>Owning User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning User</em>' reference.
	 * @see #getOwningUser()
	 * @generated
	 */
	void setOwningUser(IfcPersonAndOrganization value);

	/**
	 * Returns the value of the '<em><b>Owning Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Application</em>' reference.
	 * @see #setOwningApplication(IfcApplication)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_OwningApplication()
	 * @model
	 * @generated
	 */
	IfcApplication getOwningApplication();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Application</em>' reference.
	 * @see #getOwningApplication()
	 * @generated
	 */
	void setOwningApplication(IfcApplication value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see ifc2x3tc1.IfcStateEnum
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(IfcStateEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_State()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcStateEnum getState();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see ifc2x3tc1.IfcStateEnum
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(IfcStateEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(IfcStateEnum)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(IfcStateEnum)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Change Action</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcChangeActionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Action</em>' attribute.
	 * @see ifc2x3tc1.IfcChangeActionEnum
	 * @see #setChangeAction(IfcChangeActionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_ChangeAction()
	 * @model
	 * @generated
	 */
	IfcChangeActionEnum getChangeAction();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getChangeAction <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Action</em>' attribute.
	 * @see ifc2x3tc1.IfcChangeActionEnum
	 * @see #getChangeAction()
	 * @generated
	 */
	void setChangeAction(IfcChangeActionEnum value);

	/**
	 * Returns the value of the '<em><b>Last Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #setLastModifiedDate(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_LastModifiedDate()
	 * @model unsettable="true"
	 * @generated
	 */
	int getLastModifiedDate();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #isSetLastModifiedDate()
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(int value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(int)
	 * @generated
	 */
	void unsetLastModifiedDate();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modified Date</em>' attribute is set.
	 * @see #unsetLastModifiedDate()
	 * @see #getLastModifiedDate()
	 * @see #setLastModifiedDate(int)
	 * @generated
	 */
	boolean isSetLastModifiedDate();

	/**
	 * Returns the value of the '<em><b>Last Modifying User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying User</em>' reference.
	 * @see #isSetLastModifyingUser()
	 * @see #unsetLastModifyingUser()
	 * @see #setLastModifyingUser(IfcPersonAndOrganization)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_LastModifyingUser()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcPersonAndOrganization getLastModifyingUser();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying User</em>' reference.
	 * @see #isSetLastModifyingUser()
	 * @see #unsetLastModifyingUser()
	 * @see #getLastModifyingUser()
	 * @generated
	 */
	void setLastModifyingUser(IfcPersonAndOrganization value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifyingUser()
	 * @see #getLastModifyingUser()
	 * @see #setLastModifyingUser(IfcPersonAndOrganization)
	 * @generated
	 */
	void unsetLastModifyingUser();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modifying User</em>' reference is set.
	 * @see #unsetLastModifyingUser()
	 * @see #getLastModifyingUser()
	 * @see #setLastModifyingUser(IfcPersonAndOrganization)
	 * @generated
	 */
	boolean isSetLastModifyingUser();

	/**
	 * Returns the value of the '<em><b>Last Modifying Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying Application</em>' reference.
	 * @see #isSetLastModifyingApplication()
	 * @see #unsetLastModifyingApplication()
	 * @see #setLastModifyingApplication(IfcApplication)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_LastModifyingApplication()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcApplication getLastModifyingApplication();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying Application</em>' reference.
	 * @see #isSetLastModifyingApplication()
	 * @see #unsetLastModifyingApplication()
	 * @see #getLastModifyingApplication()
	 * @generated
	 */
	void setLastModifyingApplication(IfcApplication value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLastModifyingApplication()
	 * @see #getLastModifyingApplication()
	 * @see #setLastModifyingApplication(IfcApplication)
	 * @generated
	 */
	void unsetLastModifyingApplication();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Last Modifying Application</em>' reference is set.
	 * @see #unsetLastModifyingApplication()
	 * @see #getLastModifyingApplication()
	 * @see #setLastModifyingApplication(IfcApplication)
	 * @generated
	 */
	boolean isSetLastModifyingApplication();

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcOwnerHistory_CreationDate()
	 * @model
	 * @generated
	 */
	int getCreationDate();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(int value);

} // IfcOwnerHistory
