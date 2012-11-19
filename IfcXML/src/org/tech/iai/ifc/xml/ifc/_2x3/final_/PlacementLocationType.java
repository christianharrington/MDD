/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementLocationType#getIfcVirtualGridIntersection <em>Ifc Virtual Grid Intersection</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPlacementLocationType()
 * @model extendedMetaData="name='PlacementLocation_._type' kind='elementOnly'"
 * @generated
 */
public interface PlacementLocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Virtual Grid Intersection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Virtual Grid Intersection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Virtual Grid Intersection</em>' containment reference.
	 * @see #setIfcVirtualGridIntersection(IfcVirtualGridIntersection)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPlacementLocationType_IfcVirtualGridIntersection()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcVirtualGridIntersection' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcVirtualGridIntersection getIfcVirtualGridIntersection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementLocationType#getIfcVirtualGridIntersection <em>Ifc Virtual Grid Intersection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Virtual Grid Intersection</em>' containment reference.
	 * @see #getIfcVirtualGridIntersection()
	 * @generated
	 */
	void setIfcVirtualGridIntersection(IfcVirtualGridIntersection value);

} // PlacementLocationType
