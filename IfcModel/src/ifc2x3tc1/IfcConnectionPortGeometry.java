/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionPortGeometry()
 * @model
 * @generated
 */
public interface IfcConnectionPortGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Location At Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Relating Element</em>' reference.
	 * @see #setLocationAtRelatingElement(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionPortGeometry_LocationAtRelatingElement()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getLocationAtRelatingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Relating Element</em>' reference.
	 * @see #getLocationAtRelatingElement()
	 * @generated
	 */
	void setLocationAtRelatingElement(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Location At Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Related Element</em>' reference.
	 * @see #isSetLocationAtRelatedElement()
	 * @see #unsetLocationAtRelatedElement()
	 * @see #setLocationAtRelatedElement(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionPortGeometry_LocationAtRelatedElement()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcAxis2Placement getLocationAtRelatedElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Related Element</em>' reference.
	 * @see #isSetLocationAtRelatedElement()
	 * @see #unsetLocationAtRelatedElement()
	 * @see #getLocationAtRelatedElement()
	 * @generated
	 */
	void setLocationAtRelatedElement(IfcAxis2Placement value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocationAtRelatedElement()
	 * @see #getLocationAtRelatedElement()
	 * @see #setLocationAtRelatedElement(IfcAxis2Placement)
	 * @generated
	 */
	void unsetLocationAtRelatedElement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Location At Related Element</em>' reference is set.
	 * @see #unsetLocationAtRelatedElement()
	 * @see #getLocationAtRelatedElement()
	 * @see #setLocationAtRelatedElement(IfcAxis2Placement)
	 * @generated
	 */
	boolean isSetLocationAtRelatedElement();

	/**
	 * Returns the value of the '<em><b>Profile Of Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Of Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Of Port</em>' reference.
	 * @see #setProfileOfPort(IfcProfileDef)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionPortGeometry_ProfileOfPort()
	 * @model
	 * @generated
	 */
	IfcProfileDef getProfileOfPort();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Of Port</em>' reference.
	 * @see #getProfileOfPort()
	 * @generated
	 */
	void setProfileOfPort(IfcProfileDef value);

} // IfcConnectionPortGeometry
