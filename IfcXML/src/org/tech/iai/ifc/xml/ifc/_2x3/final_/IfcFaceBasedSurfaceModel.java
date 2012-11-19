/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Based Surface Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceBasedSurfaceModel#getFbsmFaces <em>Fbsm Faces</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFaceBasedSurfaceModel()
 * @model extendedMetaData="name='IfcFaceBasedSurfaceModel' kind='elementOnly'"
 * @generated
 */
public interface IfcFaceBasedSurfaceModel extends IfcGeometricRepresentationItem {
	/**
	 * Returns the value of the '<em><b>Fbsm Faces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fbsm Faces</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fbsm Faces</em>' containment reference.
	 * @see #setFbsmFaces(FbsmFacesType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFaceBasedSurfaceModel_FbsmFaces()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FbsmFaces' namespace='##targetNamespace'"
	 * @generated
	 */
	FbsmFacesType getFbsmFaces();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceBasedSurfaceModel#getFbsmFaces <em>Fbsm Faces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fbsm Faces</em>' containment reference.
	 * @see #getFbsmFaces()
	 * @generated
	 */
	void setFbsmFaces(FbsmFacesType value);

} // IfcFaceBasedSurfaceModel
