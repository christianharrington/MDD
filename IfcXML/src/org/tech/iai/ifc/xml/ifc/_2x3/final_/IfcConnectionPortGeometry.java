/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Port Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPortGeometry()
 * @model extendedMetaData="name='IfcConnectionPortGeometry' kind='elementOnly'"
 * @generated
 */
public interface IfcConnectionPortGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Location At Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Relating Element</em>' containment reference.
	 * @see #setLocationAtRelatingElement(LocationAtRelatingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPortGeometry_LocationAtRelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LocationAtRelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationAtRelatingElementType getLocationAtRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getLocationAtRelatingElement <em>Location At Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Relating Element</em>' containment reference.
	 * @see #getLocationAtRelatingElement()
	 * @generated
	 */
	void setLocationAtRelatingElement(LocationAtRelatingElementType value);

	/**
	 * Returns the value of the '<em><b>Location At Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location At Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location At Related Element</em>' containment reference.
	 * @see #setLocationAtRelatedElement(LocationAtRelatedElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPortGeometry_LocationAtRelatedElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LocationAtRelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	LocationAtRelatedElementType getLocationAtRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getLocationAtRelatedElement <em>Location At Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location At Related Element</em>' containment reference.
	 * @see #getLocationAtRelatedElement()
	 * @generated
	 */
	void setLocationAtRelatedElement(LocationAtRelatedElementType value);

	/**
	 * Returns the value of the '<em><b>Profile Of Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Of Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Of Port</em>' containment reference.
	 * @see #setProfileOfPort(ProfileOfPortType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPortGeometry_ProfileOfPort()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProfileOfPort' namespace='##targetNamespace'"
	 * @generated
	 */
	ProfileOfPortType getProfileOfPort();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPortGeometry#getProfileOfPort <em>Profile Of Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Of Port</em>' containment reference.
	 * @see #getProfileOfPort()
	 * @generated
	 */
	void setProfileOfPort(ProfileOfPortType value);

} // IfcConnectionPortGeometry
