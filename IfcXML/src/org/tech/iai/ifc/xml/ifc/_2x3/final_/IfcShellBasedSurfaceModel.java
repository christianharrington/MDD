/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shell Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShellBasedSurfaceModel#getSbsmBoundary <em>Sbsm Boundary</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShellBasedSurfaceModel()
 * @model extendedMetaData="name='IfcShellBasedSurfaceModel' kind='elementOnly'"
 * @generated
 */
public interface IfcShellBasedSurfaceModel extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Sbsm Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbsm Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbsm Boundary</em>' containment reference.
	 * @see #setSbsmBoundary(SbsmBoundaryType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcShellBasedSurfaceModel_SbsmBoundary()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SbsmBoundary' namespace='##targetNamespace'"
	 * @generated
	 */
	SbsmBoundaryType getSbsmBoundary();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcShellBasedSurfaceModel#getSbsmBoundary <em>Sbsm Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbsm Boundary</em>' containment reference.
	 * @see #getSbsmBoundary()
	 * @generated
	 */
	void setSbsmBoundary(SbsmBoundaryType value);

} // IfcShellBasedSurfaceModel
