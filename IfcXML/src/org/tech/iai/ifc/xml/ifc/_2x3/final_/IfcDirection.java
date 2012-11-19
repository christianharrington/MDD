/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection#getDirectionRatios <em>Direction Ratios</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDirection()
 * @model extendedMetaData="name='IfcDirection' kind='elementOnly'"
 * @generated
 */
public interface IfcDirection extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Direction Ratios</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Ratios</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Ratios</em>' containment reference.
	 * @see #setDirectionRatios(DirectionRatiosType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDirection_DirectionRatios()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DirectionRatios' namespace='##targetNamespace'"
	 * @generated
	 */
	DirectionRatiosType getDirectionRatios();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDirection#getDirectionRatios <em>Direction Ratios</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Ratios</em>' containment reference.
	 * @see #getDirectionRatios()
	 * @generated
	 */
	void setDirectionRatios(DirectionRatiosType value);

} // IfcDirection
