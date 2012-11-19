/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Boolean Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getFirstOperand <em>First Operand</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getSecondOperand <em>Second Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBooleanResult()
 * @model extendedMetaData="name='IfcBooleanResult' kind='elementOnly'"
 * @generated
 */
public interface IfcBooleanResult extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanOperator
	 * @see #setOperator(IfcBooleanOperator)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBooleanResult_Operator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Operator' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcBooleanOperator getOperator();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IfcBooleanOperator value);

	/**
	 * Returns the value of the '<em><b>First Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Operand</em>' containment reference.
	 * @see #setFirstOperand(FirstOperandType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBooleanResult_FirstOperand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FirstOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstOperandType getFirstOperand();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getFirstOperand <em>First Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Operand</em>' containment reference.
	 * @see #getFirstOperand()
	 * @generated
	 */
	void setFirstOperand(FirstOperandType value);

	/**
	 * Returns the value of the '<em><b>Second Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Operand</em>' containment reference.
	 * @see #setSecondOperand(SecondOperandType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcBooleanResult_SecondOperand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecondOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondOperandType getSecondOperand();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcBooleanResult#getSecondOperand <em>Second Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Operand</em>' containment reference.
	 * @see #getSecondOperand()
	 * @generated
	 */
	void setSecondOperand(SecondOperandType value);

} // IfcBooleanResult
