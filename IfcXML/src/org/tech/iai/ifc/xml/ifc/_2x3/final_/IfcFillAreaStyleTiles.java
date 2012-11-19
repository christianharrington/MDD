/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Tiles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTilingPattern <em>Tiling Pattern</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTiles <em>Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTiles()
 * @model extendedMetaData="name='IfcFillAreaStyleTiles' kind='elementOnly'"
 * @generated
 */
public interface IfcFillAreaStyleTiles extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Tiling Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiling Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Pattern</em>' containment reference.
	 * @see #setTilingPattern(TilingPatternType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTiles_TilingPattern()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TilingPattern' namespace='##targetNamespace'"
	 * @generated
	 */
	TilingPatternType getTilingPattern();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTilingPattern <em>Tiling Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Pattern</em>' containment reference.
	 * @see #getTilingPattern()
	 * @generated
	 */
	void setTilingPattern(TilingPatternType value);

	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference.
	 * @see #setTiles(TilesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTiles_Tiles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Tiles' namespace='##targetNamespace'"
	 * @generated
	 */
	TilesType getTiles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTiles <em>Tiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiles</em>' containment reference.
	 * @see #getTiles()
	 * @generated
	 */
	void setTiles(TilesType value);

	/**
	 * Returns the value of the '<em><b>Tiling Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiling Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiling Scale</em>' attribute.
	 * @see #setTilingScale(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTiles_TilingScale()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasure" required="true"
	 *        extendedMetaData="kind='element' name='TilingScale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTilingScale();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTiles#getTilingScale <em>Tiling Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tiling Scale</em>' attribute.
	 * @see #getTilingScale()
	 * @generated
	 */
	void setTilingScale(double value);

} // IfcFillAreaStyleTiles
