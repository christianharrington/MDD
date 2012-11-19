/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Surface Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionSurfaceGeometry()
 * @model extendedMetaData="name='IfcConnectionSurfaceGeometry' kind='elementOnly'"
 * @generated
 */
public interface IfcConnectionSurfaceGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Surface On Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Relating Element</em>' containment reference.
	 * @see #setSurfaceOnRelatingElement(SurfaceOnRelatingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionSurfaceGeometry_SurfaceOnRelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SurfaceOnRelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceOnRelatingElementType getSurfaceOnRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionSurfaceGeometry#getSurfaceOnRelatingElement <em>Surface On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Relating Element</em>' containment reference.
	 * @see #getSurfaceOnRelatingElement()
	 * @generated
	 */
	void setSurfaceOnRelatingElement(SurfaceOnRelatingElementType value);

	/**
	 * Returns the value of the '<em><b>Surface On Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface On Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface On Related Element</em>' containment reference.
	 * @see #setSurfaceOnRelatedElement(SurfaceOnRelatedElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionSurfaceGeometry_SurfaceOnRelatedElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='SurfaceOnRelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfaceOnRelatedElementType getSurfaceOnRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionSurfaceGeometry#getSurfaceOnRelatedElement <em>Surface On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface On Related Element</em>' containment reference.
	 * @see #getSurfaceOnRelatedElement()
	 * @generated
	 */
	void setSurfaceOnRelatedElement(SurfaceOnRelatedElementType value);

} // IfcConnectionSurfaceGeometry
