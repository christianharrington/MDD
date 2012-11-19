/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcServiceLife()
 * @model extendedMetaData="name='IfcServiceLife' kind='elementOnly'"
 * @generated
 */
public interface IfcServiceLife extends IfcControl {
	/**
	 * Returns the value of the '<em><b>Service Life Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeTypeEnum
	 * @see #setServiceLifeType(IfcServiceLifeTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcServiceLife_ServiceLifeType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceLifeType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcServiceLifeTypeEnum getServiceLifeType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLife#getServiceLifeType <em>Service Life Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLifeTypeEnum
	 * @see #getServiceLifeType()
	 * @generated
	 */
	void setServiceLifeType(IfcServiceLifeTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Service Life Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Life Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Life Duration</em>' attribute.
	 * @see #setServiceLifeDuration(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcServiceLife_ServiceLifeDuration()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeMeasure" required="true"
	 *        extendedMetaData="kind='element' name='ServiceLifeDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	double getServiceLifeDuration();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcServiceLife#getServiceLifeDuration <em>Service Life Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Life Duration</em>' attribute.
	 * @see #getServiceLifeDuration()
	 * @generated
	 */
	void setServiceLifeDuration(double value);

} // IfcServiceLife
