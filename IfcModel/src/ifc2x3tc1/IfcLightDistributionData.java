/**
 */
package ifc2x3tc1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getMainPlaneAngleAsString <em>Main Plane Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getSecondaryPlaneAngleAsString <em>Secondary Plane Angle As String</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 *   <li>{@link ifc2x3tc1.IfcLightDistributionData#getLuminousIntensityAsString <em>Luminous Intensity As String</em>}</li>
 * </ul>
 * </p>
 *
 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData()
 * @model
 * @generated
 */
public interface IfcLightDistributionData extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Plane Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Plane Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Plane Angle</em>' attribute.
	 * @see #setMainPlaneAngle(double)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_MainPlaneAngle()
	 * @model
	 * @generated
	 */
	double getMainPlaneAngle();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Plane Angle</em>' attribute.
	 * @see #getMainPlaneAngle()
	 * @generated
	 */
	void setMainPlaneAngle(double value);

	/**
	 * Returns the value of the '<em><b>Main Plane Angle As String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Plane Angle As String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Plane Angle As String</em>' attribute.
	 * @see #setMainPlaneAngleAsString(String)
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_MainPlaneAngleAsString()
	 * @model
	 * @generated
	 */
	String getMainPlaneAngleAsString();

	/**
	 * Sets the value of the '{@link ifc2x3tc1.IfcLightDistributionData#getMainPlaneAngleAsString <em>Main Plane Angle As String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Plane Angle As String</em>' attribute.
	 * @see #getMainPlaneAngleAsString()
	 * @generated
	 */
	void setMainPlaneAngleAsString(String value);

	/**
	 * Returns the value of the '<em><b>Secondary Plane Angle</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Plane Angle</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Plane Angle</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_SecondaryPlaneAngle()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getSecondaryPlaneAngle();

	/**
	 * Returns the value of the '<em><b>Secondary Plane Angle As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Plane Angle As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Plane Angle As String</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_SecondaryPlaneAngleAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getSecondaryPlaneAngleAsString();

	/**
	 * Returns the value of the '<em><b>Luminous Intensity</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_LuminousIntensity()
	 * @model unique="false"
	 * @generated
	 */
	EList<Double> getLuminousIntensity();

	/**
	 * Returns the value of the '<em><b>Luminous Intensity As String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity As String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity As String</em>' attribute list.
	 * @see ifc2x3tc1.Ifc2x3tc1Package#getIfcLightDistributionData_LuminousIntensityAsString()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLuminousIntensityAsString();

} // IfcLightDistributionData
