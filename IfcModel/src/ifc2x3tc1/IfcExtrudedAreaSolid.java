/**
 */
package ifc2x3tc1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Extruded Area Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcExtrudedAreaSolid#getExtrudedDirection <em>Extruded Direction</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcExtrudedAreaSolid#getDepth <em>Depth</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcExtrudedAreaSolid#getDepthAsString <em>Depth As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcExtrudedAreaSolid()
 * @model
 * @generated
 */
public interface IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
	/**
	 * Returns the value of the '<em><b>Extruded Direction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extruded Direction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extruded Direction</em>' reference.
	 * @see #setExtrudedDirection(IfcDirection)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcExtrudedAreaSolid_ExtrudedDirection()
	 * @model
	 * @generated
	 */
	IfcDirection getExtrudedDirection();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcExtrudedAreaSolid#getExtrudedDirection <em>Extruded Direction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extruded Direction</em>' reference.
	 * @see #getExtrudedDirection()
	 * @generated
	 */
	void setExtrudedDirection(IfcDirection value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcExtrudedAreaSolid_Depth()
	 * @model
	 * @generated
	 */
	double getDepth();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcExtrudedAreaSolid#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(double value);

	/**
	 * Returns the value of the '<em><b>Depth As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth As String</em>' attribute.
	 * @see #setDepthAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcExtrudedAreaSolid_DepthAsString()
	 * @model
	 * @generated
	 */
	String getDepthAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcExtrudedAreaSolid#getDepthAsString <em>Depth As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth As String</em>' attribute.
	 * @see #getDepthAsString()
	 * @generated
	 */
	void setDepthAsString(String value);

} // IfcExtrudedAreaSolid
