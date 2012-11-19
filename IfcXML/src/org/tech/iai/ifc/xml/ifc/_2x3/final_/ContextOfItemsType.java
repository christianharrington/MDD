/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Of Items Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ContextOfItemsType#getIfcRepresentationContextGroup <em>Ifc Representation Context Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ContextOfItemsType#getIfcRepresentationContext <em>Ifc Representation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getContextOfItemsType()
 * @model extendedMetaData="name='ContextOfItems_._type' kind='elementOnly'"
 * @generated
 */
public interface ContextOfItemsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Representation Context Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Context Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Context Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getContextOfItemsType_IfcRepresentationContextGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcRepresentationContext:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcRepresentationContextGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Context</em>' containment reference.
	 * @see #setIfcRepresentationContext(IfcRepresentationContext)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getContextOfItemsType_IfcRepresentationContext()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcRepresentationContext' namespace='##targetNamespace' group='IfcRepresentationContext:group'"
	 * @generated
	 */
	IfcRepresentationContext getIfcRepresentationContext();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ContextOfItemsType#getIfcRepresentationContext <em>Ifc Representation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Representation Context</em>' containment reference.
	 * @see #getIfcRepresentationContext()
	 * @generated
	 */
	void setIfcRepresentationContext(IfcRepresentationContext value);

} // ContextOfItemsType
