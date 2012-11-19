/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parent Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentContextType#getIfcGeometricRepresentationContextGroup <em>Ifc Geometric Representation Context Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentContextType#getIfcGeometricRepresentationContext <em>Ifc Geometric Representation Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentContextType()
 * @model extendedMetaData="name='ParentContext_._type' kind='elementOnly'"
 * @generated
 */
public interface ParentContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Geometric Representation Context Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Geometric Representation Context Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Geometric Representation Context Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentContextType_IfcGeometricRepresentationContextGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcGeometricRepresentationContext:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcGeometricRepresentationContextGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Geometric Representation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Geometric Representation Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Geometric Representation Context</em>' containment reference.
	 * @see #setIfcGeometricRepresentationContext(IfcGeometricRepresentationContext)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getParentContextType_IfcGeometricRepresentationContext()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcGeometricRepresentationContext' namespace='##targetNamespace' group='IfcGeometricRepresentationContext:group'"
	 * @generated
	 */
	IfcGeometricRepresentationContext getIfcGeometricRepresentationContext();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ParentContextType#getIfcGeometricRepresentationContext <em>Ifc Geometric Representation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Geometric Representation Context</em>' containment reference.
	 * @see #getIfcGeometricRepresentationContext()
	 * @generated
	 */
	void setIfcGeometricRepresentationContext(IfcGeometricRepresentationContext value);

} // ParentContextType
