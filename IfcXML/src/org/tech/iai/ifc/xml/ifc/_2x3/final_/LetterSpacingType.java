/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Letter Spacing Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcLengthMeasure <em>Ifc Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType()
 * @model extendedMetaData="name='LetterSpacing_._type' kind='elementOnly'"
 * @generated
 */
public interface LetterSpacingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Ratio Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Ratio Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Ratio Measure</em>' containment reference.
	 * @see #setIfcRatioMeasure(IfcRatioMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcRatioMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcRatioMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcRatioMeasureType getIfcRatioMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcRatioMeasure <em>Ifc Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Ratio Measure</em>' containment reference.
	 * @see #getIfcRatioMeasure()
	 * @generated
	 */
	void setIfcRatioMeasure(IfcRatioMeasureType value);

	/**
	 * Returns the value of the '<em><b>Ifc Length Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Length Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Length Measure</em>' containment reference.
	 * @see #setIfcLengthMeasure(IfcLengthMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcLengthMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcLengthMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcLengthMeasureType getIfcLengthMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcLengthMeasure <em>Ifc Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Length Measure</em>' containment reference.
	 * @see #getIfcLengthMeasure()
	 * @generated
	 */
	void setIfcLengthMeasure(IfcLengthMeasureType value);

	/**
	 * Returns the value of the '<em><b>Ifc Descriptive Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Descriptive Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Descriptive Measure</em>' containment reference.
	 * @see #setIfcDescriptiveMeasure(IfcDescriptiveMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcDescriptiveMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcDescriptiveMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcDescriptiveMeasureType getIfcDescriptiveMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcDescriptiveMeasure <em>Ifc Descriptive Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Descriptive Measure</em>' containment reference.
	 * @see #getIfcDescriptiveMeasure()
	 * @generated
	 */
	void setIfcDescriptiveMeasure(IfcDescriptiveMeasureType value);

	/**
	 * Returns the value of the '<em><b>Ifc Positive Length Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Positive Length Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Positive Length Measure</em>' containment reference.
	 * @see #setIfcPositiveLengthMeasure(IfcPositiveLengthMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcPositiveLengthMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPositiveLengthMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPositiveLengthMeasureType getIfcPositiveLengthMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcPositiveLengthMeasure <em>Ifc Positive Length Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Positive Length Measure</em>' containment reference.
	 * @see #getIfcPositiveLengthMeasure()
	 * @generated
	 */
	void setIfcPositiveLengthMeasure(IfcPositiveLengthMeasureType value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcNormalisedRatioMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcNormalisedRatioMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcNormalisedRatioMeasureType getIfcNormalisedRatioMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcNormalisedRatioMeasure <em>Ifc Normalised Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Normalised Ratio Measure</em>' containment reference.
	 * @see #getIfcNormalisedRatioMeasure()
	 * @generated
	 */
	void setIfcNormalisedRatioMeasure(IfcNormalisedRatioMeasureType value);

	/**
	 * Returns the value of the '<em><b>Ifc Positive Ratio Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Positive Ratio Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Positive Ratio Measure</em>' containment reference.
	 * @see #setIfcPositiveRatioMeasure(IfcPositiveRatioMeasureType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getLetterSpacingType_IfcPositiveRatioMeasure()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPositiveRatioMeasure' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPositiveRatioMeasureType getIfcPositiveRatioMeasure();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.LetterSpacingType#getIfcPositiveRatioMeasure <em>Ifc Positive Ratio Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Positive Ratio Measure</em>' containment reference.
	 * @see #getIfcPositiveRatioMeasure()
	 * @generated
	 */
	void setIfcPositiveRatioMeasure(IfcPositiveRatioMeasureType value);

} // LetterSpacingType
