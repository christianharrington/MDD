/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Poly Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolyLoop#getPolygon <em>Polygon</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPolyLoop()
 * @model extendedMetaData="name='IfcPolyLoop' kind='elementOnly'"
 * @generated
 */
public interface IfcPolyLoop extends IfcLoop {
	/**
	 * Returns the value of the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon</em>' containment reference.
	 * @see #setPolygon(PolygonType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPolyLoop_Polygon()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polygon' namespace='##targetNamespace'"
	 * @generated
	 */
	PolygonType getPolygon();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPolyLoop#getPolygon <em>Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon</em>' containment reference.
	 * @see #getPolygon()
	 * @generated
	 */
	void setPolygon(PolygonType value);

} // IfcPolyLoop
