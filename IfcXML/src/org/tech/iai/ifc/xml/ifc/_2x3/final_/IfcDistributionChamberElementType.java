/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Distribution Chamber Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionChamberElementType#getPredefinedType <em>Predefined Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDistributionChamberElementType()
 * @model extendedMetaData="name='IfcDistributionChamberElementType' kind='elementOnly'"
 * @generated
 */
public interface IfcDistributionChamberElementType extends IfcDistributionFlowElementType {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionChamberElementTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionChamberElementTypeEnum
	 * @see #setPredefinedType(IfcDistributionChamberElementTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcDistributionChamberElementType_PredefinedType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PredefinedType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDistributionChamberElementTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionChamberElementType#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDistributionChamberElementTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcDistributionChamberElementTypeEnum value);

} // IfcDistributionChamberElementType
