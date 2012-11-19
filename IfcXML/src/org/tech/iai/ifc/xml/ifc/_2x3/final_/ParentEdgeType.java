/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Edge Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentEdgeType#getIfcEdgeGroup <em>Ifc Edge Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentEdgeType#getIfcEdge <em>Ifc Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentEdgeType()
 * @model extendedMetaData="name='ParentEdge_._type' kind='elementOnly'"
 * @generated
 */
public interface ParentEdgeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Edge Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Edge Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Edge Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentEdgeType_IfcEdgeGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcEdge:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcEdgeGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Edge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Edge</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Edge</em>' containment reference.
	 * @see #setIfcEdge(IfcEdge)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentEdgeType_IfcEdge()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcEdge' namespace='##targetNamespace' group='IfcEdge:group'"
	 * @generated
	 */
	IfcEdge getIfcEdge();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentEdgeType#getIfcEdge <em>Ifc Edge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Edge</em>' containment reference.
	 * @see #getIfcEdge()
	 * @generated
	 */
	void setIfcEdge(IfcEdge value);

} // ParentEdgeType
