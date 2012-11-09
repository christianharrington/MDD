/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Texture Coordinate Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcTextureCoordinateGenerator#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureCoordinateGenerator()
 * @model
 * @generated
 */
public interface IfcTextureCoordinateGenerator extends IfcTextureCoordinate {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureCoordinateGenerator_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcTextureCoordinateGenerator#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link ifc2x3tc1.IfcSimpleValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcTextureCoordinateGenerator_Parameter()
	 * @model
	 * @generated
	 */
	EList<IfcSimpleValue> getParameter();

} // IfcTextureCoordinateGenerator
