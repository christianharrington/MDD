/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getUser <em>User</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset()
 * @model extendedMetaData="name='IfcAsset' kind='elementOnly'"
 * @generated
 */
public interface IfcAsset extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #setAssetID(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_AssetID()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='AssetID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAssetID();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #getAssetID()
	 * @generated
	 */
	void setAssetID(String value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' containment reference.
	 * @see #setOriginalValue(OriginalValueType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_OriginalValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OriginalValue' namespace='##targetNamespace'"
	 * @generated
	 */
	OriginalValueType1 getOriginalValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getOriginalValue <em>Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' containment reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(OriginalValueType1 value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(CurrentValueType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_CurrentValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurrentValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CurrentValueType1 getCurrentValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(CurrentValueType1 value);

	/**
	 * Returns the value of the '<em><b>Total Replacement Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Replacement Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Replacement Cost</em>' containment reference.
	 * @see #setTotalReplacementCost(TotalReplacementCostType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_TotalReplacementCost()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TotalReplacementCost' namespace='##targetNamespace'"
	 * @generated
	 */
	TotalReplacementCostType getTotalReplacementCost();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Replacement Cost</em>' containment reference.
	 * @see #getTotalReplacementCost()
	 * @generated
	 */
	void setTotalReplacementCost(TotalReplacementCostType value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(OwnerType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_Owner()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Owner' namespace='##targetNamespace'"
	 * @generated
	 */
	OwnerType getOwner();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(OwnerType value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(UserType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_User()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='User' namespace='##targetNamespace'"
	 * @generated
	 */
	UserType getUser();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(UserType value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' containment reference.
	 * @see #setResponsiblePerson(ResponsiblePersonType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_ResponsiblePerson()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ResponsiblePerson' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsiblePersonType getResponsiblePerson();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' containment reference.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(ResponsiblePersonType value);

	/**
	 * Returns the value of the '<em><b>Incorporation Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporation Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporation Date</em>' containment reference.
	 * @see #setIncorporationDate(IncorporationDateType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_IncorporationDate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IncorporationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	IncorporationDateType getIncorporationDate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incorporation Date</em>' containment reference.
	 * @see #getIncorporationDate()
	 * @generated
	 */
	void setIncorporationDate(IncorporationDateType value);

	/**
	 * Returns the value of the '<em><b>Depreciated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depreciated Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciated Value</em>' containment reference.
	 * @see #setDepreciatedValue(DepreciatedValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAsset_DepreciatedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DepreciatedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	DepreciatedValueType getDepreciatedValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciated Value</em>' containment reference.
	 * @see #getDepreciatedValue()
	 * @generated
	 */
	void setDepreciatedValue(DepreciatedValueType value);

} // IfcAsset
