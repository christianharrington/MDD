/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSymbolStyle()
 * @model extendedMetaData="name='IfcSymbolStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcSymbolStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Style Of Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Of Symbol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Of Symbol</em>' containment reference.
	 * @see #setStyleOfSymbol(StyleOfSymbolType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSymbolStyle_StyleOfSymbol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StyleOfSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleOfSymbolType getStyleOfSymbol();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Of Symbol</em>' containment reference.
	 * @see #getStyleOfSymbol()
	 * @generated
	 */
	void setStyleOfSymbol(StyleOfSymbolType value);

} // IfcSymbolStyle
