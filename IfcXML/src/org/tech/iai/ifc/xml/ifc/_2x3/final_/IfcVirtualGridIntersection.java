/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Virtual Grid Intersection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection#getOffsetDistances <em>Offset Distances</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVirtualGridIntersection()
 * @model extendedMetaData="name='IfcVirtualGridIntersection' kind='elementOnly'"
 * @generated
 */
public interface IfcVirtualGridIntersection extends Entity {
	/**
	 * Returns the value of the '<em><b>Intersecting Axes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intersecting Axes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intersecting Axes</em>' containment reference.
	 * @see #setIntersectingAxes(IntersectingAxesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVirtualGridIntersection_IntersectingAxes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IntersectingAxes' namespace='##targetNamespace'"
	 * @generated
	 */
	IntersectingAxesType getIntersectingAxes();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection#getIntersectingAxes <em>Intersecting Axes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intersecting Axes</em>' containment reference.
	 * @see #getIntersectingAxes()
	 * @generated
	 */
	void setIntersectingAxes(IntersectingAxesType value);

	/**
	 * Returns the value of the '<em><b>Offset Distances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset Distances</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset Distances</em>' containment reference.
	 * @see #setOffsetDistances(OffsetDistancesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcVirtualGridIntersection_OffsetDistances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OffsetDistances' namespace='##targetNamespace'"
	 * @generated
	 */
	OffsetDistancesType getOffsetDistances();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVirtualGridIntersection#getOffsetDistances <em>Offset Distances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset Distances</em>' containment reference.
	 * @see #getOffsetDistances()
	 * @generated
	 */
	void setOffsetDistances(OffsetDistancesType value);

} // IfcVirtualGridIntersection
