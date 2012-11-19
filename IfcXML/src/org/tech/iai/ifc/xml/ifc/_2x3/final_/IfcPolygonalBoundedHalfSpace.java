/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Polygonal Bounded Half Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolygonalBoundedHalfSpace#getPosition <em>Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolygonalBoundedHalfSpace#getPolygonalBoundary <em>Polygonal Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPolygonalBoundedHalfSpace()
 * @model extendedMetaData="name='IfcPolygonalBoundedHalfSpace' kind='elementOnly'"
 * @generated
 */
public interface IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPolygonalBoundedHalfSpace_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Position' namespace='##targetNamespace'"
	 * @generated
	 */
	PositionType3 getPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolygonalBoundedHalfSpace#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType3 value);

	/**
	 * Returns the value of the '<em><b>Polygonal Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygonal Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygonal Boundary</em>' containment reference.
	 * @see #setPolygonalBoundary(PolygonalBoundaryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPolygonalBoundedHalfSpace_PolygonalBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PolygonalBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	PolygonalBoundaryType getPolygonalBoundary();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolygonalBoundedHalfSpace#getPolygonalBoundary <em>Polygonal Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygonal Boundary</em>' containment reference.
	 * @see #getPolygonalBoundary()
	 * @generated
	 */
	void setPolygonalBoundary(PolygonalBoundaryType value);

} // IfcPolygonalBoundedHalfSpace
