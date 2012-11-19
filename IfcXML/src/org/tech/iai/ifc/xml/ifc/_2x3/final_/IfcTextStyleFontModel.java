/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel()
 * @model extendedMetaData="name='IfcTextStyleFontModel' kind='elementOnly'"
 * @generated
 */
public interface IfcTextStyleFontModel extends IfcPreDefinedTextFont {
	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' containment reference.
	 * @see #setFontFamily(FontFamilyType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel_FontFamily()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FontFamily' namespace='##targetNamespace'"
	 * @generated
	 */
	FontFamilyType getFontFamily();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontFamily <em>Font Family</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' containment reference.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(FontFamilyType value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see #setFontStyle(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel_FontStyle()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFontStyle"
	 *        extendedMetaData="kind='element' name='FontStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(String value);

	/**
	 * Returns the value of the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Variant</em>' attribute.
	 * @see #setFontVariant(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel_FontVariant()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFontVariant"
	 *        extendedMetaData="kind='element' name='FontVariant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontVariant();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Variant</em>' attribute.
	 * @see #getFontVariant()
	 * @generated
	 */
	void setFontVariant(String value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see #setFontWeight(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel_FontWeight()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFontWeight"
	 *        extendedMetaData="kind='element' name='FontWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFontWeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' containment reference.
	 * @see #setFontSize(FontSizeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextStyleFontModel_FontSize()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FontSize' namespace='##targetNamespace'"
	 * @generated
	 */
	FontSizeType getFontSize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextStyleFontModel#getFontSize <em>Font Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' containment reference.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(FontSizeType value);

} // IfcTextStyleFontModel
