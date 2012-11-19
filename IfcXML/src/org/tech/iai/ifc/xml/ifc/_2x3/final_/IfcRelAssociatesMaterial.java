/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesMaterial()
 * @model extendedMetaData="name='IfcRelAssociatesMaterial' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesMaterial extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Material</em>' containment reference.
	 * @see #setRelatingMaterial(RelatingMaterialType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesMaterial_RelatingMaterial()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingMaterialType getRelatingMaterial();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesMaterial#getRelatingMaterial <em>Relating Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Material</em>' containment reference.
	 * @see #getRelatingMaterial()
	 * @generated
	 */
	void setRelatingMaterial(RelatingMaterialType value);

} // IfcRelAssociatesMaterial
