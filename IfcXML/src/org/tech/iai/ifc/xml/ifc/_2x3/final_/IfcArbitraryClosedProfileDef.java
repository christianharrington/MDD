/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Arbitrary Closed Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryClosedProfileDef#getOuterCurve <em>Outer Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryClosedProfileDef()
 * @model extendedMetaData="name='IfcArbitraryClosedProfileDef' kind='elementOnly'"
 * @generated
 */
public interface IfcArbitraryClosedProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Outer Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Curve</em>' containment reference.
	 * @see #setOuterCurve(OuterCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryClosedProfileDef_OuterCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OuterCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterCurveType getOuterCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryClosedProfileDef#getOuterCurve <em>Outer Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Curve</em>' containment reference.
	 * @see #getOuterCurve()
	 * @generated
	 */
	void setOuterCurve(OuterCurveType value);

} // IfcArbitraryClosedProfileDef
