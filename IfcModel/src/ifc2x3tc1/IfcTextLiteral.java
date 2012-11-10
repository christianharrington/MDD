/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextLiteral#getLiteral <em>Literal</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTextLiteral#getPlacement <em>Placement</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTextLiteral#getPath <em>Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteral()
 * @model
 * @generated
 */
public interface IfcTextLiteral extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' attribute.
	 * @see #setLiteral(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteral_Literal()
	 * @model
	 * @generated
	 */
	String getLiteral();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextLiteral#getLiteral <em>Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal</em>' attribute.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(String value);

	/**
	 * Returns the value of the '<em><b>Placement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placement</em>' reference.
	 * @see #setPlacement(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteral_Placement()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getPlacement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextLiteral#getPlacement <em>Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placement</em>' reference.
	 * @see #getPlacement()
	 * @generated
	 */
	void setPlacement(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcTextPath}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see ifc2x3tc1.IfcTextPath
	 * @see #setPath(IfcTextPath)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextLiteral_Path()
	 * @model
	 * @generated
	 */
	IfcTextPath getPath();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextLiteral#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see ifc2x3tc1.IfcTextPath
	 * @see #getPath()
	 * @generated
	 */
	void setPath(IfcTextPath value);

} // IfcTextLiteral
