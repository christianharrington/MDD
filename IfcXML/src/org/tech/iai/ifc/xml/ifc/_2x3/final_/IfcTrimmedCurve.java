/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#isSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve()
 * @model extendedMetaData="name='IfcTrimmedCurve' kind='elementOnly'"
 * @generated
 */
public interface IfcTrimmedCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' containment reference.
	 * @see #setBasisCurve(BasisCurveType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve_BasisCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BasisCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	BasisCurveType1 getBasisCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' containment reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(BasisCurveType1 value);

	/**
	 * Returns the value of the '<em><b>Trim1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim1</em>' containment reference.
	 * @see #setTrim1(Trim1Type)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve_Trim1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trim1' namespace='##targetNamespace'"
	 * @generated
	 */
	Trim1Type getTrim1();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getTrim1 <em>Trim1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim1</em>' containment reference.
	 * @see #getTrim1()
	 * @generated
	 */
	void setTrim1(Trim1Type value);

	/**
	 * Returns the value of the '<em><b>Trim2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim2</em>' containment reference.
	 * @see #setTrim2(Trim2Type)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve_Trim2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trim2' namespace='##targetNamespace'"
	 * @generated
	 */
	Trim2Type getTrim2();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getTrim2 <em>Trim2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trim2</em>' containment reference.
	 * @see #getTrim2()
	 * @generated
	 */
	void setTrim2(Trim2Type value);

	/**
	 * Returns the value of the '<em><b>Sense Agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense Agreement</em>' attribute.
	 * @see #setSenseAgreement(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve_SenseAgreement()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='SenseAgreement' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSenseAgreement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#isSenseAgreement <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense Agreement</em>' attribute.
	 * @see #isSenseAgreement()
	 * @generated
	 */
	void setSenseAgreement(boolean value);

	/**
	 * Returns the value of the '<em><b>Master Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingPreference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Representation</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingPreference
	 * @see #setMasterRepresentation(IfcTrimmingPreference)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmedCurve_MasterRepresentation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MasterRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTrimmingPreference getMasterRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Representation</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingPreference
	 * @see #getMasterRepresentation()
	 * @generated
	 */
	void setMasterRepresentation(IfcTrimmingPreference value);

} // IfcTrimmedCurve
