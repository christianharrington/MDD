/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ExtentType#getIfcPlanarExtentGroup <em>Ifc Planar Extent Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ExtentType#getIfcPlanarExtent <em>Ifc Planar Extent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getExtentType()
 * @model extendedMetaData="name='Extent_._type' kind='elementOnly'"
 * @generated
 */
public interface ExtentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Planar Extent Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Planar Extent Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Planar Extent Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getExtentType_IfcPlanarExtentGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPlanarExtent:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPlanarExtentGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Planar Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Planar Extent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Planar Extent</em>' containment reference.
	 * @see #setIfcPlanarExtent(IfcPlanarExtent)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getExtentType_IfcPlanarExtent()
	 * @model containment="true" unsettable="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPlanarExtent' namespace='##targetNamespace' group='IfcPlanarExtent:group'"
	 * @generated
	 */
	IfcPlanarExtent getIfcPlanarExtent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ExtentType#getIfcPlanarExtent <em>Ifc Planar Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Planar Extent</em>' containment reference.
	 * @see #getIfcPlanarExtent()
	 * @generated
	 */
	void setIfcPlanarExtent(IfcPlanarExtent value);

} // ExtentType
