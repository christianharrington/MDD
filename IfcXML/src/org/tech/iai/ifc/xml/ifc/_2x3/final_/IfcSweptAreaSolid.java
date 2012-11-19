/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Swept Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptAreaSolid#getSweptArea <em>Swept Area</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptAreaSolid#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptAreaSolid()
 * @model abstract="true"
 *        extendedMetaData="name='IfcSweptAreaSolid' kind='elementOnly'"
 * @generated
 */
public interface IfcSweptAreaSolid extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Swept Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swept Area</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swept Area</em>' containment reference.
	 * @see #setSweptArea(SweptAreaType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptAreaSolid_SweptArea()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SweptArea' namespace='##targetNamespace'"
	 * @generated
	 */
	SweptAreaType getSweptArea();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptAreaSolid#getSweptArea <em>Swept Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swept Area</em>' containment reference.
	 * @see #getSweptArea()
	 * @generated
	 */
	void setSweptArea(SweptAreaType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionType5)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSweptAreaSolid_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Position' namespace='##targetNamespace'"
	 * @generated
	 */
	PositionType5 getPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSweptAreaSolid#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType5 value);

} // IfcSweptAreaSolid
