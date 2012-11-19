/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Face Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface#isSameSense <em>Same Sense</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFaceSurface()
 * @model extendedMetaData="name='IfcFaceSurface' kind='elementOnly'"
 * @generated
 */
public interface IfcFaceSurface extends IfcFace {
	/**
	 * Returns the value of the '<em><b>Face Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Face Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Face Surface</em>' containment reference.
	 * @see #setFaceSurface(FaceSurfaceType)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFaceSurface_FaceSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FaceSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	FaceSurfaceType getFaceSurface();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface#getFaceSurface <em>Face Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Face Surface</em>' containment reference.
	 * @see #getFaceSurface()
	 * @generated
	 */
	void setFaceSurface(FaceSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Same Sense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Sense</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Sense</em>' attribute.
	 * @see #setSameSense(boolean)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getIfcFaceSurface_SameSense()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='SameSense' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSameSense();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.IfcFaceSurface#isSameSense <em>Same Sense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Sense</em>' attribute.
	 * @see #isSameSense()
	 * @generated
	 */
	void setSameSense(boolean value);

} // IfcFaceSurface
