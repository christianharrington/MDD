/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AxisType#getIfcAxis1Placement <em>Ifc Axis1 Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAxisType()
 * @model extendedMetaData="name='Axis_._type' kind='elementOnly'"
 * @generated
 */
public interface AxisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Axis1 Placement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Axis1 Placement</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Axis1 Placement</em>' containment reference.
	 * @see #setIfcAxis1Placement(IfcAxis1Placement)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getAxisType_IfcAxis1Placement()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcAxis1Placement' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcAxis1Placement getIfcAxis1Placement();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.AxisType#getIfcAxis1Placement <em>Ifc Axis1 Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Axis1 Placement</em>' containment reference.
	 * @see #getIfcAxis1Placement()
	 * @generated
	 */
	void setIfcAxis1Placement(IfcAxis1Placement value);

} // AxisType
