/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Representation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationType#getIfcProductRepresentationGroup <em>Ifc Product Representation Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationType#getIfcProductRepresentation <em>Ifc Product Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepresentationType()
 * @model extendedMetaData="name='Representation_._type' kind='elementOnly'"
 * @generated
 */
public interface RepresentationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Product Representation Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Product Representation Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Product Representation Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepresentationType_IfcProductRepresentationGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcProductRepresentation:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcProductRepresentationGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Product Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Product Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Product Representation</em>' containment reference.
	 * @see #setIfcProductRepresentation(IfcProductRepresentation)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepresentationType_IfcProductRepresentation()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcProductRepresentation' namespace='##targetNamespace' group='IfcProductRepresentation:group'"
	 * @generated
	 */
	IfcProductRepresentation getIfcProductRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentationType#getIfcProductRepresentation <em>Ifc Product Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Product Representation</em>' containment reference.
	 * @see #getIfcProductRepresentation()
	 * @generated
	 */
	void setIfcProductRepresentation(IfcProductRepresentation value);

} // RepresentationType
