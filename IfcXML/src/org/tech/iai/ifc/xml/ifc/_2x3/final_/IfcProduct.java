/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct#getObjectPlacement <em>Object Placement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct#getRepresentation <em>Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProduct()
 * @model abstract="true"
 *        extendedMetaData="name='IfcProduct' kind='elementOnly'"
 * @generated
 */
public interface IfcProduct extends IfcObject {
	/**
	 * Returns the value of the '<em><b>Object Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Placement</em>' containment reference.
	 * @see #setObjectPlacement(ObjectPlacementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProduct_ObjectPlacement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ObjectPlacement' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectPlacementType getObjectPlacement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct#getObjectPlacement <em>Object Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Placement</em>' containment reference.
	 * @see #getObjectPlacement()
	 * @generated
	 */
	void setObjectPlacement(ObjectPlacementType value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(RepresentationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProduct_Representation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Representation' namespace='##targetNamespace'"
	 * @generated
	 */
	RepresentationType getRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProduct#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(RepresentationType value);

} // IfcProduct
