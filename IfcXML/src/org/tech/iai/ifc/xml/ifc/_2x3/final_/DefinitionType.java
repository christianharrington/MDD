/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefinitionType#getIfcPreDefinedSymbolGroup <em>Ifc Pre Defined Symbol Group</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefinitionType#getIfcPreDefinedSymbol <em>Ifc Pre Defined Symbol</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefinitionType#getIfcExternallyDefinedSymbol <em>Ifc Externally Defined Symbol</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefinitionType()
 * @model extendedMetaData="name='Definition_._type' kind='elementOnly'"
 * @generated
 */
public interface DefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Symbol Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Symbol Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Symbol Group</em>' attribute list.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefinitionType_IfcPreDefinedSymbolGroup()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='IfcPreDefinedSymbol:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getIfcPreDefinedSymbolGroup();

	/**
	 * Returns the value of the '<em><b>Ifc Pre Defined Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Pre Defined Symbol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Pre Defined Symbol</em>' containment reference.
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefinitionType_IfcPreDefinedSymbol()
	 * @model containment="true" unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IfcPreDefinedSymbol' namespace='##targetNamespace' group='IfcPreDefinedSymbol:group'"
	 * @generated
	 */
	IfcPreDefinedSymbol getIfcPreDefinedSymbol();

	/**
	 * Returns the value of the '<em><b>Ifc Externally Defined Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Externally Defined Symbol</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Externally Defined Symbol</em>' containment reference.
	 * @see #setIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getDefinitionType_IfcExternallyDefinedSymbol()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcExternallyDefinedSymbol' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcExternallyDefinedSymbol getIfcExternallyDefinedSymbol();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.DefinitionType#getIfcExternallyDefinedSymbol <em>Ifc Externally Defined Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Externally Defined Symbol</em>' containment reference.
	 * @see #getIfcExternallyDefinedSymbol()
	 * @generated
	 */
	void setIfcExternallyDefinedSymbol(IfcExternallyDefinedSymbol value);

} // DefinitionType
