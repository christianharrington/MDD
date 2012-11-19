/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Offset Curve2 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getSelfIntersect <em>Self Intersect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve2D()
 * @model extendedMetaData="name='IfcOffsetCurve2D' kind='elementOnly'"
 * @generated
 */
public interface IfcOffsetCurve2D extends IfcCurve {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' containment reference.
	 * @see #setBasisCurve(BasisCurveType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve2D_BasisCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BasisCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	BasisCurveType3 getBasisCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getBasisCurve <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' containment reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(BasisCurveType3 value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve2D_Distance()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='Distance' namespace='##targetNamespace'"
	 * @generated
	 */
	double getDistance();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Self Intersect</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Self Intersect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Self Intersect</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #setSelfIntersect(Logical)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve2D_SelfIntersect()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SelfIntersect' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getSelfIntersect();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve2D#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Intersect</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getSelfIntersect()
	 * @generated
	 */
	void setSelfIntersect(Logical value);

} // IfcOffsetCurve2D
