/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Local Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getHourComponent <em>Hour Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getSecondComponent <em>Second Component</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getZone <em>Zone</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime()
 * @model extendedMetaData="name='IfcLocalTime' kind='elementOnly'"
 * @generated
 */
public interface IfcLocalTime extends Entity {
	/**
	 * Returns the value of the '<em><b>Hour Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hour Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hour Component</em>' attribute.
	 * @see #setHourComponent(long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime_HourComponent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcHourInDay" required="true"
	 *        extendedMetaData="kind='element' name='HourComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	long getHourComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getHourComponent <em>Hour Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hour Component</em>' attribute.
	 * @see #getHourComponent()
	 * @generated
	 */
	void setHourComponent(long value);

	/**
	 * Returns the value of the '<em><b>Minute Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minute Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minute Component</em>' attribute.
	 * @see #setMinuteComponent(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime_MinuteComponent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMinuteInHourObject"
	 *        extendedMetaData="kind='element' name='MinuteComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getMinuteComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getMinuteComponent <em>Minute Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minute Component</em>' attribute.
	 * @see #getMinuteComponent()
	 * @generated
	 */
	void setMinuteComponent(Long value);

	/**
	 * Returns the value of the '<em><b>Second Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Component</em>' attribute.
	 * @see #setSecondComponent(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime_SecondComponent()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSecondInMinuteObject"
	 *        extendedMetaData="kind='element' name='SecondComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getSecondComponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getSecondComponent <em>Second Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Component</em>' attribute.
	 * @see #getSecondComponent()
	 * @generated
	 */
	void setSecondComponent(Double value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' containment reference.
	 * @see #setZone(ZoneType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime_Zone()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Zone' namespace='##targetNamespace'"
	 * @generated
	 */
	ZoneType getZone();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getZone <em>Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' containment reference.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(ZoneType value);

	/**
	 * Returns the value of the '<em><b>Daylight Saving Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daylight Saving Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daylight Saving Offset</em>' attribute.
	 * @see #setDaylightSavingOffset(Long)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcLocalTime_DaylightSavingOffset()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcDaylightSavingHourObject"
	 *        extendedMetaData="kind='element' name='DaylightSavingOffset' namespace='##targetNamespace'"
	 * @generated
	 */
	Long getDaylightSavingOffset();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLocalTime#getDaylightSavingOffset <em>Daylight Saving Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daylight Saving Offset</em>' attribute.
	 * @see #getDaylightSavingOffset()
	 * @generated
	 */
	void setDaylightSavingOffset(Long value);

} // IfcLocalTime
