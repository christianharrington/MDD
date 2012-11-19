/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection Geometry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionGeometryType#getIfcConnectionGeometryGroup <em>Ifc Connection Geometry Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ConnectionGeometryType#getIfcConnectionGeometry <em>Ifc Connection Geometry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getConnectionGeometryType()
 * @model extendedMetaData="name='ConnectionGeometry_._type' kind='elementOnly'"
 * @generated
 */
public interface ConnectionGeometryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Connection Geometry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Connection Geometry Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Connection Geometry Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getConnectionGeometryType_IfcConnectionGeometryGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcConnectionGeometry:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcConnectionGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Connection Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Connection Geometry</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Connection Geometry</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getConnectionGeometryType_IfcConnectionGeometry()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcConnectionGeometry' namespace='##targetNamespace' group='IfcConnectionGeometry:group'"
	 * @generated
	 */
	IfcConnectionGeometry getIfcConnectionGeometry();

} // ConnectionGeometryType