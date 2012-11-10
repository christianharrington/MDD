/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRelAssociatesClassification#getRelatingClassification <em>Relating Classification</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesClassification()
 * @model
 * @generated
 */
public interface IfcRelAssociatesClassification extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Classification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Classification</em>' reference.
	 * @see #setRelatingClassification(IfcClassificationNotationSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssociatesClassification_RelatingClassification()
	 * @model
	 * @generated
	 */
	IfcClassificationNotationSelect getRelatingClassification();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRelAssociatesClassification#getRelatingClassification <em>Relating Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Classification</em>' reference.
	 * @see #getRelatingClassification()
	 * @generated
	 */
	void setRelatingClassification(IfcClassificationNotationSelect value);

} // IfcRelAssociatesClassification
