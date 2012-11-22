/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyleFontPattern()
 * @model extendedMetaData="name='IfcCurveStyleFontPattern' kind='elementOnly'"
 * @generated
 */
public interface IfcCurveStyleFontPattern extends Entity {
	/**
	 * Returns the value of the '<em><b>Visible Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible Segment Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible Segment Length</em>' attribute.
	 * @see #setVisibleSegmentLength(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyleFontPattern_VisibleSegmentLength()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='VisibleSegmentLength' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getVisibleSegmentLength();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontPattern#getVisibleSegmentLength <em>Visible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible Segment Length</em>' attribute.
	 * @see #getVisibleSegmentLength()
	 * @generated
	 */
	void setVisibleSegmentLength(Double value);

	/**
	 * Returns the value of the '<em><b>Invisible Segment Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invisible Segment Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invisible Segment Length</em>' attribute.
	 * @see #setInvisibleSegmentLength(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveStyleFontPattern_InvisibleSegmentLength()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='InvisibleSegmentLength' namespace='##targetNamespace'"
	 * @generated
	 */
	double getInvisibleSegmentLength();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveStyleFontPattern#getInvisibleSegmentLength <em>Invisible Segment Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invisible Segment Length</em>' attribute.
	 * @see #getInvisibleSegmentLength()
	 * @generated
	 */
	void setInvisibleSegmentLength(double value);

} // IfcCurveStyleFontPattern
