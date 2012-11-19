/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Units In Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitsInContextType#getIfcUnitAssignment <em>Ifc Unit Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitsInContextType()
 * @model extendedMetaData="name='UnitsInContext_._type' kind='elementOnly'"
 * @generated
 */
public interface UnitsInContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Unit Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Unit Assignment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Unit Assignment</em>' containment reference.
	 * @see #setIfcUnitAssignment(IfcUnitAssignment)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getUnitsInContextType_IfcUnitAssignment()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcUnitAssignment' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcUnitAssignment getIfcUnitAssignment();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.UnitsInContextType#getIfcUnitAssignment <em>Ifc Unit Assignment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Unit Assignment</em>' containment reference.
	 * @see #getIfcUnitAssignment()
	 * @generated
	 */
	void setIfcUnitAssignment(IfcUnitAssignment value);

} // UnitsInContextType
