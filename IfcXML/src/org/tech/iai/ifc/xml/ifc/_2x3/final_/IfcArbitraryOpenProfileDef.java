/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Arbitrary Open Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryOpenProfileDef#getCurve <em>Curve</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryOpenProfileDef()
 * @model extendedMetaData="name='IfcArbitraryOpenProfileDef' kind='elementOnly'"
 * @generated
 */
public interface IfcArbitraryOpenProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve</em>' containment reference.
	 * @see #setCurve(CurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryOpenProfileDef_Curve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Curve' namespace='##targetNamespace'"
	 * @generated
	 */
	CurveType getCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryOpenProfileDef#getCurve <em>Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve</em>' containment reference.
	 * @see #getCurve()
	 * @generated
	 */
	void setCurve(CurveType value);

} // IfcArbitraryOpenProfileDef
