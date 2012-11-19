/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Constraint Aggregation Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship()
 * @model extendedMetaData="name='IfcConstraintAggregationRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcConstraintAggregationRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship_Name()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship_Description()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' containment reference.
	 * @see #setRelatingConstraint(RelatingConstraintType3)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship_RelatingConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingConstraintType3 getRelatingConstraint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getRelatingConstraint <em>Relating Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' containment reference.
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(RelatingConstraintType3 value);

	/**
	 * Returns the value of the '<em><b>Related Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Constraints</em>' containment reference.
	 * @see #setRelatedConstraints(RelatedConstraintsType1)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship_RelatedConstraints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedConstraintsType1 getRelatedConstraints();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getRelatedConstraints <em>Related Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Constraints</em>' containment reference.
	 * @see #getRelatedConstraints()
	 * @generated
	 */
	void setRelatedConstraints(RelatedConstraintsType1 value);

	/**
	 * Returns the value of the '<em><b>Logical Aggregator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalOperatorEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logical Aggregator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Aggregator</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalOperatorEnum
	 * @see #setLogicalAggregator(IfcLogicalOperatorEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstraintAggregationRelationship_LogicalAggregator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LogicalAggregator' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLogicalOperatorEnum getLogicalAggregator();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstraintAggregationRelationship#getLogicalAggregator <em>Logical Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Aggregator</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLogicalOperatorEnum
	 * @see #getLogicalAggregator()
	 * @generated
	 */
	void setLogicalAggregator(IfcLogicalOperatorEnum value);

} // IfcConstraintAggregationRelationship
