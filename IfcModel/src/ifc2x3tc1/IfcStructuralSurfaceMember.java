/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Surface Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralSurfaceMember()
 * @model
 * @generated
 */
public interface IfcStructuralSurfaceMember extends IfcStructuralMember {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcStructuralSurfaceTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcStructuralSurfaceTypeEnum
	 * @see #setPredefinedType(IfcStructuralSurfaceTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralSurfaceMember_PredefinedType()
	 * @model
	 * @generated
	 */
	IfcStructuralSurfaceTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see ifc2x3tc1.IfcStructuralSurfaceTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcStructuralSurfaceTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #setThickness(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralSurfaceMember_Thickness()
	 * @model unsettable="true"
	 * @generated
	 */
	double getThickness();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #isSetThickness()
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThickness()
	 * @see #getThickness()
	 * @see #setThickness(double)
	 * @generated
	 */
	void unsetThickness();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThickness <em>Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness</em>' attribute is set.
	 * @see #unsetThickness()
	 * @see #getThickness()
	 * @see #setThickness(double)
	 * @generated
	 */
	boolean isSetThickness();

	/**
	 * Returns the value of the '<em><b>Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness As String</em>' attribute.
	 * @see #isSetThicknessAsString()
	 * @see #unsetThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcStructuralSurfaceMember_ThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getThicknessAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness As String</em>' attribute.
	 * @see #isSetThicknessAsString()
	 * @see #unsetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @generated
	 */
	void setThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @generated
	 */
	void unsetThicknessAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcStructuralSurfaceMember#getThicknessAsString <em>Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thickness As String</em>' attribute is set.
	 * @see #unsetThicknessAsString()
	 * @see #getThicknessAsString()
	 * @see #setThicknessAsString(String)
	 * @generated
	 */
	boolean isSetThicknessAsString();

} // IfcStructuralSurfaceMember
