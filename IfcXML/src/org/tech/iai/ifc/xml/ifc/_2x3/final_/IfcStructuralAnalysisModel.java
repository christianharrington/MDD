/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Analysis Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getLoadedBy <em>Loaded By</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getHasResults <em>Has Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAnalysisModel()
 * @model extendedMetaData="name='IfcStructuralAnalysisModel' kind='elementOnly'"
 * @generated
 */
public interface IfcStructuralAnalysisModel extends IfcSystem {
	/**
	 * Returns the value of the '<em><b>Predefined Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisModelTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predefined Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisModelTypeEnum
	 * @see #setPredefinedType(IfcAnalysisModelTypeEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAnalysisModel_PredefinedType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='PredefinedType' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcAnalysisModelTypeEnum getPredefinedType();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getPredefinedType <em>Predefined Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predefined Type</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcAnalysisModelTypeEnum
	 * @see #getPredefinedType()
	 * @generated
	 */
	void setPredefinedType(IfcAnalysisModelTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Orientation Of2 DPlane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orientation Of2 DPlane</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation Of2 DPlane</em>' containment reference.
	 * @see #setOrientationOf2DPlane(OrientationOf2DPlaneType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAnalysisModel_OrientationOf2DPlane()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='OrientationOf2DPlane' namespace='##targetNamespace'"
	 * @generated
	 */
	OrientationOf2DPlaneType getOrientationOf2DPlane();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getOrientationOf2DPlane <em>Orientation Of2 DPlane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation Of2 DPlane</em>' containment reference.
	 * @see #getOrientationOf2DPlane()
	 * @generated
	 */
	void setOrientationOf2DPlane(OrientationOf2DPlaneType value);

	/**
	 * Returns the value of the '<em><b>Loaded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loaded By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loaded By</em>' containment reference.
	 * @see #setLoadedBy(LoadedByType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAnalysisModel_LoadedBy()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='LoadedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	LoadedByType getLoadedBy();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getLoadedBy <em>Loaded By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded By</em>' containment reference.
	 * @see #getLoadedBy()
	 * @generated
	 */
	void setLoadedBy(LoadedByType value);

	/**
	 * Returns the value of the '<em><b>Has Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Results</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Results</em>' containment reference.
	 * @see #setHasResults(HasResultsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcStructuralAnalysisModel_HasResults()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='HasResults' namespace='##targetNamespace'"
	 * @generated
	 */
	HasResultsType getHasResults();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcStructuralAnalysisModel#getHasResults <em>Has Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Results</em>' containment reference.
	 * @see #getHasResults()
	 * @generated
	 */
	void setHasResults(HasResultsType value);

} // IfcStructuralAnalysisModel
