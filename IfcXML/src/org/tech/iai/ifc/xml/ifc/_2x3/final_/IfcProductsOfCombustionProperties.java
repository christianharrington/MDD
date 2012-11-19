/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Products Of Combustion Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProductsOfCombustionProperties()
 * @model extendedMetaData="name='IfcProductsOfCombustionProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcProductsOfCombustionProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Specific Heat Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Heat Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #setSpecificHeatCapacity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProductsOfCombustionProperties_SpecificHeatCapacity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecificHeatCapacityMeasureObject"
	 *        extendedMetaData="kind='element' name='SpecificHeatCapacity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSpecificHeatCapacity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getSpecificHeatCapacity <em>Specific Heat Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Heat Capacity</em>' attribute.
	 * @see #getSpecificHeatCapacity()
	 * @generated
	 */
	void setSpecificHeatCapacity(Double value);

	/**
	 * Returns the value of the '<em><b>N20 Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N20 Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N20 Content</em>' attribute.
	 * @see #setN20Content(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProductsOfCombustionProperties_N20Content()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='N20Content' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getN20Content();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getN20Content <em>N20 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N20 Content</em>' attribute.
	 * @see #getN20Content()
	 * @generated
	 */
	void setN20Content(Double value);

	/**
	 * Returns the value of the '<em><b>CO Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO Content</em>' attribute.
	 * @see #setCOContent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProductsOfCombustionProperties_COContent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='COContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCOContent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getCOContent <em>CO Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO Content</em>' attribute.
	 * @see #getCOContent()
	 * @generated
	 */
	void setCOContent(Double value);

	/**
	 * Returns the value of the '<em><b>CO2 Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CO2 Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CO2 Content</em>' attribute.
	 * @see #setCO2Content(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcProductsOfCombustionProperties_CO2Content()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='CO2Content' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCO2Content();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcProductsOfCombustionProperties#getCO2Content <em>CO2 Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CO2 Content</em>' attribute.
	 * @see #getCO2Content()
	 * @generated
	 */
	void setCO2Content(Double value);

} // IfcProductsOfCombustionProperties
