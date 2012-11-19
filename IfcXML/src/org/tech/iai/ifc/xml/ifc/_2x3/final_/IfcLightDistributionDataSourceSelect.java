/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Distribution Data Source Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionDataSourceSelect#getIfcExternalReferenceGroup <em>Ifc External Reference Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionDataSourceSelect#getIfcExternalReference <em>Ifc External Reference</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionDataSourceSelect#getIfcLightIntensityDistribution <em>Ifc Light Intensity Distribution</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionDataSourceSelect()
 * @model extendedMetaData="name='IfcLightDistributionDataSourceSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcLightDistributionDataSourceSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc External Reference Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc External Reference Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc External Reference Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionDataSourceSelect_IfcExternalReferenceGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcExternalReference:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcExternalReferenceGroup();

	/**
	 * Returns the value of the '<em><b>Ifc External Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc External Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc External Reference</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionDataSourceSelect_IfcExternalReference()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcExternalReference' namespace='##targetNamespace' group='IfcExternalReference:group'"
	 * @generated
	 */
	IfcExternalReference getIfcExternalReference();

	/**
	 * Returns the value of the '<em><b>Ifc Light Intensity Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Light Intensity Distribution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Light Intensity Distribution</em>' containment reference.
	 * @see #setIfcLightIntensityDistribution(IfcLightIntensityDistribution)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionDataSourceSelect_IfcLightIntensityDistribution()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLightIntensityDistribution' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLightIntensityDistribution getIfcLightIntensityDistribution();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionDataSourceSelect#getIfcLightIntensityDistribution <em>Ifc Light Intensity Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Light Intensity Distribution</em>' containment reference.
	 * @see #getIfcLightIntensityDistribution()
	 * @generated
	 */
	void setIfcLightIntensityDistribution(IfcLightIntensityDistribution value);

} // IfcLightDistributionDataSourceSelect
