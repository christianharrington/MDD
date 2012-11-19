/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects With Eccentricity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsWithEccentricity()
 * @model extendedMetaData="name='IfcRelConnectsWithEccentricity' kind='elementOnly'"
 * @generated
 */
public interface IfcRelConnectsWithEccentricity extends IfcRelConnectsStructuralMember {
	/**
	 * Returns the value of the '<em><b>Connection Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Constraint</em>' containment reference.
	 * @see #setConnectionConstraint(ConnectionConstraintType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelConnectsWithEccentricity_ConnectionConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConnectionConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionConstraintType getConnectionConstraint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelConnectsWithEccentricity#getConnectionConstraint <em>Connection Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Constraint</em>' containment reference.
	 * @see #getConnectionConstraint()
	 * @generated
	 */
	void setConnectionConstraint(ConnectionConstraintType value);

} // IfcRelConnectsWithEccentricity
