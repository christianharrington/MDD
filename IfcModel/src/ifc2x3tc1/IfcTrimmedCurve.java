/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTrimmedCurve#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTrimmedCurve#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve()
 * @model
 * @generated
 */
public interface IfcTrimmedCurve extends IfcBoundedCurve {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' reference.
	 * @see #setBasisCurve(IfcCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve_BasisCurve()
	 * @model
	 * @generated
	 */
	IfcCurve getBasisCurve();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTrimmedCurve#getBasisCurve <em>Basis Curve</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(IfcCurve value);

	/**
	 * Returns the value of the '<em><b>Trim1</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcTrimmingSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim1</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim1</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve_Trim1()
	 * @model
	 * @generated
	 */
	EList<IfcTrimmingSelect> getTrim1();

	/**
	 * Returns the value of the '<em><b>Trim2</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcTrimmingSelect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trim2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trim2</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve_Trim2()
	 * @model
	 * @generated
	 */
	EList<IfcTrimmingSelect> getTrim2();

	/**
	 * Returns the value of the '<em><b>Sense Agreement</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sense Agreement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sense Agreement</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setSenseAgreement(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve_SenseAgreement()
	 * @model
	 * @generated
	 */
	Tristate getSenseAgreement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTrimmedCurve#getSenseAgreement <em>Sense Agreement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sense Agreement</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getSenseAgreement()
	 * @generated
	 */
	void setSenseAgreement(Tristate value);

	/**
	 * Returns the value of the '<em><b>Master Representation</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcTrimmingPreference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Representation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Representation</em>' attribute.
	 * @see ifc2x3tc1.IfcTrimmingPreference
	 * @see #setMasterRepresentation(IfcTrimmingPreference)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTrimmedCurve_MasterRepresentation()
	 * @model
	 * @generated
	 */
	IfcTrimmingPreference getMasterRepresentation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTrimmedCurve#getMasterRepresentation <em>Master Representation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Representation</em>' attribute.
	 * @see ifc2x3tc1.IfcTrimmingPreference
	 * @see #getMasterRepresentation()
	 * @generated
	 */
	void setMasterRepresentation(IfcTrimmingPreference value);

} // IfcTrimmedCurve
