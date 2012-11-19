/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Hygroscopic Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties()
 * @model extendedMetaData="name='IfcHygroscopicMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcHygroscopicMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Upper Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #setUpperVaporResistanceFactor(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties_UpperVaporResistanceFactor()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='UpperVaporResistanceFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getUpperVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getUpperVaporResistanceFactor <em>Upper Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Vapor Resistance Factor</em>' attribute.
	 * @see #getUpperVaporResistanceFactor()
	 * @generated
	 */
	void setUpperVaporResistanceFactor(Double value);

	/**
	 * Returns the value of the '<em><b>Lower Vapor Resistance Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Vapor Resistance Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #setLowerVaporResistanceFactor(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties_LowerVaporResistanceFactor()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='LowerVaporResistanceFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getLowerVaporResistanceFactor();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getLowerVaporResistanceFactor <em>Lower Vapor Resistance Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Vapor Resistance Factor</em>' attribute.
	 * @see #getLowerVaporResistanceFactor()
	 * @generated
	 */
	void setLowerVaporResistanceFactor(Double value);

	/**
	 * Returns the value of the '<em><b>Isothermal Moisture Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isothermal Moisture Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #setIsothermalMoistureCapacity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties_IsothermalMoistureCapacity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIsothermalMoistureCapacityMeasureObject"
	 *        extendedMetaData="kind='element' name='IsothermalMoistureCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getIsothermalMoistureCapacity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getIsothermalMoistureCapacity <em>Isothermal Moisture Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isothermal Moisture Capacity</em>' attribute.
	 * @see #getIsothermalMoistureCapacity()
	 * @generated
	 */
	void setIsothermalMoistureCapacity(Double value);

	/**
	 * Returns the value of the '<em><b>Vapor Permeability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vapor Permeability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #setVaporPermeability(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties_VaporPermeability()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcVaporPermeabilityMeasureObject"
	 *        extendedMetaData="kind='element' name='VaporPermeability' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getVaporPermeability();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getVaporPermeability <em>Vapor Permeability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vapor Permeability</em>' attribute.
	 * @see #getVaporPermeability()
	 * @generated
	 */
	void setVaporPermeability(Double value);

	/**
	 * Returns the value of the '<em><b>Moisture Diffusivity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moisture Diffusivity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #setMoistureDiffusivity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcHygroscopicMaterialProperties_MoistureDiffusivity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMoistureDiffusivityMeasureObject"
	 *        extendedMetaData="kind='element' name='MoistureDiffusivity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getMoistureDiffusivity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHygroscopicMaterialProperties#getMoistureDiffusivity <em>Moisture Diffusivity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moisture Diffusivity</em>' attribute.
	 * @see #getMoistureDiffusivity()
	 * @generated
	 */
	void setMoistureDiffusivity(Double value);

} // IfcHygroscopicMaterialProperties
