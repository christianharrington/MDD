/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Extruded Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExtrudedAreaSolid#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExtrudedAreaSolid#getDepth <em>Depth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcExtrudedAreaSolid()
 * @model extendedMetaData="name='IfcExtrudedAreaSolid' kind='elementOnly'"
 * @generated
 */
public interface IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
	/**
	 * Returns the value of the '<em><b>Extruded Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extruded Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extruded Direction</em>' containment reference.
	 * @see #setExtrudedDirection(ExtrudedDirectionType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcExtrudedAreaSolid_ExtrudedDirection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ExtrudedDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtrudedDirectionType1 getExtrudedDirection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExtrudedAreaSolid#getExtrudedDirection <em>Extruded Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extruded Direction</em>' containment reference.
	 * @see #getExtrudedDirection()
	 * @generated
	 */
	void setExtrudedDirection(ExtrudedDirectionType1 value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcExtrudedAreaSolid_Depth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='Depth' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDepth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcExtrudedAreaSolid#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(double value);

} // IfcExtrudedAreaSolid
