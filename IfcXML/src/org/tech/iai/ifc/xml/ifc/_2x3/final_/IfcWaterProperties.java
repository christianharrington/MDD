/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Water Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getIsPotable <em>Is Potable</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getHardness <em>Hardness</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getPHLevel <em>PH Level</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties()
 * @model extendedMetaData="name='IfcWaterProperties' kind='elementOnly'"
 * @generated
 */
public interface IfcWaterProperties extends IfcMaterialProperties {
	/**
	 * Returns the value of the '<em><b>Is Potable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Potable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Potable</em>' attribute.
	 * @see #setIsPotable(Boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_IsPotable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.BooleanObject"
	 *        extendedMetaData="kind='element' name='IsPotable' namespace='##targetNamespace'"
	 * @generated
	 */
	Boolean getIsPotable();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getIsPotable <em>Is Potable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Potable</em>' attribute.
	 * @see #getIsPotable()
	 * @generated
	 */
	void setIsPotable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Hardness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardness</em>' attribute.
	 * @see #setHardness(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_Hardness()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIonConcentrationMeasureObject"
	 *        extendedMetaData="kind='element' name='Hardness' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getHardness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getHardness <em>Hardness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardness</em>' attribute.
	 * @see #getHardness()
	 * @generated
	 */
	void setHardness(Double value);

	/**
	 * Returns the value of the '<em><b>Alkalinity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alkalinity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #setAlkalinityConcentration(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_AlkalinityConcentration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIonConcentrationMeasureObject"
	 *        extendedMetaData="kind='element' name='AlkalinityConcentration' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getAlkalinityConcentration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getAlkalinityConcentration <em>Alkalinity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alkalinity Concentration</em>' attribute.
	 * @see #getAlkalinityConcentration()
	 * @generated
	 */
	void setAlkalinityConcentration(Double value);

	/**
	 * Returns the value of the '<em><b>Acidity Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acidity Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #setAcidityConcentration(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_AcidityConcentration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcIonConcentrationMeasureObject"
	 *        extendedMetaData="kind='element' name='AcidityConcentration' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getAcidityConcentration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getAcidityConcentration <em>Acidity Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acidity Concentration</em>' attribute.
	 * @see #getAcidityConcentration()
	 * @generated
	 */
	void setAcidityConcentration(Double value);

	/**
	 * Returns the value of the '<em><b>Impurities Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impurities Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impurities Content</em>' attribute.
	 * @see #setImpuritiesContent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_ImpuritiesContent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='ImpuritiesContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getImpuritiesContent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getImpuritiesContent <em>Impurities Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impurities Content</em>' attribute.
	 * @see #getImpuritiesContent()
	 * @generated
	 */
	void setImpuritiesContent(Double value);

	/**
	 * Returns the value of the '<em><b>PH Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PH Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PH Level</em>' attribute.
	 * @see #setPHLevel(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_PHLevel()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPHMeasureObject"
	 *        extendedMetaData="kind='element' name='PHLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getPHLevel();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getPHLevel <em>PH Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PH Level</em>' attribute.
	 * @see #getPHLevel()
	 * @generated
	 */
	void setPHLevel(Double value);

	/**
	 * Returns the value of the '<em><b>Dissolved Solids Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dissolved Solids Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #setDissolvedSolidsContent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcWaterProperties_DissolvedSolidsContent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcNormalisedRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='DissolvedSolidsContent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getDissolvedSolidsContent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcWaterProperties#getDissolvedSolidsContent <em>Dissolved Solids Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dissolved Solids Content</em>' attribute.
	 * @see #getDissolvedSolidsContent()
	 * @generated
	 */
	void setDissolvedSolidsContent(Double value);

} // IfcWaterProperties
