/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Blob Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcBlobTexture#getRasterCode <em>Raster Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBlobTexture()
 * @model
 * @generated
 */
public interface IfcBlobTexture extends IfcSurfaceTexture {
	/**
	 * Returns the value of the '<em><b>Raster Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Format</em>' attribute.
	 * @see #setRasterFormat(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBlobTexture_RasterFormat()
	 * @model
	 * @generated
	 */
	String getRasterFormat();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBlobTexture#getRasterFormat <em>Raster Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Format</em>' attribute.
	 * @see #getRasterFormat()
	 * @generated
	 */
	void setRasterFormat(String value);

	/**
	 * Returns the value of the '<em><b>Raster Code</b></em>' attribute.
	 * The literals are from the enumeration {@link ifc2x3tc1.Tristate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Raster Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raster Code</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #setRasterCode(Tristate)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcBlobTexture_RasterCode()
	 * @model
	 * @generated
	 */
	Tristate getRasterCode();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcBlobTexture#getRasterCode <em>Raster Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Raster Code</em>' attribute.
	 * @see ifc2x3tc1.Tristate
	 * @see #getRasterCode()
	 * @generated
	 */
	void setRasterCode(Tristate value);

} // IfcBlobTexture
