/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Services Buildings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelServicesBuildings#getRelatedBuildings <em>Related Buildings</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelServicesBuildings()
 * @model extendedMetaData="name='IfcRelServicesBuildings' kind='elementOnly'"
 * @generated
 */
public interface IfcRelServicesBuildings extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating System</em>' containment reference.
	 * @see #setRelatingSystem(RelatingSystemType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelServicesBuildings_RelatingSystem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingSystemType getRelatingSystem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelServicesBuildings#getRelatingSystem <em>Relating System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating System</em>' containment reference.
	 * @see #getRelatingSystem()
	 * @generated
	 */
	void setRelatingSystem(RelatingSystemType value);

	/**
	 * Returns the value of the '<em><b>Related Buildings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Buildings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Buildings</em>' containment reference.
	 * @see #setRelatedBuildings(RelatedBuildingsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelServicesBuildings_RelatedBuildings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedBuildings' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedBuildingsType getRelatedBuildings();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelServicesBuildings#getRelatedBuildings <em>Related Buildings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Buildings</em>' containment reference.
	 * @see #getRelatedBuildings()
	 * @generated
	 */
	void setRelatedBuildings(RelatedBuildingsType value);

} // IfcRelServicesBuildings
