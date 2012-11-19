/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptSurface#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptSurface()
 * @model abstract="true"
 *        extendedMetaData="name='IfcSweptSurface' kind='elementOnly'"
 * @generated
 */
public interface IfcSweptSurface extends IfcSurface {
	/**
	 * Returns the value of the '<em><b>Swept Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swept Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swept Curve</em>' containment reference.
	 * @see #setSweptCurve(SweptCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptSurface_SweptCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SweptCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	SweptCurveType getSweptCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptSurface#getSweptCurve <em>Swept Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swept Curve</em>' containment reference.
	 * @see #getSweptCurve()
	 * @generated
	 */
	void setSweptCurve(SweptCurveType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptSurface_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Position' namespace='##targetNamespace'"
	 * @generated
	 */
	PositionType1 getPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptSurface#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType1 value);

} // IfcSweptSurface
