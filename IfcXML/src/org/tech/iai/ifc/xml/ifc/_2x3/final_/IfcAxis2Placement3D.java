/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Axis2 Placement3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAxis2Placement3D()
 * @model extendedMetaData="name='IfcAxis2Placement3D' kind='elementOnly'"
 * @generated
 */
public interface IfcAxis2Placement3D extends IfcPlacement {
	/**
	 * Returns the value of the '<em><b>Axis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' containment reference.
	 * @see #setAxis(AxisType2)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAxis2Placement3D_Axis()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Axis' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisType2 getAxis();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D#getAxis <em>Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' containment reference.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(AxisType2 value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference.
	 * @see #setRefDirection(RefDirectionType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAxis2Placement3D_RefDirection()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RefDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	RefDirectionType1 getRefDirection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAxis2Placement3D#getRefDirection <em>Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' containment reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(RefDirectionType1 value);

} // IfcAxis2Placement3D
