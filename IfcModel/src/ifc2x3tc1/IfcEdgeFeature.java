/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Edge Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLengthAsString <em>Feature Length As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeFeature()
 * @model
 * @generated
 */
public interface IfcEdgeFeature extends IfcFeatureElementSubtraction {
	/**
	 * Returns the value of the '<em><b>Feature Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Length</em>' attribute.
	 * @see #isSetFeatureLength()
	 * @see #unsetFeatureLength()
	 * @see #setFeatureLength(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeFeature_FeatureLength()
	 * @model unsettable="true"
	 * @generated
	 */
	double getFeatureLength();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Length</em>' attribute.
	 * @see #isSetFeatureLength()
	 * @see #unsetFeatureLength()
	 * @see #getFeatureLength()
	 * @generated
	 */
	void setFeatureLength(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureLength()
	 * @see #getFeatureLength()
	 * @see #setFeatureLength(double)
	 * @generated
	 */
	void unsetFeatureLength();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLength <em>Feature Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Length</em>' attribute is set.
	 * @see #unsetFeatureLength()
	 * @see #getFeatureLength()
	 * @see #setFeatureLength(double)
	 * @generated
	 */
	boolean isSetFeatureLength();

	/**
	 * Returns the value of the '<em><b>Feature Length As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Length As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Length As String</em>' attribute.
	 * @see #isSetFeatureLengthAsString()
	 * @see #unsetFeatureLengthAsString()
	 * @see #setFeatureLengthAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcEdgeFeature_FeatureLengthAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getFeatureLengthAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLengthAsString <em>Feature Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Length As String</em>' attribute.
	 * @see #isSetFeatureLengthAsString()
	 * @see #unsetFeatureLengthAsString()
	 * @see #getFeatureLengthAsString()
	 * @generated
	 */
	void setFeatureLengthAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLengthAsString <em>Feature Length As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFeatureLengthAsString()
	 * @see #getFeatureLengthAsString()
	 * @see #setFeatureLengthAsString(String)
	 * @generated
	 */
	void unsetFeatureLengthAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcEdgeFeature#getFeatureLengthAsString <em>Feature Length As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Feature Length As String</em>' attribute is set.
	 * @see #unsetFeatureLengthAsString()
	 * @see #getFeatureLengthAsString()
	 * @see #setFeatureLengthAsString(String)
	 * @generated
	 */
	boolean isSetFeatureLengthAsString();

} // IfcEdgeFeature
