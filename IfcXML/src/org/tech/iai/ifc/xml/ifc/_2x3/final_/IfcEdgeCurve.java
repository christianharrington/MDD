/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdgeCurve()
 * @model extendedMetaData="name='IfcEdgeCurve' kind='elementOnly'"
 * @generated
 */
public interface IfcEdgeCurve extends IfcEdge {
	/**
	 * Returns the value of the '<em><b>Edge Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edge Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edge Geometry</em>' containment reference.
	 * @see #setEdgeGeometry(EdgeGeometryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdgeCurve_EdgeGeometry()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EdgeGeometry' namespace='##targetNamespace'"
	 * @generated
	 */
	EdgeGeometryType getEdgeGeometry();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve#getEdgeGeometry <em>Edge Geometry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edge Geometry</em>' containment reference.
	 * @see #getEdgeGeometry()
	 * @generated
	 */
	void setEdgeGeometry(EdgeGeometryType value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #setSameSense(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcEdgeCurve_SameSense()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='SameSense' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSameSense();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcEdgeCurve#isSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSameSense()
	 * @generated
	 */
	void setSameSense(boolean value);

} // IfcEdgeCurve
