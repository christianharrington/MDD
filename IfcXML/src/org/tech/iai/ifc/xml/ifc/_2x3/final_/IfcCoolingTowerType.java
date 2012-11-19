/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Cooling Tower Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCoolingTowerType()
 * @model extendedMetaData="name='IfcCoolingTowerType' kind='elementOnly'"
 * @generated
 */
public interface IfcCoolingTowerType extends IfcEnergyConversionDeviceType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoolingTowerTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoolingTowerTypeEnum
	 * @see #setPredefinedType(IfcCoolingTowerTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCoolingTowerType_PredefinedType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PredefinedType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCoolingTowerTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoolingTowerType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCoolingTowerTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcCoolingTowerTypeEnum value);

} // IfcCoolingTowerType
