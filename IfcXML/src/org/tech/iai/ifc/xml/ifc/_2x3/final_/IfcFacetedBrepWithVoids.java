/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Faceted Brep With Voids</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFacetedBrepWithVoids#getVoids <em>Voids</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFacetedBrepWithVoids()
 * @model extendedMetaData="name='IfcFacetedBrepWithVoids' kind='elementOnly'"
 * @generated
 */
public interface IfcFacetedBrepWithVoids extends IfcManifoldSolidBrep {
	/**
	 * Returns the value of the '<em><b>Voids</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Voids</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voids</em>' containment reference.
	 * @see #setVoids(VoidsType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFacetedBrepWithVoids_Voids()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Voids' namespace='##targetNamespace'"
	 * @generated
	 */
	VoidsType getVoids();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFacetedBrepWithVoids#getVoids <em>Voids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voids</em>' containment reference.
	 * @see #getVoids()
	 * @generated
	 */
	void setVoids(VoidsType value);

} // IfcFacetedBrepWithVoids
