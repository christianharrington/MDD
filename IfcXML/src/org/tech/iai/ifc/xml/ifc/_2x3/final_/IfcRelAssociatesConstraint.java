/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesConstraint()
 * @model extendedMetaData="name='IfcRelAssociatesConstraint' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesConstraint extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute.
	 * @see #setIntent(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesConstraint_Intent()
	 * @model dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel" required="true"
	 *        extendedMetaData="kind='element' name='Intent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIntent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' attribute.
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(String value);

	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' containment reference.
	 * @see #setRelatingConstraint(RelatingConstraintType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesConstraint_RelatingConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingConstraintType1 getRelatingConstraint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' containment reference.
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(RelatingConstraintType1 value);

} // IfcRelAssociatesConstraint
