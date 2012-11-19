/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationContext()
 * @model extendedMetaData="name='IfcGeometricRepresentationContext' kind='elementOnly'"
 * @generated
 */
public interface IfcGeometricRepresentationContext extends IfcRepresentationContext {
	/**
	 * Returns the value of the '<em><b>Coordinate Space Dimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinate Space Dimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #setCoordinateSpaceDimension(long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationContext_CoordinateSpaceDimension()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDimensionCount"
	 *        extendedMetaData="kind='element' name='CoordinateSpaceDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	long getCoordinateSpaceDimension();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getCoordinateSpaceDimension <em>Coordinate Space Dimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinate Space Dimension</em>' attribute.
	 * @see #getCoordinateSpaceDimension()
	 * @generated
	 */
	void setCoordinateSpaceDimension(long value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationContext_Precision()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DoubleObject"
	 *        extendedMetaData="kind='element' name='Precision' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPrecision();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Double value);

	/**
	 * Returns the value of the '<em><b>World Coordinate System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>World Coordinate System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>World Coordinate System</em>' containment reference.
	 * @see #setWorldCoordinateSystem(WorldCoordinateSystemType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationContext_WorldCoordinateSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WorldCoordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	WorldCoordinateSystemType getWorldCoordinateSystem();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getWorldCoordinateSystem <em>World Coordinate System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>World Coordinate System</em>' containment reference.
	 * @see #getWorldCoordinateSystem()
	 * @generated
	 */
	void setWorldCoordinateSystem(WorldCoordinateSystemType value);

	/**
	 * Returns the value of the '<em><b>True North</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>True North</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True North</em>' containment reference.
	 * @see #setTrueNorth(TrueNorthType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationContext_TrueNorth()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='TrueNorth' namespace='##targetNamespace'"
	 * @generated
	 */
	TrueNorthType getTrueNorth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationContext#getTrueNorth <em>True North</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True North</em>' containment reference.
	 * @see #getTrueNorth()
	 * @generated
	 */
	void setTrueNorth(TrueNorthType value);

} // IfcGeometricRepresentationContext
