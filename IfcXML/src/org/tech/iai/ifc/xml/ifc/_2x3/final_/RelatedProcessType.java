/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Related Process Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedProcessType#getIfcProcessGroup <em>Ifc Process Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RelatedProcessType#getIfcProcess <em>Ifc Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedProcessType()
 * @model extendedMetaData="name='RelatedProcess_._type' kind='elementOnly'"
 * @generated
 */
public interface RelatedProcessType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Process Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Process Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Process Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedProcessType_IfcProcessGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcProcess:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcProcessGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Process</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRelatedProcessType_IfcProcess()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcProcess' namespace='##targetNamespace' group='IfcProcess:group'"
	 * @generated
	 */
	IfcProcess getIfcProcess();

} // RelatedProcessType
