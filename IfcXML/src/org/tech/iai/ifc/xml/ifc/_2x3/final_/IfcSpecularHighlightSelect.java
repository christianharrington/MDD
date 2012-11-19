/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Specular Highlight Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularHighlightSelect#getIfcSpecularExponent <em>Ifc Specular Exponent</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularHighlightSelect#getIfcSpecularRoughness <em>Ifc Specular Roughness</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpecularHighlightSelect()
 * @model extendedMetaData="name='IfcSpecularHighlightSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcSpecularHighlightSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Specular Exponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Specular Exponent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Specular Exponent</em>' containment reference.
	 * @see #setIfcSpecularExponent(IfcSpecularExponentType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpecularHighlightSelect_IfcSpecularExponent()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSpecularExponent' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSpecularExponentType getIfcSpecularExponent();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularHighlightSelect#getIfcSpecularExponent <em>Ifc Specular Exponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Specular Exponent</em>' containment reference.
	 * @see #getIfcSpecularExponent()
	 * @generated
	 */
	void setIfcSpecularExponent(IfcSpecularExponentType value);

	/**
	 * Returns the value of the '<em><b>Ifc Specular Roughness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Specular Roughness</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Specular Roughness</em>' containment reference.
	 * @see #setIfcSpecularRoughness(IfcSpecularRoughnessType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSpecularHighlightSelect_IfcSpecularRoughness()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcSpecularRoughness' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcSpecularRoughnessType getIfcSpecularRoughness();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSpecularHighlightSelect#getIfcSpecularRoughness <em>Ifc Specular Roughness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Specular Roughness</em>' containment reference.
	 * @see #getIfcSpecularRoughness()
	 * @generated
	 */
	void setIfcSpecularRoughness(IfcSpecularRoughnessType value);

} // IfcSpecularHighlightSelect
