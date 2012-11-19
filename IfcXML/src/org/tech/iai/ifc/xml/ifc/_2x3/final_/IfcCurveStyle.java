/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveFont <em>Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyle()
 * @model extendedMetaData="name='IfcCurveStyle' kind='elementOnly'"
 * @generated
 */
public interface IfcCurveStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Curve Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Font</em>' containment reference.
	 * @see #setCurveFont(CurveFontType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyle_CurveFont()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CurveFont' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveFontType1 getCurveFont();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveFont <em>Curve Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Font</em>' containment reference.
	 * @see #getCurveFont()
	 * @generated
	 */
	void setCurveFont(CurveFontType1 value);

	/**
	 * Returns the value of the '<em><b>Curve Width</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Width</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Width</em>' containment reference.
	 * @see #setCurveWidth(CurveWidthType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyle_CurveWidth()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CurveWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveWidthType getCurveWidth();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveWidth <em>Curve Width</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Width</em>' containment reference.
	 * @see #getCurveWidth()
	 * @generated
	 */
	void setCurveWidth(CurveWidthType value);

	/**
	 * Returns the value of the '<em><b>Curve Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve Colour</em>' containment reference.
	 * @see #setCurveColour(CurveColourType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyle_CurveColour()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='CurveColour' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveColourType getCurveColour();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyle#getCurveColour <em>Curve Colour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve Colour</em>' containment reference.
	 * @see #getCurveColour()
	 * @generated
	 */
	void setCurveColour(CurveColourType value);

} // IfcCurveStyle
