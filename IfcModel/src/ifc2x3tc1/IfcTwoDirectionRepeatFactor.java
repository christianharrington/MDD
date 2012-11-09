/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Two Direction Repeat Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTwoDirectionRepeatFactor()
 * @model
 * @generated
 */
public interface IfcTwoDirectionRepeatFactor extends IfcOneDirectionRepeatFactor {
	/**
	 * Returns the value of the '<em><b>Second Repeat Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Repeat Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Repeat Factor</em>' reference.
	 * @see #setSecondRepeatFactor(IfcVector)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTwoDirectionRepeatFactor_SecondRepeatFactor()
	 * @model
	 * @generated
	 */
	IfcVector getSecondRepeatFactor();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTwoDirectionRepeatFactor#getSecondRepeatFactor <em>Second Repeat Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Repeat Factor</em>' reference.
	 * @see #getSecondRepeatFactor()
	 * @generated
	 */
	void setSecondRepeatFactor(IfcVector value);

} // IfcTwoDirectionRepeatFactor
