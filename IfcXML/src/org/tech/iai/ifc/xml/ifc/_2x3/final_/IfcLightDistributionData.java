/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Light Distribution Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionData()
 * @model extendedMetaData="name='IfcLightDistributionData' kind='elementOnly'"
 * @generated
 */
public interface IfcLightDistributionData extends Entity {
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionData_MainPlaneAngle()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasure" required="true"
	 *        extendedMetaData="kind='element' name='MainPlaneAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMainPlaneAngle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getMainPlaneAngle <em>Main Plane Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Plane Angle</em>' attribute.
	 * @see #getMainPlaneAngle()
	 * @generated
	 */
	void setMainPlaneAngle(double value);

	/**
	 * Returns the value of the '<em><b>Secondary Plane Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Plane Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Plane Angle</em>' containment reference.
	 * @see #setSecondaryPlaneAngle(SecondaryPlaneAngleType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionData_SecondaryPlaneAngle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SecondaryPlaneAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondaryPlaneAngleType getSecondaryPlaneAngle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getSecondaryPlaneAngle <em>Secondary Plane Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary Plane Angle</em>' containment reference.
	 * @see #getSecondaryPlaneAngle()
	 * @generated
	 */
	void setSecondaryPlaneAngle(SecondaryPlaneAngleType value);

	/**
	 * Returns the value of the '<em><b>Luminous Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luminous Intensity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luminous Intensity</em>' containment reference.
	 * @see #setLuminousIntensity(LuminousIntensityType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLightDistributionData_LuminousIntensity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LuminousIntensity' namespace='##targetNamespace'"
	 * @generated
	 */
	LuminousIntensityType getLuminousIntensity();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLightDistributionData#getLuminousIntensity <em>Luminous Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Intensity</em>' containment reference.
	 * @see #getLuminousIntensity()
	 * @generated
	 */
	void setLuminousIntensity(LuminousIntensityType value);

} // IfcLightDistributionData
