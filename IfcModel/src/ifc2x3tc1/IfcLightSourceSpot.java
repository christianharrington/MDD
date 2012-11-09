/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Spot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponentAsString <em>Concentration Exponent As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getSpreadAngleAsString <em>Spread Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourceSpot#getBeamWidthAngleAsString <em>Beam Width Angle As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot()
 * @model
 * @generated
 */
public interface IfcLightSourceSpot extends IfcLightSourcePositional {
	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' reference.
	 * @see #setOrientation(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_Orientation()
	 * @model
	 * @generated
	 */
	IfcDirection getOrientation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getOrientation <em>Orientation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Concentration Exponent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration Exponent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration Exponent</em>' attribute.
	 * @see #isSetConcentrationExponent()
	 * @see #unsetConcentrationExponent()
	 * @see #setConcentrationExponent(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_ConcentrationExponent()
	 * @model unsettable="true"
	 * @generated
	 */
	double getConcentrationExponent();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Exponent</em>' attribute.
	 * @see #isSetConcentrationExponent()
	 * @see #unsetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @generated
	 */
	void setConcentrationExponent(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @see #setConcentrationExponent(double)
	 * @generated
	 */
	void unsetConcentrationExponent();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponent <em>Concentration Exponent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concentration Exponent</em>' attribute is set.
	 * @see #unsetConcentrationExponent()
	 * @see #getConcentrationExponent()
	 * @see #setConcentrationExponent(double)
	 * @generated
	 */
	boolean isSetConcentrationExponent();

	/**
	 * Returns the value of the '<em><b>Concentration Exponent As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration Exponent As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration Exponent As String</em>' attribute.
	 * @see #isSetConcentrationExponentAsString()
	 * @see #unsetConcentrationExponentAsString()
	 * @see #setConcentrationExponentAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_ConcentrationExponentAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getConcentrationExponentAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponentAsString <em>Concentration Exponent As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration Exponent As String</em>' attribute.
	 * @see #isSetConcentrationExponentAsString()
	 * @see #unsetConcentrationExponentAsString()
	 * @see #getConcentrationExponentAsString()
	 * @generated
	 */
	void setConcentrationExponentAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponentAsString <em>Concentration Exponent As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConcentrationExponentAsString()
	 * @see #getConcentrationExponentAsString()
	 * @see #setConcentrationExponentAsString(String)
	 * @generated
	 */
	void unsetConcentrationExponentAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getConcentrationExponentAsString <em>Concentration Exponent As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Concentration Exponent As String</em>' attribute is set.
	 * @see #unsetConcentrationExponentAsString()
	 * @see #getConcentrationExponentAsString()
	 * @see #setConcentrationExponentAsString(String)
	 * @generated
	 */
	boolean isSetConcentrationExponentAsString();

	/**
	 * Returns the value of the '<em><b>Spread Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread Angle</em>' attribute.
	 * @see #setSpreadAngle(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_SpreadAngle()
	 * @model
	 * @generated
	 */
	double getSpreadAngle();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getSpreadAngle <em>Spread Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Angle</em>' attribute.
	 * @see #getSpreadAngle()
	 * @generated
	 */
	void setSpreadAngle(double value);

	/**
	 * Returns the value of the '<em><b>Spread Angle As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spread Angle As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spread Angle As String</em>' attribute.
	 * @see #setSpreadAngleAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_SpreadAngleAsString()
	 * @model
	 * @generated
	 */
	String getSpreadAngleAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getSpreadAngleAsString <em>Spread Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Angle As String</em>' attribute.
	 * @see #getSpreadAngleAsString()
	 * @generated
	 */
	void setSpreadAngleAsString(String value);

	/**
	 * Returns the value of the '<em><b>Beam Width Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beam Width Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Width Angle</em>' attribute.
	 * @see #setBeamWidthAngle(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_BeamWidthAngle()
	 * @model
	 * @generated
	 */
	double getBeamWidthAngle();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getBeamWidthAngle <em>Beam Width Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Width Angle</em>' attribute.
	 * @see #getBeamWidthAngle()
	 * @generated
	 */
	void setBeamWidthAngle(double value);

	/**
	 * Returns the value of the '<em><b>Beam Width Angle As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beam Width Angle As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beam Width Angle As String</em>' attribute.
	 * @see #setBeamWidthAngleAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourceSpot_BeamWidthAngleAsString()
	 * @model
	 * @generated
	 */
	String getBeamWidthAngleAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourceSpot#getBeamWidthAngleAsString <em>Beam Width Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beam Width Angle As String</em>' attribute.
	 * @see #getBeamWidthAngleAsString()
	 * @generated
	 */
	void setBeamWidthAngleAsString(String value);

} // IfcLightSourceSpot
