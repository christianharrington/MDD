/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType#getIfcTextStyleWithBoxCharacteristics <em>Ifc Text Style With Box Characteristics</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType#getIfcTextStyleTextModel <em>Ifc Text Style Text Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextStyleType()
 * @model extendedMetaData="name='TextStyle_._type' kind='elementOnly'"
 * @generated
 */
public interface TextStyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Text Style With Box Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Text Style With Box Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Text Style With Box Characteristics</em>' containment reference.
	 * @see #setIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextStyleType_IfcTextStyleWithBoxCharacteristics()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcTextStyleWithBoxCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTextStyleWithBoxCharacteristics getIfcTextStyleWithBoxCharacteristics();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType#getIfcTextStyleWithBoxCharacteristics <em>Ifc Text Style With Box Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Text Style With Box Characteristics</em>' containment reference.
	 * @see #getIfcTextStyleWithBoxCharacteristics()
	 * @generated
	 */
	void setIfcTextStyleWithBoxCharacteristics(IfcTextStyleWithBoxCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Ifc Text Style Text Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Text Style Text Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Text Style Text Model</em>' containment reference.
	 * @see #setIfcTextStyleTextModel(IfcTextStyleTextModel)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getTextStyleType_IfcTextStyleTextModel()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcTextStyleTextModel' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcTextStyleTextModel getIfcTextStyleTextModel();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.TextStyleType#getIfcTextStyleTextModel <em>Ifc Text Style Text Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Text Style Text Model</em>' containment reference.
	 * @see #getIfcTextStyleTextModel()
	 * @generated
	 */
	void setIfcTextStyleTextModel(IfcTextStyleTextModel value);

} // TextStyleType
