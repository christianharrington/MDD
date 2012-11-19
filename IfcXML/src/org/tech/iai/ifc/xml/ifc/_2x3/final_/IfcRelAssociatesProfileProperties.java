/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesProfileProperties()
 * @model extendedMetaData="name='IfcRelAssociatesProfileProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesProfileProperties extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Profile Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Profile Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Profile Properties</em>' containment reference.
	 * @see #setRelatingProfileProperties(RelatingProfilePropertiesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesProfileProperties_RelatingProfileProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingProfileProperties' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingProfilePropertiesType getRelatingProfileProperties();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Profile Properties</em>' containment reference.
	 * @see #getRelatingProfileProperties()
	 * @generated
	 */
	void setRelatingProfileProperties(RelatingProfilePropertiesType value);

	/**
	 * Returns the value of the '<em><b>Profile Section Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Section Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Section Location</em>' containment reference.
	 * @see #setProfileSectionLocation(ProfileSectionLocationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesProfileProperties_ProfileSectionLocation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ProfileSectionLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileSectionLocationType getProfileSectionLocation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Section Location</em>' containment reference.
	 * @see #getProfileSectionLocation()
	 * @generated
	 */
	void setProfileSectionLocation(ProfileSectionLocationType value);

	/**
	 * Returns the value of the '<em><b>Profile Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Orientation</em>' containment reference.
	 * @see #setProfileOrientation(ProfileOrientationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesProfileProperties_ProfileOrientation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ProfileOrientation' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileOrientationType getProfileOrientation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Orientation</em>' containment reference.
	 * @see #getProfileOrientation()
	 * @generated
	 */
	void setProfileOrientation(ProfileOrientationType value);

} // IfcRelAssociatesProfileProperties
