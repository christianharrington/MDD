/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Mechanical Steel Material Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties()
 * @model extendedMetaData="name='IfcMechanicalSteelMaterialProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Yield Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Yield Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yield Stress</em>' attribute.
	 * @see #setYieldStress(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_YieldStress()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureObject"
	 *        extendedMetaData="kind='element' name='YieldStress' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getYieldStress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getYieldStress <em>Yield Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yield Stress</em>' attribute.
	 * @see #getYieldStress()
	 * @generated
	 */
	void setYieldStress(Double value);

	/**
	 * Returns the value of the '<em><b>Ultimate Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Stress</em>' attribute.
	 * @see #setUltimateStress(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_UltimateStress()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureObject"
	 *        extendedMetaData="kind='element' name='UltimateStress' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getUltimateStress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getUltimateStress <em>Ultimate Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Stress</em>' attribute.
	 * @see #getUltimateStress()
	 * @generated
	 */
	void setUltimateStress(Double value);

	/**
	 * Returns the value of the '<em><b>Ultimate Strain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ultimate Strain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ultimate Strain</em>' attribute.
	 * @see #setUltimateStrain(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_UltimateStrain()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='UltimateStrain' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getUltimateStrain();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getUltimateStrain <em>Ultimate Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ultimate Strain</em>' attribute.
	 * @see #getUltimateStrain()
	 * @generated
	 */
	void setUltimateStrain(Double value);

	/**
	 * Returns the value of the '<em><b>Hardening Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardening Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardening Module</em>' attribute.
	 * @see #setHardeningModule(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_HardeningModule()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcModulusOfElasticityMeasureObject"
	 *        extendedMetaData="kind='element' name='HardeningModule' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getHardeningModule();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getHardeningModule <em>Hardening Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardening Module</em>' attribute.
	 * @see #getHardeningModule()
	 * @generated
	 */
	void setHardeningModule(Double value);

	/**
	 * Returns the value of the '<em><b>Proportional Stress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proportional Stress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proportional Stress</em>' attribute.
	 * @see #setProportionalStress(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_ProportionalStress()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPressureMeasureObject"
	 *        extendedMetaData="kind='element' name='ProportionalStress' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getProportionalStress();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getProportionalStress <em>Proportional Stress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proportional Stress</em>' attribute.
	 * @see #getProportionalStress()
	 * @generated
	 */
	void setProportionalStress(Double value);

	/**
	 * Returns the value of the '<em><b>Plastic Strain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plastic Strain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plastic Strain</em>' attribute.
	 * @see #setPlasticStrain(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_PlasticStrain()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='PlasticStrain' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPlasticStrain();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getPlasticStrain <em>Plastic Strain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plastic Strain</em>' attribute.
	 * @see #getPlasticStrain()
	 * @generated
	 */
	void setPlasticStrain(Double value);

	/**
	 * Returns the value of the '<em><b>Relaxations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relaxations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relaxations</em>' containment reference.
	 * @see #setRelaxations(RelaxationsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMechanicalSteelMaterialProperties_Relaxations()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Relaxations' namespace='##targetNamespace'"
	 * @generated
	 */
	RelaxationsType getRelaxations();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMechanicalSteelMaterialProperties#getRelaxations <em>Relaxations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relaxations</em>' containment reference.
	 * @see #getRelaxations()
	 * @generated
	 */
	void setRelaxations(RelaxationsType value);

} // IfcMechanicalSteelMaterialProperties
