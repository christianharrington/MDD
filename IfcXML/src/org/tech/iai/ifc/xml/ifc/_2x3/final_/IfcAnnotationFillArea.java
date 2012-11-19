/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Fill Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillArea#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillArea#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillArea()
 * @model extendedMetaData="name='IfcAnnotationFillArea' kind='elementOnly'"
 * @generated
 */
public interface IfcAnnotationFillArea extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Outer Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #setOuterBoundary(OuterBoundaryType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillArea_OuterBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OuterBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterBoundaryType1 getOuterBoundary();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillArea#getOuterBoundary <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #getOuterBoundary()
	 * @generated
	 */
	void setOuterBoundary(OuterBoundaryType1 value);

	/**
	 * Returns the value of the '<em><b>Inner Boundaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Boundaries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundaries</em>' containment reference.
	 * @see #setInnerBoundaries(InnerBoundariesType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillArea_InnerBoundaries()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='InnerBoundaries' namespace='##targetNamespace'"
	 * @generated
	 */
	InnerBoundariesType1 getInnerBoundaries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillArea#getInnerBoundaries <em>Inner Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Boundaries</em>' containment reference.
	 * @see #getInnerBoundaries()
	 * @generated
	 */
	void setInnerBoundaries(InnerBoundariesType1 value);

} // IfcAnnotationFillArea
