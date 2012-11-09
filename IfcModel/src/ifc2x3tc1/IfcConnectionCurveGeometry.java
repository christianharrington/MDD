/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connection Curve Geometry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionCurveGeometry()
 * @model
 * @generated
 */
public interface IfcConnectionCurveGeometry extends IfcConnectionGeometry {
	/**
	 * Returns the value of the '<em><b>Curve On Relating Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Relating Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Relating Element</em>' reference.
	 * @see #setCurveOnRelatingElement(IfcCurveOrEdgeCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionCurveGeometry_CurveOnRelatingElement()
	 * @model
	 * @generated
	 */
	IfcCurveOrEdgeCurve getCurveOnRelatingElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatingElement <em>Curve On Relating Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Relating Element</em>' reference.
	 * @see #getCurveOnRelatingElement()
	 * @generated
	 */
	void setCurveOnRelatingElement(IfcCurveOrEdgeCurve value);

	/**
	 * Returns the value of the '<em><b>Curve On Related Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curve On Related Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curve On Related Element</em>' reference.
	 * @see #isSetCurveOnRelatedElement()
	 * @see #unsetCurveOnRelatedElement()
	 * @see #setCurveOnRelatedElement(IfcCurveOrEdgeCurve)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcConnectionCurveGeometry_CurveOnRelatedElement()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcCurveOrEdgeCurve getCurveOnRelatedElement();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curve On Related Element</em>' reference.
	 * @see #isSetCurveOnRelatedElement()
	 * @see #unsetCurveOnRelatedElement()
	 * @see #getCurveOnRelatedElement()
	 * @generated
	 */
	void setCurveOnRelatedElement(IfcCurveOrEdgeCurve value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurveOnRelatedElement()
	 * @see #getCurveOnRelatedElement()
	 * @see #setCurveOnRelatedElement(IfcCurveOrEdgeCurve)
	 * @generated
	 */
	void unsetCurveOnRelatedElement();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcConnectionCurveGeometry#getCurveOnRelatedElement <em>Curve On Related Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Curve On Related Element</em>' reference is set.
	 * @see #unsetCurveOnRelatedElement()
	 * @see #getCurveOnRelatedElement()
	 * @see #setCurveOnRelatedElement(IfcCurveOrEdgeCurve)
	 * @generated
	 */
	boolean isSetCurveOnRelatedElement();

} // IfcConnectionCurveGeometry
