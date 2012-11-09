/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Profile Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesProfileProperties()
 * @model
 * @generated
 */
public interface IfcRelAssociatesProfileProperties extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Profile Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Profile Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Profile Properties</em>' reference.
	 * @see #setRelatingProfileProperties(IfcProfileProperties)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesProfileProperties_RelatingProfileProperties()
	 * @model
	 * @generated
	 */
	IfcProfileProperties getRelatingProfileProperties();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getRelatingProfileProperties <em>Relating Profile Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Profile Properties</em>' reference.
	 * @see #getRelatingProfileProperties()
	 * @generated
	 */
	void setRelatingProfileProperties(IfcProfileProperties value);

	/**
	 * Returns the value of the '<em><b>Profile Section Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Section Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Section Location</em>' reference.
	 * @see #isSetProfileSectionLocation()
	 * @see #unsetProfileSectionLocation()
	 * @see #setProfileSectionLocation(IfcShapeAspect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesProfileProperties_ProfileSectionLocation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getProfileSectionLocation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Section Location</em>' reference.
	 * @see #isSetProfileSectionLocation()
	 * @see #unsetProfileSectionLocation()
	 * @see #getProfileSectionLocation()
	 * @generated
	 */
	void setProfileSectionLocation(IfcShapeAspect value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileSectionLocation()
	 * @see #getProfileSectionLocation()
	 * @see #setProfileSectionLocation(IfcShapeAspect)
	 * @generated
	 */
	void unsetProfileSectionLocation();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileSectionLocation <em>Profile Section Location</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Section Location</em>' reference is set.
	 * @see #unsetProfileSectionLocation()
	 * @see #getProfileSectionLocation()
	 * @see #setProfileSectionLocation(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetProfileSectionLocation();

	/**
	 * Returns the value of the '<em><b>Profile Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Orientation</em>' reference.
	 * @see #isSetProfileOrientation()
	 * @see #unsetProfileOrientation()
	 * @see #setProfileOrientation(IfcOrientationSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesProfileProperties_ProfileOrientation()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcOrientationSelect getProfileOrientation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Orientation</em>' reference.
	 * @see #isSetProfileOrientation()
	 * @see #unsetProfileOrientation()
	 * @see #getProfileOrientation()
	 * @generated
	 */
	void setProfileOrientation(IfcOrientationSelect value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProfileOrientation()
	 * @see #getProfileOrientation()
	 * @see #setProfileOrientation(IfcOrientationSelect)
	 * @generated
	 */
	void unsetProfileOrientation();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRelAssociatesProfileProperties#getProfileOrientation <em>Profile Orientation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Profile Orientation</em>' reference is set.
	 * @see #unsetProfileOrientation()
	 * @see #getProfileOrientation()
	 * @see #setProfileOrientation(IfcOrientationSelect)
	 * @generated
	 */
	boolean isSetProfileOrientation();

} // IfcRelAssociatesProfileProperties
