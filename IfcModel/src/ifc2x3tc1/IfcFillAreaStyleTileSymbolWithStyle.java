/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Tile Symbol With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFillAreaStyleTileSymbolWithStyle()
 * @model
 * @generated
 */
public interface IfcFillAreaStyleTileSymbolWithStyle extends IfcGeometricRepresentationItem, IfcFillAreaStyleTileShapeSelect {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' reference.
	 * @see #setSymbol(IfcAnnotationSymbolOccurrence)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcFillAreaStyleTileSymbolWithStyle_Symbol()
	 * @model
	 * @generated
	 */
	IfcAnnotationSymbolOccurrence getSymbol();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(IfcAnnotationSymbolOccurrence value);

} // IfcFillAreaStyleTileSymbolWithStyle
