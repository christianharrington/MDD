/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Arbitrary Profile Def With Voids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryProfileDefWithVoids#getInnerCurves <em>Inner Curves</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryProfileDefWithVoids()
 * @model extendedMetaData="name='IfcArbitraryProfileDefWithVoids' kind='elementOnly'"
 * @generated
 */
public interface IfcArbitraryProfileDefWithVoids extends IfcArbitraryClosedProfileDef {
	/**
	 * Returns the value of the '<em><b>Inner Curves</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Curves</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Curves</em>' containment reference.
	 * @see #setInnerCurves(InnerCurvesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcArbitraryProfileDefWithVoids_InnerCurves()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InnerCurves' namespace='##targetNamespace'"
	 * @generated
	 */
	InnerCurvesType getInnerCurves();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcArbitraryProfileDefWithVoids#getInnerCurves <em>Inner Curves</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Curves</em>' containment reference.
	 * @see #getInnerCurves()
	 * @generated
	 */
	void setInnerCurves(InnerCurvesType value);

} // IfcArbitraryProfileDefWithVoids
