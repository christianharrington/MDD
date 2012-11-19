/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Concrete Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties()
 * @model extendedMetaData="name='IfcMechanicalConcreteMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Compressive Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compressive Strength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compressive Strength</em>' attribute.
	 * @see #setCompressiveStrength(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_CompressiveStrength()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureObject"
	 *        extendedMetaData="kind='element' name='CompressiveStrength' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCompressiveStrength();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getCompressiveStrength <em>Compressive Strength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compressive Strength</em>' attribute.
	 * @see #getCompressiveStrength()
	 * @generated
	 */
	void setCompressiveStrength(Double value);

	/**
	 * Returns the value of the '<em><b>Max Aggregate Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Aggregate Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #setMaxAggregateSize(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_MaxAggregateSize()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveLengthMeasureObject"
	 *        extendedMetaData="kind='element' name='MaxAggregateSize' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMaxAggregateSize();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getMaxAggregateSize <em>Max Aggregate Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Aggregate Size</em>' attribute.
	 * @see #getMaxAggregateSize()
	 * @generated
	 */
	void setMaxAggregateSize(Double value);

	/**
	 * Returns the value of the '<em><b>Admixtures Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admixtures Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admixtures Description</em>' attribute.
	 * @see #setAdmixturesDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_AdmixturesDescription()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='AdmixturesDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAdmixturesDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getAdmixturesDescription <em>Admixtures Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admixtures Description</em>' attribute.
	 * @see #getAdmixturesDescription()
	 * @generated
	 */
	void setAdmixturesDescription(String value);

	/**
	 * Returns the value of the '<em><b>Workability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workability</em>' attribute.
	 * @see #setWorkability(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_Workability()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Workability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWorkability();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getWorkability <em>Workability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workability</em>' attribute.
	 * @see #getWorkability()
	 * @generated
	 */
	void setWorkability(String value);

	/**
	 * Returns the value of the '<em><b>Protective Pore Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protective Pore Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #setProtectivePoreRatio(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_ProtectivePoreRatio()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='ProtectivePoreRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getProtectivePoreRatio();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getProtectivePoreRatio <em>Protective Pore Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protective Pore Ratio</em>' attribute.
	 * @see #getProtectivePoreRatio()
	 * @generated
	 */
	void setProtectivePoreRatio(Double value);

	/**
	 * Returns the value of the '<em><b>Water Impermeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Water Impermeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Water Impermeability</em>' attribute.
	 * @see #setWaterImpermeability(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalConcreteMaterialProperties_WaterImpermeability()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='WaterImpermeability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWaterImpermeability();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalConcreteMaterialProperties#getWaterImpermeability <em>Water Impermeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Impermeability</em>' attribute.
	 * @see #getWaterImpermeability()
	 * @generated
	 */
	void setWaterImpermeability(String value);

} // IfcMechanicalConcreteMaterialProperties
