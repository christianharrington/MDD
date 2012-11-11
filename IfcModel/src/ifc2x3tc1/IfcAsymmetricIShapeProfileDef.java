/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Asymmetric IShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeWidthAsString <em>Top Flange Width As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThicknessAsString <em>Top Flange Thickness As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadiusAsString <em>Top Flange Fillet Radius As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef()
 * @model
 * @generated
 */
public interface IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef {
	/**
	 * Returns the value of the '<em><b>Top Flange Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Width</em>' attribute.
	 * @see #setTopFlangeWidth(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeWidth()
	 * @model
	 * @generated
	 */
	double getTopFlangeWidth();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeWidth <em>Top Flange Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Width</em>' attribute.
	 * @see #getTopFlangeWidth()
	 * @generated
	 */
	void setTopFlangeWidth(double value);

	/**
	 * Returns the value of the '<em><b>Top Flange Width As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Width As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Width As String</em>' attribute.
	 * @see #setTopFlangeWidthAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeWidthAsString()
	 * @model
	 * @generated
	 */
	String getTopFlangeWidthAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeWidthAsString <em>Top Flange Width As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Width As String</em>' attribute.
	 * @see #getTopFlangeWidthAsString()
	 * @generated
	 */
	void setTopFlangeWidthAsString(String value);

	/**
	 * Returns the value of the '<em><b>Top Flange Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Thickness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Thickness</em>' attribute.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #setTopFlangeThickness(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeThickness()
	 * @model unsettable="true"
	 * @generated
	 */
	double getTopFlangeThickness();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Thickness</em>' attribute.
	 * @see #isSetTopFlangeThickness()
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @generated
	 */
	void setTopFlangeThickness(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(double)
	 * @generated
	 */
	void unsetTopFlangeThickness();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThickness <em>Top Flange Thickness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Thickness</em>' attribute is set.
	 * @see #unsetTopFlangeThickness()
	 * @see #getTopFlangeThickness()
	 * @see #setTopFlangeThickness(double)
	 * @generated
	 */
	boolean isSetTopFlangeThickness();

	/**
	 * Returns the value of the '<em><b>Top Flange Thickness As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Thickness As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Thickness As String</em>' attribute.
	 * @see #isSetTopFlangeThicknessAsString()
	 * @see #unsetTopFlangeThicknessAsString()
	 * @see #setTopFlangeThicknessAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeThicknessAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTopFlangeThicknessAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThicknessAsString <em>Top Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Thickness As String</em>' attribute.
	 * @see #isSetTopFlangeThicknessAsString()
	 * @see #unsetTopFlangeThicknessAsString()
	 * @see #getTopFlangeThicknessAsString()
	 * @generated
	 */
	void setTopFlangeThicknessAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThicknessAsString <em>Top Flange Thickness As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeThicknessAsString()
	 * @see #getTopFlangeThicknessAsString()
	 * @see #setTopFlangeThicknessAsString(String)
	 * @generated
	 */
	void unsetTopFlangeThicknessAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeThicknessAsString <em>Top Flange Thickness As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Thickness As String</em>' attribute is set.
	 * @see #unsetTopFlangeThicknessAsString()
	 * @see #getTopFlangeThicknessAsString()
	 * @see #setTopFlangeThicknessAsString(String)
	 * @generated
	 */
	boolean isSetTopFlangeThicknessAsString();

	/**
	 * Returns the value of the '<em><b>Top Flange Fillet Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Fillet Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Fillet Radius</em>' attribute.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadius()
	 * @model unsettable="true"
	 * @generated
	 */
	double getTopFlangeFilletRadius();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Fillet Radius</em>' attribute.
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @generated
	 */
	void setTopFlangeFilletRadius(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(double)
	 * @generated
	 */
	void unsetTopFlangeFilletRadius();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadius <em>Top Flange Fillet Radius</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Fillet Radius</em>' attribute is set.
	 * @see #unsetTopFlangeFilletRadius()
	 * @see #getTopFlangeFilletRadius()
	 * @see #setTopFlangeFilletRadius(double)
	 * @generated
	 */
	boolean isSetTopFlangeFilletRadius();

	/**
	 * Returns the value of the '<em><b>Top Flange Fillet Radius As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Flange Fillet Radius As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Flange Fillet Radius As String</em>' attribute.
	 * @see #isSetTopFlangeFilletRadiusAsString()
	 * @see #unsetTopFlangeFilletRadiusAsString()
	 * @see #setTopFlangeFilletRadiusAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_TopFlangeFilletRadiusAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getTopFlangeFilletRadiusAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadiusAsString <em>Top Flange Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Flange Fillet Radius As String</em>' attribute.
	 * @see #isSetTopFlangeFilletRadiusAsString()
	 * @see #unsetTopFlangeFilletRadiusAsString()
	 * @see #getTopFlangeFilletRadiusAsString()
	 * @generated
	 */
	void setTopFlangeFilletRadiusAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadiusAsString <em>Top Flange Fillet Radius As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTopFlangeFilletRadiusAsString()
	 * @see #getTopFlangeFilletRadiusAsString()
	 * @see #setTopFlangeFilletRadiusAsString(String)
	 * @generated
	 */
	void unsetTopFlangeFilletRadiusAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getTopFlangeFilletRadiusAsString <em>Top Flange Fillet Radius As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Top Flange Fillet Radius As String</em>' attribute is set.
	 * @see #unsetTopFlangeFilletRadiusAsString()
	 * @see #getTopFlangeFilletRadiusAsString()
	 * @see #setTopFlangeFilletRadiusAsString(String)
	 * @generated
	 */
	boolean isSetTopFlangeFilletRadiusAsString();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_CentreOfGravityInY()
	 * @model unsettable="true"
	 * @generated
	 */
	double getCentreOfGravityInY();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In Y</em>' attribute.
	 * @see #isSetCentreOfGravityInY()
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @generated
	 */
	void setCentreOfGravityInY(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(double)
	 * @generated
	 */
	void unsetCentreOfGravityInY();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In Y</em>' attribute is set.
	 * @see #unsetCentreOfGravityInY()
	 * @see #getCentreOfGravityInY()
	 * @see #setCentreOfGravityInY(double)
	 * @generated
	 */
	boolean isSetCentreOfGravityInY();

	/**
	 * Returns the value of the '<em><b>Centre Of Gravity In YAs String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre Of Gravity In YAs String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre Of Gravity In YAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcAsymmetricIShapeProfileDef_CentreOfGravityInYAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCentreOfGravityInYAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre Of Gravity In YAs String</em>' attribute.
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @generated
	 */
	void setCentreOfGravityInYAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @generated
	 */
	void unsetCentreOfGravityInYAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcAsymmetricIShapeProfileDef#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Centre Of Gravity In YAs String</em>' attribute is set.
	 * @see #unsetCentreOfGravityInYAsString()
	 * @see #getCentreOfGravityInYAsString()
	 * @see #setCentreOfGravityInYAsString(String)
	 * @generated
	 */
	boolean isSetCentreOfGravityInYAsString();

} // IfcAsymmetricIShapeProfileDef