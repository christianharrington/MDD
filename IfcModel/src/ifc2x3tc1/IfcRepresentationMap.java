/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Representation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationMap()
 * @model
 * @generated
 */
public interface IfcRepresentationMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Origin</em>' reference.
	 * @see #setMappingOrigin(IfcAxis2Placement)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationMap_MappingOrigin()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement getMappingOrigin();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRepresentationMap#getMappingOrigin <em>Mapping Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Origin</em>' reference.
	 * @see #getMappingOrigin()
	 * @generated
	 */
	void setMappingOrigin(IfcAxis2Placement value);

	/**
	 * Returns the value of the '<em><b>Mapped Representation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcRepresentation#getRepresentationMap <em>Representation Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped Representation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped Representation</em>' reference.
	 * @see #setMappedRepresentation(IfcRepresentation)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationMap_MappedRepresentation()
	 * @see ifc2x3tc1.IfcRepresentation#getRepresentationMap
	 * @model opposite="RepresentationMap"
	 * @generated
	 */
	IfcRepresentation getMappedRepresentation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcRepresentationMap#getMappedRepresentation <em>Mapped Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped Representation</em>' reference.
	 * @see #getMappedRepresentation()
	 * @generated
	 */
	void setMappedRepresentation(IfcRepresentation value);

	/**
	 * Returns the value of the '<em><b>Map Usage</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcMappedItem}.
	 * It is bidirectional and its opposite is '{@link ifc2x3tc1.IfcMappedItem#getMappingSource <em>Mapping Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Usage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Usage</em>' reference list.
	 * @see #isSetMapUsage()
	 * @see #unsetMapUsage()
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcRepresentationMap_MapUsage()
	 * @see ifc2x3tc1.IfcMappedItem#getMappingSource
	 * @model opposite="MappingSource" unsettable="true"
	 * @generated
	 */
	EList<IfcMappedItem> getMapUsage();

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapUsage()
	 * @see #getMapUsage()
	 * @generated
	 */
	void unsetMapUsage();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcRepresentationMap#getMapUsage <em>Map Usage</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Usage</em>' reference list is set.
	 * @see #unsetMapUsage()
	 * @see #getMapUsage()
	 * @generated
	 */
	boolean isSetMapUsage();

} // IfcRepresentationMap
