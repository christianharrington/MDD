/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Grid Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#getAxisTag <em>Axis Tag</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridAxis()
 * @model extendedMetaData="name='IfcGridAxis' kind='elementOnly'"
 * @generated
 */
public interface IfcGridAxis extends Entity {
	/**
	 * Returns the value of the '<em><b>Axis Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Tag</em>' attribute.
	 * @see #setAxisTag(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridAxis_AxisTag()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='AxisTag' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAxisTag();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#getAxisTag <em>Axis Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Tag</em>' attribute.
	 * @see #getAxisTag()
	 * @generated
	 */
	void setAxisTag(String value);

	/**
	 * Returns the value of the '<em><b>Axis Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis Curve</em>' containment reference.
	 * @see #setAxisCurve(AxisCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridAxis_AxisCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AxisCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	AxisCurveType getAxisCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#getAxisCurve <em>Axis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis Curve</em>' containment reference.
	 * @see #getAxisCurve()
	 * @generated
	 */
	void setAxisCurve(AxisCurveType value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #setSameSense(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGridAxis_SameSense()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBoolean" required="true"
	 *        extendedMetaData="kind='element' name='SameSense' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSameSense();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGridAxis#isSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSameSense()
	 * @generated
	 */
	void setSameSense(boolean value);

} // IfcGridAxis
