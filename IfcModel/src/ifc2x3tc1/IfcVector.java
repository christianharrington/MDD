/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcVector#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVector#getMagnitude <em>Magnitude</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVector#getMagnitudeAsString <em>Magnitude As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcVector#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVector()
 * @model
 * @generated
 */
public interface IfcVector extends IfcGeometricRepresentationItem, IfcVectorOrDirection {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' reference.
	 * @see #setOrientation(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVector_Orientation()
	 * @model
	 * @generated
	 */
	IfcDirection getOrientation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcVector#getOrientation <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Magnitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude</em>' attribute.
	 * @see #setMagnitude(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVector_Magnitude()
	 * @model
	 * @generated
	 */
	double getMagnitude();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcVector#getMagnitude <em>Magnitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude</em>' attribute.
	 * @see #getMagnitude()
	 * @generated
	 */
	void setMagnitude(double value);

	/**
	 * Returns the value of the '<em><b>Magnitude As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magnitude As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magnitude As String</em>' attribute.
	 * @see #setMagnitudeAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVector_MagnitudeAsString()
	 * @model
	 * @generated
	 */
	String getMagnitudeAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcVector#getMagnitudeAsString <em>Magnitude As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magnitude As String</em>' attribute.
	 * @see #getMagnitudeAsString()
	 * @generated
	 */
	void setMagnitudeAsString(String value);

	/**
	 * Returns the value of the '<em><b>Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dim</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #setDim(int)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcVector_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcVector#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim</em>' attribute.
	 * @see #isSetDim()
	 * @see #unsetDim()
	 * @see #getDim()
	 * @generated
	 */
	void setDim(int value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcVector#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcVector#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcVector
