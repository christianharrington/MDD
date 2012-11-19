/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Point Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointGeometry#getPointOnRelatingElement <em>Point On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointGeometry#getPointOnRelatedElement <em>Point On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPointGeometry()
 * @model extendedMetaData="name='IfcConnectionPointGeometry' kind='elementOnly'"
 * @generated
 */
public interface IfcConnectionPointGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Point On Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point On Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point On Relating Element</em>' containment reference.
	 * @see #setPointOnRelatingElement(PointOnRelatingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPointGeometry_PointOnRelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PointOnRelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PointOnRelatingElementType getPointOnRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointGeometry#getPointOnRelatingElement <em>Point On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point On Relating Element</em>' containment reference.
	 * @see #getPointOnRelatingElement()
	 * @generated
	 */
	void setPointOnRelatingElement(PointOnRelatingElementType value);

	/**
	 * Returns the value of the '<em><b>Point On Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point On Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point On Related Element</em>' containment reference.
	 * @see #setPointOnRelatedElement(PointOnRelatedElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionPointGeometry_PointOnRelatedElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PointOnRelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	PointOnRelatedElementType getPointOnRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionPointGeometry#getPointOnRelatedElement <em>Point On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point On Related Element</em>' containment reference.
	 * @see #getPointOnRelatedElement()
	 * @generated
	 */
	void setPointOnRelatedElement(PointOnRelatedElementType value);

} // IfcConnectionPointGeometry
