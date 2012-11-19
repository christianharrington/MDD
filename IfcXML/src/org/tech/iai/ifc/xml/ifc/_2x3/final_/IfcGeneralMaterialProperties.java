/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc General Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeneralMaterialProperties()
 * @model extendedMetaData="name='IfcGeneralMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcGeneralMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Molecular Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' attribute.
	 * @see #setMolecularWeight(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeneralMaterialProperties_MolecularWeight()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMolecularWeightMeasureObject"
	 *        extendedMetaData="kind='element' name='MolecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getMolecularWeight <em>Molecular Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' attribute.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(Double value);

	/**
	 * Returns the value of the '<em><b>Porosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porosity</em>' attribute.
	 * @see #setPorosity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeneralMaterialProperties_Porosity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='Porosity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPorosity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getPorosity <em>Porosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porosity</em>' attribute.
	 * @see #getPorosity()
	 * @generated
	 */
	void setPorosity(Double value);

	/**
	 * Returns the value of the '<em><b>Mass Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass Density</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mass Density</em>' attribute.
	 * @see #setMassDensity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeneralMaterialProperties_MassDensity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassDensityMeasureObject"
	 *        extendedMetaData="kind='element' name='MassDensity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMassDensity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeneralMaterialProperties#getMassDensity <em>Mass Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass Density</em>' attribute.
	 * @see #getMassDensity()
	 * @generated
	 */
	void setMassDensity(Double value);

} // IfcGeneralMaterialProperties
