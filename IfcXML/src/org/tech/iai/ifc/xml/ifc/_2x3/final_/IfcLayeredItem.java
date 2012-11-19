/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Layered Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem#getIfcRepresentationItemGroup <em>Ifc Representation Item Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem#getIfcRepresentationItem <em>Ifc Representation Item</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem#getIfcRepresentationGroup <em>Ifc Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem#getIfcRepresentation <em>Ifc Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLayeredItem()
 * @model extendedMetaData="name='IfcLayeredItem' kind='elementOnly'"
 * @generated
 */
public interface IfcLayeredItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Representation Item Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Item Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Item Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLayeredItem_IfcRepresentationItemGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcRepresentationItem:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcRepresentationItemGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Representation Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Item</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLayeredItem_IfcRepresentationItem()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcRepresentationItem' namespace='##targetNamespace' group='IfcRepresentationItem:group'"
	 * @generated
	 */
	IfcRepresentationItem getIfcRepresentationItem();

	/**
	 * Returns the value of the '<em><b>Ifc Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLayeredItem_IfcRepresentationGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation</em>' containment reference.
	 * @see #setIfcRepresentation(IfcRepresentation)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLayeredItem_IfcRepresentation()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcRepresentation' namespace='##targetNamespace' group='IfcRepresentation:group'"
	 * @generated
	 */
	IfcRepresentation getIfcRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLayeredItem#getIfcRepresentation <em>Ifc Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Representation</em>' containment reference.
	 * @see #getIfcRepresentation()
	 * @generated
	 */
	void setIfcRepresentation(IfcRepresentation value);

} // IfcLayeredItem
