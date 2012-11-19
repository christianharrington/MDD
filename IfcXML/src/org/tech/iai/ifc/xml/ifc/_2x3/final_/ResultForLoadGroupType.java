/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result For Load Group Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ResultForLoadGroupType#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getResultForLoadGroupType()
 * @model extendedMetaData="name='ResultForLoadGroup_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultForLoadGroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Structural Load Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Structural Load Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Structural Load Group</em>' containment reference.
	 * @see #setIfcStructuralLoadGroup(IfcStructuralLoadGroup)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getResultForLoadGroupType_IfcStructuralLoadGroup()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcStructuralLoadGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcStructuralLoadGroup getIfcStructuralLoadGroup();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ResultForLoadGroupType#getIfcStructuralLoadGroup <em>Ifc Structural Load Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Structural Load Group</em>' containment reference.
	 * @see #getIfcStructuralLoadGroup()
	 * @generated
	 */
	void setIfcStructuralLoadGroup(IfcStructuralLoadGroup value);

} // ResultForLoadGroupType
