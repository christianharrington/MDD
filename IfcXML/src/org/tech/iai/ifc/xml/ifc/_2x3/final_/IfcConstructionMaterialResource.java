/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Construction Material Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionMaterialResource()
 * @model extendedMetaData="name='IfcConstructionMaterialResource' kind='elementOnly'"
 * @generated
 */
public interface IfcConstructionMaterialResource extends IfcConstructionResource {
	/**
	 * Returns the value of the '<em><b>Suppliers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suppliers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suppliers</em>' containment reference.
	 * @see #setSuppliers(SuppliersType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionMaterialResource_Suppliers()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Suppliers' namespace='##targetNamespace'"
	 * @generated
	 */
	SuppliersType getSuppliers();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionMaterialResource#getSuppliers <em>Suppliers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suppliers</em>' containment reference.
	 * @see #getSuppliers()
	 * @generated
	 */
	void setSuppliers(SuppliersType value);

	/**
	 * Returns the value of the '<em><b>Usage Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Ratio</em>' attribute.
	 * @see #setUsageRatio(Double)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConstructionMaterialResource_UsageRatio()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRatioMeasureObject"
	 *        extendedMetaData="kind='element' name='UsageRatio' namespace='##targetNamespace'"
	 * @generated
	 */
	Double getUsageRatio();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConstructionMaterialResource#getUsageRatio <em>Usage Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Ratio</em>' attribute.
	 * @see #getUsageRatio()
	 * @generated
	 */
	void setUsageRatio(Double value);

} // IfcConstructionMaterialResource
