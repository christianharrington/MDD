/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BoundType#getIfcLoopGroup <em>Ifc Loop Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BoundType#getIfcLoop <em>Ifc Loop</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBoundType()
 * @model extendedMetaData="name='Bound_._type' kind='elementOnly'"
 * @generated
 */
public interface BoundType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Loop Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Loop Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Loop Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBoundType_IfcLoopGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcLoop:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcLoopGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Loop</em>' containment reference.
	 * @see #setIfcLoop(IfcLoop)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBoundType_IfcLoop()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcLoop' namespace='##targetNamespace' group='IfcLoop:group'"
	 * @generated
	 */
	IfcLoop getIfcLoop();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BoundType#getIfcLoop <em>Ifc Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Loop</em>' containment reference.
	 * @see #getIfcLoop()
	 * @generated
	 */
	void setIfcLoop(IfcLoop value);

} // BoundType
