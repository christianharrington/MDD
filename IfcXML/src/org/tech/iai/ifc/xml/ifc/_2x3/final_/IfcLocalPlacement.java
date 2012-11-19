/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Local Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement#getRelativePlacement <em>Relative Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalPlacement()
 * @model extendedMetaData="name='IfcLocalPlacement' kind='elementOnly'"
 * @generated
 */
public interface IfcLocalPlacement extends IfcObjectPlacement {
	/**
	 * Returns the value of the '<em><b>Placement Rel To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement Rel To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement Rel To</em>' containment reference.
	 * @see #setPlacementRelTo(PlacementRelToType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalPlacement_PlacementRelTo()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PlacementRelTo' namespace='##targetNamespace'"
	 * @generated
	 */
	PlacementRelToType getPlacementRelTo();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement#getPlacementRelTo <em>Placement Rel To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement Rel To</em>' containment reference.
	 * @see #getPlacementRelTo()
	 * @generated
	 */
	void setPlacementRelTo(PlacementRelToType value);

	/**
	 * Returns the value of the '<em><b>Relative Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Placement</em>' containment reference.
	 * @see #setRelativePlacement(RelativePlacementType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalPlacement_RelativePlacement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelativePlacement' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativePlacementType getRelativePlacement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalPlacement#getRelativePlacement <em>Relative Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Placement</em>' containment reference.
	 * @see #getRelativePlacement()
	 * @generated
	 */
	void setRelativePlacement(RelativePlacementType value);

} // IfcLocalPlacement
