/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getConnectionGeometry <em>Connection Geometry</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsElements()
 * @model extendedMetaData="name='IfcRelConnectsElements' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsElements extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Connection Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Geometry</em>' containment reference.
	 * @see #setConnectionGeometry(ConnectionGeometryType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsElements_ConnectionGeometry()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ConnectionGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionGeometryType1 getConnectionGeometry();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getConnectionGeometry <em>Connection Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Geometry</em>' containment reference.
	 * @see #getConnectionGeometry()
	 * @generated
	 */
	void setConnectionGeometry(ConnectionGeometryType1 value);

	/**
	 * Returns the value of the '<em><b>Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Element</em>' containment reference.
	 * @see #setRelatingElement(RelatingElementType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsElements_RelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingElementType3 getRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getRelatingElement <em>Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Element</em>' containment reference.
	 * @see #getRelatingElement()
	 * @generated
	 */
	void setRelatingElement(RelatingElementType3 value);

	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Element</em>' containment reference.
	 * @see #setRelatedElement(RelatedElementType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsElements_RelatedElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedElementType1 getRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsElements#getRelatedElement <em>Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Element</em>' containment reference.
	 * @see #getRelatedElement()
	 * @generated
	 */
	void setRelatedElement(RelatedElementType1 value);

} // IfcRelConnectsElements
