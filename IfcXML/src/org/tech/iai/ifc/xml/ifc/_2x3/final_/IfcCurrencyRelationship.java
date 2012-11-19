/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Currency Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRateDateTime <em>Rate Date Time</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRateSource <em>Rate Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship()
 * @model extendedMetaData="name='IfcCurrencyRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcCurrencyRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Relating Monetary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Monetary Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Monetary Unit</em>' containment reference.
	 * @see #setRelatingMonetaryUnit(RelatingMonetaryUnitType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship_RelatingMonetaryUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingMonetaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingMonetaryUnitType getRelatingMonetaryUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRelatingMonetaryUnit <em>Relating Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Monetary Unit</em>' containment reference.
	 * @see #getRelatingMonetaryUnit()
	 * @generated
	 */
	void setRelatingMonetaryUnit(RelatingMonetaryUnitType value);

	/**
	 * Returns the value of the '<em><b>Related Monetary Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Monetary Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Monetary Unit</em>' containment reference.
	 * @see #setRelatedMonetaryUnit(RelatedMonetaryUnitType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship_RelatedMonetaryUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatedMonetaryUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedMonetaryUnitType getRelatedMonetaryUnit();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRelatedMonetaryUnit <em>Related Monetary Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Monetary Unit</em>' containment reference.
	 * @see #getRelatedMonetaryUnit()
	 * @generated
	 */
	void setRelatedMonetaryUnit(RelatedMonetaryUnitType value);

	/**
	 * Returns the value of the '<em><b>Exchange Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exchange Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange Rate</em>' attribute.
	 * @see #setExchangeRate(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship_ExchangeRate()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasure" required="true"
	 *        extendedMetaData="kind='element' name='ExchangeRate' namespace='##targetNamespace'"
	 * @generated
	 */
	double getExchangeRate();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getExchangeRate <em>Exchange Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange Rate</em>' attribute.
	 * @see #getExchangeRate()
	 * @generated
	 */
	void setExchangeRate(double value);

	/**
	 * Returns the value of the '<em><b>Rate Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Date Time</em>' containment reference.
	 * @see #setRateDateTime(RateDateTimeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship_RateDateTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RateDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	RateDateTimeType getRateDateTime();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRateDateTime <em>Rate Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Date Time</em>' containment reference.
	 * @see #getRateDateTime()
	 * @generated
	 */
	void setRateDateTime(RateDateTimeType value);

	/**
	 * Returns the value of the '<em><b>Rate Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate Source</em>' containment reference.
	 * @see #setRateSource(RateSourceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcCurrencyRelationship_RateSource()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='RateSource' namespace='##targetNamespace'"
	 * @generated
	 */
	RateSourceType getRateSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcCurrencyRelationship#getRateSource <em>Rate Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate Source</em>' containment reference.
	 * @see #getRateSource()
	 * @generated
	 */
	void setRateSource(RateSourceType value);

} // IfcCurrencyRelationship
