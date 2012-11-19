/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getPlacement <em>Placement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getPath1 <em>Path1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextLiteral()
 * @model extendedMetaData="name='IfcTextLiteral' kind='elementOnly'"
 * @generated
 */
public interface IfcTextLiteral extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextLiteral_Literal()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentableText" required="true"
	 *        extendedMetaData="kind='element' name='Literal' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' containment reference.
	 * @see #setPlacement(PlacementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextLiteral_Placement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Placement' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacementType getPlacement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getPlacement <em>Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' containment reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(PlacementType value);

	/**
	 * Returns the value of the '<em><b>Path1</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path1</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextPath
	 * @see #setPath1(IfcTextPath)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextLiteral_Path1()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Path' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTextPath getPath1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextLiteral#getPath1 <em>Path1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path1</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextPath
	 * @see #getPath1()
	 * @generated
	 */
	void setPath1(IfcTextPath value);

} // IfcTextLiteral
