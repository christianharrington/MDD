/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Colour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColour#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColour#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColour#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcColour#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcColour()
 * @model extendedMetaData="name='IfcColour' kind='elementOnly'"
 * @generated
 */
public interface IfcColour extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Colour Specification Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Specification Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Specification Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcColour_IfcColourSpecificationGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcColourSpecification:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcColourSpecificationGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Colour Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Colour Specification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Colour Specification</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcColour_IfcColourSpecification()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcColourSpecification' namespace='##targetNamespace' group='IfcColourSpecification:group'"
	 * @generated
	 */
	IfcColourSpecification getIfcColourSpecification();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Colour Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Colour Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Colour Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcColour_IfcPreDefinedColourGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPreDefinedColour:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPreDefinedColourGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Colour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Colour</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Colour</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcColour_IfcPreDefinedColour()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedColour' namespace='##targetNamespace' group='IfcPreDefinedColour:group'"
	 * @generated
	 */
	IfcPreDefinedColour getIfcPreDefinedColour();

} // IfcColour
