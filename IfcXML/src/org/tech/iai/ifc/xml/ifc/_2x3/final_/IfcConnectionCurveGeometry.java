/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionCurveGeometry()
 * @model extendedMetaData="name='IfcConnectionCurveGeometry' kind='elementOnly'"
 * @generated
 */
public interface IfcConnectionCurveGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Curve On Relating Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Relating Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Relating Element</em>' containment reference.
	 * @see #setCurveOnRelatingElement(CurveOnRelatingElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionCurveGeometry_CurveOnRelatingElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CurveOnRelatingElement' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveOnRelatingElementType getCurveOnRelatingElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Relating Element</em>' containment reference.
	 * @see #getCurveOnRelatingElement()
	 * @generated
	 */
	void setCurveOnRelatingElement(CurveOnRelatingElementType value);

	/**
	 * Returns the value of the '<em><b>Curve On Related Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Related Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Related Element</em>' containment reference.
	 * @see #setCurveOnRelatedElement(CurveOnRelatedElementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectionCurveGeometry_CurveOnRelatedElement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CurveOnRelatedElement' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveOnRelatedElementType getCurveOnRelatedElement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Related Element</em>' containment reference.
	 * @see #getCurveOnRelatedElement()
	 * @generated
	 */
	void setCurveOnRelatedElement(CurveOnRelatedElementType value);

} // IfcConnectionCurveGeometry
