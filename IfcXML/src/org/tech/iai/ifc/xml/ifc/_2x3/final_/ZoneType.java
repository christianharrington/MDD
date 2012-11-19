/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ZoneType#getIfcCoordinatedUniversalTimeOffset <em>Ifc Coordinated Universal Time Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getZoneType()
 * @model extendedMetaData="name='Zone_._type' kind='elementOnly'"
 * @generated
 */
public interface ZoneType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Coordinated Universal Time Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Coordinated Universal Time Offset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Coordinated Universal Time Offset</em>' containment reference.
	 * @see #setIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getZoneType_IfcCoordinatedUniversalTimeOffset()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCoordinatedUniversalTimeOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCoordinatedUniversalTimeOffset getIfcCoordinatedUniversalTimeOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ZoneType#getIfcCoordinatedUniversalTimeOffset <em>Ifc Coordinated Universal Time Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Coordinated Universal Time Offset</em>' containment reference.
	 * @see #getIfcCoordinatedUniversalTimeOffset()
	 * @generated
	 */
	void setIfcCoordinatedUniversalTimeOffset(IfcCoordinatedUniversalTimeOffset value);

} // ZoneType
