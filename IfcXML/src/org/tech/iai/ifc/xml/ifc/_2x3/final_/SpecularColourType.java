/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specular Colour Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularColourType#getIfcColourRgb <em>Ifc Colour Rgb</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularColourType#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpecularColourType()
 * @model extendedMetaData="name='SpecularColour_._type' kind='elementOnly'"
 * @generated
 */
public interface SpecularColourType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Colour Rgb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Rgb</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Rgb</em>' containment reference.
	 * @see #setIfcColourRgb(IfcColourRgb)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpecularColourType_IfcColourRgb()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcColourRgb' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcColourRgb getIfcColourRgb();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularColourType#getIfcColourRgb <em>Ifc Colour Rgb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Colour Rgb</em>' containment reference.
	 * @see #getIfcColourRgb()
	 * @generated
	 */
	void setIfcColourRgb(IfcColourRgb value);

	/**
	 * Returns the value of the '<em><b>Ifc Normalised Ratio Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Normalised Ratio Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Normalised Ratio Measure</em>' containment reference.
	 * @see #setIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getSpecularColourType_IfcNormalisedRatioMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcNormalisedRatioMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcNormalisedRatioMeasureType getIfcNormalisedRatioMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.SpecularColourType#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Normalised Ratio Measure</em>' containment reference.
	 * @see #getIfcNormalisedRatioMeasure()
	 * @generated
	 */
	void setIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType value);

} // SpecularColourType
