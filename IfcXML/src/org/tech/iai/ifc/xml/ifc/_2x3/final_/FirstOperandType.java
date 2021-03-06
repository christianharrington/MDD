/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>First Operand Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcSolidModelGroup <em>Ifc Solid Model Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcSolidModel <em>Ifc Solid Model</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcHalfSpaceSolidGroup <em>Ifc Half Space Solid Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcHalfSpaceSolid <em>Ifc Half Space Solid</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcBooleanResultGroup <em>Ifc Boolean Result Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcBooleanResult <em>Ifc Boolean Result</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcCsgPrimitive3DGroup <em>Ifc Csg Primitive3 DGroup</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcCsgPrimitive3D <em>Ifc Csg Primitive3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType()
 * @model extendedMetaData="name='FirstOperand_._type' kind='elementOnly'"
 * @generated
 */
public interface FirstOperandType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Solid Model Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Solid Model Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Solid Model Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcSolidModelGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcSolidModel:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcSolidModelGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Solid Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Solid Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Solid Model</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcSolidModel()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcSolidModel' namespace='##targetNamespace' group='IfcSolidModel:group'"
	 * @generated
	 */
	IfcSolidModel getIfcSolidModel();

	/**
	 * Returns the value of the '<em><b>Ifc Half Space Solid Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Half Space Solid Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Half Space Solid Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcHalfSpaceSolidGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcHalfSpaceSolid:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcHalfSpaceSolidGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Half Space Solid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Half Space Solid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Half Space Solid</em>' containment reference.
	 * @see #setIfcHalfSpaceSolid(IfcHalfSpaceSolid)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcHalfSpaceSolid()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcHalfSpaceSolid' namespace='##targetNamespace' group='IfcHalfSpaceSolid:group'"
	 * @generated
	 */
	IfcHalfSpaceSolid getIfcHalfSpaceSolid();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcHalfSpaceSolid <em>Ifc Half Space Solid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Half Space Solid</em>' containment reference.
	 * @see #getIfcHalfSpaceSolid()
	 * @generated
	 */
	void setIfcHalfSpaceSolid(IfcHalfSpaceSolid value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcBooleanResultGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcBooleanResult()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcBooleanResult' namespace='##targetNamespace' group='IfcBooleanResult:group'"
	 * @generated
	 */
	IfcBooleanResult getIfcBooleanResult();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.FirstOperandType#getIfcBooleanResult <em>Ifc Boolean Result</em>}' containment reference.
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcCsgPrimitive3DGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getFirstOperandType_IfcCsgPrimitive3D()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcCsgPrimitive3D' namespace='##targetNamespace' group='IfcCsgPrimitive3D:group'"
	 * @generated
	 */
	IfcCsgPrimitive3D getIfcCsgPrimitive3D();

} // FirstOperandType
