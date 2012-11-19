/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move To Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MoveToType#getIfcSpatialStructureElementGroup <em>Ifc Spatial Structure Element Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MoveToType#getIfcSpatialStructureElement <em>Ifc Spatial Structure Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMoveToType()
 * @model extendedMetaData="name='MoveTo_._type' kind='elementOnly'"
 * @generated
 */
public interface MoveToType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Spatial Structure Element Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Spatial Structure Element Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Spatial Structure Element Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMoveToType_IfcSpatialStructureElementGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcSpatialStructureElement:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcSpatialStructureElementGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Spatial Structure Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Spatial Structure Element</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Spatial Structure Element</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMoveToType_IfcSpatialStructureElement()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSpatialStructureElement' namespace='##targetNamespace' group='IfcSpatialStructureElement:group'"
	 * @generated
	 */
	IfcSpatialStructureElement getIfcSpatialStructureElement();

} // MoveToType
