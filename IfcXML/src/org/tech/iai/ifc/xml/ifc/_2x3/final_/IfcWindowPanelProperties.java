/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Window Panel Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties()
 * @model extendedMetaData="name='IfcWindowPanelProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcWindowPanelProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelOperationEnum
	 * @see #setOperationType(IfcWindowPanelOperationEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties_OperationType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='OperationType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcWindowPanelOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelOperationEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcWindowPanelOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelPositionEnum
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties_PanelPosition()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PanelPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcWindowPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelPositionEnum
	 * @see #getPanelPosition()
	 * @generated
	 */
	void setPanelPosition(IfcWindowPanelPositionEnum value);

	/**
	 * Returns the value of the '<em><b>Frame Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Depth</em>' attribute.
	 * @see #setFrameDepth(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties_FrameDepth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='FrameDepth' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFrameDepth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getFrameDepth <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Depth</em>' attribute.
	 * @see #getFrameDepth()
	 * @generated
	 */
	void setFrameDepth(Double value);

	/**
	 * Returns the value of the '<em><b>Frame Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Thickness</em>' attribute.
	 * @see #setFrameThickness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties_FrameThickness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='FrameThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFrameThickness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getFrameThickness <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Thickness</em>' attribute.
	 * @see #getFrameThickness()
	 * @generated
	 */
	void setFrameThickness(Double value);

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #setShapeAspectStyle(ShapeAspectStyleType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowPanelProperties_ShapeAspectStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ShapeAspectStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeAspectStyleType1 getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowPanelProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(ShapeAspectStyleType1 value);

} // IfcWindowPanelProperties
