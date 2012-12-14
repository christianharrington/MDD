/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Placement Rel To Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType#getIfcObjectPlacementGroup <em>Ifc Object Placement Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType#getIfcObjectPlacement <em>Ifc Object Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPlacementRelToType()
 * @model extendedMetaData="name='PlacementRelTo_._type' kind='elementOnly'"
 * @generated
 */
public interface PlacementRelToType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Object Placement Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Object Placement Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Object Placement Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPlacementRelToType_IfcObjectPlacementGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcObjectPlacement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcObjectPlacementGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Object Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Object Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Object Placement</em>' containment reference.
	 * @see #setIfcObjectPlacement(IfcObjectPlacement)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPlacementRelToType_IfcObjectPlacement()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcObjectPlacement' namespace='##targetNamespace' group='IfcObjectPlacement:group'"
	 * @generated
	 */
	IfcObjectPlacement getIfcObjectPlacement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PlacementRelToType#getIfcObjectPlacement <em>Ifc Object Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Object Placement</em>' containment reference.
	 * @see #getIfcObjectPlacement()
	 * @generated
	 */
	void setIfcObjectPlacement(IfcObjectPlacement value);

} // PlacementRelToType
