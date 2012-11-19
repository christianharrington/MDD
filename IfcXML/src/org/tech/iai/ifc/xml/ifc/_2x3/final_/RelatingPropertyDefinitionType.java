/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relating Property Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPropertyDefinitionType#getIfcPropertySetDefinitionGroup <em>Ifc Property Set Definition Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatingPropertyDefinitionType#getIfcPropertySetDefinition <em>Ifc Property Set Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingPropertyDefinitionType()
 * @model extendedMetaData="name='RelatingPropertyDefinition_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatingPropertyDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Property Set Definition Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Property Set Definition Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Property Set Definition Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingPropertyDefinitionType_IfcPropertySetDefinitionGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPropertySetDefinition:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPropertySetDefinitionGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Property Set Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Property Set Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Property Set Definition</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatingPropertyDefinitionType_IfcPropertySetDefinition()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPropertySetDefinition' namespace='##targetNamespace' group='IfcPropertySetDefinition:group'"
	 * @generated
	 */
	IfcPropertySetDefinition getIfcPropertySetDefinition();

} // RelatingPropertyDefinitionType
