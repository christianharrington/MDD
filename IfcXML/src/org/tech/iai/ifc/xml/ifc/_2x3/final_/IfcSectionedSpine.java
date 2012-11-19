/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Sectioned Spine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getCrossSections <em>Cross Sections</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getCrossSectionPositions <em>Cross Section Positions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionedSpine()
 * @model extendedMetaData="name='IfcSectionedSpine' kind='elementOnly'"
 * @generated
 */
public interface IfcSectionedSpine extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Spine Curve</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spine Curve</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spine Curve</em>' containment reference.
	 * @see #setSpineCurve(SpineCurveType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionedSpine_SpineCurve()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SpineCurve' namespace='##targetNamespace'"
	 * @generated
	 */
	SpineCurveType getSpineCurve();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getSpineCurve <em>Spine Curve</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spine Curve</em>' containment reference.
	 * @see #getSpineCurve()
	 * @generated
	 */
	void setSpineCurve(SpineCurveType value);

	/**
	 * Returns the value of the '<em><b>Cross Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Sections</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Sections</em>' containment reference.
	 * @see #setCrossSections(CrossSectionsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionedSpine_CrossSections()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CrossSections' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossSectionsType getCrossSections();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getCrossSections <em>Cross Sections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Sections</em>' containment reference.
	 * @see #getCrossSections()
	 * @generated
	 */
	void setCrossSections(CrossSectionsType value);

	/**
	 * Returns the value of the '<em><b>Cross Section Positions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cross Section Positions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cross Section Positions</em>' containment reference.
	 * @see #setCrossSectionPositions(CrossSectionPositionsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcSectionedSpine_CrossSectionPositions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CrossSectionPositions' namespace='##targetNamespace'"
	 * @generated
	 */
	CrossSectionPositionsType getCrossSectionPositions();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcSectionedSpine#getCrossSectionPositions <em>Cross Section Positions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cross Section Positions</em>' containment reference.
	 * @see #getCrossSectionPositions()
	 * @generated
	 */
	void setCrossSectionPositions(CrossSectionPositionsType value);

} // IfcSectionedSpine
