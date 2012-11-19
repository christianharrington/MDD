/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Trimming Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingSelect#getIfcCartesianPoint <em>Ifc Cartesian Point</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingSelect#getIfcParameterValue <em>Ifc Parameter Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmingSelect()
 * @model extendedMetaData="name='IfcTrimmingSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcTrimmingSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Cartesian Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Cartesian Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Cartesian Point</em>' containment reference.
	 * @see #setIfcCartesianPoint(IfcCartesianPoint)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmingSelect_IfcCartesianPoint()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcCartesianPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcCartesianPoint getIfcCartesianPoint();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingSelect#getIfcCartesianPoint <em>Ifc Cartesian Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Cartesian Point</em>' containment reference.
	 * @see #getIfcCartesianPoint()
	 * @generated
	 */
	void setIfcCartesianPoint(IfcCartesianPoint value);

	/**
	 * Returns the value of the '<em><b>Ifc Parameter Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Parameter Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Parameter Value</em>' containment reference.
	 * @see #setIfcParameterValue(IfcParameterValueType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTrimmingSelect_IfcParameterValue()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcParameterValue' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcParameterValueType getIfcParameterValue();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTrimmingSelect#getIfcParameterValue <em>Ifc Parameter Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Parameter Value</em>' containment reference.
	 * @see #getIfcParameterValue()
	 * @generated
	 */
	void setIfcParameterValue(IfcParameterValueType value);

} // IfcTrimmingSelect
