/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basis Surface Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType2#getIfcPlane <em>Ifc Plane</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBasisSurfaceType2()
 * @model extendedMetaData="name='BasisSurface_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface BasisSurfaceType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Plane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Plane</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Plane</em>' containment reference.
	 * @see #setIfcPlane(IfcPlane)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getBasisSurfaceType2_IfcPlane()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcPlane' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcPlane getIfcPlane();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.BasisSurfaceType2#getIfcPlane <em>Ifc Plane</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Plane</em>' containment reference.
	 * @see #getIfcPlane()
	 * @generated
	 */
	void setIfcPlane(IfcPlane value);

} // BasisSurfaceType2
