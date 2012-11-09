/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Building Storey</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcBuildingStorey#getElevation <em>Elevation</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcBuildingStorey#getElevationAsString <em>Elevation As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingStorey()
 * @model
 * @generated
 */
public interface IfcBuildingStorey extends IfcSpatialStructureElement {
	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #setElevation(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingStorey_Elevation()
	 * @model unsettable="true"
	 * @generated
	 */
	double getElevation();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #isSetElevation()
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(double value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevation()
	 * @see #getElevation()
	 * @see #setElevation(double)
	 * @generated
	 */
	void unsetElevation();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevation <em>Elevation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation</em>' attribute is set.
	 * @see #unsetElevation()
	 * @see #getElevation()
	 * @see #setElevation(double)
	 * @generated
	 */
	boolean isSetElevation();

	/**
	 * Returns the value of the '<em><b>Elevation As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation As String</em>' attribute.
	 * @see #isSetElevationAsString()
	 * @see #unsetElevationAsString()
	 * @see #setElevationAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBuildingStorey_ElevationAsString()
	 * @model unsettable="true"
	 * @generated
	 */
	String getElevationAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevationAsString <em>Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation As String</em>' attribute.
	 * @see #isSetElevationAsString()
	 * @see #unsetElevationAsString()
	 * @see #getElevationAsString()
	 * @generated
	 */
	void setElevationAsString(String value);

	/**
	 * Unsets the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevationAsString <em>Elevation As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetElevationAsString()
	 * @see #getElevationAsString()
	 * @see #setElevationAsString(String)
	 * @generated
	 */
	void unsetElevationAsString();

	/**
	 * Returns whether the value of the '{@link ifc2x3tc1.IfcBuildingStorey#getElevationAsString <em>Elevation As String</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Elevation As String</em>' attribute is set.
	 * @see #unsetElevationAsString()
	 * @see #getElevationAsString()
	 * @see #setElevationAsString(String)
	 * @generated
	 */
	boolean isSetElevationAsString();

} // IfcBuildingStorey
