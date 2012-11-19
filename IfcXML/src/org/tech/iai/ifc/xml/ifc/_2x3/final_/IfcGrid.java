/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getUAxes <em>UAxes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getVAxes <em>VAxes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getWAxes <em>WAxes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGrid()
 * @model extendedMetaData="name='IfcGrid' kind='elementOnly'"
 * @generated
 */
public interface IfcGrid extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>UAxes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UAxes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UAxes</em>' containment reference.
	 * @see #setUAxes(UAxesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGrid_UAxes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UAxes' namespace='##targetNamespace'"
	 * @generated
	 */
	UAxesType getUAxes();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getUAxes <em>UAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UAxes</em>' containment reference.
	 * @see #getUAxes()
	 * @generated
	 */
	void setUAxes(UAxesType value);

	/**
	 * Returns the value of the '<em><b>VAxes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAxes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAxes</em>' containment reference.
	 * @see #setVAxes(VAxesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGrid_VAxes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VAxes' namespace='##targetNamespace'"
	 * @generated
	 */
	VAxesType getVAxes();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getVAxes <em>VAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAxes</em>' containment reference.
	 * @see #getVAxes()
	 * @generated
	 */
	void setVAxes(VAxesType value);

	/**
	 * Returns the value of the '<em><b>WAxes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WAxes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WAxes</em>' containment reference.
	 * @see #setWAxes(WAxesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGrid_WAxes()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='WAxes' namespace='##targetNamespace'"
	 * @generated
	 */
	WAxesType getWAxes();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGrid#getWAxes <em>WAxes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WAxes</em>' containment reference.
	 * @see #getWAxes()
	 * @generated
	 */
	void setWAxes(WAxesType value);

} // IfcGrid
