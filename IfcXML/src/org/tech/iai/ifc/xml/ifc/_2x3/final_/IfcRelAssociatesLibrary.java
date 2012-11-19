/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesLibrary()
 * @model extendedMetaData="name='IfcRelAssociatesLibrary' kind='elementOnly'"
 * @generated
 */
public interface IfcRelAssociatesLibrary extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Library</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Library</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Library</em>' containment reference.
	 * @see #setRelatingLibrary(RelatingLibraryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcRelAssociatesLibrary_RelatingLibrary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RelatingLibrary' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatingLibraryType getRelatingLibrary();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcRelAssociatesLibrary#getRelatingLibrary <em>Relating Library</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Library</em>' containment reference.
	 * @see #getRelatingLibrary()
	 * @generated
	 */
	void setRelatingLibrary(RelatingLibraryType value);

} // IfcRelAssociatesLibrary
