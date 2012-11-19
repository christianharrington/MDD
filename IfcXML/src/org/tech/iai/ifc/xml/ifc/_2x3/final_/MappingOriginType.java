/**
 */
package org.tech.iai.ifc.xml.ifc._2x3.final_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Origin Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingOriginType#getIfcAxis2Placement2D <em>Ifc Axis2 Placement2 D</em>}</li>
 *   <li>{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingOriginType#getIfcAxis2Placement3D <em>Ifc Axis2 Placement3 D</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingOriginType()
 * @model extendedMetaData="name='MappingOrigin_._type' kind='elementOnly'"
 * @generated
 */
public interface MappingOriginType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ifc Axis2 Placement2 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Axis2 Placement2 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Axis2 Placement2 D</em>' containment reference.
	 * @see #setIfcAxis2Placement2D(IfcAxis2Placement2D)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingOriginType_IfcAxis2Placement2D()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcAxis2Placement2D' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcAxis2Placement2D getIfcAxis2Placement2D();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingOriginType#getIfcAxis2Placement2D <em>Ifc Axis2 Placement2 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Axis2 Placement2 D</em>' containment reference.
	 * @see #getIfcAxis2Placement2D()
	 * @generated
	 */
	void setIfcAxis2Placement2D(IfcAxis2Placement2D value);

	/**
	 * Returns the value of the '<em><b>Ifc Axis2 Placement3 D</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifc Axis2 Placement3 D</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifc Axis2 Placement3 D</em>' containment reference.
	 * @see #setIfcAxis2Placement3D(IfcAxis2Placement3D)
	 * @see org.tech.iai.ifc.xml.ifc._2x3.final_.FinalPackage#getMappingOriginType_IfcAxis2Placement3D()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='IfcAxis2Placement3D' namespace='##targetNamespace'"
	 * @generated
	 */
	IfcAxis2Placement3D getIfcAxis2Placement3D();

	/**
	 * Sets the value of the '{@link org.tech.iai.ifc.xml.ifc._2x3.final_.MappingOriginType#getIfcAxis2Placement3D <em>Ifc Axis2 Placement3 D</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifc Axis2 Placement3 D</em>' containment reference.
	 * @see #getIfcAxis2Placement3D()
	 * @generated
	 */
	void setIfcAxis2Placement3D(IfcAxis2Placement3D value);

} // MappingOriginType
