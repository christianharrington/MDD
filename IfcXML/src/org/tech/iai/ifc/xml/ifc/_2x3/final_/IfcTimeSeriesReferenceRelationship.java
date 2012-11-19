/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Time Series Reference Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries <em>Referenced Time Series</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesReferenceRelationship#getTimeSeriesReferences <em>Time Series References</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTimeSeriesReferenceRelationship()
 * @model extendedMetaData="name='IfcTimeSeriesReferenceRelationship' kind='elementOnly'"
 * @generated
 */
public interface IfcTimeSeriesReferenceRelationship extends Entity {
	/**
	 * Returns the value of the '<em><b>Referenced Time Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Time Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Time Series</em>' containment reference.
	 * @see #setReferencedTimeSeries(ReferencedTimeSeriesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTimeSeriesReferenceRelationship_ReferencedTimeSeries()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReferencedTimeSeries' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencedTimeSeriesType getReferencedTimeSeries();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesReferenceRelationship#getReferencedTimeSeries <em>Referenced Time Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Time Series</em>' containment reference.
	 * @see #getReferencedTimeSeries()
	 * @generated
	 */
	void setReferencedTimeSeries(ReferencedTimeSeriesType value);

	/**
	 * Returns the value of the '<em><b>Time Series References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Series References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Series References</em>' containment reference.
	 * @see #setTimeSeriesReferences(TimeSeriesReferencesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTimeSeriesReferenceRelationship_TimeSeriesReferences()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TimeSeriesReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeSeriesReferencesType getTimeSeriesReferences();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTimeSeriesReferenceRelationship#getTimeSeriesReferences <em>Time Series References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Series References</em>' containment reference.
	 * @see #getTimeSeriesReferences()
	 * @generated
	 */
	void setTimeSeriesReferences(TimeSeriesReferencesType value);

} // IfcTimeSeriesReferenceRelationship
