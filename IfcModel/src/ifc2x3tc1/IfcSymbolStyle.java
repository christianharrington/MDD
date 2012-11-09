/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Symbol Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSymbolStyle()
 * @model
 * @generated
 */
public interface IfcSymbolStyle extends IfcPresentationStyle, IfcPresentationStyleSelect {
	/**
	 * Returns the value of the '<em><b>Style Of Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Of Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Of Symbol</em>' reference.
	 * @see #setStyleOfSymbol(IfcSymbolStyleSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcSymbolStyle_StyleOfSymbol()
	 * @model
	 * @generated
	 */
	IfcSymbolStyleSelect getStyleOfSymbol();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcSymbolStyle#getStyleOfSymbol <em>Style Of Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Of Symbol</em>' reference.
	 * @see #getStyleOfSymbol()
	 * @generated
	 */
	void setStyleOfSymbol(IfcSymbolStyleSelect value);

} // IfcSymbolStyle
