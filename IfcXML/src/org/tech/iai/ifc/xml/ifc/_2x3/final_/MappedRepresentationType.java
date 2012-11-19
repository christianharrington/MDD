/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapped Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappedRepresentationType#getIfcRepresentationGroup <em>Ifc Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappedRepresentationType#getIfcRepresentation <em>Ifc Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappedRepresentationType()
 * @model extendedMetaData="name='MappedRepresentation_._type' kind='elementOnly'"
 * @generated
 */
public interface MappedRepresentationType extends EObject {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappedRepresentationType_IfcRepresentationGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappedRepresentationType_IfcRepresentation()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcRepresentation' namespace='##targetNamespace' group='IfcRepresentation:group'"
	 * @generated
	 */
	IfcRepresentation getIfcRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappedRepresentationType#getIfcRepresentation <em>Ifc Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Representation</em>' containment reference.
	 * @see #getIfcRepresentation()
	 * @generated
	 */
	void setIfcRepresentation(IfcRepresentation value);

} // MappedRepresentationType
