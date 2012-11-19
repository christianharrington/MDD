/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Layer Set Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ForLayerSetType#getIfcMaterialLayerSet <em>Ifc Material Layer Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getForLayerSetType()
 * @model extendedMetaData="name='ForLayerSet_._type' kind='elementOnly'"
 * @generated
 */
public interface ForLayerSetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Material Layer Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Material Layer Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Material Layer Set</em>' containment reference.
	 * @see #setIfcMaterialLayerSet(IfcMaterialLayerSet)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getForLayerSetType_IfcMaterialLayerSet()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcMaterialLayerSet' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcMaterialLayerSet getIfcMaterialLayerSet();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ForLayerSetType#getIfcMaterialLayerSet <em>Ifc Material Layer Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Material Layer Set</em>' containment reference.
	 * @see #getIfcMaterialLayerSet()
	 * @generated
	 */
	void setIfcMaterialLayerSet(IfcMaterialLayerSet value);

} // ForLayerSetType
