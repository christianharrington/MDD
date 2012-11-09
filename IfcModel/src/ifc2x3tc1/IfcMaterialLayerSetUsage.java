/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Layer Set Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getForLayerSet <em>For Layer Set</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getOffsetFromReferenceLineAsString <em>Offset From Reference Line As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage()
 * @model
 * @generated
 */
public interface IfcMaterialLayerSetUsage extends IfcMaterialSelect {
	/**
	 * Returns the value of the '<em><b>For Layer Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For Layer Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For Layer Set</em>' reference.
	 * @see #setForLayerSet(IfcMaterialLayerSet)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage_ForLayerSet()
	 * @model
	 * @generated
	 */
	IfcMaterialLayerSet getForLayerSet();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getForLayerSet <em>For Layer Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For Layer Set</em>' reference.
	 * @see #getForLayerSet()
	 * @generated
	 */
	void setForLayerSet(IfcMaterialLayerSet value);

	/**
	 * Returns the value of the '<em><b>Layer Set Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcLayerSetDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set Direction</em>' attribute.
	 * @see ifc2x3tc1.IfcLayerSetDirectionEnum
	 * @see #setLayerSetDirection(IfcLayerSetDirectionEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage_LayerSetDirection()
	 * @model
	 * @generated
	 */
	IfcLayerSetDirectionEnum getLayerSetDirection();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getLayerSetDirection <em>Layer Set Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Set Direction</em>' attribute.
	 * @see ifc2x3tc1.IfcLayerSetDirectionEnum
	 * @see #getLayerSetDirection()
	 * @generated
	 */
	void setLayerSetDirection(IfcLayerSetDirectionEnum value);

	/**
	 * Returns the value of the '<em><b>Direction Sense</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcDirectionSenseEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Sense</em>' attribute.
	 * @see ifc2x3tc1.IfcDirectionSenseEnum
	 * @see #setDirectionSense(IfcDirectionSenseEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage_DirectionSense()
	 * @model
	 * @generated
	 */
	IfcDirectionSenseEnum getDirectionSense();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getDirectionSense <em>Direction Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Sense</em>' attribute.
	 * @see ifc2x3tc1.IfcDirectionSenseEnum
	 * @see #getDirectionSense()
	 * @generated
	 */
	void setDirectionSense(IfcDirectionSenseEnum value);

	/**
	 * Returns the value of the '<em><b>Offset From Reference Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset From Reference Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset From Reference Line</em>' attribute.
	 * @see #setOffsetFromReferenceLine(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage_OffsetFromReferenceLine()
	 * @model
	 * @generated
	 */
	double getOffsetFromReferenceLine();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getOffsetFromReferenceLine <em>Offset From Reference Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset From Reference Line</em>' attribute.
	 * @see #getOffsetFromReferenceLine()
	 * @generated
	 */
	void setOffsetFromReferenceLine(double value);

	/**
	 * Returns the value of the '<em><b>Offset From Reference Line As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset From Reference Line As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset From Reference Line As String</em>' attribute.
	 * @see #setOffsetFromReferenceLineAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMaterialLayerSetUsage_OffsetFromReferenceLineAsString()
	 * @model
	 * @generated
	 */
	String getOffsetFromReferenceLineAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMaterialLayerSetUsage#getOffsetFromReferenceLineAsString <em>Offset From Reference Line As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset From Reference Line As String</em>' attribute.
	 * @see #getOffsetFromReferenceLineAsString()
	 * @generated
	 */
	void setOffsetFromReferenceLineAsString(String value);

} // IfcMaterialLayerSetUsage
