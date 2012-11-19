/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Manifold Solid Brep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcManifoldSolidBrep#getOuter <em>Outer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcManifoldSolidBrep()
 * @model abstract="true"
 *        extendedMetaData="name='IfcManifoldSolidBrep' kind='elementOnly'"
 * @generated
 */
public interface IfcManifoldSolidBrep extends IfcSolidModel {
	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(OuterType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcManifoldSolidBrep_Outer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Outer' namespace='##targetNamespace'"
	 * @generated
	 */
	OuterType getOuter();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcManifoldSolidBrep#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(OuterType value);

} // IfcManifoldSolidBrep
