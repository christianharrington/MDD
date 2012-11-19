/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Result Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#isIsLinear <em>Is Linear</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralResultGroup()
 * @model extendedMetaData="name='IfcStructuralResultGroup' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralResultGroup extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Theory Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisTheoryTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theory Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theory Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisTheoryTypeEnum
	 * @see #setTheoryType(IfcAnalysisTheoryTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralResultGroup_TheoryType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TheoryType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcAnalysisTheoryTypeEnum getTheoryType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#getTheoryType <em>Theory Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theory Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisTheoryTypeEnum
	 * @see #getTheoryType()
	 * @generated
	 */
	void setTheoryType(IfcAnalysisTheoryTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Result For Load Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result For Load Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result For Load Group</em>' containment reference.
	 * @see #setResultForLoadGroup(ResultForLoadGroupType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralResultGroup_ResultForLoadGroup()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ResultForLoadGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultForLoadGroupType getResultForLoadGroup();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#getResultForLoadGroup <em>Result For Load Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result For Load Group</em>' containment reference.
	 * @see #getResultForLoadGroup()
	 * @generated
	 */
	void setResultForLoadGroup(ResultForLoadGroupType value);

	/**
	 * Returns the value of the '<em><b>Is Linear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Linear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Linear</em>' attribute.
	 * @see #setIsLinear(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralResultGroup_IsLinear()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='IsLinear' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsLinear();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralResultGroup#isIsLinear <em>Is Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Linear</em>' attribute.
	 * @see #isIsLinear()
	 * @generated
	 */
	void setIsLinear(boolean value);

} // IfcStructuralResultGroup
