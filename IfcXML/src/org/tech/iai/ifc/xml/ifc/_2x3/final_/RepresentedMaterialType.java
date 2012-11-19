/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Represented Material Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentedMaterialType#getIfcMaterial <em>Ifc Material</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepresentedMaterialType()
 * @model extendedMetaData="name='RepresentedMaterial_._type' kind='elementOnly'"
 * @generated
 */
public interface RepresentedMaterialType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Material</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Material</em>' containment reference.
	 * @see #setIfcMaterial(IfcMaterial)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getRepresentedMaterialType_IfcMaterial()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMaterial' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMaterial getIfcMaterial();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.RepresentedMaterialType#getIfcMaterial <em>Ifc Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Material</em>' containment reference.
	 * @see #getIfcMaterial()
	 * @generated
	 */
	void setIfcMaterial(IfcMaterial value);

} // RepresentedMaterialType
