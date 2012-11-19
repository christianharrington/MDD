/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Surface Of Revolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceOfRevolution#getAxisPosition <em>Axis Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceOfRevolution()
 * @model extendedMetaData="name='IfcSurfaceOfRevolution' kind='elementOnly'"
 * @generated
 */
public interface IfcSurfaceOfRevolution extends IfcSweptSurface {
	/**
	 * Returns the value of the '<em><b>Axis Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Position</em>' containment reference.
	 * @see #setAxisPosition(AxisPositionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSurfaceOfRevolution_AxisPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AxisPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisPositionType getAxisPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSurfaceOfRevolution#getAxisPosition <em>Axis Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Position</em>' containment reference.
	 * @see #getAxisPosition()
	 * @generated
	 */
	void setAxisPosition(AxisPositionType value);

} // IfcSurfaceOfRevolution
