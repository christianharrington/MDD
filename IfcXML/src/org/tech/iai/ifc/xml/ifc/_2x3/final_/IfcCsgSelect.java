/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Csg Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSelect#getIfcBooleanResultGroup <em>Ifc Boolean Result Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSelect#getIfcBooleanResult <em>Ifc Boolean Result</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSelect#getIfcCsgPrimitive3DGroup <em>Ifc Csg Primitive3 DGroup</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSelect#getIfcCsgPrimitive3D <em>Ifc Csg Primitive3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSelect()
 * @model extendedMetaData="name='IfcCsgSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcCsgSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Boolean Result Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Boolean Result Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Boolean Result Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSelect_IfcBooleanResultGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcBooleanResult:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcBooleanResultGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Boolean Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Boolean Result</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Boolean Result</em>' containment reference.
	 * @see #setIfcBooleanResult(IfcBooleanResult)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSelect_IfcBooleanResult()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcBooleanResult' namespace='##targetNamespace' group='IfcBooleanResult:group'"
	 * @generated
	 */
	IfcBooleanResult getIfcBooleanResult();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCsgSelect#getIfcBooleanResult <em>Ifc Boolean Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Boolean Result</em>' containment reference.
	 * @see #getIfcBooleanResult()
	 * @generated
	 */
	void setIfcBooleanResult(IfcBooleanResult value);

	/**
	 * Returns the value of the '<em><b>Ifc Csg Primitive3 DGroup</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Csg Primitive3 DGroup</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Csg Primitive3 DGroup</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSelect_IfcCsgPrimitive3DGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcCsgPrimitive3D:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcCsgPrimitive3DGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Csg Primitive3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Csg Primitive3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Csg Primitive3 D</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCsgSelect_IfcCsgPrimitive3D()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCsgPrimitive3D' namespace='##targetNamespace' group='IfcCsgPrimitive3D:group'"
	 * @generated
	 */
	IfcCsgPrimitive3D getIfcCsgPrimitive3D();

} // IfcCsgSelect
