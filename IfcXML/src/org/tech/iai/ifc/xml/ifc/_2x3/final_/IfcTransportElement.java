/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTransportElement()
 * @model extendedMetaData="name='IfcTransportElement' kind='elementOnly'"
 * @generated
 */
public interface IfcTransportElement extends IfcElement {
	/**
	 * Returns the value of the '<em><b>Operation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Type</em>' attribute.
	 * @see #setOperationType(IfcTransportElementTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTransportElement_OperationType()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElementTypeEnumObject"
	 *        extendedMetaData="kind='element' name='OperationType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTransportElementTypeEnum getOperationType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getOperationType <em>Operation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Type</em>' attribute.
	 * @see #getOperationType()
	 * @generated
	 */
	void setOperationType(IfcTransportElementTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Capacity By Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #setCapacityByWeight(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTransportElement_CapacityByWeight()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMassMeasureObject"
	 *        extendedMetaData="kind='element' name='CapacityByWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCapacityByWeight();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getCapacityByWeight <em>Capacity By Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Weight</em>' attribute.
	 * @see #getCapacityByWeight()
	 * @generated
	 */
	void setCapacityByWeight(Double value);

	/**
	 * Returns the value of the '<em><b>Capacity By Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity By Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity By Number</em>' attribute.
	 * @see #setCapacityByNumber(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTransportElement_CapacityByNumber()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCountMeasureObject"
	 *        extendedMetaData="kind='element' name='CapacityByNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getCapacityByNumber();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTransportElement#getCapacityByNumber <em>Capacity By Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity By Number</em>' attribute.
	 * @see #getCapacityByNumber()
	 * @generated
	 */
	void setCapacityByNumber(Double value);

} // IfcTransportElement
