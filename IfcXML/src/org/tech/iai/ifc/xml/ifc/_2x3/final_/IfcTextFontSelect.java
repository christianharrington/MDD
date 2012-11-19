/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Font Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextFontSelect#getIfcPreDefinedTextFontGroup <em>Ifc Pre Defined Text Font Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextFontSelect#getIfcPreDefinedTextFont <em>Ifc Pre Defined Text Font</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextFontSelect#getIfcExternallyDefinedTextFont <em>Ifc Externally Defined Text Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextFontSelect()
 * @model extendedMetaData="name='IfcTextFontSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcTextFontSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Text Font Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Text Font Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Text Font Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextFontSelect_IfcPreDefinedTextFontGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPreDefinedTextFont:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPreDefinedTextFontGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Text Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Text Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Text Font</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextFontSelect_IfcPreDefinedTextFont()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedTextFont' namespace='##targetNamespace' group='IfcPreDefinedTextFont:group'"
	 * @generated
	 */
	IfcPreDefinedTextFont getIfcPreDefinedTextFont();

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Text Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Text Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Text Font</em>' containment reference.
	 * @see #setIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcTextFontSelect_IfcExternallyDefinedTextFont()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedTextFont' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcExternallyDefinedTextFont getIfcExternallyDefinedTextFont();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcTextFontSelect#getIfcExternallyDefinedTextFont <em>Ifc Externally Defined Text Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Externally Defined Text Font</em>' containment reference.
	 * @see #getIfcExternallyDefinedTextFont()
	 * @generated
	 */
	void setIfcExternallyDefinedTextFont(IfcExternallyDefinedTextFont value);

} // IfcTextFontSelect
