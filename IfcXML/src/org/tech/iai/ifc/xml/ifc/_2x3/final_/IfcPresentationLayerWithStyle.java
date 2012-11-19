/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Presentation Layer With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerStyles <em>Layer Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationLayerWithStyle()
 * @model extendedMetaData="name='IfcPresentationLayerWithStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
	/**
	 * Returns the value of the '<em><b>Layer On</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer On</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #setLayerOn(Logical)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationLayerWithStyle_LayerOn()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LayerOn' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getLayerOn();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerOn <em>Layer On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer On</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getLayerOn()
	 * @generated
	 */
	void setLayerOn(Logical value);

	/**
	 * Returns the value of the '<em><b>Layer Frozen</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Frozen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Frozen</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #setLayerFrozen(Logical)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationLayerWithStyle_LayerFrozen()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LayerFrozen' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getLayerFrozen();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerFrozen <em>Layer Frozen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Frozen</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getLayerFrozen()
	 * @generated
	 */
	void setLayerFrozen(Logical value);

	/**
	 * Returns the value of the '<em><b>Layer Blocked</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Blocked</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #setLayerBlocked(Logical)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationLayerWithStyle_LayerBlocked()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LayerBlocked' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getLayerBlocked();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerBlocked <em>Layer Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Blocked</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getLayerBlocked()
	 * @generated
	 */
	void setLayerBlocked(Logical value);

	/**
	 * Returns the value of the '<em><b>Layer Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Styles</em>' containment reference.
	 * @see #setLayerStyles(LayerStylesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPresentationLayerWithStyle_LayerStyles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LayerStyles' namespace='##targetNamespace'"
	 * @generated
	 */
	LayerStylesType getLayerStyles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPresentationLayerWithStyle#getLayerStyles <em>Layer Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Styles</em>' containment reference.
	 * @see #getLayerStyles()
	 * @generated
	 */
	void setLayerStyles(LayerStylesType value);

} // IfcPresentationLayerWithStyle
