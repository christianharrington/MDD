/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mapped Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcMappedItem#getMappingSource <em>Mapping Source</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMappedItem()
 * @model
 * @generated
 */
public interface IfcMappedItem extends IfcRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Mapping Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Source</em>' reference.
	 * @see #setMappingSource(IfcRepresentationMap)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMappedItem_MappingSource()
	 * @see ifc2x3tc1.IfcRepresentationMap#getMapUsage
	 * @model opposite="MapUsage"
	 * @generated
	 */
	IfcRepresentationMap getMappingSource();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMappedItem#getMappingSource <em>Mapping Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Source</em>' reference.
	 * @see #getMappingSource()
	 * @generated
	 */
	void setMappingSource(IfcRepresentationMap value);

	/**
	 * Returns the value of the '<em><b>Mapping Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Target</em>' reference.
	 * @see #setMappingTarget(IfcCartesianTransformationOperator)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcMappedItem_MappingTarget()
	 * @model
	 * @generated
	 */
	IfcCartesianTransformationOperator getMappingTarget();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcMappedItem#getMappingTarget <em>Mapping Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Target</em>' reference.
	 * @see #getMappingTarget()
	 * @generated
	 */
	void setMappingTarget(IfcCartesianTransformationOperator value);

} // IfcMappedItem
