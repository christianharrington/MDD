/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Profile Section Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileSectionLocationType#getIfcShapeAspect <em>Ifc Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileSectionLocationType()
 * @model extendedMetaData="name='ProfileSectionLocation_._type' kind='elementOnly'"
 * @generated
 */
public interface ProfileSectionLocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Shape Aspect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Shape Aspect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Shape Aspect</em>' containment reference.
	 * @see #setIfcShapeAspect(IfcShapeAspect)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getProfileSectionLocationType_IfcShapeAspect()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcShapeAspect' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcShapeAspect getIfcShapeAspect();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.ProfileSectionLocationType#getIfcShapeAspect <em>Ifc Shape Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Shape Aspect</em>' containment reference.
	 * @see #getIfcShapeAspect()
	 * @generated
	 */
	void setIfcShapeAspect(IfcShapeAspect value);

} // ProfileSectionLocationType
