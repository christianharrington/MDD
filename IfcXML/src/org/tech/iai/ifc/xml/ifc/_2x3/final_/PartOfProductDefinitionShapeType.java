/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Of Product Definition Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PartOfProductDefinitionShapeType#getIfcProductDefinitionShape <em>Ifc Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPartOfProductDefinitionShapeType()
 * @model extendedMetaData="name='PartOfProductDefinitionShape_._type' kind='elementOnly'"
 * @generated
 */
public interface PartOfProductDefinitionShapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Product Definition Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Product Definition Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Product Definition Shape</em>' containment reference.
	 * @see #setIfcProductDefinitionShape(IfcProductDefinitionShape)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getPartOfProductDefinitionShapeType_IfcProductDefinitionShape()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcProductDefinitionShape' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcProductDefinitionShape getIfcProductDefinitionShape();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.PartOfProductDefinitionShapeType#getIfcProductDefinitionShape <em>Ifc Product Definition Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Product Definition Shape</em>' containment reference.
	 * @see #getIfcProductDefinitionShape()
	 * @generated
	 */
	void setIfcProductDefinitionShape(IfcProductDefinitionShape value);

} // PartOfProductDefinitionShapeType
