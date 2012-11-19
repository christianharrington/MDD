/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyle#getFillStyles <em>Fill Styles</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyle()
 * @model extendedMetaData="name='IfcFillAreaStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcFillAreaStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Fill Styles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Styles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Styles</em>' containment reference.
	 * @see #setFillStyles(FillStylesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyle_FillStyles()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FillStyles' namespace='##targetNamespace'"
	 * @generated
	 */
	FillStylesType getFillStyles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyle#getFillStyles <em>Fill Styles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Styles</em>' containment reference.
	 * @see #getFillStyles()
	 * @generated
	 */
	void setFillStyles(FillStylesType value);

} // IfcFillAreaStyle
