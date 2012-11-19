/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Owner History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getOwningUser <em>Owning User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getState <em>State</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getChangeAction <em>Change Action</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory()
 * @model extendedMetaData="name='IfcOwnerHistory' kind='elementOnly'"
 * @generated
 */
public interface IfcOwnerHistory extends Entity {
	/**
	 * Returns the value of the '<em><b>Owning User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning User</em>' containment reference.
	 * @see #setOwningUser(OwningUserType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_OwningUser()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OwningUser' namespace='##targetNamespace'"
	 * @generated
	 */
	OwningUserType getOwningUser();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getOwningUser <em>Owning User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning User</em>' containment reference.
	 * @see #getOwningUser()
	 * @generated
	 */
	void setOwningUser(OwningUserType value);

	/**
	 * Returns the value of the '<em><b>Owning Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Application</em>' containment reference.
	 * @see #setOwningApplication(OwningApplicationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_OwningApplication()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OwningApplication' namespace='##targetNamespace'"
	 * @generated
	 */
	OwningApplicationType getOwningApplication();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getOwningApplication <em>Owning Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Application</em>' containment reference.
	 * @see #getOwningApplication()
	 * @generated
	 */
	void setOwningApplication(OwningApplicationType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(IfcStateEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_State()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStateEnumObject"
	 *        extendedMetaData="kind='element' name='State' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcStateEnum getState();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(IfcStateEnum value);

	/**
	 * Returns the value of the '<em><b>Change Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcChangeActionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Action</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcChangeActionEnum
	 * @see #setChangeAction(IfcChangeActionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_ChangeAction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ChangeAction' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcChangeActionEnum getChangeAction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getChangeAction <em>Change Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Action</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcChangeActionEnum
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
	 * @see #setLastModifiedDate(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_LastModifiedDate()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeStampObject"
	 *        extendedMetaData="kind='element' name='LastModifiedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getLastModifiedDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifiedDate <em>Last Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified Date</em>' attribute.
	 * @see #getLastModifiedDate()
	 * @generated
	 */
	void setLastModifiedDate(Long value);

	/**
	 * Returns the value of the '<em><b>Last Modifying User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying User</em>' containment reference.
	 * @see #setLastModifyingUser(LastModifyingUserType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_LastModifyingUser()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastModifyingUser' namespace='##targetNamespace'"
	 * @generated
	 */
	LastModifyingUserType getLastModifyingUser();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifyingUser <em>Last Modifying User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying User</em>' containment reference.
	 * @see #getLastModifyingUser()
	 * @generated
	 */
	void setLastModifyingUser(LastModifyingUserType value);

	/**
	 * Returns the value of the '<em><b>Last Modifying Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modifying Application</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modifying Application</em>' containment reference.
	 * @see #setLastModifyingApplication(LastModifyingApplicationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_LastModifyingApplication()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LastModifyingApplication' namespace='##targetNamespace'"
	 * @generated
	 */
	LastModifyingApplicationType getLastModifyingApplication();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getLastModifyingApplication <em>Last Modifying Application</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modifying Application</em>' containment reference.
	 * @see #getLastModifyingApplication()
	 * @generated
	 */
	void setLastModifyingApplication(LastModifyingApplicationType value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOwnerHistory_CreationDate()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeStamp" required="true"
	 *        extendedMetaData="kind='element' name='CreationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCreationDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOwnerHistory#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(long value);

} // IfcOwnerHistory
