/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getPosition <em>Position</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric()
 * @model extendedMetaData="name='IfcLightSourceGoniometric' kind='elementOnly'"
 * @generated
 */
public interface IfcLightSourceGoniometric extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(PositionType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_Position()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Position' namespace='##targetNamespace'"
	 * @generated
	 */
	PositionType getPosition();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(PositionType value);

	/**
	 * Returns the value of the '<em><b>Colour Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Appearance</em>' containment reference.
	 * @see #setColourAppearance(ColourAppearanceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_ColourAppearance()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ColourAppearance' namespace='##targetNamespace'"
	 * @generated
	 */
	ColourAppearanceType getColourAppearance();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Appearance</em>' containment reference.
	 * @see #getColourAppearance()
	 * @generated
	 */
	void setColourAppearance(ColourAppearanceType value);

	/**
	 * Returns the value of the '<em><b>Colour Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature</em>' attribute.
	 * @see #setColourTemperature(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_ColourTemperature()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcThermodynamicTemperatureMeasure" required="true"
	 *        extendedMetaData="kind='element' name='ColourTemperature' namespace='##targetNamespace'"
	 * @generated
	 */
	double getColourTemperature();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature</em>' attribute.
	 * @see #getColourTemperature()
	 * @generated
	 */
	void setColourTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Luminous Flux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Flux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Flux</em>' attribute.
	 * @see #setLuminousFlux(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_LuminousFlux()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLuminousFluxMeasure" required="true"
	 *        extendedMetaData="kind='element' name='LuminousFlux' namespace='##targetNamespace'"
	 * @generated
	 */
	double getLuminousFlux();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux</em>' attribute.
	 * @see #getLuminousFlux()
	 * @generated
	 */
	void setLuminousFlux(double value);

	/**
	 * Returns the value of the '<em><b>Light Emission Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightEmissionSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Emission Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Emission Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightEmissionSourceEnum
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_LightEmissionSource()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='LightEmissionSource' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLightEmissionSourceEnum getLightEmissionSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Emission Source</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightEmissionSourceEnum
	 * @see #getLightEmissionSource()
	 * @generated
	 */
	void setLightEmissionSource(IfcLightEmissionSourceEnum value);

	/**
	 * Returns the value of the '<em><b>Light Distribution Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Data Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Data Source</em>' containment reference.
	 * @see #setLightDistributionDataSource(LightDistributionDataSourceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightSourceGoniometric_LightDistributionDataSource()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LightDistributionDataSource' namespace='##targetNamespace'"
	 * @generated
	 */
	LightDistributionDataSourceType getLightDistributionDataSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Data Source</em>' containment reference.
	 * @see #getLightDistributionDataSource()
	 * @generated
	 */
	void setLightDistributionDataSource(LightDistributionDataSourceType value);

} // IfcLightSourceGoniometric
