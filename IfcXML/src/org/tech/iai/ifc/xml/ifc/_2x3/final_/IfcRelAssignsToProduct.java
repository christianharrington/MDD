/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToProduct()
 * @model extendedMetaData="name='IfcRelAssignsToProduct' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssignsToProduct extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Product</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Product</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Product</em>' containment reference.
	 * @see #setRelatingProduct(RelatingProductType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssignsToProduct_RelatingProduct()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingProduct' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingProductType getRelatingProduct();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Product</em>' containment reference.
	 * @see #getRelatingProduct()
	 * @generated
	 */
	void setRelatingProduct(RelatingProductType value);

} // IfcRelAssignsToProduct
