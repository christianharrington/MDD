/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Geometric Representation Sub Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationSubContext()
 * @model extendedMetaData="name='IfcGeometricRepresentationSubContext' kind='elementOnly'"
 * @generated
 */
public interface IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationSubContextTemp {
	/**
	 * Returns the value of the '<em><b>Parent Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Context</em>' containment reference.
	 * @see #setParentContext(ParentContextType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationSubContext_ParentContext()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ParentContext' namespace='##targetNamespace'"
	 * @generated
	 */
	ParentContextType getParentContext();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getParentContext <em>Parent Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Context</em>' containment reference.
	 * @see #getParentContext()
	 * @generated
	 */
	void setParentContext(ParentContextType value);

	/**
	 * Returns the value of the '<em><b>Target Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Scale</em>' attribute.
	 * @see #setTargetScale(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationSubContext_TargetScale()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcPositiveRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='TargetScale' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getTargetScale();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getTargetScale <em>Target Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Scale</em>' attribute.
	 * @see #getTargetScale()
	 * @generated
	 */
	void setTargetScale(Double value);

	/**
	 * Returns the value of the '<em><b>Target View</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricProjectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target View</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricProjectionEnum
	 * @see #setTargetView(IfcGeometricProjectionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationSubContext_TargetView()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TargetView' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcGeometricProjectionEnum getTargetView();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getTargetView <em>Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target View</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricProjectionEnum
	 * @see #getTargetView()
	 * @generated
	 */
	void setTargetView(IfcGeometricProjectionEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Target View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Target View</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Target View</em>' attribute.
	 * @see #setUserDefinedTargetView(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcGeometricRepresentationSubContext_UserDefinedTargetView()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='UserDefinedTargetView' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserDefinedTargetView();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcGeometricRepresentationSubContext#getUserDefinedTargetView <em>User Defined Target View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Target View</em>' attribute.
	 * @see #getUserDefinedTargetView()
	 * @generated
	 */
	void setUserDefinedTargetView(String value);

} // IfcGeometricRepresentationSubContext
