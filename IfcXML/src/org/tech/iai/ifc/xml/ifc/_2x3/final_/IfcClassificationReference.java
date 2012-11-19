/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Classification Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationReference#getReferencedSource <em>Referenced Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationReference()
 * @model extendedMetaData="name='IfcClassificationReference' kind='elementOnly'"
 * @generated
 */
public interface IfcClassificationReference extends IfcExternalReference {
	/**
	 * Returns the value of the '<em><b>Referenced Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Source</em>' containment reference.
	 * @see #setReferencedSource(ReferencedSourceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcClassificationReference_ReferencedSource()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='ReferencedSource' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferencedSourceType getReferencedSource();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcClassificationReference#getReferencedSource <em>Referenced Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Source</em>' containment reference.
	 * @see #getReferencedSource()
	 * @generated
	 */
	void setReferencedSource(ReferencedSourceType value);

} // IfcClassificationReference
