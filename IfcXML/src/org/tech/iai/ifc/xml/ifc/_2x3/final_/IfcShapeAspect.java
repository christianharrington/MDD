/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.iso.standard._10303.part._28.version._2.xmlschema.common.Entity;
import org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shape Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getShapeRepresentations <em>Shape Representations</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getName <em>Name</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getDescription <em>Description</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getProductDefinitional <em>Product Definitional</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect()
 * @model extendedMetaData="name='IfcShapeAspect' kind='elementOnly'"
 * @generated
 */
public interface IfcShapeAspect extends Entity {
	/**
	 * Returns the value of the '<em><b>Shape Representations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Representations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Representations</em>' containment reference.
	 * @see #setShapeRepresentations(ShapeRepresentationsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect_ShapeRepresentations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ShapeRepresentations' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeRepresentationsType getShapeRepresentations();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getShapeRepresentations <em>Shape Representations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Representations</em>' containment reference.
	 * @see #getShapeRepresentations()
	 * @generated
	 */
	void setShapeRepresentations(ShapeRepresentationsType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect_Name()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcLabel"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect_Description()
	 * @model unsettable="true" dataType="org.tech.iai.ifc.xml.ifc._2x3.final_.IfcText"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Product Definitional</b></em>' attribute.
	 * The literals are from the enumeration {@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Definitional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Definitional</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #setProductDefinitional(Logical)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect_ProductDefinitional()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ProductDefinitional' namespace='##targetNamespace'"
	 * @generated
	 */
	Logical getProductDefinitional();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getProductDefinitional <em>Product Definitional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Definitional</em>' attribute.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.Logical
	 * @see #getProductDefinitional()
	 * @generated
	 */
	void setProductDefinitional(Logical value);

	/**
	 * Returns the value of the '<em><b>Part Of Product Definition Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of Product Definition Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of Product Definition Shape</em>' containment reference.
	 * @see #setPartOfProductDefinitionShape(PartOfProductDefinitionShapeType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShapeAspect_PartOfProductDefinitionShape()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PartOfProductDefinitionShape' namespace='##targetNamespace'"
	 * @generated
	 */
	PartOfProductDefinitionShapeType getPartOfProductDefinitionShape();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShapeAspect#getPartOfProductDefinitionShape <em>Part Of Product Definition Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of Product Definition Shape</em>' containment reference.
	 * @see #getPartOfProductDefinitionShape()
	 * @generated
	 */
	void setPartOfProductDefinitionShape(PartOfProductDefinitionShapeType value);

} // IfcShapeAspect
