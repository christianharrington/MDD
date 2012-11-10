/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTerminatorSymbol()
 * @model
 * @generated
 */
public interface IfcTerminatorSymbol extends IfcAnnotationSymbolOccurrence {
	/**
	 * Returns the value of the '<em><b>Annotated Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Curve</em>' reference.
	 * @see #setAnnotatedCurve(IfcAnnotationCurveOccurrence)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTerminatorSymbol_AnnotatedCurve()
	 * @model
	 * @generated
	 */
	IfcAnnotationCurveOccurrence getAnnotatedCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Curve</em>' reference.
	 * @see #getAnnotatedCurve()
	 * @generated
	 */
	void setAnnotatedCurve(IfcAnnotationCurveOccurrence value);

} // IfcTerminatorSymbol
