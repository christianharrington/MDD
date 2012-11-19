/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner History Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwnerHistoryType#getIfcOwnerHistory <em>Ifc Owner History</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwnerHistoryType()
 * @model extendedMetaData="name='OwnerHistory_._type' kind='elementOnly'"
 * @generated
 */
public interface OwnerHistoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Owner History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Owner History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Owner History</em>' containment reference.
	 * @see #setIfcOwnerHistory(IfcOwnerHistory)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getOwnerHistoryType_IfcOwnerHistory()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcOwnerHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcOwnerHistory getIfcOwnerHistory();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.OwnerHistoryType#getIfcOwnerHistory <em>Ifc Owner History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Owner History</em>' containment reference.
	 * @see #getIfcOwnerHistory()
	 * @generated
	 */
	void setIfcOwnerHistory(IfcOwnerHistory value);

} // OwnerHistoryType
