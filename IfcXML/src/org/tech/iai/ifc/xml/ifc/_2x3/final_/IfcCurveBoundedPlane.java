/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Bounded Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getBasisSurface <em>Basis Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getOuterBoundary <em>Outer Boundary</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getInnerBoundaries <em>Inner Boundaries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveBoundedPlane()
 * @model extendedMetaData="name='IfcCurveBoundedPlane' kind='elementOnly'"
 * @generated
 */
public interface IfcCurveBoundedPlane extends IfcBoundedSurface {
	/**
	 * Returns the value of the '<em><b>Basis Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Surface</em>' containment reference.
	 * @see #setBasisSurface(BasisSurfaceType2)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveBoundedPlane_BasisSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BasisSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	BasisSurfaceType2 getBasisSurface();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getBasisSurface <em>Basis Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Surface</em>' containment reference.
	 * @see #getBasisSurface()
	 * @generated
	 */
	void setBasisSurface(BasisSurfaceType2 value);

	/**
	 * Returns the value of the '<em><b>Outer Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #setOuterBoundary(OuterBoundaryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveBoundedPlane_OuterBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OuterBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterBoundaryType getOuterBoundary();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getOuterBoundary <em>Outer Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer Boundary</em>' containment reference.
	 * @see #getOuterBoundary()
	 * @generated
	 */
	void setOuterBoundary(OuterBoundaryType value);

	/**
	 * Returns the value of the '<em><b>Inner Boundaries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner Boundaries</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner Boundaries</em>' containment reference.
	 * @see #setInnerBoundaries(InnerBoundariesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurveBoundedPlane_InnerBoundaries()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InnerBoundaries' namespace='##targetNamespace'"
	 * @generated
	 */
	InnerBoundariesType getInnerBoundaries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurveBoundedPlane#getInnerBoundaries <em>Inner Boundaries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner Boundaries</em>' containment reference.
	 * @see #getInnerBoundaries()
	 * @generated
	 */
	void setInnerBoundaries(InnerBoundariesType value);

} // IfcCurveBoundedPlane
