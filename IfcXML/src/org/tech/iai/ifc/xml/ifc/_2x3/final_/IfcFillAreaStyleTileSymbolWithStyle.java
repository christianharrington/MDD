/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Tile Symbol With Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTileSymbolWithStyle()
 * @model extendedMetaData="name='IfcFillAreaStyleTileSymbolWithStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcFillAreaStyleTileSymbolWithStyle extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(SymbolType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleTileSymbolWithStyle_Symbol()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolType getSymbol();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleTileSymbolWithStyle#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(SymbolType value);

} // IfcFillAreaStyleTileSymbolWithStyle
