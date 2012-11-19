/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Electric Distribution Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricDistributionPoint()
 * @model extendedMetaData="name='IfcElectricDistributionPoint' kind='elementOnly'"
 * @generated
 */
public interface IfcElectricDistributionPoint extends IfcFlowController {
	/**
	 * Returns the value of the '<em><b>Distribution Point Function</b></em>' attribute.
	 * The literals are from the enumeration {@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPointFunctionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution Point Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Point Function</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPointFunctionEnum
	 * @see #setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricDistributionPoint_DistributionPointFunction()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DistributionPointFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcElectricDistributionPointFunctionEnum getDistributionPointFunction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPoint#getDistributionPointFunction <em>Distribution Point Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Point Function</em>' attribute.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPointFunctionEnum
	 * @see #getDistributionPointFunction()
	 * @generated
	 */
	void setDistributionPointFunction(IfcElectricDistributionPointFunctionEnum value);

	/**
	 * Returns the value of the '<em><b>User Defined Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Function</em>' attribute.
	 * @see #setUserDefinedFunction(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcElectricDistributionPoint_UserDefinedFunction()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='UserDefinedFunction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUserDefinedFunction();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcElectricDistributionPoint#getUserDefinedFunction <em>User Defined Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Function</em>' attribute.
	 * @see #getUserDefinedFunction()
	 * @generated
	 */
	void setUserDefinedFunction(String value);

} // IfcElectricDistributionPoint
