/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Values Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ResultValuesType#getIfcMetric <em>Ifc Metric</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getResultValuesType()
 * @model extendedMetaData="name='ResultValues_._type' kind='elementOnly'"
 * @generated
 */
public interface ResultValuesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Metric</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Metric</em>' containment reference.
	 * @see #setIfcMetric(IfcMetric)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getResultValuesType_IfcMetric()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMetric getIfcMetric();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ResultValuesType#getIfcMetric <em>Ifc Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Metric</em>' containment reference.
	 * @see #getIfcMetric()
	 * @generated
	 */
	void setIfcMetric(IfcMetric value);

} // ResultValuesType
