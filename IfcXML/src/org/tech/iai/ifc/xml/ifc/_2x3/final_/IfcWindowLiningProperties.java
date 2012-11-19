/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Window Lining Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties()
 * @model extendedMetaData="name='IfcWindowLiningProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcWindowLiningProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Lining Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Depth</em>' attribute.
	 * @see #setLiningDepth(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_LiningDepth()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='LiningDepth' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLiningDepth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getLiningDepth <em>Lining Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Depth</em>' attribute.
	 * @see #getLiningDepth()
	 * @generated
	 */
	void setLiningDepth(Double value);

	/**
	 * Returns the value of the '<em><b>Lining Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lining Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lining Thickness</em>' attribute.
	 * @see #setLiningThickness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_LiningThickness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='LiningThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLiningThickness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getLiningThickness <em>Lining Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lining Thickness</em>' attribute.
	 * @see #getLiningThickness()
	 * @generated
	 */
	void setLiningThickness(Double value);

	/**
	 * Returns the value of the '<em><b>Transom Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transom Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transom Thickness</em>' attribute.
	 * @see #setTransomThickness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_TransomThickness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='TransomThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTransomThickness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getTransomThickness <em>Transom Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transom Thickness</em>' attribute.
	 * @see #getTransomThickness()
	 * @generated
	 */
	void setTransomThickness(Double value);

	/**
	 * Returns the value of the '<em><b>Mullion Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mullion Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #setMullionThickness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_MullionThickness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='MullionThickness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMullionThickness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getMullionThickness <em>Mullion Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mullion Thickness</em>' attribute.
	 * @see #getMullionThickness()
	 * @generated
	 */
	void setMullionThickness(Double value);

	/**
	 * Returns the value of the '<em><b>First Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Transom Offset</em>' attribute.
	 * @see #setFirstTransomOffset(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_FirstTransomOffset()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='FirstTransomOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFirstTransomOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getFirstTransomOffset <em>First Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Transom Offset</em>' attribute.
	 * @see #getFirstTransomOffset()
	 * @generated
	 */
	void setFirstTransomOffset(Double value);

	/**
	 * Returns the value of the '<em><b>Second Transom Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Transom Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #setSecondTransomOffset(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_SecondTransomOffset()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='SecondTransomOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSecondTransomOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getSecondTransomOffset <em>Second Transom Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Transom Offset</em>' attribute.
	 * @see #getSecondTransomOffset()
	 * @generated
	 */
	void setSecondTransomOffset(Double value);

	/**
	 * Returns the value of the '<em><b>First Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #setFirstMullionOffset(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_FirstMullionOffset()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='FirstMullionOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getFirstMullionOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getFirstMullionOffset <em>First Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Mullion Offset</em>' attribute.
	 * @see #getFirstMullionOffset()
	 * @generated
	 */
	void setFirstMullionOffset(Double value);

	/**
	 * Returns the value of the '<em><b>Second Mullion Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Mullion Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #setSecondMullionOffset(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_SecondMullionOffset()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='SecondMullionOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSecondMullionOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getSecondMullionOffset <em>Second Mullion Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Mullion Offset</em>' attribute.
	 * @see #getSecondMullionOffset()
	 * @generated
	 */
	void setSecondMullionOffset(Double value);

	/**
	 * Returns the value of the '<em><b>Shape Aspect Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Aspect Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #setShapeAspectStyle(ShapeAspectStyleType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWindowLiningProperties_ShapeAspectStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ShapeAspectStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeAspectStyleType getShapeAspectStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWindowLiningProperties#getShapeAspectStyle <em>Shape Aspect Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Aspect Style</em>' containment reference.
	 * @see #getShapeAspectStyle()
	 * @generated
	 */
	void setShapeAspectStyle(ShapeAspectStyleType value);

} // IfcWindowLiningProperties
