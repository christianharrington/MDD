/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Font Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType#getIfcPreDefinedCurveFontGroup <em>Ifc Pre Defined Curve Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType#getIfcPreDefinedCurveFont <em>Ifc Pre Defined Curve Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveFontType()
 * @model extendedMetaData="name='CurveFont_._type' kind='elementOnly'"
 * @generated
 */
public interface CurveFontType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveFontType_IfcPreDefinedCurveFontGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveFontType_IfcPreDefinedCurveFont()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getCurveFontType_IfcCurveStyleFont()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCurveStyleFont' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCurveStyleFont getIfcCurveStyleFont();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.CurveFontType#getIfcCurveStyleFont <em>Ifc Curve Style Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curve Style Font</em>' containment reference.
	 * @see #getIfcCurveStyleFont()
	 * @generated
	 */
	void setIfcCurveStyleFont(IfcCurveStyleFont value);

} // CurveFontType
