/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Point Or Vertex Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOrVertexPoint#getIfcPointGroup <em>Ifc Point Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOrVertexPoint#getIfcPoint <em>Ifc Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOrVertexPoint#getIfcVertexPoint <em>Ifc Vertex Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPointOrVertexPoint()
 * @model extendedMetaData="name='IfcPointOrVertexPoint' kind='elementOnly'"
 * @generated
 */
public interface IfcPointOrVertexPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Point Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Point Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Point Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPointOrVertexPoint_IfcPointGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPointGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Point</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPointOrVertexPoint_IfcPoint()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPoint' namespace='##targetNamespace' group='IfcPoint:group'"
	 * @generated
	 */
	IfcPoint getIfcPoint();

	/**
	 * Returns the value of the '<em><b>Ifc Vertex Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Vertex Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Vertex Point</em>' containment reference.
	 * @see #setIfcVertexPoint(IfcVertexPoint)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcPointOrVertexPoint_IfcVertexPoint()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcVertexPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcVertexPoint getIfcVertexPoint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPointOrVertexPoint#getIfcVertexPoint <em>Ifc Vertex Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Vertex Point</em>' containment reference.
	 * @see #getIfcVertexPoint()
	 * @generated
	 */
	void setIfcVertexPoint(IfcVertexPoint value);

} // IfcPointOrVertexPoint
