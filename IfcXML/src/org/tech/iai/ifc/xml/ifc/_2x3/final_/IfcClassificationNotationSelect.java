/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Notation Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationSelect#getIfcClassificationNotation <em>Ifc Classification Notation</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationSelect#getIfcClassificationReference <em>Ifc Classification Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationNotationSelect()
 * @model extendedMetaData="name='IfcClassificationNotationSelect' kind='elementOnly'"
 * @generated
 */
public interface IfcClassificationNotationSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Classification Notation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Classification Notation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Classification Notation</em>' containment reference.
	 * @see #setIfcClassificationNotation(IfcClassificationNotation)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationNotationSelect_IfcClassificationNotation()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClassificationNotation' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClassificationNotation getIfcClassificationNotation();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationSelect#getIfcClassificationNotation <em>Ifc Classification Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Classification Notation</em>' containment reference.
	 * @see #getIfcClassificationNotation()
	 * @generated
	 */
	void setIfcClassificationNotation(IfcClassificationNotation value);

	/**
	 * Returns the value of the '<em><b>Ifc Classification Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Classification Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Classification Reference</em>' containment reference.
	 * @see #setIfcClassificationReference(IfcClassificationReference)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationNotationSelect_IfcClassificationReference()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcClassificationReference' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcClassificationReference getIfcClassificationReference();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationNotationSelect#getIfcClassificationReference <em>Ifc Classification Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Classification Reference</em>' containment reference.
	 * @see #getIfcClassificationReference()
	 * @generated
	 */
	void setIfcClassificationReference(IfcClassificationReference value);

} // IfcClassificationNotationSelect
