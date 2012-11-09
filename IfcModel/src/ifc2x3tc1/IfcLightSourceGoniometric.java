/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Goniometric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getPosition <em>Position</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourTemperatureAsString <em>Colour Temperature As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getLuminousFluxAsString <em>Luminous Flux As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric()
 * @model
 * @generated
 */
public interface IfcLightSourceGoniometric extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcAxis2Placement3D)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_Position()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement3D getPosition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Colour Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Appearance</em>' reference.
	 * @see #isSetColourAppearance()
	 * @see #unsetColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_ColourAppearance()
	 * @model unsettable="true"
	 * @generated
	 */
	IfcColourRgb getColourAppearance();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Appearance</em>' reference.
	 * @see #isSetColourAppearance()
	 * @see #unsetColourAppearance()
	 * @see #getColourAppearance()
	 * @generated
	 */
	void setColourAppearance(IfcColourRgb value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColourAppearance()
	 * @see #getColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @generated
	 */
	void unsetColourAppearance();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourAppearance <em>Colour Appearance</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colour Appearance</em>' reference is set.
	 * @see #unsetColourAppearance()
	 * @see #getColourAppearance()
	 * @see #setColourAppearance(IfcColourRgb)
	 * @generated
	 */
	boolean isSetColourAppearance();

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_ColourTemperature()
	 * @model
	 * @generated
	 */
	double getColourTemperature();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourTemperature <em>Colour Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature</em>' attribute.
	 * @see #getColourTemperature()
	 * @generated
	 */
	void setColourTemperature(double value);

	/**
	 * Returns the value of the '<em><b>Colour Temperature As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour Temperature As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour Temperature As String</em>' attribute.
	 * @see #setColourTemperatureAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_ColourTemperatureAsString()
	 * @model
	 * @generated
	 */
	String getColourTemperatureAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getColourTemperatureAsString <em>Colour Temperature As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour Temperature As String</em>' attribute.
	 * @see #getColourTemperatureAsString()
	 * @generated
	 */
	void setColourTemperatureAsString(String value);

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
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_LuminousFlux()
	 * @model
	 * @generated
	 */
	double getLuminousFlux();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getLuminousFlux <em>Luminous Flux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux</em>' attribute.
	 * @see #getLuminousFlux()
	 * @generated
	 */
	void setLuminousFlux(double value);

	/**
	 * Returns the value of the '<em><b>Luminous Flux As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Flux As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Flux As String</em>' attribute.
	 * @see #setLuminousFluxAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_LuminousFluxAsString()
	 * @model
	 * @generated
	 */
	String getLuminousFluxAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getLuminousFluxAsString <em>Luminous Flux As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Flux As String</em>' attribute.
	 * @see #getLuminousFluxAsString()
	 * @generated
	 */
	void setLuminousFluxAsString(String value);

	/**
	 * Returns the value of the '<em><b>Light Emission Source</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.IfcLightEmissionSourceEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Emission Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Emission Source</em>' attribute.
	 * @see ifc2x3tc1.IfcLightEmissionSourceEnum
	 * @see #setLightEmissionSource(IfcLightEmissionSourceEnum)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_LightEmissionSource()
	 * @model
	 * @generated
	 */
	IfcLightEmissionSourceEnum getLightEmissionSource();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getLightEmissionSource <em>Light Emission Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Emission Source</em>' attribute.
	 * @see ifc2x3tc1.IfcLightEmissionSourceEnum
	 * @see #getLightEmissionSource()
	 * @generated
	 */
	void setLightEmissionSource(IfcLightEmissionSourceEnum value);

	/**
	 * Returns the value of the '<em><b>Light Distribution Data Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Light Distribution Data Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #setLightDistributionDataSource(IfcLightDistributionDataSourceSelect)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceGoniometric_LightDistributionDataSource()
	 * @model
	 * @generated
	 */
	IfcLightDistributionDataSourceSelect getLightDistributionDataSource();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceGoniometric#getLightDistributionDataSource <em>Light Distribution Data Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light Distribution Data Source</em>' reference.
	 * @see #getLightDistributionDataSource()
	 * @generated
	 */
	void setLightDistributionDataSource(IfcLightDistributionDataSourceSelect value);

} // IfcLightSourceGoniometric
