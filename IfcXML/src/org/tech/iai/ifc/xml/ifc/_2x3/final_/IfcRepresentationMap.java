/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRepresentationMap()
 * @model extendedMetaData="name='IfcRepresentationMap' kind='elementOnly'"
 * @generated
 */
public interface IfcRepresentationMap extends Entity {
	/**
	 * Returns the value of the '<em><b>Mapping Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Origin</em>' containment reference.
	 * @see #setMappingOrigin(MappingOriginType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRepresentationMap_MappingOrigin()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MappingOrigin' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingOriginType getMappingOrigin();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Origin</em>' containment reference.
	 * @see #getMappingOrigin()
	 * @generated
	 */
	void setMappingOrigin(MappingOriginType value);

	/**
	 * Returns the value of the '<em><b>Mapped Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Representation</em>' containment reference.
	 * @see #setMappedRepresentation(MappedRepresentationType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRepresentationMap_MappedRepresentation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MappedRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	MappedRepresentationType getMappedRepresentation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Representation</em>' containment reference.
	 * @see #getMappedRepresentation()
	 * @generated
	 */
	void setMappedRepresentation(MappedRepresentationType value);

} // IfcRepresentationMap
