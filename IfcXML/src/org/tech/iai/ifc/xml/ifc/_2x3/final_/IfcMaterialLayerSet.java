/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Material Layer Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet#getMaterialLayers <em>Material Layers</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialLayerSet()
 * @model extendedMetaData="name='IfcMaterialLayerSet' kind='elementOnly'"
 * @generated
 */
public interface IfcMaterialLayerSet extends Entity {
	/**
	 * Returns the value of the '<em><b>Material Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Layers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Layers</em>' containment reference.
	 * @see #setMaterialLayers(MaterialLayersType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialLayerSet_MaterialLayers()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MaterialLayers' namespace='##targetNamespace'"
	 * @generated
	 */
	MaterialLayersType getMaterialLayers();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet#getMaterialLayers <em>Material Layers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Layers</em>' containment reference.
	 * @see #getMaterialLayers()
	 * @generated
	 */
	void setMaterialLayers(MaterialLayersType value);

	/**
	 * Returns the value of the '<em><b>Layer Set Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer Set Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Set Name</em>' attribute.
	 * @see #setLayerSetName(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcMaterialLayerSet_LayerSetName()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='LayerSetName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLayerSetName();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcMaterialLayerSet#getLayerSetName <em>Layer Set Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Set Name</em>' attribute.
	 * @see #getLayerSetName()
	 * @generated
	 */
	void setLayerSetName(String value);

} // IfcMaterialLayerSet
