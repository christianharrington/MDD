/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLine#getPnt <em>Pnt</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLine#getDir <em>Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLine()
 * @model
 * @generated
 */
public interface IfcLine extends IfcCurve {
	/**
	 * Returns the value of the '<em><b>Pnt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pnt</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pnt</em>' reference.
	 * @see #setPnt(IfcCartesianPoint)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLine_Pnt()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getPnt();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLine#getPnt <em>Pnt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pnt</em>' reference.
	 * @see #getPnt()
	 * @generated
	 */
	void setPnt(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' reference.
	 * @see #setDir(IfcVector)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLine_Dir()
	 * @model
	 * @generated
	 */
	IfcVector getDir();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLine#getDir <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(IfcVector value);

} // IfcLine
