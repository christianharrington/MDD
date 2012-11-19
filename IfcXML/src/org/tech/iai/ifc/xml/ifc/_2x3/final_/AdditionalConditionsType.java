/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AdditionalConditionsType#getIfcStructuralConnectionConditionGroup <em>Ifc Structural Connection Condition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AdditionalConditionsType#getIfcStructuralConnectionCondition <em>Ifc Structural Connection Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAdditionalConditionsType()
 * @model extendedMetaData="name='AdditionalConditions_._type' kind='elementOnly'"
 * @generated
 */
public interface AdditionalConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Connection Condition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Connection Condition Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Connection Condition Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAdditionalConditionsType_IfcStructuralConnectionConditionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcStructuralConnectionCondition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcStructuralConnectionConditionGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Structural Connection Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Connection Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Connection Condition</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAdditionalConditionsType_IfcStructuralConnectionCondition()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralConnectionCondition' namespace='##targetNamespace' group='IfcStructuralConnectionCondition:group'"
	 * @generated
	 */
	IfcStructuralConnectionCondition getIfcStructuralConnectionCondition();

} // AdditionalConditionsType