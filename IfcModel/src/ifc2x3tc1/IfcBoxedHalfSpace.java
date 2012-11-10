/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boxed Half Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcBoxedHalfSpace#getEnclosure <em>Enclosure</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBoxedHalfSpace()
 * @model
 * @generated
 */
public interface IfcBoxedHalfSpace extends IfcHalfSpaceSolid {
	/**
	 * Returns the value of the '<em><b>Enclosure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosure</em>' reference.
	 * @see #setEnclosure(IfcBoundingBox)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBoxedHalfSpace_Enclosure()
	 * @model
	 * @generated
	 */
	IfcBoundingBox getEnclosure();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBoxedHalfSpace#getEnclosure <em>Enclosure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosure</em>' reference.
	 * @see #getEnclosure()
	 * @generated
	 */
	void setEnclosure(IfcBoundingBox value);

} // IfcBoxedHalfSpace
