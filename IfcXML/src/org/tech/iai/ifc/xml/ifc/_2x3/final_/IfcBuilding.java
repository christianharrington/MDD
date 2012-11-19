/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getBuildingAddress <em>Building Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBuilding()
 * @model extendedMetaData="name='IfcBuilding' kind='elementOnly'"
 * @generated
 */
public interface IfcBuilding extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Elevation Of Ref Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Ref Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Ref Height</em>' attribute.
	 * @see #setElevationOfRefHeight(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBuilding_ElevationOfRefHeight()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='ElevationOfRefHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getElevationOfRefHeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getElevationOfRefHeight <em>Elevation Of Ref Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Ref Height</em>' attribute.
	 * @see #getElevationOfRefHeight()
	 * @generated
	 */
	void setElevationOfRefHeight(Double value);

	/**
	 * Returns the value of the '<em><b>Elevation Of Terrain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation Of Terrain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation Of Terrain</em>' attribute.
	 * @see #setElevationOfTerrain(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBuilding_ElevationOfTerrain()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='ElevationOfTerrain' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getElevationOfTerrain();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getElevationOfTerrain <em>Elevation Of Terrain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation Of Terrain</em>' attribute.
	 * @see #getElevationOfTerrain()
	 * @generated
	 */
	void setElevationOfTerrain(Double value);

	/**
	 * Returns the value of the '<em><b>Building Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Building Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Address</em>' containment reference.
	 * @see #setBuildingAddress(BuildingAddressType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBuilding_BuildingAddress()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='BuildingAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	BuildingAddressType getBuildingAddress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBuilding#getBuildingAddress <em>Building Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Address</em>' containment reference.
	 * @see #getBuildingAddress()
	 * @generated
	 */
	void setBuildingAddress(BuildingAddressType value);

} // IfcBuilding
