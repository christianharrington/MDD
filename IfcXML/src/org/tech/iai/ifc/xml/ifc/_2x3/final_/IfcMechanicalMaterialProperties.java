/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties()
 * @model extendedMetaData="name='IfcMechanicalMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcMechanicalMaterialProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Dynamic Viscosity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Viscosity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Viscosity</em>' attribute.
	 * @see #setDynamicViscosity(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties_DynamicViscosity()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDynamicViscosityMeasureObject"
	 *        extendedMetaData="kind='element' name='DynamicViscosity' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDynamicViscosity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getDynamicViscosity <em>Dynamic Viscosity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Viscosity</em>' attribute.
	 * @see #getDynamicViscosity()
	 * @generated
	 */
	void setDynamicViscosity(Double value);

	/**
	 * Returns the value of the '<em><b>Young Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Young Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Young Modulus</em>' attribute.
	 * @see #setYoungModulus(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties_YoungModulus()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfElasticityMeasureObject"
	 *        extendedMetaData="kind='element' name='YoungModulus' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getYoungModulus();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getYoungModulus <em>Young Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Young Modulus</em>' attribute.
	 * @see #getYoungModulus()
	 * @generated
	 */
	void setYoungModulus(Double value);

	/**
	 * Returns the value of the '<em><b>Shear Modulus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shear Modulus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shear Modulus</em>' attribute.
	 * @see #setShearModulus(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties_ShearModulus()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfElasticityMeasureObject"
	 *        extendedMetaData="kind='element' name='ShearModulus' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getShearModulus();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getShearModulus <em>Shear Modulus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shear Modulus</em>' attribute.
	 * @see #getShearModulus()
	 * @generated
	 */
	void setShearModulus(Double value);

	/**
	 * Returns the value of the '<em><b>Poisson Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poisson Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poisson Ratio</em>' attribute.
	 * @see #setPoissonRatio(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties_PoissonRatio()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='PoissonRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPoissonRatio();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getPoissonRatio <em>Poisson Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poisson Ratio</em>' attribute.
	 * @see #getPoissonRatio()
	 * @generated
	 */
	void setPoissonRatio(Double value);

	/**
	 * Returns the value of the '<em><b>Thermal Expansion Coefficient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thermal Expansion Coefficient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thermal Expansion Coefficient</em>' attribute.
	 * @see #setThermalExpansionCoefficient(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalMaterialProperties_ThermalExpansionCoefficient()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermalExpansionCoefficientMeasureObject"
	 *        extendedMetaData="kind='element' name='ThermalExpansionCoefficient' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getThermalExpansionCoefficient();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalMaterialProperties#getThermalExpansionCoefficient <em>Thermal Expansion Coefficient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermal Expansion Coefficient</em>' attribute.
	 * @see #getThermalExpansionCoefficient()
	 * @generated
	 */
	void setThermalExpansionCoefficient(Double value);

} // IfcMechanicalMaterialProperties
