/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Permeable Covering Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getPanelPosition <em>Panel Position</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepthAsString <em>Frame Depth As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThicknessAsString <em>Frame Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties()
 * @model
 * @generated
 */
public interface IfcPermeableCoveringProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcPermeableCoveringOperationEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcPermeableCoveringOperationEnum
	 * @see #setOperationType(IfcPermeableCoveringOperationEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_OperationType()
	 * @model
	 * @generated
	 */
	IfcPermeableCoveringOperationEnum getOperationType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see ifc2x3tc1.IfcPermeableCoveringOperationEnum
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcPermeableCoveringOperationEnum value);

	/**
	 * Returns the value of the '<em><b>Panel Position</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcWindowPanelPositionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Position</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowPanelPositionEnum
	 * @see #setPanelPosition(IfcWindowPanelPositionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_PanelPosition()
	 * @model
	 * @generated
	 */
	IfcWindowPanelPositionEnum getPanelPosition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getPanelPosition <em>Panel Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Position</em>' attribute.
	 * @see ifc2x3tc1.IfcWindowPanelPositionEnum
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
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #setFrameDepth(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_FrameDepth()
	 * @model unsettable="true"
	 * @generated
	 */
	double getFrameDepth();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Depth</em>' attribute.
	 * @see #isSetFrameDepth()
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @generated
	 */
	void setFrameDepth(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(double)
	 * @generated
	 */
	void unsetFrameDepth();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepth <em>Frame Depth</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Depth</em>' attribute is set.
	 * @see #unsetFrameDepth()
	 * @see #getFrameDepth()
	 * @see #setFrameDepth(double)
	 * @generated
	 */
	boolean isSetFrameDepth();

	/**
	 * Returns the value of the '<em><b>Frame Depth As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Depth As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Depth As String</em>' attribute.
	 * @see #isSetFrameDepthAsString()
	 * @see #unsetFrameDepthAsString()
	 * @see #setFrameDepthAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_FrameDepthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFrameDepthAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepthAsString <em>Frame Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Depth As String</em>' attribute.
	 * @see #isSetFrameDepthAsString()
	 * @see #unsetFrameDepthAsString()
	 * @see #getFrameDepthAsString()
	 * @generated
	 */
	void setFrameDepthAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepthAsString <em>Frame Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameDepthAsString()
	 * @see #getFrameDepthAsString()
	 * @see #setFrameDepthAsString(String)
	 * @generated
	 */
	void unsetFrameDepthAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameDepthAsString <em>Frame Depth As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Depth As String</em>' attribute is set.
	 * @see #unsetFrameDepthAsString()
	 * @see #getFrameDepthAsString()
	 * @see #setFrameDepthAsString(String)
	 * @generated
	 */
	boolean isSetFrameDepthAsString();

	/**
	 * Returns the value of the '<em><b>Frame Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Thickness</em>' attribute.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #setFrameThickness(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_FrameThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	double getFrameThickness();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Thickness</em>' attribute.
	 * @see #isSetFrameThickness()
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @generated
	 */
	void setFrameThickness(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(double)
	 * @generated
	 */
	void unsetFrameThickness();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThickness <em>Frame Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Thickness</em>' attribute is set.
	 * @see #unsetFrameThickness()
	 * @see #getFrameThickness()
	 * @see #setFrameThickness(double)
	 * @generated
	 */
	boolean isSetFrameThickness();

	/**
	 * Returns the value of the '<em><b>Frame Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Thickness As String</em>' attribute.
	 * @see #isSetFrameThicknessAsString()
	 * @see #unsetFrameThicknessAsString()
	 * @see #setFrameThicknessAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_FrameThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFrameThicknessAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThicknessAsString <em>Frame Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Thickness As String</em>' attribute.
	 * @see #isSetFrameThicknessAsString()
	 * @see #unsetFrameThicknessAsString()
	 * @see #getFrameThicknessAsString()
	 * @generated
	 */
	void setFrameThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThicknessAsString <em>Frame Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrameThicknessAsString()
	 * @see #getFrameThicknessAsString()
	 * @see #setFrameThicknessAsString(String)
	 * @generated
	 */
	void unsetFrameThicknessAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getFrameThicknessAsString <em>Frame Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame Thickness As String</em>' attribute is set.
	 * @see #unsetFrameThicknessAsString()
	 * @see #getFrameThicknessAsString()
	 * @see #setFrameThicknessAsString(String)
	 * @generated
	 */
	boolean isSetFrameThicknessAsString();

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcPermeableCoveringProperties_ShapeAspectStyle()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcShapeAspect getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' reference.
	 * @see #isSetShapeAspectStyle()
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(IfcShapeAspect value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	void unsetShapeAspectStyle();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcPermeableCoveringProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape Aspect Style</em>' reference is set.
	 * @see #unsetShapeAspectStyle()
	 * @see #getShapeAspectStyle()
	 * @see #setShapeAspectStyle(IfcShapeAspect)
	 * @generated
	 */
	boolean isSetShapeAspectStyle();

} // IfcPermeableCoveringProperties
