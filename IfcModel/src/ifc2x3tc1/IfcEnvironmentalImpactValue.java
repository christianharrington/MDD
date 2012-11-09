/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Environmental Impact Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnvironmentalImpactValue()
 * @model
 * @generated
 */
public interface IfcEnvironmentalImpactValue extends IfcAppliedValue {
	/**
	 * Returns the value of the '<em><b>Impact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Type</em>' attribute.
	 * @see #setImpactType(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnvironmentalImpactValue_ImpactType()
	 * @model
	 * @generated
	 */
	String getImpactType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getImpactType <em>Impact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Type</em>' attribute.
	 * @see #getImpactType()
	 * @generated
	 */
	void setImpactType(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcEnvironmentalImpactCategoryEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see ifc2x3tc1.IfcEnvironmentalImpactCategoryEnum
	 * @see #setCategory(IfcEnvironmentalImpactCategoryEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnvironmentalImpactValue_Category()
	 * @model
	 * @generated
	 */
	IfcEnvironmentalImpactCategoryEnum getCategory();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see ifc2x3tc1.IfcEnvironmentalImpactCategoryEnum
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IfcEnvironmentalImpactCategoryEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Category</em>' attribute.
	 * @see #isSetUserDefinedCategory()
	 * @see #unsetUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEnvironmentalImpactValue_UserDefinedCategory()
	 * @model unsettable="true"
	 * @generated
	 */
	String getUserDefinedCategory();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Category</em>' attribute.
	 * @see #isSetUserDefinedCategory()
	 * @see #unsetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @generated
	 */
	void setUserDefinedCategory(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @generated
	 */
	void unsetUserDefinedCategory();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEnvironmentalImpactValue#getUserDefinedCategory <em>User Defined Category</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Category</em>' attribute is set.
	 * @see #unsetUserDefinedCategory()
	 * @see #getUserDefinedCategory()
	 * @see #setUserDefinedCategory(String)
	 * @generated
	 */
	boolean isSetUserDefinedCategory();

} // IfcEnvironmentalImpactValue
