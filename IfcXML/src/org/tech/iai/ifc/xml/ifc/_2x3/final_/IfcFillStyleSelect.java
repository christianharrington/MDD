/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Fill Style Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcColourSpecificationGroup <em>Ifc Colour Specification Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcColourSpecification <em>Ifc Colour Specification</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcPreDefinedColourGroup <em>Ifc Pre Defined Colour Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcPreDefinedColour <em>Ifc Pre Defined Colour</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect()
 * @model extendedMetaData="name='IfcFillStyleSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcFillStyleSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Hatching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Hatching</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Hatching</em>' containment reference.
	 * @see #setIfcFillAreaStyleHatching(IfcFillAreaStyleHatching)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcFillAreaStyleHatching()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcFillAreaStyleHatching' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcFillAreaStyleHatching getIfcFillAreaStyleHatching();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcFillAreaStyleHatching <em>Ifc Fill Area Style Hatching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Fill Area Style Hatching</em>' containment reference.
	 * @see #getIfcFillAreaStyleHatching()
	 * @generated
	 */
	void setIfcFillAreaStyleHatching(IfcFillAreaStyleHatching value);

	/**
	 * Returns the value of the '<em><b>Ifc Fill Area Style Tiles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Fill Area Style Tiles</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Fill Area Style Tiles</em>' containment reference.
	 * @see #setIfcFillAreaStyleTiles(IfcFillAreaStyleTiles)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcFillAreaStyleTiles()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcFillAreaStyleTiles' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcFillAreaStyleTiles getIfcFillAreaStyleTiles();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcFillAreaStyleTiles <em>Ifc Fill Area Style Tiles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Fill Area Style Tiles</em>' containment reference.
	 * @see #getIfcFillAreaStyleTiles()
	 * @generated
	 */
	void setIfcFillAreaStyleTiles(IfcFillAreaStyleTiles value);

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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcColourSpecificationGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcColourSpecification()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcPreDefinedColourGroup()
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
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcPreDefinedColour()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedColour' namespace='##targetNamespace' group='IfcPreDefinedColour:group'"
	 * @generated
	 */
	IfcPreDefinedColour getIfcPreDefinedColour();

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Hatch Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Hatch Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Hatch Style</em>' containment reference.
	 * @see #setIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFillStyleSelect_IfcExternallyDefinedHatchStyle()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedHatchStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcExternallyDefinedHatchStyle getIfcExternallyDefinedHatchStyle();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFillStyleSelect#getIfcExternallyDefinedHatchStyle <em>Ifc Externally Defined Hatch Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Externally Defined Hatch Style</em>' containment reference.
	 * @see #getIfcExternallyDefinedHatchStyle()
	 * @generated
	 */
	void setIfcExternallyDefinedHatchStyle(IfcExternallyDefinedHatchStyle value);

} // IfcFillStyleSelect
