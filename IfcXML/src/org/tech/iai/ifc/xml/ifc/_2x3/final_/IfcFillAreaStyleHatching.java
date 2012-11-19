/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Area Style Hatching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching()
 * @model extendedMetaData="name='IfcFillAreaStyleHatching' kind='elementOnly'"
 * @generated
 */
public interface IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Hatch Line Appearance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Appearance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Appearance</em>' containment reference.
	 * @see #setHatchLineAppearance(HatchLineAppearanceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching_HatchLineAppearance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HatchLineAppearance' namespace='##targetNamespace'"
	 * @generated
	 */
	HatchLineAppearanceType getHatchLineAppearance();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getHatchLineAppearance <em>Hatch Line Appearance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Appearance</em>' containment reference.
	 * @see #getHatchLineAppearance()
	 * @generated
	 */
	void setHatchLineAppearance(HatchLineAppearanceType value);

	/**
	 * Returns the value of the '<em><b>Start Of Next Hatch Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Of Next Hatch Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Of Next Hatch Line</em>' containment reference.
	 * @see #setStartOfNextHatchLine(StartOfNextHatchLineType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching_StartOfNextHatchLine()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='StartOfNextHatchLine' namespace='##targetNamespace'"
	 * @generated
	 */
	StartOfNextHatchLineType getStartOfNextHatchLine();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getStartOfNextHatchLine <em>Start Of Next Hatch Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Of Next Hatch Line</em>' containment reference.
	 * @see #getStartOfNextHatchLine()
	 * @generated
	 */
	void setStartOfNextHatchLine(StartOfNextHatchLineType value);

	/**
	 * Returns the value of the '<em><b>Point Of Reference Hatch Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Of Reference Hatch Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Of Reference Hatch Line</em>' containment reference.
	 * @see #setPointOfReferenceHatchLine(PointOfReferenceHatchLineType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching_PointOfReferenceHatchLine()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PointOfReferenceHatchLine' namespace='##targetNamespace'"
	 * @generated
	 */
	PointOfReferenceHatchLineType getPointOfReferenceHatchLine();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getPointOfReferenceHatchLine <em>Point Of Reference Hatch Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Reference Hatch Line</em>' containment reference.
	 * @see #getPointOfReferenceHatchLine()
	 * @generated
	 */
	void setPointOfReferenceHatchLine(PointOfReferenceHatchLineType value);

	/**
	 * Returns the value of the '<em><b>Pattern Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Start</em>' containment reference.
	 * @see #setPatternStart(PatternStartType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching_PatternStart()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='PatternStart' namespace='##targetNamespace'"
	 * @generated
	 */
	PatternStartType getPatternStart();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getPatternStart <em>Pattern Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Start</em>' containment reference.
	 * @see #getPatternStart()
	 * @generated
	 */
	void setPatternStart(PatternStartType value);

	/**
	 * Returns the value of the '<em><b>Hatch Line Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hatch Line Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #setHatchLineAngle(double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillAreaStyleHatching_HatchLineAngle()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPlaneAngleMeasure" required="true"
	 *        extendedMetaData="kind='element' name='HatchLineAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	double getHatchLineAngle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillAreaStyleHatching#getHatchLineAngle <em>Hatch Line Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hatch Line Angle</em>' attribute.
	 * @see #getHatchLineAngle()
	 * @generated
	 */
	void setHatchLineAngle(double value);

} // IfcFillAreaStyleHatching
