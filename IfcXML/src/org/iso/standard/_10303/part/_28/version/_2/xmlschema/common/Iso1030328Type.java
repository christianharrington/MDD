/**
 */
package org.iso.standard._10303.part._28.version._2.xmlschema.common;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iso1030328 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getIso1030328Header <em>Iso1030328 Header</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUosGroup <em>Uos Group</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getUos <em>Uos</em>}</li>
 *   <li>{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328Type()
 * @model extendedMetaData="name='iso_10303_28_._type' kind='elementOnly'"
 * @generated
 */
public interface Iso1030328Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Iso1030328 Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso1030328 Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso1030328 Header</em>' containment reference.
	 * @see #setIso1030328Header(Iso1030328HeaderType)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328Type_Iso1030328Header()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='iso_10303_28_header' namespace='##targetNamespace'"
	 * @generated
	 */
	Iso1030328HeaderType getIso1030328Header();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getIso1030328Header <em>Iso1030328 Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso1030328 Header</em>' containment reference.
	 * @see #getIso1030328Header()
	 * @generated
	 */
	void setIso1030328Header(Iso1030328HeaderType value);

	/**
	 * Returns the value of the '<em><b>Uos Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uos Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uos Group</em>' attribute list.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328Type_UosGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='uos:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUosGroup();

	/**
	 * Returns the value of the '<em><b>Uos</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uos</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uos</em>' containment reference.
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328Type_Uos()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uos' namespace='##targetNamespace' group='uos:group'"
	 * @generated
	 */
	Uos getUos();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.iso.standard._10303.part._28.version._2.xmlschema.common.CommonPackage#getIso1030328Type_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.iso.standard._10303.part._28.version._2.xmlschema.common.Iso1030328Type#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Iso1030328Type
