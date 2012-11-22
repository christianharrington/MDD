/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Offset Curve3 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getRefDirection <em>Ref Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve3D()
 * @model extendedMetaData="name='IfcOffsetCurve3D' kind='elementOnly'"
 * @generated
 */
public interface IfcOffsetCurve3D extends IfcCurve {
	/**
	 * Returns the value of the '<em><b>Basis Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Curve</em>' containment reference.
	 * @see #setBasisCurve(BasisCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve3D_BasisCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BasisCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	BasisCurveType getBasisCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getBasisCurve <em>Basis Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Curve</em>' containment reference.
	 * @see #getBasisCurve()
	 * @generated
	 */
	void setBasisCurve(BasisCurveType value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve3D_Distance()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLengthMeasure" required="true"
	 *        extendedMetaData="kind='element' name='Distance' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDistance();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Double value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve3D_SelfIntersect()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SelfIntersect' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getSelfIntersect();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getSelfIntersect <em>Self Intersect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Intersect</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getSelfIntersect()
	 * @generated
	 */
	void setSelfIntersect(Logical value);

	/**
	 * Returns the value of the '<em><b>Ref Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Direction</em>' containment reference.
	 * @see #setRefDirection(RefDirectionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcOffsetCurve3D_RefDirection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RefDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	RefDirectionType getRefDirection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcOffsetCurve3D#getRefDirection <em>Ref Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Direction</em>' containment reference.
	 * @see #getRefDirection()
	 * @generated
	 */
	void setRefDirection(RefDirectionType value);

} // IfcOffsetCurve3D
