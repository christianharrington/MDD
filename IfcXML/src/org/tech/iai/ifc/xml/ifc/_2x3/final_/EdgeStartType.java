/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge Start Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeStartType#getIfcVertexGroup <em>Ifc Vertex Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeStartType#getIfcVertex <em>Ifc Vertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getEdgeStartType()
 * @model extendedMetaData="name='EdgeStart_._type' kind='elementOnly'"
 * @generated
 */
public interface EdgeStartType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Vertex Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Vertex Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Vertex Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getEdgeStartType_IfcVertexGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcVertex:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcVertexGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Vertex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Vertex</em>' containment reference.
	 * @see #setIfcVertex(IfcVertex)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getEdgeStartType_IfcVertex()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcVertex' namespace='##targetNamespace' group='IfcVertex:group'"
	 * @generated
	 */
	IfcVertex getIfcVertex();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.EdgeStartType#getIfcVertex <em>Ifc Vertex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Vertex</em>' containment reference.
	 * @see #getIfcVertex()
	 * @generated
	 */
	void setIfcVertex(IfcVertex value);

} // EdgeStartType
