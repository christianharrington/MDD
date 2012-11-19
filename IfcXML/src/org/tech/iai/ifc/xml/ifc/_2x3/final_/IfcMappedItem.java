/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMappedItem#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMappedItem()
 * @model extendedMetaData="name='IfcMappedItem' kind='elementOnly'"
 * @generated
 */
public interface IfcMappedItem extends IfcRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Mapping Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Source</em>' containment reference.
	 * @see #setMappingSource(MappingSourceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMappedItem_MappingSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MappingSource' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingSourceType getMappingSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMappedItem#getMappingSource <em>Mapping Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Source</em>' containment reference.
	 * @see #getMappingSource()
	 * @generated
	 */
	void setMappingSource(MappingSourceType value);

	/**
	 * Returns the value of the '<em><b>Mapping Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Target</em>' containment reference.
	 * @see #setMappingTarget(MappingTargetType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMappedItem_MappingTarget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MappingTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	MappingTargetType getMappingTarget();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Target</em>' containment reference.
	 * @see #getMappingTarget()
	 * @generated
	 */
	void setMappingTarget(MappingTargetType value);

} // IfcMappedItem
