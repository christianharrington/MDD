/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Source Positional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getPosition <em>Position</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getRadius <em>Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getRadiusAsString <em>Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getConstantAttenuationAsString <em>Constant Attenuation As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getDistanceAttenuationAsString <em>Distance Attenuation As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightSourcePositional#getQuadricAttenuationAsString <em>Quadric Attenuation As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional()
 * @model
 * @generated
 */
public interface IfcLightSourcePositional extends IfcLightSource {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IfcCartesianPoint)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_Position()
	 * @model
	 * @generated
	 */
	IfcCartesianPoint getPosition();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius As String</em>' attribute.
	 * @see #setRadiusAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_RadiusAsString()
	 * @model
	 * @generated
	 */
	String getRadiusAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getRadiusAsString <em>Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius As String</em>' attribute.
	 * @see #getRadiusAsString()
	 * @generated
	 */
	void setRadiusAsString(String value);

	/**
	 * Returns the value of the '<em><b>Constant Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Attenuation</em>' attribute.
	 * @see #setConstantAttenuation(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_ConstantAttenuation()
	 * @model
	 * @generated
	 */
	double getConstantAttenuation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getConstantAttenuation <em>Constant Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Attenuation</em>' attribute.
	 * @see #getConstantAttenuation()
	 * @generated
	 */
	void setConstantAttenuation(double value);

	/**
	 * Returns the value of the '<em><b>Constant Attenuation As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Attenuation As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Attenuation As String</em>' attribute.
	 * @see #setConstantAttenuationAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_ConstantAttenuationAsString()
	 * @model
	 * @generated
	 */
	String getConstantAttenuationAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getConstantAttenuationAsString <em>Constant Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Attenuation As String</em>' attribute.
	 * @see #getConstantAttenuationAsString()
	 * @generated
	 */
	void setConstantAttenuationAsString(String value);

	/**
	 * Returns the value of the '<em><b>Distance Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Attenuation</em>' attribute.
	 * @see #setDistanceAttenuation(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_DistanceAttenuation()
	 * @model
	 * @generated
	 */
	double getDistanceAttenuation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getDistanceAttenuation <em>Distance Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Attenuation</em>' attribute.
	 * @see #getDistanceAttenuation()
	 * @generated
	 */
	void setDistanceAttenuation(double value);

	/**
	 * Returns the value of the '<em><b>Distance Attenuation As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance Attenuation As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance Attenuation As String</em>' attribute.
	 * @see #setDistanceAttenuationAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_DistanceAttenuationAsString()
	 * @model
	 * @generated
	 */
	String getDistanceAttenuationAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getDistanceAttenuationAsString <em>Distance Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance Attenuation As String</em>' attribute.
	 * @see #getDistanceAttenuationAsString()
	 * @generated
	 */
	void setDistanceAttenuationAsString(String value);

	/**
	 * Returns the value of the '<em><b>Quadric Attenuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quadric Attenuation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quadric Attenuation</em>' attribute.
	 * @see #setQuadricAttenuation(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_QuadricAttenuation()
	 * @model
	 * @generated
	 */
	double getQuadricAttenuation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getQuadricAttenuation <em>Quadric Attenuation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quadric Attenuation</em>' attribute.
	 * @see #getQuadricAttenuation()
	 * @generated
	 */
	void setQuadricAttenuation(double value);

	/**
	 * Returns the value of the '<em><b>Quadric Attenuation As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quadric Attenuation As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quadric Attenuation As String</em>' attribute.
	 * @see #setQuadricAttenuationAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightSourcePositional_QuadricAttenuationAsString()
	 * @model
	 * @generated
	 */
	String getQuadricAttenuationAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightSourcePositional#getQuadricAttenuationAsString <em>Quadric Attenuation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quadric Attenuation As String</em>' attribute.
	 * @see #getQuadricAttenuationAsString()
	 * @generated
	 */
	void setQuadricAttenuationAsString(String value);

} // IfcLightSourcePositional
