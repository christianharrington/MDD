/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hatch Line Appearance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.HatchLineAppearanceType#getIfcCurveStyle <em>Ifc Curve Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getHatchLineAppearanceType()
 * @model extendedMetaData="name='HatchLineAppearance_._type' kind='elementOnly'"
 * @generated
 */
public interface HatchLineAppearanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Curve Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Curve Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Curve Style</em>' containment reference.
	 * @see #setIfcCurveStyle(IfcCurveStyle)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getHatchLineAppearanceType_IfcCurveStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCurveStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCurveStyle getIfcCurveStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.HatchLineAppearanceType#getIfcCurveStyle <em>Ifc Curve Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Curve Style</em>' containment reference.
	 * @see #getIfcCurveStyle()
	 * @generated
	 */
	void setIfcCurveStyle(IfcCurveStyle value);

} // HatchLineAppearanceType
