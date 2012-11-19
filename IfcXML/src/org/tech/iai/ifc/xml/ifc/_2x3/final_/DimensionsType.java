/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimensions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DimensionsType#getIfcDimensionalExponents <em>Ifc Dimensional Exponents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDimensionsType()
 * @model extendedMetaData="name='Dimensions_._type' kind='elementOnly'"
 * @generated
 */
public interface DimensionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Dimensional Exponents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Dimensional Exponents</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Dimensional Exponents</em>' containment reference.
	 * @see #setIfcDimensionalExponents(IfcDimensionalExponents)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDimensionsType_IfcDimensionalExponents()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDimensionalExponents' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDimensionalExponents getIfcDimensionalExponents();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DimensionsType#getIfcDimensionalExponents <em>Ifc Dimensional Exponents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Dimensional Exponents</em>' containment reference.
	 * @see #getIfcDimensionalExponents()
	 * @generated
	 */
	void setIfcDimensionalExponents(IfcDimensionalExponents value);

} // DimensionsType
