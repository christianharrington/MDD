/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Orientation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType#getIfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType#getIfcDirection <em>Ifc Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOrientationType()
 * @model extendedMetaData="name='ProfileOrientation_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfileOrientationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Plane Angle Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Plane Angle Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Plane Angle Measure</em>' containment reference.
	 * @see #setIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOrientationType_IfcPlaneAngleMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPlaneAngleMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPlaneAngleMeasureType getIfcPlaneAngleMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType#getIfcPlaneAngleMeasure <em>Ifc Plane Angle Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Plane Angle Measure</em>' containment reference.
	 * @see #getIfcPlaneAngleMeasure()
	 * @generated
	 */
	void setIfcPlaneAngleMeasure(IfcPlaneAngleMeasureType value);

	/**
	 * Returns the value of the '<em><b>Ifc Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Direction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Direction</em>' containment reference.
	 * @see #setIfcDirection(IfcDirection)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileOrientationType_IfcDirection()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDirection' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDirection getIfcDirection();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileOrientationType#getIfcDirection <em>Ifc Direction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Direction</em>' containment reference.
	 * @see #getIfcDirection()
	 * @generated
	 */
	void setIfcDirection(IfcDirection value);

} // ProfileOrientationType
