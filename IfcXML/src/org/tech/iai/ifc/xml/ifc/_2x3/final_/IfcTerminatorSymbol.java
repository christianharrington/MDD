/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Terminator Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTerminatorSymbol()
 * @model extendedMetaData="name='IfcTerminatorSymbol' kind='elementOnly'"
 * @generated
 */
public interface IfcTerminatorSymbol extends IfcAnnotationSymbolOccurrence {
	/**
	 * Returns the value of the '<em><b>Annotated Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Curve</em>' containment reference.
	 * @see #setAnnotatedCurve(AnnotatedCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTerminatorSymbol_AnnotatedCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AnnotatedCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnotatedCurveType getAnnotatedCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTerminatorSymbol#getAnnotatedCurve <em>Annotated Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Curve</em>' containment reference.
	 * @see #getAnnotatedCurve()
	 * @generated
	 */
	void setAnnotatedCurve(AnnotatedCurveType value);

} // IfcTerminatorSymbol
