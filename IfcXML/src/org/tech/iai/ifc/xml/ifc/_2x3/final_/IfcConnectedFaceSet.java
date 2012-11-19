/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Connected Face Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectedFaceSet()
 * @model extendedMetaData="name='IfcConnectedFaceSet' kind='elementOnly'"
 * @generated
 */
public interface IfcConnectedFaceSet extends IfcTopologicalRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Cfs Faces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cfs Faces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cfs Faces</em>' containment reference.
	 * @see #setCfsFaces(CfsFacesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcConnectedFaceSet_CfsFaces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CfsFaces' namespace='##targetNamespace'"
	 * @generated
	 */
	CfsFacesType getCfsFaces();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcConnectedFaceSet#getCfsFaces <em>Cfs Faces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cfs Faces</em>' containment reference.
	 * @see #getCfsFaces()
	 * @generated
	 */
	void setCfsFaces(CfsFacesType value);

} // IfcConnectedFaceSet
