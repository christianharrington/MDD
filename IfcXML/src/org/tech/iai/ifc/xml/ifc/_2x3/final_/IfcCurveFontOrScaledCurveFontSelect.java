/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Font Or Scaled Curve Font Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcPreDefinedCurveFontGroup <em>Ifc Pre Defined Curve Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcPreDefinedCurveFont <em>Ifc Pre Defined Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcCurveStyleFontAndScaling <em>Ifc Curve Style Font And Scaling</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveFontOrScaledCurveFontSelect()
 * @model extendedMetaData="name='IfcCurveFontOrScaledCurveFontSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcCurveFontOrScaledCurveFontSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Curve Font Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Curve Font Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Curve Font Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveFontOrScaledCurveFontSelect_IfcPreDefinedCurveFontGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPreDefinedCurveFont:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPreDefinedCurveFontGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Curve Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Curve Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Curve Font</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveFontOrScaledCurveFontSelect_IfcPreDefinedCurveFont()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedCurveFont' namespace='##targetNamespace' group='IfcPreDefinedCurveFont:group'"
	 * @generated
	 */
	IfcPreDefinedCurveFont getIfcPreDefinedCurveFont();

	/**
	 * Returns the value of the '<em><b>Ifc Curve Style Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Curve Style Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Curve Style Font</em>' containment reference.
	 * @see #setIfcCurveStyleFont(IfcCurveStyleFont)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveFontOrScaledCurveFontSelect_IfcCurveStyleFont()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCurveStyleFont' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCurveStyleFont getIfcCurveStyleFont();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curve Style Font</em>' containment reference.
	 * @see #getIfcCurveStyleFont()
	 * @generated
	 */
	void setIfcCurveStyleFont(IfcCurveStyleFont value);

	/**
	 * Returns the value of the '<em><b>Ifc Curve Style Font And Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Curve Style Font And Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Curve Style Font And Scaling</em>' containment reference.
	 * @see #setIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveFontOrScaledCurveFontSelect_IfcCurveStyleFontAndScaling()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCurveStyleFontAndScaling' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCurveStyleFontAndScaling getIfcCurveStyleFontAndScaling();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveFontOrScaledCurveFontSelect#getIfcCurveStyleFontAndScaling <em>Ifc Curve Style Font And Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curve Style Font And Scaling</em>' containment reference.
	 * @see #getIfcCurveStyleFontAndScaling()
	 * @generated
	 */
	void setIfcCurveStyleFontAndScaling(IfcCurveStyleFontAndScaling value);

} // IfcCurveFontOrScaledCurveFontSelect
