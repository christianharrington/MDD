/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialList#getMaterials <em>Materials</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialList()
 * @model extendedMetaData="name='IfcMaterialList' kind='elementOnly'"
 * @generated
 */
public interface IfcMaterialList extends Entity {
	/**
	 * Returns the value of the '<em><b>Materials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Materials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materials</em>' containment reference.
	 * @see #setMaterials(MaterialsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialList_Materials()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Materials' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialsType getMaterials();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialList#getMaterials <em>Materials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materials</em>' containment reference.
	 * @see #getMaterials()
	 * @generated
	 */
	void setMaterials(MaterialsType value);

} // IfcMaterialList
