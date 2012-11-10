/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Energy Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyProperties()
 * @model
 * @generated
 */
public interface IfcEnergyProperties extends IfcPropertySetDefinition {
	/**
	 * Returns the value of the '<em><b>Energy Sequence</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcEnergySequenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Sequence</em>' attribute.
	 * @see ifc2x3tc1.IfcEnergySequenceEnum
	 * @see #isSetEnergySequence()
	 * @see #unsetEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyProperties_EnergySequence()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcEnergySequenceEnum getEnergySequence();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Sequence</em>' attribute.
	 * @see ifc2x3tc1.IfcEnergySequenceEnum
	 * @see #isSetEnergySequence()
	 * @see #unsetEnergySequence()
	 * @see #getEnergySequence()
	 * @generated
	 */
	void setEnergySequence(IfcEnergySequenceEnum value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnergySequence()
	 * @see #getEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @generated
	 */
	void unsetEnergySequence();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getEnergySequence <em>Energy Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Energy Sequence</em>' attribute is set.
	 * @see #unsetEnergySequence()
	 * @see #getEnergySequence()
	 * @see #setEnergySequence(IfcEnergySequenceEnum)
	 * @generated
	 */
	boolean isSetEnergySequence();

	/**
	 * Returns the value of the '<em><b>User Defined Energy Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Energy Sequence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Energy Sequence</em>' attribute.
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnergyProperties_UserDefinedEnergySequence()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedEnergySequence();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Energy Sequence</em>' attribute.
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @generated
	 */
	void setUserDefinedEnergySequence(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @generated
	 */
	void unsetUserDefinedEnergySequence();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEnergyProperties#getUserDefinedEnergySequence <em>User Defined Energy Sequence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Energy Sequence</em>' attribute is set.
	 * @see #unsetUserDefinedEnergySequence()
	 * @see #getUserDefinedEnergySequence()
	 * @see #setUserDefinedEnergySequence(String)
	 * @generated
	 */
	boolean isSetUserDefinedEnergySequence();

} // IfcEnergyProperties
