/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcServiceLife#getServiceLifeDurationAsString <em>Service Life Duration As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcServiceLife()
 * @model
 * @generated
 */
public interface IfcServiceLife extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Service Life Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcServiceLifeTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Type</em>' attribute.
	 * @see ifc2x3tc1.IfcServiceLifeTypeEnum
	 * @see #setServiceLifeType(IfcServiceLifeTypeEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcServiceLife_ServiceLifeType()
	 * @model
	 * @generated
	 */
	IfcServiceLifeTypeEnum getServiceLifeType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Type</em>' attribute.
	 * @see ifc2x3tc1.IfcServiceLifeTypeEnum
	 * @see #getServiceLifeType()
	 * @generated
	 */
	void setServiceLifeType(IfcServiceLifeTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Service Life Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Duration</em>' attribute.
	 * @see #setServiceLifeDuration(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcServiceLife_ServiceLifeDuration()
	 * @model
	 * @generated
	 */
	double getServiceLifeDuration();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Duration</em>' attribute.
	 * @see #getServiceLifeDuration()
	 * @generated
	 */
	void setServiceLifeDuration(double value);

	/**
	 * Returns the value of the '<em><b>Service Life Duration As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Duration As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Duration As String</em>' attribute.
	 * @see #setServiceLifeDurationAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcServiceLife_ServiceLifeDurationAsString()
	 * @model
	 * @generated
	 */
	String getServiceLifeDurationAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcServiceLife#getServiceLifeDurationAsString <em>Service Life Duration As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Duration As String</em>' attribute.
	 * @see #getServiceLifeDurationAsString()
	 * @generated
	 */
	void setServiceLifeDurationAsString(String value);

} // IfcServiceLife
