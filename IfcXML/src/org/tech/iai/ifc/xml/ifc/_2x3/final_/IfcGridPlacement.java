/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridPlacement()
 * @model extendedMetaData="name='IfcGridPlacement' kind='elementOnly'"
 * @generated
 */
public interface IfcGridPlacement extends IfcObjectPlacement {
	/**
	 * Returns the value of the '<em><b>Placement Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Location</em>' containment reference.
	 * @see #setPlacementLocation(PlacementLocationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridPlacement_PlacementLocation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PlacementLocation' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacementLocationType getPlacementLocation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridPlacement#getPlacementLocation <em>Placement Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Location</em>' containment reference.
	 * @see #getPlacementLocation()
	 * @generated
	 */
	void setPlacementLocation(PlacementLocationType value);

	/**
	 * Returns the value of the '<em><b>Placement Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Ref Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Ref Direction</em>' containment reference.
	 * @see #setPlacementRefDirection(PlacementRefDirectionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridPlacement_PlacementRefDirection()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PlacementRefDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacementRefDirectionType getPlacementRefDirection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridPlacement#getPlacementRefDirection <em>Placement Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Ref Direction</em>' containment reference.
	 * @see #getPlacementRefDirection()
	 * @generated
	 */
	void setPlacementRefDirection(PlacementRefDirectionType value);

} // IfcGridPlacement
