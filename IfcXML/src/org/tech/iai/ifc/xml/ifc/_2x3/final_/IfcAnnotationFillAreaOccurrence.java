/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Annotation Fill Area Occurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillAreaOccurrence#getFillStyleTarget <em>Fill Style Target</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillAreaOccurrence()
 * @model extendedMetaData="name='IfcAnnotationFillAreaOccurrence' kind='elementOnly'"
 * @generated
 */
public interface IfcAnnotationFillAreaOccurrence extends IfcAnnotationOccurrence {
	/**
	 * Returns the value of the '<em><b>Fill Style Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Style Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Style Target</em>' containment reference.
	 * @see #setFillStyleTarget(FillStyleTargetType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillAreaOccurrence_FillStyleTarget()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='FillStyleTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	FillStyleTargetType getFillStyleTarget();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillAreaOccurrence#getFillStyleTarget <em>Fill Style Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Style Target</em>' containment reference.
	 * @see #getFillStyleTarget()
	 * @generated
	 */
	void setFillStyleTarget(FillStyleTargetType value);

	/**
	 * Returns the value of the '<em><b>Global Or Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Or Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Or Local</em>' attribute.
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcAnnotationFillAreaOccurrence_GlobalOrLocal()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGlobalOrLocalEnumObject"
	 *        extendedMetaData="kind='element' name='GlobalOrLocal' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcGlobalOrLocalEnum getGlobalOrLocal();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnnotationFillAreaOccurrence#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Or Local</em>' attribute.
	 * @see #getGlobalOrLocal()
	 * @generated
	 */
	void setGlobalOrLocal(IfcGlobalOrLocalEnum value);

} // IfcAnnotationFillAreaOccurrence
