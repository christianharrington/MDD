/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingSourceType#getIfcRepresentationMap <em>Ifc Representation Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingSourceType()
 * @model extendedMetaData="name='MappingSource_._type' kind='elementOnly'"
 * @generated
 */
public interface MappingSourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Representation Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Representation Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Representation Map</em>' containment reference.
	 * @see #setIfcRepresentationMap(IfcRepresentationMap)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingSourceType_IfcRepresentationMap()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcRepresentationMap' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcRepresentationMap getIfcRepresentationMap();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingSourceType#getIfcRepresentationMap <em>Ifc Representation Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Representation Map</em>' containment reference.
	 * @see #getIfcRepresentationMap()
	 * @generated
	 */
	void setIfcRepresentationMap(IfcRepresentationMap value);

} // MappingSourceType
