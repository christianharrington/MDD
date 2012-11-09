/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelSequence#getRelatedProcess <em>Related Process</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelSequence#getTimeLag <em>Time Lag</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelSequence#getTimeLagAsString <em>Time Lag As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRelSequence#getSequenceType <em>Sequence Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence()
 * @model
 * @generated
 */
public interface IfcRelSequence extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Relating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcProcess#getIsPredecessorTo <em>Is Predecessor To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Process</em>' reference.
	 * @see #setRelatingProcess(IfcProcess)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence_RelatingProcess()
	 * @see ifc2x3tc1.IfcProcess#getIsPredecessorTo
	 * @model opposite="IsPredecessorTo"
	 * @generated
	 */
	IfcProcess getRelatingProcess();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelSequence#getRelatingProcess <em>Relating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Process</em>' reference.
	 * @see #getRelatingProcess()
	 * @generated
	 */
	void setRelatingProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Related Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcProcess#getIsSuccessorFrom <em>Is Successor From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Process</em>' reference.
	 * @see #setRelatedProcess(IfcProcess)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence_RelatedProcess()
	 * @see ifc2x3tc1.IfcProcess#getIsSuccessorFrom
	 * @model opposite="IsSuccessorFrom"
	 * @generated
	 */
	IfcProcess getRelatedProcess();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelSequence#getRelatedProcess <em>Related Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Process</em>' reference.
	 * @see #getRelatedProcess()
	 * @generated
	 */
	void setRelatedProcess(IfcProcess value);

	/**
	 * Returns the value of the '<em><b>Time Lag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lag</em>' attribute.
	 * @see #setTimeLag(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence_TimeLag()
	 * @model
	 * @generated
	 */
	double getTimeLag();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelSequence#getTimeLag <em>Time Lag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Lag</em>' attribute.
	 * @see #getTimeLag()
	 * @generated
	 */
	void setTimeLag(double value);

	/**
	 * Returns the value of the '<em><b>Time Lag As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Lag As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Lag As String</em>' attribute.
	 * @see #setTimeLagAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence_TimeLagAsString()
	 * @model
	 * @generated
	 */
	String getTimeLagAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelSequence#getTimeLagAsString <em>Time Lag As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Lag As String</em>' attribute.
	 * @see #getTimeLagAsString()
	 * @generated
	 */
	void setTimeLagAsString(String value);

	/**
	 * Returns the value of the '<em><b>Sequence Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcSequenceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Type</em>' attribute.
	 * @see ifc2x3tc1.IfcSequenceEnum
	 * @see #setSequenceType(IfcSequenceEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelSequence_SequenceType()
	 * @model
	 * @generated
	 */
	IfcSequenceEnum getSequenceType();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelSequence#getSequenceType <em>Sequence Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Type</em>' attribute.
	 * @see ifc2x3tc1.IfcSequenceEnum
	 * @see #getSequenceType()
	 * @generated
	 */
	void setSequenceType(IfcSequenceEnum value);

} // IfcRelSequence
