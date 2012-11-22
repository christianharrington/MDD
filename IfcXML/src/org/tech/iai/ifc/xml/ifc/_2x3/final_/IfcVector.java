/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector#getMagnitude <em>Magnitude</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVector()
 * @model extendedMetaData="name='IfcVector' kind='elementOnly'"
 * @generated
 */
public interface IfcVector extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(OrientationType2)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVector_Orientation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationType2 getOrientation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(OrientationType2 value);

	/**
	 * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude</em>' attribute.
	 * @see #setMagnitude(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVector_Magnitude()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='Magnitude' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMagnitude();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVector#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude</em>' attribute.
	 * @see #getMagnitude()
	 * @generated
	 */
	void setMagnitude(Double value);

} // IfcVector
