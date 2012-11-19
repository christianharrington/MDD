/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Door Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties()
 * @model extendedMetaData="name='IfcDoorPanelProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcDoorPanelProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Panel Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Depth</em>' attribute.
	 * @see #setPanelDepth(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties_PanelDepth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='PanelDepth' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPanelDepth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelDepth <em>Panel Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Depth</em>' attribute.
	 * @see #getPanelDepth()
	 * @generated
	 */
	void setPanelDepth(Double value);

	/**
	 * Returns the value of the '<em><b>Panel Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Operation</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelOperationEnum
	 * @see #setPanelOperation(IfcDoorPanelOperationEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties_PanelOperation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PanelOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDoorPanelOperationEnum getPanelOperation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelOperation <em>Panel Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Operation</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelOperationEnum
	 * @see #getPanelOperation()
	 * @generated
	 */
	void setPanelOperation(IfcDoorPanelOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Panel Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Width</em>' attribute.
	 * @see #setPanelWidth(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties_PanelWidth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='PanelWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPanelWidth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelWidth <em>Panel Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Width</em>' attribute.
	 * @see #getPanelWidth()
	 * @generated
	 */
	void setPanelWidth(Double value);

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelPositionEnum
	 * @see #setPanelPosition(IfcDoorPanelPositionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties_PanelPosition()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PanelPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDoorPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelPositionEnum
	 * @see #getPanelPosition()
	 * @generated
	 */
	void setPanelPosition(IfcDoorPanelPositionEnum value);

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #setShapeAspectStyle(ShapeAspectStyleType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDoorPanelProperties_ShapeAspectStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ShapeAspectStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeAspectStyleType3 getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDoorPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(ShapeAspectStyleType3 value);

} // IfcDoorPanelProperties
