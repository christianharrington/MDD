/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Half Space Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcHalfSpaceSolid#getDim <em>Dim</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcHalfSpaceSolid()
 * @model
 * @generated
 */
public interface IfcHalfSpaceSolid extends IfcGeometricRepresentationItem, IfcBooleanOperand {
	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Surface</em>' reference.
	 * @see #setBaseSurface(IfcSurface)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcHalfSpaceSolid_BaseSurface()
	 * @model
	 * @generated
	 */
	IfcSurface getBaseSurface();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcHalfSpaceSolid#getBaseSurface <em>Base Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(IfcSurface value);

	/**
	 * Returns the value of the '<em><b>Agreement Flag</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agreement Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agreement Flag</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setAgreementFlag(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcHalfSpaceSolid_AgreementFlag()
	 * @model
	 * @generated
	 */
	Tristate getAgreementFlag();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcHalfSpaceSolid#getAgreementFlag <em>Agreement Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agreement Flag</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getAgreementFlag()
	 * @generated
	 */
	void setAgreementFlag(Tristate value);

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcHalfSpaceSolid_Dim()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	int getDim();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcHalfSpaceSolid#getDim <em>Dim</em>}' attribute.
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
	 * Unsets the value of the '{@link ifc2x3tc1.IfcHalfSpaceSolid#getDim <em>Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	void unsetDim();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcHalfSpaceSolid#getDim <em>Dim</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dim</em>' attribute is set.
	 * @see #unsetDim()
	 * @see #getDim()
	 * @see #setDim(int)
	 * @generated
	 */
	boolean isSetDim();

} // IfcHalfSpaceSolid
